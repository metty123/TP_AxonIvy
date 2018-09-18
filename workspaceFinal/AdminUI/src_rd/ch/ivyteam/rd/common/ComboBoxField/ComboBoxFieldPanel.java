package ch.ivyteam.rd.common.ComboBoxField;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;

/**
 * RichDialog panel implementation for StringFieldPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ComboBoxFieldPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RComboBox comboBoxField = null;

  // SONAR-OFF
  /**
   * Create a new instance of StringFieldPanel
   */
  public ComboBoxFieldPanel() {
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
    this.add(getComboBoxField(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes comboBoxField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getComboBoxField() {
    if (comboBoxField == null) {
      comboBoxField = new RComboBox();
      comboBoxField.setName("comboBoxField");
      comboBoxField.setModelConfiguration("{/result \"result=entry\"/version \"2.0\"/icon \"\"/tooltip \"\"}");
    }
    return comboBoxField;
  }
}
