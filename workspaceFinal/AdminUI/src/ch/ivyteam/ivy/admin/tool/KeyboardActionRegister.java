package ch.ivyteam.ivy.admin.tool;

import java.lang.reflect.InvocationTargetException;

import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;

import com.ulcjava.base.application.ULCComponent;
import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;
import com.ulcjava.base.application.util.KeyStroke;

/**
 * This class help binding keyboard event to execute a method in RichDialogGridBagPanel
 * 
 * @author tntsu
 * 
 */
public class KeyboardActionRegister implements IActionListener {

  private static final long serialVersionUID = 7804359523931160195L;
  private RichDialogGridBagPanel panel;
  private String methodName;
  private KeyStroke keyStroke;

  /**
   * Constructor for create new <b>KeyboardActionRegister</b> </hr>
   * 
   * @param panel RichDialogGridBagPanel which has defined a methodName </b> for call back
   * @param keyStroke KeyStroke key combination for execute </b>
   * @param methodName method for call back
   */
  public KeyboardActionRegister(RichDialogGridBagPanel panel, KeyStroke keyStroke, String methodName) {
    this.panel = panel;
    this.methodName = methodName;
    this.keyStroke = keyStroke;
  }

  public void register() {
    ((ULCComponent) panel).registerKeyboardAction(this, keyStroke, ULCComponent.WHEN_IN_FOCUSED_WINDOW);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    try {
      panel.getPanelAPI().callMethod(methodName, new Integer[] {});
    } catch (InvocationTargetException | NoSuchMethodException e) {
      throw new KeyboardActionException("Cannot callback method " + methodName, e);
    }
  }
}
