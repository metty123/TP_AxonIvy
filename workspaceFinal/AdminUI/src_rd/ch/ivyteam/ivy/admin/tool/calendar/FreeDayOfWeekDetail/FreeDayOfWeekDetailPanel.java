package ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfWeekDetail;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RComboBox;
import ch.ivyteam.util.date.Weekday;

/**
 * RichDialog panel implementation for FreeDayOfWeekPanel.
 * 
 * @author Axon.ivy
 * @since Tue Dec 06 14:00:26 CET 2011
 */
public class FreeDayOfWeekDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {

  /** Serial version id */
  private static final long serialVersionUID = 1L;


  // grouping node (filler)
  private ch.ivyteam.ivy.richdialog.widgets.components.RFiller dataRFiller = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDescriptionRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataDescriptionRTextField = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDayOfWeekRLabel = null;
  private RButton okButton = null;


  private RComboBox dayOfWeekComboBox = null;

  // SONAR-OFF
  /**
   * Create a new instance of FreeDayOfWeekPanel
   */
  public FreeDayOfWeekDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes FreeDayOfWeekPanel
   * 
   * @return void
   */
  private void initialize() {
    // grouping node (filler)
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(236, 82));
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

    this.add(getDataDayOfWeekRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getDayOfWeekComboBox(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));



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
      dataDescriptionRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/description\") %> ");
      dataDescriptionRLabel.setStyle("default");
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
   * This method initializes data_dayOfWeek_RLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel getDataDayOfWeekRLabel() {
    if (dataDayOfWeekRLabel == null) {
      dataDayOfWeekRLabel = new ch.ivyteam.ivy.richdialog.widgets.components.RLabel();
      dataDayOfWeekRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/day\") %> ");
      dataDayOfWeekRLabel.setStyle("default");
      dataDayOfWeekRLabel.setName("dataDayOfWeekRLabel");
    }
    return dataDayOfWeekRLabel;
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
   * This method initializes dayOfWeekComboBox
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RComboBox
   */
  private RComboBox getDayOfWeekComboBox() {
    if (dayOfWeekComboBox == null) {
      dayOfWeekComboBox = new RComboBox();
      dayOfWeekComboBox.setName("dayOfWeekComboBox");
      dayOfWeekComboBox.setMandatory(true);
      dayOfWeekComboBox.setSelectedEnumValue(Weekday.MONDAY);
      dayOfWeekComboBox
          .setModelConfiguration("{/result \"result=entry.getLocalizedName(ivy.session.contentLocale)\"/version \"3.0\"/icon \"\"/tooltip \"\"}");
    }
    return dayOfWeekComboBox;
  }



} // @jve:decl-index=0:visual-constraint="10,10"
