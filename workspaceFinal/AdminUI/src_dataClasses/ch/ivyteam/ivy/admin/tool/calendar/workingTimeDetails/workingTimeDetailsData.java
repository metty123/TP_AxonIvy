package ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class workingTimeDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class workingTimeDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2243097465982248377L;

  private ch.ivyteam.ivy.application.calendar.WorkingTime workingTime;

  /**
   * Gets the field workingTime.
   * @return the value of the field workingTime; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.WorkingTime getWorkingTime()
  {
    return workingTime;
  }

  /**
   * Sets the field workingTime.
   * @param _workingTime the new value of the field workingTime.
   */
  public void setWorkingTime(ch.ivyteam.ivy.application.calendar.WorkingTime _workingTime)
  {
    workingTime = _workingTime;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.WorkingTime> configuredWorkingTimes;

  /**
   * Gets the field configuredWorkingTimes.
   * @return the value of the field configuredWorkingTimes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.WorkingTime> getConfiguredWorkingTimes()
  {
    return configuredWorkingTimes;
  }

  /**
   * Sets the field configuredWorkingTimes.
   * @param _configuredWorkingTimes the new value of the field configuredWorkingTimes.
   */
  public void setConfiguredWorkingTimes(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.WorkingTime> _configuredWorkingTimes)
  {
    configuredWorkingTimes = _configuredWorkingTimes;
  }

}
