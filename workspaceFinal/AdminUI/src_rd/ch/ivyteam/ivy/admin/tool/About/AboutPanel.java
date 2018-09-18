package ch.ivyteam.ivy.admin.tool.About;

import ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.EmbeddedRichDialog;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.exec.panel.RichDialogPanelFactory;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RFiller;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;
import com.ulcjava.base.application.ULCContainer;
import com.ulcjava.base.application.border.ULCTitledBorder;
import com.ulcjava.base.application.util.Color;
import com.ulcjava.base.application.util.Font;

/**
 * RichDialog panel implementation for AboutPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class AboutPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  private static final String R_TEXT_FIELD = "RTextField";
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel productLabel = null;
  private RTextField productTextField = null;
  private RLabel versionLabel = null;
  private RLabel buildLabel = null;
  private RTextField versionTextField = null;
  private RTextField buildTextField = null;
  private RGridBagLayoutPane titlePane = null;
  private RGridBagLayoutPane xpertIvyPane = null;
  private RGridBagLayoutPane javaPane = null;
  private RLabel javaProductLabel = null;
  private RLabel javaVersionLabel = null;
  private RTextField javaProductTextField = null;
  private RTextField javaVersionTextField = null;
  private RLabel javaVendorLabel = null;
  private RTextField javaVendorTextField = null;
  private RLabel javaSystemPropertiesLabel = null;
  private RScrollPane javaPropertiesScrollPane = null;
  private RTable javaSystemPropertiesTable = null;
  private RLabel copyrightLabel = null;
  private RTextField copyrightTextField = null;
  @EmbeddedRichDialog(TabHeaderBarPanel.class)
  private ULCContainer headerPane = null;
  private RLabel dbSystemLabel = null;
  private RTextField dbSystemTextField = null;
  private RGridBagLayoutPane databasePane = null;
  private RLabel dbProductLabel = null;
  private RTextField dbProductTextField = null;
  private RLabel dbVersionLabel = null;
  private RTextField dbVersionTextField = null;
  private RGridBagLayoutPane licensePane = null;
  private RLabel licenseTypeLabel = null;
  private RTextField licenseTypeTextField = null;
  private RLabel UsersLimitLabel = null;
  private RTextField licenseUsersLimitTextField = null;
  private RLabel licenseSessionLabel = null;
  private RTextField licenseSessionTextField = null;
  private RLabel licenseProcessLimitLabel = null;
  private RTextField licenseProcessElementsLimitTextField = null;
  private RLabel licenseCurrentUsers = null;
  private RTextField licenseCurrentUsedUsersTextField = null;

  // SONAR-OFF
  /**
   * Create a new instance of AboutPanel
   */
  public AboutPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes AboutPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(548, 372));
    this.add(getTitlePane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 3, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getXpertIvyPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getLicensePane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDatabasePane(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getJavaPane(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes productLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getProductLabel() {
    if (productLabel == null) {
      productLabel = new RLabel();
      productLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/product\") %>");
      productLabel.setStyleProperties("{/insetsTop \"2\"}");
      productLabel.setName("productLabel");
    }
    return productLabel;
  }

  /**
   * This method initializes productTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getProductTextField() {
    if (productTextField == null) {
      productTextField = new RTextField();
      productTextField.setText("");
      productTextField.setEditable(false);
      productTextField.setDisabledTextColor(Color.lightGray);
      productTextField.setName("productTextField");
    }
    return productTextField;
  }

  /**
   * This method initializes versionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getVersionLabel() {
    if (versionLabel == null) {
      versionLabel = new RLabel();
      versionLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/productVersion\") %>");
      versionLabel.setStyleProperties("{/insetsTop \"2\"}");
      versionLabel.setName("versionLabel");
    }
    return versionLabel;
  }

  /**
   * This method initializes buildLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getBuildLabel() {
    if (buildLabel == null) {
      buildLabel = new RLabel();
      buildLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/productBuild\") %>");
      buildLabel.setStyleProperties("{/insetsTop \"2\"}");
      buildLabel.setName("buildLabel");
    }
    return buildLabel;
  }

  /**
   * This method initializes versionTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getVersionTextField() {
    if (versionTextField == null) {
      versionTextField = new RTextField();
      versionTextField.setValueAsString("");
      versionTextField.setText(R_TEXT_FIELD);
      versionTextField.setEditable(false);
      versionTextField.setDisabledTextColor(Color.lightGray);
      versionTextField.setName("versionTextField");
    }
    return versionTextField;
  }

  /**
   * This method initializes buildTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getBuildTextField() {
    if (buildTextField == null) {
      buildTextField = new RTextField();
      buildTextField.setValueAsString("");
      buildTextField.setText(R_TEXT_FIELD);
      buildTextField.setEditable(false);
      buildTextField.setDisabledTextColor(Color.lightGray);
      buildTextField.setName("buildTextField");
    }
    return buildTextField;
  }

  /**
   * This method initializes titlePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getTitlePane() {
    if (titlePane == null) {
      titlePane = new RGridBagLayoutPane();
      titlePane.setName("titlePane");
      titlePane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      titlePane.add(getHeaderPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return titlePane;
  }

  /**
   * This method initializes xpertIvyPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getXpertIvyPane() {
    if (xpertIvyPane == null) {
      ULCTitledBorder ULCTitledBorder = BorderFactory.createTitledBorder("Axon.ivy");
      ULCTitledBorder.setTitleFont(new Font("Tahoma", 0, 11));
      ULCTitledBorder.setBorder(null);
      ULCTitledBorder.setTitle("<%=ivy.cms.co(\"/Dialogs/about/productTitle\")%>");
      ULCTitledBorder.setTitleColor(new Color(23, 64, 140));
      RFiller filler = new RFiller();
      filler
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"135\"/preferredSizeHeight \"0\"}");
      xpertIvyPane = new RGridBagLayoutPane();
      xpertIvyPane.setName("xpertIvyPane");
      xpertIvyPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/insetsLeft \"5\"}");
      xpertIvyPane.setBorder(ULCTitledBorder);
      xpertIvyPane.setForeground(Color.darkGray);
      xpertIvyPane.setBorder(ULCTitledBorder);
      xpertIvyPane.add(getProductLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getProductTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getVersionTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getBuildLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getBuildTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getCopyrightLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(getCopyrightTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      xpertIvyPane.add(filler, new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return xpertIvyPane;
  }

  /**
   * This method initializes javaPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getJavaPane() {
    if (javaPane == null) {
      ULCTitledBorder ULCTitledBorder3 = BorderFactory.createTitledBorder("Java");
      ULCTitledBorder3.setTitleColor(new Color(23, 64, 140));
      ULCTitledBorder3.setTitle("<%=ivy.cms.co(\"/Dialogs/about/javaTitle\")%>");
      RFiller filler4 = new RFiller();
      filler4
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"135\"/preferredSizeHeight \"0\"}");
      javaPane = new RGridBagLayoutPane();
      javaPane.setName("javaPane");
      javaPane.setBorder(BorderFactory.createTitledBorder("Java"));
      javaPane.setStyleProperties("{/insetsLeft \"5\"}");
      javaPane.setBorder(ULCTitledBorder3);
      javaPane.add(getJavaProductLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaProductTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaVersionTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaVendorLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaVendorTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaSystemPropertiesLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(filler4, new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      javaPane.add(getJavaPropertiesScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return javaPane;
  }

  /**
   * This method initializes javaProductLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getJavaProductLabel() {
    if (javaProductLabel == null) {
      javaProductLabel = new RLabel();
      javaProductLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/javaProduct\") %>");
      javaProductLabel.setStyleProperties("{/insetsTop \"2\"}");
      javaProductLabel.setName("javaProductLabel");
    }
    return javaProductLabel;
  }

  /**
   * This method initializes javaVersionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getJavaVersionLabel() {
    if (javaVersionLabel == null) {
      javaVersionLabel = new RLabel();
      javaVersionLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/javaVersion\") %>");
      javaVersionLabel.setStyleProperties("{/insetsTop \"2\"}");
      javaVersionLabel.setName("javaVersionLabel");
    }
    return javaVersionLabel;
  }

  /**
   * This method initializes javaProductTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getJavaProductTextField() {
    if (javaProductTextField == null) {
      javaProductTextField = new RTextField();
      javaProductTextField.setText(R_TEXT_FIELD);
      javaProductTextField.setEditable(false);
      javaProductTextField.setDisabledTextColor(Color.lightGray);
      javaProductTextField.setName("javaProductTextField");
    }
    return javaProductTextField;
  }

  /**
   * This method initializes javaVersionTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getJavaVersionTextField() {
    if (javaVersionTextField == null) {
      javaVersionTextField = new RTextField();
      javaVersionTextField.setText(R_TEXT_FIELD);
      javaVersionTextField.setEditable(false);
      javaVersionTextField.setDisabledTextColor(Color.lightGray);
      javaVersionTextField.setName("javaVersionTextField");
    }
    return javaVersionTextField;
  }

  /**
   * This method initializes javaVendorLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getJavaVendorLabel() {
    if (javaVendorLabel == null) {
      javaVendorLabel = new RLabel();
      javaVendorLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/javaVendor\") %>");
      javaVendorLabel.setStyleProperties("{/insetsTop \"2\"}");
      javaVendorLabel.setName("javaVendorLabel");
    }
    return javaVendorLabel;
  }

  /**
   * This method initializes javaVendorTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getJavaVendorTextField() {
    if (javaVendorTextField == null) {
      javaVendorTextField = new RTextField();
      javaVendorTextField.setText(R_TEXT_FIELD);
      javaVendorTextField.setEditable(false);
      javaVendorTextField.setDisabledTextColor(Color.lightGray);
      javaVendorTextField.setName("javaVendorTextField");
    }
    return javaVendorTextField;
  }

  /**
   * This method initializes javaSystemPropertiesLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getJavaSystemPropertiesLabel() {
    if (javaSystemPropertiesLabel == null) {
      javaSystemPropertiesLabel = new RLabel();
      javaSystemPropertiesLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/javaSystemProperties\") %>");
      javaSystemPropertiesLabel.setStyleProperties("{/anchor \"NORTHWEST\"/insetsTop \"2\"}");
      javaSystemPropertiesLabel.setName("javaSystemPropertiesLabel");
    }
    return javaSystemPropertiesLabel;
  }

  /**
   * This method initializes javaPropertiesScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getJavaPropertiesScrollPane() {
    if (javaPropertiesScrollPane == null) {
      javaPropertiesScrollPane = new RScrollPane();
      javaPropertiesScrollPane.setName("javaPropertiesScrollPane");
      javaPropertiesScrollPane.setViewPortView(getJavaSystemPropertiesTable());
    }
    return javaPropertiesScrollPane;
  }

  /**
   * This method initializes javaSystemPropertiesTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getJavaSystemPropertiesTable() {
    if (javaSystemPropertiesTable == null) {
      javaSystemPropertiesTable = new RTable();
      javaSystemPropertiesTable.setName("javaSystemPropertiesTable");
      javaSystemPropertiesTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /columns {{/result \"result=value\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Name\"/field \"Name\"/columnWidth \"200\"}{/result \"result=value\"/version \"2.0\"/tooltip \"\"/icon \"\"/header \"Value\"/field \"Value\"/columnWidth \"500\"}}}");
    }
    return javaSystemPropertiesTable;
  }

  /**
   * This method initializes copyrightLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getCopyrightLabel() {
    if (copyrightLabel == null) {
      copyrightLabel = new RLabel();
      copyrightLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/productCopyright\") %>");
      copyrightLabel.setStyleProperties("{/insetsTop \"2\"}");
      copyrightLabel.setName("copyrightLabel");
    }
    return copyrightLabel;
  }

  /**
   * This method initializes copyrightTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getCopyrightTextField() {
    if (copyrightTextField == null) {
      copyrightTextField = new RTextField();
      copyrightTextField.setValueAsString("");
      copyrightTextField.setText(R_TEXT_FIELD);
      copyrightTextField.setEditable(false);
      copyrightTextField.setDisabledTextColor(Color.lightGray);
      copyrightTextField.setName("copyrightTextField");
    }
    return copyrightTextField;
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
    }
    return headerPane;
  }

  /**
   * This method initializes dbSystemLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDbSystemLabel() {
    if (dbSystemLabel == null) {
      dbSystemLabel = new RLabel();
      dbSystemLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/databaseUrl\") %>");
      dbSystemLabel.setStyleProperties("{/anchor \"NORTHWEST\"/insetsTop \"2\"}");
      dbSystemLabel.setName("dbSystemLabel");
    }
    return dbSystemLabel;
  }

  /**
   * This method initializes dbSystemTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDbSystemTextField() {
    if (dbSystemTextField == null) {
      dbSystemTextField = new RTextField();
      dbSystemTextField.setText("");
      dbSystemTextField.setEditable(false);
      dbSystemTextField.setDisabledTextColor(Color.lightGray);
      dbSystemTextField.setName("dbSystemTextField");
    }
    return dbSystemTextField;
  }

  /**
   * This method initializes databasePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getDatabasePane() {
    if (databasePane == null) {
      ULCTitledBorder ULCTitledBorder2 =
          BorderFactory.createTitledBorder(null, "Database", ULCTitledBorder.LEADING, ULCTitledBorder.DEFAULT_POSITION,
              new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140));
      ULCTitledBorder2.setTitle("<%=ivy.cms.co(\"/Dialogs/about/databaseTitle\")%>");
      ULCTitledBorder2.setBorder(null);
      RFiller filler1 = new RFiller();
      filler1
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"135\"/preferredSizeHeight \"0\"}");
      databasePane = new RGridBagLayoutPane();
      databasePane.setName("databasePane");
      databasePane.setBorder(BorderFactory.createTitledBorder(null, "Database", ULCTitledBorder.LEADING,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      databasePane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/insetsLeft \"5\"}");
      databasePane.setBorder(ULCTitledBorder2);
      databasePane.add(getDbProductLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      databasePane.add(getDbSystemLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      databasePane.add(getDbSystemTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      databasePane.add(getDbProductTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      databasePane.add(getDbVersionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      databasePane.add(getDbVersionTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      databasePane.add(filler1, new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return databasePane;
  }

  /**
   * This method initializes dbProductLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDbProductLabel() {
    if (dbProductLabel == null) {
      dbProductLabel = new RLabel();
      dbProductLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/databaseProduct\") %>");
      dbProductLabel.setStyleProperties("{/insetsTop \"2\"}");
      dbProductLabel.setName("dbProductLabel");
    }
    return dbProductLabel;
  }

  /**
   * This method initializes dbProductTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDbProductTextField() {
    if (dbProductTextField == null) {
      dbProductTextField = new RTextField();
      dbProductTextField.setText("");
      dbProductTextField.setEditable(false);
      dbProductTextField.setDisabledTextColor(Color.lightGray);
      dbProductTextField.setName("dbProductTextField");
    }
    return dbProductTextField;
  }

  /**
   * This method initializes dbVersionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getDbVersionLabel() {
    if (dbVersionLabel == null) {
      dbVersionLabel = new RLabel();
      dbVersionLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/databaseVersion\") %>");
      dbVersionLabel.setStyleProperties("{/insetsTop \"2\"}");
      dbVersionLabel.setName("dbVersionLabel");
    }
    return dbVersionLabel;
  }

  /**
   * This method initializes dbVersionTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getDbVersionTextField() {
    if (dbVersionTextField == null) {
      dbVersionTextField = new RTextField();
      dbVersionTextField.setText("");
      dbVersionTextField.setEditable(false);
      dbVersionTextField.setDisabledTextColor(Color.lightGray);
      dbVersionTextField.setName("dbVersionTextField");
    }
    return dbVersionTextField;
  }

  /**
   * This method initializes licensePane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getLicensePane() {
    if (licensePane == null) {
      ULCTitledBorder ULCTitledBorder1 =
          BorderFactory.createTitledBorder(null, "License", ULCTitledBorder.DEFAULT_JUSTIFICATION,
              ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140));
      ULCTitledBorder1.setTitle("<%= ivy.cms.co(\"/Dialogs/about/license\") %>");
      ULCTitledBorder1.setBorder(null);
      RFiller filler3 = new RFiller();
      filler3
          .setStyleProperties("{/usePreferredSizeAsExactSize \"true\"/preferredSizeWidth \"135\"/preferredSizeHeight \"0\"}");
      licensePane = new RGridBagLayoutPane();
      licensePane.setName("licensePane");
      licensePane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"/insetsLeft \"5\"}");
      licensePane.setToolTipText("");
      licensePane.setBorder(ULCTitledBorder1);
      licensePane.setBorder(BorderFactory.createTitledBorder(null, "License", ULCTitledBorder.DEFAULT_JUSTIFICATION,
          ULCTitledBorder.DEFAULT_POSITION, new Font("Tahoma", Font.PLAIN, 11), new Color(23, 64, 140)));
      licensePane.add(getLicenseTypeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseTypeTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getUsersLimitLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseUsersLimitTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseSessionLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 5, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseSessionTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 5, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseProcessLimitLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseProcessElementsLimitTextField(), new com.ulcjava.base.application.GridBagConstraints(1,
          4, 1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseCurrentUsers(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(getLicenseCurrentUsedUsersTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 3,
          1, 1, -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      licensePane.add(filler3, new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return licensePane;
  }

  /**
   * This method initializes licenseTypeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLicenseTypeLabel() {
    if (licenseTypeLabel == null) {
      licenseTypeLabel = new RLabel();
      licenseTypeLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/licenseType\") %>");
      licenseTypeLabel.setStyleProperties("{/insetsTop \"2\"}");
      licenseTypeLabel.setName("licenseTypeLabel");
    }
    return licenseTypeLabel;
  }

  /**
   * This method initializes licenseTypeTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLicenseTypeTextField() {
    if (licenseTypeTextField == null) {
      licenseTypeTextField = new RTextField();
      licenseTypeTextField.setText("");
      licenseTypeTextField.setEditable(false);
      licenseTypeTextField.setValueAsString("");
      licenseTypeTextField.setName("licenseTypeTextField");
    }
    return licenseTypeTextField;
  }

  /**
   * This method initializes UsersLimitLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getUsersLimitLabel() {
    if (UsersLimitLabel == null) {
      UsersLimitLabel = new RLabel();
      UsersLimitLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/licenseUsersLimit\") %>");
      UsersLimitLabel.setStyleProperties("{/insetsTop \"2\"}");
      UsersLimitLabel.setName("UsersLimitLabel");
    }
    return UsersLimitLabel;
  }

  /**
   * This method initializes licenseUsersLimitTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLicenseUsersLimitTextField() {
    if (licenseUsersLimitTextField == null) {
      licenseUsersLimitTextField = new RTextField();
      licenseUsersLimitTextField.setText("");
      licenseUsersLimitTextField.setEditable(false);
      licenseUsersLimitTextField.setName("licenseUsersLimitTextField");
    }
    return licenseUsersLimitTextField;
  }

  /**
   * This method initializes licenseSessionLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLicenseSessionLabel() {
    if (licenseSessionLabel == null) {
      licenseSessionLabel = new RLabel();
      licenseSessionLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/licenseSessionLimit\") %>");
      licenseSessionLabel.setStyleProperties("{/insetsTop \"2\"}");
      licenseSessionLabel.setName("licenseSessionLabel");
    }
    return licenseSessionLabel;
  }

  /**
   * This method initializes licenseSessionTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLicenseSessionTextField() {
    if (licenseSessionTextField == null) {
      licenseSessionTextField = new RTextField();
      licenseSessionTextField.setText("");
      licenseSessionTextField.setEditable(false);
      licenseSessionTextField.setName("licenseSessionTextField");
    }
    return licenseSessionTextField;
  }

  /**
   * This method initializes licenseProcessLimitLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLicenseProcessLimitLabel() {
    if (licenseProcessLimitLabel == null) {
      licenseProcessLimitLabel = new RLabel();
      licenseProcessLimitLabel.setText("<%= ivy.cms.co(\"/Dialogs/about/licenseProcessLimit\") %>");
      licenseProcessLimitLabel.setStyleProperties("{/insetsTop \"2\"}");
      licenseProcessLimitLabel.setName("licenseProcessLimitLabel");
    }
    return licenseProcessLimitLabel;
  }

  /**
   * This method initializes licenseProcessElementsLimitTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLicenseProcessElementsLimitTextField() {
    if (licenseProcessElementsLimitTextField == null) {
      licenseProcessElementsLimitTextField = new RTextField();
      licenseProcessElementsLimitTextField.setText("");
      licenseProcessElementsLimitTextField.setEditable(false);
      licenseProcessElementsLimitTextField.setName("licenseProcessElementsLimitTextField");
    }
    return licenseProcessElementsLimitTextField;
  }

  /**
   * This method initializes licenseCurrentUsers
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getLicenseCurrentUsers() {
    if (licenseCurrentUsers == null) {
      licenseCurrentUsers = new RLabel();
      licenseCurrentUsers.setText("<%= ivy.cms.co(\"/Dialogs/about/licenseTotalUsers\") %>");
      licenseCurrentUsers.setStyleProperties("{/insetsTop \"2\"}");
      licenseCurrentUsers.setName("licenseCurrentUsers");
    }
    return licenseCurrentUsers;
  }

  /**
   * This method initializes licenseCurrentUsedUsersTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private RTextField getLicenseCurrentUsedUsersTextField() {
    if (licenseCurrentUsedUsersTextField == null) {
      licenseCurrentUsedUsersTextField = new RTextField();
      licenseCurrentUsedUsersTextField.setText("");
      licenseCurrentUsedUsersTextField.setEditable(false);
      licenseCurrentUsedUsersTextField.setName("licenseCurrentUsedUsersTextField");
    }
    return licenseCurrentUsedUsersTextField;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
