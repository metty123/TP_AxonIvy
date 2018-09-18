[Ivy]
[>Created: Tue Sep 01 14:36:57 ICT 2015]
117B0BD20D66901B 3.17 #module
>Proto >Proto Collection #zClass
Us0 UserRolesProcess Big #zClass
Us0 RD #cInfo
Us0 #process
Us0 @AnnotationInP-0n ai ai #zField
Us0 @MessageFlowInP-0n messageIn messageIn #zField
Us0 @MessageFlowOutP-0n messageOut messageOut #zField
Us0 @TextInP .resExport .resExport #zField
Us0 @TextInP .type .type #zField
Us0 @TextInP .processKind .processKind #zField
Us0 @TextInP .xml .xml #zField
Us0 @TextInP .responsibility .responsibility #zField
Us0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Us0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Us0 @RichDialogInitStart f0 '' #zField
Us0 @RichDialogProcessStart f2 '' #zField
Us0 @RichDialogProcessStart f3 '' #zField
Us0 @RichDialogProcessStart f4 '' #zField
Us0 @RichDialogProcessStart f5 '' #zField
Us0 @RichDialogEnd f6 '' #zField
Us0 @RichDialogEnd f8 '' #zField
Us0 @PushWFArc f9 '' #zField
Us0 @RichDialogProcessEnd f10 '' #zField
Us0 @RichDialogProcessEnd f12 '' #zField
Us0 @RichDialogProcessStart f16 '' #zField
Us0 @RichDialogProcessEnd f17 '' #zField
Us0 @RichDialogProcessStep f21 '' #zField
Us0 @PushWFArc f22 '' #zField
Us0 @PushWFArc f13 '' #zField
Us0 @RichDialogProcessStep f23 '' #zField
Us0 @PushWFArc f24 '' #zField
Us0 @PushWFArc f11 '' #zField
Us0 @RichDialogProcessStep f25 '' #zField
Us0 @PushWFArc f26 '' #zField
Us0 @PushWFArc f7 '' #zField
Us0 @RichDialogProcessEnd f27 '' #zField
Us0 @RichDialogProcessStep f28 '' #zField
Us0 @PushWFArc f29 '' #zField
Us0 @PushWFArc f30 '' #zField
Us0 @RichDialogProcessStart f37 '' #zField
Us0 @RichDialogProcessStep f38 '' #zField
Us0 @RichDialogProcessEnd f39 '' #zField
Us0 @CallSub f40 '' #zField
Us0 @PushWFArc f41 '' #zField
Us0 @PushWFArc f43 '' #zField
Us0 @RichDialogProcessEnd f14 '' #zField
Us0 @RichDialogProcessStep f15 '' #zField
Us0 @Alternative f20 '' #zField
Us0 @CallSub f32 '' #zField
Us0 @RichDialogProcessStep f31 '' #zField
Us0 @PushWFArc f33 '' #zField
Us0 @PushWFArc f34 '' #zField
Us0 @PushWFArc f36 '' #zField
Us0 @PushWFArc f44 '' #zField
Us0 @RichDialogProcessStep f47 '' #zField
Us0 @PushWFArc f48 '' #zField
Us0 @PushWFArc f18 '' #zField
Us0 @PushWFArc f49 '' #zField
Us0 @Alternative f35 '' #zField
Us0 @PushWFArc f45 '' #zField
Us0 @PushWFArc f42 '' #zField
Us0 @RichDialog f46 '' #zField
Us0 @PushWFArc f51 '' #zField
Us0 @RichDialogEnd f52 '' #zField
Us0 @PushWFArc f53 '' #zField
Us0 @RichDialogProcessStart f50 '' #zField
Us0 @PushWFArc f54 '' #zField
Us0 @RichDialogMethodStart f55 '' #zField
Us0 @PushWFArc f56 '' #zField
>Proto Us0 Us0 UserRolesProcess #zField
Us0 f0 guid 117B10029FCE8049 #txt
Us0 f0 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f0 method start(ch.ivyteam.ivy.security.IUser,ch.ivyteam.ivy.application.IApplication) #txt
Us0 f0 disableUIEvents false #txt
Us0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.IUser user,ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Us0 f0 inActionCode 'import javax.persistence.PersistenceException;
try
{
	out.user = param.user;
	out.application = param.application;
	out.topLevelRole = param.application.getSecurityContext().getTopLevelRole();
}
catch (PersistenceException ex)
{
	out.exception = ex;
}' #txt
Us0 f0 outParameterDecl '<> result;
' #txt
Us0 f0 embeddedRdInitializations '* ' #txt
Us0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IUser,IApplication)</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f0 38 38 20 20 13 0 #rect
Us0 f0 @|RichDialogInitStartIcon #fIcon
Us0 f2 guid 117B10047CD2D62A #txt
Us0 f2 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f2 actionTable 'out=in;
' #txt
Us0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>add</name>
        <nameStyle>3,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f2 22 318 20 20 13 0 #rect
