package ch.ivyteam.ivy.commondialogs.QuestionDialog;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RHtmlPane;
import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;

/**
 * RichDialog panel implementation for QuestionDialogPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class QuestionDialogPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RLabel iconLabel = null;
  private RHtmlPane questionTextHtmlPane = null;
  private RLabel titleLabel = null;
  private RGridLayoutPane buttonPane = null;

  /**
   * Create a new instance of QuestionDialogPanel
   */
  public QuestionDialogPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes QuestionDialogPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(320, 111));
    this.add(getIconLabel(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 2, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getQuestionTextHtmlPane(), new com.ulcjava.base.application.GridBagConstraints(1, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getTitleLabel(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(1, 2, 2, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes iconLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getIconLabel() {
    if (iconLabel == null) {
      iconLabel = new RLabel();
      iconLabel.setFocusable(false);
      iconLabel.setStyleProperties("{/anchor \"NORTHWEST\"}");
      iconLabel.setName("iconLabel");
    }
    return iconLabel;
  }

  /**
   * This method initializes questionTextHtmlPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RHtmlPane
   */
  private RHtmlPane getQuestionTextHtmlPane() {
    if (questionTextHtmlPane == null) {
      questionTextHtmlPane = new RHtmlPane();
      questionTextHtmlPane.setName("questionTextHtmlPane");
      questionTextHtmlPane.setFocusable(false);
      questionTextHtmlPane
          .setStyleProperties("{/insetsRight \"5\"/fill \"HORIZONTAL\"/insetsLeft \"5\"/weightY \"1\"/weightX \"1\"}");
    }
    return questionTextHtmlPane;
  }

  /**
   * This method initializes titleLabel
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RLabel
   */
  private RLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new RLabel();
      titleLabel.setText("RLabel");
      titleLabel.setFocusable(false);
      titleLabel.setStyleProperties("{/insetsRight \"5\"/fill \"HORIZONTAL\"/weightX \"1\"}");
      titleLabel.setName("titleLabel");
    }
    return titleLabel;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RFlowLayoutPane
   */
  private RGridLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RGridLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane.setHgap(5);
      buttonPane.setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsRight \"5\"/alignment \"RIGHT\"}");
    }
    return buttonPane;
  }
} // @jve:decl-index=0:visual-constraint="10,10"
