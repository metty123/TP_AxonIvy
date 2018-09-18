package ch.ivyteam.ivy.admin.tool.database.DatabaseList;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar;

import com.ulcjava.base.application.util.Dimension;

/**
 * RichDialog panel implementation for DatabaseListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DatabaseListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane gridBagLayoutPane = null;
  private RList databaseList = null;
  private RToolBar dbToolBar = null;
  private RButton refreshButton = null;
  private RButton addButton = null;
  private RButton removeButton = null;
  private RButton openDbButton = null;
  private RScrollPane databaseScrollPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of DatabaseListPanel
   */
  public DatabaseListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DatabaseListPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDbToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    setPreferredSize(new Dimension(100, 180));
  }

  /**
   * This method initializes GridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getGridBagLayoutPane() {
    if (gridBagLayoutPane == null) {
      gridBagLayoutPane = new RGridBagLayoutPane();
      gridBagLayoutPane.setName("gridBagLayoutPane");
      gridBagLayoutPane.add(getDatabaseScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return gridBagLayoutPane;
  }

  /**
   * This method initializes databaseList
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RList
   */
  private RList getDatabaseList() {
    if (databaseList == null) {
      databaseList = new RList();
      databaseList.setName("databaseList");
      databaseList.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      databaseList
          .setModelConfiguration("{/result \"result=entry.getConfiguration().getUserFriendlyName()\"/version \"3.0\"/icon \"result=\\\"/images/klein/database\\\"\"/tooltip \"\"}");
    }
    return databaseList;
  }

  /**
   * This method initializes dbToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getDbToolBar() {
    if (dbToolBar == null) {
      dbToolBar = new RToolBar();
      dbToolBar.setName("dbToolBar");
      dbToolBar.setFloatable(false);
      dbToolBar.add(getOpenDbButton());
      dbToolBar.add(getAddButton());
      dbToolBar.add(getRemoveButton());
      dbToolBar.add(getRefreshButton());
    }
    return dbToolBar;
  }

  /**
   * This method initializes refreshButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRefreshButton() {
    if (refreshButton == null) {
      refreshButton = new RButton();
      refreshButton.setName("refreshButton");
      refreshButton.setIconUri("<%=ivy.cms.cr(\"/Icons/Refresh/16\")%>");
    }
    return refreshButton;
  }

  /**
   * This method initializes addButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddButton() {
    if (addButton == null) {
      addButton = new RButton();
      addButton.setName("addButton");
      addButton.setText("");
      addButton.setIconUri("<%=ivy.cms.cr(\"/Icons/DatabaseAdd/16\")%>");
    }
    return addButton;
  }

  /**
   * This method initializes removeButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRemoveButton() {
    if (removeButton == null) {
      removeButton = new RButton();
      removeButton.setName("removeButton");
      removeButton.setIconUri("<%=ivy.cms.cr(\"/Icons/DatabaseDelete/16\")%>");
    }
    return removeButton;
  }

  /**
   * This method initializes openDbButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOpenDbButton() {
    if (openDbButton == null) {
      openDbButton = new RButton();
      openDbButton.setName("openDbButton");
      openDbButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/showDetail\")%>");
    }
    return openDbButton;
  }

  /**
   * This method initializes databaseScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDatabaseScrollPane() {
    if (databaseScrollPane == null) {
      databaseScrollPane = new RScrollPane();
      databaseScrollPane.setName("databaseScrollPane");
      databaseScrollPane.setViewPortView(getDatabaseList());
    }
    return databaseScrollPane;
  }
}
