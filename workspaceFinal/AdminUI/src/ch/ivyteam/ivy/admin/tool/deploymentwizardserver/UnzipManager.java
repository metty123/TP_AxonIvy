package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.concurrent.Callable;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;

import ch.ivyteam.io.ZipUtil;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.GlobalVariable;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;
import ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ivy.security.SecurityManagerFactory;
import ch.ivyteam.log.Logger;
import ch.ivyteam.ulc.vwidget.common.ProjectData;
import ch.ivyteam.ulc.vwidget.common.ProjectExtractionUtils;

@SuppressWarnings("restriction")
public class UnzipManager {

  private static final Logger LOGGER = Logger.getClassLogger(UnzipManager.class);

  private List<ProjectInfo> listOfProjectInfo;
  private List<ValidationIssue> issues;
  private ProjectUnzipThread projectUnzipThread;
  private IProgressMonitor progressMonitor;
  private String errorCannotUnzip = Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/errorCannotUnzip");
  private String errorCannotUnzipDesc = Ivy.cms().co(
      "/ch/ivyteam/ivy/server/deploymentWizard/message/errorCannotUnzipDesc");
  private boolean isInterrupted;

  public UnzipManager(List<ProjectInfo> listOfProjectInfo, IProgressMonitor progressMonitor) {
    init();
    this.listOfProjectInfo = listOfProjectInfo;
    this.progressMonitor = progressMonitor;
  }

  private void init() {
    this.listOfProjectInfo = List.create(ProjectInfo.class);
    this.issues = List.create(ValidationIssue.class);
    this.projectUnzipThread = new ProjectUnzipThread();
    this.isInterrupted = false;
  }

  public void start() {
    this.projectUnzipThread.start();
  }

  public boolean isRunning() {
    return this.projectUnzipThread.isAlive();
  }

  public void abort() {
    this.isInterrupted = true;
    // try to clear temp folder
    File extractionFolder = new File(GlobalVariable.PROJECT_EXTRACTION_PATH);
    FileUtils.deleteQuietly(extractionFolder);
  }

  public List<ValidationIssue> getIssues() {
    return issues;
  }

  private ValidationIssue createValidationIssue(ProjectInfo projectInfo, String message, String description,
      String howToFix) {
    ValidationIssue issue = new ValidationIssue();

    issue.setApplicationName(projectInfo.getApplication());
    issue.setDescription(description);
    issue.setHowToFixDescription(howToFix);
    issue.setMessage(message);
    issue.setProjectName(projectInfo.getProjectName());
    issue.setSeverity(ProjectDeploymentValidationIssueSeverity.ERROR.name());

    return issue;
  }

  private class ProjectUnzipThread extends Thread {
    @Override
    public void run() {
      try {
        SecurityManagerFactory.getSecurityManager().executeAsSystem(new CallableUnzip());
      } catch (Exception e) {
        LOGGER.error(e.getMessage(), e);
      }
    }

    private class CallableUnzip implements Callable<Void> {
      // SONAR-OFF
      @Override
      public Void call() throws Exception {
        // SONAR-ON
        ArrayList<String> unpackedList = new ArrayList<String>();
        int totalTask = listOfProjectInfo.size();

        progressMonitor.beginTask("", 100 * totalTask); // NOSONAR

        for (ProjectInfo projectInfo : listOfProjectInfo) {
          LOGGER.debug("Project Info before run unzip : " + projectInfo.getProjectName() + "-PATH: "
              + projectInfo.getProjectPath() + "-ID: " + projectInfo.getLibraryId());
          if (isInterrupted) {
            break;
          } else {
            File projectFile = new File(projectInfo.getProjectPath());
            SubProgressMonitor subProgressMonitor = new SubProgressMonitor(progressMonitor, 100, 4); // NOSONAR
            if (projectFile != null && projectFile.isFile()) {
              String extractedPath = GlobalVariable.PROJECT_EXTRACTION_PATH + projectFile.getName();
              File extractedDir = new File(extractedPath);

              // if the zip file is already extracted, just try to get the extracted folder of the
              // project info item.
              if (extractedDir != null && extractedDir.exists() && unpackedList.contains(projectInfo.getProjectPath())) {
                setExtractedFolderWhenZipFileAlreadyExtracted(projectInfo, subProgressMonitor, extractedPath);
              } // the zip file is not extracted yet, extract it and try to get folder path of the
                // project info item from the extracted folder.
              else {
                setExtractedFolderWhenZipFileIsNotExtracted(unpackedList, projectInfo, projectFile, subProgressMonitor,
                    extractedPath);
              }
            } else {
              subProgressMonitor.done();
            }
          }
        }
        return null; // NOSONAR
      }

      private void setExtractedFolderWhenZipFileIsNotExtracted(java.util.List<String> unpackedList, ProjectInfo projectInfo,
          File projectFile, SubProgressMonitor subProgressMonitor, String extractedPath) {
        File newFile;
        try {
          newFile = unpackProjectFile(projectFile, subProgressMonitor);
          if (newFile != null && newFile.exists()) {
            try {
              java.util.List<ProjectData> projList = ProjectExtractionUtils.getContainedProjects(extractedPath);
              for (ProjectData proj : projList) {
                if (isProjectInforTheSameWithProjectData(projectInfo, proj)) {
                  unpackedList.add(projectInfo.getProjectPath());
                  projectInfo.setProjectPath(proj.getProjectPath());
                  break;
                }
              }
            } catch (Exception ex) {
              addErrorCannotUnzip(projectInfo, subProgressMonitor);
            }
          } else {
            addErrorCannotUnzip(projectInfo, subProgressMonitor);
          }
        } catch (IOException e) {
          addErrorCannotUnzip(projectInfo, subProgressMonitor);
        }
      }

