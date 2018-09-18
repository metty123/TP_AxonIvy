package ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

/**
 * <p>
 * ProcessExecutionSettingsPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class ProcessExecutionSettingsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel defaultExecutionLabel = null;
  private RComboBox defaultExecutionComboBox = null;
  private RLabel infoLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of ProcessExecutionSettingsPanel
   */
  public ProcessExecutionSettingsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ProcessExecutionSettingsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/security/ProcessExecutionSettings/tooltip\")%>");
    this.add(getDefaultExecutionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDefaultExecutionComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getInfoLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes defaultExecutionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDefaultExecutionLabel() {
    if (defaultExecutionLabel == null) {
      defaultExecutionLabel = new RLabel();
      defaultExecutionLabel.setText("Default Pages Implementor");
      defaultExecutionLabel
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/security/ProcessExecutionSettings/tooltip\")%>");
      defaultExecutionLabel.setName("defaultExecutionLabel");
    }
    return defaultExecutionLabel;
  }

  /**
   * This method initializes defaultExecutionComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getDefaultExecutionComboBox() {
    if (defaultExecutionComboBox == null) {
      defaultExecutionComboBox = new RComboBox();
      defaultExecutionComboBox.setName("defaultExecutionComboBox");
      defaultExecutionComboBox
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/security/ProcessExecutionSettings/tooltip\")%>");
      defaultExecutionComboBox
          .setModelConfiguration("{/result \"result=IF(entry.isEmpty(), \\\"<System Default>\\\", entry)\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
    }
    return defaultExecutionComboBox;
  }

  /**
   * This method initializes infoLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getInfoLabel() {
    if (infoLabel == null) {
      infoLabel = new RLabel();
      infoLabel.setText("Choose the process model that implements the default pages.");
      infoLabel.setStyleProperties("{/insetsBottom \"5\"}");
      infoLabel.setName("infoLabel");
    }
    return infoLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
