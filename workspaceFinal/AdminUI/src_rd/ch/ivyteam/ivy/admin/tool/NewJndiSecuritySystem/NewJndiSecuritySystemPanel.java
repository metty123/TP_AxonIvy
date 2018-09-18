package ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem;

import ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemPanel;
import ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RTabbedPane;

import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for NewJndiSecuritySystemPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class NewJndiSecuritySystemPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RFlowLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RTabbedPane mainTabbedPane = null;
  private @EmbeddedRichDialog(JndiSecuritySystemPanel.class)
  ULCContainer jndiSecuritySystemPanel = null;
  private @EmbeddedRichDialog(LdapMappingPropertiesPanel.class)
  ULCContainer ldapMappingPropertiesPanel = null;

  // SONAR-OFF
  /**
   * Create a new instance of NewJndiSecuritySystemPanel
   */
  public NewJndiSecuritySystemPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes NewJndiSecuritySystemPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMainTabbedPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }


  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RFlowLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane.setStyleProperties("{/anchor \"EAST\"}");
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      okButton.setDefaultCapable(true);
      okButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/ok\")%>");
      okButton.setPreferredSize(new com.ulcjava.base.application.util.Dimension(50, 27));
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes cancelButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new RButton();
      cancelButton.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/button/cancel\")%>\n");
      cancelButton.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      cancelButton.setPreferredSize(new com.ulcjava.base.application.util.Dimension(50, 27));
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes mainTabbedPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RTabbedPane
   */
  private RTabbedPane getMainTabbedPane() {
    if (mainTabbedPane == null) {
      mainTabbedPane = new RTabbedPane();
      mainTabbedPane.setName("mainTabbedPane");
      mainTabbedPane.setStyle("fill-both-border");
      mainTabbedPane.setStyleProperties("{/insetsTop \"5\"/fill \"BOTH\"/weightY \"30\"/weightX \"1\"}");
      mainTabbedPane.setPreferredSize(new com.ulcjava.base.application.util.Dimension(700, 430));
      mainTabbedPane.addTab("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/securitySystem\")%>", null,
          getJndiSecuritySystemPanel(), "<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/securitySystem\")%>");
      mainTabbedPane.addTab("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/ldapProperties\")%>", null,
          getLdapMappingPropertiesPanel(), "<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/ldapProperties\")%>");
    }
    return mainTabbedPane;
  }

  /**
   * This method initializes jndiSecuritySystemPanel, an embedded RichDialog. The created object might have a different
   * type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getJndiSecuritySystemPanel() {
    if (jndiSecuritySystemPanel == null) {
      jndiSecuritySystemPanel = RichDialogPanelFactory.create(JndiSecuritySystemPanel.class);
      jndiSecuritySystemPanel.setName("jndiSecuritySystemPanel");
    }
    return jndiSecuritySystemPanel;
  }

  /**
   * This method initializes ldapMappingPropertiesPanel, an embedded RichDialog. The created object might have a
   * different type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getLdapMappingPropertiesPanel() {
    if (ldapMappingPropertiesPanel == null) {
      ldapMappingPropertiesPanel = RichDialogPanelFactory.create(LdapMappingPropertiesPanel.class);
      ldapMappingPropertiesPanel.setName("ldapMappingPropertiesPanel");
    }
    return ldapMappingPropertiesPanel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
