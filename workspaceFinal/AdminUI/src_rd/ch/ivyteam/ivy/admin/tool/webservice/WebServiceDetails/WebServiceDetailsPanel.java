package ch.ivyteam.ivy.admin.tool.webservice.WebServiceDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import ch.ivyteam.ivy.admin.tool.AuthenticationType;
import ch.ivyteam.ivy.application.restricted.IWebService;
import ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint;
import ch.ivyteam.ivy.application.restricted.IWebServicePortType;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField;
import ch.ivyteam.ivy.richdialog.widgets.components.RTableTree;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.scripting.objects.Tree;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for WebServiceDetailsPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
@SuppressWarnings("restriction")
public class WebServiceDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblHeader = null;
  private RLabel lblName = null;
  private RLabel lblDescription = null;
  private RTextField txfName = null;
  private RScrollPane scpDescription = null;
  private RTextArea txaDescription = null;
  private RGridBagLayoutPane pnlSecurity = null;
  private RCheckBox chkUseAuthentication = null;
  private RLabel lblSessionHandlingMode = null;
  private RComboBox cboSessionHandling = null;
  private RLabel lblAuthenticationType = null;
  private RLabel lblUsername = null;
  private RLabel lblPassword = null;
  private RTextField txfUsername = null;
  private RPasswordField txfPassword = null;
  private RGridBagLayoutPane pnlEndpoints = null;
  private RFlowLayoutPane pnlButtonBar = null;
  private RButton btnOk = null;
  private RButton btnCancel = null;
  private RTableTree tblEndpointAddresses = null;
  private RScrollPane scpEndpointAddresses = null;
  private RComboBox cboAuthenticationType = null;
  private RFlowLayoutPane pnlEndpointButtonBar = null;
  private RButton btnEdit = null;
  private RButton btnRemove = null;
  private RButton btnAdd = null;
  private RButton btnReset = null;
  private RButton btnInvisible = null;
  private RButton btnWSTesting = null;
  private RLabel lblHost = null;
  private RLabel lblDomain = null;
  private RTextField txfHost = null;
  private RTextField txfDomain = null;
  // SONAR-OFF
  /**
   * Create a new instance of WebServiceDetailsPanel
   */
  public WebServiceDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes WebServiceDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(554, 477));
    this.setStyleProperties("{/weightY \"2\"}");
    this.add(getLblHeader(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblName(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblDescription(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTxfName(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getScpDescription(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPnlSecurity(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPnlEndpoints(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getChkUseAuthentication(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPnlButtonBar(), new com.ulcjava.base.application.GridBagConstraints(0, 8, 3, 1, -1, -1,
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
      lblHeader.setText("Web Service Details");
      lblHeader.setStyle("mainCaption");
      lblHeader.setStyleProperties("{/weightX \"1\"}");
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
      lblName.setText("Name");
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
      lblDescription.setText("Description");
      lblDescription.setName("lblDescription");
    }
    return lblDescription;
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
      txfName.setEditable(false);
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
      txaDescription.setRows(4);
      txaDescription.setEditable(false);
      txaDescription.setName("txaDescription");
    }
    return txaDescription;
  }

  /**
   * This method initializes pnlSecurity
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getPnlSecurity() {
    if (pnlSecurity == null) {
      pnlSecurity = new RGridBagLayoutPane();
      pnlSecurity.setName("pnlSecurity");
      pnlSecurity.setBorder(BorderFactory.createTitledBorder(null, "Security Settings",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      pnlSecurity.setName("pnlSecurity");
      pnlSecurity.add(getLblSessionHandlingMode(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getCboSessionHandling(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getLblAuthenticationType(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getLblUsername(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getLblPassword(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getTxfUsername(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 2, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getTxfPassword(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 2, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getCboAuthenticationType(), new com.ulcjava.base.application.GridBagConstraints(2, 3, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlSecurity.add(getLblHost(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      pnlSecurity.add(getLblDomain(), new com.ulcjava.base.application.GridBagConstraints(0, 7, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      pnlSecurity.add(getTxfHost(), new com.ulcjava.base.application.GridBagConstraints(2, 6, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      pnlSecurity.add(getTxfDomain(), new com.ulcjava.base.application.GridBagConstraints(2, 7, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    }
    return pnlSecurity;
  }

  /**
   * This method initializes chkUseAuthentication
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getChkUseAuthentication() {
    if (chkUseAuthentication == null) {
      chkUseAuthentication = new RCheckBox();
      chkUseAuthentication.setText("Use Authentication");
      chkUseAuthentication.setStyleProperties("{/anchor \"NORTH\"}");
      chkUseAuthentication.setName("chkUseAuthentication");
    }
    return chkUseAuthentication;
  }

  /**
   * This method initializes lblSessionHandlingMode
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSessionHandlingMode() {
    if (lblSessionHandlingMode == null) {
      lblSessionHandlingMode = new RLabel();
      lblSessionHandlingMode.setText("Use Session Handling");
      lblSessionHandlingMode.setName("lblSessionHandlingMode");
    }
    return lblSessionHandlingMode;
  }

  /**
   * This method initializes cboSessionHandling
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCboSessionHandling() {
    if (cboSessionHandling == null) {
      cboSessionHandling = new RComboBox();
      cboSessionHandling.setName("cboSessionHandling");
      cboSessionHandling
          .setModelConfiguration("{/result \"result=entry.getName()\"/version \"3.0\"/tooltip \"result=entry.getName()\"/icon \"\"}");
    }
    return cboSessionHandling;
  }

  /**
   * This method initializes lblAuthenticationType
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblAuthenticationType() {
    if (lblAuthenticationType == null) {
      lblAuthenticationType = new RLabel();
      lblAuthenticationType.setText("Authentication Type");
      lblAuthenticationType.setName("lblAuthenticationType");
    }
    return lblAuthenticationType;
  }

  /**
   * This method initializes lblUsername
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblUsername() {
    if (lblUsername == null) {
      lblUsername = new RLabel();
      lblUsername.setText("Username");
      lblUsername.setName("lblUsername");
    }
    return lblUsername;
  }

  /**
   * This method initializes lblPassword
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblPassword() {
    if (lblPassword == null) {
      lblPassword = new RLabel();
      lblPassword.setText("Password");
      lblPassword.setName("lblPassword");
    }
    return lblPassword;
  }

  /**
   * This method initializes txfUsername
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxfUsername() {
    if (txfUsername == null) {
      txfUsername = new RTextField();
      txfUsername.setText("");
      txfUsername.setName("txfUsername");
    }
    return txfUsername;
  }

  /**
   * This method initializes txfPassword
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField
   */
  private RPasswordField getTxfPassword() {
    if (txfPassword == null) {
      txfPassword = new RPasswordField();
      txfPassword.setText("");
      txfPassword.setName("txfPassword");
    }
    return txfPassword;
  }

  /**
   * This method initializes pnlEndpoints
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getPnlEndpoints() {
    if (pnlEndpoints == null) {
      pnlEndpoints = new RGridBagLayoutPane();
      pnlEndpoints.setName("pnlEndpoints");
      pnlEndpoints.setBorder(BorderFactory.createTitledBorder(null, "Endpoint Addresses for Port Types",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      pnlEndpoints.setStyleProperties("{/weightY \"50\"}");
      pnlEndpoints.add(getScpEndpointAddresses(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      pnlEndpoints.add(getPnlEndpointButtonBar(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return pnlEndpoints;
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
      pnlButtonBar.setStyle("fill-horiz");
      pnlButtonBar.setStyleProperties("{/alignment \"RIGHT\"}");
      pnlButtonBar.add(getBtnInvisible());
      pnlButtonBar.add(getBtnReset());
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
      btnOk.setText("Save");
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
      btnCancel.setText("Cancel");
      btnCancel.setName("btnCancel");
    }
    return btnCancel;
  }

  /**
   * This method initializes tblEndpointAddresses
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTableTree
   */
  private RTableTree getTblEndpointAddresses() {
    if (tblEndpointAddresses == null) {
      tblEndpointAddresses = new RTableTree();
      tblEndpointAddresses.setName("tblEndpointAddresses");
      tblEndpointAddresses.setRootVisible(false);
      tblEndpointAddresses
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /dynamicTreeLoadMode \"NO\"/version \"3.0\"/columns {{/patterns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Call Order Position\\\"\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/field \"portType\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.restricted.IWebServicePortType\"}{/result \"result=value\"/version \"3.0\"/field \"callOrderPosition\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint\"}}/version \"3.0\"}{/patterns {{/result \"result=value\"/version \"3.0\"/header \"\\\"Endpoint Address\\\"\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=\\\"\\\"\"/version \"3.0\"/field \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.restricted.IWebServicePortType\"}{/result \"result=value\"/version \"3.0\"/field \"endpointAddress\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.restricted.IWebServiceEndpoint\"}}/version \"3.0\"}}}");
    }
    return tblEndpointAddresses;
  }

  /**
   * This method initializes scpEndpointAddresses
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScpEndpointAddresses() {
    if (scpEndpointAddresses == null) {
      scpEndpointAddresses = new RScrollPane();
      scpEndpointAddresses.setName("scpEndpointAddresses");
      scpEndpointAddresses.setStyle("fill-both-border");
      scpEndpointAddresses.setViewPortView(getTblEndpointAddresses());
    }
    return scpEndpointAddresses;
  }

  /**
   * This method initializes cboAuthenticationType
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCboAuthenticationType() {
    if (cboAuthenticationType == null) {
      cboAuthenticationType = new RComboBox();
      cboAuthenticationType.setName("cboAuthenticationType");
      cboAuthenticationType
          .setModelConfiguration("{/result \"result=entry.name()\"/version \"3.0\"/tooltip \"result=entry.name()\"/icon \"\"}");
    }
    return cboAuthenticationType;
  }

  /**
   * This method initializes pnlEndpointButtonBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getPnlEndpointButtonBar() {
    if (pnlEndpointButtonBar == null) {
      pnlEndpointButtonBar = new RFlowLayoutPane();
      pnlEndpointButtonBar.setName("pnlEndpointButtonBar");
      pnlEndpointButtonBar.setStyle("fill-horiz-border");
      pnlEndpointButtonBar.setStyleProperties("{/alignment \"LEFT\"}");
      pnlEndpointButtonBar.add(getBtnAdd());
      pnlEndpointButtonBar.add(getBtnEdit());
      pnlEndpointButtonBar.add(getBtnRemove());
      pnlEndpointButtonBar.add(getBtnWSTesting());
    }
    return pnlEndpointButtonBar;
  }

  /**
   * This method initializes btnEdit
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnEdit() {
    if (btnEdit == null) {
      btnEdit = new RButton();
      btnEdit.setText("Edit");
      btnEdit.setName("btnEdit");
    }
    return btnEdit;
  }

  /**
   * This method initializes btnRemove
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnRemove() {
    if (btnRemove == null) {
      btnRemove = new RButton();
      btnRemove.setText("Remove");
      btnRemove.setName("btnRemove");
    }
    return btnRemove;
  }

  /**
   * This method initializes btnAdd
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnAdd() {
    if (btnAdd == null) {
      btnAdd = new RButton();
      btnAdd.setText("Add");
      btnAdd.setName("btnAdd");
    }
    return btnAdd;
  }

  /**
   * This method initializes btnReset
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnReset() {
    if (btnReset == null) {
      btnReset = new RButton();
      btnReset.setText("Reset to Default");
      btnReset.setName("btnReset");
    }
    return btnReset;
  }

  /**
   * This method initializes btnInvisible
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnInvisible() {
    if (btnInvisible == null) {
      btnInvisible = new RButton();
      btnInvisible.setText("btnInvisible");
      btnInvisible.setVisible(false);
      btnInvisible
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"0\"/preferredSizeHeight \"0\"}");
      btnInvisible.setName("btnInvisible");
    }
    return btnInvisible;
  }

  public Tree getEndpointAddressesTree(IWebService webService) throws PersistencyException {
    Tree resultTree = new Tree();

    for (IWebServicePortType portType : webService.getPortTypes()) {
      Tree porttypeTree = new Tree(portType);
      for (IWebServiceEndpoint endpoint : webService.getWebServiceEndpoints(portType.getPortType())) {
        Tree endpointTree = new Tree(endpoint);
        porttypeTree.add(endpointTree);
      }
      resultTree.add(porttypeTree);
    }

    return resultTree;
  }

  public Map<String, Map<Long, String[]>> getEndpointAddressesMap(IWebService webService) throws PersistencyException {
    Map<String, Map<Long, String[]>> resultMap = new HashMap<String, Map<Long, String[]>>();

    for (IWebServicePortType portType : webService.getPortTypes()) {
      Map<Long, String[]> endpointMap = new TreeMap<Long, String[]>();
      for (IWebServiceEndpoint endpoint : webService.getWebServiceEndpoints(portType.getPortType())) {
        endpointMap.put(endpoint.getId(),
            new String[] {String.valueOf(endpoint.getCallOrderPosition()), endpoint.getEndpointAddress()});
      }
      resultMap.put(portType.getPortType(), endpointMap);
    }

    return resultMap;
  }

  public Tree toOriginalTree(IWebService modifiedWs, Tree modifiedTree,
      Map<String, Map<Long, String[]>> originalEndpointMap) throws PersistencyException {
    Tree resultTree = modifiedTree.deepClone();

    for (Tree porttypeNode : resultTree.getChildren()) {
      if (porttypeNode.getValue() instanceof IWebServicePortType) {
        IWebServicePortType portType = (IWebServicePortType) porttypeNode.getValue();
        Map<Long, String[]> endpointMap = originalEndpointMap.get(portType.getPortType());

        if (endpointMap != null) {
          // Remove all changes in modifiedWs
          removeModifiedEndpoints(modifiedWs, portType);

          // Remove all changes in porttypeNode
          porttypeNode.removeAllChildren();

          // Add original data to modifiedWs and porttypeNode
          for (Entry<Long, String[]> endpointEntry : endpointMap.entrySet()) {
            String[] endpointValues = endpointEntry.getValue();

            if (endpointValues != null) {
              try {
                IWebServiceEndpoint endpoint =
                    modifiedWs.createEndpoint(portType, Integer.parseInt(endpointValues[0]), endpointValues[1]);
                porttypeNode.add(new Tree(endpoint));
              } catch (NumberFormatException e) {
                Ivy.log().error("Cannot parse CallOrderPosition: ", e);
              }
            }
          }
        }
      }
    }

    return resultTree;
  }

  private void removeModifiedEndpoints(IWebService modifiedWs, IWebServicePortType portType) {
    List<IWebServiceEndpoint> copiedEndpoints = new ArrayList<IWebServiceEndpoint>();
    copiedEndpoints.addAll(modifiedWs.getWebServiceEndpoints(portType.getPortType()));
    for (IWebServiceEndpoint elt : copiedEndpoints) {
      modifiedWs.deleteEndpoint(elt);
    }
  }

  public boolean haveChangesOnEndpointAddresses(Map<String, Map<Long, String[]>> map1,
      Map<String, Map<Long, String[]>> map2) {
    /*
     * Ivy.log().info("11111111111 map:"); printMap(map1); Ivy.log().info("22222222222 map:"); printMap(map2);
     */

    boolean ret = false;

    if (map1.entrySet().size() >= map2.entrySet().size()) {
      ret = haveDifferentPortTypes(map1, map2);
    } else {
      ret = haveDifferentPortTypes(map2, map1);
    }

    return ret;
  }

  private boolean haveDifferentPortTypes(Map<String, Map<Long, String[]>> map1, Map<String, Map<Long, String[]>> map2) {
    for (Map.Entry<String, Map<Long, String[]>> entry : map1.entrySet()) {
      String key = entry.getKey();
      if (map2.containsKey(key)) {
        Map<Long, String[]> endpointMap1 = entry.getValue();
        Map<Long, String[]> endpointMap2 = map2.get(key);

        if (endpointMap1.entrySet().size() >= endpointMap2.entrySet().size()) {
          return haveDifferentEndpoints(endpointMap1, endpointMap2);
        } else {
          return haveDifferentEndpoints(endpointMap2, endpointMap1);
        }
      } else {
        return true;
      }
    }

    return false;
  }

  private boolean haveDifferentEndpoints(Map<Long, String[]> endpointMap1, Map<Long, String[]> endpointMap2) {
    for (Map.Entry<Long, String[]> endpointDetail : endpointMap1.entrySet()) {
      Long endpointId = endpointDetail.getKey();
      if (endpointMap2.containsKey(endpointId)) {
        String[] endpointValue1 = endpointDetail.getValue();
        String[] endpointValue2 = endpointMap2.get(endpointId);
        for (int i = 0; i < endpointValue1.length; i++) {
          if (!endpointValue1[i].equals(endpointValue2[i])) {
            return true;
          }
        }
      } else {
        return true;
      }
    }

    return false;
  }

  public static void printMap(Map<String, Map<Long, String[]>> endpointMap) {
    Ivy.log().info("---------------------------------------");
    for (Map.Entry<String, Map<Long, String[]>> entry : endpointMap.entrySet()) {
      Ivy.log().info("WebServicePortType: " + entry.getKey());
      Map<Long, String[]> value = entry.getValue();
      for (Map.Entry<Long, String[]> item : value.entrySet()) {
        Ivy.log().info(
            "++++ WebServiceEndpoint (id: " + item.getKey() + ", call pos: " + item.getValue()[0] + ", address: "
                + item.getValue()[1] + ")");
      }
    }
  }

  /**
   * This method initializes btnWSTesting
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnWSTesting() {
    if (btnWSTesting == null) {
      btnWSTesting = new RButton();
      btnWSTesting.setName("btnWSTesting");
      btnWSTesting.setText("Test");
    }
    return btnWSTesting;
  }

  /**
   * This method initializes lblHost	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getLblHost() {
    if (lblHost == null) {
      lblHost = new RLabel();
      lblHost.setName("lblHost");
      lblHost.setEnabled(false);
      lblHost.setText("Host");
    }
    return lblHost;
  }

  /**
   * This method initializes lblDomain	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getLblDomain() {
    if (lblDomain == null) {
      lblDomain = new RLabel();
      lblDomain.setName("lblDomain");
      lblDomain.setEnabled(false);
      lblDomain.setText("Domain");
    }
    return lblDomain;
  }

  /**
   * This method initializes txfHost	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
   */
  private RTextField getTxfHost() {
    if (txfHost == null) {
      txfHost = new RTextField();
      txfHost.setName("txfHost");
      txfHost.setEnabled(false);
      txfHost.setText("");
    }
    return txfHost;
  }

  /**
   * This method initializes txfDomain	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
   */
  private RTextField getTxfDomain() {
    if (txfDomain == null) {
      txfDomain = new RTextField();
      txfDomain.setName("txfDomain");
      txfDomain.setEnabled(false);
      txfDomain.setText("");
    }
    return txfDomain;
  }
  
  public void displayDataFieldsForAuthenticationType(String authenticationType){
    if(authenticationType.equalsIgnoreCase(AuthenticationType.NTLM.name())){
      enableNTLMDataFields();
    }else{
      hideNTLMDataField();
    }
  }
  
  private void enableNTLMDataFields(){
    lblHost.setVisible(true);
    lblDomain.setVisible(true);
    txfDomain.setVisible(true);
    txfHost.setVisible(true);
  }
  
  private void hideNTLMDataField(){
    lblHost.setVisible(false);
    lblDomain.setVisible(false);
    txfDomain.setVisible(false);
    txfHost.setVisible(false);
  }
} // @jve:decl-index=0:visual-constraint="-11,10"
