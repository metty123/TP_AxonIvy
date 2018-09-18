package ch.ivyteam.ivy.rd.common.TabHeaderBar;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

/**
 * RichDialog panel implementation for TabHeaderBarPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class TabHeaderBarPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RButton refreshButton = null;
  private RLabel titleLabel = null;

  /**
   * Create a new instance of TabHeaderBarPanel
   */
  public TabHeaderBarPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes TabHeaderBarPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getTitleLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getRefreshButton(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes refreshButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getRefreshButton() {
    if (refreshButton == null) {
      refreshButton = new RButton();
      refreshButton.setStyleProperties("{/anchor \"NORTH\"}");
      refreshButton.setIconUri("<%=ivy.cms.cr(\"/Icons/Refresh/16\")%>");
      refreshButton.setText("Refresh");
      refreshButton.setName("refreshButton");
    }
    return refreshButton;
  }

  /**
   * This method initializes titleLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new RLabel();
      titleLabel.setText("[Title]");
      titleLabel.setStyle("title");
      titleLabel.setStyleProperties("{/weightX \"1\"}");
      titleLabel.setOpaque(false);
      titleLabel.setName("titleLabel");
    }
    return titleLabel;
  }
}
