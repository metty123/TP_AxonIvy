package ch.ivyteam.ivy.admin.tool.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

import com.ulcjava.base.application.IRendererComponent;
import com.ulcjava.base.application.ULCTree;
import com.ulcjava.base.application.tree.DefaultTreeCellRenderer;
import com.ulcjava.base.application.tree.ITreeCellRenderer;
import com.ulcjava.base.application.util.Color;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.scripting.objects.Tree;
import ch.ivyteam.ivy.security.IRole;

public class RoleTree extends Tree {

  private static final String ROLE_PREFIX = "Role ";
  private static final long serialVersionUID = -7469552402027008239L;
  private RoleTreeCriteria criteria;
  private IApplication application;

  public RoleTree(IApplication application, RoleTreeCriteria criteria) {
    this.application = application;
    this.criteria = criteria;
    this.setValue(new Role(topLevelRole(), isActiveRole(topLevelRole().getName())));
    createChild(this);
  }
  
  public ITreeCellRenderer createCustomRenderer(DefaultTreeCellRenderer defaultRenderer) {
    return new ITreeCellRenderer() {

      @Override
      public IRendererComponent getTreeCellRendererComponent(ULCTree tree, Object value, boolean selected,
          boolean expanded, boolean leaf, boolean hasFocus) {
        boolean dataValid = Objects.nonNull(value) && StringUtils.isNotEmpty(value.toString());
        if (dataValid) {
          if (isActiveRole(value.toString())) {
            defaultRenderer.setForeground(Color.black);
          } else {
            defaultRenderer.setForeground(Color.red);
          }
        }
        defaultRenderer.setName("defaultRenderer");
        return defaultRenderer.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, hasFocus);
      }

    };
  }

  private Tree createChild(Tree tree) {
    Role role = (Role) tree.getValue();
    List<IRole> childRoles = new ArrayList<>(role.getIvyRole().getChildRoles());
    createRoleChild(tree, childRoles);
    if (criteria.isShowRoleMember()) {
      List<IRole> roleMembers = new ArrayList<>(role.getIvyRole().getRoleMembers());
      createRoleMemberChild(tree, role.getIvyRole(), roleMembers);
    }
    return tree;
  }

  private void createRoleChild(Tree tree, List<IRole> childRoles) {
    childRoles = filter(childRoles);
    sort(childRoles);
    childRoles.forEach(childRole -> {
      boolean anyMatch = criteria.getExcludedRoles().stream().anyMatch(e -> e.getId() == childRole.getId());
      if (!anyMatch) {
        Role role = new Role(childRole, isActiveRole(childRole.getName()));
        Tree child = createChildTree(tree, role);
        createChild(child);
        if (child.isLeaf() && !StringUtils.containsIgnoreCase(childRole.getName(), criteria.getKeyword())) {
          tree.remove(child);
        }
      }
    });
  }

  private void createRoleMemberChild(Tree tree, IRole parent, List<IRole> childRoles) {
    childRoles = filter(childRoles);
    sort(childRoles);
    childRoles.forEach(childRole -> {
      if (StringUtils.containsIgnoreCase(childRole.getName(), criteria.getKeyword())) {
        Role role = new RoleMember(childRole, parent);
        createChildTree(tree, role);
      }
    });
  }

  private Tree createChildTree(Tree tree, Role role) {
    return tree.createChild(role, ROLE_PREFIX + role.getIvyRole().getId());
  }

  private List<IRole> filter(List<IRole> childRoles) {
    if (criteria.isShowOnlyActiveRole()) {
      childRoles =
          childRoles.stream().filter(childRole -> isActiveRole(childRole.getName())).collect(Collectors.toList());
    }
    return childRoles;
  }

  private IRole topLevelRole() {
    return application.getSecurityContext().getTopLevelRole();
  }

  private boolean isActiveRole(String roleName) {
    return application.getSecurityContext().getActiveRoles().stream()
        .anyMatch(activeRole -> roleName.equals(activeRole.getName()));
  }

  private void sort(List<IRole> childRoles) {
    childRoles.sort((r1, r2) -> {
      return r1.getName().compareToIgnoreCase(r2.getName());
    });
  }
}
