package ch.ivyteam.ivy.admin.tool.JndiSecuritySystem;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class JndiSecuritySystemData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class JndiSecuritySystemData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3610411598632401174L;

  private transient java.lang.String authenticationKind;

  /**
   * Gets the field authenticationKind.
   * @return the value of the field authenticationKind; may be null.
   */
  public java.lang.String getAuthenticationKind()
  {
    return authenticationKind;
  }

  /**
   * Sets the field authenticationKind.
   * @param _authenticationKind the new value of the field authenticationKind.
   */
  public void setAuthenticationKind(java.lang.String _authenticationKind)
  {
    authenticationKind = _authenticationKind;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> authenticationKinds;

  /**
   * Gets the field authenticationKinds.
   * @return the value of the field authenticationKinds; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getAuthenticationKinds()
  {
    return authenticationKinds;
  }

  /**
   * Sets the field authenticationKinds.
   * @param _authenticationKinds the new value of the field authenticationKinds.
   */
  public void setAuthenticationKinds(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _authenticationKinds)
  {
    authenticationKinds = _authenticationKinds;
  }

  private transient java.lang.Boolean doNotUseUserGroupImport;

  /**
   * Gets the field doNotUseUserGroupImport.
   * @return the value of the field doNotUseUserGroupImport; may be null.
   */
  public java.lang.Boolean getDoNotUseUserGroupImport()
  {
    return doNotUseUserGroupImport;
  }

  /**
   * Sets the field doNotUseUserGroupImport.
   * @param _doNotUseUserGroupImport the new value of the field doNotUseUserGroupImport.
   */
  public void setDoNotUseUserGroupImport(java.lang.Boolean _doNotUseUserGroupImport)
  {
    doNotUseUserGroupImport = _doNotUseUserGroupImport;
  }

  private transient javax.naming.NamingException error;

  /**
   * Gets the field error.
   * @return the value of the field error; may be null.
   */
  public javax.naming.NamingException getError()
  {
    return error;
  }

  /**
   * Sets the field error.
   * @param _error the new value of the field error.
   */
  public void setError(javax.naming.NamingException _error)
  {
    error = _error;
  }

  /**
   * error msg display to user
   */
  private transient java.lang.String errorMsg;

  /**
   * Gets the field errorMsg.
   * @return the value of the field errorMsg; may be null.
   */
  public java.lang.String getErrorMsg()
  {
    return errorMsg;
  }

  /**
   * Sets the field errorMsg.
   * @param _errorMsg the new value of the field errorMsg.
   */
  public void setErrorMsg(java.lang.String _errorMsg)
  {
    errorMsg = _errorMsg;
  }

  private java.lang.Boolean hasDataChanged;

  /**
   * Gets the field hasDataChanged.
   * @return the value of the field hasDataChanged; may be null.
   */
  public java.lang.Boolean getHasDataChanged()
  {
    return hasDataChanged;
  }

  /**
   * Sets the field hasDataChanged.
   * @param _hasDataChanged the new value of the field hasDataChanged.
   */
  public void setHasDataChanged(java.lang.Boolean _hasDataChanged)
  {
    hasDataChanged = _hasDataChanged;
  }

  private transient java.lang.String host;

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

  private transient java.lang.String importContext;

  /**
   * Gets the field importContext.
   * @return the value of the field importContext; may be null.
   */
  public java.lang.String getImportContext()
  {
    return importContext;
  }

  /**
   * Sets the field importContext.
   * @param _importContext the new value of the field importContext.
   */
  public void setImportContext(java.lang.String _importContext)
  {
    importContext = _importContext;
  }

  private transient java.lang.String importUserFilter;

  /**
   * Gets the field importUserFilter.
   * @return the value of the field importUserFilter; may be null.
   */
  public java.lang.String getImportUserFilter()
  {
    return importUserFilter;
  }

  /**
   * Sets the field importUserFilter.
   * @param _importUserFilter the new value of the field importUserFilter.
   */
  public void setImportUserFilter(java.lang.String _importUserFilter)
  {
    importUserFilter = _importUserFilter;
  }

  private transient java.lang.String importUserGroup;

  /**
   * Gets the field importUserGroup.
   * @return the value of the field importUserGroup; may be null.
   */
  public java.lang.String getImportUserGroup()
  {
    return importUserGroup;
  }

  /**
   * Sets the field importUserGroup.
   * @param _importUserGroup the new value of the field importUserGroup.
   */
  public void setImportUserGroup(java.lang.String _importUserGroup)
  {
    importUserGroup = _importUserGroup;
  }

  private transient java.lang.Boolean isUserFilterCorrect;

  /**
   * Gets the field isUserFilterCorrect.
   * @return the value of the field isUserFilterCorrect; may be null.
   */
  public java.lang.Boolean getIsUserFilterCorrect()
  {
    return isUserFilterCorrect;
  }

  /**
   * Sets the field isUserFilterCorrect.
   * @param _isUserFilterCorrect the new value of the field isUserFilterCorrect.
   */
  public void setIsUserFilterCorrect(java.lang.Boolean _isUserFilterCorrect)
  {
    isUserFilterCorrect = _isUserFilterCorrect;
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

  private transient java.lang.Number port;

  /**
   * Gets the field port.
   * @return the value of the field port; may be null.
   */
  public java.lang.Number getPort()
  {
    return port;
  }

  /**
   * Sets the field port.
   * @param _port the new value of the field port.
   */
  public void setPort(java.lang.Number _port)
  {
    port = _port;
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

  private transient java.lang.Number synchronizationTime;

  /**
   * Gets the field synchronizationTime.
   * @return the value of the field synchronizationTime; may be null.
   */
  public java.lang.Number getSynchronizationTime()
  {
    return synchronizationTime;
  }

  /**
   * Sets the field synchronizationTime.
   * @param _synchronizationTime the new value of the field synchronizationTime.
   */
  public void setSynchronizationTime(java.lang.Number _synchronizationTime)
  {
    synchronizationTime = _synchronizationTime;
  }

  private transient java.lang.Boolean useDefaultPort;

  /**
   * Gets the field useDefaultPort.
   * @return the value of the field useDefaultPort; may be null.
   */
  public java.lang.Boolean getUseDefaultPort()
  {
    return useDefaultPort;
  }

  /**
   * Sets the field useDefaultPort.
   * @param _useDefaultPort the new value of the field useDefaultPort.
   */
  public void setUseDefaultPort(java.lang.Boolean _useDefaultPort)
  {
    useDefaultPort = _useDefaultPort;
  }

  private transient java.lang.Boolean useLdapConnectionPool;

  /**
   * Gets the field useLdapConnectionPool.
   * @return the value of the field useLdapConnectionPool; may be null.
   */
  public java.lang.Boolean getUseLdapConnectionPool()
  {
    return useLdapConnectionPool;
  }

  /**
   * Sets the field useLdapConnectionPool.
   * @param _useLdapConnectionPool the new value of the field useLdapConnectionPool.
   */
  public void setUseLdapConnectionPool(java.lang.Boolean _useLdapConnectionPool)
  {
    useLdapConnectionPool = _useLdapConnectionPool;
  }

  private transient java.lang.String user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public java.lang.String getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(java.lang.String _user)
  {
    user = _user;
  }

  private transient java.lang.Boolean useSsl;

  /**
   * Gets the field useSsl.
   * @return the value of the field useSsl; may be null.
   */
  public java.lang.Boolean getUseSsl()
  {
    return useSsl;
  }

  /**
   * Sets the field useSsl.
   * @param _useSsl the new value of the field useSsl.
   */
  public void setUseSsl(java.lang.Boolean _useSsl)
  {
    useSsl = _useSsl;
  }

}
