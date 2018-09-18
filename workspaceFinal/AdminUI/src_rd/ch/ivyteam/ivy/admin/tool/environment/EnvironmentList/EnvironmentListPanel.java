package ch.ivyteam.ivy.admin.tool.environment.EnvironmentList;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;

import com.ulcjava.base.application.ULCListSelectionModel;
import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for EnvironmentListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class EnvironmentListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scpEnvironments = null;
  private RList lstEnvironments = null;
  private RToolBar tlbEnvironemt = null;
  private RButton btnDetails = null;
  private RButton btnAdd = null;
  private RButton btnRemove = null;
  private RPopupMenu environmentsPopupMenu = null; // @jve:decl-index=0:visual-constraint="141,24"
  private RMenuItem detailsMenuItem = null;
  private RMenuItem addMenuItem = null;
  private RMenuItem removeMenuItem = null;
  private RButton btnExport = null;
  private RButton btnImport = null;
  private RMenuItem exportMenuItem = null;
  private RMenuItem importMenuItem = null;

  // SONAR-OFF
  /**
   * Create a new instance of EnvironmentListPanel
   */
  public EnvironmentListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes EnvironmentListPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(null);
    this.add(getScpEnvironments(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTlbEnvironemt(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes scpEnvironments
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScpEnvironments() {
    if (scpEnvironments == null) {
      scpEnvironments = new RScrollPane();
      scpEnvironments.setName("scpEnvironments");
      scpEnvironments.setViewPortView(getLstEnvironments());
    }
    return scpEnvironments;
  }

  /**
   * This method initializes lstEnvironments
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RList
   */
  private RList getLstEnvironments() {
    if (lstEnvironments == null) {
      lstEnvironments = new RList();
      lstEnvironments.setName("lstEnvironments");
      lstEnvironments.setSelectionMode(ULCListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      lstEnvironments.setSelectionBackground(new Color(188, 216, 255));
      lstEnvironments.setName("lstEnvironments");
      lstEnvironments.setComponentPopupMenu(getEnvironmentsPopupMenu());
      lstEnvironments
          .setModelConfiguration("{/result \"result=(entry.getName().contains(\\\"Default\\\") ? entry.getName().substring(0,7):entry.getName())\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
    }
    return lstEnvironments;
  }

  /**
   * This method initializes tlbEnvironemt
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getTlbEnvironemt() {
    if (tlbEnvironemt == null) {
      tlbEnvironemt = new RToolBar();
      tlbEnvironemt.setName("tlbEnvironemt");
      tlbEnvironemt.setFloatable(false);
      tlbEnvironemt.add(getBtnDetails());
      tlbEnvironemt.add(getBtnAdd());
      tlbEnvironemt.add(getBtnRemove());
      tlbEnvironemt.add(getBtnExport());
      tlbEnvironemt.add(getBtnImport());
    }
    return tlbEnvironemt;
  }

  /**
   * This method initializes btnDetails
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnDetails() {
    if (btnDetails == null) {
      btnDetails = new RButton();
      btnDetails.setIconUri("<%=ivy.cms.cr(\"/images/klein/showDetail\")%>");
      btnDetails.setToolTipText("<%=ivy.cms.co(\"/Dialogs/environment/edit\")%>");
      btnDetails.setName("btnDetails");
    }
    return btnDetails;
  }

  /**
   * This method initializes btnAdd
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnAdd() {
    if (btnAdd == null) {
      btnAdd = new RButton();
      btnAdd.setText("");
      btnAdd.setIconUri("<%= ivy.cms.cr(\"/Icons/EnvironmentAdd/16\") %>");
      btnAdd.setToolTipText("<%=ivy.cms.co(\"/Dialogs/environment/add\")%>");
      btnAdd.setName("btnAdd");
    }
    return btnAdd;
  }

  /**
   * This method initializes btnRemove
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnRemove() {
    if (btnRemove == null) {
      btnRemove = new RButton();
      btnRemove.setName("btnRemove");
      btnRemove.setToolTipText("<%=ivy.cms.co(\"/Dialogs/environment/remove\")%>");
      btnRemove.setIconUri("<%= ivy.cms.cr(\"/Icons/EnvironmentDelete/16\") %>");
    }
    return btnRemove;
  }

  /**
   * This method initializes environmentsPopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getEnvironmentsPopupMenu() {
    if (environmentsPopupMenu == null) {
      environmentsPopupMenu = new RPopupMenu();
      environmentsPopupMenu.setName("environmentsPopupMenu");
      environmentsPopupMenu.add(getDetailsMenuItem());
      environmentsPopupMenu.add(getAddMenuItem());
      environmentsPopupMenu.add(getRemoveMenuItem());
      environmentsPopupMenu.add(getExportMenuItem());
      environmentsPopupMenu.add(getImportMenuItem());
    }
    return environmentsPopupMenu;
  }

  /**
   * This method initializes detailsMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getDetailsMenuItem() {
    if (detailsMenuItem == null) {
      detailsMenuItem = new RMenuItem();
      detailsMenuItem.setText("<%=ivy.cms.co(\"/Dialogs/environment/edit\")%>");
      detailsMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/showDetail\")%>");
      detailsMenuItem.setName("detailsMenuItem");
    }
    return detailsMenuItem;
  }

  /**
   * This method initializes addMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getAddMenuItem() {
    if (addMenuItem == null) {
      addMenuItem = new RMenuItem();
      addMenuItem.setText("<%=ivy.cms.co(\"/Dialogs/environment/add\")%>");
      addMenuItem.setIconUri("<%= ivy.cms.cr(\"/Icons/EnvironmentAdd/16\") %>");
      addMenuItem.setName("addMenuItem");
    }
    return addMenuItem;
  }

  /**
   * This method initializes removeMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getRemoveMenuItem() {
    if (removeMenuItem == null) {
      removeMenuItem = new RMenuItem();
      removeMenuItem.setText("<%=ivy.cms.co(\"/Dialogs/environment/remove\")%>");
      removeMenuItem.setIconUri("<%= ivy.cms.cr(\"/Icons/EnvironmentDelete/16\") %>");
      removeMenuItem.setName("removeMenuItem");
    }
    return removeMenuItem;
  }

  /**
   * This method initializes btnExport
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnExport() {
    if (btnExport == null) {
      btnExport = new RButton();
      btnExport.setName("btnExport");
      btnExport.setToolTipText("Export Environment(s)");
      btnExport.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/export\")%>");
    }
    return btnExport;
  }

  /**
   * This method initializes btnImport
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnImport() {
    if (btnImport == null) {
      btnImport = new RButton();
      btnImport.setName("btnImport");
      btnImport.setToolTipText("Import Environment(s)");
      btnImport.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/import\")%>");
    }
    return btnImport;
  }

  /**
   * This method initializes exportMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getExportMenuItem() {
    if (exportMenuItem == null) {
      exportMenuItem = new RMenuItem();
      exportMenuItem.setText("<%=ivy.cms.co(\"/Dialogs/environment/export\")%>");
      exportMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/export\")%>");
      exportMenuItem.setName("exportMenuItem");
    }
    return exportMenuItem;
  }

  /**
   * This method initializes importMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getImportMenuItem() {
    if (importMenuItem == null) {
      importMenuItem = new RMenuItem();
      importMenuItem.setText("<%=ivy.cms.co(\"/Dialogs/environment/import\")%>");
      importMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/import\")%>");
      importMenuItem.setName("importMenuItem");
    }
    return importMenuItem;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
