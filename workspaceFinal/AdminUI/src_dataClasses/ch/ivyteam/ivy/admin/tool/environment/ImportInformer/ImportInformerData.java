package ch.ivyteam.ivy.admin.tool.environment.ImportInformer;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ImportInformerData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ImportInformerData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4448433685111916608L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> environments;

  /**
   * Gets the field environments.
   * @return the value of the field environments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> getEnvironments()
  {
    return environments;
  }

  /**
   * Sets the field environments.
   * @param _environments the new value of the field environments.
   */
  public void setEnvironments(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> _environments)
  {
    environments = _environments;
  }

  private transient java.lang.String errorMessage;

  /**
   * Gets the field errorMessage.
   * @return the value of the field errorMessage; may be null.
   */
  public java.lang.String getErrorMessage()
  {
    return errorMessage;
  }

  /**
   * Sets the field errorMessage.
   * @param _errorMessage the new value of the field errorMessage.
   */
  public void setErrorMessage(java.lang.String _errorMessage)
  {
    errorMessage = _errorMessage;
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

  private transient ch.ivyteam.ivy.scripting.objects.Recordset importEnvironments;

  /**
   * Gets the field importEnvironments.
   * @return the value of the field importEnvironments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getImportEnvironments()
  {
    return importEnvironments;
  }

  /**
   * Sets the field importEnvironments.
   * @param _importEnvironments the new value of the field importEnvironments.
   */
  public void setImportEnvironments(ch.ivyteam.ivy.scripting.objects.Recordset _importEnvironments)
  {
    importEnvironments = _importEnvironments;
  }

  private transient java.lang.Boolean isValid;

  /**
   * Gets the field isValid.
   * @return the value of the field isValid; may be null.
   */
  public java.lang.Boolean getIsValid()
  {
    return isValid;
  }

  /**
   * Sets the field isValid.
   * @param _isValid the new value of the field isValid.
   */
  public void setIsValid(java.lang.Boolean _isValid)
  {
    isValid = _isValid;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> newEnvironments;

  /**
   * Gets the field newEnvironments.
   * @return the value of the field newEnvironments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getNewEnvironments()
  {
    return newEnvironments;
  }

  /**
   * Sets the field newEnvironments.
   * @param _newEnvironments the new value of the field newEnvironments.
   */
  public void setNewEnvironments(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _newEnvironments)
  {
    newEnvironments = _newEnvironments;
  }

  private transient ch.ivyteam.ivy.application.IApplication selectedApplication;

  /**
   * Gets the field selectedApplication.
   * @return the value of the field selectedApplication; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getSelectedApplication()
  {
    return selectedApplication;
  }

  /**
   * Sets the field selectedApplication.
   * @param _selectedApplication the new value of the field selectedApplication.
   */
  public void setSelectedApplication(ch.ivyteam.ivy.application.IApplication _selectedApplication)
  {
    selectedApplication = _selectedApplication;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.process.ImportEnvironment> selectedEnvironments;

  /**
   * Gets the field selectedEnvironments.
   * @return the value of the field selectedEnvironments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.process.ImportEnvironment> getSelectedEnvironments()
  {
    return selectedEnvironments;
  }

  /**
   * Sets the field selectedEnvironments.
   * @param _selectedEnvironments the new value of the field selectedEnvironments.
   */
  public void setSelectedEnvironments(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.process.ImportEnvironment> _selectedEnvironments)
  {
    selectedEnvironments = _selectedEnvironments;
  }

  private transient java.lang.Integer selection;

  /**
   * Gets the field selection.
   * @return the value of the field selection; may be null.
   */
  public java.lang.Integer getSelection()
  {
    return selection;
  }

  /**
   * Sets the field selection.
   * @param _selection the new value of the field selection.
   */
  public void setSelection(java.lang.Integer _selection)
  {
    selection = _selection;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> targetEnvironments;

  /**
   * Gets the field targetEnvironments.
   * @return the value of the field targetEnvironments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> getTargetEnvironments()
  {
    return targetEnvironments;
  }

  /**
   * Sets the field targetEnvironments.
   * @param _targetEnvironments the new value of the field targetEnvironments.
   */
  public void setTargetEnvironments(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.restricted.IEnvironment> _targetEnvironments)
  {
    targetEnvironments = _targetEnvironments;
  }

  private java.lang.Exception exception;

  /**
   * Gets the field exception.
   * @return the value of the field exception; may be null.
   */
  public java.lang.Exception getException()
  {
    return exception;
  }

  /**
   * Sets the field exception.
   * @param _exception the new value of the field exception.
   */
  public void setException(java.lang.Exception _exception)
  {
    exception = _exception;
  }

}
