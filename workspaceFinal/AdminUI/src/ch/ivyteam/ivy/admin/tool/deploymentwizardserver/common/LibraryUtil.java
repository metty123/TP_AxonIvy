package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.LibraryInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.RequireLibraryInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.VersionRangeReader;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.VersionRangeReaderFactory;
import ch.ivyteam.ivy.application.ActivityState;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.ILibrary;
import ch.ivyteam.ivy.application.IProcessModel;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.application.ReleaseState;
import ch.ivyteam.ivy.application.value.QualifiedVersion;
import ch.ivyteam.ivy.application.value.VersionBound;
import ch.ivyteam.ivy.application.value.VersionRange;

public final class LibraryUtil {

  private static final String MATCHING_PMV_TEXT_FORMAT = "%s %s -> %s";
  private static final String TD_BEGIN = "<td>";
  private static final String TD_END = "</td>";

  /**
   * Hide Utility Class Constructor
   */
  private LibraryUtil() {
    super();
  }

  public static final String RED = "red";
  public static final String GREEN = "#58BE2B";
  public static final String QUESTION_MARK = "?";
  public static final String DEFAULT_LIBRARY_VERSION = "1.0.0-SNAPSHOT";

  /**
   * From require Project string in format "libId1#1..2, libId2#3..4", convert
   * to list of RequireLibraryInfo
   * 
   * @param requireProjects
   * @return list of RequireLibraryInfo
   */
  public static List<RequireLibraryInfo> getRequireProjectInfo(String requireProjects) {
    List<RequireLibraryInfo> requiredProjectInfos = new ArrayList<RequireLibraryInfo>();
    if (StringUtils.isEmpty(requireProjects)) {
      return requiredProjectInfos;
    }
    for (String requiredProject : requireProjects.split(GlobalVariable.SEMICOLON)) {
      if (StringUtils.isNotEmpty(requiredProject)) {
        RequireLibraryInfo requiredLibraryInfo = getRequiredLibraryInfor(requiredProject.trim());
        requiredProjectInfos.add(requiredLibraryInfo);
      }
    }

    return requiredProjectInfos;
  }

  private static RequireLibraryInfo getRequiredLibraryInfor(String requiredProject) {
    RequireLibraryInfo requiredLibraryInfo = new RequireLibraryInfo();
    String[] requiredLibraryLiteral = requiredProject.split(GlobalVariable.LIB_DELIMITER);
    setRequiredLibraryInfo(requiredLibraryInfo, requiredLibraryLiteral);
    return requiredLibraryInfo;
  }

  private static void setRequiredLibraryInfo(RequireLibraryInfo requiredLibraryInfo, String[] requiredLibraryLiteral) {
    if (requiredLibraryLiteral.length > 0) {
      String libraryId = requiredLibraryLiteral[0];
      requiredLibraryInfo.setId(libraryId);
      requiredLibraryInfo.setMinVersionBound(VersionBound.UNSPECIFIED);
      requiredLibraryInfo.setMaxVersionBound(VersionBound.UNSPECIFIED);
    }
    if (requiredLibraryLiteral.length == 2) {
      String requiredVersionLiteral = requiredLibraryLiteral[1];
      setVersionRangeInfo(requiredLibraryInfo, requiredVersionLiteral);
    }
  }

  private static void setVersionRangeInfo(RequireLibraryInfo requiredLibraryInfo, String requiredVersionLiteral) {
    VersionRangeReader versionRangeReader = VersionRangeReaderFactory.specifyVersionRangeReader(requiredVersionLiteral);
    requiredLibraryInfo.setMinVersionBound(versionRangeReader.getMinVersionBound());
    requiredLibraryInfo.setMaxVersionBound(versionRangeReader.getMaxVersionBound());
  }

  /**
   * get available libs in Application with ID and version
   * 
   * @param app
   * @return list of RequireLibraryInfo
   */
  public static List<LibraryInfo> getAvailableLibOnApp(IApplication app) {
    List<LibraryInfo> availableLibs = new ArrayList<>();
    for (IProcessModel pm : app.getProcessModels()) {
      for (IProcessModelVersion pmv : pm.getProcessModelVersions()) {
        if (pmv.getLibrary() != null && pmv.getReleaseState() != null && !pmv.getLibrary().equals(ReleaseState.DELETED)) {
          availableLibs.add(toLibraryInfo(pmv.getLibrary()));
        }
      }
    }
    return availableLibs;
  }

