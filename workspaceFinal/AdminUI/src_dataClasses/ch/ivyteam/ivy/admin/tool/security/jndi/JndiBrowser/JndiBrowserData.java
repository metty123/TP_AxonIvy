package ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class JndiBrowserData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class JndiBrowserData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 8832108248153276451L;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scripting.objects.List<java.lang.String>> jndiAttributes;

  /**
   * Gets the field jndiAttributes.
   * @return the value of the field jndiAttributes; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scripting.objects.List<java.lang.String>> getJndiAttributes()
  {
    return jndiAttributes;
  }

  /**
   * Sets the field jndiAttributes.
   * @param _jndiAttributes the new value of the field jndiAttributes.
   */
  public void setJndiAttributes(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.scripting.objects.List<java.lang.String>> _jndiAttributes)
  {
    jndiAttributes = _jndiAttributes;
  }

  private transient ch.ivyteam.naming.JndiConfig jndiConfig;

  /**
   * Gets the field jndiConfig.
   * @return the value of the field jndiConfig; may be null.
   */
  public ch.ivyteam.naming.JndiConfig getJndiConfig()
  {
    return jndiConfig;
  }

  /**
   * Sets the field jndiConfig.
   * @param _jndiConfig the new value of the field jndiConfig.
   */
  public void setJndiConfig(ch.ivyteam.naming.JndiConfig _jndiConfig)
  {
    jndiConfig = _jndiConfig;
  }

  private transient javax.naming.directory.DirContext jndiContext;

  /**
   * Gets the field jndiContext.
   * @return the value of the field jndiContext; may be null.
   */
  public javax.naming.directory.DirContext getJndiContext()
  {
    return jndiContext;
  }

  /**
   * Sets the field jndiContext.
   * @param _jndiContext the new value of the field jndiContext.
   */
  public void setJndiContext(javax.naming.directory.DirContext _jndiContext)
  {
    jndiContext = _jndiContext;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree jndiTree;

  /**
   * Gets the field jndiTree.
   * @return the value of the field jndiTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getJndiTree()
  {
    return jndiTree;
  }

  /**
   * Sets the field jndiTree.
   * @param _jndiTree the new value of the field jndiTree.
   */
  public void setJndiTree(ch.ivyteam.ivy.scripting.objects.Tree _jndiTree)
  {
    jndiTree = _jndiTree;
  }

  private java.lang.String nameToSelect;

  /**
   * Gets the field nameToSelect.
   * @return the value of the field nameToSelect; may be null.
   */
  public java.lang.String getNameToSelect()
  {
    return nameToSelect;
  }

  /**
   * Sets the field nameToSelect.
   * @param _nameToSelect the new value of the field nameToSelect.
   */
  public void setNameToSelect(java.lang.String _nameToSelect)
  {
    nameToSelect = _nameToSelect;
  }

  private transient java.lang.String result;

  /**
   * Gets the field result.
   * @return the value of the field result; may be null.
   */
  public java.lang.String getResult()
  {
    return result;
  }

  /**
   * Sets the field result.
   * @param _result the new value of the field result.
   */
  public void setResult(java.lang.String _result)
  {
    result = _result;
  }

  private transient ch.ivyteam.ivy.scripting.objects.Tree workTree;

  /**
   * Gets the field workTree.
   * @return the value of the field workTree; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Tree getWorkTree()
  {
    return workTree;
  }

  /**
   * Sets the field workTree.
   * @param _workTree the new value of the field workTree.
   */
  public void setWorkTree(ch.ivyteam.ivy.scripting.objects.Tree _workTree)
  {
    workTree = _workTree;
  }

}
