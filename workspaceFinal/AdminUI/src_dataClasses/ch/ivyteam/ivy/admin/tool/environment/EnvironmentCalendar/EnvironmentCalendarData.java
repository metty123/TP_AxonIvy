package ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class EnvironmentCalendarData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class EnvironmentCalendarData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1120152701015205624L;

  private ch.ivyteam.ivy.application.restricted.IEnvironment environment;

  /**
   * Gets the field environment.
   * @return the value of the field environment; may be null.
   */
  public ch.ivyteam.ivy.application.restricted.IEnvironment getEnvironment()
  {
    return environment;
  }

  /**
   * Sets the field environment.
   * @param _environment the new value of the field environment.
   */
  public void setEnvironment(ch.ivyteam.ivy.application.restricted.IEnvironment _environment)
  {
    environment = _environment;
  }

  private java.lang.Object selectedCalendar;

  /**
   * Gets the field selectedCalendar.
   * @return the value of the field selectedCalendar; may be null.
   */
  public java.lang.Object getSelectedCalendar()
  {
    return selectedCalendar;
  }

  /**
   * Sets the field selectedCalendar.
   * @param _selectedCalendar the new value of the field selectedCalendar.
   */
  public void setSelectedCalendar(java.lang.Object _selectedCalendar)
  {
    selectedCalendar = _selectedCalendar;
  }

}
