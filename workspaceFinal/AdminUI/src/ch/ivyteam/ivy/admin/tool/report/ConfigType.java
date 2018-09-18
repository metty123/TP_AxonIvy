package ch.ivyteam.ivy.admin.tool.report;

public enum ConfigType {
  WEB_SERVICE("Web service"), DATABASE_CONFIG("Database Configuration"), GLOBAL_VARIABLE("Global variable"), BUSINESS_CALENDAR(
      "Business calendar"), CREATE_ENVIRONMENT("Create environment");
  private String name;

  private ConfigType(String pName) {
    this.name = pName;
  }

  @Override
  public String toString() {
    return this.name;
  }

}
