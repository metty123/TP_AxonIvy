[Ivy]
[>Created: Mon Jun 12 16:59:30 CEST 2017]
15B4D4DC7DA10F49 3.20 #module
>Proto >Proto Collection #zClass
fs0 documentUploadProcess Big #zClass
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
fs0 @PushWFArc f10 '' #zField
fs0 @GridStep f14 '' #zField
fs0 @PushWFArc f7 '' #zField
fs0 @GridStep f13 '' #zField
fs0 @PushWFArc f16 '' #zField
fs0 @DBStep f5 '' #zField
fs0 @PushWFArc f8 '' #zField
fs0 @PushWFArc f11 '' #zField
>Proto fs0 fs0 documentUploadProcess #zField
fs0 f0 guid 15A98CF78052D715 #txt
fs0 f0 type kips.documentUpload.documentUploadData #txt
fs0 f0 method start() #txt
fs0 f0 disableUIEvents true #txt
fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
fs0 f0 outParameterDecl '<java.lang.String message,ch.ivyteam.ivy.scripting.objects.File file,java.lang.String fileName,java.lang.String filePath,org.primefaces.model.StreamedContent fileDownload,java.lang.String fileContent> result;
' #txt
fs0 f0 outParameterMapAction 'result.message=in.message;
result.file=in.file;
result.fileName=in.fileName;
result.filePath=in.filePath;
result.fileDownload=in.fileDownload;
result.fileContent=in.fileContent;
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
fs0 f1 type kips.documentUpload.documentUploadData #txt
fs0 f1 211 51 26 26 0 12 #rect
fs0 f1 @|RichDialogProcessEndIcon #fIcon
fs0 f2 expr out #txt
fs0 f2 109 64 211 64 #arcP
fs0 f3 guid 15A98CF781BDC15E #txt
fs0 f3 type kips.documentUpload.documentUploadData #txt
fs0 f3 actionDecl 'kips.documentUpload.documentUploadData out;
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
fs0 f4 type kips.documentUpload.documentUploadData #txt
fs0 f4 guid 15A98CF781CEE13D #txt
fs0 f4 699 147 26 26 0 12 #rect
fs0 f4 @|RichDialogEndIcon #fIcon
fs0 f9 actionDecl 'kips.documentUpload.documentUploadData out;
' #txt
fs0 f9 actionTable 'out=in;
' #txt
fs0 f9 actionCode 'in.fileContent = in.file.read();
in.fileName = in.file.getName();
in.filePath = in.file.getAbsolutePath();

' #txt
fs0 f9 type kips.documentUpload.documentUploadData #txt
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
fs0 f6 type kips.documentUpload.documentUploadData #txt
fs0 f6 actionDecl 'kips.documentUpload.documentUploadData out;
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
fs0 f12 type kips.documentUpload.documentUploadData #txt
fs0 f12 427 252 26 26 0 12 #rect
fs0 f12 @|RichDialogProcessEndIcon #fIcon
fs0 f15 expr out #txt
fs0 f15 117 265 168 265 #arcP
fs0 f10 expr out #txt
fs0 f10 328 265 427 265 #arcP
fs0 f14 actionDecl 'kips.documentUpload.documentUploadData out;
' #txt
fs0 f14 actionTable 'out=in;
' #txt
fs0 f14 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;

ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write Student to DataClasses
IUser student = ivy.case.getCreatorUser();
in.student=student.getName();

//find and write Mentor to DataClasses
IUser mentor = securityContext.findUser(student.getProperty("Mentor"));
in.mentor=mentor.getName();' #txt
fs0 f14 security system #txt
fs0 f14 type kips.documentUpload.documentUploadData #txt
fs0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f14 164 137 112 44 -32 -8 #rect
fs0 f14 @|StepIcon #fIcon
fs0 f7 expr out #txt
fs0 f7 108 159 164 159 #arcP
fs0 f13 actionDecl 'kips.documentUpload.documentUploadData out;
' #txt
fs0 f13 actionTable 'out=in;
' #txt
fs0 f13 actionCode 'Date d = new Date();
Time t = new Time();
String path = "\\kips\\Files\\"+in.student+"\\"+d.toString()+"-"+t.getHours()+"-"+t.getMinutes()+"-"+t.getSeconds()+"\\"+in.file.getName();
File file = new File(path);
file.writeBinary(in.file.readBinary());

in.file.makePersistent(true);
in.filePath = file.getAbsolutePath();' #txt
fs0 f13 security system #txt
fs0 f13 type kips.documentUpload.documentUploadData #txt
fs0 f13 328 138 112 44 0 -8 #rect
fs0 f13 @|StepIcon #fIcon
fs0 f16 expr out #txt
fs0 f16 276 159 328 160 #arcP
fs0 f5 actionDecl 'kips.documentUpload.documentUploadData out;
' #txt
fs0 f5 actionTable 'out=in;
' #txt
fs0 f5 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE INSERT SYSTEM  ""sqlStatements.dtd"">
<INSERT><Table name=''document''/><Value column=''Name''><AnyExpression>in.fileName</AnyExpression></Value><Value column=''Type''><AnyExpression>in.fileKind</AnyExpression></Value><Value column=''Student''><AnyExpression>in.student</AnyExpression></Value><Value column=''Mentor''><AnyExpression>in.mentor</AnyExpression></Value><Value column=''Path''><AnyExpression>in.filePath</AnyExpression></Value></INSERT>' #txt
fs0 f5 dbUrl kipsDB #txt
fs0 f5 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
fs0 f5 lotSize 2147483647 #txt
fs0 f5 startIdx 0 #txt
fs0 f5 type kips.documentUpload.documentUploadData #txt
fs0 f5 488 138 112 44 0 -8 #rect
fs0 f5 @|DBStepIcon #fIcon
fs0 f8 expr out #txt
fs0 f8 440 160 488 160 #arcP
fs0 f11 expr out #txt
fs0 f11 600 160 699 160 #arcP
>Proto fs0 .type kips.documentUpload.documentUploadData #txt
>Proto fs0 .processKind HTML_DIALOG #txt
>Proto fs0 -8 -8 16 16 16 26 #rect
>Proto fs0 '' #fIcon
fs0 f0 mainOut f2 tail #connect
fs0 f2 head f1 mainIn #connect
fs0 f6 mainOut f15 tail #connect
fs0 f15 head f9 mainIn #connect
fs0 f9 mainOut f10 tail #connect
fs0 f10 head f12 mainIn #connect
fs0 f3 mainOut f7 tail #connect
fs0 f7 head f14 mainIn #connect
fs0 f14 mainOut f16 tail #connect
fs0 f16 head f13 mainIn #connect
fs0 f13 mainOut f8 tail #connect
fs0 f8 head f5 mainIn #connect
fs0 f5 mainOut f11 tail #connect
fs0 f11 head f4 mainIn #connect
