package ch.ivyteam.ivy.admin.tool.security.SelectRole;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreePanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import com.ulcjava.base.application.ULCContainer;
import ch.ivyteam.ivy.richdialog.widgets.components.RBrowser;
import ch.ivyteam.ivy.richdialog.widgets.components.RDatePicker;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBorderLayoutPane;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.ComponentOrientation;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

/**
 * <p>SelectRolePanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class SelectRolePanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private @EmbeddedRichDialog(RoleTreePanel.class) ULCContainer roleTreePanel = null;
  private RButton okButton = null;
  private RButton cancelButton = null;
  private RGridLayoutPane buttomPanel = null;
  /**
   * Create a new instance of SelectRolePanel
   */
  public SelectRolePanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes SelectRolePanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(417,313));
        this.setComponentOrientation(ComponentOrientation.UNKNOWN);
        this.setBackground(new Color(244, 247, 255));
        this.add(getRoleTreePanel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getButtomPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.SOUTHEAST, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5,5,5,5), 0, 0));
  }

  /**
   * This method initializes roleTreePanel, an embedded RichDialog.
   * The created object might have a different type than the declared
   * class due to overriding.
   * @returns com.ulcjava.base.application.ULCContainer 
   */
  private ULCContainer getRoleTreePanel() {
    if (roleTreePanel == null) {
      roleTreePanel = RichDialogPanelFactory.create(RoleTreePanel.class);
      roleTreePanel.setName("roleTreePanel");
    }
    return roleTreePanel;
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

  /**
   * This method initializes buttomPanel	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane	
   */
  private RGridLayoutPane getButtomPanel() {
    if (buttomPanel == null) {
      buttomPanel = new RGridLayoutPane();
      buttomPanel.setName("buttomPanel");
      buttomPanel.setHgap(5);
      buttomPanel.setVgap(0);
      buttomPanel.setName("buttomPanel");
      buttomPanel.add(getOkButton());
      buttomPanel.add(getCancelButton());
    }
    return buttomPanel;
  }
}  //  @jve:decl-index=0:visual-constraint="10,10"