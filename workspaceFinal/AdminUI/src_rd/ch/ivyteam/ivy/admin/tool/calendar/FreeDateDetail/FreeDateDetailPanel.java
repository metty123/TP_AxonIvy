package ch.ivyteam.ivy.admin.tool.calendar.FreeDateDetail;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RDatePicker;

/**
 * RichDialog panel implementation for FreeDateDetailPanel.
 * 
 * @author Axon.ivy
 * @since Tue Dec 06 15:07:45 CET 2011
 */
public class FreeDateDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {

  /** Serial version id */
  private static final long serialVersionUID = 1L;


  // grouping node (filler)
  private ch.ivyteam.ivy.richdialog.widgets.components.RFiller dataRFiller = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDescriptionRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataDescriptionRTextField = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDateRLabel = null;
  private RButton okButton = null;


  private RDatePicker dateDatePicker = null;

  // SONAR-OFF
  /**
   * Create a new instance of FreeDateDetailPanel
   */
  public FreeDateDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes FreeDateDetailPanel
   * 
   * @return void
   */
  private void initialize() {
    // grouping node (filler)
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(266, 84));
    this.add(getDataRFiller(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    // leaf node

    this.add(getDataDescriptionRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getDataDescriptionRTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));



    // leaf node

    this.add(getDataDateRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDateDatePicker(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.HORIZONTAL, new com.ulcjava.base.application.util.Insets(0, 0,
            0, 0), 1, 0));



  }

  // grouping node (filler)
  /**
   * This method initializes data_RFiller
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RFiller
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RFiller getDataRFiller() {
    if (dataRFiller == null) {
      dataRFiller = new ch.ivyteam.ivy.richdialog.widgets.components.RFiller();

      dataRFiller.setStyle("default");
      dataRFiller.setName("data_RFiller");
    }
    return dataRFiller;
  }

  // leaf node
  /**
   * This method initializes data_description_RLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel getDataDescriptionRLabel() {
    if (dataDescriptionRLabel == null) {
      dataDescriptionRLabel = new ch.ivyteam.ivy.richdialog.widgets.components.RLabel();
      dataDescriptionRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/description\") %>");
      dataDescriptionRLabel.setStyleProperties("{/insetsTop \"7\"}");
      dataDescriptionRLabel.setLabelFor(getDataDescriptionRTextField());
      dataDescriptionRLabel.setName("dataDescriptionRLabel");
    }
    return dataDescriptionRLabel;
  }

  /**
   * This method initializes data_description_RTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField getDataDescriptionRTextField() {
    if (dataDescriptionRTextField == null) {
      dataDescriptionRTextField = new ch.ivyteam.ivy.richdialog.widgets.components.RTextField();

      dataDescriptionRTextField.setText("");

      dataDescriptionRTextField.setName("dataDescriptionRTextField");
      dataDescriptionRTextField.setStyleProperties("{/insetsTop \"5\"}");
      dataDescriptionRTextField.setMandatory(false);

    }
    return dataDescriptionRTextField;
  }



  // leaf node
  /**
   * This method initializes data_date_RLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel getDataDateRLabel() {
    if (dataDateRLabel == null) {
      dataDateRLabel = new ch.ivyteam.ivy.richdialog.widgets.components.RLabel();
      dataDateRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/date\") %>");
      dataDateRLabel.setStyleProperties("{/insetsTop \"2\"}");
      dataDateRLabel.setName("dataDateRLabel");
    }
    return dataDateRLabel;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("<%= ivy.cms.co(\"/Dialogs/general/ok\") %>");
      okButton.setStyle("nice_button");
      okButton.setName("okButton");
      okButton.setEnabler(this);
    }
    return okButton;
  }

  /**
   * This method initializes dateDatePicker
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RDatePicker
   */
  private RDatePicker getDateDatePicker() {
    if (dateDatePicker == null) {
      dateDatePicker = new RDatePicker();
      dateDatePicker.setName("dateDatePicker");
      dateDatePicker.setStyleProperties("{/insetsBottom \"5\"/insetsRight \"5\"}");
      dateDatePicker.setMandatory(true);
      dateDatePicker.setCornerRadius(0);
    }
    return dateDatePicker;
  }



} // @jve:decl-index=0:visual-constraint="10,21"
