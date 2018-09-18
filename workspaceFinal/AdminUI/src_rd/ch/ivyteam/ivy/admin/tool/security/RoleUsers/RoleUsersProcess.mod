[Ivy]
[>Created: Wed Aug 12 10:44:32 ICT 2015]
117AC40879C28D15 3.17 #module
>Proto >Proto Collection #zClass
Rs0 RoleUsersProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @MessageFlowInP-0n messageIn messageIn #zField
Rs0 @MessageFlowOutP-0n messageOut messageOut #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessEnd f1 '' #zField
Rs0 @PushWFArc f2 '' #zField
Rs0 @RichDialogProcessStart f3 '' #zField
Rs0 @RichDialogProcessStart f4 '' #zField
Rs0 @RichDialogProcessStart f9 '' #zField
Rs0 @RichDialogProcessStart f10 '' #zField
Rs0 @RichDialogProcessStart f12 '' #zField
Rs0 @RichDialogProcessStart f11 '' #zField
Rs0 @RichDialogProcessEnd f13 '' #zField
Rs0 @RichDialogProcessEnd f14 '' #zField
Rs0 @RichDialogProcessEnd f15 '' #zField
Rs0 @RichDialogProcessEnd f16 '' #zField
Rs0 @RichDialogProcessStep f21 '' #zField
Rs0 @PushWFArc f22 '' #zField
Rs0 @PushWFArc f17 '' #zField
Rs0 @RichDialogProcessStep f23 '' #zField
Rs0 @PushWFArc f24 '' #zField
Rs0 @PushWFArc f18 '' #zField
Rs0 @RichDialogProcessStep f25 '' #zField
Rs0 @PushWFArc f26 '' #zField
Rs0 @PushWFArc f19 '' #zField
Rs0 @RichDialogProcessStep f27 '' #zField
Rs0 @PushWFArc f28 '' #zField
Rs0 @PushWFArc f20 '' #zField
Rs0 @RichDialogEnd f29 '' #zField
Rs0 @RichDialogEnd f30 '' #zField
Rs0 @PushWFArc f6 '' #zField
Rs0 @RichDialogProcessStep f7 '' #zField
Rs0 @PushWFArc f8 '' #zField
Rs0 @PushWFArc f5 '' #zField
Rs0 @RichDialogProcessStart f31 '' #zField
Rs0 @RichDialogProcessEnd f32 '' #zField
Rs0 @CallSub f34 '' #zField
Rs0 @PushWFArc f35 '' #zField
Rs0 @PushWFArc f33 '' #zField
Rs0 @RichDialogMethodStart f36 '' #zField
Rs0 @RichDialogProcessEnd f37 '' #zField
Rs0 @RichDialogProcessStep f39 '' #zField
Rs0 @PushWFArc f40 '' #zField
Rs0 @PushWFArc f38 '' #zField
>Proto Rs0 Rs0 RoleUsersProcess #zField
Rs0 f0 guid 117AC5DBC02F9178 #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f0 method start(ch.ivyteam.ivy.security.ISecurityContext,ch.ivyteam.ivy.security.IRole) #txt
Rs0 f0 disableUIEvents false #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext,ch.ivyteam.ivy.security.IRole role> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 inActionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;

out.exception = null;
try {
	out.administratable = param.securityContext.getExternalSecuritySystemProvider().isAdministrationSupported()||param.role.getExternalSecurityName().trim().isEmpty();
	out.usersNotOwnRole.addAll(param.securityContext.getUsers());
	out.usersOwnRole.addAll(param.role.getUsers());
	out.usersNotOwnRole.removeAll(out.usersOwnRole);
	out.role = param.role;
} catch (PersistencyException e) {
	out.exception = e;
}' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 embeddedRdInitializations '{/usersNotOwnRolePane {/fieldName "usersNotOwnRolePane"/startMethod "start(List<ch.ivyteam.ivy.security.IUser>)"/parameterMapping "param.users=in.usersNotOwnRole;\n"/initScript ""/userContext * }/usersOwnRolePane {/fieldName "usersOwnRolePane"/startMethod "start(List<ch.ivyteam.ivy.security.IUser>)"/parameterMapping "param.users=in.usersOwnRole;\n"/initScript ""/userContext * }}' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext,IRole)</name>
        <nameStyle>29,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f0 38 30 20 20 13 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f1 35 99 26 26 14 0 #rect
Rs0 f1 @|RichDialogProcessEndIcon #fIcon
Rs0 f2 expr out #txt
Rs0 f2 48 50 48 99 #arcP
Rs0 f3 guid 117AC6211EA94CA1 #txt
Rs0 f3 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f3 actionTable 'out=in;
' #txt
Rs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f3 46 206 20 20 13 0 #rect
Rs0 f3 @|RichDialogProcessStartIcon #fIcon
Rs0 f4 guid 117AC62193EE5249 #txt
Rs0 f4 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f4 actionTable 'out=in;
' #txt
Rs0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f4 198 206 20 20 13 0 #rect
Rs0 f4 @|RichDialogProcessStartIcon #fIcon
Rs0 f9 guid 117AC629CF52E296 #txt
Rs0 f9 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f9 actionTable 'out=in;
' #txt
Rs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>add</name>
        <nameStyle>3,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f9 254 22 20 20 13 0 #rect
