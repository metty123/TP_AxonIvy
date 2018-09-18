package ch.ivyteam.ivy.commondialogs.QuestionDialog;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class QuestionDialogData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class QuestionDialogData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2387938728043429366L;

  private transient java.lang.String icon;

  /**
   * Gets the field icon.
   * @return the value of the field icon; may be null.
   */
  public java.lang.String getIcon()
  {
    return icon;
  }

  /**
   * Sets the field icon.
   * @param _icon the new value of the field icon.
   */
  public void setIcon(java.lang.String _icon)
  {
    icon = _icon;
  }

  private transient java.lang.String questionText;

  /**
   * Gets the field questionText.
   * @return the value of the field questionText; may be null.
   */
  public java.lang.String getQuestionText()
  {
    return questionText;
  }

  /**
   * Sets the field questionText.
   * @param _questionText the new value of the field questionText.
   */
  public void setQuestionText(java.lang.String _questionText)
  {
    questionText = _questionText;
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

  private transient java.lang.String questionTitle;

  /**
   * Gets the field questionTitle.
   * @return the value of the field questionTitle; may be null.
   */
  public java.lang.String getQuestionTitle()
  {
    return questionTitle;
  }

  /**
   * Sets the field questionTitle.
   * @param _questionTitle the new value of the field questionTitle.
   */
  public void setQuestionTitle(java.lang.String _questionTitle)
  {
    questionTitle = _questionTitle;
  }

  private transient java.lang.String defaultButton;

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
