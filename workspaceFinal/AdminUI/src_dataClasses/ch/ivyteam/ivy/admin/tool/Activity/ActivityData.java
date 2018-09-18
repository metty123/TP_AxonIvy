package ch.ivyteam.ivy.admin.tool.Activity;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ActivityData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ActivityData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3505208485035119433L;

  private transient ch.ivyteam.ivy.application.IActivity activity;

  /**
   * Gets the field activity.
   * @return the value of the field activity; may be null.
   */
  public ch.ivyteam.ivy.application.IActivity getActivity()
  {
    return activity;
  }

  /**
   * Sets the field activity.
   * @param _activity the new value of the field activity.
   */
  public void setActivity(ch.ivyteam.ivy.application.IActivity _activity)
  {
    activity = _activity;
  }

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

  private transient java.lang.Boolean isForPmv;

  /**
   * Gets the field isForPmv.
   * @return the value of the field isForPmv; may be null.
   */
  public java.lang.Boolean getIsForPmv()
  {
    return isForPmv;
  }

  /**
   * Sets the field isForPmv.
   * @param _isForPmv the new value of the field isForPmv.
   */
  public void setIsForPmv(java.lang.Boolean _isForPmv)
  {
    isForPmv = _isForPmv;
  }

}
