package ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;

/**
 * RichDialog panel implementation for DeploymentChooseDirectoryPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DeploymentChooseDirectoryPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel chooseDirectoryLabel = null;
  private RTextField directoryTextField = null;
  private RButton browseDirectoryButton = null;
  private RButton browseZipFileButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of DeploymentChooseDirectoryPanel
   */
  public DeploymentChooseDirectoryPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes DeploymentChooseDirectoryPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getChooseDirectoryLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDirectoryTextField(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getBrowseDirectoryButton(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getBrowseZipFileButton(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes chooseDirectoryLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getChooseDirectoryLabel() {
    if (chooseDirectoryLabel == null) {
      chooseDirectoryLabel = new RLabel();
      chooseDirectoryLabel.setText("Choose the project to deploy (directory, *.iar or *.zip file):");
      chooseDirectoryLabel.setStyle("title");
      chooseDirectoryLabel.setName("chooseDirectoryLabel");
    }
    return chooseDirectoryLabel;
  }

  /**
   * This method initializes directoryTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDirectoryTextField() {
    if (directoryTextField == null) {
      directoryTextField = new RTextField();
      directoryTextField.setText("directoryTextField");
      directoryTextField.setStyle("buttomOfTheLabel");
      directoryTextField.setName("directoryTextField");
    }
    return directoryTextField;
  }

  /**
   * This method initializes browseDirectoryButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBrowseDirectoryButton() {
    if (browseDirectoryButton == null) {
      browseDirectoryButton = new RButton();
      browseDirectoryButton.setText("Directory ...");
      browseDirectoryButton.setName("browseDirectoryButton");
    }
    return browseDirectoryButton;
  }

  /**
   * This method initializes browseZipFileButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBrowseZipFileButton() {
    if (browseZipFileButton == null) {
      browseZipFileButton = new RButton();
      browseZipFileButton.setText("File ...");
      browseZipFileButton.setName("browseZipFileButton");
    }
    return browseZipFileButton;
  }
}
