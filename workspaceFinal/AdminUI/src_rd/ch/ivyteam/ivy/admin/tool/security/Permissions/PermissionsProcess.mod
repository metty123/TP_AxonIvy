[Ivy]
[>Created: Thu Aug 13 14:29:36 ICT 2015]
117A7419E3328D9C 3.17 #module
>Proto >Proto Collection #zClass
Ps0 PermissionsProcess Big #zClass
Ps0 RD #cInfo
Ps0 #process
Ps0 @MessageFlowInP-0n messageIn messageIn #zField
Ps0 @MessageFlowOutP-0n messageOut messageOut #zField
Ps0 @TextInP .xml .xml #zField
Ps0 @TextInP .responsibility .responsibility #zField
Ps0 @AnnotationInP-0n ai ai #zField
Ps0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ps0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ps0 @TextInP .resExport .resExport #zField
Ps0 @TextInP .type .type #zField
Ps0 @TextInP .processKind .processKind #zField
Ps0 @RichDialogInitStart f0 '' #zField
Ps0 @RichDialogProcessEnd f1 '' #zField
Ps0 @RichDialogProcessStep f2 '' #zField
Ps0 @PushWFArc f8 '' #zField
Ps0 @PushWFArc f9 '' #zField
Ps0 @RichDialogProcessStart f10 '' #zField
Ps0 @RichDialogEnd f11 '' #zField
Ps0 @PushWFArc f12 '' #zField
Ps0 @RichDialogProcessStart f13 '' #zField
Ps0 @RichDialogProcessStart f14 '' #zField
Ps0 @RichDialogProcessStart f15 '' #zField
Ps0 @RichDialogProcessStart f16 '' #zField
Ps0 @RichDialogProcessStep f17 '' #zField
Ps0 @RichDialogProcessStep f18 '' #zField
Ps0 @RichDialogProcessStep f19 '' #zField
Ps0 @RichDialogProcessStep f20 '' #zField
Ps0 @RichDialogProcessEnd f24 '' #zField
Ps0 @PushWFArc f25 '' #zField
Ps0 @PushWFArc f27 '' #zField
Ps0 @PushWFArc f29 '' #zField
Ps0 @PushWFArc f31 '' #zField
Ps0 @RichDialogProcessStart f32 '' #zField
Ps0 @RichDialogProcessEnd f37 '' #zField
Ps0 @PushWFArc f38 '' #zField
Ps0 @RichDialogProcessStep f4 '' #zField
Ps0 @RichDialogProcessEnd f5 '' #zField
Ps0 @RichDialogProcessStep f40 '' #zField
Ps0 @PushWFArc f28 '' #zField
Ps0 @PushWFArc f26 '' #zField
Ps0 @PushWFArc f23 '' #zField
Ps0 @PushWFArc f22 '' #zField
Ps0 @RichDialogProcessStep f21 '' #zField
Ps0 @RichDialogProcessStart f33 '' #zField
Ps0 @RichDialogProcessEnd f34 '' #zField
Ps0 @PushWFArc f35 '' #zField
Ps0 @PushWFArc f30 '' #zField
Ps0 @PushWFArc f41 '' #zField
Ps0 @RichDialogMethodStart f46 '' #zField
Ps0 @RichDialog f47 '' #zField
Ps0 @RichDialogProcessEnd f48 '' #zField
Ps0 @PushWFArc f49 '' #zField
Ps0 @PushWFArc f50 '' #zField
Ps0 @PushWFArc f51 '' #zField
Ps0 @RichDialogMethodStart f7 '' #zField
Ps0 @PushWFArc f36 '' #zField
>Proto Ps0 Ps0 PermissionsProcess #zField
Ps0 f0 guid 117A7512AEABE665 #txt
Ps0 f0 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f0 method start(ch.ivyteam.ivy.security.ISecurityMember,ch.ivyteam.ivy.security.ISecurityDescriptor) #txt
Ps0 f0 disableUIEvents false #txt
Ps0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityMember securityMember,ch.ivyteam.ivy.security.ISecurityDescriptor securityDesriptor> param = methodEvent.getInputArguments();
' #txt
Ps0 f0 inParameterMapAction 'out.securityDescriptor=param.securityDesriptor;
out.securityMember=param.securityMember;
' #txt
Ps0 f0 outParameterDecl '<> result;
' #txt
Ps0 f0 embeddedRdInitializations '* ' #txt
Ps0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityMember,ISecurityDescriptor)</name>
    </language>
