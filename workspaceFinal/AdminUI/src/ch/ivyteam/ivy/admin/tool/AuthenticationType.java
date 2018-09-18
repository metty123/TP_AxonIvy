package ch.ivyteam.ivy.admin.tool;

/**
 * Enumeration for authentication types
 * 
 * @author mde
 * @since 02.09.2009
 * 
 */
public enum AuthenticationType {

  HTTP_BASIC, HTTP_DIGEST, HTTPS, NTLM;

  public String value() {
    return name();
  }

  public static AuthenticationType fromValue(String v) {
    if (v == null || v.equals("")) {
      return HTTP_BASIC;
    } else {
      return valueOf(v);
    }
  }


}
