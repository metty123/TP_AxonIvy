package ch.ivyteam.ivy.admin.tool.environment.EnvironmentExport;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EnvironmentExportData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EnvironmentExportData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -676600186394498111L;

  private transient ch.ivyteam.ivy.admin.tool.report.IReport report;

  /**
   * Gets the field report.
   * @return the value of the field report; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.report.IReport getReport()
  {
    return report;
  }

  /**
   * Sets the field report.
   * @param _report the new value of the field report.
   */
  public void setReport(ch.ivyteam.ivy.admin.tool.report.IReport _report)
  {
    report = _report;
  }

  private transient ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile file;

  /**
   * Gets the field file.
   * @return the value of the field file; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile getFile()
  {
    return file;
  }

  /**
   * Sets the field file.
   * @param _file the new value of the field file.
   */
  public void setFile(ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile _file)
  {
    file = _file;
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

  private transient java.io.File serverExportResultFile;

  /**
   * Gets the field serverExportResultFile.
   * @return the value of the field serverExportResultFile; may be null.
   */
  public java.io.File getServerExportResultFile()
  {
    return serverExportResultFile;
  }

  /**
   * Sets the field serverExportResultFile.
   * @param _serverExportResultFile the new value of the field serverExportResultFile.
   */
  public void setServerExportResultFile(java.io.File _serverExportResultFile)
  {
    serverExportResultFile = _serverExportResultFile;
  }

  private transient ch.ivyteam.ivy.common.util.FileTransferResult fileTransferResult;

  /**
   * Gets the field fileTransferResult.
   * @return the value of the field fileTransferResult; may be null.
   */
  public ch.ivyteam.ivy.common.util.FileTransferResult getFileTransferResult()
  {
    return fileTransferResult;
  }

  /**
   * Sets the field fileTransferResult.
   * @param _fileTransferResult the new value of the field fileTransferResult.
   */
  public void setFileTransferResult(ch.ivyteam.ivy.common.util.FileTransferResult _fileTransferResult)
  {
    fileTransferResult = _fileTransferResult;
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

}
