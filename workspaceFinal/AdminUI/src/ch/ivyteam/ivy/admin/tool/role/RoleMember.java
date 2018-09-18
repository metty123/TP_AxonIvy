package ch.ivyteam.ivy.admin.tool.role;

import ch.ivyteam.ivy.security.IRole;

public class RoleMember extends Role {

  private IRole parent;

  public RoleMember(IRole ivyRole, IRole parent) {
    // TODO: is role member should be always active?
    super(ivyRole, true);
    this.parent = parent;
  }

  public IRole getParent() {
    return parent;
  }
}
