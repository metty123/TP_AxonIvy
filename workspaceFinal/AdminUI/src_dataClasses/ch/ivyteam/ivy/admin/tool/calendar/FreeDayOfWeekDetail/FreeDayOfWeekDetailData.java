package ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfWeekDetail;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class FreeDayOfWeekDetailData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class FreeDayOfWeekDetailData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8919838585462301042L;

  private transient ch.ivyteam.ivy.application.calendar.FreeDayOfWeek data;

  /**
   * Gets the field data.
   * @return the value of the field data; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.FreeDayOfWeek getData()
  {
    return data;
  }

  /**
   * Sets the field data.
   * @param _data the new value of the field data.
   */
  public void setData(ch.ivyteam.ivy.application.calendar.FreeDayOfWeek _data)
  {
    data = _data;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDayOfWeek> configuredFreeDaysOfWeek;

  /**
   * Gets the field configuredFreeDaysOfWeek.
   * @return the value of the field configuredFreeDaysOfWeek; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDayOfWeek> getConfiguredFreeDaysOfWeek()
  {
    return configuredFreeDaysOfWeek;
  }

  /**
   * Sets the field configuredFreeDaysOfWeek.
   * @param _configuredFreeDaysOfWeek the new value of the field configuredFreeDaysOfWeek.
   */
  public void setConfiguredFreeDaysOfWeek(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDayOfWeek> _configuredFreeDaysOfWeek)
  {
    configuredFreeDaysOfWeek = _configuredFreeDaysOfWeek;
  }

}
