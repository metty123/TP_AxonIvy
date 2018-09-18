package ch.ivyteam.ivy.admin.tool.security.Permissions;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class PermissionsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class PermissionsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8260747800064186637L;

  private transient java.lang.String errorMessage;

  /**
   * Gets the field errorMessage.
   * @return the value of the field errorMessage; may be null.
   */
  public java.lang.String getErrorMessage()
  {
    return errorMessage;
  }

  /**
   * Sets the field errorMessage.
   * @param _errorMessage the new value of the field errorMessage.
   */
  public void setErrorMessage(java.lang.String _errorMessage)
  {
    errorMessage = _errorMessage;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree filteredPermissionTree;

  /**
   * Gets the field filteredPermissionTree.
   * @return the value of the field filteredPermissionTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getFilteredPermissionTree()
  {
    return filteredPermissionTree;
  }

  /**
   * Sets the field filteredPermissionTree.
   * @param _filteredPermissionTree the new value of the field filteredPermissionTree.
   */
  public void setFilteredPermissionTree(ch.ivyteam.ivy.scripting.objects.Tree _filteredPermissionTree)
  {
    filteredPermissionTree = _filteredPermissionTree;
  }

  private transient java.lang.Boolean isError;

  /**
   * Gets the field isError.
   * @return the value of the field isError; may be null.
   */
  public java.lang.Boolean getIsError()
  {
    return isError;
  }

  /**
   * Sets the field isError.
   * @param _isError the new value of the field isError.
   */
  public void setIsError(java.lang.Boolean _isError)
  {
    isError = _isError;
  }

  /**
   * key input in filter
   */
  private transient java.lang.String keyword;

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

  private transient ch.ivyteam.ivy.scripting.objects.Tree loadTreeNode;

  /**
   * Gets the field loadTreeNode.
   * @return the value of the field loadTreeNode; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getLoadTreeNode()
  {
    return loadTreeNode;
  }

  /**
   * Sets the field loadTreeNode.
   * @param _loadTreeNode the new value of the field loadTreeNode.
   */
  public void setLoadTreeNode(ch.ivyteam.ivy.scripting.objects.Tree _loadTreeNode)
  {
    loadTreeNode = _loadTreeNode;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree permissionTree;

  /**
   * Gets the field permissionTree.
   * @return the value of the field permissionTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getPermissionTree()
  {
    return permissionTree;
  }

  /**
   * Sets the field permissionTree.
   * @param _permissionTree the new value of the field permissionTree.
   */
  public void setPermissionTree(ch.ivyteam.ivy.scripting.objects.Tree _permissionTree)
  {
    permissionTree = _permissionTree;
  }

  private transient ch.ivyteam.ivy.security.ISecurityDescriptor securityDescriptor;

  /**
   * Gets the field securityDescriptor.
   * @return the value of the field securityDescriptor; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityDescriptor getSecurityDescriptor()
  {
    return securityDescriptor;
  }

  /**
   * Sets the field securityDescriptor.
   * @param _securityDescriptor the new value of the field securityDescriptor.
   */
  public void setSecurityDescriptor(ch.ivyteam.ivy.security.ISecurityDescriptor _securityDescriptor)
  {
    securityDescriptor = _securityDescriptor;
  }

  private transient ch.ivyteam.ivy.security.ISecurityMember securityMember;

  /**
   * Gets the field securityMember.
   * @return the value of the field securityMember; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityMember getSecurityMember()
  {
    return securityMember;
  }

  /**
   * Sets the field securityMember.
   * @param _securityMember the new value of the field securityMember.
   */
  public void setSecurityMember(ch.ivyteam.ivy.security.ISecurityMember _securityMember)
  {
    securityMember = _securityMember;
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

}
