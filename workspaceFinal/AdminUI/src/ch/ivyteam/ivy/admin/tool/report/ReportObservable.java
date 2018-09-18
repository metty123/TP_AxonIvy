package ch.ivyteam.ivy.admin.tool.report;

import java.util.Observable;

import ch.ivyteam.ivy.admin.tool.exception.SaieRuntimeException;
import ch.ivyteam.ivy.admin.tool.report.SummaryEntry.EnvironmentEntry.ConfigEntry;

/**
 * Contain all the information for report, this can be observable
 */
public class ReportObservable extends Observable {
  private SummaryEntry summaryEntry;

  public ReportObservable() {
    super();
    summaryEntry = new SummaryEntry();
  }

  /**
   * Log the report entry
   * 
   * @param reportEntry
   */
  public void log(ReportEntry reportEntry) {
    if (reportEntry == null) {
      return;
    }
    setChanged();
    updateSummaryEntry(reportEntry);
    notifyObservers(reportEntry);
  }

  /**
   * Use this method when have an action with a configuration, so that the action is reported in summary section
   * 
   * @param environmentName
   * @param configName
   */
  public void startLog(String environmentName, ConfigType configType) {
    if (environmentName == null || configType == null) {
      return;
    }
    ISummaryEntry envEntry = summaryEntry.getChild(environmentName);
    envEntry.getChild(configType.toString());
  }

  /**
   * Call this method to summarise the report, will trigger all observers to generate the report summary
   */
  public void summarise() {
    setChanged();
    notifyObservers(summaryEntry);
  }

  /**
   * Update summary entry to report
   * 
   * @param reportEntry
   */
  private void updateSummaryEntry(ReportEntry reportEntry) {
    ISummaryEntry envEntry = summaryEntry.getChild(reportEntry.getEnvironmentName());
    ConfigEntry confEntry = (ConfigEntry) envEntry.getChild(reportEntry.getConfigType().toString());
    switch (reportEntry.getReportStatus()) {
      case SUCCESS:
        confEntry.setNumOfSuccess(confEntry.getNumOfSuccess() + 1);
        break;
      case WARNING:
        confEntry.setNumOfWarning(confEntry.getNumOfWarning() + 1);
        break;
      case ERROR:
        confEntry.setNumOfError(confEntry.getNumOfError() + 1);
        break;
      default:
        throw new SaieRuntimeException("No handling for report entry type: " + reportEntry.getReportStatus());
    }
  }

}
