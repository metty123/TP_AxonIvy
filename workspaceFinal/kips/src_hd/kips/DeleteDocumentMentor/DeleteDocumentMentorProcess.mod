[Ivy]
[>Created: Mon Jun 12 17:36:30 CEST 2017]
15C8D31D7666449D 3.20 #module
>Proto >Proto Collection #zClass
Ds0 DeleteDocumentMentorProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogProcessStart f3 '' #zField
Ds0 @RichDialogEnd f4 '' #zField
Ds0 @PushWFArc f5 '' #zField
Ds0 @RichDialogProcessEnd f14 '' #zField
Ds0 @RichDialogEnd f7 '' #zField
Ds0 @RichDialogMethodStart f6 '' #zField
Ds0 @DBStep f9 '' #zField
Ds0 @GridStep f12 '' #zField
Ds0 @RichDialogMethodStart f10 '' #zField
Ds0 @PushWFArc f13 '' #zField
Ds0 @PushWFArc f11 '' #zField
Ds0 @PushWFArc f15 '' #zField
Ds0 @GridStep f16 '' #zField
Ds0 @RichDialogProcessEnd f17 '' #zField
Ds0 @RichDialogMethodStart f18 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @PushWFArc f20 '' #zField
Ds0 @PushWFArc f8 '' #zField
>Proto Ds0 Ds0 DeleteDocumentMentorProcess #zField
Ds0 f0 guid 15C8D31D7A4B8987 #txt
Ds0 f0 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f0 method start(kips.Data) #txt
Ds0 f0 disableUIEvents true #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Data data> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.data=param.data;
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Data)</name>
    </language>
</elementInfo>
' #txt
Ds0 f0 83 51 26 26 -29 15 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f1 211 51 26 26 0 12 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 109 64 211 64 #arcP
Ds0 f3 guid 15C8D31D7C512B5B #txt
Ds0 f3 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f3 actionDecl 'kips.DeleteDocumentMentor.DeleteDocumentMentorData out;
' #txt
Ds0 f3 actionTable 'out=in;
' #txt
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Ds0 f3 83 147 26 26 -15 12 #rect
Ds0 f3 @|RichDialogProcessStartIcon #fIcon
Ds0 f4 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f4 guid 15C8D31D7C7B7C5C #txt
Ds0 f4 211 147 26 26 0 12 #rect
Ds0 f4 @|RichDialogEndIcon #fIcon
Ds0 f5 expr out #txt
Ds0 f5 109 160 211 160 #arcP
Ds0 f14 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f14 389 341 26 26 0 12 #rect
Ds0 f14 @|RichDialogProcessEndIcon #fIcon
Ds0 f7 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f7 guid 15B153E242987221 #txt
Ds0 f7 388 235 26 26 0 12 #rect
Ds0 f7 @|RichDialogEndIcon #fIcon
Ds0 f6 guid 15C8D350067FD1AF #txt
Ds0 f6 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f6 method delete(Record) #txt
Ds0 f6 disableUIEvents false #txt
Ds0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record mentorFile> param = methodEvent.getInputArguments();
' #txt
Ds0 f6 inParameterMapAction 'out.data.document.did=param.mentorFile.getField("NID").toNumber();
out.data.document.document=param.mentorFile;
' #txt
Ds0 f6 outParameterDecl '<> result;
' #txt
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete(mentorFile)</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f6 85 236 24 24 -50 14 #rect
Ds0 f6 @|RichDialogMethodStartIcon #fIcon
Ds0 f9 actionDecl 'kips.DeleteDocumentMentor.DeleteDocumentMentorData out;
' #txt
Ds0 f9 actionTable 'out=in;
' #txt
Ds0 f9 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE DELETE SYSTEM  ""sqlStatements.dtd"">
<DELETE><Table name=''notification''/><Condition><Relation kind=''=''><Column name=''NID''/><AnyExpression>in.Data.document.did</AnyExpression></Relation></Condition></DELETE>' #txt
Ds0 f9 dbUrl kipsDB #txt
Ds0 f9 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Ds0 f9 dbWizard 'NID = in.Data.document.did' #txt
Ds0 f9 lotSize 2147483647 #txt
Ds0 f9 startIdx 0 #txt
Ds0 f9 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Delete document</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f9 187 226 112 44 -47 -8 #rect
Ds0 f9 @|DBStepIcon #fIcon
Ds0 f12 actionDecl 'kips.DeleteDocumentMentor.DeleteDocumentMentorData out;
' #txt
Ds0 f12 actionTable 'out=in;
' #txt
Ds0 f12 actionCode 'import java.io.FileInputStream;
import java.io.InputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

