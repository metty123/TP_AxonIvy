package ch.ivyteam.ivy.admin.tool.security.UserList;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UserListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UserListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -9115423489247522555L;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.security.UserDTO> originalUsers;

  /**
   * Gets the field originalUsers.
   * @return the value of the field originalUsers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.security.UserDTO> getOriginalUsers()
  {
    return originalUsers;
  }

  /**
   * Sets the field originalUsers.
   * @param _originalUsers the new value of the field originalUsers.
   */
  public void setOriginalUsers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.security.UserDTO> _originalUsers)
  {
    originalUsers = _originalUsers;
  }

  private transient ch.ivyteam.ivy.security.IUser selectedUser;

  /**
   * Gets the field selectedUser.
   * @return the value of the field selectedUser; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getSelectedUser()
  {
    return selectedUser;
  }

  /**
   * Sets the field selectedUser.
   * @param _selectedUser the new value of the field selectedUser.
   */
  public void setSelectedUser(ch.ivyteam.ivy.security.IUser _selectedUser)
  {
    selectedUser = _selectedUser;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> selectedUsers;

  /**
   * Gets the field selectedUsers.
   * @return the value of the field selectedUsers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getSelectedUsers()
  {
    return selectedUsers;
  }

  /**
   * Sets the field selectedUsers.
   * @param _selectedUsers the new value of the field selectedUsers.
   */
  public void setSelectedUsers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _selectedUsers)
  {
    selectedUsers = _selectedUsers;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.security.UserDTO> userDTO;

  /**
   * Gets the field userDTO.
   * @return the value of the field userDTO; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.security.UserDTO> getUserDTO()
  {
    return userDTO;
  }

  /**
   * Sets the field userDTO.
   * @param _userDTO the new value of the field userDTO.
   */
  public void setUserDTO(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.admin.tool.security.UserDTO> _userDTO)
  {
    userDTO = _userDTO;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> users;

  /**
   * Gets the field users.
   * @return the value of the field users; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getUsers()
  {
    return users;
  }

  /**
   * Sets the field users.
   * @param _users the new value of the field users.
   */
  public void setUsers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _users)
  {
    users = _users;
  }

}
