package ivyadmintool;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class DefaultProcessModelCreator", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class DefaultProcessModelCreator extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 2762837805341990150L;

  private transient java.lang.String name;

  /**
   * Gets the field name.
   * @return the value of the field name; may be null.
   */
  public java.lang.String getName()
  {
    return name;
  }

  /**
   * Sets the field name.
   * @param _name the new value of the field name.
   */
  public void setName(java.lang.String _name)
  {
    name = _name;
  }

  private transient java.lang.String description;

  /**
   * Gets the field description.
   * @return the value of the field description; may be null.
   */
  public java.lang.String getDescription()
  {
    return description;
  }

  /**
   * Sets the field description.
   * @param _description the new value of the field description.
   */
  public void setDescription(java.lang.String _description)
  {
    description = _description;
  }

  private transient ch.ivyteam.ivy.application.IApplication application;

  /**
   * Gets the field application.
   * @return the value of the field application; may be null.
   */
  public ch.ivyteam.ivy.application.IApplication getApplication()
  {
    return application;
  }

  /**
   * Sets the field application.
   * @param _application the new value of the field application.
   */
  public void setApplication(ch.ivyteam.ivy.application.IApplication _application)
  {
    application = _application;
  }

  private transient java.lang.String sourceProjectDirectory;

  /**
   * Gets the field sourceProjectDirectory.
   * @return the value of the field sourceProjectDirectory; may be null.
   */
  public java.lang.String getSourceProjectDirectory()
  {
    return sourceProjectDirectory;
  }

  /**
   * Sets the field sourceProjectDirectory.
   * @param _sourceProjectDirectory the new value of the field sourceProjectDirectory.
   */
  public void setSourceProjectDirectory(java.lang.String _sourceProjectDirectory)
  {
    sourceProjectDirectory = _sourceProjectDirectory;
  }

}
