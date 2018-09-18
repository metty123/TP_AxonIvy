package ch.ivyteam.ivy.admin.tool.SystemPropertyEditor;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class SystemPropertyEditorData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class SystemPropertyEditorData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -5615350422002539999L;

  private transient ch.ivyteam.ivy.system.IProperty property;

  /**
   * Gets the field property.
   * @return the value of the field property; may be null.
   */
  public ch.ivyteam.ivy.system.IProperty getProperty()
  {
    return property;
  }

  /**
   * Sets the field property.
   * @param _property the new value of the field property.
   */
  public void setProperty(ch.ivyteam.ivy.system.IProperty _property)
  {
    property = _property;
  }

  private transient ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel editor;

  /**
   * Gets the field editor.
   * @return the value of the field editor; may be null.
   */
  public ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel getEditor()
  {
    return editor;
  }

  /**
   * Sets the field editor.
   * @param _editor the new value of the field editor.
   */
  public void setEditor(ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel _editor)
  {
    editor = _editor;
  }

  private java.lang.String tempPropertyStringValue;

  /**
   * Gets the field tempPropertyStringValue.
   * @return the value of the field tempPropertyStringValue; may be null.
   */
  public java.lang.String getTempPropertyStringValue()
  {
    return tempPropertyStringValue;
  }

  /**
   * Sets the field tempPropertyStringValue.
   * @param _tempPropertyStringValue the new value of the field tempPropertyStringValue.
   */
  public void setTempPropertyStringValue(java.lang.String _tempPropertyStringValue)
  {
    tempPropertyStringValue = _tempPropertyStringValue;
  }

}
