package ch.ivyteam.ivy.admin.tool.security.Roles;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RolesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RolesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2158494461314591205L;

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

  private transient java.lang.Exception error;

  /**
   * Gets the field error.
   * @return the value of the field error; may be null.
   */
  public java.lang.Exception getError()
  {
    return error;
  }

  /**
   * Sets the field error.
   * @param _error the new value of the field error.
   */
  public void setError(java.lang.Exception _error)
  {
    error = _error;
  }

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

  private transient ch.ivyteam.ivy.security.IRole selectedRole;

  /**
   * Gets the field selectedRole.
   * @return the value of the field selectedRole; may be null.
   */
  public ch.ivyteam.ivy.security.IRole getSelectedRole()
  {
    return selectedRole;
  }

  /**
   * Sets the field selectedRole.
   * @param _selectedRole the new value of the field selectedRole.
   */
  public void setSelectedRole(ch.ivyteam.ivy.security.IRole _selectedRole)
  {
    selectedRole = _selectedRole;
  }

  private ch.ivyteam.ivy.admin.tool.role.Role role;

  /**
   * Gets the field role.
   * @return the value of the field role; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.role.Role getRole()
  {
    return role;
  }

  /**
   * Sets the field role.
   * @param _role the new value of the field role.
   */
  public void setRole(ch.ivyteam.ivy.admin.tool.role.Role _role)
  {
    role = _role;
  }

}
