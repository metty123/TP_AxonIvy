package ch.ivyteam.ivy.rd.common.db.DatabaseCreationParameter;

import ch.ivyteam.ivy.persistence.db.DatabaseCreationParameter;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBoxLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.scripting.objects.List;

import com.ulcjava.base.application.GridBagConstraints;
import com.ulcjava.base.application.ULCComponent;
import com.ulcjava.base.application.util.Insets;

/**
 * RichDialog panel implementation for DatabaseCreationParameterUIPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
@SuppressWarnings("restriction")
public class DatabaseCreationParameterPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;

  private RGridBagLayoutPane databaseCreationParametersPane = null;

  private RButton createButton = null;

  private RButton cancelButton = null;

  private RBoxLayoutPane buttonPane = null;

  /**
   * Create a new instance of DatabaseCreationParameterUIPanel
   */
  public DatabaseCreationParameterPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes DatabaseCreationParameterUIPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(242, 187));
    this.add(getDatabaseCreationParametersPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes databaseCreationParametersPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getDatabaseCreationParametersPane() {
    if (databaseCreationParametersPane == null) {
      databaseCreationParametersPane = new RGridBagLayoutPane();
      databaseCreationParametersPane.setName("databaseCreationParametersPane");
      databaseCreationParametersPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    }
    return databaseCreationParametersPane;
  }

  /**
   * This method initializes createButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCreateButton() {
    if (createButton == null) {
      createButton = new RButton();
      createButton.setText("<%=ivy.cms.co(\"/labels/createDb\")%>");
      createButton.setName("createButton");
    }
    return createButton;
  }

  /**
   * This method initializes cancelButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new RButton();
      cancelButton.setName("cancelButton");
      cancelButton.setText("<%=ivy.cms.co(\"/labels/Cancel\")%>");
    }
    return cancelButton;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxLayoutPane
   */
  private RBoxLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RBoxLayoutPane(RBoxLayoutPane.X_AXIS);
      buttonPane.setName("buttonPane");
      buttonPane.setStyleProperties("{/anchor \"EAST\"}");
      buttonPane.add(getCancelButton());
      buttonPane.add(getCreateButton());
    }
    return buttonPane;
  }

  /**
   * Sets the database creation parameters
   * 
   * @param databaseCreationParameters the database creation parameters
   * @param dbName the database name
   */
  public void setDatabaseCreationParameters(DatabaseCreationParameter[] databaseCreationParameters, String dbName) {
    RGridBagLayoutPane filler;
    int pos = 1;
    for (DatabaseCreationParameter parameter : databaseCreationParameters) {
      initComponentsFor(parameter, pos++, dbName);
    }
    filler = new RGridBagLayoutPane();
    filler.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
    databaseCreationParametersPane.add(filler, new GridBagConstraints(1, pos, 3, 1, -1, -1, GridBagConstraints.CENTER,
        GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
  }

  public List<String> getDatabaseCreationParameters() {
    String value = null;
    int pos;
    List<String> results = List.create(String.class);

    for (ULCComponent component : databaseCreationParametersPane.getComponents()) {
      value = null;
      if (component instanceof RTextField) {
        value = ((RTextField) component).getText();
      } else if (component instanceof RComboBox) {
        value = (String) ((RComboBox) component).getSelectedItem();
      }
      if (value != null) {
        pos = databaseCreationParametersPane.getConstraints(component).getGridY();
        if (pos - 1 < results.size()) {
          results.set(pos - 1, value);
        } else {
          results.add(pos - 1, value);
        }
      }
    }
    return results;
  }

  /**
   * Initializes the components for a database creation parameter
   * 
   * @param parameter the parameter
   * @param pos the pos
   * @param dbName the db name
   */
  private void initComponentsFor(DatabaseCreationParameter parameter, int pos, String dbName) {
    RLabel label;
    final RTextField textField;
    final RComboBox comboBox;

    label = new RLabel();
    label.setText("<%=ivy.cms.co(\"/labels/databaseCreationParameters/" + parameter.getName() + "\")%>");
    label.setName("label");
    databaseCreationParametersPane.add(label, new GridBagConstraints(1, pos, 1, 1, -1, -1, GridBagConstraints.CENTER,
        GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    if (parameter.getValues() != null) {
      comboBox = new RComboBox(parameter.getValues());
      databaseCreationParametersPane.add(comboBox, new GridBagConstraints(2, pos, 2, 1, -1, -1,
          GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    } else {
      textField = new RTextField();
      if (parameter.getName().equals("databaseName")) {
        textField.setText(dbName);
      }
      databaseCreationParametersPane.add(textField, new GridBagConstraints(2, pos, 2, 1, -1, -1,
          GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
    }
  }

} // @jve:decl-index=0:visual-constraint="10,10"
