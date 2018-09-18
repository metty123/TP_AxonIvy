package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import ch.ivyteam.ivy.application.ILibrarySpecification;
import ch.ivyteam.ivy.application.value.VersionBound;
import ch.ivyteam.ivy.application.value.VersionRange;

/**
 * Builder is to generate String literal of RequiredLibrary information to
 * display on UI
 */
public final class RequiredLibraryLiteralBuilder {

  private RequiredLibraryLiteralBuilder() {
  }

  public static String getVersionRangeLiteral(ILibrarySpecification libSpecification) {
    VersionBound minVersionBound = VersionBounds.newVersionBoundOf(libSpecification.getMinimumVersion());
    VersionBound maxVersionBound = VersionBounds.newVersionBoundOf(libSpecification.getMaximumVersion());
    VersionRange range = new VersionRange(minVersionBound, maxVersionBound);
    return range.toString();
  }

}
