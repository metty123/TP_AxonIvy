package ch.ivyteam.ivy.admin.tool.environment.EnvironmentExport;

import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserPanel;

import com.ulcjava.base.application.ULCContainer;

/**
 * <p>
 * LocalRemoteFilePanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class EnvironmentExportPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RButton okButton = null;
  private RGridLayoutPane okCancelGridLayoutPane = null;
  private RButton cancelButton = null;
  private @EmbeddedRichDialog(ClientServerFileChooserPanel.class)
  ULCContainer exportClientServerFileChooser = null;
  private @EmbeddedRichDialog(ClientServerFileChooserPanel.class)
  ULCContainer reportClientServerFileChooser = null;
  private RCheckBox ckbInclude = null;

  /**
   * Create a new instance of LocalRemoteFilePanel
   */
  public EnvironmentExportPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes LocalRemoteFilePanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler = new RFiller();
    Filler.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(452, 196));
    this.add(getCkbInclude(), new com.ulcjava.base.application.GridBagConstraints(3, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getExportClientServerFileChooser(), new com.ulcjava.base.application.GridBagConstraints(3, 0, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getReportClientServerFileChooser(), new com.ulcjava.base.application.GridBagConstraints(3, 1, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getOkCancelGridLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(3, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(3, 3, 1, 1, -1, -1,
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
      okButton.setText("Export");
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
      okCancelGridLayoutPane.setName("okCancelGridLayoutPane");
      okCancelGridLayoutPane.setName("okCancelGridLayoutPane");
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
   * This method initializes exportClientServerFileChooser, an embedded RichDialog. The created object might have a
   * different type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getExportClientServerFileChooser() {
    if (exportClientServerFileChooser == null) {
      exportClientServerFileChooser = RichDialogPanelFactory.create(ClientServerFileChooserPanel.class);
      exportClientServerFileChooser.setName("exportClientServerFileChooser");
      exportClientServerFileChooser.setName("exportClientServerFileChooser");
      exportClientServerFileChooser.setToolTipText("Test123");
      exportClientServerFileChooser
          .setStyleProperties("{/anchor \"CENTER\"/insetsBottom \"10\"/insetsTop \"10\"/fill \"HORIZONTAL\"/insetsRight \"10\"/insetsLeft \"10\"/weightY \"0\"/weightX \"1\"}");
      exportClientServerFileChooser.setName("exportClientServerFileChooser");
    }
    return exportClientServerFileChooser;
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
      reportClientServerFileChooser.setName("reportClientServerFileChooser");
      reportClientServerFileChooser
          .setStyleProperties("{/anchor \"CENTER\"/insetsBottom \"10\"/fill \"HORIZONTAL\"/insetsRight \"10\"/insetsLeft \"10\"/weightX \"1\"}");
      reportClientServerFileChooser.setName("reportClientServerFileChooser");
    }
    return reportClientServerFileChooser;
  }

  /**
   * This method initializes ckbInclude
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox
   */
  private RCheckBox getCkbInclude() {
    if (ckbInclude == null) {
      ckbInclude = new RCheckBox();
      ckbInclude.setText("Include Username and Password");
      ckbInclude.setStyleProperties("{/insetsLeft \"4\"}");
      ckbInclude.setName("ckbInclude");
    }
    return ckbInclude;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
