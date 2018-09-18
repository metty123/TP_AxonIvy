package ch.ivyteam.ivy.admin.tool.restclient;

import java.util.List;

import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.application.restricted.rest.IRestClient;
import ch.ivyteam.ivy.application.restricted.rest.IRestClientFeature;
import ch.ivyteam.ivy.application.restricted.rest.IRestClientProperty;
import ch.ivyteam.ivy.application.restricted.rest.RestClientDao;

@SuppressWarnings("restriction")
public class RestClientService {

  public IRestClient createEnvironmentRestClient(IApplication application, IEnvironment environment,
      IRestClient parentDefaultClient, RestClientDTO restClientDTO) {
    IRestClient environmentRestClient = RestClientDao.forApp(application).createEnv(restClientDTO.getUri(), parentDefaultClient,
        environment);
    saveRestClient(environmentRestClient, restClientDTO);
    return environmentRestClient;
  }

  public IRestClient saveRestClient(IRestClient restClient, RestClientDTO restClientDTO) {
    restClient.setDescription(restClientDTO.getDescription());
    restClient.setUri(restClientDTO.getUri());
    mergeFeature(restClient, restClientDTO.getFeatures());
    mergeProperty(restClient, restClientDTO.getProperties());
    return restClient;
  }
  
  public void removeRestClient(IApplication application, IRestClient client) {
    RestClientDao.forApp(application).delete(client);
  }

  public void mergeFeature(IRestClient restClient, List<RestClientFeatureDTO> featuresDTOs) {
    List<IRestClientFeature> features = restClient.getFeatures();
    features.stream().forEach(f -> restClient.removeFeature(f));
    featuresDTOs.stream().forEach(featureDTO -> restClient.addFeature(featureDTO.getClazz()));
  }

  public void mergeProperty(IRestClient restClient, List<RestClientPropertyDTO> propertyDTOs) {
    List<IRestClientProperty> properties = restClient.getProperties();
    properties.stream().forEach(p -> restClient.removeProperty(p));
    propertyDTOs.stream().forEach(propertyDTO -> addProperty(restClient, propertyDTO));
  }

  private void addProperty(IRestClient restClient, RestClientPropertyDTO propertyDTO) {
    if (propertyDTO.isPassword()) {
      restClient.addPasswordProperty(propertyDTO.getName(), propertyDTO.getValue());
    } else {
      restClient.addProperty(propertyDTO.getName(), propertyDTO.getValue());
    }
  }
}
