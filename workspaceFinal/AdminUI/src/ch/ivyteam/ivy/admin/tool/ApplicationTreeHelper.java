package ch.ivyteam.ivy.admin.tool;

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.scripting.objects.Tree;

public final class ApplicationTreeHelper {
  public static final String TREE_ITEM_APPLICATION = "application";
  public static final String TREE_ITEM_ENVROOT = "envroot";
  public static final String TREE_ITEM_ENVIRONMENT = "environment";
  public static final String TREE_ITEM_PM = "pm";
  public static final String TREE_ITEM_PMV = "pmv";

  /**
   * Hide Utility Class Constructor
   */
  private ApplicationTreeHelper() {
    super();
  }

  public static List<IEnvironment> getSelectedEnvironments(List<Tree> selectedNodes) {
    List<IEnvironment> envs = new ArrayList<IEnvironment>();

    for (Tree selectedNode : selectedNodes) {
      if (selectedNode.getValue() instanceof IEnvironment) {
        envs.add((IEnvironment) selectedNode.getValue());
      }

      if (selectedNode.getInfo().equalsIgnoreCase(TREE_ITEM_ENVROOT)) {
        envs.clear();
        IApplication application = (IApplication) selectedNode.getParent().getValue();
        envs.addAll(application.getEnvironmentsSortedByName());
        return envs;
      }
    }

    return envs;
  }

  public static boolean isOnlyOneTypeSelected(List<Tree> selectedNodes) {
    if (selectedNodes.size() <= 1) {
      return true;
    }

    String nodeTypeOfFirstElement = selectedNodes.get(0).getInfo();
    for (int i = 1; i < selectedNodes.size(); i++) {
      if (!selectedNodes.get(i).getInfo().equals(nodeTypeOfFirstElement)) {
        return false;
      }
    }

    return true;
  }

  public static boolean isSelectionFromSameApplication(List<Tree> selectedNodes) {
    if (selectedNodes.size() <= 1) {
      return true;
    }

    Tree appTreeOfFirstElement = getAppRoot(selectedNodes.get(0));
    for (int i = 1; i < selectedNodes.size(); i++) {
      if (getAppRoot(selectedNodes.get(i)) != appTreeOfFirstElement) {
        return false;
      }
    }
    return true;
  }

  private static Tree getAppRoot(Tree node) {
    Tree localNode = node;
    while (!localNode.getInfo().equalsIgnoreCase(TREE_ITEM_APPLICATION)) {
      localNode = localNode.getParent();
    }
    return localNode;
  }
}
