package kips;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class searchUser", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class searchUser extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3873893481191405883L;

  private java.lang.String searchText;

  /**
   * Gets the field searchText.
   * @return the value of the field searchText; may be null.
   */
  public java.lang.String getSearchText()
  {
    return searchText;
  }

  /**
   * Sets the field searchText.
   * @param _searchText the new value of the field searchText.
   */
  public void setSearchText(java.lang.String _searchText)
  {
    searchText = _searchText;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> searchResult;

  /**
   * Gets the field searchResult.
   * @return the value of the field searchResult; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getSearchResult()
  {
    return searchResult;
  }

  /**
   * Sets the field searchResult.
   * @param _searchResult the new value of the field searchResult.
   */
  public void setSearchResult(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _searchResult)
  {
    searchResult = _searchResult;
  }

  private java.lang.Number selectedUserID;

  /**
   * Gets the field selectedUserID.
   * @return the value of the field selectedUserID; may be null.
   */
  public java.lang.Number getSelectedUserID()
  {
    return selectedUserID;
  }

  /**
   * Sets the field selectedUserID.
   * @param _selectedUserID the new value of the field selectedUserID.
   */
  public void setSelectedUserID(java.lang.Number _selectedUserID)
  {
    selectedUserID = _selectedUserID;
  }

  private ch.ivyteam.ivy.scripting.objects.List<java.lang.String> allUserNames;

  /**
   * Gets the field allUserNames.
   * @return the value of the field allUserNames; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getAllUserNames()
  {
    return allUserNames;
  }

  /**
   * Sets the field allUserNames.
   * @param _allUserNames the new value of the field allUserNames.
   */
  public void setAllUserNames(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _allUserNames)
  {
    allUserNames = _allUserNames;
  }

}