  private static LibraryInfo toLibraryInfo(ILibrary iLibrary) {
    LibraryInfo libraryInfo = new LibraryInfo();
    libraryInfo.setProjectName(iLibrary.getName());
    libraryInfo.setIsDeployed(true);
    libraryInfo.setQualifiedVersion(iLibrary.getQualifiedVersion());
    libraryInfo.setLibraryId(iLibrary.getId());
    return libraryInfo;
  }

  private static LibraryInfo toNotDeployedYetLibraryInfo(ProjectInfo projectInfo) {
    LibraryInfo libraryInfo = new LibraryInfo();
    libraryInfo.setProjectName(projectInfo.getProjectName());
    libraryInfo.setIsDeployed(false);
    libraryInfo.setQualifiedVersion(projectInfo.getQualifiedProjectVersion());
    libraryInfo.setLibraryId(projectInfo.getLibraryId());
    return libraryInfo;
  }

  public static List<LibraryInfo> getAvailableLib(IApplication app, List<ProjectInfo> projects) {
    List<LibraryInfo> availableLibraryInfos = getAvailableLibOnApp(app);

    for (ProjectInfo project : projects) {
      boolean isFound = false;
      for (LibraryInfo libraryInfo : availableLibraryInfos) {
        if (libraryInfo.getLibraryId().equals(project.getLibraryId())
            && libraryInfo.getQualifiedVersion().equals(project.getQualifiedProjectVersion())) {
          isFound = true;
          break;
        }
      }
      if (!isFound) {
        availableLibraryInfos.add(toNotDeployedYetLibraryInfo(project));
      }
    }

    return availableLibraryInfos;
  }

  /**
   * create require libs and require libs tooltip for project info object. Do it
   * by compare require require libs of project with available libs in
   * application
   * 
   * @param availableLibraryInfos
   * @param requiredLibs
   * @param projectInfo
   */
  public static void createRequireLibTextAndToolTip(List<LibraryInfo> availableLibraryInfos,
      List<RequireLibraryInfo> requiredLibs, ProjectInfo projectInfo) {
    List<String> requireProjectTexts = new ArrayList<>();
    StringBuilder requireProjectTooltip = new StringBuilder();

    requireProjectTooltip.append("<html>");
    requireProjectTooltip.append("<table border = '0'>");

    requiredLibs.forEach(requiredLib -> {
      LibraryInfo foundLibrary = findMaximumMatchedLibrary(requiredLib, availableLibraryInfos);
      requireProjectTexts.add(createRequiredLibraryText(requiredLib, foundLibrary));
      requireProjectTooltip.append(createRequiredLibraryHTMLToolTip(requiredLib, foundLibrary));
    });

    requireProjectTooltip.append("</table>");
    requireProjectTooltip.append("</html>");

    projectInfo.setRequireProjectsText(requireProjectTexts.stream().collect(Collectors.joining(", ")));
    projectInfo.setRequireProjectsTooltip(requireProjectTooltip.toString());

  }

  private static LibraryInfo findMaximumMatchedLibrary(RequireLibraryInfo requiredLib,
      List<LibraryInfo> availableLibraryInfos) {
    LibraryInfo foundLibrary = null;
    VersionRange range = new VersionRange(requiredLib.getMinVersionBound(), requiredLib.getMaxVersionBound());
    String requiredLibraryId = requiredLib.getId();
    for (LibraryInfo availableLibraryInfo : availableLibraryInfos) {
      if (isMatchedLibrary(range, requiredLibraryId, availableLibraryInfo)
          && isLibraryNotFoundYetOrNewlyFoundLibraryIsLater(foundLibrary, availableLibraryInfo)) {
        foundLibrary = availableLibraryInfo;
      }
    }
    return foundLibrary;
  }

  private static boolean isMatchedLibrary(VersionRange range, String requiredLibraryId, LibraryInfo availableLibraryInfo) {
    return availableLibraryInfo.getLibraryId().equals(requiredLibraryId)
        && range.isVersionInRange(availableLibraryInfo.getQualifiedVersion());
  }

  private static boolean isLibraryNotFoundYetOrNewlyFoundLibraryIsLater(LibraryInfo foundLibrary,
      LibraryInfo newlyFoundLibraryInfo) {
    return foundLibrary == null
        || (foundLibrary != null && newlyFoundLibraryInfo.getQualifiedVersion().compareTo(
            foundLibrary.getQualifiedVersion()) > 0);
  }

  private static String createRequiredLibraryText(RequireLibraryInfo requiredLib, LibraryInfo libraryInfo) {
    String result = (libraryInfo == null ? createText(requiredLib, QUESTION_MARK) : createMatchedLibraryText(
        requiredLib, libraryInfo));
    return result;
  }

