package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Main;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Deploy.DeployPanel;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewPanel;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.SourceSelection.SourceSelectionPanel;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelection.TargetSelectionPanel;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Validation.ValidationPanel;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RCardPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;

import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.ULCDialog;
import com.ulcjava.base.application.ULCFlowLayoutPane;
import com.ulcjava.base.application.ULCFrame;
import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.ULCRootPane;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.event.IWindowListener;
import com.ulcjava.base.application.event.WindowEvent;
import com.ulcjava.base.application.util.ComponentOrientation;

/**
 * <p>
 * depoyWizardFooterPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class MainPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RButton btnPrevious = null;
  private RButton btnNext = null;
  private RButton btnFinish = null;
  private RButton btnCancel = null;
  private RCardPane CardPane = null;
  private ULCPollingTimer timer; // @jve:decl-index=0:
  private boolean running = false;
  private IActionListener timerListener; // @jve:decl-index=0:
  private RFlowLayoutPane secondFlowLayoutPane = null;
  private @EmbeddedRichDialog(SourceSelectionPanel.class)
  ULCContainer sourceSelectionPanel = null;
  private @EmbeddedRichDialog(TargetSelectionPanel.class)
  ULCContainer targetSelectionPanel = null;
  private @EmbeddedRichDialog(ValidationPanel.class)
  ULCContainer validationPanel = null;
  private @EmbeddedRichDialog(PreviewPanel.class)
  ULCContainer previewPanel = null;
  private @EmbeddedRichDialog(DeployPanel.class)
  ULCContainer deployPanel = null;
  private RButton btnAbort = null;
  private RFlowLayoutPane firstFlowLayoutPane = null;
  private RButton btnCopy = null;
  private RButton btnWriteToFile = null;
  private RButton btnDetails = null;
  private long timeAtPreviousClick = -1;
  private RButton hidden_Button = null; // @jve:decl-index=0:visual-constraint="830,136"

  // SONAR-OFF

  /**
   * Create a new instance of depoyWizardFooterPanel
   */
  public MainPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  public void setRunning(boolean running) {
    this.running = running;
  }

  /**
   * This method initializes depoyWizardFooterPanel
   * 
   * @return void
   */
  private void initialize() {
    // this.setStyleProperties("{/minimumSizeWidth \"850\"/minimumSizeHeight \"320\"}");
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(800, 600));
    this.setMinimumSize(new com.ulcjava.base.application.util.Dimension(800, 600));
    this.add(getCardPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 2, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(10, 10, 0, 10), 0, 0));
    this.add(getFirstFlowLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 5, 0, 0), 0, 0));
    this.add(getSecondFlowLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 5), 0, 0));
    createUlcPollingTimerForPreviousButton();
  }

  /**
   * Creates a ulc polling timer
   */
  private void createUlcPollingTimerForPreviousButton() {
    timer = new ULCPollingTimer(50, null);
    timer.setRepeats(true);
    timerListener = new IActionListener() {

      /**
			 * 
			 */
      private static final long serialVersionUID = -4370382652507823364L;

      public void actionPerformed(ActionEvent event) {
        try {
          if (!running) {
            stopPollingTimer();
            getPanelAPI().callMethod("startMainTimerForPreviousButton", new Object[0]);
          }
        } catch (Exception ex) {
          Ivy.log().error("Cannot call timer method", ex);
        }
      }
    };
  }

  private void createUlcPollingTimerForNextButton() {
    timer = new ULCPollingTimer(300, null);
    timer.setRepeats(false);
    timerListener = new IActionListener() {

      /**
			 * 
			 */
      private static final long serialVersionUID = -4370382652507823364L;

      public void actionPerformed(ActionEvent event) {
        try {
          if (running) {
            getPanelAPI().callMethod("startMainTimerForNextButton", new Object[0]);
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
  public void startPollingTimer(boolean isNextButtonClick) {
    running = true;
    if (isNextButtonClick) {
      createUlcPollingTimerForNextButton();
    } else {
      createUlcPollingTimerForPreviousButton();
    }
    timer.addActionListener(timerListener);
    timer.start();
  }

  /**
   * This method initializes btnPrevious
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnPrevious() {
    if (btnPrevious == null) {
      btnPrevious = new RButton();
      btnPrevious.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/previous\")%>");
      btnPrevious
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"90\"/preferredSizeHeight \"27\"}");
      btnPrevious.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/back\")%>");
      btnPrevious.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnPrevious.setName("btnPrevious");
    }
    return btnPrevious;
  }

  /**
   * This method initializes btnNext
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnNext() {
    if (btnNext == null) {
      btnNext = new RButton();
      btnNext
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnNext.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/next\")%>");
      btnNext.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnNext.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/next\")%>");
      btnNext.setName("btnNext");
    }
    return btnNext;
  }

  /**
   * This method initializes btnFinish
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnFinish() {
    if (btnFinish == null) {
      btnFinish = new RButton();
      btnFinish.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/finish\")%>");
      btnFinish
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnFinish.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/finish\")%>");
      btnFinish.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnFinish.setName("btnFinish");
    }
    return btnFinish;
  }

  /**
   * This method initializes btnCancel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnCancel() {
    if (btnCancel == null) {
      btnCancel = new RButton();
      btnCancel
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnCancel.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/cancel\")%>");
      btnCancel.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnCancel.setText("<%=ivy.cms.co(\"/Dialogs/general/cancel\")%>");
      btnCancel.setName("btnCancel");
    }
    return btnCancel;
  }

  /**
   * This method initializes CardPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RCardPane
   */
  private RCardPane getCardPane() {
    if (CardPane == null) {
      CardPane = new RCardPane();
      CardPane.setName("CardPane");
      CardPane.setStyleProperties("{/anchor \"CENTER\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      CardPane.addCard("validationPanel", getValidationPanel());
      CardPane.addCard("sourceSelectionPanel", getSourceSelectionPanel());
      CardPane.addCard("targetSelectionPanel", getTargetSelectionPanel());
      CardPane.addCard("previewPanel", getPreviewPanel());
      CardPane.addCard("deployPanel", getDeployPanel());
    }
    return CardPane;
  }

  /**
   * This method initializes secondFlowLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getSecondFlowLayoutPane() {
    if (secondFlowLayoutPane == null) {
      secondFlowLayoutPane = new RFlowLayoutPane();
      secondFlowLayoutPane.setName("secondFlowLayoutPane");
      secondFlowLayoutPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
      secondFlowLayoutPane.setAlignment(ULCFlowLayoutPane.RIGHT);
      secondFlowLayoutPane.add(getBtnPrevious());
      secondFlowLayoutPane.add(getBtnNext());
      secondFlowLayoutPane.add(getBtnCancel());
      secondFlowLayoutPane.add(getBtnAbort());
      secondFlowLayoutPane.add(getBtnFinish());
    }
    return secondFlowLayoutPane;
  }

  /**
   * This method initializes sourceSelectionPanel, an embedded RichDialog. The created object might have a different
   * type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getSourceSelectionPanel() {
    if (sourceSelectionPanel == null) {
      sourceSelectionPanel = RichDialogPanelFactory.create(SourceSelectionPanel.class);
      sourceSelectionPanel.setName("sourceSelectionPanel");
    }
    return sourceSelectionPanel;
  }

  /**
   * This method initializes targetSelectionPanel, an embedded RichDialog. The created object might have a different
   * type than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getTargetSelectionPanel() {
    if (targetSelectionPanel == null) {
      targetSelectionPanel = RichDialogPanelFactory.create(TargetSelectionPanel.class);
      targetSelectionPanel.setName("targetSelectionPanel");
    }
    return targetSelectionPanel;
  }

  /**
   * This method initializes validationPanel, an embedded RichDialog. The created object might have a different type
   * than the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getValidationPanel() {
    if (validationPanel == null) {
      validationPanel = RichDialogPanelFactory.create(ValidationPanel.class);
      validationPanel.setName("validationPanel");
    }
    return validationPanel;
  }

  /**
   * set title for frame
   * 
   * @param title
   */
  public void setTitle(String title) {
    ULCRootPane rootPane = this.getRootPane();
    rootPane.setName("rootPane");

    if (rootPane instanceof ULCFrame) {
      ULCFrame rootFrame = (ULCFrame) rootPane;
      rootFrame.setTitle(title);
      rootFrame.setName("rootFrame");
    } else if (rootPane instanceof ULCDialog) {
      ULCDialog rootDialog = (ULCDialog) rootPane;
      rootDialog.setTitle(title);
      rootDialog.setName("rootDialog");
    }
  }

  public void setupCloseHandler() {
    ULCRootPane root = this.getRootPane();
    root.setName("root");
    if (root instanceof ULCDialog) {
      final ULCDialog oneFrame = (ULCDialog) root;

      oneFrame.setDefaultCloseOperation(ULCFrame.DO_NOTHING_ON_CLOSE);

      oneFrame.setName("oneFrame");
      IWindowListener[] listeners = oneFrame.getWindowListeners();
      for (IWindowListener existingListener : listeners) {
        oneFrame.removeWindowListener(existingListener);
      }

      oneFrame.addWindowListener(new IWindowListener() {
        private static final long serialVersionUID = 1L;

        public void windowClosing(WindowEvent event) {
          // Display confirmation dialog.
          hidden_Button.doClick();
        }
      });
    }
  }

  /**
   * This method initializes previewPanel, an embedded RichDialog. The created object might have a different type than
   * the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getPreviewPanel() {
    if (previewPanel == null) {
      previewPanel = RichDialogPanelFactory.create(PreviewPanel.class);
      previewPanel.setName("previewPanel");
    }
    return previewPanel;
  }

  /**
   * This method initializes deployPanel, an embedded RichDialog. The created object might have a different type than
   * the declared class due to overriding.
   * 
   * @returns com.ulcjava.base.application.ULCContainer
   */
  private ULCContainer getDeployPanel() {
    if (deployPanel == null) {
      deployPanel = RichDialogPanelFactory.create(DeployPanel.class);
      deployPanel.setName("deployPanel");
    }
    return deployPanel;
  }

  /*
   * This method sets text of Cancel button to Cancel
   */
  public void setButtonTextToCancel() {
    btnCancel.setText("<%=ivy.cms.co(\"/Dialogs/general/cancel\")%>");
  }

  /*
   * This method sets text of Cancel button to Abort
   */
  public void setButtonTextToAbort() {
    btnCancel.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/abort\")%>");
  }

  public boolean clickAbortButton() {
    return btnCancel.getText().equals(
        Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/abort"));
  }

  /**
   * This method initializes btnAbort
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnAbort() {
    if (btnAbort == null) {
      btnAbort = new RButton();
      btnAbort.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/abort\")%>");
      btnAbort
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnAbort.setVisible(true);
      btnAbort.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/cancel\")%>");
      btnAbort.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnAbort.setName("btnAbort");
    }
    return btnAbort;
  }

  /**
   * This method initializes firstFlowLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getFirstFlowLayoutPane() {
    if (firstFlowLayoutPane == null) {
      firstFlowLayoutPane = new RFlowLayoutPane();
      firstFlowLayoutPane.setName("firstFlowLayoutPane");
      firstFlowLayoutPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
      firstFlowLayoutPane.setAlignment(ULCFlowLayoutPane.LEFT);
      firstFlowLayoutPane.setVisible(false);
      firstFlowLayoutPane.add(getBtnDetails());
      firstFlowLayoutPane.add(getBtnCopy());
      firstFlowLayoutPane.add(getBtnWriteToFile());
    }
    return firstFlowLayoutPane;
  }

  /**
   * This method initializes btnCopy
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnCopy() {
    if (btnCopy == null) {
      btnCopy = new RButton();
      btnCopy.setName("btnCopy");
      btnCopy.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/copy\")%>");
      btnCopy
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnCopy.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnCopy.setText("<%=ivy.cms.co(\"/Dialogs/general/copy\")%>");
    }
    return btnCopy;
  }

  /**
   * This method initializes btnWriteToFile
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnWriteToFile() {
    if (btnWriteToFile == null) {
      btnWriteToFile = new RButton();
      btnWriteToFile.setName("btnWriteToFile");
      btnWriteToFile.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/upperRight\")%>");
      btnWriteToFile
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"100\"/preferredSizeHeight \"27\"}");
      btnWriteToFile.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnWriteToFile
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/writeToFile\")%>");
    }
    return btnWriteToFile;
  }

  /**
   * This method initializes btnDetails
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnDetails() {
    if (btnDetails == null) {
      btnDetails = new RButton();
      btnDetails.setName("btnDetails");
      btnDetails.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/showDetail\")%>");
      btnDetails
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/insetsBottom \"5\"/insetsTop \"5\"/preferredSizeWidth \"27\"/preferredSizeHeight \"27\"}");
      btnDetails.setText("");
      btnDetails.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnDetails
          .setToolTipText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/showDetailTooltip\")%>");
    }
    return btnDetails;
  }

  /**
   * This method initializes hidden_Button
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getHidden_Button() {
    if (hidden_Button == null) {
      hidden_Button = new RButton();
      hidden_Button.setText("hidden_Button");
      hidden_Button.setVisible(false);
      hidden_Button.setName("hidden_Button");
    }
    return hidden_Button;
  }

} // @jve:decl-index=0:visual-constraint="10,10"
