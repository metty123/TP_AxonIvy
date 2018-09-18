package ch.ivyteam.ivy.admin.tool.JndiSecuritySystem;

import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxPanel;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;

/**
 * <p>
 * SecuritySystemPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class JndiSecuritySystemPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane serverGridBagLayoutPane = null;
  private RLabel hostLabel = null;
  private RTextField hostTextField = null;
  private RLabel portLabel = null;
  private RTextField portTextField = null;
  private RCheckBox defaultPortCheckBox = null;
  private RBoxLayoutPane connectionPropertyPane = null;
  private RCheckBox useSslCheckBox = null;
  private RCheckBox useLdapConnectionPoolCheckBox = null;
  private RLabel authenticationKindLabel = null;
  private RComboBox authenticationKindComboBox = null;
  private RLabel userNameLabel = null;
  private RLabel passwordLabel = null;
  private RPasswordField passwordField = null;
  private RTextField userNameTextField = null;
  private RGridBagLayoutPane userImportPane = null;
  private RLabel defaultContextLabel = null;
  private RTextField defaultContextTextField = null;
  private RLabel userGroupLabel = null;
  private RTextField userGroupTextField = null;
  private RLabel userFilterLabel = null;
  private RTextField userFilterTextField = null;
  private RCheckBox userGroupCheckBox = null;
  private RLabel synchronizationTimeLabel = null;
  private RButton browseImportContextButton = null;
  private RButton importUserGroupBrowseButton = null;
  private @EmbeddedRichDialog(DayTimeComboboxPanel.class)
  ULCContainer dayTimeComboboxPanel = null;

  /**
   * Create a new instance of SecuritySystemPanel
   */
  public JndiSecuritySystemPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes SecuritySystemPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getServerGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getUserImportPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes serverGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getServerGridBagLayoutPane() {
    if (serverGridBagLayoutPane == null) {
      serverGridBagLayoutPane = new RGridBagLayoutPane();
      serverGridBagLayoutPane.setBorder(BorderFactory.createTitledBorder("Server"));
      serverGridBagLayoutPane.setName("serverGridBagLayoutPane");
      serverGridBagLayoutPane.add(getHostLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getHostTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 2, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getPortLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getPortTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getDefaultPortCheckBox(), new com.ulcjava.base.application.GridBagConstraints(2, 1,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getConnectionPropertyPane(), new com.ulcjava.base.application.GridBagConstraints(1,
          6, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getAuthenticationKindLabel(), new com.ulcjava.base.application.GridBagConstraints(0,
          2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getAuthenticationKindComboBox(), new com.ulcjava.base.application.GridBagConstraints(
          1, 2, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getUserNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getPasswordLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getPasswordField(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 2, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      serverGridBagLayoutPane.add(getUserNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 2,
          1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return serverGridBagLayoutPane;
  }

  /**
   * This method initializes hostLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getHostLabel() {
    if (hostLabel == null) {
      hostLabel = new RLabel();
      hostLabel.setName("hostLabel");
      hostLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/host\")%>");
    }
    return hostLabel;
  }

  /**
   * This method initializes hostTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getHostTextField() {
    if (hostTextField == null) {
      hostTextField = new RTextField();
      hostTextField.setName("hostTextField");
      hostTextField.setText("RTextField");
      hostTextField.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/host\")%>");
      hostTextField.setMandatory(false);
      hostTextField.setValidation("URL");
      hostTextField.setColumns(30);
    }
    return hostTextField;
  }

  /**
   * This method initializes portLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPortLabel() {
    if (portLabel == null) {
      portLabel = new RLabel();
      portLabel.setName("portLabel");
      portLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/port\")%>");
    }
    return portLabel;
  }

  /**
   * This method initializes portTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getPortTextField() {
    if (portTextField == null) {
      portTextField = new RTextField();
      portTextField.setName("portTextField");
      portTextField.setText("RTextField");
      portTextField.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/port\")%>");
      portTextField.setMandatory(false);
      portTextField.setValidation("PortNumber");
      portTextField.setColumns(30);
    }
    return portTextField;
  }

  /**
   * This method initializes defaultPortCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getDefaultPortCheckBox() {
    if (defaultPortCheckBox == null) {
      defaultPortCheckBox = new RCheckBox();
      defaultPortCheckBox.setName("defaultPortCheckBox");
      defaultPortCheckBox
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/selectPortDefault\")%>");
      defaultPortCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/default\")%>");
    }
    return defaultPortCheckBox;
  }

  /**
   * This method initializes connectionPropertyPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxLayoutPane
   */
  private RBoxLayoutPane getConnectionPropertyPane() {
    if (connectionPropertyPane == null) {
      connectionPropertyPane = new RBoxLayoutPane(RBoxLayoutPane.X_AXIS);
      connectionPropertyPane.setName("connectionPropertyPane");
      connectionPropertyPane.setStyleProperties("{/anchor \"EAST\"}");
      connectionPropertyPane.add(getUseSslCheckBox());
      connectionPropertyPane.add(getUseLdapConnectionPoolCheckBox());
    }
    return connectionPropertyPane;
  }

  /**
   * This method initializes useSslCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getUseSslCheckBox() {
    if (useSslCheckBox == null) {
      useSslCheckBox = new RCheckBox();
      useSslCheckBox.setName("useSslCheckBox");
      useSslCheckBox.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/ssl\")%>");
      useSslCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/useSSL\")%>");
    }
    return useSslCheckBox;
  }

  /**
   * This method initializes useLdapConnectionPoolCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getUseLdapConnectionPoolCheckBox() {
    if (useLdapConnectionPoolCheckBox == null) {
      useLdapConnectionPoolCheckBox = new RCheckBox();
      useLdapConnectionPoolCheckBox.setName("useLdapConnectionPoolCheckBox");
      useLdapConnectionPoolCheckBox
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/ldapConnectionPool\")%>");
      useLdapConnectionPoolCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/useLDAP\")%>");
    }
    return useLdapConnectionPoolCheckBox;
  }

  /**
   * This method initializes authenticationKindLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getAuthenticationKindLabel() {
    if (authenticationKindLabel == null) {
      authenticationKindLabel = new RLabel();
      authenticationKindLabel.setName("authenticationKindLabel");
      authenticationKindLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/AuthenticationKind\")%>");
    }
    return authenticationKindLabel;
  }

  /**
   * This method initializes authenticationKindComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getAuthenticationKindComboBox() {
    if (authenticationKindComboBox == null) {
      authenticationKindComboBox = new RComboBox();
      authenticationKindComboBox.setName("authenticationKindComboBox");
      authenticationKindComboBox
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/authenKind\")%>");
      authenticationKindComboBox.setModelConfiguration("{/result \"\"/version \"2.0\"/icon \"\"/tooltip \"\"}");
    }
    return authenticationKindComboBox;
  }

  /**
   * This method initializes userNameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUserNameLabel() {
    if (userNameLabel == null) {
      userNameLabel = new RLabel();
      userNameLabel.setName("userNameLabel");
      userNameLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/userName\")%>");
    }
    return userNameLabel;
  }

  /**
   * This method initializes passwordLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPasswordLabel() {
    if (passwordLabel == null) {
      passwordLabel = new RLabel();
      passwordLabel.setName("passwordLabel");
      passwordLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/password\")%>");
    }
    return passwordLabel;
  }

  /**
   * This method initializes passwordField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField
   */
  private RPasswordField getPasswordField() {
    if (passwordField == null) {
      passwordField = new RPasswordField();
      passwordField.setName("passwordField");
      passwordField.setText("RPasswordField");
      passwordField.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/passwd\")%>");
      passwordField.setColumns(30);
    }
    return passwordField;
  }

  /**
   * This method initializes userNameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getUserNameTextField() {
    if (userNameTextField == null) {
      userNameTextField = new RTextField();
      userNameTextField.setName("userNameTextField");
      userNameTextField.setText("RTextField");
      userNameTextField.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/username\")%>");
      userNameTextField.setColumns(30);
    }
    return userNameTextField;
  }

  /**
   * This method initializes userImportPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getUserImportPane() {
    if (userImportPane == null) {
      userImportPane = new RGridBagLayoutPane();
      userImportPane.setBorder(BorderFactory.createTitledBorder("User Import"));
      userImportPane.setName("userImportPane");
      userImportPane.add(getDefaultContextLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getDefaultContextTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 2, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getUserGroupLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getUserGroupTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getUserFilterLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getUserFilterTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 2, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getUserGroupCheckBox(), new com.ulcjava.base.application.GridBagConstraints(3, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getSynchronizationTimeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getBrowseImportContextButton(), new com.ulcjava.base.application.GridBagConstraints(3, 0, 1,
          1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getImportUserGroupBrowseButton(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1,
          1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      userImportPane.add(getDayTimeComboboxPanel(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER, 0, new com.ulcjava.base.application.util.Insets(
              0, 0, 0, 0), 0, 0));
    }
    return userImportPane;
  }

  /**
   * This method initializes defaultContextLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDefaultContextLabel() {
    if (defaultContextLabel == null) {
      defaultContextLabel = new RLabel();
      defaultContextLabel.setName("defaultContextLabel");
      defaultContextLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/importContext\")%>");
    }
    return defaultContextLabel;
  }

  /**
   * This method initializes defaultContextTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDefaultContextTextField() {
    if (defaultContextTextField == null) {
      defaultContextTextField = new RTextField();
      defaultContextTextField.setName("defaultContextTextField");
      defaultContextTextField.setText("RTextField");
      defaultContextTextField
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/importContext\")%>");
      defaultContextTextField.setColumns(30);
    }
    return defaultContextTextField;
  }

  /**
   * This method initializes userGroupLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUserGroupLabel() {
    if (userGroupLabel == null) {
      userGroupLabel = new RLabel();
      userGroupLabel.setName("userGroupLabel");
      userGroupLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/importUserOfGroup\")%>");
    }
    return userGroupLabel;
  }

  /**
   * This method initializes userGroupTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getUserGroupTextField() {
    if (userGroupTextField == null) {
      userGroupTextField = new RTextField();
      userGroupTextField.setName("userGroupTextField");
      userGroupTextField.setText("RTextField");
      userGroupTextField
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/importUserOfGroup\")%>");
      userGroupTextField.setColumns(20);
    }
    return userGroupTextField;
  }

  /**
   * This method initializes userFilterLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUserFilterLabel() {
    if (userFilterLabel == null) {
      userFilterLabel = new RLabel();
      userFilterLabel.setName("userFilterLabel");
      userFilterLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/userFilter\")%>");
    }
    return userFilterLabel;
  }

  /**
   * This method initializes userFilterTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getUserFilterTextField() {
    if (userFilterTextField == null) {
      userFilterTextField = new RTextField();
      userFilterTextField.setName("userFilterTextField");
      userFilterTextField.setText("RTextField");
      userFilterTextField.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/userFilter\")%>");
      userFilterTextField.setColumns(30);
    }
    return userFilterTextField;
  }

  /**
   * This method initializes userGroupCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getUserGroupCheckBox() {
    if (userGroupCheckBox == null) {
      userGroupCheckBox = new RCheckBox();
      userGroupCheckBox.setName("userGroupCheckBox");
      userGroupCheckBox
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/selectUserImport\")%>");
      userGroupCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/doNotUse\")%>");
    }
    return userGroupCheckBox;
  }

  /**
   * This method initializes synchronizationTimeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getSynchronizationTimeLabel() {
    if (synchronizationTimeLabel == null) {
      synchronizationTimeLabel = new RLabel();
      synchronizationTimeLabel.setName("synchronizationTimeLabel");
      synchronizationTimeLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/synchTime\")%>");
      synchronizationTimeLabel
          .setToolTipText("Synchronization will only be executed once a day. If you reconfigure the time it will not be executed today if it was already executed today.");
    }
    return synchronizationTimeLabel;
  }

  /**
   * This method initializes browseImportContextButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBrowseImportContextButton() {
    if (browseImportContextButton == null) {
      browseImportContextButton = new RButton();
      browseImportContextButton.setName("browseImportContextButton");
      browseImportContextButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/browse\")%>");
    }
    return browseImportContextButton;
  }

  /**
   * This method initializes importUserGroupBrowseButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getImportUserGroupBrowseButton() {
    if (importUserGroupBrowseButton == null) {
      importUserGroupBrowseButton = new RButton();
      importUserGroupBrowseButton.setName("importUserGroupBrowseButton");
      importUserGroupBrowseButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/browse\")%>");
    }
    return importUserGroupBrowseButton;
  }

  /**
   * This method initializes dayTimeComboboxPanel, an embedded RichDialog. The created object might have a different
   * type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getDayTimeComboboxPanel() {
    if (dayTimeComboboxPanel == null) {
      dayTimeComboboxPanel = RichDialogPanelFactory.create(DayTimeComboboxPanel.class);
      dayTimeComboboxPanel.setName("dayTimeComboboxPanel");
      dayTimeComboboxPanel.setStyleProperties("{/anchor \"WEST\"/fill \"NONE\"/weightY \"0\"/weightX \"0\"}");
    }
    return dayTimeComboboxPanel;
  }
}
