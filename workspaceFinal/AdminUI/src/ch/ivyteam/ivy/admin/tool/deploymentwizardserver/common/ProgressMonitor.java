package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common;

import org.eclipse.core.runtime.IProgressMonitor;

public class ProgressMonitor implements IProgressMonitor {
  private volatile String currentTaskName;
  private volatile String currentSubTaskName;
  private volatile int totalWork;
  private volatile double worked;
  private volatile boolean isCanceled;

  public String getCurrentTaskName() {
    String taskName = this.currentTaskName;
    if (taskName == null) {
      return "";
    }

    String subTaskName = this.currentSubTaskName;
    if (subTaskName == null) {
      return taskName;
    }

    return taskName + " " + subTaskName;
  }

  public int getTotalWork() {
    return this.totalWork;
  }

  public int getWorked() {
    return (int) this.worked;
  }

  public void beginTask(String taskName, int totalTaskWork) {
    this.currentTaskName = taskName;
    this.totalWork = totalTaskWork;
  }

  public void done() {
    this.worked = this.totalWork;
  }

  public void internalWorked(double work) {
    this.worked += work;
  }

  public boolean isCanceled() {
    return this.isCanceled;
  }

  public void setCanceled(boolean value) {
    this.isCanceled = value;
  }

  public void setTaskName(String name) {
    this.currentTaskName = name;
  }

  public void subTask(String name) {
    this.currentSubTaskName = name;
  }

  public void worked(int work) {
    internalWorked(work);
  }
}
