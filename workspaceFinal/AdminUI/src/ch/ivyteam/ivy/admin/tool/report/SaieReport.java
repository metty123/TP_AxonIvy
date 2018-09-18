package ch.ivyteam.ivy.admin.tool.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Report for SAIE
 */
public class SaieReport implements IReport {
  private List<ReportEntry> reportEntries;

  public SaieReport() {
    this.reportEntries = new ArrayList<ReportEntry>();
  }

  @Override
  public void update(Observable paramObservable, Object paramObject) {
    if (paramObject instanceof ReportEntry) {
      reportEntries.add((ReportEntry) paramObject);
    }
  }

  @Override
  public List<ReportEntry> pollAll() {
    List<ReportEntry> returnValue = new ArrayList<ReportEntry>(reportEntries);
    reportEntries.clear();

    return returnValue;
  }

}
