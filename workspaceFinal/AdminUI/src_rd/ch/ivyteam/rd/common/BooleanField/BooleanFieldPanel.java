package ch.ivyteam.rd.common.BooleanField;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;

/**
 * RichDialog panel implementation for BooleanFieldPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class BooleanFieldPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RComboBox booleanComboBox = null;

  // SONAR-OFF
  /**
   * Create a new instance of BooleanFieldPanel
   */
  public BooleanFieldPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes BooleanFieldPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getBooleanComboBox(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1, 0,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
  }

  /**
   * This method initializes booleanComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getBooleanComboBox() {
    if (booleanComboBox == null) {
      booleanComboBox = new RComboBox();
      booleanComboBox.setName("booleanComboBox");
      booleanComboBox
          .setModelConfiguration("{/result \"result=entry.toString()\"/version \"2.0\"/icon \"\"/tooltip \"\"/emptyTableText \"\"}");
    }
    return booleanComboBox;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
