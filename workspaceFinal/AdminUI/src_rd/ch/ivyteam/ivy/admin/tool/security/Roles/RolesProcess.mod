[Ivy]
[>Created: Tue Jun 07 11:00:26 ICT 2016]
117AB6B1778D2124 3.18 #module
>Proto >Proto Collection #zClass
Rs0 RolesProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @MessageFlowInP-0n messageIn messageIn #zField
Rs0 @MessageFlowOutP-0n messageOut messageOut #zField
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessEnd f1 '' #zField
Rs0 @RichDialogProcessStart f3 '' #zField
Rs0 @RichDialogProcessStart f4 '' #zField
Rs0 @RichDialogProcessStart f5 '' #zField
Rs0 @RichDialogProcessEnd f6 '' #zField
Rs0 @RichDialogProcessEnd f7 '' #zField
Rs0 @RichDialogProcessEnd f8 '' #zField
Rs0 @RichDialog f9 '' #zField
Rs0 @PushWFArc f10 '' #zField
Rs0 @PushWFArc f11 '' #zField
Rs0 @RichDialog f12 '' #zField
Rs0 @RichDialogProcessStart f18 '' #zField
Rs0 @RichDialogEnd f19 '' #zField
Rs0 @PushWFArc f20 '' #zField
Rs0 @RichDialogProcessStart f21 '' #zField
Rs0 @RichDialogProcessEnd f22 '' #zField
Rs0 @RichDialogProcessStep f37 '' #zField
Rs0 @PushWFArc f38 '' #zField
Rs0 @PushWFArc f13 '' #zField
Rs0 @RichDialog f39 '' #zField
Rs0 @PushWFArc f40 '' #zField
Rs0 @PushWFArc f23 '' #zField
Rs0 @RichDialogProcessStart f41 '' #zField
Rs0 @RichDialogProcessEnd f42 '' #zField
Rs0 @RichDialog f43 '' #zField
Rs0 @PushWFArc f44 '' #zField
Rs0 @PushWFArc f45 '' #zField
Rs0 @PushWFArc f14 '' #zField
Rs0 @RichDialogProcessStart f15 '' #zField
Rs0 @RichDialogProcessEnd f16 '' #zField
Rs0 @CallSub f25 '' #zField
Rs0 @PushWFArc f26 '' #zField
Rs0 @PushWFArc f24 '' #zField
Rs0 @RichDialogProcessEnd f28 '' #zField
Rs0 @RichDialogProcessStep f29 '' #zField
Rs0 @PushWFArc f31 '' #zField
Rs0 @PushWFArc f2 '' #zField
Rs0 @RichDialogProcessStart f32 '' #zField
Rs0 @RichDialogProcessStep f33 '' #zField
Rs0 @PushWFArc f34 '' #zField
Rs0 @RichDialogProcessEnd f35 '' #zField
Rs0 @PushWFArc f36 '' #zField
Rs0 @RichDialogMethodStart f46 '' #zField
Rs0 @PushWFArc f47 '' #zField
Rs0 @RichDialogProcessStart f27 '' #zField
Rs0 @RichDialogProcessEnd f30 '' #zField
Rs0 @RichDialog f49 '' #zField
Rs0 @PushWFArc f50 '' #zField
Rs0 @RichDialogProcessStep f51 '' #zField
Rs0 @PushWFArc f52 '' #zField
Rs0 @PushWFArc f48 '' #zField
Rs0 @RichDialogProcessStart f53 '' #zField
Rs0 @RichDialogProcessEnd f54 '' #zField
Rs0 @RichDialog f56 '' #zField
Rs0 @PushWFArc f57 '' #zField
Rs0 @PushWFArc f60 '' #zField
Rs0 @PushWFArc f17 '' #zField
>Proto Rs0 Rs0 RolesProcess #zField
Rs0 f0 guid 117AB7011FDBFB52 #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f0 method start(ch.ivyteam.ivy.application.IApplication) #txt
Rs0 f0 disableUIEvents false #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 inParameterMapAction 'out.application=param.application;
out.securityContext=param.application.getSecurityContext();
out.securityDescriptor=param.application.getSecurityDescriptor();
' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 embeddedRdInitializations '{/rolePane {/fieldName "rolePane"/startMethod "start(ch.ivyteam.ivy.application.IApplication)"/parameterMapping ""/initScript "import ch.ivyteam.ivy.persistence.PersistencyException;\n\nin.exception = null;\ntry \n{\n\tparam.application = in.application;\n} \ncatch (PersistencyException e) \n{\n\tin.exception = e;\n}"/userContext * }}' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f0 22 46 20 20 13 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f1 19 195 26 26 14 0 #rect
Rs0 f1 @|RichDialogProcessEndIcon #fIcon
Rs0 f3 guid 117AB70B7092CF6C #txt
Rs0 f3 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f3 actionTable 'out=in;
' #txt
Rs0 f3 actionCode 'import ch.ivyteam.ivy.admin.tool.role.Role;
import ch.ivyteam.ivy.richdialog.exec.RdEvent;

