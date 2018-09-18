package ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard;

import ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryPanel;
import ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressPanel;
import ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationPanel;
import ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivatePanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RCardPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for DeploymentWizardPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DeploymentWizardPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RButton cancelButton = null;
  private RButton nextButton = null;
  private RButton previousButton = null;
  private RLabel titleLabel = null;
  private RCardPane contentCardPane = null;
  @EmbeddedRichDialog(DeploymentProgressPanel.class)
  private ULCContainer deploymentProgressPanel = null;
  @EmbeddedRichDialog(DeploymentChooseDirectoryPanel.class)
  private ULCContainer deploymentChooseDirectoryPanel = null;
  @EmbeddedRichDialog(DeploymentReleaseAndActivatePanel.class)
  private ULCContainer deploymentReleaseAndActivatePanel = null;
  @EmbeddedRichDialog(DeploymentProjectValidationPanel.class)
  private ULCContainer deploymentProjectValidationPanel = null;
  private RGridBagLayoutPane titlePane = null;
  private RLabel deploymentIconLabel = null;
  private RLabel pmvIconLabel = null;

  // SONAR-OFF
  /**
   * Create a new instance of DeploymentWizardPanel
   */
  public DeploymentWizardPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DeploymentWizardPanel
   * 
   * @return void
   */
  private void initialize() {
    RFiller buttonFiller = new RFiller();
    buttonFiller.setStyle("horizontalGlue");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(532, 366));
    this.add(getNextButton(), new com.ulcjava.base.application.GridBagConstraints(2, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPreviousButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getCancelButton(), new com.ulcjava.base.application.GridBagConstraints(3, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(buttonFiller, new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getContentCardPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 4, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTitlePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 4, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
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
   * This method initializes nextButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getNextButton() {
    if (nextButton == null) {
      nextButton = new RButton();
      nextButton.setText("Next");
      nextButton.setName("nextButton");
    }
    return nextButton;
  }

  /**
   * This method initializes previousButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPreviousButton() {
    if (previousButton == null) {
      previousButton = new RButton();
      previousButton.setText("Previous");
      previousButton.setName("previousButton");
    }
    return previousButton;
  }

  /**
   * This method initializes titleLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new RLabel();
      titleLabel.setText("<html>Deploy Project to <br>\nProcess Model Version</html>");
      titleLabel.setStyle("wizardTitle");
      titleLabel.setName("titleLabel");
    }
    return titleLabel;
  }

  /**
   * This method initializes contentCardPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RCardPane
   */
  private RCardPane getContentCardPane() {
    if (contentCardPane == null) {
      contentCardPane = new RCardPane();
      contentCardPane.setName("contentCardPane");
      contentCardPane.setStyle("both");
      contentCardPane.addCard("deploymentChooseDirectoryPanel", getDeploymentChooseDirectoryPanel());
      contentCardPane.addCard("deploymentProjectValidationPanel", getDeploymentProjectValidationPanel());
      contentCardPane.addCard("deploymentProgressPanel", getDeploymentProgressPanel());
      contentCardPane.addCard("deploymentReleaseAndActivatePanel", getDeploymentReleaseAndActivatePanel());
    }
    return contentCardPane;
  }

  /**
   * This method initializes deploymentProgressPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressPanel
   */
  private ULCContainer getDeploymentProgressPanel() {
    if (deploymentProgressPanel == null) {
      deploymentProgressPanel = RichDialogPanelFactory.create(DeploymentProgressPanel.class);
      deploymentProgressPanel.setName("deploymentProgressPanel");
    }
    return deploymentProgressPanel;
  }

  /**
   * This method initializes deploymentChooseDirectoryPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryPanel
   */
  private ULCContainer getDeploymentChooseDirectoryPanel() {
    if (deploymentChooseDirectoryPanel == null) {
      deploymentChooseDirectoryPanel = RichDialogPanelFactory.create(DeploymentChooseDirectoryPanel.class);
      deploymentChooseDirectoryPanel.setName("deploymentChooseDirectoryPanel");
    }
    return deploymentChooseDirectoryPanel;
  }

  /**
   * This method initializes deploymentReleaseAndActivatePanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivatePanel
   */
  private ULCContainer getDeploymentReleaseAndActivatePanel() {
    if (deploymentReleaseAndActivatePanel == null) {
      deploymentReleaseAndActivatePanel = RichDialogPanelFactory.create(DeploymentReleaseAndActivatePanel.class);
      deploymentReleaseAndActivatePanel.setName("deploymentReleaseAndActivatePanel");
    }
    return deploymentReleaseAndActivatePanel;
  }

  /**
   * This method initializes deploymentProjectValidationPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationPanel
   */
  private ULCContainer getDeploymentProjectValidationPanel() {
    if (deploymentProjectValidationPanel == null) {
      deploymentProjectValidationPanel = RichDialogPanelFactory.create(DeploymentProjectValidationPanel.class);
      deploymentProjectValidationPanel.setName("deploymentProjectValidationPanel");
    }
    return deploymentProjectValidationPanel;
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
      titlePane.setStyle("wizardTitlePane");
      titlePane.setStyleProperties("{/backgroundColor {/b \"255\"/r \"255\"/g \"255\"}}");
      titlePane.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.gray));
      titlePane.add(getTitleLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      titlePane.add(getDeploymentIconLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      titlePane.add(getPmvIconLabel(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return titlePane;
  }

  /**
   * This method initializes deploymentIconLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDeploymentIconLabel() {
    if (deploymentIconLabel == null) {
      deploymentIconLabel = new RLabel();
      deploymentIconLabel.setName("deploymentIconLabel");
      deploymentIconLabel.setStyle("icon");
      deploymentIconLabel.setIconUri("<%=ivy.cms.cr(\"/images/gross/deploy\")%>");
    }
    return deploymentIconLabel;
  }

  /**
   * This method initializes pmvIconLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getPmvIconLabel() {
    if (pmvIconLabel == null) {
      pmvIconLabel = new RLabel();
      pmvIconLabel.setName("pmvIconLabel");
      pmvIconLabel.setStyle("icon");
      pmvIconLabel.setIconUri("<%=ivy.cms.cr(\"/images/gross/processModelVersion\")%>");
    }
    return pmvIconLabel;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
