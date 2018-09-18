package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import org.apache.commons.lang3.StringUtils;

import ch.ivyteam.ivy.application.value.QualifiedVersion;

public final class QualifiedVersions {

  private QualifiedVersions() {
  }

  public static final QualifiedVersion DEFAULT_QUALIFIED_VERSION = new QualifiedVersion("1.0.0-SNAPSHOT");

  public static QualifiedVersion valueOf(String version) {
    if (StringUtils.isEmpty(version)) {
      return null;
    }
    if (isInteger(version)) {
      return QualifiedVersion.fromLegacyMajor(Integer.parseInt(version));
    }
    return new QualifiedVersion(version);
  }

  private static boolean isInteger(String text) {
    try {
      Integer.valueOf(text);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

}
