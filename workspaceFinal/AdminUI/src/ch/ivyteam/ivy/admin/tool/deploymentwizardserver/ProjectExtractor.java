package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.LibraryUtil;
//NOSONAR
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ulc.vwidget.common.ProjectData;
import ch.ivyteam.ulc.vwidget.common.ProjectExtractionUtils;

@SuppressWarnings("restriction")
public class ProjectExtractor {

  private String filePath = "";
  private String exception = "";
  private List<ProjectInfo> projects = List.create(ProjectInfo.class);
  private ProjectExtractionThread projectExtractionThread = new ProjectExtractionThread();

  public ProjectExtractor(String paramfilePath) {
    filePath = paramfilePath;
  }

  private class ProjectExtractionThread extends Thread {

    @Override
    public void run() {
      List<ProjectData> list = List.create(ProjectData.class);

      try {
        list.addAll(ProjectExtractionUtils.getContainedProjects(filePath));
      } catch (Exception e) {
        setException(e.getMessage());
      }

      setProjects(list);
    }
  }

  public void start() {
    projectExtractionThread.start();
  }

  public boolean isRunning() {
    return projectExtractionThread.isAlive();
  }

  public List<ProjectInfo> getProjects() {
    return projects;
  }

  /**
   * convert list of ProjectData to list of ProjectInfo ivy data object
   * 
   * @param paramProjects
   */
  public void setProjects(List<ProjectData> paramProjects) {
    if (paramProjects != null && paramProjects.size() > 0) {
      for (ProjectData item : paramProjects) {
        ProjectInfo projectInfo = new ProjectInfo();

        projectInfo.setProjectName(item.getProjectName());
        projectInfo.setProjectPath(item.getProjectPath());
        projectInfo.setOriginPath(item.getProjectPath());
        projectInfo.setQualifiedProjectVersion(QualifiedVersions.valueOf(item.getProjectVersion().toString()));
        projectInfo.setLibraryId(item.getLibraryId());
        projectInfo.setRequireProjects(LibraryUtil.getRequireProjectInfo(item.getRequireProjects()));

        projects.add(projectInfo);
      }
    }
  }

  public void stop() {
    ProjectExtractionUtils.cancelProcess();
  }

  public void restartProgress() {
    ProjectExtractionUtils.restartProgress();
  }

  public String getException() {
    return exception;
  }

  public void setException(String paramException) {
    exception = paramException;
  }
}
