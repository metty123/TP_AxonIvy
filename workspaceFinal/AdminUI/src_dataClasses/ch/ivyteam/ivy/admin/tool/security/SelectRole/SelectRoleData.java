package ch.ivyteam.ivy.admin.tool.security.SelectRole;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SelectRoleData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SelectRoleData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4074848598768431036L;

  private java.lang.Exception exception;

  /**
   * Gets the field exception.
   * @return the value of the field exception; may be null.
   */
  public java.lang.Exception getException()
  {
    return exception;
  }

  /**
   * Sets the field exception.
   * @param _exception the new value of the field exception.
   */
  public void setException(java.lang.Exception _exception)
  {
    exception = _exception;
  }

  private ch.ivyteam.ivy.application.IApplication application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivyteam.ivy.application.IApplication _application)
  {
    application = _application;
  }

  private ch.ivyteam.ivy.security.IRole subRole;

  /**
   * Gets the field subRole.
   * @return the value of the field subRole; may be null.
   */
  public ch.ivyteam.ivy.security.IRole getSubRole()
  {
    return subRole;
  }

  /**
   * Sets the field subRole.
   * @param _subRole the new value of the field subRole.
   */
  public void setSubRole(ch.ivyteam.ivy.security.IRole _subRole)
  {
    subRole = _subRole;
  }

  private ch.ivyteam.ivy.security.IRole selectedMemberRole;

  /**
   * Gets the field selectedMemberRole.
   * @return the value of the field selectedMemberRole; may be null.
   */
  public ch.ivyteam.ivy.security.IRole getSelectedMemberRole()
  {
    return selectedMemberRole;
  }

  /**
   * Sets the field selectedMemberRole.
   * @param _selectedMemberRole the new value of the field selectedMemberRole.
   */
  public void setSelectedMemberRole(ch.ivyteam.ivy.security.IRole _selectedMemberRole)
  {
    selectedMemberRole = _selectedMemberRole;
  }

}
