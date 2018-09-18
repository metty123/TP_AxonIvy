package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import org.apache.commons.lang3.StringUtils;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.GlobalVariable;

/**
 * Factory instantiates appropriate VersionRangeReader
 */
public final class VersionRangeReaderFactory {

  private VersionRangeReaderFactory() {
  }

  public static VersionRangeReader specifyVersionRangeReader(String requiredVersionLiteral) {
    if (isOldVersionRangeFormat(requiredVersionLiteral)) {
      return new LibraryConfigVersionRangeReader(requiredVersionLiteral);
    } else {
      return new MavenVersionRangeReader(requiredVersionLiteral);
    }
  }

  /**
   * Checking given range is old version range format(<6.0), the old style contains {@link GlobalVariable}.Range
   * 
   * @param range
   * @return true if given range contains {@link GlobalVariable}.Range
   */
  private static boolean isOldVersionRangeFormat(String range) {
    if (StringUtils.isEmpty(range)) {
      return false;
    }
    return range.contains(GlobalVariable.RANGE);
  }

}
