package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

import ch.ivyteam.ivy.Advisor;
import ch.ivyteam.ivy.application.IApplication;

@SuppressWarnings("restriction")
public class ValidationManager {

  private IProgressMonitor progressMonitor;
  private ValidationThread validationThread;

  public ValidationManager(List<ProjectInfo> projectInfos, List<IApplication> applications,
      IProgressMonitor progressMonitor) {
    this.progressMonitor = progressMonitor;
    validationThread = new ValidationThread(projectInfos, applications, this.progressMonitor);
  }

  public List<ValidationIssue> getValidationIssues() {
    return validationThread.getValidationIssues();
  }

  public void start() {
    if (Advisor.getAdvisor().isServer()) {
      validationThread.start();
    }
  }

  public void abort() {
    this.progressMonitor.setCanceled(true);
  }

  public boolean isRunning() {
    return this.validationThread.isAlive();
  }
}
