package ch.ivyteam.ivy.admin.tool.domain.util;

import java.io.Serializable;

public final class DomainValidator implements Serializable {
  private static final long serialVersionUID = -4407125112880174009L;
  private static final DomainValidator DOMAIN_VALIDATOR = new DomainValidator();
  private final RegexValidator domainRegex = new RegexValidator(
      "^(?:\\p{Alnum}(?>[\\p{Alnum}-]*\\p{Alnum})*\\.)+(\\p{Alpha}{2,})$");
  private final RegexValidator hostnameRegex = new RegexValidator("\\p{Alnum}(?>[\\p{Alnum}-]*\\p{Alnum})*");

  public static DomainValidator getInstance() {
    return DOMAIN_VALIDATOR;
  }

  private DomainValidator() {}

  public boolean isValid(String domain) {
    String[] groups = this.domainRegex.match(domain);
    if ((groups != null) && (groups.length > 0)) {
      return isValidTld(groups[0]);
    }
    return this.hostnameRegex.isValid(domain);
  }

  public boolean isValidTld(String tld) {
    return isSimpleValidTld(tld);
  }

  public boolean isSimpleValidTld(String tld) {
    return (chompLeadingDot(tld).length() >= 2);
  }

  private String chompLeadingDot(String str) {
    if (str.startsWith(".")) {
      return str.substring(1);
    }
    return str;
  }

}