in.role = (event as RdEvent).getParameter() as Role;
in.selectedRole = in.role.getIvyRole();' #txt
Rs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>selected</name>
        <nameStyle>8,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f3 310 46 20 20 13 0 #rect
Rs0 f3 @|RichDialogProcessStartIcon #fIcon
Rs0 f4 guid 117AB70CBFD90B86 #txt
Rs0 f4 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f4 actionTable 'out=in;
' #txt
Rs0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>permissions</name>
        <nameStyle>11,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f4 414 46 20 20 13 0 #rect
Rs0 f4 @|RichDialogProcessStartIcon #fIcon
Rs0 f5 guid 117AB7122E7BDB1A #txt
Rs0 f5 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f5 actionTable 'out=in;
' #txt
Rs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>externalName</name>
        <nameStyle>12,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f5 534 46 20 20 13 0 #rect
Rs0 f5 @|RichDialogProcessStartIcon #fIcon
Rs0 f6 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f6 307 195 26 26 14 0 #rect
Rs0 f6 @|RichDialogProcessEndIcon #fIcon
Rs0 f7 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f7 411 195 26 26 14 0 #rect
Rs0 f7 @|RichDialogProcessEndIcon #fIcon
Rs0 f8 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f8 531 195 26 26 14 0 #rect
Rs0 f8 @|RichDialogProcessEndIcon #fIcon
Rs0 f9 targetWindow NEW:card: #txt
Rs0 f9 targetDisplay TOP #txt
Rs0 f9 richDialogId ch.ivyteam.ivy.admin.tool.security.Permissions #txt
Rs0 f9 startMethod start(ch.ivyteam.ivy.security.ISecurityMember,ch.ivyteam.ivy.security.ISecurityDescriptor) #txt
Rs0 f9 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f9 requestActionDecl '<ch.ivyteam.ivy.security.ISecurityMember securityMember, ch.ivyteam.ivy.security.ISecurityDescriptor securityDesriptor> param;' #txt
Rs0 f9 requestMappingAction 'param.securityMember=in.selectedRole;
param.securityDesriptor=in.securityDescriptor;
' #txt
Rs0 f9 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f9 responseMappingAction 'out=in;
' #txt
Rs0 f9 windowConfiguration '{/title "Permissions of role <%=in.selectedRole.getName()%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f9 isAsynch false #txt
Rs0 f9 isInnerRd true #txt
Rs0 f9 isDialog true #txt
Rs0 f9 userContext '* ' #txt
Rs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f9 406 92 36 24 20 -2 #rect
Rs0 f9 @|RichDialogIcon #fIcon
Rs0 f10 expr out #txt
Rs0 f10 424 66 424 92 #arcP
Rs0 f11 expr out #txt
Rs0 f11 424 116 424 195 #arcP
Rs0 f12 targetWindow NEW:card: #txt
Rs0 f12 targetDisplay TOP #txt
Rs0 f12 richDialogId ch.ivyteam.ivy.admin.tool.security.Role #txt
Rs0 f12 startMethod start(ch.ivyteam.ivy.security.IRole) #txt
Rs0 f12 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f12 requestActionDecl '<ch.ivyteam.ivy.security.IRole role> param;' #txt
Rs0 f12 requestMappingAction 'param.role=in.selectedRole;
' #txt
Rs0 f12 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f12 responseMappingAction 'out=in;
' #txt
Rs0 f12 windowConfiguration '{/title "External security name of role <%=in.selectedRole.getName() %>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f12 isAsynch false #txt
Rs0 f12 isInnerRd true #txt
Rs0 f12 isDialog true #txt
Rs0 f12 userContext '* ' #txt
Rs0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>jndi browser and set external security name</name>
        <nameStyle>43,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f12 526 92 36 24 20 -2 #rect
