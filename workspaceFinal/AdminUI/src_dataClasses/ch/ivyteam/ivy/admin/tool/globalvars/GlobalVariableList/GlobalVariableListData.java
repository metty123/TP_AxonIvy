package ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class GlobalVariableListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class GlobalVariableListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2251905187774141580L;

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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> filteredGlobalVariables;

  /**
   * Gets the field filteredGlobalVariables.
   * @return the value of the field filteredGlobalVariables; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> getFilteredGlobalVariables()
  {
    return filteredGlobalVariables;
  }

  /**
   * Sets the field filteredGlobalVariables.
   * @param _filteredGlobalVariables the new value of the field filteredGlobalVariables.
   */
  public void setFilteredGlobalVariables(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> _filteredGlobalVariables)
  {
    filteredGlobalVariables = _filteredGlobalVariables;
  }

  private ch.ivyteam.ivy.application.restricted.IGlobalVariable globalVariable;

  /**
   * Gets the field globalVariable.
   * @return the value of the field globalVariable; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IGlobalVariable getGlobalVariable()
  {
    return globalVariable;
  }

  /**
   * Sets the field globalVariable.
   * @param _globalVariable the new value of the field globalVariable.
   */
  public void setGlobalVariable(ch.ivyteam.ivy.application.restricted.IGlobalVariable _globalVariable)
  {
    globalVariable = _globalVariable;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> globalVariables;

  /**
   * Gets the field globalVariables.
   * @return the value of the field globalVariables; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> getGlobalVariables()
  {
    return globalVariables;
  }

  /**
   * Sets the field globalVariables.
   * @param _globalVariables the new value of the field globalVariables.
   */
  public void setGlobalVariables(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> _globalVariables)
  {
    globalVariables = _globalVariables;
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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> selectedGlobalVariables;

  /**
   * Gets the field selectedGlobalVariables.
   * @return the value of the field selectedGlobalVariables; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> getSelectedGlobalVariables()
  {
    return selectedGlobalVariables;
  }

  /**
   * Sets the field selectedGlobalVariables.
   * @param _selectedGlobalVariables the new value of the field selectedGlobalVariables.
   */
  public void setSelectedGlobalVariables(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> _selectedGlobalVariables)
  {
    selectedGlobalVariables = _selectedGlobalVariables;
  }

}