</elementInfo>
' #txt
Ps0 f0 54 30 20 20 13 0 #rect
Ps0 f0 @|RichDialogInitStartIcon #fIcon
Ps0 f1 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f1 51 147 26 26 14 0 #rect
Ps0 f1 @|RichDialogProcessEndIcon #fIcon
Ps0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f2 actionTable 'out=in;
' #txt
Ps0 f2 actionCode 'import ch.ivyteam.ivy.admin.tool.process.PermissionLoader;
import ch.ivyteam.ivy.security.IPermissionGroup;

in.isError = false;
in.errorMessage = "";

try{
	
	IPermissionGroup group = in.securityDescriptor.getSecurityDescriptorType().getRootPermissionGroup();
	in.permissionTree.value = in.securityDescriptor.getPermissionGroupAccess(group, in.securityMember);
	
	PermissionLoader.loadChildren(in.permissionTree, in.securityDescriptor, in.securityMember);
	
	in.filteredPermissionTree = in.permissionTree.deepClone();
	
} catch(Exception ex) {
	in.isError = true;
	if(ex.getMessage().contains("CommunicationException")) {
		in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/connectionRefuse");
	} else if(ex.getMessage().contains("AuthenticationException")) {
		in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/authenticationException");
	} else {
		in.errorMessage += ex.getMessage();
	}
	
	panel.showError();
}
' #txt
Ps0 f2 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load root permission group</name>
        <nameStyle>26,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f2 46 84 36 24 22 -21 #rect
Ps0 f2 @|RichDialogProcessStepIcon #fIcon
Ps0 f8 expr out #txt
Ps0 f8 64 50 64 84 #arcP
Ps0 f9 expr out #txt
Ps0 f9 64 108 64 147 #arcP
Ps0 f10 guid 117AB0D2C413D940 #txt
Ps0 f10 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f10 actionTable 'out=in;
' #txt
Ps0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f10 446 30 20 20 13 0 #rect
Ps0 f10 @|RichDialogProcessStartIcon #fIcon
Ps0 f11 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f11 guid 117AB0D3B117D8F8 #txt
Ps0 f11 443 107 26 26 14 0 #rect
Ps0 f11 @|RichDialogEndIcon #fIcon
Ps0 f12 expr out #txt
Ps0 f12 456 50 456 107 #arcP
Ps0 f13 guid 117AB0D7F27E8195 #txt
Ps0 f13 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f13 actionTable 'out=in;
' #txt
Ps0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>grant</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f13 374 246 20 20 13 0 #rect
Ps0 f13 @|RichDialogProcessStartIcon #fIcon
Ps0 f14 guid 117AB0DB04923500 #txt
Ps0 f14 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f14 actionTable 'out=in;
' #txt
Ps0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ungrant</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f14 470 246 20 20 13 0 #rect
Ps0 f14 @|RichDialogProcessStartIcon #fIcon
Ps0 f15 guid 117AB0DD1EFD3D4B #txt
Ps0 f15 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f15 actionTable 'out=in;
' #txt
Ps0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deny</name>
        <nameStyle>4,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f15 590 246 20 20 13 0 #rect
Ps0 f15 @|RichDialogProcessStartIcon #fIcon
Ps0 f16 guid 117AB0DF579192B0 #txt
Ps0 f16 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f16 actionTable 'out=in;
' #txt
Ps0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>undeny</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f16 694 246 20 20 13 0 #rect
Ps0 f16 @|RichDialogProcessStartIcon #fIcon
Ps0 f17 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f17 actionTable 'out=in;
' #txt
Ps0 f17 actionCode 'import ch.ivyteam.ivy.security.IPermissionGroup;
import ch.ivyteam.ivy.security.IPermissionGroupAccess;
import ch.ivyteam.ivy.security.IPermissionAccess;

if (in.selectedTreeNode.value instanceof IPermissionGroupAccess)
{ 
	IPermissionGroup group = (in.selectedTreeNode.value as IPermissionGroupAccess).getPermissionGroup();
  in.securityDescriptor.grantPermissions(group, in.securityMember);
}
else if (in.selectedTreeNode.value instanceof IPermissionAccess)
{
  in.securityDescriptor.grantPermission((in.selectedTreeNode.value as IPermissionAccess).getPermission(), in.securityMember);
}

