package ch.ivyteam.ivy.admin.tool.SystemProperties;

import ch.ivyteam.ivy.admin.tool.SystemPropertyList.SystemPropertyListPanel;
import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;

import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for SystemPropertiesPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class SystemPropertiesPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane titlePane = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer headerpane = null;
  private @EmbeddedRichDialog(SystemPropertyListPanel.class) ULCContainer systemPropertyListPanel = null;
  // SONAR-OFF
  /**
   * Create a new instance of SystemPropertiesPanel
   */
  public SystemPropertiesPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes SystemPropertiesPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(496, 353));
    this.add(getTitlePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSystemPropertyListPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

  /**
   * This method initializes titlePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTitlePane() {
    if (titlePane == null) {
      titlePane = new RGridBagLayoutPane();
      titlePane.setName("titlePane");
      titlePane.setStyleProperties("{/weightY \"0\"}");
      titlePane.add(getHeaderpane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return titlePane;
  }

  /**
   * This method initializes headerpane
   * 
   * @return ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel
   */
  private ULCContainer getHeaderpane() {
    if (headerpane == null) {
      headerpane = RichDialogPanelFactory.create(TabHeaderBarPanel.class);
      headerpane.setName("headerpane");
    }
    return headerpane;
  }

  /**
   * This method initializes systemPropertyListPanel, an embedded RichDialog.
   * The created object might have a different type than the declared
   * class due to overriding.
   * @returns com.ulcjava.base.application.ULCContainer 
   */
  private ULCContainer getSystemPropertyListPanel() {
    if (systemPropertyListPanel == null) {
      systemPropertyListPanel = RichDialogPanelFactory.create(SystemPropertyListPanel.class);
      systemPropertyListPanel.setName("systemPropertyListPanel");
    }
    return systemPropertyListPanel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
