package ch.ivyteam.ivy.admin.tool.Application;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ApplicationData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ApplicationData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -1882311848473192440L;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModel> processModels;

  /**
   * Gets the field processModels.
   * @return the value of the field processModels; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModel> getProcessModels()
  {
    return processModels;
  }

  /**
   * Sets the field processModels.
   * @param _processModels the new value of the field processModels.
   */
  public void setProcessModels(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModel> _processModels)
  {
    processModels = _processModels;
  }

  private transient ch.ivyteam.ivy.application.IProcessModel selectedProcessModel;

  /**
   * Gets the field selectedProcessModel.
   * @return the value of the field selectedProcessModel; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModel getSelectedProcessModel()
  {
    return selectedProcessModel;
  }

  /**
   * Sets the field selectedProcessModel.
   * @param _selectedProcessModel the new value of the field selectedProcessModel.
   */
  public void setSelectedProcessModel(ch.ivyteam.ivy.application.IProcessModel _selectedProcessModel)
  {
    selectedProcessModel = _selectedProcessModel;
  }

  private transient java.lang.Number deletedApplicationId;

  /**
   * Gets the field deletedApplicationId.
   * @return the value of the field deletedApplicationId; may be null.
   */
  public java.lang.Number getDeletedApplicationId()
  {
    return deletedApplicationId;
  }

  /**
   * Sets the field deletedApplicationId.
   * @param _deletedApplicationId the new value of the field deletedApplicationId.
   */
  public void setDeletedApplicationId(java.lang.Number _deletedApplicationId)
  {
    deletedApplicationId = _deletedApplicationId;
  }

  private java.lang.Number tempIdentifier;

  /**
   * Gets the field tempIdentifier.
   * @return the value of the field tempIdentifier; may be null.
   */
  public java.lang.Number getTempIdentifier()
  {
    return tempIdentifier;
  }

  /**
   * Sets the field tempIdentifier.
   * @param _tempIdentifier the new value of the field tempIdentifier.
   */
  public void setTempIdentifier(java.lang.Number _tempIdentifier)
  {
    tempIdentifier = _tempIdentifier;
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

  private transient ch.ivyteam.ivy.scripting.objects.List<java.lang.String> environments;

  /**
   * Gets the field environments.
   * @return the value of the field environments; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<java.lang.String> getEnvironments()
  {
    return environments;
  }

  /**
   * Sets the field environments.
   * @param _environments the new value of the field environments.
   */
  public void setEnvironments(ch.ivyteam.ivy.scripting.objects.List<java.lang.String> _environments)
  {
    environments = _environments;
  }

  private transient java.lang.String activeEnvironment;

  /**
   * Gets the field activeEnvironment.
   * @return the value of the field activeEnvironment; may be null.
   */
  public java.lang.String getActiveEnvironment()
  {
    return activeEnvironment;
  }

  /**
   * Sets the field activeEnvironment.
   * @param _activeEnvironment the new value of the field activeEnvironment.
   */
  public void setActiveEnvironment(java.lang.String _activeEnvironment)
  {
    activeEnvironment = _activeEnvironment;
  }

  private transient java.lang.String selectedEnvironment;

  /**
   * Gets the field selectedEnvironment.
   * @return the value of the field selectedEnvironment; may be null.
   */
  public java.lang.String getSelectedEnvironment()
  {
    return selectedEnvironment;
  }

  /**
   * Sets the field selectedEnvironment.
   * @param _selectedEnvironment the new value of the field selectedEnvironment.
   */
  public void setSelectedEnvironment(java.lang.String _selectedEnvironment)
  {
    selectedEnvironment = _selectedEnvironment;
  }

}
