package ch.ivyteam.ivy.admin.tool.restclient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import ch.ivyteam.ivy.application.restricted.rest.IRestClient;

@SuppressWarnings("restriction")
public class RestClientDTO {

  private static final int HASH_CODE_INITIAL_NUMBER = 17;
  private static final int HASH_CODE_MULTI_NUMBER = 31;
  private String uri;
  private UUID uuid;
  private String name;
  private String description;
  @SuppressWarnings("unused")
  private RestClientPropertyDTO username;
  @SuppressWarnings("unused")
  private RestClientPropertyDTO password;
  private List<RestClientPropertyDTO> properties = new ArrayList<>();
  private List<RestClientFeatureDTO> features = new ArrayList<>();

  public RestClientDTO() {
    this.uri = "";
    this.description = "";
  }

  public static RestClientDTO from(IRestClient restClient) {
    if (restClient == null) {
      return new RestClientDTO();
    }
    RestClientDTO restClientDTO = new RestClientDTO();
    restClientDTO.setUri(restClient.getUri());
    restClientDTO.setUniqueId(restClient.getUniqueId());
    restClientDTO.setName(restClient.getName());
    restClientDTO.setDescription(restClient.getDescription());
    List<RestClientFeatureDTO> collect = restClient.getFeatures().stream().map(RestClientFeatureDTO::new)
        .collect(Collectors.toList());
    restClientDTO.setFeatures(collect);
    List<RestClientPropertyDTO> collect2 = restClient.getProperties().stream().map(RestClientPropertyDTO::new)
        .collect(Collectors.toList());
    restClientDTO.setProperties(collect2);
    return restClientDTO;
  }

  public String getDescription() {
    return description;
  }

  public void setFeatures(List<RestClientFeatureDTO> features) {
    this.features = features;
  }

  public List<RestClientFeatureDTO> getFeatures() {
    return features;
  }

  public String getName() {
    return name;
  }

  public void setProperties(List<RestClientPropertyDTO> properties) {
    this.properties = properties;
  }

  public List<RestClientPropertyDTO> getProperties() {
    return properties;
  }

  public void setUniqueId(UUID uuid) {
    this.uuid = uuid;
  }

  public UUID getUniqueId() {
    return uuid;
  }

  public String getUri() {
    return uri;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public RestClientPropertyDTO getUsername() {
    RestClientDTOService service = new RestClientDTOService(this);
    return service.getUsernameProperty();
  }

  public void setUsername(RestClientPropertyDTO username) {
    this.username = username;
  }

  public RestClientPropertyDTO getPassword() {
    RestClientDTOService service = new RestClientDTOService(this);
    return service.getPasswordProperty();
  }

  public void setPassword(RestClientPropertyDTO password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof RestClientDTO)) {
      return false;
    }
    RestClientDTO other = (RestClientDTO) obj;
    return this.uuid.equals(other.getUniqueId()) && this.name.equals(other.getName())
        && this.uri.equals(other.getUri()) && this.description.equals(other.getDescription())
        && Arrays.equals(this.features.toArray(), other.getFeatures().toArray())
        && Arrays.equals(this.properties.toArray(), other.getProperties().toArray());
  }
  
  @Override
  public int hashCode() {
    int result = HASH_CODE_INITIAL_NUMBER;
    result = HASH_CODE_MULTI_NUMBER * result + uuid.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + description.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + name.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + uri.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + features.hashCode();
    result = HASH_CODE_MULTI_NUMBER * result + properties.hashCode();
    return result;
  }

}
