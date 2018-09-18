package ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RHyperlinkCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCTable;
import com.ulcjava.base.application.util.Color;

/**
 * <p>
 * PreviewPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class PreviewPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel lblTitle = null;
  private RScrollPane scrollPaneDetail = null;
  private RTable tblContentDetail = null;
  private RHyperlinkCellWidget hyperlinkLibs = null;

  // SONAR-OFF
  /**
   * Create a new instance of PreviewPanel
   */
  public PreviewPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes PreviewPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getLblTitle(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(5, 0, 5, 0), 0, 0));
    this.add(getScrollPaneDetail(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, 1.0D, 1.0D,
        com.ulcjava.base.application.GridBagConstraints.NORTHWEST,
        com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getHyperlinkLibs(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes lblTitle
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLblTitle() {
    if (lblTitle == null) {
      lblTitle = new RLabel();
      lblTitle
          .setText("<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/component/labelName/deploymentAction\")%>");
      lblTitle.setName("lblTitle");
    }
    return lblTitle;
  }

  /**
   * This method initializes scrollPaneDetail
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getScrollPaneDetail() {
    if (scrollPaneDetail == null) {
      scrollPaneDetail = new RScrollPane();
      scrollPaneDetail.setName("scrollPaneDetail");
      scrollPaneDetail.setStyleProperties("{/anchor \"NORTHWEST\"/fill \"BOTH\"}");
      scrollPaneDetail.setViewPortView(getTblContentDetail());
    }
    return scrollPaneDetail;
  }

  /**
   * This method initializes tblContentDetail
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getTblContentDetail() {
    if (tblContentDetail == null) {
      tblContentDetail = new RTable();
      tblContentDetail.setName("tblContentDetail");
      tblContentDetail
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip true /showIcons true /version \"3.0\"/columns {{/result \"result=value + \\\" (\\\" + entry.libraryId + \\\":\\\" + entry.qualifiedProjectVersion + \\\")\\\"\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/project\\\")\"/headerAlignment \"default\"/field \"projectName\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/application\\\")\"/headerAlignment \"default\"/field \"application\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pm\\\")\"/headerAlignment \"default\"/field \"processModel\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=entry.processModelVersionTooltip\"/icon \"result=IF (entry.newlyDeployed, ivy.cms.cr(\\\"/ch/ivyteam/ivy/server/deploymentWizard/icon/newDeploy\\\"), ivy.cms.cr(\\\"/ch/ivyteam/ivy/server/deploymentWizard/icon/reDeploy\\\"))\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmv\\\")\"/headerAlignment \"default\"/field \"displayPmv\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/originalStateTooltip\\\")\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/originalActivity\\\")\"/headerAlignment \"default\"/field \"originalActivityState\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/finalStateTooltip\\\")\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/finalActivity\\\")\"/headerAlignment \"default\"/field \"activity\"/editable \"\"/condition \"\"/columnWidth \"80\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/originalStateTooltip\\\")\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/originalRelease\\\")\"/headerAlignment \"default\"/field \"originalReleaseState\"/editable \"\"/condition \"\"/columnWidth \"100\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/finalStateTooltip\\\")\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/finalRelease\\\")\"/headerAlignment \"default\"/field \"release\"/editable \"\"/condition \"\"/columnWidth \"80\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=entry.environmentTooltip.isEmpty()?null:entry.environmentTooltip\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/environment\\\")\"/headerAlignment \"default\"/field \"environment\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"result=entry.requireProjectsTooltip.isEmpty()?null:entry.requireProjectsTooltip\"/icon \"\"/header \"ivy.cms.co(\\\"/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/library\\\")\"/headerAlignment \"default\"/field \"requireProjectsText\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"hyperlinkLibs\"}}}");
      tblContentDetail.setAutoResizeMode(ULCTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
      tblContentDetail.setStyleProperties("{/evenRowBackgroundColor \"b=225\\ng=225\\nr=225\"}");
      tblContentDetail.setBorder(BorderFactory.createLineBorder(new Color(225, 225, 225), 2));
      tblContentDetail.setRowHeight(20);
      tblContentDetail.setSortable(true);
    }
    return tblContentDetail;
  }

  /**
   * This method initializes hyperlinkLibs
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RHyperlinkCellWidget
   */
  private RHyperlinkCellWidget getHyperlinkLibs() {
    if (hyperlinkLibs == null) {
      hyperlinkLibs = new RHyperlinkCellWidget();
      hyperlinkLibs.setText("");
      hyperlinkLibs.setName("hyperlinkLibs");
    }
    return hyperlinkLibs;
  }
}
