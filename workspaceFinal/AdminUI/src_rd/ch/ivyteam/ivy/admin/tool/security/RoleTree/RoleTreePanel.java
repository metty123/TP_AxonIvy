package ch.ivyteam.ivy.admin.tool.security.RoleTree;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

/**
 * RichDialog panel implementation for RoleTreePanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class RoleTreePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTree rolesTree = null;
  private RScrollPane rolesScrollPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of RoleTreePanel
   */
  public RoleTreePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes RoleTreePanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getRolesScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes rolesTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree
   */
  private RTree getRolesTree() {
    if (rolesTree == null) {
      rolesTree = new RTree();
      rolesTree.setName("rolesTree");
      rolesTree.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      rolesTree
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons true /version \"3.0\"/dynamicTreeLoadMode \"LOAD_FOR_RENDER_PARENT\"/columns {{/patterns {{/icon \"\"/version \"3.0\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.getDisplayName()\"/version \"3.0\"/tooltip \"\"/icon \"result=ivy.cms.cr(\\\"/images/klein/role\\\")\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.admin.tool.role.Role\"}{/result \"result=entry.getDisplayName()\"/version \"3.0\"/tooltip \"\"/icon \"result=ivy.cms.cr(\\\"/images/klein/roleMember\\\")\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.admin.tool.role.RoleMember\"}}/version \"3.0\"}}}");
    }
    return rolesTree;
  }

  /**
   * This method initializes rolesScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getRolesScrollPane() {
    if (rolesScrollPane == null) {
      rolesScrollPane = new RScrollPane();
      rolesScrollPane.setName("rolesScrollPane");
      rolesScrollPane.setViewPortView(getRolesTree());
    }
    return rolesScrollPane;
  }
}
