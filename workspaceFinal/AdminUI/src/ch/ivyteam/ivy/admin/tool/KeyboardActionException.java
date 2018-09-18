package ch.ivyteam.ivy.admin.tool;

/**
 * KeyboardActionException is used to define exception that can be thrown while binding shortcut key
 * 
 * @author tntsu
 */
public class KeyboardActionException extends RuntimeException {
  private static final long serialVersionUID = -6694536270859506766L;

  public KeyboardActionException() {
    super();
  }

  public KeyboardActionException(String message) {
    super(message);
  }

  public KeyboardActionException(String message, Throwable cause) {
    super(message, cause);
  }

  public KeyboardActionException(Throwable cause) {
    super(cause);
  }
}
