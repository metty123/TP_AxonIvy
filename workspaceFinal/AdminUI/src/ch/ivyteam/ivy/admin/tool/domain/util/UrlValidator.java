package ch.ivyteam.ivy.admin.tool.domain.util;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator implements Serializable {
  private static final long FRAGMENT_MASK = 4L;
  private static final int AUTHORITY_EXTRA_GROUP = 3;
  private static final int AUTHORITY_PORT_GROUP = 2;
  private static final int AUTHORITY_HOST_GROUP = 1;
  private static final int FRAGMENT_GROUP = 9;
  private static final int QUERY_GROUP = 7;
  private static final int PATH_GROUP = 5;
  private static final int AUTHORITY_GROUP = 4;
  private static final int SCHEME_GROUP = 2;
  private static final long serialVersionUID = 7557161713937335013L;
  public static final long ALLOW_ALL_SCHEMES = 1L;
  public static final long ALLOW_2_SLASHES = 2L;
  public static final long NO_FRAGMENTS = 4L;
  public static final long ALLOW_LOCAL_URLS = 8L;
  private static final Pattern URL_PATTERN = Pattern
      .compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?");
  private static final Pattern SCHEME_PATTERN = Pattern.compile("^\\p{Alpha}[\\p{Alnum}\\+\\-\\.]*");
  private static final Pattern AUTHORITY_PATTERN = Pattern.compile("^([\\p{Alnum}\\-\\.]*)(:\\d*)?(.*)?");
  private static final Pattern PATH_PATTERN = Pattern.compile("^(/[-\\w:@&?=+,.!/~*'%$_;\\(\\)]*)?$");
  private static final Pattern QUERY_PATTERN = Pattern.compile("^(.*)$");
  private static final Pattern ASCII_PATTERN = Pattern.compile("^\\p{ASCII}+$");
  private static final Pattern PORT_PATTERN = Pattern.compile("^:(\\d{1,5})$");
  private final long options;
  private final Set<String> allowedSchemes;
  private final RegexValidator authorityValidator;
  private static final String[] DEFAULT_SCHEMES = {"http", "https", "ftp"};

  private static final UrlValidator DEFAULT_URL_VALIDATOR = new UrlValidator();

  public static UrlValidator getInstance() {
    return DEFAULT_URL_VALIDATOR;
  }

  public UrlValidator() {
    this(null);
  }

  public UrlValidator(String[] schemes) {
    this(schemes, 0L);
  }

  public UrlValidator(long options) {
    this(null, null, options);
  }

  public UrlValidator(String[] schemes, long options) {
    this(schemes, null, options);
  }

  public UrlValidator(RegexValidator authorityValidator, long options) {
    this(null, authorityValidator, options);
  }

  @SuppressWarnings("unchecked")
  public UrlValidator(String[] schemes, RegexValidator authorityValidator, long options) {
    this.options = options;

    if (isOn(1L)) {
      this.allowedSchemes = Collections.EMPTY_SET;
    } else {
      this.allowedSchemes = new HashSet<String>();
      this.allowedSchemes.addAll(Arrays.asList(schemes == null ? DEFAULT_SCHEMES : schemes));
    }

    this.authorityValidator = authorityValidator;
  }

  public boolean isValid(String value) {
    if (value == null) {
      return false;

    }

    if (!(ASCII_PATTERN.matcher(value).matches())) {
      return false;
    }

    Matcher urlMatcher = URL_PATTERN.matcher(value);
    if (!(urlMatcher.matches())) {
      return false;
    }

    String scheme = urlMatcher.group(SCHEME_GROUP);
    if (!(isValidScheme(scheme))) {
      return false;
    }

    String authority = urlMatcher.group(AUTHORITY_GROUP);
    if ((!("file".equals(scheme))) || (!("".equals(authority)))) {
      if (!(isValidAuthority(authority))) { // NOSONAR
        return false;
      }
    }

    if (!(isValidPath(urlMatcher.group(PATH_GROUP)))) {
      return false;
    }

    if (!(isValidQuery(urlMatcher.group(QUERY_GROUP)))) {
      return false;
    }

    return (isValidFragment(urlMatcher.group(FRAGMENT_GROUP)));
  }

  protected boolean isValidScheme(String scheme) {
    if (scheme == null) {
      return false;
    }

    if (!(SCHEME_PATTERN.matcher(scheme).matches())) {
      return false;
    }

    return ((!(isOff(1L))) || (this.allowedSchemes.contains(scheme)));
  }

  protected boolean isValidAuthority(String authority) {
    if (authority == null) {
      return false;
    }

    if ((this.authorityValidator != null) && (this.authorityValidator.isValid(authority))) {
      return true;
    }

    Matcher authorityMatcher = AUTHORITY_PATTERN.matcher(authority);
    if (!(authorityMatcher.matches())) {
      return false;
    }

    String hostLocation = authorityMatcher.group(AUTHORITY_HOST_GROUP);

    DomainValidator domainValidator = DomainValidator.getInstance();
    if (!(domainValidator.isValid(hostLocation))) {
      InetAddressValidator inetAddressValidator = InetAddressValidator.getInstance();

      if (!inetAddressValidator.isValid(hostLocation)) {
        return false;
      }
    }

    String port = authorityMatcher.group(AUTHORITY_PORT_GROUP);
    if ((port != null) && (!(PORT_PATTERN.matcher(port).matches()))) {
      return false;
    }

    String extra = authorityMatcher.group(AUTHORITY_EXTRA_GROUP);

    return ((extra == null) || (extra.trim().length() <= 0));
  }

  protected boolean isValidPath(String path) {
    if (path == null) {
      return false;
    }

    if (!(PATH_PATTERN.matcher(path).matches())) {
      return false;
    }

    return true;
  }

  protected boolean isValidQuery(String query) {
    if (query == null) {
      return true;
    }

    return QUERY_PATTERN.matcher(query).matches();
  }

  protected boolean isValidFragment(String fragment) {
    if (fragment == null) {
      return true;
    }
    return isOff(FRAGMENT_MASK);
  }

  private boolean isOn(long flag) {
    return ((this.options & flag) > 0L);
  }

  private boolean isOff(long flag) {
    return ((this.options & flag) == 0L);
  }

}
