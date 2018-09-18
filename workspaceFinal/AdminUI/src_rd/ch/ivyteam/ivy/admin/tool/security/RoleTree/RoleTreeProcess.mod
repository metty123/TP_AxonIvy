[Ivy]
[>Created: Tue Jun 07 10:30:29 ICT 2016]
117AB326C28BFE2C 3.18 #module
>Proto >Proto Collection #zClass
Rs0 RoleTreeProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @MessageFlowInP-0n messageIn messageIn #zField
Rs0 @MessageFlowOutP-0n messageOut messageOut #zField
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessEnd f1 '' #zField
Rs0 @RichDialogProcessStart f5 '' #zField
Rs0 @RichDialogProcessEnd f6 '' #zField
Rs0 @RichDialogFireEvent f11 '' #zField
Rs0 @PushWFArc f12 '' #zField
Rs0 @PushWFArc f8 '' #zField
Rs0 @RichDialogMethodStart f13 '' #zField
Rs0 @RichDialogMethodStart f14 '' #zField
Rs0 @RichDialogProcessEnd f15 '' #zField
Rs0 @RichDialogProcessEnd f16 '' #zField
Rs0 @PushWFArc f17 '' #zField
Rs0 @PushWFArc f18 '' #zField
Rs0 @RichDialogMethodStart f19 '' #zField
Rs0 @RichDialogProcessEnd f20 '' #zField
Rs0 @RichDialogProcessStep f21 '' #zField
Rs0 @PushWFArc f22 '' #zField
Rs0 @PushWFArc f23 '' #zField
Rs0 @RichDialogMethodStart f24 '' #zField
Rs0 @RichDialogProcessStart f3 '' #zField
Rs0 @RichDialogProcessEnd f7 '' #zField
Rs0 @RichDialogMethodStart f32 '' #zField
Rs0 @RichDialogMethodStart f43 '' #zField
Rs0 @RichDialogMethodStart f34 '' #zField
Rs0 @RichDialogInitStart f45 '' #zField
Rs0 @RichDialogProcessStep f50 '' #zField
Rs0 @PushWFArc f51 '' #zField
Rs0 @PushWFArc f9 '' #zField
Rs0 @RichDialogProcessStep f49 '' #zField
Rs0 @PushWFArc f52 '' #zField
Rs0 @PushWFArc f48 '' #zField
Rs0 @PushWFArc f36 '' #zField
Rs0 @PushWFArc f33 '' #zField
Rs0 @PushWFArc f4 '' #zField
Rs0 @RichDialogProcessStep f10 '' #zField
Rs0 @PushWFArc f27 '' #zField
Rs0 @PushWFArc f2 '' #zField
Rs0 @RichDialogProcessStep f31 '' #zField
Rs0 @PushWFArc f41 '' #zField
Rs0 @PushWFArc f30 '' #zField
>Proto Rs0 Rs0 RoleTreeProcess #zField
Rs0 f0 guid 117AB4266C34E7AB #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f0 method start(ch.ivyteam.ivy.application.IApplication) #txt
Rs0 f0 disableUIEvents false #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 inParameterMapAction 'out.application=param.application;
' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 embeddedRdInitializations '* ' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f0 246 46 20 20 13 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f1 243 403 26 26 14 0 #rect
Rs0 f1 @|RichDialogProcessEndIcon #fIcon
Rs0 f5 guid 117AB433B6B2B948 #txt
Rs0 f5 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f5 actionTable 'out=in;
' #txt
Rs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>selected</name>
        <nameStyle>8,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f5 166 470 20 20 13 0 #rect
Rs0 f5 @|RichDialogProcessStartIcon #fIcon
Rs0 f6 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f6 163 627 26 26 14 0 #rect
Rs0 f6 @|RichDialogProcessEndIcon #fIcon
Rs0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.role.Role selectedRole;
' #txt
Rs0 f11 actionTable 'selectedRole=in.selectedTreeNode.value as ch.ivyteam.ivy.admin.tool.role.Role;
' #txt
Rs0 f11 actionCode panel.fireRoleSelected(selectedRole); #txt
Rs0 f11 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f11 fireEvent roleSelected(ch.ivyteam.ivy.admin.tool.role.Role) #txt
Rs0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f11 158 556 36 24 20 -2 #rect
Rs0 f11 @|RichDialogFireEventIcon #fIcon
Rs0 f12 expr out #txt
Rs0 f12 176 490 176 556 #arcP
Rs0 f8 expr out #txt
Rs0 f8 176 580 176 627 #arcP
Rs0 f13 guid 117AB7AD227B1BAB #txt
Rs0 f13 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f13 method getSelectedRole() #txt
Rs0 f13 disableUIEvents false #txt
Rs0 f13 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f13 outParameterDecl '<ch.ivyteam.ivy.security.IRole selectedRole> result;
' #txt
Rs0 f13 outParameterMapAction 'result.selectedRole=(in.selectedTreeNode.value as ch.ivyteam.ivy.admin.tool.role.Role).getIvyRole();
' #txt
Rs0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getSelectedRole()</name>
        <nameStyle>17,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f13 278 470 20 20 13 0 #rect
