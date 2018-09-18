package ch.ivyteam.ivy.admin.tool.domain.util;

import ch.ivyteam.ivy.application.IApplication;

public class NonExistedEnvironment {
  private IApplication application;
  private String environmentName;

  public NonExistedEnvironment(IApplication application, String environmentName) {
    this.application = application;
    this.environmentName = environmentName;
  }

  public IApplication getApplication() {
    return application;
  }

  public void setApplication(IApplication application) {
    this.application = application;
  }

  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

}
