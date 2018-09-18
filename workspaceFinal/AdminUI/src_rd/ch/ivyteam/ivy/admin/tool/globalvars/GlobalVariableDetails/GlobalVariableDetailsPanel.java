package ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

/**
 * RichDialog panel implementation for GlobalVariableDetailsPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class GlobalVariableDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblHeader = null;
  private RLabel lblName = null;
  private RLabel lblDescription = null;
  private RLabel lblValue = null;
  private RTextField txfName = null;
  private RScrollPane scpDescription = null;
  private RTextArea txaDescription = null;
  private RTextField txfValue = null;
  private RFlowLayoutPane pnlButtonBar = null;
  private RButton btnSave = null;
  private RButton btnCancel = null;
  private RLabel lblDefaultValue = null;
  private RTextField txfDefaultValue = null;
  private RButton btnResetToDefault = null;

  // SONAR-OFF
  /**
   * Create a new instance of GlobalVariableDetailsPanel
   */
  public GlobalVariableDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes GlobalVariableDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(477, 293));
    this.add(getLblHeader(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblName(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblDescription(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblValue(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTxfName(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getScpDescription(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTxfValue(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPnlButtonBar(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblDefaultValue(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTxfDefaultValue(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes lblHeader
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblHeader() {
    if (lblHeader == null) {
      lblHeader = new RLabel();
      lblHeader.setText("<%= ivy.cms.co(\"/Dialogs/globalVariables/header\") %>");
      lblHeader.setStyle("mainCaption");
      lblHeader.setIconUri("<%= ivy.cms.cr(\"/Icons/GlobalVariable/48\") %>");
      lblHeader.setName("lblHeader");
    }
    return lblHeader;
  }

  /**
   * This method initializes lblName
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblName() {
    if (lblName == null) {
      lblName = new RLabel();
      lblName.setText("<%= ivy.cms.co(\"/Dialogs/globalVariables/name\") %>");
      lblName.setName("lblName");
    }
    return lblName;
  }

  /**
   * This method initializes lblDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblDescription() {
    if (lblDescription == null) {
      lblDescription = new RLabel();
      lblDescription.setText("<%= ivy.cms.co(\"/Dialogs/globalVariables/description\") %>");
      lblDescription.setName("lblDescription");
    }
    return lblDescription;
  }

  /**
   * This method initializes lblValue
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblValue() {
    if (lblValue == null) {
      lblValue = new RLabel();
      lblValue.setText("<%= ivy.cms.co(\"/Dialogs/globalVariables/value\") %>");
      lblValue.setName("lblValue");
    }
    return lblValue;
  }

  /**
   * This method initializes txfName
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxfName() {
    if (txfName == null) {
      txfName = new RTextField();
      txfName.setText("");
      txfName.setName("txfName");
    }
    return txfName;
  }

  /**
   * This method initializes scpDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScpDescription() {
    if (scpDescription == null) {
      scpDescription = new RScrollPane();
      scpDescription.setName("scpDescription");
      scpDescription.setViewPortView(getTxaDescription());
    }
    return scpDescription;
  }

  /**
   * This method initializes txaDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getTxaDescription() {
    if (txaDescription == null) {
      txaDescription = new RTextArea();
      txaDescription.setText("");
      txaDescription.setName("txaDescription");
    }
    return txaDescription;
  }

  /**
   * This method initializes txfValue
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxfValue() {
    if (txfValue == null) {
      txfValue = new RTextField();
      txfValue.setText("");
      txfValue.setName("txfValue");
    }
    return txfValue;
  }

  /**
   * This method initializes pnlButtonBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getPnlButtonBar() {
    if (pnlButtonBar == null) {
      pnlButtonBar = new RFlowLayoutPane();
      pnlButtonBar.setName("pnlButtonBar");
      pnlButtonBar.setStyle("buttonBarRight");
      pnlButtonBar.add(getBtnResetToDefault());
      pnlButtonBar.add(getBtnSave());
      pnlButtonBar.add(getBtnCancel());
    }
    return pnlButtonBar;
  }

  /**
   * This method initializes btnSave
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnSave() {
    if (btnSave == null) {
      btnSave = new RButton();
      btnSave.setText("<%= ivy.cms.co(\"/Dialogs/general/save\") %>");
      btnSave.setIconUri("<%= ivy.cms.cr(\"/images/klein/ok\") %>");
      btnSave.setDefaultCapable(true);
      btnSave.setName("btnSave");
    }
    return btnSave;
  }

  /**
   * This method initializes btnCancel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnCancel() {
    if (btnCancel == null) {
      btnCancel = new RButton();
      btnCancel.setText("<%= ivy.cms.co(\"/Dialogs/general/cancel\") %>");
      btnCancel.setIconUri("<%= ivy.cms.cr(\"/images/klein/delete\") %>");
      btnCancel.setName("btnCancel");
    }
    return btnCancel;
  }

  /**
   * This method initializes lblDefaultValue
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblDefaultValue() {
    if (lblDefaultValue == null) {
      lblDefaultValue = new RLabel();
      lblDefaultValue.setText("<%= ivy.cms.co(\"/Dialogs/globalVariables/defaultValue\") %>");
      lblDefaultValue.setName("lblDefaultValue");
    }
    return lblDefaultValue;
  }

  /**
   * This method initializes txfDefaultValue
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxfDefaultValue() {
    if (txfDefaultValue == null) {
      txfDefaultValue = new RTextField();
      txfDefaultValue.setText("");
      txfDefaultValue.setEditable(false);
      txfDefaultValue.setName("txfDefaultValue");
    }
    return txfDefaultValue;
  }

  /**
   * This method initializes btnResetToDefault
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnResetToDefault() {
    if (btnResetToDefault == null) {
      btnResetToDefault = new RButton();
      btnResetToDefault.setText("<%= ivy.cms.co(\"/Dialogs/general/resetToDefault\") %>");
      btnResetToDefault.setIconUri("<%= ivy.cms.cr(\"/images/klein/reset\") %>");
      btnResetToDefault.setName("btnResetToDefault");
    }
    return btnResetToDefault;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
