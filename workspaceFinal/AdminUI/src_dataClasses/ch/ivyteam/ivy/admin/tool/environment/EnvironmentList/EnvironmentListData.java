package ch.ivyteam.ivy.admin.tool.environment.EnvironmentList;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EnvironmentListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EnvironmentListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8264170051894998280L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> environments;

  /**
   * Gets the field environments.
   * @return the value of the field environments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> getEnvironments()
  {
    return environments;
  }

  /**
   * Sets the field environments.
   * @param _environments the new value of the field environments.
   */
  public void setEnvironments(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> _environments)
  {
    environments = _environments;
  }

  private ch.ivyteam.ivy.application.IApplication applicationFilter;

  /**
   * Gets the field applicationFilter.
   * @return the value of the field applicationFilter; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplicationFilter()
  {
    return applicationFilter;
  }

  /**
   * Sets the field applicationFilter.
   * @param _applicationFilter the new value of the field applicationFilter.
   */
  public void setApplicationFilter(ch.ivyteam.ivy.application.IApplication _applicationFilter)
  {
    applicationFilter = _applicationFilter;
  }

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.Object> parameterList;

  /**
   * Gets the field parameterList.
   * @return the value of the field parameterList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.Object> getParameterList()
  {
    return parameterList;
  }

  /**
   * Sets the field parameterList.
   * @param _parameterList the new value of the field parameterList.
   */
  public void setParameterList(ch.ivyteam.ivy.scripting.objects.List<java.lang.Object> _parameterList)
  {
    parameterList = _parameterList;
  }

  private ch.ivyteam.ivy.application.restricted.IEnvironment selectedEnvironment;

  /**
   * Gets the field selectedEnvironment.
   * @return the value of the field selectedEnvironment; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IEnvironment getSelectedEnvironment()
  {
    return selectedEnvironment;
  }

  /**
   * Sets the field selectedEnvironment.
   * @param _selectedEnvironment the new value of the field selectedEnvironment.
   */
  public void setSelectedEnvironment(ch.ivyteam.ivy.application.restricted.IEnvironment _selectedEnvironment)
  {
    selectedEnvironment = _selectedEnvironment;
  }

  private java.lang.Boolean cancel;

  /**
   * Gets the field cancel.
   * @return the value of the field cancel; may be null.
   */
  public java.lang.Boolean getCancel()
  {
    return cancel;
  }

  /**
   * Sets the field cancel.
   * @param _cancel the new value of the field cancel.
   */
  public void setCancel(java.lang.Boolean _cancel)
  {
    cancel = _cancel;
  }

  private ch.ivyteam.ivy.application.IApplication selectedApplication;

  /**
   * Gets the field selectedApplication.
   * @return the value of the field selectedApplication; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getSelectedApplication()
  {
    return selectedApplication;
  }

  /**
   * Sets the field selectedApplication.
   * @param _selectedApplication the new value of the field selectedApplication.
   */
  public void setSelectedApplication(ch.ivyteam.ivy.application.IApplication _selectedApplication)
  {
    selectedApplication = _selectedApplication;
  }

  private java.lang.Boolean defaultSelection;

  /**
   * Gets the field defaultSelection.
   * @return the value of the field defaultSelection; may be null.
   */
  public java.lang.Boolean getDefaultSelection()
  {
    return defaultSelection;
  }

  /**
   * Sets the field defaultSelection.
   * @param _defaultSelection the new value of the field defaultSelection.
   */
  public void setDefaultSelection(java.lang.Boolean _defaultSelection)
  {
    defaultSelection = _defaultSelection;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> selectedEnvironments;

  /**
   * Gets the field selectedEnvironments.
   * @return the value of the field selectedEnvironments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> getSelectedEnvironments()
  {
    return selectedEnvironments;
  }

  /**
   * Sets the field selectedEnvironments.
   * @param _selectedEnvironments the new value of the field selectedEnvironments.
   */
  public void setSelectedEnvironments(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> _selectedEnvironments)
  {
    selectedEnvironments = _selectedEnvironments;
  }

  private java.lang.Number counter;

  /**
   * Gets the field counter.
   * @return the value of the field counter; may be null.
   */
  public java.lang.Number getCounter()
  {
    return counter;
  }

  /**
   * Sets the field counter.
   * @param _counter the new value of the field counter.
   */
  public void setCounter(java.lang.Number _counter)
  {
    counter = _counter;
  }

}
