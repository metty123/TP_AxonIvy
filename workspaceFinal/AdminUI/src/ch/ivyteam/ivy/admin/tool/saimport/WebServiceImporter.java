package ch.ivyteam.ivy.admin.tool.saimport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import org.apache.commons.lang.StringUtils;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService.EndPoints.PortType;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.WebServices.WebService.EndPoints.PortType.Address;
import ch.ivyteam.ivy.admin.tool.domain.util.SaieUtils;
import ch.ivyteam.ivy.admin.tool.domain.util.UrlValidator;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.restricted.IDefaultWebService;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.application.restricted.IWebService;
import ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint;
import ch.ivyteam.ivy.application.restricted.IWebServicePortType;
import ch.ivyteam.ivy.security.SecurityManagerFactory;

/**
 * Web service importer using JAXB
 */
@SuppressWarnings({"restriction"})
public class WebServiceImporter extends AbstractImporter {

  private enum AUTH_TYPE {
    HTTP_BASIC("HTTP_BASIC"), HTTP_DIGEST("HTTP_DIGEST"), HTTPS("HTTPS");
    private AUTH_TYPE(String name) {}

    /**
     * Check if authentication type is one of HTTP_BASIC, HTTP_DIGEST or HTTPS
     * 
     * @param auth
     * @return
     */
    public static boolean isValid(String auth) {
      try {
        valueOf(auth);
        return true;
      } catch (IllegalArgumentException exp) {
        return false;
      }
    }
  }

