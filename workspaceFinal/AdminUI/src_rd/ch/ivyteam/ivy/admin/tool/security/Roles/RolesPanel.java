package ch.ivyteam.ivy.admin.tool.security.Roles;

import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField;
import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField.SearchCallback;
import ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreePanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for RolesPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class RolesPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  @EmbeddedRichDialog(RoleTreePanel.class)
  private ULCContainer rolePane = null;
  private RGridLayoutPane toolPane = null;
  private RButton okButton = null;
  private RButton setExternalNameButton = null;
  private RButton permissionButton = null;
  private RButton usersButton = null;
  private RButton systemPermissionButton = null;
  private RLabel filterLabel = null;
  private CustomizedSearchField roleLookupTextField = null;
  private RCheckBox roleFilterCheckBox = null;
  private RButton addRoleMemberButton = null;
  private RButton removeRoleMemberButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of RolesPanel
   */
  public RolesPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes RolesPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(417, 313));
    this.add(getRolePane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getToolPane(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 0, 0, 0), 0, 0));
    this.add(getFilterLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getRoleLookupTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getRoleFilterCheckBox(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(5, 0, 0, 0),
        0, 0));
  }

  /**
   * This method initializes rolePane
   * 
   * @return ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreePanel
   */
  private ULCContainer getRolePane() {
    if (rolePane == null) {
      rolePane = RichDialogPanelFactory.create(RoleTreePanel.class);
      rolePane.setName("rolePane");
      rolePane.setStyleProperties("{/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
    }
    return rolePane;
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
      toolPane.setColumns(1);
      toolPane.setRows(0);
      toolPane.setVgap(5);
      toolPane.add(getUsersButton());
      toolPane.add(getPermissionButton());
      toolPane.add(getSystemPermissionButton());
      toolPane.add(getSetExternalNameButton());
      toolPane.add(getAddMemberRoleButton());
      toolPane.add(getRemoveMemeberRoleButton());
    }
    return toolPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setStyleProperties("{/fill \"HORIZONTAL\"}");
      okButton.setText("<%=ivy.cms.co(\"/Dialogs/general/ok\")%>");
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes setExternalNameButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSetExternalNameButton() {
    if (setExternalNameButton == null) {
      setExternalNameButton = new RButton();
      setExternalNameButton.setText("External Security Name ...");
      setExternalNameButton
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/externalSercurityName\")%>");
      setExternalNameButton.setName("setExternalNameButton");
    }
    return setExternalNameButton;
  }

  /**
   * This method initializes permissionButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPermissionButton() {
    if (permissionButton == null) {
      permissionButton = new RButton();
      permissionButton.setText("Permissions ...");
      permissionButton.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/grantPermission\")%>");
      permissionButton.setName("permissionButton");
    }
    return permissionButton;
  }

  /**
   * This method initializes usersButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUsersButton() {
    if (usersButton == null) {
      usersButton = new RButton();
      usersButton.setText("Users ...");
      usersButton.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/manageUsersOfSelectedRole\")%>");
      usersButton.setName("usersButton");
    }
    return usersButton;
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
      systemPermissionButton
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/toolTips/grantSystemPermission\")%>");
      systemPermissionButton.setName("systemPermissionButton");
    }
    return systemPermissionButton;
  }

  /**
   * This method initializes filterLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFilterLabel() {
    if (filterLabel == null) {
      filterLabel = new RLabel();
      filterLabel.setText("<%=ivy.cms.co(\"/Dialogs/general/findRoleLabel\")%>");
      filterLabel.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"0\"/insetsLeft \"5\"}");
      filterLabel.setName("filterLabel");
    }
    return filterLabel;
  }

  /**
   * This method initializes roleLookupTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField
   */
  private CustomizedSearchField getRoleLookupTextField() {
    if (roleLookupTextField == null) {
      roleLookupTextField = new CustomizedSearchField();
      roleLookupTextField.setName("roleLookupTextField");
      roleLookupTextField.setToolTipText("<%=ivy.cms.co(\"/Dialogs/general/filterWithExpression\")%>");
      roleLookupTextField.addSearchCallback(SearchCallback.invokeMethod("filter").onPanel(this).build());
    }
    return roleLookupTextField;
  }

  /**
   * This method initializes roleFilterCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getRoleFilterCheckBox() {
    if (roleFilterCheckBox == null) {
      roleFilterCheckBox = new RCheckBox();
      roleFilterCheckBox.setName("roleFilterCheckBox");
      roleFilterCheckBox.setText("<%=ivy.cms.co(\"/Dialogs/general/filterRole\")%>");
    }
    return roleFilterCheckBox;
  }

  /**
   * This method initializes addMemberRoleButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddMemberRoleButton() {
    if (addRoleMemberButton == null) {
      addRoleMemberButton = new RButton();
      addRoleMemberButton.setText("Add Role Member");
      addRoleMemberButton.setName("addRoleMemberButton");
      addRoleMemberButton.addActionListener(new com.ulcjava.base.application.event.IActionListener() {
        public void actionPerformed(com.ulcjava.base.application.event.ActionEvent e) {
          System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return addRoleMemberButton;
  }

  /**
   * This method initializes removeMemeberRoleButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRemoveMemeberRoleButton() {
    if (removeRoleMemberButton == null) {
      removeRoleMemberButton = new RButton();
      removeRoleMemberButton.setText("Remove Role Member");
      removeRoleMemberButton.setName("removeRoleMemberButton");
      removeRoleMemberButton.addActionListener(new com.ulcjava.base.application.event.IActionListener() {
        public void actionPerformed(com.ulcjava.base.application.event.ActionEvent e) {
          System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
        }
      });
    }
    return removeRoleMemberButton;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
