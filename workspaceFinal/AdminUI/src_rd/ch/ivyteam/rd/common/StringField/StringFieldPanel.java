package ch.ivyteam.rd.common.StringField;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

/**
 * RichDialog panel implementation for StringFieldPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class StringFieldPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextField stringTextField = null;

  // SONAR-OFF
  /**
   * Create a new instance of StringFieldPanel
   */
  public StringFieldPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes StringFieldPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getStringTextField(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes stringTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getStringTextField() {
    if (stringTextField == null) {
      stringTextField = new RTextField();
      stringTextField.setText("RTextField");
      stringTextField.setName("stringTextField");
    }
    return stringTextField;
  }
}
