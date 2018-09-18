package ch.ivyteam.ivy.admin.tool.deployment.IssueDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class IssueDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class IssueDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8132804047213013209L;

  private ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue issue;

  /**
   * Gets the field issue.
   * @return the value of the field issue; may be null.
   */
  public ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue getIssue()
  {
    return issue;
  }

  /**
   * Sets the field issue.
   * @param _issue the new value of the field issue.
   */
  public void setIssue(ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue _issue)
  {
    issue = _issue;
  }

}
