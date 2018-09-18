package ch.ivyteam.ivy.admin.tool.util;

import java.util.Iterator;
import java.util.List;

import ch.ivyteam.ivy.security.ISecurityConstants;
import ch.ivyteam.ivy.security.IUser;

public final class IvyUsers {
  
  private IvyUsers(){}
  
  public static void removeSystemUserFrom(List<IUser> users){
    for (Iterator<IUser> iterator = users.iterator(); iterator.hasNext();) {
      IUser iUser = (IUser) iterator.next();
      if(ISecurityConstants.SYSTEM_USER_NAME.equalsIgnoreCase(iUser.getName())){
        iterator.remove();
        return;
      }
    }
  }

}
