package ch.ivyteam.ivy.admin.tool.security.Role;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RoleData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RoleData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3530153777030425761L;

  private ch.ivyteam.ivy.security.IRole role;

  /**
   * Gets the field role.
   * @return the value of the field role; may be null.
   */
  public ch.ivyteam.ivy.security.IRole getRole()
  {
    return role;
  }

  /**
   * Sets the field role.
   * @param _role the new value of the field role.
   */
  public void setRole(ch.ivyteam.ivy.security.IRole _role)
  {
    role = _role;
  }

  private ch.ivyteam.naming.JndiConfig jndiConfig;

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

  private java.lang.String externalSecurityName;

  /**
   * Gets the field externalSecurityName.
   * @return the value of the field externalSecurityName; may be null.
   */
  public java.lang.String getExternalSecurityName()
  {
    return externalSecurityName;
  }

  /**
   * Sets the field externalSecurityName.
   * @param _externalSecurityName the new value of the field externalSecurityName.
   */
  public void setExternalSecurityName(java.lang.String _externalSecurityName)
  {
    externalSecurityName = _externalSecurityName;
  }

  private java.lang.Exception error;

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

}
