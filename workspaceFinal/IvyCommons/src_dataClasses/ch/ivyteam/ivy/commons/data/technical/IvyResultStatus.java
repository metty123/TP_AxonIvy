package ch.ivyteam.ivy.commons.data.technical;

/**
 * The DataClass that have to be used to handle the Call Sub process return, Ivy exceptions, Java exceptions, etc.
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class IvyResultStatus", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class IvyResultStatus extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2523837861866365242L;

  private transient java.lang.Boolean successful;

  /**
   * Gets the field successful.
   * @return the value of the field successful; may be null.
   */
  public java.lang.Boolean getSuccessful()
  {
    return successful;
  }

  /**
   * Sets the field successful.
   * @param _successful the new value of the field successful.
   */
  public void setSuccessful(java.lang.Boolean _successful)
  {
    successful = _successful;
  }

  private transient java.lang.String message;

  /**
   * Gets the field message.
   * @return the value of the field message; may be null.
   */
  public java.lang.String getMessage()
  {
    return message;
  }

  /**
   * Sets the field message.
   * @param _message the new value of the field message.
   */
  public void setMessage(java.lang.String _message)
  {
    message = _message;
  }

  private transient java.lang.String code;

  /**
   * Gets the field code.
   * @return the value of the field code; may be null.
   */
  public java.lang.String getCode()
  {
    return code;
  }

  /**
   * Sets the field code.
   * @param _code the new value of the field code.
   */
  public void setCode(java.lang.String _code)
  {
    code = _code;
  }

  private transient ch.ivyteam.ivy.commons.data.technical.IvyResultStatusSeverity severity;

  /**
   * Gets the field severity.
   * @return the value of the field severity; may be null.
   */
  public ch.ivyteam.ivy.commons.data.technical.IvyResultStatusSeverity getSeverity()
  {
    return severity;
  }

  /**
   * Sets the field severity.
   * @param _severity the new value of the field severity.
   */
  public void setSeverity(ch.ivyteam.ivy.commons.data.technical.IvyResultStatusSeverity _severity)
  {
    severity = _severity;
  }

  private transient java.lang.String detail;

  /**
   * Gets the field detail.
   * @return the value of the field detail; may be null.
   */
  public java.lang.String getDetail()
  {
    return detail;
  }

  /**
   * Sets the field detail.
   * @param _detail the new value of the field detail.
   */
  public void setDetail(java.lang.String _detail)
  {
    detail = _detail;
  }

  private transient java.lang.Throwable javaException;

  /**
   * Gets the field javaException.
   * @return the value of the field javaException; may be null.
   */
  public java.lang.Throwable getJavaException()
  {
    return javaException;
  }

  /**
   * Sets the field javaException.
   * @param _javaException the new value of the field javaException.
   */
  public void setJavaException(java.lang.Throwable _javaException)
  {
    javaException = _javaException;
  }

  private transient ch.ivyteam.ivy.commons.data.technical.IvyResultStatus ivyResultStatusStack;

  /**
   * Gets the field ivyResultStatusStack.
   * @return the value of the field ivyResultStatusStack; may be null.
   */
  public ch.ivyteam.ivy.commons.data.technical.IvyResultStatus getIvyResultStatusStack()
  {
    return ivyResultStatusStack;
  }

  /**
   * Sets the field ivyResultStatusStack.
   * @param _ivyResultStatusStack the new value of the field ivyResultStatusStack.
   */
  public void setIvyResultStatusStack(ch.ivyteam.ivy.commons.data.technical.IvyResultStatus _ivyResultStatusStack)
  {
    ivyResultStatusStack = _ivyResultStatusStack;
  }

}
