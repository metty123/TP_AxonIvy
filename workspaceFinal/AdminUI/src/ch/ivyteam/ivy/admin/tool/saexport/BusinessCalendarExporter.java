package ch.ivyteam.ivy.admin.tool.saexport;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.BusinessCalendar;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.calendar.IDefaultBusinessCalendar;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

public class BusinessCalendarExporter extends AbstractExporter {

  @Override
  protected void createEnvironment(IEnvironment iEnvironment, Environment environment, ReportObservable report,
      boolean isIncludeUsernameAndPassword) {
    BusinessCalendar xmlCalendar = new BusinessCalendar();
    IApplication app = iEnvironment.getApplication();
    String defaultName = app.getBusinessCalendarSettings().getRootBusinessCalendarConfiguration().getName();
    IDefaultBusinessCalendar calendar = iEnvironment.getBusinessCalendar();
    report.startLog(iEnvironment.getName(), ConfigType.BUSINESS_CALENDAR);
    if (!iEnvironment.getBusinessCalendar().getName().equals(defaultName)) {
      xmlCalendar.setName(calendar.getName());
      environment.setBusinessCalendar(xmlCalendar);
      report.log(new ReportEntry(ReportStatus.SUCCESS, ActionType.EXPORT, iEnvironment.getName(),
          ConfigType.BUSINESS_CALENDAR, calendar.getName(), ""));
    }
  }
}
