package ch.ivyteam.ivy.admin.tool.database.DatabaseDetails;

import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.ULCTable;

/**
 * RichDialog panel implementation for DatabasePanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DatabaseDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  private static final String R_TEXT_FIELD = "RTextField";
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane titlePane = null;
  private RGridBagLayoutPane infoPane = null;
  private RLabel nameLabel = null;
  private RLabel driverLabel = null;
  private RLabel urlLabel = null;
  private RLabel connectionsLabel = null;
  private RTextField nameTextField = null;
  private RTextField driverTextField = null;
  private RTextField urlTextField = null;
  private RTextField connectionsTextField = null;
  private RGridBagLayoutPane connectionsPane = null;
  private RScrollPane connectionsScrollPane = null;
  private RTable connectionsTable = null;
  private RGridBagLayoutPane statementsPane = null;
  private RTable statementsTable = null;
  private RScrollPane statementsScrollPane = null;
  private RButton configureButton = null;
  private RButton saveButton = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer headerPane = null;
  private RFlowLayoutPane pnlButtonBar = null;
  private RButton btnReset = null;

  // SONAR-OFF
  /**
   * Create a new instance of DatabasePanel
   */
  public DatabaseDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DatabasePanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(449, 387));
    this.add(getTitlePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getInfoPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getConnectionsPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getStatementsPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes titlePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTitlePane() {
    if (titlePane == null) {
      titlePane = new RGridBagLayoutPane();
      titlePane.setName("titlePane");
      titlePane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      titlePane.add(getHeaderPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return titlePane;
  }

  /**
   * This method initializes infoPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getInfoPane() {
    if (infoPane == null) {
      infoPane = new RGridBagLayoutPane();
      infoPane.setName("infoPane");
      infoPane.setStyleProperties("{/fill \"HORIZONTAL\"/insetsRight \"5\"/weightY \"0\"/insetsLeft \"5\"}");
      infoPane.setBorder(BorderFactory.createTitledBorder("Database"));
      infoPane.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getDriverLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getUrlLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getConnectionsLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getDriverTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getUrlTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getConnectionsTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getPnlButtonBar(), new com.ulcjava.base.application.GridBagConstraints(1, 7, 3, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return infoPane;
  }

  /**
   * This method initializes nameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getNameLabel() {
    if (nameLabel == null) {
      nameLabel = new RLabel();
      nameLabel.setText("Name");
      nameLabel.setName("nameLabel");
    }
    return nameLabel;
  }

  /**
   * This method initializes driverLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDriverLabel() {
    if (driverLabel == null) {
      driverLabel = new RLabel();
      driverLabel.setText("Driver");
      driverLabel.setName("driverLabel");
    }
    return driverLabel;
  }

  /**
   * This method initializes urlLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUrlLabel() {
    if (urlLabel == null) {
      urlLabel = new RLabel();
      urlLabel.setText("Connection Url");
      urlLabel.setName("urlLabel");
    }
    return urlLabel;
  }

  /**
   * This method initializes connectionsLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getConnectionsLabel() {
    if (connectionsLabel == null) {
      connectionsLabel = new RLabel();
      connectionsLabel.setText("Max. Connections");
      connectionsLabel.setName("connectionsLabel");
    }
    return connectionsLabel;
  }

  /**
   * This method initializes nameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNameTextField() {
    if (nameTextField == null) {
      nameTextField = new RTextField();
      nameTextField.setText(R_TEXT_FIELD);
      nameTextField.setEditable(false);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes driverTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDriverTextField() {
    if (driverTextField == null) {
      driverTextField = new RTextField();
      driverTextField.setText(R_TEXT_FIELD);
      driverTextField.setEditable(false);
      driverTextField.setName("driverTextField");
    }
    return driverTextField;
  }

  /**
   * This method initializes urlTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getUrlTextField() {
    if (urlTextField == null) {
      urlTextField = new RTextField();
      urlTextField.setText(R_TEXT_FIELD);
      urlTextField.setEditable(false);
      urlTextField.setName("urlTextField");
    }
    return urlTextField;
  }

  /**
   * This method initializes connectionsTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getConnectionsTextField() {
    if (connectionsTextField == null) {
      connectionsTextField = new RTextField();
      connectionsTextField.setText(R_TEXT_FIELD);
      connectionsTextField.setValidation("NumberIntPositive");
      connectionsTextField.setMandatory(true);
      connectionsTextField.setName("connectionsTextField");
    }
    return connectionsTextField;
  }

  /**
   * This method initializes connectionsPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getConnectionsPane() {
    if (connectionsPane == null) {
      connectionsPane = new RGridBagLayoutPane();
      connectionsPane.setName("connectionsPane");
      connectionsPane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"}");
      connectionsPane.setBorder(BorderFactory.createTitledBorder("Connections"));
      connectionsPane.add(getConnectionsScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return connectionsPane;
  }

  /**
   * This method initializes connectionsScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getConnectionsScrollPane() {
    if (connectionsScrollPane == null) {
      connectionsScrollPane = new RScrollPane();
      connectionsScrollPane.setName("connectionsScrollPane");
      connectionsScrollPane.setViewPortView(getConnectionsTable());
    }
    return connectionsScrollPane;
  }

  /**
   * This method initializes connectionsTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getConnectionsTable() {
    if (connectionsTable == null) {
      connectionsTable = new RTable();
      connectionsTable.setName("connectionsTable");
      connectionsTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
      connectionsTable.setSortable(true);
      connectionsTable
          .setModelConfiguration("{/showTableheader true /autoTableheader true /showtooltip false /showIcons true /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"\\\"\"/headerAlignment \"default\"/field \"InUse\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"\\\"\"/headerAlignment \"default\"/field \"Last Used\"}}}");
    }
    return connectionsTable;
  }

  /**
   * This method initializes statementsPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getStatementsPane() {
    if (statementsPane == null) {
      statementsPane = new RGridBagLayoutPane();
      statementsPane.setName("statementsPane");
      statementsPane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"}");
      statementsPane.setBorder(BorderFactory.createTitledBorder("Executed Statements"));
      statementsPane.add(getStatementsScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return statementsPane;
  }

  /**
   * This method initializes statementsTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getStatementsTable() {
    if (statementsTable == null) {
      statementsTable = new RTable();
      statementsTable.setName("statementsTable");
      statementsTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons true /version \"3.0\"/emptyTableText \"\"/columns {{/result \"result=(entry.getExecutionTimestamp() as DateTime).format(\\\"short\\\")\"/version \"3.0\"/tooltip \"\"/icon \"result=\\\"/Icons/Database\\\" + \\r\\nIF(entry.getError() != null,\\r\\n  \\\"Error\\\",\\r\\n  \\\"Ok\\\"\\r\\n) + \\r\\n\\\"/16\\\"\"/header \"\\\"Time\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"110\"/columnStyle \"\"}{/result \"result=(entry.getExecutionTimeInMicroSeconds() * 1000).format(\\\"NanoAsMillis\\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Exec. Time\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"70\"/columnStyle \"\"}{/result \"result=(entry.getReadingResultTimeInMicroSeconds() * 1000).format(\\\"NanoAsMillis\\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Result Time\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"70\"}{/result \"result=entry.getSql().replace(\\\"\\\\n\\\", \\\" \\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"SQL\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"250\"}{/result \"result=entry.getDatabaseElement().getProcessElementId()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Process Element\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"200\"}}}");
      // statementsTable.setSortable(true);
      statementsTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
      statementsTable.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    }
    return statementsTable;
  }

  /**
   * This method initializes statementsScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getStatementsScrollPane() {
    if (statementsScrollPane == null) {
      statementsScrollPane = new RScrollPane();
      statementsScrollPane.setName("statementsScrollPane");
      statementsScrollPane.setViewPortView(getStatementsTable());
    }
    return statementsScrollPane;
  }

  /**
   * This method initializes configureButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getConfigureButton() {
    if (configureButton == null) {
      configureButton = new RButton();
      configureButton.setText("Configure");
      configureButton.setStyleProperties("{/fill \"VERTICAL\"}");
      configureButton.setName("configureButton");
    }
    return configureButton;
  }

  /**
   * This method initializes saveButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSaveButton() {
    if (saveButton == null) {
      saveButton = new RButton();
      saveButton.setText("Save");
      saveButton.setStyleProperties("{/anchor \"WEST\"}");
      saveButton.setName("saveButton");
    }
    return saveButton;
  }

  /**
   * This method initializes headerPane
   * 
   * @return ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel
   */
  private ULCContainer getHeaderPane() {
    if (headerPane == null) {
      headerPane = RichDialogPanelFactory.create(TabHeaderBarPanel.class);
      headerPane.setName("headerPane");
    }
    return headerPane;
  }

  /**
   * This method initializes pnlButtonBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getPnlButtonBar() {
    if (pnlButtonBar == null) {
      pnlButtonBar = new RFlowLayoutPane();
      pnlButtonBar.setName("pnlButtonBar");
      pnlButtonBar.setStyle("buttonBarLeft");
      pnlButtonBar.add(getBtnReset());
      pnlButtonBar.add(getConfigureButton());
      pnlButtonBar.add(getSaveButton());
    }
    return pnlButtonBar;
  }

  /**
   * This method initializes btnReset
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnReset() {
    if (btnReset == null) {
      btnReset = new RButton();
      btnReset.setText("<%= ivy.cms.co(\"/Dialogs/general/resetToDefault\") %>");
      btnReset.setName("btnReset");
    }
    return btnReset;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
