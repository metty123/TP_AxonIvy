package ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;

/**
 * RichDialog panel implementation for FreeDayOfYearDetailPanel.
 * 
 * @author Xpert.ivy
 * @since Tue Dec 06 14:57:40 CET 2011
 */
public class FreeDayOfYearDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {

  /** Serial version id */
  private static final long serialVersionUID = 1L;


  // grouping node (filler)
  private ch.ivyteam.ivy.richdialog.widgets.components.RFiller dataRFiller = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDescriptionRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataDescriptionRTextField = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDayRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataDayRTextField = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataMonthRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataMonthRTextField = null;


  private RButton okButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of FreeDayOfYearDetailPanel
   */
  public FreeDayOfYearDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes FreeDayOfYearDetailPanel
   * 
   * @return void
   */
  private void initialize() {
    // grouping node (filler)
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(293, 121));
    this.add(getDataFiller(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    // leaf node

    this.add(getDataDescriptionRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getDataDescriptionRTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));



    // leaf node

    this.add(getDataDayRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getDataDayRTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));



    // leaf node

    this.add(getDataMonthRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getDataMonthRTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));


    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));



  }

  // grouping node (filler)
  /**
   * This method initializes data_RFiller
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RFiller
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RFiller getDataFiller() {
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
      dataDescriptionRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/description\") %> ");
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
   * This method initializes data_day_RLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel getDataDayRLabel() {
    if (dataDayRLabel == null) {
      dataDayRLabel = new ch.ivyteam.ivy.richdialog.widgets.components.RLabel();
      dataDayRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/day\") %> ");
      dataDayRLabel.setStyleProperties("{/insetsTop \"2\"}");
      dataDayRLabel.setLabelFor(getDataDayRTextField());
      dataDayRLabel.setName("dataDayRLabel");
    }
    return dataDayRLabel;
  }

  /**
   * This method initializes data_day_RTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField getDataDayRTextField() {
    if (dataDayRTextField == null) {
      dataDayRTextField = new ch.ivyteam.ivy.richdialog.widgets.components.RTextField();

      dataDayRTextField.setText("");

      dataDayRTextField.setName("dataDayRTextField");
      dataDayRTextField.setValidation("DayOfMonth");
      dataDayRTextField.setMandatory(true);

    }
    return dataDayRTextField;
  }



  // leaf node
  /**
   * This method initializes data_month_RLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel getDataMonthRLabel() {
    if (dataMonthRLabel == null) {
      dataMonthRLabel = new ch.ivyteam.ivy.richdialog.widgets.components.RLabel();
      dataMonthRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/month\") %> ");
      dataMonthRLabel.setStyleProperties("{/insetsTop \"2\"}");
      dataMonthRLabel.setLabelFor(getDataMonthRTextField());
      dataMonthRLabel.setName("dataMonthRLabel");
    }
    return dataMonthRLabel;
  }

  /**
   * This method initializes data_month_RTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField getDataMonthRTextField() {
    if (dataMonthRTextField == null) {
      dataMonthRTextField = new ch.ivyteam.ivy.richdialog.widgets.components.RTextField();

      dataMonthRTextField.setText("");

      dataMonthRTextField.setName("dataMonthRTextField");
      dataMonthRTextField.setValidation("Month");
      dataMonthRTextField.setMandatory(true);

    }
    return dataMonthRTextField;
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



} // @jve:decl-index=0:visual-constraint="10,10"
