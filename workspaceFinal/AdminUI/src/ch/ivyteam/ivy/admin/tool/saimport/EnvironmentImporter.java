package ch.ivyteam.ivy.admin.tool.saimport;

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

public class EnvironmentImporter extends AbstractImporter {

  private List<AbstractImporter> importerList;

  /**
   * Import Web Services, Database Configurations, Global Variables and BusinessCalendar
   */
  public EnvironmentImporter() {
    super();
    importerList = new ArrayList<AbstractImporter>();
    importerList.add(new GlobalVariableImporter());
    importerList.add(new DatabaseConfigurationImporter());
    importerList.add(new WebServiceImporter());
    importerList.add(new BusinessCalendarImporter());
  }

  /**
   * Choose config type to import by passing boolean
   * 
   * @param importWebService
   * @param importDatabaseConfig
   * @param importGlobalVar
   * @param importBusinessCalendar
   */
  public EnvironmentImporter(Boolean importWebService, Boolean importDatabaseConfig, Boolean importGlobalVar,
      Boolean importBusinessCalendar) {
    super();
    importerList = new ArrayList<AbstractImporter>();
    if (importWebService) {
      importerList.add(new WebServiceImporter());
    }
    if (importDatabaseConfig) {
      importerList.add(new DatabaseConfigurationImporter());
    }
    if (importGlobalVar) {
      importerList.add(new GlobalVariableImporter());
    }
    if (importBusinessCalendar) {
      importerList.add(new BusinessCalendarImporter());
    }
  }

  /**
   * Choose config type to import by pass the list of correlative exporter
   * 
   * @param exporterList
   */
  public EnvironmentImporter(List<AbstractImporter> pImporterList) {
    super();
    this.importerList = pImporterList;
  }

  @Override
  protected void importConfig(IEnvironment iEnvironment, Environment environment, ReportObservable report) {
    for (AbstractImporter importer : importerList) {
      importer.importConfig(iEnvironment, environment, report);
    }
  }

}
