package ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.util.RichDialogUtil;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.border.ULCEtchedBorder;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for DeploymentReleaseAndActivatePanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
@SuppressWarnings("restriction")
public class DeploymentReleaseAndActivatePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  private static final String NORMAL_RIGHT = "normalRight";
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel titleLabel = null;
  private RLabel releaseStateLabel = null;
  private RButton releaseButton = null;
  private RLabel activateLabel = null;
  private RLabel applicationLabel = null;
  private RLabel processModelLabel = null;
  private RLabel pmvLabel = null;
  private RLabel applicationStateLabel = null;
  private RLabel pmStateLabel = null;
  private RLabel pmvStateLabel = null;
  private RButton applicationActivateButton = null;
  private RButton pmActivateButton = null;
  private RButton pmvActivateButton = null;
  private RLabel pmvOperationStateLabel = null;
  private RGridBagLayoutPane activityConfigurationGridBagLayoutPane = null;
  private ULCPollingTimer timer = null;
  private boolean running;
  private IActionListener timerListener;

  // SONAR-OFF
  /**
   * Create a new instance of DeploymentReleaseAndActivatePanel
   */
  public DeploymentReleaseAndActivatePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DeploymentReleaseAndActivatePanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller buttomFiller = new RFiller();
    buttomFiller.setStyle("verticalGlue");

    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(412, 317));
    this.add(getTitleLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getReleaseStateLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getReleaseButton(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getActivateLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPmvOperationStateLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getActivityConfigurationGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 3,
        1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(buttomFiller, new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
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
    running = true;
    timerListener = new IActionListener() {

      /**
			 * 
			 */
      private static final long serialVersionUID = -4370382652507823364L;

      public void actionPerformed(ActionEvent event) {
        try {
          if (running) {
            getPanelAPI().callMethod("timer", new Object[0]);
            timer.restart();
          }
        } catch (Exception ex) {
          Ivy.log().error("Cannot call timer method", ex);
        }
      }
    };
    timer.addActionListener(timerListener);
    if (!RichDialogUtil.isRunningInVisualEditor()) {
      timer.start();
    }
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
   * This method initializes titleLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new RLabel();
      titleLabel.setText("Release Process Model Version");
      titleLabel.setStyle("title");
      titleLabel.setName("titleLabel");
    }
    return titleLabel;
  }

  /**
   * This method initializes releaseStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getReleaseStateLabel() {
    if (releaseStateLabel == null) {
      releaseStateLabel = new RLabel();
      releaseStateLabel.setText("releaseStateLabel");
      releaseStateLabel.setName("releaseStateLabel");
    }
    return releaseStateLabel;
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
      releaseButton.setStyle(NORMAL_RIGHT);
      releaseButton.setName("releaseButton");
    }
    return releaseButton;
  }

  /**
   * This method initializes activateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getActivateLabel() {
    if (activateLabel == null) {
      activateLabel = new RLabel();
      activateLabel.setText("Activate Process Model Version");
      activateLabel.setStyle("title");
      activateLabel.setName("activateLabel");
    }
    return activateLabel;
  }

  /**
   * This method initializes applicationLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getApplicationLabel() {
    if (applicationLabel == null) {
      applicationLabel = new RLabel();
      applicationLabel.setText("Application");
      applicationLabel.setName("applicationLabel");
    }
    return applicationLabel;
  }

  /**
   * This method initializes processModelLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getProcessModelLabel() {
    if (processModelLabel == null) {
      processModelLabel = new RLabel();
      processModelLabel.setText("Process Model");
      processModelLabel.setName("processModelLabel");
    }
    return processModelLabel;
  }

  /**
   * This method initializes pmvLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPmvLabel() {
    if (pmvLabel == null) {
      pmvLabel = new RLabel();
      pmvLabel.setText("Process Model Version\n");
      pmvLabel.setName("pmvLabel");
    }
    return pmvLabel;
  }

  /**
   * This method initializes applicationStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getApplicationStateLabel() {
    if (applicationStateLabel == null) {
      applicationStateLabel = new RLabel();
      applicationStateLabel.setText("applicationStateLabel");
      applicationStateLabel.setName("applicationStateLabel");
    }
    return applicationStateLabel;
  }

  /**
   * This method initializes pmStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPmStateLabel() {
    if (pmStateLabel == null) {
      pmStateLabel = new RLabel();
      pmStateLabel.setText("pmStateLabel");
      pmStateLabel.setName("pmStateLabel");
    }
    return pmStateLabel;
  }

  /**
   * This method initializes pmvStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPmvStateLabel() {
    if (pmvStateLabel == null) {
      pmvStateLabel = new RLabel();
      pmvStateLabel.setText("pmvStateLabel");
      pmvStateLabel.setStyleProperties("{/fill \"HORIZONTAL\" /weightX \"1\"}");
      pmvStateLabel.setName("pmvStateLabel");
    }
    return pmvStateLabel;
  }

  /**
   * This method initializes applicationActivateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getApplicationActivateButton() {
    if (applicationActivateButton == null) {
      applicationActivateButton = new RButton();
      applicationActivateButton.setText("Activate");
      applicationActivateButton.setStyle(NORMAL_RIGHT);
      applicationActivateButton.setName("applicationActivateButton");
    }
    return applicationActivateButton;
  }

  /**
   * This method initializes pmActivateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPmActivateButton() {
    if (pmActivateButton == null) {
      pmActivateButton = new RButton();
      pmActivateButton.setText("Activate");
      pmActivateButton.setStyle(NORMAL_RIGHT);
      pmActivateButton.setName("pmActivateButton");
    }
    return pmActivateButton;
  }

  /**
   * This method initializes pmvActivateButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPmvActivateButton() {
    if (pmvActivateButton == null) {
      pmvActivateButton = new RButton();
      pmvActivateButton.setText("Activate");
      pmvActivateButton.setStyle(NORMAL_RIGHT);
      pmvActivateButton.setName("pmvActivateButton");
    }
    return pmvActivateButton;
  }

  /**
   * This method initializes pmvOperationStateLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPmvOperationStateLabel() {
    if (pmvOperationStateLabel == null) {
      pmvOperationStateLabel = new RLabel();
      pmvOperationStateLabel.setName("pmvOperationStateLabel");
      pmvOperationStateLabel.setText("pmvOperationStateLabel");
    }
    return pmvOperationStateLabel;
  }

  /**
   * This method initializes activityConfigurationGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getActivityConfigurationGridBagLayoutPane() {
    if (activityConfigurationGridBagLayoutPane == null) {
      activityConfigurationGridBagLayoutPane = new RGridBagLayoutPane();
      activityConfigurationGridBagLayoutPane.setName("activityConfigurationGridBagLayoutPane");
      activityConfigurationGridBagLayoutPane.setBorder(BorderFactory.createTitledBorder(
          BorderFactory.createEtchedBorder(ULCEtchedBorder.RAISED), "Configuration",
          ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11),
          new Color(23, 64, 140)));
      activityConfigurationGridBagLayoutPane.setStyle("horizontal");
      activityConfigurationGridBagLayoutPane.add(getPmvLabel(), new com.ulcjava.base.application.GridBagConstraints(0,
          0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getPmvStateLabel(),
          new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getPmvActivateButton(),
          new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getProcessModelLabel(),
          new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getPmStateLabel(),
          new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getPmActivateButton(),
          new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getApplicationLabel(),
          new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getApplicationStateLabel(),
          new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
      activityConfigurationGridBagLayoutPane.add(getApplicationActivateButton(),
          new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1,
              com.ulcjava.base.application.GridBagConstraints.CENTER,
              com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0,
                  0, 0), 0, 0));
    }
    return activityConfigurationGridBagLayoutPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
