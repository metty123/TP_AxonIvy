package ch.ivyteam.ivy.admin.tool.report;

import java.util.List;

/**
 * Summary entry for statistic number of <code>ReportEntry</code> in each <code>ReportStatus</code>
 * 
 */
public interface ISummaryEntry {

  /**
   * Get name of the entry (see the constructor of implemented class)
   */
  String getName();

  /**
   * Get all the children entry
   * 
   * @return
   */
  List<ISummaryEntry> getChildren();

  /**
   * Get the child entry If the child entry is not existed, new child entry will be created
   * 
   * @param name
   * @return not <code>null</code>
   */
  ISummaryEntry getChild(String name);

  /**
   * Get number of ReportEntry that has ReportStatus as SUCCESS
   */
  int getNumOfSuccess();

  /**
   * Get number of ReportEntry that has ReportStatus as WARNING
   */
  int getNumOfWarning();

  /**
   * Get number of ReportEntry that has ReportStatus as ERROR
   */
  int getNumOfError();

}
