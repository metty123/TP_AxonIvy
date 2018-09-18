package ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class MailContentProcessSettingData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class MailContentProcessSettingData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5956121754284941637L;

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

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> libraries;

  /**
   * Gets the field libraries.
   * @return the value of the field libraries; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getLibraries()
  {
    return libraries;
  }

  /**
   * Sets the field libraries.
   * @param _libraries the new value of the field libraries.
   */
  public void setLibraries(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _libraries)
  {
    libraries = _libraries;
  }

  private java.lang.String selectedLibrary;

  /**
   * Gets the field selectedLibrary.
   * @return the value of the field selectedLibrary; may be null.
   */
  public java.lang.String getSelectedLibrary()
  {
    return selectedLibrary;
  }

  /**
   * Sets the field selectedLibrary.
   * @param _selectedLibrary the new value of the field selectedLibrary.
   */
  public void setSelectedLibrary(java.lang.String _selectedLibrary)
  {
    selectedLibrary = _selectedLibrary;
  }

}
