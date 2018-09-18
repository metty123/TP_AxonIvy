package ch.ivyteam.ivy.admin.tool.restclient;

import ch.ivyteam.ivy.application.restricted.rest.IRestClientFeature;

@SuppressWarnings("restriction")
public class RestClientFeatureDTO {
  
  private static final int HASH_CODE_MULTI_NUMBER = 31;
  private static final int HASH_CODE_INITIAL_NUMBER = 17;
  private String clazz;
  
  RestClientFeatureDTO(String clazz){
    this.clazz = clazz;
  }
  
  RestClientFeatureDTO(IRestClientFeature feature){
    this.clazz = feature.getClazz();
  }

  public String getClazz() {
    return clazz;
  }

  public void setClazz(String clazz) {
    this.clazz = clazz;
  }
  
  @Override
  public boolean equals(Object obj) {
    if(this == obj) {
      return true;
    }
    if(!(obj instanceof RestClientFeatureDTO)) {
      return false;
    }
    RestClientFeatureDTO other = (RestClientFeatureDTO) obj;
    return this.clazz.equals(other.getClazz());
  }
  
  @Override
  public int hashCode() {
    int result = HASH_CODE_INITIAL_NUMBER;
    result = HASH_CODE_MULTI_NUMBER * result + this.clazz.hashCode();
    return result;
  }

}
