package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LibraryInfo", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LibraryInfo extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2906849032569043310L;

  private transient java.lang.String libraryId;

  /**
   * Gets the field libraryId.
   * @return the value of the field libraryId; may be null.
   */
  public java.lang.String getLibraryId()
  {
    return libraryId;
  }

  /**
   * Sets the field libraryId.
   * @param _libraryId the new value of the field libraryId.
   */
  public void setLibraryId(java.lang.String _libraryId)
  {
    libraryId = _libraryId;
  }

  private transient ch.ivyteam.ivy.application.value.QualifiedVersion qualifiedVersion;

  /**
   * Gets the field qualifiedVersion.
   * @return the value of the field qualifiedVersion; may be null.
   */
  public ch.ivyteam.ivy.application.value.QualifiedVersion getQualifiedVersion()
  {
    return qualifiedVersion;
  }

  /**
   * Sets the field qualifiedVersion.
   * @param _qualifiedVersion the new value of the field qualifiedVersion.
   */
  public void setQualifiedVersion(ch.ivyteam.ivy.application.value.QualifiedVersion _qualifiedVersion)
  {
    qualifiedVersion = _qualifiedVersion;
  }

  private transient java.lang.Boolean isDeployed;

  /**
   * Gets the field isDeployed.
   * @return the value of the field isDeployed; may be null.
   */
  public java.lang.Boolean getIsDeployed()
  {
    return isDeployed;
  }

  /**
   * Sets the field isDeployed.
   * @param _isDeployed the new value of the field isDeployed.
   */
  public void setIsDeployed(java.lang.Boolean _isDeployed)
  {
    isDeployed = _isDeployed;
  }

  private transient java.lang.String projectName;

  /**
   * Gets the field projectName.
   * @return the value of the field projectName; may be null.
   */
  public java.lang.String getProjectName()
  {
    return projectName;
  }

  /**
   * Sets the field projectName.
   * @param _projectName the new value of the field projectName.
   */
  public void setProjectName(java.lang.String _projectName)
  {
    projectName = _projectName;
  }

}
