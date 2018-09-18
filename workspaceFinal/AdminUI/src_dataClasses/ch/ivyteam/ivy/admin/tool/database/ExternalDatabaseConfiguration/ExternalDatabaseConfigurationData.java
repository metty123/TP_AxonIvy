package ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ExternalDatabaseConfigurationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ExternalDatabaseConfigurationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3724596438092725006L;

  private transient ch.ivyteam.ivy.application.IExternalDatabaseConfiguration database;

  /**
   * Gets the field database.
   * @return the value of the field database; may be null.
   */
  public ch.ivyteam.ivy.application.IExternalDatabaseConfiguration getDatabase()
  {
    return database;
  }

  /**
   * Sets the field database.
   * @param _database the new value of the field database.
   */
  public void setDatabase(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration _database)
  {
    database = _database;
  }

  private transient ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConfiguration;

  /**
   * Gets the field dbConfiguration.
   * @return the value of the field dbConfiguration; may be null.
   */
  public ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration getDbConfiguration()
  {
    return dbConfiguration;
  }

  /**
   * Sets the field dbConfiguration.
   * @param _dbConfiguration the new value of the field dbConfiguration.
   */
  public void setDbConfiguration(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration _dbConfiguration)
  {
    dbConfiguration = _dbConfiguration;
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

  private transient java.lang.Boolean isError;

  /**
   * Gets the field isError.
   * @return the value of the field isError; may be null.
   */
  public java.lang.Boolean getIsError()
  {
    return isError;
  }

  /**
   * Sets the field isError.
   * @param _isError the new value of the field isError.
   */
  public void setIsError(java.lang.Boolean _isError)
  {
    isError = _isError;
  }

  private transient java.lang.String pressedButton;

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

}
