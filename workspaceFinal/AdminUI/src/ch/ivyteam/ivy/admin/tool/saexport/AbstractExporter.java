package ch.ivyteam.ivy.admin.tool.saexport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ch.ivyteam.api.API;
import ch.ivyteam.ivy.admin.tool.domain.Applications;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieConstant;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieParameter;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieUtils;
import ch.ivyteam.ivy.admin.tool.exception.SaieRuntimeException;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.IReport;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportTextWriter;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

/**
 * Abstract class for environments exporter
 */
public abstract class AbstractExporter implements IExporter {

  @Override
  public void export(SaieParameter param) {
    API.checkParameterNotNull(param, "param");
    List<IEnvironment> iEnvironments = param.getEnvironments();
    File file = param.getFile();
    IReport iReport = param.getReport();
    File reportFile = param.getReportFile();

    if (iEnvironments == null || iEnvironments.contains(null)) {
      throw new IllegalArgumentException(
          "The first argument of method export(List<IEnvironment> iEnvironments, File file) can not contain null");
    }
    API.checkParameterNotNull(file, "file");
    if (file.exists() && !file.isFile()) {
      throw new IllegalArgumentException("The export file must be a file");
    }

    API.checkParameterNotNull(iReport, "iReport");
    ReportObservable report = getInitializedReportObservable(iReport, reportFile);

    try {
      // modifiable list, sortable
      iEnvironments = new ArrayList<IEnvironment>(iEnvironments);
      JAXBContext jc = JAXBContext.newInstance(Applications.class);
      Object obj = createExportedEnvironment(iEnvironments, report, param.isIncludeUsernameAndPassword());
      Marshaller m = jc.createMarshaller();
      m.setSchema(SaieUtils.getSchema());
      m.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, SaieConstant.SCHEMA_URL);
      m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
      m.marshal(obj, file);

      report.summarise();
    } catch (JAXBException e) {
      throw new SaieRuntimeException(e);
    }
  }

  /**
   * Initialize the report observer
   * 
   * @param iReport
   * @param reportFile
   * @return
   */
  private ReportObservable getInitializedReportObservable(final IReport iReport, final File reportFile) {
    File file;
    if (reportFile == null) {
      file = SaieUtils.getReportFile(ActionType.EXPORT);
    } else {
      file = reportFile;
    }
    ReportTextWriter textWriter = new ReportTextWriter(file);
    ReportObservable reportObservable = new ReportObservable();
    reportObservable.addObserver(textWriter);
    reportObservable.addObserver(iReport);
    return reportObservable;
  }

  /**
   * Abstract method to export feature of environments
   * 
   * @param iEnvironments , list of environments to be exported
   * @param report handle reporting
   * @return Environment that can be marshaled
   */
  private Applications createExportedEnvironment(List<IEnvironment> iEnvironments, ReportObservable report,
      boolean isIncludeUsernameAndPassword) {
    String hostname = SaieUtils.getHostName();
    Application application = new Application();
    IEnvironment firstEnv = iEnvironments.get(0);
    if (firstEnv != null) {
      application.setName(firstEnv.getApplication().getName());
    }
    Applications environments = new Applications();
    environments.setSchemaVersion(SaieConstant.SCHEMA_VERSION);
    environments.setHostname(hostname);

    SaieUtils.sortIEnvironment(iEnvironments);
    for (IEnvironment iEnvironment : iEnvironments) {
      Environment environment = new Environment();
      environment.setName(iEnvironment.getName());
      createEnvironment(iEnvironment, environment, report, isIncludeUsernameAndPassword);
      application.getEnvironmentList().add(environment);
    }
    environments.getApplicationList().add(application);
    return environments;
  }

  /**
   * 
   * @param iEnvironment , environment to exported
   * @param environment , environment element to be added to root element
   * @param report handle reporting
   * @param isIncludeUsernameAndPassword the exporting include username and password. It's only for database and
   *        webservice configurations
   */
  protected abstract void createEnvironment(IEnvironment iEnvironment, Environment environment,
      ReportObservable report, boolean isIncludeUsernameAndPassword);

}
