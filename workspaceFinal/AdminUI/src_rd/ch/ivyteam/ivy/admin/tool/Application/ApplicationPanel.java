package ch.ivyteam.ivy.admin.tool.Application;

import ch.ivyteam.ivy.admin.tool.Activity.ActivityPanel;
import ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesPanel;
import ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListPanel;
import ch.ivyteam.ivy.admin.tool.environment.EnvironmentList.EnvironmentListPanel;
import ch.ivyteam.ivy.admin.tool.security.SecuritySystem.SecuritySystemPanel;
import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for ApplicationPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ApplicationPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane titlePane = null;
  private RGridBagLayoutPane infoPane = null;
  private RGridBagLayoutPane processModelPane = null;
  private RLabel nameLabel = null;
  private RLabel descriptonLabel = null;
  private RTextField nameTextField = null;
  private RTextArea descriptionTextArea = null;
  private RScrollPane processModelsScrollPane = null;
  private RTable processModelsTable = null;
  private RLabel fileDirectoryLabel = null;
  private RTextField fileDirectoryTextField = null;
  private RTextField ownerTextField = null;
  private RLabel ownerLabel = null;
  @EmbeddedRichDialog(ActivityPanel.class)
  private ULCContainer activityPanel = null;
  private RScrollPane descriptionScrollPane = null;
  @EmbeddedRichDialog(SecuritySystemPanel.class)
  private ULCContainer securitySystemPanel = null;
  private RGridBagLayoutPane databasePane = null;
  @EmbeddedRichDialog(DatabaseListPanel.class)
  private ULCContainer databaseList = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer headerPane = null;
  @EmbeddedRichDialog(ConfigurationPropertiesPanel.class)
  private ULCContainer configurationPropertiesPanel = null;
  private RGridBagLayoutPane environmentsPane = null;
  @EmbeddedRichDialog(EnvironmentListPanel.class)
  private ULCContainer environmentListPanel = null;
  private RLabel lblEnvironment = null;
  private RComboBox cboEnvironments = null;
  private RButton btnSetActiveEnvironment = null;
  private RButton settingsButton = null;
  private RButton configureCalendarButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of ApplicationPanel
   */
  public ApplicationPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ApplicationPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(599, 550));
    this.add(getTitlePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getInfoPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSecuritySystemPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getActivityPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getConfigurationPropertiesPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getProcessModelPane(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getEnvironmentsPane(), new com.ulcjava.base.application.GridBagConstraints(0, 7, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDatabasePane(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 1, 1, -1, -1,
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
      infoPane.setStyleProperties("{/fill \"HORIZONTAL\"/insetsRight \"5\"/insetsLeft \"5\"/weightY \"0\"}");
      infoPane.setBorder(BorderFactory.createTitledBorder("Information"));
      infoPane.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getDescriptonLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 4, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getFileDirectoryLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getFileDirectoryTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 3, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getOwnerTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 3, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getOwnerLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 3, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getLblEnvironment(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getCboEnvironments(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 2, 1, 1.0, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getBtnSetActiveEnvironment(), new com.ulcjava.base.application.GridBagConstraints(3, 5, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getSettingsButton(), new com.ulcjava.base.application.GridBagConstraints(1, 6, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoPane.add(getConfigureCalendarButton(), new com.ulcjava.base.application.GridBagConstraints(2, 6, 2, 1, 1.0,
          -1, com.ulcjava.base.application.GridBagConstraints.WEST,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return infoPane;
  }

  /**
   * This method initializes processModelPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getProcessModelPane() {
    if (processModelPane == null) {
      processModelPane = new RGridBagLayoutPane();
      processModelPane.setName("processModelPane");
      processModelPane.setBorder(BorderFactory.createTitledBorder("Process Models"));
      processModelPane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"/weightY \"0.3\"}");
      processModelPane.add(getProcessModelsScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1,
          1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return processModelPane;
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
   * This method initializes descriptonLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptonLabel() {
    if (descriptonLabel == null) {
      descriptonLabel = new RLabel();
      descriptonLabel.setText("Description");
      descriptonLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      descriptonLabel.setName("descriptonLabel");
    }
    return descriptonLabel;
  }

  /**
   * This method initializes nameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNameTextField() {
    if (nameTextField == null) {
      nameTextField = new RTextField();
      nameTextField.setText("RTextField");
      nameTextField.setEditable(false);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes descriptionTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescriptionTextArea() {
    if (descriptionTextArea == null) {
      descriptionTextArea = new RTextArea();
      descriptionTextArea.setText("RTextArea");
      descriptionTextArea.setRows(4);
      descriptionTextArea.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"/fill \"BOTH\"/weightY \"1\"}");
      descriptionTextArea.setEditable(false);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes processModelsScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getProcessModelsScrollPane() {
    if (processModelsScrollPane == null) {
      processModelsScrollPane = new RScrollPane();
      processModelsScrollPane.setName("processModelsScrollPane");
      processModelsScrollPane.setViewPortView(getProcessModelsTable());
    }
    return processModelsScrollPane;
  }

  /**
   * This method initializes processModelsTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getProcessModelsTable() {
    if (processModelsTable == null) {
      processModelsTable = new RTable();
      processModelsTable.setName("processModelsTable");
      processModelsTable.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      // processModelsTable.setSortable(true);
      processModelsTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
      processModelsTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"2.0\"/columns {{/result \"result=entry.getName()\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Name\"/field \"\"/columnWidth \"180\"}{/result \"result=entry.getDescription()\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Description\"/field \"\"}}}");
    }
    return processModelsTable;
  }

  /**
   * This method initializes fileDirectoryLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFileDirectoryLabel() {
    if (fileDirectoryLabel == null) {
      fileDirectoryLabel = new RLabel();
      fileDirectoryLabel.setText("File Directory");
      fileDirectoryLabel.setName("fileDirectoryLabel");
    }
    return fileDirectoryLabel;
  }

  /**
   * This method initializes fileDirectoryTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getFileDirectoryTextField() {
    if (fileDirectoryTextField == null) {
      fileDirectoryTextField = new RTextField();
      fileDirectoryTextField.setText("RTextField");
      fileDirectoryTextField.setEditable(false);
      fileDirectoryTextField.setName("fileDirectoryTextField");
    }
    return fileDirectoryTextField;
  }

  /**
   * This method initializes ownerTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getOwnerTextField() {
    if (ownerTextField == null) {
      ownerTextField = new RTextField();
      ownerTextField.setText("RTextField");
      ownerTextField.setEditable(false);
      ownerTextField.setName("ownerTextField");
    }
    return ownerTextField;
  }

  /**
   * This method initializes ownerLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getOwnerLabel() {
    if (ownerLabel == null) {
      ownerLabel = new RLabel();
      ownerLabel.setText("Owner");
      ownerLabel.setName("ownerLabel");
    }
    return ownerLabel;
  }

  /**
   * This method initializes activityPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.Activity.ActivityPanel
   */
  private ULCContainer getActivityPanel() {
    if (activityPanel == null) {
      activityPanel = RichDialogPanelFactory.create(ActivityPanel.class);
      activityPanel.setName("activityPanel");
      activityPanel.setBorder(BorderFactory.createTitledBorder(null, "Activity", ULCTitledBorder.LEADING,
          ULCTitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 11), new Color(12, 74, 124)));
      activityPanel.setStyleProperties("{/fill \"HORIZONTAL\"/insetsRight \"5\"/weightY \"0\"/insetsLeft \"5\"}");
    }
    return activityPanel;
  }

  /**
   * This method initializes descriptionScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDescriptionScrollPane() {
    if (descriptionScrollPane == null) {
      descriptionScrollPane = new RScrollPane();
      descriptionScrollPane.setName("descriptionScrollPane");
      descriptionScrollPane.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      descriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return descriptionScrollPane;
  }

  /**
   * This method initializes securitySystemPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.security.SecuritySystem.SecuritySystemPanel
   */
  private ULCContainer getSecuritySystemPanel() {
    if (securitySystemPanel == null) {
      securitySystemPanel = RichDialogPanelFactory.create(SecuritySystemPanel.class);
      securitySystemPanel.setName("securitySystemPanel");
      securitySystemPanel.setBorder(BorderFactory.createTitledBorder("Security System"));
      securitySystemPanel.setStyleProperties("{/insetsRight \"5\"/fill \"HORIZONTAL\"/insetsLeft \"5\"/weightY \"0\"}");
    }
    return securitySystemPanel;
  }

  /**
   * This method initializes databasePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getDatabasePane() {
    if (databasePane == null) {
      databasePane = new RGridBagLayoutPane();
      databasePane.setBorder(BorderFactory.createTitledBorder("Databases"));
      databasePane.setName("databasePane");
      databasePane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"}");
      databasePane.add(getDatabaseList(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return databasePane;
  }

  /**
   * This method initializes databaseList
   * 
   * @return ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListPanel
   */
  private ULCContainer getDatabaseList() {
    if (databaseList == null) {
      databaseList = RichDialogPanelFactory.create(DatabaseListPanel.class);
      databaseList.setName("databaseList");
      databaseList.setStyleProperties("{/weightY \"0.4\"}");
    }
    return databaseList;
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
   * This method initializes configurationPropertiesPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesPanel
   */
  private ULCContainer getConfigurationPropertiesPanel() {
    if (configurationPropertiesPanel == null) {
      configurationPropertiesPanel = RichDialogPanelFactory.create(ConfigurationPropertiesPanel.class);
      configurationPropertiesPanel.setName("configurationPropertiesPanel");
      configurationPropertiesPanel
          .setStyleProperties("{/fill \"BOTH\"/insetsRight \"5\"/insetsLeft \"5\"/weightY \"0.3\"}");
      configurationPropertiesPanel.setBorder(BorderFactory.createTitledBorder(null, "Configuration Properties",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(12, 74, 124)));
    }
    return configurationPropertiesPanel;
  }

  /**
   * This method initializes environmentsPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getEnvironmentsPane() {
    if (environmentsPane == null) {
      environmentsPane = new RGridBagLayoutPane();
      environmentsPane.setName("environmentsPane");
      environmentsPane.setBorder(BorderFactory.createTitledBorder(null, "Environments",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      environmentsPane.add(getEnvironmentListPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return environmentsPane;
  }

  /**
   * This method initializes environmentListPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.environment.EnvironmentList.EnvironmentListPanel
   */
  private ULCContainer getEnvironmentListPanel() {
    if (environmentListPanel == null) {
      environmentListPanel = RichDialogPanelFactory.create(EnvironmentListPanel.class);
      environmentListPanel.setName("environmentListPanel");
    }
    return environmentListPanel;
  }

  /**
   * This method initializes lblEnvironment
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblEnvironment() {
    if (lblEnvironment == null) {
      lblEnvironment = new RLabel();
      lblEnvironment.setText("<%= ivy.cms.co(\"/Dialogs/application/activeEnvironment\") %>");
      lblEnvironment.setName("lblEnvironment");
    }
    return lblEnvironment;
  }

  /**
   * This method initializes cboEnvironments
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCboEnvironments() {
    if (cboEnvironments == null) {
      cboEnvironments = new RComboBox();
      cboEnvironments.setName("cboEnvironments");
      cboEnvironments.setModelConfiguration("{/result \"result=entry\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
    }
    return cboEnvironments;
  }

  /**
   * This method initializes btnSetActiveEnvironment
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnSetActiveEnvironment() {
    if (btnSetActiveEnvironment == null) {
      btnSetActiveEnvironment = new RButton();
      btnSetActiveEnvironment.setText("Set");
      btnSetActiveEnvironment.setName("btnSetActiveEnvironment");
    }
    return btnSetActiveEnvironment;
  }

  /**
   * This method initializes settingsButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSettingsButton() {
    if (settingsButton == null) {
      settingsButton = new RButton();
      settingsButton.setName("settingsButton");
      settingsButton.setStyleProperties("{/anchor \"WEST\"/marginRight \"25\"/marginLeft \"25\"}");
      settingsButton.setText("Configure Default Settings");
    }
    return settingsButton;
  }

  /**
   * This method initializes configureCalendarButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getConfigureCalendarButton() {
    if (configureCalendarButton == null) {
      configureCalendarButton = new RButton();
      configureCalendarButton.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/configureCalendarSettings\") %>");
      configureCalendarButton.setStyleProperties("{/marginRight \"25\"/marginLeft \"25\"}");
      configureCalendarButton.setName("configureCalendarButton");
    }
    return configureCalendarButton;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
