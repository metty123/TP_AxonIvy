package ch.ivyteam.ivy.admin.tool;

import org.apache.commons.lang3.StringUtils;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.system.IProperty;

public class SystemPropertyWrapper {

  private final IProperty property;

  public SystemPropertyWrapper(IProperty property) {
    this.property = property;
  }

  public String getDescription() {
    String description = null;
    if (StringUtils.isNotBlank(property.getDescriptionReference())) {
      description = Ivy.cms().co("/Help/SystemProperties/PropertyDescriptions/" + property.getDescriptionReference());
    }
    if (StringUtils.isBlank(description)) {
      description = property.getDescription();
    }
    return description;
  }

}
