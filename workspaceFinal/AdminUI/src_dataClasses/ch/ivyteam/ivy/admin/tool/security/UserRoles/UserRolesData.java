package ch.ivyteam.ivy.admin.tool.security.UserRoles;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UserRolesData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserRolesData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 179776891841066448L;

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

  private java.lang.String keyword;

  /**
   * Gets the field keyword.
   * @return the value of the field keyword; may be null.
   */
  public java.lang.String getKeyword()
  {
    return keyword;
  }

  /**
   * Sets the field keyword.
   * @param _keyword the new value of the field keyword.
   */
  public void setKeyword(java.lang.String _keyword)
  {
    keyword = _keyword;
  }

  private java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scripting.objects.Tree> selectedTreeNodes;

  /**
   * Gets the field selectedTreeNodes.
   * @return the value of the field selectedTreeNodes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scripting.objects.Tree> getSelectedTreeNodes()
  {
    return selectedTreeNodes;
  }

  /**
   * Sets the field selectedTreeNodes.
   * @param _selectedTreeNodes the new value of the field selectedTreeNodes.
   */
  public void setSelectedTreeNodes(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scripting.objects.Tree> _selectedTreeNodes)
  {
    selectedTreeNodes = _selectedTreeNodes;
  }

  private transient ch.ivyteam.ivy.security.IRole topLevelRole;

  /**
   * Gets the field topLevelRole.
   * @return the value of the field topLevelRole; may be null.
   */
  public ch.ivyteam.ivy.security.IRole getTopLevelRole()
  {
    return topLevelRole;
  }

  /**
   * Sets the field topLevelRole.
   * @param _topLevelRole the new value of the field topLevelRole.
   */
  public void setTopLevelRole(ch.ivyteam.ivy.security.IRole _topLevelRole)
  {
    topLevelRole = _topLevelRole;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree roleTree;

  /**
   * Gets the field roleTree.
   * @return the value of the field roleTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getRoleTree()
  {
    return roleTree;
  }

  /**
   * Sets the field roleTree.
   * @param _roleTree the new value of the field roleTree.
   */
  public void setRoleTree(ch.ivyteam.ivy.scripting.objects.Tree _roleTree)
  {
    roleTree = _roleTree;
  }

  private transient ch.ivyteam.ivy.security.IUser user;

  /**
   * Gets the field user.
   * @return the value of the field user; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getUser()
  {
    return user;
  }

  /**
   * Sets the field user.
   * @param _user the new value of the field user.
   */
  public void setUser(ch.ivyteam.ivy.security.IUser _user)
  {
    user = _user;
  }

  /**
   * tree which contains non obsolete roles
   */
  private ch.ivyteam.ivy.scripting.objects.Tree activeRoleTree;

  /**
   * Gets the field activeRoleTree.
   * @return the value of the field activeRoleTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getActiveRoleTree()
  {
    return activeRoleTree;
  }

  /**
   * Sets the field activeRoleTree.
   * @param _activeRoleTree the new value of the field activeRoleTree.
   */
  public void setActiveRoleTree(ch.ivyteam.ivy.scripting.objects.Tree _activeRoleTree)
  {
    activeRoleTree = _activeRoleTree;
  }

  /**
   * list of non obsolete roles
   */
  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IRole> activeRoles;

  /**
   * Gets the field activeRoles.
   * @return the value of the field activeRoles; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IRole> getActiveRoles()
  {
    return activeRoles;
  }

  /**
   * Sets the field activeRoles.
   * @param _activeRoles the new value of the field activeRoles.
   */
  public void setActiveRoles(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IRole> _activeRoles)
  {
    activeRoles = _activeRoles;
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

}
