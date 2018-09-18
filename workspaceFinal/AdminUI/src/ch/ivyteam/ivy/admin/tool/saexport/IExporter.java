package ch.ivyteam.ivy.admin.tool.saexport;

import ch.ivyteam.ivy.admin.tool.domain.util.SaieParameter;

/**
 * Interface for export function
 */
public interface IExporter {

  /**
   * Export information from multiple <code>environments</code> to <code>file</code>
   * 
   * @param parameterObject TODO
   */
  void export(SaieParameter parameterObject);
}
