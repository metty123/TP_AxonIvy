package ch.ivyteam.ivy.admin.tool;

/**
 * Enumeration for available session handling modes
 * 
 * @author mde
 * @since 02.09.2009
 * 
 */
public enum SessionHandlingMode {

  NO_SESSION_HANDLING(0, "No Session Handling"), USE_SESSION_HANDLING_WSELEMENT(1, "WS Element"), USE_SESSION_HANDLING_APPLICATION(
      2, "Application");

  private int id;
  private String name;

  SessionHandlingMode(int paramId, String paramName) {
    id = paramId;
    name = paramName;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public static SessionHandlingMode getModeById(int id) {
    if (id == 1) {
      return USE_SESSION_HANDLING_WSELEMENT;
    } else if (id == 2) {
      return USE_SESSION_HANDLING_APPLICATION;
    } else {
      return NO_SESSION_HANDLING;
    }
  }
}
