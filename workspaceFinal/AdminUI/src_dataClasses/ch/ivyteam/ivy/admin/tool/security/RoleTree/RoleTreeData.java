package ch.ivyteam.ivy.admin.tool.security.RoleTree;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RoleTreeData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RoleTreeData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -436543572947479326L;

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

  private java.lang.Boolean displayObsoleteRoles;

  /**
   * Gets the field displayObsoleteRoles.
   * @return the value of the field displayObsoleteRoles; may be null.
   */
  public java.lang.Boolean getDisplayObsoleteRoles()
  {
    return displayObsoleteRoles;
  }

  /**
   * Sets the field displayObsoleteRoles.
   * @param _displayObsoleteRoles the new value of the field displayObsoleteRoles.
   */
  public void setDisplayObsoleteRoles(java.lang.Boolean _displayObsoleteRoles)
  {
    displayObsoleteRoles = _displayObsoleteRoles;
  }

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

  private transient ch.ivyteam.ivy.admin.tool.role.RoleTree roleTree;

  /**
   * Gets the field roleTree.
   * @return the value of the field roleTree; may be null.
   */
  public ch.ivyteam.ivy.admin.tool.role.RoleTree getRoleTree()
  {
    return roleTree;
  }

  /**
   * Sets the field roleTree.
   * @param _roleTree the new value of the field roleTree.
   */
  public void setRoleTree(ch.ivyteam.ivy.admin.tool.role.RoleTree _roleTree)
  {
    roleTree = _roleTree;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree selectedTreeNode;

  /**
   * Gets the field selectedTreeNode.
   * @return the value of the field selectedTreeNode; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getSelectedTreeNode()
  {
    return selectedTreeNode;
  }

  /**
   * Sets the field selectedTreeNode.
   * @param _selectedTreeNode the new value of the field selectedTreeNode.
   */
  public void setSelectedTreeNode(ch.ivyteam.ivy.scripting.objects.Tree _selectedTreeNode)
  {
    selectedTreeNode = _selectedTreeNode;
  }

  private ch.ivyteam.ivy.security.IRole selectedRole;

  /**
   * Gets the field selectedRole.
   * @return the value of the field selectedRole; may be null.
   */
  public ch.ivyteam.ivy.security.IRole getSelectedRole()
  {
    return selectedRole;
  }

  /**
   * Sets the field selectedRole.
   * @param _selectedRole the new value of the field selectedRole.
   */
  public void setSelectedRole(ch.ivyteam.ivy.security.IRole _selectedRole)
  {
    selectedRole = _selectedRole;
  }

}
