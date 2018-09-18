package ch.ivyteam.ivy.admin.tool.SystemPropertyEditor;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.displays.RCardDisplay;

import com.ulcjava.base.application.ULCFlowLayoutPane;

/**
 * RichDialog panel implementation for SystemPropertyEditorPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class SystemPropertyEditorPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel titleLabel = null;
  private RScrollPane descriptionScrollPane = null;
  private RTextArea descriptionTextArea = null;
  private RGridBagLayoutPane editorPane = null;
  private RFlowLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RButton defaultButton = null;
  private RLabel defaultLabel = null;
  private RLabel valueLabel = null;
  private RLabel defaultValueLabel = null;
  private RCardDisplay editorDisplay = null;
  private RLabel descriptionLabel = null;
  private RButton sendEmailButton = null;
private RLabel restartRequiredLabel = null;
private RCheckBox restartRequired = null;

  // SONAR-OFF
  /**
   * Create a new instance of SystemPropertyEditorPanel
   */
  public SystemPropertyEditorPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes SystemPropertyEditorPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(445,343));
    this.add(getTitleLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getEditorPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, 1.0, 1.0, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes titleLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new RLabel();
      titleLabel.setText("[Property Name]");
      titleLabel.setIconUri("<%=ivy.cms.cr(\"/images/klein/systemProperty\")%>");
      titleLabel.setStyleProperties("{/font {/name \"Arial\"/size \"12\"/style \"BOLD\"}}");
      titleLabel.setName("titleLabel");
    }
    return titleLabel;
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
      descriptionScrollPane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"}");
      descriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return descriptionScrollPane;
  }

  /**
   * This method initializes descriptionTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescriptionTextArea() {
    if (descriptionTextArea == null) {
      descriptionTextArea = new RTextArea();
      descriptionTextArea.setText("[Property Description]");
      descriptionTextArea.setStyleProperties("{/weightY \"1\"}");
      descriptionTextArea.setEditable(false);
      descriptionTextArea.setFocusable(false);
      descriptionTextArea.setPreferredSize(new com.ulcjava.base.application.util.Dimension(170, 100));
      descriptionTextArea.setWrapStyleWord(true);
      descriptionTextArea.setLineWrap(true);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes editorPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getEditorPane() {
    if (editorPane == null) {
      editorPane = new RGridBagLayoutPane();
      editorPane.setName("editorPane");
      editorPane.setStyleProperties("{/weightY \"1\"}");
      editorPane.add(getDefaultLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      editorPane.add(getValueLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      editorPane.add(getDefaultValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      editorPane.add(getEditorDisplay(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, 1.0, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,5,0,0), 0, 0));
      editorPane.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      editorPane.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, 1.0, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.VERTICAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      editorPane.add(getRestartRequiredLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      editorPane.add(getRestartRequired(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.SOUTHWEST, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, -5));
    }
    return editorPane;
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
      buttonPane.setAlignment(ULCFlowLayoutPane.RIGHT);
      buttonPane.setStyleProperties("{/anchor \"EAST\"}");
      buttonPane.add(getSendEmailButton());
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
      buttonPane.add(getDefaultButton());
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
      okButton.setText("OK");
      okButton.setDefaultCapable(true);
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
   * This method initializes defaultButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDefaultButton() {
    if (defaultButton == null) {
      defaultButton = new RButton();
      defaultButton.setText("Use default");
      defaultButton.setName("defaultButton");
    }
    return defaultButton;
  }

  /**
   * This method initializes defaultLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDefaultLabel() {
    if (defaultLabel == null) {
      defaultLabel = new RLabel();
      defaultLabel.setText("Default:");
      defaultLabel.setStyleProperties("{/insetsTop \"5\"}");
      defaultLabel.setName("defaultLabel");
    }
    return defaultLabel;
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
   * This method initializes defaultValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDefaultValueLabel() {
    if (defaultValueLabel == null) {
      defaultValueLabel = new RLabel();
      defaultValueLabel.setText("[Default Value]");
      defaultValueLabel.setStyleProperties("{/insetsTop \"5\"}");
      defaultValueLabel.setName("defaultValueLabel");
    }
    return defaultValueLabel;
  }

  /**
   * This method initializes editorDisplay
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.displays.RCardDisplay
   */
  private RCardDisplay getEditorDisplay() {
    if (editorDisplay == null) {
      editorDisplay = new RCardDisplay();
      editorDisplay.setName("editorDisplay");
      editorDisplay.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
      editorDisplay.setName("editorDisplay");
      editorDisplay.setDisplayId("ch.ivyteam.ivy.admin.tool.SystemPropertyEditor.valueeditor");
    }
    return editorDisplay;
  }

  /**
   * This method initializes descriptionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptionLabel() {
    if (descriptionLabel == null) {
      descriptionLabel = new RLabel();
      descriptionLabel.setText("Description:");
      descriptionLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
  }

  /**
   * This method initializes sendEmailButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSendEmailButton() {
    if (sendEmailButton == null) {
      sendEmailButton = new RButton();
      sendEmailButton.setName("sendEmailButton");
      sendEmailButton.setVisible(false);
      sendEmailButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/button/test\")%>");
      sendEmailButton.setName("sendEmailButton");
    }
    return sendEmailButton;
  }

/**
 * This method initializes restartRequiredLabel	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
 */
private RLabel getRestartRequiredLabel() {
  if (restartRequiredLabel == null) {
    restartRequiredLabel = new RLabel();
    restartRequiredLabel.setText("Restart Required");
    restartRequiredLabel.setStyleProperties("{/insetsTop \"5\"}");
    restartRequiredLabel.setName("restartRequiredLabel");
  }
  return restartRequiredLabel;
}

/**
 * This method initializes restartRequired	
 * 	
 * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox	
 */
private RCheckBox getRestartRequired() {
  if (restartRequired == null) {
    restartRequired = new RCheckBox();
    restartRequired.setText("");
    restartRequired.setStyleProperties("{/insetsBottom \"0\"/insetsTop \"0\"}");
    restartRequired.setName("restartRequired");
  }
  return restartRequired;
}
} // @jve:decl-index=0:visual-constraint="10,10"
