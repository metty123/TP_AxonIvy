package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelection;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.ULCFlowLayoutPane;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Font;

/**
 * <p>
 * TargetSelectionPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class TargetSelectionPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scrollPane = null;
  private RButton btnRefresh = null;
  private RButton btnDetail = null;
  private RButton btnEnvironments = null;
  private RCheckBox ckActivateAll = null;
  private RCheckBox ckReleaseAll = null;
  private RGridBagLayoutPane gridBagLayoutPane = null;
  private RFlowLayoutPane topFlowLayoutPane = null;
  private RFlowLayoutPane bottomFlowLayoutPane = null;
  private RLabel lblApplicationAsTarget = null;

  // SONAR-OFF
  /**
   * Create a new instance of TargetSelectionPanel
   */
  public TargetSelectionPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes TargetSelectionPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler = new RFiller();
    Filler.setPreferredSize(new com.ulcjava.base.application.util.Dimension(5, 20));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(563, 247));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getTopFlowLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, 1.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getBottomFlowLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, 1.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getLblApplicationAsTarget(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes scrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane() {
    if (scrollPane == null) {
      scrollPane = new RScrollPane();
      scrollPane.setName("scrollPane");
      scrollPane.setViewPortView(getGridBagLayoutPane());
    }
    return scrollPane;
  }

  /**
   * This method initializes btnRefresh
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnRefresh() {
    if (btnRefresh == null) {
      btnRefresh = new RButton();
      btnRefresh.setText("<%=ivy.cms.co(\"/Dialogs/general/refresh\")%>");
      btnRefresh
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnRefresh.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/refresh\")%>");
      btnRefresh.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnRefresh.setName("btnRefresh");
    }
    return btnRefresh;
  }

  /**
   * This method initializes btnDetail
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnDetail() {
    if (btnDetail == null) {
      btnDetail = new RButton();
      btnDetail.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/details\")%>");
      btnDetail
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnDetail.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/showDetail\")%>");
      btnDetail.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnDetail.setName("btnDetail");
    }
    return btnDetail;
  }

  /**
   * This method initializes btnEnvironments
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnEnvironments() {
    if (btnEnvironments == null) {
      btnEnvironments = new RButton();
      btnEnvironments
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/environments\")%>\n");
      btnEnvironments
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"120\"/preferredSizeHeight \"27\"}");
      btnEnvironments.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/showDetail\")%>");
      btnEnvironments.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnEnvironments.setName("btnEnvironments");
    }
    return btnEnvironments;
  }

  /**
   * This method initializes ckActivateAll
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCkActivateAll() {
    if (ckActivateAll == null) {
      ckActivateAll = new RCheckBox();
      ckActivateAll.setName("ckActivateAll");
      ckActivateAll
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/checkBoxName/activateAllTooltip\")%>");
      ckActivateAll.setStyleProperties("{/insetsBottom \"0\"}");
      ckActivateAll
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/checkBoxName/activateAll\")%>");
    }
    return ckActivateAll;
  }

  /**
   * This method initializes ckReleaseAll
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCkReleaseAll() {
    if (ckReleaseAll == null) {
      ckReleaseAll = new RCheckBox();
      ckReleaseAll.setName("ckReleaseAll");
      ckReleaseAll
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/checkBoxName/releaseAllTooltip\")%>");
      ckReleaseAll.setStyleProperties("{/insetsBottom \"0\"}");
      ckReleaseAll
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/checkBoxName/releaseAll\")%>");
    }
    return ckReleaseAll;
  }

  /**
   * This method initializes gridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getGridBagLayoutPane() {
    if (gridBagLayoutPane == null) {
      gridBagLayoutPane = new RGridBagLayoutPane();
      gridBagLayoutPane.setName("gridBagLayoutPane");
    }
    return gridBagLayoutPane;
  }

  /**
   * add action listener to check box event for enable/disable next button
   * 
   * @param checkBox
   */
  public void addActionListener(RCheckBox checkBox) {
    checkBox.addActionListener(new IActionListener() {

      @Override
      public void actionPerformed(ActionEvent event) {
        callMethod();
      }
    });
  }

  /**
   * call setEnableNextButton method
   */
  private void callMethod() {
    try {
      this.getPanelAPI().callMethod("setEnableNextButtonByCheckBox", null);
    } catch (Exception e) {
      Ivy.log().error(e.getMessage());
    }
  }

  public void addActionListenerForFirstCheckbox(final RCheckBox checkBox) {
    checkBox.addActionListener(new IActionListener() {

      @Override
      public void actionPerformed(ActionEvent event) {
        callMethodForFirstCheckbox(checkBox.isSelected());
      }
    });
  }

  private void callMethodForFirstCheckbox(boolean isCheckboxSelected) {
    try {
      String methodToCall = isCheckboxSelected ? "selectAllApps" : "deselectAllApps";
      this.getPanelAPI().callMethod(methodToCall, null);
    } catch (Exception e) {
      Ivy.log().error(e.getMessage());
    }
  }

  /**
   * This method initializes topFlowLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getTopFlowLayoutPane() {
    if (topFlowLayoutPane == null) {
      topFlowLayoutPane = new RFlowLayoutPane();
      topFlowLayoutPane.setName("topFlowLayoutPane");
      topFlowLayoutPane.setAlignment(ULCFlowLayoutPane.RIGHT);
      topFlowLayoutPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/weightX \"1\"}");
      topFlowLayoutPane.add(getBtnEnvironments());
      topFlowLayoutPane.add(getBtnDetail());
      topFlowLayoutPane.add(getBtnRefresh());
    }
    return topFlowLayoutPane;
  }

  /**
   * This method initializes bottomFlowLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getBottomFlowLayoutPane() {
    if (bottomFlowLayoutPane == null) {
      bottomFlowLayoutPane = new RFlowLayoutPane();
      bottomFlowLayoutPane.setName("bottomFlowLayoutPane");
      bottomFlowLayoutPane.setAlignment(ULCFlowLayoutPane.LEFT);
      bottomFlowLayoutPane.setStyleProperties("{/anchor \"CENTER\"/fill \"HORIZONTAL\"/weightY \"0\"/weightX \"1\"}");
      bottomFlowLayoutPane.add(getCkActivateAll());
      bottomFlowLayoutPane.add(getCkReleaseAll());
    }
    return bottomFlowLayoutPane;
  }

  /**
   * This method initializes lblApplicationAsTarget
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblApplicationAsTarget() {
    if (lblApplicationAsTarget == null) {
      lblApplicationAsTarget = new RLabel();
      lblApplicationAsTarget
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/applicationAsTarget\")%>");
      lblApplicationAsTarget.setFont(new Font("Segoe UI", 1, 20));
      lblApplicationAsTarget.setStyleProperties("{/anchor \"CENTER\"}");
      lblApplicationAsTarget.setName("lblApplicationAsTarget");
    }
    return lblApplicationAsTarget;
  }


} // @jve:decl-index=0:visual-constraint="10,10"
