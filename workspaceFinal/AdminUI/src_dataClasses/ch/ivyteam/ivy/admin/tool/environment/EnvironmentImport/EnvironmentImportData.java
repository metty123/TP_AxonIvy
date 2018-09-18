package ch.ivyteam.ivy.admin.tool.environment.EnvironmentImport;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EnvironmentImportData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EnvironmentImportData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3509568323562113708L;

  private transient ch.ivyteam.ivy.application.IApplication application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivyteam.ivy.application.IApplication _application)
  {
    application = _application;
  }

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

  private transient java.lang.Exception exception;

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

  private transient ch.ivyteam.ivy.common.util.FileTransferResult fileResult;

  /**
   * Gets the field fileResult.
   * @return the value of the field fileResult; may be null.
   */
  public ch.ivyteam.ivy.common.util.FileTransferResult getFileResult()
  {
    return fileResult;
  }

  /**
   * Sets the field fileResult.
   * @param _fileResult the new value of the field fileResult.
   */
  public void setFileResult(ch.ivyteam.ivy.common.util.FileTransferResult _fileResult)
  {
    fileResult = _fileResult;
  }

  private transient ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile importFile;

  /**
   * Gets the field importFile.
   * @return the value of the field importFile; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile getImportFile()
  {
    return importFile;
  }

  /**
   * Sets the field importFile.
   * @param _importFile the new value of the field importFile.
   */
  public void setImportFile(ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile _importFile)
  {
    importFile = _importFile;
  }

  private transient java.lang.Integer informSelection;

  /**
   * Gets the field informSelection.
   * @return the value of the field informSelection; may be null.
   */
  public java.lang.Integer getInformSelection()
  {
    return informSelection;
  }

  /**
   * Sets the field informSelection.
   * @param _informSelection the new value of the field informSelection.
   */
  public void setInformSelection(java.lang.Integer _informSelection)
  {
    informSelection = _informSelection;
  }

  private transient java.lang.Boolean isImportApp;

  /**
   * Gets the field isImportApp.
   * @return the value of the field isImportApp; may be null.
   */
  public java.lang.Boolean getIsImportApp()
  {
    return isImportApp;
  }

  /**
   * Sets the field isImportApp.
   * @param _isImportApp the new value of the field isImportApp.
   */
  public void setIsImportApp(java.lang.Boolean _isImportApp)
  {
    isImportApp = _isImportApp;
  }

  private transient ch.ivyteam.ivy.admin.tool.report.SaieReport report;

  /**
   * Gets the field report.
   * @return the value of the field report; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.report.SaieReport getReport()
  {
    return report;
  }

  /**
   * Sets the field report.
   * @param _report the new value of the field report.
   */
  public void setReport(ch.ivyteam.ivy.admin.tool.report.SaieReport _report)
  {
    report = _report;
  }

  private transient ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile reportFile;

  /**
   * Gets the field reportFile.
   * @return the value of the field reportFile; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile getReportFile()
  {
    return reportFile;
  }

  /**
   * Sets the field reportFile.
   * @param _reportFile the new value of the field reportFile.
   */
  public void setReportFile(ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile _reportFile)
  {
    reportFile = _reportFile;
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

  private transient ch.ivyteam.ivy.scripting.objects.File serverReportFile;

  /**
   * Gets the field serverReportFile.
   * @return the value of the field serverReportFile; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.File getServerReportFile()
  {
    return serverReportFile;
  }

  /**
   * Sets the field serverReportFile.
   * @param _serverReportFile the new value of the field serverReportFile.
   */
  public void setServerReportFile(ch.ivyteam.ivy.scripting.objects.File _serverReportFile)
  {
    serverReportFile = _serverReportFile;
  }

  private transient java.lang.Boolean success;

  /**
   * Gets the field success.
   * @return the value of the field success; may be null.
   */
  public java.lang.Boolean getSuccess()
  {
    return success;
  }

  /**
   * Sets the field success.
   * @param _success the new value of the field success.
   */
  public void setSuccess(java.lang.Boolean _success)
  {
    success = _success;
  }

  private transient java.io.File tempImportFile;

  /**
   * Gets the field tempImportFile.
   * @return the value of the field tempImportFile; may be null.
   */
  public java.io.File getTempImportFile()
  {
    return tempImportFile;
  }

  /**
   * Sets the field tempImportFile.
   * @param _tempImportFile the new value of the field tempImportFile.
   */
  public void setTempImportFile(java.io.File _tempImportFile)
  {
    tempImportFile = _tempImportFile;
  }

}
