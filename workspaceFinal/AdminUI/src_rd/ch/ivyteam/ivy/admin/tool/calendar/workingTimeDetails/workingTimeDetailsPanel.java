package ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

/**
 * <p>
 * workingTimeDetailsPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class workingTimeDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel descriptionLabel = null;
  private RTextField descriptionTextField = null;
  private RTextField startTextField = null;
  private RTextField endTextField = null;
  private RLabel startLabel = null;
  private RLabel endLabel = null;
  private RButton okButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of workingTimeDetailsPanel
   */
  public workingTimeDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes workingTimeDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(281, 111));
    this.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getStartTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getEndTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getStartLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getEndLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes descriptionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptionLabel() {
    if (descriptionLabel == null) {
      descriptionLabel = new RLabel();
      descriptionLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/description\") %>");
      descriptionLabel.setStyleProperties("{/insetsTop \"7\"}");
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
  }

  /**
   * This method initializes descriptionTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDescriptionTextField() {
    if (descriptionTextField == null) {
      descriptionTextField = new RTextField();
      descriptionTextField.setText("");
      descriptionTextField.setMandatory(false);
      descriptionTextField.setStyleProperties("{/insetsTop \"5\"}");
      descriptionTextField.setName("descriptionTextField");
    }
    return descriptionTextField;
  }

  /**
   * This method initializes startTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getStartTextField() {
    if (startTextField == null) {
      startTextField = new RTextField();
      startTextField.setText("");
      startTextField.setMandatory(true);
      startTextField.setValidation("Time_short");
      startTextField.setName("startTextField");
    }
    return startTextField;
  }

  /**
   * This method initializes endTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getEndTextField() {
    if (endTextField == null) {
      endTextField = new RTextField();
      endTextField.setText("");
      endTextField.setMandatory(true);
      endTextField.setValidation("Time_short");
      endTextField.setName("endTextField");
    }
    return endTextField;
  }

  /**
   * This method initializes startLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getStartLabel() {
    if (startLabel == null) {
      startLabel = new RLabel();
      startLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/start\") %>");
      startLabel.setStyleProperties("{/insetsTop \"2\"}");
      startLabel.setName("startLabel");
    }
    return startLabel;
  }

  /**
   * This method initializes endLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getEndLabel() {
    if (endLabel == null) {
      endLabel = new RLabel();
      endLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/end\") %>");
      endLabel.setStyleProperties("{/insetsTop \"2\"}");
      endLabel.setName("endLabel");
    }
    return endLabel;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("<%= ivy.cms.co(\"/Dialogs/general/ok\") %>");
      okButton.setStyle("nice_button");
      okButton.setName("okButton");
      okButton.setEnabler(this);
    }
    return okButton;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
