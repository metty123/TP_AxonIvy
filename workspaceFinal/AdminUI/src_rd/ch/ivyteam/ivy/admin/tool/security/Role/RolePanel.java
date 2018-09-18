package ch.ivyteam.ivy.admin.tool.security.Role;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

/**
 * <p>
 * RolePanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class RolePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel extSecurityNameLabel = null;
  private RTextField extSecurityNameTextField = null;
  private RButton browseButton = null;
  private RButton clearButton = null;
  private RGridLayoutPane buttonPane = null;
  private RButton cancelButton = null;
  private RButton okButton = null;
  private RGridLayoutPane browseButtonPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of RolePanel
   */
  public RolePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes RolePanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getExtSecurityNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getExtSecurityNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 4, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getBrowseButtonPane(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes extSecurityNameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getExtSecurityNameLabel() {
    if (extSecurityNameLabel == null) {
      extSecurityNameLabel = new RLabel();
      extSecurityNameLabel.setText("External Security Name");
      extSecurityNameLabel.setName("extSecurityNameLabel");
    }
    return extSecurityNameLabel;
  }

  /**
   * This method initializes extSecurityNameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getExtSecurityNameTextField() {
    if (extSecurityNameTextField == null) {
      extSecurityNameTextField = new RTextField();
      extSecurityNameTextField.setText("extSecurityNameTextField");
      extSecurityNameTextField.setStyle("fill-horiz-north");
      extSecurityNameTextField.setStyleProperties("{/insetsTop \"5\"}");
      extSecurityNameTextField.setColumns(40);
      extSecurityNameTextField.setName("extSecurityNameTextField");
    }
    return extSecurityNameTextField;
  }

  /**
   * This method initializes browseButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBrowseButton() {
    if (browseButton == null) {
      browseButton = new RButton();
      browseButton.setText("Browse ...");
      browseButton.setName("browseButton");
    }
    return browseButton;
  }

  /**
   * This method initializes clearButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getClearButton() {
    if (clearButton == null) {
      clearButton = new RButton();
      clearButton.setText("Clear");
      clearButton.setName("clearButton");
    }
    return clearButton;
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
          .setStyleProperties("{/anchor \"EAST\"/insetsTop \"15\"/insetsBottom \"5\"/hgap \"5\"/fill \"NONE\"/insetsRight \"5\"}");
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
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
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("Ok");
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes browseButtonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getBrowseButtonPane() {
    if (browseButtonPane == null) {
      browseButtonPane = new RGridLayoutPane();
      browseButtonPane.setName("browseButtonPane");
      browseButtonPane.setStyleProperties("{/hgap \"5\"/insetsLeft \"0\"}");
      browseButtonPane.setStyle("fill-both-border");
      browseButtonPane.add(getBrowseButton());
      browseButtonPane.add(getClearButton());
    }
    return browseButtonPane;
  }
}
