package ch.ivyteam.ivy.rd.common.db;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Connection;

import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import ch.ivyteam.db.jdbc.DatabaseProduct;
import ch.ivyteam.db.jdbc.DatabaseUtil;
import ch.ivyteam.db.jdbc.JdbcConnectionConfigurator;
import ch.ivyteam.db.jdbc.JdbcDriver;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.rd.common.DbDriver;
import ch.ivyteam.ivy.rd.common.DbProduct;

/**
 * Utility methods for the rich dialogs.
 * 
 * @author csc
 * 
 */
public class RdDatabaseUtil {
  /**
   * Tries to establish a connection to the specified database connection configuration and returns the error message if
   * the connection could not be established.
   * 
   * @param config The configuration to test
   * @return <code>null</code> if the connection was established successfully, otherwise the error message will be
   *         returned
   */
  public static String getConnectionError(DatabaseConnectionConfiguration config) {
    try {
      Connection c = DatabaseUtil.openConnection(config);
      c.close();
      return null;
    } catch (Exception ex) {
      return getStackTrace(ex, 1000);
    }

  }

  /**
   * Get stack trace from exception
   * 
   * @param ex exception
   * @param maxLength maximum character to display
   * @return
   */
  private static String getStackTrace(Exception ex, int maxLength) {
    StringWriter writer = new StringWriter(1000);
    PrintWriter printer = new PrintWriter(writer);
    ex.printStackTrace(printer);

    return writer.toString();
  }


  public static DbProduct initializeOtherDbProduct() {
    DbProduct otherDbProduct = new DbProduct();
    otherDbProduct.setName(Ivy.cms().co("/labels/others"));
    otherDbProduct.setShortName(Ivy.cms().co("/labels/others"));
    return otherDbProduct;
  }

  public static DbDriver initializeOtherDbDriver() {
    DbDriver otherDriver = new DbDriver();
    otherDriver.setName(Ivy.cms().co("/labels/others"));
    otherDriver.setConnectionConfigurator(new JdbcConnectionConfigurator());
    return otherDriver;
  }

  public static DbProduct getDbProduct(DatabaseProduct databaseProduct) {
    DbProduct dbProduct = new DbProduct();
    dbProduct.setName(databaseProduct.getName());
    dbProduct.setShortName(databaseProduct.getShortName());
    return dbProduct;
  }

  public static DbDriver getDbDriver(JdbcDriver jdbcDriver) {
    DbDriver dbDriver = new DbDriver();
    dbDriver.setName(jdbcDriver.getName());
    dbDriver.setSubProtocol(jdbcDriver.getSubProtocol());
    dbDriver.setDriverName(jdbcDriver.getDriverName());
    dbDriver.setConnectionConfigurator(jdbcDriver.getConnectionConfigurator());
    return dbDriver;
  }
}
