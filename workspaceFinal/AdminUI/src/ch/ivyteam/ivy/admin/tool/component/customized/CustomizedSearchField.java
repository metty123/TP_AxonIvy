package ch.ivyteam.ivy.admin.tool.component.customized;

import java.lang.reflect.InvocationTargetException;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanelImpl;
import ch.ivyteam.ulc.vwidget.server.ULCVSearchField;

import com.ulcjava.base.application.event.ActionEvent;
import com.ulcjava.base.application.event.IActionListener;

/**
 * This class extends {@link ULCVSearchField} and customizes some attributes: text,
 * minCharForSearch, delayTimeForSearch.
 */
public class CustomizedSearchField extends ULCVSearchField {

  private static final long serialVersionUID = 7875438341417289985L;

  private static final int MIN_CHAR_FOR_SEARCH = 0;
  private static final int DELAY_TIME_FOR_SEARCH = 500;

  public CustomizedSearchField() {
    this.setText("");
    this.setMinCharForSearch(MIN_CHAR_FOR_SEARCH);
    this.setDelayTimeForSearch(DELAY_TIME_FOR_SEARCH);
  }

  public void addSearchCallback(SearchCallback callback) {
    this.addSearchListener(callback.toActionListener());
  }

  public static class SearchCallback {

    public static final class Builder {
      private IRichDialogPanelImpl panel;
      private String method;
      private Object[] parameters = new Object[] {};

      private Builder(String callbackMethod) {
        this.method = callbackMethod;
      }

      public Builder onPanel(IRichDialogPanelImpl panel) {
        this.panel = panel;
        return this;
      }

      public Builder withParams(Object... parameters) {
        this.parameters = parameters;
        return this;
      }

      public SearchCallback build() {
        return new SearchCallback(this);
      }
    }

    public static Builder invokeMethod(String methodName) {
      return new Builder(methodName);
    }

    private final IRichDialogPanelImpl panel;
    private final String method;
    private final Object[] params;

    public SearchCallback(Builder builder) {
      this.panel = builder.panel;
      this.method = builder.method;
      this.params = builder.parameters;
    }

    IActionListener toActionListener() {
      return new IActionListener() {
        private static final long serialVersionUID = 6369134854880465240L;

        @Override
        public void actionPerformed(ActionEvent event) {
          try {
            panel.getPanelAPI().callMethod(method, params);
          } catch (InvocationTargetException | NoSuchMethodException e) {
            String message = String.format("Could not call the given method: [%s]", method);
            Ivy.log().error(message, e);
          }
        }
      };
    }
  }

}
