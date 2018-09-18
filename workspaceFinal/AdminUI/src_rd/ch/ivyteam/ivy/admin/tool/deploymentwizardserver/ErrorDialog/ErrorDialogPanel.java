package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.ULCFlowLayoutPane;

/**
 * <p>
 * ErrorDialogPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class ErrorDialogPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblIcon = null;
  private RTextArea txtErrorMessage = null;
  private RScrollPane errorMessageScrollPane = null;
  private RButton btnOk = null;
  private RFlowLayoutPane FlowLayoutPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of ErrorDialogPanel
   */
  public ErrorDialogPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ErrorDialogPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(400, 120));
    this.add(getLblIcon(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 0.0D, 0.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getErrorMessageScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getFlowLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, 1.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
  }

  /**
   * This method initializes lblIcon
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblIcon() {
    if (lblIcon == null) {
      lblIcon = new RLabel();
      lblIcon.setName("lblIcon");
      lblIcon.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/errorLarge\")%>");
    }
    return lblIcon;
  }

  /**
   * This method initializes txtErrorMessage
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getTxtErrorMessage() {
    if (txtErrorMessage == null) {
      txtErrorMessage = new RTextArea();
      txtErrorMessage.setText("");
      txtErrorMessage.setLineWrap(true);
      txtErrorMessage.setEditable(false);
      txtErrorMessage.setWrapStyleWord(true);
      txtErrorMessage.setName("txtErrorMessage");
    }
    return txtErrorMessage;
  }

  /**
   * This method initializes errorMessageScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getErrorMessageScrollPane() {
    if (errorMessageScrollPane == null) {
      errorMessageScrollPane = new RScrollPane();
      errorMessageScrollPane.setName("errorMessageScrollPane");
      errorMessageScrollPane.setViewPortView(getTxtErrorMessage());
    }
    return errorMessageScrollPane;
  }

  /**
   * This method initializes btnOk
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnOk() {
    if (btnOk == null) {
      btnOk = new RButton();
      btnOk.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnOk.setPreferredSize(new com.ulcjava.base.application.util.Dimension(80, 27));
      btnOk.setStyleProperties("{/anchor \"WEST\"}");
      btnOk.setText("<%=ivy.cms.co(\"/Dialogs/general/ok\")%>");
      btnOk.setIconUri("<%=ivy.cms.cr(\"/images/klein/ok\")%>");
      btnOk.setName("btnOk");
    }
    return btnOk;
  }

  /**
   * This method initializes FlowLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getFlowLayoutPane() {
    if (FlowLayoutPane == null) {
      FlowLayoutPane = new RFlowLayoutPane();
      FlowLayoutPane.setName("FlowLayoutPane");
      FlowLayoutPane.setAlignment(ULCFlowLayoutPane.CENTER);
      FlowLayoutPane.setStyleProperties("{/anchor \"CENTER\"/fill \"HORIZONTAL\"/weightX \"1\"}");
      FlowLayoutPane.add(getBtnOk());
    }
    return FlowLayoutPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
