package ch.ivyteam.ivy.admin.tool.ProcessModelVersion;

import ch.ivyteam.ivy.admin.tool.Activity.ActivityPanel;
import ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStatePanel;
import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for ProcessModelVersionPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ProcessModelVersionPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  private static final String R_TEXT_FIELD = "RTextField";
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane infoGridBagLayoutPane = null;
  private RLabel nameLabel = null;
  private RLabel versionLabel = null;
  private RLabel descriptionLabel = null;
  private RLabel libraryLabel = null;
  private RTextField versionTextField = null;
  private RTextField nameTextField = null;
  private RTextArea descriptionTextArea = null;
  private RTextField libraryTextField = null;
  private RButton deployButton = null;
  @EmbeddedRichDialog(ActivityPanel.class)
  private ULCContainer activityPanel = null;
  @EmbeddedRichDialog(ReleaseStatePanel.class)
  private ULCContainer releaseStatePanel = null;
  private RScrollPane descriptionScrollPane = null;
  private RLabel deploymentDirectoryLabel = null;
  private RTextField deploymentDirectoryTextField = null;
  private RLabel lastModifiedLabel = null;
  private RTextField lastModifiedTextField = null;
  private RLabel runningCasesLabel = null;
  private RTextField runningCasesTextField = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer headerPane = null;
  private RButton displayLibraryBtn = null;

  // SONAR-OFF
  /**
   * Create a new instance of ProcessModelVersionPanel
   */
  public ProcessModelVersionPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ProcessModelVersionPanel
   * 
   * @return void
   */
  public void initialize() {
    RFiller filler = new RFiller();
    filler.setStyleProperties("{/preferredSizeWidth \"0\"/fill \"VERTICAL\"/preferredSizeHeight \"0\"/weightY \"1\"}");
    RFiller filler1 = new RFiller();
    this.add(getHeaderPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getInfoGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getActivityPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 8, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getReleaseStatePanel(), new com.ulcjava.base.application.GridBagConstraints(1, 8, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(filler1, new com.ulcjava.base.application.GridBagConstraints(0, 10, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(filler, new com.ulcjava.base.application.GridBagConstraints(0, 12, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes infoGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getInfoGridBagLayoutPane() {
    if (infoGridBagLayoutPane == null) {
      infoGridBagLayoutPane = new RGridBagLayoutPane();
      infoGridBagLayoutPane.setName("infoGridBagLayoutPane");
      infoGridBagLayoutPane.setBorder(BorderFactory.createTitledBorder("Information"));
      // SONAR-OFF
      infoGridBagLayoutPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      // SONAR-ON
      infoGridBagLayoutPane.setName("infoGridBagLayoutPane");
      infoGridBagLayoutPane.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getLibraryLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getVersionTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 2, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 2, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getLibraryTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 3,
          2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getRunningCasesLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getRunningCasesTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 6,
          2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDeploymentDirectoryLabel(), new com.ulcjava.base.application.GridBagConstraints(0,
          7, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDeploymentDirectoryTextField(), new com.ulcjava.base.application.GridBagConstraints(
          1, 7, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDeployButton(), new com.ulcjava.base.application.GridBagConstraints(2, 7, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getLastModifiedLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 8, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getLastModifiedTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 8,
          2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDisplayLibraryBtn(), new com.ulcjava.base.application.GridBagConstraints(2, 5, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return infoGridBagLayoutPane;
  }

  /**
   * This method initializes nameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getNameLabel() {
    if (nameLabel == null) {
      nameLabel = new RLabel();
      nameLabel.setText("Name");
      nameLabel.setName("nameLabel");
    }
    return nameLabel;
  }

  /**
   * This method initializes versionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getVersionLabel() {
    if (versionLabel == null) {
      versionLabel = new RLabel();
      versionLabel.setText("Version");
      versionLabel.setName("versionLabel");
    }
    return versionLabel;
  }

  /**
   * This method initializes descriptionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptionLabel() {
    if (descriptionLabel == null) {
      descriptionLabel = new RLabel();
      descriptionLabel.setText("Description");
      descriptionLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
  }

  /**
   * This method initializes libraryLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLibraryLabel() {
    if (libraryLabel == null) {
      libraryLabel = new RLabel();
      libraryLabel.setText("<%= ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/deployedProject\") %>");
      libraryLabel.setName("libraryLabel");
    }
    return libraryLabel;
  }

  /**
   * This method initializes versionTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getVersionTextField() {
    if (versionTextField == null) {
      versionTextField = new RTextField();
      versionTextField.setText(R_TEXT_FIELD);
      versionTextField.setEditable(false);
      versionTextField.setDisabledTextColor(Color.lightGray);
      versionTextField.setName("versionTextField");
    }
    return versionTextField;
  }

  /**
   * This method initializes nameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNameTextField() {
    if (nameTextField == null) {
      nameTextField = new RTextField();
      nameTextField.setText(R_TEXT_FIELD);
      nameTextField.setEditable(false);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes descriptionTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescriptionTextArea() {
    if (descriptionTextArea == null) {
      descriptionTextArea = new RTextArea();
      descriptionTextArea.setText("RTextArea");
      descriptionTextArea.setRows(4);
      descriptionTextArea.setEditable(false);
      descriptionTextArea.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"/fill \"BOTH\"/weightY \"1\"}");
      descriptionTextArea.setTabSize(5);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes libraryTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLibraryTextField() {
    if (libraryTextField == null) {
      libraryTextField = new RTextField();
      libraryTextField.setText(R_TEXT_FIELD);
      libraryTextField.setEditable(false);
      libraryTextField.setName("libraryTextField");
    }
    return libraryTextField;
  }

  /**
   * This method initializes deployButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeployButton() {
    if (deployButton == null) {
      deployButton = new RButton();
      deployButton.setText("Deploy");
      deployButton.setStyleProperties("{/anchor \"EAST\"/weightX \"0\"}");
      deployButton.setName("deployButton");
    }
    return deployButton;
  }

  /**
   * This method initializes activityPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.Activity.ActivityPanel
   */
  private ULCContainer getActivityPanel() {
    if (activityPanel == null) {
      activityPanel = RichDialogPanelFactory.create(ActivityPanel.class);
      activityPanel.setName("activityPanel");
      activityPanel.setPreferredSize(new com.ulcjava.base.application.util.Dimension(300, 130));
      // SONAR-OFF
      activityPanel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      // SONAR-ON
      activityPanel.setName("activityPanel");
      // SONAR-OFF
      activityPanel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      // SONAR-ON
    }
    return activityPanel;
  }

  /**
   * This method initializes releaseStatePanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStatePanel
   */
  private ULCContainer getReleaseStatePanel() {
    if (releaseStatePanel == null) {
      releaseStatePanel = RichDialogPanelFactory.create(ReleaseStatePanel.class);
      releaseStatePanel.setName("releaseStatePanel");
      releaseStatePanel.setPreferredSize(new com.ulcjava.base.application.util.Dimension(300, 130));
      releaseStatePanel.setName("releaseStatePanel");
      releaseStatePanel.setStyleProperties("{/fill \"BOTH\"/weightY \"0\"}");
    }
    return releaseStatePanel;
  }

  /**
   * This method initializes descriptionScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDescriptionScrollPane() {
    if (descriptionScrollPane == null) {
      descriptionScrollPane = new RScrollPane();
      descriptionScrollPane.setName("descriptionScrollPane");
      descriptionScrollPane.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      descriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return descriptionScrollPane;
  }

  /**
   * This method initializes deploymentDirectoryLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDeploymentDirectoryLabel() {
    if (deploymentDirectoryLabel == null) {
      deploymentDirectoryLabel = new RLabel();
      deploymentDirectoryLabel.setText("Directory:");
      deploymentDirectoryLabel.setName("deploymentDirectoryLabel");
    }
    return deploymentDirectoryLabel;
  }

  /**
   * This method initializes deploymentDirectoryTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDeploymentDirectoryTextField() {
    if (deploymentDirectoryTextField == null) {
      deploymentDirectoryTextField = new RTextField();
      deploymentDirectoryTextField.setText(R_TEXT_FIELD);
      deploymentDirectoryTextField.setEditable(false);
      deploymentDirectoryTextField.setStyleProperties("{/insetsRight \"60\"}");
      deploymentDirectoryTextField.setName("deploymentDirectoryTextField");
    }
    return deploymentDirectoryTextField;
  }

  /**
   * This method initializes lastModifiedLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLastModifiedLabel() {
    if (lastModifiedLabel == null) {
      lastModifiedLabel = new RLabel();
      lastModifiedLabel.setText("Last changed:");
      lastModifiedLabel.setName("lastModifiedLabel");
    }
    return lastModifiedLabel;
  }

  /**
   * This method initializes lastModifiedTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLastModifiedTextField() {
    if (lastModifiedTextField == null) {
      lastModifiedTextField = new RTextField();
      lastModifiedTextField.setText(R_TEXT_FIELD);
      lastModifiedTextField.setEditable(false);
      lastModifiedTextField.setName("lastModifiedTextField");
    }
    return lastModifiedTextField;
  }

  /**
   * This method initializes runningCasesLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getRunningCasesLabel() {
    if (runningCasesLabel == null) {
      runningCasesLabel = new RLabel();
      runningCasesLabel.setText("Running cases");
      runningCasesLabel.setName("runningCasesLabel");
    }
    return runningCasesLabel;
  }

  /**
   * This method initializes runningCasesTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getRunningCasesTextField() {
    if (runningCasesTextField == null) {
      runningCasesTextField = new RTextField();
      runningCasesTextField.setText(R_TEXT_FIELD);
      runningCasesTextField.setEditable(false);
      runningCasesTextField.setName("runningCasesTextField");
    }
    return runningCasesTextField;
  }

  /**
   * This method initializes headerPane
   * 
   * @return ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel
   */
  private ULCContainer getHeaderPane() {
    if (headerPane == null) {
      headerPane = RichDialogPanelFactory.create(TabHeaderBarPanel.class);
      headerPane.setName("headerPane");
      // SONAR-OFF
      headerPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      // SONAR-ON
    }
    return headerPane;
  }

  /**
   * This method initializes displayLibraryBtn
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDisplayLibraryBtn() {
    if (displayLibraryBtn == null) {
      displayLibraryBtn = new RButton();
      displayLibraryBtn
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/dependencies\")%>");
      displayLibraryBtn.setStyleProperties("{/anchor \"SOUTHWEST\"}");
      displayLibraryBtn.setName("displayLibraryBtn");
    }
    return displayLibraryBtn;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
