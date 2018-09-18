package ch.ivyteam.ivy.admin.tool.saimport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.DatabaseConfigs.DatabaseConfig;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.DatabaseConfigs.DatabaseConfig.Property;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieUtils;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.ExternalDatabaseConfigurationAccessFlag;
import ch.ivyteam.ivy.application.IExternalDatabaseConfiguration;
import ch.ivyteam.ivy.application.IExternalDatabaseDefaultConfiguration;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

public class DatabaseConfigurationImporter extends AbstractImporter {

  @Override
  protected void importConfig(IEnvironment iEnvironment, Environment environment, ReportObservable report) {

    report.startLog(iEnvironment.getName(), ConfigType.DATABASE_CONFIG);

    List<String> listNotYetImportedEnv = createListNotYetImported(iEnvironment);

    for (DatabaseConfig xmlConfig : environment.getDatabaseConfigs().getDatabaseConfigList()) {
      try {
        IExternalDatabaseConfiguration overrideConfig =
            iEnvironment.findExternalDatabaseConfiguration(xmlConfig.getId());

        // if the config defined in XML is found in environment
        if (overrideConfig != null) {
          // update list of configs which have not yet imported
          listNotYetImportedEnv.remove(overrideConfig.getUserFriendlyName());
          /*** start validation */
          if (validate(xmlConfig, iEnvironment.getName(), report)) {
            IExternalDatabaseDefaultConfiguration defConfig = overrideConfig.getDefaultConfiguration();
            int importedMaxConnection = importMaxConnection(xmlConfig);
            // not exist overridden configuration for this environment
            if (defConfig == null && !iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
              // create overridden configuration
              defConfig = (IExternalDatabaseDefaultConfiguration) overrideConfig;
              EnumSet<ExternalDatabaseConfigurationAccessFlag> accessFlags =
                  EnumSet.noneOf(ExternalDatabaseConfigurationAccessFlag.class);

              DatabaseConnectionConfiguration dbConnectConfig =
                  getConnectionConfig(iEnvironment, xmlConfig, defConfig, false, report);
              defConfig.createEnvironmentConfiguration(iEnvironment.getName(), dbConnectConfig, accessFlags,
                  importedMaxConnection);

              // check again whether the overridden config was created or not
              overrideConfig = iEnvironment.findExternalDatabaseConfiguration(xmlConfig.getId());

              if (overrideConfig.getDefaultConfiguration() != null) {
                // report
                ReportEntry entry =
                    createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), defConfig.getUserFriendlyName(),
                        "Created overridden configuration");
                report.log(entry);
              }
            }
            // exist overridden configuration for this environment
            else {
              // update overridden configuration
              overrideConfig.setMaxConnections(importedMaxConnection);

              DatabaseConnectionConfiguration dbConnectConfig =
                  getConnectionConfig(iEnvironment, xmlConfig, overrideConfig, true, report);
              overrideConfig.setDatabaseConnectionConfiguration(dbConnectConfig);
              // report
              ReportEntry entry =
                  createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), overrideConfig.getUserFriendlyName(),
                      "Updated overridden configuration");
              report.log(entry);
            }
          }
          /*** end validation */
        } else {
          // otherwise there is no config in XML matched with the one in XML, LOG
          LOGGER
              .warn("The database configuration "
                  + xmlConfig.getId()
                  + " in the import file was not imported because the database configuration does not exist in the target application");
          // report
          ReportEntry entry =
              createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), xmlConfig.getId(),
                  "Default configuration does not exist");
          report.log(entry);
        }
      } catch (Exception exp) {
        LOGGER.error(exp);
      }
    }

    // after updating, the remains of "lstNotYetImportedEnv" are configs which have not been imported
    // these have to be deleted
    for (String notImport : listNotYetImportedEnv) {
      IExternalDatabaseConfiguration config = iEnvironment.findExternalDatabaseConfiguration(notImport);
      IExternalDatabaseDefaultConfiguration defConfig = config.getDefaultConfiguration();
      if (defConfig != null) {
        defConfig.deleteEnvironmentConfiguration(config);
        // check again whether the overridden config was deleted or not
        config = iEnvironment.findExternalDatabaseConfiguration(notImport);
        if (config.getDefaultConfiguration() == null) {
          // report
          ReportEntry entry =
              createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), defConfig.getUserFriendlyName(),
                  "Deleted overridden configuration");
          report.log(entry);
        }
      }
    }
  }

  /**
   * validate xml file following rules
   * 
   * @param xmlConfig
   * @param environmentName
   * @return
   */
  private boolean validate(DatabaseConfig xmlConfig, String environmentName, ReportObservable report) {
    StringBuffer err = new StringBuffer();
    StringBuffer temp = new StringBuffer();
    List<String> messages = new ArrayList<String>();
    err.append("Environment: ").append(environmentName).append(", Database Configuration: ").append(xmlConfig.getId())
        .append(": ");
    boolean flag = true;
    if (xmlConfig.getMaxConnection() != null && xmlConfig.getMaxConnection() < 0) {
      temp.append("MaxConnection can not be a negative number");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!isValidDriverName(xmlConfig.getDriverName())) {
      temp = new StringBuffer();
      temp.append("DriverName [").append(xmlConfig.getDriverName())
          .append("] is invalid and the correct one should look like [oracle.jdbc.OracleDriver]");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!isValidConntionURL(xmlConfig.getConnectionUrl())) {
      temp = new StringBuffer();
      temp.append("ConnectionUrl [").append(xmlConfig.getConnectionUrl())
          .append("] is invalid and the correct one should look like [jdbc:company:serverAndExtraInfo]");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!isValidUsername(xmlConfig.getUsername())) {
      temp = new StringBuffer();
      temp.append("Username can not contain invalid Ivy Script, the correct one should begin with <% and end with %>");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!isValidPassword(xmlConfig.getPassword())) {
      temp = new StringBuffer();
      temp.append("Password can not contain invalid Ivy Script, the correct one should begin with <% and end with %>");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!flag) {
      LOGGER.error(err.toString());
      ReportEntry entry = createReportEntry(ReportStatus.ERROR, environmentName, xmlConfig.getId(), messages);
      report.log(entry);
    }
    return flag;
  }

  /**
   * Test connection can connect to or not
   * 
   * @param url
   * @return
   */
  private boolean isValidConntionURL(String url) {
    if (StringUtils.isBlank(url)) {
      return true;
    }
    // allow scriptable
    if (((url.indexOf("<%") > -1) || (url.indexOf("%>") > -1)) && (SaieUtils.isValidScripts(url))) {
      return true;
    }
    String driverPattern = "^jdbc:[a-zA-Z0-9]*:[a-zA-Z0-9_:/\\&\\?\\=\\-\\.\\~\\%//;@]*";
    return url.matches(driverPattern);
  }

  /**
   * validate Driver Name use Regular expresstion
   * 
   * @param driver
   * @return
   */
  private boolean isValidDriverName(String driver) {
    if (StringUtils.isBlank(driver)) {
      return true;
    }
    // allow scriptable
    if (((driver.indexOf("<%") > -1) || (driver.indexOf("%>") > -1)) && (SaieUtils.isValidScripts(driver))) {
      return true;
    }
    // Assigning the Driver Name format regular expression
    String driverPattern = "^(([a-zA-Z][a-zA-Z_$0-9]*(\\.[a-zA-Z][a-zA-Z_$0-9]*)*)\\.)?([a-zA-Z][a-zA-Z_$0-9]*)$";
    return driver.matches(driverPattern);
  }

  public static boolean isValidUsername(String username) {
    if (StringUtils.isBlank(username)) {
      return true;
    }
    // allow scriptable
    String temp = username.trim();
    if ((temp.indexOf("<%") > -1) || (temp.indexOf("%>") > -1)) {
      return SaieUtils.isValidScripts(temp);
    } else {
      return true;
    }
  }

  public static boolean isValidPassword(String password) {
    if (StringUtils.isBlank(password)) {
      return true;
    }
    // allow scriptable
    String temp = password.trim();
    if ((temp.indexOf("<%") > -1) || (temp.indexOf("%>") > -1)) {
      return SaieUtils.isValidScripts(temp);
    } else {
      return true;
    }
  }

  /**
   * 
   * @param env
   * @param config
   * @return
   */
  private DatabaseConnectionConfiguration getConnectionConfig(IEnvironment iEnvironment, DatabaseConfig config,
      IExternalDatabaseConfiguration iConfig, Boolean overridden, ReportObservable report) {
    String connectionUrl = config.getConnectionUrl();
    String importedConnectionUrl = (connectionUrl != null) ? connectionUrl : StringUtils.EMPTY;

    String driverName = config.getDriverName();
    String importedDriverName = (driverName != null) ? driverName : StringUtils.EMPTY;

    String username = config.getUsername();
    String password = config.getPassword();
    Map<String, List<String>> userPassMap = getUserNamePassword(iConfig, username, password, overridden);
    String importedUserName = userPassMap.get("username").get(0);
    String importedPassword = userPassMap.get("password").get(0);
    List<String> warningMessage = userPassMap.get("warningMessage");
    if (!warningMessage.isEmpty()) {
      ReportEntry entry =
          createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), iConfig.getUserFriendlyName(), warningMessage);
      report.log(entry);
    }

    DatabaseConnectionConfiguration result =
        new DatabaseConnectionConfiguration(importedConnectionUrl, importedDriverName, importedUserName,
            importedPassword);

    for (Property prop : config.getPropertyList()) {
      if (StringUtils.isNotEmpty(prop.getName())) {
        String value = (prop.getValue()) != null ? prop.getValue() : StringUtils.EMPTY;
        result.setProperty(prop.getName(), value);
      }
    }
    return result;
  }

  /**
   * 
   * @param iEnvironment
   * @return
   */
  private List<String> createListNotYetImported(IEnvironment iEnvironment) {
    List<String> listNotYetImported = new ArrayList<String>();
    for (IExternalDatabaseConfiguration config : iEnvironment.getExternalDatabaseConfigurations()) {
      if (config.getDefaultConfiguration() != null) {
        listNotYetImported.add(config.getUserFriendlyName());
      }
    }
    return listNotYetImported;
  }

  /**
   * Write report entry for database config import with single message
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
    entry.setConfigType(ConfigType.DATABASE_CONFIG);
    entry.setReportStatus(status);
    entry.setEnvironmentName(environmentName);
    entry.setConfigName(configName);
    entry.setMessage(message);

    return entry;
  }

  /**
   * Write report entry for database config import with multiple message
   * 
   * @param status
   * @param environmentName
   * @param configName
   * @param messages
   * @return
   */
  private ReportEntry createReportEntry(ReportStatus status, String environmentName, String configName,
      List<String> messages) {
    ReportEntry entry = new ReportEntry();
    entry.setActionType(ActionType.IMPORT);
    entry.setConfigType(ConfigType.DATABASE_CONFIG);
    entry.setReportStatus(status);
    entry.setEnvironmentName(environmentName);
    entry.setConfigName(configName);
    entry.setMessages(messages);

    return entry;
  }

  /**
   * Choose 'max connection' attribute to import
   * 
   * @param dbConfig
   * @return
   */
  private int importMaxConnection(DatabaseConfig dbConfig) {
    int defaultConnection = 0;
    if (dbConfig.getMaxConnection() != null) {
      defaultConnection = dbConfig.getMaxConnection();
    }
    return defaultConnection;
  }

  /**
   * Handle username and password attributes when importing<br>
   * <br>
   * - If the attributes are missing and the override already exists in the target environment, keep the old ones<br>
   * - If the attributes are missing and the override does not exist in the target environment, use the empty string for
   * the missing attributes and send a warning to the report <br>
   * - If the attributes are set, use those attributes
   * 
   * @param dbConfig database configuration to be imported
   * @param username username get from XML file
   * @param password password get from XML file
   * @param overridden true if the override already exists in the target environment
   * @return a map contains username, password and warning message<br>
   *         use get("username").get(0) to get the user name<br>
   *         use get("password").get(0) to get the password<br>
   *         use get("warningMessage") to get list of warning message<br>
   */
  private Map<String, List<String>> getUserNamePassword(IExternalDatabaseConfiguration dbConfig, String username,
      String password, Boolean overridden) {
    Map<String, List<String>> result = new HashMap<String, List<String>>();
    List<String> warnMessage = new ArrayList<String>();

    // handle username
    String name = dbConfig.getDatabaseConnectionConfiguration().getUserName();
    String usernameWarning = null;
    if (username != null) {
      name = username;
    } else if (!overridden || name == null) {
      name = StringUtils.EMPTY;
      usernameWarning = "Username has not been set";
    }

    // handle password
    String pwd = dbConfig.getDatabaseConnectionConfiguration().getPassword();
    String passwordWarning = null;
    if (password != null) {
      pwd = password;
    } else if (!overridden || pwd == null) {
      pwd = StringUtils.EMPTY;
      passwordWarning = "Password has not been set";
    }

    // add username warning to report
    if (usernameWarning != null) {
      warnMessage.add(usernameWarning);
    }
    // add password warning to report
    if (passwordWarning != null) {
      warnMessage.add(passwordWarning);
    }

    result.put("username", Arrays.asList(name));
    result.put("password", Arrays.asList(pwd));
    result.put("warningMessage", warnMessage);
    return result;
  }
}
