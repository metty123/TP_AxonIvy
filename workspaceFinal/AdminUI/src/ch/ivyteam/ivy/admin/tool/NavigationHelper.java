package ch.ivyteam.ivy.admin.tool;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.db.IExternalDatabaseApplicationContext;

public final class NavigationHelper {
  /**
   * Hide Utility Class Constructor
   */
  private NavigationHelper() {
    super();
  }

  public static IExternalDatabaseApplicationContext getExternalDatabaseManager(IApplication application) {
    return (IExternalDatabaseApplicationContext) application.getAdapter(IExternalDatabaseApplicationContext.class);
  }
}