Us0 f2 @|RichDialogProcessStartIcon #fIcon
Us0 f3 guid 117B100653F78D71 #txt
Us0 f3 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f3 actionTable 'out=in;
' #txt
Us0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>remove</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f3 166 318 20 20 13 0 #rect
Us0 f3 @|RichDialogProcessStartIcon #fIcon
Us0 f4 guid 117B1006EDC12A7E #txt
Us0 f4 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f4 actionTable 'out=in;
' #txt
Us0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f4 310 318 20 20 13 0 #rect
Us0 f4 @|RichDialogProcessStartIcon #fIcon
Us0 f5 guid 117B10075C73AF76 #txt
Us0 f5 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f5 actionTable 'out=in;
' #txt
Us0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f5 470 318 20 20 13 0 #rect
Us0 f5 @|RichDialogProcessStartIcon #fIcon
Us0 f6 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f6 guid 117B100924F2EDDA #txt
Us0 f6 307 419 26 26 14 0 #rect
Us0 f6 @|RichDialogEndIcon #fIcon
Us0 f8 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f8 guid 117B100A23A2558F #txt
Us0 f8 467 419 26 26 14 0 #rect
Us0 f8 @|RichDialogEndIcon #fIcon
Us0 f9 expr out #txt
Us0 f9 480 338 480 419 #arcP
Us0 f10 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f10 163 467 26 26 14 0 #rect
Us0 f10 @|RichDialogProcessEndIcon #fIcon
Us0 f12 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f12 19 467 26 26 14 0 #rect
Us0 f12 @|RichDialogProcessEndIcon #fIcon
Us0 f16 guid 117B1032B2E126EE #txt
Us0 f16 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f16 actionTable 'out=in;
' #txt
Us0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>select</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f16 454 38 20 20 13 0 #rect
Us0 f16 @|RichDialogProcessStartIcon #fIcon
Us0 f17 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f17 451 163 26 26 14 0 #rect
Us0 f17 @|RichDialogProcessEndIcon #fIcon
Us0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f21 actionTable 'out=in;
' #txt
Us0 f21 actionCode 'import ch.ivyteam.ivy.admin.tool.process.UserRoleLoader;
UserRoleLoader.updateUserRoleOwnOnTree(in.selectedTreeNodes, in.roleTree, "Yes");' #txt
Us0 f21 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Us0 f21 14 388 36 24 20 -2 #rect
Us0 f21 @|RichDialogProcessStepIcon #fIcon
Us0 f22 expr out #txt
Us0 f22 32 338 32 388 #arcP
Us0 f13 expr out #txt
Us0 f13 32 412 32 467 #arcP
Us0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f23 actionTable 'out=in;
' #txt
Us0 f23 actionCode 'import ch.ivyteam.ivy.admin.tool.process.UserRoleLoader;
UserRoleLoader.updateUserRoleOwnOnTree(in.selectedTreeNodes, in.roleTree, "No");' #txt
Us0 f23 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Us0 f23 158 388 36 24 20 -2 #rect
Us0 f23 @|RichDialogProcessStepIcon #fIcon
Us0 f24 expr out #txt
Us0 f24 176 338 176 388 #arcP
Us0 f11 expr out #txt
Us0 f11 176 412 176 467 #arcP
Us0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f25 actionTable 'out=in;
' #txt
Us0 f25 actionCode 'import ch.ivyteam.ivy.security.IRole;

