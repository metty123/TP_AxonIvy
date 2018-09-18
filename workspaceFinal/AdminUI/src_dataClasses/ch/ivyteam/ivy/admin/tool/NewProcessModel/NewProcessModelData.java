package ch.ivyteam.ivy.admin.tool.NewProcessModel;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class NewProcessModelData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class NewProcessModelData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8654697326833749974L;

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

  private transient ch.ivyteam.ivy.application.IProcessModel processModel;

  /**
   * Gets the field processModel.
   * @return the value of the field processModel; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModel getProcessModel()
  {
    return processModel;
  }

  /**
   * Sets the field processModel.
   * @param _processModel the new value of the field processModel.
   */
  public void setProcessModel(ch.ivyteam.ivy.application.IProcessModel _processModel)
  {
    processModel = _processModel;
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

  private transient java.lang.String validationError;

  /**
   * Gets the field validationError.
   * @return the value of the field validationError; may be null.
   */
  public java.lang.String getValidationError()
  {
    return validationError;
  }

  /**
   * Sets the field validationError.
   * @param _validationError the new value of the field validationError.
   */
  public void setValidationError(java.lang.String _validationError)
  {
    validationError = _validationError;
  }

}
