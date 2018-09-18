package ch.ivyteam.ivy.admin.tool.calendar.FreeDateDetail;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class FreeDateDetailData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class FreeDateDetailData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8706303810385075397L;

  private transient ch.ivyteam.ivy.application.calendar.FreeDate data;

  /**
   * Gets the field data.
   * @return the value of the field data; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.FreeDate getData()
  {
    return data;
  }

  /**
   * Sets the field data.
   * @param _data the new value of the field data.
   */
  public void setData(ch.ivyteam.ivy.application.calendar.FreeDate _data)
  {
    data = _data;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDate> configuredFreeDates;

  /**
   * Gets the field configuredFreeDates.
   * @return the value of the field configuredFreeDates; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDate> getConfiguredFreeDates()
  {
    return configuredFreeDates;
  }

  /**
   * Sets the field configuredFreeDates.
   * @param _configuredFreeDates the new value of the field configuredFreeDates.
   */
  public void setConfiguredFreeDates(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.calendar.FreeDate> _configuredFreeDates)
  {
    configuredFreeDates = _configuredFreeDates;
  }

}
