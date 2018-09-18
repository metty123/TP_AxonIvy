package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Deploy;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * <p>
 * DeployPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class DeployPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblDeployProject = null;
  private RProgressBar progressBarDeploy = null;
  private RScrollPane scrollPane = null;
  private RTextArea textAreaDeployLog = null;
  private ULCPollingTimer timer;
  private IActionListener timerListener;
  private boolean running = false;
  private RLabel lblDeployStatus = null;
  private RButton hidden_btnShowWarning = null; // @jve:decl-index=0:visual-constraint="3,295"
  private RLabel lblWarning = null;

  // SONAR-OFF
  /**
   * Create a new instance of DeployPanel
   */
  public DeployPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DeployPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler11 = new RFiller();
    Filler11.setPreferredSize(new com.ulcjava.base.application.util.Dimension(5, 25));
    Filler11
        .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"5\"/preferredSizeHeight \"35\"}");
    RFiller Filler1 = new RFiller();
    Filler1.setPreferredSize(new com.ulcjava.base.application.util.Dimension(5, 20));
    Filler1
        .setStyleProperties("{/anchor \"CENTER\"/preferredSizeHeight \"20\"/fill \"NONE\"/preferredSizeWidth \"5\"/usePreferredSizeAsExactSize \"true\"}");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(455, 261));
    this.add(getLblDeployProject(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1.0D, 0.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getProgressBarDeploy(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 7, 1, 2, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler1, new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblDeployStatus(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler11, new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblWarning(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 5),
        0, 0));
  }

  /**
   * This method initializes lblDeployProject
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblDeployProject() {
    if (lblDeployProject == null) {
      lblDeployProject = new RLabel();
      lblDeployProject.setName("lblDeployProject");
      lblDeployProject.setFont(new Font("Segoe UI", 1, 18));
      lblDeployProject
          .setStyleProperties("{/anchor \"CENTER\"/alignmentY \"0\"/alignmentX \"0\"/fill \"NONE\"/weightY \"0\"/weightX \"0\"}");
      lblDeployProject
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/deployingProject\")%>");
    }
    return lblDeployProject;
  }

  /**
   * This method initializes progressBarDeploy
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar
   */
  private RProgressBar getProgressBarDeploy() {
    if (progressBarDeploy == null) {
      progressBarDeploy = new RProgressBar();
      progressBarDeploy.setName("progressBarDeploy");
      progressBarDeploy
          .setStyleProperties("{/anchor \"CENTER\"/fill \"HORIZONTAL\"/insetsRight \"50\"/insetsLeft \"50\"}");
    }
    return progressBarDeploy;
  }

  /**
   * This method initializes scrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane() {
    if (scrollPane == null) {
      scrollPane = new RScrollPane();
      scrollPane.setName("scrollPane");
      scrollPane
          .setStyleProperties("{/anchor \"CENTER\"/alignmentY \"5\"/alignmentX \"0\"/fill \"BOTH\"/weightY \"2\"/weightX \"1\"}");
      scrollPane.setViewPortView(getTextAreaDeployLog());
    }
    return scrollPane;
  }

  /**
   * This method initializes textAreaDeployLog
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getTextAreaDeployLog() {
    if (textAreaDeployLog == null) {
      textAreaDeployLog = new RTextArea();
      textAreaDeployLog.setText("");
      textAreaDeployLog.setName("textAreaDeployLog");
      textAreaDeployLog.setEditable(false);
    }
    return textAreaDeployLog;
  }

  /**
   * Creates a ulc polling timer
   */
  private void createUlcPollingTimer() {
    timer = new ULCPollingTimer(1000, null);
    timer.setRepeats(false);
    timerListener = new IActionListener() {

      /**
		 * 
		 */
      private static final long serialVersionUID = -4370382652507823364L;

      public void actionPerformed(ActionEvent event) {
        try {
          if (running) {
            getPanelAPI().callMethod("timer", new Object[0]);
          }
        } catch (Exception ex) {
          Ivy.log().error("Could not call timer method", ex);
        }
      }
    };
  }

  /**
   * Stops the polling timer
   */
  public void stopPollingTimer() {
    running = false;
    timer.stop();
    timer.removeActionListener(timerListener);
  }

  /**
   * Restarts the polling timer
   */
  public void restartPollingTimer() {
    timer.restart();
  }

  /**
   * Starts the polling timer
   */
  public void startPollingTimer() {
    running = true;
    createUlcPollingTimer();
    timer.addActionListener(timerListener);
    timer.start();
  }

  /**
   * This method initializes lblDeployStatus
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblDeployStatus() {
    if (lblDeployStatus == null) {
      lblDeployStatus = new RLabel();
      lblDeployStatus.setText("");
      lblDeployStatus.setStyleProperties("{/anchor \"CENTER\"/insetsBottom \"0\"/insetsTop \"0\"/fill \"NONE\"}");
      lblDeployStatus.setName("lblDeployStatus");
    }
    return lblDeployStatus;
  }

  /**
   * This method initializes hidden_btnShowWarning
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getHidden_btnShowWarning() {
    if (hidden_btnShowWarning == null) {
      hidden_btnShowWarning = new RButton();
      hidden_btnShowWarning.setText("hidden_btnShowWarning");
      hidden_btnShowWarning.setVisible(false);
      hidden_btnShowWarning.setName("hidden_btnShowWarning");
    }
    return hidden_btnShowWarning;
  }

  /**
   * This method initializes lblWarning
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblWarning() {
    if (lblWarning == null) {
      lblWarning = new RLabel();
      lblWarning.setName("lblWarning");
      lblWarning.setForeground(Color.red);
    }
    return lblWarning;
  }

} // @jve:decl-index=0:visual-constraint="10,10"
