[Ivy]
[>Created: Mon Jun 12 17:16:22 CEST 2017]
15BB8E9D72A3A22B 3.20 #module
>Proto >Proto Collection #zClass
Ds0 DeleteDocumentProcess Big #zClass
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
Ds0 @RichDialogProcessStart f3 '' #zField
Ds0 @PushWFArc f5 '' #zField
Ds0 @RichDialogEnd f4 '' #zField
Ds0 @RichDialogMethodStart f6 '' #zField
Ds0 @DBStep f9 '' #zField
Ds0 @RichDialogEnd f7 '' #zField
Ds0 @PushWFArc f11 '' #zField
Ds0 @PushWFArc f8 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogMethodStart f18 '' #zField
Ds0 @RichDialogProcessEnd f17 '' #zField
Ds0 @GridStep f12 '' #zField
Ds0 @RichDialogProcessEnd f14 '' #zField
Ds0 @RichDialogMethodStart f10 '' #zField
Ds0 @GridStep f16 '' #zField
Ds0 @PushWFArc f13 '' #zField
Ds0 @PushWFArc f20 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @PushWFArc f15 '' #zField
>Proto Ds0 Ds0 DeleteDocumentProcess #zField
Ds0 f0 guid 15BB8E9D744DF49F #txt
Ds0 f0 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f0 method start(kips.Data) #txt
Ds0 f0 disableUIEvents true #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Data Data> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.Data=param.Data;
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(data)</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f0 83 51 26 26 -28 15 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f1 227 51 26 26 0 12 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f3 guid 15BB8E9D75083D25 #txt
Ds0 f3 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f3 actionDecl 'kips.DeleteDocument.DeleteDocumentData out;
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
Ds0 f5 expr out #txt
Ds0 f5 109 160 211 160 #arcP
Ds0 f4 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f4 guid 15BB8E9D7508E8C5 #txt
Ds0 f4 211 147 26 26 0 12 #rect
Ds0 f4 @|RichDialogEndIcon #fIcon
Ds0 f6 guid 15BB9025B9F321E1 #txt
Ds0 f6 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f6 method delete(Record) #txt
Ds0 f6 disableUIEvents false #txt
Ds0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record document> param = methodEvent.getInputArguments();
' #txt
Ds0 f6 inParameterMapAction 'out.Data.document.did=param.document.getField("DID").toNumber();
out.Data.document.document=param.document;
' #txt
Ds0 f6 outParameterDecl '<> result;
' #txt
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete(documentt)</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f6 92 267 24 24 -50 14 #rect
Ds0 f6 @|RichDialogMethodStartIcon #fIcon
Ds0 f9 actionDecl 'kips.DeleteDocument.DeleteDocumentData out;
' #txt
Ds0 f9 actionTable 'out=in;
' #txt
Ds0 f9 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE DELETE SYSTEM  ""sqlStatements.dtd"">
<DELETE><Table name=''document''/><Condition><Relation kind=''=''><Column name=''DID''/><AnyExpression>in.Data.document.did</AnyExpression></Relation></Condition></DELETE>' #txt
Ds0 f9 dbUrl kipsDB #txt
Ds0 f9 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Ds0 f9 dbWizard 'DID = in.Data.document.did' #txt
Ds0 f9 lotSize 2147483647 #txt
Ds0 f9 startIdx 0 #txt
Ds0 f9 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Delete document</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f9 170 257 112 44 -47 -8 #rect
Ds0 f9 @|DBStepIcon #fIcon
Ds0 f7 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f7 guid 15B153E242987221 #txt
Ds0 f7 347 266 26 26 0 12 #rect
Ds0 f7 @|RichDialogEndIcon #fIcon
Ds0 f11 expr out #txt
Ds0 f11 116 279 170 279 #arcP
Ds0 f11 0 0.4999999999999999 0 0 #arcLabel
Ds0 f8 expr out #txt
Ds0 f8 282 279 347 279 #arcP
Ds0 f2 expr out #txt
Ds0 f2 109 64 227 64 #arcP
Ds0 f18 guid 15C8D69F3FF99FAE #txt
Ds0 f18 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f18 method downloadMentor(Record) #txt
Ds0 f18 disableUIEvents false #txt
Ds0 f18 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record mentorFile> param = methodEvent.getInputArguments();
' #txt
Ds0 f18 inParameterMapAction 'out.Data.document.document=param.mentorFile;
' #txt
Ds0 f18 outParameterDecl '<> result;
' #txt
Ds0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>downloadMentor(document)</name>
        <nameStyle>24,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f18 81 443 26 26 -77 15 #rect
