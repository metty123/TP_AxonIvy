package ch.ivyteam.rd.common.ComboBoxField;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ComboBoxFieldData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ComboBoxFieldData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -2529478986713774569L;

  private transient java.lang.String value;

  /**
   * Gets the field value.
   * @return the value of the field value; may be null.
   */
  public java.lang.String getValue()
  {
    return value;
  }

  /**
   * Sets the field value.
   * @param _value the new value of the field value.
   */
  public void setValue(java.lang.String _value)
  {
    value = _value;
  }

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> values;

  /**
   * Gets the field values.
   * @return the value of the field values; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getValues()
  {
    return values;
  }

  /**
   * Sets the field values.
   * @param _values the new value of the field values.
   */
  public void setValues(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _values)
  {
    values = _values;
  }

}
