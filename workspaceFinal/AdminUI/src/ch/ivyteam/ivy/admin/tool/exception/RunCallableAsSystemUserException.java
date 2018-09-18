package ch.ivyteam.ivy.admin.tool.exception;

public class RunCallableAsSystemUserException extends RuntimeException {

  private static final long serialVersionUID = -4459097372131829925L;

  public RunCallableAsSystemUserException() {
    super();
  }

  public RunCallableAsSystemUserException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public RunCallableAsSystemUserException(String message, Throwable cause) {
    super(message, cause);
  }

  public RunCallableAsSystemUserException(String message) {
    super(message);
  }

  public RunCallableAsSystemUserException(Throwable cause) {
    super(cause);
  }
  

}