InputStream stream;
stream = new FileInputStream(in.Data.document.document.getField("Path").toString());
in.data.document.fileDownload = new DefaultStreamedContent(stream, "text/txt", in.Data.document.document.getField("filename").toString());

' #txt
Ds0 f12 security system #txt
Ds0 f12 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set file path for download</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f12 186 332 144 44 -68 -8 #rect
Ds0 f12 @|StepIcon #fIcon
Ds0 f10 guid 15C8D35006828F4C #txt
Ds0 f10 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f10 method downloadMentor(Record) #txt
Ds0 f10 disableUIEvents false #txt
Ds0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record mentorFile> param = methodEvent.getInputArguments();
' #txt
Ds0 f10 inParameterMapAction 'out.data.document.document=param.mentorFile;
' #txt
Ds0 f10 outParameterDecl '<> result;
' #txt
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>downloadMentor(document)</name>
        <nameStyle>24,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f10 76 340 26 26 -77 15 #rect
Ds0 f10 @|RichDialogMethodStartIcon #fIcon
Ds0 f13 expr out #txt
Ds0 f13 101 353 186 354 #arcP
Ds0 f11 expr out #txt
Ds0 f11 109 248 187 248 #arcP
Ds0 f11 0 0.4999999999999999 0 0 #arcLabel
Ds0 f15 expr out #txt
Ds0 f15 330 354 389 354 #arcP
Ds0 f16 actionDecl 'kips.DeleteDocumentMentor.DeleteDocumentMentorData out;
' #txt
Ds0 f16 actionTable 'out=in;
' #txt
Ds0 f16 actionCode 'import java.io.FileInputStream;
import java.io.InputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

InputStream stream;
stream = new FileInputStream(in.Data.document.document.getField("Path").toString());
in.data.document.fileDownload = new DefaultStreamedContent(stream, "text/txt", in.Data.document.document.getField("Name").toString());

' #txt
Ds0 f16 security system #txt
Ds0 f16 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set file path for download</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f16 188 414 144 44 -68 -8 #rect
Ds0 f16 @|StepIcon #fIcon
Ds0 f17 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f17 391 423 26 26 0 12 #rect
Ds0 f17 @|RichDialogProcessEndIcon #fIcon
Ds0 f18 guid 15C8D64177F17274 #txt
Ds0 f18 type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
Ds0 f18 method downloadStudent(Record) #txt
Ds0 f18 disableUIEvents false #txt
Ds0 f18 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record studentFile> param = methodEvent.getInputArguments();
' #txt
Ds0 f18 inParameterMapAction 'out.data.document.document=param.studentFile;
' #txt
Ds0 f18 outParameterDecl '<> result;
' #txt
Ds0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>downloadStudent(document)</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f18 76 428 24 24 -79 15 #rect
Ds0 f18 @|RichDialogMethodStartIcon #fIcon
Ds0 f19 expr out #txt
Ds0 f19 99 439 188 436 #arcP
Ds0 f20 expr out #txt
Ds0 f20 332 436 391 436 #arcP
Ds0 f8 expr out #txt
Ds0 f8 299 248 388 248 #arcP
>Proto Ds0 .type kips.DeleteDocumentMentor.DeleteDocumentMentorData #txt
>Proto Ds0 .processKind HTML_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f3 mainOut f5 tail #connect
Ds0 f5 head f4 mainIn #connect
Ds0 f6 mainOut f11 tail #connect
Ds0 f11 head f9 mainIn #connect
Ds0 f10 mainOut f13 tail #connect
Ds0 f13 head f12 mainIn #connect
Ds0 f12 mainOut f15 tail #connect
Ds0 f15 head f14 mainIn #connect
Ds0 f18 mainOut f19 tail #connect
Ds0 f19 head f16 mainIn #connect
Ds0 f16 mainOut f20 tail #connect
Ds0 f20 head f17 mainIn #connect
Ds0 f9 mainOut f8 tail #connect
Ds0 f8 head f7 mainIn #connect
