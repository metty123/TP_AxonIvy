package ch.ivyteam.ivy.admin.tool.domain.util;

import java.io.File;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.report.IReport;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

/**
 * Parameter object for import/export function
 */
public class SaieParameter {
  private List<NonExistedEnvironment> fNonExistedEnv;
  private List<IEnvironment> fEnvironments;
  private File fFile;
  private IReport fReport;
  private File fReportFile;
  private boolean fIsIncludeUsernameAndPassword;

  public SaieParameter() {
    super();
  }

  /**
   * 
   * @param environments list of environment to handle
   * @param file file in system to import/export
   * @param report report of import/export
   * @param reportFile report file
   */
  public SaieParameter(List<IEnvironment> environments, File file, IReport report, File reportFile) {
    super();
    this.fEnvironments = environments;
    this.fFile = file;
    this.fReport = report;
    this.fReportFile = reportFile;
  }

  public List<IEnvironment> getEnvironments() {
    return fEnvironments;
  }

  public void setEnvironments(List<IEnvironment> environments) {
    this.fEnvironments = environments;
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

  public void setNonExistedEnv(List<NonExistedEnvironment> fNonExistedEnv) {
    this.fNonExistedEnv = fNonExistedEnv;
  }

  public List<NonExistedEnvironment> getNonExistedEnv() {
    return fNonExistedEnv;
  }
}
