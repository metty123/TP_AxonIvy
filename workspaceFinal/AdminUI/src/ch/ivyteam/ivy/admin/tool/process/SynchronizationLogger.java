package ch.ivyteam.ivy.admin.tool.process;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;

import ch.ivyteam.api.IvyScriptVisibility;
import ch.ivyteam.api.PublicAPI;
import ch.ivyteam.ivy.security.synch.SynchronizationListener;
import ch.ivyteam.ivy.security.synch.UpdateEvent;

public class SynchronizationLogger implements SynchronizationListener {

  private static List<String> synchronizationLogMessages = new ArrayList<String>();

  public static List<String> getSynchronizationLogMessages() {
    return synchronizationLogMessages;
  }

  @Override
  @PublicAPI(IvyScriptVisibility.EXPERT)
  public void handleFinished(UpdateEvent arg0) {}

  @Override
  @PublicAPI(IvyScriptVisibility.EXPERT)
  public void handleLog(Level arg0, String arg1, Throwable arg2) {
    StringBuilder messageBuilder = new StringBuilder(arg1);

    if (arg2 != null) {
      // Display the full stack trace in log
      for (StackTraceElement elt : arg2.getStackTrace()) {
        messageBuilder.append("\n\t").append(elt.toString());
      }
    }

    synchronizationLogMessages.add(messageBuilder.toString());
  }

  @Override
  @PublicAPI(IvyScriptVisibility.EXPERT)
  public void handleUpdate(UpdateEvent arg0) {}

}
