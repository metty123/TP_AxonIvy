package ch.ivyteam.ivy.admin.tool.checker;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NTCredentials;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;

import ch.ivyteam.ivy.admin.tool.domain.util.UrlValidator;
import ch.ivyteam.log.Logger;

/**
 * This class use to test the web services
 * 
 */
@SuppressWarnings("restriction")
public final class WSConnectionChecker {
  private static final Logger LOGGER = Logger.getClassLogger(WSConnectionChecker.class);

  private WSConnectionChecker() {}

  public enum StatusConnection {
    INVALID_URL, NOT_FOUND, FOUND, UNAUTHORIZED, AUTHORIZED, INTERNAL_SERVER_ERROR, BAD_REQUEST
  }

  /**
   * Test the availability of the connection using PostMethod
   * <hr>
   * If the status code return <code>404</code> code or throws exception when making a request then <br>
   * return StatusConnection.NOT_FOUND <br>
   * If status code return <code>401</code> code <br>
   * then return StatusConnection.UNAUTHORIZED <br>
   * otherwise return StatusConnection.FOUND
   * 
   * @param url The end point of the web services to test
   * @return StatusConnection
   */
  public static StatusConnection testConnection(String url) {
    UrlValidator urlValidator = new UrlValidator();
    if (!urlValidator.isValid(url)) {
      return StatusConnection.INVALID_URL;
    }

    HttpClient client = new HttpClient();

    PostMethod method = new PostMethod(url);

    try {
      int statusCode = client.executeMethod(method);
      if (statusCode == HttpStatus.SC_NOT_FOUND) {
        return StatusConnection.NOT_FOUND;
      }

      if (statusCode == HttpStatus.SC_UNAUTHORIZED) {
        return StatusConnection.UNAUTHORIZED;
      }
    } catch (HttpException e) {
      LOGGER.error(e.getMessage());
      return StatusConnection.NOT_FOUND;
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
      return StatusConnection.NOT_FOUND;
    } finally {
      method.releaseConnection();
    }
    return StatusConnection.FOUND;
  }

  /**
   * Test the availability with authentication of the connection using PostMethod
   * <hr>
   * If the status code return <code>404</code> code or throws exception when making a request then <br>
   * return StatusConnection.NOT_FOUND <br>
   * If status code return <code>401</code> code <br>
   * then return StatusConnection.UNAUTHORIZED <br>
   * otherwise return StatusConnection.AUTHORIZED
   * 
   * @param url The end point of the web services to test
   * @param username User name to authenticate
   * @param password Password to authenticate
   * @return StatusConnection
   */
  public static StatusConnection testConnection(String url, String username, String password) {
    UrlValidator urlValidator = new UrlValidator();
    if (!urlValidator.isValid(url)) {
      return StatusConnection.INVALID_URL;
    }

    HttpClient client = new HttpClient();

    client.getState().setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(username, password));

    PostMethod method = new PostMethod(url);
    client.getParams().setAuthenticationPreemptive(true);


    method.setDoAuthentication(true);

    try {
      int statusCode = client.executeMethod(method);

      if (statusCode == HttpStatus.SC_NOT_FOUND) {
        return StatusConnection.NOT_FOUND;
      }

      if (statusCode == HttpStatus.SC_UNAUTHORIZED) {
        return StatusConnection.UNAUTHORIZED;
      }
      
    } catch (HttpException e) {
      LOGGER.error(e.getMessage());
      return StatusConnection.NOT_FOUND;
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
      return StatusConnection.NOT_FOUND;
    } finally {
      method.releaseConnection();
    }
    return StatusConnection.AUTHORIZED;
  }
  
  public static StatusConnection testNTLMConnection(String url, String username, String password, String host, String domain){
    UrlValidator urlValidator = new UrlValidator();
    if (!urlValidator.isValid(url)) {
      return StatusConnection.INVALID_URL;
    }

    HttpClient client = new HttpClient();
    
    client.getState().setCredentials(AuthScope.ANY, new NTCredentials(username, password, host, domain));

    PostMethod method = new PostMethod(url);
    client.getParams().setAuthenticationPreemptive(true);

    method.setDoAuthentication(true);

    try {
      int statusCode = client.executeMethod(method);

      if (statusCode == HttpStatus.SC_NOT_FOUND) {
        return StatusConnection.NOT_FOUND;
      }
      
      if (statusCode == HttpStatus.SC_UNAUTHORIZED) {
        return StatusConnection.UNAUTHORIZED;
      }
    } catch (HttpException e) {
      LOGGER.error(e.getMessage());
      return StatusConnection.NOT_FOUND;
    } catch (IOException e) {
      LOGGER.error(e.getMessage());
      return StatusConnection.NOT_FOUND;
    } finally {
      method.releaseConnection();
    }
    return StatusConnection.AUTHORIZED;
  }
}
