package ch.ivyteam.ivy.admin.tool.restclient.RestClientDetails;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.customrenderers.RTextFieldCellWidget;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.IEditorComponent;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.table.DefaultTableCellRenderer;
import com.ulcjava.base.application.table.ITableCellEditor;
import com.ulcjava.base.application.table.ULCTableColumn;
import com.ulcjava.base.application.util.Font;
import com.ulcjava.base.application.util.Color;

import ch.ivyteam.ivy.richdialog.widgets.menus.RCheckBoxMenuItem;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
import ch.ivyteam.ivy.richdialog.widgets.components.RButtonGroup;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;

import com.ulcjava.base.application.util.ComponentOrientation;
import com.ulcjava.base.application.ULCLabel;

import ch.ivyteam.ivy.richdialog.widgets.components.RTable;

import com.ulcjava.base.application.event.KeyEvent;

import ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField;

import com.ulcjava.base.application.ULCTable;

import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.containers.RCollapsiblePane;

import com.ulcjava.base.application.ULCAbstractButton;

import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

/**
 * <p>RestClientDetailsPanel is a rich dialog panel implementation.
 *
 * <p>Please note that a rich dialog panel is not an instance of a Swing 
 * container, but of an ULCContainer. As such it can not be run 
 * or instantiated outside the ULC framework.
 */
