package ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase;

import ch.ivyteam.ivy.admin.tool.database.DatabaseDetails.DatabaseDetailsPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;

import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for EnvironmentDatabasePanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class EnvironmentDatabasePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scpDatabases = null;
  private RList lstDatabases = null;
  @EmbeddedRichDialog(DatabaseDetailsPanel.class)
  private ULCContainer databaseDetailsPanel = null;
  private RPopupMenu popDatabase = null; // @jve:decl-index=0:visual-constraint="59,444"
  private RMenuItem mnuResetToDefault = null;

  // SONAR-OFF
  /**
   * Create a new instance of EnvironmentDatabasePanel
   */
  public EnvironmentDatabasePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes EnvironmentDatabasePanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(732, 410));
    this.add(getScpDatabases(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDatabaseDetailsPanel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getScpDatabases(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes scpDatabases
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScpDatabases() {
    if (scpDatabases == null) {
      scpDatabases = new RScrollPane();
      scpDatabases.setName("scpDatabases");
      scpDatabases.setStyleProperties("{/weightX \"1\"}");
      scpDatabases.setStyle("verticalScroll");
      scpDatabases.setViewPortView(getLstDatabases());
    }
    return scpDatabases;
  }

  /**
   * This method initializes lstDatabases
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RList
   */
  private RList getLstDatabases() {
    if (lstDatabases == null) {
      lstDatabases = new RList();
      lstDatabases.setName("lstDatabases");
      lstDatabases.setComponentPopupMenu(getPopDatabase());
      lstDatabases
          .setModelConfiguration("{/result \"result=entry.getUserFriendlyName()\"/version \"3.0\"/icon \"result=entry.getDefaultConfiguration() != null? \\\"/images/klein/environment/databaseEnvironment\\\":\\\"/images/klein/database\\\"\"/tooltip \"\"}");
    }
    return lstDatabases;
  }

  /**
   * This method initializes databaseDetailsPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.database.DatabaseDetails.DatabaseDetailsPanel
   */
  private ULCContainer getDatabaseDetailsPanel() {
    if (databaseDetailsPanel == null) {
      databaseDetailsPanel = RichDialogPanelFactory.create(DatabaseDetailsPanel.class);
      databaseDetailsPanel.setName("databaseDetailsPanel");
      databaseDetailsPanel.setStyleProperties("{/weightX \"5\"}");
    }
    return databaseDetailsPanel;
  }

  /**
   * This method initializes popDatabase
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getPopDatabase() {
    if (popDatabase == null) {
      popDatabase = new RPopupMenu();
      popDatabase.setName("popDatabase");
      popDatabase.add(getMnuResetToDefault());
    }
    return popDatabase;
  }

  /**
   * This method initializes mnuResetToDefault
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getMnuResetToDefault() {
    if (mnuResetToDefault == null) {
      mnuResetToDefault = new RMenuItem();
      mnuResetToDefault.setText("Reset to Default");
      mnuResetToDefault.setName("mnuResetToDefault");
    }
    return mnuResetToDefault;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
