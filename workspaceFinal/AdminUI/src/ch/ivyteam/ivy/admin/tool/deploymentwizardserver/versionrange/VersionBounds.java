package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import static ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions.DEFAULT_QUALIFIED_VERSION;
import static org.apache.commons.lang3.StringUtils.isEmpty;
import ch.ivyteam.ivy.application.ILibraryVersionSpecification;
import ch.ivyteam.ivy.application.value.QualifiedVersion;
import ch.ivyteam.ivy.application.value.VersionBound;

public final class VersionBounds {

  private VersionBounds() {
  }

  public static final VersionBound DEFAULT_VERSION_BOUND = new VersionBound(DEFAULT_QUALIFIED_VERSION, true);

  public static boolean isUnspecified(VersionBound versionBound) {
    return VersionBound.UNSPECIFIED.equals(versionBound);
  }

  public static boolean isSpecified(VersionBound versionBound) {
    return !isUnspecified(versionBound);
  }

  public static VersionBound newInclusiveVersionBound(QualifiedVersion qualifiedVersion) {
    if (qualifiedVersion == null) {
      return VersionBound.UNSPECIFIED;
    }
    return new VersionBound(qualifiedVersion, true);
  }

  public static VersionBound newInclusiveVersionBound(String versionLiteral) {
    return newVersionBoundInstance(versionLiteral, true);
  }

  public static VersionBound newVersionBoundInstance(String versionLiteral, boolean isInclusive) {
    if (isEmpty(versionLiteral)) {
      return VersionBound.UNSPECIFIED;
    }
    return new VersionBound(QualifiedVersions.valueOf(versionLiteral), isInclusive);
  }

  public static VersionBound newVersionBoundOf(ILibraryVersionSpecification versionSpecification) {
    if (versionSpecification == null) {
      return VersionBound.UNSPECIFIED;
    }
    return new VersionBound(versionSpecification.getQualifiedVersion(), versionSpecification.isInclusive());
  }

}
