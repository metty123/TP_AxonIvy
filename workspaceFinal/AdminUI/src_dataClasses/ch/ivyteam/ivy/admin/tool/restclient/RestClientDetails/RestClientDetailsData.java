package ch.ivyteam.ivy.admin.tool.restclient.RestClientDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RestClientDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RestClientDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2061019376952845983L;

  private ch.ivyteam.ivy.admin.tool.restclient.RestClientDTO restClient;

  /**
   * Gets the field restClient.
   * @return the value of the field restClient; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.restclient.RestClientDTO getRestClient()
  {
    return restClient;
  }

  /**
   * Sets the field restClient.
   * @param _restClient the new value of the field restClient.
   */
  public void setRestClient(ch.ivyteam.ivy.admin.tool.restclient.RestClientDTO _restClient)
  {
    restClient = _restClient;
  }

  private ch.ivyteam.ivy.application.restricted.rest.IRestClient orginalRestClient;

  /**
   * Gets the field orginalRestClient.
   * @return the value of the field orginalRestClient; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.rest.IRestClient getOrginalRestClient()
  {
    return orginalRestClient;
  }

  /**
   * Sets the field orginalRestClient.
   * @param _orginalRestClient the new value of the field orginalRestClient.
   */
  public void setOrginalRestClient(ch.ivyteam.ivy.application.restricted.rest.IRestClient _orginalRestClient)
  {
    orginalRestClient = _orginalRestClient;
  }

  private java.lang.Boolean isEnvironmentRestClient;

  /**
   * Gets the field isEnvironmentRestClient.
   * @return the value of the field isEnvironmentRestClient; may be null.
   */
  public java.lang.Boolean getIsEnvironmentRestClient()
  {
    return isEnvironmentRestClient;
  }

  /**
   * Sets the field isEnvironmentRestClient.
   * @param _isEnvironmentRestClient the new value of the field isEnvironmentRestClient.
   */
  public void setIsEnvironmentRestClient(java.lang.Boolean _isEnvironmentRestClient)
  {
    isEnvironmentRestClient = _isEnvironmentRestClient;
  }

  private ch.ivyteam.ivy.application.restricted.rest.IRestClient defaultRestClient;

  /**
   * Gets the field defaultRestClient.
   * @return the value of the field defaultRestClient; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.rest.IRestClient getDefaultRestClient()
  {
    return defaultRestClient;
  }

  /**
   * Sets the field defaultRestClient.
   * @param _defaultRestClient the new value of the field defaultRestClient.
   */
  public void setDefaultRestClient(ch.ivyteam.ivy.application.restricted.rest.IRestClient _defaultRestClient)
  {
    defaultRestClient = _defaultRestClient;
  }

  private java.lang.String pressButtonValue;

  /**
   * Gets the field pressButtonValue.
   * @return the value of the field pressButtonValue; may be null.
   */
  public java.lang.String getPressButtonValue()
  {
    return pressButtonValue;
  }

  /**
   * Sets the field pressButtonValue.
   * @param _pressButtonValue the new value of the field pressButtonValue.
   */
  public void setPressButtonValue(java.lang.String _pressButtonValue)
  {
    pressButtonValue = _pressButtonValue;
  }

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

  private java.lang.Boolean isInitialRestClient;

  /**
   * Gets the field isInitialRestClient.
   * @return the value of the field isInitialRestClient; may be null.
   */
  public java.lang.Boolean getIsInitialRestClient()
  {
    return isInitialRestClient;
  }

  /**
   * Sets the field isInitialRestClient.
   * @param _isInitialRestClient the new value of the field isInitialRestClient.
   */
  public void setIsInitialRestClient(java.lang.Boolean _isInitialRestClient)
  {
    isInitialRestClient = _isInitialRestClient;
  }

  private java.lang.String newlyInputPropertyValue;

  /**
   * Gets the field newlyInputPropertyValue.
   * @return the value of the field newlyInputPropertyValue; may be null.
   */
  public java.lang.String getNewlyInputPropertyValue()
  {
    return newlyInputPropertyValue;
  }

  /**
   * Sets the field newlyInputPropertyValue.
   * @param _newlyInputPropertyValue the new value of the field newlyInputPropertyValue.
   */
  public void setNewlyInputPropertyValue(java.lang.String _newlyInputPropertyValue)
  {
    newlyInputPropertyValue = _newlyInputPropertyValue;
  }

}
