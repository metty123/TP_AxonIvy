package ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

import com.ulcjava.base.application.ULCTextField;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.util.Color;

/**
 * <p>
 * UpdateLibraryVersionPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class UpdateLibraryVersionPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel requiredProjectId = null;
  private RTextField txtRequiredProjectId = null;
  private RLabel maxVersionLabel = null;
  private RLabel minVersionLabel = null;
  private RCheckBox specifyMaxCheckBox = null;
  private RCheckBox specifyMinCheckBox = null;
  private RLabel VersionLabel = null;
  private RTextField txtMax = null;
  private RCheckBox maxInclusiveChkbox = null;
  private RCheckBox minInclusiveChkBx = null;
  private RLabel maxVersionLbl = null;
  private RTextField txtMin = null;
  private RGridLayoutPane buttonPane = null;
  private RButton updateBttn = null;
  private RButton cancelButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of UpdateLibraryVersionPanel
   */
  public UpdateLibraryVersionPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UpdateLibraryVersionPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler4 = new RFiller();
    Filler4.setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/fill \"VERTICAL\"}");
    RFiller Filler2 = new RFiller();
    Filler2.setStyleProperties("{/fill \"HORIZONTAL\"}");
    this.add(Filler4, new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getRequiredProjectId(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTxtRequiredProjectId(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getMaxVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMinVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSpecifyMaxCheckBox(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, -5, 0, 0), 0, 0));
    this.add(getSpecifyMinCheckBox(), new com.ulcjava.base.application.GridBagConstraints(1, 6, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, -5, 0, 0), 0, 0));
    this.add(getVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMaxInclusiveChkbox(), new com.ulcjava.base.application.GridBagConstraints(2, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(-5, -5, 0, 0), 0, 0));
    this.add(getTxtMax(), new com.ulcjava.base.application.GridBagConstraints(2, 3, 2, 1, 0.0D, 0.0D, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getMinInclusiveChkBx(), new com.ulcjava.base.application.GridBagConstraints(2, 8, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(-5, -5, 0, 0), 0, 0));
    this.add(getMaxVersionLbl(), new com.ulcjava.base.application.GridBagConstraints(1, 7, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTxtMin(), new com.ulcjava.base.application.GridBagConstraints(2, 7, 2, 1, -1, 0.0, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(2, 9, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler2, new com.ulcjava.base.application.GridBagConstraints(5, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
  }

  /**
   * This method initializes requiredProjectId
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getRequiredProjectId() {
    if (requiredProjectId == null) {
      requiredProjectId = new RLabel();
      requiredProjectId.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/prjID\")%>");
      requiredProjectId.setName("requiredProjectId");
    }
    return requiredProjectId;
  }

  /**
   * This method initializes txtRequiredProjectId
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxtRequiredProjectId() {
    if (txtRequiredProjectId == null) {
      txtRequiredProjectId = new RTextField();
      txtRequiredProjectId.setText("");
      txtRequiredProjectId.setPreferredSize(new com.ulcjava.base.application.util.Dimension(250, 22));
      txtRequiredProjectId.setEditable(false);
      txtRequiredProjectId.setStyleProperties("{/fill \"HORIZONTAL\"}");
      txtRequiredProjectId.setName("txtRequiredProjectId");
    }
    return txtRequiredProjectId;
  }

  /**
   * This method initializes maxVersionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getMaxVersionLabel() {
    if (maxVersionLabel == null) {
      maxVersionLabel = new RLabel();
      maxVersionLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/maxVersion\")%>");
      maxVersionLabel.setName("maxVersionLabel");
    }
    return maxVersionLabel;
  }

  /**
   * This method initializes minVersionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getMinVersionLabel() {
    if (minVersionLabel == null) {
      minVersionLabel = new RLabel();
      minVersionLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/minVersion\")%>");
      minVersionLabel.setName("minVersionLabel");
    }
    return minVersionLabel;
  }

  /**
   * This method initializes specifyMaxCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getSpecifyMaxCheckBox() {
    if (specifyMaxCheckBox == null) {
      specifyMaxCheckBox = new RCheckBox();
      specifyMaxCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/specify\")%>");
      specifyMaxCheckBox.setName("specifyMaxCheckBox");
    }
    return specifyMaxCheckBox;
  }

  /**
   * This method initializes specifyMinCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getSpecifyMinCheckBox() {
    if (specifyMinCheckBox == null) {
      specifyMinCheckBox = new RCheckBox();
      specifyMinCheckBox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/specify\")%>");
      specifyMinCheckBox.setName("specifyMinCheckBox");
    }
    return specifyMinCheckBox;
  }

  /**
   * This method initializes VersionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getVersionLabel() {
    if (VersionLabel == null) {
      VersionLabel = new RLabel();
      VersionLabel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/version\")%>");
      VersionLabel
          .setStyleProperties("{/anchor \"WEST\"/insetsBottom \"0\"/insetsTop \"0\"/insetsRight \"0\"/insetsLeft \"0\"}");
      VersionLabel.setName("VersionLabel");
    }
    return VersionLabel;
  }

  /**
   * This method initializes txtMax
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxtMax() {
    if (txtMax == null) {
      txtMax = new RTextField();
      txtMax.setText("1");
      txtMax.setHorizontalAlignment(ULCTextField.LEFT);
      txtMax.setOpaque(false);
      txtMax.setStyleProperties("{/fill \"HORIZONTAL\"}");
      txtMax.setPreferredSize(new com.ulcjava.base.application.util.Dimension(169, 27));
      txtMax.setMandatory(false);
      txtMax.setEditable(false);
      txtMax.setFont(new Font("Tahoma", 0, 11));
      txtMax.setSelectedTextColor(Color.darkGray);
      txtMax.setName("txtMax");
    }
    return txtMax;
  }

  /**
   * This method initializes maxInclusiveChkbox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getMaxInclusiveChkbox() {
    if (maxInclusiveChkbox == null) {
      maxInclusiveChkbox = new RCheckBox();
      maxInclusiveChkbox.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/inclusive\")%>");
      maxInclusiveChkbox.setEnabled(false);
      maxInclusiveChkbox.setName("maxInclusiveChkbox");
    }
    return maxInclusiveChkbox;
  }

  /**
   * This method initializes minInclusiveChkBx
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getMinInclusiveChkBx() {
    if (minInclusiveChkBx == null) {
      minInclusiveChkBx = new RCheckBox();
      minInclusiveChkBx.setText("Inclusive");
      minInclusiveChkBx.setEnabled(false);
      minInclusiveChkBx.setName("minInclusiveChkBx");
    }
    return minInclusiveChkBx;
  }

  /**
   * This method initializes maxVersionLbl
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getMaxVersionLbl() {
    if (maxVersionLbl == null) {
      maxVersionLbl = new RLabel();
      maxVersionLbl.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/version\")%>");
      maxVersionLbl
          .setStyleProperties("{/anchor \"WEST\"/insetsBottom \"0\"/insetsTop \"0\"/insetsRight \"0\"/insetsLeft \"0\"}");
      maxVersionLbl.setName("maxVersionLbl");
    }
    return maxVersionLbl;
  }

  /**
   * This method initializes txtMin
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxtMin() {
    if (txtMin == null) {
      txtMin = new RTextField();
      txtMin.setText("1");
      txtMin.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"1\"/weightX \"0\"}");
      txtMin.setPreferredSize(new com.ulcjava.base.application.util.Dimension(169, 27));
      txtMin.setMandatory(false);
      txtMin.setEditable(false);
      txtMin.setName("txtMin");
    }
    return txtMin;
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
      updateBttn.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/finish\")%>");
      updateBttn.setStyle("border-all");
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
      cancelButton.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/cancel\")%>");
      cancelButton.setStyle("border-all");
      cancelButton.setText("<%=ivy.cms.co(\"/Dialogs/general/cancel\")%>");
    }
    return cancelButton;
  }
} // @jve:decl-index=0:visual-constraint="131,84"
