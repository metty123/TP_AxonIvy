package ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CalendarDetailData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CalendarDetailData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3497632625761404697L;

  private ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings settings;

  /**
   * Gets the field settings.
   * @return the value of the field settings; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings getSettings()
  {
    return settings;
  }

  /**
   * Sets the field settings.
   * @param _settings the new value of the field settings.
   */
  public void setSettings(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings _settings)
  {
    settings = _settings;
  }

  private ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration calendar;

  /**
   * Gets the field calendar.
   * @return the value of the field calendar; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration getCalendar()
  {
    return calendar;
  }

  /**
   * Sets the field calendar.
   * @param _calendar the new value of the field calendar.
   */
  public void setCalendar(ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration _calendar)
  {
    calendar = _calendar;
  }

  private ch.ivyteam.util.date.Weekday firstDayOfWeek;

  /**
   * Gets the field firstDayOfWeek.
   * @return the value of the field firstDayOfWeek; may be null.
   */
  public ch.ivyteam.util.date.Weekday getFirstDayOfWeek()
  {
    return firstDayOfWeek;
  }

  /**
   * Sets the field firstDayOfWeek.
   * @param _firstDayOfWeek the new value of the field firstDayOfWeek.
   */
  public void setFirstDayOfWeek(ch.ivyteam.util.date.Weekday _firstDayOfWeek)
  {
    firstDayOfWeek = _firstDayOfWeek;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> workingTimes;

  /**
   * Gets the field workingTimes.
   * @return the value of the field workingTimes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> getWorkingTimes()
  {
    return workingTimes;
  }

  /**
   * Sets the field workingTimes.
   * @param _workingTimes the new value of the field workingTimes.
   */
  public void setWorkingTimes(ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> _workingTimes)
  {
    workingTimes = _workingTimes;
  }

  private ivyadmintool.CalendarObject selectedWorkingTime;

  /**
   * Gets the field selectedWorkingTime.
   * @return the value of the field selectedWorkingTime; may be null.
   */
  public ivyadmintool.CalendarObject getSelectedWorkingTime()
  {
    return selectedWorkingTime;
  }

  /**
   * Sets the field selectedWorkingTime.
   * @param _selectedWorkingTime the new value of the field selectedWorkingTime.
   */
  public void setSelectedWorkingTime(ivyadmintool.CalendarObject _selectedWorkingTime)
  {
    selectedWorkingTime = _selectedWorkingTime;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> freeDaysOfWeek;

  /**
   * Gets the field freeDaysOfWeek.
   * @return the value of the field freeDaysOfWeek; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> getFreeDaysOfWeek()
  {
    return freeDaysOfWeek;
  }

  /**
   * Sets the field freeDaysOfWeek.
   * @param _freeDaysOfWeek the new value of the field freeDaysOfWeek.
   */
  public void setFreeDaysOfWeek(ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> _freeDaysOfWeek)
  {
    freeDaysOfWeek = _freeDaysOfWeek;
  }

  private ivyadmintool.CalendarObject selectedFreeDayOfWeek;

  /**
   * Gets the field selectedFreeDayOfWeek.
   * @return the value of the field selectedFreeDayOfWeek; may be null.
   */
  public ivyadmintool.CalendarObject getSelectedFreeDayOfWeek()
  {
    return selectedFreeDayOfWeek;
  }

  /**
   * Sets the field selectedFreeDayOfWeek.
   * @param _selectedFreeDayOfWeek the new value of the field selectedFreeDayOfWeek.
   */
  public void setSelectedFreeDayOfWeek(ivyadmintool.CalendarObject _selectedFreeDayOfWeek)
  {
    selectedFreeDayOfWeek = _selectedFreeDayOfWeek;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> freeDaysOfYear;

  /**
   * Gets the field freeDaysOfYear.
   * @return the value of the field freeDaysOfYear; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> getFreeDaysOfYear()
  {
    return freeDaysOfYear;
  }

  /**
   * Sets the field freeDaysOfYear.
   * @param _freeDaysOfYear the new value of the field freeDaysOfYear.
   */
  public void setFreeDaysOfYear(ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> _freeDaysOfYear)
  {
    freeDaysOfYear = _freeDaysOfYear;
  }

  private ivyadmintool.CalendarObject selectedFreeDayOfYear;

  /**
   * Gets the field selectedFreeDayOfYear.
   * @return the value of the field selectedFreeDayOfYear; may be null.
   */
  public ivyadmintool.CalendarObject getSelectedFreeDayOfYear()
  {
    return selectedFreeDayOfYear;
  }

  /**
   * Sets the field selectedFreeDayOfYear.
   * @param _selectedFreeDayOfYear the new value of the field selectedFreeDayOfYear.
   */
  public void setSelectedFreeDayOfYear(ivyadmintool.CalendarObject _selectedFreeDayOfYear)
  {
    selectedFreeDayOfYear = _selectedFreeDayOfYear;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> freeEasterRelativeDays;

  /**
   * Gets the field freeEasterRelativeDays.
   * @return the value of the field freeEasterRelativeDays; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> getFreeEasterRelativeDays()
  {
    return freeEasterRelativeDays;
  }

  /**
   * Sets the field freeEasterRelativeDays.
   * @param _freeEasterRelativeDays the new value of the field freeEasterRelativeDays.
   */
  public void setFreeEasterRelativeDays(ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> _freeEasterRelativeDays)
  {
    freeEasterRelativeDays = _freeEasterRelativeDays;
  }

  private ivyadmintool.CalendarObject selectedFreeEeasterRelativeDay;

  /**
   * Gets the field selectedFreeEeasterRelativeDay.
   * @return the value of the field selectedFreeEeasterRelativeDay; may be null.
   */
  public ivyadmintool.CalendarObject getSelectedFreeEeasterRelativeDay()
  {
    return selectedFreeEeasterRelativeDay;
  }

  /**
   * Sets the field selectedFreeEeasterRelativeDay.
   * @param _selectedFreeEeasterRelativeDay the new value of the field selectedFreeEeasterRelativeDay.
   */
  public void setSelectedFreeEeasterRelativeDay(ivyadmintool.CalendarObject _selectedFreeEeasterRelativeDay)
  {
    selectedFreeEeasterRelativeDay = _selectedFreeEeasterRelativeDay;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> freeDates;

  /**
   * Gets the field freeDates.
   * @return the value of the field freeDates; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> getFreeDates()
  {
    return freeDates;
  }

  /**
   * Sets the field freeDates.
   * @param _freeDates the new value of the field freeDates.
   */
  public void setFreeDates(ch.ivyteam.ivy.scripting.objects.List<ivyadmintool.CalendarObject> _freeDates)
  {
    freeDates = _freeDates;
  }

  private ivyadmintool.CalendarObject selectedFreeDate;

  /**
   * Gets the field selectedFreeDate.
   * @return the value of the field selectedFreeDate; may be null.
   */
  public ivyadmintool.CalendarObject getSelectedFreeDate()
  {
    return selectedFreeDate;
  }

  /**
   * Sets the field selectedFreeDate.
   * @param _selectedFreeDate the new value of the field selectedFreeDate.
   */
  public void setSelectedFreeDate(ivyadmintool.CalendarObject _selectedFreeDate)
  {
    selectedFreeDate = _selectedFreeDate;
  }

}
