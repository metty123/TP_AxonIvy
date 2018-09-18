package ch.ivyteam.ivy.admin.tool.webservice.WebServiceList;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class WebServiceListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class WebServiceListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5990828010947146598L;

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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IWebService> webServices;

  /**
   * Gets the field webServices.
   * @return the value of the field webServices; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IWebService> getWebServices()
  {
    return webServices;
  }

  /**
   * Sets the field webServices.
   * @param _webServices the new value of the field webServices.
   */
  public void setWebServices(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IWebService> _webServices)
  {
    webServices = _webServices;
  }

  private ch.ivyteam.ivy.application.restricted.IWebService currentSelectedWs;

  /**
   * Gets the field currentSelectedWs.
   * @return the value of the field currentSelectedWs; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IWebService getCurrentSelectedWs()
  {
    return currentSelectedWs;
  }

  /**
   * Sets the field currentSelectedWs.
   * @param _currentSelectedWs the new value of the field currentSelectedWs.
   */
  public void setCurrentSelectedWs(ch.ivyteam.ivy.application.restricted.IWebService _currentSelectedWs)
  {
    currentSelectedWs = _currentSelectedWs;
  }

  private java.lang.Boolean isFiltering;

  /**
   * Gets the field isFiltering.
   * @return the value of the field isFiltering; may be null.
   */
  public java.lang.Boolean getIsFiltering()
  {
    return isFiltering;
  }

  /**
   * Sets the field isFiltering.
   * @param _isFiltering the new value of the field isFiltering.
   */
  public void setIsFiltering(java.lang.Boolean _isFiltering)
  {
    isFiltering = _isFiltering;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IWebService> filteredWebServices;

  /**
   * Gets the field filteredWebServices.
   * @return the value of the field filteredWebServices; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IWebService> getFilteredWebServices()
  {
    return filteredWebServices;
  }

  /**
   * Sets the field filteredWebServices.
   * @param _filteredWebServices the new value of the field filteredWebServices.
   */
  public void setFilteredWebServices(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IWebService> _filteredWebServices)
  {
    filteredWebServices = _filteredWebServices;
  }

}
