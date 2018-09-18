package ch.ivy.addon.portal.generic.PortalTasks;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PortalTasksData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PortalTasksData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3088218680141307548L;

  private ch.ivy.addon.portal.generic.view.TaskView taskView;

  /**
   * Gets the field taskView.
   * @return the value of the field taskView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.TaskView getTaskView()
  {
    return taskView;
  }

  /**
   * Sets the field taskView.
   * @param _taskView the new value of the field taskView.
   */
  public void setTaskView(ch.ivy.addon.portal.generic.view.TaskView _taskView)
  {
    taskView = _taskView;
  }

  private java.lang.String menuState;

  /**
   * Gets the field menuState.
   * @return the value of the field menuState; may be null.
   */
  public java.lang.String getMenuState()
  {
    return menuState;
  }

  /**
   * Sets the field menuState.
   * @param _menuState the new value of the field menuState.
   */
  public void setMenuState(java.lang.String _menuState)
  {
    menuState = _menuState;
  }

}
