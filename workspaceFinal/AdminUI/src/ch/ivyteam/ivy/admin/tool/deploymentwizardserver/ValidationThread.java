package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import static org.eclipse.core.runtime.SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.IProcessModel;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.deployment.ProjectDeployment;
import ch.ivyteam.ivy.deployment.ProjectDeploymentValidator;
import ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue;
import ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity;
import ch.ivyteam.ivy.project.IIvyProject;
import ch.ivyteam.ivy.security.SecurityManagerFactory;

@SuppressWarnings("restriction")
public class ValidationThread extends Thread {

  private static final int NUMBER_OF_VALIDATION_WORKS = 3;

  private List<IApplication> applications;
  private List<ProjectInfo> projectInfos;
  private List<ValidationIssue> validationIssues;

  private final IProgressMonitor progressMonitor;
  private final ProjectDeploymentValidator deploymentValidator;

  public ValidationThread(List<ProjectInfo> projectInfos, List<IApplication> applications,
      IProgressMonitor progressMonitor) {
    this.projectInfos = projectInfos;
    this.applications = applications;
    validationIssues = new ArrayList<>();
    this.progressMonitor = progressMonitor;
    deploymentValidator = ProjectDeployment.newDeploymentValidator();
  }

  public void run() {
    try {
      validationIssues.clear();
      int totalValidationWork = applications.size() * projectInfos.size() * NUMBER_OF_VALIDATION_WORKS;
      progressMonitor.beginTask("", totalValidationWork);
      SecurityManagerFactory.getSecurityManager().executeAsSystem(new ProjectValidationCallable());
    } catch (Exception e) {
      ValidationIssue issue = createValidationIssue(e);
      validationIssues.add(issue);
    } finally {
      if (progressMonitor != null) {
        progressMonitor.done();
      }
    }
  }

  private final class ProjectValidationCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception { // NOSONAR
      for (IApplication application : applications) {
        if (progressMonitor.isCanceled()) {
          return false;
        }
        for (ProjectInfo projectInfo : projectInfos) {
          if (progressMonitor.isCanceled()) {
            return false;
          }
          try {
            SubProgressMonitor projectPreparingProgressMonitor = new SubProgressMonitor(progressMonitor, 1,
                PREPEND_MAIN_LABEL_TO_SUBTASK);
            IIvyProject preparedIvyProject = prepareIvyProject(projectInfo, application,
                projectPreparingProgressMonitor);
            SubProgressMonitor projectValidatingProgressMonitor = new SubProgressMonitor(progressMonitor, 1,
                PREPEND_MAIN_LABEL_TO_SUBTASK);
            List<IProjectDeploymentValidationIssue> projectDeploymentValidationIssues = deploymentValidator.validate(
                preparedIvyProject, projectValidatingProgressMonitor);
            for (IProjectDeploymentValidationIssue issue : projectDeploymentValidationIssues) {
              ValidationIssue validationIssue = createValidationIssue(application, projectInfo, issue);
              validationIssues.add(validationIssue);
            }
          } finally {
            deploymentValidator.finishValidation();
            progressMonitor.worked(1);
          }
        }
      }
      return true;
    }
  }

  private IIvyProject prepareIvyProject(ProjectInfo projectInfo, IApplication application,
      SubProgressMonitor subProgressMonitor) throws Exception { // NOSONAR

    File projectFile = new File(projectInfo.getProjectPath());
    String processModelName = projectInfo.getProcessModel();

    for (IProcessModel processModel : application.getProcessModels()) {
      if (processModelName.equalsIgnoreCase(processModel.getName())) {
        IProcessModelVersion processModelVersion = findProcessModelVersion(processModel.getProcessModelVersions(),
            projectInfo);
        if (processModelVersion != null) {
          return deploymentValidator.prepareIvyProject(projectFile, processModelVersion, subProgressMonitor);
        }
        return deploymentValidator.prepareIvyProject(projectFile, processModel, subProgressMonitor);
      }
    }
    return deploymentValidator.prepareIvyProject(projectFile, application, subProgressMonitor);
  }

  private IProcessModelVersion findProcessModelVersion(List<IProcessModelVersion> processModelVersions,
      ProjectInfo projectInfo) {
    for (IProcessModelVersion processModelVersion : processModelVersions) {
      if (processModelVersion.getLibrary() != null
          && processModelVersion.getLibrary().getId().equals(projectInfo.getLibraryId())
          && processModelVersion.getLibrary().getQualifiedVersion()
              .equals(projectInfo.getQualifiedProjectVersion())) {
        return processModelVersion;
      }
    }
    return null;
  }

  private ValidationIssue createValidationIssue(IApplication application, ProjectInfo projectInfo,
      IProjectDeploymentValidationIssue issue) {
    ValidationIssue validationIssue = new ValidationIssue();
    validationIssue.setMessage(issue.getMessage());
    validationIssue.setSeverity(issue.getSeverity().name());
    validationIssue.setProjectName(projectInfo.getProjectName());
    validationIssue.setApplicationName(application.getName());
    validationIssue.setDescription(issue.getDescription());
    validationIssue.setHowToFixDescription(issue.getHowToFixDescription());
    return validationIssue;
  }

  private ValidationIssue createValidationIssue(Exception e) {
    ValidationIssue validationIssue = new ValidationIssue();
    validationIssue.setMessage(e.getMessage());
    validationIssue.setSeverity(ProjectDeploymentValidationIssueSeverity.EXCEPTION.name());
    validationIssue.setProjectName("");
    validationIssue.setApplicationName("");
    validationIssue.setDescription(e.getMessage());
    validationIssue.setHowToFixDescription("");
    return validationIssue;
  }

  public List<ValidationIssue> getValidationIssues() {
    return validationIssues;
  }
}
