package ch.ivyteam.ivy.admin.tool.report;

import java.util.List;
import java.util.Observer;

/**
 * Just an observer
 */
public interface IReport extends Observer {
  /**
   * Get all ReportEntry and empty it
   * 
   * @return all the ReportEntry
   */
  List<ReportEntry> pollAll();
}
