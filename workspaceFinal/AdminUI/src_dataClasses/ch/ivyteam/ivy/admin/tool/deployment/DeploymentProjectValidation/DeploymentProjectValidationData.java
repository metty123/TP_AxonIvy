package ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DeploymentProjectValidationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DeploymentProjectValidationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8214230344796841264L;

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

  private java.io.File projectDirectory;

  /**
   * Gets the field projectDirectory.
   * @return the value of the field projectDirectory; may be null.
   */
  public java.io.File getProjectDirectory()
  {
    return projectDirectory;
  }

  /**
   * Sets the field projectDirectory.
   * @param _projectDirectory the new value of the field projectDirectory.
   */
  public void setProjectDirectory(java.io.File _projectDirectory)
  {
    projectDirectory = _projectDirectory;
  }

  private ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeploymentValidator validator;

  /**
   * Gets the field validator.
   * @return the value of the field validator; may be null.
   */
  public ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeploymentValidator getValidator()
  {
    return validator;
  }

  /**
   * Sets the field validator.
   * @param _validator the new value of the field validator.
   */
  public void setValidator(ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeploymentValidator _validator)
  {
    validator = _validator;
  }

  private ch.ivyteam.ivy.scripting.objects.Tree checksAndIssuesTree;

  /**
   * Gets the field checksAndIssuesTree.
   * @return the value of the field checksAndIssuesTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getChecksAndIssuesTree()
  {
    return checksAndIssuesTree;
  }

  /**
   * Sets the field checksAndIssuesTree.
   * @param _checksAndIssuesTree the new value of the field checksAndIssuesTree.
   */
  public void setChecksAndIssuesTree(ch.ivyteam.ivy.scripting.objects.Tree _checksAndIssuesTree)
  {
    checksAndIssuesTree = _checksAndIssuesTree;
  }

  private ch.ivyteam.ivy.scripting.objects.Tree selectedTreeNode;

  /**
   * Gets the field selectedTreeNode.
   * @return the value of the field selectedTreeNode; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getSelectedTreeNode()
  {
    return selectedTreeNode;
  }

  /**
   * Sets the field selectedTreeNode.
   * @param _selectedTreeNode the new value of the field selectedTreeNode.
   */
  public void setSelectedTreeNode(ch.ivyteam.ivy.scripting.objects.Tree _selectedTreeNode)
  {
    selectedTreeNode = _selectedTreeNode;
  }

}
