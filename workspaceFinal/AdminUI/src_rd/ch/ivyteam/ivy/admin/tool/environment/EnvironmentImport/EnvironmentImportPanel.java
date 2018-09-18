package ch.ivyteam.ivy.admin.tool.environment.EnvironmentImport;

import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserPanel;

import com.ulcjava.base.application.ULCContainer;

/**
 * <p>
 * EnvironmentImportPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class EnvironmentImportPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;

  private RButton okButton = null;
  private RGridLayoutPane okCancelGridLayoutPane = null;
  private RButton cancelButton = null;
  private @EmbeddedRichDialog(ClientServerFileChooserPanel.class)
  ULCContainer importClientServerFileChooser = null;
  private @EmbeddedRichDialog(ClientServerFileChooserPanel.class)
  ULCContainer reportClientServerFileChooser = null;

  // SONAR-OFF
  /**
   * Create a new instance of EnvironmentImportPanel
   */
  public EnvironmentImportPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes LocalRemoteFilePanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler = new RFiller();
    Filler.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(457, 168));
    this.add(getOkCancelGridLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getImportClientServerFileChooser(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getReportClientServerFileChooser(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("Import");
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes okCancelGridLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getOkCancelGridLayoutPane() {
    if (okCancelGridLayoutPane == null) {
      okCancelGridLayoutPane = new RGridLayoutPane();
      okCancelGridLayoutPane.setName("okCancelGridLayoutPane");
      okCancelGridLayoutPane
          .setStyleProperties("{/anchor \"EAST\"/insetsBottom \"10\"/insetsTop \"10\"/hgap \"5\"/insetsRight \"10\"}");
      okCancelGridLayoutPane.add(getOkButton());
      okCancelGridLayoutPane.add(getCancelButton());
    }
    return okCancelGridLayoutPane;
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
   * This method initializes importClientServerFileChooser, an embedded RichDialog. The created object might have a
   * different type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getImportClientServerFileChooser() {
    if (importClientServerFileChooser == null) {
      importClientServerFileChooser = RichDialogPanelFactory.create(ClientServerFileChooserPanel.class);
      importClientServerFileChooser.setName("importClientServerFileChooser");
      importClientServerFileChooser
          .setStyleProperties("{/anchor \"NORTH\"/insetsTop \"10\"/insetsBottom \"10\"/insetsRight \"10\"/fill \"HORIZONTAL\"/insetsLeft \"10\"/weightY \"0\"/weightX \"1\"}");
    }
    return importClientServerFileChooser;
  }

  /**
   * This method initializes reportClientServerFileChooser, an embedded RichDialog. The created object might have a
   * different type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getReportClientServerFileChooser() {
    if (reportClientServerFileChooser == null) {
      reportClientServerFileChooser = RichDialogPanelFactory.create(ClientServerFileChooserPanel.class);
      reportClientServerFileChooser.setName("reportClientServerFileChooser");
      reportClientServerFileChooser
          .setStyleProperties("{/anchor \"NORTH\"/fill \"HORIZONTAL\"/insetsRight \"10\"/insetsLeft \"10\"/weightY \"0\"/weightX \"1\"}");
    }
    return reportClientServerFileChooser;
  }
} // @jve:decl-index=0:visual-constraint="9,8"
