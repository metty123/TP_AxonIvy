package ch.ivyteam.ivy.admin.tool.StatementExecutionDetails;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RBorderLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.BorderFactory;

/**
 * RichDialog panel implementation for StatementExecutionDetailsPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class StatementExecutionDetailsPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RGridBagLayoutPane detailsPane = null;
  private RLabel timeLabel = null;
  private RLabel executionTimeLabel = null;
  private RLabel resultReadingTimeLabel = null;
  private RLabel elementLabel = null;
  private RLabel resultLabel = null;
  private RLabel timeValueLabel = null;
  private RLabel executionTimeValueLabel = null;
  private RLabel resultReadingTimeValueLabel = null;
  private RLabel elementValueLabel = null;
  private RLabel resultValueLabel = null;
  private RBorderLayoutPane sqlPane = null;
  private RScrollPane sqlScrollPane = null;
  private RTextArea sqlTextArea = null;
  private RFlowLayoutPane buttonPane = null;
  private RButton closeButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of StatementExecutionDetailsPanel
   */
  public StatementExecutionDetailsPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes StatementExecutionDetailsPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(413, 402));
    this.add(getDetailsPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getSqlPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes detailsPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RGridBagLayoutPane
   */
  private RGridBagLayoutPane getDetailsPane() {
    if (detailsPane == null) {
      detailsPane = new RGridBagLayoutPane();
      detailsPane.setName("detailsPane");
      detailsPane.setBorder(BorderFactory.createTitledBorder("Details"));
      detailsPane.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"0\"}");
      detailsPane.add(getTimeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getExecutionTimeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getResultReadingTimeLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 2, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getElementLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getResultLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getTimeValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getExecutionTimeValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1,
          -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getResultReadingTimeValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 1, 1,
          -1, -1, com.ulcjava.base.application.GridBagConstraints.CENTER,
          com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getElementValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 3, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
      detailsPane.add(getResultValueLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 4, 1, 1, -1, -1,
          com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
          new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    }
    return detailsPane;
  }

  /**
   * This method initializes timeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTimeLabel() {
    if (timeLabel == null) {
      timeLabel = new RLabel();
      timeLabel.setText("Time:");
      timeLabel.setName("timeLabel");
    }
    return timeLabel;
  }

  /**
   * This method initializes executionTimeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getExecutionTimeLabel() {
    if (executionTimeLabel == null) {
      executionTimeLabel = new RLabel();
      executionTimeLabel.setText("Execution time:");
      executionTimeLabel.setName("executionTimeLabel");
    }
    return executionTimeLabel;
  }

  /**
   * This method initializes resultReadingTimeLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getResultReadingTimeLabel() {
    if (resultReadingTimeLabel == null) {
      resultReadingTimeLabel = new RLabel();
      resultReadingTimeLabel.setText("Result reading time:");
      resultReadingTimeLabel.setName("resultReadingTimeLabel");
    }
    return resultReadingTimeLabel;
  }

  /**
   * This method initializes elementLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getElementLabel() {
    if (elementLabel == null) {
      elementLabel = new RLabel();
      elementLabel.setText("Element:");
      elementLabel.setName("elementLabel");
    }
    return elementLabel;
  }

  /**
   * This method initializes resultLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getResultLabel() {
    if (resultLabel == null) {
      resultLabel = new RLabel();
      resultLabel.setText("Result:");
      resultLabel.setName("resultLabel");
    }
    return resultLabel;
  }

  /**
   * This method initializes timeValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTimeValueLabel() {
    if (timeValueLabel == null) {
      timeValueLabel = new RLabel();
      // SONAR-OFF
      timeValueLabel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"1\"}");
      // SONAR-ON
      timeValueLabel.setName("timeValueLabel");
    }
    return timeValueLabel;
  }

  /**
   * This method initializes executionTimeValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getExecutionTimeValueLabel() {
    if (executionTimeValueLabel == null) {
      executionTimeValueLabel = new RLabel();
      // SONAR-OFF
      executionTimeValueLabel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"1\"}");
      // SONAR-ON
      executionTimeValueLabel.setName("executionTimeValueLabel");
    }
    return executionTimeValueLabel;
  }

  /**
   * This method initializes resultReadingTimeValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getResultReadingTimeValueLabel() {
    if (resultReadingTimeValueLabel == null) {
      resultReadingTimeValueLabel = new RLabel();
      resultReadingTimeValueLabel.setStyleProperties("{/fill \"HORIZONTAL\"/weightX \"1\"}");
      resultReadingTimeValueLabel.setName("resultReadingTimeValueLabel");
    }
    return resultReadingTimeValueLabel;
  }

  /**
   * This method initializes elementValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getElementValueLabel() {
    if (elementValueLabel == null) {
      elementValueLabel = new RLabel();
      // SONAR-OFF
      elementValueLabel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"1\"}");
      // SONAR-ON
      elementValueLabel.setName("elementValueLabel");
    }
    return elementValueLabel;
  }

  /**
   * This method initializes resultValueLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getResultValueLabel() {
    if (resultValueLabel == null) {
      resultValueLabel = new RLabel();
      // SONAR-OFF
      resultValueLabel.setStyleProperties("{/fill \"HORIZONTAL\"/weightY \"1\"}");
      // SONAR-ON
      resultValueLabel.setName("resultValueLabel");
    }
    return resultValueLabel;
  }

  /**
   * This method initializes sqlPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBorderLayoutPane
   */
  private RBorderLayoutPane getSqlPane() {
    if (sqlPane == null) {
      sqlPane = new RBorderLayoutPane();
      sqlPane.setName("sqlPane");
      sqlPane.setBorder(BorderFactory.createTitledBorder("SQL"));
      sqlPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      sqlPane.add(getSqlScrollPane(), com.ulcjava.base.application.ULCBorderLayoutPane.CENTER);
    }
    return sqlPane;
  }

  /**
   * This method initializes sqlScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getSqlScrollPane() {
    if (sqlScrollPane == null) {
      sqlScrollPane = new RScrollPane();
      sqlScrollPane.setName("sqlScrollPane");
      sqlScrollPane.setViewPortView(getSqlTextArea());
    }
    return sqlScrollPane;
  }

  /**
   * This method initializes sqlTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getSqlTextArea() {
    if (sqlTextArea == null) {
      sqlTextArea = new RTextArea();
      sqlTextArea.setText("");
      sqlTextArea.setStyleProperties("{/font {/name \"Courier New\"/size \"10\"/style \"PLAIN\"}}");
      sqlTextArea.setName("sqlTextArea");
    }
    return sqlTextArea;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RFlowLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RFlowLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane.setStyleProperties("{/anchor \"EAST\"}");
      buttonPane.add(getCloseButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes closeButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCloseButton() {
    if (closeButton == null) {
      closeButton = new RButton();
      closeButton.setText("Close");
      closeButton.setDefaultCapable(true);
      closeButton.setName("closeButton");
    }
    return closeButton;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
