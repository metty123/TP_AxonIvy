package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail;

import static ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions.DEFAULT_QUALIFIED_VERSION;

import java.util.ArrayList;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectDetailInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.GlobalVariable;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.LibraryUtil;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.IProcessModel;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.application.ReleaseState;
import ch.ivyteam.ivy.application.value.QualifiedVersion;
import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RBooleanCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RComboBoxCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RHyperlinkCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.server.ServerFactory;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.DefaultComboBoxModel;
import com.ulcjava.base.application.IComboBoxModel;
import com.ulcjava.base.application.IEditorComponent;
import com.ulcjava.base.application.IRendererComponent;
import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.table.ITableCellEditor;
import com.ulcjava.base.application.table.ITableCellRenderer;
import com.ulcjava.base.application.table.ULCTableColumn;
import com.ulcjava.base.application.util.Color;

/**
 * <p>
 * TargetSelectionDetailPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class TargetSelectionDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblTargetDetail = null;
  private RScrollPane ScrollPane = null;
  private RButton btnOk = null;
  private RButton btnCancel = null;
  private RTable tblDetail = null;
  private PMCellWidget cbCellWidgetPM = null;
  private PMVCellWidget cbCellWidgetPMV = null; // @jve:decl-index=0:
  private RHyperlinkCellWidget hyperlinkCellWidget = null; // @jve:decl-index=0:visual-constraint="137,420"
  private RBooleanCellWidget ckCellWidgetRelease = null; // @jve:decl-index=0:visual-constraint="557,427"
  public static final String DEFAULT_ITEM = "<NEW>"; // @jve:decl-index=0:
  private RBooleanCellWidget ckCellWidgetActivity = null; // @jve:decl-index=0:visual-constraint="176,417"

  public static final int APP_COLUMN_IDX = 0;
  public static final int PM_COLUMN_IDX = 2;
  public static final int PMV_COLUMN_IDX = 3;
  public static final int LIB_VER_COLUMN_IDX = 7;
  public static final int LIB_ID_COLUMN_IDX = 8;

  // SONAR-OFF
  /**
   * Create a new instance of TargetSelectionDetailPanel
   */
  public TargetSelectionDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes TargetSelectionDetailPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(786, 341));
    this.add(getLblTargetDetail(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1.0D, 0.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5, 5, 5, 0),
        0, 0));
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 3, 1, -1, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0, 5, 0, 5),
        0, 0));
    this.add(getBtnOk(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.SOUTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5, 5, 5, 0),
        0, 0));
    this.add(getBtnCancel(), new com.ulcjava.base.application.GridBagConstraints(2, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.SOUTHWEST,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(5, 5, 5, 5),
        0, 0));
  }

  public void renderGUI() {

    int size = tblDetail.getColumnCount();

    for (int i = 0; i < size; i++) {
      ULCTableColumn column = tblDetail.getColumnModel().getColumn(i);
      if (column.getHeaderValue().equals(
          Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/activity"))) {
        column.setCellRenderer(new ITableCellRenderer() {

          @Override
          public IRendererComponent getTableCellRendererComponent(ULCTable table, Object value, boolean isSelected,
              boolean hasFocus, int row) {
            if (value.equals("")) {
              return hyperlinkCellWidget;
            }
            return ckCellWidgetActivity;
          }
        });

        column.setCellEditor(new ITableCellEditor() {

          @Override
          public IEditorComponent getTableCellEditorComponent(ULCTable table, Object value, int row) {
            if (value.equals("")) {
              return hyperlinkCellWidget;
            }
            return ckCellWidgetActivity;
          }
        });
      } else if (column.getHeaderValue().equals(
          Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/release"))) {
        column.setCellRenderer(new ITableCellRenderer() {

          @Override
          public IRendererComponent getTableCellRendererComponent(ULCTable table, Object value, boolean isSelected,
              boolean hasFocus, int row) {
            if (value.equals("")) {
              return hyperlinkCellWidget;
            }
            return ckCellWidgetRelease;
          }
        });

        column.setCellEditor(new ITableCellEditor() {

          @Override
          public IEditorComponent getTableCellEditorComponent(ULCTable table, Object value, int row) {
            if (value.equals("")) {
              return hyperlinkCellWidget;
            }
            return ckCellWidgetRelease;
          }
        });
      }
    }
  }

  /**
   * This method initializes lblTargetDetail
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblTargetDetail() {
    if (lblTargetDetail == null) {
      lblTargetDetail = new RLabel();
      lblTargetDetail.setName("lblTargetDetail");
      lblTargetDetail
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/projectDetails\")%>");
    }
    return lblTargetDetail;
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
      ScrollPane.setStyleProperties("{/anchor \"NORTHWEST\"/fill \"BOTH\"}");
      ScrollPane.setViewPortView(getTblDetail());
    }
    return ScrollPane;
  }

  /**
   * This method initializes btnOk
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnOk() {
    if (btnOk == null) {
      btnOk = new RButton();
      btnOk.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 27));
      btnOk
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnOk.setName("btnOk");
      btnOk.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnOk.setIconUri("<%=ivy.cms.cr(\"/images/klein/ok\")%>");
      btnOk.setText("<%=ivy.cms.co(\"/Dialogs/general/ok\")%>");
      btnOk.setName("btnOk");
    }
    return btnOk;
  }

  /**
   * This method initializes btnCancel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnCancel() {
    if (btnCancel == null) {
      btnCancel = new RButton();
      btnCancel.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 27));
      btnCancel
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      btnCancel.setText("<%=ivy.cms.co(\"/Dialogs/general/cancel\")%>");
      btnCancel.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/cancel\")%>");
      btnCancel.setHorizontalAlignment(ULCAbstractButton.LEFT);
      btnCancel.setName("btnCancel");
    }
    return btnCancel;
  }

  /**
   * This method initializes tblDetail
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getTblDetail() {
    if (tblDetail == null) {
      tblDetail = new RTable();
      tblDetail.setName("tblDetail");
      tblDetail
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/headerAlignment \"default\"/field \"application\"/editable \"\"/condition \"false\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=entry.application.isEmpty()?value:\\\"       \\\"+value+\\\" (\\\"+entry.libId+\\\":\\\"+entry.qualifiedProjectVersion+\\\")\\\"\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/Artefact\\\")\"/headerAlignment \"default\"/field \"projectName\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pm\\\")\"/headerAlignment \"default\"/field \"processModel\"/editable \"!entry.application.isEmpty()\"/condition \"\"/columnStyle \"default\"/cellWidget \"cbCellWidgetPM\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=entry.processModelVersionTooltip\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmv\\\")\"/headerAlignment \"default\"/field \"processModelVersion\"/editable \"!entry.application.isEmpty()\"/condition \"\"/columnStyle \"default\"/cellWidget \"cbCellWidgetPMV\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/activity\\\")\"/headerAlignment \"default\"/field \"activity\"/editable \"true\"/condition \"\"/columnStyle \"default\"/cellWidget \"ckCellWidgetActivity\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/release\\\")\"/headerAlignment \"default\"/field \"release\"/editable \"true\"/condition \"\"/columnStyle \"default\"/cellWidget \"ckCellWidgetRelease\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=entry.requireProjectsTooltip.isEmpty()?null:entry.requireProjectsTooltip\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/library\\\")\"/headerAlignment \"default\"/field \"requireProjectsText\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/headerAlignment \"default\"/field \"qualifiedProjectVersion\"/editable \"\"/condition \"false\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\"/headerAlignment \"default\"/field \"libId\"/editable \"\"/condition \"false\"/columnStyle \"default\"/cellWidget \"\"}}}");
      tblDetail.setStyleProperties("");
      tblDetail.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      tblDetail.setRowHeight(20);
      tblDetail.setGridColor(new Color(208, 208, 208));
      tblDetail.setBorder(BorderFactory.createLineBorder(new Color(225, 225, 225), 2));
      tblDetail.setBackground(Color.white);
      tblDetail.setShowGrid(true);
      tblDetail.setSortable(false);
    }
    return tblDetail;
  }

  private PMCellWidget getCbCellWidgetPM() {
    if (cbCellWidgetPM == null) {
      cbCellWidgetPM = new PMCellWidget();
      cbCellWidgetPM.setName("cbCellWidgetPM");

      cbCellWidgetPM.addActionListener(new IActionListener() {

        @Override
        public void actionPerformed(ActionEvent event) {

          if (cbCellWidgetPM.getSelectedItem() != null && cbCellWidgetPM.getSelectedIndex() > 0) {
            cbCellWidgetPM.setEditable(false);
          }

          int pmColumnIndex =
              findColumnIndex(Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pm"));

          // set value for PMV column
          if (tblDetail.getSelectedRow() >= 0 && tblDetail.getSelectedColumn() == pmColumnIndex) {
            // although drag and drop PMV to new position, its index in table model is still 3
            tblDetail.getModel().setValueAt(TargetSelectionDetailPanel.DEFAULT_ITEM, tblDetail.getSelectedRow(),
                PMV_COLUMN_IDX);
          }
        }
      });

    }
    return cbCellWidgetPM;
  }

  private PMVCellWidget getCbCellWidgetPMV() {
    if (cbCellWidgetPMV == null) {
      cbCellWidgetPMV = new PMVCellWidget();
      cbCellWidgetPMV.setName("cbCellWidgetPMV");
      cbCellWidgetPMV.addActionListener(new IActionListener() {

        @Override
        public void actionPerformed(ActionEvent event) {
          ProjectDetailInfo dataRow = (ProjectDetailInfo) tblDetail.getSelectedListEntry();

          if (dataRow != null && cbCellWidgetPMV.getSelectedItem() != null) {
            if (!cbCellWidgetPMV.getSelectedItem().toString().equals(DEFAULT_ITEM)) {
              dataRow.setProcessModelVersionTooltip(cbCellWidgetPMV.getSelectedItem().toString());
              dataRow.setProcessModelVersion(cbCellWidgetPMV.getSelectedItem().toString());

              int pmvNumber = getPmvNumberFromPmv(dataRow);
              IProcessModelVersion iPMV =
                  ServerFactory.getServer().getApplicationConfigurationManager()
                      .findProcessModelVersion(dataRow.getApplication(), dataRow.getProcessModel(), pmvNumber);

              if (iPMV.getReleaseState().equals(ReleaseState.RELEASED)) {
                dataRow.setRelease(true);
                dataRow.setOriginalRelease(ReleaseState.RELEASED.name());

                String releaseColumnHeader =
                    Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/release");
                int selectedRow = tblDetail.getSelectedRow();
                int releaseColumn = -1;
                for (int i = 0; i < tblDetail.getColumnCount(); i++) {
                  if (tblDetail.getColumnName(i).equals(releaseColumnHeader)) {
                    releaseColumn = i;
                  }
                }

                int[] viewColumns = new int[] {releaseColumn};
                tblDetail.preloadCells(selectedRow, selectedRow, viewColumns);
              } else {
                dataRow.setOriginalRelease("");
              }
            } else {
              dataRow.setOriginalRelease("");
            }
          }
        }
      });

    }
    return cbCellWidgetPMV;
  }

  /**
   * This method initializes hyperlinkCellWidget
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RHyperlinkCellWidget
   */
  private RHyperlinkCellWidget getHyperlinkCellWidget() {
    if (hyperlinkCellWidget == null) {
      hyperlinkCellWidget = new RHyperlinkCellWidget();
      hyperlinkCellWidget.setText("");
      hyperlinkCellWidget.setName("hyperlinkCellWidget");
    }
    return hyperlinkCellWidget;
  }

  /**
   * This method initializes ckCellWidgetRelease
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RBooleanCellWidget
   */
  private RBooleanCellWidget getCkCellWidgetRelease() {
    if (ckCellWidgetRelease == null) {
      ckCellWidgetRelease = new RBooleanCellWidget();
      ckCellWidgetRelease.setText("");
      ckCellWidgetRelease.setName("ckCellWidgetRelease");
    }
    return ckCellWidgetRelease;
  }

  /**
   * This method initializes ckCellWidgetActivity
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RBooleanCellWidget
   */
  private RBooleanCellWidget getCkCellWidgetActivity() {
    if (ckCellWidgetActivity == null) {
      ckCellWidgetActivity = new RBooleanCellWidget();
      ckCellWidgetActivity.setText("");
      ckCellWidgetActivity.setName("ckCellWidgetActivity");
    }
    return ckCellWidgetActivity;
  }

  private int findColumnIndex(String columnName) {
    for (int i = 0; i < tblDetail.getColumnCount(); i++) {
      if (tblDetail.getColumnModel().getColumn(i).getHeaderValue().toString().equals(columnName)) {
        return i;
      }
    }
    return 0;
  }

  public int getPmvNumberFromPmv(ProjectDetailInfo projectDetailInfo) {
    String pmv = projectDetailInfo.getProcessModelVersion();

    int beginIndex = pmv.indexOf(GlobalVariable.PMV_NAME_DELIMITER);
    int endIndex = pmv.indexOf("(");

    // if not found "(", get last index + 1;
    if (endIndex < 0) {
      endIndex = pmv.length();
    }

    String pmvValue = pmv.substring(beginIndex + 1, endIndex);

    StringBuilder stringBuilder = new StringBuilder();
    for (char c : pmvValue.toCharArray()) {
      if (Character.isDigit(c)) {
        stringBuilder.append(c);
      }
    }

    int pmvNumber = Integer.parseInt(stringBuilder.toString());
    return pmvNumber;
  }
} // @jve:decl-index=0:visual-constraint="10,10"


class PMCellWidget extends RComboBoxCellWidget {

  /**
	 * 
	 */
  private static final long serialVersionUID = 8537089878999794158L;
  private int count = 0;

  private IComboBoxModel getDataModelForPM(String appName, String value, String libId, QualifiedVersion libVersion) {
    List<String> pmList = new ArrayList<String>();

    IApplication app = ServerFactory.getServer().getApplicationConfigurationManager().findApplication(appName);

    if (app != null) {
      IProcessModelVersion matchingPmv = LibraryUtil.findLibrary(app, libId, libVersion);
      if (matchingPmv == null) {
        for (IProcessModel pm : app.getProcessModels()) {
          pmList.add(pm.getName());
        }

        if (value.isEmpty()) {
          pmList.add(0, TargetSelectionDetailPanel.DEFAULT_ITEM);
        } else {
          if (pmList.contains(value)) {
            pmList.add(0, TargetSelectionDetailPanel.DEFAULT_ITEM);
            setEditable(false);
          } else {
            pmList.add(0, value);
            if (app.findProcessModel(value) != null) {
              setEditable(false);
            } else {
              setEditable(true);
            }
          }
        }
      } else {
        pmList.add(matchingPmv.getProcessModel().getName());
        setEditable(false);
      }
    }

    return new DefaultComboBoxModel(pmList.toArray());
  }


  private void setDataModelForComponent(ULCTable table, int row, String value) {
    String appName = table.getModel().getValueAt(row, TargetSelectionDetailPanel.APP_COLUMN_IDX).toString();
    if (!table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_VER_COLUMN_IDX).toString().isEmpty()
        && !table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_ID_COLUMN_IDX).toString().isEmpty()) {

      String libVersion =
          table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_VER_COLUMN_IDX).toString();
      String libId = table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_ID_COLUMN_IDX).toString();

      setModel(getDataModelForPM(appName, value, libId, QualifiedVersions.valueOf(libVersion)));

    } else {
      setModel(getDataModelForPM(appName, value, "", DEFAULT_QUALIFIED_VERSION));
    }



  }

  @Override
  public IEditorComponent getTableCellEditorComponent(ULCTable table, Object value, int row) {
    if (count < table.getRowCount()) {
      setDataModelForComponent(table, row, TargetSelectionDetailPanel.DEFAULT_ITEM);
      count++;
    }

    if (value != null && !value.toString().isEmpty()) {
      boolean search = false;
      int indexFound = 0;
      for (int i = 0; i < getModel().getSize(); i++) {
        if (getModel().getElementAt(i).equals(value)) {
          search = true;
          indexFound = i;
        }
      }

      if (search) {
        setSelectedIndex(indexFound);
      } else {
        setDataModelForComponent(table, row, value.toString());
      }
    }

    return super.getTableCellEditorComponent(table, value, row);
  }

  @Override
  public IRendererComponent getTableCellRendererComponent(ULCTable table, Object value, boolean isSelected,
      boolean hasFocus, int row) {
    setDataModelForComponent(table, row, value.toString());
    setSelectedItem(value.toString());

    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row);
  }
}



