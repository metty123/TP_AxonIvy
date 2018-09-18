package ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class GlobalVariableDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class GlobalVariableDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6805318416509550963L;

  private java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private java.lang.String description;

  /**
   * Gets the field description.
   * @return the value of the field description; may be null.
   */
  public java.lang.String getDescription()
  {
    return description;
  }

  /**
   * Sets the field description.
   * @param _description the new value of the field description.
   */
  public void setDescription(java.lang.String _description)
  {
    description = _description;
  }

  private java.lang.String value;

  /**
   * Gets the field value.
   * @return the value of the field value; may be null.
   */
  public java.lang.String getValue()
  {
    return value;
  }

  /**
   * Sets the field value.
   * @param _value the new value of the field value.
   */
  public void setValue(java.lang.String _value)
  {
    value = _value;
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

}
