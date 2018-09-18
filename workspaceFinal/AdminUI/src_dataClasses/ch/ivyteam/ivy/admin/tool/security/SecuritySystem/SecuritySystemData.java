package ch.ivyteam.ivy.admin.tool.security.SecuritySystem;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SecuritySystemData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SecuritySystemData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6056836081929789885L;

  private transient java.lang.Exception exception;

  /**
   * Gets the field exception.
   * @return the value of the field exception; may be null.
   */
  public java.lang.Exception getException()
  {
    return exception;
  }

  /**
   * Sets the field exception.
   * @param _exception the new value of the field exception.
   */
  public void setException(java.lang.Exception _exception)
  {
    exception = _exception;
  }

  private transient ch.ivyteam.ivy.security.ISecurityContext securityContext;

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

  private transient ch.ivyteam.ivy.security.ISecurityDescriptor securityDescriptor;

  /**
   * Gets the field securityDescriptor.
   * @return the value of the field securityDescriptor; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityDescriptor getSecurityDescriptor()
  {
    return securityDescriptor;
  }

  /**
   * Sets the field securityDescriptor.
   * @param _securityDescriptor the new value of the field securityDescriptor.
   */
  public void setSecurityDescriptor(ch.ivyteam.ivy.security.ISecurityDescriptor _securityDescriptor)
  {
    securityDescriptor = _securityDescriptor;
  }

  private java.lang.Boolean isSynchRunning;

  /**
   * Gets the field isSynchRunning.
   * @return the value of the field isSynchRunning; may be null.
   */
  public java.lang.Boolean getIsSynchRunning()
  {
    return isSynchRunning;
  }

  /**
   * Sets the field isSynchRunning.
   * @param _isSynchRunning the new value of the field isSynchRunning.
   */
  public void setIsSynchRunning(java.lang.Boolean _isSynchRunning)
  {
    isSynchRunning = _isSynchRunning;
  }

  private ch.ivyteam.ivy.application.IApplication application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivyteam.ivy.application.IApplication _application)
  {
    application = _application;
  }

}