' #txt
Ps0 f17 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Grant</name>
        <nameStyle>5,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f17 366 324 36 24 21 -8 #rect
Ps0 f17 @|RichDialogProcessStepIcon #fIcon
Ps0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f18 actionTable 'out=in;
' #txt
Ps0 f18 actionCode 'import ch.ivyteam.ivy.security.IPermissionGroup;
import ch.ivyteam.ivy.security.IPermissionGroupAccess;
import ch.ivyteam.ivy.security.IPermissionAccess;

if (in.selectedTreeNode.value instanceof IPermissionGroupAccess)
{ 
	IPermissionGroup group = (in.selectedTreeNode.value as IPermissionGroupAccess).getPermissionGroup();
  in.securityDescriptor.ungrantPermissions(group, in.securityMember);
}
else if (in.selectedTreeNode.value instanceof IPermissionAccess)
{
  in.securityDescriptor.ungrantPermission((in.selectedTreeNode.value as IPermissionAccess).getPermission(), in.securityMember);
}' #txt
Ps0 f18 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Ungrant</name>
        <nameStyle>7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f18 462 324 36 24 21 -9 #rect
Ps0 f18 @|RichDialogProcessStepIcon #fIcon
Ps0 f19 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f19 actionTable 'out=in;
' #txt
Ps0 f19 actionCode 'import ch.ivyteam.ivy.security.IPermissionGroup;
import ch.ivyteam.ivy.security.IPermissionGroupAccess;
import ch.ivyteam.ivy.security.IPermissionAccess;

if (in.selectedTreeNode.value instanceof IPermissionGroupAccess)
{ 
	IPermissionGroup group = (in.selectedTreeNode.value as IPermissionGroupAccess).getPermissionGroup();
  in.securityDescriptor.denyPermissions(group, in.securityMember);
}
else if (in.selectedTreeNode.value instanceof IPermissionAccess)
{
  in.securityDescriptor.denyPermission((in.selectedTreeNode.value as IPermissionAccess).getPermission(), in.securityMember);
}' #txt
Ps0 f19 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Deny</name>
        <nameStyle>4,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f19 582 324 36 24 21 -9 #rect
Ps0 f19 @|RichDialogProcessStepIcon #fIcon
Ps0 f20 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f20 actionTable 'out=in;
' #txt
Ps0 f20 actionCode 'import ch.ivyteam.ivy.security.IPermissionGroup;
import ch.ivyteam.ivy.security.IPermissionGroupAccess;
import ch.ivyteam.ivy.security.IPermissionAccess;

if (in.selectedTreeNode.value instanceof IPermissionGroupAccess)
{ 
	IPermissionGroup group = (in.selectedTreeNode.value as IPermissionGroupAccess).getPermissionGroup();
  in.securityDescriptor.undenyPermissions(group, in.securityMember);
}
else if (in.selectedTreeNode.value instanceof IPermissionAccess)
{
  in.securityDescriptor.undenyPermission((in.selectedTreeNode.value as IPermissionAccess).getPermission(), in.securityMember);
}' #txt
Ps0 f20 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Undeny</name>
        <nameStyle>6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f20 686 324 36 24 20 -10 #rect
Ps0 f20 @|RichDialogProcessStepIcon #fIcon
Ps0 f24 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f24 531 491 26 26 14 0 #rect
Ps0 f24 @|RichDialogProcessEndIcon #fIcon
Ps0 f25 expr out #txt
Ps0 f25 384 266 384 324 #arcP
Ps0 f27 expr out #txt
Ps0 f27 480 266 480 324 #arcP
Ps0 f29 expr out #txt
Ps0 f29 600 266 600 324 #arcP
Ps0 f31 expr out #txt
Ps0 f31 704 266 704 324 #arcP
Ps0 f32 guid 126C1BAA87EB03DF #txt
Ps0 f32 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f32 actionTable 'out=in;
' #txt
Ps0 f32 actionCode '
' #txt
Ps0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load</name>
        <nameStyle>4,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f32 342 30 20 20 13 0 #rect
