package ch.ivyteam.ivy.admin.tool.UpdateRequireProject;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

/**
 * <p>
 * UpdateRequireProjectPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class UpdateRequireProjectPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel resolvedLabel = null;
  private RComboBox resolvedProjectCbox = null;
  private RGridLayoutPane buttonPane = null;
  private RButton updateBttn = null;
  private RButton cancelButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of UpdateRequireProjectPanel
   */
  public UpdateRequireProjectPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UpdateRequireProjectPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler = new RFiller();
    Filler.setPreferredSize(new com.ulcjava.base.application.util.Dimension(5, 15));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(400, 120));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getResolvedLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getResolvedProjectCbox(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHEAST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
  }

  /**
   * This method initializes resolvedLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getResolvedLabel() {
    if (resolvedLabel == null) {
      resolvedLabel = new RLabel();
      resolvedLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/resolvedDependentProject\")%>");
      resolvedLabel.setName("resolvedLabel");
    }
    return resolvedLabel;
  }

  /**
   * This method initializes resolvedProjectCbox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getResolvedProjectCbox() {
    if (resolvedProjectCbox == null) {
      resolvedProjectCbox = new RComboBox();
      resolvedProjectCbox.setName("resolvedProjectCbox");
      resolvedProjectCbox
          .setModelConfiguration("{/result \"result=IF(entry.isResolved(), \\\"Version: \\\" + entry.getQualifiedVersion() + \\r\\n\\\", PMV: \\\" + entry.getProcessModelVersion().getVersionName() + \\r\\n\\\" (\\\" + entry.getProcessModelVersion().getActivityState() +\\r\\n\\\", \\\"+entry.getProcessModelVersion().getReleaseState()+\\\")\\\" , \\r\\n\\\"Unknown\\\")\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
      resolvedProjectCbox.setName("resolvedProjectCbox");
    }
    return resolvedProjectCbox;
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
      buttonPane.setStyle("buttons");
      buttonPane
          .setStyleProperties("{/anchor \"SOUTHEAST\"/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
      buttonPane.setHgap(5);
      buttonPane.add(getUpdateBttn());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes updateBttn
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUpdateBttn() {
    if (updateBttn == null) {
      updateBttn = new RButton();
      updateBttn.setName("updateBttn");
      updateBttn.setStyle("border-all");
      updateBttn.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/finish\")%>");
      updateBttn.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/update\")%>");
    }
    return updateBttn;
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
      cancelButton.setStyle("border-all");
      cancelButton.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/cancel\")%>");
      cancelButton.setText("<%=ivy.cms.co(\"/Dialogs/general/cancel\")%>");
    }
    return cancelButton;
  }
} // @jve:decl-index=0:visual-constraint="111,88"
