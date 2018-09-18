package ch.ivyteam.ivy.admin.tool.role;

import static org.apache.commons.lang.StringUtils.isNotEmpty;
import ch.ivyteam.ivy.security.IRole;

public class Role {

  private IRole ivyRole;
  private boolean isActive;

  // FIXME
  public Role() {}

  public Role(IRole ivyRole, boolean isActive) {
    this.ivyRole = ivyRole;
    this.isActive = isActive;
  }

  public IRole getIvyRole() {
    return ivyRole;
  }
  
  public boolean isActive() {
    return isActive;
  }

  public String getDisplayName() {
    String externalSecurityName = ivyRole.getExternalSecurityName();
    if (isNotEmpty(externalSecurityName)) {
      return String.format("%s [%s]", ivyRole.getName(), externalSecurityName);
    }
    return ivyRole.getName();
  }
}
