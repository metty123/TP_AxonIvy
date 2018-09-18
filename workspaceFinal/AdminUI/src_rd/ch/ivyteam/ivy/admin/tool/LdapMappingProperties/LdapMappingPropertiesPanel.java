package ch.ivyteam.ivy.admin.tool.LdapMappingProperties;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.util.Dimension;

/**
 * <p>
 * LdapMappingPropertiesPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class LdapMappingPropertiesPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane ldapAttributePane = null;
  private RLabel userNameAttributeLabel = null;
  private RLabel fullUserNameAttributeLabel = null;
  private RLabel eMailAddressAttributeLabel = null;
  private RLabel eMailLanguageAttributeLabel = null;
  private RLabel groupsOfUserAttributeLabel = null;
  private RLabel membersOfGroupAttributeLabel = null;
  private RLabel groupsOfGroupAttributeLabel = null;
  private RTextField userNameAttributeTextField = null;
  private RTextField fullUserNameAttributeTextField = null;
  private RTextField eMailAddressAttributeTextField = null;
  private RTextField eMailLanguageAttributeTextField = null;
  private RTextField groupsOfUserAttributeTextField = null;
  private RTextField groupsOfGroupAttributeTextField = null;
  private RTextField membersOfGroupAttributeTextField = null;
  private RLabel userPropertyAttributeLabel = null;
  private RScrollPane userPropertyAttributesScrollPane = null;
  private RTable userPropertyAttributesTable = null;
  private RCheckBox fullUserNameAttributeCheckBox = null;
  private RCheckBox eMailAddressAttributeCheckBox = null;
  private RCheckBox eMailLanguageAttributeCheckBox = null;
  private RButton userPropertyAttributeAddButton = null;
  private RButton userPropetyAttributeRemoveButton = null;
  private RButton editButton = null;
  private RCheckBox groupsOfAUserAttributeCheckBox = null;

  /**
   * Create a new instance of LdapMappingPropertiesPanel
   */
  public LdapMappingPropertiesPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes LdapMappingPropertiesPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getLdapAttributePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes ldapAttributePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getLdapAttributePane() {
    if (ldapAttributePane == null) {
      ldapAttributePane = new RGridBagLayoutPane();
      ldapAttributePane.setName("ldapAttributePane");
      ldapAttributePane.setBorder(BorderFactory.createTitledBorder("LDAP Attribute Mapping"));
      ldapAttributePane.setName("ldapAttributePane");
      ldapAttributePane.add(getUserNameAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1,
          1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getFullUserNameAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEMailAddressAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEMailLanguageAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getGroupsOfUserAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getMembersOfGroupAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0,
          7, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getGroupsOfGroupAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 6,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getUserNameAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getFullUserNameAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(1,
          1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEMailAddressAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(1,
          2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEMailLanguageAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(
          1, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getGroupsOfUserAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(1,
          4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getGroupsOfGroupAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(
          1, 6, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getMembersOfGroupAttributeTextField(), new com.ulcjava.base.application.GridBagConstraints(
          1, 7, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getUserPropertyAttributeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 8,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getUserPropertyAttributesScrollPane(), new com.ulcjava.base.application.GridBagConstraints(
          1, 8, 1, 3, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getFullUserNameAttributeCheckBox(), new com.ulcjava.base.application.GridBagConstraints(2,
          1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEMailAddressAttributeCheckBox(), new com.ulcjava.base.application.GridBagConstraints(2,
          2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEMailLanguageAttributeCheckBox(), new com.ulcjava.base.application.GridBagConstraints(2,
          3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getUserPropertyAttributeAddButton(), new com.ulcjava.base.application.GridBagConstraints(2,
          8, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getUserPropetyAttributeRemoveButton(), new com.ulcjava.base.application.GridBagConstraints(
          2, 10, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getEditButton(), new com.ulcjava.base.application.GridBagConstraints(2, 9, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      ldapAttributePane.add(getGroupsOfAUserAttributeCheckBox(), new com.ulcjava.base.application.GridBagConstraints(2,
          4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.WEST,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return ldapAttributePane;
  }

  /**
   * This method initializes userNameAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUserNameAttributeLabel() {
    if (userNameAttributeLabel == null) {
      userNameAttributeLabel = new RLabel();
      userNameAttributeLabel.setName("userNameAttributeLabel");
      userNameAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/userName\")%>");
    }
    return userNameAttributeLabel;
  }

  /**
   * This method initializes fullUserNameAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFullUserNameAttributeLabel() {
    if (fullUserNameAttributeLabel == null) {
      fullUserNameAttributeLabel = new RLabel();
      fullUserNameAttributeLabel.setName("fullUserNameAttributeLabel");
      fullUserNameAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/fullUsername\")%>");
    }
    return fullUserNameAttributeLabel;
  }

  /**
   * This method initializes eMailAddressAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getEMailAddressAttributeLabel() {
    if (eMailAddressAttributeLabel == null) {
      eMailAddressAttributeLabel = new RLabel();
      eMailAddressAttributeLabel.setName("eMailAddressAttributeLabel");
      eMailAddressAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/emailAddress\")%>");
    }
    return eMailAddressAttributeLabel;
  }

  /**
   * This method initializes eMailLanguageAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getEMailLanguageAttributeLabel() {
    if (eMailLanguageAttributeLabel == null) {
      eMailLanguageAttributeLabel = new RLabel();
      eMailLanguageAttributeLabel.setName("eMailLanguageAttributeLabel");
      eMailLanguageAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/emailLanguage\")%>");
    }
    return eMailLanguageAttributeLabel;
  }

  /**
   * This method initializes groupsOfUserAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getGroupsOfUserAttributeLabel() {
    if (groupsOfUserAttributeLabel == null) {
      groupsOfUserAttributeLabel = new RLabel();
      groupsOfUserAttributeLabel.setName("groupsOfUserAttributeLabel");
      groupsOfUserAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/groupsOfUser\")%>");
    }
    return groupsOfUserAttributeLabel;
  }

  /**
   * This method initializes membersOfGroupAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getMembersOfGroupAttributeLabel() {
    if (membersOfGroupAttributeLabel == null) {
      membersOfGroupAttributeLabel = new RLabel();
      membersOfGroupAttributeLabel.setName("membersOfGroupAttributeLabel");
      membersOfGroupAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/membersOfAGroup\")%>");
    }
    return membersOfGroupAttributeLabel;
  }

  /**
   * This method initializes groupsOfGroupAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getGroupsOfGroupAttributeLabel() {
    if (groupsOfGroupAttributeLabel == null) {
      groupsOfGroupAttributeLabel = new RLabel();
      groupsOfGroupAttributeLabel.setName("groupsOfGroupAttributeLabel");
      groupsOfGroupAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/groupsOfAGroup\")%>");
    }
    return groupsOfGroupAttributeLabel;
  }

  /**
   * This method initializes userNameAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getUserNameAttributeTextField() {
    if (userNameAttributeTextField == null) {
      userNameAttributeTextField = new RTextField();
      userNameAttributeTextField.setName("userNameAttributeTextField");
      userNameAttributeTextField.setText("RTextField");
      userNameAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue()");
      userNameAttributeTextField.setColumns(30);
    }
    return userNameAttributeTextField;
  }

  /**
   * This method initializes fullUserNameAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getFullUserNameAttributeTextField() {
    if (fullUserNameAttributeTextField == null) {
      fullUserNameAttributeTextField = new RTextField();
      fullUserNameAttributeTextField.setName("fullUserNameAttributeTextField");
      fullUserNameAttributeTextField.setText("RTextField");
      fullUserNameAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue()");
      fullUserNameAttributeTextField.setColumns(30);
    }
    return fullUserNameAttributeTextField;
  }

  /**
   * This method initializes eMailAddressAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getEMailAddressAttributeTextField() {
    if (eMailAddressAttributeTextField == null) {
      eMailAddressAttributeTextField = new RTextField();
      eMailAddressAttributeTextField.setName("eMailAddressAttributeTextField");
      eMailAddressAttributeTextField.setText("RTextField");
      eMailAddressAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue()");
      eMailAddressAttributeTextField.setColumns(30);
    }
    return eMailAddressAttributeTextField;
  }

  /**
   * This method initializes eMailLanguageAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getEMailLanguageAttributeTextField() {
    if (eMailLanguageAttributeTextField == null) {
      eMailLanguageAttributeTextField = new RTextField();
      eMailLanguageAttributeTextField.setName("eMailLanguageAttributeTextField");
      eMailLanguageAttributeTextField.setText("RTextField");
      eMailLanguageAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_EMAIL_LANGUAGE_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue()");
      eMailLanguageAttributeTextField.setColumns(30);
    }
    return eMailLanguageAttributeTextField;
  }

  /**
   * This method initializes groupsOfUserAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getGroupsOfUserAttributeTextField() {
    if (groupsOfUserAttributeTextField == null) {
      groupsOfUserAttributeTextField = new RTextField();
      groupsOfUserAttributeTextField.setName("groupsOfUserAttributeTextField");
      groupsOfUserAttributeTextField.setText("RTextField");
      groupsOfUserAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_MEMBER_OF_GROUP_ATTRIBUTE_PROPERTY).getValue()");
      groupsOfUserAttributeTextField.setColumns(30);
    }
    return groupsOfUserAttributeTextField;
  }

  /**
   * This method initializes groupsOfGroupAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getGroupsOfGroupAttributeTextField() {
    if (groupsOfGroupAttributeTextField == null) {
      groupsOfGroupAttributeTextField = new RTextField();
      groupsOfGroupAttributeTextField.setName("groupsOfGroupAttributeTextField");
      groupsOfGroupAttributeTextField.setText("RTextField");
      groupsOfGroupAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_GROUP_MEMBER_OF_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue()");
      groupsOfGroupAttributeTextField.setColumns(30);
    }
    return groupsOfGroupAttributeTextField;
  }

  /**
   * This method initializes membersOfGroupAttributeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getMembersOfGroupAttributeTextField() {
    if (membersOfGroupAttributeTextField == null) {
      membersOfGroupAttributeTextField = new RTextField();
      membersOfGroupAttributeTextField.setName("membersOfGroupAttributeTextField");
      membersOfGroupAttributeTextField.setText("RTextField");
      membersOfGroupAttributeTextField
          .setToolTipText("ISecurityContext.getConfigurationProperty(JNDI_USER_GROUP_MEMBERS_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue()");
      membersOfGroupAttributeTextField.setColumns(30);
    }
    return membersOfGroupAttributeTextField;
  }

  /**
   * This method initializes userPropertyAttributeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUserPropertyAttributeLabel() {
    if (userPropertyAttributeLabel == null) {
      userPropertyAttributeLabel = new RLabel();
      userPropertyAttributeLabel.setName("userPropertyAttributeLabel");
      userPropertyAttributeLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      userPropertyAttributeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/userProperties\")%>");
    }
    return userPropertyAttributeLabel;
  }

  /**
   * This method initializes userPropertyAttributesScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getUserPropertyAttributesScrollPane() {
    if (userPropertyAttributesScrollPane == null) {
      userPropertyAttributesScrollPane = new RScrollPane();
      userPropertyAttributesScrollPane.setName("userPropertyAttributesScrollPane");
      userPropertyAttributesScrollPane.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      userPropertyAttributesScrollPane.setPreferredSize(new Dimension(450, 100));
      userPropertyAttributesScrollPane.setViewPortView(getUserPropertyAttributesTable());
    }
    return userPropertyAttributesScrollPane;
  }

  /**
   * This method initializes userPropertyAttributesTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getUserPropertyAttributesTable() {
    if (userPropertyAttributesTable == null) {
      userPropertyAttributesTable = new RTable();
      userPropertyAttributesTable.setName("userPropertyAttributesTable");
      userPropertyAttributesTable.setSortable(true);
      userPropertyAttributesTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      userPropertyAttributesTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Name\\\"\"/headerAlignment \"default\"/field \"name\"/columnWidth \"220\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"LDAP Attribute Name\\\"\"/headerAlignment \"default\"/field \"value\"/columnWidth \"220\"}}}");
    }
    return userPropertyAttributesTable;
  }

  /**
   * This method initializes fullUserNameAttributeCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getFullUserNameAttributeCheckBox() {
    if (fullUserNameAttributeCheckBox == null) {
      fullUserNameAttributeCheckBox = new RCheckBox();
      fullUserNameAttributeCheckBox.setName("fullUserNameAttributeCheckBox");
      fullUserNameAttributeCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/doNotImport\")%>");
    }
    return fullUserNameAttributeCheckBox;
  }

  /**
   * This method initializes eMailAddressAttributeCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getEMailAddressAttributeCheckBox() {
    if (eMailAddressAttributeCheckBox == null) {
      eMailAddressAttributeCheckBox = new RCheckBox();
      eMailAddressAttributeCheckBox.setName("eMailAddressAttributeCheckBox");
      eMailAddressAttributeCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/doNotImport\")%>");
    }
    return eMailAddressAttributeCheckBox;
  }

  /**
   * This method initializes eMailLanguageAttributeCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getEMailLanguageAttributeCheckBox() {
    if (eMailLanguageAttributeCheckBox == null) {
      eMailLanguageAttributeCheckBox = new RCheckBox();
      eMailLanguageAttributeCheckBox.setName("eMailLanguageAttributeCheckBox");
      eMailLanguageAttributeCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/doNotImport\")%>");
    }
    return eMailLanguageAttributeCheckBox;
  }

  /**
   * This method initializes userPropertyAttributeAddButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUserPropertyAttributeAddButton() {
    if (userPropertyAttributeAddButton == null) {
      userPropertyAttributeAddButton = new RButton();
      userPropertyAttributeAddButton.setName("userPropertyAttributeAddButton");
      userPropertyAttributeAddButton.setStyleProperties("{/insetsBottom \"5\"/fill \"HORIZONTAL\"}");
      userPropertyAttributeAddButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/add\")%>");
    }
    return userPropertyAttributeAddButton;
  }

  /**
   * This method initializes userPropetyAttributeRemoveButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUserPropetyAttributeRemoveButton() {
    if (userPropetyAttributeRemoveButton == null) {
      userPropetyAttributeRemoveButton = new RButton();
      userPropetyAttributeRemoveButton.setName("userPropetyAttributeRemoveButton");
      userPropetyAttributeRemoveButton.setStyleProperties("{/anchor \"NORTH\"/fill \"HORIZONTAL\"}");
      userPropetyAttributeRemoveButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/remove\")%>");
    }
    return userPropetyAttributeRemoveButton;
  }

  /**
   * This method initializes editButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getEditButton() {
    if (editButton == null) {
      editButton = new RButton();
      editButton.setName("editButton");
      editButton.setStyleProperties("{/fill \"HORIZONTAL\"}");
      editButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/edit\")%>");
    }
    return editButton;
  }

  /**
   * This method initializes groupsOfAUserAttributeCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getGroupsOfAUserAttributeCheckBox() {
    if (groupsOfAUserAttributeCheckBox == null) {
      groupsOfAUserAttributeCheckBox = new RCheckBox();
      groupsOfAUserAttributeCheckBox.setName("groupsOfAUserAttributeCheckBox");
      groupsOfAUserAttributeCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/doNotUse\")%>");
      groupsOfAUserAttributeCheckBox
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/groupsOfUserTooltip\")%>");
    }
    return groupsOfAUserAttributeCheckBox;
  }
}
