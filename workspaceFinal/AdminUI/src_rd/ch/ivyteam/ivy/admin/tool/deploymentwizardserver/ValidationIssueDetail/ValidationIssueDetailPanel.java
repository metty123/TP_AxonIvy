package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.util.Color;

/**
 * <p>
 * ValidationIssueDetailPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class ValidationIssueDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblMessage = null;
  private RTextField txtMessage = null;
  private RLabel lblSeverity = null;
  private RLabel lblDescription = null;
  private RLabel lblHowToFixDescription = null;
  private RScrollPane scrollPaneHowToFix = null;
  private RScrollPane scrollPaneDescription = null;
  private RTextArea txtHowToFix = null;
  private RTextArea txtDescription = null;
  private RButton btnOk = null;
  private RLabel lblSeverityWithIcon = null;
  private RGridLayoutPane GridLayoutPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of ValidationIssueDetailPanel
   */
  public ValidationIssueDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ValidationIssueDetailPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(686, 279));
    RFiller Filler1 = new RFiller();
    Filler1.setPreferredSize(new com.ulcjava.base.application.util.Dimension(0, 28));
    Filler1
        .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"1\"/preferredSizeHeight \"28\"}");
    this.add(getLblMessage(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 0.0D, 0.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5, 5, 0, 5),
        0, 0));
    this.add(getTxtMessage(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, 1.0D, 0.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getLblSeverity(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5, 5, 5, 5),
        0, 0));
    this.add(getLblDescription(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(8, 5, 0, 5),
        0, 0));
    this.add(getLblHowToFixDescription(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(8, 5, 0, 5),
        0, 0));
    this.add(getScrollPaneHowToFix(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getScrollPaneDescription(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblSeverityWithIcon(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(5, 0,
            5, 0), 0, 0));
    this.add(getGridLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 0, 5, 5), 0, 0));
    this.add(Filler1, new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes lblMessage
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblMessage() {
    if (lblMessage == null) {
      lblMessage = new RLabel();
      lblMessage.setName("lblMessage");
      lblMessage.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/message\")%>");
    }
    return lblMessage;
  }

  /**
   * This method initializes txtMessage
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxtMessage() {
    if (txtMessage == null) {
      txtMessage = new RTextField();
      txtMessage.setText("");
      txtMessage.setEditable(false);
      txtMessage.setSelectionColor(new Color(188, 216, 255));
      txtMessage.setName("txtMessage");
    }
    return txtMessage;
  }

  /**
   * This method initializes lblSeverity
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSeverity() {
    if (lblSeverity == null) {
      lblSeverity = new RLabel();
      lblSeverity
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/severity\")%>");
      lblSeverity.setName("lblSeverity");
    }
    return lblSeverity;
  }

  /**
   * This method initializes lblDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblDescription() {
    if (lblDescription == null) {
      lblDescription = new RLabel();
      lblDescription
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/description\")%>");
      lblDescription.setName("lblDescription");
    }
    return lblDescription;
  }

  /**
   * This method initializes lblHowToFixDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblHowToFixDescription() {
    if (lblHowToFixDescription == null) {
      lblHowToFixDescription = new RLabel();
      lblHowToFixDescription
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/howToFix\")%>");
      lblHowToFixDescription.setName("lblHowToFixDescription");
    }
    return lblHowToFixDescription;
  }

  /**
   * This method initializes scrollPaneHowToFix
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPaneHowToFix() {
    if (scrollPaneHowToFix == null) {
      scrollPaneHowToFix = new RScrollPane();
      scrollPaneHowToFix.setName("scrollPaneHowToFix");
      scrollPaneHowToFix.setViewPortView(getTxtHowToFix());
    }
    return scrollPaneHowToFix;
  }

  /**
   * This method initializes scrollPaneDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPaneDescription() {
    if (scrollPaneDescription == null) {
      scrollPaneDescription = new RScrollPane();
      scrollPaneDescription.setName("scrollPaneDescription");
      scrollPaneDescription.setViewPortView(getTxtDescription());
    }
    return scrollPaneDescription;
  }

  /**
   * This method initializes txtHowToFix
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getTxtHowToFix() {
    if (txtHowToFix == null) {
      txtHowToFix = new RTextArea();
      txtHowToFix.setText("");
      txtHowToFix.setEditable(false);
      txtHowToFix.setLineWrap(true);
      txtHowToFix.setName("txtHowToFix");
    }
    return txtHowToFix;
  }

  /**
   * This method initializes txtDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getTxtDescription() {
    if (txtDescription == null) {
      txtDescription = new RTextArea();
      txtDescription.setText("");
      txtDescription.setEditable(false);
      txtDescription.setLineWrap(true);
      txtDescription.setName("txtDescription");
    }
    return txtDescription;
  }

  /**
   * This method initializes btnOk
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnOk() {
    if (btnOk == null) {
      btnOk = new RButton();
      btnOk
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnOk.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 27));
      btnOk.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnOk.setText("<%=ivy.cms.co(\"/Dialogs/general/ok\")%>");
      btnOk.setIconUri("<%=ivy.cms.cr(\"/images/klein/ok\")%>");
      btnOk.setName("btnOk");
    }
    return btnOk;
  }

  /**
   * This method initializes lblSeverityWithIcon
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSeverityWithIcon() {
    if (lblSeverityWithIcon == null) {
      lblSeverityWithIcon = new RLabel();
      lblSeverityWithIcon.setName("lblSeverityWithIcon");
      lblSeverityWithIcon.setText("Severity");
    }
    return lblSeverityWithIcon;
  }

  /**
   * This method initializes GridLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getGridLayoutPane() {
    if (GridLayoutPane == null) {
      GridLayoutPane = new RGridLayoutPane();
      GridLayoutPane.setName("GridLayoutPane");
      GridLayoutPane.add(getBtnOk());
    }
    return GridLayoutPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
