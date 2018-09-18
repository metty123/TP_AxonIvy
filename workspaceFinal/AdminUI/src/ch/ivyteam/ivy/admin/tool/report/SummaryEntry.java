package ch.ivyteam.ivy.admin.tool.report;

import java.util.List;

/**
 * The summary entry The visual structure of summary entry and sub-entry of its<br>
 * Success: 1 - Warning: 0 - Error: 1 ===> SummaryEntry <br>
 * 
 * *Environment: Designer - Success: 1 - Warning: 0 - Error: 1 ===> EnvironmentEntry<br>
 * ***Global variable - Success: 0 - Warning: 0 - Error: 0 ===> ConfigEntry<br>
 * ***Database Configuration - Success: 0 - Warning: 0 - Error: 1<br>
 * 
 * *Environment: Prod - Success: 1 - Warning: 0 - Error: 1<br>
 * ***Web service - Success: 1 - Warning: 0 - Error: 0 <br>
 * ***Business calendar - Success: 0 - Warning: 0 - Error: 0
 ******************************************************************* 
 */
public class SummaryEntry extends AbstractSummaryEntry {
  public SummaryEntry() {
    super("");
  }

  @Override
  protected ISummaryEntry createChild(String name) {
    return new EnvironmentEntry(name);
  }

  /**
   * Summary entry for 1 environment
   * 
   */
  public static final class EnvironmentEntry extends AbstractSummaryEntry {

    @Override
    protected ISummaryEntry createChild(String name) {
      return new ConfigEntry(name);
    }

    private EnvironmentEntry(String name) {
      super(name);
    }

    /**
     * ConfigEntry contain information for 1 configuration, eg: web service, database configuration
     */
    public static final class ConfigEntry extends AbstractSummaryEntry {
      private int numOfSuccess;
      private int numOfError;
      private int numOfWarning;

      /**
       * @param name of the configuration, eg: web service name
       */
      private ConfigEntry(String name) {
        super(name);
      }

      public int getNumOfSuccess() {
        return numOfSuccess;
      }

      public void setNumOfSuccess(int pNumOfSuccess) {
        this.numOfSuccess = pNumOfSuccess;
      }

      public int getNumOfError() {
        return numOfError;
      }

      public void setNumOfError(int pNumOfError) {
        this.numOfError = pNumOfError;
      }

      public int getNumOfWarning() {
        return numOfWarning;
      }

      public void setNumOfWarning(int pNumOfWarning) {
        this.numOfWarning = pNumOfWarning;
      }

      @Override
      public ISummaryEntry getChild(String name) {
        throw new UnsupportedOperationException();
      }

      @Override
      public List<ISummaryEntry> getChildren() {
        throw new UnsupportedOperationException();
      }

      @Override
      protected ISummaryEntry createChild(String name) {
        throw new UnsupportedOperationException();
      }
    }
  }

}
