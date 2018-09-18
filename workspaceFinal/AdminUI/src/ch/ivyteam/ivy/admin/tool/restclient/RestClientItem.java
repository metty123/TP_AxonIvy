package ch.ivyteam.ivy.admin.tool.restclient;

import java.util.UUID;

public class RestClientItem {

  private UUID uuid;
  private String name;
  private boolean isEnvironment;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isEnvironment() {
    return isEnvironment;
  }

  public void setEnvironment(boolean isEnvironment) {
    this.isEnvironment = isEnvironment;
  }

  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }


}
