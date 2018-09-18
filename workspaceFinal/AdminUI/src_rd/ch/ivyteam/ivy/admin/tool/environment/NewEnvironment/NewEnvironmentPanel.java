package ch.ivyteam.ivy.admin.tool.environment.NewEnvironment;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

/**
 * <p>
 * NewEnvironmentPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class NewEnvironmentPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel nameLabel = null;
  private RLabel descLabel = null;
  private RTextField nameTextField = null;
  private RTextArea descTextArea = null;
  private RScrollPane descScrollPane = null;
  private RGridLayoutPane okCancelGridLayoutPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of NewEnvironmentPanel
   */
  public NewEnvironmentPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes NewEnvironmentPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(320, 203));
    this.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, 1.0, 0.0,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getDescScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkCancelGridLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes nameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getNameLabel() {
    if (nameLabel == null) {
      nameLabel = new RLabel();
      nameLabel.setText("Name:");
      nameLabel.setName("nameLabel");
    }
    return nameLabel;
  }

  /**
   * This method initializes descLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescLabel() {
    if (descLabel == null) {
      descLabel = new RLabel();
      descLabel.setText("Description:");
      descLabel.setName("descLabel");
    }
    return descLabel;
  }

  /**
   * This method initializes nameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNameTextField() {
    if (nameTextField == null) {
      nameTextField = new RTextField();
      nameTextField.setText("nameTextField");
      nameTextField.setStyleProperties("{/insetsTop \"5\"/insetsLeft \"5\"}");
      nameTextField.setMandatory(true);
      nameTextField.setValidation("StringOneWord");
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes descTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescTextArea() {
    if (descTextArea == null) {
      descTextArea = new RTextArea();
      descTextArea.setText("nameTextArea");
      descTextArea.setLineWrap(true);
      descTextArea.setName("descTextArea");
    }
    return descTextArea;
  }

  /**
   * This method initializes descScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDescScrollPane() {
    if (descScrollPane == null) {
      descScrollPane = new RScrollPane();
      descScrollPane.setName("descScrollPane");
      descScrollPane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"}");
      descScrollPane.setViewPortView(getDescTextArea());
    }
    return descScrollPane;
  }

  /**
   * This method initializes okCancelGridLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getOkCancelGridLayoutPane() {
    if (okCancelGridLayoutPane == null) {
      okCancelGridLayoutPane = new RGridLayoutPane();
      okCancelGridLayoutPane.setName("okCancelGridLayoutPane");
      okCancelGridLayoutPane
          .setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsTop \"5\"/hgap \"5\"/insetsRight \"5\"}");
      okCancelGridLayoutPane.add(getOkButton());
      okCancelGridLayoutPane.add(getCancelButton());
    }
    return okCancelGridLayoutPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setName("okButton");
      okButton.setText("Create");
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
      cancelButton.setText("Cancel");
    }
    return cancelButton;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
