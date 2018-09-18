package ch.ivyteam.ivy.admin.tool.ReleaseState;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RHtmlPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for ReleaseStatePanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ReleaseStatePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel releaseStateLabel = null;
  private RBoxPane buttonBoxPane = null;
  private RButton releaseButton = null;
  private RButton deleteButton = null;
  private RHtmlPane notDeletableReasonHtmlPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of ReleaseStatePanel
   */
  public ReleaseStatePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ReleaseStatePanel
   * 
   * @return void
   */
  public void initialize() {
    this.setBorder(BorderFactory.createTitledBorder("Release State"));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(300, 130));
    this.add(getReleaseStateLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 2, 1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getButtonBoxPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getNotDeletableReasonHtmlPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes releaseStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getReleaseStateLabel() {
    if (releaseStateLabel == null) {
      releaseStateLabel = new RLabel();
      releaseStateLabel.setName("releaseStateLabel");
      releaseStateLabel.setStyleProperties("{/fill \"NONE\"/weightX \"0\"}");
      releaseStateLabel.setText("<release state icon here>");
    }
    return releaseStateLabel;
  }

  /**
   * This method initializes buttonBoxPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane
   */
  private RBoxPane getButtonBoxPane() {
    if (buttonBoxPane == null) {
      buttonBoxPane = new RBoxPane();
      buttonBoxPane.setName("buttonBoxPane");
      buttonBoxPane
          .setStyleProperties("{/anchor \"EAST\"/insetsTop \"5\"/insetsBottom \"5\"/insetsRight \"5\"/weightX \"1\"}");
      buttonBoxPane
          .setStyleProperties("{/anchor \"NORTHEAST\"/insetsBottom \"5\"/insetsTop \"5\"/insetsRight \"5\"/weightY \"1\"/weightX \"1\"}");
      buttonBoxPane.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getReleaseButton());
      buttonBoxPane.set(1, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getDeleteButton());
    }
    return buttonBoxPane;
  }

  /**
   * This method initializes releaseButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getReleaseButton() {
    if (releaseButton == null) {
      releaseButton = new RButton();
      releaseButton.setText("Release");
      releaseButton.setName("releaseButton");
    }
    return releaseButton;
  }

  /**
   * This method initializes deleteButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteButton() {
    if (deleteButton == null) {
      deleteButton = new RButton();
      deleteButton.setText("Delete");
      deleteButton.setName("deleteButton");
    }
    return deleteButton;
  }

  /**
   * This method initializes notDeletableReasonHtmlPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RHtmlPane
   */
  private RHtmlPane getNotDeletableReasonHtmlPane() {
    if (notDeletableReasonHtmlPane == null) {
      notDeletableReasonHtmlPane = new RHtmlPane();
      notDeletableReasonHtmlPane.setFocusable(false);
      notDeletableReasonHtmlPane.setName("notDeletableReasonHtmlPane");
      notDeletableReasonHtmlPane.setBackground(new Color(244, 247, 255));
      notDeletableReasonHtmlPane.setText("reason for not being able to delete PMV");
      notDeletableReasonHtmlPane
          .setStyleProperties("{/anchor \"NORTHEAST\"/insetsTop \"0\"/insetsBottom \"5\"/weightY \"1\"}");
    }
    return notDeletableReasonHtmlPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