  private static String createMatchedLibraryText(RequireLibraryInfo requiredLib, LibraryInfo libraryInfo) {
    return createText(requiredLib, libraryInfo.getIsDeployed() ? libraryInfo.getQualifiedVersion().toString()
        : GlobalVariable.PLUS);
  }

  private static String createRequiredLibraryHTMLToolTip(RequireLibraryInfo requiredLib, LibraryInfo libraryInfo) {
    String result = (libraryInfo == null ? createHTML(RED, requiredLib, QUESTION_MARK)
        : createMatchedLibraryHTMLTooltip(requiredLib, libraryInfo));
    return result;
  }

  private static String createMatchedLibraryHTMLTooltip(RequireLibraryInfo requiredLib, LibraryInfo libraryInfo) {
    if (libraryInfo.getIsDeployed()) {
      return createHTML(GREEN, requiredLib, libraryInfo.getQualifiedVersion().toString());
    } else {
      return createHTML(GREEN, requiredLib, libraryInfo.getProjectName(), libraryInfo.getLibraryId(), libraryInfo
          .getQualifiedVersion().toString());
    }
  }

  /**
   * create text to format libraryID [minVersion .. maxVersion] -> ?
   * 
   * @param item
   * @param matchingVersion
   * @return
   */
  private static String createText(RequireLibraryInfo item, String matchingVersion) {
    VersionRange versionRange = new VersionRange(item.getMinVersionBound(), item.getMaxVersionBound());
    return String.format(MATCHING_PMV_TEXT_FORMAT, item.getId(), versionRange.toString(), matchingVersion);
  }

  /**
   * create html table row with format
   * <tr>
   * <td>Lib id</td>
   * <td>[minVersion..maxVersion]</td>
   * <td>->?</td>
   * </tr>
   * 
   * @param color
   * @param item
   * @param matchingVersion
   * @return
   */
  private static String createHTML(String color, RequireLibraryInfo item, String matchingVersion) {
    StringBuilder returnString = new StringBuilder();
    returnString.append("<tr style='color:" + color + "'><td>");
    returnString.append(item.getId() + TD_END);

    VersionRange versionRange = new VersionRange(item.getMinVersionBound(), item.getMaxVersionBound());

    returnString.append(TD_BEGIN);
    returnString.append(versionRange.toString());
    returnString.append(TD_END);
    returnString.append(TD_BEGIN);
    returnString.append(GlobalVariable.ARROW);
    returnString.append(TD_END);
    returnString.append(TD_BEGIN);
    returnString.append(matchingVersion);
    returnString.append(TD_END);

    returnString.append("</tr>");

    return returnString.toString();
  }

  /**
   * create html table row with format
   * <tr>
   * <td>libId</td>
   * <td>[minVersion..maxVersion]</td>
   * <td>->yourProjectXY</td>
   * <td>:</td>
   * <td>yourLibraryId</td>
   * <td>v4</td>
   * </tr>
   * 
   * @param color
   * @param item
   * @param projectName
   * @param libraryId
   * @param projectVersion
   * @return
   */
  private static String createHTML(String color, RequireLibraryInfo item, String projectName, String libraryId,
      String projectVersion) {
    StringBuilder returnString = new StringBuilder();
    returnString.append("<tr style='color:" + color + "'><td>");
    returnString.append(item.getId() + TD_END);

    VersionRange versionRange = new VersionRange(item.getMinVersionBound(), item.getMaxVersionBound());

    returnString.append(TD_BEGIN);
    returnString.append(versionRange.toString());
    returnString.append(TD_END);
    returnString.append(TD_BEGIN);
    returnString.append(GlobalVariable.ARROW);
    returnString.append(TD_END);
    returnString.append(TD_BEGIN);
    returnString.append(projectName);
    returnString.append(TD_END);
    returnString.append(TD_BEGIN);
    returnString.append("(" + libraryId + ":" + projectVersion + ")");
    returnString.append(TD_END);

    returnString.append("</tr>");

    return returnString.toString();
  }

  /**
   * For an application, find pmv that has libId and version as parameter
   * 
   * @param app
   * @param libId
   * @param qualifiedLibVersion
   * @return matching pmv, if not found, return null
   */
  public static IProcessModelVersion findLibrary(IApplication app, String libId, QualifiedVersion qualifiedLibVersion) {
    if (app.getProcessModels() != null) {
      for (IProcessModel pm : app.getProcessModels()) {
        for (IProcessModelVersion pmv : pm.getProcessModelVersions()) {
          if (isPMVStillExisting(pmv) && isDeployedProjectExistedInPMV(libId, qualifiedLibVersion, pmv)) {
            return pmv;
          }
        }
      }
    }
    return null;
  }

