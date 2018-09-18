package ch.ivyteam.ivy.admin.tool.report;

public enum ActionType {
  EXPORT("Export"), IMPORT("Import");
  private String name;

  private ActionType(String pName) {
    this.name = pName;
  }

  @Override
  public String toString() {
    return name;
  }

}
