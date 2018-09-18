package ch.ivyteam.ivy.admin.tool.domain.util;

public final class SaieConstant {

  private SaieConstant() {}

  /** The URL of the schema in export files. */
  public static final String SCHEMA_URL = "http://www.ivyteam.ch/xsd/environments/Environments-v1.xsd";
  /** The PATH of the schema for validating the xml data when unmarshalling. */
  public static final String ENVIRONMENTS_XSD = "/resources/Environments-v1.xsd";
  /** The version of the schema in export files. */
  public static final Integer SCHEMA_VERSION = 1;
}
