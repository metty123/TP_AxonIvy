package ch.ivyteam.ivy.admin.tool.database.DatabaseList;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DatabaseListData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DatabaseListData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2100702081572423039L;

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.db.IExternalDatabase> databases;

  /**
   * Gets the field databases.
   * @return the value of the field databases; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.db.IExternalDatabase> getDatabases()
  {
    return databases;
  }

  /**
   * Sets the field databases.
   * @param _databases the new value of the field databases.
   */
  public void setDatabases(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.db.IExternalDatabase> _databases)
  {
    databases = _databases;
  }

  private transient ch.ivyteam.ivy.db.IExternalDatabase selectedDatabase;

  /**
   * Gets the field selectedDatabase.
   * @return the value of the field selectedDatabase; may be null.
   */
  public ch.ivyteam.ivy.db.IExternalDatabase getSelectedDatabase()
  {
    return selectedDatabase;
  }

  /**
   * Sets the field selectedDatabase.
   * @param _selectedDatabase the new value of the field selectedDatabase.
   */
  public void setSelectedDatabase(ch.ivyteam.ivy.db.IExternalDatabase _selectedDatabase)
  {
    selectedDatabase = _selectedDatabase;
  }

  private transient ch.ivyteam.ivy.application.IApplication applicationFilter;

  /**
   * Gets the field applicationFilter.
   * @return the value of the field applicationFilter; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplicationFilter()
  {
    return applicationFilter;
  }

  /**
   * Sets the field applicationFilter.
   * @param _applicationFilter the new value of the field applicationFilter.
   */
  public void setApplicationFilter(ch.ivyteam.ivy.application.IApplication _applicationFilter)
  {
    applicationFilter = _applicationFilter;
  }

  private transient java.lang.Boolean hasCancelled;

  /**
   * Gets the field hasCancelled.
   * @return the value of the field hasCancelled; may be null.
   */
  public java.lang.Boolean getHasCancelled()
  {
    return hasCancelled;
  }

  /**
   * Sets the field hasCancelled.
   * @param _hasCancelled the new value of the field hasCancelled.
   */
  public void setHasCancelled(java.lang.Boolean _hasCancelled)
  {
    hasCancelled = _hasCancelled;
  }

  private transient java.lang.Number dbId;

  /**
   * Gets the field dbId.
   * @return the value of the field dbId; may be null.
   */
  public java.lang.Number getDbId()
  {
    return dbId;
  }

  /**
   * Sets the field dbId.
   * @param _dbId the new value of the field dbId.
   */
  public void setDbId(java.lang.Number _dbId)
  {
    dbId = _dbId;
  }

  private ch.ivyteam.ivy.scripting.objects.List<Object> parameterList;

  /**
   * Gets the field parameterList.
   * @return the value of the field parameterList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<Object> getParameterList()
  {
    return parameterList;
  }

  /**
   * Sets the field parameterList.
   * @param _parameterList the new value of the field parameterList.
   */
  public void setParameterList(ch.ivyteam.ivy.scripting.objects.List<Object> _parameterList)
  {
    parameterList = _parameterList;
  }

}
