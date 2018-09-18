package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.deployment;

import java.io.File;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.application.ActivityState;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.IProcessModel;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.application.ReleaseState;
import ch.ivyteam.ivy.deployment.IDeploymentLogger;
import ch.ivyteam.ivy.deployment.ProjectDeployment;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ivy.security.SecurityManagerFactory;

public class DeploymentManager {
  private static final int DELAY_TIME = 2000;
  public static final int LENGTH_PER_DEPLOY = 100;

  private List<IApplication> appList;
  private List<ProjectInfo> projectList;
  private List<ProjectInfo> deployedProjects;
  private List<ProjectInfo> undeployedProjects;
  private DeploymentThread deploymentThread;
  private IProgressMonitor progressMonitor;
  private String createdByUser = "";
  private String createdFromHost = "";
  private boolean isFailActivation;
  private boolean isFailRelease;
  private boolean isFailDeployment;

  public DeploymentManager(List<IApplication> pAppList, List<ProjectInfo> pProjectList,
      IProgressMonitor pProgressMonitor, IDeploymentLogger pLog, String pUser, String pHost) {
    appList = pAppList;
    projectList = pProjectList;
    progressMonitor = pProgressMonitor;
    createdByUser = pUser;
    createdFromHost = pHost;
    deploymentThread = new DeploymentThread(pLog);
    isFailActivation = false;
    isFailRelease = false;
    isFailDeployment = false;
  }

  public boolean isFailActivation() {
    return isFailActivation;
  }

  public boolean isFailRelease() {
    return isFailRelease;
  }

  public boolean isFailDeployment() {
    return isFailDeployment;
  }

  public List<ProjectInfo> getDeployedProjects() {
    return deployedProjects;
  }

  public List<ProjectInfo> getUndeployedProjects() {
    if (undeployedProjects != null && deployedProjects != null) {
      for (ProjectInfo project : projectList) {
        if (!deployedProjects.contains(project)) {
          undeployedProjects.add(project);
        }
      }
    }
    return undeployedProjects;
  }

  public void start() {
    deploymentThread.start();
  }

  public boolean isRunning() {
    return deploymentThread.isAlive();
  }

  public void abort() {
    progressMonitor.setCanceled(true);
  }

  public void stop() {
    deploymentThread.stop = true;
  }

  private class DeploymentThread extends Thread {
    private boolean stop = false;
    private IDeploymentLogger log;

    public DeploymentThread(IDeploymentLogger log) {
      this.log = log;
    }

    private class CallableDeployment implements Callable<Boolean> {
      private java.util.List<ProjectInfo> orderedProjectList;

