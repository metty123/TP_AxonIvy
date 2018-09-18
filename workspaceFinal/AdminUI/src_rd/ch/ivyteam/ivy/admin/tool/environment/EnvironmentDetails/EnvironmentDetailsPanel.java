package ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails;

import ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarPanel;
import ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabasePanel;
import ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListPanel;
import ch.ivyteam.ivy.admin.tool.webservice.WebServiceList.WebServiceListPanel;
import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RTabbedPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;
import ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsPanel;

/**
 * RichDialog panel implementation for EnvironmentDetailsPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class EnvironmentDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane pnlEnvironmentGeneral = null;
  private RLabel lblName = null;
  private RTextField txfName = null;
  private RLabel lblDescription = null;
  private RScrollPane scpDescription = null;
  private RTextArea txaDescription = null;
  private RTabbedPane tabEnvironmentSettings = null;
  @EmbeddedRichDialog(GlobalVariableListPanel.class)
  private ULCContainer globalVariableListPanel = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer tabHeaderBarPanel = null;
  private RFlowLayoutPane pnlButtonBar = null;
  private RButton btnSave = null;
  private RButton btnCancel = null;
  @EmbeddedRichDialog(EnvironmentDatabasePanel.class)
  private ULCContainer environmentDatabasePanel = null;
  private WebServiceListPanel webServiceListPanel = null;
  private @EmbeddedRichDialog(EnvironmentCalendarPanel.class)
  ULCContainer environmentCalendarPanel = null;
  private RLabel lblApplication = null;
  private RTextField txfApplication = null;
  private @EmbeddedRichDialog(RestClientsPanel.class) ULCContainer restClientsPanel = null;

  // SONAR-OFF
  /**
   * Create a new instance of EnvironmentDetailsPanel
   */
  public EnvironmentDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes EnvironmentDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(585, 407));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(653, 421));
    this.add(getPnlEnvironmentGeneral(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, 1.0, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTabEnvironmentSettings(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTabHeaderBarPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPnlButtonBar(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes pnlEnvironmentGeneral
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getPnlEnvironmentGeneral() {
    if (pnlEnvironmentGeneral == null) {
      pnlEnvironmentGeneral = new RGridBagLayoutPane();
      pnlEnvironmentGeneral.setName("pnlEnvironmentGeneral");
      pnlEnvironmentGeneral.setBorder(BorderFactory.createTitledBorder(null, "General",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      pnlEnvironmentGeneral.add(getLblName(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlEnvironmentGeneral.add(getTxfName(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlEnvironmentGeneral.add(getLblDescription(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlEnvironmentGeneral.add(getScpDescription(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlEnvironmentGeneral.add(getLblApplication(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlEnvironmentGeneral.add(getTxfApplication(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return pnlEnvironmentGeneral;
  }

  /**
   * This method initializes lblName
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblName() {
    if (lblName == null) {
      lblName = new RLabel();
      lblName.setText("<%= ivy.cms.co(\"/Dialogs/environment/name\") %>");
      lblName.setName("lblName");
    }
    return lblName;
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
      txfName.setMandatory(true);
      txfName.setEditable(true);
      txfName.setName("txfName");
    }
    return txfName;
  }

  /**
   * This method initializes lblDescription
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblDescription() {
    if (lblDescription == null) {
      lblDescription = new RLabel();
      lblDescription.setText("<%= ivy.cms.co(\"/Dialogs/environment/description\") %>");
      lblDescription.setName("lblDescription");
    }
    return lblDescription;
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
      txaDescription.setRows(2);
      txaDescription.setEditable(true);
      txaDescription.setName("txaDescription");
    }
    return txaDescription;
  }

  /**
   * This method initializes tabEnvironmentSettings
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RTabbedPane
   */
  private RTabbedPane getTabEnvironmentSettings() {
    if (tabEnvironmentSettings == null) {
      tabEnvironmentSettings = new RTabbedPane();
      tabEnvironmentSettings.setName("tabEnvironmentSettings");
      tabEnvironmentSettings.setStyleProperties("{/insetsTop \"5\"/fill \"BOTH\"/weightY \"30\"/weightX \"1\"}");
      tabEnvironmentSettings.setStyle("fill-both-border");
      tabEnvironmentSettings.addTab("<%=ivy.cms.co(\"/Dialogs/environment/variables\")%>", null,
          getGlobalVariableListPanel(), null);
      tabEnvironmentSettings.addTab("<%=ivy.cms.co(\"/Dialogs/environment/databases\")%>", null,
          getEnvironmentDatabasePanel(), null);
      tabEnvironmentSettings.addTab("<%=ivy.cms.co(\"/Dialogs/environment/webservices\")%>", null,
          getWebServiceListPanel(), null);
      tabEnvironmentSettings.addTab("Rest Clients", null, getRestClientsPanel(), null);
      tabEnvironmentSettings.addTab("Business Calendar", null, getEnvironmentCalendarPanel(), null);
    }
    return tabEnvironmentSettings;
  }

  /**
   * This method initializes globalVariableListPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.variables.GlobalVariableList.GlobalVariableListPanel
   */
  private ULCContainer getGlobalVariableListPanel() {
    if (globalVariableListPanel == null) {
      globalVariableListPanel = RichDialogPanelFactory.create(GlobalVariableListPanel.class);
      globalVariableListPanel.setName("globalVariableListPanel");
    }
    return globalVariableListPanel;
  }

  /**
   * This method initializes tabHeaderBarPanel
   * 
   * @return ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel
   */
  private ULCContainer getTabHeaderBarPanel() {
    if (tabHeaderBarPanel == null) {
      tabHeaderBarPanel = RichDialogPanelFactory.create(TabHeaderBarPanel.class);
      tabHeaderBarPanel.setName("tabHeaderBarPanel");
      tabHeaderBarPanel.setStyle("horizontal");
      tabHeaderBarPanel.setPreferredSize(null);
    }
    return tabHeaderBarPanel;
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
      btnSave.setIconUri("<%= ivy.cms.cr(\"/Icons/Save/16\") %>");
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
      btnCancel.setIconUri("<%= ivy.cms.cr(\"/Icons/Close/16\") %>");
      btnCancel.setName("btnCancel");
    }
    return btnCancel;
  }

  /**
   * This method initializes environmentDatabasePanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabasePanel
   */
  private ULCContainer getEnvironmentDatabasePanel() {
    if (environmentDatabasePanel == null) {
      environmentDatabasePanel = RichDialogPanelFactory.create(EnvironmentDatabasePanel.class);
      environmentDatabasePanel.setName("environmentDatabasePanel");
    }
    return environmentDatabasePanel;
  }

  public void hideTabHeaderPanel() {
    tabHeaderBarPanel.setVisible(false);
  }

  /**
   * This method initializes webServiceListPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.webservice.WebServiceList.WebServiceListPanel
   */
  private WebServiceListPanel getWebServiceListPanel() {
    if (webServiceListPanel == null) {
      webServiceListPanel = new WebServiceListPanel();
      webServiceListPanel.setName("webServiceListPanel");
    }
    return webServiceListPanel;
  }

  /**
   * This method initializes environmentCalendarPanel, an embedded RichDialog. The created object might have a different
   * type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getEnvironmentCalendarPanel() {
    if (environmentCalendarPanel == null) {
      environmentCalendarPanel = RichDialogPanelFactory.create(EnvironmentCalendarPanel.class);
      environmentCalendarPanel.setName("environmentCalendarPanel");
    }
    return environmentCalendarPanel;
  }

  /**
   * This method initializes lblApplication
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblApplication() {
    if (lblApplication == null) {
      lblApplication = new RLabel();
      lblApplication.setText("Application");
      lblApplication.setName("lblApplication");
    }
    return lblApplication;
  }

  /**
   * This method initializes txfApplication
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxfApplication() {
    if (txfApplication == null) {
      txfApplication = new RTextField();
      txfApplication.setText("");
      txfApplication.setName("txfApplication");
    }
    return txfApplication;
  }

  /**
   * This method initializes restClientsPanel, an embedded RichDialog.
   * The created object might have a different type than the declared
   * class due to overriding.
   * @returns com.ulcjava.base.application.ULCContainer 
   */
  private ULCContainer getRestClientsPanel() {
    if (restClientsPanel == null) {
      restClientsPanel = RichDialogPanelFactory.create(RestClientsPanel.class);
      restClientsPanel.setName("restClientsPanel");
    }
    return restClientsPanel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
