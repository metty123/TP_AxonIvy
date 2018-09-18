package ch.ivyteam.ivy.admin.tool.process;

import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.synch.SynchronizationListener;

public class SynchronizationManager {

  private SynchronizationListener listener;

  public SynchronizationManager(SynchronizationListener listener) {
    this.listener = listener;
  }

  public void triggerSynchronization(ISecurityContext context) {
    context.triggerSynchronization(listener);
  }
}
