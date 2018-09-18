package ch.ivyteam.ivy.admin.tool.LibraryDetails;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Dimension;

/**
 * <p>
 * LibraryDetailsPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class LibraryDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridLayoutPane dependentPane = null;
  private RScrollPane dependentScrollPane = null;
  private RTable dependentTable = null;
  private RGridBagLayoutPane requiredPmvPane = null;
  private RScrollPane requiredPmvScrollPane = null;
  private RTable requiredPmvTable = null;
  private RButton updateLibBttn = null;
  private RButton closeBtn = null;
  private RButton versionEditBttn = null;
  private RLabel lblSpecify = null;
  private RLabel lblSelect = null;
  private RFlowLayoutPane FlowLayoutPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of LibraryDetailsPanel
   */
  public LibraryDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes LibraryDetailsPanel
   * 
   * @return void
   */
  private void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(647, 400));
    this.add(getDependentPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getRequiredPmvPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getFlowLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes dependentPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getDependentPane() {
    if (dependentPane == null) {
      ULCTitledBorder ULCTitledBorder = BorderFactory.createTitledBorder("");
      ULCTitledBorder.setTitleColor(new Color(23, 64, 140));
      ULCTitledBorder
          .setTitle("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/projectsDependingOnThisPMV\")%>");
      dependentPane = new RGridLayoutPane();
      dependentPane.setPreferredSize(new Dimension(100, 80));
      dependentPane.setName("dependentPane");
      dependentPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      dependentPane.setBorder(ULCTitledBorder);
      dependentPane.setName("dependentPane");
      dependentPane.add(getDependentScrollPane());
    }
    return dependentPane;
  }

  /**
   * This method initializes dependentScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDependentScrollPane() {
    if (dependentScrollPane == null) {
      dependentScrollPane = new RScrollPane();
      dependentScrollPane.setName("dependentScrollPane");
      dependentScrollPane.setStyleProperties("{/weightY \"0\"}");
      dependentScrollPane.setViewPortView(getDependentTable());
    }
    return dependentScrollPane;
  }

  /**
   * This method initializes dependentTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getDependentTable() {
    if (dependentTable == null) {
      dependentTable = new RTable();
      dependentTable.setName("dependentTable");
      dependentTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons true /version \"3.0\"/emptyTableText \"No dependent project found.\"/columns {{/result \"result=IF(entry.isResolved(), ivy.cms.co(\\\"/Dialogs/general/yes\\\"), ivy.cms.co(\\\"/Dialogs/general/no\\\"))\"/version \"3.0\"/tooltip \"\"/icon \"result=IF(entry.isResolved(), ivy.cms.cr(\\\"/Icons/Check/16\\\"), ivy.cms.cr(\\\"/Icons/Error/16\\\"))\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/resolved\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"}{/result \"result=entry.getId()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/id\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"}{/result \"result=entry.getQualifiedVersion()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/version\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"}{/result \"result=entry.getProcessModelVersion().getVersionName()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/processModelNameVersion\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"}{/result \"result=entry.getProcessModelVersion().getActivityState().toString()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/activityState\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"}{/result \"result=entry.getProcessModelVersion().getReleaseState().toString()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/releaseState\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"}}}");
      dependentTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      dependentTable.setName("dependentTable");
      dependentTable.setSortable(true);
    }
    return dependentTable;
  }

  /**
   * This method initializes requiredPmvPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getRequiredPmvPane() {
    if (requiredPmvPane == null) {
      ULCTitledBorder ULCTitledBorder1 = BorderFactory.createTitledBorder("");
      ULCTitledBorder1.setTitleColor(new Color(23, 64, 140));
      ULCTitledBorder1
          .setTitle("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/projectsRequiredByThisPMV\")%>");
      RFiller filler = new RFiller();
      filler.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
      requiredPmvPane = new RGridBagLayoutPane();
      requiredPmvPane.setPreferredSize(new Dimension(100, 200));
      requiredPmvPane.setName("requiredPmvPane");
      requiredPmvPane.setStyleProperties("{/weightY \"1\"}");
      requiredPmvPane.setBorder(ULCTitledBorder1);
      requiredPmvPane.add(getRequiredPmvScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 3, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      requiredPmvPane.add(getLblSpecify(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      requiredPmvPane.add(getLblSelect(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      requiredPmvPane.add(getVersionEditBttn(), new com.ulcjava.base.application.GridBagConstraints(2, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      requiredPmvPane.add(getUpdateLibBttn(), new com.ulcjava.base.application.GridBagConstraints(2, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      requiredPmvPane.add(filler, new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return requiredPmvPane;
  }

  /**
   * This method initializes requiredPmvScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getRequiredPmvScrollPane() {
    if (requiredPmvScrollPane == null) {
      requiredPmvScrollPane = new RScrollPane();
      requiredPmvScrollPane.setName("requiredPmvScrollPane");
      requiredPmvScrollPane.setStyleProperties("{/weightY \"1\"}");
      requiredPmvScrollPane.setViewPortView(getRequiredPmvTable());
    }
    return requiredPmvScrollPane;
  }

  /**
   * This method initializes requiredPmvTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getRequiredPmvTable() {
    if (requiredPmvTable == null) {
      requiredPmvTable = new RTable();
      requiredPmvTable.setName("requiredPmvTable");
      requiredPmvTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/emptyTableText \"No dependent project required.\"/columns {{/result \"result=IF(entry.isResolved(), IF(entry.isResolvedLibraryResolved(), \\\"Resolved\\\", \\\"Unresolved dependencies\\\"), \\\"Unresolved\\\")\"/version \"3.0\"/tooltip \"result=IF(entry.isResolved(), \\r\\n  IF (entry.isResolvedLibraryResolved(), \\r\\n    ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/specifiedRequiredProjectIsAvailable\\\"), \\r\\n    ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/someOfTheRequirementAreMissing\\\")),\\r\\n  \\tivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/specifiedRequiredProjectIsNotAvailable\\\"))\"/icon \"result=IF(entry.isResolved(), IF (entry.isResolvedLibraryResolved(), ivy.cms.cr(\\\"/Icons/Check/16\\\"), ivy.cms.cr(\\\"/Icons/Warning/16\\\")), ivy.cms.cr(\\\"/Icons/Error/16\\\"))\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/resolved\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"}{/result \"result=entry.getId()\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/id\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"}{/result \"result=ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.RequiredLibraryLiteralBuilder.getVersionRangeLiteral(entry)\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/version\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"}{/result \"result=IF (entry.isResolved(),\\r\\n  \\\"Version: \\\"+entry.getResolvedLibrary().getQualifiedVersion() +\\r\\n    \\\", PMV: \\\"+entry.getResolvedLibrary().getProcessModelVersion().getVersionName()+\\r\\n    \\\" (\\\"+entry.getResolvedLibrary().getProcessModelVersion().getActivityState()+\\r\\n    \\\", \\\"+entry.getResolvedLibrary().getProcessModelVersion().getReleaseState()+\\\")\\\",\\r\\n  \\\"Unresolved\\\")\"/version \"3.0\"/tooltip \"result=IF (entry.isResolved(),\\r\\n  \\\"<html><b>Resolved project version:</b> \\\"+entry.getResolvedLibrary().getQualifiedVersion() +\\r\\n    \\\"<br><b>Process Model Version:</b> \\\"+entry.getResolvedLibrary().getProcessModelVersion().getVersionName()+\\r\\n    \\\"<br><b>Activity State:</b> \\\"+entry.getResolvedLibrary().getProcessModelVersion().getActivityState()+\\r\\n    \\\"<br><b>Release State:</b> \\\"+entry.getResolvedLibrary().getProcessModelVersion().getReleaseState()+\\\"</html>\\\",\\r\\n  \\tivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/specifiedRequiredProjectIsNotAvailable\\\"))\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/resolvedDependentProjectPMV\\\")\"/headerAlignment \"default\"/field \"\"/editable \"\"/condition \"\"/cellWidget \"\"}}}");
      requiredPmvTable.setStyleProperties("{/insetsRight \"5\"}");
      requiredPmvTable.setBackground(Color.white);
      requiredPmvTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      requiredPmvTable.setSortable(false);
    }
    return requiredPmvTable;
  }

  /**
   * This method initializes updateLibBttn
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getUpdateLibBttn() {
    if (updateLibBttn == null) {
      updateLibBttn = new RButton();
      updateLibBttn.setName("updateLibBttn");
      updateLibBttn
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      updateLibBttn.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/select\")%>");
    }
    return updateLibBttn;
  }

  /**
   * This method initializes closeBtn
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCloseBtn() {
    if (closeBtn == null) {
      closeBtn = new RButton();
      closeBtn.setText("<%=ivy.cms.co(\"/Dialogs/general/close\")%>");
      closeBtn
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/anchor \"SOUTHEAST\"/insetsTop \"5\"/preferredSizeWidth \"80\"/insetsRight \"0\"/preferredSizeHeight \"27\"}");
      closeBtn.setIconUri("<%=ivy.cms.cr(\"/ch/ivyteam/ivy/server/deploymentWizard/icon/cancel\")%>");
      closeBtn.setName("closeBtn");
    }
    return closeBtn;
  }

  /**
   * This method initializes versionEditBttn
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getVersionEditBttn() {
    if (versionEditBttn == null) {
      versionEditBttn = new RButton();
      versionEditBttn
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/buttonName/specify\")%>");
      versionEditBttn
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"80\"/preferredSizeHeight \"27\"}");
      versionEditBttn.setName("versionEditBttn");
    }
    return versionEditBttn;
  }

  /**
   * This method initializes lblSpecify
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSpecify() {
    if (lblSpecify == null) {
      lblSpecify = new RLabel();
      lblSpecify
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/specifyRequiredProjectVersionRange\")%>");
      lblSpecify.setName("lblSpecify");
    }
    return lblSpecify;
  }

  /**
   * This method initializes lblSelect
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblSelect() {
    if (lblSelect == null) {
      lblSelect = new RLabel();
      lblSelect.setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/LibraryDetail/toSelectAProjectVersion\")%>");
      lblSelect.setName("lblSelect");
    }
    return lblSelect;
  }

  /**
   * This method initializes FlowLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getFlowLayoutPane() {
    if (FlowLayoutPane == null) {
      FlowLayoutPane = new RFlowLayoutPane();
      FlowLayoutPane.setName("FlowLayoutPane");
      FlowLayoutPane.setStyleProperties("{/fill \"HORIZONTAL\"/alignment \"RIGHT\"/weightX \"1\"}");
      FlowLayoutPane.add(getCloseBtn());
    }
    return FlowLayoutPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
