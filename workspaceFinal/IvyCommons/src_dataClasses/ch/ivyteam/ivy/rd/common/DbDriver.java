package ch.ivyteam.ivy.rd.common;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DbDriver", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DbDriver extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1212024747090527435L;

  private transient ch.ivyteam.db.jdbc.ConnectionConfigurator connectionConfigurator;

  /**
   * Gets the field connectionConfigurator.
   * @return the value of the field connectionConfigurator; may be null.
   */
  public ch.ivyteam.db.jdbc.ConnectionConfigurator getConnectionConfigurator()
  {
    return connectionConfigurator;
  }

  /**
   * Sets the field connectionConfigurator.
   * @param _connectionConfigurator the new value of the field connectionConfigurator.
   */
  public void setConnectionConfigurator(ch.ivyteam.db.jdbc.ConnectionConfigurator _connectionConfigurator)
  {
    connectionConfigurator = _connectionConfigurator;
  }

  private transient java.lang.String driverName;

  /**
   * Gets the field driverName.
   * @return the value of the field driverName; may be null.
   */
  public java.lang.String getDriverName()
  {
    return driverName;
  }

  /**
   * Sets the field driverName.
   * @param _driverName the new value of the field driverName.
   */
  public void setDriverName(java.lang.String _driverName)
  {
    driverName = _driverName;
  }

  private transient java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private transient java.lang.String subProtocol;

  /**
   * Gets the field subProtocol.
   * @return the value of the field subProtocol; may be null.
   */
  public java.lang.String getSubProtocol()
  {
    return subProtocol;
  }

  /**
   * Sets the field subProtocol.
   * @param _subProtocol the new value of the field subProtocol.
   */
  public void setSubProtocol(java.lang.String _subProtocol)
  {
    subProtocol = _subProtocol;
  }

}
