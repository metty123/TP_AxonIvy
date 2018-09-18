package ch.ivyteam.ivy.admin.tool.calendar.CalendarTree;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;

/**
 * <p>
 * CalendarTreePanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class CalendarTreePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTree Tree = null;
  private RScrollPane ScrollPane = null;
  private RPopupMenu contextMenu = null;
  private RMenuItem newCalendarItem = null;
  private RMenuItem deleteCalendarItem = null;
  private RButton newButton = null;
  private RButton deleteButton = null;
  private RToolBar calendarToolBar = null;

  // SONAR-OFF
  /**
   * Create a new instance of CalendarTreePanel
   */
  public CalendarTreePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes CalendarTreePanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getCalendarToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, 1.0, 1.0,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes Tree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree
   */
  private RTree getTree() {
    if (Tree == null) {
      Tree = new RTree();
      Tree.setName("Tree");
      Tree.setPreferredSize(new com.ulcjava.base.application.util.Dimension(150, 100));
      Tree.setComponentPopupMenu(getContextMenu());
      Tree.setModelConfiguration("{/dynamicTreeLoadMode \"LOAD_FOR_RENDER_PARENT\"/version \"3.0\"/emptyTableText \"\"/showTableheader true /autoTableheader false /showtooltip false /showIcons true /columns {{/patterns {{/result \"result=node.info\"/version \"3.0\"/icon \"result=ivy.cms.cr(\\\"/images/klein/calendar\\\")\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}}}}}");
    }
    return Tree;
  }

  /**
   * This method initializes ScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane() {
    if (ScrollPane == null) {
      ScrollPane = new RScrollPane();
      ScrollPane.setName("ScrollPane");
      ScrollPane.setViewPortView(getTree());
    }
    return ScrollPane;
  }

  /**
   * This method initializes contextMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getContextMenu() {
    if (contextMenu == null) {
      contextMenu = new RPopupMenu();
      contextMenu.setName("contextMenu");
      contextMenu.add(getNewCalendarItem());
      contextMenu.add(getDeleteCalendarItem());
    }
    return contextMenu;
  }

  /**
   * This method initializes newCalendarItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getNewCalendarItem() {
    if (newCalendarItem == null) {
      newCalendarItem = new RMenuItem();
      newCalendarItem.setText("new");
      newCalendarItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      newCalendarItem.setName("newCalendarItem");
    }
    return newCalendarItem;
  }

  /**
   * This method initializes deleteCalendarItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getDeleteCalendarItem() {
    if (deleteCalendarItem == null) {
      deleteCalendarItem = new RMenuItem();
      deleteCalendarItem.setText("delete");
      deleteCalendarItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      deleteCalendarItem.setName("deleteCalendarItem");
    }
    return deleteCalendarItem;
  }

  /**
   * This method initializes newButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getNewButton() {
    if (newButton == null) {
      newButton = new RButton();
      newButton.setName("newButton");
      newButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
    }
    return newButton;
  }

  /**
   * This method initializes deleteButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteButton() {
    if (deleteButton == null) {
      deleteButton = new RButton();
      deleteButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      deleteButton.setName("deleteButton");
    }
    return deleteButton;
  }

  /**
   * This method initializes calendarToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getCalendarToolBar() {
    if (calendarToolBar == null) {
      calendarToolBar = new RToolBar();
      calendarToolBar.setName("calendarToolBar");
      calendarToolBar.setFloatable(false);
      calendarToolBar.add(getNewButton());
      calendarToolBar.add(getDeleteButton());
    }
    return calendarToolBar;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
