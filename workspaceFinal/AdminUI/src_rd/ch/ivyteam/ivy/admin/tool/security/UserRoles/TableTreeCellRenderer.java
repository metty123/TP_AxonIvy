package ch.ivyteam.ivy.admin.tool.security.UserRoles; // NOSONAR

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ch.ivyteam.ivy.admin.tool.security.RoleTree.Roles;
import ch.ivyteam.ivy.security.IRole;

import com.ulcjava.base.application.IRendererComponent;
import com.ulcjava.base.application.ULCTableTree;
import com.ulcjava.base.application.tabletree.DefaultTableTreeCellRenderer;
import com.ulcjava.base.application.tabletree.ITableTreeCellRenderer;
import com.ulcjava.base.application.util.Color;

public class TableTreeCellRenderer implements ITableTreeCellRenderer {

  private DefaultTableTreeCellRenderer defaultRenderer;
  private Set<String> activeRoleNames = new HashSet<>();

  public TableTreeCellRenderer(DefaultTableTreeCellRenderer renderer, List<IRole> activeRoles) {
    defaultRenderer = renderer;
    defaultRenderer.setName("defaultRenderer");
    activeRoleNames.add("Everybody");
    for (IRole role : activeRoles) {
      activeRoleNames.add(new Roles().getDisplayName(role));
    }
  }

  @Override
  public IRendererComponent getTableTreeCellRendererComponent(ULCTableTree tableTree, Object value, boolean selected,
      boolean hasFocus, boolean expanded, boolean leaf, Object node) {
    if (value != null) {
      String roleName = value.toString().trim();
      if (!activeRoleNames.contains(roleName)) {
        defaultRenderer.setForeground(Color.red);
      } else {
        defaultRenderer.setForeground(Color.black);
      }
    }
    return defaultRenderer
        .getTableTreeCellRendererComponent(tableTree, value, selected, hasFocus, expanded, leaf, node);
  }

}
