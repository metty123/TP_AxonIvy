package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Main;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class MainData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class MainData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6185731393897739152L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> apps;

  /**
   * Gets the field apps.
   * @return the value of the field apps; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> getApps()
  {
    return apps;
  }

  /**
   * Sets the field apps.
   * @param _apps the new value of the field apps.
   */
  public void setApps(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IApplication> _apps)
  {
    apps = _apps;
  }

  /**
   * list of apps selected from Admin UI tree
   */
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
   * current panel name, use to detect what panel to show
   */
  private transient java.lang.String currentPanel;

  /**
   * Gets the field currentPanel.
   * @return the value of the field currentPanel; may be null.
   */
  public java.lang.String getCurrentPanel()
  {
    return currentPanel;
  }

  /**
   * Sets the field currentPanel.
   * @param _currentPanel the new value of the field currentPanel.
   */
  public void setCurrentPanel(java.lang.String _currentPanel)
  {
    currentPanel = _currentPanel;
  }

  /**
   * Flag used to detect another app is opening
   */
  private transient java.lang.Boolean isAnotherAppOpening;

  /**
   * Gets the field isAnotherAppOpening.
   * @return the value of the field isAnotherAppOpening; may be null.
   */
  public java.lang.Boolean getIsAnotherAppOpening()
  {
    return isAnotherAppOpening;
  }

  /**
   * Sets the field isAnotherAppOpening.
   * @param _isAnotherAppOpening the new value of the field isAnotherAppOpening.
   */
  public void setIsAnotherAppOpening(java.lang.Boolean _isAnotherAppOpening)
  {
    isAnotherAppOpening = _isAnotherAppOpening;
  }

  private transient java.lang.String isClose;

  /**
   * Gets the field isClose.
   * @return the value of the field isClose; may be null.
   */
  public java.lang.String getIsClose()
  {
    return isClose;
  }

  /**
   * Sets the field isClose.
   * @param _isClose the new value of the field isClose.
   */
  public void setIsClose(java.lang.String _isClose)
  {
    isClose = _isClose;
  }

  private transient java.lang.Boolean isFromPreview;

  /**
   * Gets the field isFromPreview.
   * @return the value of the field isFromPreview; may be null.
   */
  public java.lang.Boolean getIsFromPreview()
  {
    return isFromPreview;
  }

  /**
   * Sets the field isFromPreview.
   * @param _isFromPreview the new value of the field isFromPreview.
   */
  public void setIsFromPreview(java.lang.Boolean _isFromPreview)
  {
    isFromPreview = _isFromPreview;
  }

  private transient java.lang.Boolean isNextButtonClicked;

  /**
   * Gets the field isNextButtonClicked.
   * @return the value of the field isNextButtonClicked; may be null.
   */
  public java.lang.Boolean getIsNextButtonClicked()
  {
    return isNextButtonClicked;
  }

  /**
   * Sets the field isNextButtonClicked.
   * @param _isNextButtonClicked the new value of the field isNextButtonClicked.
   */
  public void setIsNextButtonClicked(java.lang.Boolean _isNextButtonClicked)
  {
    isNextButtonClicked = _isNextButtonClicked;
  }

  private transient java.lang.Boolean isPreviousButtonVisible;

  /**
   * Gets the field isPreviousButtonVisible.
   * @return the value of the field isPreviousButtonVisible; may be null.
   */
  public java.lang.Boolean getIsPreviousButtonVisible()
  {
    return isPreviousButtonVisible;
  }

  /**
   * Sets the field isPreviousButtonVisible.
   * @param _isPreviousButtonVisible the new value of the field isPreviousButtonVisible.
   */
  public void setIsPreviousButtonVisible(java.lang.Boolean _isPreviousButtonVisible)
  {
    isPreviousButtonVisible = _isPreviousButtonVisible;
  }

  private transient java.lang.Boolean needToLoadDataAtTargetMask;

  /**
   * Gets the field needToLoadDataAtTargetMask.
   * @return the value of the field needToLoadDataAtTargetMask; may be null.
   */
  public java.lang.Boolean getNeedToLoadDataAtTargetMask()
  {
    return needToLoadDataAtTargetMask;
  }

  /**
   * Sets the field needToLoadDataAtTargetMask.
   * @param _needToLoadDataAtTargetMask the new value of the field needToLoadDataAtTargetMask.
   */
  public void setNeedToLoadDataAtTargetMask(java.lang.Boolean _needToLoadDataAtTargetMask)
  {
    needToLoadDataAtTargetMask = _needToLoadDataAtTargetMask;
  }

  /**
   * panel Id, generated by UUID
   */
  private transient java.lang.String panelId;

  /**
   * Gets the field panelId.
   * @return the value of the field panelId; may be null.
   */
  public java.lang.String getPanelId()
  {
    return panelId;
  }

  /**
   * Sets the field panelId.
   * @param _panelId the new value of the field panelId.
   */
  public void setPanelId(java.lang.String _panelId)
  {
    panelId = _panelId;
  }

  /**
   * list of pms selected from Admin UI tree
   */
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

  /**
   * list of pmvs selected from Admin UI tree
   */
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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectsToDeploy;

  /**
   * Gets the field projectsToDeploy.
   * @return the value of the field projectsToDeploy; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> getProjectsToDeploy()
  {
    return projectsToDeploy;
  }

  /**
   * Sets the field projectsToDeploy.
   * @param _projectsToDeploy the new value of the field projectsToDeploy.
   */
  public void setProjectsToDeploy(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> _projectsToDeploy)
  {
    projectsToDeploy = _projectsToDeploy;
  }

  /**
   * panel Id received from broadcast event
   */
  private transient java.lang.String receivedId;

  /**
   * Gets the field receivedId.
   * @return the value of the field receivedId; may be null.
   */
  public java.lang.String getReceivedId()
  {
    return receivedId;
  }

  /**
   * Sets the field receivedId.
   * @param _receivedId the new value of the field receivedId.
   */
  public void setReceivedId(java.lang.String _receivedId)
  {
    receivedId = _receivedId;
  }

  private transient java.lang.String selectedPage;

  /**
   * Gets the field selectedPage.
   * @return the value of the field selectedPage; may be null.
   */
  public java.lang.String getSelectedPage()
  {
    return selectedPage;
  }

  /**
   * Sets the field selectedPage.
   * @param _selectedPage the new value of the field selectedPage.
   */
  public void setSelectedPage(java.lang.String _selectedPage)
  {
    selectedPage = _selectedPage;
  }

  private transient java.lang.Boolean willRefresh;

  /**
   * Gets the field willRefresh.
   * @return the value of the field willRefresh; may be null.
   */
  public java.lang.Boolean getWillRefresh()
  {
    return willRefresh;
  }

  /**
   * Sets the field willRefresh.
   * @param _willRefresh the new value of the field willRefresh.
   */
  public void setWillRefresh(java.lang.Boolean _willRefresh)
  {
    willRefresh = _willRefresh;
  }

}
