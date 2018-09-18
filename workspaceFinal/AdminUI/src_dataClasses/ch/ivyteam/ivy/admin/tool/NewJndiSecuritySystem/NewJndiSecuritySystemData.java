package ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class NewJndiSecuritySystemData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class NewJndiSecuritySystemData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4812264504121977855L;

  private transient java.lang.Boolean canceled;

  /**
   * Gets the field canceled.
   * @return the value of the field canceled; may be null.
   */
  public java.lang.Boolean getCanceled()
  {
    return canceled;
  }

  /**
   * Sets the field canceled.
   * @param _canceled the new value of the field canceled.
   */
  public void setCanceled(java.lang.Boolean _canceled)
  {
    canceled = _canceled;
  }

  private transient java.lang.String erorrMsg;

  /**
   * Gets the field erorrMsg.
   * @return the value of the field erorrMsg; may be null.
   */
  public java.lang.String getErorrMsg()
  {
    return erorrMsg;
  }

  /**
   * Sets the field erorrMsg.
   * @param _erorrMsg the new value of the field erorrMsg.
   */
  public void setErorrMsg(java.lang.String _erorrMsg)
  {
    erorrMsg = _erorrMsg;
  }

  private transient javax.naming.NamingException error;

  /**
   * Gets the field error.
   * @return the value of the field error; may be null.
   */
  public javax.naming.NamingException getError()
  {
    return error;
  }

  /**
   * Sets the field error.
   * @param _error the new value of the field error.
   */
  public void setError(javax.naming.NamingException _error)
  {
    error = _error;
  }

  private transient java.lang.Boolean hasDataChanged;

  /**
   * Gets the field hasDataChanged.
   * @return the value of the field hasDataChanged; may be null.
   */
  public java.lang.Boolean getHasDataChanged()
  {
    return hasDataChanged;
  }

  /**
   * Sets the field hasDataChanged.
   * @param _hasDataChanged the new value of the field hasDataChanged.
   */
  public void setHasDataChanged(java.lang.Boolean _hasDataChanged)
  {
    hasDataChanged = _hasDataChanged;
  }

  private transient java.lang.Boolean isEditMask;

  /**
   * Gets the field isEditMask.
   * @return the value of the field isEditMask; may be null.
   */
  public java.lang.Boolean getIsEditMask()
  {
    return isEditMask;
  }

  /**
   * Sets the field isEditMask.
   * @param _isEditMask the new value of the field isEditMask.
   */
  public void setIsEditMask(java.lang.Boolean _isEditMask)
  {
    isEditMask = _isEditMask;
  }

  private transient ch.ivyteam.naming.JndiConfig jndiConfig;

  /**
   * Gets the field jndiConfig.
   * @return the value of the field jndiConfig; may be null.
   */
  public ch.ivyteam.naming.JndiConfig getJndiConfig()
  {
    return jndiConfig;
  }

  /**
   * Sets the field jndiConfig.
   * @param _jndiConfig the new value of the field jndiConfig.
   */
  public void setJndiConfig(ch.ivyteam.naming.JndiConfig _jndiConfig)
  {
    jndiConfig = _jndiConfig;
  }

  /**
   * user's answer from a Question dialog
   */
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

}
