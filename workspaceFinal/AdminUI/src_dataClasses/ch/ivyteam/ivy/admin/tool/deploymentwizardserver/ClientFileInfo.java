package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ClientFileInfo", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ClientFileInfo extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1231731584599197468L;

  private transient java.lang.String id;

  /**
   * Gets the field id.
   * @return the value of the field id; may be null.
   */
  public java.lang.String getId()
  {
    return id;
  }

  /**
   * Sets the field id.
   * @param _id the new value of the field id.
   */
  public void setId(java.lang.String _id)
  {
    id = _id;
  }

  private transient java.lang.Boolean isDirectory;

  /**
   * Gets the field isDirectory.
   * @return the value of the field isDirectory; may be null.
   */
  public java.lang.Boolean getIsDirectory()
  {
    return isDirectory;
  }

  /**
   * Sets the field isDirectory.
   * @param _isDirectory the new value of the field isDirectory.
   */
  public void setIsDirectory(java.lang.Boolean _isDirectory)
  {
    isDirectory = _isDirectory;
  }

  /**
   * This flag is used to differentiate existed zip file from new-created zip file on client PC
   */
  private transient java.lang.Boolean isTempFile;

  /**
   * Gets the field isTempFile.
   * @return the value of the field isTempFile; may be null.
   */
  public java.lang.Boolean getIsTempFile()
  {
    return isTempFile;
  }

  /**
   * Sets the field isTempFile.
   * @param _isTempFile the new value of the field isTempFile.
   */
  public void setIsTempFile(java.lang.Boolean _isTempFile)
  {
    isTempFile = _isTempFile;
  }

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

  private transient java.lang.String path;

  /**
   * Gets the field path.
   * @return the value of the field path; may be null.
   */
  public java.lang.String getPath()
  {
    return path;
  }

  /**
   * Sets the field path.
   * @param _path the new value of the field path.
   */
  public void setPath(java.lang.String _path)
  {
    path = _path;
  }

  private transient java.lang.String projectVersion;

  /**
   * Gets the field projectVersion.
   * @return the value of the field projectVersion; may be null.
   */
  public java.lang.String getProjectVersion()
  {
    return projectVersion;
  }

  /**
   * Sets the field projectVersion.
   * @param _projectVersion the new value of the field projectVersion.
   */
  public void setProjectVersion(java.lang.String _projectVersion)
  {
    projectVersion = _projectVersion;
  }

  private transient java.lang.String requireProjects;

  /**
   * Gets the field requireProjects.
   * @return the value of the field requireProjects; may be null.
   */
  public java.lang.String getRequireProjects()
  {
    return requireProjects;
  }

  /**
   * Sets the field requireProjects.
   * @param _requireProjects the new value of the field requireProjects.
   */
  public void setRequireProjects(java.lang.String _requireProjects)
  {
    requireProjects = _requireProjects;
  }

}
