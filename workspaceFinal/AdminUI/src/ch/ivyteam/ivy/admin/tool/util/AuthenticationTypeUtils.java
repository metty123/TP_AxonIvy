package ch.ivyteam.ivy.admin.tool.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.AuthenticationType;
import ch.ivyteam.ivy.application.restricted.IWebService;

@SuppressWarnings("restriction")
public final class AuthenticationTypeUtils {
  private static final String AXIS_1_X = "AXIS_1_x";

  private AuthenticationTypeUtils() {}
  public static List<AuthenticationType> getPossibleAuthenticationTypes(IWebService webService) {
    List<AuthenticationType> authenticationTypes = new ArrayList<>(Arrays.asList(AuthenticationType.values()));
    if (webService != null && AXIS_1_X.equals(webService.getWebServiceFramework())) {
      authenticationTypes.remove(AuthenticationType.NTLM);
    }
    return authenticationTypes;
  }
}