Ds0 f18 @|RichDialogMethodStartIcon #fIcon
Ds0 f17 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f17 394 444 26 26 0 12 #rect
Ds0 f17 @|RichDialogProcessEndIcon #fIcon
Ds0 f12 actionDecl 'kips.DeleteDocument.DeleteDocumentData out;
' #txt
Ds0 f12 actionTable 'out=in;
' #txt
Ds0 f12 actionCode 'import java.io.FileInputStream;
import java.io.InputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

InputStream stream;
stream = new FileInputStream(in.Data.document.document.getField("Path").toString());
in.data.document.fileDownload = new DefaultStreamedContent(stream, "text/txt", in.Data.document.document.getField("Name").toString());

' #txt
Ds0 f12 security system #txt
Ds0 f12 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set file path for download</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f12 189 353 144 44 -68 -8 #rect
Ds0 f12 @|StepIcon #fIcon
Ds0 f14 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f14 392 362 26 26 0 12 #rect
Ds0 f14 @|RichDialogProcessEndIcon #fIcon
Ds0 f10 guid 15C8D69F4009E126 #txt
Ds0 f10 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f10 method downloadStudent(Record) #txt
Ds0 f10 disableUIEvents false #txt
Ds0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record studentFile> param = methodEvent.getInputArguments();
' #txt
Ds0 f10 inParameterMapAction 'out.Data.document.document=param.studentFile;
' #txt
Ds0 f10 outParameterDecl '<> result;
' #txt
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>downloadStudent(document)</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f10 79 361 26 26 -79 15 #rect
Ds0 f10 @|RichDialogMethodStartIcon #fIcon
Ds0 f16 actionDecl 'kips.DeleteDocument.DeleteDocumentData out;
' #txt
Ds0 f16 actionTable 'out=in;
' #txt
Ds0 f16 actionCode 'import java.io.FileInputStream;
import java.io.InputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

InputStream stream;
stream = new FileInputStream(in.Data.document.document.getField("Path").toString());
in.data.document.fileDownload = new DefaultStreamedContent(stream, "text/txt", in.Data.document.document.getField("filename").toString());
' #txt
Ds0 f16 security system #txt
Ds0 f16 type kips.DeleteDocument.DeleteDocumentData #txt
Ds0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set file path for download</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f16 191 435 144 44 -68 -8 #rect
Ds0 f16 @|StepIcon #fIcon
Ds0 f13 expr out #txt
Ds0 f13 104 374 189 375 #arcP
Ds0 f20 expr out #txt
Ds0 f20 335 457 394 457 #arcP
Ds0 f19 expr out #txt
Ds0 f19 106 456 191 457 #arcP
Ds0 f15 expr out #txt
Ds0 f15 333 375 392 375 #arcP
>Proto Ds0 .type kips.DeleteDocument.DeleteDocumentData #txt
>Proto Ds0 .processKind HTML_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f3 mainOut f5 tail #connect
Ds0 f5 head f4 mainIn #connect
Ds0 f6 mainOut f11 tail #connect
Ds0 f11 head f9 mainIn #connect
Ds0 f9 mainOut f8 tail #connect
Ds0 f8 head f7 mainIn #connect
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f10 mainOut f13 tail #connect
Ds0 f13 head f12 mainIn #connect
Ds0 f12 mainOut f15 tail #connect
Ds0 f15 head f14 mainIn #connect
Ds0 f18 mainOut f19 tail #connect
Ds0 f19 head f16 mainIn #connect
Ds0 f16 mainOut f20 tail #connect
Ds0 f20 head f17 mainIn #connect
