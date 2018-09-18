package ch.ivyteam.ivy.admin.tool.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ch.ivyteam.ivy.admin.tool.security.UserDTO;
import ch.ivyteam.ivy.application.restricted.IWebService;
import ch.ivyteam.ivy.rd.common.Property;
import ch.ivyteam.ivy.security.IRole;
import ch.ivyteam.ivy.security.IUser;

@SuppressWarnings("restriction")
public final class CollectionSorts {

  private CollectionSorts() {}

  /**
   * sort properties ascendingly by property name
   * 
   * @param properties: List of property
   */
  public static void sortProperty(List<Property> properties) {
    Collections.sort(properties, new Comparator<Property>() {
      public int compare(Property o1, Property o2) {
        return o1.getName().compareTo(o2.getName());
      };
    });
  }

  /**
   * sort roles ascendingly by role name
   * 
   * @param roles: List of role
   */
  public static void sortRole(List<IRole> roles) {
    Collections.sort(roles, new Comparator<IRole>() {
      public int compare(IRole o1, IRole o2) {
        return o1.getName().compareTo(o2.getName());
      };
    });
  }
  
  /**
   * sort web services ascendingly by web service name
   * 
   * @param roles: List of web services
   */
  public static void sortWebServicesByName(List<IWebService> webServices) {
    Collections.sort(webServices, new Comparator<IWebService>() {
      public int compare(IWebService webService1, IWebService webService2) {
        return webService1.getName().compareTo(webService2.getName());
      };
    });
  }
  
  /**
   * sort users ascendingly by user name
   * 
   * @param users
   */
  public static void sortUserByName(List<IUser> users){
    Collections.sort(users,new Comparator<IUser>() {

      @Override
      public int compare(IUser first, IUser second) {
        return first.getName().compareToIgnoreCase(second.getName());
      }
    });
  }
  
  /**
   * sort users ascendingly by user name
   * 
   * @param userDTOs
   */
  public static void sortUserDTOByUserName(List<UserDTO> userDTOs){
    Collections.sort(userDTOs,new Comparator<UserDTO>() {

      @Override
      public int compare(UserDTO first, UserDTO second) {
        return first.getUsername().compareToIgnoreCase(second.getUsername());
      }
    });
  }
}
