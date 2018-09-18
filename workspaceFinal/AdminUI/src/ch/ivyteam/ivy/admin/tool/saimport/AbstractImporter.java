package ch.ivyteam.ivy.admin.tool.saimport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ch.ivyteam.api.API;
import ch.ivyteam.ivy.admin.tool.domain.Applications;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieImportParameter;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieUtils;
import ch.ivyteam.ivy.admin.tool.exception.SaieException;
import ch.ivyteam.ivy.admin.tool.process.ImportEnvironment;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.IReport;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportTextWriter;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.log.Logger;

/**
 * Importer using JAXB
 */

public abstract class AbstractImporter implements IImporter {

  public static final Logger LOGGER = Logger.getLogger(AbstractImporter.class);

  @Override
  public void importEnvironments(SaieImportParameter param) throws FileNotFoundException, SaieException {

    API.checkParameterNotNull(param, "param");
    List<ImportEnvironment> selectedEnvironments = param.getSelectedEnvironments();
    File file = param.getFile();
    IReport iReport = param.getReport();
    File reportFile = param.getReportFile();

    API.checkParameterNotNull(file, "file");
    if (!file.exists()) {
      throw new FileNotFoundException("Import file does not exist");
    } else if (!file.isFile()) {
      throw new IllegalArgumentException("Import file must be a file");
    }

    API.checkParameterNotNull(iReport, "iReport");
    ReportObservable report = getInitializedReportObservable(iReport, reportFile);

    for (ImportEnvironment importEnv : selectedEnvironments) {
      importConfig(importEnv.getTargetEnvironment(), importEnv.getSourceEnvironment(), report);
    }
    report.summarise();
  }

  private ReportObservable getInitializedReportObservable(final IReport iReport, final File reportFile) {
    File file;
    if (reportFile == null) {
      file = SaieUtils.getReportFile(ActionType.IMPORT);
    } else {
      file = reportFile;
    }
    ReportTextWriter textWriter = new ReportTextWriter(file);
    ReportObservable reportObservable = new ReportObservable();
    reportObservable.addObserver(textWriter);
    reportObservable.addObserver(iReport);
    return reportObservable;
  }

  public static Applications parse(File inputFile) throws JAXBException {
    JAXBContext jc = JAXBContext.newInstance(Applications.class);
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    unmarshaller.setSchema(SaieUtils.getSchema());
    return (Applications) unmarshaller.unmarshal(inputFile);
  }

  public static Applications parse(InputStream is) throws JAXBException {
    JAXBContext jc = JAXBContext.newInstance(Applications.class);
    Unmarshaller unmarshaller = jc.createUnmarshaller();
    unmarshaller.setSchema(SaieUtils.getSchema());
    return (Applications) unmarshaller.unmarshal(is);
  }

  /**
   * Import environment from XML file to environment in application
   * 
   * @param iEnvironment , environment in application to be imported
   * @param environment , environment get from XML file
   * @param report
   */
  protected abstract void importConfig(IEnvironment iEnvironment, Environment environment, ReportObservable report);


  public static Map<String, Object> union(List<IEnvironment> serverEnvironments, File inputFile) {
    Map<String, Object> result = new HashMap<String, Object>();
    List<IEnvironment> inServerNotImport = new ArrayList<IEnvironment>();
    List<IEnvironment> willImport = new ArrayList<IEnvironment>();
    List<Environment> inXmlNotImport = new ArrayList<Environment>();

    try {
      Applications environments = parse(inputFile);

      for (IEnvironment iEnvironemnt : serverEnvironments) {
        Environment matchEnv = null;
        inXmlNotImport = environments.getApplicationList().get(0).getEnvironmentList();
        for (Environment env : inXmlNotImport) {
          if (iEnvironemnt.getName().equals(env.getName())) {
            matchEnv = env;
            break;
          }
        }
        if (matchEnv == null) {
          inServerNotImport.add(iEnvironemnt);
        } else {
          willImport.add(iEnvironemnt);
          inXmlNotImport.remove(matchEnv);
        }
      }
    } catch (JAXBException e) {
      LOGGER.error(e.getMessage(), e);
    }

    result.put("IN_SERVER_NOT_IMPORT", inServerNotImport);
    result.put("IN_XML_NOT_IMPORT", inXmlNotImport);
    result.put("IMPORT", willImport);

    return result;
  }
}
