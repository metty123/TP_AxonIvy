package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.SourceSelection;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.LibraryUtil;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RButtonGroup;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ulc.vwidget.common.ProjectData;
import ch.ivyteam.ulc.vwidget.server.IVProjectExtractionHandler;
import ch.ivyteam.ulc.vwidget.server.ULCVProjectExtraction;

import com.ulcjava.base.application.ClientContext;
import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.ULCAlert;
import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.util.IFileChooseHandler;
import com.ulcjava.base.application.util.IFileLoadHandler;
import com.ulcjava.base.shared.FileChooserConfig;
import com.ulcjava.base.shared.FileChooserConfig.FileFilterConfig;

/**
 * <p>
 * deployWizardSourcePanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container,
 * but of an ULCContainer. As such it can not be run or instantiated outside the
 * ULC framework.
 */
@SuppressWarnings("all")
public class SourceSelectionPanel extends RichDialogGridBagPanel implements IRichDialogPanel {

  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextField txtSelectRootDirectory = null;
  private RLabel lblSelectRootDirectory = null;
  private RButton btnBrowse = null;
  private RButton btnRefresh = null;
  private RScrollPane scrollPane = null;
  private RGridBagLayoutPane gridBagLayoutPane = null;
  private ULCPollingTimer timer;
  private boolean running = false;
  private IActionListener timerListener;

  private String choosedClientFilePath = ""; // @jve:decl-index=0:
  private List<ProjectInfo> clientProjects = new ArrayList<ProjectInfo>(); // @jve:decl-index=0:

  private RButton inviButton = null;
  private ULCVProjectExtraction projExtractTool; // @jve:decl-index=0:
  private IVProjectExtractionHandler projectExtractionHandler;
  private RGridBagLayoutPane topGridBagLayoutPane = null;
  private RLabel lblProjectSelection = null;
  private RButtonGroup modeGroup = null; // @jve:decl-index=0:visual-constraint="718,9"
  private RRadioButton radioServer = null;
  private RRadioButton radioLocal = null;
  private RButton buttonHidden = null; // @jve:decl-index=0:visual-constraint="736,72"

  public List<ProjectInfo> getClientProjects() {
    return clientProjects;
  }

