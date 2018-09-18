package ch.ivyteam.ivy.admin.tool.security.RoleUsers;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RoleUsersData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RoleUsersData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -276478192355227548L;

  private transient java.lang.Boolean administratable;

  /**
   * Gets the field administratable.
   * @return the value of the field administratable; may be null.
   */
  public java.lang.Boolean getAdministratable()
  {
    return administratable;
  }

  /**
   * Sets the field administratable.
   * @param _administratable the new value of the field administratable.
   */
  public void setAdministratable(java.lang.Boolean _administratable)
  {
    administratable = _administratable;
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

  private transient ch.ivyteam.ivy.security.IRole role;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> usersNotOwnRole;

  /**
   * Gets the field usersNotOwnRole.
   * @return the value of the field usersNotOwnRole; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getUsersNotOwnRole()
  {
    return usersNotOwnRole;
  }

  /**
   * Sets the field usersNotOwnRole.
   * @param _usersNotOwnRole the new value of the field usersNotOwnRole.
   */
  public void setUsersNotOwnRole(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _usersNotOwnRole)
  {
    usersNotOwnRole = _usersNotOwnRole;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> usersOwnRole;

  /**
   * Gets the field usersOwnRole.
   * @return the value of the field usersOwnRole; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getUsersOwnRole()
  {
    return usersOwnRole;
  }

  /**
   * Sets the field usersOwnRole.
   * @param _usersOwnRole the new value of the field usersOwnRole.
   */
  public void setUsersOwnRole(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _usersOwnRole)
  {
    usersOwnRole = _usersOwnRole;
  }

}
