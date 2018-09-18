package ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser;

import java.io.IOException;

import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.ldap.Control;
import javax.naming.ldap.LdapContext;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.PagedResultsControl;
import javax.naming.ldap.PagedResultsResponseControl;

import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanel;
import ch.ivyteam.ivy.richdialog.rdpanels.RichDialogGridBagPanel;
import ch.ivyteam.ivy.richdialog.widgets.components.RButton;
import ch.ivyteam.ivy.richdialog.widgets.components.RTable;
import ch.ivyteam.ivy.richdialog.widgets.components.RTree;
import ch.ivyteam.ivy.richdialog.widgets.containers.RGridLayoutPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane;
import ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane;
import ch.ivyteam.ivy.scripting.objects.Tree;
import ch.ivyteam.naming.JndiUtil;

import com.ulcjava.base.application.util.Color;

/**
 * RichDialog panel implementation for JndiBrowserPanel.
 * 
 * @author <%=author%>
 * @since <%=date%>
 */
public class JndiBrowserPanel extends RichDialogGridBagPanel implements IRichDialogPanel {
  /** Serial version id */
  private static final long serialVersionUID = 1L;
  private RSplitPane browserSplitPane = null;
  private RScrollPane treeScrollPane = null;
  private RScrollPane attributesScrollPane = null;
  private RTree jndiBrowserTree = null;
  private RTable jndiAttributeTable = null;
  private RGridLayoutPane buttonPane = null;
  private RButton okButton = null;
  private RButton cancelButton = null;

  // SONAR-OFF
  /**
   * Create a new instance of JndiBrowserPanel
   */
  public JndiBrowserPanel() {
    super();
    initialize();
  }

