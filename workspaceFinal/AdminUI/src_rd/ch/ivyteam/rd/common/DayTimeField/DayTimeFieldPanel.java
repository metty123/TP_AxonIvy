package ch.ivyteam.rd.common.DayTimeField;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

/**
 * RichDialog panel implementation for DayTimeFieldPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DayTimeFieldPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextField hourTextField = null;
  private RLabel separatorLabel = null;
  private RTextField minuteTextField = null;

  /**
   * Create a new instance of DayTimeFieldPanel
   */
  // SONAR-OFF
  public DayTimeFieldPanel() {
    super();
    initialize();
  }

  // SONAR-ON

  /**
   * This method initializes DayTimeFieldPanel
   * 
   * @return void
   */
  public void initialize() {
    RFiller aFiller = new RFiller();
    aFiller.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
    this.add(getHourTextField(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSeparatorLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getMinuteTextField(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(aFiller, new com.ulcjava.base.application.GridBagConstraints(3, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes hourTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getHourTextField() {
    if (hourTextField == null) {
      hourTextField = new RTextField();
      hourTextField.setText("RTextField");
      hourTextField.setStyleProperties("{/insetsBottom \"0\"/fill \"NONE\"/insetsRight \"0\"/weightX \"0\"}");
      hourTextField.setValidation("NumberInt");
      hourTextField.setMandatory(true);
      hourTextField.setColumns(3);
      hourTextField.setName("hourTextField");
    }
    return hourTextField;
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
      separatorLabel.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"/insetsLeft \"0\"}");
      separatorLabel.setName("separatorLabel");
    }
    return separatorLabel;
  }

  /**
   * This method initializes minuteTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getMinuteTextField() {
    if (minuteTextField == null) {
      minuteTextField = new RTextField();
      minuteTextField.setText("RTextField");
      minuteTextField.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"/weightX \"0\"}");
      minuteTextField.setValidation("NumberInt");
      minuteTextField.setMandatory(true);
      minuteTextField.setColumns(3);
      minuteTextField.setName("minuteTextField");
    }
    return minuteTextField;
  }
}
