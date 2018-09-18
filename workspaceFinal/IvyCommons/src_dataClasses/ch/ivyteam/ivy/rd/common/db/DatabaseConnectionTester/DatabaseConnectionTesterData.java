package ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DatabaseConnectionTesterData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DatabaseConnectionTesterData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4737522875144784869L;

  private transient ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConfiguration;

  /**
   * Gets the field dbConfiguration.
   * @return the value of the field dbConfiguration; may be null.
   */
  public ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration getDbConfiguration()
  {
    return dbConfiguration;
  }

  /**
   * Sets the field dbConfiguration.
   * @param _dbConfiguration the new value of the field dbConfiguration.
   */
  public void setDbConfiguration(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration _dbConfiguration)
  {
    dbConfiguration = _dbConfiguration;
  }

  private java.lang.Boolean isConnected;

  /**
   * Gets the field isConnected.
   * @return the value of the field isConnected; may be null.
   */
  public java.lang.Boolean getIsConnected()
  {
    return isConnected;
  }

  /**
   * Sets the field isConnected.
   * @param _isConnected the new value of the field isConnected.
   */
  public void setIsConnected(java.lang.Boolean _isConnected)
  {
    isConnected = _isConnected;
  }

}