Rs0 f12 @|RichDialogIcon #fIcon
Rs0 f18 guid 117AB9D8F0C892CA #txt
Rs0 f18 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f18 actionTable 'out=in;
' #txt
Rs0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f18 30 278 20 20 13 0 #rect
Rs0 f18 @|RichDialogProcessStartIcon #fIcon
Rs0 f19 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f19 guid 117AB9D9FFA9ADBB #txt
Rs0 f19 27 443 26 26 14 0 #rect
Rs0 f19 @|RichDialogEndIcon #fIcon
Rs0 f20 expr out #txt
Rs0 f20 40 298 40 443 #arcP
Rs0 f21 guid 117ABD6EDAF45346 #txt
Rs0 f21 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f21 actionTable 'out=in;
' #txt
Rs0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>users</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f21 126 278 20 20 13 0 #rect
Rs0 f21 @|RichDialogProcessStartIcon #fIcon
Rs0 f22 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f22 123 443 26 26 14 0 #rect
Rs0 f22 @|RichDialogProcessEndIcon #fIcon
Rs0 f37 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f37 actionTable 'out=in;
' #txt
Rs0 f37 actionCode panel.rolePane.refreshSelectedRole(); #txt
Rs0 f37 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh selected role</name>
        <nameStyle>21,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f37 526 140 36 24 20 -2 #rect
Rs0 f37 @|RichDialogProcessStepIcon #fIcon
Rs0 f38 expr out #txt
Rs0 f38 544 116 544 140 #arcP
Rs0 f13 expr out #txt
Rs0 f13 544 164 544 195 #arcP
Rs0 f39 targetWindow NEW:card: #txt
Rs0 f39 targetDisplay TOP #txt
Rs0 f39 richDialogId ch.ivyteam.ivy.admin.tool.security.RoleUsers #txt
Rs0 f39 startMethod start(ch.ivyteam.ivy.security.ISecurityContext,ch.ivyteam.ivy.security.IRole) #txt
Rs0 f39 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f39 requestActionDecl '<ch.ivyteam.ivy.security.ISecurityContext securityContext, ch.ivyteam.ivy.security.IRole role> param;' #txt
Rs0 f39 requestMappingAction 'param.securityContext=in.securityContext;
param.role=in.selectedRole;
' #txt
Rs0 f39 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f39 responseMappingAction 'out=in;
' #txt
Rs0 f39 windowConfiguration '{/title "Users that own role <%=in.selectedRole.getName()%>"/width 850 /height 500 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f39 isAsynch false #txt
Rs0 f39 isInnerRd true #txt
Rs0 f39 isDialog true #txt
Rs0 f39 userContext '* ' #txt
Rs0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f39 118 372 36 24 20 -2 #rect
Rs0 f39 @|RichDialogIcon #fIcon
Rs0 f40 expr out #txt
Rs0 f40 136 298 136 372 #arcP
Rs0 f23 expr out #txt
Rs0 f23 136 396 136 443 #arcP
Rs0 f41 guid 117CA11331B7054E #txt
Rs0 f41 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f41 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f41 actionTable 'out=in;
' #txt
Rs0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>systemPermissions</name>
        <nameStyle>17,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f41 46 518 20 20 13 0 #rect
Rs0 f41 @|RichDialogProcessStartIcon #fIcon
Rs0 f42 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f42 43 611 26 26 14 0 #rect
Rs0 f42 @|RichDialogProcessEndIcon #fIcon
Rs0 f43 targetWindow NEW #txt
Rs0 f43 targetDisplay TOP #txt
Rs0 f43 richDialogId ch.ivyteam.ivy.admin.tool.security.Permissions #txt
Rs0 f43 startMethod start(ch.ivyteam.ivy.security.ISecurityMember,ch.ivyteam.ivy.security.ISecurityDescriptor) #txt
Rs0 f43 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f43 requestActionDecl '<ch.ivyteam.ivy.security.ISecurityMember securityMember, ch.ivyteam.ivy.security.ISecurityDescriptor securityDesriptor> param;' #txt
Rs0 f43 requestMappingAction 'param.securityMember=in.selectedRole;
' #txt
Rs0 f43 requestActionCode 'import ch.ivyteam.ivy.server.ServerFactory;

