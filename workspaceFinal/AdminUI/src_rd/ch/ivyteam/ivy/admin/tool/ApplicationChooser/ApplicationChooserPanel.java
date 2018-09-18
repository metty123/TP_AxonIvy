package ch.ivyteam.ivy.admin.tool.ApplicationChooser;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;

/**
 * RichDialog panel implementation for ApplicationChooserPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ApplicationChooserPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblHeader = null;
  private RLabel lblApplications = null;
  private RComboBox cboApplication = null;
  private RFlowLayoutPane pnlButtonBar = null;
  private RButton btnOk = null;
  private RButton btnCancel = null;

  // SONAR-OFF
  /**
   * Create a new instance of ApplicationChooserPanel
   */
  public ApplicationChooserPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ApplicationChooserPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(331, 125));
    this.add(getLblHeader(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblApplications(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCboApplication(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPnlButtonBar(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
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
      lblHeader.setText("<%= ivy.cms.co(\"/Dialogs/application/chooser/header\") %>");
      lblHeader.setStyle("mainCaption");
      lblHeader.setIconUri("<%= ivy.cms.cr(\"/Icons/Application/48\") %>");
      lblHeader.setName("lblHeader");
    }
    return lblHeader;
  }

  /**
   * This method initializes lblApplications
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblApplications() {
    if (lblApplications == null) {
      lblApplications = new RLabel();
      lblApplications.setText("<%= ivy.cms.co(\"/Dialogs/application/chooser/applications\") %>");
      lblApplications.setName("lblApplications");
    }
    return lblApplications;
  }

  /**
   * This method initializes cboApplication
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCboApplication() {
    if (cboApplication == null) {
      cboApplication = new RComboBox();
      cboApplication.setName("cboApplication");
      cboApplication
          .setModelConfiguration("{/result \"result=entry.getName()\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
    }
    return cboApplication;
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
      pnlButtonBar.add(getBtnOk());
      pnlButtonBar.add(getBtnCancel());
    }
    return pnlButtonBar;
  }

  /**
   * This method initializes btnOk
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnOk() {
    if (btnOk == null) {
      btnOk = new RButton();
      btnOk.setText("<%= ivy.cms.co(\"/Dialogs/general/ok\") %>");
      btnOk.setIconUri("<%= ivy.cms.cr(\"/images/klein/ok\") %>");
      btnOk.setDefaultCapable(true);
      btnOk.setName("btnOk");
    }
    return btnOk;
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
} // @jve:decl-index=0:visual-constraint="10,10"
