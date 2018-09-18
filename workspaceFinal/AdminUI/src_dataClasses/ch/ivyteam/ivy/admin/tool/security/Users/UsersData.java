package ch.ivyteam.ivy.admin.tool.security.Users;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class UsersData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class UsersData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -466024429551053725L;

  private transient java.lang.String answer;

  /**
   * Gets the field answer.
   * @return the value of the field answer; may be null.
   */
  public java.lang.String getAnswer()
  {
    return answer;
  }

  /**
   * Sets the field answer.
   * @param _answer the new value of the field answer.
   */
  public void setAnswer(java.lang.String _answer)
  {
    answer = _answer;
  }

  /**
   * Get as a parameter and used to specify the destination display if for: 
   */
  private transient ch.ivyteam.ivy.richdialog.widgets.displays.RCloseableTabbedDisplay destinationDisplay;

  /**
   * Gets the field destinationDisplay.
   * @return the value of the field destinationDisplay; may be null.
   */
  public ch.ivyteam.ivy.richdialog.widgets.displays.RCloseableTabbedDisplay getDestinationDisplay()
  {
    return destinationDisplay;
  }

  /**
   * Sets the field destinationDisplay.
   * @param _destinationDisplay the new value of the field destinationDisplay.
   */
  public void setDestinationDisplay(ch.ivyteam.ivy.richdialog.widgets.displays.RCloseableTabbedDisplay _destinationDisplay)
  {
    destinationDisplay = _destinationDisplay;
  }

  /**
   * Check list of selected users have one is online or not
   */
  private transient java.lang.Boolean isListContainUserOnline;

  /**
   * Gets the field isListContainUserOnline.
   * @return the value of the field isListContainUserOnline; may be null.
   */
  public java.lang.Boolean getIsListContainUserOnline()
  {
    return isListContainUserOnline;
  }

  /**
   * Sets the field isListContainUserOnline.
   * @param _isListContainUserOnline the new value of the field isListContainUserOnline.
   */
  public void setIsListContainUserOnline(java.lang.Boolean _isListContainUserOnline)
  {
    isListContainUserOnline = _isListContainUserOnline;
  }

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

  /**
   * List of all selected user on table
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> listSelectedUser;

  /**
   * Gets the field listSelectedUser.
   * @return the value of the field listSelectedUser; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getListSelectedUser()
  {
    return listSelectedUser;
  }

  /**
   * Sets the field listSelectedUser.
   * @param _listSelectedUser the new value of the field listSelectedUser.
   */
  public void setListSelectedUser(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _listSelectedUser)
  {
    listSelectedUser = _listSelectedUser;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> originalUsers;

  /**
   * Gets the field originalUsers.
   * @return the value of the field originalUsers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getOriginalUsers()
  {
    return originalUsers;
  }

  /**
   * Sets the field originalUsers.
   * @param _originalUsers the new value of the field originalUsers.
   */
  public void setOriginalUsers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _originalUsers)
  {
    originalUsers = _originalUsers;
  }

  /**
   * Defines if the given rich dialog is already loaded on the display
   */
  private transient java.lang.Boolean rdAlreadyLoadedOnDisplay;

  /**
   * Gets the field rdAlreadyLoadedOnDisplay.
   * @return the value of the field rdAlreadyLoadedOnDisplay; may be null.
   */
  public java.lang.Boolean getRdAlreadyLoadedOnDisplay()
  {
    return rdAlreadyLoadedOnDisplay;
  }

  /**
   * Sets the field rdAlreadyLoadedOnDisplay.
   * @param _rdAlreadyLoadedOnDisplay the new value of the field rdAlreadyLoadedOnDisplay.
   */
  public void setRdAlreadyLoadedOnDisplay(java.lang.Boolean _rdAlreadyLoadedOnDisplay)
  {
    rdAlreadyLoadedOnDisplay = _rdAlreadyLoadedOnDisplay;
  }

  private transient ch.ivyteam.ivy.security.ISecurityContext securityContext;

  /**
   * Gets the field securityContext.
   * @return the value of the field securityContext; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityContext getSecurityContext()
  {
    return securityContext;
  }

  /**
   * Sets the field securityContext.
   * @param _securityContext the new value of the field securityContext.
   */
  public void setSecurityContext(ch.ivyteam.ivy.security.ISecurityContext _securityContext)
  {
    securityContext = _securityContext;
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

}
