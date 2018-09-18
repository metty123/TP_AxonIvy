package ch.ivyteam.ivy.admin.tool.SystemPropertyList;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCListSelectionModel;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for SystemPropertiesPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class SystemPropertyListPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane propertiesTableScrollPane = null;
  private RTable propertiesTable = null;
  private RGridBagLayoutPane propertiesTableButtonPanel = null;
  private RButton editButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of SystemPropertiesPanel
   */
  public SystemPropertyListPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes SystemPropertiesPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(496, 353));
    this.add(getPropertiesTableScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPropertiesTableButtonPanel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes propertiesTableScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getPropertiesTableScrollPane() {
    if (propertiesTableScrollPane == null) {
      propertiesTableScrollPane = new RScrollPane();
      propertiesTableScrollPane.setName("propertiesTableScrollPane");
      propertiesTableScrollPane.setViewPortView(getPropertiesTable());
    }
    return propertiesTableScrollPane;
  }

  /**
   * This method initializes propertiesTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getPropertiesTable() {
    if (propertiesTable == null) {
      propertiesTable = new RTable();
      propertiesTable.setName("propertiesTable");
      propertiesTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=entry.getName()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Name\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"150\"}{/result \"result=IF(entry.getUserInterfaceFormat() == ch.ivyteam.ivy.system.UserInterfaceFormat.PASSWORD,  \\r\\n  IF(entry.value.isEmpty(), \\\"\\\", \\\"********\\\"), \\r\\nIF(entry.getUserInterfaceFormat() == ch.ivyteam.ivy.system.UserInterfaceFormat.DAYTIME, \\r\\n  \\\"\\\" + (entry.getIntValue()/1000/60/60).format(\\\"00\\\") + \\\":\\\" + (entry.getIntValue()/1000/60%60).format(\\\"00\\\"),\\r\\nentry.value))\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Value\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"120\"}{/result \"result=entry.getDefaultValue()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Default\\\"\"/headerAlignment \"default\"/field \"\"/columnWidth \"120\"}{/result \"result=new ch.ivyteam.ivy.admin.tool.SystemPropertyWrapper(entry).getDescription()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Description\\\"\"/headerAlignment \"default\"/field \"\"}}}");
      propertiesTable.setSelectionMode(ULCListSelectionModel.SINGLE_SELECTION);
      propertiesTable.setBackground(Color.white);
      propertiesTable.setSortable(true);
      propertiesTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_LAST_COLUMN);
      // propertiesTable.setSortable(true);
    }
    return propertiesTable;
  }

  /**
   * This method initializes propertiesTableButtonPanel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxLayoutPane
   */
  private RGridBagLayoutPane getPropertiesTableButtonPanel() {
    if (propertiesTableButtonPanel == null) {
      propertiesTableButtonPanel = new RGridBagLayoutPane();
      propertiesTableButtonPanel.setName("propertiesTableButtonPanel");
      propertiesTableButtonPanel.setStyleProperties("{/anchor \"NORTH\"/fill \"NONE\"/weightY \"0\"/weightX \"0\"}");
      propertiesTableButtonPanel.add(getEditButton(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return propertiesTableButtonPanel;
  }

  /**
   * This method initializes editButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getEditButton() {
    if (editButton == null) {
      editButton = new RButton();
      editButton.setText("Edit");
      editButton.setStyleProperties("{/anchor \"NORTH\"}");
      editButton.setName("editButton");
    }
    return editButton;
  }
} // @jve:decl-index=0:visual-constraint="12,11"
