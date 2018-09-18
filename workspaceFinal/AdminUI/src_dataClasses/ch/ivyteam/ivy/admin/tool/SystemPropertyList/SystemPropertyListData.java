package ch.ivyteam.ivy.admin.tool.SystemPropertyList;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SystemPropertyListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SystemPropertyListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2740090265839493123L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.system.ISystemProperty> properties;

  /**
   * Gets the field properties.
   * @return the value of the field properties; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.system.ISystemProperty> getProperties()
  {
    return properties;
  }

  /**
   * Sets the field properties.
   * @param _properties the new value of the field properties.
   */
  public void setProperties(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.system.ISystemProperty> _properties)
  {
    properties = _properties;
  }

  private transient ch.ivyteam.ivy.system.ISystemProperty selectedProperty;

  /**
   * Gets the field selectedProperty.
   * @return the value of the field selectedProperty; may be null.
   */
  public ch.ivyteam.ivy.system.ISystemProperty getSelectedProperty()
  {
    return selectedProperty;
  }

  /**
   * Sets the field selectedProperty.
   * @param _selectedProperty the new value of the field selectedProperty.
   */
  public void setSelectedProperty(ch.ivyteam.ivy.system.ISystemProperty _selectedProperty)
  {
    selectedProperty = _selectedProperty;
  }

  private transient ch.ivyteam.ivy.application.ISystemPropertyProvider propertyProvider;

  /**
   * Gets the field propertyProvider.
   * @return the value of the field propertyProvider; may be null.
   */
  public ch.ivyteam.ivy.application.ISystemPropertyProvider getPropertyProvider()
  {
    return propertyProvider;
  }

  /**
   * Sets the field propertyProvider.
   * @param _propertyProvider the new value of the field propertyProvider.
   */
  public void setPropertyProvider(ch.ivyteam.ivy.application.ISystemPropertyProvider _propertyProvider)
  {
    propertyProvider = _propertyProvider;
  }

}
