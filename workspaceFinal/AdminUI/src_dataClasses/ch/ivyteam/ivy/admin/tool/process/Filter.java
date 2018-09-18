package ch.ivyteam.ivy.admin.tool.process;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class Filter", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Filter extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2891345135344199882L;

  private transient java.lang.String filterType;

  /**
   * Gets the field filterType.
   * @return the value of the field filterType; may be null.
   */
  public java.lang.String getFilterType()
  {
    return filterType;
  }

  /**
   * Sets the field filterType.
   * @param _filterType the new value of the field filterType.
   */
  public void setFilterType(java.lang.String _filterType)
  {
    filterType = _filterType;
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

  private transient ch.ivyteam.ivy.scripting.objects.List<Object> listToBeFiltered;

  /**
   * Gets the field listToBeFiltered.
   * @return the value of the field listToBeFiltered; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<Object> getListToBeFiltered()
  {
    return listToBeFiltered;
  }

  /**
   * Sets the field listToBeFiltered.
   * @param _listToBeFiltered the new value of the field listToBeFiltered.
   */
  public void setListToBeFiltered(ch.ivyteam.ivy.scripting.objects.List<Object> _listToBeFiltered)
  {
    listToBeFiltered = _listToBeFiltered;
  }

}
