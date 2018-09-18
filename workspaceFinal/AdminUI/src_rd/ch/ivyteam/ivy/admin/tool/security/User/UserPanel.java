package ch.ivyteam.ivy.admin.tool.security.User;

import ch.ivyteam.ivy.rd.common.EmailNotificationSettings.EmailNotificationSettingsPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for UserPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class UserPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel nameLabel = null;
  private RLabel fullNameLabel = null;
  private RLabel passwordLabel = null;
  private RLabel eMailAddressLabel = null;
  private RTextField nameTextField = null;
  private RTextField fullNameTextField = null;
  private RTextField eMailAddressTextField = null;
  private RPasswordField passwordPasswordField = null;
  private RGridLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RLabel confirmPwdLabel = null;
  private RPasswordField confirmPasswordField = null;
  private RGridBagLayoutPane namePanel = null;
  private @EmbeddedRichDialog(EmailNotificationSettingsPanel.class)
  ULCContainer emailNotificationSettingsPanel = null;

  // SONAR-OFF
  /**
   * Create a new instance of UserPanel
   */
  public UserPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UserPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setStyleProperties("{/insetsTop \"5\"}");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(577, 490));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 7, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getNamePanel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getEmailNotificationSettingsPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
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
   * This method initializes fullNameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFullNameLabel() {
    if (fullNameLabel == null) {
      fullNameLabel = new RLabel();
      fullNameLabel.setText("Full Name");
      fullNameLabel.setName("fullNameLabel");
    }
    return fullNameLabel;
  }

  /**
   * This method initializes passwordLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPasswordLabel() {
    if (passwordLabel == null) {
      passwordLabel = new RLabel();
      passwordLabel.setText("Password");
      passwordLabel.setName("passwordLabel");
    }
    return passwordLabel;
  }

  /**
   * This method initializes eMailAddressLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getEMailAddressLabel() {
    if (eMailAddressLabel == null) {
      eMailAddressLabel = new RLabel();
      eMailAddressLabel.setText("E-Mail Address");
      eMailAddressLabel.setName("eMailAddressLabel");
    }
    return eMailAddressLabel;
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
      nameTextField.setMandatory(true);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes fullNameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getFullNameTextField() {
    if (fullNameTextField == null) {
      fullNameTextField = new RTextField();
      fullNameTextField.setText("RTextField");
      fullNameTextField.setName("fullNameTextField");
    }
    return fullNameTextField;
  }

  /**
   * This method initializes eMailAddressTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getEMailAddressTextField() {
    if (eMailAddressTextField == null) {
      eMailAddressTextField = new RTextField();
      eMailAddressTextField.setText("RTextField");
      eMailAddressTextField.setMandatory(false);
      eMailAddressTextField.setName("eMailAddressTextField");
    }
    return eMailAddressTextField;
  }

  /**
   * This method initializes passwordPasswordField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField
   */
  private RPasswordField getPasswordPasswordField() {
    if (passwordPasswordField == null) {
      passwordPasswordField = new RPasswordField();
      passwordPasswordField.setText("RPasswordField");
      passwordPasswordField.setName("passwordPasswordField");
    }
    return passwordPasswordField;
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
      buttonPane.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsRight \"5\"}");
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
      okButton.setText("Ok");
      okButton.setDefaultCapable(true);
      okButton.setStyleProperties("{/insetsTop \"5\"/insetsLeft \"5\"}");
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
      cancelButton.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes confirmPwdLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getConfirmPwdLabel() {
    if (confirmPwdLabel == null) {
      confirmPwdLabel = new RLabel();
      confirmPwdLabel.setText("Confirm Password");
      confirmPwdLabel.setName("confirmPwdLabel");
    }
    return confirmPwdLabel;
  }

  /**
   * This method initializes confirmPasswordField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField
   */
  private RPasswordField getConfirmPasswordField() {
    if (confirmPasswordField == null) {
      confirmPasswordField = new RPasswordField();
      confirmPasswordField.setText("RPasswordField");
      confirmPasswordField.setName("confirmPasswordField");
    }
    return confirmPasswordField;
  }

  /**
   * This method initializes namePanel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getNamePanel() {
    if (namePanel == null) {
      namePanel = new RGridBagLayoutPane();
      namePanel.setName("namePanel");
      namePanel.setBorder(BorderFactory.createTitledBorder(null, "User Information",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      namePanel.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
      namePanel.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getFullNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getFullNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getEMailAddressLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getPasswordLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getConfirmPwdLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getEMailAddressTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getPasswordPasswordField(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      namePanel.add(getConfirmPasswordField(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return namePanel;
  }

  /**
   * This method initializes emailNotificationSettingsPanel
   * 
   * @return ch.ivyteam.ivy.rd.common.EmailNotificationSettings.EmailNotificationSettingsPanel
   */
  private ULCContainer getEmailNotificationSettingsPanel() {
    if (emailNotificationSettingsPanel == null) {
      emailNotificationSettingsPanel = new EmailNotificationSettingsPanel();
      emailNotificationSettingsPanel.setName("emailNotificationSettingsPanel");
      emailNotificationSettingsPanel
          .setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
    }
    return emailNotificationSettingsPanel;
  }
} // @jve:decl-index=0:visual-constraint="12,16"
