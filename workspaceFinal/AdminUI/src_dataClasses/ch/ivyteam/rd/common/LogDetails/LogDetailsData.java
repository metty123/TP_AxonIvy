package ch.ivyteam.rd.common.LogDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LogDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LogDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -680030987544091726L;

  private java.lang.Boolean hasNewMessage;

  /**
   * Gets the field hasNewMessage.
   * @return the value of the field hasNewMessage; may be null.
   */
  public java.lang.Boolean getHasNewMessage()
  {
    return hasNewMessage;
  }

  /**
   * Sets the field hasNewMessage.
   * @param _hasNewMessage the new value of the field hasNewMessage.
   */
  public void setHasNewMessage(java.lang.Boolean _hasNewMessage)
  {
    hasNewMessage = _hasNewMessage;
  }

  private java.lang.Integer logIndex;

  /**
   * Gets the field logIndex.
   * @return the value of the field logIndex; may be null.
   */
  public java.lang.Integer getLogIndex()
  {
    return logIndex;
  }

  /**
   * Sets the field logIndex.
   * @param _logIndex the new value of the field logIndex.
   */
  public void setLogIndex(java.lang.Integer _logIndex)
  {
    logIndex = _logIndex;
  }

  private java.lang.String logMessage;

  /**
   * Gets the field logMessage.
   * @return the value of the field logMessage; may be null.
   */
  public java.lang.String getLogMessage()
  {
    return logMessage;
  }

  /**
   * Sets the field logMessage.
   * @param _logMessage the new value of the field logMessage.
   */
  public void setLogMessage(java.lang.String _logMessage)
  {
    logMessage = _logMessage;
  }

  private ch.ivyteam.ivy.security.ISecurityContext securityContext;

  /**
   * Gets the field securityContext.
   * @return the value of the field securityContext; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityContext getSecurityContext()
  {
    return securityContext;
  }

  /**
   * Sets the field securityContext.
   * @param _securityContext the new value of the field securityContext.
   */
  public void setSecurityContext(ch.ivyteam.ivy.security.ISecurityContext _securityContext)
  {
    securityContext = _securityContext;
  }

  private ch.ivyteam.ivy.admin.tool.process.SynchronizationLogger synchronizationLogger;

  /**
   * Gets the field synchronizationLogger.
   * @return the value of the field synchronizationLogger; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.process.SynchronizationLogger getSynchronizationLogger()
  {
    return synchronizationLogger;
  }

  /**
   * Sets the field synchronizationLogger.
   * @param _synchronizationLogger the new value of the field synchronizationLogger.
   */
  public void setSynchronizationLogger(ch.ivyteam.ivy.admin.tool.process.SynchronizationLogger _synchronizationLogger)
  {
    synchronizationLogger = _synchronizationLogger;
  }

  private ch.ivyteam.ivy.admin.tool.process.SynchronizationManager synchronizationManager;

  /**
   * Gets the field synchronizationManager.
   * @return the value of the field synchronizationManager; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.process.SynchronizationManager getSynchronizationManager()
  {
    return synchronizationManager;
  }

  /**
   * Sets the field synchronizationManager.
   * @param _synchronizationManager the new value of the field synchronizationManager.
   */
  public void setSynchronizationManager(ch.ivyteam.ivy.admin.tool.process.SynchronizationManager _synchronizationManager)
  {
    synchronizationManager = _synchronizationManager;
  }

}
