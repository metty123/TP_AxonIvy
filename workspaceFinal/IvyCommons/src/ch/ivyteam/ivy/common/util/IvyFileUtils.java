package ch.ivyteam.ivy.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.scripting.objects.Tree;
import ch.ivyteam.ivy.scripting.objects.util.IvyTreeValueVisitor;

import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.ULCComponent;
import com.ulcjava.base.application.util.IFileChooseHandler;
import com.ulcjava.base.application.util.IFileLoadHandler;
import com.ulcjava.base.application.util.IFileStoreHandler;
import com.ulcjava.base.shared.FileChooserConfig;

/**
 * Utility for the usage of client and server side file browsers
 * 
 * @author mda
 */
final public class IvyFileUtils {
  private IvyFileUtils() {}

  public static Tree setDefaultPath(String defaultPath, Tree treeRoot, boolean onlyDirectories) {
    // set root to given directory
    if (defaultPath.trim().length() > 0) {
      File defaultDir = new File(defaultPath);
      if (defaultDir.exists() && defaultDir.isDirectory()) {
        // get to root bottom-up and memorize path
        java.util.List<File> pathToDefaultDir = new ArrayList<File>();
        File parent = defaultDir;
        while (parent != null) {
          pathToDefaultDir.add(parent);
          parent = parent.getParentFile();
        }
        // reverse to have path from root to end
        Collections.reverse(pathToDefaultDir);

        // find root of default path in tree
        parent = pathToDefaultDir.get(0);
        IvyTreeValueVisitor visitor = new IvyTreeValueVisitor(parent);
        try {
          treeRoot.acceptVisitor(visitor);
        } catch (Exception e) {
        }

        // if found, loop through memorized path and create tree nodes on the
        // way
        if (visitor.getNodes().size() == 1) {
          Tree rootForInsert = visitor.getNodes().get(0);
          Tree newNode;
          Tree nodeToReturn = null;
          for (int i = 0; i < pathToDefaultDir.size() - 1; i++) {
            // for every dir on the path, create tree children for all
            // files/dirs (otherwise UI tree shows only the direct path)
            File actualDir = pathToDefaultDir.get(i);
            File[] files = actualDir.listFiles();
            for (File file : files) {
              if (!onlyDirectories || file.isDirectory()) {
                newNode = rootForInsert.createChild(file, (file.isDirectory() ? "dir" : "file"));
                newNode.setMayHaveChildren(file.isDirectory());
                // find root for the next level in the path
                if (file.equals(pathToDefaultDir.get(i + 1))) {
                  nodeToReturn = newNode;
                }
              }
            }
            rootForInsert = nodeToReturn;
          }

          if (nodeToReturn == null && !visitor.getNodes().isEmpty()) {
            nodeToReturn = visitor.getNodes().get(0);
          }

          // one level deeper, because otherwise children of selected node not visible
          File[] files = defaultDir.listFiles();
          if (files != null && files.length > 0) {
            for (File file : files) {
              if (!onlyDirectories || file.isDirectory()) {
                newNode = nodeToReturn.createChild(file, (file.isDirectory() ? "dir" : "file"));
                newNode.setMayHaveChildren(file.isDirectory());
              }
            }
          }
          return nodeToReturn;
        }
      }
    }
    return treeRoot;
  }

  /**
   * Let the user choose one client side directory.
   * 
   * @param panel the rich dialog panel that calls this method
   * @param dialogTitle the title of the client side file chooser dialog
   * @param startDirectory the path to the directory chooser's default client side directory
   * @return the result object to poll for success or failure
   */
  public static FileTransferResult getLocalDirectory(final IRichDialogPanel panel, final String dialogTitle,
      String startDirectory) {
    FileChooserConfig config = new FileChooserConfig();
    config.setCurrentDirectory(FilenameUtils.getFullPath(startDirectory));
    config.setFileSelectionMode(FileChooserConfig.DIRECTORIES_ONLY);
    return getLocalFile(panel, config, dialogTitle);
  }

  /**
   * Let the user choose one client side file.
   * 
   * @param panel the rich dialog panel that calls this method
   * @param dialogTitle the title of the client side file chooser dialog
   * @param filename the name of the default client side file
   * @return the result object to poll for success or failure
   */
  public static FileTransferResult getLocalFile(final IRichDialogPanel panel, final String dialogTitle, String filename) {
    FileChooserConfig config = new FileChooserConfig();
    config.setSelectedFile(filename);
    config.setFileSelectionMode(FileChooserConfig.FILES_ONLY);
    return getLocalFile(panel, config, dialogTitle);
  }

