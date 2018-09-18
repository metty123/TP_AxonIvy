package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import static org.apache.commons.lang3.StringUtils.isEmpty;
import ch.ivyteam.ivy.application.value.VersionBound;

/**
 * Reader reads version range returned from new IvyProject(>=6.0) get from
 * pom.xml file, Maven version supported
 */
public class MavenVersionRangeReader extends VersionRangeReader {

  private boolean isVersionRangeSpecify;

  private VersionBound minVersionBound;
  private VersionBound maxVersionBound;

  /**
   * Given String for constructor projectId#{mavenVersionFormat} : e.g
   * com.example:project#[1.0.0,2.0.0]
   * 
   * @param rangeVersionLiteral
   */
  MavenVersionRangeReader(String rangeVersionLiteral) {
    super(rangeVersionLiteral);
    isVersionRangeSpecify = isVersionRangeSpecified();
  }

  private boolean isVersionRangeSpecified() {
    if (isEmpty(getRangeVersionLiteral())) {
      return false;
    }
    return (getRangeVersionLiteral().startsWith("[") || getRangeVersionLiteral().startsWith("("))
        && (getRangeVersionLiteral().endsWith("]") || getRangeVersionLiteral().endsWith(")"));
  }

  @Override
  public VersionBound getMinVersionBound() {
    if (minVersionBound == null) {
      minVersionBound = parseMinVersionBound();
    }
    return minVersionBound;
  }

  private VersionBound parseMinVersionBound() {
    if (!isVersionRangeSpecify) {
      return VersionBounds.newInclusiveVersionBound(getRangeVersionLiteral());
    }
    int commaIndex = getRangeVersionLiteral().indexOf(",");
    boolean isMinumumInclusive = getRangeVersionLiteral().startsWith("[");
    String minimumVersion = getRangeVersionLiteral().substring(1, commaIndex).trim();
    return VersionBounds.newVersionBoundInstance(minimumVersion, isMinumumInclusive);
  }

  @Override
  public VersionBound getMaxVersionBound() {
    if (maxVersionBound == null) {
      maxVersionBound = parseMaxVersionBound();
    }
    return maxVersionBound;

  }

  private VersionBound parseMaxVersionBound() {
    if (!isVersionRangeSpecify) {
      return VersionBounds.newInclusiveVersionBound(getRangeVersionLiteral());
    }
    int commaIndex = getRangeVersionLiteral().indexOf(",");
    boolean isMaximumInclusive = getRangeVersionLiteral().endsWith("]");
    String maximumVersion = getRangeVersionLiteral().substring(commaIndex + 1, getRangeVersionLiteral().length() - 1)
        .trim();
    return VersionBounds.newVersionBoundInstance(maximumVersion, isMaximumInclusive);
  }

}
