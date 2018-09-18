package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common;

import java.io.File;

public final class GlobalVariable {
  /**
   * Hide Utility Class Constructor
   */
  private GlobalVariable() {
    super();
  }

  public static final String APP_OPEN_STATUS = "OPENING";
  public static final String PROJECT_EXTRACTION_PATH = System.getProperty("java.io.tmpdir") + File.separator
      + "ivyZipExtractTemp" + File.separator;
  public static final String PMV_NAME_DELIMITER = "$";
  public static final String LIB_DELIMITER = "#";
  public static final boolean ENABLE_CLEAN_TEMPORARY_FILE_S_FUNCTION = true;
  public static final String ARROW = "->";
  public static final String COMMA = ",";
  public static final String RANGE = "..";
  public static final String PLUS = "+";
  public static final String SEMICOLON = ";";
}
