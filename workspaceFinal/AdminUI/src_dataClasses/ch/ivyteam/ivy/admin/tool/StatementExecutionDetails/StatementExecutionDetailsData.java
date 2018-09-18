package ch.ivyteam.ivy.admin.tool.StatementExecutionDetails;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class StatementExecutionDetailsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class StatementExecutionDetailsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 3598527481068007017L;

  private transient ch.ivyteam.ivy.db.IStatementExecution statementExecution;

  /**
   * Gets the field statementExecution.
   * @return the value of the field statementExecution; may be null.
   */
  public ch.ivyteam.ivy.db.IStatementExecution getStatementExecution()
  {
    return statementExecution;
  }

  /**
   * Sets the field statementExecution.
   * @param _statementExecution the new value of the field statementExecution.
   */
  public void setStatementExecution(ch.ivyteam.ivy.db.IStatementExecution _statementExecution)
  {
    statementExecution = _statementExecution;
  }

}
