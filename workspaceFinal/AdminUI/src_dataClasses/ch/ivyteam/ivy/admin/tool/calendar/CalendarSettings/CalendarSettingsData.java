package ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CalendarSettingsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CalendarSettingsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2168071280240968669L;

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

}
