package ch.ivyteam.ivy.admin.tool.LibraryDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LibraryDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LibraryDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8692736869921452645L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrary> dependentPmv;

  /**
   * Gets the field dependentPmv.
   * @return the value of the field dependentPmv; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrary> getDependentPmv()
  {
    return dependentPmv;
  }

  /**
   * Sets the field dependentPmv.
   * @param _dependentPmv the new value of the field dependentPmv.
   */
  public void setDependentPmv(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrary> _dependentPmv)
  {
    dependentPmv = _dependentPmv;
  }

  private transient java.lang.Boolean isActivate;

  /**
   * Gets the field isActivate.
   * @return the value of the field isActivate; may be null.
   */
  public java.lang.Boolean getIsActivate()
  {
    return isActivate;
  }

  /**
   * Sets the field isActivate.
   * @param _isActivate the new value of the field isActivate.
   */
  public void setIsActivate(java.lang.Boolean _isActivate)
  {
    isActivate = _isActivate;
  }

  private transient java.lang.String libraryId;

  /**
   * Gets the field libraryId.
   * @return the value of the field libraryId; may be null.
   */
  public java.lang.String getLibraryId()
  {
    return libraryId;
  }

  /**
   * Sets the field libraryId.
   * @param _libraryId the new value of the field libraryId.
   */
  public void setLibraryId(java.lang.String _libraryId)
  {
    libraryId = _libraryId;
  }

  private transient ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion;

  /**
   * Gets the field processModelVersion.
   * @return the value of the field processModelVersion; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModelVersion getProcessModelVersion()
  {
    return processModelVersion;
  }

  /**
   * Sets the field processModelVersion.
   * @param _processModelVersion the new value of the field processModelVersion.
   */
  public void setProcessModelVersion(ch.ivyteam.ivy.application.IProcessModelVersion _processModelVersion)
  {
    processModelVersion = _processModelVersion;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrarySpecification> requiredPmv;

  /**
   * Gets the field requiredPmv.
   * @return the value of the field requiredPmv; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrarySpecification> getRequiredPmv()
  {
    return requiredPmv;
  }

  /**
   * Sets the field requiredPmv.
   * @param _requiredPmv the new value of the field requiredPmv.
   */
  public void setRequiredPmv(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.ILibrarySpecification> _requiredPmv)
  {
    requiredPmv = _requiredPmv;
  }

}
