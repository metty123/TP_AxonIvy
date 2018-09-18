package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Deploy;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DeployData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DeployData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -9004293150738894780L;

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

  private transient ch.ivyteam.ivy.admin.tool.deploymentwizardserver.deployment.DeploymentManager deployer;

  /**
   * Gets the field deployer.
   * @return the value of the field deployer; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.deploymentwizardserver.deployment.DeploymentManager getDeployer()
  {
    return deployer;
  }

  /**
   * Sets the field deployer.
   * @param _deployer the new value of the field deployer.
   */
  public void setDeployer(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.deployment.DeploymentManager _deployer)
  {
    deployer = _deployer;
  }

  private transient java.io.File file;

  /**
   * Gets the field file.
   * @return the value of the field file; may be null.
   */
  public java.io.File getFile()
  {
    return file;
  }

  /**
   * Sets the field file.
   * @param _file the new value of the field file.
   */
  public void setFile(java.io.File _file)
  {
    file = _file;
  }

  private transient java.lang.Boolean isAborted;

  /**
   * Gets the field isAborted.
   * @return the value of the field isAborted; may be null.
   */
  public java.lang.Boolean getIsAborted()
  {
    return isAborted;
  }

  /**
   * Sets the field isAborted.
   * @param _isAborted the new value of the field isAborted.
   */
  public void setIsAborted(java.lang.Boolean _isAborted)
  {
    isAborted = _isAborted;
  }

  private transient java.lang.Boolean isDeploymentCancelled;

  /**
   * Gets the field isDeploymentCancelled.
   * @return the value of the field isDeploymentCancelled; may be null.
   */
  public java.lang.Boolean getIsDeploymentCancelled()
  {
    return isDeploymentCancelled;
  }

  /**
   * Sets the field isDeploymentCancelled.
   * @param _isDeploymentCancelled the new value of the field isDeploymentCancelled.
   */
  public void setIsDeploymentCancelled(java.lang.Boolean _isDeploymentCancelled)
  {
    isDeploymentCancelled = _isDeploymentCancelled;
  }

  private transient java.lang.Boolean isDeploymentFailed;

  /**
   * Gets the field isDeploymentFailed.
   * @return the value of the field isDeploymentFailed; may be null.
   */
  public java.lang.Boolean getIsDeploymentFailed()
  {
    return isDeploymentFailed;
  }

  /**
   * Sets the field isDeploymentFailed.
   * @param _isDeploymentFailed the new value of the field isDeploymentFailed.
   */
  public void setIsDeploymentFailed(java.lang.Boolean _isDeploymentFailed)
  {
    isDeploymentFailed = _isDeploymentFailed;
  }

  private transient ch.ivyteam.ivy.deployment.IDeploymentLogger log;

  /**
   * Gets the field log.
   * @return the value of the field log; may be null.
   */
  public ch.ivyteam.ivy.deployment.IDeploymentLogger getLog()
  {
    return log;
  }

  /**
   * Sets the field log.
   * @param _log the new value of the field log.
   */
  public void setLog(ch.ivyteam.ivy.deployment.IDeploymentLogger _log)
  {
    log = _log;
  }

  private transient java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

  private transient ch.ivyteam.ivy.application.IProcessModelVersion pmv;

  /**
   * Gets the field pmv.
   * @return the value of the field pmv; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModelVersion getPmv()
  {
    return pmv;
  }

  /**
   * Sets the field pmv.
   * @param _pmv the new value of the field pmv.
   */
  public void setPmv(ch.ivyteam.ivy.application.IProcessModelVersion _pmv)
  {
    pmv = _pmv;
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

  private transient java.lang.Integer indexLog;

  /**
   * Gets the field indexLog.
   * @return the value of the field indexLog; may be null.
   */
  public java.lang.Integer getIndexLog()
  {
    return indexLog;
  }

  /**
   * Sets the field indexLog.
   * @param _indexLog the new value of the field indexLog.
   */
  public void setIndexLog(java.lang.Integer _indexLog)
  {
    indexLog = _indexLog;
  }

}
