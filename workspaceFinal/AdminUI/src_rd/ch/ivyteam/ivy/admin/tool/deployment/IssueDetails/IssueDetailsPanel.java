package ch.ivyteam.ivy.admin.tool.deployment.IssueDetails;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

/**
 * RichDialog panel implementation for IssueDetailsPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class IssueDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel messageLabel = null;
  private RTextArea descriptionTextArea = null;
  private RTextArea howToFixTextArea = null;
  private RLabel severityValueLabel = null;
  private RLabel severityLabel = null;
  private RLabel descriptionLabel = null;
  private RLabel howToFixLabel = null;
  private RButton okButton = null;
  private RTextField messageTextField = null;
  private RScrollPane descriptionScrollPane = null;
  private RScrollPane howToFixScrollPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of IssueDetailsPanel
   */
  public IssueDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes IssueDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(326, 277));
    this.add(getMessageLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSeverityValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSeverityLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getHowToFixLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMessageTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getHowToFixScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes messageLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getMessageLabel() {
    if (messageLabel == null) {
      messageLabel = new RLabel();
      messageLabel.setText("Message");
      messageLabel.setName("messageLabel");
    }
    return messageLabel;
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
      descriptionTextArea.setStyle("both");
      descriptionTextArea.setEditable(false);
      descriptionTextArea.setWrapStyleWord(true);
      descriptionTextArea.setLineWrap(true);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes howToFixTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getHowToFixTextArea() {
    if (howToFixTextArea == null) {
      howToFixTextArea = new RTextArea();
      howToFixTextArea.setText("RTextArea");
      howToFixTextArea.setStyle("both");
      howToFixTextArea.setEditable(false);
      howToFixTextArea.setLineWrap(true);
      howToFixTextArea.setWrapStyleWord(true);
      howToFixTextArea.setName("howToFixTextArea");
    }
    return howToFixTextArea;
  }

  /**
   * This method initializes severityValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getSeverityValueLabel() {
    if (severityValueLabel == null) {
      severityValueLabel = new RLabel();
      severityValueLabel.setIconUri("<%= in.issue %>");
      severityValueLabel.setStyle("right");
      severityValueLabel.setName("severityValueLabel");
    }
    return severityValueLabel;
  }

  /**
   * This method initializes severityLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getSeverityLabel() {
    if (severityLabel == null) {
      severityLabel = new RLabel();
      severityLabel.setText("Severity");
      severityLabel.setName("severityLabel");
    }
    return severityLabel;
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
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
  }

  /**
   * This method initializes howToFixLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getHowToFixLabel() {
    if (howToFixLabel == null) {
      howToFixLabel = new RLabel();
      howToFixLabel.setText("How to fix");
      howToFixLabel.setName("howToFixLabel");
    }
    return howToFixLabel;
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
      okButton.setStyle("normalRight");
      okButton.setDefaultCapable(true);
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes messageTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getMessageTextField() {
    if (messageTextField == null) {
      messageTextField = new RTextField();
      messageTextField.setText("messageTextField");
      messageTextField.setEditable(false);
      messageTextField.setName("messageTextField");
    }
    return messageTextField;
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
      descriptionScrollPane.setStyle("right");
      descriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return descriptionScrollPane;
  }

  /**
   * This method initializes howToFixScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getHowToFixScrollPane() {
    if (howToFixScrollPane == null) {
      howToFixScrollPane = new RScrollPane();
      howToFixScrollPane.setName("howToFixScrollPane");
      howToFixScrollPane.setStyle("right");
      howToFixScrollPane.setViewPortView(getHowToFixTextArea());
    }
    return howToFixScrollPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
