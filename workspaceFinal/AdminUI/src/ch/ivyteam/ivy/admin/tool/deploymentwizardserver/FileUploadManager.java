package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.log.Logger;
import ch.ivyteam.ulc.vwidget.server.IVFileDownloadHandler;
import ch.ivyteam.ulc.vwidget.server.IVFileUtilitiesHandler;
import ch.ivyteam.ulc.vwidget.server.ULCVFileDownloader;
import ch.ivyteam.ulc.vwidget.server.ULCVFileUtilities;

import com.ulcjava.base.application.ULCAlert;
import com.ulcjava.base.application.event.IWindowListener;
import com.ulcjava.base.application.event.WindowEvent;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/*
 * @author htlam (lam.ho@axonactive.vn)
 */
public class FileUploadManager {
  private static final Logger LOGGER = Logger.getClassLogger(FileUploadManager.class);
  // Maximum upload to 7 EB
  private static final long MAXIMUM_UPLOAD_SIZE_BYTES = Long.MAX_VALUE;
  private static int uploadingFileIndex = 0;

  private String uploadFolderPath;
  private java.util.List<ClientFileInfo> filesWillBeUploaded;
  private ClientFileInfo currentFileInfo;
  private List<ClientFileInfo> listOfUploadedClientProj;
  private Map<String, String> clientServerPathMap;
  private ULCVFileDownloader fileDownloader;
  private MyFileDownloadHandler downloadHandler;
  private DecimalFormat df;
  private boolean isRunning;
  private boolean isFailed;

  public boolean isRunning() {
    return isRunning;
  }

  public boolean isFailed() {
    return isFailed;
  }

  private ClientFileInfo getCurrentFileInfo() {
    return currentFileInfo;
  }

  private void setCurrentFileInfo(ClientFileInfo currentFileInfo) {
    this.currentFileInfo = currentFileInfo;
  }

  public String getUploadFolderPath() {
    return uploadFolderPath;
  }

  private void setUploadFolderPath(String uploadFolderPath) {
    this.uploadFolderPath = uploadFolderPath;
  }

  public List<ClientFileInfo> getListOfUploadedClientProj() {
    return listOfUploadedClientProj;
  }

  public FileUploadManager() {
    uploadFolderPath = "";
    filesWillBeUploaded = new ArrayList<ClientFileInfo>();
    listOfUploadedClientProj = List.create(ClientFileInfo.class);
    clientServerPathMap = new HashMap<String, String>();
    df = new DecimalFormat("#.#");
    isRunning = false;
    isFailed = false;
  }

  @SuppressFBWarnings(value = "ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD", justification = "Ignored this violaion")
  public void uploadAllFiles(List<ClientFileInfo> listOfFileInfo) {
    if (!listOfFileInfo.isEmpty()) {
      isRunning = true;
      filesWillBeUploaded.clear();
      listOfUploadedClientProj.clear();
      clientServerPathMap.clear();

      filesWillBeUploaded.addAll(listOfFileInfo);
      uploadingFileIndex = 0;
      verifyFreeMemoryBeforeDownload(getCurrentFileToUpload());
    } else {
      isRunning = false;
    }
  }

  public void abort() {
    isRunning = false;
    if (fileDownloader != null && fileDownloader.isUploaded()) {
      fileDownloader.fireDownloadCancelled();
    }
  }

  public String getStatus() {
    String uploadStatus = "";

    if (isRunning()) {
      long downloadedByteCount = fileDownloader.getDownloadedByteCount();
      long downloadSize = fileDownloader.getDownloadSize();

      // Server haven't received info from client side
      if (downloadSize == -1 || downloadedByteCount == 0) {
        Object[] formatObjects = new Object[] {getCurrentFileInfo().getName()};
        uploadStatus =
            Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/prepareToUpload",
                Arrays.asList(formatObjects));
      } else {
        String uploadedAmount = exchangeBytetoMByte(downloadedByteCount);
        String filesize = exchangeBytetoMByte(downloadSize);
        Object[] formatObjects = new Object[] {getCurrentFileInfo().getName(), uploadedAmount, filesize};
        uploadStatus =
            Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/uploadingInfo", Arrays.asList(formatObjects));
      }
    } else {
      if (haveAllFilesUploaded()) {
        uploadStatus = Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/uploadFinished");
      } else {
        uploadStatus = Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/cancelUploading");
      }
    }

