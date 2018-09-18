package ch.ivyteam.ivy.admin.tool.security.UserProperties;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.ULCAbstractButton;
import com.ulcjava.base.application.ULCTable;

/**
 * <p>
 * UserPropertiesPanel is a rich dialog panel implementation.
 * 
 * <p>
 * Please note that a rich dialog panel is not an instance of a Swing container, but of an ULCContainer. As such it can
 * not be run or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class UserPropertiesPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RScrollPane ScrollPane = null;
  private RButton cancelButton = null;
  private RButton okButton = null;
  private RButton createButton = null;
  private RButton deleteButton = null;
  private RTable propertyTable = null;
  private RGridLayoutPane buttonPane = null;
  private RButton editButton = null;
  private RGridLayoutPane toolPane = null;

  // SONAR-OFF
  /**
   * Create a new instance of UserPropertiesPanel
   */
  public UserPropertiesPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes UserPropertiesPanel
   * 
   * @return void
   */
  private void initialize() {
    this.add(getScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 3, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getToolPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 4, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
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
      ScrollPane.setStyle("fill-both");
      ScrollPane.setStyleProperties("{/insetsRight \"5\"}");
      ScrollPane.setName("ScrollPane");
      ScrollPane.setViewPortView(getPropertyTable());
    }
    return ScrollPane;
  }

  /**
   * This method initializes cancelButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new RButton();
      cancelButton.setText("Cancel");
      cancelButton
          .setStyleProperties("{/horizontalAlignment \"RIGHT\"/anchor \"EAST\"/marginRight \"5\"/marginLeft \"5\"}");
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("Ok");
      okButton.setStyleProperties("{/anchor \"EAST\"}");
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes createButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCreateButton() {
    if (createButton == null) {
      createButton = new RButton();
      createButton.setText("Add");
      createButton
          .setStyleProperties("{/minimumSizeWidth \"90\"/preferredSizeWidth \"90\"/preferredSizeHeight \"28\"/weightX \"0.1\"}");
      createButton.setName("createButton");
    }
    return createButton;
  }

  /**
   * This method initializes deleteButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getDeleteButton() {
    if (deleteButton == null) {
      deleteButton = new RButton();
      deleteButton.setText("Delete");
      deleteButton.setStyle("fill-horiz-north");
      deleteButton.setStyleProperties("{/preferredSizeWidth \"90\"/preferredSizeHeight \"28\"/weightX \"0.1\"}");
      deleteButton.setName("deleteButton");
      deleteButton.setVerticalTextPosition(ULCAbstractButton.CENTER);
      deleteButton.setVerticalAlignment(ULCAbstractButton.TOP);
      deleteButton.setEnabled(false);
    }
    return deleteButton;
  }

  /**
   * This method initializes propertyTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getPropertyTable() {
    if (propertyTable == null) {
      propertyTable = new RTable();
      propertyTable.setName("propertyTable");
      propertyTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/labels/property/name\\\")\"/field \"name\"/editable \"false\"/condition \"\"/columnWidth \"150\"/columnStyle \"\"/cellWidget \"\"}{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"ivy.cms.co(\\\"/labels/property/value\\\")\"/field \"value\"/editable \"true\"/condition \"\"/cellWidget \"\"}}}");
      propertyTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      propertyTable.setName("propertyTable");
      propertyTable.setSortable(true);
    }
    return propertyTable;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RGridLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane
          .setStyleProperties("{/anchor \"NORTH\"/insetsBottom \"0\"/insetsTop \"5\"/insetsRight \"5\"/insetsLeft \"0\"}");
      buttonPane.setHgap(5);
      buttonPane.setVgap(5);
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes editButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getEditButton() {
    if (editButton == null) {
      editButton = new RButton();
      editButton.setText("Edit");
      editButton.setStyle("fill-northwest");
      editButton.setStyleProperties("{/preferredSizeWidth \"90\"/preferredSizeHeight \"28\"/weightX \"0.1\"}");
      editButton.setName("editButton");
      editButton.setEnabled(false);
    }
    return editButton;
  }

  /**
   * This method initializes toolPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane
   */
  private RGridLayoutPane getToolPane() {
    if (toolPane == null) {
      toolPane = new RGridLayoutPane();
      toolPane.setName("toolPane");
      toolPane.setColumns(1);
      toolPane.setVgap(5);
      toolPane.setRows(0);
      toolPane.add(getCreateButton());
      toolPane.add(getEditButton());
      toolPane.add(getDeleteButton());
    }
    return toolPane;
  }
}
