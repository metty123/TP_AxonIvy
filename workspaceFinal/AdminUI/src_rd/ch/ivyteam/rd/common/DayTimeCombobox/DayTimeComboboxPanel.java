package ch.ivyteam.rd.common.DayTimeCombobox;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

/**
 * <p>
 * DayTimeComboboxPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class DayTimeComboboxPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RComboBox hourComboBox = null;
  private RLabel separatorLabel = null;
  private RComboBox minComboBox = null;

  /**
   * Create a new instance of DayTimeComboboxPanel
   */
  public DayTimeComboboxPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes DayTimeComboboxPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler = new RFiller();
    Filler.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
    this.add(getHourComboBox(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSeparatorLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMinComboBox(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(3, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes hourComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getHourComboBox() {
    if (hourComboBox == null) {
      hourComboBox = new RComboBox();
      hourComboBox.setName("hourComboBox");
      hourComboBox.setModelConfiguration("{/result \"result=entry as Number\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
      hourComboBox.setMaximumRowCount(4);
      hourComboBox.setPreferredSize(new com.ulcjava.base.application.util.Dimension(50, 23));
      hourComboBox.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/synchHour\")%>");
      hourComboBox.setEditable(true);
      hourComboBox.setStyleProperties("{/insetsBottom \"0\"/fill \"NONE\"/insetsRight \"0\"/weightX \"0\"}");
    }
    return hourComboBox;
  }

  /**
   * This method initializes separatorLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getSeparatorLabel() {
    if (separatorLabel == null) {
      separatorLabel = new RLabel();
      separatorLabel.setText(":");
      separatorLabel.setName("separatorLabel");
    }
    return separatorLabel;
  }

  /**
   * This method initializes minComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getMinComboBox() {
    if (minComboBox == null) {
      minComboBox = new RComboBox();
      minComboBox.setName("minComboBox");
      minComboBox.setMaximumRowCount(4);
      minComboBox.setModelConfiguration("{/result \"result=entry as Number\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
      minComboBox.setPreferredSize(new com.ulcjava.base.application.util.Dimension(50, 23));
      minComboBox.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/NewJNDI/tooltip/synchMin\")%>");
      minComboBox.setEditable(true);
      minComboBox.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"/weightX \"0\"}");
    }
    return minComboBox;
  }
}
