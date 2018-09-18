package ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EnvironmentDatabaseData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EnvironmentDatabaseData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4708653344119611913L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration> databases;

  /**
   * Gets the field databases.
   * @return the value of the field databases; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration> getDatabases()
  {
    return databases;
  }

  /**
   * Sets the field databases.
   * @param _databases the new value of the field databases.
   */
  public void setDatabases(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration> _databases)
  {
    databases = _databases;
  }

  private ch.ivyteam.ivy.application.IExternalDatabaseConfiguration selectedDatabase;

  /**
   * Gets the field selectedDatabase.
   * @return the value of the field selectedDatabase; may be null.
   */
  public ch.ivyteam.ivy.application.IExternalDatabaseConfiguration getSelectedDatabase()
  {
    return selectedDatabase;
  }

  /**
   * Sets the field selectedDatabase.
   * @param _selectedDatabase the new value of the field selectedDatabase.
   */
  public void setSelectedDatabase(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration _selectedDatabase)
  {
    selectedDatabase = _selectedDatabase;
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

}
