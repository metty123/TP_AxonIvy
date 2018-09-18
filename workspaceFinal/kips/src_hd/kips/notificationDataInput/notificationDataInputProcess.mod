[Ivy]
[>Created: Sat Jun 10 17:49:58 CEST 2017]
15B618549A9B9B94 3.20 #module
>Proto >Proto Collection #zClass
fs0 notificationDataInputProcess Big #zClass
fs0 RD #cInfo
fs0 #process
fs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
fs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
fs0 @TextInP .resExport .resExport #zField
fs0 @TextInP .type .type #zField
fs0 @TextInP .processKind .processKind #zField
fs0 @AnnotationInP-0n ai ai #zField
fs0 @MessageFlowInP-0n messageIn messageIn #zField
fs0 @MessageFlowOutP-0n messageOut messageOut #zField
fs0 @TextInP .xml .xml #zField
fs0 @TextInP .responsibility .responsibility #zField
fs0 @RichDialogInitStart f0 '' #zField
fs0 @RichDialogProcessEnd f1 '' #zField
fs0 @PushWFArc f2 '' #zField
fs0 @RichDialogProcessStart f3 '' #zField
fs0 @RichDialogEnd f4 '' #zField
fs0 @GridStep f9 '' #zField
fs0 @RichDialogProcessStart f6 '' #zField
fs0 @RichDialogProcessEnd f12 '' #zField
fs0 @PushWFArc f15 '' #zField
fs0 @PushWFArc f16 '' #zField
fs0 @GridStep f10 '' #zField
fs0 @PushWFArc f5 '' #zField
fs0 @PushWFArc f7 '' #zField
>Proto fs0 fs0 notificationDataInputProcess #zField
fs0 f0 guid 15A98CF78052D715 #txt
fs0 f0 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f0 method start() #txt
fs0 f0 disableUIEvents true #txt
fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
fs0 f0 inActionCode out.searchUser; #txt
fs0 f0 outParameterDecl '<java.lang.String message,ch.ivyteam.ivy.scripting.objects.File file,java.lang.String fileName,java.lang.String filePath,org.primefaces.model.StreamedContent fileDownload,java.lang.String fileContent,kips.searchUser searchUser,java.lang.String mentor> result;
' #txt
fs0 f0 outParameterMapAction 'result.message=in.message;
result.file=in.file;
result.fileName=in.fileName;
result.filePath=in.filePath;
result.fileDownload=in.fileDownload;
result.fileContent=in.fileContent;
result.searchUser.allUserNames=in.searchUser.allUserNames;
result.mentor=in.mentor;
' #txt
fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f0 83 51 26 26 -16 15 #rect
fs0 f0 @|RichDialogInitStartIcon #fIcon
fs0 f1 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f1 211 51 26 26 0 12 #rect
fs0 f1 @|RichDialogProcessEndIcon #fIcon
fs0 f2 expr out #txt
fs0 f2 109 64 211 64 #arcP
fs0 f3 guid 15A98CF781BDC15E #txt
fs0 f3 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f3 actionDecl 'kips.notificationDataInput.notificationDataInputData out;
' #txt
fs0 f3 actionTable 'out=in;
' #txt
fs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
fs0 f3 83 147 26 26 -15 12 #rect
fs0 f3 @|RichDialogProcessStartIcon #fIcon
fs0 f4 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f4 guid 15A98CF781CEE13D #txt
fs0 f4 339 147 26 26 0 12 #rect
fs0 f4 @|RichDialogEndIcon #fIcon
fs0 f9 actionDecl 'kips.notificationDataInput.notificationDataInputData out;
' #txt
fs0 f9 actionTable 'out=in;
' #txt
fs0 f9 actionCode 'in.fileContent = in.file.read();
in.fileName = in.file.getName();
in.filePath = in.file.getAbsolutePath();
' #txt
fs0 f9 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set file content and name
</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f9 168 243 160 44 -62 -16 #rect
fs0 f9 @|StepIcon #fIcon
fs0 f6 guid 15A98D2C96AB67CC #txt
fs0 f6 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f6 actionDecl 'kips.notificationDataInput.notificationDataInputData out;
' #txt
fs0 f6 actionTable 'out=in;
' #txt
fs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>documentUpload</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f6 91 252 26 26 -47 15 #rect
fs0 f6 @|RichDialogProcessStartIcon #fIcon
fs0 f12 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f12 411 252 26 26 0 12 #rect
fs0 f12 @|RichDialogProcessEndIcon #fIcon
fs0 f15 expr out #txt
fs0 f15 117 265 168 265 #arcP
fs0 f16 expr out #txt
fs0 f16 328 265 411 265 #arcP
fs0 f10 actionDecl 'kips.notificationDataInput.notificationDataInputData out;
' #txt
fs0 f10 actionTable 'out=in;
' #txt
fs0 f10 actionCode 'import ch.ivyteam.ivy.security.IUser;

List<IUser> allUsers = ivy.wf.getSecurityContext().findRole("Everybody").getUsers();
List<String> allUserNames;
for(IUser user : allUsers) {
    allUserNames.add(user.getName());
}        

in.mentor=ivy.case.getCreatorUser().getName();
allUserNames.remove(in.mentor);
in.searchUser.allUserNames = allUserNames;' #txt
fs0 f10 security system #txt
fs0 f10 type kips.notificationDataInput.notificationDataInputData #txt
fs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find all user</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f10 168 138 112 44 -34 -8 #rect
fs0 f10 @|StepIcon #fIcon
fs0 f5 expr out #txt
fs0 f5 280 160 339 160 #arcP
fs0 f7 expr out #txt
fs0 f7 109 160 168 160 #arcP
>Proto fs0 .type kips.notificationDataInput.notificationDataInputData #txt
>Proto fs0 .processKind HTML_DIALOG #txt
>Proto fs0 -8 -8 16 16 16 26 #rect
>Proto fs0 '' #fIcon
fs0 f0 mainOut f2 tail #connect
fs0 f2 head f1 mainIn #connect
fs0 f6 mainOut f15 tail #connect
fs0 f15 head f9 mainIn #connect
fs0 f9 mainOut f16 tail #connect
fs0 f16 head f12 mainIn #connect
fs0 f10 mainOut f5 tail #connect
fs0 f5 head f4 mainIn #connect
fs0 f3 mainOut f7 tail #connect
fs0 f7 head f10 mainIn #connect
