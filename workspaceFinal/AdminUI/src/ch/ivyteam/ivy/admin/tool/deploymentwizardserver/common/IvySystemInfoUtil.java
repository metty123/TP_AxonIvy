package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssue;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity;
import ch.ivyteam.ivy.environment.EnvironmentNotAvailableException;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.SecurityManagerFactory;
import ch.ivyteam.ivy.security.SessionInfo;
import ch.ivyteam.ivy.server.ServerFactory;
import ch.ivyteam.log.Logger;

@SuppressWarnings("restriction")
public final class IvySystemInfoUtil {

  /**
   * Hide Utility Class Constructor
   */
  private IvySystemInfoUtil() {
    super();
  }

  private static final String LINE_SEPARATOR = System.getProperty("line.separator");
  private static final String WARNING_USERS_STILL_LOGGED_IN =
      "/ch/ivyteam/ivy/server/deploymentWizard/message/warningUsersStillLoggedIn";

  private static class CallableValidationIssues implements Callable<List<ValidationIssue>> {
    private List<IApplication> selectedApps;
    private boolean isIncludedSystemSession;
    private boolean isIncludedCurrentUser;

    public CallableValidationIssues(List<IApplication> selectedApps, boolean isIncludedSystemSession,
        boolean isIncludedCurrentUser) {
      this.selectedApps = selectedApps;
      this.isIncludedCurrentUser = isIncludedCurrentUser;
      this.isIncludedSystemSession = isIncludedSystemSession;
    }

    // SONAR-OFF
    @Override
    public List<ValidationIssue> call() throws Exception {// SONAR-ON
      HashMap<String, LinkedList<IUser>> issues = new HashMap<String, LinkedList<IUser>>();
      List<IApplication> apps =
          ServerFactory.getServer().getApplicationConfigurationManager().getApplicationsSortedByName(false);
      for (IApplication app : apps) {
        boolean isSelectedApp = false;
        for (IApplication selectedApp : selectedApps) {
          if (selectedApp.getName().equalsIgnoreCase(app.getName())) {
            isSelectedApp = true;
            break;
          }
        }
        if (isSelectedApp) {
          List<SessionInfo> sessions = app.getSecurityContext().getClusterSessionsSnapshot().getSessionInfos();
          if (sessions != null) {
            for (SessionInfo sessionInf : sessions) {
              if (!sessionInf.isSystemSession() || isIncludedSystemSession) {
                String currentUser = Ivy.session().getSessionUserName();
                String loggedInUser = sessionInf.getSessionUserName();
                if (currentUser != null && loggedInUser != null
                    && (!currentUser.equalsIgnoreCase(loggedInUser) || isIncludedCurrentUser)) {
                  getLoggedInUsers(issues, app, loggedInUser);
                }
              }
            }
          }
        }
      }
      List<ValidationIssue> validationIssues = new ArrayList<ValidationIssue>();
      Iterator<Entry<String, LinkedList<IUser>>> it = issues.entrySet().iterator();
      while (it.hasNext()) {
        Entry<String, LinkedList<IUser>> pairs = it.next();
        ValidationIssue issue = createValidationIssue(pairs.getKey(), pairs.getValue());
        validationIssues.add(issue);
        it.remove();
      }
      return validationIssues;
    }

    private void getLoggedInUsers(Map<String, LinkedList<IUser>> issues, IApplication app, String loggedInUser) {
      LinkedList<IUser> loggedInUsers = issues.get(app.getName());
      IUser user = findUser(loggedInUser, app);
      if (user != null) {
        if (loggedInUsers != null) {
          if (!loggedInUsers.contains(user)) {
            loggedInUsers.add(user);
          }
        } else {
          loggedInUsers = new LinkedList<IUser>();
          loggedInUsers.add(user);
          issues.put(app.getName(), loggedInUsers);
        }
      }
    }
  }

