package ch.ivyteam.ivy.rd.common.ServerFileBrowser;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for FileBrowserPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ServerFileBrowserPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane scroller = null;
  private RButton buttonOk = null;
  private RButton buttonCancel = null;
  private RBoxPane buttonPane = null;
  private RButton buttonCreateDir = null;
  private RLabel fillLabel = null;
  private RTree fileTree = null;

  /**
   * Create a new instance of FileBrowserPanel
   */
  public ServerFileBrowserPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes FileBrowserPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(503, 430));
    this.setStyleProperties("{/insetsRight \"5\"}");
    this.add(getScroller(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes scroller
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScroller() {
    if (scroller == null) {
      scroller = new RScrollPane();
      scroller.setName("scroller");
      scroller
          .setStyleProperties("{/insetsBottom \"5\"/insetsTop \"0\"/fill \"BOTH\"/insetsRight \"5\"/insetsLeft \"5\"/weightY \"1\"/weightX \"1\"}");
      scroller.setBackground(new Color(244, 247, 255));
      scroller.setBorder(null);
      scroller.setViewPortView(getFileTree());
    }
    return scroller;
  }

  /**
   * This method initializes buttonOk
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getButtonOk() {
    if (buttonOk == null) {
      buttonOk = new RButton();
      buttonOk.setText("Ok");
      buttonOk.setDefaultCapable(true);
      buttonOk.setStyleProperties("{/anchor \"EAST\"}");
      buttonOk.setName("buttonOk");
    }
    return buttonOk;
  }

  /**
   * This method initializes buttonCancel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getButtonCancel() {
    if (buttonCancel == null) {
      buttonCancel = new RButton();
      buttonCancel.setText("Cancel");
      buttonCancel.setName("buttonCancel");
      buttonCancel.setStyleProperties("{/horizontalAlignment \"RIGHT\"/anchor \"EAST\"}");
      buttonCancel.setName("buttonCancel");
    }
    return buttonCancel;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxPane
   */
  private RBoxPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RBoxPane();
      buttonPane.setName("buttonPane");
      buttonPane.setStyleProperties("{/anchor \"EAST\"/fill \"HORIZONTAL\"/weightX \"1\"}");
      buttonPane.set(3, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getButtonOk());
      buttonPane.set(4, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getButtonCancel());
      buttonPane.set(2, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getFillLabel());
      buttonPane.set(0, 0, 1, 1, com.ulcjava.base.shared.IDefaults.BOX_LEFT_CENTER, getButtonCreateDir());
    }
    return buttonPane;
  }

  /**
   * This method initializes buttonCreateDir
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getButtonCreateDir() {
    if (buttonCreateDir == null) {
      buttonCreateDir = new RButton();
      buttonCreateDir.setText("Create new");
      buttonCreateDir.setStyleProperties("{/anchor \"WEST\"}");
      buttonCreateDir.setName("buttonCreateDir");
    }
    return buttonCreateDir;
  }

  /**
   * This method initializes fillLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getFillLabel() {
    if (fillLabel == null) {
      fillLabel = new RLabel();
      fillLabel.setName("fillLabel");
      fillLabel.setStyleProperties("{/fill \"BOTH\"/weightX \"1\"}");
    }
    return fillLabel;
  }

  /**
   * This method initializes fileTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree
   */
  private RTree getFileTree() {
    if (fileTree == null) {
      fileTree = new RTree();
      fileTree.setName("fileTree");
      fileTree
          .setModelConfiguration("{/showTableheader \"true\"/autoTableheader \"false\"/showtooltip \"false\"/showIcons \"true\"/version \"3.0\"/dynamicTreeLoadMode \"LOAD_ON_EXPAND\"/columns {{/patterns {{/result \"result=value instanceof String ? value : ((value as java.io.File).getName().length() == 0 ? (value as java.io.File).getPath() : (value as java.io.File).getName())\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/field \"\"/patternMode \"ALL\"/patternValue \"default\"}}/version \"3.0\"}}}");
    }
    return fileTree;
  }
} // @jve:decl-index=0:visual-constraint="13,80"
