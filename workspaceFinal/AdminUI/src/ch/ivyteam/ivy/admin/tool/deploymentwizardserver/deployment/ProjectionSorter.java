package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.deployment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.RequireLibraryInfo;
import ch.ivyteam.ivy.application.value.VersionRange;

public final class ProjectionSorter {

  private ProjectionSorter() {
  }

  /**
   * @param projectInfos
   *          : original project list
   * @return unmodifiable ordered project list
   */
  public static java.util.List<ProjectInfo> getOrderedProjectList(List<ProjectInfo> projectInfos) {

    List<ProjectInfo> copiedProjectInfos = new ArrayList<>(projectInfos);

    orderingProject(copiedProjectInfos);

    return Collections.unmodifiableList(copiedProjectInfos);
  }

  private static void orderingProject(List<ProjectInfo> projectInfos) {
    boolean elementSwitched = true;
    while (elementSwitched) {
      elementSwitched = false;
      for (int i = 0; i < projectInfos.size(); i++) {
        ProjectInfo projectInfo = projectInfos.get(i);
        List<RequireLibraryInfo> requiredLibraryInfos = projectInfo.getRequireProjects();
        int foundPositionIndex = getMatchedRequiredProjectInfo(projectInfos, requiredLibraryInfos);
        if (foundPositionIndex > i) {
          switchPosition(projectInfos, i, foundPositionIndex);
          elementSwitched = true;
        }
      }
    }

  }

  private static void switchPosition(List<ProjectInfo> projectInfos, int sourcePosition, int destPosition) {
    ProjectInfo projectInfo = projectInfos.remove(sourcePosition);
    projectInfos.add(destPosition, projectInfo);
  }

  private static int getMatchedRequiredProjectInfo(List<ProjectInfo> projectInfos,
      List<RequireLibraryInfo> requiredLibraryInfos) {
    int highestPositionIndex = -1;
    for (RequireLibraryInfo e : requiredLibraryInfos) {
      VersionRange range = new VersionRange(e.getMinVersionBound(), e.getMaxVersionBound());
      for (ProjectInfo projectInfo : projectInfos) {
        if (isMatchedProject(e, range, projectInfo)) {
          int projectInfoPositionIndex = projectInfos.indexOf(projectInfo);
          if (projectInfoPositionIndex > highestPositionIndex) {
            highestPositionIndex = projectInfoPositionIndex;
          }
        }
      }
    }

    return highestPositionIndex;
  }

  private static boolean isMatchedProject(RequireLibraryInfo requiredLibraryInfo, VersionRange range,
      ProjectInfo projectInfo) {
    return requiredLibraryInfo.getId().equals(projectInfo.getLibraryId())
        && range.isVersionInRange(projectInfo.getQualifiedProjectVersion());
  }

}
