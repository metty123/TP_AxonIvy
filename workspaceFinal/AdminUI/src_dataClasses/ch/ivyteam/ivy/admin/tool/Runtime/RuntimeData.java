package ch.ivyteam.ivy.admin.tool.Runtime;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class RuntimeData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class RuntimeData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -4584883718898459050L;

  private transient java.lang.Number javaMaxHeap;

  /**
   * Gets the field javaMaxHeap.
   * @return the value of the field javaMaxHeap; may be null.
   */
  public java.lang.Number getJavaMaxHeap()
  {
    return javaMaxHeap;
  }

  /**
   * Sets the field javaMaxHeap.
   * @param _javaMaxHeap the new value of the field javaMaxHeap.
   */
  public void setJavaMaxHeap(java.lang.Number _javaMaxHeap)
  {
    javaMaxHeap = _javaMaxHeap;
  }

  private transient java.lang.Number javaCurrentHeap;

  /**
   * Gets the field javaCurrentHeap.
   * @return the value of the field javaCurrentHeap; may be null.
   */
  public java.lang.Number getJavaCurrentHeap()
  {
    return javaCurrentHeap;
  }

  /**
   * Sets the field javaCurrentHeap.
   * @param _javaCurrentHeap the new value of the field javaCurrentHeap.
   */
  public void setJavaCurrentHeap(java.lang.Number _javaCurrentHeap)
  {
    javaCurrentHeap = _javaCurrentHeap;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.Thread> threads;

  /**
   * Gets the field threads.
   * @return the value of the field threads; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.Thread> getThreads()
  {
    return threads;
  }

  /**
   * Sets the field threads.
   * @param _threads the new value of the field threads.
   */
  public void setThreads(ch.ivyteam.ivy.scripting.objects.List<java.lang.Thread> _threads)
  {
    threads = _threads;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Recordset stacktrace;

  /**
   * Gets the field stacktrace.
   * @return the value of the field stacktrace; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getStacktrace()
  {
    return stacktrace;
  }

  /**
   * Sets the field stacktrace.
   * @param _stacktrace the new value of the field stacktrace.
   */
  public void setStacktrace(ch.ivyteam.ivy.scripting.objects.Recordset _stacktrace)
  {
    stacktrace = _stacktrace;
  }

  private transient java.lang.Thread selectedThread;

  /**
   * Gets the field selectedThread.
   * @return the value of the field selectedThread; may be null.
   */
  public java.lang.Thread getSelectedThread()
  {
    return selectedThread;
  }

  /**
   * Sets the field selectedThread.
   * @param _selectedThread the new value of the field selectedThread.
   */
  public void setSelectedThread(java.lang.Thread _selectedThread)
  {
    selectedThread = _selectedThread;
  }

  private java.lang.String tempType;

  /**
   * Gets the field tempType.
   * @return the value of the field tempType; may be null.
   */
  public java.lang.String getTempType()
  {
    return tempType;
  }

  /**
   * Sets the field tempType.
   * @param _tempType the new value of the field tempType.
   */
  public void setTempType(java.lang.String _tempType)
  {
    tempType = _tempType;
  }

}
