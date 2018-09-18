package ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester;

import org.apache.commons.lang.exception.ExceptionUtils;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextArea;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;

import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for SystemDatabaseConnectionTesterUIPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class DatabaseConnectionTesterPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RTextArea stateTextArea = null;
  private RScrollPane stateScrollPane = null;

  /**
   * Create a new instance of SystemDatabaseConnectionTesterUIPanel
   */
  public DatabaseConnectionTesterPanel() {
    super();
    initialize();
  }

  /**
   * This method initializes SystemDatabaseConnectionTesterUIPanel
   * 
   * @return void
   */
  public void initialize() {
    this.add(getStateScrollPane(), new com.ulcjava.base.application.GridBagConstraints(1, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }


  protected String getErrorMessage(Throwable connectionError) {
    StringBuilder builder = new StringBuilder(1000);
    if (connectionError.getMessage() != null) {
      builder.append(connectionError.getMessage());
      builder.append("\n");
    }
    builder.append(ExceptionUtils.getStackTrace(connectionError));
    return builder.toString();
  }

  /**
   * This method initializes stateTextArea
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTextArea
   */
  private RTextArea getStateTextArea() {
    if (stateTextArea == null) {
      stateTextArea = new RTextArea();
      stateTextArea.setText("Unknown connection state. Use the test connection button to test the connection.");
      stateTextArea.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      stateTextArea.setEditable(false);
      stateTextArea.setDisabledTextColor(Color.lightGray);
      stateTextArea.setRows(5);
      stateTextArea.setName("stateTextArea");
    }
    return stateTextArea;
  }

  /**
   * This method initializes stateScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getStateScrollPane() {
    if (stateScrollPane == null) {
      stateScrollPane = new RScrollPane();
      stateScrollPane.setName("stateScrollPane");
      stateScrollPane.setViewPortView(getStateTextArea());
    }
    return stateScrollPane;
  }

} // @jve:decl-index=0:visual-constraint="10,10"
