package ch.ivyteam.ivy.admin.tool.MainWindow;

import ch.ivyteam.ivy.admin.tool.ApplicationList.ApplicationListPanel;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBorderLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RTaskPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RTaskPaneContainer;
import ch.ivyteam.ivy.richdialog.widgets.displays.RCloseableTabbedDisplay;

import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.ULCFrame;
import com.ulcjava.base.application.ULCPollingTimer;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.Dimension;

/**
 * RichDialog panel implementation for MainWindowPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class MainWindowPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RCloseableTabbedDisplay contentDisplay = null;
  private RTaskPaneContainer menuContainer = null;
  private RTaskPane serverTaskPane = null;
  private RSplitPane splitPane = null;
  private RButton aboutButton = null;
  private RButton infoButton = null;
  private RTaskPane applicationPane = null;
  @EmbeddedRichDialog(ApplicationListPanel.class)
  private ULCContainer applicationList = null;
  private RButton systemPropertiesButton = null;
  private RHyperlink logoutHyperlink = null;
  private RBorderLayoutPane displayBorderLayoutPane = null;
  private RGridBagLayoutPane topGridBagLayoutPane = null;
  private RLabel infoLabel = null;

  private ULCPollingTimer timer; // @jve:decl-index=0:
  private int originalWindowHeight;
  private int originalAppListHeight;
  private int previousWindowHeight;
  public static final int SERVER_TASK_PANE_HEIGHT = 122; // cannot get the
  // height of
  // [serverTaskPane]
  // dynamically

  private ULCPollingTimer userSynchTimer; // @jve:decl-index=0:
  private IActionListener userSynchTimerListener; // @jve:decl-index=0:

  // SONAR-OFF
  /**
   * Create a new instance of MainWindowPanel
   */
  public MainWindowPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes MainWindowPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(393, 363));
    this.add(getSplitPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes contentDisplay
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.displays.RTabbedDisplay
   */
  private RCloseableTabbedDisplay getContentDisplay() {
    if (contentDisplay == null) {
      contentDisplay = new RCloseableTabbedDisplay();
      contentDisplay.setName("contentDisplay");
      contentDisplay.setDisplayId("content");
    }
    return contentDisplay;
  }

  /**
   * This method initializes menuContainer
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RTaskPaneContainer
   */
  private RTaskPaneContainer getMenuContainer() {
    if (menuContainer == null) {
      menuContainer = new RTaskPaneContainer();
      menuContainer.setName("menuContainer");
      menuContainer.setSingleTaskPaneOpen(false);
      menuContainer.setStyleProperties("{/insetsTop \"4\"/fill \"VERTICAL\"/weightY \"1\"}");
      menuContainer.add(getApplicationPane());
      menuContainer.add(getServerTaskPane());
    }
    return menuContainer;
  }

  /**
   * This method initializes serverTaskPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RTaskPane
   */
  private RTaskPane getServerTaskPane() {
    if (serverTaskPane == null) {
      serverTaskPane = new RTaskPane();
      serverTaskPane.setName("serverTaskPane");
      serverTaskPane.setTitle("Engine");
      serverTaskPane.setIconUri("<%=ivy.cms.cr(\"/images/klein/server\")%>");
      serverTaskPane.setCollapsed(true);
      serverTaskPane.add(getAboutButton());
      serverTaskPane.add(getInfoButton());
      serverTaskPane.add(getSystemPropertiesButton());
    }
    return serverTaskPane;
  }

  /**
   * This method initializes splitPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane
   */
  private RSplitPane getSplitPane() {
    if (splitPane == null) {
      splitPane = new RSplitPane();
      splitPane.setName("splitPane");
      splitPane.setStyleProperties("{/dividerLocation \"0.25\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      splitPane.setRightComponent(getDisplayBorderLayoutPane());
      splitPane.setLeftComponent(getMenuContainer());
    }
    return splitPane;
  }

  /**
   * This method initializes aboutButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getAboutButton() {
    if (aboutButton == null) {
      aboutButton = new RButton();
      aboutButton.setText("About");
      aboutButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/ivy\")%>");
      aboutButton.setName("aboutButton");
    }
    return aboutButton;
  }

  /**
   * This method initializes infoButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getInfoButton() {
    if (infoButton == null) {
      infoButton = new RButton();
      infoButton.setText("Runtime Information");
      infoButton.setIconUri("<%=ivy.cms.cr(\"/Icons/ServerInfo/16\")%>");
      infoButton.setName("infoButton");
    }
    return infoButton;
  }

  /**
   * This method initializes ApplicationPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RTaskPane
   */
  private RTaskPane getApplicationPane() {
    if (applicationPane == null) {
      applicationPane = new RTaskPane();
      applicationPane.setName("applicationPane");
      applicationPane.setTitle("Applications");
      applicationPane.setIconUri("<%=ivy.cms.cr(\"/images/klein/applications\")%>");
      applicationPane.setCollapsed(false);
      applicationPane.setStyleProperties("{/fill \"VERTICAL\"/weightY \"0.9\"}");
      applicationPane.add(getApplicationList());
    }
    return applicationPane;
  }

  /**
   * This method initializes applicationList
   * 
   * @return ch.ivyteam.ivy.admin.tool.ApplicationList.ApplicationListPanel
   */
  private ULCContainer getApplicationList() {
    if (applicationList == null) {
      applicationList = RichDialogPanelFactory.create(ApplicationListPanel.class);
      applicationList.setName("applicationList");
      applicationList.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 605));
    }
    return applicationList;
  }

  /**
   * This method initializes systemPropertiesButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getSystemPropertiesButton() {
    if (systemPropertiesButton == null) {
      systemPropertiesButton = new RButton();
      systemPropertiesButton.setText("System Properties");
      systemPropertiesButton.setIconUri("<%=ivy.cms.cr(\"/images/klein/systemProperty\")%>");
      systemPropertiesButton.setName("systemPropertiesButton");
    }
    return systemPropertiesButton;
  }

  /**
   * This method initializes logoutHyperlink
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RHyperlink
   */
  private RHyperlink getLogoutHyperlink() {
    if (logoutHyperlink == null) {
      logoutHyperlink = new RHyperlink();
      logoutHyperlink.setName("logoutHyperlink");
      logoutHyperlink
          .setStyleProperties("{/font {/name \"Dialog\"/size \"11\"/style \"BOLD\"}/anchor \"EAST\"/insetsRight \"16\"}");
      logoutHyperlink.setToolTipText("Logout session and close Axon.ivy Server AdminUI");
      logoutHyperlink.setText("<%=ivy.cms.co(\"/labels/logout\")%>");
    }
    return logoutHyperlink;
  }

  /**
   * This method initializes displayBorderLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBorderLayoutPane
   */
  private RBorderLayoutPane getDisplayBorderLayoutPane() {
    if (displayBorderLayoutPane == null) {
      displayBorderLayoutPane = new RBorderLayoutPane();
      displayBorderLayoutPane.setName("displayBorderLayoutPane");
      displayBorderLayoutPane.add(getContentDisplay(), com.ulcjava.base.application.ULCBorderLayoutPane.CENTER);
      displayBorderLayoutPane.add(getTopGridBagLayoutPane(), com.ulcjava.base.application.ULCBorderLayoutPane.NORTH);
    }
    return displayBorderLayoutPane;
  }

  /**
   * This method initializes topGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTopGridBagLayoutPane() {
    if (topGridBagLayoutPane == null) {
      RFiller topFiller = new RFiller();
      topFiller.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"100\"}");
      topGridBagLayoutPane = new RGridBagLayoutPane();
      topGridBagLayoutPane.setName("topGridBagLayoutPane");
      topGridBagLayoutPane.add(getInfoLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      topGridBagLayoutPane.add(topFiller, new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      topGridBagLayoutPane.add(getLogoutHyperlink(), new com.ulcjava.base.application.GridBagConstraints(3, 0, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    }
    return topGridBagLayoutPane;
  }

  /**
   * This method initializes InfoLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getInfoLabel() {
    if (infoLabel == null) {
      infoLabel = new RLabel();
      infoLabel.setText("Welcome");
      infoLabel.setStyleProperties("{/anchor \"CENTER\"/insetsTop \"1\"}");
      infoLabel.setName("infoLabel");
    }
    return infoLabel;
  }

  public void initTimer() {

    int delayTime = 500;
    final ULCFrame frame = (ULCFrame) this.getRootPane();

    timer = new ULCPollingTimer(delayTime, new IActionListener() {

      private static final long serialVersionUID = -4301749178838082123L;

      @Override
      public void actionPerformed(ActionEvent event) {

        int currentWindowHeight = frame.getSize().getHeight();

        if (previousWindowHeight != currentWindowHeight) {

          int newHeight = currentWindowHeight - originalWindowHeight + originalAppListHeight;

          if (!serverTaskPane.isCollapsed()) {
            newHeight -= SERVER_TASK_PANE_HEIGHT;
          }

          int width = 100;

          if (applicationList.getPreferredSize() != null) {
            width = applicationList.getPreferredSize().getWidth();
          }

          Dimension newSize = new Dimension(width, newHeight);
          applicationList.setPreferredSize(newSize);
          previousWindowHeight = currentWindowHeight;
          requestTaskPaneRerender();
        }
      }
    });

    timer.start();
  }

  public void setupGUIRefreshTimer() {
    setOriginalAppListHeight();
    setOriginalWindowHeight();
    initTimer();
  }

  public void tearDownGUIRefreshTimer() {
    if (timer == null) {
      return;
    }
    timer.stop();
  }

  public void adjustApplicationPaneHeight() {

    Dimension currentSize = applicationList.getPreferredSize();

    if (currentSize != null) {
      Dimension expectedSize;
      if (serverTaskPane.isCollapsed()) {
        expectedSize = new Dimension(currentSize.getWidth(), currentSize.getHeight() + SERVER_TASK_PANE_HEIGHT);
      } else {
        expectedSize = new Dimension(currentSize.getWidth(), currentSize.getHeight() - SERVER_TASK_PANE_HEIGHT);
      }

      applicationList.setPreferredSize(expectedSize);
      requestTaskPaneRerender();
    }
  }

  private void requestTaskPaneRerender() {
    if (serverTaskPane.isCollapsed()) {
      serverTaskPane.setCollapsed(false);
      serverTaskPane.setCollapsed(true);
    } else {
      serverTaskPane.setCollapsed(true);
      serverTaskPane.setCollapsed(false);
    }
  }

  private void setOriginalWindowHeight() {
    if (this.getRootPane() instanceof ULCFrame) {
      ULCFrame frame = (ULCFrame) this.getRootPane();
      originalWindowHeight = frame.getSize().getHeight();
    }
  }

  private void setOriginalAppListHeight() {
    if (applicationList.getPreferredSize() != null) {
      originalAppListHeight = applicationList.getPreferredSize().getHeight();
    } else {
      originalAppListHeight = 0;
    }
  }

  /**
   * Creates a ulc polling timer for user synch.
   */
  private void createUlcPollingTimer() {
    userSynchTimer = new ULCPollingTimer(500, null);
    userSynchTimer.setRepeats(false);
    userSynchTimerListener = new IActionListener() {
      private static final long serialVersionUID = -4370382652507823364L;

      public void actionPerformed(ActionEvent event) {
        try {
          getPanelAPI().callMethod("runTimer", new Object[0]);
        } catch (Exception ex) {
          Ivy.log().error("Could not call timer method", ex);
        }
      }
    };
  }

  /**
   * Stops the polling timer for user synch.
   */
  public void stopPollingTimer() {
    userSynchTimer.stop();
    userSynchTimer.removeActionListener(userSynchTimerListener);
  }

  /**
   * Restarts the polling timer for user synch.
   */
  public void restartPollingTimer() {
    userSynchTimer.restart();
  }

  /**
   * Starts the polling timer for user synch.
   */
  public void startPollingTimer() {
    createUlcPollingTimer();
    userSynchTimer.addActionListener(userSynchTimerListener);
    userSynchTimer.start();
  }

} // @jve:decl-index=0:visual-constraint="10,10"
