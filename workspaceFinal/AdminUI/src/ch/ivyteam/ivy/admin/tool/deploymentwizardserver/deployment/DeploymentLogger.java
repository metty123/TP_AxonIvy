package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.deployment;

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.deployment.IDeploymentLogger;

public class DeploymentLogger implements IDeploymentLogger {
  private static List<String> deploymentLogInfo = new ArrayList<String>();
  private static List<String> deploymentLogError = new ArrayList<String>();

  public static List<String> getDeploymentLogInfo() {
    return deploymentLogInfo;
  }

  public static List<String> getDeploymentLogError() {
    return deploymentLogError;
  }

  @Override
  public void info(String message) {
    synchronized (deploymentLogInfo) {
      info(message, null);
    }
  }

  @Override
  public void info(String message, Throwable t) {
    synchronized (deploymentLogInfo) {
      deploymentLogInfo.add("[INFO] " + message);
    }
  }

  @Override
  public void warning(String message) {
    synchronized (deploymentLogInfo) {
      warning(message, null);
    }
  }

  @Override
  public void warning(String message, Throwable t) {
    synchronized (deploymentLogInfo) {
      deploymentLogInfo.add("[WARN] " + message);
    }
  }

  @Override
  public void error(String message) {
    error(message, null);
  }

  @Override
  public void error(String message, Throwable t) {
    synchronized (deploymentLogInfo) {
      deploymentLogInfo.add("[ERROR] " + message);
      deploymentLogError.add(message);
      if (t != null) {
        // Display the full stack trace in log
        for (StackTraceElement elt : t.getStackTrace()) {
          deploymentLogError.add(elt.toString());
          deploymentLogInfo.add("\t" + elt.toString());
        }
      }
    }
  }

}
