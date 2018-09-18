package ch.ivyteam.ivy.admin.tool.process;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ImportEnvironment", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ImportEnvironment extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7197650231526508098L;

  private transient ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment sourceEnvironment;

  /**
   * Gets the field sourceEnvironment.
   * @return the value of the field sourceEnvironment; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment getSourceEnvironment()
  {
    return sourceEnvironment;
  }

  /**
   * Sets the field sourceEnvironment.
   * @param _sourceEnvironment the new value of the field sourceEnvironment.
   */
  public void setSourceEnvironment(ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment _sourceEnvironment)
  {
    sourceEnvironment = _sourceEnvironment;
  }

  private transient ch.ivyteam.ivy.application.restricted.IEnvironment targetEnvironment;

  /**
   * Gets the field targetEnvironment.
   * @return the value of the field targetEnvironment; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IEnvironment getTargetEnvironment()
  {
    return targetEnvironment;
  }

  /**
   * Sets the field targetEnvironment.
   * @param _targetEnvironment the new value of the field targetEnvironment.
   */
  public void setTargetEnvironment(ch.ivyteam.ivy.application.restricted.IEnvironment _targetEnvironment)
  {
    targetEnvironment = _targetEnvironment;
  }

}