param.securityDesriptor = ServerFactory.getServer().getSecurityManager().getSystemSecurityDescriptor();' #txt
Rs0 f43 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f43 responseMappingAction 'out=in;
' #txt
Rs0 f43 windowConfiguration '#Wed Jan 30 10:41:37 CET 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=true
width=0
title=System Permissions of Role <%\\=in.selectedRole.getName()%>
' #txt
Rs0 f43 isAsynch false #txt
Rs0 f43 isInnerRd true #txt
Rs0 f43 isDialog true #txt
Rs0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Rs0 f43 38 564 36 24 20 -2 #rect
Rs0 f43 @|RichDialogIcon #fIcon
Rs0 f44 expr out #txt
Rs0 f44 56 538 56 564 #arcP
Rs0 f45 expr out #txt
Rs0 f45 56 588 56 611 #arcP
Rs0 f14 expr out #txt
Rs0 f14 544 66 544 92 #arcP
Rs0 f15 guid 1478AA7C46DE674B #txt
Rs0 f15 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f15 actionTable 'out=in;
' #txt
Rs0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onload</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f15 309 277 22 22 14 0 #rect
Rs0 f15 @|RichDialogProcessStartIcon #fIcon
Rs0 f16 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f16 309 445 22 22 14 0 #rect
Rs0 f16 @|RichDialogProcessEndIcon #fIcon
Rs0 f25 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f25 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Rs0 f25 doCall true #txt
Rs0 f25 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Rs0 f25 requestMappingAction 'param.exception=in.exception;
' #txt
Rs0 f25 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f25 responseMappingAction 'out=in;
' #txt
Rs0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error to user
(if any)</name>
        <nameStyle>19,7
8,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f25 302 372 36 24 20 -2 #rect
Rs0 f25 @|CallSubIcon #fIcon
Rs0 f26 expr out #txt
Rs0 f26 320 299 320 372 #arcP
Rs0 f24 expr out #txt
Rs0 f24 320 396 320 445 #arcP
Rs0 f28 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f28 853 165 22 22 14 0 #rect
Rs0 f28 @|RichDialogProcessEndIcon #fIcon
Rs0 f29 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f29 actionTable 'out=in;
' #txt
Rs0 f29 actionCode panel.rolePane.filterRoles(panel.roleLookupTextField.text); #txt
Rs0 f29 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter roles by keyword</name>
        <nameStyle>23,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f29 846 100 36 24 20 -2 #rect
Rs0 f29 @|RichDialogProcessStepIcon #fIcon
Rs0 f31 expr out #txt
Rs0 f31 864 124 864 165 #arcP
Rs0 f2 expr out #txt
Rs0 f2 32 66 32 195 #arcP
Rs0 f32 guid 14EB41FB9536B7AC #txt
Rs0 f32 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f32 actionTable 'out=in;
' #txt
Rs0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>displayObsoleteRoles</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f32 533 277 22 22 14 0 #rect
Rs0 f32 @|RichDialogProcessStartIcon #fIcon
Rs0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f33 actionTable 'out=in;
' #txt
Rs0 f33 actionCode 'if (panel.roleFilterCheckBox.isSelected())
{
	panel.rolePane.displayObsoleteRoles();
}
else
{
	panel.rolePane.hideObsoleteRoles();
}' #txt
Rs0 f33 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>display obsolete roles</name>
        <nameStyle>22
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f33 526 372 36 24 20 -2 #rect
Rs0 f33 @|RichDialogProcessStepIcon #fIcon
Rs0 f34 expr out #txt
Rs0 f34 544 299 544 372 #arcP
Rs0 f35 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f35 533 469 22 22 14 0 #rect
Rs0 f35 @|RichDialogProcessEndIcon #fIcon
Rs0 f36 expr out #txt
Rs0 f36 544 396 544 469 #arcP
Rs0 f46 guid 14F211C47DD13351 #txt
Rs0 f46 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f46 method filter() #txt
Rs0 f46 disableUIEvents false #txt
Rs0 f46 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f46 outParameterDecl '<> result;
' #txt
Rs0 f46 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter()</name>
    </language>
