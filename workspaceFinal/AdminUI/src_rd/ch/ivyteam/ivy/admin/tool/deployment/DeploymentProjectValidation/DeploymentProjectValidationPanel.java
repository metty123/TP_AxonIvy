package ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.border.ULCEtchedBorder;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for DeploymentProjectValidationPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DeploymentProjectValidationPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel infoLabel = null;
  private RProgressBar validatingProgressBar = null;
  private RLabel validatingMessageLabel = null;
  private RButton showDetailButton = null;
  private RGridBagLayoutPane checksPane = null;

  private ULCPollingTimer timer;
  private RTree checksTree = null;
  private RScrollPane checkScrollPane = null;
  private boolean running = false;
  private IActionListener timerListener;

  // SONAR-OFF
  /**
   * Create a new instance of DeploymentProjectValidationPanel
   */
  public DeploymentProjectValidationPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DeploymentProjectValidationPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(375, 221));
    this.add(getInfoLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getValidatingProgressBar(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getValidatingMessageLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getChecksPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
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
          Ivy.log().error("Cannot call timer method", ex);
        }
      }
    };
  }

  /**
   * This method initializes infoLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getInfoLabel() {
    if (infoLabel == null) {
      infoLabel = new RLabel();
      infoLabel.setText("Validating Project ...");
      infoLabel.setStyle("title");
      infoLabel.setName("infoLabel");
    }
    return infoLabel;
  }

  /**
   * This method initializes validatingProgressBar
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar
   */
  private RProgressBar getValidatingProgressBar() {
    if (validatingProgressBar == null) {
      validatingProgressBar = new RProgressBar();
      validatingProgressBar.setName("validatingProgressBar");
    }
    return validatingProgressBar;
  }

  /**
   * This method initializes validatingMessageLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getValidatingMessageLabel() {
    if (validatingMessageLabel == null) {
      validatingMessageLabel = new RLabel();
      validatingMessageLabel.setText("validatingMessageLabel");
      validatingMessageLabel.setName("validatingMessageLabel");
    }
    return validatingMessageLabel;
  }

  /**
   * This method initializes showDetailButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getShowDetailButton() {
    if (showDetailButton == null) {
      showDetailButton = new RButton();
      showDetailButton.setText("Details ...");
      showDetailButton.setStyleProperties("{/anchor \"NORTH\"}");
      showDetailButton.setName("showDetailButton");
    }
    return showDetailButton;
  }

  /**
   * This method initializes checksPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getChecksPane() {
    if (checksPane == null) {
      checksPane = new RGridBagLayoutPane();
      checksPane.setName("checksPane");
      checksPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(ULCEtchedBorder.RAISED),
          "Executed Checks:", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font(
              "Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      checksPane.add(getShowDetailButton(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      checksPane.add(getCheckScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return checksPane;
  }

  /**
   * This method initializes checksTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree
   */
  private RTree getChecksTree() {
    if (checksTree == null) {
      checksTree = new RTree();
      checksTree.setName("checksTree");
      checksTree
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/dynamicTreeLoadMode \"LOAD_FOR_RENDER_PARENT\"/emptyTableText \"\"/columns {{/patterns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.getName()+\\r\\n(entry.getHighestValidationIssueSeverity()==ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.ERROR\\r\\n?\\r\\n\\\" (has Errors)\\\"\\r\\n:\\r\\nentry.getHighestValidationIssueSeverity()==ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.WARNING\\r\\n?\\r\\n\\\"(has Warnings)\\\"\\r\\n:\\r\\n\\\"\\\")\"/version \"3.0\"/tooltip \"result=entry.getDescription()\"/icon \"result=ivy.cms.cr(\\\"/images/klein/check\\\")\"/columnStyle \"validationCheckStyle\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationCheck\"}{/result \"result=entry.getMessage()\"/version \"3.0\"/tooltip \"result=entry.getDescription()\"/icon \"result=ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.INFO==entry.getSeverity()\\r\\n?\\r\\nivy.cms.cr(\\\"/images/klein/issueInfo\\\")\\r\\n:\\r\\nentry.getSeverity()==ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.WARNING\\r\\n?\\r\\nivy.cms.cr(\\\"/images/klein/issueWarning\\\")\\r\\n:\\r\\nentry.getSeverity()==ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.ERROR\\r\\n?\\r\\nivy.cms.cr(\\\"/images/klein/issueError\\\")\\r\\n:\\r\\nivy.cms.cr(\\\"/images/klein/fatal\\\")\"/header \"\"/field \"\"/columnStyle \"validationIssueStyle\"/patternMode \"INSTANCE\"/patternValue \"ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue\"}}/version \"3.0\"}}}");
      checksTree.setRootVisible(false);
      checksTree.setStyleProperties("{/fill \"BOTH\"}");
    }
    return checksTree;
  }

  /**
   * This method initializes checkScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getCheckScrollPane() {
    if (checkScrollPane == null) {
      checkScrollPane = new RScrollPane();
      checkScrollPane.setName("checkScrollPane");
      checkScrollPane.setViewPortView(getChecksTree());
    }
    return checkScrollPane;
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
} // @jve:decl-index=0:visual-constraint="10,10"
