package ch.ivyteam.ivy.admin.tool.checker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.ParseException;

import ch.ivyteam.log.Logger;

public final class LdapFilterSyntaxChecker {
  private static final Logger LOGGER = Logger.getClassLogger(LdapFilterSyntaxChecker.class);

  private static final String OPEN_PARENTHESES = "(";
  private static final String CLOSE_PARENTHESES = ")";

  private static final List<String> OPERATORS = Arrays.asList("&", "|", "!");

  private LdapFilterSyntaxChecker() {

  }

  /**
   * check ldap filter syntax
   * 
   * @param expression
   * @return
   */
  public static boolean checkLdapFilterSyntax(String expression) {
    List<String> result;
    try {
      // break it down to list of "(", ")", "&", "!", "&", sub expression
      result = breakExpresstion(expression);
    } catch (ParseException e) {
      LOGGER.debug(e.getMessage());
      return false;
    }

    if (!hasEqualOpenAndCloseParentheses(result)) {
      return false;
    }

    return checkExpressionSyntax(result);
  }

  /**
   * break ldap expression to many small item list of parentheses, operator and child expression ie: (&(A=B)(C=D)) -->
   * ["(", "&", "(", "A=B", ")", "(", "C=D", ")", ")"]
   * 
   * @param expresstion
   * @return
   * @throws ParseException
   */
  private static List<String> breakExpresstion(String expresstion) throws ParseException {
    List<String> returnList = new ArrayList<String>();
    List<Pattern> paternList = new ArrayList<Pattern>();

    paternList.add(Pattern.compile("^\\&"));
    paternList.add(Pattern.compile("^\\!"));
    paternList.add(Pattern.compile("^\\|"));
    paternList.add(Pattern.compile("^\\("));
    paternList.add(Pattern.compile("^\\)"));
    paternList.add(Pattern
        .compile("^[_A-Za-z0-9-]+([:\\._A-Za-z0-9-]+)*+(=|>=|<=|~=)*[\\\\*_A-Za-z0-9-]+([\\.\\s\\\\*_A-Za-z0-9-]+)*"));

    String s = expresstion.trim();
    while (!s.equals("")) {
      boolean match = false;
      for (Pattern info : paternList) {
        Matcher m = info.matcher(s);
        if (m.find()) {
          match = true;
          String tok = m.group().trim();
          s = m.replaceFirst("").trim();
          returnList.add(tok);
          break;
        }
      }
      if (!match) {
        throw new ParseException("Unexpected character in input: " + s);
      }
    }

    return returnList;
  }

  /**
   * from a list of parentheses, operator and expression, check real meaning of LDAP expression
   * 
   * @param tokenList
   * @return
   */
  private static boolean checkExpressionSyntax(List<String> tokenList) {
    for (int i = 0; i < tokenList.size(); i++) {
      String item = tokenList.get(i);
      // After "(" must not be "(", ")" or it is at the end of break down list
      if (item.equals(OPEN_PARENTHESES)) {
        if (i + 1 < tokenList.size()) {
          if (tokenList.get(i + 1).equals(OPEN_PARENTHESES)) {
            LOGGER.debug("2 open parentheses without operator");
            return false;
          } else if (tokenList.get(i + 1).equals(CLOSE_PARENTHESES)) {
            LOGGER.debug("Has empty statement");
            return false;
          } else if (i + 2 == tokenList.size()) {
            LOGGER.debug("Has incomplete statement");
            return false;
          } else if (i + 2 > tokenList.size()) {
            LOGGER.debug("Has open but not close parentheses");
            return false;
          }

        } else if (i + 1 >= tokenList.size()) {
          LOGGER.debug("Has open but not close parentheses");
          return false;
        }
      }
      // After ")" must not be "(", it can not be at index 0, 1 of list
      else if (item.equals(CLOSE_PARENTHESES)) {
        if (i == 0 || i == 1) {
          LOGGER.debug("close parentheses can not be here");
          return false;
        }
        // next item must be "(", ")" or operator
        if (i + 1 < tokenList.size()) {
          String nextItem = tokenList.get(i + 1);
          if (!nextItem.equals(OPEN_PARENTHESES) && !nextItem.equals(CLOSE_PARENTHESES)
              && !OPERATORS.contains(nextItem)) {
            LOGGER.debug("after close parentheses has a clause");
            return false;
          }
        }
      }
      // if it is operator, before and after it must be close parentheses
      else if (OPERATORS.contains(item)) {
        // operator is at the beginning like &(A=B)
        if (i == 0) {
          LOGGER.debug("Operator can not be at the beginning");
          return false;
        }
        // after operator it must have at least 2 items like ....(!A=B))
        else if (i + 2 >= tokenList.size()) {
          LOGGER.debug("Has invalid operator statement, not enough item after operator");
          return false;
        }
        // if item is not NEGATIVE operator and next item of operator is not a open parentheses
        else if (!item.equals("!") && i + 1 < tokenList.size() && !tokenList.get(i + 1).equals(OPEN_PARENTHESES)) {
          LOGGER.debug("Has invalid operator statement");
          return false;
        }

        // if operator is AND or OR, it must have at least 2 sub expressions
        if (item.equals("&") || item.equals("|")) {
          int numberOfOpenParentheses = countForNumberOfExistence(tokenList, i + 1, OPEN_PARENTHESES);
          int numberOfCloseParentheses = countForNumberOfExistence(tokenList, i + 1, CLOSE_PARENTHESES);
          if (numberOfOpenParentheses < 2 || numberOfCloseParentheses < 3 // NOSONAR
              || numberOfOpenParentheses + 1 > numberOfCloseParentheses) {
            LOGGER.debug("Invalid statement");
            return false;
          }
        }
      }
    }
    return true;
  }

  /**
   * determine whether LDAP expression has equal open and close parentheses
   * 
   * @param tokenList
   * @return
   */
  private static boolean hasEqualOpenAndCloseParentheses(List<String> tokenList) {
    int numberOfOpenParentheses = 0;
    int numberOfCloseParentheses = 0;
    for (String item : tokenList) {
      if (item.equals(OPEN_PARENTHESES)) {
        numberOfOpenParentheses++;
      } else if (item.equals(CLOSE_PARENTHESES)) {
        numberOfCloseParentheses++;
      }
    }
    if (numberOfCloseParentheses != numberOfOpenParentheses) {
      LOGGER.debug("Numbers of open and close parentheses are not equal");
      return false;
    }
    return true;
  }

  /**
   * for a list of string named tokenList, count number of existence of string regex
   * 
   * @param tokenList
   * @param beginIndex
   * @param regex
   * @return
   */
  private static int countForNumberOfExistence(List<String> tokenList, int beginIndex, String regex) {
    int count = 0;

    for (int i = beginIndex; i < tokenList.size(); i++) {
      if (tokenList.get(i).equals(regex)) {
        count++;
      }
    }
    return count;
  }
}
