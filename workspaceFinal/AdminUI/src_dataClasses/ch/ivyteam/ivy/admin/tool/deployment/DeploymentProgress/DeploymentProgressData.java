package ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DeploymentProgressData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DeploymentProgressData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4437965854172125687L;

  private ch.ivyteam.ivy.application.IProcessModelVersion pmv;

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

  private ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeployment deployer;

  /**
   * Gets the field deployer.
   * @return the value of the field deployer; may be null.
   */
  public ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeployment getDeployer()
  {
    return deployer;
  }

  /**
   * Sets the field deployer.
   * @param _deployer the new value of the field deployer.
   */
  public void setDeployer(ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeployment _deployer)
  {
    deployer = _deployer;
  }

  private java.io.File file;

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

}
