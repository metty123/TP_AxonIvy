package ch.ivyteam.rd.common.PasswordField;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField;

/**
 * <p>
 * PasswordFieldPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class PasswordFieldPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RPasswordField passwordField = null;

  // SONAR-OFF
  /**
   * Create a new instance of PasswordFieldPanel
   */
  public PasswordFieldPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes PasswordFieldPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getPasswordField(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes passwordField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField
   */
  private RPasswordField getPasswordField() {
    if (passwordField == null) {
      passwordField = new RPasswordField();
      passwordField.setText("");
      passwordField.setName("passwordField");
    }
    return passwordField;
  }
}
