package ch.ivyteam.ivy.admin.tool.report;

import java.util.ArrayList;
import java.util.List;

/**
 * Report entry
 */
public class ReportEntry {
  private ReportStatus reportStatus;
  private ActionType actionType;
  private String environmentName;
  private ConfigType configType;
  private String configName;
  private List<String> messages;

  public ReportEntry() {
    super();
    this.messages = new ArrayList<String>();
  }

  public ReportEntry(ReportStatus pReportStatus, ActionType pActionType, String pEnvironmentName,
      ConfigType pConfigType, String pConfigName, List<String> pMessages) {
    super();
    this.reportStatus = pReportStatus;
    this.actionType = pActionType;
    this.environmentName = pEnvironmentName;
    this.configType = pConfigType;
    this.configName = pConfigName;
    if (pMessages == null) {
      this.messages = new ArrayList<String>();
    } else {
      this.messages = pMessages;
    }
  }

  public ReportEntry(ReportStatus pReportStatus, ActionType pActionType, String pEnvironmentName,
      ConfigType pConfigType, String pConfigName, String pMessage) {
    this(pReportStatus, pActionType, pEnvironmentName, pConfigType, pConfigName, new ArrayList<String>());
    this.messages.add(pMessage);
  }

  /**
   * @return action type : IMPORT or EXPORT
   */
  public ActionType getActionType() {
    return actionType;
  }

  /**
   * @param pActionType
   */
  public void setActionType(ActionType pActionType) {
    this.actionType = pActionType;
  }

  /**
   * @return status : SUCCESS, WARNING or ERROR
   */
  public ReportStatus getReportStatus() {
    return reportStatus;
  }

  /**
   * @param pReportStatus
   */
  public void setReportStatus(ReportStatus pReportStatus) {
    this.reportStatus = pReportStatus;
  }

  /**
   * @return name of the configuration
   */
  public String getConfigName() {
    return configName;
  }

  /**
   * @param pConfigName
   */
  public void setConfigName(String pConfigName) {
    this.configName = pConfigName;
  }

  /**
   * @return list of message to write report
   */
  public List<String> getMessages() {
    return messages;
  }

  /**
   * @param pMessage
   */
  public void setMessage(String pMessage) {
    this.messages.clear();
    this.messages.add(pMessage);
  }

  /**
   * @param pMessages
   */
  public void setMessages(List<String> pMessages) {
    this.messages.clear();
    this.messages.addAll(pMessages);
  }

  /**
   * @return name of environment
   */
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * @param pEnvironmentName
   */
  public void setEnvironmentName(String pEnvironmentName) {
    this.environmentName = pEnvironmentName;
  }

  /**
   * @return Config type : WEB_SERVICE, DATABASE_CONFIG, GLOBAL_VARIABLE or BUSINESS_CALENDAR
   */
  public ConfigType getConfigType() {
    return configType;
  }

  /**
   * @param pConfigType
   */
  public void setConfigType(ConfigType pConfigType) {
    this.configType = pConfigType;
  }

  /**
   * @return message in report line by line
   */
  public String printMessage() {
    StringBuilder messageBuilder = new StringBuilder();
    for (String s : messages) {
      messageBuilder.append(s).append("\n");
    }
    return messageBuilder.toString();
  }

}
