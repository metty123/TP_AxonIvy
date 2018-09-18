package ch.ivyteam.ivy.admin.tool.security.RoleTree; // NOSONAR

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.security.IRole;

public class Roles {

  public String getDisplayName(IRole role) {
    String extended = "";
    String externalSecurityName = role.getExternalSecurityName();
    if (externalSecurityName != null && !externalSecurityName.isEmpty()) {
      extended =  " " + "[" + externalSecurityName + "]";
    }
    return role.getName() + extended;
  }

  public List<IRole> filterSecurityRoles(IRole root, List<IRole> filters) {
    List<IRole> filteredRoles = new ArrayList<IRole>();
    List<IRole> roles = getRoles(root);
    for (IRole filter : filters) {
      for (IRole role : roles) {
        if (filter.getName().equals(role.getName())) {
          filteredRoles.add(role);
          break;
        }
      }
    }
    return filteredRoles;
  }

  private List<IRole> getRoles(IRole root) {
    List<IRole> roles = new ArrayList<>();

    roles.add(root);
    List<IRole> childRoles = new ArrayList<>(root.getChildRoles());
    for (IRole child : childRoles) {
      roles.addAll(getRoles(child));
    }

    return roles;
  }
}
