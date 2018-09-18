package ch.ivyteam.ivy.admin.tool.process;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DeletePMV", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DeletePMV extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 4716924503652976230L;

  private transient ch.ivyteam.ivy.application.IProcessModelVersion deletedPMV;

  /**
   * Gets the field deletedPMV.
   * @return the value of the field deletedPMV; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModelVersion getDeletedPMV()
  {
    return deletedPMV;
  }

  /**
   * Sets the field deletedPMV.
   * @param _deletedPMV the new value of the field deletedPMV.
   */
  public void setDeletedPMV(ch.ivyteam.ivy.application.IProcessModelVersion _deletedPMV)
  {
    deletedPMV = _deletedPMV;
  }

  private transient java.lang.Exception exception;

  /**
   * Gets the field exception.
   * @return the value of the field exception; may be null.
   */
  public java.lang.Exception getException()
  {
    return exception;
  }

  /**
   * Sets the field exception.
   * @param _exception the new value of the field exception.
   */
  public void setException(java.lang.Exception _exception)
  {
    exception = _exception;
  }

  private transient java.lang.Boolean isDeleted;

  /**
   * Gets the field isDeleted.
   * @return the value of the field isDeleted; may be null.
   */
  public java.lang.Boolean getIsDeleted()
  {
    return isDeleted;
  }

  /**
   * Sets the field isDeleted.
   * @param _isDeleted the new value of the field isDeleted.
   */
  public void setIsDeleted(java.lang.Boolean _isDeleted)
  {
    isDeleted = _isDeleted;
  }

}
