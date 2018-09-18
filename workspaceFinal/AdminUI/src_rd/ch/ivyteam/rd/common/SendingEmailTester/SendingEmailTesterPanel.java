package ch.ivyteam.rd.common.SendingEmailTester;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.util.Color;

/**
 * <p>
 * SendingEmailTesterPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class SendingEmailTesterPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextField receiverTextField = null;
  private RButton sendButton = null;
  private RTextArea messageTextArea = null;
  private RScrollPane messageScrollPane = null;
  private RLabel informLabel = null;
  private RButton closeButton = null;
  private RLabel testResponseLabel = null;

  /**
   * Create a new instance of SendingEmailTesterPanel
   */
  public SendingEmailTesterPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes SendingEmailTesterPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(275, 234));
    this.add(getReceiverTextField(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 5, 0, 0), 0, 0));
    this.add(getMessageScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 2, 1, 1.0, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 5, 5, 5), 0, 0));
    this.add(getSendButton(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getInformLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCloseButton(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTestResponseLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes receiverTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getReceiverTextField() {
    if (receiverTextField == null) {
      receiverTextField = new RTextField();
      receiverTextField.setText("");
      receiverTextField.setMandatory(false);
      receiverTextField.setValidation("EMail");
      receiverTextField.setPromptText("example@email.com");
      receiverTextField.setName("receiverTextField");
    }
    return receiverTextField;
  }

  /**
   * This method initializes sendButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSendButton() {
    if (sendButton == null) {
      sendButton = new RButton();
      sendButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/button/test\")%>");
      sendButton.setStyleProperties("{/usePreferredSizeAsExactSize \"true\"}");
      sendButton.setName("sendButton");
    }
    return sendButton;
  }

  /**
   * This method initializes messageTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getMessageTextArea() {
    if (messageTextArea == null) {
      messageTextArea = new RTextArea();
      messageTextArea.setText("");
      messageTextArea.setBackground(Color.white);
      messageTextArea.setStyle("both");
      messageTextArea.setEditable(false);
      messageTextArea.setEnabled(true);
      messageTextArea.setName("messageTextArea");
    }
    return messageTextArea;
  }

  /**
   * This method initializes messageScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getMessageScrollPane() {
    if (messageScrollPane == null) {
      messageScrollPane = new RScrollPane();
      messageScrollPane.setName("messageScrollPane");
      messageScrollPane.setViewPortView(getMessageTextArea());
    }
    return messageScrollPane;
  }

  /**
   * This method initializes informLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getInformLabel() {
    if (informLabel == null) {
      informLabel = new RLabel();
      informLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/inputTestEmail\")%>");
      informLabel.setName("informLabel");
    }
    return informLabel;
  }

  /**
   * This method initializes closeButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCloseButton() {
    if (closeButton == null) {
      closeButton = new RButton();
      closeButton.setText("<%=ivy.cms.co(\"/Dialogs/general/close\")%>");
      closeButton.setName("closeButton");
    }
    return closeButton;
  }

  /**
   * This method initializes testResponseLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTestResponseLabel() {
    if (testResponseLabel == null) {
      testResponseLabel = new RLabel();
      testResponseLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/testResponse\")%>");
      testResponseLabel.setName("testResponseLabel");
    }
    return testResponseLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
