package ch.ivyteam.ivy.admin.tool.role;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import ch.ivyteam.ivy.security.IRole;

public final class RoleTreeCriteria {

  private String keyword;
  private boolean showOnlyActiveRole;
  private boolean showRoleMember;
  private List<IRole> excludedRoles;
  
  private RoleTreeCriteria(Builder builder) {
    keyword = builder.keyword;
    showOnlyActiveRole = builder.showOnlyActiveRole;
    showRoleMember = builder.showRoleMember;
    excludedRoles = builder.excludedRoles;
  }
  
  public static Builder create() {
    return new Builder();
  }

  public boolean hasKeywork() {
    return StringUtils.isNotEmpty(keyword);
  }
  
  public String getKeyword() {
    return keyword;
  }

  public boolean isShowOnlyActiveRole() {
    return showOnlyActiveRole;
  }
  
  public boolean isShowRoleMember() {
    return showRoleMember;
  }
  
  public List<IRole> getExcludedRoles() {
    return excludedRoles;
  }
  
  public static class Builder {
    private String keyword;
    private boolean showOnlyActiveRole = false;
    private boolean showRoleMember = true;
    private List<IRole> excludedRoles = new ArrayList<>();
    
    public Builder filterByKeyword(String keyword) {
      this.keyword = keyword;
      return this;
    }
    
    public Builder showObsoleteRole(boolean showObsoleteRole) {
      this.showOnlyActiveRole = !showObsoleteRole;
      return this;
    }
    
    public Builder showRoleMember(boolean showRoleMember) {
      this.showRoleMember = showRoleMember;
      return this;
    }
    
    public Builder excludeRoles(List<IRole> excludedRoles) {
      this.excludedRoles = excludedRoles;
      return this;
    }
    
    public RoleTreeCriteria newCriteria() {
      return new RoleTreeCriteria(this);
    }
  }
  
}
