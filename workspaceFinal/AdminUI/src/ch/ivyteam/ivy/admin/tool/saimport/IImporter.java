package ch.ivyteam.ivy.admin.tool.saimport;

import java.io.FileNotFoundException;

import ch.ivyteam.ivy.admin.tool.domain.util.SaieImportParameter;
import ch.ivyteam.ivy.admin.tool.exception.SaieException;

/**
 * Interface for import function
 */
public interface IImporter {

  /**
   * Import information from <code>file</code> to <code>environments</code>
   * 
   * @param param TODO
   * 
   * @throws FileNotFoundException
   * @throws SaieException indicate import file is invalid
   */
  void importEnvironments(SaieImportParameter param) throws FileNotFoundException, SaieException;
}
