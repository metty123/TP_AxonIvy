package ch.ivyteam.ivy.admin.tool.ConfigurationProperties;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ConfigurationPropertiesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ConfigurationPropertiesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4843787931160256509L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.system.IProperty> properties;

  /**
   * Gets the field properties.
   * @return the value of the field properties; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.system.IProperty> getProperties()
  {
    return properties;
  }

  /**
   * Sets the field properties.
   * @param _properties the new value of the field properties.
   */
  public void setProperties(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.system.IProperty> _properties)
  {
    properties = _properties;
  }

  private transient ch.ivyteam.ivy.system.IProperty selectedProperty;

  /**
   * Gets the field selectedProperty.
   * @return the value of the field selectedProperty; may be null.
   */
  public ch.ivyteam.ivy.system.IProperty getSelectedProperty()
  {
    return selectedProperty;
  }

  /**
   * Sets the field selectedProperty.
   * @param _selectedProperty the new value of the field selectedProperty.
   */
  public void setSelectedProperty(ch.ivyteam.ivy.system.IProperty _selectedProperty)
  {
    selectedProperty = _selectedProperty;
  }

  private transient ch.ivyteam.ivy.system.IConfigurationPropertyProvider propertyProvider;

  /**
   * Gets the field propertyProvider.
   * @return the value of the field propertyProvider; may be null.
   */
  public ch.ivyteam.ivy.system.IConfigurationPropertyProvider getPropertyProvider()
  {
    return propertyProvider;
  }

  /**
   * Sets the field propertyProvider.
   * @param _propertyProvider the new value of the field propertyProvider.
   */
  public void setPropertyProvider(ch.ivyteam.ivy.system.IConfigurationPropertyProvider _propertyProvider)
  {
    propertyProvider = _propertyProvider;
  }

}