    return uploadStatus;
  }

  public int getUploadedPercent() {
    int uploadingPercent = 0;

    if (!haveAllFilesUploaded()) {
      long uploadedAmount = fileDownloader.getDownloadedByteCount();
      long filesize = fileDownloader.getDownloadSize();
      float uploadPercentForCurrentFile = 100.0F * uploadedAmount / filesize; // NOSONAR
      float uploadPercentOfPreviousFiles = 100.0F * uploadingFileIndex / filesWillBeUploaded.size(); // NOSONAR

      uploadingPercent =
          Math.round(uploadPercentForCurrentFile / filesWillBeUploaded.size() + uploadPercentOfPreviousFiles);
    } else {
      uploadingPercent = 100; // NOSONAR
    }

    return uploadingPercent;
  }

  private String exchangeBytetoMByte(long fileSize) {
    double fileSizeInMB = 1.0 * fileSize / FileUtils.ONE_MB;
    return df.format(fileSizeInMB) + " MB";
  }

  private ClientFileInfo getCurrentFileToUpload() {
    return uploadingFileIndex < filesWillBeUploaded.size() ? filesWillBeUploaded.get(uploadingFileIndex) : null;
  }

  private boolean haveAllFilesUploaded() {
    return !isRunning() && (uploadingFileIndex == filesWillBeUploaded.size() - 1);
  }

  private void verifyFreeMemoryBeforeDownload(ClientFileInfo fileInfo) {
    if (fileInfo != null) {
      if (clientServerPathMap.containsKey(fileInfo.getPath())) {
        // This file is already uploaded on server.
        // This case occurs if another project is found in the same zip file on client.
        String serverFilePath = clientServerPathMap.get(fileInfo.getPath());
        if (serverFilePath != null) {
          addUploadedFileInfo(fileInfo, serverFilePath);
        }
        handleForNextUpload();
      } else {
        setCurrentFileInfo(fileInfo);
        LOGGER.debug("Prepare to upload: " + fileInfo.getPath());
        downloadHandler = new MyFileDownloadHandler();
        fileDownloader = new ULCVFileDownloader(downloadHandler, MAXIMUM_UPLOAD_SIZE_BYTES);

        if (fileDownloader != null && fileDownloader.isUploaded()) {
          fileDownloader.initiateToDownload();
        }
      }
    }
  }

  private void addUploadedFileInfo(ClientFileInfo projOnClient, String serverFilePath) {
    LOGGER.debug("File path on server: " + serverFilePath);

    ClientFileInfo projInfo = new ClientFileInfo();
    projInfo.setName(projOnClient.getName());
    projInfo.setPath(serverFilePath);
    projInfo.setProjectVersion(projOnClient.getProjectVersion());
    projInfo.setIsDirectory(projOnClient.getIsDirectory());
    projInfo.setRequireProjects(projOnClient.getRequireProjects());
    projInfo.setLibraryId(projOnClient.getLibraryId());
    projInfo.setId(projOnClient.getId());

    listOfUploadedClientProj.add(projInfo);
    if (!clientServerPathMap.containsKey(projOnClient.getPath())) {
      clientServerPathMap.put(projOnClient.getPath(), serverFilePath);
    }
  }

  private void handleForNextUpload() {
    if (isRunning()) {
      if (uploadingFileIndex < filesWillBeUploaded.size() - 1) {
        // Upload next file in the list of files
        uploadingFileIndex++;
        verifyFreeMemoryBeforeDownload(getCurrentFileToUpload());
      } else {
        // Finish uploading all files
        LOGGER.debug("Upload ALL project(s) FINISH ---> delete Temp files on client");
        isRunning = false;
        deleteTempFilesOnClient();
      }
    }
  }

  private void showErrorDialogForFailUpload(String message) {
    ULCAlert alert = new ULCAlert(Ivy.cms().co("/Dialogs/general/error"), message, Ivy.cms().co("/Dialogs/general/ok"));
    alert.addWindowListener(new IWindowListener() {
      private static final long serialVersionUID = 1L;

      @Override
      public void windowClosing(WindowEvent event) {
        isFailed = true;
      }
    });
    alert.show();
  }

  private void deleteTempFilesOnClient() {
    if (!filesWillBeUploaded.isEmpty()) {
      ArrayList<String> deletedFiles = new ArrayList<String>();

      // Collect temporary files
      for (ClientFileInfo info : filesWillBeUploaded) {
        if (info.getIsTempFile()) {
          String path = info.getPath();
          deletedFiles.add(path);
          LOGGER.debug("Delete file: " + path);
        }
      }

      // Delete temporary files on client PC
      if (!deletedFiles.isEmpty()) {
        ULCVFileUtilities fileUtil = new ULCVFileUtilities(new IVFileUtilitiesHandler() {

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
        if (fileUtil.isUploaded()) {
          fileUtil.deleteFiles(deletedFiles);
        }
      }
    }
  }

  private class MyFileDownloadHandler implements IVFileDownloadHandler {

    @Override
    public void onCancel() {
      LOGGER.debug("Time at onCancel(Upload): " + System.currentTimeMillis());
      deleteTempFilesOnClient();
    }

    @Override
    public String getClientFilePath() {
      return currentFileInfo.getPath();
    }

    @Override
    public void downloadInfo(long downloadSize, long freeHeapMemory) {
      // This condition ensures splitDownloadSize < freeHeapMemory
      long splitDownloadSize = Math.min(downloadSize, freeHeapMemory / 2);
      fileDownloader.startDownload(splitDownloadSize);
      LOGGER.debug("File size: " + FileUtils.byteCountToDisplaySize(downloadSize));
      LOGGER.debug("Free heap: " + FileUtils.byteCountToDisplaySize(freeHeapMemory));
      LOGGER.debug("Split downloadSize: " + FileUtils.byteCountToDisplaySize(splitDownloadSize));
    }

    @Override
    public void onFailure(Throwable arg0) {
      String msg = arg0.getMessage();
      showErrorDialogForFailUpload(msg);
      deleteTempFilesOnClient();
    }

    @Override
    public void onSuccess(String uploadFilePath) {
      File serverFile = new File(uploadFilePath);
      if (serverFile.exists() && serverFile.isFile() && serverFile.canRead()) {
        addUploadedFileInfo(currentFileInfo, serverFile.getAbsolutePath());
        handleForNextUpload();
        // This stores the upload folder path for later remove
        File uploadFolder = serverFile.getParentFile();
        if (uploadFolder.isDirectory() && uploadFolder.getName().equals("ivyUploadTempFolder")) {
          setUploadFolderPath(uploadFolder.getAbsolutePath());
        }
      } else {
        LOGGER.debug(
            "ULC extension of file uploading returned error file. File path: {0}, file exist: {1}, file access: {2} ",
            uploadFilePath, serverFile.exists(), serverFile.canRead());
      }
    }

  }
}
