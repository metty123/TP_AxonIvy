package ch.ivyteam.ivy.admin.tool.security.Permissions;

import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField;
import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField.SearchCallback;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTableTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.event.IKeyListener;
import com.ulcjava.base.application.event.KeyEvent;
import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for PermissionsPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class PermissionsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane permissionsScrollPane = null;
  private RTableTree permissionsTableTree = null;
  private RButton okButton = null;
  private RButton grantButton = null;
  private RButton ungrantButton = null;
  private RButton denyButton = null;
  private RButton undenyButton = null;
  private RGridLayoutPane toolPane = null;
  private CustomizedSearchField permissionLookup = null;
  private RLabel permissionLookupLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of PermissionsPanel
   */
  public PermissionsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes PermissionsPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(742, 571));
    this.add(getPermissionsScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getToolPane(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.SOUTHEAST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getPermissionLookup(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(5, 5,
            5, 5), 0, 0));
    this.add(getPermissionLookupLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 5, 5, 0), 0, 0));
  }

  /**
   * This method initializes permissionsScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getPermissionsScrollPane() {
    if (permissionsScrollPane == null) {
      permissionsScrollPane = new RScrollPane();
      permissionsScrollPane.setName("permissionsScrollPane");
      permissionsScrollPane.setStyleProperties("{/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"5\"}");
      permissionsScrollPane.setViewPortView(getPermissionsTableTree());
      permissionsScrollPane.addKeyListener(new IKeyListener() {
        private static final long serialVersionUID = 1L;

        @Override
        public void keyTyped(KeyEvent event) {
          throw new UnsupportedOperationException("Not implemented yet.");
        }
      });
    }
    return permissionsScrollPane;
  }

  /**
   * This method initializes permissionsTableTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTableTree
   */
  private RTableTree getPermissionsTableTree() {
    if (permissionsTableTree == null) {
      permissionsTableTree = new RTableTree();
      permissionsTableTree.setName("permissionsTableTree");
      permissionsTableTree
          .setModelConfiguration("{/dynamicTreeLoadMode \"LOAD_ON_EXPAND\"/version \"3.0\"/showTableheader \"true\"/autoTableheader \"false\"/showtooltip \"false\"/showIcons \"true\"/columns {{/patterns {{/header \"\\\"Permission\\\"\"/version \"3.0\"/columnWidth \"200\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.getPermission().getName()\"/version \"3.0\"/icon \"result=ivy.cms.cr(\\\"/images/klein/permission\\\")\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionAccess\"}{/result \"result=entry.getPermissionGroup().getName()\"/version \"3.0\"/icon \"result=ivy.cms.cr(\\\"/images/klein/permissionGroup\\\")\"/field \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionGroupAccess\"}}/version \"3.0\"}{/patterns {{/header \"\\\"Inherited From\\\"\"/version \"3.0\"/columnWidth \"150\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.getPermissionHolder()!=null?entry.getPermissionHolder().getName():\\\"\\\"\"/version \"3.0\"/icon \"result=entry.getPermissionHolder()!=null?ivy.cms.cr(\\\"/images/klein/role\\\"):null\"/columnStyle \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionAccess\"}{/result \"\"/version \"3.0\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionGroupAccess\"}}/version \"3.0\"}{/patterns {{/header \"\\\"Granted\\\"\"/version \"3.0\"/columnWidth \"50\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.isGranted()?\\\"Yes\\\"+(entry.isExplicit()?\\\"\\\":\\\" (Inherited)\\\"):\\\"No\\\"\"/version \"3.0\"/icon \"result=entry.isGranted()?(entry.isExplicit()?ivy.cms.cr(\\\"/images/klein/grant\\\"):ivy.cms.cr(\\\"/images/klein/grantInherited\\\")):null\"/field \"\"/columnStyle \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionAccess\"}{/result \"result=IF(entry.isGrantedAllPermissions(),\\r\\n  \\\"All\\\",\\r\\n  IF(entry.isGrantedAnyPermission(), \\r\\n    \\\"Some\\\",\\r\\n    \\\"None\\\"\\r\\n  )\\r\\n)\"/version \"3.0\"/icon \"result=IF(entry.isGrantedAllPermissions(),\\r\\n  ivy.cms.cr(\\\"/images/klein/grant\\\"),\\r\\n  null\\r\\n)\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionGroupAccess\"}}/version \"3.0\"}{/patterns {{/header \"\\\"Denied\\\"\"/version \"3.0\"/columnWidth \"50\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.isDenied()?\\\"Yes\\\"+(entry.isExplicit()?\\\"\\\":\\\" (Inherited)\\\"):\\\"No\\\"\"/version \"3.0\"/icon \"result=entry.isDenied()?(entry.isExplicit()?ivy.cms.cr(\\\"/images/klein/deny\\\"):ivy.cms.cr(\\\"/images/klein/denyInherited\\\")):null\"/field \"\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionAccess\"}{/result \"result=IF(entry.isDeniedAllPermissions(),\\r\\n  \\\"All\\\",\\r\\n  IF(entry.isDeniedAnyPermission(), \\r\\n    \\\"Some\\\",\\r\\n    \\\"None\\\"\\r\\n  )\\r\\n)\"/version \"3.0\"/icon \"result=IF(entry.isDeniedAllPermissions(),\\r\\n  ivy.cms.cr(\\\"/images/klein/deny\\\"),\\r\\n  null\\r\\n)\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.security.IPermissionGroupAccess\"}}/version \"3.0\"}}}");
    }
    return permissionsTableTree;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("Ok");
      okButton.setStyleProperties("{/fill \"HORIZONTAL\"}");
      okButton.setDefaultCapable(true);
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes grantButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getGrantButton() {
    if (grantButton == null) {
      grantButton = new RButton();
      grantButton.setText("Grant");
      // SONAR-OFF
      grantButton.setStyleProperties("{/alignmentY \"0\"/alignmentX \"0\"}");
      // SONAR-ON
      grantButton.setMargin(new com.ulcjava.base.application.util.Insets(0, 0, 0, 0));
      grantButton.setForeground(new Color(51, 51, 51));
      grantButton.setName("grantButton");
    }
    return grantButton;
  }

  /**
   * This method initializes ungrantButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUngrantButton() {
    if (ungrantButton == null) {
      ungrantButton = new RButton();
      ungrantButton.setText("Ungrant");
      // SONAR-OFF
      ungrantButton.setStyleProperties("{/alignmentY \"0\"/alignmentX \"0\"}");
      // SONAR-ON
      ungrantButton.setName("ungrantButton");
    }
    return ungrantButton;
  }

  /**
   * This method initializes denyButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDenyButton() {
    if (denyButton == null) {
      denyButton = new RButton();
      denyButton.setText("Deny");
      // SONAR-OFF
      denyButton.setStyleProperties("{/alignmentY \"0\"/alignmentX \"0\"}");
      // SONAR-ON
      denyButton.setName("denyButton");
    }
    return denyButton;
  }

  /**
   * This method initializes undenyButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUndenyButton() {
    if (undenyButton == null) {
      undenyButton = new RButton();
      undenyButton.setText("Undeny");
      // SONAR-OFF
      undenyButton.setStyleProperties("{/alignmentY \"0\"/alignmentX \"0\"}");
      // SONAR-ON
      undenyButton.setName("undenyButton");
    }
    return undenyButton;
  }

  /**
   * This method initializes toolPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getToolPane() {
    if (toolPane == null) {
      toolPane = new RGridLayoutPane();
      toolPane.setName("toolPane");
      toolPane.setStyleProperties("{/anchor \"NORTH\"/insetsTop \"5\"/insetsRight \"5\"}");
      toolPane.setColumns(1);
      toolPane.setRows(0);
      toolPane.setVgap(5);
      toolPane.add(getGrantButton());
      toolPane.add(getUngrantButton());
      toolPane.add(getDenyButton());
      toolPane.add(getUndenyButton());
    }
    return toolPane;
  }

  /**
   * This method initializes permissionLookup
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField
   */
  private CustomizedSearchField getPermissionLookup() {
    if (permissionLookup == null) {
      permissionLookup = new CustomizedSearchField();
      permissionLookup.setName("permissionLookup");
      permissionLookup.addSearchCallback(SearchCallback.invokeMethod("filter").onPanel(this).build());
    }
    return permissionLookup;
  }

  /**
   * This method initializes permissionLookupLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPermissionLookupLabel() {
    if (permissionLookupLabel == null) {
      permissionLookupLabel = new RLabel();
      permissionLookupLabel.setName("permissionLookupLabel");
      permissionLookupLabel.setText("<%=ivy.cms.co(\"/Dialogs/security/findPermissions\")%>");
    }
    return permissionLookupLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
