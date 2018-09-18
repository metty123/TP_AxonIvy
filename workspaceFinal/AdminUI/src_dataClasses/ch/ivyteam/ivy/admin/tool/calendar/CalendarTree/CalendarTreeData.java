package ch.ivyteam.ivy.admin.tool.calendar.CalendarTree;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CalendarTreeData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CalendarTreeData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2083017495854455386L;

  private transient ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings businessCalendarSettings;

  /**
   * Gets the field businessCalendarSettings.
   * @return the value of the field businessCalendarSettings; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings getBusinessCalendarSettings()
  {
    return businessCalendarSettings;
  }

  /**
   * Sets the field businessCalendarSettings.
   * @param _businessCalendarSettings the new value of the field businessCalendarSettings.
   */
  public void setBusinessCalendarSettings(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings _businessCalendarSettings)
  {
    businessCalendarSettings = _businessCalendarSettings;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree calendars;

  /**
   * Gets the field calendars.
   * @return the value of the field calendars; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getCalendars()
  {
    return calendars;
  }

  /**
   * Sets the field calendars.
   * @param _calendars the new value of the field calendars.
   */
  public void setCalendars(ch.ivyteam.ivy.scripting.objects.Tree _calendars)
  {
    calendars = _calendars;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree selectedCalendar;

  /**
   * Gets the field selectedCalendar.
   * @return the value of the field selectedCalendar; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getSelectedCalendar()
  {
    return selectedCalendar;
  }

  /**
   * Sets the field selectedCalendar.
   * @param _selectedCalendar the new value of the field selectedCalendar.
   */
  public void setSelectedCalendar(ch.ivyteam.ivy.scripting.objects.Tree _selectedCalendar)
  {
    selectedCalendar = _selectedCalendar;
  }

  private transient java.lang.String newCalendarIdentifier;

  /**
   * Gets the field newCalendarIdentifier.
   * @return the value of the field newCalendarIdentifier; may be null.
   */
  public java.lang.String getNewCalendarIdentifier()
  {
    return newCalendarIdentifier;
  }

  /**
   * Sets the field newCalendarIdentifier.
   * @param _newCalendarIdentifier the new value of the field newCalendarIdentifier.
   */
  public void setNewCalendarIdentifier(java.lang.String _newCalendarIdentifier)
  {
    newCalendarIdentifier = _newCalendarIdentifier;
  }

  private transient java.lang.Boolean newCalendarCancel;

  /**
   * Gets the field newCalendarCancel.
   * @return the value of the field newCalendarCancel; may be null.
   */
  public java.lang.Boolean getNewCalendarCancel()
  {
    return newCalendarCancel;
  }

  /**
   * Sets the field newCalendarCancel.
   * @param _newCalendarCancel the new value of the field newCalendarCancel.
   */
  public void setNewCalendarCancel(java.lang.Boolean _newCalendarCancel)
  {
    newCalendarCancel = _newCalendarCancel;
  }

  private transient ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration deleteCalendarCalendar;

  /**
   * Gets the field deleteCalendarCalendar.
   * @return the value of the field deleteCalendarCalendar; may be null.
   */
  public ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration getDeleteCalendarCalendar()
  {
    return deleteCalendarCalendar;
  }

  /**
   * Sets the field deleteCalendarCalendar.
   * @param _deleteCalendarCalendar the new value of the field deleteCalendarCalendar.
   */
  public void setDeleteCalendarCalendar(ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration _deleteCalendarCalendar)
  {
    deleteCalendarCalendar = _deleteCalendarCalendar;
  }

  private transient java.lang.Character treeKeyPressed;

  /**
   * Gets the field treeKeyPressed.
   * @return the value of the field treeKeyPressed; may be null.
   */
  public java.lang.Character getTreeKeyPressed()
  {
    return treeKeyPressed;
  }

  /**
   * Sets the field treeKeyPressed.
   * @param _treeKeyPressed the new value of the field treeKeyPressed.
   */
  public void setTreeKeyPressed(java.lang.Character _treeKeyPressed)
  {
    treeKeyPressed = _treeKeyPressed;
  }

  /**
   * answer field for dialogs
   */
  private transient java.lang.String buttonPressed;

  /**
   * Gets the field buttonPressed.
   * @return the value of the field buttonPressed; may be null.
   */
  public java.lang.String getButtonPressed()
  {
    return buttonPressed;
  }

  /**
   * Sets the field buttonPressed.
   * @param _buttonPressed the new value of the field buttonPressed.
   */
  public void setButtonPressed(java.lang.String _buttonPressed)
  {
    buttonPressed = _buttonPressed;
  }

}