      public CallableDeployment(java.util.List<ProjectInfo> orderedProjectList) {
        this.orderedProjectList = orderedProjectList;
      }
      // SONAR-OFF
      @Override
      public Boolean call() throws Exception {
        // SONAR-ON
        for (IApplication app : appList) {
          if (progressMonitor.isCanceled()) {
            return false;
          }
          for (int i = 0; i < orderedProjectList.size(); i++) {
            ProjectInfo projectInfo = orderedProjectList.get(i);

            if (projectInfo.getApplication().equalsIgnoreCase(app.getName())) {
              if (progressMonitor.isCanceled()) {
                return false;
              }

              if (stop) {
                return true;
              } else {
                File sourceFolder = new File(projectInfo.getProjectPath());
                if (sourceFolder.exists()) {
                  IProcessModel pm = app.findProcessModel(projectInfo.getProcessModel());
                  // if process model doesn't exists, create
                  if (pm == null) {
                    pm = app.createProcessModel(projectInfo.getProcessModel(), "");
                  } else {
                    pm.deactivate();
                  }
                  IProcessModelVersion pmv = null;
                  if (pm.getProcessModelVersions() != null && pm.getProcessModelVersions().size() > 0) {
                    boolean foundPMV = false;
                    // find pmv with match project version
                    for (IProcessModelVersion processModelVersion : pm.getProcessModelVersions()) {
                      if (processModelVersion.getVersionNumber() == projectInfo.getProcessModelVersion()) {
                        pmv = processModelVersion;
                        foundPMV = true;
                      }
                    }

                    // if pmv not found, create new
                    if (!foundPMV) {
                      pmv = createPMV(pm, projectInfo);
                    }
                  } else {
                    // empty PM, create new PMV
                    pmv = createPMV(pm, projectInfo);
                  }

                  // if process model version doesn't exists, create
                  if (pmv == null) {
                    pmv = createPMV(pm, projectInfo);

                  } else {
                    pmv.deactivate();
                  }

                  SubProgressMonitor subProgressMonitor =
                      new SubProgressMonitor(progressMonitor, (int) (LENGTH_PER_DEPLOY * 0.9), 4); // NOSONAR

                  File fileOrFolderProject = new File(projectInfo.getProjectPath());

                  // if folder, deploy
                  if (fileOrFolderProject.exists()) {
                    if (fileOrFolderProject.list() != null && fileOrFolderProject.list().length > 0) {
                      ProjectDeployment.deploy(fileOrFolderProject, pmv, createdByUser, createdFromHost,
                          subProgressMonitor, log);
                    } else {
                      log.error("Deploy directory is empty");
                      isFailDeployment = true;
                    }
                  } else {
                    log.error("Project path is not exists : " + projectInfo.getProjectPath());
                    isFailDeployment = true;
                  }

                  // Add deployedProject into deployed project list
                  deployedProjects.add(projectInfo);

                  progressMonitor.worked((int) (LENGTH_PER_DEPLOY * 0.05)); // NOSONAR
                  // active project if needed
                  if (projectInfo.getActivity().equalsIgnoreCase(ActivityState.ACTIVE.name())) {
                    try {
                      pmv.getApplication().activate();
                      pmv.getProcessModel().activate();
                      pmv.activateRequiredProcessModelVersions();

                      // delay
                      sleep(DELAY_TIME);
                    } catch (Exception e) {
                      isFailActivation = true;
                      log.error(e.getMessage(), e);
                    }
                  }

                  if (i < (projectList.size() - 1)) {
                    progressMonitor.worked((int) (LENGTH_PER_DEPLOY * 0.05)); // NOSONAR
                  } else {
                    progressMonitor.done();
                  }
                  // release project if needed
                  if (projectInfo.getRelease().equalsIgnoreCase(ReleaseState.RELEASED.name())) {
                    try {
                      pmv.release();
                      // delay
                      sleep(DELAY_TIME);
                    } catch (Exception e) {
                      isFailRelease = true;
                      log.error(e.getMessage(), e);
                    }
                  }
                } else {
                  log.error("Project path is not exists : " + projectInfo.getProjectPath());
                  isFailDeployment = true;
                }

              }
            }
          }

        }
        return true;
      }
    }

    public void run() {
      final java.util.List<ProjectInfo> orderedProjectList = ProjectionSorter.getOrderedProjectList(projectList);
      deployedProjects = List.create(ProjectInfo.class);
      undeployedProjects = List.create(ProjectInfo.class);
      final int totalTask = projectList.size() * LENGTH_PER_DEPLOY;
      progressMonitor.beginTask("", totalTask);

      try {
        SecurityManagerFactory.getSecurityManager().executeAsSystem(new CallableDeployment(orderedProjectList));
      } catch (Exception e) {
        log.error(e.getMessage(), e);
        isFailDeployment = true;
      }

    }

    /*
     * set name of currently logged in user to the input parameter: createdByUser of createPMV
     * method set current host of ULC client as createdFromHost input parameter of createPMV set the
     * project name (.project file) to the name of newly created PMV (name parameter on the create
     * PMV API)
     */
    private IProcessModelVersion createPMV(IProcessModel pm, ProjectInfo projectInfo) {
      IProcessModelVersion newPMV =
          pm.createProcessModelVersion(projectInfo.getProjectName(), "", createdByUser, createdFromHost,
              projectInfo.getProcessModelVersion());

      return newPMV;
    }
  }
}