@SuppressWarnings("all")
public class RestClientDetailsPanel extends RichDialogGridBagPanel 
implements IRichDialogPanel 
{ 
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel header = null;
  private RLabel uuidLabel = null;
  private RTextField uuidTextField = null;
  private RLabel nameLabel = null;
  private RTextField nameTextField = null;
  private RLabel descriptionLabel = null;
  private RTextArea descriptionTextArea = null;
  private RScrollPane decriptionScrollPane = null;
  private RGridBagLayoutPane authenticationPane = null;
  private RLabel typeLabel = null;
  private RLabel usernameLabel = null;
  private RLabel passwordLabel = null;
  private RCheckBox httpBasicType = null;
  private RCheckBox httpDigestType = null;
  private RTextField usernameTextField = null;
  private RFlowLayoutPane anthenticationTypes = null;
  private RGridBagLayoutPane featurePane = null;
  private RScrollPane featureScrollPane = null;
  private RTable featureTable = null;
  private RGridBagLayoutPane propertiesPane = null;
  private RLabel uriLabel = null;
  private RTextField uriTextField = null;
  private RScrollPane propertiesScrollPane = null;
  private RTable propertiesTable = null;
  private RPasswordField passwordField = null;
  private RButton addFeatureButton = null;
  private RButton removeFeatureButton = null;
  private RGridBagLayoutPane featureActionButtons = null;
  private RGridBagLayoutPane propertiesActionButtons = null;
  private RButton addPropertyButton = null;
  private RButton addPasswordPropertyButton = null;
  private RButton removePropertyButton = null;
  private RCheckBox jsonCheckBox = null;
  private RButton setToDefaultButton = null;
  private RButton saveButton = null;
  private RButton cancelButton = null;
  private RFlowLayoutPane restClientActionButtons = null;
  /**
   * Create a new instance of RestClientDetailsPanel
   */
  public RestClientDetailsPanel()
  {
    super();
    initialize();
  }
  
  /**
   * This method initializes RestClientDetailsPanel
   * @return void
   */
  private void initialize()
  {
        this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(458,485));
        this.add(getHeader(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 2, 1, 0.0, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getUuidLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getUuidTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getNameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getNameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getDescriptionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getDecriptionScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getUriLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getUriTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getAuthenticationPane(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getFeaturePane(), new com.ulcjava.base.application.GridBagConstraints(0, 6, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getPropertiesPane(), new com.ulcjava.base.application.GridBagConstraints(0, 7, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
        this.add(getRestClientActionButtons(), new com.ulcjava.base.application.GridBagConstraints(0, 8, 2, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
  }

  /**
   * This method initializes header	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getHeader() {
    if (header == null) {
      header = new RLabel();
      header.setText("Rest Client Details");
      header.setStyle("mainCaption");
      header.setBackground(new Color(244, 247, 255));
      header.setName("header");
    }
    return header;
  }

  /**
   * This method initializes uuidLabel	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getUuidLabel() {
    if (uuidLabel == null) {
      uuidLabel = new RLabel();
      uuidLabel.setText("UUID");
      uuidLabel.setStyleProperties("{/insetsTop \"0\"}");
      uuidLabel.setName("uuidLabel");
    }
    return uuidLabel;
  }

  /**
   * This method initializes uuidTextField	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
   */
  private RTextField getUuidTextField() {
    if (uuidTextField == null) {
      uuidTextField = new RTextField();
      uuidTextField.setText("");
      uuidTextField.setEditable(false);
      uuidTextField.setStyleProperties("{/insetsRight \"10\"}");
      uuidTextField.setName("uuidTextField");
    }
    return uuidTextField;
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
      nameLabel.setStyleProperties("{/insetsTop \"0\"}");
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
      nameTextField.setText("");
      nameTextField.setComponentOrientation(ComponentOrientation.UNKNOWN);
      nameTextField.setEnabled(false);
      nameTextField.setEditable(false);
      nameTextField.setStyleProperties("{/insetsRight \"10\"}");
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
      descriptionLabel.setStyleProperties("{/insetsTop \"0\"}");
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
      descriptionTextArea.setText("");
      descriptionTextArea.setRows(4);
      descriptionTextArea.setEditable(true);
      descriptionTextArea.setName("descriptionTextArea");
    }
    return descriptionTextArea;
  }

  /**
   * This method initializes decriptionScrollPane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
   */
  private RScrollPane getDecriptionScrollPane() {
    if (decriptionScrollPane == null) {
      decriptionScrollPane = new RScrollPane();
      decriptionScrollPane.setName("decriptionScrollPane");
      decriptionScrollPane.setStyleProperties("{/insetsBottom \"5\"/fill \"BOTH\"/insetsRight \"10\"/weightY \"1\"/weightX \"1\"}");
      decriptionScrollPane.setViewPortView(getDescriptionTextArea());
    }
    return decriptionScrollPane;
  }

  /**
   * This method initializes authenticationPane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane	
   */
  private RGridBagLayoutPane getAuthenticationPane() {
    if (authenticationPane == null) {
      authenticationPane = new RGridBagLayoutPane();
      authenticationPane.setName("authenticationPane");
      authenticationPane.setBorder(BorderFactory.createTitledBorder(null, "Authentication", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      authenticationPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/weightX \"1\"}");
      authenticationPane.add(getTypeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 0.0, 0.0D, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      authenticationPane.add(getAnthenticationTypes(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, 0.0, -1, com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      authenticationPane.add(getUsernameLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, 0.0D, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      authenticationPane.add(getUsernameTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      authenticationPane.add(getPasswordLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, 0.0D, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      authenticationPane.add(getPasswordField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    }
    return authenticationPane;
  }

  /**
   * This method initializes typeLabel	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getTypeLabel() {
    if (typeLabel == null) {
      typeLabel = new RLabel();
      typeLabel.setText("Type");
      typeLabel.setVerticalTextPosition(ULCLabel.TOP);
      typeLabel.setComponentOrientation(ComponentOrientation.UNKNOWN);
      typeLabel.setBackground(new Color(244, 247, 255));
      typeLabel.setStyleProperties("{/insetsLeft \"0\"}");
      typeLabel.setName("typeLabel");
    }
    return typeLabel;
  }

  /**
   * This method initializes usernameLabel	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getUsernameLabel() {
    if (usernameLabel == null) {
      usernameLabel = new RLabel();
      usernameLabel.setText("Username");
      usernameLabel.setStyleProperties("{/insetsTop \"0\"/insetsLeft \"0\"}");
      usernameLabel.setName("usernameLabel");
    }
    return usernameLabel;
  }

  /**
   * This method initializes passwordLabel	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getPasswordLabel() {
    if (passwordLabel == null) {
      passwordLabel = new RLabel();
      passwordLabel.setText("Password");
      passwordLabel.setStyleProperties("{/insetsTop \"0\"/insetsLeft \"0\"}");
      passwordLabel.setName("passwordLabel");
    }
    return passwordLabel;
  }

  /**
   * This method initializes httpBasicType	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox	
   */
  private RCheckBox getHttpBasicType() {
    if (httpBasicType == null) {
      httpBasicType = new RCheckBox();
      httpBasicType.setText("HTTP Basic");
      httpBasicType.setName("httpBasicType");
    }
    return httpBasicType;
  }

  /**
   * This method initializes httpDigestType	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox	
   */
  private RCheckBox getHttpDigestType() {
    if (httpDigestType == null) {
      httpDigestType = new RCheckBox();
      httpDigestType.setText("HTTP Digest");
      httpDigestType.setName("httpDigestType");
    }
    return httpDigestType;
  }

  /**
   * This method initializes usernameTextField	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
   */
  private RTextField getUsernameTextField() {
    if (usernameTextField == null) {
      usernameTextField = new RTextField();
      usernameTextField.setText("");
      usernameTextField.setName("usernameTextField");
    }
    return usernameTextField;
  }

  /**
   * This method initializes anthenticationTypes	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane	
   */
  private RFlowLayoutPane getAnthenticationTypes() {
    if (anthenticationTypes == null) {
      anthenticationTypes = new RFlowLayoutPane();
      anthenticationTypes.setName("anthenticationTypes");
      anthenticationTypes.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
      anthenticationTypes.setStyleProperties("{/insetsLeft \"-10\"}");
      anthenticationTypes.setVgap(0);
      anthenticationTypes.add(getHttpBasicType());
      anthenticationTypes.add(getHttpDigestType());
    }
    return anthenticationTypes;
  }

  /**
   * This method initializes featurePane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane	
   */
  private RGridBagLayoutPane getFeaturePane() {
    if (featurePane == null) {
      featurePane = new RGridBagLayoutPane();
      featurePane.setName("featurePane");
      featurePane.setBorder(BorderFactory.createTitledBorder(null, "Feature", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      featurePane.add(getFeatureScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 2, 1.0D, 1.0D, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      featurePane.add(getFeatureActionButtons(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.NORTH, com.ulcjava.base.application.GridBagConstraints.VERTICAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      featurePane.add(getJsonCheckBox(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    }
    return featurePane;
  }

  /**
   * This method initializes featureScrollPane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
   */
  private RScrollPane getFeatureScrollPane() {
    if (featureScrollPane == null) {
      featureScrollPane = new RScrollPane();
      featureScrollPane.setName("featureScrollPane");
      featureScrollPane.setViewPortView(getFeatureTable());
    }
    return featureScrollPane;
  }

  /**
   * This method initializes featureTable	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable	
   */
  private RTable getFeatureTable() {
    if (featureTable == null) {
      featureTable = new RTable();
      featureTable.setName("featureTable");
      featureTable.setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Class\\\"\"/headerAlignment \"default\"/field \"clazz\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}}}");
      featureTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      featureTable.setSortable(true);
    }
    return featureTable;
  }

  /**
   * This method initializes propertiesPane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane	
   */
  private RGridBagLayoutPane getPropertiesPane() {
    if (propertiesPane == null) {
      propertiesPane = new RGridBagLayoutPane();
      propertiesPane.setName("propertiesPane");
      propertiesPane.setBorder(BorderFactory.createTitledBorder(null, "Properties", ULCTitledBorder.DEFAULT_JUSTIFICATION, ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      propertiesPane.add(getPropertiesScrollPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      propertiesPane.add(getPropertiesActionButtons(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    }
    return propertiesPane;
  }

  /**
   * This method initializes uriLabel	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel	
   */
  private RLabel getUriLabel() {
    if (uriLabel == null) {
      uriLabel = new RLabel();
      uriLabel.setText("URI");
      uriLabel.setDisplayedMnemonic(KeyEvent.VK_UNDEFINED);
      uriLabel.setStyleProperties("{/insetsTop \"0\"}");
      uriLabel.setName("uriLabel");
    }
    return uriLabel;
  }

  /**
   * This method initializes uriTextField	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField	
   */
  private RTextField getUriTextField() {
    if (uriTextField == null) {
      uriTextField = new RTextField();
      uriTextField.setText("");
      uriTextField.setStyleProperties("{/insetsRight \"10\"}");
      uriTextField.setName("uriTextField");
    }
    return uriTextField;
  }

  /**
   * This method initializes propertiesScrollPane	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane	
   */
  private RScrollPane getPropertiesScrollPane() {
    if (propertiesScrollPane == null) {
      propertiesScrollPane = new RScrollPane();
      propertiesScrollPane.setName("propertiesScrollPane");
      propertiesScrollPane.setViewPortView(getPropertiesTable());
    }
    return propertiesScrollPane;
  }

  /**
   * This method initializes propertiesTable	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable	
   */
  private RTable getPropertiesTable() {
    if (propertiesTable == null) {
      propertiesTable = new RTable();
      propertiesTable.setName("propertiesTable");
      propertiesTable.setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Name\\\"\"/headerAlignment \"default\"/field \"name\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}{/result \"result=entry.password ? \\\"******\\\" : value\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Value\\\"\"/headerAlignment \"default\"/field \"value\"/editable \"\"/condition \"\"/columnStyle \"default\"/cellWidget \"\"}}}");
      propertiesTable.setAutoResizeMode(ULCTable.AUTO_RESIZE_ALL_COLUMNS);
      propertiesTable.setSortable(true);
    }
    return propertiesTable;
  }

  /**
   * This method initializes passwordField	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RPasswordField	
   */
  private RPasswordField getPasswordField() {
    if (passwordField == null) {
      passwordField = new RPasswordField();
      passwordField.setText("");
      passwordField.setName("passwordField");
    }
    return passwordField;
  }

  /**
   * This method initializes addFeatureButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getAddFeatureButton() {
    if (addFeatureButton == null) {
      addFeatureButton = new RButton();
      addFeatureButton.setText("Add");
      addFeatureButton.setVerticalAlignment(ULCAbstractButton.TOP);
      addFeatureButton.setName("addFeatureButton");
    }
    return addFeatureButton;
  }

  /**
   * This method initializes removeFeatureButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getRemoveFeatureButton() {
    if (removeFeatureButton == null) {
      removeFeatureButton = new RButton();
      removeFeatureButton.setText("Remove");
      removeFeatureButton.setVerticalAlignment(ULCAbstractButton.TOP);
      removeFeatureButton.setName("removeFeatureButton");
    }
    return removeFeatureButton;
  }

  /**
   * This method initializes featureActionButtons	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane	
   */
  private RGridBagLayoutPane getFeatureActionButtons() {
    if (featureActionButtons == null) {
      featureActionButtons = new RGridBagLayoutPane();
      featureActionButtons.setName("featureActionButtons");
      featureActionButtons.setStyleProperties("{/anchor \"NORTH\"/fill \"NONE\"/insetsLeft \"5\"/weightY \"0\"/weightX \"0\"}");
      featureActionButtons.add(getAddFeatureButton(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1.0D, -1, com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      featureActionButtons.add(getRemoveFeatureButton(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, 1.0D, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    }
    return featureActionButtons;
  }

  /**
   * This method initializes propertiesActionButtons	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane	
   */
  private RGridBagLayoutPane getPropertiesActionButtons() {
    if (propertiesActionButtons == null) {
      propertiesActionButtons = new RGridBagLayoutPane();
      propertiesActionButtons.setName("propertiesActionButtons");
      propertiesActionButtons.setStyleProperties("{/anchor \"NORTH\"/fill \"NONE\"/insetsLeft \"5\"/weightY \"0\"/weightX \"0\"}");
      propertiesActionButtons.add(getAddPropertyButton(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, 1.0D, -1, com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      propertiesActionButtons.add(getAddPasswordPropertyButton(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, 1.0D, -1, com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
      propertiesActionButtons.add(getRemovePropertyButton(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, 1.0D, -1, com.ulcjava.base.application.GridBagConstraints.WEST, com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0,0,0,0), 0, 0));
    }
    return propertiesActionButtons;
  }

  /**
   * This method initializes addPropertyButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getAddPropertyButton() {
    if (addPropertyButton == null) {
      addPropertyButton = new RButton();
      addPropertyButton.setName("addPropertyButton");
      addPropertyButton.setText("Add");
      addPropertyButton.setStyleProperties("{/weightY \"1\"}");
      addPropertyButton.setVerticalAlignment(ULCAbstractButton.TOP);
    }
    return addPropertyButton;
  }

  /**
   * This method initializes addPasswordPropertyButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getAddPasswordPropertyButton() {
    if (addPasswordPropertyButton == null) {
      addPasswordPropertyButton = new RButton();
      addPasswordPropertyButton.setName("addPasswordPropertyButton");
      addPasswordPropertyButton.setText("Add Password");
      addPasswordPropertyButton.setStyleProperties("{/weightY \"1\"}");
      addPasswordPropertyButton.setVerticalAlignment(ULCAbstractButton.TOP);
    }
    return addPasswordPropertyButton;
  }

  /**
   * This method initializes removePropertyButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getRemovePropertyButton() {
    if (removePropertyButton == null) {
      removePropertyButton = new RButton();
      removePropertyButton.setName("removePropertyButton");
      removePropertyButton.setText("Remove");
      removePropertyButton.setStyleProperties("{/weightY \"1\"}");
      removePropertyButton.setVerticalAlignment(ULCAbstractButton.TOP);
    }
    return removePropertyButton;
  }

  /**
   * This method initializes jsonCheckBox	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox	
   */
  private RCheckBox getJsonCheckBox() {
    if (jsonCheckBox == null) {
      jsonCheckBox = new RCheckBox();
      jsonCheckBox.setText("JSON");
      jsonCheckBox.setStyleProperties("{/insetsLeft \"-5\"}");
      jsonCheckBox.setName("jsonCheckBox");
    }
    return jsonCheckBox;
  }

  /**
   * This method initializes setToDefaultButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getSetToDefaultButton() {
    if (setToDefaultButton == null) {
      setToDefaultButton = new RButton();
      setToDefaultButton.setText("Set to default");
      setToDefaultButton.setName("setToDefaultButton");
    }
    return setToDefaultButton;
  }

  /**
   * This method initializes saveButton	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton	
   */
  private RButton getSaveButton() {
    if (saveButton == null) {
      saveButton = new RButton();
      saveButton.setText("Save");
      saveButton.setName("saveButton");
    }
    return saveButton;
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
      cancelButton.setStyleProperties("{/insetsLeft \"5\"}");
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  /**
   * This method initializes restClientDetailsButtons	
   * 	
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane	
   */
  private RFlowLayoutPane getRestClientActionButtons() {
    if (restClientActionButtons == null) {
      restClientActionButtons = new RFlowLayoutPane();
      restClientActionButtons.setName("restClientActionButtons");
      restClientActionButtons.add(getSetToDefaultButton());
      restClientActionButtons.add(getSaveButton());
      restClientActionButtons.add(getCancelButton());
    }
    return restClientActionButtons;
  }
}  //  @jve:decl-index=0:visual-constraint="10,10"