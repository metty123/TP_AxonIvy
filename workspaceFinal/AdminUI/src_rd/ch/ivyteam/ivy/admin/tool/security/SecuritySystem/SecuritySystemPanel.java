package ch.ivyteam.ivy.admin.tool.security.SecuritySystem;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;

/**
 * RichDialog panel implementation for SecuritySystemPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class SecuritySystemPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel nameLabel = null;
  private RLabel usersLabel = null;
  private RTextField nameTextField = null;
  private RTextField usersTextField = null;
  private RButton showUsersButton = null;
  private RButton synchronizeUsersButton = null;
  private RButton editButton = null;
  private RLabel rolesLabel = null;
  private RTextField rolesTextField = null;
  private RButton showRolesButton = null;
  private RGridBagLayoutPane gridBagLayoutPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of SecuritySystemPanel
   */
  public SecuritySystemPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes SecuritySystemPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(394, 273));
    this.add(getGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
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
   * This method initializes usersLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUsersLabel() {
    if (usersLabel == null) {
      usersLabel = new RLabel();
      usersLabel.setText("Users");
      usersLabel.setName("usersLabel");
    }
    return usersLabel;
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
      nameTextField.setName("nameTextField");
      nameTextField.setEditable(false);
    }
    return nameTextField;
  }

  /**
   * This method initializes usersTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getUsersTextField() {
    if (usersTextField == null) {
      usersTextField = new RTextField();
      usersTextField.setText("RTextField");
      usersTextField.setName("usersTextField");
      usersTextField.setEditable(false);
    }
    return usersTextField;
  }

  /**
   * This method initializes showUsersButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getShowUsersButton() {
    if (showUsersButton == null) {
      showUsersButton = new RButton();
      showUsersButton.setText("Show ...");
      // SONAR-OFF
      showUsersButton.setStyleProperties("{/fill \"HORIZONTAL\"}");
      // SONAR-ON
      showUsersButton.setName("showUsersButton");
    }
    return showUsersButton;
  }

  /**
   * This method initializes synchronizeUsersButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSynchronizeUsersButton() {
    if (synchronizeUsersButton == null) {
      synchronizeUsersButton = new RButton();
      synchronizeUsersButton.setText("<%=ivy.cms.co(\"/Dialogs/security/synchronize\")%>");
      // SONAR-OFF
      synchronizeUsersButton.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 27));
      synchronizeUsersButton.setName("synchronizeUsersButton");
    }
    return synchronizeUsersButton;
  }

  /**
   * This method initializes editButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getEditButton() {
    if (editButton == null) {
      editButton = new RButton();
      editButton.setText("Edit ...");
      // SONAR-OFF
      editButton.setStyleProperties("{/fill \"HORIZONTAL\"}");
      // SONAR-ON
      editButton.setName("editButton");
    }
    return editButton;
  }

  /**
   * This method initializes rolesLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getRolesLabel() {
    if (rolesLabel == null) {
      rolesLabel = new RLabel();
      rolesLabel.setText("Roles");
      rolesLabel.setName("rolesLabel");
    }
    return rolesLabel;
  }

  /**
   * This method initializes rolesTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getRolesTextField() {
    if (rolesTextField == null) {
      rolesTextField = new RTextField();
      rolesTextField.setText("RTextField");
      rolesTextField.setName("rolesTextField");
      rolesTextField.setEditable(false);
    }
    return rolesTextField;
  }

  /**
   * This method initializes showRolesButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getShowRolesButton() {
    if (showRolesButton == null) {
      showRolesButton = new RButton();
      showRolesButton.setText("Show ...");
      // SONAR-OFF
      showRolesButton.setStyleProperties("{/fill \"HORIZONTAL\"}");
      // SONAR-ON
      showRolesButton.setName("showRolesButton");
    }
    return showRolesButton;
  }

  /**
   * This method initializes gridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getGridBagLayoutPane() {
    if (gridBagLayoutPane == null) {
      gridBagLayoutPane = new RGridBagLayoutPane();
      gridBagLayoutPane.setName("gridBagLayoutPane");
      gridBagLayoutPane.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getUsersLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getUsersTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getRolesLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getRolesTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getEditButton(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getShowUsersButton(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getShowRolesButton(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      gridBagLayoutPane.add(getSynchronizeUsersButton(), new com.ulcjava.base.application.GridBagConstraints(3, 0, 1,
          1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return gridBagLayoutPane;
  }

  private boolean enableEdit;

  public void setEnableEdit(boolean enableEdit) {
    this.enableEdit = enableEdit;
    editButton.setEnabled(enableEdit);
    synchronizeUsersButton.setEnabled(enableEdit);
  }

  public void updateGUIForUserSynchronizing(boolean isSynchronizing) {
    showRolesButton.setEnabled(!isSynchronizing);
    showUsersButton.setEnabled(!isSynchronizing);
    editButton.setEnabled(!isSynchronizing && this.enableEdit);
    synchronizeUsersButton.setEnabled(!isSynchronizing && this.enableEdit);
    String synchButtonTitle =
        isSynchronizing ? Ivy.cms().co("/Dialogs/security/synchIsRunning") : Ivy.cms().co(
            "/Dialogs/security/synchronize");
    synchronizeUsersButton.setText(synchButtonTitle);
  }

} // @jve:decl-index=0:visual-constraint="10,10"
