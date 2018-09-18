package ch.ivyteam.ivy.admin.tool.ProcessModel;

import ch.ivyteam.ivy.admin.tool.Activity.ActivityPanel;
import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;

/**
 * RichDialog panel implementation for ProcessModelPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class ProcessModelPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane infoGridBagLayoutPane = null;
  private RLabel nameLabel = null;
  private RTextField nameTextField = null;
  private RLabel descriptionLabel = null;
  private RTextArea descriptionTextArea = null;
  @EmbeddedRichDialog(ActivityPanel.class)
  private ULCContainer activityPanel = null;
  private RFiller pmFiller = null;
  private RScrollPane descriptionScrollPane = null;
  private RGridLayoutPane pmvPane = null;
  private RScrollPane pmvScrollPane = null;
  private RTable pmvTable = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer titlePane = null;

  // SONAR-OFF
  /**
   * Create a new instance of ProcessModelPanel
   */
  public ProcessModelPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes ProcessModelPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getInfoGridBagLayoutPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getActivityPanel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPmFiller(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getPmvPane(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTitlePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes infoGridBagLayoutPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getInfoGridBagLayoutPane() {
    if (infoGridBagLayoutPane == null) {
      infoGridBagLayoutPane = new RGridBagLayoutPane();
      infoGridBagLayoutPane.setName("infoGridBagLayoutPane");
      infoGridBagLayoutPane.setBorder(BorderFactory.createTitledBorder("Information"));
      infoGridBagLayoutPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      infoGridBagLayoutPane.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      infoGridBagLayoutPane.add(getDescriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return infoGridBagLayoutPane;
  }

  /**
   * This method initializes nameLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getNameLabel() {
    if (nameLabel == null) {
      nameLabel = new RLabel();
      nameLabel.setText("Name");
      nameLabel.setName("nameLabel");
    }
    return nameLabel;
  }

  /**
   * This method initializes nameTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getNameTextField() {
    if (nameTextField == null) {
      nameTextField = new RTextField();
      nameTextField.setText("RTextField");
      nameTextField.setEditable(false);
      nameTextField.setName("nameTextField");
    }
    return nameTextField;
  }

  /**
   * This method initializes descriptionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDescriptionLabel() {
    if (descriptionLabel == null) {
      descriptionLabel = new RLabel();
      descriptionLabel.setText("Description");
      descriptionLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      descriptionLabel.setName("descriptionLabel");
    }
    return descriptionLabel;
  }

  /**
   * This method initializes descriptionTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getDescriptionTextArea() {
    if (descriptionTextArea == null) {
      descriptionTextArea = new RTextArea();
      descriptionTextArea.setText("RTextArea");
      descriptionTextArea
          .setStyleProperties("{/insetsBottom \"0\"/insetsRight \"0\"/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      descriptionTextArea.setRows(4);
      descriptionTextArea.setEditable(false);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes activityPanel
   * 
   * @return ch.ivyteam.ivy.admin.tool.Activity.ActivityPanel
   */
  private ULCContainer getActivityPanel() {
    if (activityPanel == null) {
      activityPanel = RichDialogPanelFactory.create(ActivityPanel.class);
      activityPanel.setName("activityPanel");
      activityPanel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
    }
    return activityPanel;
  }

  /**
   * This method initializes pmFiller
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RFiller
   */
  private RFiller getPmFiller() {
    if (pmFiller == null) {
      pmFiller = new RFiller();
      pmFiller.setStyle("verticalGlue");
    }
    return pmFiller;
  }

  /**
   * This method initializes descriptionScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getDescriptionScrollPane() {
    if (descriptionScrollPane == null) {
      descriptionScrollPane = new RScrollPane();
      descriptionScrollPane.setName("descriptionScrollPane");
      descriptionScrollPane.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      descriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return descriptionScrollPane;
  }

  /**
   * This method initializes pmvPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getPmvPane() {
    if (pmvPane == null) {
      pmvPane = new RGridLayoutPane();
      pmvPane.setBorder(BorderFactory.createTitledBorder("Versions"));
      pmvPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      pmvPane.setName("pmvPane");
      pmvPane.add(getPmvScrollPane());
    }
    return pmvPane;
  }

  /**
   * This method initializes pmvScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getPmvScrollPane() {
    if (pmvScrollPane == null) {
      pmvScrollPane = new RScrollPane();
      pmvScrollPane.setName("pmvScrollPane");
      pmvScrollPane.setViewPortView(getPmvTable());
    }
    return pmvScrollPane;
  }

  /**
   * This method initializes pmvTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getPmvTable() {
    if (pmvTable == null) {
      pmvTable = new RTable();
      pmvTable.setName("pmvTable");
      pmvTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /columns {{/result \"result=entry.getVersionName()\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Name / Version\"/field \"\"/columnWidth \"200\"}{/result \"result=entry.getActivityState()\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Activity state\"/field \"\"/columnWidth \"100\"}{/result \"result=entry.getReleaseState()\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Release state\"/field \"\"/columnWidth \"100\"}}}");
      // pmvTable.setSortable(true);
    }
    return pmvTable;
  }

  /**
   * This method initializes titlePane
   * 
   * @return ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel
   */
  private ULCContainer getTitlePane() {
    if (titlePane == null) {
      titlePane = RichDialogPanelFactory.create(TabHeaderBarPanel.class);
      titlePane.setName("titlePane");
      titlePane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
    }
    return titlePane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
