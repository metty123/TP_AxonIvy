package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.log.Logger;
import ch.ivyteam.ulc.vwidget.server.IVFileUtilitiesHandler;
import ch.ivyteam.ulc.vwidget.server.IVFolderCompressHandler;
import ch.ivyteam.ulc.vwidget.server.ULCVFileUtilities;
import ch.ivyteam.ulc.vwidget.server.ULCVFolderCompression;

import com.ulcjava.base.application.ULCAlert;

public class ZipManager {
  private static final Logger LOGGER = Logger.getClassLogger(ZipManager.class);
  private static final String TEMPORARY = "_TEMP_";
  private List<ClientFileInfo> tempZipFiles;
  private List<ClientFileInfo> projectsWillBeZipped;
  private List<ClientFileInfo> projectsAlreadyZipped;
  private int percent;
  private String status;
  private int currentIndex;
  private boolean isRunning;
  private boolean isCancelled;
  private ULCVFolderCompression zipTool;
  private ULCVFileUtilities fileUtil;
  private IVFolderCompressHandler zipFolderHandler;
  private Map<String, String> pathMapping;

  public ZipManager() {
    this.tempZipFiles = List.create(ClientFileInfo.class);
    this.projectsWillBeZipped = List.create(ClientFileInfo.class);
    this.projectsAlreadyZipped = List.create(ClientFileInfo.class);
    this.percent = 0;
    this.status = "";
    this.currentIndex = 0;
    this.isRunning = false;
    this.isCancelled = false;
    this.pathMapping = new HashMap<String, String>();
  }

  public void compress(List<ClientFileInfo> filesWillBeZipped) {
    clearCollections();
    this.isRunning = true;

    // Prepare list of folders to create zip file
    for (int i = 0; i < filesWillBeZipped.size(); i++) {
      ClientFileInfo projectToBeZipped = filesWillBeZipped.get(i);
      LOGGER.debug("Prepare: " + projectToBeZipped.getName() + ", " + projectToBeZipped.getPath() + ", "
          + projectToBeZipped.getIsDirectory());
      ClientFileInfo fileInfo = new ClientFileInfo();
      fileInfo.setName(i + TEMPORARY + projectToBeZipped.getName());
      fileInfo.setPath(projectToBeZipped.getPath());
      fileInfo.setIsDirectory(projectToBeZipped.getIsDirectory());
      fileInfo.setProjectVersion(projectToBeZipped.getProjectVersion());
      fileInfo.setRequireProjects(projectToBeZipped.getRequireProjects());
      fileInfo.setLibraryId(projectToBeZipped.getLibraryId());
      fileInfo.setId(projectToBeZipped.getId());

      if (projectToBeZipped.getIsDirectory()) {
        projectsWillBeZipped.add(fileInfo);
      } else {
        // Set this flag so that this file will not be removed later
        fileInfo.setIsTempFile(false);
        projectsAlreadyZipped.add(fileInfo);
      }
    }

    if (!projectsWillBeZipped.isEmpty()) {
      zipClientFolder();
    } else {
      this.isRunning = false;
      for (ClientFileInfo file : projectsAlreadyZipped) {
        file.setName(getOriginalProjectName(file.getName()));
      }
    }
  }

  private void clearCollections() {
    tempZipFiles.clear();
    projectsWillBeZipped.clear();
    projectsAlreadyZipped.clear();
    pathMapping.clear();
  }

