package kips;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class Document", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Document extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2216254822112919085L;

  private ch.ivyteam.ivy.scripting.objects.File file;

  /**
   * Gets the field file.
   * @return the value of the field file; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.File getFile()
  {
    return file;
  }

  /**
   * Sets the field file.
   * @param _file the new value of the field file.
   */
  public void setFile(ch.ivyteam.ivy.scripting.objects.File _file)
  {
    file = _file;
  }

  private java.lang.String fileName;

  /**
   * Gets the field fileName.
   * @return the value of the field fileName; may be null.
   */
  public java.lang.String getFileName()
  {
    return fileName;
  }

  /**
   * Sets the field fileName.
   * @param _fileName the new value of the field fileName.
   */
  public void setFileName(java.lang.String _fileName)
  {
    fileName = _fileName;
  }

  private java.lang.String filePath;

  /**
   * Gets the field filePath.
   * @return the value of the field filePath; may be null.
   */
  public java.lang.String getFilePath()
  {
    return filePath;
  }

  /**
   * Sets the field filePath.
   * @param _filePath the new value of the field filePath.
   */
  public void setFilePath(java.lang.String _filePath)
  {
    filePath = _filePath;
  }

  private org.primefaces.model.StreamedContent fileDownload;

  /**
   * Gets the field fileDownload.
   * @return the value of the field fileDownload; may be null.
   */
  public org.primefaces.model.StreamedContent getFileDownload()
  {
    return fileDownload;
  }

  /**
   * Sets the field fileDownload.
   * @param _fileDownload the new value of the field fileDownload.
   */
  public void setFileDownload(org.primefaces.model.StreamedContent _fileDownload)
  {
    fileDownload = _fileDownload;
  }

  private java.lang.String fileContent;

  /**
   * Gets the field fileContent.
   * @return the value of the field fileContent; may be null.
   */
  public java.lang.String getFileContent()
  {
    return fileContent;
  }

  /**
   * Sets the field fileContent.
   * @param _fileContent the new value of the field fileContent.
   */
  public void setFileContent(java.lang.String _fileContent)
  {
    fileContent = _fileContent;
  }

  private ch.ivyteam.ivy.scripting.objects.Recordset studentFiles;

  /**
   * Gets the field studentFiles.
   * @return the value of the field studentFiles; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getStudentFiles()
  {
    return studentFiles;
  }

  /**
   * Sets the field studentFiles.
   * @param _studentFiles the new value of the field studentFiles.
   */
  public void setStudentFiles(ch.ivyteam.ivy.scripting.objects.Recordset _studentFiles)
  {
    studentFiles = _studentFiles;
  }

  private ch.ivyteam.ivy.scripting.objects.Recordset mentorFiles;

  /**
   * Gets the field mentorFiles.
   * @return the value of the field mentorFiles; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getMentorFiles()
  {
    return mentorFiles;
  }

  /**
   * Sets the field mentorFiles.
   * @param _mentorFiles the new value of the field mentorFiles.
   */
  public void setMentorFiles(ch.ivyteam.ivy.scripting.objects.Recordset _mentorFiles)
  {
    mentorFiles = _mentorFiles;
  }

  private ch.ivyteam.ivy.scripting.objects.Record document;

  /**
   * Gets the field document.
   * @return the value of the field document; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Record getDocument()
  {
    return document;
  }

  /**
   * Sets the field document.
   * @param _document the new value of the field document.
   */
  public void setDocument(ch.ivyteam.ivy.scripting.objects.Record _document)
  {
    document = _document;
  }

  private java.lang.Number did;

  /**
   * Gets the field did.
   * @return the value of the field did; may be null.
   */
  public java.lang.Number getDid()
  {
    return did;
  }

  /**
   * Sets the field did.
   * @param _did the new value of the field did.
   */
  public void setDid(java.lang.Number _did)
  {
    did = _did;
  }

  private oracle.sql.BLOB fileSQL;

  /**
   * Gets the field fileSQL.
   * @return the value of the field fileSQL; may be null.
   */
  public oracle.sql.BLOB getFileSQL()
  {
    return fileSQL;
  }

  /**
   * Sets the field fileSQL.
   * @param _fileSQL the new value of the field fileSQL.
   */
  public void setFileSQL(oracle.sql.BLOB _fileSQL)
  {
    fileSQL = _fileSQL;
  }

}
