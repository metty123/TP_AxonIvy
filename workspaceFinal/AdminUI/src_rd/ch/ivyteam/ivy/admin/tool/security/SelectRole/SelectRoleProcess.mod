[Ivy]
[>Created: Thu Jun 02 08:38:09 ICT 2016]
15505346CF7AE7AE 3.18 #module
>Proto >Proto Collection #zClass
Ss0 SelectRoleProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @RichDialogProcessEnd f1 '' #zField
Ss0 @RichDialogInitStart f3 '' #zField
Ss0 @PushWFArc f4 '' #zField
Ss0 @RichDialogProcessStart f0 '' #zField
Ss0 @RichDialogEnd f2 '' #zField
Ss0 @RichDialogProcessStep f6 '' #zField
Ss0 @PushWFArc f7 '' #zField
Ss0 @PushWFArc f5 '' #zField
Ss0 @RichDialogProcessStart f8 '' #zField
Ss0 @RichDialogEnd f9 '' #zField
Ss0 @PushWFArc f10 '' #zField
>Proto Ss0 Ss0 SelectRoleProcess #zField
Ss0 f1 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f1 53 213 22 22 14 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f3 guid 155058A13FD21D1F #txt
Ss0 f3 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f3 method start(ch.ivyteam.ivy.application.IApplication,ch.ivyteam.ivy.security.IRole) #txt
Ss0 f3 disableUIEvents true #txt
Ss0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application,ch.ivyteam.ivy.security.IRole selectedRole> param = methodEvent.getInputArguments();
' #txt
Ss0 f3 inParameterMapAction 'out.subRole=param.selectedRole;
' #txt
Ss0 f3 outParameterDecl '<> result;
' #txt
Ss0 f3 embeddedRdInitializations '{/roleTreePanel {/fieldName "roleTreePanel"/startMethod "start(ch.ivyteam.ivy.security.IRole,ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.role=callParam.selectedRole;\nparam.application=callParam.application;\n"/initScript ""/userContext * }}' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication,IRole)</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 53 85 22 22 14 0 #rect
Ss0 f3 @|RichDialogInitStartIcon #fIcon
Ss0 f4 expr out #txt
Ss0 f4 64 107 64 213 #arcP
Ss0 f0 guid 1550638D540A3F63 #txt
Ss0 f0 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f0 actionDecl 'ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData out;
' #txt
Ss0 f0 actionTable 'out=in;
out.selectedMemberRole=panel.roleTreePanel.selectedRole;
' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addRoleMember</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 229 85 22 22 14 0 #rect
Ss0 f0 @|RichDialogProcessStartIcon #fIcon
Ss0 f2 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f2 guid 15506391A2BA84A1 #txt
Ss0 f2 229 213 22 22 14 0 #rect
Ss0 f2 @|RichDialogEndIcon #fIcon
Ss0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData out;
' #txt
Ss0 f6 actionTable 'out=in;
' #txt
Ss0 f6 actionCode '//FIXME: Not allow add 1 role member 2 times
if(!in.subRole.getRoleMembers().contains(in.selectedMemberRole)){
	in.subRole.addRoleMember(in.selectedMemberRole);
}


' #txt
Ss0 f6 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f6 222 148 36 24 20 -2 #rect
Ss0 f6 @|RichDialogProcessStepIcon #fIcon
Ss0 f7 expr out #txt
Ss0 f7 240 107 240 148 #arcP
Ss0 f5 expr out #txt
Ss0 f5 240 172 240 213 #arcP
Ss0 f8 guid 1550648141E51BC3 #txt
Ss0 f8 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData out;
' #txt
Ss0 f8 actionTable 'out=in;
' #txt
Ss0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>closeDialog</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f8 389 85 22 22 14 0 #rect
Ss0 f8 @|RichDialogProcessStartIcon #fIcon
Ss0 f9 type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
Ss0 f9 guid 15506484F6FD99E1 #txt
Ss0 f9 389 157 22 22 14 0 #rect
Ss0 f9 @|RichDialogEndIcon #fIcon
Ss0 f10 expr out #txt
Ss0 f10 400 107 400 157 #arcP
>Proto Ss0 .type ch.ivyteam.ivy.admin.tool.security.SelectRole.SelectRoleData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f3 mainOut f4 tail #connect
Ss0 f4 head f1 mainIn #connect
Ss0 f0 mainOut f7 tail #connect
Ss0 f7 head f6 mainIn #connect
Ss0 f6 mainOut f5 tail #connect
Ss0 f5 head f2 mainIn #connect
Ss0 f8 mainOut f10 tail #connect
Ss0 f10 head f9 mainIn #connect
