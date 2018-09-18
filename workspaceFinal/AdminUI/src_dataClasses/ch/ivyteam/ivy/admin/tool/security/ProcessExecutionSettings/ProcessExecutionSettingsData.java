package ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ProcessExecutionSettingsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessExecutionSettingsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 5956121752255628869L;

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

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> executionLibraries;

  /**
   * Gets the field executionLibraries.
   * @return the value of the field executionLibraries; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getExecutionLibraries()
  {
    return executionLibraries;
  }

  /**
   * Sets the field executionLibraries.
   * @param _executionLibraries the new value of the field executionLibraries.
   */
  public void setExecutionLibraries(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _executionLibraries)
  {
    executionLibraries = _executionLibraries;
  }

  private java.lang.String selectedExecutionLibrary;

  /**
   * Gets the field selectedExecutionLibrary.
   * @return the value of the field selectedExecutionLibrary; may be null.
   */
  public java.lang.String getSelectedExecutionLibrary()
  {
    return selectedExecutionLibrary;
  }

  /**
   * Sets the field selectedExecutionLibrary.
   * @param _selectedExecutionLibrary the new value of the field selectedExecutionLibrary.
   */
  public void setSelectedExecutionLibrary(java.lang.String _selectedExecutionLibrary)
  {
    selectedExecutionLibrary = _selectedExecutionLibrary;
  }

}
