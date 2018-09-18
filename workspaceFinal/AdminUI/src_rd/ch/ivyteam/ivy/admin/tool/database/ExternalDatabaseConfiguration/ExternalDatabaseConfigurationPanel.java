package ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration;

import ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for DatabaseConfigurationPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ExternalDatabaseConfigurationPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  @EmbeddedRichDialog(DatabaseConfigurationPanel.class)
  private ULCContainer configPane = null;
  private RGridLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of DatabaseConfigurationPanel
   */
  public ExternalDatabaseConfigurationPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DatabaseConfigurationPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(505, 575));
    this.add(getConfigPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes configPane
   * 
   * @return ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationPanel
   */
  private ULCContainer getConfigPane() {
    if (configPane == null) {
      configPane = RichDialogPanelFactory.create(DatabaseConfigurationPanel.class);
      configPane.setName("configPane");
    }
    return configPane;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RGridLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RGridLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane.setStyleProperties("{/anchor \"EAST\"}");
      buttonPane.setStyle("buttons");
      buttonPane.setHgap(5);
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("OK");
      okButton.setDefaultCapable(true);
      okButton.setName("okButton");
    }
    return okButton;
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
} // @jve:decl-index=0:visual-constraint="10,10"
