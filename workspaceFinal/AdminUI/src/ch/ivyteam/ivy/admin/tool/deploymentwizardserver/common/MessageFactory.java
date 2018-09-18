package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.environment.Ivy;

/**
 * Uses for generate messages (error message, information message...) 
 */
public final class MessageFactory {
  
  private MessageFactory(){};
  
  /**
   * Creates error message with a CMS format.
   * @param projects - list duplicated projects
   * @return {@link String} message
   */
  public static String createDuplicatedProjectErrorMessage(List<ProjectInfo> projects) {
    String lineSeparator = "\n";
    StringBuilder builder = new StringBuilder(lineSeparator);
    Set<String> errorMessages = new HashSet<>();
    for (int i = 0; i < projects.size(); i++) {
      String errorMessage = createDuplicatedProjectErrorMessage(projects.get(i));
      errorMessages.add(errorMessage);
    }
    
    for (String errorMessage : errorMessages) {
      builder.append("- ").append(errorMessage).append(lineSeparator);
    }
    
    List<Object> parameters = new ArrayList<>();
    parameters.add(builder.toString());
    String message = Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/errorDuplicateMessage", parameters);
    
    return message;
  }

  private static String createDuplicatedProjectErrorMessage(ProjectInfo project) {
    return project.getProjectName() + " (" + project.getLibraryId() + ":" + project.getQualifiedProjectVersion() + ")";
  }
}
