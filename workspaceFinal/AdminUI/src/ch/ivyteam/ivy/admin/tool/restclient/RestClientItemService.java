package ch.ivyteam.ivy.admin.tool.restclient;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ch.ivyteam.ivy.application.restricted.rest.IRestClient;

@SuppressWarnings("restriction")
public class RestClientItemService {

  public List<RestClientItem> filter(String keyword, List<RestClientItem> items) {
    return items.stream().filter(item -> item.getName().toLowerCase().contains(keyword.trim().toLowerCase()))
        .collect(Collectors.toList());
  }

  public List<RestClientItem> combineDefaultAndEnvironmentRestItem(List<RestClientItem> defaults,
      List<RestClientItem> environments) {
    return defaults
        .stream()
        .map(
            dRest -> {
              Optional<RestClientItem> found = environments.stream()
                  .filter(eRest -> eRest.getUuid().equals(dRest.getUuid())).findFirst();
              if (found.isPresent()) {
                return found.get();
              }
              return dRest;
            }).sorted((a, b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
  }

  public List<RestClientItem> toDefaultRestClientItems(List<IRestClient> restClients) {
    List<RestClientItem> collect = restClients.stream().map(this::toDefaultRestClientItem).collect(Collectors.toList());
    return collect;
  }

  public List<RestClientItem> toEnvironmentRestClientItems(List<IRestClient> restClients) {
    List<RestClientItem> collect = restClients.stream().map(this::toEnvironmentRestClientItem)
        .collect(Collectors.toList());
    return collect;
  }

  private RestClientItem toDefaultRestClientItem(IRestClient restClient) {
    RestClientItem item = new RestClientItem();
    item.setUuid(restClient.getUniqueId());
    item.setName(restClient.getName());
    item.setEnvironment(false);
    return item;
  }

  private RestClientItem toEnvironmentRestClientItem(IRestClient restClient) {
    RestClientItem item = new RestClientItem();
    item.setUuid(restClient.getUniqueId());
    item.setName(restClient.getName());
    item.setEnvironment(true);
    return item;
  }

}
