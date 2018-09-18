package ch.ivyteam.ivy.admin.tool.NewApplication;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for NewApplicationPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class NewApplicationPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel nameLabel = null;
  private RLabel descriptionLabel = null;
  private RLabel fileDirectoryLabel = null;
  private RLabel ownerLabel = null;
  private RLabel securityLabel = null;
  private RBoxPane buttonBoxPane = null;
  private RButton cancelButton = null;
  private RButton createButton = null;
  private RTextField nameTextField = null;
  private RTextArea descriptonTextArea = null;
  private RTextField fileDirectoryTextField = null;
  private RComboBox securityComboBox = null;
  private RTextField ownerTextField = null;
  private RScrollPane descriptionScrollPane = null;
  private RLabel autoCreateProjectsLabel = null;
  private RCheckBox createWfUiCheckBox = null;
  private RCheckBox createIvyAddonsCheckBox = null;
  private RButton getDirectoryButton = null;
  private RBoxPane directoryPane = null;
  private RCheckBox createWfUiHtmlCheckBox = null;
  private RCheckBox createWfUiJsfCheckBox = null;

  // SONAR-OFF
  /**
   * Create a new instance of NewApplicationPanel
   */
  public NewApplicationPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes NewApplicationPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getFileDirectoryLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOwnerLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSecurityLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonBoxPane(), new com.ulcjava.base.application.GridBagConstraints(0, 10, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSecurityComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOwnerTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getAutoCreateProjectsLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCreateIvyAddonsCheckBox(), new com.ulcjava.base.application.GridBagConstraints(1, 9, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCreateWfUiJsfCheckBox(), new com.ulcjava.base.application.GridBagConstraints(1, 6, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCreateWfUiCheckBox(), new com.ulcjava.base.application.GridBagConstraints(1, 8, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCreateWfUiHtmlCheckBox(), new com.ulcjava.base.application.GridBagConstraints(1, 7, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDirectoryPane(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
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
   * This method initializes descriptionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptionLabel() {
    if (descriptionLabel == null) {
      descriptionLabel = new RLabel();
      descriptionLabel.setText("Description");
      descriptionLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
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
   * This method initializes securityLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getSecurityLabel() {
    if (securityLabel == null) {
      securityLabel = new RLabel();
      securityLabel.setText("Security System");
      securityLabel.setName("securityLabel");
    }
    return securityLabel;
  }

  /**
   * This method initializes buttonBoxPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane
   */
  private RBoxPane getButtonBoxPane() {
    if (buttonBoxPane == null) {
      buttonBoxPane = new RBoxPane();
      buttonBoxPane.setName("buttonBoxPane");
      buttonBoxPane.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsRight \"5\"}");
      buttonBoxPane.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getCreateButton());
      buttonBoxPane.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getCancelButton());
    }
    return buttonBoxPane;
  }

  /**
   * This method initializes cancelButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new RButton();
      cancelButton.setText("Cancel");
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes createButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCreateButton() {
    if (createButton == null) {
      createButton = new RButton();
      createButton.setText("Create");
      createButton.setDefaultCapable(true);
      createButton.setName("createButton");
    }
    return createButton;
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
      nameTextField.setStyleProperties("{/insetsTop \"5\"}");
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes descriptonTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescriptonTextArea() {
    if (descriptonTextArea == null) {
      descriptonTextArea = new RTextArea();
      descriptonTextArea.setText("RTextArea");
      descriptonTextArea.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"}");
      descriptonTextArea.setWrapStyleWord(true);
      descriptonTextArea.setLineWrap(true);
      descriptonTextArea.setName("descriptonTextArea");
    }
    return descriptonTextArea;
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
      fileDirectoryTextField.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"}");
      fileDirectoryTextField.setName("fileDirectoryTextField");
    }
    return fileDirectoryTextField;
  }

  /**
   * This method initializes securityComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getSecurityComboBox() {
    if (securityComboBox == null) {
      securityComboBox = new RComboBox();
      securityComboBox.setName("securityComboBox");
      securityComboBox
          .setModelConfiguration("{/result \"result=entry.getProviderName()\"/version \"3.0\"/icon \"result=ivy.cms.cr(\\\"/images/klein/security\\\")\"/tooltip \"\"}");
    }
    return securityComboBox;
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
      ownerTextField.setName("ownerTextField");
    }
    return ownerTextField;
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
      descriptionScrollPane.setViewPortView(getDescriptonTextArea());
    }
    return descriptionScrollPane;
  }

  /**
   * This method initializes autoCreateProjectsLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getAutoCreateProjectsLabel() {
    if (autoCreateProjectsLabel == null) {
      autoCreateProjectsLabel = new RLabel();
      autoCreateProjectsLabel.setName("autoCreateProjectsLabel");
      autoCreateProjectsLabel.setText("Create process models:");
    }
    return autoCreateProjectsLabel;
  }

  /**
   * This method initializes createWfUiCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCreateWfUiCheckBox() {
    if (createWfUiCheckBox == null) {
      createWfUiCheckBox = new RCheckBox();
      createWfUiCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/workflowRIA\")%>");
      createWfUiCheckBox.setStyleProperties("{/anchor \"WEST\"/insetsBottom \"0\"}");
      createWfUiCheckBox.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/riawftooltip\")%>");
      createWfUiCheckBox.setName("createWfUiCheckBox");
    }
    return createWfUiCheckBox;
  }

  /**
   * This method initializes createIvyAddonCommonCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCreateIvyAddonsCheckBox() {
    if (createIvyAddonsCheckBox == null) {
      createIvyAddonsCheckBox = new RCheckBox();
      createIvyAddonsCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/ivyAddons\")%>");
      createIvyAddonsCheckBox.setStyleProperties("{/anchor \"WEST\"/insetsBottom \"5\"}");
      createIvyAddonsCheckBox.setToolTipText("Provides additional functionalities.");
      createIvyAddonsCheckBox.setActionCommand("Axon.ivy IvyAddons");
      createIvyAddonsCheckBox.setName("createIvyAddonsCheckBox");
    }
    return createIvyAddonsCheckBox;
  }

  /**
   * This method initializes getDirectoryButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getGetDirectoryButton() {
    if (getDirectoryButton == null) {
      getDirectoryButton = new RButton();
      getDirectoryButton.setText("...");
      getDirectoryButton.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"5\"}");
      getDirectoryButton.setFont(new Font("Tahoma", 1, 10));
      getDirectoryButton.setName("getDirectoryButton");
    }
    return getDirectoryButton;
  }

  /**
   * This method initializes directoryPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane
   */
  private RBoxPane getDirectoryPane() {
    if (directoryPane == null) {
      directoryPane = new RBoxPane();
      directoryPane.setName("directoryPane");
      directoryPane.setStyleProperties("{/anchor \"WEST\"/fill \"HORIZONTAL\"/weightX \"1\"}");
      directoryPane.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getFileDirectoryTextField());
      directoryPane.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getGetDirectoryButton());
    }
    return directoryPane;
  }

  /**
   * This method initializes createWfUiHtmlCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCreateWfUiHtmlCheckBox() {
    if (createWfUiHtmlCheckBox == null) {
      createWfUiHtmlCheckBox = new RCheckBox();
      createWfUiHtmlCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/workflowHTML\")%>");
      createWfUiHtmlCheckBox.setStyleProperties("{/anchor \"WEST\"/insetsBottom \"0\"}");
      createWfUiHtmlCheckBox.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/wftooltip\")%>");
      createWfUiHtmlCheckBox.setName("createWfUiHtmlCheckBox");
    }
    return createWfUiHtmlCheckBox;
  }

  /**
   * This method initializes createWfUiJsfCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCreateWfUiJsfCheckBox() {
    if (createWfUiJsfCheckBox == null) {
      createWfUiJsfCheckBox = new RCheckBox();
      createWfUiJsfCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/workflowJsf\")%>");
      createWfUiJsfCheckBox.setStyleProperties("{/anchor \"WEST\"/insetsBottom \"0\"/insetsLeft \"0\"}");
      createWfUiJsfCheckBox.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/wftooltip\")%>");
      createWfUiJsfCheckBox.setName("createWfUiJsfCheckBox");
    }
    return createWfUiJsfCheckBox;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