  @Override
  protected void importConfig(IEnvironment iEnvironmentParam, Environment environmentParam, ReportObservable reportParam) {
    final IEnvironment iEnvironment = iEnvironmentParam;
    final Environment environment = environmentParam;
    final ReportObservable report = reportParam;
    class CallableImport implements Callable<Object> {
      @Override
      public Object call() {

        report.startLog(iEnvironment.getName(), ConfigType.WEB_SERVICE);

        List<String> genIdList = createListNotYetImported(iEnvironment);

        for (WebService webService : environment.getWebServices().getWebServiceList()) {
          try {
            IWebService iWebService = iEnvironment.findWebService(webService.getId());
            // if the web service defined in XML is found in environment
            if (iWebService != null) {
              // update list of web services which were imported
              genIdList.remove(iWebService.getGenerationIdentifier());
              /*** start validation */
              if (validate(webService, iEnvironment.getName(), report)) {

                IDefaultWebService iDefaultWebService = iWebService.getDefaultWebService();
                // if not exist overridden web service in this environment
                if (iDefaultWebService == null && !iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
                  // create overridden web service
                  iDefaultWebService = (IDefaultWebService) iWebService;
                  createWebService(iEnvironment, webService, iDefaultWebService, report);

                  // check again whether the overridden web service was created or not
                  IWebService editWebService = iEnvironment.findWebService(webService.getId());
                  if (editWebService.getDefaultWebService() != null) {
                    // report
                    ReportEntry entry =
                        createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), webService.getName(),
                            "Created overridden configuration");
                    report.log(entry);
                  }
                }
                // otherwise, exist overridden web service for this environment
                else {
                  // update overridden web service
                  String authType = webService.getSecuritySetting().getAuthType();
                  String username = webService.getSecuritySetting().getUsername();
                  String password = webService.getSecuritySetting().getPassword();
                  String importedAuthType = importAuthType(authType);
                  iWebService.setAuthenticationType(importedAuthType);
                  if (iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
                    Integer sessionHM = webService.getSecuritySetting().getSessionHandlingMode();
                    if (sessionHM != null) {
                      iWebService.setSessionHandlingMode(sessionHM);
                    }
                  }
                  Map<String, List<String>> userPassMap = getUsernamePassword(iWebService, username, password, true);
                  String importedUserName = userPassMap.get("username").get(0);
                  String importedPassword = userPassMap.get("password").get(0);
                  List<String> warningMessage = userPassMap.get("warningMessage");
                  if (!warningMessage.isEmpty()) {
                    ReportEntry entry =
                        createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), webService.getName(),
                            warningMessage);
                    report.log(entry);
                  }
                  iWebService.setUsername(importedUserName);
                  iWebService.setPassword(importedPassword);

                  importPortType(iWebService, webService);

                  // report
                  ReportEntry entry =
                      createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), webService.getName(),
                          "Updated overridden configuration");
                  report.log(entry);
                }
              }
              /*** end validation */
            } else {
              // if even the default web service does not exist, just LOG
              LOGGER
                  .warn("The webservice configuration "
                      + webService.getId()
                      + " in the import file was not imported because the webservice configuration does not exist in the target application");
              // report
              ReportEntry entry =
                  createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), webService.getName(),
                      "Default configuration does not exist");
              report.log(entry);
            }
          } catch (Exception exp) {
            LOGGER.error(exp);
          }
        }

        // delete web services which haven't been imported
        deleteWebsevice(genIdList, iEnvironment, report);
        return null;
      }
    }

    try {
      SecurityManagerFactory.getSecurityManager().executeAsSystem(new CallableImport());
    } catch (Exception e) {
      LOGGER.error(e);
    }
  }

  public boolean validate(WebService webService, String environmentName, ReportObservable report) {
    String authType = webService.getSecuritySetting().getAuthType();
    String username = webService.getSecuritySetting().getUsername();
    String password = webService.getSecuritySetting().getPassword();
    List<String> messages = new ArrayList<String>();
    StringBuffer err = new StringBuffer();
    StringBuffer temp = new StringBuffer();
    boolean flag = true;

    err.append("Environment " + environmentName + ", WebService " + webService.getName() + ": \n");

    if (!isAuthType(authType)) {
      temp = new StringBuffer();
      temp.append("Authentication type must be one of HTTP_BASIC, HTTP_DIGEST, HTTPS and not ").append(authType);
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!isValidUsername(username)) {
      temp = new StringBuffer();
      temp.append("Username can not contain invalid Ivy Script, the correct one should begin with <% and end with %>");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    if (!isValidPassword(password)) {
      temp = new StringBuffer();
      temp.append("Password can not contain invalid Ivy Script, the correct one should begin with <% and end with %>");
      messages.add(temp.toString());
      temp.append("\n");
      err.append(temp);
      flag = false;
    }

    for (PortType portType : webService.getEndPoints().getPortTypeList()) {
      for (Address address : portType.getAddressList()) {
        if ((address.getOrderPosition() != null) && (address.getOrderPosition() < 0)) {
          temp = new StringBuffer();
          temp.append("Port type ").append(portType.getName()).append(": OrderPosition can not be a negative number");
          messages.add(temp.toString());
          temp.append("\n");
          err.append(temp);
          flag = false;
        }
        if (!isURL(address.getUrl())) {
          temp = new StringBuffer();
          temp.append("Port type ").append(portType.getName()).append(": URL [").append(address.getUrl())
              .append("] is invalid and the correct one should look like [http://domainInfo]");
          messages.add(temp.toString());
          temp.append("\n");
          err.append(temp);
          flag = false;
        }
      }
    }

    if (!flag) {
      LOGGER.error(err.toString());
      ReportEntry entry = createReportEntry(ReportStatus.ERROR, environmentName, webService.getName(), messages);
      report.log(entry);
    }
    return flag;
  }

  /**
   * Checks whether the given URL (website address) is valid.
   * 
   * @param url represents the website address.
   * @return true if the email is valid, false otherwise.
   * @since 09-Feb-2009
   */
  public static boolean isURL(String url) {
    if (StringUtils.isBlank(url)) {
      return true;
    }
    // allow scriptable
    if (((url.indexOf("<%") > -1) || (url.indexOf("%>") > -1)) && (SaieUtils.isValidScripts(url))) {
      return true;
    }
    // Assigning the url format regular expression
    return UrlValidator.getInstance().isValid(url);
  }

  public static boolean isAuthType(String auth) {
    if (StringUtils.isBlank(auth)) {
      return true;
    }
    // allow scriptable
    String temp = auth.trim();
    if (((temp.indexOf("<%") > -1) || (temp.indexOf("%>") > -1)) && (SaieUtils.isValidScripts(temp))) {
      return true;
    }
    return AUTH_TYPE.isValid(temp);
  }

  public static boolean isValidUsername(String username) {
    if (StringUtils.isBlank(username)) {
      return true;
    }
    // allow scriptable
    String temp = username.trim();
    if ((temp.indexOf("<%") > -1) || (temp.indexOf("%>") > -1)) {
      return SaieUtils.isValidScripts(temp);
    } else {
      return true;
    }
  }

  public static boolean isValidPassword(String password) {
    if (StringUtils.isBlank(password)) {
      return true;
    }
    // allow scriptable
    String temp = password.trim();
    if ((temp.indexOf("<%") > -1) || (temp.indexOf("%>") > -1)) {
      return SaieUtils.isValidScripts(temp);
    } else {
      return true;
    }
  }

  /**
   * 
   * @param iEnvironment
   * @return
   */
  private List<String> createListNotYetImported(IEnvironment iEnvironment) {
    List<String> listNotYetImported = new ArrayList<String>();
    for (IWebService config : iEnvironment.getWebServices()) {
      if (config.getDefaultWebService() != null) {
        listNotYetImported.add(config.getGenerationIdentifier());
      }
    }
    return listNotYetImported;
  }

  /**
   * 
   * @param importedIdMap
   * @param iEnviroment
   */
  private void deleteWebsevice(List<String> lstNotYetImportedEnv, IEnvironment iEnvironment, ReportObservable report) {
    // after updating, the remains of "lstNotYetImportedEnv" are web services which have not been imported
    // these have to be deleted
    for (String notImport : lstNotYetImportedEnv) {
      try {
        IWebService webService = iEnvironment.findWebService(notImport);
        IDefaultWebService defWebService = webService.getDefaultWebService();
        if (defWebService != null) {
          iEnvironment.deleteWebService(notImport);
          // check again whether the overridden web service was deleted or not
          webService = iEnvironment.findWebService(notImport);
          if (webService.getDefaultWebService() == null) {
            // report
            ReportEntry entry =
                createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), defWebService.getName(),
                    "Deleted overridden configuration");
            report.log(entry);
          }
        }
      } catch (Exception exp) {
        LOGGER.equals(exp);
      }
    }
  }

  /**
   * create new webService overridden if new webService overridden in import file exist in application
   * 
   * @param iEnviroment
   * @param webService
   * @param newIWebService
   */
  private void createWebService(IEnvironment iEnvironment, WebService webService, IDefaultWebService newIWebService,
      ReportObservable report) {
    String authType = webService.getSecuritySetting().getAuthType();
    String username = webService.getSecuritySetting().getUsername();
    String password = webService.getSecuritySetting().getPassword();

    String importedAuthType = importAuthType(authType);

    Map<String, List<String>> userPassMap = getUsernamePassword(newIWebService, username, password, false);
    String importedUserName = userPassMap.get("username").get(0);
    String importedPassword = userPassMap.get("password").get(0);
    List<String> warningMessage = userPassMap.get("warningMessage");
    if (!warningMessage.isEmpty()) {
      ReportEntry entry =
          createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), webService.getName(), warningMessage);
      report.log(entry);
    }

    IWebService newWebService =
        newIWebService.createEnvironmentConfiguration(iEnvironment.getName(), importedAuthType, importedUserName,
            importedPassword);
    List<PortType> portTypeList = webService.getEndPoints().getPortTypeList();
    for (PortType portType : portTypeList) {
      IWebServicePortType iWebServicePortType = newIWebService.findPortType(portType.getName());
      if (iWebServicePortType != null) {
        createEndpoint(newWebService, portType, iWebServicePortType);
      }
    }
  }

  /**
   * 
   * @param authType
   * @return if authType != null, return authType <br>
   *         else return "HTTP_BASIC"
   */
  private String importAuthType(String authType) {
    String defaultAuthType = AUTH_TYPE.HTTP_BASIC.toString();
    if (authType != null) {
      defaultAuthType = authType;
    }
    return defaultAuthType;
  }

  /**
   * 
   * @param iWebService
   * @param webService
   */
  private void importPortType(IWebService iWebService, WebService webService) {
    List<IWebServicePortType> iPortTypeList = iWebService.getPortTypes();
    List<PortType> portTypeList = webService.getEndPoints().getPortTypeList();

    for (PortType portType : portTypeList) {
      for (IWebServicePortType iWebServicePortType : iPortTypeList) {
        if (iWebServicePortType.getPortType().equals(portType.getName())) {
          importEndpoint(iWebService, portType, iWebServicePortType);
        }
      }
    }
  }

  /**
   * 
   * @param iWebService
   * @param portType
   * @param iWebServicePortType
   */
  private void importEndpoint(IWebService iWebService, PortType portType, IWebServicePortType iWebServicePortType) {
    for (IWebServiceEndpoint iEndPoint : iWebService.getWebServiceEndpoints(iWebServicePortType.getPortType())) {
      iWebService.deleteEndpoint(iEndPoint);
    }
    createEndpoint(iWebService, portType, iWebServicePortType);
  }

  /**
   * 
   * @param iWebService
   * @param portType
   * @param iWebServicePortType
   */
  private void createEndpoint(IWebService iWebService, PortType portType, IWebServicePortType iWebServicePortType) {
    int stone = 0;
    for (Address address : portType.getAddressList()) {
      String url = address.getUrl();
      Integer order = address.getOrderPosition();
      if (order == null) {
        order = stone;
        stone++;
      } else {
        stone = order + 1;
      }
      String impotedUrl = (url != null) ? url : StringUtils.EMPTY;
      iWebService.createEndpoint(iWebServicePortType, order, impotedUrl);
    }
  }

  /**
   * Create report entry for web service
   * 
   * @param status one of ReportStatus.SUCCESS, ReportStatus.WARNING, ReportStatus.ERROR
   * @param environmentName name of environment to be imported
   * @param webServiceName name of web service to be imported
   * @param messages message to write report
   * @return
   */
  private ReportEntry createReportEntry(ReportStatus status, String environmentName, String webServiceName,
      String message) {
    ReportEntry entry = new ReportEntry();
    entry.setActionType(ActionType.IMPORT);
    entry.setConfigType(ConfigType.WEB_SERVICE);
    entry.setReportStatus(status);
    entry.setEnvironmentName(environmentName);
    entry.setConfigName(webServiceName);
    entry.setMessage(message);

    return entry;
  }

  /**
   * Create report entry for web service
   * 
   * @param status one of ReportStatus.SUCCESS, ReportStatus.WARNING, ReportStatus.ERROR
   * @param environmentName name of environment to be imported
   * @param webServiceName name of web service to be imported
   * @param messages list of messages to write report
   * @return
   */
  private ReportEntry createReportEntry(ReportStatus status, String environmentName, String webServiceName,
      List<String> messages) {
    ReportEntry entry = new ReportEntry();
    entry.setActionType(ActionType.IMPORT);
    entry.setConfigType(ConfigType.WEB_SERVICE);
    entry.setReportStatus(status);
    entry.setEnvironmentName(environmentName);
    entry.setConfigName(webServiceName);
    entry.setMessages(messages);

    return entry;
  }

  /**
   * Handle username and password attributes when importing<br>
   * <br>
   * - If the attributes are missing and the override already exists in the target environment, keep the old ones<br>
   * - If the attributes are missing and the override does not exist in the target environment, use the empty string for
   * the missing attributes and send a warning to the report <br>
   * - If the attributes are set, use those attributes
   * 
   * @param iWebService web service to be imported
   * @param username username get from XML file
   * @param password password get from XML file
   * @param overridden true if the override already exists in the target environment
   * @return a map contains username, password and warning message<br>
   *         use get("username").get(0) to get the user name<br>
   *         use get("password").get(0) to get the password<br>
   *         use get("warningMessage") to get list of warning message<br>
   */
  private Map<String, List<String>> getUsernamePassword(IWebService iWebService, String username, String password,
      Boolean overridden) {
    Map<String, List<String>> result = new HashMap<String, List<String>>();
    List<String> warnMessage = new ArrayList<String>();

    // handle username
    String name = iWebService.getUsername();
    String usernameWarning = null;
    if (username != null) {
      name = username;
    } else if (!overridden || name == null) {
      name = StringUtils.EMPTY;
      usernameWarning = "Username has not been set";
    }

    // handle password
    String pwd = iWebService.getPassword();
    String passwordWarning = null;
    if (password != null) {
      pwd = password;
    } else if (!overridden || pwd == null) {
      pwd = StringUtils.EMPTY;
      passwordWarning = "Password has not been set";
    }

    // add username warning to report
    if (usernameWarning != null) {
      warnMessage.add(usernameWarning);
    }
    // add password warning to report
    if (passwordWarning != null) {
      warnMessage.add(passwordWarning);
    }

    result.put("username", Arrays.asList(name));
    result.put("password", Arrays.asList(pwd));
    result.put("warningMessage", warnMessage);
    return result;
  }

}
