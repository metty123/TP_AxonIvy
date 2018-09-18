package ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DatabaseConfigurationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DatabaseConfigurationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -736038478313838627L;

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> creationParameters;

  /**
   * Gets the field creationParameters.
   * @return the value of the field creationParameters; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getCreationParameters()
  {
    return creationParameters;
  }

  /**
   * Sets the field creationParameters.
   * @param _creationParameters the new value of the field creationParameters.
   */
  public void setCreationParameters(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _creationParameters)
  {
    creationParameters = _creationParameters;
  }

  /**
   * include "Others"
   */
  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbProduct> databaseProducts;

  /**
   * Gets the field databaseProducts.
   * @return the value of the field databaseProducts; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbProduct> getDatabaseProducts()
  {
    return databaseProducts;
  }

  /**
   * Sets the field databaseProducts.
   * @param _databaseProducts the new value of the field databaseProducts.
   */
  public void setDatabaseProducts(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbProduct> _databaseProducts)
  {
    databaseProducts = _databaseProducts;
  }

  private transient ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConnection;

  /**
   * Gets the field dbConnection.
   * @return the value of the field dbConnection; may be null.
   */
  public ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration getDbConnection()
  {
    return dbConnection;
  }

  /**
   * Sets the field dbConnection.
   * @param _dbConnection the new value of the field dbConnection.
   */
  public void setDbConnection(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration _dbConnection)
  {
    dbConnection = _dbConnection;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbDriver> dbDrivers;

  /**
   * Gets the field dbDrivers.
   * @return the value of the field dbDrivers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbDriver> getDbDrivers()
  {
    return dbDrivers;
  }

  /**
   * Sets the field dbDrivers.
   * @param _dbDrivers the new value of the field dbDrivers.
   */
  public void setDbDrivers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.rd.common.DbDriver> _dbDrivers)
  {
    dbDrivers = _dbDrivers;
  }

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

  private transient java.lang.Exception exception;

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

  private transient java.lang.Boolean isCallCboEvent;

  /**
   * Gets the field isCallCboEvent.
   * @return the value of the field isCallCboEvent; may be null.
   */
  public java.lang.Boolean getIsCallCboEvent()
  {
    return isCallCboEvent;
  }

  /**
   * Sets the field isCallCboEvent.
   * @param _isCallCboEvent the new value of the field isCallCboEvent.
   */
  public void setIsCallCboEvent(java.lang.Boolean _isCallCboEvent)
  {
    isCallCboEvent = _isCallCboEvent;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Recordset properties;

  /**
   * Gets the field properties.
   * @return the value of the field properties; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getProperties()
  {
    return properties;
  }

  /**
   * Sets the field properties.
   * @param _properties the new value of the field properties.
   */
  public void setProperties(ch.ivyteam.ivy.scripting.objects.Recordset _properties)
  {
    properties = _properties;
  }

  private transient ch.ivyteam.ivy.rd.common.DbProduct selectedDatabaseProduct;

  /**
   * Gets the field selectedDatabaseProduct.
   * @return the value of the field selectedDatabaseProduct; may be null.
   */
  public ch.ivyteam.ivy.rd.common.DbProduct getSelectedDatabaseProduct()
  {
    return selectedDatabaseProduct;
  }

  /**
   * Sets the field selectedDatabaseProduct.
   * @param _selectedDatabaseProduct the new value of the field selectedDatabaseProduct.
   */
  public void setSelectedDatabaseProduct(ch.ivyteam.ivy.rd.common.DbProduct _selectedDatabaseProduct)
  {
    selectedDatabaseProduct = _selectedDatabaseProduct;
  }

  private transient ch.ivyteam.ivy.rd.common.DbDriver selectedDbDriver;

  /**
   * Gets the field selectedDbDriver.
   * @return the value of the field selectedDbDriver; may be null.
   */
  public ch.ivyteam.ivy.rd.common.DbDriver getSelectedDbDriver()
  {
    return selectedDbDriver;
  }

  /**
   * Sets the field selectedDbDriver.
   * @param _selectedDbDriver the new value of the field selectedDbDriver.
   */
  public void setSelectedDbDriver(ch.ivyteam.ivy.rd.common.DbDriver _selectedDbDriver)
  {
    selectedDbDriver = _selectedDbDriver;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> supportedDrivers;

  /**
   * Gets the field supportedDrivers.
   * @return the value of the field supportedDrivers; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> getSupportedDrivers()
  {
    return supportedDrivers;
  }

  /**
   * Sets the field supportedDrivers.
   * @param _supportedDrivers the new value of the field supportedDrivers.
   */
  public void setSupportedDrivers(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.db.jdbc.JdbcDriver> _supportedDrivers)
  {
    supportedDrivers = _supportedDrivers;
  }

}
