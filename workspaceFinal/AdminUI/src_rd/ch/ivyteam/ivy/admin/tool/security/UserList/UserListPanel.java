package ch.ivyteam.ivy.admin.tool.security.UserList;

import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField;
import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField.SearchCallback;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCTable;

/**
 * RichDialog panel implementation for UserListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class UserListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scrollPane = null;
  private RTable table = null;
  private CustomizedSearchField lookupUsers = null;
  private RLabel findUserLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of UserListPanel
   */
  public UserListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UserListPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(274, 197));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, 1.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLookupUsers(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getFindUserLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes ScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane() {
    if (scrollPane == null) {
      scrollPane = new RScrollPane();
      scrollPane.setName("scrollPane");
      scrollPane.setViewPortView(getTable());
    }
    return scrollPane;
  }

  /**
   * This method initializes Table
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getTable() {
    if (table == null) {
      table = new RTable();
      table.setName("table");
      table
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/user/username\\\")\"/headerAlignment \"default\"/field \"username\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/user/fullname\\\")\"/headerAlignment \"default\"/field \"fullname\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}}}");
      table.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      table.setSortable(true);
    }
    return table;
  }

  /**
   * This method initializes lookupUsers
   */
  private CustomizedSearchField getLookupUsers() {
    if (lookupUsers == null) {
      lookupUsers = new CustomizedSearchField();
      lookupUsers.setName("lookupUsers");
      lookupUsers.addSearchCallback(SearchCallback.invokeMethod("filter").onPanel(this).build());
    }
    return lookupUsers;
  }

  /**
   * This method initializes findUserLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFindUserLabel() {
    if (findUserLabel == null) {
      findUserLabel = new RLabel();
      findUserLabel.setText("<%=ivy.cms.co(\"/Dialogs/general/findUserLabel\")%>");
      findUserLabel.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"0\"/insetsLeft \"5\"}");
      findUserLabel.setName("findUserLabel");
    }
    return findUserLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
