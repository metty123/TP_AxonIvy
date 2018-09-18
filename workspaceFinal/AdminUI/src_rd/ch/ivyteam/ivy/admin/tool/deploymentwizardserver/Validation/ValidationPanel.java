package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Validation;

import java.util.ArrayList;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ClientFileInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.ProcessName;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RProgressBar;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCLabel;
import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.ULCTextField;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * <p>
 * ValidationPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class ValidationPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblValidateProject = null;
  private RProgressBar progressBar = null;
  private RScrollPane scrollPane = null;
  private ULCPollingTimer timer; // @jve:decl-index=0:
  private boolean running = false;
  private IActionListener timerListener;
  private ArrayList<ClientFileInfo> projectsWillBeZipped = new ArrayList<ClientFileInfo>(); // @jve:decl-index=0:
  private ArrayList<String> filesWillBeUploaded = new ArrayList<String>(); // @jve:decl-index=0:
  private RTable tblValidation = null;
  private RLabel lblValidateStatus = null;

  // SONAR-OFF
  /**
   * Create a new instance of ValidationPanel
   */
  public ValidationPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ValidationPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller Filler11 = new RFiller();
    Filler11
        .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"0\"/preferredSizeHeight \"14\"}");
    RFiller Filler2 = new RFiller();
    Filler2
        .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"0\"/preferredSizeHeight \"27\"}");
    RFiller Filler = new RFiller();
    Filler
        .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"0\"/preferredSizeHeight \"22\"}");
    this.add(getLblValidateProject(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getProgressBar(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLblValidateStatus(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, 1.0D, 0.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler, new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler2, new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(Filler11, new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }



  /**
   * This method initializes lblValidateProject
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblValidateProject() {
    if (lblValidateProject == null) {
      lblValidateProject = new RLabel();
      lblValidateProject
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/validatingProject\")%>");
      lblValidateProject.setFont(new Font("Segoe UI", 1, 18));
      lblValidateProject
          .setStyleProperties("{/anchor \"CENTER\"/alignmentY \"0\"/insetsBottom \"20\"/alignmentX \"0\"/fill \"NONE\"}");
      lblValidateProject.setName("lblValidateProject");
    }
    return lblValidateProject;
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
      progressBar.setStyleProperties("{/anchor \"CENTER\"/fill \"HORIZONTAL\"/insetsRight \"50\"/insetsLeft \"50\"}");
    }
    return progressBar;
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
      scrollPane.setStyleProperties("{/anchor \"CENTER\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      scrollPane.setViewPortView(getTblValidation());
    }
    return scrollPane;
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
  public void startPollingTimer(ProcessName currentProcess) {
    running = true;
    if (currentProcess == ProcessName.COMPRESSING) {
      createUlcPollingTimerForTask("timerForCompressing");
    } else if (currentProcess == ProcessName.UNCOMPRESSING) {
      createUlcPollingTimerForTask("timerForUncompressing");
    } else if (currentProcess == ProcessName.UPLOADING) {
      createUlcPollingTimerForTask("timerForUploading");
    } else if (currentProcess == ProcessName.VALIDATING) {
      createUlcPollingTimerForTask("timerForValidating");
    }
    timer.addActionListener(timerListener);
    timer.start();
  }

  /**
   * Creates a ulc polling timer base on task
   */

  public void createUlcPollingTimerForTask(final String methodName) {
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
            getPanelAPI().callMethod(methodName, new Object[0]);
          }
        } catch (Exception ex) {
          Ivy.log().error("Cannot call timer method", ex);
        }
      }
    };
  }


  /**
   * This method initializes tblValidation
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getTblValidation() {
    if (tblValidation == null) {
      tblValidation = new RTable();
      tblValidation.setName("tblValidation");
      tblValidation.setSortable(true);
      tblValidation
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"result=value\"/icon \"result=(\\r\\nentry.getSeverity().equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.ERROR.name()))\\r\\n?\\r\\nivy.cms.cr(\\\"/images/klein/issueError\\\")\\r\\n:\\r\\n(entry.getSeverity().equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.WARNING.name())\\r\\n?\\r\\nivy.cms.cr(\\\"/images/klein/issueWarning\\\")\\r\\n:\\r\\n(entry.getSeverity().equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.EXCEPTION.name())\\r\\n?\\r\\nivy.cms.cr(\\\"/images/klein/fatal\\\")\\r\\n:\\r\\nivy.cms.cr(\\\"/images/klein/issueInfo\\\")\\r\\n)\\r\\n)\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/problem\\\")\"/headerAlignment \"default\"/field \"message\"/editable \"\"/condition \"\"/columnStyle \"deploymentWizardValidation\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/severity\\\")\"/headerAlignment \"default\"/field \"severity\"/editable \"\"/condition \"\"/columnStyle \"deploymentWizardValidation\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/application\\\")\"/headerAlignment \"default\"/field \"applicationName\"/editable \"\"/condition \"\"/columnStyle \"deploymentWizardValidation\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/project\\\")\"/headerAlignment \"default\"/field \"projectName\"/editable \"\"/condition \"\"/columnStyle \"deploymentWizardValidation\"/cellWidget \"\"}}}");
      tblValidation.setBorder(BorderFactory.createLineBorder(new Color(225, 225, 225), 2));
      tblValidation.setStyleProperties("{/evenRowBackgroundColor \"b=225\\ng=225\\nr=225\"}");
      tblValidation.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
    }
    return tblValidation;
  }

  /**
   * This method initializes lblValidateStatus
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblValidateStatus() {
    if (lblValidateStatus == null) {
      lblValidateStatus = new RLabel();
      lblValidateStatus.setText("");
      lblValidateStatus.setPreferredSize(new com.ulcjava.base.application.util.Dimension(0, 22));
      lblValidateStatus.setHorizontalTextPosition(ULCLabel.CENTER);
      lblValidateStatus.setHorizontalAlignment(ULCTextField.CENTER);
      lblValidateStatus
          .setStyleProperties("{/anchor \"CENTER\"/alignmentY \"0.5\"/insetsBottom \"35\"/insetsTop \"0\"/fill \"HORIZONTAL\"}");
      lblValidateStatus.setName("lblValidateStatus");
    }
    return lblValidateStatus;
  }
}
