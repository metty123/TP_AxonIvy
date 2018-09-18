package ch.ivyteam.ivy.admin.tool.security.SettingsPanel;

import ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingPanel;
import ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsPanel;
import ch.ivyteam.ivy.rd.common.EmailNotificationSettings.EmailNotificationSettingsPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * <p>
 * SettingsPanelPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class SettingsPanelPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private @EmbeddedRichDialog(EmailNotificationSettingsPanel.class)
  ULCContainer emailNotificationSettingsPanel = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RGridLayoutPane buttonPane = null;
  private @EmbeddedRichDialog(MailContentProcessSettingPanel.class)
  ULCContainer mailContentProcessSettingPanel = null;
  private @EmbeddedRichDialog(ProcessExecutionSettingsPanel.class)
  ULCContainer processExecutionSettingsPanel = null;

  // SONAR-OFF
  /**
   * Create a new instance of SettingsPanelPanel
   */
  public SettingsPanelPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes SettingsPanelPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getEmailNotificationSettingsPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMailContentProcessSettingPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getProcessExecutionSettingsPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
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
          .setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsTop \"5\"/fill \"BOTH\"/insetsRight \"5\"/insetsLeft \"5\"}");
    }
    return emailNotificationSettingsPanel;
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
      okButton.setStyle("fill-both-grab-border");
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

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RGridLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane
          .setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsTop \"5\"/hgap \"5\"/insetsRight \"5\"/weightY \"1\"/insetsLeft \"5\"}");
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes mailContentProcessSettingPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingPanel
   */
  private ULCContainer getMailContentProcessSettingPanel() {
    if (mailContentProcessSettingPanel == null) {
      mailContentProcessSettingPanel = new MailContentProcessSettingPanel();
      mailContentProcessSettingPanel.setName("mailContentProcessSettingPanel");
    }
    return mailContentProcessSettingPanel;
  }

  /**
   * This method initializes processExecutionSettingsPanel, an embedded RichDialog. The created object might have a
   * different type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getProcessExecutionSettingsPanel() {
    if (processExecutionSettingsPanel == null) {
      processExecutionSettingsPanel = RichDialogPanelFactory.create(ProcessExecutionSettingsPanel.class);
      processExecutionSettingsPanel.setName("processExecutionSettingsPanel");
      processExecutionSettingsPanel.setBorder(BorderFactory.createTitledBorder(null, "Default Page Processes",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
    }
    return processExecutionSettingsPanel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