Rs0 f13 @|RichDialogMethodStartIcon #fIcon
Rs0 f14 guid 117AB7ADA95D437B #txt
Rs0 f14 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f14 method setSelectedRole(ch.ivyteam.ivy.security.IRole) #txt
Rs0 f14 disableUIEvents false #txt
Rs0 f14 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.IRole selectedRole> param = methodEvent.getInputArguments();
' #txt
Rs0 f14 inActionCode 'Tree currentNode;

currentNode = out.roleTree;
while (#currentNode != null)
{
  if (currentNode.value == param.selectedRole)
  {
    out.selectedTreeNode = currentNode;
    break;
  }
  currentNode = currentNode.getNextNode();
}' #txt
Rs0 f14 outParameterDecl '<> result;
' #txt
Rs0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setSelectedRole(IRole)</name>
        <nameStyle>22,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f14 438 470 20 20 13 0 #rect
Rs0 f14 @|RichDialogMethodStartIcon #fIcon
Rs0 f15 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f15 275 627 26 26 14 0 #rect
Rs0 f15 @|RichDialogProcessEndIcon #fIcon
Rs0 f16 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f16 435 627 26 26 14 0 #rect
Rs0 f16 @|RichDialogProcessEndIcon #fIcon
Rs0 f17 expr out #txt
Rs0 f17 448 490 448 627 #arcP
Rs0 f18 expr out #txt
Rs0 f18 288 490 288 627 #arcP
Rs0 f19 guid 117AC0C5B506C29D #txt
Rs0 f19 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f19 method refreshSelectedRole() #txt
Rs0 f19 disableUIEvents false #txt
Rs0 f19 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f19 outParameterDecl '<> result;
' #txt
Rs0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refreshSelectedRole</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f19 22 470 20 20 13 0 #rect
Rs0 f19 @|RichDialogMethodStartIcon #fIcon
Rs0 f20 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f20 19 627 26 26 14 0 #rect
Rs0 f20 @|RichDialogProcessEndIcon #fIcon
Rs0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f21 actionTable 'out=in;
' #txt
Rs0 f21 actionCode 'if (in.#selectedTreeNode != null)
{ 
  in.selectedTreeNode.treeValueChanged();
}' #txt
Rs0 f21 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f21 14 556 36 24 20 -2 #rect
Rs0 f21 @|RichDialogProcessStepIcon #fIcon
Rs0 f22 expr out #txt
Rs0 f22 32 490 32 556 #arcP
Rs0 f23 expr out #txt
Rs0 f23 32 580 32 627 #arcP
Rs0 f24 guid 147C824200740E26 #txt
Rs0 f24 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f24 method filterRoles(String) #txt
Rs0 f24 disableUIEvents false #txt
Rs0 f24 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String keyword> param = methodEvent.getInputArguments();
' #txt
Rs0 f24 inParameterMapAction 'out.keyword=param.keyword;
' #txt
Rs0 f24 outParameterDecl '<> result;
' #txt
Rs0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filterRoles(String)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f24 85 149 22 22 14 0 #rect
Rs0 f24 @|RichDialogMethodStartIcon #fIcon
Rs0 f3 guid 147C8710BE2EFA43 #txt
Rs0 f3 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f3 actionTable 'out=in;
' #txt
Rs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onLoad</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f3 373 213 22 22 14 0 #rect
Rs0 f3 @|RichDialogProcessStartIcon #fIcon
Rs0 f7 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f7 373 405 22 22 14 0 #rect
Rs0 f7 @|RichDialogProcessEndIcon #fIcon
Rs0 f32 guid 14EB422DBBAC1EFA #txt
Rs0 f32 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f32 method displayObsoleteRoles() #txt
Rs0 f32 disableUIEvents false #txt
Rs0 f32 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f32 inParameterMapAction 'out.displayObsoleteRoles=true;
' #txt
Rs0 f32 outParameterDecl '<> result;
' #txt
Rs0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>displayObsoleteRoles()</name>
        <nameStyle>22,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f32 333 93 22 22 14 0 #rect
Rs0 f32 @|RichDialogMethodStartIcon #fIcon
Rs0 f43 guid 14EB429D7C56686B #txt
Rs0 f43 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f43 method hideObsoleteRoles() #txt
Rs0 f43 disableUIEvents false #txt
Rs0 f43 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f43 inParameterMapAction 'out.displayObsoleteRoles=false;
' #txt
Rs0 f43 outParameterDecl '<> result;
' #txt
Rs0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>hideObsoleteRoles()</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f43 365 149 22 22 14 0 #rect
Rs0 f43 @|RichDialogMethodStartIcon #fIcon
Rs0 f34 guid 1550A21091414E84 #txt
Rs0 f34 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f34 method refreshRoleTree() #txt
Rs0 f34 disableUIEvents false #txt
Rs0 f34 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f34 outParameterDecl '<> result;
' #txt
Rs0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refreshRoleTree()</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f34 109 29 22 22 14 0 #rect
Rs0 f34 @|RichDialogMethodStartIcon #fIcon
Rs0 f45 guid 1550B735E9138760 #txt
Rs0 f45 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f45 method start(ch.ivyteam.ivy.security.IRole,ch.ivyteam.ivy.application.IApplication) #txt
Rs0 f45 disableUIEvents true #txt
Rs0 f45 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.IRole role,ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Rs0 f45 inParameterMapAction 'out.application=param.application;
out.selectedRole=param.role;
' #txt
Rs0 f45 inActionCode '/*import ch.ivyteam.ivy.persistence.PersistencyException;
out.exception = null;
try 
{
	out.activeRoleTree.value = param.application.getSecurityContext().getTopLevelRole();
	out.roleTree.value = param.application.getSecurityContext().getTopLevelRole();
	out.application = param.application;
} 
catch (PersistencyException e) 
{
	out.exception = e;
}
*/' #txt
Rs0 f45 outParameterDecl '<> result;
' #txt
Rs0 f45 embeddedRdInitializations '* ' #txt
Rs0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IRole,IApplication)</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f45 29 213 22 22 14 0 #rect
Rs0 f45 @|RichDialogInitStartIcon #fIcon
Rs0 f50 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f50 actionTable 'out=in;
' #txt
Rs0 f50 actionCode 'import ch.ivyteam.ivy.admin.tool.role.RoleTreeCriteria;
import ch.ivyteam.ivy.admin.tool.role.RoleTree;

