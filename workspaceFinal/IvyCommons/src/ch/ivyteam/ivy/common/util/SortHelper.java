package ch.ivyteam.ivy.common.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ch.ivyteam.ivy.rd.common.DbDriver;
import ch.ivyteam.ivy.rd.common.DbProduct;

public final class SortHelper {

  private SortHelper() {}

  /**
   * sort dbProduct ascending by name
   * 
   * @param dbProducts
   */
  public static void sortDbProductAscendingByName(List<DbProduct> dbProducts) {
    Collections.sort(dbProducts, new Comparator<DbProduct>() {
      public int compare(DbProduct o1, DbProduct o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
      };
    });
  }

  /**
   * sort dbDriver ascending by name
   * 
   * @param dbDrivers
   */
  public static void sortDbDriverAscendingByName(List<DbDriver> dbDrivers) {
    Collections.sort(dbDrivers, new Comparator<DbDriver>() {
      public int compare(DbDriver o1, DbDriver o2) {
        return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
      };
    });
  }
}
