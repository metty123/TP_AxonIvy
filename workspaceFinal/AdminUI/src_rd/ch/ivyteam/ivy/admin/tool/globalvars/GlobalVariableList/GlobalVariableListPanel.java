package ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList;

import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField;
import ch.ivyteam.ivy.admin.tool.component.customized.CustomizedSearchField.SearchCallback;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;

import com.ulcjava.base.application.ULCScrollPane;
import com.ulcjava.base.application.ULCTable;

/**
 * RichDialog panel implementation for GlobalVariableListPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class GlobalVariableListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scpGlobalVariables = null;
  private RTable tblGlobalVariables = null;
  private RPopupMenu popGlobalVariables = null; // @jve:decl-index=0:visual-constraint="724,54"
  private RMenuItem mnuResetValue = null;
  private RLabel lblSearch = null;
  private CustomizedSearchField lookupVariables = null;
  private RComboBox cboFilterBy = null;

  // SONAR-OFF
  /**
   * Create a new instance of GlobalVariableListPanel
   */
  public GlobalVariableListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes GlobalVariableListPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(457, 280));
    this.add(getLblSearch(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.SOUTH, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLookupVariables(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, 1.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            2, 0), 0, 0));
    this.add(getScpGlobalVariables(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 4, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCboFilterBy(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, 0.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(3, 0,
            0, 0), 0, 0));
  }

  /**
   * This method initializes scpGlobalVariables
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScpGlobalVariables() {
    if (scpGlobalVariables == null) {
      scpGlobalVariables = new RScrollPane();
      scpGlobalVariables.setName("scpGlobalVariables");
      scpGlobalVariables.setStyle("verticalScroll");
      scpGlobalVariables.setVerticalScrollBarPolicy(ULCScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
      scpGlobalVariables.setViewPortView(getTblGlobalVariables());
    }
    return scpGlobalVariables;
  }

  /**
   * This method initializes tblGlobalVariables
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getTblGlobalVariables() {
    if (tblGlobalVariables == null) {
      tblGlobalVariables = new RTable();
      tblGlobalVariables.setName("tblGlobalVariables");
      tblGlobalVariables.setSortable(true);
      tblGlobalVariables
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/globalVariables/name\\\")\"/field \"name\"/editable \"false\"/condition \"\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/globalVariables/description\\\")\"/field \"description\"/editable \"false\"/condition \"\"/cellWidget \"\"}{/result \"result=(entry.getDefaultGlobalVariable() != null ? entry.getDefaultGlobalVariable().getValue() : entry.getValue())\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/globalVariables/defaultValue\\\")\"/field \"\"/editable \"false\"/condition \"\"/cellWidget \"\"}{/result \"result=(entry.getDefaultGlobalVariable() != null ? entry.getValue() : \\\"\\\")\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/globalVariables/value\\\")\"/field \"value\"/editable \"false\"/condition \"\"/cellWidget \"\"}}}");
      tblGlobalVariables.setComponentPopupMenu(getPopGlobalVariables());
      tblGlobalVariables.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
    }
    return tblGlobalVariables;
  }

  /**
   * This method initializes popGlobalVariables
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getPopGlobalVariables() {
    if (popGlobalVariables == null) {
      popGlobalVariables = new RPopupMenu();
      popGlobalVariables.setName("popGlobalVariables");
      popGlobalVariables.add(getMnuResetValue());
    }
    return popGlobalVariables;
  }

  /**
   * This method initializes mnuResetValue
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getMnuResetValue() {
    if (mnuResetValue == null) {
      mnuResetValue = new RMenuItem();
      mnuResetValue.setText("Reset to Default Value");
      mnuResetValue.setName("mnuResetValue");
    }
    return mnuResetValue;
  }

  /**
   * This method initializes lblSearch
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSearch() {
    if (lblSearch == null) {
      lblSearch = new RLabel();
      lblSearch.setText("<%= ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/label/findGlobalVariablesBy\") %>");
      lblSearch.setName("lblSearch");
    }
    return lblSearch;
  }

  /**
   * This method initializes lookupVariables
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLookupTextField
   */
  private CustomizedSearchField getLookupVariables() {
    if (lookupVariables == null) {
      lookupVariables = new CustomizedSearchField();
      lookupVariables.setName("lookupVariables");
      lookupVariables.addSearchCallback(SearchCallback.invokeMethod("filter").onPanel(this).build());
    }
    return lookupVariables;
  }

  /**
   * This method initializes cboFilterBy
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCboFilterBy() {
    if (cboFilterBy == null) {
      cboFilterBy = new RComboBox();
      cboFilterBy.setName("cboFilterBy");
      cboFilterBy.setStyleProperties("{/weightX \"0\"}");
      cboFilterBy.setModelConfiguration("{/result \"result=entry\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
      cboFilterBy.setPreferredSize(new com.ulcjava.base.application.util.Dimension(80, 21));
    }
    return cboFilterBy;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
