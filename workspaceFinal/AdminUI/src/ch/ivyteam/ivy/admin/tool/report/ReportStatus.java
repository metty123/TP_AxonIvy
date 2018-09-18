package ch.ivyteam.ivy.admin.tool.report;

/**
 * Indicate the information type in report entry
 */
public enum ReportStatus {
  SUCCESS("Success"), WARNING("Warning"), ERROR("Error");
  private String name;

  private ReportStatus(String pName) {
    this.name = pName;
  }

  @Override
  public String toString() {
    return name;
  }

}
