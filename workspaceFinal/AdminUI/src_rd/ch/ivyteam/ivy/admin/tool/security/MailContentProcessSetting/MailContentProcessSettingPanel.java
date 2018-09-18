package ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * <p>
 * MailContentProcessSettingPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class MailContentProcessSettingPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel describtionLabel = null;
  private RLabel creatorLabel = null;
  private RComboBox creatorComboBox = null;

  // SONAR-OFF
  /**
   * Create a new instance of MailContentProcessSettingPanel
   */
  public MailContentProcessSettingPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes MailContentProcessSettingPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setBorder(BorderFactory.createTitledBorder(null, "Email Content Creation Processes",
        ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
        new Color(23, 64, 140)));
    this.setToolTipText("<html>Use this setting to provide customer specific notification mail contents.<br>\nYou can choose from process models that contain a process with a mail kind specific signature.<br>\nThe specific process of the chosen process model will be called by the mail notification subsystem<br>\nif a mail content should be created.<br>\nThe process is then responsible to create an html page as response<br>\nwhich will be taken as the content of the mail.<br>\nIf no process model is chosen the notification mails will have a standard content.</html>\n");
    this.add(getDescribtionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCreatorLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCreatorComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes describtionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescribtionLabel() {
    if (describtionLabel == null) {
      describtionLabel = new RLabel();
      describtionLabel
          .setText("<html>Choose the process model which is responsible for the creation of the mail notification content.</html>");
      describtionLabel.setStyleProperties("{/insetsBottom \"10\"}");
      describtionLabel.setName("describtionLabel");
    }
    return describtionLabel;
  }

  /**
   * This method initializes creatorLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getCreatorLabel() {
    if (creatorLabel == null) {
      creatorLabel = new RLabel();
      creatorLabel.setText("Mail Content Creator");
      creatorLabel.setName("creatorLabel");
    }
    return creatorLabel;
  }

  /**
   * This method initializes creatorComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCreatorComboBox() {
    if (creatorComboBox == null) {
      creatorComboBox = new RComboBox();
      creatorComboBox.setName("creatorComboBox");
      creatorComboBox
          .setModelConfiguration("{/result \"result=IF(entry.isEmpty(), \\\"<System Default>\\\", entry)\"/version \"3.0\"/icon \"\"/tooltip \"\"/emptyTableText \"\"}");
    }
    return creatorComboBox;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
