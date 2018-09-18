package ch.ivyteam.ivy.admin.tool.calendar;

import ivyadmintool.CalendarObject;

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.application.calendar.FreeDate;
import ch.ivyteam.ivy.application.calendar.FreeDayOfWeek;
import ch.ivyteam.ivy.application.calendar.FreeDayOfYear;
import ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;
import ch.ivyteam.ivy.application.calendar.WorkingTime;
import ch.ivyteam.ivy.environment.Ivy;

/**
 * Converter which converts {@link IBusinessCalendarConfiguration} date objects into {@link CalendarObject}
 * 
 * @author Reguel Wermelinger
 * @since 12.12.2011
 */
public final class CalendarObjectHelper {
  /**
   * Hide Utility Class Constructor
   */
  private CalendarObjectHelper() {
    super();
  }

  public static List<CalendarObject> convertEasterDays(IBusinessCalendarConfiguration configuration) {
    return getAllCalendarObjects(new FreeEasterRelativeDayConfiguration(), configuration);
  }

  public static List<CalendarObject> convertFreeDate(IBusinessCalendarConfiguration configuration) {
    return getAllCalendarObjects(new FreeDateConfiguration(), configuration);
  }

  public static List<CalendarObject> convertFreeDaysOfWeek(IBusinessCalendarConfiguration configuration) {
    return getAllCalendarObjects(new FreeDaysOfWeekConfiguration(), configuration);
  }

  public static List<CalendarObject> convertFreeDaysOfYear(IBusinessCalendarConfiguration configuration) {
    return getAllCalendarObjects(new FreeDayOfYearConfiguration(), configuration);
  }

  public static List<CalendarObject> convertWorkingTime(IBusinessCalendarConfiguration configuration) {
    return getAllCalendarObjects(new WorkingTimesConfiguration(), configuration);
  }

  private static List<CalendarObject> getAllCalendarObjects(FlatCalendarObjectConfiguration converter,
      IBusinessCalendarConfiguration configuration) {
    List<CalendarObject> calendarObjects = new ArrayList<CalendarObject>();
    calendarObjects.addAll(converter.getCalendarObjectsFromCurrent(configuration));
    calendarObjects.addAll(getParentCalendarObjects(converter, configuration));
    return calendarObjects;
  }

  private static List<CalendarObject> getParentCalendarObjects(FlatCalendarObjectConfiguration converter,
      IBusinessCalendarConfiguration configuration) {
    List<CalendarObject> parentObjects = new ArrayList<CalendarObject>();
    IBusinessCalendarConfiguration refConfiguration = configuration;
    while ((refConfiguration = refConfiguration.getParent()) != null) {
      for (CalendarObject inheritedObject : converter.getCalendarObjectsFromCurrent(refConfiguration)) {
        inheritedObject.setInherited(true);
        parentObjects.add(inheritedObject);
      }
    }
    return parentObjects;
  }


  private interface FlatCalendarObjectConfiguration {
    List<CalendarObject> getCalendarObjectsFromCurrent(IBusinessCalendarConfiguration configuration);
  }

  private static final class FreeDateConfiguration implements FlatCalendarObjectConfiguration {
    @Override
    public List<CalendarObject> getCalendarObjectsFromCurrent(IBusinessCalendarConfiguration configuration) {
      List<CalendarObject> calendarObjects = new ArrayList<CalendarObject>();
      for (FreeDate freeDate : configuration.getFreeDates()) {
        calendarObjects.add(convertFreeDate(freeDate));
      }
      return calendarObjects;
    }

    private CalendarObject convertFreeDate(FreeDate freeDate) {
      CalendarObject calObj = new CalendarObject();
      calObj.setDescription(freeDate.getDescription());
      calObj.setDay(freeDate.getDate().format("medium"));
      calObj.setValue(freeDate);
      return calObj;
    }
  }

  private static final class FreeDaysOfWeekConfiguration implements FlatCalendarObjectConfiguration {
    @Override
    public List<CalendarObject> getCalendarObjectsFromCurrent(IBusinessCalendarConfiguration configuration) {
      List<CalendarObject> calendarObjects = new ArrayList<CalendarObject>();
      for (FreeDayOfWeek freeDay : configuration.getFreeDaysOfWeek()) {
        calendarObjects.add(convertFreeDate(freeDay));
      }
      return calendarObjects;
    }

    private CalendarObject convertFreeDate(FreeDayOfWeek freeDay) {
      CalendarObject calObj = new CalendarObject();
      calObj.setDescription(freeDay.getDescription());
      String valueDescription = freeDay.getDayOfWeek().getLocalizedName(Ivy.session().getContentLocale());
      calObj.setDay(valueDescription);
      calObj.setValue(freeDay);
      return calObj;
    }
  }

  private static final class FreeDayOfYearConfiguration implements FlatCalendarObjectConfiguration {
    @Override
    public List<CalendarObject> getCalendarObjectsFromCurrent(IBusinessCalendarConfiguration configuration) {
      List<CalendarObject> calendarObjects = new ArrayList<CalendarObject>();
      for (FreeDayOfYear freeDay : configuration.getFreeDaysOfYear()) {
        calendarObjects.add(convertFreeDate(freeDay));
      }
      return calendarObjects;
    }

    private CalendarObject convertFreeDate(FreeDayOfYear freeDay) {
      CalendarObject calObj = new CalendarObject();
      calObj.setDescription(freeDay.getDescription());
      calObj.setDay(freeDay.getDay() + "." + freeDay.getMonth() + ".");
      calObj.setValue(freeDay);
      return calObj;
    }
  }

  private static final class FreeEasterRelativeDayConfiguration implements FlatCalendarObjectConfiguration {
    @Override
    public List<CalendarObject> getCalendarObjectsFromCurrent(IBusinessCalendarConfiguration configuration) {
      List<CalendarObject> calendarObjects = new ArrayList<CalendarObject>();
      for (FreeEasterRelativeDay freeDay : configuration.getFreeEasterRelativeDays()) {
        calendarObjects.add(convertFreeDate(freeDay));
      }
      return calendarObjects;
    }

    private CalendarObject convertFreeDate(FreeEasterRelativeDay freeDay) {
      CalendarObject calObj = new CalendarObject();
      calObj.setDescription(freeDay.getDescription());
      calObj.setDay(String.valueOf(freeDay.getDaysSinceEaster()));
      calObj.setValue(freeDay);
      return calObj;
    }
  }

  private static final class WorkingTimesConfiguration implements FlatCalendarObjectConfiguration {
    @Override
    public List<CalendarObject> getCalendarObjectsFromCurrent(IBusinessCalendarConfiguration configuration) {
      List<CalendarObject> calendarObjects = new ArrayList<CalendarObject>();
      for (WorkingTime workingTime : configuration.getWorkingTimes()) {
        calendarObjects.add(convertFreeDate(workingTime));
      }
      return calendarObjects;
    }

    private CalendarObject convertFreeDate(WorkingTime workingTime) {
      CalendarObject calObj = new CalendarObject();
      calObj.setDescription(workingTime.getDescription());
      calObj.setDay(workingTime.getStart().format("short") + " - " + workingTime.getEnd().format("short"));
      calObj.setValue(workingTime);
      return calObj;
    }
  }

}
