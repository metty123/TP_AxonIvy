package ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DatabaseConnectionParameterData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DatabaseConnectionParameterData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4569668016570723257L;

  private transient java.util.HashMap connectionProperties;

  /**
   * Gets the field connectionProperties.
   * @return the value of the field connectionProperties; may be null.
   */
  public java.util.HashMap getConnectionProperties()
  {
    return connectionProperties;
  }

  /**
   * Sets the field connectionProperties.
   * @param _connectionProperties the new value of the field connectionProperties.
   */
  public void setConnectionProperties(java.util.HashMap _connectionProperties)
  {
    connectionProperties = _connectionProperties;
  }

  private transient ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConnection;

  /**
   * Gets the field dbConnection.
   * @return the value of the field dbConnection; may be null.
   */
  public ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration getDbConnection()
  {
    return dbConnection;
  }

  /**
   * Sets the field dbConnection.
   * @param _dbConnection the new value of the field dbConnection.
   */
  public void setDbConnection(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration _dbConnection)
  {
    dbConnection = _dbConnection;
  }

  private transient ch.ivyteam.ivy.rd.common.DbDriver dbDriver;

  /**
   * Gets the field dbDriver.
   * @return the value of the field dbDriver; may be null.
   */
  public ch.ivyteam.ivy.rd.common.DbDriver getDbDriver()
  {
    return dbDriver;
  }

  /**
   * Sets the field dbDriver.
   * @param _dbDriver the new value of the field dbDriver.
   */
  public void setDbDriver(ch.ivyteam.ivy.rd.common.DbDriver _dbDriver)
  {
    dbDriver = _dbDriver;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbDriver> dbDrivers;

  /**
   * Gets the field dbDrivers.
   * @return the value of the field dbDrivers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbDriver> getDbDrivers()
  {
    return dbDrivers;
  }

  /**
   * Sets the field dbDrivers.
   * @param _dbDrivers the new value of the field dbDrivers.
   */
  public void setDbDrivers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbDriver> _dbDrivers)
  {
    dbDrivers = _dbDrivers;
  }

  private transient java.lang.String errorMessage;

  /**
   * Gets the field errorMessage.
   * @return the value of the field errorMessage; may be null.
   */
  public java.lang.String getErrorMessage()
  {
    return errorMessage;
  }

  /**
   * Sets the field errorMessage.
   * @param _errorMessage the new value of the field errorMessage.
   */
  public void setErrorMessage(java.lang.String _errorMessage)
  {
    errorMessage = _errorMessage;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> jdbcDrivers;

  /**
   * Gets the field jdbcDrivers.
   * @return the value of the field jdbcDrivers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> getJdbcDrivers()
  {
    return jdbcDrivers;
  }

  /**
   * Sets the field jdbcDrivers.
   * @param _jdbcDrivers the new value of the field jdbcDrivers.
   */
  public void setJdbcDrivers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> _jdbcDrivers)
  {
    jdbcDrivers = _jdbcDrivers;
  }

}
