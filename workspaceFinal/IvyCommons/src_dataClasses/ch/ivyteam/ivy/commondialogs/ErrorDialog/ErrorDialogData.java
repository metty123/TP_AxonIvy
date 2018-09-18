package ch.ivyteam.ivy.commondialogs.ErrorDialog;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ErrorDialogData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ErrorDialogData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2259863873257215353L;

  private transient java.lang.Throwable error;

  /**
   * Gets the field error.
   * @return the value of the field error; may be null.
   */
  public java.lang.Throwable getError()
  {
    return error;
  }

  /**
   * Sets the field error.
   * @param _error the new value of the field error.
   */
  public void setError(java.lang.Throwable _error)
  {
    error = _error;
  }

  private transient java.lang.Boolean showCopyButton;

  /**
   * Gets the field showCopyButton.
   * @return the value of the field showCopyButton; may be null.
   */
  public java.lang.Boolean getShowCopyButton()
  {
    return showCopyButton;
  }

  /**
   * Sets the field showCopyButton.
   * @param _showCopyButton the new value of the field showCopyButton.
   */
  public void setShowCopyButton(java.lang.Boolean _showCopyButton)
  {
    showCopyButton = _showCopyButton;
  }

  private transient java.lang.Boolean showDetailButton;

  /**
   * Gets the field showDetailButton.
   * @return the value of the field showDetailButton; may be null.
   */
  public java.lang.Boolean getShowDetailButton()
  {
    return showDetailButton;
  }

  /**
   * Sets the field showDetailButton.
   * @param _showDetailButton the new value of the field showDetailButton.
   */
  public void setShowDetailButton(java.lang.Boolean _showDetailButton)
  {
    showDetailButton = _showDetailButton;
  }

  private transient ch.ivyteam.ivy.commons.data.technical.IvyResultStatus ivyResultStatus;

  /**
   * Gets the field ivyResultStatus.
   * @return the value of the field ivyResultStatus; may be null.
   */
  public ch.ivyteam.ivy.commons.data.technical.IvyResultStatus getIvyResultStatus()
  {
    return ivyResultStatus;
  }

  /**
   * Sets the field ivyResultStatus.
   * @param _ivyResultStatus the new value of the field ivyResultStatus.
   */
  public void setIvyResultStatus(ch.ivyteam.ivy.commons.data.technical.IvyResultStatus _ivyResultStatus)
  {
    ivyResultStatus = _ivyResultStatus;
  }

}
