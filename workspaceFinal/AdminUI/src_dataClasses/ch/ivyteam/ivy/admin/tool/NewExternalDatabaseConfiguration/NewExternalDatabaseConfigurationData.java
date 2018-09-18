package ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class NewExternalDatabaseConfigurationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class NewExternalDatabaseConfigurationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5077089084922319688L;

  private transient java.lang.String dbName;

  /**
   * Gets the field dbName.
   * @return the value of the field dbName; may be null.
   */
  public java.lang.String getDbName()
  {
    return dbName;
  }

  /**
   * Sets the field dbName.
   * @param _dbName the new value of the field dbName.
   */
  public void setDbName(java.lang.String _dbName)
  {
    dbName = _dbName;
  }

  private transient ch.ivyteam.ivy.application.IApplication application;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> applications;

  /**
   * Gets the field applications.
   * @return the value of the field applications; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> getApplications()
  {
    return applications;
  }

  /**
   * Sets the field applications.
   * @param _applications the new value of the field applications.
   */
  public void setApplications(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> _applications)
  {
    applications = _applications;
  }

  private transient ch.ivyteam.ivy.application.IExternalDatabaseConfiguration config;

  /**
   * Gets the field config.
   * @return the value of the field config; may be null.
   */
  public ch.ivyteam.ivy.application.IExternalDatabaseConfiguration getConfig()
  {
    return config;
  }

  /**
   * Sets the field config.
   * @param _config the new value of the field config.
   */
  public void setConfig(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration _config)
  {
    config = _config;
  }

}
