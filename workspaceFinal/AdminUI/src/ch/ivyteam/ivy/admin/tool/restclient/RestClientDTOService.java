package ch.ivyteam.ivy.admin.tool.restclient;

import static java.util.Objects.isNull;
import static org.apache.commons.lang.StringUtils.isEmpty;

import java.util.Optional;

import org.apache.commons.lang.StringUtils;

public class RestClientDTOService {

  private RestClientDTO restClient;

  public RestClientDTOService(RestClientDTO restClient) {
    this.restClient = restClient;
  }

  public RestClientFeatureDTO addFeature(String className) {
    if(isEmpty(className)) {
      return null;
    }
    Optional<RestClientFeatureDTO> found = findFeatureByClassName(className);
    if (found.isPresent()) {
      return found.get();
    }
    RestClientFeatureDTO feature = new RestClientFeatureDTO(className);
    restClient.getFeatures().add(feature);
    return feature;
  }

  public void removeFeatureByName(String className) {
    Optional<RestClientFeatureDTO> found = findFeatureByClassName(className);
    if (found.isPresent()) {
      restClient.getFeatures().remove(found.get());
    }
  }

  public void removeFeature(RestClientFeatureDTO feature) {
    if (isNull(feature)) {
      return;
    }
    restClient.getFeatures().remove(feature);
  }

  public boolean isFeatureAdded(String className) {
    Optional<RestClientFeatureDTO> found = findFeatureByClassName(className);
    return found.isPresent();
  }

  private Optional<RestClientFeatureDTO> findFeatureByClassName(String className) {
    Optional<RestClientFeatureDTO> found = restClient.getFeatures().stream()
        .filter(feature -> feature.getClazz().equals(className)).findFirst();
    return found;
  }

  public RestClientPropertyDTO addProperty(String name, String value) {
    if(StringUtils.isEmpty(name)) {
      return null;
    }
    Optional<RestClientPropertyDTO> findPropertyByName = findPropertyByName(name);
    if(findPropertyByName.isPresent()) {
      return findPropertyByName.get();
    }
    RestClientPropertyDTO property = new RestClientPropertyDTO(name, value);
    property.setPassword(false);
    restClient.getProperties().add(property);
    return property;
  }

  public RestClientPropertyDTO addPasswordProperty(String name, String value) {
    if(StringUtils.isEmpty(name)) {
      return null;
    }
    Optional<RestClientPropertyDTO> found = findPropertyByName(name);
    if(found.isPresent()) {
      return found.get();
    }
    RestClientPropertyDTO property = new RestClientPropertyDTO(name, value);
    property.setPassword(true);
    restClient.getProperties().add(property);
    return property;
  }

  public void removePropertyByName(String name) {
    Optional<RestClientPropertyDTO> found = findPropertyByName(name);
    if (found.isPresent()) {
      restClient.getProperties().remove(found.get());
    }
  }

  public void removeProperty(RestClientPropertyDTO property) {
    if (isNull(property)) {
      return;
    }
    restClient.getProperties().remove(property);
  }

  private Optional<RestClientPropertyDTO> findPropertyByName(String name) {
    Optional<RestClientPropertyDTO> findFirst = restClient.getProperties().stream()
        .filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
    return findFirst;
  }
  
  public boolean isPropertyAdded(String name){
    Optional<RestClientPropertyDTO> findFirst = restClient.getProperties().stream()
        .filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
    if(findFirst.isPresent()) {
      return true;
    }
    return false;
  }
  
  public String getPropertyValue(String propertyName) {
    Optional<RestClientPropertyDTO> found = findPropertyByName(propertyName);
    if(found.isPresent()) {
      return found.get().getValue();
    }
    return "";
  }
  
  public RestClientPropertyDTO getUsernameProperty(){
    Optional<RestClientPropertyDTO> found = findPropertyByName("username");
    if(found.isPresent()) {
      return found.get();
    }
    return new RestClientPropertyDTO("username","");
  }
  
  
  public RestClientPropertyDTO getPasswordProperty(){
    Optional<RestClientPropertyDTO> found = findPropertyByName("password");
    if(found.isPresent()) {
      return found.get();
    }
    return new RestClientPropertyDTO("password","");
  }

  public static boolean checkDirtyData(RestClientDTO current, RestClientDTO original){
    return !original.equals(current);
  }
}
