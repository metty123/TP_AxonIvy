package ch.ivyteam.ivy.admin.tool.restclient.RestClients;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RestClientsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RestClientsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3310394634624289327L;

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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> defaultRestClientItems;

  /**
   * Gets the field defaultRestClientItems.
   * @return the value of the field defaultRestClientItems; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> getDefaultRestClientItems()
  {
    return defaultRestClientItems;
  }

  /**
   * Sets the field defaultRestClientItems.
   * @param _defaultRestClientItems the new value of the field defaultRestClientItems.
   */
  public void setDefaultRestClientItems(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> _defaultRestClientItems)
  {
    defaultRestClientItems = _defaultRestClientItems;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> environmentRestClientItems;

  /**
   * Gets the field environmentRestClientItems.
   * @return the value of the field environmentRestClientItems; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> getEnvironmentRestClientItems()
  {
    return environmentRestClientItems;
  }

  /**
   * Sets the field environmentRestClientItems.
   * @param _environmentRestClientItems the new value of the field environmentRestClientItems.
   */
  public void setEnvironmentRestClientItems(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> _environmentRestClientItems)
  {
    environmentRestClientItems = _environmentRestClientItems;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> restClientItems;

  /**
   * Gets the field restClientItems.
   * @return the value of the field restClientItems; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> getRestClientItems()
  {
    return restClientItems;
  }

  /**
   * Sets the field restClientItems.
   * @param _restClientItems the new value of the field restClientItems.
   */
  public void setRestClientItems(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> _restClientItems)
  {
    restClientItems = _restClientItems;
  }

  private ch.ivyteam.ivy.admin.tool.restclient.RestClientItem selectedRestClientItem;

  /**
   * Gets the field selectedRestClientItem.
   * @return the value of the field selectedRestClientItem; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.restclient.RestClientItem getSelectedRestClientItem()
  {
    return selectedRestClientItem;
  }

  /**
   * Sets the field selectedRestClientItem.
   * @param _selectedRestClientItem the new value of the field selectedRestClientItem.
   */
  public void setSelectedRestClientItem(ch.ivyteam.ivy.admin.tool.restclient.RestClientItem _selectedRestClientItem)
  {
    selectedRestClientItem = _selectedRestClientItem;
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

  private java.lang.Boolean isFilterting;

  /**
   * Gets the field isFilterting.
   * @return the value of the field isFilterting; may be null.
   */
  public java.lang.Boolean getIsFilterting()
  {
    return isFilterting;
  }

  /**
   * Sets the field isFilterting.
   * @param _isFilterting the new value of the field isFilterting.
   */
  public void setIsFilterting(java.lang.Boolean _isFilterting)
  {
    isFilterting = _isFilterting;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> filteredRestClientItems;

  /**
   * Gets the field filteredRestClientItems.
   * @return the value of the field filteredRestClientItems; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> getFilteredRestClientItems()
  {
    return filteredRestClientItems;
  }

  /**
   * Sets the field filteredRestClientItems.
   * @param _filteredRestClientItems the new value of the field filteredRestClientItems.
   */
  public void setFilteredRestClientItems(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.restclient.RestClientItem> _filteredRestClientItems)
  {
    filteredRestClientItems = _filteredRestClientItems;
  }

}
