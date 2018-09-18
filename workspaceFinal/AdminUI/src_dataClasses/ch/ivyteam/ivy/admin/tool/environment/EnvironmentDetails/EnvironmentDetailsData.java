package ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EnvironmentDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EnvironmentDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3777039531326801720L;

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

  private java.lang.Boolean createNew;

  /**
   * Gets the field createNew.
   * @return the value of the field createNew; may be null.
   */
  public java.lang.Boolean getCreateNew()
  {
    return createNew;
  }

  /**
   * Sets the field createNew.
   * @param _createNew the new value of the field createNew.
   */
  public void setCreateNew(java.lang.Boolean _createNew)
  {
    createNew = _createNew;
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

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> globalVariables;

  /**
   * Gets the field globalVariables.
   * @return the value of the field globalVariables; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> getGlobalVariables()
  {
    return globalVariables;
  }

  /**
   * Sets the field globalVariables.
   * @param _globalVariables the new value of the field globalVariables.
   */
  public void setGlobalVariables(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> _globalVariables)
  {
    globalVariables = _globalVariables;
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

  private java.lang.Number tempIdentifier;

  /**
   * Gets the field tempIdentifier.
   * @return the value of the field tempIdentifier; may be null.
   */
  public java.lang.Number getTempIdentifier()
  {
    return tempIdentifier;
  }

  /**
   * Sets the field tempIdentifier.
   * @param _tempIdentifier the new value of the field tempIdentifier.
   */
  public void setTempIdentifier(java.lang.Number _tempIdentifier)
  {
    tempIdentifier = _tempIdentifier;
  }

  private java.lang.String tempType;

  /**
   * Gets the field tempType.
   * @return the value of the field tempType; may be null.
   */
  public java.lang.String getTempType()
  {
    return tempType;
  }

  /**
   * Sets the field tempType.
   * @param _tempType the new value of the field tempType.
   */
  public void setTempType(java.lang.String _tempType)
  {
    tempType = _tempType;
  }

}