  private static FileTransferResult getLocalFile(final IRichDialogPanel panel, final FileChooserConfig fcConfig,
      final String dialogTitle) {
    final FileTransferResult fileResult = new FileTransferResult();

    fcConfig.setApproveButtonText("Ok");
    fcConfig.setMultiSelectionEnabled(false);
    fcConfig.setDialogTitle(dialogTitle);
    ClientContext.setFileTransferMode(ClientContext.SYNCHRONOUS_MODE);

    ClientContext.chooseFile(new IFileChooseHandler() {
      @Override
      public void onSuccess(String[] filePaths, String[] fileNames) {
        fileResult.setLocalFile(filePaths[0]);
        fileResult.setSuccessful();
      }

      @Override
      public void onFailure(int reason, String description) {
        switch (reason) {
          case IFileLoadHandler.CANCELLED:
            fileResult.setCancelled();
            break;
          default:
            fileResult.setFailureMessage("The local file could not be retrieved." + description);
            break;
        }
      }
    }, fcConfig, (ULCComponent) panel);
    return fileResult;
  }

  /**
   * Uploads a client side file to the server. After successful operation of this method, the file is available in the
   * files directory of the server with the same file name as on the client.
   * 
   * @param file the client side path to the file to upload
   * @return the result object to poll for completion (and to get results)
   */
  public static FileTransferResult uploadFileToServer(final String file) {
    final FileTransferResult fileResult = new FileTransferResult();

    ClientContext.setFileTransferMode(ClientContext.SYNCHRONOUS_MODE);
    ClientContext.loadFile(new IFileLoadHandler() {
      public void onFailure(int reason, String description) {
        switch (reason) {
          case IFileLoadHandler.CANCELLED:
            fileResult.setCancelled();
            break;
          case IFileLoadHandler.FAILED:
            fileResult.setFailureMessage("The file transfer failed. " + description);
            break;
          case IFileLoadHandler.FILE_SIZE_EXCEEDED:
            fileResult.setFailureMessage("The file transfer failed because the file was too big to transfer. "
                + description);
            break;
          default:
            fileResult.setFailureMessage("The file transfer failed. Unknown error code! " + description);
            break;
        }
      }

      public void onSuccess(InputStream ins[], String filePaths[], String fileNames[]) {
        OutputStream out = null;
        try {
          fileResult.setLocalFile(filePaths[0]);
          ch.ivyteam.ivy.scripting.objects.File ivyFile = new ch.ivyteam.ivy.scripting.objects.File(fileNames[0]);
          out = new FileOutputStream(ivyFile.getJavaFile());
          int read = 0;
          byte[] bytes = new byte[1024];
          while ((read = ins[0].read(bytes)) != -1) {
            out.write(bytes, 0, read);
          }
          out.flush();
          fileResult.setFile(ivyFile.getPath());
          fileResult.setSuccessful();
        } catch (Exception ex) {
          fileResult.setFailureMessage(ex.getMessage());
        } finally {
          IOUtils.closeQuietly(ins[0]);
          IOUtils.closeQuietly(out);
        }
      }
    }, file);
    return fileResult;
  }

  /**
   * Transfers a file from the server to the client
   * 
   * After successful operation of this method, the file is available in the chosen client side directory with the same
   * file name as on the server.
   * 
   * @param file the server side file to transfer to the client
   * @param clientSidePath the desired path on the client side for the file
   * @return the result object to poll for success or failure
   */
  public static FileTransferResult transferFileToClient(final File file, String clientSidePath) {
    final FileTransferResult fileResult = new FileTransferResult();

    ClientContext.setFileTransferMode(ClientContext.SYNCHRONOUS_MODE);

    try {
      ClientContext.storeFile(new IFileStoreHandler() {
        @Override
        public void prepareFile(OutputStream data) throws Exception {
          FileReader reader = null;
          try {
            reader = new FileReader(file);
            IOUtils.copy(reader, data);
          } finally {
            IOUtils.closeQuietly(reader);
          }
        }

        @Override
        public void onSuccess(String filePath, String fileName) {
          fileResult.setSuccessful();
        }

        @Override
        public void onFailure(int reason, String description) {
          switch (reason) {
            case IFileStoreHandler.CANCELLED:
              fileResult.setCancelled();
              break;
            case IFileStoreHandler.FAILED:
              fileResult.setFailureMessage("The file transfer failed. " + description);
              break;
            default:
              fileResult.setFailureMessage("The file transfer failed. Unknown error code! " + description);
              break;
          }
        }
      }, clientSidePath);
    } catch (Exception e) {
      fileResult.setFailureMessage(e.getMessage());
    }
    return fileResult;
  }
}
