package ch.ivyteam.ivy.rd.common.db.DatabaseCreationParameter;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DatabaseCreationParameterData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DatabaseCreationParameterData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4555434688415095355L;

  private transient ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration databaseConnectionConfiguration;

  /**
   * Gets the field databaseConnectionConfiguration.
   * @return the value of the field databaseConnectionConfiguration; may be null.
   */
  public ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration getDatabaseConnectionConfiguration()
  {
    return databaseConnectionConfiguration;
  }

  /**
   * Sets the field databaseConnectionConfiguration.
   * @param _databaseConnectionConfiguration the new value of the field databaseConnectionConfiguration.
   */
  public void setDatabaseConnectionConfiguration(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration _databaseConnectionConfiguration)
  {
    databaseConnectionConfiguration = _databaseConnectionConfiguration;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> creationParameters;

  /**
   * Gets the field creationParameters.
   * @return the value of the field creationParameters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getCreationParameters()
  {
    return creationParameters;
  }

  /**
   * Sets the field creationParameters.
   * @param _creationParameters the new value of the field creationParameters.
   */
  public void setCreationParameters(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _creationParameters)
  {
    creationParameters = _creationParameters;
  }

  private transient java.lang.Boolean canceled;

  /**
   * Gets the field canceled.
   * @return the value of the field canceled; may be null.
   */
  public java.lang.Boolean getCanceled()
  {
    return canceled;
  }

  /**
   * Sets the field canceled.
   * @param _canceled the new value of the field canceled.
   */
  public void setCanceled(java.lang.Boolean _canceled)
  {
    canceled = _canceled;
  }

}
