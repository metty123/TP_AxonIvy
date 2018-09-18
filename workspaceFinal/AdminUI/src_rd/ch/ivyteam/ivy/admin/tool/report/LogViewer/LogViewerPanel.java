package ch.ivyteam.ivy.admin.tool.report.LogViewer;

import java.util.List;

import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCDialog;
import com.ulcjava.base.application.ULCRootPane;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;

/**
 * <p>
 * Mockup2Panel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class LogViewerPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTable logTable = null;
  private RLabel successLab = null;
  private RLabel warningLab = null;
  private RLabel errorLab = null;
  private RButton ok_Button = null;
  private RGridBagLayoutPane popUpPane = null; // @jve:decl-index=0:visual-constraint="724,11"
  private RLabel Label = null;
  private RLabel typeLab = null;
  private RLabel Environment = null;
  private RLabel Label1 = null;
  private RLabel Label2 = null;
  private RLabel Label3 = null;
  private RTextArea messagePane = null;
  private RScrollPane ScrollPane1 = null;
  private RButton pop_OkBtn = null;
  private RLabel envLab = null;
  private RLabel confLab = null;
  private RLabel nameLab = null;
  private ULCDialog detail;
  private RScrollPane ScrollPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of Mockup2Panel
   */
  public LogViewerPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes Mockup2Panel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(700, 400));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 4, 1, 4.0, 1.0,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSuccessLab(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 5, 0, 0), 0, 0));
    this.add(getWarningLab(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 5, 0, 0), 0, 0));
    this.add(getErrorLab(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 5, 0, 0), 0, 0));
    this.add(getOk_Button(), new com.ulcjava.base.application.GridBagConstraints(3, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
  }

  private void addNumToLabel(RLabel lab, int num) {
    String old = lab.getText().substring(0, lab.getText().indexOf(":") + 1);
    lab.setText(old + " " + num);
  }

  public void countNumOfStatusToLog(List<ReportEntry> list) {
    int err = 0, warn = 0, succ = 0;

    for (ReportEntry e : list) {
      if (e.getReportStatus() == ReportStatus.ERROR) {
        err++;
      } else if (e.getReportStatus() == ReportStatus.WARNING) {
        warn++;
      } else {
        succ++;
      }
    }
    addNumToLabel(successLab, succ);
    addNumToLabel(warningLab, warn);
    addNumToLabel(errorLab, err);

  }

  /**
   * This method initializes logTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getLogTable() {
    if (logTable == null) {
      logTable = new RTable();
      logTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      logTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/emptyTableText \"\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"result=IF(entry.reportstatus.name() == \\\"ERROR\\\", ivy.cms.cr(\\\"/images/klein/error\\\"), \\r\\nIF(entry.reportstatus.name() == \\\"WARNING\\\", ivy.cms.cr(\\\"/images/klein/warning\\\"), ivy.cms.cr(\\\"/images/klein/ok\\\")))\"/header \"ivy.cms.co(\\\"/Dialogs/environment/log/type\\\")\"/headerAlignment \"default\"/field \"reportstatus\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/environment/log/environmentName\\\")\"/headerAlignment \"default\"/field \"environmentname\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/environment/log/configurationType\\\")\"/headerAlignment \"default\"/field \"configtype\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/environment/log/name\\\")\"/headerAlignment \"default\"/field \"configName\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerPanel.printMessage(entry)\"/version \"3.0\"/tooltip \"result=value\"/icon \"\"/header \"ivy.cms.co(\\\"/Dialogs/environment/log/message\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"/columnWidth \"300\"/columnStyle \"default\"/cellWidget \"\"}}}");
      logTable.setName("logTable");
      logTable.setName("logTable");
      logTable.setRowHeight(18);
      logTable.setSortable(true);
    }
    return logTable;
  }

  /**
   * This method initializes successLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getSuccessLab() {
    if (successLab == null) {
      successLab = new RLabel();
      successLab.setIconUri("<%=ivy.cms.cr(\"/images/klein/ok\")%>");
      successLab.setText("<%=ivy.cms.co(\"/Dialogs/general/success\")%>: 0");
      successLab.setName("successLab");
    }
    return successLab;
  }

  /**
   * This method initializes warningLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getWarningLab() {
    if (warningLab == null) {
      warningLab = new RLabel();
      warningLab.setIconUri("<%=ivy.cms.cr(\"/images/klein/warning\")%>");
      warningLab.setText("<%=ivy.cms.co(\"/Dialogs/general/warning\")%>: 0");
      warningLab.setName("warningLab");
    }
    return warningLab;
  }

  /**
   * This method initializes errorLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getErrorLab() {
    if (errorLab == null) {
      errorLab = new RLabel();
      errorLab.setIconUri("<%=ivy.cms.cr(\"/images/klein/error\")%>");
      errorLab.setText("<%=ivy.cms.co(\"/Dialogs/general/error\")%>: 0");
      errorLab.setName("errorLab");
    }
    return errorLab;
  }

  /**
   * This method initializes ok_Button
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOk_Button() {
    if (ok_Button == null) {
      ok_Button = new RButton();
      ok_Button.setText("OK");
      ok_Button.setMinimumSize(new com.ulcjava.base.application.util.Dimension(55, 26));
      ok_Button.setPreferredSize(new com.ulcjava.base.application.util.Dimension(55, 26));
      ok_Button.setName("ok_Button");
    }
    return ok_Button;
  }

  public void showPopup() {
    int w = 500, h = 300;
    ULCRootPane rootPane = getRootPane();

    String dialogTitle = Ivy.cms().co("/Dialogs/environment/log/detail");
    detail = new ULCDialog(rootPane, dialogTitle, true);
    detail.setContentPane(getPopUpPane());
    ReportEntry en = (ReportEntry) logTable.getSelectedListEntry();
    typeLab.setText(en.getReportStatus().toString());
    envLab.setText(en.getEnvironmentName());
    confLab.setText(en.getConfigType().toString());
    nameLab.setText(en.getConfigName());
    messagePane.setText(printMessage(en));

    detail.setBounds(rootPane.getX() + (rootPane.getWidth() - w) / 2, rootPane.getY() + (rootPane.getHeight() - h) / 2,
        w, h);
    detail.setVisible(true);

    detail.setName("detail");
  }

  public void hidePopup() {
    detail.setVisible(false);
  }

  private ULCDialog getDetail() {
    return detail;
  }

  /**
   * This method initializes popUpPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getPopUpPane() {
    if (popUpPane == null) {
      popUpPane = new RGridBagLayoutPane();
      popUpPane.setName("popUpPane");
      popUpPane.setPreferredSize(new com.ulcjava.base.application.util.Dimension(400, 250));
      popUpPane.add(getLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(10, 5, 5, 5), 0, 0));
      popUpPane.add(getTypeLab(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(10, 5, 5, 5), 0, 0));
      popUpPane.add(getEnvironment(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getLabel1(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getLabel2(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getLabel3(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getScrollPane1(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, 1.0, 1.0,
          com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
          com.ulcjava.base.application.GridBagConstraints.BOTH,
          new com.ulcjava.base.application.util.Insets(5, 5, 0, 5), 0, 0));
      popUpPane.add(getPop_OkBtn(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 1, 1, 1.0, 0.0,
          com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getEnvLab(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getConfLab(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
      popUpPane.add(getNameLab(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(5, 5, 5, 5), 0, 0));
    }
    return popUpPane;
  }

  /**
   * This method initializes Label
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLabel() {
    if (Label == null) {
      Label = new RLabel();
      Label.setText("<%=ivy.cms.co(\"/Dialogs/environment/log/type\")%>: ");
      Label.setName("Label");
    }
    return Label;
  }

  /**
   * This method initializes typeLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTypeLab() {
    if (typeLab == null) {
      typeLab = new RLabel();
      typeLab.setName("typeLab");
    }
    return typeLab;
  }

  /**
   * This method initializes Environment
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getEnvironment() {
    if (Environment == null) {
      Environment = new RLabel();
      Environment.setName("Environment");
      Environment.setText("<%=ivy.cms.co(\"/Dialogs/environment/log/environmentName\")%>: ");
    }
    return Environment;
  }

  /**
   * This method initializes Label1
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLabel1() {
    if (Label1 == null) {
      Label1 = new RLabel();
      Label1.setName("Label1");
      Label1.setText("<%=ivy.cms.co(\"/Dialogs/environment/log/configurationType\")%>: ");
    }
    return Label1;
  }

  /**
   * This method initializes Label2
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLabel2() {
    if (Label2 == null) {
      Label2 = new RLabel();
      Label2.setName("Label2");
      Label2.setText("<%=ivy.cms.co(\"/Dialogs/environment/log/name\")%>: ");
    }
    return Label2;
  }

  /**
   * This method initializes Label3
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLabel3() {
    if (Label3 == null) {
      Label3 = new RLabel();
      Label3.setName("Label3");
      Label3.setText("<%=ivy.cms.co(\"/Dialogs/environment/log/message\")%>: ");
    }
    return Label3;
  }

  /**
   * This method initializes messagePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getMessagePane() {
    if (messagePane == null) {
      messagePane = new RTextArea("");
      messagePane.setLineWrap(true);
      messagePane.setEditable(false);
      messagePane.setName("messagePane");
    }
    return messagePane;
  }

  /**
   * This method initializes ScrollPane1
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane1() {
    if (ScrollPane1 == null) {
      ScrollPane1 = new RScrollPane();
      ScrollPane1.setName("ScrollPane1");
      ScrollPane1.setName("ScrollPane1");
      ScrollPane1.setName("ScrollPane1");
      ScrollPane1.setViewPortView(getMessagePane());
    }
    return ScrollPane1;
  }

  /**
   * This method initializes pop_OkBtn
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getPop_OkBtn() {
    if (pop_OkBtn == null) {
      pop_OkBtn = new RButton();
      pop_OkBtn.setText("OK");
      pop_OkBtn.setMinimumSize(new com.ulcjava.base.application.util.Dimension(55, 26));
      pop_OkBtn.setPreferredSize(new com.ulcjava.base.application.util.Dimension(55, 26));
      pop_OkBtn.setName("pop_OkBtn");
      pop_OkBtn.addActionListener(new IActionListener() {

        @Override
        public void actionPerformed(ActionEvent event) {
          detail.setVisible(false);
        }
      });
    }
    return pop_OkBtn;
  }

  /**
   * This method initializes envLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getEnvLab() {
    if (envLab == null) {
      envLab = new RLabel();
      envLab.setText("");
      envLab.setName("envLab");
    }
    return envLab;
  }

  /**
   * This method initializes confLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getConfLab() {
    if (confLab == null) {
      confLab = new RLabel();
      confLab.setText("");
      confLab.setName("confLab");
    }
    return confLab;
  }

  /**
   * This method initializes nameLab
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getNameLab() {
    if (nameLab == null) {
      nameLab = new RLabel();
      nameLab.setText("");
      nameLab.setName("nameLab");
    }
    return nameLab;
  }

  public static String printMessage(ReportEntry entry) {
    String acc = "";
    for (String s : entry.getMessages()) {
      acc += s + ", \n";
    }
    int i = acc.lastIndexOf(",") == -1 ? 0 : acc.lastIndexOf(",");
    return acc.substring(0, i);
  }

  /**
   * This method initializes ScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPane() {
    if (ScrollPane == null) {
      ScrollPane = new RScrollPane();
      ScrollPane.setName("ScrollPane");
      ScrollPane.setViewPortView(getLogTable());
    }
    return ScrollPane;
  }

} // @jve:decl-index=0:visual-constraint="22,-4"
