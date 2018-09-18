package ch.ivy.ws.addon;

/**
 * 
 */
@SuppressWarnings("all")
@javax.annotation.Generated(
  comments="This class implements the WS endpoints of the process 'ProcessStartService'. The class can be customized by moving it to the src-folder. See Designer Guide for more information.", 
  value = { "ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessClassBuilder" })
@javax.jws.WebService
public class ProcessStartService extends ch.ivyteam.ivy.webservice.process.restricted.AbstractWebServiceProcess
{

  /**
   * Constructor
   * @param webServiceProcess the web service process this class represents
   * @param processEngineManager the process engine manager to start the ws process
   */
  public ProcessStartService(ch.ivyteam.ivy.webservice.process.restricted.IWebServiceProcessBeanRuntime webServiceProcessBeanRuntime)
  {
    super(webServiceProcessBeanRuntime);
  }

  /**
   * @param isUrlBuiltFromSystemProperties
   * @param language
   * @param processSearchCriteria
   * @return
   * @throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
   */
  @javax.jws.WebMethod
  @javax.jws.WebResult(name="result")
  public FindProcessesStartsByCriteriaResult findProcessesStartsByCriteria(@javax.jws.WebParam(name="isUrlBuiltFromSystemProperties") java.lang.Boolean isUrlBuiltFromSystemProperties, 
             @javax.jws.WebParam(name="language") java.lang.String language, 
             @javax.jws.WebParam(name="processSearchCriteria") ch.ivy.ws.addon.service.ProcessSearchCriteria processSearchCriteria)
    throws ch.ivyteam.ivy.webservice.process.restricted.WebServiceProcessTechnicalException
  {
    java.util.Map<String, Object> params = new java.util.HashMap<String, Object>();
    ch.ivyteam.ivy.scripting.objects.Tuple processResult;
    FindProcessesStartsByCriteriaResult result = new FindProcessesStartsByCriteriaResult();

    params.put("isUrlBuiltFromSystemProperties", isUrlBuiltFromSystemProperties);
    params.put("language", language);
    params.put("processSearchCriteria", processSearchCriteria);

    processResult = executeProcess("findProcessesStartsByCriteria(Boolean,String,ch.ivy.ws.addon.service.ProcessSearchCriteria)", params);

    result.setErrors((java.util.List<ch.ivy.ws.addon.WSException>)getTupleField(processResult, "errors"));
    result.setProcessStarts((java.util.List<ch.ivy.ws.addon.types.IvyProcessStart>)getTupleField(processResult, "processStarts"));
    return result;
  }

  /**
   * Result type for the findProcessesStartsByCriteria method
   */
  public static class FindProcessesStartsByCriteriaResult
  {
    private java.util.List<ch.ivy.ws.addon.WSException> fErrors;

    private java.util.List<ch.ivy.ws.addon.types.IvyProcessStart> fProcessStarts;

    public java.util.List<ch.ivy.ws.addon.WSException> getErrors()
    {
      return fErrors;
    }

    public void setErrors(java.util.List<ch.ivy.ws.addon.WSException> errors)
    {
      fErrors = errors;
    }

    public java.util.List<ch.ivy.ws.addon.types.IvyProcessStart> getProcessStarts()
    {
      return fProcessStarts;
    }

    public void setProcessStarts(java.util.List<ch.ivy.ws.addon.types.IvyProcessStart> processStarts)
    {
      fProcessStarts = processStarts;
    }

  }
}