</elementInfo>
' #txt
Rs0 f46 853 21 22 22 14 0 #rect
Rs0 f46 @|RichDialogMethodStartIcon #fIcon
Rs0 f47 expr out #txt
Rs0 f47 864 43 864 100 #arcP
Rs0 f27 guid 1550134AB089818C #txt
Rs0 f27 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f27 actionTable 'out=in;
' #txt
Rs0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addMemberRole</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f27 789 277 22 22 14 0 #rect
Rs0 f27 @|RichDialogProcessStartIcon #fIcon
Rs0 f30 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f30 789 461 22 22 14 0 #rect
Rs0 f30 @|RichDialogProcessEndIcon #fIcon
Rs0 f49 targetWindow NEW:card: #txt
Rs0 f49 targetDisplay TOP #txt
Rs0 f49 richDialogId ch.ivyteam.ivy.admin.tool.security.SelectRole #txt
Rs0 f49 startMethod start(ch.ivyteam.ivy.application.IApplication,ch.ivyteam.ivy.security.IRole) #txt
Rs0 f49 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f49 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application, ch.ivyteam.ivy.security.IRole selectedRole> param;' #txt
Rs0 f49 requestMappingAction 'param.application=in.application;
param.selectedRole=in.selectedRole;
' #txt
Rs0 f49 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f49 responseMappingAction 'out=in;
' #txt
Rs0 f49 windowConfiguration '{/title "Role Members"/width 300 /height 250 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f49 isAsynch false #txt
Rs0 f49 isInnerRd true #txt
Rs0 f49 userContext '* ' #txt
Rs0 f49 782 332 36 24 20 -2 #rect
Rs0 f49 @|RichDialogIcon #fIcon
Rs0 f50 expr out #txt
Rs0 f50 800 299 800 332 #arcP
Rs0 f51 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f51 actionTable 'out=in;
' #txt
Rs0 f51 actionCode panel.rolePane.refreshRoleTree(); #txt
Rs0 f51 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f51 782 396 36 24 20 -2 #rect
Rs0 f51 @|RichDialogProcessStepIcon #fIcon
Rs0 f52 expr out #txt
Rs0 f52 800 356 800 396 #arcP
Rs0 f48 expr out #txt
Rs0 f48 800 420 800 461 #arcP
Rs0 f53 guid 1550F76CF1E81925 #txt
Rs0 f53 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f53 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f53 actionTable 'out=in;
' #txt
Rs0 f53 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>removeRoleMember</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f53 981 277 22 22 14 0 #rect
Rs0 f53 @|RichDialogProcessStartIcon #fIcon
Rs0 f54 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f54 981 469 22 22 14 0 #rect
Rs0 f54 @|RichDialogProcessEndIcon #fIcon
Rs0 f56 targetWindow NEW:card: #txt
Rs0 f56 targetDisplay TOP #txt
Rs0 f56 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Rs0 f56 startMethod askQuestion(String,String,List<String>,String) #txt
Rs0 f56 type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
Rs0 f56 requestActionDecl '<String icon, String question, List<String> buttons, String defaultButton> param;' #txt
Rs0 f56 requestMappingAction 'param.question="Do you want to remove this role?";
param.buttons=["Yes", "No"];
param.defaultButton="No";
' #txt
Rs0 f56 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Roles.RolesData out;
' #txt
Rs0 f56 responseMappingAction 'out=in;
' #txt
Rs0 f56 responseActionCode 'import ch.ivyteam.ivy.admin.tool.role.RoleMember;
if ("Yes".equals(result.pressedButton) && in.role instanceof RoleMember) {
	(in.role as RoleMember).getParent().removeRoleMember(in.role.getIvyRole());
	panel.rolePane.refreshRoleTree();
}' #txt
Rs0 f56 windowConfiguration '{/title "Remove Role Member"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f56 isAsynch false #txt
Rs0 f56 isInnerRd true #txt
Rs0 f56 userContext '* ' #txt
Rs0 f56 974 364 36 24 20 -2 #rect
Rs0 f56 @|RichDialogIcon #fIcon
Rs0 f57 expr out #txt
Rs0 f57 992 299 992 364 #arcP
Rs0 f60 expr out #txt
Rs0 f60 992 388 992 469 #arcP
Rs0 f17 expr out #txt
Rs0 f17 320 66 320 195 #arcP
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.security.Roles.RolesData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 .rdData2UIAction 'panel.addRoleMemberButton.enabled=in.#selectedRole is initialized && !(in.role instanceof ch.ivyteam.ivy.admin.tool.role.RoleMember) && !"Everybody".equals(in.selectedRole.getName()) && in.role.isActive();
panel.permissionButton.enabled=in.#selectedRole != null;
panel.removeRoleMemberButton.enabled=in.#selectedRole is initialized && in.role instanceof ch.ivyteam.ivy.admin.tool.role.RoleMember;
panel.setExternalNameButton.enabled=in.#selectedRole != null
&& (!ch.ivyteam.ivy.security.ISecurityConstants.TOP_LEVEL_ROLE_NAME.equals(in.#selectedRole.getName()))
&& (in.securityContext.getExternalSecuritySystemName()==ch.ivyteam.ivy.security.ISecurityConstants.MICROSOFT_ACTIVE_DIRECTORY_SECURITY_SYSTEM_PROVIDER_NAME 
||in.securityContext.getExternalSecuritySystemName()==ch.ivyteam.ivy.security.ISecurityConstants.NOVELL_E_DIRECTORY_SECURITY_SYSTEM_PROVIDER_NAME);
panel.systemPermissionButton.enabled=in.#selectedRole != null;
panel.usersButton.enabled=in.#selectedRole != null
&& (!ch.ivyteam.ivy.security.ISecurityConstants.TOP_LEVEL_ROLE_NAME.equals(in.#selectedRole.getName()));
' #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f4 mainOut f10 tail #connect
Rs0 f10 head f9 mainIn #connect
Rs0 f9 mainOut f11 tail #connect
Rs0 f11 head f7 mainIn #connect
Rs0 f18 mainOut f20 tail #connect
Rs0 f20 head f19 mainIn #connect
Rs0 f12 mainOut f38 tail #connect
Rs0 f38 head f37 mainIn #connect
Rs0 f37 mainOut f13 tail #connect
Rs0 f13 head f8 mainIn #connect
Rs0 f21 mainOut f40 tail #connect
Rs0 f40 head f39 mainIn #connect
Rs0 f39 mainOut f23 tail #connect
Rs0 f23 head f22 mainIn #connect
Rs0 f41 mainOut f44 tail #connect
Rs0 f44 head f43 mainIn #connect
Rs0 f43 mainOut f45 tail #connect
Rs0 f45 head f42 mainIn #connect
Rs0 f5 mainOut f14 tail #connect
Rs0 f14 head f12 mainIn #connect
Rs0 f15 mainOut f26 tail #connect
Rs0 f26 head f25 mainIn #connect
Rs0 f25 mainOut f24 tail #connect
Rs0 f24 head f16 mainIn #connect
Rs0 f29 mainOut f31 tail #connect
Rs0 f31 head f28 mainIn #connect
Rs0 f0 mainOut f2 tail #connect
Rs0 f2 head f1 mainIn #connect
Rs0 f32 mainOut f34 tail #connect
Rs0 f34 head f33 mainIn #connect
Rs0 f33 mainOut f36 tail #connect
Rs0 f36 head f35 mainIn #connect
Rs0 f46 mainOut f47 tail #connect
Rs0 f47 head f29 mainIn #connect
Rs0 f27 mainOut f50 tail #connect
Rs0 f50 head f49 mainIn #connect
Rs0 f49 mainOut f52 tail #connect
Rs0 f52 head f51 mainIn #connect
Rs0 f51 mainOut f48 tail #connect
Rs0 f48 head f30 mainIn #connect
Rs0 f53 mainOut f57 tail #connect
Rs0 f57 head f56 mainIn #connect
Rs0 f56 mainOut f60 tail #connect
Rs0 f60 head f54 mainIn #connect
Rs0 f3 mainOut f17 tail #connect
Rs0 f17 head f6 mainIn #connect
