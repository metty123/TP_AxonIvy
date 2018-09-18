package ch.ivyteam.ivy.admin.tool.NewProcessModel;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

/**
 * RichDialog panel implementation for NewProcessModelPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class NewProcessModelPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel nameLabel = null;
  private RLabel descriptionLabel = null;
  private RTextField nameTextField = null;
  private RTextArea descriptionTextArea = null;
  private RBoxPane buttonBoxPane = null;
  private RButton createButton = null;
  private RButton cancelButton = null;
  private RScrollPane descriptionScrollPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of NewProcessModelPanel
   */
  public NewProcessModelPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes NewProcessModelPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(272, 224));
    this.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
    this.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonBoxPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
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
      nameLabel.setText("Name");
      nameLabel.setStyleProperties("{/insetsTop \"5\"}");
      nameLabel.setName("nameLabel");
    }
    return nameLabel;
  }

  /**
   * This method initializes descriptionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptionLabel() {
    if (descriptionLabel == null) {
      descriptionLabel = new RLabel();
      descriptionLabel.setText("Description");
      descriptionLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
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
      nameTextField.setStyleProperties("{/insetsTop \"5\"}");
      nameTextField.setMandatory(true);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes descriptionTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescriptionTextArea() {
    if (descriptionTextArea == null) {
      descriptionTextArea = new RTextArea();
      descriptionTextArea.setText("RTextArea");
      descriptionTextArea.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"}");
      descriptionTextArea.setWrapStyleWord(true);
      descriptionTextArea.setLineWrap(true);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes buttonBoxPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane
   */
  private RBoxPane getButtonBoxPane() {
    if (buttonBoxPane == null) {
      buttonBoxPane = new RBoxPane();
      buttonBoxPane.setName("buttonBoxPane");
      buttonBoxPane.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsRight \"5\"}");
      buttonBoxPane.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getCreateButton());
      buttonBoxPane.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getCancelButton());
    }
    return buttonBoxPane;
  }

  /**
   * This method initializes createButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCreateButton() {
    if (createButton == null) {
      createButton = new RButton();
      createButton.setText("Create");
      createButton.setDefaultCapable(true);
      createButton.setEnabler(getNameTextField());
      createButton.setName("createButton");
    }
    return createButton;
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
   * This method initializes descriptionScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDescriptionScrollPane() {
    if (descriptionScrollPane == null) {
      descriptionScrollPane = new RScrollPane();
      descriptionScrollPane.setName("descriptionScrollPane");
      descriptionScrollPane.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      descriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return descriptionScrollPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
