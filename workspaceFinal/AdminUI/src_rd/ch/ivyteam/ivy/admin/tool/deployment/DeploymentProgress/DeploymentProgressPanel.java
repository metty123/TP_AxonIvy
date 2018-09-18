package ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar;

import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;

/**
 * RichDialog panel implementation for DeploymentProgressPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DeploymentProgressPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel progressMessageLabel = null;
  private RProgressBar progressBar = null;
  private RLabel infoLabel = null;
  private ULCPollingTimer timer; // @jve:decl-index=0:
  private RButton showErrorButton = null;
  private RFiller filler = null;

  private boolean running = false;
  private IActionListener timerListener;

  // SONAR-OFF
  /**
   * Create a new instance of DeploymentProgressPanel
   */
  public DeploymentProgressPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DeploymentProgressPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getProgressMessageLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getProgressBar(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getInfoLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getShowErrorButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getFiller(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    createUlcPollingTimer();
  }

  /**
   * Creates a ulc polling timer
   */
  private void createUlcPollingTimer() {
    timer = new ULCPollingTimer(500, null);
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
   * This method initializes progressMessageLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getProgressMessageLabel() {
    if (progressMessageLabel == null) {
      progressMessageLabel = new RLabel();
      progressMessageLabel.setText("progressMessageLabel");
      progressMessageLabel.setName("progressMessageLabel");
    }
    return progressMessageLabel;
  }

  /**
   * This method initializes progressBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar
   */
  private RProgressBar getProgressBar() {
    if (progressBar == null) {
      progressBar = new RProgressBar();
      progressBar.setName("progressBar");
      progressBar.setStyleProperties("{/fill \"HORIZONTAL\"}");
    }
    return progressBar;
  }

  /**
   * This method initializes infoLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getInfoLabel() {
    if (infoLabel == null) {
      infoLabel = new RLabel();
      infoLabel.setText("Deploying Project ...");
      infoLabel.setStyle("title");
      infoLabel.setName("infoLabel");
    }
    return infoLabel;
  }

  /**
   * This method initializes showErrorButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getShowErrorButton() {
    if (showErrorButton == null) {
      showErrorButton = new RButton();
      showErrorButton.setText("Error Details ...");
      showErrorButton.setName("showErrorButton");
      showErrorButton.setEnabled(false);
    }
    return showErrorButton;
  }

  /**
   * This method initializes filler
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RFiller
   */
  private RFiller getFiller() {
    if (filler == null) {
      filler = new RFiller();
      filler.setStyle("horizontalGlue");
    }
    return filler;
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
    timer.addActionListener(timerListener);
    timer.start();
  }

}