Ps0 f32 @|RichDialogProcessStartIcon #fIcon
Ps0 f37 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f37 342 110 20 20 13 0 #rect
Ps0 f37 @|RichDialogProcessEndIcon #fIcon
Ps0 f38 expr out #txt
Ps0 f38 352 50 352 110 #arcP
Ps0 f38 0 0.8753139909725393 0 0 #arcLabel
Ps0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f4 actionTable 'out=in;
' #txt
Ps0 f4 actionCode 'import ch.ivyteam.ivy.admin.tool.process.PermissionLoader;

String lastFilter = in.keyword;
in.keyword = panel.permissionLookup.getText().trim().toLowerCase();

if (!in.keyword.isEmpty())
{	
	if (!in.keyword.startsWith(lastFilter)) {
		in.filteredPermissionTree = in.permissionTree.deepClone();
	}
	
	boolean removeRoot = PermissionLoader.filterTree(in.filteredPermissionTree, in.keyword);
	panel.permissionsTableTree.setRootVisible(!removeRoot);
} else {
	in.filteredPermissionTree = in.permissionTree.deepClone();
	panel.permissionsTableTree.setRootVisible(true);
}' #txt
Ps0 f4 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter</name>
        <nameStyle>6,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f4 894 92 36 24 20 -2 #rect
Ps0 f4 @|RichDialogProcessStepIcon #fIcon
Ps0 f4 -13016147|-1|-16777216 #nodeStyle
Ps0 f5 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f5 901 277 22 22 14 0 #rect
Ps0 f5 @|RichDialogProcessEndIcon #fIcon
Ps0 f5 -13016147|-1|-16777216 #nodeStyle
Ps0 f40 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f40 actionTable 'out=in;
' #txt
Ps0 f40 actionCode 'if (in.keyword.isEmpty())
{
	panel.permissionsTableTree.collapseAll();
	panel.permissionsTableTree.expandRow(0);
}
else 
{
	panel.permissionsTableTree.expandAll();
}

panel.permissionsTableTree.clearSelection();
in.selectedTreeNode = null;' #txt
Ps0 f40 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f40 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>expand / collapse tree</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f40 894 188 36 24 20 -2 #rect
Ps0 f40 @|RichDialogProcessStepIcon #fIcon
Ps0 f40 -13016147|-1|-16777216 #nodeStyle
Ps0 f28 expr out #txt
Ps0 f28 384 348 526 427 #arcP
Ps0 f28 1 384 384 #addKink
Ps0 f28 1 0.31227171919539365 0 0 #arcLabel
Ps0 f26 expr out #txt
Ps0 f26 480 348 530 420 #arcP
Ps0 f26 1 480 376 #addKink
Ps0 f26 1 0.2646164716778054 0 0 #arcLabel
Ps0 f23 expr out #txt
Ps0 f23 600 348 556 420 #arcP
Ps0 f23 1 600 376 #addKink
Ps0 f23 1 0.3086325335975563 0 0 #arcLabel
Ps0 f22 expr out #txt
Ps0 f22 704 348 562 427 #arcP
Ps0 f22 1 704 384 #addKink
Ps0 f22 1 0.29649338006806547 0 0 #arcLabel
Ps0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f21 actionTable 'out=in;
' #txt
Ps0 f21 actionCode 'import ch.ivyteam.ivy.admin.tool.process.PermissionLoader;
import ch.ivyteam.ivy.security.IPermissionGroup;
import ch.ivyteam.ivy.security.IPermissionGroupAccess;
import ch.ivyteam.ivy.security.IPermissionAccess;

if (in.selectedTreeNode.value instanceof IPermissionAccess)
{
  in.selectedTreeNode.value = in.securityDescriptor.getPermissionAccess((in.selectedTreeNode.value as IPermissionAccess).getPermission(), in.securityMember);
}

List<Tree> treePath = in.selectedTreeNode.getPath();
Tree permissionTree = in.permissionTree;

