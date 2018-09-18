package ch.ivyteam.ivy.admin.tool;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import ch.ivyteam.ivy.application.restricted.IGlobalVariable;
import ch.ivyteam.ivy.application.restricted.IWebService;
import ch.ivyteam.ivy.environment.Ivy;

/**
 * Utility class for filter list
 * 
 * @author chnam
 * 
 */
@SuppressWarnings("restriction")
public final class ListFilterUtils {

  private ListFilterUtils() {
    // constructor
  }

  /**
   * Filter list of IGlobalVariable based on filterType and keyword </br> 1. If filterType is
   * "Name", filter all variables that have name match keyword </br> 2. If filterType is "All",
   * filter all variables that have name/description/value match keyword
   * 
   * @param filterType
   * @param keyword
   * @param listToBeFiltered
   * @return list of IGlobalVariable after filtered
   */
  public static List<IGlobalVariable> filterGlobalVariables(String filterType, String keyword,
      List<IGlobalVariable> listToBeFiltered) {

    String name = Ivy.cms().co("/ch/ivyteam/ivy/admin/tool/comboBox/globalVariableName");
    String regex = "(.|\n)*" + keyword + "(.|\n)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    // return filtered list
    List<IGlobalVariable> filteredList = new ArrayList<IGlobalVariable>();

    for (IGlobalVariable globalVariable : listToBeFiltered) {
      if (matchName(filterType, name, p, globalVariable) || matchAnyFields(filterType, name, p, globalVariable)) {
        filteredList.add(globalVariable);
      }
    }
    return filteredList;
  }

  public static List<IWebService> filterWebServices(String keyword, List<IWebService> webServicesToBeFiltered) {
    String regex = "(.|\n)*" + keyword + "(.|\n)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    List<IWebService> filteredWebServices = new ArrayList<>();

    for (IWebService webService : webServicesToBeFiltered) {
      if (p.matcher(webService.getName()).matches()) {
        filteredWebServices.add(webService);
      }
    }
    return filteredWebServices;
  }

  private static boolean matchAnyFields(String filterType, String name, Pattern p, IGlobalVariable globalVariable) {
    return !name.equalsIgnoreCase(filterType)
        && (p.matcher(globalVariable.getName()).matches() || p.matcher(globalVariable.getDescription()).matches() || p
            .matcher(globalVariable.getValue()).matches());
  }

  private static boolean matchName(String filterType, String name, Pattern p, IGlobalVariable globalVariable) {
    return name.equalsIgnoreCase(filterType) && p.matcher(globalVariable.getName()).matches();
  }
}
