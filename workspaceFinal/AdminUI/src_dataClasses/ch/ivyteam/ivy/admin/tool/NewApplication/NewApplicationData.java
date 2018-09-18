package ch.ivyteam.ivy.admin.tool.NewApplication;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class NewApplicationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class NewApplicationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5559440200154736180L;

  private transient ch.ivyteam.ivy.application.IApplication application;

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

  private transient java.lang.Boolean createAddonsProject;

  /**
   * Gets the field createAddonsProject.
   * @return the value of the field createAddonsProject; may be null.
   */
  public java.lang.Boolean getCreateAddonsProject()
  {
    return createAddonsProject;
  }

  /**
   * Sets the field createAddonsProject.
   * @param _createAddonsProject the new value of the field createAddonsProject.
   */
  public void setCreateAddonsProject(java.lang.Boolean _createAddonsProject)
  {
    createAddonsProject = _createAddonsProject;
  }

  private transient java.lang.Boolean createWfUiHtmlProject;

  /**
   * Gets the field createWfUiHtmlProject.
   * @return the value of the field createWfUiHtmlProject; may be null.
   */
  public java.lang.Boolean getCreateWfUiHtmlProject()
  {
    return createWfUiHtmlProject;
  }

  /**
   * Sets the field createWfUiHtmlProject.
   * @param _createWfUiHtmlProject the new value of the field createWfUiHtmlProject.
   */
  public void setCreateWfUiHtmlProject(java.lang.Boolean _createWfUiHtmlProject)
  {
    createWfUiHtmlProject = _createWfUiHtmlProject;
  }

  private transient java.lang.Boolean createWfUiProject;

  /**
   * Gets the field createWfUiProject.
   * @return the value of the field createWfUiProject; may be null.
   */
  public java.lang.Boolean getCreateWfUiProject()
  {
    return createWfUiProject;
  }

  /**
   * Sets the field createWfUiProject.
   * @param _createWfUiProject the new value of the field createWfUiProject.
   */
  public void setCreateWfUiProject(java.lang.Boolean _createWfUiProject)
  {
    createWfUiProject = _createWfUiProject;
  }

  private transient java.lang.String description;

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

  private transient java.lang.String fileDirectory;

  /**
   * Gets the field fileDirectory.
   * @return the value of the field fileDirectory; may be null.
   */
  public java.lang.String getFileDirectory()
  {
    return fileDirectory;
  }

  /**
   * Sets the field fileDirectory.
   * @param _fileDirectory the new value of the field fileDirectory.
   */
  public void setFileDirectory(java.lang.String _fileDirectory)
  {
    fileDirectory = _fileDirectory;
  }

  private transient java.lang.String name;

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

  private transient java.lang.String owner;

  /**
   * Gets the field owner.
   * @return the value of the field owner; may be null.
   */
  public java.lang.String getOwner()
  {
    return owner;
  }

  /**
   * Sets the field owner.
   * @param _owner the new value of the field owner.
   */
  public void setOwner(java.lang.String _owner)
  {
    owner = _owner;
  }

  private transient ch.ivyteam.ivy.security.IExternalSecuritySystemProvider securitySystem;

  /**
   * Gets the field securitySystem.
   * @return the value of the field securitySystem; may be null.
   */
  public ch.ivyteam.ivy.security.IExternalSecuritySystemProvider getSecuritySystem()
  {
    return securitySystem;
  }

  /**
   * Sets the field securitySystem.
   * @param _securitySystem the new value of the field securitySystem.
   */
  public void setSecuritySystem(ch.ivyteam.ivy.security.IExternalSecuritySystemProvider _securitySystem)
  {
    securitySystem = _securitySystem;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IExternalSecuritySystemProvider> securitySystems;

  /**
   * Gets the field securitySystems.
   * @return the value of the field securitySystems; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IExternalSecuritySystemProvider> getSecuritySystems()
  {
    return securitySystems;
  }

  /**
   * Sets the field securitySystems.
   * @param _securitySystems the new value of the field securitySystems.
   */
  public void setSecuritySystems(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IExternalSecuritySystemProvider> _securitySystems)
  {
    securitySystems = _securitySystems;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> validationErrors;

  /**
   * Gets the field validationErrors.
   * @return the value of the field validationErrors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getValidationErrors()
  {
    return validationErrors;
  }

  /**
   * Sets the field validationErrors.
   * @param _validationErrors the new value of the field validationErrors.
   */
  public void setValidationErrors(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _validationErrors)
  {
    validationErrors = _validationErrors;
  }

  private transient java.lang.Boolean createWfUiJsfProject;

  /**
   * Gets the field createWfUiJsfProject.
   * @return the value of the field createWfUiJsfProject; may be null.
   */
  public java.lang.Boolean getCreateWfUiJsfProject()
  {
    return createWfUiJsfProject;
  }

  /**
   * Sets the field createWfUiJsfProject.
   * @param _createWfUiJsfProject the new value of the field createWfUiJsfProject.
   */
  public void setCreateWfUiJsfProject(java.lang.Boolean _createWfUiJsfProject)
  {
    createWfUiJsfProject = _createWfUiJsfProject;
  }

}