  // SONAR-OFF
  /**
   * Create a new instance of deployWizardSourcePanel
   */
  public SourceSelectionPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes deployWizardSourcePanel
   * 
   * @return void
   */
  private void initialize() {
    this.setCornerRadius(0);
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(700, 500));
    this.setMinimumSize(new com.ulcjava.base.application.util.Dimension(600, 400));
    this.add(getTopGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1.0D, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 0, 0));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getInviButton(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes txtSelectRootDirectory
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getTxtSelectRootDirectory() {
    if (txtSelectRootDirectory == null) {
      txtSelectRootDirectory = new RTextField();
      txtSelectRootDirectory.setName("txtSelectRootDirectory");
      txtSelectRootDirectory
          .setStyleProperties("{/insetsBottom \"0\"/fill \"HORIZONTAL\"/insetsRight \"5\"/insetsLeft \"0\"/weightY \"1\"/weightX \"2\"}");
      txtSelectRootDirectory.setSelectedTextColor(new Color(51, 51, 51));
    }
    return txtSelectRootDirectory;
  }

  /**
   * This method initializes lblSelectRootDirectory
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSelectRootDirectory() {
    if (lblSelectRootDirectory == null) {
      lblSelectRootDirectory = new RLabel();
      lblSelectRootDirectory.setStyleProperties("{/insetsBottom \"0\"/insetsRight \"10\"/insetsLeft \"5\"}");
      lblSelectRootDirectory
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/selectProjectLocation\")%>");
      lblSelectRootDirectory.setName("lblSelectRootDirectory");
    }
    return lblSelectRootDirectory;
  }

  /**
   * This method initializes btnBrowse
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnBrowse() {
    if (btnBrowse == null) {
      btnBrowse = new RButton();
      btnBrowse.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/browse\")%>");
      btnBrowse
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"0\"/preferredSizeWidth \"90\"/preferredSizeHeight \"27\"}");
      btnBrowse.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/showDetail\")%>");
      btnBrowse.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnBrowse.setName("btnBrowse");
    }
    return btnBrowse;
  }

  /**
   * This method initializes btnRefresh
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnRefresh() {
    if (btnRefresh == null) {
      btnRefresh = new RButton();
      btnRefresh.setText("");
      btnRefresh
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"0\"/insetsTop \"0\"/preferredSizeWidth \"30\"/insetsLeft \"5\"/preferredSizeHeight \"27\"}");
      btnRefresh.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/refresh\")%>");
      btnRefresh.setHorizontalAlignment(ULCAbstractButton.CENTER);
      btnRefresh.setFont(new Font("Tahoma", 1, 11));
      btnRefresh.setToolTipText("<%=ivy.cms.co(\"/Dialogs/general/refresh\")%>");
      btnRefresh.setName("btnRefresh");
    }
    return btnRefresh;
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
      scrollPane.setStyleProperties("{/insetsTop \"5\"}");
      scrollPane.setViewPortView(getGridBagLayoutPane());
    }
    return scrollPane;
  }

  /**
   * This method initializes gridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getGridBagLayoutPane() {
    if (gridBagLayoutPane == null) {
      gridBagLayoutPane = new RGridBagLayoutPane();
      gridBagLayoutPane.setName("gridBagLayoutPane");
      gridBagLayoutPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      gridBagLayoutPane.setStyleProperties("{/fill \"BOTH\"/weightX \"1\"}");
    }
    return gridBagLayoutPane;
  }

  public void chooseClientFile(String selectedPathOnLocal) {
    final FileChooserConfig fcConfig = new FileChooserConfig();
    fcConfig.setFileSelectionMode(FileChooserConfig.FILES_AND_DIRECTORIES);
    fcConfig.setMultiSelectionEnabled(false);
    fcConfig.setDialogTitle(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/dialogTitle/browseOnClient"));
    FileFilterConfig filter = new FileChooserConfig.FileFilterConfig(new String[] { "zip", "iar" }, "*.zip,*.iar");
    fcConfig.addFileFilterConfig(filter);
    fcConfig.setCurrentDirectory(selectedPathOnLocal); // to test if it works

    ClientContext.chooseFile(new IFileChooseHandler() {

      @Override
      public void onSuccess(String[] filePaths, String[] fileNames) {
        if (filePaths.length >= 1) {
          choosedClientFilePath = filePaths[0];
          try {
            getPanelAPI().callMethod("updateChoosedFilePath", new Object[] { choosedClientFilePath });
          } catch (InvocationTargetException e) {
            Ivy.log().error(e.fillInStackTrace());
          } catch (NoSuchMethodException e) {
            Ivy.log().error(e.fillInStackTrace());
          }
          // Call this method to extract project info. on client machine
          browseClientProjects(choosedClientFilePath);
        }
      }

      @Override
      public void onFailure(int reason, String description) {
        String msg;
        if (reason == IFileLoadHandler.CANCELLED) {
          msg = "User cancelled operation";
        } else if (reason == IFileLoadHandler.FAILED) {
          msg = "File choose failed: " + description;
        } else {
          msg = "Unknown failure: " + description;
        }
      }
    }, fcConfig, this);
  }

  public void browseClientProjects(String path) {
    if (path == null || path.isEmpty()) {
      return;
    }

    projectExtractionHandler = new IVProjectExtractionHandler() {

      @Override
      public void onSuccess(List<ProjectData> clientProjectList) {
        // Make SourceSelectionPanel enable when the project extraction is
        // finished
        setEnabled(true);

        // Collect found projects into clientProjects to process later
        clientProjects.clear();

        for (ProjectData project : clientProjectList) {

          ProjectInfo projectInfo = new ProjectInfo();

          projectInfo.setProjectName(project.getProjectName());
          projectInfo.setProjectPath(project.getProjectPath());
          projectInfo.setOriginPath(project.getProjectPath());
          projectInfo.setQualifiedProjectVersion(QualifiedVersions.valueOf(project.getProjectVersion().toString()));
          projectInfo.setIsDirectory(project.getIsDirectory());
          projectInfo.setLibraryId(project.getLibraryId());
          projectInfo.setRequireProjects(LibraryUtil.getRequireProjectInfo(project.getRequireProjects()));
          // If the project has no Project Name or Library is empty. they will
          // be ignored
          if (!projectInfo.getProjectName().isEmpty() || !projectInfo.getLibraryId().isEmpty()) {
            clientProjects.add(projectInfo);
          }

        }

        // This button is used to invoke a method on Process (.mod) file
        inviButton.doClick();
      }

      @Override
      public void onFailure(String errorLog) {
        if ((errorLog != null) && !errorLog.equals("")) {
          // Erase list of found projects
          clientProjects.clear();
          String title = Ivy.cms().co("/Dialogs/general/error");
          String firstButtonLabel = Ivy.cms().co("/Dialogs/general/ok");
          ULCAlert alert = new ULCAlert(title, errorLog, firstButtonLabel);
          alert.show();
          // Clear list of projects on GUI
          inviButton.doClick();
        }
      }

      @Override
      public void onCancel() {
      }

      @Override
      public void onCheckPath(boolean paramClientPathValid) {
        if (!paramClientPathValid) {
          try {
            getPanelAPI().callMethod("showInvalidPathError", new Object[0]);
          } catch (InvocationTargetException e) {
            Ivy.log().error(e.fillInStackTrace());
          } catch (NoSuchMethodException e) {
            Ivy.log().error(e.fillInStackTrace());
          }
        }
      }
    };

    projExtractTool = new ULCVProjectExtraction(projectExtractionHandler);

    if (projExtractTool.isUploaded()) {
      try {
        getPanelAPI().callMethod("updateUIBeforeProgress", new Object[] {});
      } catch (InvocationTargetException e) {
        Ivy.log().error(e.fillInStackTrace());
      } catch (NoSuchMethodException e) {
        Ivy.log().error(e.fillInStackTrace());
      }
      projExtractTool.getProjectList(path);
    }
  }

  public void cancelProjectExtractionProgress() {
    if (projExtractTool != null && projExtractTool.isUploaded()) {
      projExtractTool.cancelRequest();
    }
  }

  /**
   * This method initializes inviButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getInviButton() {
    if (inviButton == null) {
      inviButton = new RButton();
      inviButton.setText("");
      inviButton
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"0\"/preferredSizeHeight \"0\"}");
      inviButton.setVisible(false);
      inviButton.setName("inviButton");
    }
    return inviButton;
  }

  /**
   * This method initializes topGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTopGridBagLayoutPane() {
    if (topGridBagLayoutPane == null) {
      topGridBagLayoutPane = new RGridBagLayoutPane();
      topGridBagLayoutPane.setName("topGridBagLayoutPane");
      topGridBagLayoutPane.setStyle("horizontal");
      topGridBagLayoutPane.add(getLblProjectSelection(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 5,
          1, 0.0D, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      topGridBagLayoutPane.add(getLblSelectRootDirectory(), new com.ulcjava.base.application.GridBagConstraints(0, 1,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      topGridBagLayoutPane.add(getTxtSelectRootDirectory(), new com.ulcjava.base.application.GridBagConstraints(1, 2,
          2, 1, 1.0D, 1.0D, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.BOTH,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      topGridBagLayoutPane.add(getBtnBrowse(), new com.ulcjava.base.application.GridBagConstraints(4, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 5, 0, 0), 0, 0));
      topGridBagLayoutPane.add(getBtnRefresh(), new com.ulcjava.base.application.GridBagConstraints(3, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      topGridBagLayoutPane.add(getRadioServer(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, -5, 0,
              0), 0, 0));
      topGridBagLayoutPane.add(getRadioLocal(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return topGridBagLayoutPane;
  }

  public void createUlcPollingTimerForProjectExtraction() {
    timer = new ULCPollingTimer(500, null);
    timer.setRepeats(false);
    timerListener = new IActionListener() {

      public void actionPerformed(ActionEvent event) {
        try {
          if (running) {
            getPanelAPI().callMethod("timerForProjectExtraction", new Object[0]);
          }
        } catch (Exception ex) {
          Ivy.log().error("Cannot call timer method", ex);
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
    createUlcPollingTimerForProjectExtraction();
    timer.addActionListener(timerListener);
    timer.start();
  }

  public void showErrorDialog(String message) {
    ULCAlert alert = new ULCAlert(Ivy.cms().co("/Dialogs/general/error"), message, Ivy.cms().co("/Dialogs/general/ok"));
    alert.show();
  }

  /**
   * This method initializes lblProjectSelection
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblProjectSelection() {
    if (lblProjectSelection == null) {
      lblProjectSelection = new RLabel();
      lblProjectSelection
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/projectSelection\")%>");
      lblProjectSelection.setFont(new Font("Segoe UI", 1, 20));
      lblProjectSelection.setStyleProperties("{/anchor \"CENTER\"/insetsBottom \"20\"/fill \"NONE\"}");
      lblProjectSelection.setName("lblProjectSelection");
    }
    return lblProjectSelection;
  }

  /**
   * This method initializes modeGroup
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButtonGroup
   */
  private RButtonGroup getModeGroup() {
    if (modeGroup == null) {
      modeGroup = new RButtonGroup();
    }
    return modeGroup;
  }

  /**
   * This method initializes radioServer
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton
   */
  private RRadioButton getRadioServer() {
    if (radioServer == null) {
      radioServer = new RRadioButton();
      radioServer.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/server\")%>");
      radioServer.setSelected(false);
      radioServer.setFont(new Font("Tahoma", 1, 11));
      radioServer.setGroup(getModeGroup());
      radioServer.setName("radioServer");
    }
    return radioServer;
  }

  /**
   * This method initializes radioLocal
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RRadioButton
   */
  private RRadioButton getRadioLocal() {
    if (radioLocal == null) {
      radioLocal = new RRadioButton();
      radioLocal.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/local\")%>");
      radioLocal.setFont(new Font("Tahoma", 1, 11));
      radioLocal.setSelected(true);
      radioLocal.setGroup(getModeGroup());
      radioLocal.setName("radioLocal");
    }
    return radioLocal;
  }

  /**
   * This method initializes buttonHidden
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getButtonHidden() {
    if (buttonHidden == null) {
      buttonHidden = new RButton();
      buttonHidden.setText("buttonHidden");
      buttonHidden.setVisible(false);
      buttonHidden.setName("buttonHidden");
    }
    return buttonHidden;
  }
} // @jve:decl-index=0:visual-constraint="11,9"
