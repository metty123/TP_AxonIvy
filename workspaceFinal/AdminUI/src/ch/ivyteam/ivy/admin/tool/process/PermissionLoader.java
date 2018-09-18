package ch.ivyteam.ivy.admin.tool.process;

import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ivy.scripting.objects.Tree;
import ch.ivyteam.ivy.security.IPermission;
import ch.ivyteam.ivy.security.IPermissionAccess;
import ch.ivyteam.ivy.security.IPermissionGroup;
import ch.ivyteam.ivy.security.IPermissionGroupAccess;
import ch.ivyteam.ivy.security.ISecurityDescriptor;
import ch.ivyteam.ivy.security.ISecurityMember;

public final class PermissionLoader {

  private PermissionLoader() {}

  /**
   * Get all children nodes of permission tree
   * 
   * @param loadTreeNode
   * @param securityDescriptor
   * @param securityMember
   */
  public static void loadChildren(Tree loadTreeNode, ISecurityDescriptor securityDescriptor,
      ISecurityMember securityMember) throws PersistencyException {
    if (loadTreeNode.getValue() instanceof IPermissionGroupAccess) {
      Tree child;
      IPermissionGroupAccess groupAccess = (IPermissionGroupAccess) loadTreeNode.getValue();

      for (IPermission permission : groupAccess.getPermissionGroup().getPermissions()) {
        IPermissionAccess access = securityDescriptor.getPermissionAccess(permission, securityMember);

        if (access.getPermission() != null) {
          child = loadTreeNode.createChild(access, "Permisson " + access.getPermission().getId());
          child.setMayHaveChildren(false);
        }
      }

      for (IPermissionGroup childGroup : groupAccess.getPermissionGroup().getChildGroups()) {
        IPermissionGroupAccess childGroupAccess =
            securityDescriptor.getPermissionGroupAccess(childGroup, securityMember);

        if (childGroupAccess.getPermissionGroup() != null) {
          child =
              loadTreeNode.createChild(childGroupAccess, "Permission Group "
                  + childGroupAccess.getPermissionGroup().getId());
          loadChildren(child, securityDescriptor, securityMember);
        }
      }
    }
  }

  /**
   * reload all children nodes of permission tree
   * 
   * @param loadTreeNode
   * @param securityDescriptor
   * @param securityMember
   */
  public static void reloadChildren(Tree loadTreeNode, ISecurityDescriptor securityDescriptor,
      ISecurityMember securityMember) throws PersistencyException {
    List<Tree> childrenTree = loadTreeNode.getChildren();

    for (Tree tree : childrenTree) {
      if (tree.getValue() instanceof IPermissionAccess) {
        IPermissionAccess access = (IPermissionAccess) tree.getValue();

        if (access.getPermission() != null) {
          IPermissionAccess newAccess = securityDescriptor.getPermissionAccess(access.getPermission(), securityMember);
          tree.setValue(newAccess);
        }
      } else if (tree.getValue() instanceof IPermissionGroupAccess) {
        IPermissionGroupAccess groupAccess = (IPermissionGroupAccess) tree.getValue();

        if (groupAccess.getPermissionGroup() != null) {
          IPermissionGroupAccess newGroupAccess =
              securityDescriptor.getPermissionGroupAccess(groupAccess.getPermissionGroup(), securityMember);
          tree.setValue(newGroupAccess);
        }

        reloadChildren(tree, securityDescriptor, securityMember);
      }
    }
  }

  /**
   * filter permission tree
   * 
   * @param permissionTree
   * @param filter
   * @return true: remove root node, false: not remove root node
   */
  public static boolean filterTree(Tree permissionTree, String filter) throws PersistencyException {
    if (permissionTree.getValue() instanceof IPermissionGroupAccess) {
      IPermissionGroupAccess permissionGroupAccess = (IPermissionGroupAccess) permissionTree.getValue();

      if (permissionGroupAccess.getPermissionGroup() != null) {
        List<Tree> childrenTree = permissionTree.getChildren();

        if (!permissionGroupAccess.getPermissionGroup().getName().isEmpty()
            && !permissionGroupAccess.getPermissionGroup().getName().toLowerCase().contains(filter)) {
          for (Tree tree : childrenTree) {
            if (tree.getValue() instanceof IPermissionAccess) {
              IPermissionAccess permissionAccess = (IPermissionAccess) tree.getValue();

              if (permissionAccess.getPermission() != null && !permissionAccess.getPermission().getName().isEmpty()
                  && !permissionAccess.getPermission().getName().toLowerCase().contains(filter)) {
                tree.removeFromParent();
              }
            } else if (tree.getValue() instanceof IPermissionGroupAccess) {
              filterTree(tree, filter);
            }
          }

          if (permissionTree.getChildCount() == 0) {
            permissionTree.removeFromParent();
            return true;
          }
        }
      }
    }
    return false;
  }
}