// Reload selected node''s parent nodes in filteredPermissionTree and permissionTree
for (int i = 0; i < treePath.size(); i++) {
	
	// Selected node is Permission Access node
	if (i == treePath.size() - 1 && in.selectedTreeNode.value instanceof IPermissionAccess) {
		permissionTree.value = in.selectedTreeNode.value;
		break;
	}
	
	Tree node = treePath.get(i);
	IPermissionGroup group = (node.value as IPermissionGroupAccess).getPermissionGroup();
	node.value = in.securityDescriptor.getPermissionGroupAccess(group,in.securityMember);
	permissionTree.value = node.value;
	
	// Set permission tree to be its child
	if (i < treePath.size() - 1) {
		List<Tree> childrenTree = permissionTree.getChildren();
		for (Tree child : childrenTree) {
			if (child.getInfo().equals(treePath.get(i + 1).getInfo())) {
				permissionTree = child;
				break;
			}
		}
	}
	
	// Selected node is Permission Group Access node then reload selected node''s children
	if (i == treePath.size() - 1) {
		try {
			PermissionLoader.reloadChildren(permissionTree, in.securityDescriptor, in.securityMember);
			PermissionLoader.reloadChildren(in.selectedTreeNode, in.securityDescriptor, in.securityMember);
			PermissionLoader.filterTree(in.selectedTreeNode, in.keyword);
		} catch (Exception ex) {
			in.isError = true;
			if(ex.getMessage().contains("CommunicationException")) {
				in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/connectionRefuse");
			} else if(ex.getMessage().contains("AuthenticationException")) {
				in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/authenticationException");
			} else {
				in.errorMessage += ex.getMessage();
			}
			
			panel.showError();
		}
	}
}' #txt
Ps0 f21 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Update tree</name>
        <nameStyle>11,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f21 526 420 36 24 20 -2 #rect
Ps0 f21 @|RichDialogProcessStepIcon #fIcon
Ps0 f33 guid 1465B76E7BEAAA38 #txt
Ps0 f33 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f33 actionTable 'out=in;
' #txt
Ps0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>select node</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f33 533 29 22 22 14 0 #rect
Ps0 f33 @|RichDialogProcessStartIcon #fIcon
Ps0 f33 -13016147|-1|-16777216 #nodeStyle
Ps0 f34 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f34 533 109 22 22 14 0 #rect
Ps0 f34 @|RichDialogProcessEndIcon #fIcon
Ps0 f34 -13016147|-1|-16777216 #nodeStyle
Ps0 f35 expr out #txt
Ps0 f35 544 51 544 109 #arcP
Ps0 f30 expr out #txt
Ps0 f30 544 444 544 491 #arcP
Ps0 f41 expr out #txt
Ps0 f41 912 212 912 277 #arcP
Ps0 f46 guid 1465FE3A871CB5CE #txt
Ps0 f46 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f46 method showError() #txt
Ps0 f46 disableUIEvents false #txt
Ps0 f46 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f46 outParameterDecl '<> result;
' #txt
Ps0 f46 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showError()</name>
    </language>
</elementInfo>
' #txt
Ps0 f46 1429 21 22 22 14 0 #rect
Ps0 f46 @|RichDialogMethodStartIcon #fIcon
Ps0 f46 -13016147|-1|-16777216 #nodeStyle
Ps0 f47 targetWindow NEW:card: #txt
Ps0 f47 targetDisplay TOP #txt
Ps0 f47 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Ps0 f47 startMethod start(String) #txt
Ps0 f47 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f47 requestActionDecl '<String errorMessage> param;' #txt
Ps0 f47 requestMappingAction 'param.errorMessage=in.errorMessage;
' #txt
Ps0 f47 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData out;
' #txt
Ps0 f47 responseMappingAction 'out=in;
' #txt
Ps0 f47 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/dialogTitle/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ps0 f47 isAsynch false #txt
Ps0 f47 isInnerRd true #txt
Ps0 f47 userContext '* ' #txt
Ps0 f47 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error dialog</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f47 1422 84 36 24 20 -2 #rect
Ps0 f47 @|RichDialogIcon #fIcon
Ps0 f47 -13016147|-1|-16777216 #nodeStyle
Ps0 f48 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f48 1429 149 22 22 14 0 #rect
Ps0 f48 @|RichDialogProcessEndIcon #fIcon
Ps0 f48 -13016147|-1|-16777216 #nodeStyle
Ps0 f49 expr out #txt
Ps0 f49 1440 43 1440 84 #arcP
Ps0 f50 expr out #txt
Ps0 f50 1440 108 1440 149 #arcP
Ps0 f51 expr out #txt
Ps0 f51 912 116 912 188 #arcP
Ps0 f7 guid 14F2119B1C9CF4EB #txt
Ps0 f7 type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
Ps0 f7 method filter() #txt
Ps0 f7 disableUIEvents false #txt
Ps0 f7 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f7 outParameterDecl '<> result;
' #txt
Ps0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter()</name>
    </language>
