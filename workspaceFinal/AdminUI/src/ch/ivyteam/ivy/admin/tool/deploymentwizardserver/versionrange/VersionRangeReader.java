package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange;

import ch.ivyteam.ivy.application.value.VersionBound;

/**
 * Skeletal class is to define function of VersionRange Reader
 */
public abstract class VersionRangeReader {

  private final String rangeVersonLiteral;

  /**
   * Default constructor for subclass
   * 
   * @param rangeVersionLiteral
   */
  VersionRangeReader(String rangeVersionLiteral) {
    this.rangeVersonLiteral = rangeVersionLiteral;
  }

  String getRangeVersionLiteral() {
    return rangeVersonLiteral;
  }

  public abstract VersionBound getMinVersionBound();

  public abstract VersionBound getMaxVersionBound();
}
