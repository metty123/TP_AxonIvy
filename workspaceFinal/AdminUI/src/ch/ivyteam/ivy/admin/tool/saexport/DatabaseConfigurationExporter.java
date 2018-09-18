package ch.ivyteam.ivy.admin.tool.saexport;

import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.DatabaseConfigs;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.DatabaseConfigs.DatabaseConfig;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.DatabaseConfigs.DatabaseConfig.Property;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.IExternalDatabaseConfiguration;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

/**
 * Database configurations exporter using JAXB
 */
public class DatabaseConfigurationExporter extends AbstractExporter {

  @Override
  protected void createEnvironment(IEnvironment iEnvironment, Environment environment, ReportObservable report,
      boolean isIncludeUsernameAndPassword) {
    DatabaseConfigs databaseConfigsXML = new DatabaseConfigs();
    List<IExternalDatabaseConfiguration> listDBConfig = iEnvironment.getExternalDatabaseConfigurations();
    for (IExternalDatabaseConfiguration newExConfig : listDBConfig) {
      report.startLog(iEnvironment.getName(), ConfigType.DATABASE_CONFIG);
      IExternalDatabaseConfiguration dfExConfig = newExConfig.getDefaultConfiguration();
      if (dfExConfig != null || iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
        DatabaseConfig databaseConfigXML = new DatabaseConfig();
        writeChild(newExConfig, databaseConfigXML, isIncludeUsernameAndPassword);
        databaseConfigsXML.getDatabaseConfigList().add(databaseConfigXML);
        report.log(new ReportEntry(ReportStatus.SUCCESS, ActionType.EXPORT, iEnvironment.getName(),
            ConfigType.DATABASE_CONFIG, databaseConfigXML.getId(), ""));
      }
    }
    environment.setDatabaseConfigs(databaseConfigsXML);
  }

  /**
   * get information of each Database configuration
   * 
   * @param iDBConfig
   * @param dbConfigXML
   * @param isIncludeUsernameAndPassword
   */
  private static void writeChild(IExternalDatabaseConfiguration iDBConfig, DatabaseConfig dbConfigXML,
      boolean isIncludeUsernameAndPassword) {
    DatabaseConnectionConfiguration dbConnection = iDBConfig.getDatabaseConnectionConfiguration();
    dbConfigXML.setId(iDBConfig.getUserFriendlyName());
    dbConfigXML.setDriverName(dbConnection.getDriverName() == null ? "" : dbConnection.getDriverName());
    dbConfigXML.setConnectionUrl(dbConnection.getConnectionUrl() == null ? "" : dbConnection.getConnectionUrl());
    dbConfigXML.setMaxConnection(iDBConfig.getMaxConnections());
    if (isIncludeUsernameAndPassword) {
      dbConfigXML.setUsername(dbConnection.getUserName());
      dbConfigXML.setPassword(dbConnection.getPassword());
    }
    if (dbConnection.getProperties() != null) {
      Properties props = dbConnection.getProperties();
      for (Entry<Object, Object> map : props.entrySet()) {
        Property propXML = new Property();
        propXML.setName(map.getKey() == null ? "" : map.getKey().toString());
        propXML.setValue(map.getValue() == null ? "" : map.getValue().toString());
        dbConfigXML.getPropertyList().add(propXML);
      }
    }
  }

}
