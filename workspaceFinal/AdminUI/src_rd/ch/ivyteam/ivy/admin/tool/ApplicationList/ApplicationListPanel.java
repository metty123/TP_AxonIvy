package ch.ivyteam.ivy.admin.tool.ApplicationList;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;

import com.ulcjava.base.application.event.KeyEvent;
import com.ulcjava.base.application.util.Dimension;
import com.ulcjava.base.application.util.KeyStroke;

/**
 * RichDialog panel implementation for ApplicationListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ApplicationListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTree applicationTree = null;
  private RScrollPane applicationScrollPane = null;
  private RToolBar applicationToolBar = null;
  private RButton newApplicationButton = null;
  private RButton showDetailButton = null;
  private RCheckBox showSystemCheckBox = null;
  private RPopupMenu treePopupMenu = null; // @jve:decl-index=0:visual-constraint="136,11"
  private RMenuItem showDetailsMenuItem = null;
  private RMenuItem deleteMenuItem = null;
  private RMenuItem newProcessModelMenuItem = null;
  private RMenuItem newProcessModelVersionMenuItem = null;
  private RMenuItem newApplicationMenuItem = null;
  private RPopupMenu.RSeparator menuSeparator = null;
  private RPopupMenu.RSeparator menuSeparator1 = null;
  private RMenuItem newEnvironmentMenuItem = null;
  private RPopupMenu.RSeparator menuSeparator2 = null;
  private RMenuItem exportEnvironmentMenuItem = null;
  private RMenuItem importEnvironmentMenuItem = null;
  private RButton deployButton = null;
  private RMenuItem deploymentWizardMenuItem = null;
  private RPopupMenu.RSeparator menuSeparator3 = null;

  // SONAR-OFF
  /**
   * Create a new instance of ApplicationListPanel
   */
  public ApplicationListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ApplicationListPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getApplicationScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getShowSystemCheckBox(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getApplicationToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    setPreferredSize(new Dimension(100, 320));
  }

  /**
   * This method initializes applicationTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree
   */
  private RTree getApplicationTree() {
    if (applicationTree == null) {
      applicationTree = new RTree();
      applicationTree.setName("applicationTree");
      applicationTree.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      applicationTree.setRootVisible(false);
      applicationTree.setToggleClickCount(2);
      applicationTree.setComponentPopupMenu(getTreePopupMenu());
      applicationTree
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/dynamicTreeLoadMode \"LOAD_FOR_RENDER_PARENT\"/emptyTableText \"\"/columns {{/patterns {{/result \"\"/version \"3.0\"/icon \"result=\\\"/images/klein/applications\\\"\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.getName()\"/version \"3.0\"/tooltip \"result=entry.getDescription()\"/icon \"result=\\\"/images/klein/application\\\"\"/header \"\"/field \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.IApplication\"}{/result \"result=entry.getName()\"/version \"3.0\"/tooltip \"result=entry.getDescription()\"/icon \"result=\\\"/images/klein/processModel\\\"\"/header \"\"/field \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.IProcessModel\"}{/result \"result=entry.getVersionNumber().toString() + \\\" - \\\" + entry.getName()\"/version \"3.0\"/tooltip \"result=entry.getName()\"/icon \"result=\\\"/images/klein/processModelVersion\\\"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.IProcessModelVersion\"}{/result \"result=entry.getName()\"/version \"3.0\"/tooltip \"result=entry.getDescription()\"/icon \"result=ivy.cms.cr(\\\"/images/klein/environment/environments\\\")\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.application.restricted.IEnvironment\"}{/result \"result=\\\"Environment\\\"\"/version \"3.0\"/icon \"result=ivy.cms.cr(\\\"/images/klein/environment/environments\\\")\"/patternMode \"INFO\"/patternValue \"envroot\"}}/version \"3.0\"}}}");
    }
    return applicationTree;
  }

  /**
   * This method initializes applicationScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getApplicationScrollPane() {
    if (applicationScrollPane == null) {
      applicationScrollPane = new RScrollPane();
      applicationScrollPane.setName("applicationScrollPane");
      applicationScrollPane.setViewPortView(getApplicationTree());
    }
    return applicationScrollPane;
  }

  /**
   * This method initializes applicationToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getApplicationToolBar() {
    if (applicationToolBar == null) {
      applicationToolBar = new RToolBar();
      applicationToolBar.setName("applicationToolBar");
      applicationToolBar.setFloatable(false);
      applicationToolBar.add(getNewApplicationButton());
      applicationToolBar.add(getShowDetailButton());
      applicationToolBar.add(getDeployButton());
    }
    return applicationToolBar;
  }

  /**
   * This method initializes newApplicationButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getNewApplicationButton() {
    if (newApplicationButton == null) {
      newApplicationButton = new RButton();
      newApplicationButton.setName("newApplicationButton");
      newApplicationButton.setToolTipText("Add a new application");
      newApplicationButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/newApplication\")%>");
    }
    return newApplicationButton;
  }

  /**
   * This method initializes showDetailButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getShowDetailButton() {
    if (showDetailButton == null) {
      showDetailButton = new RButton();
      showDetailButton.setToolTipText("Show details");
      showDetailButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/showDetail\")%>");
      showDetailButton.setName("showDetailButton");
    }
    return showDetailButton;
  }

  /**
   * This method initializes showSystemCheckBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getShowSystemCheckBox() {
    if (showSystemCheckBox == null) {
      showSystemCheckBox = new RCheckBox();
      showSystemCheckBox.setName("showSystemCheckBox");
      showSystemCheckBox.setText("Show system applications");
      showSystemCheckBox.setStyleProperties("{/anchor \"WEST\"/insetsBottom \"0\"}");
      showSystemCheckBox.setVisible(false);
    }
    return showSystemCheckBox;
  }

  /**
   * This method initializes treePopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getTreePopupMenu() {
    if (treePopupMenu == null) {
      treePopupMenu = new RPopupMenu();
      treePopupMenu.setName("treePopupMenu");
      treePopupMenu.add(getNewApplicationMenuItem());
      treePopupMenu.add(getNewProcessModelMenuItem());
      treePopupMenu.add(getNewProcessModelVersionMenuItem());
      treePopupMenu.add(getNewEnvironmentMenuItem());
      treePopupMenu.add(getMenuSeparator());
      treePopupMenu.add(getDeploymentWizardMenuItem());
      treePopupMenu.add(getMenuSeparator3());
      treePopupMenu.add(getExportEnvironmentMenuItem());
      treePopupMenu.add(getImportEnvironmentMenuItem());
      treePopupMenu.add(getMenuSeparator1());
      treePopupMenu.add(getDeleteMenuItem());
      treePopupMenu.add(getMenuSeparator2());
      treePopupMenu.add(getShowDetailsMenuItem());
    }
    return treePopupMenu;
  }

  /**
   * This method initializes showDetailsMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getShowDetailsMenuItem() {
    if (showDetailsMenuItem == null) {
      showDetailsMenuItem = new RMenuItem();
      showDetailsMenuItem.setText("Show details");
      showDetailsMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/showDetail\")%>");
      showDetailsMenuItem.setMnemonic(KeyEvent.VK_UNDEFINED);
      showDetailsMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK, false));
      showDetailsMenuItem.setName("showDetailsMenuItem");
    }
    return showDetailsMenuItem;
  }

  /**
   * This method initializes deleteMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getDeleteMenuItem() {
    if (deleteMenuItem == null) {
      deleteMenuItem = new RMenuItem();
      deleteMenuItem.setText("Delete");
      deleteMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      deleteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0, false));
      deleteMenuItem.setName("deleteMenuItem");
    }
    return deleteMenuItem;
  }

  /**
   * This method initializes newProcessModelMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getNewProcessModelMenuItem() {
    if (newProcessModelMenuItem == null) {
      newProcessModelMenuItem = new RMenuItem();
      newProcessModelMenuItem.setText("New process model");
      newProcessModelMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/newProcessModel\")%>");
      newProcessModelMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.ALT_MASK, false));
      newProcessModelMenuItem.setName("newProcessModelMenuItem");
    }
    return newProcessModelMenuItem;
  }

  /**
   * This method initializes newProcessModelVersionMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getNewProcessModelVersionMenuItem() {
    if (newProcessModelVersionMenuItem == null) {
      newProcessModelVersionMenuItem = new RMenuItem();
      newProcessModelVersionMenuItem.setText("New process model version");
      newProcessModelVersionMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/newProcessModelVersion\")%>");
      newProcessModelVersionMenuItem.setMnemonic(KeyEvent.VK_UNDEFINED);
      newProcessModelVersionMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.ALT_MASK, false));
      newProcessModelVersionMenuItem.setName("newProcessModelVersionMenuItem");
    }
    return newProcessModelVersionMenuItem;
  }

  /**
   * This method initializes newApplicationMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getNewApplicationMenuItem() {
    if (newApplicationMenuItem == null) {
      newApplicationMenuItem = new RMenuItem();
      newApplicationMenuItem.setText("New application");
      newApplicationMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/newApplication\")%>");
      newApplicationMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.ALT_MASK, false));
      newApplicationMenuItem.setName("newApplicationMenuItem");
    }
    return newApplicationMenuItem;
  }

  /**
   * This method initializes MenuSeparator
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu.RSeparator
   */
  private RPopupMenu.RSeparator getMenuSeparator() {
    if (menuSeparator == null) {
      menuSeparator = new RPopupMenu.RSeparator();
      menuSeparator.setName("MenuSeparator");
    }
    return menuSeparator;
  }

  /**
   * This method initializes MenuSeparator1
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu.RSeparator
   */
  private RPopupMenu.RSeparator getMenuSeparator1() {
    if (menuSeparator1 == null) {
      menuSeparator1 = new RPopupMenu.RSeparator();
      menuSeparator1.setName("MenuSeparator1");
    }
    return menuSeparator1;
  }

  /**
   * This method initializes newEnvironmentMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getNewEnvironmentMenuItem() {
    if (newEnvironmentMenuItem == null) {
      newEnvironmentMenuItem = new RMenuItem();
      newEnvironmentMenuItem.setText("New Environment");
      newEnvironmentMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/add\")%>");
      newEnvironmentMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.ALT_MASK, false));
      newEnvironmentMenuItem.setName("newEnvironmentMenuItem");
    }
    return newEnvironmentMenuItem;
  }

  /**
   * This method initializes MenuSeparator2
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu.RSeparator
   */
  private RPopupMenu.RSeparator getMenuSeparator2() {
    if (menuSeparator2 == null) {
      menuSeparator2 = new RPopupMenu.RSeparator();
      menuSeparator2.setName("MenuSeparator2");
    }
    return menuSeparator2;
  }

  /**
   * This method initializes exportEnvironmentMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getExportEnvironmentMenuItem() {
    if (exportEnvironmentMenuItem == null) {
      exportEnvironmentMenuItem = new RMenuItem();
      exportEnvironmentMenuItem.setText("Export Environment");
      exportEnvironmentMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.ALT_MASK, false));
      exportEnvironmentMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/export\")%>");
      exportEnvironmentMenuItem.setName("exportEnvironmentMenuItem");
    }
    return exportEnvironmentMenuItem;
  }

  /**
   * This method initializes importEnvironmentMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getImportEnvironmentMenuItem() {
    if (importEnvironmentMenuItem == null) {
      importEnvironmentMenuItem = new RMenuItem();
      importEnvironmentMenuItem.setText("Import Environment");
      importEnvironmentMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, KeyEvent.ALT_MASK, false));
      importEnvironmentMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/environment/import\")%>");
      importEnvironmentMenuItem.setName("importEnvironmentMenuItem");
    }
    return importEnvironmentMenuItem;
  }

  /**
   * This method initializes deployButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeployButton() {
    if (deployButton == null) {
      deployButton = new RButton();
      deployButton.setName("deployButton");
      deployButton.setToolTipText("Deployment wizard");
      deployButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/deploy\")%>");
    }
    return deployButton;
  }

  /**
   * This method initializes deploymentWizardMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getDeploymentWizardMenuItem() {
    if (deploymentWizardMenuItem == null) {
      deploymentWizardMenuItem = new RMenuItem();
      deploymentWizardMenuItem.setText("Deployment wizard");
      deploymentWizardMenuItem.setSelectedIconUri("");
      deploymentWizardMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/deploy\")%>");
      deploymentWizardMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.ALT_MASK, false));
      deploymentWizardMenuItem.setName("deploymentWizardMenuItem");
    }
    return deploymentWizardMenuItem;
  }

  /**
   * This method initializes MenuSeparator3
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu.RSeparator
   */
  private RPopupMenu.RSeparator getMenuSeparator3() {
    if (menuSeparator3 == null) {
      menuSeparator3 = new RPopupMenu.RSeparator();
      menuSeparator3.setName("MenuSeparator3");
    }
    return menuSeparator3;
  }
}
