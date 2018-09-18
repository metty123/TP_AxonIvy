package ch.ivyteam.ivy.admin.tool.saimport;

import java.util.List;

import ch.ivyteam.api.API;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.BusinessCalendar;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendar;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

/**
 * Business Calendar importer using JAXB
 */
public class BusinessCalendarImporter extends AbstractImporter {

  @Override
  protected void importConfig(IEnvironment iEnvironment, Environment environment, ReportObservable report) {
    API.checkParameterNotNull(iEnvironment, "target environment");
    API.checkParameterNotNull(environment, "import environment");
    BusinessCalendar businessCal = environment.getBusinessCalendar();
    String importBusinessCalName = businessCal.getName();

    report.startLog(iEnvironment.getName(), ConfigType.BUSINESS_CALENDAR);

    // No business calendar is set into the import file
    if (importBusinessCalName == null) {
      setDefaultBusinessCal(iEnvironment);
    } else {
      IApplication app = iEnvironment.getApplication();
      if (isExistBusinessCal(app, importBusinessCalName)) {
        String curBusinessCalName = iEnvironment.getBusinessCalendar().getName();
        if (!curBusinessCalName.equals(importBusinessCalName)) {
          IBusinessCalendar serverBusinessCal = iEnvironment.getBusinessCalendar().get(importBusinessCalName);
          iEnvironment.setBusinessCalendar(serverBusinessCal);
          ReportEntry entry =
              createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), importBusinessCalName,
                  "Updated overridden configuration");
          report.log(entry);
        }
      } else {
        // the import business calendar doesn't exist in target application
        LOGGER
            .warn("The business calendar "
                + importBusinessCalName
                + " in the import file was not imported because the business calendar does not exist in the target application");
        ReportEntry entry =
            createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), importBusinessCalName,
                "Business calendar does not exist");
        report.log(entry);
      }
    }
  }

  /**
   * Set default business calendar for environment
   * 
   * @param iEnvironment
   */
  private void setDefaultBusinessCal(IEnvironment iEnvironment) {
    API.checkParameterNotNull(iEnvironment, "Environment");

    IEnvironment defEnvironment = iEnvironment.getApplication().findEnvironment(IEnvironment.DEFAULT_ENVIRONMENT_NAME);
    IBusinessCalendar defBusinessCal = defEnvironment.getBusinessCalendar();
    iEnvironment.setBusinessCalendar(defBusinessCal);
  }

  /**
   * Check the business calendar is exist or not in target application.
   * 
   * @param app target application
   * @param businessCalName name of business calendar
   * @return <code>true<code> if exist or <code>false<code> if not exist
   */
  private boolean isExistBusinessCal(IApplication app, String businessCalName) {
    API.checkParameterNotNull(app, "Application");
    API.checkParameterNotNull(businessCalName, "Business calendar");

    IBusinessCalendarSettings businessCalSetting = app.getBusinessCalendarSettings();
    List<IBusinessCalendarConfiguration> businessCalConfigList =
        businessCalSetting.getAllBusinessCalendarConfigurationsAsList();

    for (IBusinessCalendarConfiguration businessCalConfig : businessCalConfigList) {
      String configName = businessCalConfig.getName();
      if (businessCalName.equals(configName)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Write report entry for business calendar import with single message
   * 
   * @param status
   * @param environmentName
   * @param configName
   * @param message
   * @return
   */
  private ReportEntry createReportEntry(ReportStatus status, String environmentName, String configName, String message) {
    ReportEntry entry = new ReportEntry();
    entry.setActionType(ActionType.IMPORT);
    entry.setConfigType(ConfigType.BUSINESS_CALENDAR);
    entry.setReportStatus(status);
    entry.setEnvironmentName(environmentName);
    entry.setConfigName(configName);
    entry.setMessage(message);

    return entry;
  }
}
