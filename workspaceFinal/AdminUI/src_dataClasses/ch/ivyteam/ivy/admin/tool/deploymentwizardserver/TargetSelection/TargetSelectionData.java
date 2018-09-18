package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelection;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class TargetSelectionData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class TargetSelectionData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5981830420844501016L;

  /**
   * list of available apps on server
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> appList;

  /**
   * Gets the field appList.
   * @return the value of the field appList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> getAppList()
  {
    return appList;
  }

  /**
   * Sets the field appList.
   * @param _appList the new value of the field appList.
   */
  public void setAppList(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> _appList)
  {
    appList = _appList;
  }

  private transient java.lang.Boolean applyManualSelection;

  /**
   * Gets the field applyManualSelection.
   * @return the value of the field applyManualSelection; may be null.
   */
  public java.lang.Boolean getApplyManualSelection()
  {
    return applyManualSelection;
  }

  /**
   * Sets the field applyManualSelection.
   * @param _applyManualSelection the new value of the field applyManualSelection.
   */
  public void setApplyManualSelection(java.lang.Boolean _applyManualSelection)
  {
    applyManualSelection = _applyManualSelection;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> appsFromAdmin;

  /**
   * Gets the field appsFromAdmin.
   * @return the value of the field appsFromAdmin; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> getAppsFromAdmin()
  {
    return appsFromAdmin;
  }

  /**
   * Sets the field appsFromAdmin.
   * @param _appsFromAdmin the new value of the field appsFromAdmin.
   */
  public void setAppsFromAdmin(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> _appsFromAdmin)
  {
    appsFromAdmin = _appsFromAdmin;
  }

  /**
   * Key to store selected applications
   */
  private transient java.lang.String attribute;

  /**
   * Gets the field attribute.
   * @return the value of the field attribute; may be null.
   */
  public java.lang.String getAttribute()
  {
    return attribute;
  }

  /**
   * Sets the field attribute.
   * @param _attribute the new value of the field attribute.
   */
  public void setAttribute(java.lang.String _attribute)
  {
    attribute = _attribute;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> deployProjectList;

  /**
   * Gets the field deployProjectList.
   * @return the value of the field deployProjectList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> getDeployProjectList()
  {
    return deployProjectList;
  }

  /**
   * Sets the field deployProjectList.
   * @param _deployProjectList the new value of the field deployProjectList.
   */
  public void setDeployProjectList(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> _deployProjectList)
  {
    deployProjectList = _deployProjectList;
  }

  private transient java.lang.String errorMessage;

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

  private transient java.lang.Boolean isMaskLoaded;

  /**
   * Gets the field isMaskLoaded.
   * @return the value of the field isMaskLoaded; may be null.
   */
  public java.lang.Boolean getIsMaskLoaded()
  {
    return isMaskLoaded;
  }

  /**
   * Sets the field isMaskLoaded.
   * @param _isMaskLoaded the new value of the field isMaskLoaded.
   */
  public void setIsMaskLoaded(java.lang.Boolean _isMaskLoaded)
  {
    isMaskLoaded = _isMaskLoaded;
  }

  private transient java.lang.Boolean isOkClicked;

  /**
   * Gets the field isOkClicked.
   * @return the value of the field isOkClicked; may be null.
   */
  public java.lang.Boolean getIsOkClicked()
  {
    return isOkClicked;
  }

  /**
   * Sets the field isOkClicked.
   * @param _isOkClicked the new value of the field isOkClicked.
   */
  public void setIsOkClicked(java.lang.Boolean _isOkClicked)
  {
    isOkClicked = _isOkClicked;
  }

  private transient java.lang.Boolean isUserChangeActivateAll;

  /**
   * Gets the field isUserChangeActivateAll.
   * @return the value of the field isUserChangeActivateAll; may be null.
   */
  public java.lang.Boolean getIsUserChangeActivateAll()
  {
    return isUserChangeActivateAll;
  }

  /**
   * Sets the field isUserChangeActivateAll.
   * @param _isUserChangeActivateAll the new value of the field isUserChangeActivateAll.
   */
  public void setIsUserChangeActivateAll(java.lang.Boolean _isUserChangeActivateAll)
  {
    isUserChangeActivateAll = _isUserChangeActivateAll;
  }

  private transient java.lang.Boolean isUserChangeReleaseAll;

  /**
   * Gets the field isUserChangeReleaseAll.
   * @return the value of the field isUserChangeReleaseAll; may be null.
   */
  public java.lang.Boolean getIsUserChangeReleaseAll()
  {
    return isUserChangeReleaseAll;
  }

  /**
   * Sets the field isUserChangeReleaseAll.
   * @param _isUserChangeReleaseAll the new value of the field isUserChangeReleaseAll.
   */
  public void setIsUserChangeReleaseAll(java.lang.Boolean _isUserChangeReleaseAll)
  {
    isUserChangeReleaseAll = _isUserChangeReleaseAll;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModel> pmsFromAdmin;

  /**
   * Gets the field pmsFromAdmin.
   * @return the value of the field pmsFromAdmin; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModel> getPmsFromAdmin()
  {
    return pmsFromAdmin;
  }

  /**
   * Sets the field pmsFromAdmin.
   * @param _pmsFromAdmin the new value of the field pmsFromAdmin.
   */
  public void setPmsFromAdmin(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModel> _pmsFromAdmin)
  {
    pmsFromAdmin = _pmsFromAdmin;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModelVersion> pmvsFromAdmin;

  /**
   * Gets the field pmvsFromAdmin.
   * @return the value of the field pmvsFromAdmin; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModelVersion> getPmvsFromAdmin()
  {
    return pmvsFromAdmin;
  }

  /**
   * Sets the field pmvsFromAdmin.
   * @param _pmvsFromAdmin the new value of the field pmvsFromAdmin.
   */
  public void setPmvsFromAdmin(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModelVersion> _pmvsFromAdmin)
  {
    pmvsFromAdmin = _pmvsFromAdmin;
  }

  /**
   * Values to store selected applications
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> selectedApps;

  /**
   * Gets the field selectedApps.
   * @return the value of the field selectedApps; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getSelectedApps()
  {
    return selectedApps;
  }

  /**
   * Sets the field selectedApps.
   * @param _selectedApps the new value of the field selectedApps.
   */
  public void setSelectedApps(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _selectedApps)
  {
    selectedApps = _selectedApps;
  }

}
