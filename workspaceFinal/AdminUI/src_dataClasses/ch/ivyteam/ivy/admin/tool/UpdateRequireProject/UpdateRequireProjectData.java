package ch.ivyteam.ivy.admin.tool.UpdateRequireProject;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UpdateRequireProjectData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UpdateRequireProjectData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 7050699344575473271L;

  private transient java.lang.Boolean isSuccess;

  /**
   * Gets the field isSuccess.
   * @return the value of the field isSuccess; may be null.
   */
  public java.lang.Boolean getIsSuccess()
  {
    return isSuccess;
  }

  /**
   * Sets the field isSuccess.
   * @param _isSuccess the new value of the field isSuccess.
   */
  public void setIsSuccess(java.lang.Boolean _isSuccess)
  {
    isSuccess = _isSuccess;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrary> matchLib;

  /**
   * Gets the field matchLib.
   * @return the value of the field matchLib; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrary> getMatchLib()
  {
    return matchLib;
  }

  /**
   * Sets the field matchLib.
   * @param _matchLib the new value of the field matchLib.
   */
  public void setMatchLib(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrary> _matchLib)
  {
    matchLib = _matchLib;
  }

  private transient ch.ivyteam.ivy.application.ILibrarySpecification resolvedLibSpec;

  /**
   * Gets the field resolvedLibSpec.
   * @return the value of the field resolvedLibSpec; may be null.
   */
  public ch.ivyteam.ivy.application.ILibrarySpecification getResolvedLibSpec()
  {
    return resolvedLibSpec;
  }

  /**
   * Sets the field resolvedLibSpec.
   * @param _resolvedLibSpec the new value of the field resolvedLibSpec.
   */
  public void setResolvedLibSpec(ch.ivyteam.ivy.application.ILibrarySpecification _resolvedLibSpec)
  {
    resolvedLibSpec = _resolvedLibSpec;
  }

  private transient ch.ivyteam.ivy.application.ILibrary selectedLib;

  /**
   * Gets the field selectedLib.
   * @return the value of the field selectedLib; may be null.
   */
  public ch.ivyteam.ivy.application.ILibrary getSelectedLib()
  {
    return selectedLib;
  }

  /**
   * Sets the field selectedLib.
   * @param _selectedLib the new value of the field selectedLib.
   */
  public void setSelectedLib(ch.ivyteam.ivy.application.ILibrary _selectedLib)
  {
    selectedLib = _selectedLib;
  }

}
