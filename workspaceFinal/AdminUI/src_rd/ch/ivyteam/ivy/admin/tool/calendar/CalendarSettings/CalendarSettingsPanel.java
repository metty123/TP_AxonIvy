package ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings;

import ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailPanel;
import ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreePanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane;

import com.ulcjava.base.application.ULCContainer;

/**
 * <p>
 * CalendarSettingsPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class CalendarSettingsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private @EmbeddedRichDialog(CalendarTreePanel.class)
  ULCContainer calendarTreePanel = null;
  private @EmbeddedRichDialog(CalendarDetailPanel.class)
  ULCContainer calendarDetailPanel = null;
  private RSplitPane SplitPane = null;
  private RButton okButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of CalendarSettingsPanel
   */
  public CalendarSettingsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes CalendarSettingsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getSplitPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, 1.0, 1.0,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes calendarTreePanel, an embedded RichDialog. The created object might have a different type
   * than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getCalendarTreePanel() {
    if (calendarTreePanel == null) {
      calendarTreePanel = RichDialogPanelFactory.create(CalendarTreePanel.class);
      calendarTreePanel.setName("calendarTreePanel");
    }
    return calendarTreePanel;
  }

  /**
   * This method initializes calendarDetailPanel, an embedded RichDialog. The created object might have a different type
   * than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getCalendarDetailPanel() {
    if (calendarDetailPanel == null) {
      calendarDetailPanel = RichDialogPanelFactory.create(CalendarDetailPanel.class);
      calendarDetailPanel.setName("calendarDetailPanel");
    }
    return calendarDetailPanel;
  }

  /**
   * This method initializes SplitPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane
   */
  private RSplitPane getSplitPane() {
    if (SplitPane == null) {
      SplitPane = new RSplitPane();
      SplitPane.setName("SplitPane");
      SplitPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      SplitPane.setRightComponent(getCalendarDetailPanel());
      SplitPane.setLeftComponent(getCalendarTreePanel());
    }
    return SplitPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("<%= ivy.cms.co(\"/Dialogs/general/ok\") %>");
      okButton.setStyle("nice_button");
      okButton.setName("okButton");
    }
    return okButton;
  }
}
