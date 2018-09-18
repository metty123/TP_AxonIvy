package ch.ivyteam.ivy.admin.tool.security.UserProperties;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UserPropertiesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserPropertiesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7881362890029728846L;

  private transient ch.ivyteam.ivy.security.IUser user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(ch.ivyteam.ivy.security.IUser _user)
  {
    user = _user;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.Property> properties;

  /**
   * Gets the field properties.
   * @return the value of the field properties; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.Property> getProperties()
  {
    return properties;
  }

  /**
   * Sets the field properties.
   * @param _properties the new value of the field properties.
   */
  public void setProperties(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.Property> _properties)
  {
    properties = _properties;
  }

  private transient ch.ivyteam.ivy.rd.common.Property selectedProperty;

  /**
   * Gets the field selectedProperty.
   * @return the value of the field selectedProperty; may be null.
   */
  public ch.ivyteam.ivy.rd.common.Property getSelectedProperty()
  {
    return selectedProperty;
  }

  /**
   * Sets the field selectedProperty.
   * @param _selectedProperty the new value of the field selectedProperty.
   */
  public void setSelectedProperty(ch.ivyteam.ivy.rd.common.Property _selectedProperty)
  {
    selectedProperty = _selectedProperty;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> deletionFailed;

  /**
   * Gets the field deletionFailed.
   * @return the value of the field deletionFailed; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getDeletionFailed()
  {
    return deletionFailed;
  }

  /**
   * Sets the field deletionFailed.
   * @param _deletionFailed the new value of the field deletionFailed.
   */
  public void setDeletionFailed(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _deletionFailed)
  {
    deletionFailed = _deletionFailed;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> editingFailed;

  /**
   * Gets the field editingFailed.
   * @return the value of the field editingFailed; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getEditingFailed()
  {
    return editingFailed;
  }

  /**
   * Sets the field editingFailed.
   * @param _editingFailed the new value of the field editingFailed.
   */
  public void setEditingFailed(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _editingFailed)
  {
    editingFailed = _editingFailed;
  }

}
