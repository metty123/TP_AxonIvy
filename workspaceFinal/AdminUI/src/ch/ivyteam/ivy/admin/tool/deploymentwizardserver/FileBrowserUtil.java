package ch.ivyteam.ivy.admin.tool.deploymentwizardserver;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ch.ivyteam.ivy.scripting.objects.Tree;
import ch.ivyteam.ivy.scripting.objects.util.IvyTreeValueVisitor;

/**
 * Util for setting up a tree for files for a predefined path
 * 
 * @author mda
 */
public final class FileBrowserUtil {

  /**
   * Hide Utility Class Constructor
   */
  private FileBrowserUtil() {
    super();
  }

  public static Tree setDefaultPath(String defaultPath, Tree treeRoot, boolean onlyDirectories) {
    // set root to given directory
    if (defaultPath.trim().length() > 0) {
      File defaultDir = new File(defaultPath);
      if (defaultDir.exists() && defaultDir.isDirectory()) {
        // get to root bottom-up and memorize path
        List<File> pathToDefaultDir = new ArrayList<File>();
        File parent = defaultDir;
        while (parent != null) {
          pathToDefaultDir.add(parent);
          parent = parent.getParentFile();
        }
        // reverse to have path from root to end
        Collections.reverse(pathToDefaultDir);

        // find root of default path in tree
        parent = pathToDefaultDir.get(0);
        IvyTreeValueVisitor visitor = new IvyTreeValueVisitor(parent);
        try {
          treeRoot.acceptVisitor(visitor);
        } catch (Exception e) {
          // Ignore
        }

        // if found, loop through memorized path and create tree nodes on the
        // way
        if (visitor.getNodes().size() == 1) {
          Tree rootForInsert = visitor.getNodes().get(0);
          Tree newNode;
          Tree nodeToReturn = null;
          for (int i = 0; i < pathToDefaultDir.size() - 1; i++) {
            // for every dir on the path, create tree children for all
            // files/dirs (otherwise UI tree shows only the direct path)
            File actualDir = pathToDefaultDir.get(i);
            File[] files = actualDir.listFiles();
            for (File file : files) {
              if (!onlyDirectories || file.isDirectory()) {
                newNode = rootForInsert.createChild(file, (file.isDirectory() ? "dir" : "file"));
                newNode.setMayHaveChildren(file.isDirectory());
                // find root for the next level in the path
                if (file.equals(pathToDefaultDir.get(i + 1))) {
                  nodeToReturn = newNode;
                }
              }
            }
            rootForInsert = nodeToReturn;
          }

          if (nodeToReturn == null && !visitor.getNodes().isEmpty()) {
            nodeToReturn = visitor.getNodes().get(0);
          }
          // one level deeper, because otherwise children of selected node not visible
          File[] files = defaultDir.listFiles();
          if (files != null && files.length > 0) {
            for (File file : files) {
              if (!onlyDirectories || file.isDirectory()) {
                newNode = nodeToReturn.createChild(file, (file.isDirectory() ? "dir" : "file"));
                newNode.setMayHaveChildren(file.isDirectory());
              }
            }
          }
          return nodeToReturn;
        }
      }
    }
    return treeRoot;
  }

  public static boolean isFileExisting(String filePath) {
    return new File(filePath).exists();
  }
}
