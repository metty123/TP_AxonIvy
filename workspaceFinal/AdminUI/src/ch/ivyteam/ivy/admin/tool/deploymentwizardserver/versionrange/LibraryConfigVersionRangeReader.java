package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import ch.ivyteam.ivy.application.value.VersionBound;

/**
 * Reader reads version range returned from old format IvyProject(<6.0) get from
 * library.libraryconfig file
 */
public class LibraryConfigVersionRangeReader extends VersionRangeReader {

  public static final String RANGE_REGEX = "\\.\\.";

  private String minVersion = "";
  private String maxVersion = "";
  private VersionBound minVersionBound;
  private VersionBound maxVersionBound;

  /**
   * Given String for constructor: e.g projectId#1..2, projectId#5..10
   * 
   * @param rangeVersionLiteral
   */
  LibraryConfigVersionRangeReader(String rangeVersionLiteral) {
    super(rangeVersionLiteral);
    parseVersionRange(rangeVersionLiteral);
  }

  private void parseVersionRange(String rangeVersionLiteral) {
    if (isEmpty(rangeVersionLiteral)) {
      return;
    }
    String[] minAndMaxVersion = getRangeVersionLiteral().split(RANGE_REGEX);
    if (minAndMaxVersion.length > 0) {
      minVersion = minAndMaxVersion[0];
    }
    if (minAndMaxVersion.length == 2) {
      maxVersion = minAndMaxVersion[1];
    }
  }

  @Override
  public VersionBound getMinVersionBound() {
    if (minVersionBound == null) {
      minVersionBound = VersionBounds.newInclusiveVersionBound(minVersion);
    }
    return minVersionBound;
  }

  @Override
  public VersionBound getMaxVersionBound() {
    if (maxVersionBound == null) {
      maxVersionBound = VersionBounds.newInclusiveVersionBound(maxVersion);
    }
    return maxVersionBound;
  }

}
