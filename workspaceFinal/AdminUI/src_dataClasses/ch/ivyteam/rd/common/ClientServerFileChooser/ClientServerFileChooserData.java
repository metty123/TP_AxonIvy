package ch.ivyteam.rd.common.ClientServerFileChooser;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ClientServerFileChooserData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ClientServerFileChooserData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2282290124378896568L;

  private java.lang.String labelText;

  /**
   * Gets the field labelText.
   * @return the value of the field labelText; may be null.
   */
  public java.lang.String getLabelText()
  {
    return labelText;
  }

  /**
   * Sets the field labelText.
   * @param _labelText the new value of the field labelText.
   */
  public void setLabelText(java.lang.String _labelText)
  {
    labelText = _labelText;
  }

  private java.lang.Boolean onlyDirectories;

  /**
   * Gets the field onlyDirectories.
   * @return the value of the field onlyDirectories; may be null.
   */
  public java.lang.Boolean getOnlyDirectories()
  {
    return onlyDirectories;
  }

  /**
   * Sets the field onlyDirectories.
   * @param _onlyDirectories the new value of the field onlyDirectories.
   */
  public void setOnlyDirectories(java.lang.Boolean _onlyDirectories)
  {
    onlyDirectories = _onlyDirectories;
  }

  private java.lang.String filepath;

  /**
   * Gets the field filepath.
   * @return the value of the field filepath; may be null.
   */
  public java.lang.String getFilepath()
  {
    return filepath;
  }

  /**
   * Sets the field filepath.
   * @param _filepath the new value of the field filepath.
   */
  public void setFilepath(java.lang.String _filepath)
  {
    filepath = _filepath;
  }

  private ch.ivyteam.ivy.common.util.FileTransferResult fileTransferResult;

  /**
   * Gets the field fileTransferResult.
   * @return the value of the field fileTransferResult; may be null.
   */
  public ch.ivyteam.ivy.common.util.FileTransferResult getFileTransferResult()
  {
    return fileTransferResult;
  }

  /**
   * Sets the field fileTransferResult.
   * @param _fileTransferResult the new value of the field fileTransferResult.
   */
  public void setFileTransferResult(ch.ivyteam.ivy.common.util.FileTransferResult _fileTransferResult)
  {
    fileTransferResult = _fileTransferResult;
  }

  private java.lang.Boolean isClient;

  /**
   * Gets the field isClient.
   * @return the value of the field isClient; may be null.
   */
  public java.lang.Boolean getIsClient()
  {
    return isClient;
  }

  /**
   * Sets the field isClient.
   * @param _isClient the new value of the field isClient.
   */
  public void setIsClient(java.lang.Boolean _isClient)
  {
    isClient = _isClient;
  }

}
