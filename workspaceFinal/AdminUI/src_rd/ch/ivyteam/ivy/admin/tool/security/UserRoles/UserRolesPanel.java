package ch.ivyteam.ivy.admin.tool.security.UserRoles;

import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField;
import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField.SearchCallback;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTableTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for UserRolesPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class UserRolesPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane rolesScrollPane = null;
  private RTableTree rolesTableTree = null;
  private RGridLayoutPane toolPane = null;
  private RButton addButton = null;
  private RButton removeButton = null;
  private RGridLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RLabel filterLabel = null;
  private CustomizedSearchField roleLookupTextField = null;
  private RCheckBox roleFilterCheckBox = null;

  // SONAR-OFF
  /**
   * Create a new instance of UserRolesPanel
   */
  public UserRolesPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UserRolesPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(325, 347));
    this.add(getRolesScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getToolPane(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getFilterLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getRoleLookupTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getRoleFilterCheckBox(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5, 0, 0, 0),
        0, 0));
  }

  /**
   * This method initializes rolesScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getRolesScrollPane() {
    if (rolesScrollPane == null) {
      rolesScrollPane = new RScrollPane();
      rolesScrollPane.setName("rolesScrollPane");
      rolesScrollPane.setStyleProperties("{/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
      rolesScrollPane.setViewPortView(getRolesTableTree());
    }
    return rolesScrollPane;
  }

  /**
   * This method initializes rolesTableTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTableTree
   */
  private RTableTree getRolesTableTree() {
    if (rolesTableTree == null) {
      rolesTableTree = new RTableTree();
      rolesTableTree.setName("rolesTableTree");
      rolesTableTree
          .setModelConfiguration("{/dynamicTreeLoadMode \"LOAD_FOR_RENDER_PARENT\"/version \"3.0\"/showTableheader true /autoTableheader false /showtooltip false /showIcons true /columns {{/patterns {{/header \"\\\"Role\\\"\"/version \"3.0\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=new ch.ivyteam.ivy.admin.tool.security.RoleTree.Roles().getDisplayName(entry.get(0))\"/version \"3.0\"/icon \"result=ivy.cms.cr(\\\"/images/klein/role\\\")\"/patternMode \"INSTANCE\"/patternValue \"List\"}}/version \"3.0\"}{/patterns {{/header \"\\\"Owns\\\"\"/version \"3.0\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.get(1)\"/version \"3.0\"/icon \"result=entry.get(1) == \\\"Yes\\\" ? ivy.cms.cr(\\\"/Icons/CheckboxChecked/16\\\") : \\r\\nentry.get(1) == \\\"Inherited\\\" ? ivy.cms.cr(\\\"/Icons/CheckboxCheckedGrey/16\\\") : \\r\\nivy.cms.cr(\\\"/Icons/CheckboxUnchecked/16\\\")\"/patternMode \"INSTANCE\"/patternValue \"List\"}}/version \"3.0\"}}}");
      rolesTableTree.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    }
    return rolesTableTree;
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
      toolPane.setColumns(1);
      toolPane.setRows(0);
      toolPane.setVgap(5);
      toolPane.setForeground(new Color(51, 51, 51));
      toolPane.setStyleProperties("{/anchor \"NORTH\"/insetsTop \"5\"/insetsRight \"5\"}");
      toolPane.add(getAddButton());
      toolPane.add(getRemoveButton());
    }
    return toolPane;
  }

  /**
   * This method initializes addButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddButton() {
    if (addButton == null) {
      addButton = new RButton();
      addButton.setText("Add");
      addButton.setName("addButton");
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
      removeButton.setText("<%=ivy.cms.co(\"/Dialogs/general/remove\")%>");
    }
    return removeButton;
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
      buttonPane.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"}");
      buttonPane.setHgap(5);
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
      okButton.setText("<%=ivy.cms.co(\"/Dialogs/general/ok\")%>");
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
      cancelButton.setName("cancelButton");
      cancelButton.setText("<%=ivy.cms.co(\"/Dialogs/general/cancel\")%>");
    }
    return cancelButton;
  }

  /**
   * This method initializes filterLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFilterLabel() {
    if (filterLabel == null) {
      filterLabel = new RLabel();
      filterLabel.setName("filterLabel");
      filterLabel.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"0\"/insetsLeft \"5\"}");
      filterLabel.setText("<%=ivy.cms.co(\"/Dialogs/general/findRoleLabel\")%>");
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
} // @jve:decl-index=0:visual-constraint="10,10"
