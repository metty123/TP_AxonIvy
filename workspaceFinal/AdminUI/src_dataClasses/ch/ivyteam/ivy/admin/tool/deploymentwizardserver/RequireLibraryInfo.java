package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RequireLibraryInfo", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RequireLibraryInfo extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1761536627373177407L;

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

  private transient java.lang.Boolean isAlreadyDeployed;

  /**
   * Gets the field isAlreadyDeployed.
   * @return the value of the field isAlreadyDeployed; may be null.
   */
  public java.lang.Boolean getIsAlreadyDeployed()
  {
    return isAlreadyDeployed;
  }

  /**
   * Sets the field isAlreadyDeployed.
   * @param _isAlreadyDeployed the new value of the field isAlreadyDeployed.
   */
  public void setIsAlreadyDeployed(java.lang.Boolean _isAlreadyDeployed)
  {
    isAlreadyDeployed = _isAlreadyDeployed;
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

  private transient ch.ivyteam.ivy.application.value.VersionBound minVersionBound;

  /**
   * Gets the field minVersionBound.
   * @return the value of the field minVersionBound; may be null.
   */
  public ch.ivyteam.ivy.application.value.VersionBound getMinVersionBound()
  {
    return minVersionBound;
  }

  /**
   * Sets the field minVersionBound.
   * @param _minVersionBound the new value of the field minVersionBound.
   */
  public void setMinVersionBound(ch.ivyteam.ivy.application.value.VersionBound _minVersionBound)
  {
    minVersionBound = _minVersionBound;
  }

  private transient ch.ivyteam.ivy.application.value.VersionBound maxVersionBound;

  /**
   * Gets the field maxVersionBound.
   * @return the value of the field maxVersionBound; may be null.
   */
  public ch.ivyteam.ivy.application.value.VersionBound getMaxVersionBound()
  {
    return maxVersionBound;
  }

  /**
   * Sets the field maxVersionBound.
   * @param _maxVersionBound the new value of the field maxVersionBound.
   */
  public void setMaxVersionBound(ch.ivyteam.ivy.application.value.VersionBound _maxVersionBound)
  {
    maxVersionBound = _maxVersionBound;
  }

}
