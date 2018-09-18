package ch.ivyteam.ivy.admin.tool.security.User;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UserData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4830609546068699992L;

  private java.lang.String confirmPassword;

  /**
   * Gets the field confirmPassword.
   * @return the value of the field confirmPassword; may be null.
   */
  public java.lang.String getConfirmPassword()
  {
    return confirmPassword;
  }

  /**
   * Sets the field confirmPassword.
   * @param _confirmPassword the new value of the field confirmPassword.
   */
  public void setConfirmPassword(java.lang.String _confirmPassword)
  {
    confirmPassword = _confirmPassword;
  }

  private transient java.lang.String eMailAddress;

  /**
   * Gets the field eMailAddress.
   * @return the value of the field eMailAddress; may be null.
   */
  public java.lang.String getEMailAddress()
  {
    return eMailAddress;
  }

  /**
   * Sets the field eMailAddress.
   * @param _eMailAddress the new value of the field eMailAddress.
   */
  public void setEMailAddress(java.lang.String _eMailAddress)
  {
    eMailAddress = _eMailAddress;
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

  private transient java.lang.String fullName;

  /**
   * Gets the field fullName.
   * @return the value of the field fullName; may be null.
   */
  public java.lang.String getFullName()
  {
    return fullName;
  }

  /**
   * Sets the field fullName.
   * @param _fullName the new value of the field fullName.
   */
  public void setFullName(java.lang.String _fullName)
  {
    fullName = _fullName;
  }

  private java.lang.Boolean hasPasswordChanged;

  /**
   * Gets the field hasPasswordChanged.
   * @return the value of the field hasPasswordChanged; may be null.
   */
  public java.lang.Boolean getHasPasswordChanged()
  {
    return hasPasswordChanged;
  }

  /**
   * Sets the field hasPasswordChanged.
   * @param _hasPasswordChanged the new value of the field hasPasswordChanged.
   */
  public void setHasPasswordChanged(java.lang.Boolean _hasPasswordChanged)
  {
    hasPasswordChanged = _hasPasswordChanged;
  }

  private transient java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private transient java.lang.String password;

  /**
   * Gets the field password.
   * @return the value of the field password; may be null.
   */
  public java.lang.String getPassword()
  {
    return password;
  }

  /**
   * Sets the field password.
   * @param _password the new value of the field password.
   */
  public void setPassword(java.lang.String _password)
  {
    password = _password;
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

  private transient ch.ivyteam.ivy.security.IUser user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(ch.ivyteam.ivy.security.IUser _user)
  {
    user = _user;
  }

  private transient java.lang.String validationError;

  /**
   * Gets the field validationError.
   * @return the value of the field validationError; may be null.
   */
  public java.lang.String getValidationError()
  {
    return validationError;
  }

  /**
   * Sets the field validationError.
   * @param _validationError the new value of the field validationError.
   */
  public void setValidationError(java.lang.String _validationError)
  {
    validationError = _validationError;
  }

}