      private void setExtractedFolderWhenZipFileAlreadyExtracted(ProjectInfo projectInfo,
          SubProgressMonitor subProgressMonitor, String extractedPath) {
        try {
          java.util.List<ProjectData> projList = ProjectExtractionUtils.getContainedProjects(extractedPath);
          for (ProjectData proj : projList) {
            if (isProjectInforTheSameWithProjectData(projectInfo, proj)) {
              projectInfo.setProjectPath(proj.getProjectPath());
              break;
            }
          }
        } catch (Exception ex) {
          addErrorCannotUnzip(projectInfo, subProgressMonitor);
        }
      }

      private void addErrorCannotUnzip(ProjectInfo projectInfo, SubProgressMonitor subProgressMonitor) {
        subProgressMonitor.done();
        issues.add(createValidationIssue(projectInfo,
            MessageFormat.format(errorCannotUnzip, projectInfo.getProjectName()),
            MessageFormat.format(errorCannotUnzipDesc, projectInfo.getProjectName()), ""));
      }

      private boolean isProjectInforTheSameWithProjectData(ProjectInfo projectInfo, ProjectData projectData) {
        return projectData.getProjectName().equals(projectInfo.getProjectName())
            && (QualifiedVersions.valueOf(projectData.getProjectVersion().toString())).equals(projectInfo.getQualifiedProjectVersion())
            && projectData.getLibraryId().equals(projectInfo.getLibraryId());
      }
    }
  }

  /**
   * extract zip or iar file to specific path in server at path E:\\IvyProjects\\DeploymentWizardProject\\Deployed\\
   * 
   * @param packedProjectFile
   * @param processModel
   * @param processModelVersion
   * @param progressMonitor
   * @return
   * @throws IOException
   */
  public static File unpackProjectFile(File packedProjectFile, IProgressMonitor progressMonitor) throws IOException {
    File tempDir = new File(GlobalVariable.PROJECT_EXTRACTION_PATH + packedProjectFile.getName());
    if (tempDir.exists()) {
      FileUtils.deleteDirectory(tempDir);
    } else {
      // SONAR-OFF
      tempDir.mkdirs();
      // SONAR-ON
    }

    ZipUtil.extractFromZipFile(packedProjectFile, tempDir, false, progressMonitor);

    // an ivy.project must contain a .project file
    File ivyProject = findDirectory(tempDir, ".project");

    if (ivyProject != null) {
      tempDir = ivyProject;
    }

    return tempDir;
  }

  /**
   * @param projectFile
   * @param processModel
   * @param processModelVersion
   * @param progressMonitor
   * @return
   * @throws IOException
   */
  public static File unpackProjectFile(File projectFile, String processModel, Integer processModelVersion,
      IProgressMonitor progressMonitor) throws IOException {
    File tempDir =
        new File(GlobalVariable.PROJECT_EXTRACTION_PATH + projectFile.getName() + File.separator + processModel
            + File.separator + processModelVersion + File.separator);
    if (tempDir.exists()) {
      FileUtils.deleteDirectory(tempDir);
    } else {
      // SONAR-OFF
      tempDir.mkdirs();
      // SONAR-ON
    }

    ZipUtil.extractFromZipFile(projectFile, tempDir, false, progressMonitor);

    // an ivy.project must contain a .project file
    File ivyProject = findDirectory(tempDir, ".project");

    if (ivyProject != null) {
      tempDir = ivyProject;
    }

    return tempDir;
  }

  /**
   * Find inside source directory to find match child with file name, if not return null
   * 
   * @param sourceDir
   * @param fileName
   * @return
   */
  private static File filterDirectory(File sourceDir, final String fileName) {
    if (sourceDir.isDirectory()) {
      File[] files;
      files = sourceDir.listFiles(new FilenameFilter() {
        @Override
        public boolean accept(File acceptDir, String acceptFileName) {
          return acceptFileName.equalsIgnoreCase(fileName);
        }
      });

      if (files.length > 0) {
        return files[0].getParentFile();
      } else {
        return null;
      }

    } else {
      if (sourceDir.getName().equalsIgnoreCase(fileName)) {
        return sourceDir.getParentFile();
      } else {
        return null;
      }
    }
  }

  /**
   * Inside source directory, find first folder which has file named as file name
   * 
   * @param sourceDir source directory
   * @param fileName file name
   * @return
   */
  private static File findDirectory(File sourceDir, String fileName) {
    File dir = null;

    if (sourceDir.isDirectory()) {
      dir = filterDirectory(sourceDir, fileName);
      if (dir != null) {
        return dir;
      } else {
        for (File file : sourceDir.listFiles()) {
          File result = findDirectory(file, fileName);
          if (result != null) {
            dir = result;
            break;
          }
        }
      }
    } else {
      if (sourceDir.getName().equalsIgnoreCase(fileName)) {
        return sourceDir.getParentFile();
      }
    }

    return dir;
  }

}