class PMVCellWidget extends RComboBoxCellWidget {

  private static final long serialVersionUID = -3308491352990281246L;
  private int count = 0;

  private IComboBoxModel getDataModelForPMV(String pmName, String appName, String value, String libId, QualifiedVersion libVersion) {
    List<String> pmvList = new ArrayList<String>();

    IApplication app = ServerFactory.getServer().getApplicationConfigurationManager().findApplication(appName);

    if (app != null) {
      IProcessModelVersion matchingPmv = LibraryUtil.findLibrary(app, libId, libVersion);

      if (matchingPmv == null) {
        IProcessModel pm = app.findProcessModel(pmName);
        if (pm != null) {
          for (IProcessModelVersion pmv : pm.getProcessModelVersions()) {
            if (!pmv.getReleaseState().name().equals(ReleaseState.DELETED.name())) {
              String pmvValue = createPmvValue(pmv);
              pmvList.add(pmvValue);
            }
          }
        }

        if (value.isEmpty()) {
          pmvList.add(0, TargetSelectionDetailPanel.DEFAULT_ITEM);
        } else {
          if (pmvList.contains(value)) {
            pmvList.add(0, TargetSelectionDetailPanel.DEFAULT_ITEM);
          } else {
            pmvList.add(0, value);
          }
        }
      } else {
        String pmvValue = createPmvValue(matchingPmv);
        pmvList.add(pmvValue);
      }
    }

    return new DefaultComboBoxModel(pmvList.toArray());
  }

