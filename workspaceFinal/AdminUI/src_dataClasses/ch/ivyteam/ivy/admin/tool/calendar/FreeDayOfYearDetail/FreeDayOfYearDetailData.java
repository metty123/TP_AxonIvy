package ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class FreeDayOfYearDetailData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class FreeDayOfYearDetailData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8907468684512885163L;

  private transient ch.ivyteam.ivy.application.calendar.FreeDayOfYear data;

  /**
   * Gets the field data.
   * @return the value of the field data; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.FreeDayOfYear getData()
  {
    return data;
  }

  /**
   * Sets the field data.
   * @param _data the new value of the field data.
   */
  public void setData(ch.ivyteam.ivy.application.calendar.FreeDayOfYear _data)
  {
    data = _data;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear> configuredFreeDaysOfYear;

  /**
   * Gets the field configuredFreeDaysOfYear.
   * @return the value of the field configuredFreeDaysOfYear; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear> getConfiguredFreeDaysOfYear()
  {
    return configuredFreeDaysOfYear;
  }

  /**
   * Sets the field configuredFreeDaysOfYear.
   * @param _configuredFreeDaysOfYear the new value of the field configuredFreeDaysOfYear.
   */
  public void setConfiguredFreeDaysOfYear(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear> _configuredFreeDaysOfYear)
  {
    configuredFreeDaysOfYear = _configuredFreeDaysOfYear;
  }

}
