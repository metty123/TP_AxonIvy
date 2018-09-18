package ch.ivyteam.ivy.admin.tool.saexport;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService.EndPoints;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService.EndPoints.PortType;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService.EndPoints.PortType.Address;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService.SecuritySetting;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.application.restricted.IWebService;
import ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint;
import ch.ivyteam.ivy.application.restricted.IWebServicePortType;

/**
 * Web service exporter using JAXB
 */
@SuppressWarnings("restriction")
public class WebServiceExporter extends AbstractExporter {

  @Override
  protected void createEnvironment(IEnvironment iEnvironment, Environment environment, ReportObservable report,
      boolean isIncludeUsernameAndPassword) {
    IApplication iApplication = iEnvironment.getApplication();
    WebServices webServices = new WebServices();
    for (IWebService iWebService : iEnvironment.getWebServices()) {
      report.startLog(iEnvironment.getName(), ConfigType.WEB_SERVICE);
      if (!iWebService.equals(iApplication.findDefaultWebService(iWebService.getGenerationIdentifier()))
          || iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
        WebService webService = new WebService();
        webService.setId(iWebService.getGenerationIdentifier());
        webService.setName(iWebService.getName());

        SecuritySetting securitySetting = new SecuritySetting();
        securitySetting.setAuthType(iWebService.getAuthenticationType());
        if (iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
          securitySetting.setSessionHandlingMode(iWebService.getSessionHandlingMode());
        }
        if (isIncludeUsernameAndPassword) {
          securitySetting.setUsername(iWebService.getUsername());
          securitySetting.setPassword(iWebService.getPassword());
        }
        webService.setSecuritySetting(securitySetting);

        EndPoints endPoints = new EndPoints();
        for (IWebServicePortType iPortType : iWebService.getPortTypes()) {
          PortType portType = new PortType();
          portType.setName(iPortType.getPortType());
          for (IWebServiceEndpoint iEndPoint : iWebService.getWebServiceEndpoints(iPortType.getPortType())) {
            Address address = new Address();
            address.setUrl(iEndPoint.getEndpointAddress());
            address.setOrderPosition(iEndPoint.getCallOrderPosition());
            portType.getAddressList().add(address);
          }
          endPoints.getPortTypeList().add(portType);
        }
        webService.setEndPoints(endPoints);
        webServices.getWebServiceList().add(webService);
        report.log(new ReportEntry(ReportStatus.SUCCESS, ActionType.EXPORT, iEnvironment.getName(),
            ConfigType.WEB_SERVICE, webService.getName(), ""));
      }
    }
    environment.setWebServices(webServices);
  }
}
