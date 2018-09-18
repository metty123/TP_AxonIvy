package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ulc.vwidget.server.IAccessClipboardListener;
import ch.ivyteam.ulc.vwidget.server.ULCVClipboardAccessor;

import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.ULCAlert;
import com.ulcjava.base.application.util.IFileStoreHandler;
import com.ulcjava.base.shared.FileChooserConfig;

/*
 * @author htlam (lam.ho@axonactive.vn) This class is used for writing log entries to file on client side or copying
 * these entries to client's clipboard
 */
public final class LogExportUtil {

  /**
   * Hide Utility Class Constructor
   */
  private LogExportUtil() {
    super();
  }

  public static void writeLogToFile(final String log) {
    final FileChooserConfig fcConfig = new FileChooserConfig();
    fcConfig.setFileSelectionMode(FileChooserConfig.FILES_ONLY);
    fcConfig.setDialogType(FileChooserConfig.SAVE_DIALOG);
    fcConfig.setDialogTitle(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/dialogTitle/selectFileToStore"));
    fcConfig.setMultiSelectionEnabled(false);

    try {
      ClientContext.storeFile(new IFileStoreHandler() {

        // Prepare the output stream to fill with the content of the file to store
        @Override
        public void prepareFile(OutputStream data) throws IOException {
          data.write(log.getBytes(StandardCharsets.UTF_8));
        }

        @Override
        public void onSuccess(String filePath, String fileName) {}

        @Override
        public void onFailure(int reason, String description) {
          if (IFileStoreHandler.FAILED == reason) {
            showErrorDialog(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/errorWrongFilename"));
          }
        }

      }, fcConfig, null);
    } catch (Exception e) {
      showErrorDialog(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/errorFilePreparation"));
    }
  }

  public static void copyLogToClipboard(String log) {
    if (log == null || log.isEmpty()) {
      return;
    }
    ULCVClipboardAccessor clipboardAccessor = new ULCVClipboardAccessor();
    clipboardAccessor.copyContentToClipboard(log);

    IAccessClipboardListener listener = new IAccessClipboardListener() {

      @Override
      public void onSuccess() {}

      @Override
      public void onFailure(String[] arg0) {
        showErrorDialog(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/message/errorCopyToClipboard"));
      }
    };
    clipboardAccessor.setAccessClipboardListener(listener);
  }

  private static void showErrorDialog(String message) {
    ULCAlert alert = new ULCAlert(Ivy.cms().co("/Dialogs/general/error"), message, Ivy.cms().co("/Dialogs/general/ok"));
    alert.show();
  }
}
