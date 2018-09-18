package ch.ivyteam.ivy.admin.tool.security.RoleUsers;

import ch.ivyteam.ivy.admin.tool.security.UserList.UserListPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for RoleUsersPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class RoleUsersPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  @EmbeddedRichDialog(UserListPanel.class)
  private ULCContainer usersNotOwnRolePane = null;
  @EmbeddedRichDialog(UserListPanel.class)
  private ULCContainer usersOwnRolePane = null;
  private RGridLayoutPane movePane = null;
  private RButton addButton = null;
  private RButton addAllButton = null;
  private RButton removeButton = null;
  private RButton removeAllButton = null;
  private RGridLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of RoleUsersPanel
   */
  public RoleUsersPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes RoleUsersPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getUsersNotOwnRolePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMovePane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getUsersOwnRolePane(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes usersNotOwnRolePane
   * 
   * @return ch.ivyteam.ivy.admin.tool.security.UserList.UserListPanel
   */
  private ULCContainer getUsersNotOwnRolePane() {
    if (usersNotOwnRolePane == null) {
      usersNotOwnRolePane = RichDialogPanelFactory.create(UserListPanel.class);
      usersNotOwnRolePane.setName("usersNotOwnRolePane");
      usersNotOwnRolePane.setBorder(BorderFactory.createTitledBorder("Users not owning role"));
      usersNotOwnRolePane
          .setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
    }
    return usersNotOwnRolePane;
  }

  /**
   * This method initializes usersOwnRolePane
   * 
   * @return ch.ivyteam.ivy.admin.tool.security.UserList.UserListPanel
   */
  private ULCContainer getUsersOwnRolePane() {
    if (usersOwnRolePane == null) {
      usersOwnRolePane = RichDialogPanelFactory.create(UserListPanel.class);
      usersOwnRolePane.setName("usersOwnRolePane");
      usersOwnRolePane.setBorder(BorderFactory.createTitledBorder("Users owning role"));
      usersOwnRolePane.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
    }
    return usersOwnRolePane;
  }

  /**
   * This method initializes movePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getMovePane() {
    if (movePane == null) {
      movePane = new RGridLayoutPane();
      movePane.setName("movePane");
      movePane.setColumns(1);
      movePane.setRows(0);
      movePane.setVgap(5);
      movePane.add(getAddButton());
      movePane.add(getAddAllButton());
      movePane.add(getRemoveButton());
      movePane.add(getRemoveAllButton());
    }
    return movePane;
  }

  /**
   * This method initializes addButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddButton() {
    if (addButton == null) {
      addButton = new RButton();
      addButton.setIconUri("<%=ivy.cms.cr(\"/Icons/NavRightBlack/16\")%>");
      addButton.setName("addButton");
    }
    return addButton;
  }

  /**
   * This method initializes addAllButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddAllButton() {
    if (addAllButton == null) {
      addAllButton = new RButton();
      addAllButton.setName("addAllButton");
      addAllButton.setIconUri("<%=ivy.cms.cr(\"/Icons/NavRightBlack2/16\")%>");
    }
    return addAllButton;
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
      removeButton.setIconUri("<%=ivy.cms.cr(\"/Icons/NavLeftBlack/16\")%>");
    }
    return removeButton;
  }

  /**
   * This method initializes removeAllButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRemoveAllButton() {
    if (removeAllButton == null) {
      removeAllButton = new RButton();
      removeAllButton.setName("removeAllButton");
      removeAllButton.setIconUri("<%=ivy.cms.cr(\"/Icons/NavLeftBlack2/16\")%>");
    }
    return removeAllButton;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RGridLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane.setHgap(5);
      buttonPane.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsRight \"5\"}");
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
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
      okButton.setDefaultCapable(true);
      okButton.setName("okButton");
    }
    return okButton;
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
} // @jve:decl-index=0:visual-constraint="10,10"
