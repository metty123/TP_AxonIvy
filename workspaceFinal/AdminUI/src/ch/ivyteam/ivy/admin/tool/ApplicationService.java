package ch.ivyteam.ivy.admin.tool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch.ivyteam.di.restricted.DiCore;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.persistence.db.DatabasePersistencyService;
import ch.ivyteam.ivy.persistence.db.ISystemDatabasePersistencyService;
import ch.ivyteam.ivy.security.ISecurityConstants;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.server.ServerFactory;

@SuppressWarnings("restriction")
public class ApplicationService {

  public int getUsersOverAllApplication() throws PersistencyException {
    int numberOfUsers = 0;
    List<IApplication> apps =
        ServerFactory.getServer().getApplicationConfigurationManager().getApplicationsSortedByName(false);
    for (IApplication app : apps) {
      List<IUser> users = app.getSecurityContext().getUsers();
      for (IUser user : users) {
        if (user.getName() != null && !ISecurityConstants.SYSTEM_USER_NAME.equals(user.getName())) {
          numberOfUsers++;
        }
      }
    }
    return numberOfUsers;
  }

  public boolean checkRightOfUserLoggedInToSetAbsence(String loggedInUserName, String selectedUserName) {
    if (loggedInUserName != null && selectedUserName != null) {
      return loggedInUserName.equals(selectedUserName);
    }
    return false;
  }

  public Map<String, String> getSystemDatabaseInfo() throws PersistencyException {
    Map<String, String> dbSystemInfo = new HashMap<String, String>();
    DatabasePersistencyService dps =
        (DatabasePersistencyService) DiCore.getGlobalInjector().getInstance(ISystemDatabasePersistencyService.class);
    dbSystemInfo.put("connectionUrl", dps.getDatabaseConnectionConfiguration().getConnectionUrl());
    dbSystemInfo.put("dbProduct", dps.getDatabaseProductName());
    dbSystemInfo.put("dbVersion", dps.getDatabaseProductVersion());
    return dbSystemInfo;
  }
}
