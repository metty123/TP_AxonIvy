package ch.ivyteam.ivy.common.util;


/**
 * Class to poll and ask for result of file upload or download tasks. The tasks can be
 * <ul>
 * <li>successful, then {@link #hasFile()} returns true and {@link #getFile()} returns the file</li>
 * <li>cancelled by the user, then {@link #wasCancelled()} returns true and {@link #getFile()} returns null</li>
 * <li>failure, then {@link #hasFailure()} returns true and {@link #getFailureMessage()} returns the reason</li>
 * </ul>
 * Never re-use objects of this class.
 * 
 * @see IvyFileUtils
 * @author mda
 */
public class FileTransferResult {
  private String filePath = "";
  private String localFilePath = "";
  private String failureMessage = "";
  private boolean cancel = false;
  private boolean success = false;

  public boolean hasCompleted() {
    return cancel || success || (failureMessage.length() > 0);
  }

  public boolean hasFailure() {
    return failureMessage.length() > 0;
  }

  public void setFailureMessage(String message) {
    failureMessage = message;
    cancel = false;
    success = false;
    filePath = "";
  }

  public String getFailureMessage() {
    return failureMessage;
  }

  public void setCancelled() {
    cancel = true;
    failureMessage = "";
    success = false;
    filePath = "";
  }

  public boolean wasCancelled() {
    return cancel;
  }

  public void setSuccessful() {
    success = true;
    failureMessage = "";
    cancel = false;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setFile(String filePath) {
    this.filePath = filePath;
    failureMessage = "";
    success = true;
    cancel = false;
  }

  public String getFile() {
    String returnFilePath = filePath;
    filePath = "";
    return returnFilePath;
  }

  public void setLocalFile(String localFilePath) {
    this.localFilePath = localFilePath;
  }

  public String getLocalFile() {
    String returnLocalFilePath = localFilePath;
    localFilePath = "";
    return returnLocalFilePath;
  }
}
