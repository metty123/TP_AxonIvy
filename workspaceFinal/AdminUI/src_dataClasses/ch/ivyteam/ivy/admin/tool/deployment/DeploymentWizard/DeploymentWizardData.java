package ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DeploymentWizardData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DeploymentWizardData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5513376535316840796L;

  private ch.ivyteam.ivy.application.IProcessModelVersion pmv;

  /**
   * Gets the field pmv.
   * @return the value of the field pmv; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModelVersion getPmv()
  {
    return pmv;
  }

  /**
   * Sets the field pmv.
   * @param _pmv the new value of the field pmv.
   */
  public void setPmv(ch.ivyteam.ivy.application.IProcessModelVersion _pmv)
  {
    pmv = _pmv;
  }

  private java.lang.String state;

  /**
   * Gets the field state.
   * @return the value of the field state; may be null.
   */
  public java.lang.String getState()
  {
    return state;
  }

  /**
   * Sets the field state.
   * @param _state the new value of the field state.
   */
  public void setState(java.lang.String _state)
  {
    state = _state;
  }

  private java.lang.Boolean isPreviousEnabled;

  /**
   * Gets the field isPreviousEnabled.
   * @return the value of the field isPreviousEnabled; may be null.
   */
  public java.lang.Boolean getIsPreviousEnabled()
  {
    return isPreviousEnabled;
  }

  /**
   * Sets the field isPreviousEnabled.
   * @param _isPreviousEnabled the new value of the field isPreviousEnabled.
   */
  public void setIsPreviousEnabled(java.lang.Boolean _isPreviousEnabled)
  {
    isPreviousEnabled = _isPreviousEnabled;
  }

  private java.lang.Boolean isNextEnabled;

  /**
   * Gets the field isNextEnabled.
   * @return the value of the field isNextEnabled; may be null.
   */
  public java.lang.Boolean getIsNextEnabled()
  {
    return isNextEnabled;
  }

  /**
   * Sets the field isNextEnabled.
   * @param _isNextEnabled the new value of the field isNextEnabled.
   */
  public void setIsNextEnabled(java.lang.Boolean _isNextEnabled)
  {
    isNextEnabled = _isNextEnabled;
  }

  private java.lang.Boolean isCancelEnabled;

  /**
   * Gets the field isCancelEnabled.
   * @return the value of the field isCancelEnabled; may be null.
   */
  public java.lang.Boolean getIsCancelEnabled()
  {
    return isCancelEnabled;
  }

  /**
   * Sets the field isCancelEnabled.
   * @param _isCancelEnabled the new value of the field isCancelEnabled.
   */
  public void setIsCancelEnabled(java.lang.Boolean _isCancelEnabled)
  {
    isCancelEnabled = _isCancelEnabled;
  }

  private java.io.File file;

  /**
   * Gets the field file.
   * @return the value of the field file; may be null.
   */
  public java.io.File getFile()
  {
    return file;
  }

  /**
   * Sets the field file.
   * @param _file the new value of the field file.
   */
  public void setFile(java.io.File _file)
  {
    file = _file;
  }

  private java.lang.String finishButtonLabel;

  /**
   * Gets the field finishButtonLabel.
   * @return the value of the field finishButtonLabel; may be null.
   */
  public java.lang.String getFinishButtonLabel()
  {
    return finishButtonLabel;
  }

  /**
   * Sets the field finishButtonLabel.
   * @param _finishButtonLabel the new value of the field finishButtonLabel.
   */
  public void setFinishButtonLabel(java.lang.String _finishButtonLabel)
  {
    finishButtonLabel = _finishButtonLabel;
  }

}
