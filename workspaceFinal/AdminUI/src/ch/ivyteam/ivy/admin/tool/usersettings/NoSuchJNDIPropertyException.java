package ch.ivyteam.ivy.admin.tool.usersettings;

public class NoSuchJNDIPropertyException extends RuntimeException {

  private static final long serialVersionUID = -7296190440845370708L;

  public NoSuchJNDIPropertyException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
    super(arg0, arg1, arg2, arg3);
  }

  public NoSuchJNDIPropertyException(String arg0, Throwable arg1) {
    super(arg0, arg1);
  }

  public NoSuchJNDIPropertyException(Throwable arg0) {
    super(arg0);
  }

  public NoSuchJNDIPropertyException() {
    super();
  }

  public NoSuchJNDIPropertyException(String message) {
    super(message);
  }

}
