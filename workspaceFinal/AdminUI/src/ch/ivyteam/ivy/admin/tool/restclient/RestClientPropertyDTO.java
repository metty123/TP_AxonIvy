package ch.ivyteam.ivy.admin.tool.restclient;

import ch.ivyteam.ivy.application.restricted.rest.IRestClientProperty;

@SuppressWarnings("restriction")
public class RestClientPropertyDTO {

  private static final int HASH_CODE_MULTI_NUMBER = 31;
  private static final int HASH_CODE_INITIAL_NUMBER = 17;
  private String name;
  private String value;
  private boolean isPassword;

  public RestClientPropertyDTO(String name, String value) {
    this.name = name;
    this.value = value;
  }

  RestClientPropertyDTO(IRestClientProperty property) {
    this.name = property.getName();
    this.value = property.getValue();
    this.isPassword = property.isPassword();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public boolean isPassword() {
    return isPassword;
  }

  public void setPassword(boolean isPassword) {
    this.isPassword = isPassword;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof RestClientPropertyDTO)) {
      return false;
    }
    RestClientPropertyDTO other = (RestClientPropertyDTO) obj;
    return this.name.equals(other.getName()) && this.value.equals(other.getValue())
        && this.isPassword == other.isPassword();
  }
  
  @Override
  public int hashCode() {
    int result = HASH_CODE_INITIAL_NUMBER;
    result = HASH_CODE_MULTI_NUMBER * result + name.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + value.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + (isPassword ? 0 : 1);
    return result;
  }

}
