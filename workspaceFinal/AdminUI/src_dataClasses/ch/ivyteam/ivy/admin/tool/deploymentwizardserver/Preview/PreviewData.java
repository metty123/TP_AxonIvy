package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PreviewData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PreviewData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5817971987493426821L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectToDeploy;

  /**
   * Gets the field projectToDeploy.
   * @return the value of the field projectToDeploy; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> getProjectToDeploy()
  {
    return projectToDeploy;
  }

  /**
   * Sets the field projectToDeploy.
   * @param _projectToDeploy the new value of the field projectToDeploy.
   */
  public void setProjectToDeploy(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> _projectToDeploy)
  {
    projectToDeploy = _projectToDeploy;
  }

}