  public static List<ValidationIssue> getLoggedInUsers(final List<IApplication> selectedApps,
      final boolean isIncludedSystemSession, final boolean isIncludedCurrentUser) {
    try {
      return SecurityManagerFactory.getSecurityManager().executeAsSystem(
          new CallableValidationIssues(selectedApps, isIncludedSystemSession, isIncludedCurrentUser));
    } catch (Exception e) {
      return null;
    }
  }

  public static List<IUser> getLoggedInUsers(final ISecurityContext securityContext) {
    try {
      return SecurityManagerFactory.getSecurityManager().executeAsSystem(new Callable<List<IUser>>() {
        // SONAR-OFF
        @Override
        public List<IUser> call() throws Exception {
          // SONAR-ON
          List<IUser> loggedInUsers = new ArrayList<IUser>();
          List<SessionInfo> sessionInfos = securityContext.getClusterSessionsSnapshot().getSessionInfos();
          for (SessionInfo sessionInfo : sessionInfos) {
            if (!sessionInfo.isSystemSession()) {
              String sessionUserName = sessionInfo.getSessionUserName();
              addLoggedInUser(securityContext, loggedInUsers, sessionUserName);
            }
          }
          return loggedInUsers;
        }
      });
    } catch (Exception e) {
      Logger logger = Logger.getClassLogger(IvySystemInfoUtil.class);
      logger.error(e);
      return null;
    }
  }

  private static ValidationIssue createValidationIssue(String applicationName, List<IUser> loggedInUsers)
      throws EnvironmentNotAvailableException {
    ValidationIssue issue = new ValidationIssue();
    issue.setApplicationName(applicationName);
    issue.setMessage(Ivy.cms().co(WARNING_USERS_STILL_LOGGED_IN) + " [" + applicationName + "]");
    issue.setSeverity(ProjectDeploymentValidationIssueSeverity.WARNING.name());
    StringBuilder descriptionBuilder = new StringBuilder();
    descriptionBuilder.append(Ivy.cms().co(WARNING_USERS_STILL_LOGGED_IN)).append(" [").append(applicationName)
        .append("]").append(" :");
    int lastIndex = loggedInUsers.size() - 1;
    for (int i = 0; i < loggedInUsers.size(); i++) {
      IUser loggedInUser = loggedInUsers.get(i);
      if (loggedInUser != null) {
        descriptionBuilder.append(LINE_SEPARATOR).append(Ivy.cms().co("/ch/ivyteam/ivy/admin/user/username"))
            .append(": ").append(loggedInUser.getName());
        descriptionBuilder.append(LINE_SEPARATOR).append(Ivy.cms().co("/ch/ivyteam/ivy/admin/user/fullname"))
            .append(": ").append(loggedInUser.getFullName());
        descriptionBuilder.append(LINE_SEPARATOR)
            .append(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/email")).append(": ")
            .append(loggedInUser.getEMailAddress());
        if (i != lastIndex) {
          descriptionBuilder.append(LINE_SEPARATOR).append("------------------------------------");
        }
      }
    }
    issue.setDescription(descriptionBuilder.toString());
    return issue;
  }

  private static IUser findUser(String userName, IApplication app) {
    List<IUser> users = app.getSecurityContext().getUsers();
    IUser foundUser = null;
    for (IUser user : users) {
      if (user.getName().equalsIgnoreCase(userName)) {
        foundUser = user;
        break;
      }
    }
    return foundUser;
  }

  private static IUser findUser(String userName, ISecurityContext securityContext) {
    List<IUser> users = securityContext.getUsers();
    IUser foundUser = null;
    for (IUser user : users) {
      if (user.getName().equalsIgnoreCase(userName)) {
        foundUser = user;
        break;
      }
    }
    return foundUser;
  }

  private static void addLoggedInUser(final ISecurityContext securityContext, List<IUser> loggedInUsers,
      String sessionUserName) {
    if (sessionUserName != null) {
      IUser sessionUser = findUser(sessionUserName, securityContext);
      if (sessionUser != null) {
        loggedInUsers.add(sessionUser);
      }
    }
  }
}