  private static boolean isDeployedProjectExistedInPMV(String libId, QualifiedVersion qualifiedLibVersion,
      IProcessModelVersion pmv) {
    return pmv.getLibrary() != null && pmv.getLibrary().getId().equals(libId)
        && pmv.getLibrary().getQualifiedVersion().equals(qualifiedLibVersion);
  }

  private static boolean isPMVStillExisting(IProcessModelVersion pmv) {
    return pmv != null && !pmv.getReleaseState().name().equals(ReleaseState.DELETED.name());
  }

  /**
   * For an application, find pmv that has same libId and biggest version
   * 
   * @param app
   * @param libId
   * @return
   */
  public static IProcessModelVersion findLibraryWithMatchId(IApplication app, String libId) {
    IProcessModelVersion returnPmv = null;
    if (app.getProcessModels() != null) {
      QualifiedVersion maxLibVersion = new QualifiedVersion("0.0.0-SNAPSHOT");
      for (IProcessModel pm : app.getProcessModels()) {
        for (IProcessModelVersion pmv : pm.getProcessModelVersions()) {
          if (pmv != null && pmv.getLibrary() != null) {
            if (pmv.getLibrary().getId().equals(libId)
                && pmv.getLibrary().getQualifiedVersion().compareTo(maxLibVersion) > 0 // NOSONAR
                && !pmv.getReleaseState().name().equals(ReleaseState.DELETED.name())) {
              maxLibVersion = pmv.getLibrary().getQualifiedVersion();
              returnPmv = pmv;
            }
          }
        }
      }
    }
    return returnPmv;
  }

  /**
   * with application and process model, find new pmv number By default, new pmv
   * number is project version if this pmv has same number as project version is
   * available, get it Otherwise, get the next available number where a new pmv
   * can be created
   * 
   * @param app
   * @param processModelName
   * @return
   */
  public static int findNewPmvNumber(IApplication app, String processModelName) {
    IProcessModel pm = app.findProcessModel(processModelName);
    if (pm == null) {
      return 1;
    } else {
      // create new PMV where its version > project version (take the 1st
      // available number, which
      // can create a new PMV)
      int nextPMV = 1;
      while (app.findProcessModelVersion(processModelName + GlobalVariable.PMV_NAME_DELIMITER + nextPMV) != null) {
        nextPMV++;
      }
      return nextPMV;
    }
  }

  /**
   * If no PMV is exists within a PM, then Activate=true if at least one PMV
   * exists, but IProcMod.getReleasedPmv() delivers null, then Activate=false if
   * at least one PMV exists, and IProcMod.getReleasedPmv() delivers a PMV, then
   * copy the Activate state of that PMV.
   * 
   * @param app
   * @param processModel
   * @return
   */
  public static ActivityState getDefaultActivityState(IApplication app, String processModel) {
    ActivityState defaultActivity = ActivityState.ACTIVE;
    IProcessModel pm = app.findProcessModel(processModel);
    if (pm != null) {
      if (pm.getProcessModelVersions() != null && pm.getProcessModelVersions().size() > 0
          && pm.getReleasedProcessModelVersion() == null) {
        defaultActivity = ActivityState.INACTIVE;
      } else {
        defaultActivity = pm.getReleasedProcessModelVersion().getActivityState();
      }
    }

    return defaultActivity;
  }

  /**
   * If no PMV is exists within a PM, then Release=true if at least one PMV
   * exists, but IProcMod.getReleasedPmv() delivers null, then Release=false if
   * at least one PMV exists, and IProcMod.getReleasedPmv() delivers a PMV, then
   * copy the Release state of that PMV.
   * 
   * @param app
   * @param processModel
   * @return
   */
  public static ReleaseState getDefaultReleaseState(IApplication app, String processModel) {
    ReleaseState defaultRelease = ReleaseState.RELEASED;
    IProcessModel pm = app.findProcessModel(processModel);
    if (pm != null && pm.getProcessModelVersions() != null && pm.getProcessModelVersions().size() > 0) {
      if (pm.getReleasedProcessModelVersion() == null) {
        defaultRelease = ReleaseState.PREPARED;
      } else {
        defaultRelease = pm.getReleasedProcessModelVersion().getReleaseState();
      }
    }

    return defaultRelease;
  }
}
