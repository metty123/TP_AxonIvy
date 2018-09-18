package ch.ivyteam.rd.common.ClientServerFileChooser;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCScrollPane;

/**
 * <p>
 * LocalRemoteFilePanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class ClientServerFileChooserPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextField txtFile = null;
  private RButton btnLocal = null;
  private RButton btnRemote = null;
  private RLabel Label = null;
  private RScrollPane ScrollPane = null;
  private RGridBagLayoutPane GridBagLayoutPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of LocalRemoteFilePanel
   */
  public ClientServerFileChooserPanel() {
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
    // this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(496,43));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 0.3, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, 0.6, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(5, 5, 5, 0), 0, 0));
    this.add(getBtnLocal(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, 0.0, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 5, 5, 0), 0, 0));
    this.add(getBtnRemote(), new com.ulcjava.base.application.GridBagConstraints(3, 0, 1, 1, 0.0, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 5, 5, 0), 0, 0));
  }

  /**
   * This method initializes txtFile
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxtFile() {
    if (txtFile == null) {
      txtFile = new RTextField();
      txtFile.setText("");
      txtFile.setStyleProperties("{/anchor \"CENTER\"}");
      txtFile.setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/environment/inputTooltip\")%>");
      txtFile.setName("txtFile");
    }
    return txtFile;
  }

  /**
   * This method initializes btnLocal
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RToggleButton
   */
  private RButton getBtnLocal() {
    if (btnLocal == null) {
      btnLocal = new RButton();
      btnLocal.setText("Local...");
      btnLocal.setName("btnLocal");
    }
    return btnLocal;
  }

  /**
   * This method initializes btnRemote
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RToggleButton
   */
  private RButton getBtnRemote() {
    if (btnRemote == null) {
      btnRemote = new RButton();
      btnRemote.setText("Server...");
      btnRemote.setName("btnRemote");
    }
    return btnRemote;
  }

  /**
   * This method initializes Label
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLabel() {
    if (Label == null) {
      Label = new RLabel();
      Label.setText("Label");
      Label.setToolTipText("");
      Label.setName("Label");
    }
    return Label;
  }

  /**
   * This method initializes ScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane() {
    if (ScrollPane == null) {
      ScrollPane = new RScrollPane();
      ScrollPane.setName("ScrollPane");
      ScrollPane.setHorizontalScrollBarPolicy(ULCScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      ScrollPane.setVerticalScrollBarPolicy(ULCScrollPane.VERTICAL_SCROLLBAR_NEVER);
      ScrollPane.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 30));
      ScrollPane.setViewPortView(getLabel());
      ScrollPane.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }
    return ScrollPane;
  }

  /**
   * This method initializes GridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getGridBagLayoutPane() {
    if (GridBagLayoutPane == null) {
      GridBagLayoutPane = new RGridBagLayoutPane();
      GridBagLayoutPane.setName("GridBagLayoutPane");
      GridBagLayoutPane.setPreferredSize(new com.ulcjava.base.application.util.Dimension(250, 30));
      GridBagLayoutPane.add(getTxtFile(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1.0, 1.0,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return GridBagLayoutPane;
  }
} // @jve:decl-index=0:visual-constraint="10,16"
