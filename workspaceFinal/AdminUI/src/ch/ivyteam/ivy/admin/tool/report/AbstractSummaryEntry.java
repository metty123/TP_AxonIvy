package ch.ivyteam.ivy.admin.tool.report;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Abstract class for summary entry
 */
public abstract class AbstractSummaryEntry implements ISummaryEntry {
  private Map<String, ISummaryEntry> childrenMap;
  private String name = "";

  public AbstractSummaryEntry(String pName) {
    super();
    this.name = pName;
    childrenMap = new HashMap<String, ISummaryEntry>();
  }

  /**
   * Create the child object
   */
  protected abstract ISummaryEntry createChild(String pName);

  @Override
  public List<ISummaryEntry> getChildren() {
    return new ArrayList<ISummaryEntry>(childrenMap.values());
  }

  @Override
  public ISummaryEntry getChild(String pName) {
    ISummaryEntry entry = childrenMap.get(pName);
    if (entry == null) {
      entry = createChild(pName);
      childrenMap.put(pName, entry);
    }
    return entry;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getNumOfSuccess() {
    int returnValue = 0;
    for (ISummaryEntry entry : childrenMap.values()) {
      returnValue += entry.getNumOfSuccess();
    }
    return returnValue;
  }

  @Override
  public int getNumOfWarning() {
    int returnValue = 0;
    for (ISummaryEntry entry : childrenMap.values()) {
      returnValue += entry.getNumOfWarning();
    }
    return returnValue;
  }

  @Override
  public int getNumOfError() {
    int returnValue = 0;
    for (ISummaryEntry entry : childrenMap.values()) {
      returnValue += entry.getNumOfError();
    }
    return returnValue;
  }

}
