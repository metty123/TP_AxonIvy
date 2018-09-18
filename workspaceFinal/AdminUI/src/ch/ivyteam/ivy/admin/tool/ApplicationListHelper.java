package ch.ivyteam.ivy.admin.tool;

import java.util.Collections;
import java.util.Comparator;

import ch.ivyteam.ivy.application.ILibrary;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.scripting.objects.List;
import ch.ivyteam.ivy.scripting.objects.Tree;


/**
 * 
 * This class contains helper methods for the rich dialog: ApplicationList. <br/>
 * Methods of this class are listed below. <br/>
 * - sortPMV: sorts PMV-s in a specific order. <br/>
 * - findPositionForNewPmv: finds proper position for new PMV before it is added into a sorted PMV-s list.
 * 
 * @since June, 19 2014
 * @author huy.dang
 * 
 */
public final class ApplicationListHelper {

  private ApplicationListHelper() {}

  /**
   * 
   * Sorts PMV-s of a PM in a specific order: <br/>
   * - first (up) display PMV-s that contain projects with library-s. <br/>
   * - if library ID is known, then ORDER BY library.getVersion() DESC <br/>
   * - if unknown, then ORDER BY pmv.getVersionNumber() DESC
   * 
   * @param pmvs a list of PMV
   */
  public static List<IProcessModelVersion> sortPMV(List<IProcessModelVersion> pmvs) {
    return sortPmv(pmvs);
  }

  /**
   * 
   * Finds a proper position for a PMV before it is added into a sorted PMV-s list.
   * 
   * @param pm a tree node which has value is a PM
   * @param newPmv a PMV
   * @return position
   */
  public static int findPositionForNewPmv(Tree pm, IProcessModelVersion newPmv) {
    List<IProcessModelVersion> pmvs = getPmvs(pm);
    pmvs.add(newPmv);
    List<IProcessModelVersion> sortedPmvs = sortPmv(pmvs);
    return sortedPmvs.indexOf(newPmv);
  }

  private static List<IProcessModelVersion> getPmvs(Tree pm) {
    List<IProcessModelVersion> pmvs = List.create(IProcessModelVersion.class);
    List<Tree> children = pm.getChildren();
    for (Tree child : children) {
      if (child.getValue() instanceof IProcessModelVersion) {
        IProcessModelVersion pmv = (IProcessModelVersion) child.getValue();
        pmvs.add(pmv);
      }
    }
    return pmvs;
  }

  private static List<IProcessModelVersion> sortPmv(List<IProcessModelVersion> pmvs) {
    List<IProcessModelVersion> unknownLibraryPmvs = List.create(IProcessModelVersion.class);
    List<IProcessModelVersion> knownLibraryPmvs = List.create(IProcessModelVersion.class);

    for (IProcessModelVersion pmv : pmvs) {
      if (pmv.getLibrary() == null) {
        unknownLibraryPmvs.add(pmv);
      } else {
        knownLibraryPmvs.add(pmv);
      }
    }

    Collections.sort(unknownLibraryPmvs, COMPARATOR);
    Collections.sort(knownLibraryPmvs, COMPARATOR);

    List<IProcessModelVersion> sortedPmvs = List.create(IProcessModelVersion.class);
    sortedPmvs.addAll(knownLibraryPmvs);
    sortedPmvs.addAll(unknownLibraryPmvs);

    return sortedPmvs;
  }

  private static final Comparator<IProcessModelVersion> COMPARATOR = new Comparator<IProcessModelVersion>() {

    @Override
    public int compare(IProcessModelVersion o1, IProcessModelVersion o2) {
      ILibrary library1 = o1.getLibrary();
      ILibrary library2 = o2.getLibrary();
      if (library1 != null && library2 != null) {
        return library2.getQualifiedVersion().compareTo(library1.getQualifiedVersion());
      } else {
        return (int) (o2.getId() - o1.getId());
      }
    }
  };
}
