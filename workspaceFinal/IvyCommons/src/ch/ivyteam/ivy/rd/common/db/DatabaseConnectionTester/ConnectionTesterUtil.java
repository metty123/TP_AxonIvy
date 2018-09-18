package ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester;

import java.sql.Connection;
import java.sql.SQLException;

import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import ch.ivyteam.db.jdbc.DatabaseUtil;

public class ConnectionTesterUtil {
  public static String getConnectionError(DatabaseConnectionConfiguration config) {
    try {
      Connection c = DatabaseUtil.openConnection(config);
      c.close();
      return null;
    } catch (SQLException ex) {
      return ex.getLocalizedMessage();
    }

  }
}
