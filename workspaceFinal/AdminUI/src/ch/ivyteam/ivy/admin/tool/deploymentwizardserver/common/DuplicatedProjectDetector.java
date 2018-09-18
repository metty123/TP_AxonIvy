package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common;

import java.util.List;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;

/**
 * This class provides utility methods that help to check if projects are duplicated.
 */
public final class DuplicatedProjectDetector {

  private DuplicatedProjectDetector() {}
  
  /**
   * Checks if given project exists in the given list.
   * 
   * @param projects
   * @param project
   * @return true if given list contains given project.
   */
  public static boolean hasDuplicatedProject(List<ProjectInfo> projects, ProjectInfo project) {
    for (ProjectInfo existingProject : projects) {
      if (isSameProject(project, existingProject)) {
        return true;
      }
    }
    return false;
  }

  private static boolean isSameProject(ProjectInfo first, ProjectInfo second) {
    return first.getLibraryId().equals(second.getLibraryId())
        && first.getQualifiedProjectVersion().equals(second.getQualifiedProjectVersion());
  }
}
