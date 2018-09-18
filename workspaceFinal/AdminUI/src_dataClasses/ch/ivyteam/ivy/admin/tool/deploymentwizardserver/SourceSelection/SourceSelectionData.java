package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.SourceSelection;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SourceSelectionData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SourceSelectionData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6586637589694219863L;

  /**
   * Keys used to store/restore settings of last selected path on local/server, browse location
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> attributes;

  /**
   * Gets the field attributes.
   * @return the value of the field attributes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getAttributes()
  {
    return attributes;
  }

  /**
   * Sets the field attributes.
   * @param _attributes the new value of the field attributes.
   */
  public void setAttributes(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _attributes)
  {
    attributes = _attributes;
  }

  private transient java.lang.Boolean hasAnyCheckBoxSelected;

  /**
   * Gets the field hasAnyCheckBoxSelected.
   * @return the value of the field hasAnyCheckBoxSelected; may be null.
   */
  public java.lang.Boolean getHasAnyCheckBoxSelected()
  {
    return hasAnyCheckBoxSelected;
  }

  /**
   * Sets the field hasAnyCheckBoxSelected.
   * @param _hasAnyCheckBoxSelected the new value of the field hasAnyCheckBoxSelected.
   */
  public void setHasAnyCheckBoxSelected(java.lang.Boolean _hasAnyCheckBoxSelected)
  {
    hasAnyCheckBoxSelected = _hasAnyCheckBoxSelected;
  }

  private transient java.lang.Boolean isBtnBrowseClicked;

  /**
   * Gets the field isBtnBrowseClicked.
   * @return the value of the field isBtnBrowseClicked; may be null.
   */
  public java.lang.Boolean getIsBtnBrowseClicked()
  {
    return isBtnBrowseClicked;
  }

  /**
   * Sets the field isBtnBrowseClicked.
   * @param _isBtnBrowseClicked the new value of the field isBtnBrowseClicked.
   */
  public void setIsBtnBrowseClicked(java.lang.Boolean _isBtnBrowseClicked)
  {
    isBtnBrowseClicked = _isBtnBrowseClicked;
  }

  private transient java.lang.Boolean isFromServer;

  /**
   * Gets the field isFromServer.
   * @return the value of the field isFromServer; may be null.
   */
  public java.lang.Boolean getIsFromServer()
  {
    return isFromServer;
  }

  /**
   * Sets the field isFromServer.
   * @param _isFromServer the new value of the field isFromServer.
   */
  public void setIsFromServer(java.lang.Boolean _isFromServer)
  {
    isFromServer = _isFromServer;
  }

  /**
   * indicate if the extracted project list has any changes
   */
  private transient java.lang.Boolean needToLoadProjList;

  /**
   * Gets the field needToLoadProjList.
   * @return the value of the field needToLoadProjList; may be null.
   */
  public java.lang.Boolean getNeedToLoadProjList()
  {
    return needToLoadProjList;
  }

  /**
   * Sets the field needToLoadProjList.
   * @param _needToLoadProjList the new value of the field needToLoadProjList.
   */
  public void setNeedToLoadProjList(java.lang.Boolean _needToLoadProjList)
  {
    needToLoadProjList = _needToLoadProjList;
  }

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectExtractor projectExtractor;

  /**
   * Gets the field projectExtractor.
   * @return the value of the field projectExtractor; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectExtractor getProjectExtractor()
  {
    return projectExtractor;
  }

  /**
   * Sets the field projectExtractor.
   * @param _projectExtractor the new value of the field projectExtractor.
   */
  public void setProjectExtractor(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectExtractor _projectExtractor)
  {
    projectExtractor = _projectExtractor;
  }

  /**
   * project list
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectList;

  /**
   * Gets the field projectList.
   * @return the value of the field projectList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> getProjectList()
  {
    return projectList;
  }

  /**
   * Sets the field projectList.
   * @param _projectList the new value of the field projectList.
   */
  public void setProjectList(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> _projectList)
  {
    projectList = _projectList;
  }

  /**
   * Value to store last selected path on local
   */
  private transient java.lang.String selectedPathOnLocal;

  /**
   * Gets the field selectedPathOnLocal.
   * @return the value of the field selectedPathOnLocal; may be null.
   */
  public java.lang.String getSelectedPathOnLocal()
  {
    return selectedPathOnLocal;
  }

  /**
   * Sets the field selectedPathOnLocal.
   * @param _selectedPathOnLocal the new value of the field selectedPathOnLocal.
   */
  public void setSelectedPathOnLocal(java.lang.String _selectedPathOnLocal)
  {
    selectedPathOnLocal = _selectedPathOnLocal;
  }

  /**
   * Value to store last selected path on server
   */
  private transient java.lang.String selectedPathOnServer;

  /**
   * Gets the field selectedPathOnServer.
   * @return the value of the field selectedPathOnServer; may be null.
   */
  public java.lang.String getSelectedPathOnServer()
  {
    return selectedPathOnServer;
  }

  /**
   * Sets the field selectedPathOnServer.
   * @param _selectedPathOnServer the new value of the field selectedPathOnServer.
   */
  public void setSelectedPathOnServer(java.lang.String _selectedPathOnServer)
  {
    selectedPathOnServer = _selectedPathOnServer;
  }

  private transient java.lang.Boolean isEnterOrButtonClicked;

  /**
   * Gets the field isEnterOrButtonClicked.
   * @return the value of the field isEnterOrButtonClicked; may be null.
   */
  public java.lang.Boolean getIsEnterOrButtonClicked()
  {
    return isEnterOrButtonClicked;
  }

  /**
   * Sets the field isEnterOrButtonClicked.
   * @param _isEnterOrButtonClicked the new value of the field isEnterOrButtonClicked.
   */
  public void setIsEnterOrButtonClicked(java.lang.Boolean _isEnterOrButtonClicked)
  {
    isEnterOrButtonClicked = _isEnterOrButtonClicked;
  }

  private transient java.lang.Boolean isEnterClicked;

  /**
   * Gets the field isEnterClicked.
   * @return the value of the field isEnterClicked; may be null.
   */
  public java.lang.Boolean getIsEnterClicked()
  {
    return isEnterClicked;
  }

  /**
   * Sets the field isEnterClicked.
   * @param _isEnterClicked the new value of the field isEnterClicked.
   */
  public void setIsEnterClicked(java.lang.Boolean _isEnterClicked)
  {
    isEnterClicked = _isEnterClicked;
  }

  private java.lang.Boolean hasSameProject;

  /**
   * Gets the field hasSameProject.
   * @return the value of the field hasSameProject; may be null.
   */
  public java.lang.Boolean getHasSameProject()
  {
    return hasSameProject;
  }

  /**
   * Sets the field hasSameProject.
   * @param _hasSameProject the new value of the field hasSameProject.
   */
  public void setHasSameProject(java.lang.Boolean _hasSameProject)
  {
    hasSameProject = _hasSameProject;
  }

  private java.lang.String errorMessage;

  /**
   * Gets the field errorMessage.
   * @return the value of the field errorMessage; may be null.
   */
  public java.lang.String getErrorMessage()
  {
    return errorMessage;
  }

  /**
   * Sets the field errorMessage.
   * @param _errorMessage the new value of the field errorMessage.
   */
  public void setErrorMessage(java.lang.String _errorMessage)
  {
    errorMessage = _errorMessage;
  }

  private ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo selectedProject;

  /**
   * Gets the field selectedProject.
   * @return the value of the field selectedProject; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo getSelectedProject()
  {
    return selectedProject;
  }

  /**
   * Sets the field selectedProject.
   * @param _selectedProject the new value of the field selectedProject.
   */
  public void setSelectedProject(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo _selectedProject)
  {
    selectedProject = _selectedProject;
  }

  private ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox selectedCheckBox;

  /**
   * Gets the field selectedCheckBox.
   * @return the value of the field selectedCheckBox; may be null.
   */
  public ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox getSelectedCheckBox()
  {
    return selectedCheckBox;
  }

  /**
   * Sets the field selectedCheckBox.
   * @param _selectedCheckBox the new value of the field selectedCheckBox.
   */
  public void setSelectedCheckBox(ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox _selectedCheckBox)
  {
    selectedCheckBox = _selectedCheckBox;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> selectedProjects;

  /**
   * Gets the field selectedProjects.
   * @return the value of the field selectedProjects; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> getSelectedProjects()
  {
    return selectedProjects;
  }

  /**
   * Sets the field selectedProjects.
   * @param _selectedProjects the new value of the field selectedProjects.
   */
  public void setSelectedProjects(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> _selectedProjects)
  {
    selectedProjects = _selectedProjects;
  }

  private java.lang.Boolean isKeptServerUserSelection;

  /**
   * Gets the field isKeptServerUserSelection.
   * @return the value of the field isKeptServerUserSelection; may be null.
   */
  public java.lang.Boolean getIsKeptServerUserSelection()
  {
    return isKeptServerUserSelection;
  }

  /**
   * Sets the field isKeptServerUserSelection.
   * @param _isKeptServerUserSelection the new value of the field isKeptServerUserSelection.
   */
  public void setIsKeptServerUserSelection(java.lang.Boolean _isKeptServerUserSelection)
  {
    isKeptServerUserSelection = _isKeptServerUserSelection;
  }

  /**
   * used to store the projects' information, key is check box id
   */
  private java.util.Map projectMappedByCheckBoxIds;

  /**
   * Gets the field projectMappedByCheckBoxIds.
   * @return the value of the field projectMappedByCheckBoxIds; may be null.
   */
  public java.util.Map getProjectMappedByCheckBoxIds()
  {
    return projectMappedByCheckBoxIds;
  }

  /**
   * Sets the field projectMappedByCheckBoxIds.
   * @param _projectMappedByCheckBoxIds the new value of the field projectMappedByCheckBoxIds.
   */
  public void setProjectMappedByCheckBoxIds(java.util.Map _projectMappedByCheckBoxIds)
  {
    projectMappedByCheckBoxIds = _projectMappedByCheckBoxIds;
  }

}
