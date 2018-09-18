package ch.ivyteam.ivy.admin.tool.webservice.WebServiceDetails; // NOSONAR

import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.application.restricted.IWebService;
import ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint;
import ch.ivyteam.ivy.application.restricted.IWebServicePortType;
import ch.ivyteam.ivy.application.value.WebServiceAuthentication;

/**
 * Helper utility which creates an environment WebService as a copy from the WebService in the default environment.
 * 
 * @author Reguel Wermelinger
 * @since 27.01.2012
 */
@SuppressWarnings("restriction")
public final class WebServiceCopyHelper {
  /**
   * Hide Utility Class Constructor
   */
  private WebServiceCopyHelper() {}

  public static IWebService createForEnvironment(IEnvironment targetEnvironment, IWebService defaultWS,
      int sessionHandlingMode, WebServiceAuthentication authentication) {
    
    IWebService environmentWS = targetEnvironment.createWebService(defaultWS.getGenerationIdentifier(), authentication);

    for (IWebServicePortType portType : defaultWS.getPortTypes()) {
      for (IWebServiceEndpoint point : defaultWS.getWebServiceEndpoints(portType.getPortType())) {
        environmentWS.createEndpoint(portType, point.getCallOrderPosition(), point.getEndpointAddress());
      }
    }

    environmentWS.setSessionHandlingMode(sessionHandlingMode);
    boolean transportSession = (sessionHandlingMode > 0) ? true : false;
    environmentWS.setTransportSession(transportSession);

    return environmentWS;
  }
}
