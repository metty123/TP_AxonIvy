package ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration;

import ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterPanel;
import ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for ServerConfigurationUIPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DatabaseConfigurationPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel databaseLabel = null;
  private RComboBox databaseComboBox = null;
  private RLabel driverLabel = null;
  private RComboBox driverComboBox = null;
  private RTable additionalPropertiesTable = null;
  private RButton addConnectionPropertyButton = null;
  private RButton removeConnectionPropertyButton = null;
  private RScrollPane additionalConnectionScrollPane = null;
  @EmbeddedRichDialog(DatabaseConnectionParameterPanel.class)
  private ULCContainer connectionPanel = null;
  private RGridBagLayoutPane connectionStatePane = null;
  private RGridBagLayoutPane additionalGridBagLayoutPane = null;
  private RGridBagLayoutPane dbAndDriverPanel = null;
  private RButton editConnectionPropertyButton = null;
  @EmbeddedRichDialog(DatabaseConnectionTesterPanel.class)
  private ULCContainer connectionTesterPanel = null;
  private RButton testDbButton = null;

  /**
   * Create a new instance of ServerConfigurationUIPanel
   */
  public DatabaseConfigurationPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes ServerConfigurationUIPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(675, 640));
    this.add(getConnectionPanel(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getConnectionStatePane(), new com.ulcjava.base.application.GridBagConstraints(1, 11, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getAdditionalGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(1, 7, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDbAndDriverPanel(), new com.ulcjava.base.application.GridBagConstraints(2, 4, 4, 1, 1.0, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes databaseLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDatabaseLabel() {
    if (databaseLabel == null) {
      databaseLabel = new RLabel();
      databaseLabel.setText("<%=ivy.cms.co(\"/labels/database\")%>");
      databaseLabel.setName("databaseLabel");
    }
    return databaseLabel;
  }

  /**
   * This method initializes databaseComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getDatabaseComboBox() {
    if (databaseComboBox == null) {
      databaseComboBox = new RComboBox();
      databaseComboBox.setName("databaseComboBox");
      databaseComboBox.setStyleProperties("{/weightX \"1\"}");
      databaseComboBox.setBackground(Color.white);
      databaseComboBox
          .setModelConfiguration("{/result \"result=entry.getName()\"/version \"2.0\"/icon \"result=\\\"/Icons/DatabaseProduct/16\\\"\"/tooltip \"result=entry.getShortName()+\\\" (\\\"+entry.getName()+\\\")\\\"\"}");
    }
    return databaseComboBox;
  }

  /**
   * This method initializes driverLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDriverLabel() {
    if (driverLabel == null) {
      driverLabel = new RLabel();
      driverLabel.setText("<%=ivy.cms.co(\"/labels/driver\")%>");
      driverLabel.setName("driverLabel");
    }
    return driverLabel;
  }

  /**
   * This method initializes driverComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getDriverComboBox() {
    if (driverComboBox == null) {
      driverComboBox = new RComboBox();
      driverComboBox.setName("driverComboBox");
      driverComboBox.setStyleProperties("{/weightX \"1\"}");
      driverComboBox
          .setModelConfiguration("{/result \"result=entry.getName() + IF(!entry.getSubProtocol().isEmpty(), \\\" [\\\"+ entry.getSubProtocol()+\\\"]\\\", \\\"\\\")\"/version \"3.0\"/icon \"result=\\\"/Icons/DatabaseDriver/16\\\"\"/tooltip \"result=entry.getDriverName()\"}");
    }
    return driverComboBox;
  }

  /**
   * This method initializes additionalPropertiesTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getAdditionalPropertiesTable() {
    if (additionalPropertiesTable == null) {
      additionalPropertiesTable = new RTable();
      additionalPropertiesTable.setName("additionalPropertiesTable");
      additionalPropertiesTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"2.0\"/columns {{/result \"result=value\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Name\"/field \"name\"/columnWidth \"35\"}{/result \"result=value\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Value\"/field \"value\"}}}");
      additionalPropertiesTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
      // additionalPropertiesTable.setSortable(true);
      additionalPropertiesTable.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    }
    return additionalPropertiesTable;
  }

  /**
   * This method initializes addConnectionPropertyButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddConnectionPropertyButton() {
    if (addConnectionPropertyButton == null) {
      addConnectionPropertyButton = new RButton();
      addConnectionPropertyButton.setName("addConnectionPropertyButton");
      addConnectionPropertyButton.setIconUri("<%=ivy.cms.cr(\"/Icons/AddRow/16\")%>");
    }
    return addConnectionPropertyButton;
  }

  /**
   * This method initializes removeConnectionPropertyButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRemoveConnectionPropertyButton() {
    if (removeConnectionPropertyButton == null) {
      removeConnectionPropertyButton = new RButton();
      removeConnectionPropertyButton.setIconUri("<%=ivy.cms.cr(\"/Icons/DeleteRow/16\")%>");
      removeConnectionPropertyButton.setStyleProperties("{/anchor \"NORTH\"}");
      removeConnectionPropertyButton.setName("removeConnectionPropertyButton");
    }
    return removeConnectionPropertyButton;
  }

  /**
   * This method initializes additionalConnectionScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getAdditionalConnectionScrollPane() {
    if (additionalConnectionScrollPane == null) {
      additionalConnectionScrollPane = new RScrollPane();
      additionalConnectionScrollPane.setName("additionalConnectionScrollPane");
      additionalConnectionScrollPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      additionalConnectionScrollPane.setViewPortView(getAdditionalPropertiesTable());
    }
    return additionalConnectionScrollPane;
  }

  /**
   * This method initializes connectionPanel
   * 
   * @return 
   *         ch.ivyteam.ivy.server.configuration.DatabaseConnectionConfigurationUI.DatabaseConnectionConfigurationUIPanel
   */
  private ULCContainer getConnectionPanel() {
    if (connectionPanel == null) {
      connectionPanel = RichDialogPanelFactory.create(DatabaseConnectionParameterPanel.class);
      connectionPanel.setName("connectionPanel");
      connectionPanel.setBorder(BorderFactory.createTitledBorder("Connection"));
      connectionPanel.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"}");
    }
    return connectionPanel;
  }

  /**
   * This method initializes connectionStatePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getConnectionStatePane() {
    if (connectionStatePane == null) {
      connectionStatePane = new RGridBagLayoutPane();
      connectionStatePane.setName("connectionStatePane");
      connectionStatePane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      connectionStatePane.setBorder(BorderFactory.createTitledBorder("Connection State"));
      connectionStatePane.add(getConnectionTesterPanel(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1,
          6, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      connectionStatePane.add(getTestDbButton(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return connectionStatePane;
  }

  /**
   * This method initializes additionalGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getAdditionalGridBagLayoutPane() {
    if (additionalGridBagLayoutPane == null) {
      additionalGridBagLayoutPane = new RGridBagLayoutPane();
      additionalGridBagLayoutPane.setName("additionalGridBagLayoutPane");
      additionalGridBagLayoutPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      additionalGridBagLayoutPane.setBorder(BorderFactory.createTitledBorder("Additional Properties"));
      additionalGridBagLayoutPane.add(getAdditionalConnectionScrollPane(),
          new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 3, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      additionalGridBagLayoutPane.add(getAddConnectionPropertyButton(),
          new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      additionalGridBagLayoutPane.add(getRemoveConnectionPropertyButton(),
          new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      additionalGridBagLayoutPane.add(getEditConnectionPropertyButton(),
          new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
    }
    return additionalGridBagLayoutPane;
  }

  /**
   * This method initializes dbAndDriverPanel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getDbAndDriverPanel() {
    if (dbAndDriverPanel == null) {
      dbAndDriverPanel = new RGridBagLayoutPane();
      dbAndDriverPanel.setName("dbAndDriverPanel");
      dbAndDriverPanel.setBorder(BorderFactory.createTitledBorder(null, "Database",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(12, 74, 124)));
      dbAndDriverPanel.setStyleProperties("{/fill \"BOTH\"/weightX \"1\"}");
      dbAndDriverPanel.add(getDatabaseLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      dbAndDriverPanel.add(getDatabaseComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      dbAndDriverPanel.add(getDriverLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      dbAndDriverPanel.add(getDriverComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return dbAndDriverPanel;
  }

  /**
   * This method initializes editConnectionPropertyButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getEditConnectionPropertyButton() {
    if (editConnectionPropertyButton == null) {
      editConnectionPropertyButton = new RButton();
      editConnectionPropertyButton.setName("editConnectionPropertyButton");
      editConnectionPropertyButton.setIconUri("<%=ivy.cms.cr(\"/Icons/RowEdit/16\")%>");
    }
    return editConnectionPropertyButton;
  }

  /**
   * This method initializes connectionTesterPanel
   * 
   * @return ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterPanel
   */
  private ULCContainer getConnectionTesterPanel() {
    if (connectionTesterPanel == null) {
      connectionTesterPanel = RichDialogPanelFactory.create(DatabaseConnectionTesterPanel.class);
      connectionTesterPanel.setName("connectionTesterPanel");
      connectionTesterPanel.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"0.98\"}");
    }
    return connectionTesterPanel;
  }

  /**
   * This method initializes testDbButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getTestDbButton() {
    if (testDbButton == null) {
      testDbButton = new RButton();
      testDbButton.setName("testDbButton");
      testDbButton.setIconUri("<%=ivy.cms.cr(\"/Icons/ConnectionStates/Unknown/32\")%>");
      testDbButton
          .setStyleProperties("{/anchor \"NORTH\"/insetsTop \"0\"/fill \"HORIZONTAL\"/insetsLeft \"0\"/weightX \"0.02\"}");
      testDbButton.setToolTipText("Test connection");
    }
    return testDbButton;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
