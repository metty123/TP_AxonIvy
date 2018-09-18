package ch.ivyteam.ivy.admin.tool.environment.ImportInformer;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RHtmlPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RBooleanCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RComboBoxCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.IEditorComponent;
import com.ulcjava.base.application.IRendererComponent;
import com.ulcjava.base.application.ULCListSelectionModel;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.table.ITableCellEditor;
import com.ulcjava.base.application.table.ITableCellRenderer;
import com.ulcjava.base.application.table.ULCTableColumn;
import com.ulcjava.base.application.util.Color;

/**
 * <p>
 * ImportInformerPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class ImportInformerPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RButton btnOK = null;
  private RButton btnCancel = null;
  private RGridBagLayoutPane GridBagLayoutPane = null;
  private RLabel lblNoData = null;
  private RBooleanCellWidget chxState = null;
  private RScrollPane scrollPaneTable = null;
  private RGridBagLayoutPane bottomPane = null;
  private RComboBoxCellWidget cmbTargetEnv = null; // @jve:decl-index=0:visual-constraint="443,50"
  private RTable tblEnvironments = null;
  private RHtmlPane titleHtmlPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of ImportInformerPanel
   */
  public ImportInformerPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ImportInformerPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(416, 401));
    this.add(getBottomPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getScrollPaneTable(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes btnOK
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnOK() {
    if (btnOK == null) {
      btnOK = new RButton();
      btnOK.setText("   <%=ivy.cms.co(\"/Buttons/ok\")%>   ");
      btnOK.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 25));
      btnOK.setMargin(new com.ulcjava.base.application.util.Insets(2, 14, 2, 14));
      btnOK.setName("btnOK");
    }
    return btnOK;
  }

  /**
   * This method initializes btnCancel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getBtnCancel() {
    if (btnCancel == null) {
      btnCancel = new RButton();
      btnCancel.setText("<%=ivy.cms.co(\"/Buttons/cancel\")%>");
      btnCancel.setPreferredSize(new com.ulcjava.base.application.util.Dimension(100, 25));
      btnCancel.setMargin(new com.ulcjava.base.application.util.Insets(2, 14, 2, 14));
      btnCancel.setStyleProperties("{/horizontalAlignment \"RIGHT\"/anchor \"EAST\"}");
      btnCancel.setName("btnCancel");
    }
    return btnCancel;
  }

  /**
   * This method initializes GridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getGridBagLayoutPane() {
    if (GridBagLayoutPane == null) {
      GridBagLayoutPane = new RGridBagLayoutPane();
      GridBagLayoutPane.setName("GridBagLayoutPane");
      GridBagLayoutPane
          .setStyleProperties("{/insetsBottom \"6\"/insetsTop \"10\"/fill \"HORIZONTAL\"/insetsRight \"6\"/weightY \"0\"/insetsLeft \"6\"}");
      GridBagLayoutPane.add(getTitleHtmlPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      GridBagLayoutPane.add(getLblNoData(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return GridBagLayoutPane;
  }

  /**
   * This method initializes lblNoData
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblNoData() {
    if (lblNoData == null) {
      lblNoData = new RLabel();
      lblNoData.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/environment/Informer/emptyData\")%>");
      lblNoData.setVisible(false);
      lblNoData.setStyleProperties("{/anchor \"SOUTHWEST\"/insetsBottom \"6\"/insetsLeft \"6\"}");
      lblNoData.setName("lblNoData");
    }
    return lblNoData;
  }

  private RBooleanCellWidget getChxState() {
    if (chxState == null) {
      chxState = new RBooleanCellWidget();
      chxState.setText("");
      chxState.setName("chxState");
    }
    return chxState;
  }

  public void renderTableGUI() {
    ULCTableColumn column = tblEnvironments.getColumnModel().getColumn(2);
    column.setCellEditor(new ITableCellEditor() {

      @Override
      public IEditorComponent getTableCellEditorComponent(ULCTable table, Object value, int row) {
        return cmbTargetEnv;
      }
    });

    column.setCellRenderer(new ITableCellRenderer() {

      @Override
      public IRendererComponent getTableCellRendererComponent(ULCTable table, Object value, boolean isSelected,
          boolean hasFocus, int row) {
        return cmbTargetEnv;
      }
    });
  }

  /**
   * This method initializes scrollPaneTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPaneTable() {
    if (scrollPaneTable == null) {
      scrollPaneTable = new RScrollPane();
      scrollPaneTable.setName("scrollPaneTable");
      scrollPaneTable
          .setStyleProperties("{/anchor \"CENTER\"/fill \"BOTH\"/insetsRight \"6\"/insetsLeft \"6\"/weightY \"1\"/weightX \"1\"}");
      scrollPaneTable.setViewPortView(getTblEnvironments());
      scrollPaneTable.setName("scrollPaneTable");
    }
    return scrollPaneTable;
  }

  /**
   * This method initializes bottomPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getBottomPane() {
    if (bottomPane == null) {
      bottomPane = new RGridBagLayoutPane();
      bottomPane.setName("bottomPane");
      bottomPane
          .setStyleProperties("{/anchor \"EAST\"/insetsBottom \"6\"/insetsTop \"6\"/fill \"NONE\"/insetsRight \"6\"/weightY \"0\"/weightX \"0\"}");
      bottomPane.add(getBtnOK(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 6, 0, 0), 0, 0));
      bottomPane.add(getBtnCancel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 6, 0, 0), 0, 0));
    }
    return bottomPane;
  }

  /**
   * This method initializes cmbTargetEnv
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RComboBoxCellWidget
   */
  private RComboBoxCellWidget getCmbTargetEnv() {
    if (cmbTargetEnv == null) {
      cmbTargetEnv = new RComboBoxCellWidget();
      cmbTargetEnv.setName("cmbTargetEnv");
      cmbTargetEnv
          .setModelConfiguration("{/result \"result=entry.getName()\"/version \"3.0\"/icon \"\"/tooltip \"\"/keyField \"\"}");
    }
    return cmbTargetEnv;
  }

  /**
   * This method initializes tblEnvironments
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getTblEnvironments() {
    if (tblEnvironments == null) {
      tblEnvironments = new RTable();
      tblEnvironments.setName("tblEnvironments");
      tblEnvironments
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"\\\"\"/headerAlignment \"center\"/field \"state\"/editable \"true\"/condition \"\"/columnStyle \"default\"/cellWidget \"chxState\"}{/result \"result=value.getName()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/environment/Informer/environment\\\")\"/headerAlignment \"default\"/field \"sourceEnv\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value.getName()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/environment/Informer/targetEnvironment\\\")\"/headerAlignment \"default\"/field \"targetEnv\"/editable \"record.getField(\\\"state\\\").toBoolean()\"/condition \"\"/columnStyle \"default\"/cellWidget \"cmbTargetEnv\"}}}");
      tblEnvironments.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      tblEnvironments.setSelectionMode(ULCListSelectionModel.SINGLE_SELECTION);
      tblEnvironments.setSortable(true);
    }
    return tblEnvironments;
  }

  /**
   * This method initializes titleHtmlPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RHtmlPane
   */
  private RHtmlPane getTitleHtmlPane() {
    if (titleHtmlPane == null) {
      titleHtmlPane = new RHtmlPane();
      titleHtmlPane.setFocusable(false);
      titleHtmlPane.setName("titleHtmlPane");
      titleHtmlPane
          .setStyleProperties("{/font \"name=Dialog\\nsize=12\\nstyle=BOLD\"/anchor \"CENTER\"/insetsBottom \"10\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      titleHtmlPane.setBackground(new Color(244, 247, 255));
      titleHtmlPane.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/environment/Informer/description\")%>");
    }
    return titleHtmlPane;
  }
} // @jve:decl-index=0:visual-constraint="17,19"
