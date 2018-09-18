package ch.ivyteam.ivy.admin.tool.webservice.WebServiceDetails;

/**
 * Data of web service details
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class WebServiceDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class WebServiceDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4426736644679857539L;

  private java.lang.String authenticationType;

  /**
   * Gets the field authenticationType.
   * @return the value of the field authenticationType; may be null.
   */
  public java.lang.String getAuthenticationType()
  {
    return authenticationType;
  }

  /**
   * Sets the field authenticationType.
   * @param _authenticationType the new value of the field authenticationType.
   */
  public void setAuthenticationType(java.lang.String _authenticationType)
  {
    authenticationType = _authenticationType;
  }

  private java.lang.String description;

  /**
   * Gets the field description.
   * @return the value of the field description; may be null.
   */
  public java.lang.String getDescription()
  {
    return description;
  }

  /**
   * Sets the field description.
   * @param _description the new value of the field description.
   */
  public void setDescription(java.lang.String _description)
  {
    description = _description;
  }

  /**
   * used to store title of an info/warning/error dialog
   */
  private transient java.lang.String dialogTitle;

  /**
   * Gets the field dialogTitle.
   * @return the value of the field dialogTitle; may be null.
   */
  public java.lang.String getDialogTitle()
  {
    return dialogTitle;
  }

  /**
   * Sets the field dialogTitle.
   * @param _dialogTitle the new value of the field dialogTitle.
   */
  public void setDialogTitle(java.lang.String _dialogTitle)
  {
    dialogTitle = _dialogTitle;
  }

  private java.lang.Boolean enableAuthentication;

  /**
   * Gets the field enableAuthentication.
   * @return the value of the field enableAuthentication; may be null.
   */
  public java.lang.Boolean getEnableAuthentication()
  {
    return enableAuthentication;
  }

  /**
   * Sets the field enableAuthentication.
   * @param _enableAuthentication the new value of the field enableAuthentication.
   */
  public void setEnableAuthentication(java.lang.Boolean _enableAuthentication)
  {
    enableAuthentication = _enableAuthentication;
  }

  private ch.ivyteam.ivy.application.restricted.IEnvironment environment;

  /**
   * Gets the field environment.
   * @return the value of the field environment; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IEnvironment getEnvironment()
  {
    return environment;
  }

  /**
   * Sets the field environment.
   * @param _environment the new value of the field environment.
   */
  public void setEnvironment(ch.ivyteam.ivy.application.restricted.IEnvironment _environment)
  {
    environment = _environment;
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

  private java.lang.Boolean isDefault;

  /**
   * Gets the field isDefault.
   * @return the value of the field isDefault; may be null.
   */
  public java.lang.Boolean getIsDefault()
  {
    return isDefault;
  }

  /**
   * Sets the field isDefault.
   * @param _isDefault the new value of the field isDefault.
   */
  public void setIsDefault(java.lang.Boolean _isDefault)
  {
    isDefault = _isDefault;
  }

  private java.lang.Boolean isDirtyData;

  /**
   * Gets the field isDirtyData.
   * @return the value of the field isDirtyData; may be null.
   */
  public java.lang.Boolean getIsDirtyData()
  {
    return isDirtyData;
  }

  /**
   * Sets the field isDirtyData.
   * @param _isDirtyData the new value of the field isDirtyData.
   */
  public void setIsDirtyData(java.lang.Boolean _isDirtyData)
  {
    isDirtyData = _isDirtyData;
  }

  /**
   * info/warning/error message that will be showed to user
   */
  private transient java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

  private java.lang.String name;

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

  private java.util.Map originalEndpointsMap;

  /**
   * Gets the field originalEndpointsMap.
   * @return the value of the field originalEndpointsMap; may be null.
   */
  public java.util.Map getOriginalEndpointsMap()
  {
    return originalEndpointsMap;
  }

  /**
   * Sets the field originalEndpointsMap.
   * @param _originalEndpointsMap the new value of the field originalEndpointsMap.
   */
  public void setOriginalEndpointsMap(java.util.Map _originalEndpointsMap)
  {
    originalEndpointsMap = _originalEndpointsMap;
  }

  private java.lang.String password;

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

  private java.lang.String pressedButton;

  /**
   * Gets the field pressedButton.
   * @return the value of the field pressedButton; may be null.
   */
  public java.lang.String getPressedButton()
  {
    return pressedButton;
  }

  /**
   * Sets the field pressedButton.
   * @param _pressedButton the new value of the field pressedButton.
   */
  public void setPressedButton(java.lang.String _pressedButton)
  {
    pressedButton = _pressedButton;
  }

  private ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint selectedEndpoint;

  /**
   * Gets the field selectedEndpoint.
   * @return the value of the field selectedEndpoint; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint getSelectedEndpoint()
  {
    return selectedEndpoint;
  }

  /**
   * Sets the field selectedEndpoint.
   * @param _selectedEndpoint the new value of the field selectedEndpoint.
   */
  public void setSelectedEndpoint(ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint _selectedEndpoint)
  {
    selectedEndpoint = _selectedEndpoint;
  }

  private ch.ivyteam.ivy.application.restricted.IWebServicePortType selectedPortType;

  /**
   * Gets the field selectedPortType.
   * @return the value of the field selectedPortType; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IWebServicePortType getSelectedPortType()
  {
    return selectedPortType;
  }

  /**
   * Sets the field selectedPortType.
   * @param _selectedPortType the new value of the field selectedPortType.
   */
  public void setSelectedPortType(ch.ivyteam.ivy.application.restricted.IWebServicePortType _selectedPortType)
  {
    selectedPortType = _selectedPortType;
  }

  private java.lang.Number sessionHandlingMode;

  /**
   * Gets the field sessionHandlingMode.
   * @return the value of the field sessionHandlingMode; may be null.
   */
  public java.lang.Number getSessionHandlingMode()
  {
    return sessionHandlingMode;
  }

  /**
   * Sets the field sessionHandlingMode.
   * @param _sessionHandlingMode the new value of the field sessionHandlingMode.
   */
  public void setSessionHandlingMode(java.lang.Number _sessionHandlingMode)
  {
    sessionHandlingMode = _sessionHandlingMode;
  }

  private java.lang.Boolean transportSession;

  /**
   * Gets the field transportSession.
   * @return the value of the field transportSession; may be null.
   */
  public java.lang.Boolean getTransportSession()
  {
    return transportSession;
  }

  /**
   * Sets the field transportSession.
   * @param _transportSession the new value of the field transportSession.
   */
  public void setTransportSession(java.lang.Boolean _transportSession)
  {
    transportSession = _transportSession;
  }

  private java.lang.String username;

  /**
   * Gets the field username.
   * @return the value of the field username; may be null.
   */
  public java.lang.String getUsername()
  {
    return username;
  }

  /**
   * Sets the field username.
   * @param _username the new value of the field username.
   */
  public void setUsername(java.lang.String _username)
  {
    username = _username;
  }

  private ch.ivyteam.ivy.application.restricted.IWebService webService;

  /**
   * Gets the field webService.
   * @return the value of the field webService; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IWebService getWebService()
  {
    return webService;
  }

  /**
   * Sets the field webService.
   * @param _webService the new value of the field webService.
   */
  public void setWebService(ch.ivyteam.ivy.application.restricted.IWebService _webService)
  {
    webService = _webService;
  }

  private ch.ivyteam.ivy.scripting.objects.Tree webServiceEndpointsTree;

  /**
   * Gets the field webServiceEndpointsTree.
   * @return the value of the field webServiceEndpointsTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getWebServiceEndpointsTree()
  {
    return webServiceEndpointsTree;
  }

  /**
   * Sets the field webServiceEndpointsTree.
   * @param _webServiceEndpointsTree the new value of the field webServiceEndpointsTree.
   */
  public void setWebServiceEndpointsTree(ch.ivyteam.ivy.scripting.objects.Tree _webServiceEndpointsTree)
  {
    webServiceEndpointsTree = _webServiceEndpointsTree;
  }

  private java.lang.String domain;

  /**
   * Gets the field domain.
   * @return the value of the field domain; may be null.
   */
  public java.lang.String getDomain()
  {
    return domain;
  }

  /**
   * Sets the field domain.
   * @param _domain the new value of the field domain.
   */
  public void setDomain(java.lang.String _domain)
  {
    domain = _domain;
  }

  private java.lang.String host;

  /**
   * Gets the field host.
   * @return the value of the field host; may be null.
   */
  public java.lang.String getHost()
  {
    return host;
  }

  /**
   * Sets the field host.
   * @param _host the new value of the field host.
   */
  public void setHost(java.lang.String _host)
  {
    host = _host;
  }

}