Rs0 f9 @|RichDialogProcessStartIcon #fIcon
Rs0 f10 guid 117AC62A9C8FD804 #txt
Rs0 f10 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f10 actionTable 'out=in;
' #txt
Rs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addAll</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f10 358 22 20 20 13 0 #rect
Rs0 f10 @|RichDialogProcessStartIcon #fIcon
Rs0 f12 guid 117AC62BE2E3B678 #txt
Rs0 f12 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f12 actionTable 'out=in;
' #txt
Rs0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>removeAll</name>
        <nameStyle>9,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f12 518 22 20 20 13 0 #rect
Rs0 f12 @|RichDialogProcessStartIcon #fIcon
Rs0 f11 guid 117AC62CDDFBFC6E #txt
Rs0 f11 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f11 actionTable 'out=in;
' #txt
Rs0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>remove</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f11 438 22 20 20 13 0 #rect
Rs0 f11 @|RichDialogProcessStartIcon #fIcon
Rs0 f13 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f13 251 99 26 26 14 0 #rect
Rs0 f13 @|RichDialogProcessEndIcon #fIcon
Rs0 f14 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f14 355 99 26 26 14 0 #rect
Rs0 f14 @|RichDialogProcessEndIcon #fIcon
Rs0 f15 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f15 435 99 26 26 14 0 #rect
Rs0 f15 @|RichDialogProcessEndIcon #fIcon
Rs0 f16 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f16 515 99 26 26 14 0 #rect
Rs0 f16 @|RichDialogProcessEndIcon #fIcon
Rs0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f21 actionTable 'out=in;
' #txt
Rs0 f21 actionCode 'import ch.ivyteam.ivy.security.IUser;

List<IUser> transfer;

transfer = panel.usersNotOwnRolePane.getSelectedUsers();

in.usersNotOwnRole.removeAll(transfer);
in.usersOwnRole.addAll(transfer);

panel.reloadRoleUserTables();' #txt
Rs0 f21 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f21 246 60 36 24 20 -2 #rect
Rs0 f21 @|RichDialogProcessStepIcon #fIcon
Rs0 f22 expr out #txt
Rs0 f22 264 42 264 60 #arcP
Rs0 f17 expr out #txt
Rs0 f17 264 84 264 99 #arcP
Rs0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f23 actionTable 'out=in;
' #txt
Rs0 f23 actionCode 'in.usersOwnRole.addAll(in.usersNotOwnRole);
in.usersNotOwnRole.clear();

panel.reloadRoleUserTables();' #txt
Rs0 f23 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f23 350 60 36 24 20 -2 #rect
Rs0 f23 @|RichDialogProcessStepIcon #fIcon
Rs0 f24 expr out #txt
Rs0 f24 368 42 368 60 #arcP
Rs0 f18 expr out #txt
Rs0 f18 368 84 368 99 #arcP
Rs0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f25 actionTable 'out=in;
' #txt
Rs0 f25 actionCode 'import ch.ivyteam.ivy.security.IUser;

List<IUser> transfer;

transfer = panel.usersOwnRolePane.getSelectedUsers();

in.usersOwnRole.removeAll(transfer);
in.usersNotOwnRole.addAll(transfer);

panel.reloadRoleUserTables();' #txt
Rs0 f25 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f25 430 60 36 24 20 -2 #rect
Rs0 f25 @|RichDialogProcessStepIcon #fIcon
Rs0 f26 expr out #txt
Rs0 f26 448 42 448 60 #arcP
Rs0 f19 expr out #txt
Rs0 f19 448 84 448 99 #arcP
Rs0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f27 actionTable 'out=in;
' #txt
Rs0 f27 actionCode 'in.usersNotOwnRole.addAll(in.usersOwnRole);
in.usersOwnRole.clear();

panel.reloadRoleUserTables();' #txt
Rs0 f27 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f27 510 60 36 24 20 -2 #rect
Rs0 f27 @|RichDialogProcessStepIcon #fIcon
Rs0 f28 expr out #txt
Rs0 f28 528 42 528 60 #arcP
Rs0 f20 expr out #txt
Rs0 f20 528 84 528 99 #arcP
Rs0 f29 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f29 guid 117AC8DA48F61F97 #txt
Rs0 f29 43 355 26 26 14 0 #rect
Rs0 f29 @|RichDialogEndIcon #fIcon
Rs0 f30 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f30 guid 117AC8DB31A8FEDE #txt
Rs0 f30 195 355 26 26 14 0 #rect
Rs0 f30 @|RichDialogEndIcon #fIcon
Rs0 f6 expr out #txt
Rs0 f6 208 226 208 355 #arcP
Rs0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f7 actionTable 'out=in;
' #txt
Rs0 f7 actionCode 'import ch.ivyteam.ivy.security.IUser;

List<IUser> usersOfRole;

usersOfRole.addAll(in.role.getUsers());

