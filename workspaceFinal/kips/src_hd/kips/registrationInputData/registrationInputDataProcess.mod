[Ivy]
[>Created: Thu Apr 13 12:05:35 CEST 2017]
15B610DE70C69EB8 3.19 #module
>Proto >Proto Collection #zClass
ds0 registrationInputDataProcess Big #zClass
ds0 RD #cInfo
ds0 #process
ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ds0 @TextInP .resExport .resExport #zField
ds0 @TextInP .type .type #zField
ds0 @TextInP .processKind .processKind #zField
ds0 @AnnotationInP-0n ai ai #zField
ds0 @MessageFlowInP-0n messageIn messageIn #zField
ds0 @MessageFlowOutP-0n messageOut messageOut #zField
ds0 @TextInP .xml .xml #zField
ds0 @TextInP .responsibility .responsibility #zField
ds0 @RichDialogProcessStart f3 '' #zField
ds0 @RichDialogEnd f4 '' #zField
ds0 @RichDialogInitStart f0 '' #zField
ds0 @RichDialogProcessEnd f1 '' #zField
ds0 @PushWFArc f2 '' #zField
ds0 @RichDialogMethodStart f6 '' #zField
ds0 @RichDialogProcessEnd f7 '' #zField
ds0 @GridStep f9 '' #zField
ds0 @PushWFArc f10 '' #zField
ds0 @PushWFArc f8 '' #zField
ds0 @GridStep f11 '' #zField
ds0 @PushWFArc f12 '' #zField
ds0 @PushWFArc f5 '' #zField
>Proto ds0 ds0 registrationInputDataProcess #zField
ds0 f3 guid 15A89FF98EF3DAEF #txt
ds0 f3 type kips.registrationInputData.registrationInputDataData #txt
ds0 f3 actionDecl 'kips.registrationInputData.registrationInputDataData out;
' #txt
ds0 f3 actionTable 'out=in;
' #txt
ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
ds0 f3 67 147 26 26 -15 12 #rect
ds0 f3 @|RichDialogProcessStartIcon #fIcon
ds0 f4 type kips.registrationInputData.registrationInputDataData #txt
ds0 f4 guid 15A89FF98EF3E1C2 #txt
ds0 f4 323 147 26 26 0 12 #rect
ds0 f4 @|RichDialogEndIcon #fIcon
ds0 f0 guid 15A8A0EBE3D7BFE7 #txt
ds0 f0 type kips.registrationInputData.registrationInputDataData #txt
ds0 f0 method start() #txt
ds0 f0 disableUIEvents true #txt
ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ds0 f0 inActionCode out.searchUser; #txt
ds0 f0 outParameterDecl '<kips.User user,kips.searchUser searchUser> result;
' #txt
ds0 f0 outParameterMapAction 'result.user=in.user;
result.searchUser=in.searchUser;
' #txt
ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ds0 f0 67 51 26 26 -16 15 #rect
ds0 f0 @|RichDialogInitStartIcon #fIcon
ds0 f1 type kips.registrationInputData.registrationInputDataData #txt
ds0 f1 211 51 26 26 0 12 #rect
ds0 f1 @|RichDialogProcessEndIcon #fIcon
ds0 f2 expr out #txt
ds0 f2 93 64 211 64 #arcP
ds0 f6 guid 15AAE4390C95FCBF #txt
ds0 f6 type kips.registrationInputData.registrationInputDataData #txt
ds0 f6 method searchUsers(String) #txt
ds0 f6 disableUIEvents false #txt
ds0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String searchText> param = methodEvent.getInputArguments();
' #txt
ds0 f6 inParameterMapAction 'out.searchUser.searchText=param.searchText;
' #txt
ds0 f6 outParameterDecl '<List<ch.ivyteam.ivy.security.IUser> user> result;
' #txt
ds0 f6 outParameterMapAction 'result.user=in.searchUser.searchResult;
' #txt
ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>searchUsers(String)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ds0 f6 67 243 26 26 -56 15 #rect
ds0 f6 @|RichDialogMethodStartIcon #fIcon
ds0 f7 type kips.registrationInputData.registrationInputDataData #txt
ds0 f7 323 243 26 26 0 12 #rect
ds0 f7 @|RichDialogProcessEndIcon #fIcon
ds0 f9 actionDecl 'kips.registrationInputData.registrationInputDataData out;
' #txt
ds0 f9 actionTable 'out=in;
' #txt
ds0 f9 actionCode 'import ch.ivyteam.ivy.security.IUser;

List<IUser> result;
List<IUser> allUsers = ivy.wf.getSecurityContext().findRole("Mentor").getUsers();
        
for(IUser user : allUsers) {
  if(user.getName().toUpperCase().contains(in.searchUser.searchText.toUpperCase()))
  {
    result.add(user);
  }
}

in.searchUser.searchResult = result;






' #txt
ds0 f9 security system #txt
ds0 f9 type kips.registrationInputData.registrationInputDataData #txt
ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>find users</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ds0 f9 152 234 112 44 -27 -8 #rect
ds0 f9 @|StepIcon #fIcon
ds0 f10 expr out #txt
ds0 f10 93 256 152 256 #arcP
ds0 f8 expr out #txt
ds0 f8 264 256 323 256 #arcP
ds0 f11 actionDecl 'kips.registrationInputData.registrationInputDataData out;
' #txt
ds0 f11 actionTable 'out=in;
' #txt
ds0 f11 actionCode 'in.user.mentor = null;
if(in.searchUser.searchText != 0)
{
	in.user.mentor = ivy.wf.getSecurityContext().findUser(in.searchUser.selectedUserID);
}' #txt
ds0 f11 type kips.registrationInputData.registrationInputDataData #txt
ds0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set responsible</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ds0 f11 152 138 112 44 -43 -8 #rect
ds0 f11 @|StepIcon #fIcon
ds0 f12 expr out #txt
ds0 f12 93 160 152 160 #arcP
ds0 f5 expr out #txt
ds0 f5 264 160 323 160 #arcP
>Proto ds0 .type kips.registrationInputData.registrationInputDataData #txt
>Proto ds0 .processKind HTML_DIALOG #txt
>Proto ds0 -8 -8 16 16 16 26 #rect
>Proto ds0 '' #fIcon
ds0 f0 mainOut f2 tail #connect
ds0 f2 head f1 mainIn #connect
ds0 f6 mainOut f10 tail #connect
ds0 f10 head f9 mainIn #connect
ds0 f9 mainOut f8 tail #connect
ds0 f8 head f7 mainIn #connect
ds0 f3 mainOut f12 tail #connect
ds0 f12 head f11 mainIn #connect
ds0 f11 mainOut f5 tail #connect
ds0 f5 head f4 mainIn #connect
