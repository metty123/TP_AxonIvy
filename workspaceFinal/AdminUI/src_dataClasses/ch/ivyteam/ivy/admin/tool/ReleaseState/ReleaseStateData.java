package ch.ivyteam.ivy.admin.tool.ReleaseState;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ReleaseStateData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ReleaseStateData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1484533507681425616L;

  private transient ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion;

  /**
   * Gets the field processModelVersion.
   * @return the value of the field processModelVersion; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModelVersion getProcessModelVersion()
  {
    return processModelVersion;
  }

  /**
   * Sets the field processModelVersion.
   * @param _processModelVersion the new value of the field processModelVersion.
   */
  public void setProcessModelVersion(ch.ivyteam.ivy.application.IProcessModelVersion _processModelVersion)
  {
    processModelVersion = _processModelVersion;
  }

  private java.lang.Boolean pmvIsRequired;

  /**
   * Gets the field pmvIsRequired.
   * @return the value of the field pmvIsRequired; may be null.
   */
  public java.lang.Boolean getPmvIsRequired()
  {
    return pmvIsRequired;
  }

  /**
   * Sets the field pmvIsRequired.
   * @param _pmvIsRequired the new value of the field pmvIsRequired.
   */
  public void setPmvIsRequired(java.lang.Boolean _pmvIsRequired)
  {
    pmvIsRequired = _pmvIsRequired;
  }

  private java.lang.Boolean pmvHasWrongState;

  /**
   * Gets the field pmvHasWrongState.
   * @return the value of the field pmvHasWrongState; may be null.
   */
  public java.lang.Boolean getPmvHasWrongState()
  {
    return pmvHasWrongState;
  }

  /**
   * Sets the field pmvHasWrongState.
   * @param _pmvHasWrongState the new value of the field pmvHasWrongState.
   */
  public void setPmvHasWrongState(java.lang.Boolean _pmvHasWrongState)
  {
    pmvHasWrongState = _pmvHasWrongState;
  }

  private java.lang.String pmvNotDeletableReason;

  /**
   * Gets the field pmvNotDeletableReason.
   * @return the value of the field pmvNotDeletableReason; may be null.
   */
  public java.lang.String getPmvNotDeletableReason()
  {
    return pmvNotDeletableReason;
  }

  /**
   * Sets the field pmvNotDeletableReason.
   * @param _pmvNotDeletableReason the new value of the field pmvNotDeletableReason.
   */
  public void setPmvNotDeletableReason(java.lang.String _pmvNotDeletableReason)
  {
    pmvNotDeletableReason = _pmvNotDeletableReason;
  }

  private transient java.lang.Boolean delete;

  /**
   * Gets the field delete.
   * @return the value of the field delete; may be null.
   */
  public java.lang.Boolean getDelete()
  {
    return delete;
  }

  /**
   * Sets the field delete.
   * @param _delete the new value of the field delete.
   */
  public void setDelete(java.lang.Boolean _delete)
  {
    delete = _delete;
  }

}
