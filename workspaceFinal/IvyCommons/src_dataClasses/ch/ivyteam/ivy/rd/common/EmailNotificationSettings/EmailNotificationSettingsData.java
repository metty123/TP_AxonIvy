package ch.ivyteam.ivy.rd.common.EmailNotificationSettings;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EmailNotificationSettingsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EmailNotificationSettingsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2575108376442736436L;

  /**
   * the settings to modify
   */
  private ch.ivyteam.ivy.security.IEMailNotificationSettings emailSettings;

  /**
   * Gets the field emailSettings.
   * @return the value of the field emailSettings; may be null.
   */
  public ch.ivyteam.ivy.security.IEMailNotificationSettings getEmailSettings()
  {
    return emailSettings;
  }

  /**
   * Sets the field emailSettings.
   * @param _emailSettings the new value of the field emailSettings.
   */
  public void setEmailSettings(ch.ivyteam.ivy.security.IEMailNotificationSettings _emailSettings)
  {
    emailSettings = _emailSettings;
  }

  /**
   * casted user email settings (if available)
   */
  private ch.ivyteam.ivy.security.IUserEMailNotificationSettings userEmailSettings;

  /**
   * Gets the field userEmailSettings.
   * @return the value of the field userEmailSettings; may be null.
   */
  public ch.ivyteam.ivy.security.IUserEMailNotificationSettings getUserEmailSettings()
  {
    return userEmailSettings;
  }

  /**
   * Sets the field userEmailSettings.
   * @param _userEmailSettings the new value of the field userEmailSettings.
   */
  public void setUserEmailSettings(ch.ivyteam.ivy.security.IUserEMailNotificationSettings _userEmailSettings)
  {
    userEmailSettings = _userEmailSettings;
  }

  /**
   * if true, then userEmailSettings may be accessed
   */
  private java.lang.Boolean isUserEmailSettings;

  /**
   * Gets the field isUserEmailSettings.
   * @return the value of the field isUserEmailSettings; may be null.
   */
  public java.lang.Boolean getIsUserEmailSettings()
  {
    return isUserEmailSettings;
  }

  /**
   * Sets the field isUserEmailSettings.
   * @param _isUserEmailSettings the new value of the field isUserEmailSettings.
   */
  public void setIsUserEmailSettings(java.lang.Boolean _isUserEmailSettings)
  {
    isUserEmailSettings = _isUserEmailSettings;
  }

  /**
   * the application default - DO NOT MODIFY
   */
  private ch.ivyteam.ivy.security.IEMailNotificationSettings applicationDefaultSettings;

  /**
   * Gets the field applicationDefaultSettings.
   * @return the value of the field applicationDefaultSettings; may be null.
   */
  public ch.ivyteam.ivy.security.IEMailNotificationSettings getApplicationDefaultSettings()
  {
    return applicationDefaultSettings;
  }

  /**
   * Sets the field applicationDefaultSettings.
   * @param _applicationDefaultSettings the new value of the field applicationDefaultSettings.
   */
  public void setApplicationDefaultSettings(ch.ivyteam.ivy.security.IEMailNotificationSettings _applicationDefaultSettings)
  {
    applicationDefaultSettings = _applicationDefaultSettings;
  }

  /**
   * the list of supported email lanugages
   */
  private ch.ivyteam.ivy.scripting.objects.List<java.util.Locale> emailLanguages;

  /**
   * Gets the field emailLanguages.
   * @return the value of the field emailLanguages; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.util.Locale> getEmailLanguages()
  {
    return emailLanguages;
  }

  /**
   * Sets the field emailLanguages.
   * @param _emailLanguages the new value of the field emailLanguages.
   */
  public void setEmailLanguages(ch.ivyteam.ivy.scripting.objects.List<java.util.Locale> _emailLanguages)
  {
    emailLanguages = _emailLanguages;
  }

  /**
   * the selected email language
   */
  private java.util.Locale selectedEmailLanguage;

  /**
   * Gets the field selectedEmailLanguage.
   * @return the value of the field selectedEmailLanguage; may be null.
   */
  public java.util.Locale getSelectedEmailLanguage()
  {
    return selectedEmailLanguage;
  }

  /**
   * Sets the field selectedEmailLanguage.
   * @param _selectedEmailLanguage the new value of the field selectedEmailLanguage.
   */
  public void setSelectedEmailLanguage(java.util.Locale _selectedEmailLanguage)
  {
    selectedEmailLanguage = _selectedEmailLanguage;
  }

  /**
   * the application default - DO NOT MODIFY
   */
  private java.util.Locale applicationDefaultLanguage;

  /**
   * Gets the field applicationDefaultLanguage.
   * @return the value of the field applicationDefaultLanguage; may be null.
   */
  public java.util.Locale getApplicationDefaultLanguage()
  {
    return applicationDefaultLanguage;
  }

  /**
   * Sets the field applicationDefaultLanguage.
   * @param _applicationDefaultLanguage the new value of the field applicationDefaultLanguage.
   */
  public void setApplicationDefaultLanguage(java.util.Locale _applicationDefaultLanguage)
  {
    applicationDefaultLanguage = _applicationDefaultLanguage;
  }

}
