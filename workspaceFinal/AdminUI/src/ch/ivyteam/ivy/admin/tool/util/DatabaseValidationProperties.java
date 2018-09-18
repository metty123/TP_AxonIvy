package ch.ivyteam.ivy.admin.tool.util;

import java.util.Properties;

import ch.ivyteam.ivy.environment.Ivy;

public final class DatabaseValidationProperties {
  /**
   * Hide Utility Class Constructor
   */
  private DatabaseValidationProperties() {}

  public static int getConnectionUrlMaxLength() {
    int connectionUrlMaxLength = 0;
    String connectionUrl = getProperty("IWA_ExternalDatabase.ConnectionUrl");
    if (connectionUrl != null && !connectionUrl.isEmpty()) {
      connectionUrlMaxLength = Integer.parseInt(connectionUrl);
    }
    return connectionUrlMaxLength;
  }

  public static int getUserFriendlyNameMaxLength() {
    int userFriendlyNameMaxLength = 0;
    String userFriendlyName = getProperty("IWA_ExternalDatabase.UserFriendlyName");
    if (userFriendlyName != null && !userFriendlyName.isEmpty()) {
      userFriendlyNameMaxLength = Integer.parseInt(userFriendlyName);
    }
    return userFriendlyNameMaxLength;
  }

  public static int getMaxNumberOfConnections() {
    int maxNumberOfConnectionsLength = 0;
    String maxNumberOfConnections = getProperty("IWA_ExternalDatabase.MaxNumberOfConnections");
    if (maxNumberOfConnections != null && !maxNumberOfConnections.isEmpty()) {
      maxNumberOfConnectionsLength = Integer.parseInt(maxNumberOfConnections);
    }
    return maxNumberOfConnectionsLength;
  }

  public static int getUserNameMaxLength() {
    int userNameMaxLength = 0;
    String username = getProperty("IWA_ExternalDatabase.UserName");
    if (username != null && !username.isEmpty()) {
      userNameMaxLength = Integer.parseInt(username);
    }
    return userNameMaxLength;
  }

  public static int getPropertyNameMaxLength() {
    int propertyNameMaxLength = 0;
    String propertyName = getProperty("IWA_ExternalDatabaseProperty.PropertyName");
    if (propertyName != null && !propertyName.isEmpty()) {
      propertyNameMaxLength = Integer.parseInt(propertyName);
    }
    return propertyNameMaxLength;
  }

  public static int getLdapUserNameMaxLength() {
    int ldapUserNameMaxLength = 0;
    String username = getProperty("IWA_ExternalNamingAndDirectory.Username");
    if (username != null && !username.isEmpty()) {
      ldapUserNameMaxLength = Integer.parseInt(username);
    }
    return ldapUserNameMaxLength;
  }

  public static int getLdapPasswdMaxLength() {
    int ldapPasswdMaxLength = 0;
    String passwd = getProperty("IWA_ExternalNamingAndDirectory.UserPassword");
    if (passwd != null && !passwd.isEmpty()) {
      ldapPasswdMaxLength = Integer.parseInt(passwd);
    }
    return ldapPasswdMaxLength;
  }


  public static int getLdapDefaultContextMaxLength() {
    int ldapDefaultContextMaxLength = 0;
    String defaultContext = getProperty("IWA_ExternalNamingAndDirectory.DefaultContext");
    if (defaultContext != null && !defaultContext.isEmpty()) {
      ldapDefaultContextMaxLength = Integer.parseInt(defaultContext);
    }
    return ldapDefaultContextMaxLength;
  }

  public static String getProperty(String key) {
    String value = "";
    Properties property = new Properties();
    try {
      property.load(DatabaseValidationProperties.class.getClassLoader().getResourceAsStream(
          "resources/databaseValidation.properties"));
      value = property.getProperty(key);

    } catch (Exception ex) {
      Ivy.log().warn(
          "[DatabaseValidationProperties] --- Reading databaseValidation.properties failed. Due to " + ex.getMessage());
    }
    return value;
  }

}
