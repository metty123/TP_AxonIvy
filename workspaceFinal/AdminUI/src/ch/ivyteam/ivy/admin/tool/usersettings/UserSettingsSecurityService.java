package ch.ivyteam.ivy.admin.tool.usersettings;

import ch.ivyteam.ivy.security.IExternalSecuritySystemProvider;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.internal.ads.MicrosoftActiveDirectorySecuritySystemProvider;
import ch.ivyteam.ivy.security.internal.nds.NovellDirectoryServiceSecuritySystemProvider;
import ch.ivyteam.ivy.system.IProperty;

public class UserSettingsSecurityService {

  private ISecurityContext securityContext;

  public UserSettingsSecurityService(ISecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  public boolean isPropertyEnabled(String jndiAttributePropertyName) {
    IExternalSecuritySystemProvider securitySystemProvider = getExternalSecuritySystemProvider();
    boolean isAdministationSupported = securitySystemProvider.isAdministrationSupported();
    if (isSecuritySystemSupportLDAP(securitySystemProvider)) {
      boolean isPropertyNotImportedFromLDAP = isPropertyNotImportedFromLDAP(jndiAttributePropertyName);
      return isAdministationSupported || isPropertyNotImportedFromLDAP;
    } else {
      return isAdministationSupported;
    }
  }

  private boolean isSecuritySystemSupportLDAP(IExternalSecuritySystemProvider securitySystemProvider) {
    return securitySystemProvider instanceof MicrosoftActiveDirectorySecuritySystemProvider
        || securitySystemProvider instanceof NovellDirectoryServiceSecuritySystemProvider;
  }

  private boolean isPropertyNotImportedFromLDAP(String jndiAttributePropertyName) {
    return "".equals(getPropertyValue(jndiAttributePropertyName));
  }

  private IExternalSecuritySystemProvider getExternalSecuritySystemProvider() {
    return securityContext.getExternalSecuritySystemProvider();
  }

  private String getPropertyValue(String jndiAttributePropertyName) {
    IProperty property = securityContext.getConfigurationProperty(jndiAttributePropertyName);
    if (property == null) {
      throw new NoSuchJNDIPropertyException(String.format("JNDI Property %s does not exist", jndiAttributePropertyName));
    }
    return property.getValue();
  }

}
