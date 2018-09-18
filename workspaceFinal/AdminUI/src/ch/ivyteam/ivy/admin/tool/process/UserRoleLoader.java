package ch.ivyteam.ivy.admin.tool.process;

import java.util.ArrayList;
import java.util.regex.Pattern;

import ch.ivyteam.ivy.admin.tool.util.CollectionSorts;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ivy.scripting.objects.Tree;
import ch.ivyteam.ivy.security.IRole;
import ch.ivyteam.ivy.security.IUser;

@SuppressWarnings("unchecked")
public final class UserRoleLoader {

  private UserRoleLoader() {}
  
  /**
   * Create all children nodes of role tree and sort ascending
   * 
   * @param treeToBeLoaded
   */
  public static void loadChildren(Tree treeToBeLoaded, IUser user) throws PersistencyException {
    List<Object> nodeValues = (List<Object>) treeToBeLoaded.getValue();
    IRole role = (IRole) nodeValues.get(0);
    // role.getChildRoles is a static access list, so create a new list from it
    java.util.List<IRole> childRoles = new ArrayList<IRole>(role.getChildRoles());
    CollectionSorts.sortRole(childRoles);
    java.util.List<IRole> userRoles = (java.util.List<IRole>) user.getRoles();

    for (IRole childRole : childRoles) {
        String own = "No";
        if (userRoles.contains(childRole)) {
          own = "Yes";
        } else if (user.getUserToken().hasRole(childRole, false)) {
          own = "Inherited";
        }

        List<Object> nodeValue = List.create(Object.class);
        nodeValue.add(childRole);
        nodeValue.add(own);
        Tree childTree = treeToBeLoaded.createChild(nodeValue, "Role " + childRole.getId());
        loadChildren(childTree, user);
     }
  }
  
  /**
   * Load active roles(which are not deleted) for user 
   * @param treeToBeLoaded
   * @param user
   * @param activeRoles
   * @throws PersistencyException
   */
  public static void loadActiveChildren(Tree treeToBeLoaded, IUser user, List<IRole> activeRoles) throws PersistencyException {
    List<Object> nodeValues = (List<Object>) treeToBeLoaded.getValue();
    IRole role = (IRole) nodeValues.get(0);
    // role.getChildRoles is a static access list, so create a new list from it
    java.util.List<IRole> childRoles = new ArrayList<IRole>(role.getChildRoles());
    CollectionSorts.sortRole(childRoles);
    java.util.List<IRole> userRoles = (java.util.List<IRole>) user.getRoles();

    for (IRole childRole : childRoles) {
      // if this role exists in active roles
      if (checkRoleExistsInList(childRole, activeRoles)){
        String own = "No";
        if (userRoles.contains(childRole)) {
          own = "Yes";
        } else if (user.getUserToken().hasRole(childRole, false)) {
          own = "Inherited";
        }
  
        List<Object> nodeValue = List.create(Object.class);
        nodeValue.add(childRole);
        nodeValue.add(own);
        Tree childTree = treeToBeLoaded.createChild(nodeValue, "Role " + childRole.getId());
        loadActiveChildren(childTree, user, activeRoles);
      }
    }
  }
  
  private static boolean checkRoleExistsInList(IRole role, List<IRole> roles){
    for (IRole item : roles){
      if (item.getName().equals(role.getName())){
        
        return true;
      }
    }
    return false;
  }

  /**
   * @param selectedTreeNode
   * @param roleTree
   * @param value
   */
  public static void updateUserRoleOwnOnTree(List<Tree> selectedTreeNodes, Tree roleTree, String value) {
    for (Tree selectedTreeNode : selectedTreeNodes) {
      ((List<Object>) selectedTreeNode.getValue()).set(1, value);
      selectedTreeNode.treeValueChanged();

      for (Tree childTree : roleTree.getAllDeepChildren()) {
        if (childTree.getInfo().equals(selectedTreeNode.getInfo())) {
          ((List<Object>) childTree.getValue()).set(1, value);
          break;
        }
      }
    }
  }

  /**
   * Filter role tree by name
   * 
   * @param keyword
   * @param treeToBeFiltered: tree contains children trees
   * @return true: remove root node, false: not remove it
   */
  public static boolean filterRolesByName(String keyword, Tree treeToBeFiltered) throws PersistencyException {
    String regex = "(.|\n)*" + keyword + "(.|\n)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    List<Object> nodeValues = (List<Object>) treeToBeFiltered.getValue();
    IRole role = (IRole) nodeValues.get(0);

    if (!p.matcher(role.getName()).matches()) {
      for (Tree childTree : treeToBeFiltered.getChildren()) {
        List<Object> childNodeValues = (List<Object>) childTree.getValue();
        IRole childRole = (IRole) childNodeValues.get(0);

        if (!p.matcher(childRole.getName()).matches()) {
          filterRolesByName(keyword, childTree);
        }
      }

      if (treeToBeFiltered.getChildCount() == 0) {
        treeToBeFiltered.removeFromParent();
        return true;
      }
    }

    return false;
  }
}
