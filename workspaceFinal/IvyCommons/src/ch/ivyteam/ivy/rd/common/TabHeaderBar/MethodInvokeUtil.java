package ch.ivyteam.ivy.rd.common.TabHeaderBar;

import java.lang.reflect.InvocationTargetException;

import ch.ivyteam.api.IvyScriptVisibility;
import ch.ivyteam.api.PublicAPI;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanelImpl;

public class MethodInvokeUtil {
  /**
   * Invokes a method without parameter and return value
   * 
   * @param rd The rich dialog on which the method should be invoked
   * @param methodName The method name
   * @throws InvocationTargetException
   * @throws NoSuchMethodException if there is no such method
   */
  @PublicAPI(IvyScriptVisibility.EXPERT)
  public static void invoke(IRichDialogPanelImpl rd, String methodName) throws InvocationTargetException,
      NoSuchMethodException {
    rd.getPanelAPI().callMethod(methodName, new Object[0]);
  }
}
