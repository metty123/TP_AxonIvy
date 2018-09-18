package ch.ivyteam.ivy.admin.tool.Activity;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;

import com.ulcjava.base.application.BorderFactory;

/**
 * RichDialog panel implementation for ActivityPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ActivityPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel stateValueLabel = null;
  private RButton activateButton = null;
  private RButton deactivateButton = null;
  private RButton lockButton = null;
  private RBoxPane buttonBoxPane = null;
  private RLabel stateLabel = null;
  private RLabel operationStateLabel = null;
  private RLabel operationStateValueLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of ActivityPanel
   */
  public ActivityPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ActivityPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setBorder(BorderFactory.createTitledBorder("Activity"));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(300, 130));
    this.add(getOperationStateLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOperationStateValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getStateValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonBoxPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getStateLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes stateValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getStateValueLabel() {
    if (stateValueLabel == null) {
      stateValueLabel = new RLabel();
      stateValueLabel.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/fill \"HORIZONTAL\"/weightX \"1\"}");
      stateValueLabel.setText("[Configured activity State]");
      stateValueLabel.setName("stateValueLabel");
    }
    return stateValueLabel;
  }

  /**
   * This method initializes activateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getActivateButton() {
    if (activateButton == null) {
      activateButton = new RButton();
      activateButton.setText("Activate");
      activateButton.setName("activateButton");
    }
    return activateButton;
  }

  /**
   * This method initializes deactivateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeactivateButton() {
    if (deactivateButton == null) {
      deactivateButton = new RButton();
      deactivateButton.setText("Deactivate");
      deactivateButton.setName("deactivateButton");
    }
    return deactivateButton;
  }

  /**
   * This method initializes lockButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getLockButton() {
    if (lockButton == null) {
      lockButton = new RButton();
      lockButton.setText("Lock");
      lockButton.setName("lockButton");
    }
    return lockButton;
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
      buttonBoxPane
          .setStyleProperties("{/anchor \"WEST\"/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/weightX \"1\"}");
      buttonBoxPane.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getActivateButton());
      buttonBoxPane.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getDeactivateButton());
      buttonBoxPane.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getLockButton());
    }
    return buttonBoxPane;
  }

  /**
   * This method initializes stateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getStateLabel() {
    if (stateLabel == null) {
      stateLabel = new RLabel();
      stateLabel.setText("Configured state:");
      stateLabel.setName("stateLabel");
    }
    return stateLabel;
  }

  /**
   * This method initializes operationStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getOperationStateLabel() {
    if (operationStateLabel == null) {
      operationStateLabel = new RLabel();
      operationStateLabel.setText("State:");
      operationStateLabel.setName("operationStateLabel");
    }
    return operationStateLabel;
  }

  /**
   * This method initializes operationStateValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getOperationStateValueLabel() {
    if (operationStateValueLabel == null) {
      operationStateValueLabel = new RLabel();
      operationStateValueLabel.setText("[Activity Operation State]");
      operationStateValueLabel.setName("operationStateValueLabel");
    }
    return operationStateValueLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
