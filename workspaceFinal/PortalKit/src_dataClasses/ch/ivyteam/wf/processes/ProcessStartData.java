package ch.ivyteam.wf.processes;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ProcessStartData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessStartData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8688888665582310289L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyApplication> applications;

  /**
   * Gets the field applications.
   * @return the value of the field applications; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyApplication> getApplications()
  {
    return applications;
  }

  /**
   * Sets the field applications.
   * @param _applications the new value of the field applications.
   */
  public void setApplications(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyApplication> _applications)
  {
    applications = _applications;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> apps;

  /**
   * Gets the field apps.
   * @return the value of the field apps; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getApps()
  {
    return apps;
  }

  /**
   * Sets the field apps.
   * @param _apps the new value of the field apps.
   */
  public void setApps(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _apps)
  {
    apps = _apps;
  }

  private transient java.lang.String endpoint;

  /**
   * Gets the field endpoint.
   * @return the value of the field endpoint; may be null.
   */
  public java.lang.String getEndpoint()
  {
    return endpoint;
  }

  /**
   * Sets the field endpoint.
   * @param _endpoint the new value of the field endpoint.
   */
  public void setEndpoint(java.lang.String _endpoint)
  {
    endpoint = _endpoint;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> errors;

  /**
   * Gets the field errors.
   * @return the value of the field errors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> getErrors()
  {
    return errors;
  }

  /**
   * Sets the field errors.
   * @param _errors the new value of the field errors.
   */
  public void setErrors(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> _errors)
  {
    errors = _errors;
  }

  private transient ch.ivy.ws.addon.WsException errorWs;

  /**
   * Gets the field errorWs.
   * @return the value of the field errorWs; may be null.
   */
  public ch.ivy.ws.addon.WsException getErrorWs()
  {
    return errorWs;
  }

  /**
   * Sets the field errorWs.
   * @param _errorWs the new value of the field errorWs.
   */
  public void setErrorWs(ch.ivy.ws.addon.WsException _errorWs)
  {
    errorWs = _errorWs;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyProcessStart> ivyProcessStarts;

  /**
   * Gets the field ivyProcessStarts.
   * @return the value of the field ivyProcessStarts; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyProcessStart> getIvyProcessStarts()
  {
    return ivyProcessStarts;
  }

  /**
   * Sets the field ivyProcessStarts.
   * @param _ivyProcessStarts the new value of the field ivyProcessStarts.
   */
  public void setIvyProcessStarts(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyProcessStart> _ivyProcessStarts)
  {
    ivyProcessStarts = _ivyProcessStarts;
  }

  private transient java.util.ListIterator listIterator;

  /**
   * Gets the field listIterator.
   * @return the value of the field listIterator; may be null.
   */
  public java.util.ListIterator getListIterator()
  {
    return listIterator;
  }

  /**
   * Sets the field listIterator.
   * @param _listIterator the new value of the field listIterator.
   */
  public void setListIterator(java.util.ListIterator _listIterator)
  {
    listIterator = _listIterator;
  }

  private transient ch.ivy.addon.portalkit.bo.PortalConfiguration portalConfig;

  /**
   * Gets the field portalConfig.
   * @return the value of the field portalConfig; may be null.
   */
  public ch.ivy.addon.portalkit.bo.PortalConfiguration getPortalConfig()
  {
    return portalConfig;
  }

  /**
   * Sets the field portalConfig.
   * @param _portalConfig the new value of the field portalConfig.
   */
  public void setPortalConfig(ch.ivy.addon.portalkit.bo.PortalConfiguration _portalConfig)
  {
    portalConfig = _portalConfig;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.IProcessStart> processStarts;

  /**
   * Gets the field processStarts.
   * @return the value of the field processStarts; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.IProcessStart> getProcessStarts()
  {
    return processStarts;
  }

  /**
   * Sets the field processStarts.
   * @param _processStarts the new value of the field processStarts.
   */
  public void setProcessStarts(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.workflow.IProcessStart> _processStarts)
  {
    processStarts = _processStarts;
  }

  private transient ch.ivy.addon.portalkit.persistence.domain.Server server;

  /**
   * Gets the field server.
   * @return the value of the field server; may be null.
   */
  public ch.ivy.addon.portalkit.persistence.domain.Server getServer()
  {
    return server;
  }

  /**
   * Sets the field server.
   * @param _server the new value of the field server.
   */
  public void setServer(ch.ivy.addon.portalkit.persistence.domain.Server _server)
  {
    server = _server;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> tempErrors;

  /**
   * Gets the field tempErrors.
   * @return the value of the field tempErrors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> getTempErrors()
  {
    return tempErrors;
  }

  /**
   * Sets the field tempErrors.
   * @param _tempErrors the new value of the field tempErrors.
   */
  public void setTempErrors(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.WsException> _tempErrors)
  {
    tempErrors = _tempErrors;
  }

  private transient ch.ivy.ws.addon.ProcessSearchCriteria processSearchCriteria;

  /**
   * Gets the field processSearchCriteria.
   * @return the value of the field processSearchCriteria; may be null.
   */
  public ch.ivy.ws.addon.ProcessSearchCriteria getProcessSearchCriteria()
  {
    return processSearchCriteria;
  }

  /**
   * Sets the field processSearchCriteria.
   * @param _processSearchCriteria the new value of the field processSearchCriteria.
   */
  public void setProcessSearchCriteria(ch.ivy.ws.addon.ProcessSearchCriteria _processSearchCriteria)
  {
    processSearchCriteria = _processSearchCriteria;
  }

  private transient java.lang.String language;

  /**
   * Gets the field language.
   * @return the value of the field language; may be null.
   */
  public java.lang.String getLanguage()
  {
    return language;
  }

  /**
   * Sets the field language.
   * @param _language the new value of the field language.
   */
  public void setLanguage(java.lang.String _language)
  {
    language = _language;
  }

  private transient java.lang.Boolean isMultiServer;

  /**
   * Gets the field isMultiServer.
   * @return the value of the field isMultiServer; may be null.
   */
  public java.lang.Boolean getIsMultiServer()
  {
    return isMultiServer;
  }

  /**
   * Sets the field isMultiServer.
   * @param _isMultiServer the new value of the field isMultiServer.
   */
  public void setIsMultiServer(java.lang.Boolean _isMultiServer)
  {
    isMultiServer = _isMultiServer;
  }

}
