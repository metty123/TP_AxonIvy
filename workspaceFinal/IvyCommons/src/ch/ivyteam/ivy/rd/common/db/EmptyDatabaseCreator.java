package ch.ivyteam.ivy.rd.common.db;

import ch.ivyteam.db.jdbc.ConnectionUrl;
import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import ch.ivyteam.db.jdbc.DatabaseUtil;

public class EmptyDatabaseCreator {
  /** The name of the new database */
  private String fDbName;

  /** The connnection configuration */
  private DatabaseConnectionConfiguration fDbConfig;

  /** The exception that may have occured during the creation of the db */
  private Exception fException;


  /**
   * Constructor
   * 
   * @param dbConfig The db configuration
   * @param dbName The name of the new database
   */
  public EmptyDatabaseCreator(DatabaseConnectionConfiguration dbConfig, String dbName) {
    fDbName = dbName;
    fDbConfig = dbConfig;
  }

  /**
   * Creates the database
   * 
   * @return <code>true</code> if the database was created successfully, <code>false</code> otherwise.
   */
  public boolean createDatabase() {
    try {
      // Try to remove the database name from the url
      String connectionUrl = fDbConfig.getConnectionUrl();
      ConnectionUrl parsedUrl = new ConnectionUrl(fDbConfig.getConnectionUrl());
      if (parsedUrl.getDbName() != null && parsedUrl.getDbName().trim().length() > 0) {
        connectionUrl = connectionUrl.substring(0, connectionUrl.lastIndexOf(parsedUrl.getDbName()));
        fDbConfig.setConnectionUrl(connectionUrl);
      }

      fDbConfig = DatabaseUtil.createDatabase(fDbName, fDbConfig);
      return true;
    } catch (Exception ex) {
      fException = ex;
      return false;
    }
  }

  /**
   * Returns the exception that may have occured
   * 
   * @return The exception or <code>null</code>
   */
  public Exception getException() {
    return fException;
  }

  /**
   * Returns the database connection configuration. If the database was successfully created then this will be the
   * configuration to the new database
   * 
   * @return Connection configuration
   */
  public DatabaseConnectionConfiguration getDbConfiguration() {
    return fDbConfig;
  }
}
