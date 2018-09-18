package ch.ivyteam.rd.common.NumberField;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

/**
 * RichDialog panel implementation for NumberFieldPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class NumberFieldPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextField numberTextField = null;

  /**
   * Create a new instance of NumberFieldPanel
   */
  // SONAR-OFF
  public NumberFieldPanel() {
    super();
    initialize();
  }

  // SONAR-ON

  /**
   * This method initializes NumberFieldPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getNumberTextField(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes numberTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNumberTextField() {
    if (numberTextField == null) {
      numberTextField = new RTextField();
      numberTextField.setText("");
      numberTextField.setValidation("NumberInt");
      numberTextField.setName("numberTextField");
    }
    return numberTextField;
  }
}
