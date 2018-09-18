package ch.ivyteam.ivy.admin.tool.database.DatabaseDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DatabaseDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DatabaseDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2281637744120720403L;

  private ch.ivyteam.ivy.application.IApplication application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivyteam.ivy.application.IApplication _application)
  {
    application = _application;
  }

  private transient ch.ivyteam.ivy.application.IExternalDatabaseConfiguration changedDatebaseConfiguration;

  /**
   * Gets the field changedDatebaseConfiguration.
   * @return the value of the field changedDatebaseConfiguration; may be null.
   */
  public ch.ivyteam.ivy.application.IExternalDatabaseConfiguration getChangedDatebaseConfiguration()
  {
    return changedDatebaseConfiguration;
  }

  /**
   * Sets the field changedDatebaseConfiguration.
   * @param _changedDatebaseConfiguration the new value of the field changedDatebaseConfiguration.
   */
  public void setChangedDatebaseConfiguration(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration _changedDatebaseConfiguration)
  {
    changedDatebaseConfiguration = _changedDatebaseConfiguration;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Recordset connections;

  /**
   * Gets the field connections.
   * @return the value of the field connections; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getConnections()
  {
    return connections;
  }

  /**
   * Sets the field connections.
   * @param _connections the new value of the field connections.
   */
  public void setConnections(ch.ivyteam.ivy.scripting.objects.Recordset _connections)
  {
    connections = _connections;
  }

  private java.lang.String connectionUrl;

  /**
   * Gets the field connectionUrl.
   * @return the value of the field connectionUrl; may be null.
   */
  public java.lang.String getConnectionUrl()
  {
    return connectionUrl;
  }

  /**
   * Sets the field connectionUrl.
   * @param _connectionUrl the new value of the field connectionUrl.
   */
  public void setConnectionUrl(java.lang.String _connectionUrl)
  {
    connectionUrl = _connectionUrl;
  }

  private transient ch.ivyteam.ivy.db.IExternalDatabase database;

  /**
   * Gets the field database.
   * @return the value of the field database; may be null.
   */
  public ch.ivyteam.ivy.db.IExternalDatabase getDatabase()
  {
    return database;
  }

  /**
   * Sets the field database.
   * @param _database the new value of the field database.
   */
  public void setDatabase(ch.ivyteam.ivy.db.IExternalDatabase _database)
  {
    database = _database;
  }

  private transient ch.ivyteam.ivy.application.IExternalDatabaseConfiguration databaseConfig;

  /**
   * Gets the field databaseConfig.
   * @return the value of the field databaseConfig; may be null.
   */
  public ch.ivyteam.ivy.application.IExternalDatabaseConfiguration getDatabaseConfig()
  {
    return databaseConfig;
  }

  /**
   * Sets the field databaseConfig.
   * @param _databaseConfig the new value of the field databaseConfig.
   */
  public void setDatabaseConfig(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration _databaseConfig)
  {
    databaseConfig = _databaseConfig;
  }

  private java.lang.Number deletedApplicationId;

  /**
   * Gets the field deletedApplicationId.
   * @return the value of the field deletedApplicationId; may be null.
   */
  public java.lang.Number getDeletedApplicationId()
  {
    return deletedApplicationId;
  }

  /**
   * Sets the field deletedApplicationId.
   * @param _deletedApplicationId the new value of the field deletedApplicationId.
   */
  public void setDeletedApplicationId(java.lang.Number _deletedApplicationId)
  {
    deletedApplicationId = _deletedApplicationId;
  }

  private java.lang.Number deletedDatabaseId;

  /**
   * Gets the field deletedDatabaseId.
   * @return the value of the field deletedDatabaseId; may be null.
   */
  public java.lang.Number getDeletedDatabaseId()
  {
    return deletedDatabaseId;
  }

  /**
   * Sets the field deletedDatabaseId.
   * @param _deletedDatabaseId the new value of the field deletedDatabaseId.
   */
  public void setDeletedDatabaseId(java.lang.Number _deletedDatabaseId)
  {
    deletedDatabaseId = _deletedDatabaseId;
  }

  private java.lang.String driver;

  /**
   * Gets the field driver.
   * @return the value of the field driver; may be null.
   */
  public java.lang.String getDriver()
  {
    return driver;
  }

  /**
   * Sets the field driver.
   * @param _driver the new value of the field driver.
   */
  public void setDriver(java.lang.String _driver)
  {
    driver = _driver;
  }

  private java.lang.Boolean editMode;

  /**
   * Gets the field editMode.
   * @return the value of the field editMode; may be null.
   */
  public java.lang.Boolean getEditMode()
  {
    return editMode;
  }

  /**
   * Sets the field editMode.
   * @param _editMode the new value of the field editMode.
   */
  public void setEditMode(java.lang.Boolean _editMode)
  {
    editMode = _editMode;
  }

  private ch.ivyteam.ivy.application.restricted.IEnvironment environment;

  /**
   * Gets the field environment.
   * @return the value of the field environment; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IEnvironment getEnvironment()
  {
    return environment;
  }

  /**
   * Sets the field environment.
   * @param _environment the new value of the field environment.
   */
  public void setEnvironment(ch.ivyteam.ivy.application.restricted.IEnvironment _environment)
  {
    environment = _environment;
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

  private java.lang.Boolean isDefault;

  /**
   * Gets the field isDefault.
   * @return the value of the field isDefault; may be null.
   */
  public java.lang.Boolean getIsDefault()
  {
    return isDefault;
  }

  /**
   * Sets the field isDefault.
   * @param _isDefault the new value of the field isDefault.
   */
  public void setIsDefault(java.lang.Boolean _isDefault)
  {
    isDefault = _isDefault;
  }

  private transient java.lang.Boolean isSuccess;

  /**
   * Gets the field isSuccess.
   * @return the value of the field isSuccess; may be null.
   */
  public java.lang.Boolean getIsSuccess()
  {
    return isSuccess;
  }

  /**
   * Sets the field isSuccess.
   * @param _isSuccess the new value of the field isSuccess.
   */
  public void setIsSuccess(java.lang.Boolean _isSuccess)
  {
    isSuccess = _isSuccess;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.db.IStatementExecution> lastExecutedStatements;

  /**
   * Gets the field lastExecutedStatements.
   * @return the value of the field lastExecutedStatements; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.db.IStatementExecution> getLastExecutedStatements()
  {
    return lastExecutedStatements;
  }

  /**
   * Sets the field lastExecutedStatements.
   * @param _lastExecutedStatements the new value of the field lastExecutedStatements.
   */
  public void setLastExecutedStatements(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.db.IStatementExecution> _lastExecutedStatements)
  {
    lastExecutedStatements = _lastExecutedStatements;
  }

  private transient java.lang.Number maxConnections;

  /**
   * Gets the field maxConnections.
   * @return the value of the field maxConnections; may be null.
   */
  public java.lang.Number getMaxConnections()
  {
    return maxConnections;
  }

  /**
   * Sets the field maxConnections.
   * @param _maxConnections the new value of the field maxConnections.
   */
  public void setMaxConnections(java.lang.Number _maxConnections)
  {
    maxConnections = _maxConnections;
  }

  private java.lang.String pressedButton;

  /**
   * Gets the field pressedButton.
   * @return the value of the field pressedButton; may be null.
   */
  public java.lang.String getPressedButton()
  {
    return pressedButton;
  }

  /**
   * Sets the field pressedButton.
   * @param _pressedButton the new value of the field pressedButton.
   */
  public void setPressedButton(java.lang.String _pressedButton)
  {
    pressedButton = _pressedButton;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Recordset statements;

  /**
   * Gets the field statements.
   * @return the value of the field statements; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getStatements()
  {
    return statements;
  }

  /**
   * Sets the field statements.
   * @param _statements the new value of the field statements.
   */
  public void setStatements(ch.ivyteam.ivy.scripting.objects.Recordset _statements)
  {
    statements = _statements;
  }

  private java.lang.Number tempIdentifier;

  /**
   * Gets the field tempIdentifier.
   * @return the value of the field tempIdentifier; may be null.
   */
  public java.lang.Number getTempIdentifier()
  {
    return tempIdentifier;
  }

  /**
   * Sets the field tempIdentifier.
   * @param _tempIdentifier the new value of the field tempIdentifier.
   */
  public void setTempIdentifier(java.lang.Number _tempIdentifier)
  {
    tempIdentifier = _tempIdentifier;
  }

  private java.lang.String tempType;

  /**
   * Gets the field tempType.
   * @return the value of the field tempType; may be null.
   */
  public java.lang.String getTempType()
  {
    return tempType;
  }

  /**
   * Sets the field tempType.
   * @param _tempType the new value of the field tempType.
   */
  public void setTempType(java.lang.String _tempType)
  {
    tempType = _tempType;
  }

  private transient java.lang.String userFriendlyName;

  /**
   * Gets the field userFriendlyName.
   * @return the value of the field userFriendlyName; may be null.
   */
  public java.lang.String getUserFriendlyName()
  {
    return userFriendlyName;
  }

  /**
   * Sets the field userFriendlyName.
   * @param _userFriendlyName the new value of the field userFriendlyName.
   */
  public void setUserFriendlyName(java.lang.String _userFriendlyName)
  {
    userFriendlyName = _userFriendlyName;
  }

}
