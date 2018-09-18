package ch.ivyteam.ivy.admin.tool.domain.util;

import java.io.File;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.process.ImportEnvironment;
import ch.ivyteam.ivy.admin.tool.report.IReport;

/**
 * Parameter object for import/export function
 */
public class SaieImportParameter {

  private List<ImportEnvironment> fSelectedEnvironments;
  private File fFile;
  private IReport fReport;
  private File fReportFile;
  private boolean fIsIncludeUsernameAndPassword;

  public SaieImportParameter() {

  }

  /**
   * 
   * @param environments list of environment to handle
   * @param file file in system to import/export
   * @param report report of import/export
   * @param reportFile report file
   */
  public SaieImportParameter(List<ImportEnvironment> selectedEnvironments, File file, IReport report, File reportFile) {
    fSelectedEnvironments = selectedEnvironments;
    fFile = file;
    fReport = report;
    fReportFile = reportFile;
  }

  public File getFile() {
    return fFile;
  }

  public void setFile(File file) {
    this.fFile = file;
  }

  public IReport getReport() {
    return fReport;
  }

  public void setReport(IReport report) {
    this.fReport = report;
  }

  public File getReportFile() {
    return fReportFile;
  }

  public void setReportFile(File reportFile) {
    this.fReportFile = reportFile;
  }

  public void setIncludeUsernameAndPassword(boolean isIncludeUsernameAndPassword) {
    fIsIncludeUsernameAndPassword = isIncludeUsernameAndPassword;
  }

  public boolean isIncludeUsernameAndPassword() {
    return fIsIncludeUsernameAndPassword;
  }

  public List<ImportEnvironment> getSelectedEnvironments() {
    return fSelectedEnvironments;
  }

  public void setSelectedEnvironments(List<ImportEnvironment> fSelectedEnvironments) {
    this.fSelectedEnvironments = fSelectedEnvironments;
  }
}
