package ch.ivyteam.ivy.admin.tool.report.LogViewer;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LogViewerData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LogViewerData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5145509171551675819L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.report.ReportEntry> dataList;

  /**
   * Gets the field dataList.
   * @return the value of the field dataList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.report.ReportEntry> getDataList()
  {
    return dataList;
  }

  /**
   * Sets the field dataList.
   * @param _dataList the new value of the field dataList.
   */
  public void setDataList(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.report.ReportEntry> _dataList)
  {
    dataList = _dataList;
  }

  private transient ch.ivyteam.ivy.admin.tool.report.IReport reports;

  /**
   * Gets the field reports.
   * @return the value of the field reports; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.report.IReport getReports()
  {
    return reports;
  }

  /**
   * Sets the field reports.
   * @param _reports the new value of the field reports.
   */
  public void setReports(ch.ivyteam.ivy.admin.tool.report.IReport _reports)
  {
    reports = _reports;
  }

}