RoleTreeCriteria criteria = RoleTreeCriteria.create()
																						.filterByKeyword(in.keyword)
																						.showObsoleteRole(in.displayObsoleteRoles)
																						.newCriteria();
in.roleTree = new RoleTree(in.application, criteria);
panel.rolesTree.treeData = in.roleTree;' #txt
Rs0 f50 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f50 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load role tree</name>
        <nameStyle>14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f50 238 196 36 24 20 -2 #rect
Rs0 f50 @|RichDialogProcessStepIcon #fIcon
Rs0 f51 expr out #txt
Rs0 f51 256 66 256 196 #arcP
Rs0 f9 expr out #txt
Rs0 f9 126 48 256 196 #arcP
Rs0 f9 0 0.6515936700361942 0 0 #arcLabel
Rs0 f49 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f49 actionTable 'out=in;
' #txt
Rs0 f49 actionCode 'import com.ulcjava.base.application.tree.ITreeCellRenderer;
import com.ulcjava.base.application.tree.DefaultTreeCellRenderer;
ITreeCellRenderer customRenderer = in.roleTree.createCustomRenderer(panel.rolesTree.getCellRenderer() as DefaultTreeCellRenderer);
panel.rolesTree.setCellRenderer(customRenderer);' #txt
Rs0 f49 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f49 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setup custom renderer</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f49 366 308 36 24 20 -2 #rect
Rs0 f49 @|RichDialogProcessStepIcon #fIcon
Rs0 f52 expr out #txt
Rs0 f52 384 235 384 308 #arcP
Rs0 f48 expr out #txt
Rs0 f48 384 332 384 405 #arcP
Rs0 f36 expr out #txt
Rs0 f36 336 112 256 196 #arcP
Rs0 f33 expr out #txt
Rs0 f33 365 164 274 208 #arcP
Rs0 f33 0 0.48877607760933073 0 0 #arcLabel
Rs0 f4 expr out #txt
Rs0 f4 106 163 238 208 #arcP
Rs0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f10 actionTable 'out=in;
' #txt
Rs0 f10 actionCode 'import org.apache.commons.lang3.StringUtils;
import ch.ivyteam.ivy.admin.tool.role.Role;
if (!in.keyword.isEmpty()) {
	List<Tree> children = panel.rolesTree.treeData.getAllDeepChildren();
	for (Tree child : children) {
		boolean matching = StringUtils.containsIgnoreCase((child.value as Role).getIvyRole().getName(), in.keyword);
		if (matching) {
			panel.rolesTree.expandPath(panel.rolesTree.getTreePath(child.getParent()));
		}
	}
}' #txt
Rs0 f10 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>expand tree node</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f10 238 276 36 24 20 -2 #rect
Rs0 f10 @|RichDialogProcessStepIcon #fIcon
Rs0 f27 expr out #txt
Rs0 f27 256 220 256 276 #arcP
Rs0 f2 expr out #txt
Rs0 f2 256 300 256 403 #arcP
Rs0 f31 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData out;
' #txt
Rs0 f31 actionTable 'out=in;
' #txt
Rs0 f31 actionCode 'import ch.ivyteam.ivy.admin.tool.role.RoleTreeCriteria;
import ch.ivyteam.ivy.admin.tool.role.RoleTree;

