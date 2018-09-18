package ch.ivyteam.ivy.admin.tool.restclient.RestClients;

import java.lang.reflect.InvocationTargetException;

import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.event.IValueChangedListener;
import com.ulcjava.base.application.event.ValueChangedEvent;

import ch.ivyteam.ivy.admin.tool.restclient.RestClientDetails.RestClientDetailsPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;
import ch.ivyteam.ulc.vwidget.server.ULCVSearchField;

/**
 * RichDialog panel implementation for WebServiceListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class RestClientsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RPopupMenu restClientContextMenu = null; // @jve:decl-index=0:visual-constraint="9,483"
  private RMenuItem mnuReset = null;
  private RestClientDetailsPanel restClientDetailsPanel = null;
  private RList restClientList = null;
  private ULCVSearchField restClientLookup = null;
  private RScrollPane restClientScrollPane = null;
  // SONAR-OFF
  /**
   * Create a new instance of WebServiceListPanel
   */
  public RestClientsPanel() {
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
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(652,470));
    this.add(getRestClientLookup(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getRestClientScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    this.add(getRestClientDetailsPanel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 2, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

  /**
   * This method initializes restClientContextMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getRestClientContextMenu() {
    if (restClientContextMenu == null) {
      restClientContextMenu = new RPopupMenu();
      restClientContextMenu.setName("restClientContextMenu");
      restClientContextMenu.add(getMnuReset());
    }
    return restClientContextMenu;
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
  private RestClientDetailsPanel getRestClientDetailsPanel() {
    if (restClientDetailsPanel == null) {
      restClientDetailsPanel = new RestClientDetailsPanel();
      restClientDetailsPanel.setStyleProperties("{/weightX \"40\"}");
      restClientDetailsPanel.setName("restClientDetailsPanel");
      restClientDetailsPanel.setStyle("fill-both-border");
    }
    return restClientDetailsPanel;
  }

  /**
   * This method initializes restClientList	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RList	
   */
  private RList getRestClientList() {
    if (restClientList == null) {
      restClientList = new RList();
      restClientList.setName("restClientList");
      restClientList.setModelConfiguration("{/result \"result=entry.getName()\"/version \"3.0\"/icon \"result=entry.environment ? ivy.cms.cr(\\\"/images/klein/restclient\\\") : ivy.cms.cr(\\\"/images/klein/restclient_default\\\")\"/tooltip \"\"}");
    }
    return restClientList;
  }

  /**
   * This method initializes restClientLookup	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField	
   */
  private ULCVSearchField getRestClientLookup() {
    if (restClientLookup == null) {
      restClientLookup = new ULCVSearchField();
      restClientLookup.setText("");
      restClientLookup.setName("restClientLookup");
      restClientLookup.setMinCharForSearch(0);
      restClientLookup.setDelayTimeForSearch(500);
      restClientLookup.addSearchListener(new IActionListener() {
        
        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        @Override
        public void actionPerformed(ActionEvent event) {
          try {
            getPanelAPI().callMethod("filterRestClients", null);
          } catch (InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
          }
        }
      });
    }
    return restClientLookup;
  }

  /**
   * This method initializes restClientScrollPane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
   */
  private RScrollPane getRestClientScrollPane() {
    if (restClientScrollPane == null) {
      restClientScrollPane = new RScrollPane();
      restClientScrollPane.setName("restClientScrollPane");
      restClientScrollPane.setStyleProperties("{/weightX \"15\"}");
      restClientScrollPane.setViewPortView(getRestClientList());
    }
    return restClientScrollPane;
  }

}  //  @jve:decl-index=0:visual-constraint="-39,10"