for (IUser user: usersOfRole)
{
	if (!in.usersOwnRole.contains(user))
  {
		user.removeRole(in.role);
	}
}

for (IUser user: in.usersOwnRole)
{
  if (!usersOfRole.contains(user))
  {
		user.addRole(in.role);
  } 
}



' #txt
Rs0 f7 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f7 38 276 36 24 20 -2 #rect
Rs0 f7 @|RichDialogProcessStepIcon #fIcon
Rs0 f8 expr out #txt
Rs0 f8 56 226 56 276 #arcP
Rs0 f5 expr out #txt
Rs0 f5 56 300 56 355 #arcP
Rs0 f31 guid 1478AA43147AD56C #txt
Rs0 f31 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f31 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f31 actionTable 'out=in;
' #txt
Rs0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onload</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f31 357 205 22 22 14 0 #rect
Rs0 f31 @|RichDialogProcessStartIcon #fIcon
Rs0 f32 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f32 357 357 22 22 14 0 #rect
Rs0 f32 @|RichDialogProcessEndIcon #fIcon
Rs0 f34 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f34 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Rs0 f34 doCall true #txt
Rs0 f34 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Rs0 f34 requestMappingAction 'param.exception=in.exception;
' #txt
Rs0 f34 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f34 responseMappingAction 'out=in;
' #txt
Rs0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show exception to user
(if any)</name>
        <nameStyle>23,7
8,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f34 350 276 36 24 20 -2 #rect
Rs0 f34 @|CallSubIcon #fIcon
Rs0 f35 expr out #txt
Rs0 f35 368 227 368 276 #arcP
Rs0 f33 expr out #txt
Rs0 f33 368 300 368 357 #arcP
Rs0 f36 guid 14F1FF339D65EF13 #txt
Rs0 f36 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f36 method reloadRoleUserTables() #txt
Rs0 f36 disableUIEvents false #txt
Rs0 f36 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f36 outParameterDecl '<> result;
' #txt
Rs0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>reloadRoleUserTables()</name>
    </language>
</elementInfo>
' #txt
Rs0 f36 581 205 22 22 14 0 #rect
Rs0 f36 @|RichDialogMethodStartIcon #fIcon
Rs0 f37 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f37 581 357 22 22 14 0 #rect
Rs0 f37 @|RichDialogProcessEndIcon #fIcon
Rs0 f39 actionDecl 'ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData out;
' #txt
Rs0 f39 actionTable 'out=in;
' #txt
Rs0 f39 actionCode 'panel.usersOwnRolePane.setUsers(in.usersOwnRole);
panel.usersNotOwnRolePane.setUsers(in.usersNotOwnRole);' #txt
Rs0 f39 type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
Rs0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>reload data for 
userOwnRole and 
userNotOwnRole tables</name>
        <nameStyle>55,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f39 574 276 36 24 20 -2 #rect
Rs0 f39 @|RichDialogProcessStepIcon #fIcon
Rs0 f40 expr out #txt
Rs0 f40 592 227 592 276 #arcP
Rs0 f38 expr out #txt
Rs0 f38 592 300 592 357 #arcP
>Proto Rs0 .rdData2UIAction 'panel.addAllButton.enabled=in.administratable;
panel.addButton.enabled=in.administratable;
panel.okButton.enabled=in.administratable;
panel.removeAllButton.enabled=in.administratable;
panel.removeButton.enabled=in.administratable;
' #txt
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.security.RoleUsers.RoleUsersData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f0 mainOut f2 tail #connect
Rs0 f2 head f1 mainIn #connect
Rs0 f9 mainOut f22 tail #connect
Rs0 f22 head f21 mainIn #connect
Rs0 f21 mainOut f17 tail #connect
Rs0 f17 head f13 mainIn #connect
Rs0 f10 mainOut f24 tail #connect
Rs0 f24 head f23 mainIn #connect
Rs0 f23 mainOut f18 tail #connect
Rs0 f18 head f14 mainIn #connect
Rs0 f11 mainOut f26 tail #connect
Rs0 f26 head f25 mainIn #connect
Rs0 f25 mainOut f19 tail #connect
Rs0 f19 head f15 mainIn #connect
Rs0 f12 mainOut f28 tail #connect
Rs0 f28 head f27 mainIn #connect
Rs0 f27 mainOut f20 tail #connect
Rs0 f20 head f16 mainIn #connect
Rs0 f4 mainOut f6 tail #connect
Rs0 f6 head f30 mainIn #connect
Rs0 f3 mainOut f8 tail #connect
Rs0 f8 head f7 mainIn #connect
Rs0 f7 mainOut f5 tail #connect
Rs0 f5 head f29 mainIn #connect
Rs0 f31 mainOut f35 tail #connect
Rs0 f35 head f34 mainIn #connect
Rs0 f34 mainOut f33 tail #connect
Rs0 f33 head f32 mainIn #connect
Rs0 f36 mainOut f40 tail #connect
Rs0 f40 head f39 mainIn #connect
Rs0 f39 mainOut f38 tail #connect
Rs0 f38 head f37 mainIn #connect
