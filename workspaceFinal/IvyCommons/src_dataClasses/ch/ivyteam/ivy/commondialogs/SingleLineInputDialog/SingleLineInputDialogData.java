package ch.ivyteam.ivy.commondialogs.SingleLineInputDialog;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SingleLineInputDialogData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SingleLineInputDialogData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1657726106136886907L;

  private transient java.lang.String question;

  /**
   * Gets the field question.
   * @return the value of the field question; may be null.
   */
  public java.lang.String getQuestion()
  {
    return question;
  }

  /**
   * Sets the field question.
   * @param _question the new value of the field question.
   */
  public void setQuestion(java.lang.String _question)
  {
    question = _question;
  }

  private transient java.lang.String inputString;

  /**
   * Gets the field inputString.
   * @return the value of the field inputString; may be null.
   */
  public java.lang.String getInputString()
  {
    return inputString;
  }

  /**
   * Sets the field inputString.
   * @param _inputString the new value of the field inputString.
   */
  public void setInputString(java.lang.String _inputString)
  {
    inputString = _inputString;
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

  private java.lang.String defaultButton;

  /**
   * Gets the field defaultButton.
   * @return the value of the field defaultButton; may be null.
   */
  public java.lang.String getDefaultButton()
  {
    return defaultButton;
  }

  /**
   * Sets the field defaultButton.
   * @param _defaultButton the new value of the field defaultButton.
   */
  public void setDefaultButton(java.lang.String _defaultButton)
  {
    defaultButton = _defaultButton;
  }

  /**
   * It defines if the action commands; if yes: then the texts and icon uris for buttons are coming from external Ivy library
   */
  private transient java.lang.Boolean isCustomButtonsMode;

  /**
   * Gets the field isCustomButtonsMode.
   * @return the value of the field isCustomButtonsMode; may be null.
   */
  public java.lang.Boolean getIsCustomButtonsMode()
  {
    return isCustomButtonsMode;
  }

  /**
   * Sets the field isCustomButtonsMode.
   * @param _isCustomButtonsMode the new value of the field isCustomButtonsMode.
   */
  public void setIsCustomButtonsMode(java.lang.Boolean _isCustomButtonsMode)
  {
    isCustomButtonsMode = _isCustomButtonsMode;
  }

  /**
   * only used for custom buttons mode
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> actionCommandsForButtons;

  /**
   * Gets the field actionCommandsForButtons.
   * @return the value of the field actionCommandsForButtons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getActionCommandsForButtons()
  {
    return actionCommandsForButtons;
  }

  /**
   * Sets the field actionCommandsForButtons.
   * @param _actionCommandsForButtons the new value of the field actionCommandsForButtons.
   */
  public void setActionCommandsForButtons(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _actionCommandsForButtons)
  {
    actionCommandsForButtons = _actionCommandsForButtons;
  }

  /**
   * only used for custom buttons mode
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> textsForButtons;

  /**
   * Gets the field textsForButtons.
   * @return the value of the field textsForButtons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getTextsForButtons()
  {
    return textsForButtons;
  }

  /**
   * Sets the field textsForButtons.
   * @param _textsForButtons the new value of the field textsForButtons.
   */
  public void setTextsForButtons(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _textsForButtons)
  {
    textsForButtons = _textsForButtons;
  }

  /**
   * only used for custom buttons mode
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> iconUrisForButtons;

  /**
   * Gets the field iconUrisForButtons.
   * @return the value of the field iconUrisForButtons; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getIconUrisForButtons()
  {
    return iconUrisForButtons;
  }

  /**
   * Sets the field iconUrisForButtons.
   * @param _iconUrisForButtons the new value of the field iconUrisForButtons.
   */
  public void setIconUrisForButtons(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _iconUrisForButtons)
  {
    iconUrisForButtons = _iconUrisForButtons;
  }

}
