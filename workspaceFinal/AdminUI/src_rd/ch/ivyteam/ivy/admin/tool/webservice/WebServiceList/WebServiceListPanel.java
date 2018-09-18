package ch.ivyteam.ivy.admin.tool.webservice.WebServiceList;

import java.lang.reflect.InvocationTargetException;

import ch.ivyteam.ivy.admin.tool.webservice.WebServiceDetails.WebServiceDetailsPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;
import ch.ivyteam.ulc.vwidget.server.ULCVSearchField;

import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;

/**
 * RichDialog panel implementation for WebServiceListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class WebServiceListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scpWebServices = null;
  private RPopupMenu mnuWebServiceList = null; // @jve:decl-index=0:visual-constraint="9,483"
  private RMenuItem mnuReset = null;
  private WebServiceDetailsPanel webServiceDetailsPanel = null;
  private RList lstWebServices = null;
  private ULCVSearchField lookupWebservices = null;

  // SONAR-OFF
  /**
   * Create a new instance of WebServiceListPanel
   */
  public WebServiceListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes WebServiceListPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(571, 469));
    this.add(getLookupWebservices(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getScpWebServices(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getWebServiceDetailsPanel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 2, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

  /**
   * This method initializes scpWebServices
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScpWebServices() {
    if (scpWebServices == null) {
      scpWebServices = new RScrollPane();
      scpWebServices.setName("scpWebServices");
      scpWebServices.setStyle("fill-both-border");
      scpWebServices.setStyleProperties("{/weightX \"10\"}");
      scpWebServices.setViewPortView(getLstWebServices());
    }
    return scpWebServices;
  }

  /**
   * This method initializes mnuWebServiceList
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getMnuWebServiceList() {
    if (mnuWebServiceList == null) {
      mnuWebServiceList = new RPopupMenu();
      mnuWebServiceList.setName("mnuWebServiceList");
      mnuWebServiceList.add(getMnuReset());
    }
    return mnuWebServiceList;
  }

  /**
   * This method initializes mnuReset
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getMnuReset() {
    if (mnuReset == null) {
      mnuReset = new RMenuItem();
      mnuReset.setText("Reset to Default Configuration");
      mnuReset.setName("mnuReset");
    }
    return mnuReset;
  }

  /**
   * This method initializes webServiceDetailsPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.webservice.WebServiceDetails.WebServiceDetailsPanel
   */
  private WebServiceDetailsPanel getWebServiceDetailsPanel() {
    if (webServiceDetailsPanel == null) {
      webServiceDetailsPanel = new WebServiceDetailsPanel();
      webServiceDetailsPanel.setName("webServiceDetailsPanel");
      webServiceDetailsPanel.setStyleProperties("{/weightX \"40\"}");
      webServiceDetailsPanel.setStyle("fill-both-border");
    }
    return webServiceDetailsPanel;
  }

  /**
   * This method initializes lstWebServices
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RList
   */
  private RList getLstWebServices() {
    if (lstWebServices == null) {
      lstWebServices = new RList();
      lstWebServices.setName("lstWebServices");
      lstWebServices.setComponentPopupMenu(getMnuWebServiceList());
      lstWebServices
          .setModelConfiguration("{/result \"result=entry.getName()\"/version \"3.0\"/icon \"result=entry.getDefaultWebService() != null? \\\"/images/klein/environment/webServiceEnvironment\\\":\\\"/images/klein/webService\\\"\"/tooltip \"\"}");
    }
    return lstWebServices;
  }

  /**
   * This method initializes lookupWebservices	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField	
   */
  private ULCVSearchField getLookupWebservices() {
    if (lookupWebservices == null) {
      lookupWebservices = new ULCVSearchField();
      lookupWebservices.setName("lookupWebservices");
      lookupWebservices.setText("");
      lookupWebservices.setMinCharForSearch(0);
      lookupWebservices.setDelayTimeForSearch(500);
      
      lookupWebservices.addSearchListener(new IActionListener() {
        
        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        @Override
        public void actionPerformed(ActionEvent event) {
          try {
            getPanelAPI().callMethod("filterWebServices", null);
          } catch (InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
          }
        }
      });
      
    }
    return lookupWebservices;
  }

} // @jve:decl-index=0:visual-constraint="10,10"