List excludedRoles = new List();
excludedRoles.add(in.selectedRole);
excludedRoles.addAll(in.selectedRole.getRoleMembers());

RoleTreeCriteria criteria = RoleTreeCriteria.create()
																								.filterByKeyword(in.keyword)
																								.showObsoleteRole(in.displayObsoleteRoles)
																								.showRoleMember(false)
																								.excludeRoles(excludedRoles)
																								.newCriteria();

in.roleTree = new RoleTree(in.application, criteria);
panel.rolesTree.treeData = in.roleTree;' #txt
Rs0 f31 type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
Rs0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load role tree</name>
        <nameStyle>14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f31 126 308 36 24 20 -2 #rect
Rs0 f31 @|RichDialogProcessStepIcon #fIcon
Rs0 f41 expr out #txt
Rs0 f41 48 231 131 308 #arcP
Rs0 f30 expr out #txt
Rs0 f30 158 332 246 407 #arcP
>Proto Rs0 .ui2RdDataAction 'out.selectedTreeNode=panel.rolesTree.#selectedTreeNode;
' #txt
>Proto Rs0 .rdData2UIAction 'panel.rolesTree.selectedTreeNode=in.#selectedTreeNode;
' #txt
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.security.RoleTree.RoleTreeData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f5 mainOut f12 tail #connect
Rs0 f12 head f11 mainIn #connect
Rs0 f11 mainOut f8 tail #connect
Rs0 f8 head f6 mainIn #connect
Rs0 f14 mainOut f17 tail #connect
Rs0 f17 head f16 mainIn #connect
Rs0 f13 mainOut f18 tail #connect
Rs0 f18 head f15 mainIn #connect
Rs0 f19 mainOut f22 tail #connect
Rs0 f22 head f21 mainIn #connect
Rs0 f21 mainOut f23 tail #connect
Rs0 f23 head f20 mainIn #connect
Rs0 f0 mainOut f51 tail #connect
Rs0 f51 head f50 mainIn #connect
Rs0 f34 mainOut f9 tail #connect
Rs0 f9 head f50 mainIn #connect
Rs0 f3 mainOut f52 tail #connect
Rs0 f52 head f49 mainIn #connect
Rs0 f49 mainOut f48 tail #connect
Rs0 f48 head f7 mainIn #connect
Rs0 f32 mainOut f36 tail #connect
Rs0 f36 head f50 mainIn #connect
Rs0 f43 mainOut f33 tail #connect
Rs0 f33 head f50 mainIn #connect
Rs0 f24 mainOut f4 tail #connect
Rs0 f4 head f50 mainIn #connect
Rs0 f50 mainOut f27 tail #connect
Rs0 f27 head f10 mainIn #connect
Rs0 f10 mainOut f2 tail #connect
Rs0 f2 head f1 mainIn #connect
Rs0 f45 mainOut f41 tail #connect
Rs0 f41 head f31 mainIn #connect
Rs0 f31 mainOut f30 tail #connect
Rs0 f30 head f1 mainIn #connect