</elementInfo>
' #txt
Ps0 f7 901 21 22 22 14 0 #rect
Ps0 f7 @|RichDialogMethodStartIcon #fIcon
Ps0 f36 expr out #txt
Ps0 f36 912 43 912 92 #arcP
>Proto Ps0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>START</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>320</swimlaneSize>
    <swimlaneColor>-13369345</swimlaneColor>
</elementInfo>
' #txt
>Proto Ps0 .ui2RdDataAction 'out.selectedTreeNode=panel.permissionsTableTree.#selectedTreeNode;
' #txt
>Proto Ps0 .rdData2UIAction 'panel.denyButton.enabled=in.#selectedTreeNode != null && 
(
  (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionAccess && 
    (!((in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isDenied()&&
    (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isExplicit())))
  || (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionGroupAccess
      && (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionGroupAccess).isDeniedAllPermissions() == false)
);
panel.grantButton.enabled=in.#selectedTreeNode != null && 
(
  (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionAccess) && 
    (!((in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isGranted()&&
    (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isExplicit()))
  || (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionGroupAccess 
      && (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionGroupAccess).isGrantedAllPermissions() == false)
);
panel.permissionsTableTree.tableTreeData=in.filteredPermissionTree;
panel.toolPane.enabled=in.#selectedTreeNode!=null;
panel.undenyButton.enabled=in.#selectedTreeNode != null && 
(
  (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionAccess && 
   (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isDenied()&&
   (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isExplicit())
  || (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionGroupAccess 
      && (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionGroupAccess).isDeniedAnyPermission())
);
panel.ungrantButton.enabled=in.#selectedTreeNode != null && 
(
  ((in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionAccess) && 
    (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isGranted()&&
    (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionAccess).isExplicit())
  || (in.#selectedTreeNode.#value instanceof ch.ivyteam.ivy.security.IPermissionGroupAccess 
      && (in.#selectedTreeNode.#value as ch.ivyteam.ivy.security.IPermissionGroupAccess).isGrantedAnyPermission())
);
' #txt
>Proto Ps0 .type ch.ivyteam.ivy.admin.tool.security.Permissions.PermissionsData #txt
>Proto Ps0 .processKind RICH_DIALOG #txt
>Proto Ps0 -8 -8 16 16 16 26 #rect
>Proto Ps0 '' #fIcon
Ps0 f0 mainOut f8 tail #connect
Ps0 f8 head f2 mainIn #connect
Ps0 f2 mainOut f9 tail #connect
Ps0 f9 head f1 mainIn #connect
Ps0 f10 mainOut f12 tail #connect
Ps0 f12 head f11 mainIn #connect
Ps0 f13 mainOut f25 tail #connect
Ps0 f25 head f17 mainIn #connect
Ps0 f14 mainOut f27 tail #connect
Ps0 f27 head f18 mainIn #connect
Ps0 f15 mainOut f29 tail #connect
Ps0 f29 head f19 mainIn #connect
Ps0 f16 mainOut f31 tail #connect
Ps0 f31 head f20 mainIn #connect
Ps0 f20 mainOut f22 tail #connect
Ps0 f22 head f21 mainIn #connect
Ps0 f19 mainOut f23 tail #connect
Ps0 f23 head f21 mainIn #connect
Ps0 f18 mainOut f26 tail #connect
Ps0 f26 head f21 mainIn #connect
Ps0 f17 mainOut f28 tail #connect
Ps0 f28 head f21 mainIn #connect
Ps0 f32 mainOut f38 tail #connect
Ps0 f38 head f37 mainIn #connect
Ps0 f33 mainOut f35 tail #connect
Ps0 f35 head f34 mainIn #connect
Ps0 f21 mainOut f30 tail #connect
Ps0 f30 head f24 mainIn #connect
Ps0 f40 mainOut f41 tail #connect
Ps0 f41 head f5 mainIn #connect
Ps0 f46 mainOut f49 tail #connect
Ps0 f49 head f47 mainIn #connect
Ps0 f47 mainOut f50 tail #connect
Ps0 f50 head f48 mainIn #connect
Ps0 f4 mainOut f51 tail #connect
Ps0 f51 head f40 mainIn #connect
Ps0 f7 mainOut f36 tail #connect
Ps0 f36 head f4 mainIn #connect
