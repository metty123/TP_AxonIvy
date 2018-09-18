package ch.ivyteam.ivy.admin.tool.ProcessModel;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ProcessModelData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ProcessModelData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -8337965414845129368L;

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

  private transient ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModelVersion> processModelVersions;

  /**
   * Gets the field processModelVersions.
   * @return the value of the field processModelVersions; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModelVersion> getProcessModelVersions()
  {
    return processModelVersions;
  }

  /**
   * Sets the field processModelVersions.
   * @param _processModelVersions the new value of the field processModelVersions.
   */
  public void setProcessModelVersions(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.application.IProcessModelVersion> _processModelVersions)
  {
    processModelVersions = _processModelVersions;
  }

  private transient ch.ivyteam.ivy.application.IProcessModelVersion selectedPMV;

  /**
   * Gets the field selectedPMV.
   * @return the value of the field selectedPMV; may be null.
   */
  public ch.ivyteam.ivy.application.IProcessModelVersion getSelectedPMV()
  {
    return selectedPMV;
  }

  /**
   * Sets the field selectedPMV.
   * @param _selectedPMV the new value of the field selectedPMV.
   */
  public void setSelectedPMV(ch.ivyteam.ivy.application.IProcessModelVersion _selectedPMV)
  {
    selectedPMV = _selectedPMV;
  }

  private transient java.lang.Number deletedProcessModelId;

  /**
   * Gets the field deletedProcessModelId.
   * @return the value of the field deletedProcessModelId; may be null.
   */
  public java.lang.Number getDeletedProcessModelId()
  {
    return deletedProcessModelId;
  }

  /**
   * Sets the field deletedProcessModelId.
   * @param _deletedProcessModelId the new value of the field deletedProcessModelId.
   */
  public void setDeletedProcessModelId(java.lang.Number _deletedProcessModelId)
  {
    deletedProcessModelId = _deletedProcessModelId;
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

  private transient java.lang.Number tempIdentifier;

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

}