  private void zipClientFolder() {
    if (!isCancelled) {
      if (this.currentIndex < this.projectsWillBeZipped.size()) {
        ClientFileInfo currentProject = this.projectsWillBeZipped.get(currentIndex);

        String projectPath = currentProject.getPath();
        // This folder is already compressed
        if (pathMapping.containsKey(projectPath)) {
          // Add this zip file to list of uploaded files
          String zipFilePath = pathMapping.get(projectPath);
          if (zipFilePath != null && !zipFilePath.isEmpty()) {
            Ivy.log().info("zip existed: " + zipFilePath);
            addZippedFileInfo(currentProject, zipFilePath);
          }
          compressNextFolder();
        } else {
          String projectName = currentProject.getName();
          String displayedProjectName = getOriginalProjectName(projectName);
          this.status =
              Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/compressingInfo",
                  java.util.Arrays.asList(new Object[] {displayedProjectName}));

          this.zipFolderHandler = new MyFolderCompressHandler(currentProject);

          this.zipTool = new ULCVFolderCompression(this.zipFolderHandler);

          if (zipTool.isUploaded()) {
            zipTool.zipClientFolder(projectName, projectPath);
          }
        }
      } else {
        this.isRunning = false;
        for (ClientFileInfo fileInfo : projectsAlreadyZipped) {
          fileInfo.setName(getOriginalProjectName(fileInfo.getName()));
        }
        LOGGER.debug("Compress project finish.");
      }
    }
  }

  private void addZippedFileInfo(ClientFileInfo project, String zipFilePath) {
    ClientFileInfo fileInfo = new ClientFileInfo();
    fileInfo.setName(project.getName());
    fileInfo.setPath(zipFilePath);
    // Set this flag to remove this file later
    fileInfo.setIsTempFile(true);
    fileInfo.setProjectVersion(project.getProjectVersion());
    fileInfo.setRequireProjects(project.getRequireProjects());
    fileInfo.setLibraryId(project.getLibraryId());
    fileInfo.setId(project.getId());

    projectsAlreadyZipped.add(fileInfo);
    // Add this fileInfo so that we can remove the temporary files later
    tempZipFiles.add(fileInfo);
    String projectPath = project.getPath();
    if (!pathMapping.containsKey(projectPath)) {
      pathMapping.put(projectPath, zipFilePath);
    }
  }

  private void compressNextFolder() {
    currentIndex++;
    zipClientFolder();
  }

  private void removeTemporaryFiles(java.util.List<String> filePaths) {
    if (this.fileUtil == null) {
      this.fileUtil = new ULCVFileUtilities(new IVFileUtilitiesHandler() {

        @Override
        public void onFailure(String arg0) {
          LOGGER.error(arg0);
        }

        @Override
        public void onDeleteFiles(boolean arg0) {}

        @Override
        public void onDeleteFile(boolean arg0) {}

        @Override
        public void onCheckPathExists(boolean arg0) {}
      });
    }
    if (this.fileUtil.isUploaded()) {
      this.fileUtil.deleteFiles(filePaths);
    }
  }

  private String getOriginalProjectName(String projectName) {
    return projectName.substring(projectName.indexOf(TEMPORARY) + TEMPORARY.length(), projectName.length());
  }

  public int getPercent() {
    return percent;
  }

  public String getStatus() {
    return status;
  }

  public boolean isRunning() {
    return isRunning;
  }

  public void abort() {
    this.isCancelled = true;
    if (this.zipTool != null) {
      this.zipTool.cancelRequest();
    }
  }

  public List<ClientFileInfo> getProjectsAlreadyZipped() {
    return projectsAlreadyZipped;
  }

  public void getZipProgress() {
    if (this.zipTool != null) {
      this.zipTool.getZipProgress();
    }
  }

  private final class MyFolderCompressHandler implements IVFolderCompressHandler {
    private final ClientFileInfo project;

    private MyFolderCompressHandler(ClientFileInfo project) {
      this.project = project;
    }

    @Override
    public void onZipProgress(long arg0) {
      if (currentIndex < projectsWillBeZipped.size()) {
        float zipPercentForCurrentFile = (float) arg0;
        float zipPercentOfPreviousFiles = 100.0F * currentIndex / projectsWillBeZipped.size(); // NOSONAR
        percent = Math.round(zipPercentForCurrentFile / projectsWillBeZipped.size() + zipPercentOfPreviousFiles);
        LOGGER.debug(zipPercentOfPreviousFiles + " %, " + arg0 + " %, (" + percent + " %)");
      } else {
        percent = 100; // NOSONAR
        LOGGER.debug("(" + percent + " %)");
      }
    }

    @Override
    public void onSuccess(String zipName, String zipPath) {
      if (zipName != null && !zipName.equals("") && zipPath != null && !zipPath.equals("")) {
        LOGGER.debug("Succeed to compress: " + zipPath);
        // Add this zip file to list of uploaded files
        addZippedFileInfo(project, zipPath);
        compressNextFolder();
      }
    }

    @Override
    public void onFailure(String message) {
      if ((message != null) && !message.equals("")) {
        String title = Ivy.cms().co("/Dialogs/general/error");
        String firstButtonLabel = Ivy.cms().co("/Dialogs/general/ok");
        ULCAlert alert = new ULCAlert(title, message, firstButtonLabel);
        alert.show();
      }
    }

    @Override
    public void onCancel() {
      LOGGER.debug("Time at onCancel(Zip): " + System.currentTimeMillis());
      // Get temporary files
      java.util.List<String> files = new ArrayList<String>();
      LOGGER.debug("Prepare to delete temp files:");
      for (ClientFileInfo fileInfo : tempZipFiles) {
        LOGGER.debug(fileInfo.getPath());
        files.add(fileInfo.getPath());
      }

      // Remove temporary files
      removeTemporaryFiles(files);

      // Clear current state
      clearCollections();
    }
  }
}
