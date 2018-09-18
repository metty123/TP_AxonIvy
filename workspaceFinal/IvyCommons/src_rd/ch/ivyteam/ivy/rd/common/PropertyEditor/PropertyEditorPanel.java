package ch.ivyteam.ivy.rd.common.PropertyEditor;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;

/**
 * RichDialog panel implementation for PropertyEditorPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class PropertyEditorPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel nameLabel = null;
  private RLabel valueLabel = null;
  private RTextField nameTextField = null;
  private RTextField valueTextField = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RFlowLayoutPane buttonPane = null;

  /**
   * Create a new instance of PropertyEditorPanel
   */
  public PropertyEditorPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes PropertyEditorPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(222, 93));
    this.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getValueLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getValueTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 2, 1, -1, -1,
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
   * This method initializes valueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getValueLabel() {
    if (valueLabel == null) {
      valueLabel = new RLabel();
      valueLabel.setText("Value:");
      valueLabel.setName("valueLabel");
    }
    return valueLabel;
  }

  /**
   * This method initializes nameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNameTextField() {
    if (nameTextField == null) {
      nameTextField = new RTextField();
      nameTextField.setText("");
      nameTextField.setMandatory(true);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes valueTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getValueTextField() {
    if (valueTextField == null) {
      valueTextField = new RTextField();
      valueTextField.setText("");
      valueTextField.setName("valueTextField");
    }
    return valueTextField;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("OK");
      okButton.setDefaultCapable(false);
      okButton.setPreferredSize(new com.ulcjava.base.application.util.Dimension(47, 25));
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
      cancelButton.setPreferredSize(new com.ulcjava.base.application.util.Dimension(47, 25));
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RFlowLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane.setStyleProperties("{/fill \"HORIZONTAL\"/alignment \"RIGHT\"/weightX \"1\"}");
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
