package ch.ivyteam.ivy.admin.tool.saexport;

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

/**
 * Environments exporter using JAXB, export Web Services, Database Configurations, Global Variables and BusinessCalendar
 * in one file
 */
public class EnvironmentExporter extends AbstractExporter {

  private List<AbstractExporter> fExporterList;

  /**
   * Export Web Services, Database Configurations, Global Variables and BusinessCalendar
   */
  public EnvironmentExporter() {
    super();
    fExporterList = new ArrayList<AbstractExporter>();
    fExporterList.add(new GlobalVariableExporter());
    fExporterList.add(new DatabaseConfigurationExporter());
    fExporterList.add(new WebServiceExporter());
    fExporterList.add(new BusinessCalendarExporter());
  }

  /**
   * Choose config type to export by passing boolean
   * 
   * @param exportWebService
   * @param exportDatabaseConfig
   * @param exportGlobalVar
   * @param exportBusinessCalendar
   */
  public EnvironmentExporter(Boolean exportWebService, Boolean exportDatabaseConfig, Boolean exportGlobalVar,
      Boolean exportBusinessCalendar) {
    super();
    fExporterList = new ArrayList<AbstractExporter>();
    if (exportWebService) {
      fExporterList.add(new WebServiceExporter());
    }
    if (exportDatabaseConfig) {
      fExporterList.add(new DatabaseConfigurationExporter());
    }
    if (exportGlobalVar) {
      fExporterList.add(new GlobalVariableExporter());
    }
    if (exportBusinessCalendar) {
      fExporterList.add(new BusinessCalendarExporter());
    }
  }

  /**
   * Choose config type to export by pass the list of correlative exporter
   * 
   * @param exporterList
   */
  public EnvironmentExporter(List<AbstractExporter> exporterList) {
    super();
    this.fExporterList = exporterList;
  }

  @Override
  protected void createEnvironment(IEnvironment iEnvironment, Environment environment, ReportObservable report,
      boolean isIncludeUsernameAndPassword) {
    for (AbstractExporter exporter : fExporterList) {
      exporter.createEnvironment(iEnvironment, environment, report, isIncludeUsernameAndPassword);
    }
  }

}
