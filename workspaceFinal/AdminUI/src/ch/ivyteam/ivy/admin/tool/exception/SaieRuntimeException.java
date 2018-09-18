package ch.ivyteam.ivy.admin.tool.exception;

/**
 * Runtime exception for Saie, use it when you do not want to handle the exception
 */
public class SaieRuntimeException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public SaieRuntimeException() {
    super();
  }

  public SaieRuntimeException(String arg0, Throwable arg1) {
    super(arg0, arg1);
  }

  public SaieRuntimeException(String arg0) {
    super(arg0);
  }

  public SaieRuntimeException(Throwable arg0) {
    super(arg0);
  }

}
