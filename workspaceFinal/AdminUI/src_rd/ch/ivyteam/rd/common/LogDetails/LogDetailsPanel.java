package ch.ivyteam.rd.common.LogDetails;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.util.Dimension;

/**
 * <p>
 * LogDetailsPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class LogDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane detailScrollPane = null;
  private RTextArea detailTextArea = null;
  private RButton closeButton = null;
  private RProgressBar progressLog = null;

  /**
   * Create a new instance of LogDetailsPanel
   */
  public LogDetailsPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes LogDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(468, 350));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(550, 330));
    this.add(getDetailScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCloseButton(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getProgressLog(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(10, 10, 0, 0), 0, 0));
  }

  /**
   * This method initializes detailScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDetailScrollPane() {
    if (detailScrollPane == null) {
      detailScrollPane = new RScrollPane();
      detailScrollPane.setName("detailScrollPane");
      detailScrollPane.setStyle("fill-both-border");
      detailScrollPane.setViewPortView(getDetailTextArea());
    }
    return detailScrollPane;
  }

  /**
   * This method initializes detailTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDetailTextArea() {
    if (detailTextArea == null) {
      detailTextArea = new RTextArea();
      detailTextArea.setName("detailTextArea");
      detailTextArea.setText("Log details");
      detailTextArea.setColumns(40);
      detailTextArea.setRows(20);
      detailTextArea.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      detailTextArea.setEditable(false);
    }
    return detailTextArea;
  }

  /**
   * This method initializes closeButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCloseButton() {
    if (closeButton == null) {
      closeButton = new RButton();
      closeButton.setName("closeButton");
      closeButton.setText("<%= ivy.cms.co(\"/Dialogs/general/close\") %>");
      closeButton.setStyle("border-left-bottom-right");
      closeButton.setStyleProperties("{/anchor \"CENTER\"/insetsTop \"5\"}");
      closeButton.setIconUri("<%= ivy.cms.cr(\"/Icons/Close/16\") %>");
      closeButton.setPreferredSize(new Dimension(75, 25));
    }
    return closeButton;
  }

  /**
   * This method initializes progressLog
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar
   */
  private RProgressBar getProgressLog() {
    if (progressLog == null) {
      progressLog = new RProgressBar();
      progressLog.setName("progressLog");
      progressLog.setStringPainted(true);
      progressLog.setString("<%=ivy.cms.co(\"/Dialogs/security/synchIsRunning\")%>");
      progressLog.setIndeterminate(true);
    }
    return progressLog;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
