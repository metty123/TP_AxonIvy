package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Validation;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ValidationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ValidationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -57114982745472220L;

  private transient ch.ivyteam.ivy.application.IApplication app;

  /**
   * Gets the field app.
   * @return the value of the field app; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApp()
  {
    return app;
  }

  /**
   * Sets the field app.
   * @param _app the new value of the field app.
   */
  public void setApp(ch.ivyteam.ivy.application.IApplication _app)
  {
    app = _app;
  }

  private transient java.lang.Integer appIndex;

  /**
   * Gets the field appIndex.
   * @return the value of the field appIndex; may be null.
   */
  public java.lang.Integer getAppIndex()
  {
    return appIndex;
  }

  /**
   * Sets the field appIndex.
   * @param _appIndex the new value of the field appIndex.
   */
  public void setAppIndex(java.lang.Integer _appIndex)
  {
    appIndex = _appIndex;
  }

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

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProcessName currentProcess;

  /**
   * Gets the field currentProcess.
   * @return the value of the field currentProcess; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProcessName getCurrentProcess()
  {
    return currentProcess;
  }

  /**
   * Sets the field currentProcess.
   * @param _currentProcess the new value of the field currentProcess.
   */
  public void setCurrentProcess(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProcessName _currentProcess)
  {
    currentProcess = _currentProcess;
  }

  private transient java.lang.Boolean hasAnyIssue;

  /**
   * Gets the field hasAnyIssue.
   * @return the value of the field hasAnyIssue; may be null.
   */
  public java.lang.Boolean getHasAnyIssue()
  {
    return hasAnyIssue;
  }

  /**
   * Sets the field hasAnyIssue.
   * @param _hasAnyIssue the new value of the field hasAnyIssue.
   */
  public void setHasAnyIssue(java.lang.Boolean _hasAnyIssue)
  {
    hasAnyIssue = _hasAnyIssue;
  }

  private transient java.lang.Boolean isNeedUploadFile;

  /**
   * Gets the field isNeedUploadFile.
   * @return the value of the field isNeedUploadFile; may be null.
   */
  public java.lang.Boolean getIsNeedUploadFile()
  {
    return isNeedUploadFile;
  }

  /**
   * Sets the field isNeedUploadFile.
   * @param _isNeedUploadFile the new value of the field isNeedUploadFile.
   */
  public void setIsNeedUploadFile(java.lang.Boolean _isNeedUploadFile)
  {
    isNeedUploadFile = _isNeedUploadFile;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ClientFileInfo> listOfUploadedClientProj;

  /**
   * Gets the field listOfUploadedClientProj.
   * @return the value of the field listOfUploadedClientProj; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ClientFileInfo> getListOfUploadedClientProj()
  {
    return listOfUploadedClientProj;
  }

  /**
   * Sets the field listOfUploadedClientProj.
   * @param _listOfUploadedClientProj the new value of the field listOfUploadedClientProj.
   */
  public void setListOfUploadedClientProj(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ClientFileInfo> _listOfUploadedClientProj)
  {
    listOfUploadedClientProj = _listOfUploadedClientProj;
  }

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProgressMonitor progressMonitor;

  /**
   * Gets the field progressMonitor.
   * @return the value of the field progressMonitor; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProgressMonitor getProgressMonitor()
  {
    return progressMonitor;
  }

  /**
   * Sets the field progressMonitor.
   * @param _progressMonitor the new value of the field progressMonitor.
   */
  public void setProgressMonitor(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProgressMonitor _progressMonitor)
  {
    progressMonitor = _progressMonitor;
  }

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo projectInfo;

  /**
   * Gets the field projectInfo.
   * @return the value of the field projectInfo; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo getProjectInfo()
  {
    return projectInfo;
  }

  /**
   * Sets the field projectInfo.
   * @param _projectInfo the new value of the field projectInfo.
   */
  public void setProjectInfo(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo _projectInfo)
  {
    projectInfo = _projectInfo;
  }

  private transient java.lang.Integer projectInfoIndex;

  /**
   * Gets the field projectInfoIndex.
   * @return the value of the field projectInfoIndex; may be null.
   */
  public java.lang.Integer getProjectInfoIndex()
  {
    return projectInfoIndex;
  }

  /**
   * Sets the field projectInfoIndex.
   * @param _projectInfoIndex the new value of the field projectInfoIndex.
   */
  public void setProjectInfoIndex(java.lang.Integer _projectInfoIndex)
  {
    projectInfoIndex = _projectInfoIndex;
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

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.UnzipManager projectUnzipper;

  /**
   * Gets the field projectUnzipper.
   * @return the value of the field projectUnzipper; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.UnzipManager getProjectUnzipper()
  {
    return projectUnzipper;
  }

  /**
   * Sets the field projectUnzipper.
   * @param _projectUnzipper the new value of the field projectUnzipper.
   */
  public void setProjectUnzipper(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.UnzipManager _projectUnzipper)
  {
    projectUnzipper = _projectUnzipper;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssue> validationResult;

  /**
   * Gets the field validationResult.
   * @return the value of the field validationResult; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssue> getValidationResult()
  {
    return validationResult;
  }

  /**
   * Sets the field validationResult.
   * @param _validationResult the new value of the field validationResult.
   */
  public void setValidationResult(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssue> _validationResult)
  {
    validationResult = _validationResult;
  }

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationManager validator;

  /**
   * Gets the field validator.
   * @return the value of the field validator; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationManager getValidator()
  {
    return validator;
  }

  /**
   * Sets the field validator.
   * @param _validator the new value of the field validator.
   */
  public void setValidator(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationManager _validator)
  {
    validator = _validator;
  }

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ZipManager zipUtil;

  /**
   * Gets the field zipUtil.
   * @return the value of the field zipUtil; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ZipManager getZipUtil()
  {
    return zipUtil;
  }

  /**
   * Sets the field zipUtil.
   * @param _zipUtil the new value of the field zipUtil.
   */
  public void setZipUtil(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ZipManager _zipUtil)
  {
    zipUtil = _zipUtil;
  }

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.FileUploadManager uploadUtil;

  /**
   * Gets the field uploadUtil.
   * @return the value of the field uploadUtil; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.FileUploadManager getUploadUtil()
  {
    return uploadUtil;
  }

  /**
   * Sets the field uploadUtil.
   * @param _uploadUtil the new value of the field uploadUtil.
   */
  public void setUploadUtil(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.FileUploadManager _uploadUtil)
  {
    uploadUtil = _uploadUtil;
  }

  private transient java.lang.Integer logIndex;

  /**
   * Gets the field logIndex.
   * @return the value of the field logIndex; may be null.
   */
  public java.lang.Integer getLogIndex()
  {
    return logIndex;
  }

  /**
   * Sets the field logIndex.
   * @param _logIndex the new value of the field logIndex.
   */
  public void setLogIndex(java.lang.Integer _logIndex)
  {
    logIndex = _logIndex;
  }

}