  // SONAR-ON
  /**
   * This method initializes JndiBrowserPanel
   * 
   * @return void
   */
  public void initialize() {
    this.setPreferredSize(new com.ulcjava.base.application.util.Dimension(700, 500));
    this.add(getBrowserSplitPane(), new com.ulcjava.base.application.GridBagConstraints(0, 0, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
    this.add(getButtonPane(), new com.ulcjava.base.application.GridBagConstraints(0, 1, 1, 1, -1, -1,
        com.ulcjava.base.application.GridBagConstraints.CENTER, com.ulcjava.base.application.GridBagConstraints.NONE,
        new com.ulcjava.base.application.util.Insets(0, 0, 0, 0), 0, 0));
  }

  /**
   * This method initializes browserSplitPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RSplitPane
   */
  private RSplitPane getBrowserSplitPane() {
    if (browserSplitPane == null) {
      browserSplitPane = new RSplitPane();
      browserSplitPane.setName("browserSplitPane");
      browserSplitPane.setStyleProperties("{/fill \"BOTH\"/weightY \"1\"/weightX \"1\"}");
      browserSplitPane.setMinimumSize(new com.ulcjava.base.application.util.Dimension(600, 350));
      browserSplitPane.setDividerLocation(250);
      browserSplitPane.setStyle("fill-both-border");
      browserSplitPane.setRightComponent(getAttributesScrollPane());
      browserSplitPane.setLeftComponent(getTreeScrollPane());
    }
    return browserSplitPane;
  }

  /**
   * This method initializes treeScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getTreeScrollPane() {
    if (treeScrollPane == null) {
      treeScrollPane = new RScrollPane();
      treeScrollPane.setName("treeScrollPane");
      treeScrollPane.setViewPortView(getJndiBrowserTree());
    }
    return treeScrollPane;
  }

  /**
   * This method initializes attributesScrollPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RScrollPane
   */
  private RScrollPane getAttributesScrollPane() {
    if (attributesScrollPane == null) {
      attributesScrollPane = new RScrollPane();
      attributesScrollPane.setName("attributesScrollPane");
      attributesScrollPane.setViewPortView(getJndiAttributeTable());
    }
    return attributesScrollPane;
  }

  /**
   * This method initializes jndiBrowserTree
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTree
   */
  private RTree getJndiBrowserTree() {
    if (jndiBrowserTree == null) {
      jndiBrowserTree = new RTree();
      jndiBrowserTree.setName("jndiBrowserTree");
      jndiBrowserTree.setRootVisible(true);
      jndiBrowserTree.setBackground(new Color(244, 247, 255));
      jndiBrowserTree
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons true /dynamicTreeLoadMode \"LOAD_ON_EXPAND\"/version \"3.0\"/emptyTableText \"\"/columns {{/patterns {{/result \"\"/version \"3.0\"/patternMode \"ALL\"/patternValue \"default\"}{/result \"result=entry.size()>0?entry.get(entry.size()-1):\\\"\\\"\"/version \"3.0\"/tooltip \"\"/icon \"result=ivy.cms.cr(node.info)\"/field \"\"/patternMode \"INSTANCE\"/patternValue \"javax.naming.Name\"}{/result \"\"/version \"3.0\"/patternMode \"ALL\"/patternValue \"default\"}}/version \"3.0\"}}}");
    }
    return jndiBrowserTree;
  }

  /**
   * This method initializes jndiAttributeTable
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RTable
   */
  private RTable getJndiAttributeTable() {
    if (jndiAttributeTable == null) {
      jndiAttributeTable = new RTable();
      jndiAttributeTable.setName("jndiAttributeTable");
      jndiAttributeTable.setSortable(true);
      jndiAttributeTable
          .setModelConfiguration("{/showTableheader true /autoTableheader false /showtooltip false /showIcons false /version \"3.0\"/columns {{/result \"result=entry.get(0)\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Name\\\"\"/field \"\"/columnWidth \"200\"}{/result \"result=entry.get(1)\"/version \"3.0\"/tooltip \"\"/icon \"\"/header \"\\\"Value\\\"\"/field \"\"/columnWidth \"400\"}}}");
    }
    return jndiAttributeTable;
  }

  /**
   * This method initializes buttonPane
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.containers.RBoxLayoutPane
   */
  private RGridLayoutPane getButtonPane() {
    if (buttonPane == null) {
      buttonPane = new RGridLayoutPane();
      buttonPane.setName("buttonPane");
      buttonPane
          .setStyleProperties("{/anchor \"EAST\"/insetsBottom \"5\"/insetsTop \"5\"/hgap \"5\"/insetsRight \"5\"}");
      buttonPane.add(getOkButton());
      buttonPane.add(getCancelButton());
    }
    return buttonPane;
  }

  /**
   * This method initializes okButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getOkButton() {
    if (okButton == null) {
      okButton = new RButton();
      okButton.setText("Ok");
      okButton.setStyleProperties("{/insetsBottom \"50\"}");
      okButton.setDefaultCapable(true);
      okButton.setName("okButton");
    }
    return okButton;
  }

  /**
   * This method initializes cancelButton
   * 
   * @return ch.ivyteam.ivy.richdialog.widgets.components.RButton
   */
  private RButton getCancelButton() {
    if (cancelButton == null) {
      cancelButton = new RButton();
      cancelButton.setName("cancelButton");
      cancelButton.setText("Cancel");
      cancelButton.setName("cancelButton");
    }
    return cancelButton;
  }

  public void loadChildren(DirContext context, Tree ldapTree) throws NamingException, IOException {
    Name nodeName = (Name) ldapTree.getValue();
    byte[] cookie = null;
    LdapContext dirContext = (LdapContext) context;
    try {
      dirContext.setRequestControls(new Control[] {new PagedResultsControl(500, true)});
      do {
        NamingEnumeration<NameClassPair> ne = dirContext.list(nodeName);
        try {
          while (ne.hasMoreElements()) {
            NameClassPair pair = ne.nextElement();
            String entry = pair.getNameInNamespace();
            Name childName = new LdapName(entry);
            ldapTree.add(new Tree(childName, getIcon(dirContext, childName)));
          }
        } finally {
          JndiUtil.close(ne);
        }
        cookie = ((PagedResultsResponseControl) dirContext.getResponseControls()[0]).getCookie();
        if (cookie != null) {
          dirContext.setRequestControls(new Control[] {new PagedResultsControl(500, cookie, Control.CRITICAL)});
        }
      } while (cookie != null);
    } catch (Exception ex) {
    }
  }

  public String getIcon(DirContext ldapContext, Name childName) throws NamingException {
    String name = childName.toString().toLowerCase();
    if (name.startsWith("dc=")) {
      return "/images/klein/dc";
    }
    if (name.startsWith("ou=")) {
      return "/images/klein/ou";
    }
    if (name.startsWith("cn=")) {
      try {
        Attributes attributes = ldapContext.getAttributes(childName, new String[] {"objectClass"});
        Attribute attribute = attributes.get("objectClass");
        if (attribute != null) {
          if (isGroup(attribute)) {
            return "/images/klein/role";
          }
          if (isUser(attribute)) {
            return "/images/klein/user";
          }
        }
      } catch (Exception ex) {
      }
    }
    return "/images/klein/jndiObj";
  }

  private boolean isUser(Attribute attribute) {
    return (attribute.contains("Person") || attribute.contains("user")) && (!attribute.contains("computer"));
  }

  private boolean isGroup(Attribute attribute) {
    return attribute.contains("group") || attribute.contains("groupOfNames");
  }
} // @jve:decl-index=0:visual-constraint="10,10"
