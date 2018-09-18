package ch.ivy.addon.portal.generic.ApplicationSelectionMenu;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ApplicationSelectionMenuData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ApplicationSelectionMenuData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8794853016122411933L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.persistence.domain.Application> applications;

  /**
   * Gets the field applications.
   * @return the value of the field applications; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.persistence.domain.Application> getApplications()
  {
    return applications;
  }

  /**
   * Sets the field applications.
   * @param _applications the new value of the field applications.
   */
  public void setApplications(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.persistence.domain.Application> _applications)
  {
    applications = _applications;
  }

  private java.lang.Boolean isNotRequiredLogin;

  /**
   * Gets the field isNotRequiredLogin.
   * @return the value of the field isNotRequiredLogin; may be null.
   */
  public java.lang.Boolean getIsNotRequiredLogin()
  {
    return isNotRequiredLogin;
  }

  /**
   * Sets the field isNotRequiredLogin.
   * @param _isNotRequiredLogin the new value of the field isNotRequiredLogin.
   */
  public void setIsNotRequiredLogin(java.lang.Boolean _isNotRequiredLogin)
  {
    isNotRequiredLogin = _isNotRequiredLogin;
  }

  private java.util.List<org.primefaces.component.button.Button> menuItems;

  /**
   * Gets the field menuItems.
   * @return the value of the field menuItems; may be null.
   */
  public java.util.List<org.primefaces.component.button.Button> getMenuItems()
  {
    return menuItems;
  }

  /**
   * Sets the field menuItems.
   * @param _menuItems the new value of the field menuItems.
   */
  public void setMenuItems(java.util.List<org.primefaces.component.button.Button> _menuItems)
  {
    menuItems = _menuItems;
  }

  private java.lang.String applicationUrl;

  /**
   * Gets the field applicationUrl.
   * @return the value of the field applicationUrl; may be null.
   */
  public java.lang.String getApplicationUrl()
  {
    return applicationUrl;
  }

  /**
   * Sets the field applicationUrl.
   * @param _applicationUrl the new value of the field applicationUrl.
   */
  public void setApplicationUrl(java.lang.String _applicationUrl)
  {
    applicationUrl = _applicationUrl;
  }

  private ch.ivy.addon.portal.generic.view.CaseView caseView;

  /**
   * Gets the field caseView.
   * @return the value of the field caseView; may be null.
   */
  public ch.ivy.addon.portal.generic.view.CaseView getCaseView()
  {
    return caseView;
  }

  /**
   * Sets the field caseView.
   * @param _caseView the new value of the field caseView.
   */
  public void setCaseView(ch.ivy.addon.portal.generic.view.CaseView _caseView)
  {
    caseView = _caseView;
  }

  private java.lang.Boolean hasReadAllCasesPermission;

  /**
   * Gets the field hasReadAllCasesPermission.
   * @return the value of the field hasReadAllCasesPermission; may be null.
   */
  public java.lang.Boolean getHasReadAllCasesPermission()
  {
    return hasReadAllCasesPermission;
  }

  /**
   * Sets the field hasReadAllCasesPermission.
   * @param _hasReadAllCasesPermission the new value of the field hasReadAllCasesPermission.
   */
  public void setHasReadAllCasesPermission(java.lang.Boolean _hasReadAllCasesPermission)
  {
    hasReadAllCasesPermission = _hasReadAllCasesPermission;
  }

  private java.lang.Boolean hasReadAllTasksPermisson;

  /**
   * Gets the field hasReadAllTasksPermisson.
   * @return the value of the field hasReadAllTasksPermisson; may be null.
   */
  public java.lang.Boolean getHasReadAllTasksPermisson()
  {
    return hasReadAllTasksPermisson;
  }

  /**
   * Sets the field hasReadAllTasksPermisson.
   * @param _hasReadAllTasksPermisson the new value of the field hasReadAllTasksPermisson.
   */
  public void setHasReadAllTasksPermisson(java.lang.Boolean _hasReadAllTasksPermisson)
  {
    hasReadAllTasksPermisson = _hasReadAllTasksPermisson;
  }

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

}
