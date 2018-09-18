package ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

/**
 * <p>
 * EnvironmentCalendarPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class EnvironmentCalendarPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RComboBox calendarComboBox = null;
  private RButton saveButton = null;
  private RButton cancelButton = null;
  private RLabel calendarLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of EnvironmentCalendarPanel
   */
  public EnvironmentCalendarPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes EnvironmentCalendarPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler = new RFiller();
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(482, 355));
    this.setStyleProperties("{/insetsTop \"20\"}");
    this.add(getCalendarComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getSaveButton(), new com.ulcjava.base.application.GridBagConstraints(3, 2, 1, 1, 1.0, 0.0,
        com.ulcjava.base.application.GridBagConstraints.SOUTHEAST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getCancelButton(), new com.ulcjava.base.application.GridBagConstraints(4, 2, 1, 1, 0.0, 1.0,
        com.ulcjava.base.application.GridBagConstraints.SOUTHEAST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getCalendarLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes calendarComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getCalendarComboBox() {
    if (calendarComboBox == null) {
      calendarComboBox = new RComboBox();
      calendarComboBox.setName("calendarComboBox");
      calendarComboBox
          .setModelConfiguration("{/result \"result=entry.getName()\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
    }
    return calendarComboBox;
  }

  /**
   * This method initializes saveButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSaveButton() {
    if (saveButton == null) {
      saveButton = new RButton();
      saveButton.setText("Save");
      saveButton.setName("saveButton");
    }
    return saveButton;
  }

  /**
   * This method initializes cancelButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new RButton();
      cancelButton.setText("Cancel");
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes calendarLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getCalendarLabel() {
    if (calendarLabel == null) {
      calendarLabel = new RLabel();
      calendarLabel.setText("Default Business Calendar");
      calendarLabel.setName("calendarLabel");
    }
    return calendarLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
