package ch.ivyteam.ivy.commondialogs.LoginDialog;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LoginDialogData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LoginDialogData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2783057814719006920L;

  private transient java.lang.String userName;

  /**
   * Gets the field userName.
   * @return the value of the field userName; may be null.
   */
  public java.lang.String getUserName()
  {
    return userName;
  }

  /**
   * Sets the field userName.
   * @param _userName the new value of the field userName.
   */
  public void setUserName(java.lang.String _userName)
  {
    userName = _userName;
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

  private transient ch.ivyteam.ivy.security.AuthenticationException error;

  /**
   * Gets the field error.
   * @return the value of the field error; may be null.
   */
  public ch.ivyteam.ivy.security.AuthenticationException getError()
  {
    return error;
  }

  /**
   * Sets the field error.
   * @param _error the new value of the field error.
   */
  public void setError(ch.ivyteam.ivy.security.AuthenticationException _error)
  {
    error = _error;
  }

  private transient java.lang.Boolean successful;

  /**
   * Gets the field successful.
   * @return the value of the field successful; may be null.
   */
  public java.lang.Boolean getSuccessful()
  {
    return successful;
  }

  /**
   * Sets the field successful.
   * @param _successful the new value of the field successful.
   */
  public void setSuccessful(java.lang.Boolean _successful)
  {
    successful = _successful;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.util.Locale> supportedLanguagesList;

  /**
   * Gets the field supportedLanguagesList.
   * @return the value of the field supportedLanguagesList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.util.Locale> getSupportedLanguagesList()
  {
    return supportedLanguagesList;
  }

  /**
   * Sets the field supportedLanguagesList.
   * @param _supportedLanguagesList the new value of the field supportedLanguagesList.
   */
  public void setSupportedLanguagesList(ch.ivyteam.ivy.scripting.objects.List<java.util.Locale> _supportedLanguagesList)
  {
    supportedLanguagesList = _supportedLanguagesList;
  }

  private transient java.lang.Number prefferedUserSessionLanguageIndex;

  /**
   * Gets the field prefferedUserSessionLanguageIndex.
   * @return the value of the field prefferedUserSessionLanguageIndex; may be null.
   */
  public java.lang.Number getPrefferedUserSessionLanguageIndex()
  {
    return prefferedUserSessionLanguageIndex;
  }

  /**
   * Sets the field prefferedUserSessionLanguageIndex.
   * @param _prefferedUserSessionLanguageIndex the new value of the field prefferedUserSessionLanguageIndex.
   */
  public void setPrefferedUserSessionLanguageIndex(java.lang.Number _prefferedUserSessionLanguageIndex)
  {
    prefferedUserSessionLanguageIndex = _prefferedUserSessionLanguageIndex;
  }

  private transient java.lang.Boolean sessionLanguageSelectionVisible;

  /**
   * Gets the field sessionLanguageSelectionVisible.
   * @return the value of the field sessionLanguageSelectionVisible; may be null.
   */
  public java.lang.Boolean getSessionLanguageSelectionVisible()
  {
    return sessionLanguageSelectionVisible;
  }

  /**
   * Sets the field sessionLanguageSelectionVisible.
   * @param _sessionLanguageSelectionVisible the new value of the field sessionLanguageSelectionVisible.
   */
  public void setSessionLanguageSelectionVisible(java.lang.Boolean _sessionLanguageSelectionVisible)
  {
    sessionLanguageSelectionVisible = _sessionLanguageSelectionVisible;
  }

  /**
   * The list of environments that the end user is allowed to use as it's "session active environment". The list of environments comes from the user's property value.
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> allowedEnvironments;

  /**
   * Gets the field allowedEnvironments.
   * @return the value of the field allowedEnvironments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getAllowedEnvironments()
  {
    return allowedEnvironments;
  }

  /**
   * Sets the field allowedEnvironments.
   * @param _allowedEnvironments the new value of the field allowedEnvironments.
   */
  public void setAllowedEnvironments(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _allowedEnvironments)
  {
    allowedEnvironments = _allowedEnvironments;
  }

  /**
   * The environment that user selected on the ui. It will be used as his "session active environment".
   */
  private transient java.lang.Number selectedEnvironmentIndex;

  /**
   * Gets the field selectedEnvironmentIndex.
   * @return the value of the field selectedEnvironmentIndex; may be null.
   */
  public java.lang.Number getSelectedEnvironmentIndex()
  {
    return selectedEnvironmentIndex;
  }

  /**
   * Sets the field selectedEnvironmentIndex.
   * @param _selectedEnvironmentIndex the new value of the field selectedEnvironmentIndex.
   */
  public void setSelectedEnvironmentIndex(java.lang.Number _selectedEnvironmentIndex)
  {
    selectedEnvironmentIndex = _selectedEnvironmentIndex;
  }

  /**
   * If true then the list of allowed environments is displayed on the ui.
   */
  private transient java.lang.Boolean allowedEnvironmentsSelectionVisible;

  /**
   * Gets the field allowedEnvironmentsSelectionVisible.
   * @return the value of the field allowedEnvironmentsSelectionVisible; may be null.
   */
  public java.lang.Boolean getAllowedEnvironmentsSelectionVisible()
  {
    return allowedEnvironmentsSelectionVisible;
  }

  /**
   * Sets the field allowedEnvironmentsSelectionVisible.
   * @param _allowedEnvironmentsSelectionVisible the new value of the field allowedEnvironmentsSelectionVisible.
   */
  public void setAllowedEnvironmentsSelectionVisible(java.lang.Boolean _allowedEnvironmentsSelectionVisible)
  {
    allowedEnvironmentsSelectionVisible = _allowedEnvironmentsSelectionVisible;
  }

  /**
   * The exception catched during the session.setActiveEnvironment Public API call
   */
  private transient java.lang.Exception setActiveEnvironmentException;

  /**
   * Gets the field setActiveEnvironmentException.
   * @return the value of the field setActiveEnvironmentException; may be null.
   */
  public java.lang.Exception getSetActiveEnvironmentException()
  {
    return setActiveEnvironmentException;
  }

  /**
   * Sets the field setActiveEnvironmentException.
   * @param _setActiveEnvironmentException the new value of the field setActiveEnvironmentException.
   */
  public void setSetActiveEnvironmentException(java.lang.Exception _setActiveEnvironmentException)
  {
    setActiveEnvironmentException = _setActiveEnvironmentException;
  }

}
