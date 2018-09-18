package ch.ivyteam.ivy.rd.common.ServerFileBrowser;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ServerFileBrowserData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ServerFileBrowserData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -3525621222652380578L;

  /**
   * parameter, flag whether only dirs should be displayed
   */
  private transient java.lang.Boolean onlyDirectories;

  /**
   * Gets the field onlyDirectories.
   * @return the value of the field onlyDirectories; may be null.
   */
  public java.lang.Boolean getOnlyDirectories()
  {
    return onlyDirectories;
  }

  /**
   * Sets the field onlyDirectories.
   * @param _onlyDirectories the new value of the field onlyDirectories.
   */
  public void setOnlyDirectories(java.lang.Boolean _onlyDirectories)
  {
    onlyDirectories = _onlyDirectories;
  }

  /**
   * parameter, flag whether dirs may be created or not
   */
  private java.lang.Boolean allowCreateDir;

  /**
   * Gets the field allowCreateDir.
   * @return the value of the field allowCreateDir; may be null.
   */
  public java.lang.Boolean getAllowCreateDir()
  {
    return allowCreateDir;
  }

  /**
   * Sets the field allowCreateDir.
   * @param _allowCreateDir the new value of the field allowCreateDir.
   */
  public void setAllowCreateDir(java.lang.Boolean _allowCreateDir)
  {
    allowCreateDir = _allowCreateDir;
  }

  /**
   * parameter, the pre-selected path
   */
  private transient java.lang.String rootPath;

  /**
   * Gets the field rootPath.
   * @return the value of the field rootPath; may be null.
   */
  public java.lang.String getRootPath()
  {
    return rootPath;
  }

  /**
   * Sets the field rootPath.
   * @param _rootPath the new value of the field rootPath.
   */
  public void setRootPath(java.lang.String _rootPath)
  {
    rootPath = _rootPath;
  }

  /**
   * the root tree of the file system
   */
  private transient ch.ivyteam.ivy.scripting.objects.Tree rootDir;

  /**
   * Gets the field rootDir.
   * @return the value of the field rootDir; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getRootDir()
  {
    return rootDir;
  }

  /**
   * Sets the field rootDir.
   * @param _rootDir the new value of the field rootDir.
   */
  public void setRootDir(ch.ivyteam.ivy.scripting.objects.Tree _rootDir)
  {
    rootDir = _rootDir;
  }

  /**
   * the path selected (not online updated)
   */
  private transient java.lang.String selectedPath;

  /**
   * Gets the field selectedPath.
   * @return the value of the field selectedPath; may be null.
   */
  public java.lang.String getSelectedPath()
  {
    return selectedPath;
  }

  /**
   * Sets the field selectedPath.
   * @param _selectedPath the new value of the field selectedPath.
   */
  public void setSelectedPath(java.lang.String _selectedPath)
  {
    selectedPath = _selectedPath;
  }

  /**
   * the chosen name for new directory
   */
  private transient java.lang.String newDirName;

  /**
   * Gets the field newDirName.
   * @return the value of the field newDirName; may be null.
   */
  public java.lang.String getNewDirName()
  {
    return newDirName;
  }

  /**
   * Sets the field newDirName.
   * @param _newDirName the new value of the field newDirName.
   */
  public void setNewDirName(java.lang.String _newDirName)
  {
    newDirName = _newDirName;
  }

  private transient java.lang.Boolean hasErrors;

  /**
   * Gets the field hasErrors.
   * @return the value of the field hasErrors; may be null.
   */
  public java.lang.Boolean getHasErrors()
  {
    return hasErrors;
  }

  /**
   * Sets the field hasErrors.
   * @param _hasErrors the new value of the field hasErrors.
   */
  public void setHasErrors(java.lang.Boolean _hasErrors)
  {
    hasErrors = _hasErrors;
  }

  private transient java.lang.Boolean isInitialized;

  /**
   * Gets the field isInitialized.
   * @return the value of the field isInitialized; may be null.
   */
  public java.lang.Boolean getIsInitialized()
  {
    return isInitialized;
  }

  /**
   * Sets the field isInitialized.
   * @param _isInitialized the new value of the field isInitialized.
   */
  public void setIsInitialized(java.lang.Boolean _isInitialized)
  {
    isInitialized = _isInitialized;
  }

  private transient java.lang.Boolean wasCancelled;

  /**
   * Gets the field wasCancelled.
   * @return the value of the field wasCancelled; may be null.
   */
  public java.lang.Boolean getWasCancelled()
  {
    return wasCancelled;
  }

  /**
   * Sets the field wasCancelled.
   * @param _wasCancelled the new value of the field wasCancelled.
   */
  public void setWasCancelled(java.lang.Boolean _wasCancelled)
  {
    wasCancelled = _wasCancelled;
  }

}