  private String createPmvValue(IProcessModelVersion pmv) {
    if (pmv.getLibrary() != null) {
      List<Object> formatObjects = new ArrayList<Object>();

      formatObjects.add(pmv.getVersionNumber());
      formatObjects.add(pmv.getLibrary().getId());
      formatObjects.add(pmv.getLibrary().getQualifiedVersion().toString());
      return Ivy.cms()
          .co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmvTooltip", formatObjects);
    }

    return Ivy.cms().co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmv")
        + GlobalVariable.PMV_NAME_DELIMITER + pmv.getVersionNumber();
  }

  private void setDataModelForComponent(ULCTable table, int row, String value) {
    String appName = table.getModel().getValueAt(row, TargetSelectionDetailPanel.APP_COLUMN_IDX).toString();
    String pmName = table.getModel().getValueAt(row, TargetSelectionDetailPanel.PM_COLUMN_IDX).toString();

    if (!table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_VER_COLUMN_IDX).toString().isEmpty()
        && !table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_ID_COLUMN_IDX).toString().isEmpty()) {

      String libVersion =
          table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_VER_COLUMN_IDX).toString();
      String libId = table.getModel().getValueAt(row, TargetSelectionDetailPanel.LIB_ID_COLUMN_IDX).toString();

      setModel(getDataModelForPMV(pmName, appName, value, libId, QualifiedVersions.valueOf(libVersion)));

    } else {

      setModel(getDataModelForPMV(pmName, appName, value, "", DEFAULT_QUALIFIED_VERSION));
    }


  }

  @Override
  public IEditorComponent getTableCellEditorComponent(ULCTable table, Object value, int row) {
    if (count < table.getRowCount()) {
      setDataModelForComponent(table, row, "");
      count++;
    }

    if (value != null && !value.toString().isEmpty()) {
      boolean search = false;
      int indexFound = 0;
      for (int i = 0; i < getModel().getSize(); i++) {
        if (getModel().getElementAt(i).equals(value)) {
          search = true;
          indexFound = i;
        }
      }

      if (search) {
        setSelectedIndex(indexFound);
      } else {
        setDataModelForComponent(table, row, value.toString());
      }
    }

    return super.getTableCellEditorComponent(table, value, row);
  }

  @Override
  public IRendererComponent getTableCellRendererComponent(ULCTable table, Object value, boolean isSelected,
      boolean hasFocus, int row) {
    setDataModelForComponent(table, row, value.toString());
    setSelectedItem(value.toString());
    return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row);
  }

}
