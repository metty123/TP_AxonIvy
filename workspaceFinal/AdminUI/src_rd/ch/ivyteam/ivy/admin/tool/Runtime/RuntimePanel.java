package ch.ivyteam.ivy.admin.tool.Runtime;

import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RList;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for RuntimePanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class RuntimePanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane titelPane = null;
  private RGridBagLayoutPane memoryPane = null;
  private RGridBagLayoutPane threadPane = null;
  private RLabel javaMaxHeapLabel = null;
  private RLabel javaCurrentHeapLabel = null;
  private RTextField javaMaxHeapTextField = null;
  private RTextField javaCurrentHeapTextField = null;
  private RList threadList = null;
  private RScrollPane threadScrollPane = null;
  private RScrollPane stackTraceScrollPane = null;
  private RTable stackTraceTable = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer headerPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of RuntimePanel
   */
  public RuntimePanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes RuntimePanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getTitelPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(462, 278));
  }

  /**
   * This method initializes titelPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTitelPane() {
    if (titelPane == null) {
      titelPane = new RGridBagLayoutPane();
      titelPane.setName("titelPane");
      titelPane.setName("titelPane");
      titelPane.add(getMemoryPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      titelPane.add(getThreadPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      titelPane.add(getHeaderPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return titelPane;
  }

  /**
   * This method initializes memoryPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getMemoryPane() {
    if (memoryPane == null) {
      memoryPane = new RGridBagLayoutPane();
      memoryPane.setName("memoryPane");
      memoryPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/insetsLeft \"5\"}");
      memoryPane.setBorder(BorderFactory.createTitledBorder("Memory"));
      memoryPane.add(getJavaCurrentHeapLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      memoryPane.add(getJavaMaxHeapTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      memoryPane.add(getJavaCurrentHeapTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      memoryPane.add(getJavaMaxHeapLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return memoryPane;
  }

  /**
   * This method initializes threadPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getThreadPane() {
    if (threadPane == null) {
      threadPane = new RGridBagLayoutPane();
      threadPane.setName("threadPane");
      threadPane.setBorder(BorderFactory.createTitledBorder("Threads"));
      threadPane.setStyleProperties("{/insetsLeft \"5\"}");
      threadPane.add(getThreadScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      threadPane.add(getStackTraceScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return threadPane;
  }

  /**
   * This method initializes javaMaxHeapLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getJavaMaxHeapLabel() {
    if (javaMaxHeapLabel == null) {
      javaMaxHeapLabel = new RLabel();
      javaMaxHeapLabel.setText("Java Max Heap");
      javaMaxHeapLabel.setName("javaMaxHeapLabel");
    }
    return javaMaxHeapLabel;
  }

  /**
   * This method initializes javaCurrentHeapLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getJavaCurrentHeapLabel() {
    if (javaCurrentHeapLabel == null) {
      javaCurrentHeapLabel = new RLabel();
      javaCurrentHeapLabel.setText("Java Current Heap");
      javaCurrentHeapLabel.setName("javaCurrentHeapLabel");
    }
    return javaCurrentHeapLabel;
  }

  /**
   * This method initializes javaMaxHeapTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getJavaMaxHeapTextField() {
    if (javaMaxHeapTextField == null) {
      javaMaxHeapTextField = new RTextField();
      javaMaxHeapTextField.setText("RTextField");
      javaMaxHeapTextField.setEditable(false);
      javaMaxHeapTextField.setName("javaMaxHeapTextField");
    }
    return javaMaxHeapTextField;
  }

  /**
   * This method initializes javaCurrentHeapTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getJavaCurrentHeapTextField() {
    if (javaCurrentHeapTextField == null) {
      javaCurrentHeapTextField = new RTextField();
      javaCurrentHeapTextField.setText("RTextField");
      javaCurrentHeapTextField.setEditable(false);
      javaCurrentHeapTextField.setName("javaCurrentHeapTextField");
    }
    return javaCurrentHeapTextField;
  }

  /**
   * This method initializes threadList
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RList
   */
  private RList getThreadList() {
    if (threadList == null) {
      threadList = new RList();
      threadList.setName("threadList");
      threadList.setModelConfiguration("{/result \"result=entry.name\"/version \"2.0\"/icon \"\"/tooltip \"\"}");
      threadList.setStyleProperties("{/insetsRight \"0\"/insetsLeft \"0\"}");
    }
    return threadList;
  }

  /**
   * This method initializes threadScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getThreadScrollPane() {
    if (threadScrollPane == null) {
      threadScrollPane = new RScrollPane();
      threadScrollPane.setName("threadScrollPane");
      threadScrollPane.setStyleProperties("{/insetsRight \"5\"/insetsLeft \"5\"}");
      threadScrollPane.setViewPortView(getThreadList());
    }
    return threadScrollPane;
  }

  /**
   * This method initializes stackTraceScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getStackTraceScrollPane() {
    if (stackTraceScrollPane == null) {
      stackTraceScrollPane = new RScrollPane();
      stackTraceScrollPane.setName("stackTraceScrollPane");
      stackTraceScrollPane.setName("stackTraceScrollPane");
      stackTraceScrollPane.setViewPortView(getStackTraceTable());
    }
    return stackTraceScrollPane;
  }

  /**
   * This method initializes stackTraceTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getStackTraceTable() {
    if (stackTraceTable == null) {
      stackTraceTable = new RTable();
      stackTraceTable.setName("stackTraceTable");
      stackTraceTable.setSortable(true);
      stackTraceTable
          .setModelConfiguration("{/showTableheader true /autoTableheader true /showtooltip false /showIcons false /version \"3.0\"/columns * }");
    }
    return stackTraceTable;
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
      headerPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
    }
    return headerPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
