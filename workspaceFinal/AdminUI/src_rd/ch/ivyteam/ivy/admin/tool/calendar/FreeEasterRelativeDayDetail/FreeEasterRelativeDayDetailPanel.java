package ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;

/**
 * RichDialog panel implementation for FreeEasterRelativeDayDetailPanel.
 * 
 * @author Axon.ivy
 * @since Tue Dec 06 12:17:13 CET 2011
 */
public class FreeEasterRelativeDayDetailPanel extends RichDialogGridBagPanel implements IRichDialogPanel {

  /** Serial version id */
  private static final long serialVersionUID = 1L;


  // grouping node (filler)
  private ch.ivyteam.ivy.richdialog.widgets.components.RFiller dataRFiller = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDaysSinceEasterRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataDaysSinceEasterRTextField = null;
  // leaf node
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel dataDescriptionRLabel = null;
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField dataDescriptionRTextField = null;


  private RButton okButton = null;


  private RLabel relativeEasterDayExamples = null;

  // SONAR-OFF
  /**
   * Create a new instance of FreeEasterRelativeDayDetailPanel
   */
  public FreeEasterRelativeDayDetailPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes FreeEasterRelativeDayDetailPanel
   * 
   * @return void
   */
  private void initialize() {
    // grouping node (filler)
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(295, 137));
    this.add(getDataRFiller(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    // leaf node

    this.add(getDataDaysSinceEasterRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getDataDaysSinceEasterRTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
        -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
        com.ulcjava.base.application.GridBagConstraints.NONE, new com.ulcjava.base.application.util.Insets(0, 0, 0, 0),
        0, 0));



    // leaf node

    this.add(getDataDescriptionRLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));

    this.add(getDataDescriptionRTextField(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));


    this.add(getOkButton(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.EAST, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getRelativeEasterDayExamples(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.BOTH,
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

      dataRFiller.setName("data_RFiller");
    }
    return dataRFiller;
  }

  // leaf node
  /**
   * This method initializes data_daysSinceEaster_RLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RLabel getDataDaysSinceEasterRLabel() {
    if (dataDaysSinceEasterRLabel == null) {
      dataDaysSinceEasterRLabel = new ch.ivyteam.ivy.richdialog.widgets.components.RLabel();
      dataDaysSinceEasterRLabel.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/daysSinceEaster\") %>");
      dataDaysSinceEasterRLabel.setStyleProperties("{/insetsTop \"2\"}");
      dataDaysSinceEasterRLabel.setLabelFor(getDataDaysSinceEasterRTextField());
      dataDaysSinceEasterRLabel.setName("dataDaysSinceEasterRLabel");
    }
    return dataDaysSinceEasterRLabel;
  }

  /**
   * This method initializes data_daysSinceEaster_RTextField
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextField
   */
  private ch.ivyteam.ivy.richdialog.widgets.components.RTextField getDataDaysSinceEasterRTextField() {
    if (dataDaysSinceEasterRTextField == null) {
      dataDaysSinceEasterRTextField = new ch.ivyteam.ivy.richdialog.widgets.components.RTextField();

      dataDaysSinceEasterRTextField.setText("");

      dataDaysSinceEasterRTextField.setName("dataDaysSinceEasterRTextField");
      dataDaysSinceEasterRTextField.setValidation("EasterDate");
      dataDaysSinceEasterRTextField.setStyleProperties("{/insetsBottom \"2\"/insetsRight \"5\"}");
      dataDaysSinceEasterRTextField.setMandatory(true);

    }
    return dataDaysSinceEasterRTextField;
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
   * This method initializes relativeEasterDayExamples
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getRelativeEasterDayExamples() {
    if (relativeEasterDayExamples == null) {
      relativeEasterDayExamples = new RLabel();
      relativeEasterDayExamples.setText("<%= ivy.cms.co(\"/Dialogs/application/calendar/easterDateExamples\") %>");
      relativeEasterDayExamples.setStyleProperties("{/insetsBottom \"5\"/insetsTop \"0\"/insetsLeft \"0\"}");
      relativeEasterDayExamples.setName("relativeEasterDayExamples");
    }
    return relativeEasterDayExamples;
  }



} // @jve:decl-index=0:visual-constraint="10,10"
