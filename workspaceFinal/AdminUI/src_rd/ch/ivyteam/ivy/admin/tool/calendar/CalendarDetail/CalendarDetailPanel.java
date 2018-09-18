package ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar;
import ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * <p>
 * CalendarDetailPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class CalendarDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RComboBox startOfWeekComboBox = null;
  private RButton addWorkingTimeButton = null;
  private RButton deleteWorkingTimeButton = null;
  private RPopupMenu workinTimeTablePopupMenu = null; // @jve:decl-index=0:visual-constraint="358,118"
  private RMenuItem workinTimeTableDeleteMenuItem = null;
  private RMenuItem workinTimeTableNewMenuItem = null;
  private RToolBar workingTimeToolBar = null;
  private RGridBagLayoutPane workingTimePane = null;
  private RGridBagLayoutPane startOfWeekPane = null;
  private RTable WorkingTimeTable = null;
  private RGridBagLayoutPane freeDayOfWeekPane = null;
  private RTable freeDayOfWeekTable = null;
  private RToolBar freeDayOfWeekToolBar = null;
  private RButton addFreeDayOfWeekButton = null;
  private RButton deleteFreeDayOfWeekButton = null;
  private RGridBagLayoutPane freeDayOfYearPane = null;
  private RGridBagLayoutPane freeEasterRelativeDayPane = null;
  private RGridBagLayoutPane FreeDatesPane = null;
  private RToolBar freeDayOfYearToolBar = null;
  private RButton addFreeDayOfYearButton = null;
  private RButton deleteFreeDayOfYearButton = null;
  private RToolBar freeEasterRelativeDayToolBar = null;
  private RButton addEasterRelativeDayButton = null;
  private RButton deleteEasterRelativeDayButton = null;
  private RToolBar freeDateToolBar = null;
  private RButton addFreeDateButton = null;
  private RButton deleteFreeDateButton = null;
  private RTable freeDayOfYearTable = null;
  private RTable FreeEasterRelativeDayTable = null;
  private RTable FreeDateTable = null;
  private RPopupMenu freeDayOfWeekTablePopupMenu = null; // @jve:decl-index=0:visual-constraint="353,259"
  private RMenuItem freeDayOfWeekTableDeleteMenuItem = null;
  private RMenuItem freeDayOfWeekTableNewMenuItem = null;
  private RPopupMenu freeDayOfYearTablePopupMenu = null; // @jve:decl-index=0:visual-constraint="358,382"
  private RMenuItem freeDayOfYearTableDeleteMenuItem = null;
  private RMenuItem freeDayOfYearTableNewMenuItem = null;
  private RPopupMenu freeEasterRelativeDayTablePopupMenu = null; // @jve:decl-index=0:visual-constraint="353,520"
  private RMenuItem freeEasterRelativeDayTableDeleteMenuItem = null;
  private RMenuItem freeEasterRelativeDayTableNewMenuItem = null;
  private RPopupMenu freeDatesTablePopupMenu = null; // @jve:decl-index=0:visual-constraint="362,661"
  private RMenuItem freeDatesTableDeleteMenuItem = null;
  private RMenuItem freeDatesTableNewMenuItem = null;
  private RScrollPane tablesScrollPane = null;
  private RGridBagLayoutPane tablesPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of CalendarDetailPanel
   */
  public CalendarDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes CalendarDetailPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getStartOfWeekPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTablesScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 11, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes startOfWeekComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getStartOfWeekComboBox() {
    if (startOfWeekComboBox == null) {
      startOfWeekComboBox = new RComboBox();
      startOfWeekComboBox.setName("startOfWeekComboBox");
      startOfWeekComboBox.setName("startOfWeekComboBox");
      startOfWeekComboBox
          .setModelConfiguration("{/result \"result=entry.getLocalizedName(ivy.session.contentLocale)\"/version \"3.0\"/tooltip \"\"/icon \"\"}");
    }
    return startOfWeekComboBox;
  }

  /**
   * This method initializes addWorkingTimeButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddWorkingTimeButton() {
    if (addWorkingTimeButton == null) {
      addWorkingTimeButton = new RButton();
      addWorkingTimeButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      addWorkingTimeButton.setName("addWorkingTimeButton");
    }
    return addWorkingTimeButton;
  }

  /**
   * This method initializes deleteWorkingTimeButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteWorkingTimeButton() {
    if (deleteWorkingTimeButton == null) {
      deleteWorkingTimeButton = new RButton();
      deleteWorkingTimeButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      deleteWorkingTimeButton.setName("deleteWorkingTimeButton");
    }
    return deleteWorkingTimeButton;
  }

  /**
   * This method initializes workinTimeTablePopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getWorkinTimeTablePopupMenu() {
    if (workinTimeTablePopupMenu == null) {
      workinTimeTablePopupMenu = new RPopupMenu();
      workinTimeTablePopupMenu.setName("workinTimeTablePopupMenu");
      workinTimeTablePopupMenu.add(getWorkinTimeTableNewMenuItem());
      workinTimeTablePopupMenu.add(getWorkinTimeTableDeleteMenuItem());
    }
    return workinTimeTablePopupMenu;
  }

  /**
   * This method initializes workinTimeTableDeleteMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getWorkinTimeTableDeleteMenuItem() {
    if (workinTimeTableDeleteMenuItem == null) {
      workinTimeTableDeleteMenuItem = new RMenuItem();
      workinTimeTableDeleteMenuItem.setText("delete");
      workinTimeTableDeleteMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      workinTimeTableDeleteMenuItem.setName("workinTimeTableDeleteMenuItem");
    }
    return workinTimeTableDeleteMenuItem;
  }

  /**
   * This method initializes workinTimeTableNewMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getWorkinTimeTableNewMenuItem() {
    if (workinTimeTableNewMenuItem == null) {
      workinTimeTableNewMenuItem = new RMenuItem();
      workinTimeTableNewMenuItem.setText("new");
      workinTimeTableNewMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      workinTimeTableNewMenuItem.setName("workinTimeTableNewMenuItem");
    }
    return workinTimeTableNewMenuItem;
  }

  /**
   * This method initializes workingTimeToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getWorkingTimeToolBar() {
    if (workingTimeToolBar == null) {
      workingTimeToolBar = new RToolBar();
      workingTimeToolBar.setName("workingTimeToolBar");
      workingTimeToolBar.setFloatable(false);
      workingTimeToolBar.add(getAddWorkingTimeButton());
      workingTimeToolBar.add(getDeleteWorkingTimeButton());
    }
    return workingTimeToolBar;
  }

  /**
   * This method initializes workingTimePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getWorkingTimePane() {
    if (workingTimePane == null) {
      workingTimePane = new RGridBagLayoutPane();
      workingTimePane.setName("workingTimePane");
      workingTimePane.setBorder(BorderFactory.createTitledBorder(null,
          "<%= ivy.cms.co(\"/Dialogs/application/calendar/workingTimes\") %>", ULCTitledBorder.DEFAULT_JUSTIFICATION,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      workingTimePane.add(getWorkingTimeToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      workingTimePane.add(getWorkingTimeTable(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return workingTimePane;
  }

  /**
   * This method initializes startOfWeekPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getStartOfWeekPane() {
    if (startOfWeekPane == null) {
      startOfWeekPane = new RGridBagLayoutPane();
      startOfWeekPane.setName("startOfWeekPane");
      startOfWeekPane.setName("startOfWeekPane");
      startOfWeekPane.setBorder(BorderFactory.createTitledBorder(null,
          "<%= ivy.cms.co(\"/Dialogs/application/calendar/startOfWeek\") %>", ULCTitledBorder.DEFAULT_JUSTIFICATION,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      startOfWeekPane.setName("startOfWeekPane");
      startOfWeekPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/weightX \"0\"}");
      startOfWeekPane.add(getStartOfWeekComboBox(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return startOfWeekPane;
  }

  /**
   * This method initializes WorkingTimeTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getWorkingTimeTable() {
    if (WorkingTimeTable == null) {
      WorkingTimeTable = new RTable();
      WorkingTimeTable.setSortable(true);
      WorkingTimeTable.setAutoSelectFirstEntry(false);
      WorkingTimeTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/field \"description\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"time\\\"\"/field \"day\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}}}");
      WorkingTimeTable.setName("WorkingTimeTable");
      WorkingTimeTable.setShowGrid(true);
      WorkingTimeTable.setComponentPopupMenu(getWorkinTimeTablePopupMenu());
      WorkingTimeTable.setStyleProperties("{/insetsRight \"0\"}");
    }
    return WorkingTimeTable;
  }

  /**
   * This method initializes freeDayOfWeekPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getFreeDayOfWeekPane() {
    if (freeDayOfWeekPane == null) {
      freeDayOfWeekPane = new RGridBagLayoutPane();
      freeDayOfWeekPane.setName("freeDayOfWeekPane");
      freeDayOfWeekPane.setBorder(BorderFactory.createTitledBorder(null,
          "<%= ivy.cms.co(\"/Dialogs/application/calendar/freeDaysOfWeek\") %>", ULCTitledBorder.DEFAULT_JUSTIFICATION,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      freeDayOfWeekPane.add(getFreeDayOfWeekTable(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      freeDayOfWeekPane.add(getFreeDayOfWeekToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return freeDayOfWeekPane;
  }

  /**
   * This method initializes freeDayOfWeekTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getFreeDayOfWeekTable() {
    if (freeDayOfWeekTable == null) {
      freeDayOfWeekTable = new RTable();
      freeDayOfWeekTable.setName("freeDayOfWeekTable");
      freeDayOfWeekTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Description\\\"\"/field \"description\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Day\\\"\"/field \"day\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}}}");
      freeDayOfWeekTable.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"}");
      freeDayOfWeekTable.setComponentPopupMenu(getFreeDayOfWeekTablePopupMenu());
      freeDayOfWeekTable.setSortable(true);
    }
    return freeDayOfWeekTable;
  }

  /**
   * This method initializes freeDayOfWeekToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getFreeDayOfWeekToolBar() {
    if (freeDayOfWeekToolBar == null) {
      freeDayOfWeekToolBar = new RToolBar();
      freeDayOfWeekToolBar.setName("freeDayOfWeekToolBar");
      freeDayOfWeekToolBar.setFloatable(false);
      freeDayOfWeekToolBar.add(getAddFreeDayOfWeekButton());
      freeDayOfWeekToolBar.add(getDeleteFreeDayOfWeekButton());
    }
    return freeDayOfWeekToolBar;
  }

  /**
   * This method initializes addFreeDayOfWeekButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddFreeDayOfWeekButton() {
    if (addFreeDayOfWeekButton == null) {
      addFreeDayOfWeekButton = new RButton();
      addFreeDayOfWeekButton.setName("addFreeDayOfWeekButton");
      addFreeDayOfWeekButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
    }
    return addFreeDayOfWeekButton;
  }

  /**
   * This method initializes deleteFreeDayOfWeekButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteFreeDayOfWeekButton() {
    if (deleteFreeDayOfWeekButton == null) {
      deleteFreeDayOfWeekButton = new RButton();
      deleteFreeDayOfWeekButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      deleteFreeDayOfWeekButton.setName("deleteFreeDayOfWeekButton");
    }
    return deleteFreeDayOfWeekButton;
  }

  /**
   * This method initializes freeDayOfYearPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getFreeDayOfYearPane() {
    if (freeDayOfYearPane == null) {
      freeDayOfYearPane = new RGridBagLayoutPane();
      freeDayOfYearPane.setName("freeDayOfYearPane");
      freeDayOfYearPane.setBorder(BorderFactory.createTitledBorder(null,
          "<%= ivy.cms.co(\"/Dialogs/application/calendar/freeDaysOfYear\") %>", ULCTitledBorder.DEFAULT_JUSTIFICATION,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      freeDayOfYearPane.add(getFreeDayOfYearToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      freeDayOfYearPane.add(getFreeDayOfYearTable(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return freeDayOfYearPane;
  }

  /**
   * This method initializes freeEasterRelativeDayPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getFreeEasterRelativeDayPane() {
    if (freeEasterRelativeDayPane == null) {
      freeEasterRelativeDayPane = new RGridBagLayoutPane();
      freeEasterRelativeDayPane.setName("freeEasterRelativeDayPane");
      freeEasterRelativeDayPane.setBorder(BorderFactory.createTitledBorder(null,
          "<%= ivy.cms.co(\"/Dialogs/application/calendar/freeEasterRelativeDays\") %>",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      freeEasterRelativeDayPane.add(getFreeEasterRelativeDayToolBar(),
          new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      freeEasterRelativeDayPane.add(getFreeEasterRelativeDayTable(),
          new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
    }
    return freeEasterRelativeDayPane;
  }

  /**
   * This method initializes FreeDatesPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getFreeDatesPane() {
    if (FreeDatesPane == null) {
      FreeDatesPane = new RGridBagLayoutPane();
      FreeDatesPane.setName("FreeDatesPane");
      FreeDatesPane.setBorder(BorderFactory.createTitledBorder(null,
          "<%= ivy.cms.co(\"/Dialogs/application/calendar/freeDates\") %>", ULCTitledBorder.DEFAULT_JUSTIFICATION,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      FreeDatesPane.add(getFreeDateToolBar(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      FreeDatesPane.add(getFreeDateTable(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return FreeDatesPane;
  }

  /**
   * This method initializes freeDayOfYearToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getFreeDayOfYearToolBar() {
    if (freeDayOfYearToolBar == null) {
      freeDayOfYearToolBar = new RToolBar();
      freeDayOfYearToolBar.setName("freeDayOfYearToolBar");
      freeDayOfYearToolBar.setFloatable(false);
      freeDayOfYearToolBar.add(getAddFreeDayOfYearButton());
      freeDayOfYearToolBar.add(getDeleteFreeDayOfYearButton());
    }
    return freeDayOfYearToolBar;
  }

  /**
   * This method initializes addFreeDayOfYearButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddFreeDayOfYearButton() {
    if (addFreeDayOfYearButton == null) {
      addFreeDayOfYearButton = new RButton();
      addFreeDayOfYearButton.setName("addFreeDayOfYearButton");
      addFreeDayOfYearButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
    }
    return addFreeDayOfYearButton;
  }

  /**
   * This method initializes deleteFreeDayOfYearButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteFreeDayOfYearButton() {
    if (deleteFreeDayOfYearButton == null) {
      deleteFreeDayOfYearButton = new RButton();
      deleteFreeDayOfYearButton.setName("deleteFreeDayOfYearButton");
      deleteFreeDayOfYearButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
    }
    return deleteFreeDayOfYearButton;
  }

  /**
   * This method initializes freeEasterRelativeDayToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getFreeEasterRelativeDayToolBar() {
    if (freeEasterRelativeDayToolBar == null) {
      freeEasterRelativeDayToolBar = new RToolBar();
      freeEasterRelativeDayToolBar.setName("freeEasterRelativeDayToolBar");
      freeEasterRelativeDayToolBar.setFloatable(false);
      freeEasterRelativeDayToolBar.add(getAddEasterRelativeDayButton());
      freeEasterRelativeDayToolBar.add(getDeleteEasterRelativeDayButton());
    }
    return freeEasterRelativeDayToolBar;
  }

  /**
   * This method initializes addEasterRelativeDayButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddEasterRelativeDayButton() {
    if (addEasterRelativeDayButton == null) {
      addEasterRelativeDayButton = new RButton();
      addEasterRelativeDayButton.setName("addEasterRelativeDayButton");
      addEasterRelativeDayButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
    }
    return addEasterRelativeDayButton;
  }

  /**
   * This method initializes deleteEasterRelativeDayButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteEasterRelativeDayButton() {
    if (deleteEasterRelativeDayButton == null) {
      deleteEasterRelativeDayButton = new RButton();
      deleteEasterRelativeDayButton.setName("deleteEasterRelativeDayButton");
      deleteEasterRelativeDayButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
    }
    return deleteEasterRelativeDayButton;
  }

  /**
   * This method initializes freeDateToolBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RToolBar
   */
  private RToolBar getFreeDateToolBar() {
    if (freeDateToolBar == null) {
      freeDateToolBar = new RToolBar();
      freeDateToolBar.setName("freeDateToolBar");
      freeDateToolBar.setFloatable(false);
      freeDateToolBar.add(getAddFreeDateButton());
      freeDateToolBar.add(getDeleteFreeDateButton());
    }
    return freeDateToolBar;
  }

  /**
   * This method initializes addFreeDateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAddFreeDateButton() {
    if (addFreeDateButton == null) {
      addFreeDateButton = new RButton();
      addFreeDateButton.setName("addFreeDateButton");
      addFreeDateButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
    }
    return addFreeDateButton;
  }

  /**
   * This method initializes deleteFreeDateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteFreeDateButton() {
    if (deleteFreeDateButton == null) {
      deleteFreeDateButton = new RButton();
      deleteFreeDateButton.setName("deleteFreeDateButton");
      deleteFreeDateButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
    }
    return deleteFreeDateButton;
  }

  /**
   * This method initializes freeDayOfYearTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getFreeDayOfYearTable() {
    if (freeDayOfYearTable == null) {
      freeDayOfYearTable = new RTable();
      freeDayOfYearTable.setName("freeDayOfYearTable");
      freeDayOfYearTable.setSortable(true);
      freeDayOfYearTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"\\\"\"/field \"description\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Day\\\"\"/field \"day\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}}}");
      freeDayOfYearTable.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"}");
      freeDayOfYearTable.setComponentPopupMenu(getFreeDayOfYearTablePopupMenu());
    }
    return freeDayOfYearTable;
  }

  /**
   * This method initializes FreeEasterRelativeDayTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getFreeEasterRelativeDayTable() {
    if (FreeEasterRelativeDayTable == null) {
      FreeEasterRelativeDayTable = new RTable();
      FreeEasterRelativeDayTable.setName("FreeEasterRelativeDayTable");
      FreeEasterRelativeDayTable.setSortable(true);
      FreeEasterRelativeDayTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"\\\"\"/field \"description\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Days since Easter\\\"\"/field \"day\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}}}");
      FreeEasterRelativeDayTable.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"}");
      FreeEasterRelativeDayTable.setComponentPopupMenu(getFreeEasterRelativeDayTablePopupMenu());
    }
    return FreeEasterRelativeDayTable;
  }

  /**
   * This method initializes FreeDateTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getFreeDateTable() {
    if (FreeDateTable == null) {
      FreeDateTable = new RTable();
      FreeDateTable.setName("FreeDateTable");
      FreeDateTable.setSortable(true);
      FreeDateTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"\\\"\"/field \"description\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Date\\\"\"/field \"day\"/editable \"\"/condition \"\"/columnStyle \"inheritedValues\"/cellWidget \"\"}}}");
      FreeDateTable.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"}");
      FreeDateTable.setComponentPopupMenu(getFreeDatesTablePopupMenu());
    }
    return FreeDateTable;
  }

  /**
   * This method initializes freeDayOfWeekTablePopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getFreeDayOfWeekTablePopupMenu() {
    if (freeDayOfWeekTablePopupMenu == null) {
      freeDayOfWeekTablePopupMenu = new RPopupMenu();
      freeDayOfWeekTablePopupMenu.setName("freeDayOfWeekTablePopupMenu");
      freeDayOfWeekTablePopupMenu.add(getFreeDayOfWeekTableNewMenuItem());
      freeDayOfWeekTablePopupMenu.add(getFreeDayOfWeekTableDeleteMenuItem());
    }
    return freeDayOfWeekTablePopupMenu;
  }

  /**
   * This method initializes freeDayOfWeekTableDeleteMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeDayOfWeekTableDeleteMenuItem() {
    if (freeDayOfWeekTableDeleteMenuItem == null) {
      freeDayOfWeekTableDeleteMenuItem = new RMenuItem();
      freeDayOfWeekTableDeleteMenuItem.setName("freeDayOfWeekTableDeleteMenuItem");
      freeDayOfWeekTableDeleteMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      freeDayOfWeekTableDeleteMenuItem.setText("delete");
    }
    return freeDayOfWeekTableDeleteMenuItem;
  }

  /**
   * This method initializes freeDayOfWeekTableNewMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeDayOfWeekTableNewMenuItem() {
    if (freeDayOfWeekTableNewMenuItem == null) {
      freeDayOfWeekTableNewMenuItem = new RMenuItem();
      freeDayOfWeekTableNewMenuItem.setName("freeDayOfWeekTableNewMenuItem");
      freeDayOfWeekTableNewMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      freeDayOfWeekTableNewMenuItem.setText("new");
    }
    return freeDayOfWeekTableNewMenuItem;
  }

  /**
   * This method initializes freeDayOfYearTablePopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getFreeDayOfYearTablePopupMenu() {
    if (freeDayOfYearTablePopupMenu == null) {
      freeDayOfYearTablePopupMenu = new RPopupMenu();
      freeDayOfYearTablePopupMenu.setName("freeDayOfYearTablePopupMenu");
      freeDayOfYearTablePopupMenu.add(getFreeDayOfYearTableNewMenuItem());
      freeDayOfYearTablePopupMenu.add(getFreeDayOfYearTableDeleteMenuItem());
    }
    return freeDayOfYearTablePopupMenu;
  }

  /**
   * This method initializes freeDayOfYearTableDeleteMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeDayOfYearTableDeleteMenuItem() {
    if (freeDayOfYearTableDeleteMenuItem == null) {
      freeDayOfYearTableDeleteMenuItem = new RMenuItem();
      freeDayOfYearTableDeleteMenuItem.setName("freeDayOfYearTableDeleteMenuItem");
      freeDayOfYearTableDeleteMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      freeDayOfYearTableDeleteMenuItem.setText("delete");
    }
    return freeDayOfYearTableDeleteMenuItem;
  }

  /**
   * This method initializes freeDayOfYearTableNewMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeDayOfYearTableNewMenuItem() {
    if (freeDayOfYearTableNewMenuItem == null) {
      freeDayOfYearTableNewMenuItem = new RMenuItem();
      freeDayOfYearTableNewMenuItem.setName("freeDayOfYearTableNewMenuItem");
      freeDayOfYearTableNewMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      freeDayOfYearTableNewMenuItem.setText("new");
    }
    return freeDayOfYearTableNewMenuItem;
  }

  /**
   * This method initializes freeEasterRelativeDayTablePopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getFreeEasterRelativeDayTablePopupMenu() {
    if (freeEasterRelativeDayTablePopupMenu == null) {
      freeEasterRelativeDayTablePopupMenu = new RPopupMenu();
      freeEasterRelativeDayTablePopupMenu.setName("freeEasterRelativeDayTablePopupMenu");
      freeEasterRelativeDayTablePopupMenu.add(getFreeEasterRelativeDayTableNewMenuItem());
      freeEasterRelativeDayTablePopupMenu.add(getFreeEasterRelativeDayTableDeleteMenuItem());
    }
    return freeEasterRelativeDayTablePopupMenu;
  }

  /**
   * This method initializes freeEasterRelativeDayTableDeleteMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeEasterRelativeDayTableDeleteMenuItem() {
    if (freeEasterRelativeDayTableDeleteMenuItem == null) {
      freeEasterRelativeDayTableDeleteMenuItem = new RMenuItem();
      freeEasterRelativeDayTableDeleteMenuItem.setName("freeEasterRelativeDayTableDeleteMenuItem");
      freeEasterRelativeDayTableDeleteMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      freeEasterRelativeDayTableDeleteMenuItem.setText("delete");
    }
    return freeEasterRelativeDayTableDeleteMenuItem;
  }

  /**
   * This method initializes freeEasterRelativeDayTableNewMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeEasterRelativeDayTableNewMenuItem() {
    if (freeEasterRelativeDayTableNewMenuItem == null) {
      freeEasterRelativeDayTableNewMenuItem = new RMenuItem();
      freeEasterRelativeDayTableNewMenuItem.setName("freeEasterRelativeDayTableNewMenuItem");
      freeEasterRelativeDayTableNewMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      freeEasterRelativeDayTableNewMenuItem.setText("new");
    }
    return freeEasterRelativeDayTableNewMenuItem;
  }

  /**
   * This method initializes freeDatesTablePopupMenu
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RPopupMenu
   */
  private RPopupMenu getFreeDatesTablePopupMenu() {
    if (freeDatesTablePopupMenu == null) {
      freeDatesTablePopupMenu = new RPopupMenu();
      freeDatesTablePopupMenu.setName("freeDatesTablePopupMenu");
      freeDatesTablePopupMenu.add(getFreeDatesTableNewMenuItem());
      freeDatesTablePopupMenu.add(getFreeDatesTableDeleteMenuItem());
    }
    return freeDatesTablePopupMenu;
  }

  /**
   * This method initializes freeDatesTableDeleteMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeDatesTableDeleteMenuItem() {
    if (freeDatesTableDeleteMenuItem == null) {
      freeDatesTableDeleteMenuItem = new RMenuItem();
      freeDatesTableDeleteMenuItem.setName("freeDatesTableDeleteMenuItem");
      freeDatesTableDeleteMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/delete\")%>");
      freeDatesTableDeleteMenuItem.setText("delete");
    }
    return freeDatesTableDeleteMenuItem;
  }

  /**
   * This method initializes freeDatesTableNewMenuItem
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.menus.RMenuItem
   */
  private RMenuItem getFreeDatesTableNewMenuItem() {
    if (freeDatesTableNewMenuItem == null) {
      freeDatesTableNewMenuItem = new RMenuItem();
      freeDatesTableNewMenuItem.setName("freeDatesTableNewMenuItem");
      freeDatesTableNewMenuItem.setIconUri("<%=ivy.cms.cr(\"/images/klein/add\")%>");
      freeDatesTableNewMenuItem.setText("new");
    }
    return freeDatesTableNewMenuItem;
  }

  /**
   * This method initializes tablesScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getTablesScrollPane() {
    if (tablesScrollPane == null) {
      tablesScrollPane = new RScrollPane();
      tablesScrollPane.setName("tablesScrollPane");
      tablesScrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      tablesScrollPane.setViewPortView(getTablesPane());
    }
    return tablesScrollPane;
  }

  /**
   * This method initializes tablesPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTablesPane() {
    if (tablesPane == null) {
      tablesPane = new RGridBagLayoutPane();
      tablesPane.setName("tablesPane");
      tablesPane.add(getWorkingTimePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      tablesPane.add(getFreeDayOfWeekPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      tablesPane.add(getFreeDayOfYearPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      tablesPane.add(getFreeEasterRelativeDayPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      tablesPane.add(getFreeDatesPane(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return tablesPane;
  }
} // @jve:decl-index=0:visual-constraint="10,13"
