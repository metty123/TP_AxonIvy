package ch.ivyteam.ivy.admin.tool.security.Users;

import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField;
import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField.SearchCallback;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

/**
 * RichDialog panel implementation for UsersPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class UsersPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTable usersTable = null;
  private RScrollPane usersScrollPane = null;
  private RButton okButton = null;
  private RButton permissionsButton = null;
  private RButton createButton = null;
  private RButton deleteButton = null;
  private RGridLayoutPane toolPane = null;
  private RButton rolesButton = null;
  private RButton editButton = null;
  private RButton systemPermissionButton = null;
  private RButton propertiesButton = null;
  private RLabel lblNumberOfUsers = null;
  private CustomizedSearchField lookupUsers = null;
  private RLabel findUserLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of UsersPanel
   */
  public UsersPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UsersPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(750, 462));
    this.add(getUsersScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(2, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getToolPane(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblNumberOfUsers(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLookupUsers(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getFindUserLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes usersTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getUsersTable() {
    if (usersTable == null) {
      usersTable = new RTable();
      usersTable.setName("usersTable");
      usersTable.setSortable(true);
      usersTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/columns {{/result \"result=entry.getName()\"/version \"3.0\"/tooltip \"\"/icon \"result=ivy.cms.cr(\\\"/images/klein/user\\\")\"/header \"\\\"Name\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"100\"/columnStyle \"\"}{/result \"result=entry.getFullName()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Full Name\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"200\"}{/result \"result=entry.getEMailAddress()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"E-Mail Address\\\"\"/headerAlignment \"default\"/field \"\"/condition \"\"/columnWidth \"200\"}{/result \"result=IF (ivy.session.getAttribute(entry.getId().toString()) != null && (ivy.session.getAttribute(entry.getId().toString()) as Boolean), \\\" \\\", \\\"\\\")\"/version \"3.0\"/tooltip \"result=IF (ivy.session.getAttribute(entry.getId().toString()) != null && (ivy.session.getAttribute(entry.getId().toString()) as Boolean),\\r\\nivy.cms.co(\\\"/ch/ivyteam/ivy/admin/user/loggedInTooltip\\\"), ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/user/offlineTooltip\\\"))\"/icon \"result=IF (ivy.session.getAttribute(entry.getId().toString()) != null && (ivy.session.getAttribute(entry.getId().toString()) as Boolean),\\r\\nivy.cms.cr(\\\"/images/klein/loggedInStates/loggedIn\\\"), ivy.cms.cr(\\\"/images/klein/loggedInStates/offline\\\"))\"/header \"\\\"Logged-in\\\"\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}}}");
    }
    return usersTable;
  }

  /**
   * This method initializes usersScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getUsersScrollPane() {
    if (usersScrollPane == null) {
      usersScrollPane = new RScrollPane();
      usersScrollPane.setName("usersScrollPane");
      usersScrollPane.setStyleProperties("{/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
      usersScrollPane.setViewPortView(getUsersTable());
    }
    return usersScrollPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("Ok");
      okButton.setStyleProperties("{/anchor \"EAST\"/insetsTop \"5\"/fill \"HORIZONTAL\"}");
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes permissionsButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPermissionsButton() {
    if (permissionsButton == null) {
      permissionsButton = new RButton();
      permissionsButton.setText("Permissions ...");
      permissionsButton.setStyleProperties("{/insetsTop \"5\"}");
      permissionsButton.setName("permissionsButton");
    }
    return permissionsButton;
  }

  /**
   * This method initializes createButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCreateButton() {
    if (createButton == null) {
      createButton = new RButton();
      createButton.setText("Create ...");
      createButton.setName("createButton");
    }
    return createButton;
  }

  /**
   * This method initializes deleteButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteButton() {
    if (deleteButton == null) {
      deleteButton = new RButton();
      deleteButton.setText("Delete ...");
      deleteButton.setName("deleteButton");
    }
    return deleteButton;
  }

  /**
   * This method initializes toolPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getToolPane() {
    if (toolPane == null) {
      toolPane = new RGridLayoutPane();
      toolPane.setName("toolPane");
      toolPane.setStyleProperties("{/anchor \"NORTH\"/insetsTop \"5\"/insetsRight \"5\"}");
      toolPane.setVgap(5);
      toolPane.setColumns(1);
      toolPane.setRows(0);
      toolPane.add(getCreateButton());
      toolPane.add(getEditButton());
      toolPane.add(getDeleteButton());
      toolPane.add(getRolesButton());
      toolPane.add(getPropertiesButton());
      toolPane.add(getPermissionsButton());
      toolPane.add(getSystemPermissionButton());
    }
    return toolPane;
  }

  /**
   * This method initializes rolesButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRolesButton() {
    if (rolesButton == null) {
      rolesButton = new RButton();
      rolesButton.setText("Roles ...");
      rolesButton.setName("rolesButton");
    }
    return rolesButton;
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
      editButton.setName("editButton");
    }
    return editButton;
  }

  /**
   * This method initializes systemPermissionButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSystemPermissionButton() {
    if (systemPermissionButton == null) {
      systemPermissionButton = new RButton();
      systemPermissionButton.setText("System Permissions ...");
      systemPermissionButton.setName("systemPermissionButton");
    }
    return systemPermissionButton;
  }

  /**
   * This method initializes propertiesButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPropertiesButton() {
    if (propertiesButton == null) {
      propertiesButton = new RButton();
      propertiesButton.setText("Properties ...");
      propertiesButton.setName("propertiesButton");
    }
    return propertiesButton;
  }

  /**
   * This method initializes lblNumberOfUsers
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblNumberOfUsers() {
    if (lblNumberOfUsers == null) {
      lblNumberOfUsers = new RLabel();
      lblNumberOfUsers.setName("lblNumberOfUsers");
      lblNumberOfUsers.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/user/usersOverAllApplications\")%>");
    }
    return lblNumberOfUsers;
  }

  /**
   * This method initializes lookupUsers
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField
   */
  private CustomizedSearchField getLookupUsers() {
    if (lookupUsers == null) {
      lookupUsers = new CustomizedSearchField();
      lookupUsers.setName("lookupUsers");
      lookupUsers.addSearchCallback(SearchCallback.invokeMethod("filter").onPanel(this).build());
    }
    return lookupUsers;
  }

  /**
   * This method initializes findUserLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFindUserLabel() {
    if (findUserLabel == null) {
      findUserLabel = new RLabel();
      findUserLabel.setText("<%=ivy.cms.co(\"/Dialogs/general/findUserLabel\")%>");
      findUserLabel.setName("findUserLabel");
      findUserLabel.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"0\"/insetsLeft \"5\"}");
      findUserLabel.setName("findUserLabel");
    }
    return findUserLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