Tree node;

node = in.roleTree;
List<IRole> roles;
IRole role;
String own;

roles.addAll(in.user.getRoles());

while (#node != null)
{
  role = (node.value as List).get(0) as IRole;
  own = (node.value as List).get(1) as String;

  if (own=="Yes")
 	{
		if (!roles.contains(role))
		{
			in.user.addRole(role);
		}
  }
  else
  {
    if (roles.contains(role))
		{
			in.user.removeRole(role);
		} 
  }
	node = node.getNextNode();
}' #txt
Us0 f25 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Us0 f25 302 364 36 24 20 -2 #rect
Us0 f25 @|RichDialogProcessStepIcon #fIcon
Us0 f26 expr out #txt
Us0 f26 320 338 320 364 #arcP
Us0 f7 expr out #txt
Us0 f7 320 388 320 419 #arcP
Us0 f27 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f27 35 163 26 26 14 0 #rect
Us0 f27 @|RichDialogProcessEndIcon #fIcon
Us0 f28 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f28 actionTable 'out=in;
' #txt
Us0 f28 actionCode 'List values;

values = [in.topLevelRole, "Yes"];
in.roleTree.value = values;
in.roleTree.info = "Role " + in.topLevelRole.getId();

in.activeRoleTree.value = values;
in.activeRoleTree.info = "Role " + in.topLevelRole.getId();' #txt
Us0 f28 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Us0 f28 30 100 36 24 20 -2 #rect
Us0 f28 @|RichDialogProcessStepIcon #fIcon
Us0 f29 expr out #txt
Us0 f29 48 58 48 100 #arcP
Us0 f30 expr out #txt
Us0 f30 48 124 48 163 #arcP
Us0 f37 guid 147C97A5D5122096 #txt
Us0 f37 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f37 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f37 actionTable 'out=in;
' #txt
Us0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onLoad</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f37 221 45 22 22 14 0 #rect
Us0 f37 @|RichDialogProcessStartIcon #fIcon
Us0 f38 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f38 actionTable 'out=in;
' #txt
Us0 f38 actionCode 'import ch.ivyteam.ivy.admin.tool.security.UserRoles.TableTreeCellRenderer;
import com.ulcjava.base.application.tabletree.DefaultTableTreeCellRenderer;
import ch.ivyteam.ivy.admin.tool.security.RoleTree.Roles;
import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.admin.tool.process.UserRoleLoader;

in.exception = null;
in.message = "";

try 
{
	in.activeRoles = in.application.getSecurityContext().getActiveRoles();
	UserRoleLoader.loadActiveChildren(in.activeRoleTree, in.user, in.activeRoles);
	UserRoleLoader.loadChildren(in.roleTree, in.user);
	// default load list without obsolete roles
	panel.rolesTableTree.tableTreeData = in.activeRoleTree.deepClone();
} 
catch (Exception ex) 
{
	if(ex.getMessage().contains("CommunicationException")) 
	{		
		in.message = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/connectionRefuse");
	} 
	else if(ex.getMessage().contains("AuthenticationException")) 
	{
		in.message = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/authenticationException");
	} 
	else 
	{
		in.exception = ex;
	}
}

DefaultTableTreeCellRenderer renderer = panel.rolesTableTree.getColumnModel().getColumn(0).getCellRenderer() as DefaultTableTreeCellRenderer;

List activeRoles = new Roles().filterSecurityRoles(in.topLevelRole, in.activeRoles);
panel.rolesTableTree.getColumnModel().getColumn(0).setCellRenderer(new TableTreeCellRenderer(renderer, activeRoles));' #txt
Us0 f38 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load tree</name>
        <nameStyle>9,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f38 214 100 36 24 20 -2 #rect
Us0 f38 @|RichDialogProcessStepIcon #fIcon
Us0 f39 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f39 221 261 22 22 14 0 #rect
Us0 f39 @|RichDialogProcessEndIcon #fIcon
Us0 f40 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f40 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Us0 f40 doCall true #txt
Us0 f40 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Us0 f40 requestMappingAction 'param.exception=in.exception;
' #txt
Us0 f40 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f40 responseMappingAction 'out=in;
' #txt
Us0 f40 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f40 214 196 36 24 20 -2 #rect
Us0 f40 @|CallSubIcon #fIcon
Us0 f41 expr out #txt
Us0 f41 232 67 232 100 #arcP
Us0 f43 expr out #txt
Us0 f43 232 220 232 261 #arcP
Us0 f14 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f14 645 293 22 22 14 0 #rect
Us0 f14 @|RichDialogProcessEndIcon #fIcon
Us0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f15 actionTable 'out=in;
' #txt
Us0 f15 actionCode 'import java.util.regex.PatternSyntaxException;
import ch.ivyteam.ivy.admin.tool.process.UserRoleLoader;
import ch.ivyteam.ivy.persistence.PersistencyException;

in.exception = null;
boolean removeRoot = false;
in.keyword = panel.roleLookupTextField.text;

try 
{
	if (panel.roleFilterCheckBox.isSelected())
	{
		panel.rolesTableTree.tableTreeData = in.roleTree.deepClone();
	}
	else 
	{
		panel.rolesTableTree.tableTreeData = in.activeRoleTree.deepClone();
	}
	
	if (!in.keyword.isEmpty())
	{
		removeRoot = UserRoleLoader.filterRolesByName(in.keyword, panel.rolesTableTree.tableTreeData);
	}
} 
catch (PersistencyException pe) 
{
	in.exception = pe;
} 
catch(PatternSyntaxException pse)
{
	panel.rolesTableTree.tableTreeData.removeAllChildren();
	removeRoot = true;
} 
catch (IllegalArgumentException iae) 
{
	panel.rolesTableTree.tableTreeData.removeAllChildren();
	removeRoot = true;
}

panel.rolesTableTree.setRootVisible(!removeRoot);' #txt
Us0 f15 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter role tree</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f15 638 84 36 24 20 -2 #rect
Us0 f15 @|RichDialogProcessStepIcon #fIcon
Us0 f20 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>exception?</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f20 642 130 28 28 14 0 #rect
Us0 f20 @|AlternativeIcon #fIcon
Us0 f32 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f32 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Us0 f32 doCall true #txt
Us0 f32 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Us0 f32 requestMappingAction 'param.exception=in.exception;
' #txt
Us0 f32 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f32 responseMappingAction 'out=in;
' #txt
Us0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f32 638 244 36 24 20 -2 #rect
Us0 f32 @|CallSubIcon #fIcon
Us0 f31 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f31 actionTable 'out=in;
' #txt
Us0 f31 actionCode 'import java.util.regex.PatternSyntaxException;
import ch.ivyteam.ivy.richdialog.widgets.components.models.TreeTableTreeModel;
import ch.ivyteam.ivy.security.IRole;
import java.util.regex.Pattern;
import com.ulcjava.base.application.tree.TreePath;
import java.util.Collections;

in.exception = null;

try {
	if (!in.keyword.isEmpty())
	{
		panel.rolesTableTree.collapseAll();
	}
	
	panel.rolesTableTree.clearSelection();
	String regex = "(.|\n)*" + in.keyword + "(.|\n)*";
	Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	List<Tree> selectedTreeNodes = [];
	for (Tree tree : panel.rolesTableTree.tableTreeData.getAllDeepChildren()) {
		for (Tree selectedTreeNode : in.selectedTreeNodes) {
			if (selectedTreeNode.info == tree.info) {
				selectedTreeNodes.add(tree);
			}
		}
		
		List<Object> nodeValues = tree.getValue() as List<Object>;
		IRole childRole = nodeValues.get(0) as IRole;
		
		if (p.matcher(childRole.getName()).matches()) {
			TreeTableTreeModel model = (panel.rolesTableTree.getModel() as TreeTableTreeModel);
			TreePath treePath = model.getTreePath(tree.getParent());
			panel.rolesTableTree.expandPath(treePath);
		}
	}
	
	panel.rolesTableTree.selectedTreeNodes = selectedTreeNodes;	
} catch (Exception e) {
	if (e instanceof PatternSyntaxException || e instanceof IllegalArgumentException) {
		panel.rolesTableTree.tableTreeData.removeAllChildren();
		panel.rolesTableTree.setRootVisible(false);
	} else {
		in.exception = e;
	}
}' #txt
Us0 f31 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>expand/collapse tree</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f31 638 196 36 24 20 -2 #rect
Us0 f31 @|RichDialogProcessStepIcon #fIcon
Us0 f33 expr out #txt
Us0 f33 656 108 656 130 #arcP
Us0 f34 expr in #txt
Us0 f34 outCond 'in.#exception is initialized' #txt
Us0 f34 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f34 670 144 674 256 #arcP
Us0 f34 1 816 144 #addKink
Us0 f34 2 816 256 #addKink
Us0 f34 1 0.4791666666666667 0 0 #arcLabel
Us0 f36 expr out #txt
Us0 f36 656 220 656 244 #arcP
Us0 f44 expr out #txt
Us0 f44 656 268 656 293 #arcP
Us0 f47 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f47 actionTable 'out=in;
' #txt
Us0 f47 actionCode 'import ch.ivyteam.ivy.security.IRole;
import ch.ivyteam.ivy.richdialog.widgets.components.models.TreeTableTreeModel;
import com.ulcjava.base.application.tree.TreePath;

boolean enableButtons = true;

for (Tree selectedTreeNode : in.selectedTreeNodes) {
	if (selectedTreeNode == panel.rolesTableTree.tableTreeData || !((selectedTreeNode.value as List).get(0) as IRole).getExternalSecurityName().trim().isEmpty()) {
		enableButtons = false;
		break;
	}
}

panel.addButton.enabled = enableButtons;
panel.removeButton.enabled = enableButtons;' #txt
Us0 f47 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f47 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>enable/disable buttons</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f47 446 100 36 24 20 -2 #rect
Us0 f47 @|RichDialogProcessStepIcon #fIcon
Us0 f48 expr out #txt
Us0 f48 464 58 464 100 #arcP
Us0 f18 expr out #txt
Us0 f18 464 124 464 163 #arcP
Us0 f49 expr in #txt
Us0 f49 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f49 656 158 656 196 #arcP
Us0 f49 0 0.42857142857142855 -10 0 #arcLabel
Us0 f35 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isServerConnect?</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f35 218 146 28 28 14 0 #rect
Us0 f35 @|AlternativeIcon #fIcon
Us0 f45 expr out #txt
Us0 f45 232 124 232 146 #arcP
Us0 f42 expr in #txt
Us0 f42 outCond in.message.isEmpty() #txt
Us0 f42 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f42 232 174 232 196 #arcP
Us0 f46 targetWindow NEW:card: #txt
Us0 f46 targetDisplay TOP #txt
Us0 f46 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f46 startMethod start(String) #txt
Us0 f46 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f46 requestActionDecl '<String errorMessage> param;' #txt
Us0 f46 requestMappingAction 'param.errorMessage=in.message;
' #txt
Us0 f46 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f46 responseMappingAction 'out=in;
' #txt
Us0 f46 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f46 isAsynch false #txt
Us0 f46 isInnerRd true #txt
Us0 f46 userContext '* ' #txt
Us0 f46 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f46 342 196 36 24 20 -2 #rect
Us0 f46 @|RichDialogIcon #fIcon
Us0 f51 expr in #txt
Us0 f51 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f51 246 160 360 196 #arcP
Us0 f51 1 360 160 #addKink
Us0 f51 0 0.9298245614035088 0 -7 #arcLabel
Us0 f52 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f52 guid 147FCFA364BC6E7B #txt
Us0 f52 349 261 22 22 14 0 #rect
Us0 f52 @|RichDialogEndIcon #fIcon
Us0 f53 expr out #txt
Us0 f53 360 220 360 261 #arcP
Us0 f53 0 0.38079602098993925 0 0 #arcLabel
Us0 f50 guid 14EB5432E3B22786 #txt
Us0 f50 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f50 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData out;
' #txt
Us0 f50 actionTable 'out=in;
' #txt
Us0 f50 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>display obsolete roles</name>
        <nameStyle>22,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f50 829 37 22 22 14 0 #rect
Us0 f50 @|RichDialogProcessStartIcon #fIcon
Us0 f54 expr out #txt
Us0 f54 829 50 674 96 #arcP
Us0 f55 guid 14F2126A4A58C079 #txt
Us0 f55 type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
Us0 f55 method filter() #txt
Us0 f55 disableUIEvents false #txt
Us0 f55 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f55 outParameterDecl '<> result;
' #txt
Us0 f55 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter()</name>
    </language>
</elementInfo>
' #txt
Us0 f55 645 21 22 22 14 0 #rect
Us0 f55 @|RichDialogMethodStartIcon #fIcon
Us0 f56 expr out #txt
Us0 f56 656 43 656 84 #arcP
>Proto Us0 .type ch.ivyteam.ivy.admin.tool.security.UserRoles.UserRolesData #txt
>Proto Us0 .processKind RICH_DIALOG #txt
>Proto Us0 .ui2RdDataAction 'out.selectedTreeNodes=panel.rolesTableTree.#selectedTreeNodes;
' #txt
>Proto Us0 -8 -8 16 16 16 26 #rect
>Proto Us0 '' #fIcon
Us0 f5 mainOut f9 tail #connect
Us0 f9 head f8 mainIn #connect
Us0 f2 mainOut f22 tail #connect
Us0 f22 head f21 mainIn #connect
Us0 f21 mainOut f13 tail #connect
Us0 f13 head f12 mainIn #connect
Us0 f3 mainOut f24 tail #connect
Us0 f24 head f23 mainIn #connect
Us0 f23 mainOut f11 tail #connect
Us0 f11 head f10 mainIn #connect
Us0 f4 mainOut f26 tail #connect
Us0 f26 head f25 mainIn #connect
Us0 f25 mainOut f7 tail #connect
Us0 f7 head f6 mainIn #connect
Us0 f0 mainOut f29 tail #connect
Us0 f29 head f28 mainIn #connect
Us0 f28 mainOut f30 tail #connect
Us0 f30 head f27 mainIn #connect
Us0 f37 mainOut f41 tail #connect
Us0 f41 head f38 mainIn #connect
Us0 f40 mainOut f43 tail #connect
Us0 f43 head f39 mainIn #connect
Us0 f15 mainOut f33 tail #connect
Us0 f33 head f20 in #connect
Us0 f20 out f34 tail #connect
Us0 f34 head f32 mainIn #connect
Us0 f31 mainOut f36 tail #connect
Us0 f36 head f32 mainIn #connect
Us0 f32 mainOut f44 tail #connect
Us0 f44 head f14 mainIn #connect
Us0 f16 mainOut f48 tail #connect
Us0 f48 head f47 mainIn #connect
Us0 f47 mainOut f18 tail #connect
Us0 f18 head f17 mainIn #connect
Us0 f20 out f49 tail #connect
Us0 f49 head f31 mainIn #connect
Us0 f38 mainOut f45 tail #connect
Us0 f45 head f35 in #connect
Us0 f35 out f42 tail #connect
Us0 f42 head f40 mainIn #connect
Us0 f35 out f51 tail #connect
Us0 f51 head f46 mainIn #connect
Us0 f46 mainOut f53 tail #connect
Us0 f53 head f52 mainIn #connect
Us0 f50 mainOut f54 tail #connect
Us0 f54 head f15 mainIn #connect
Us0 f55 mainOut f56 tail #connect
Us0 f56 head f15 mainIn #connect
