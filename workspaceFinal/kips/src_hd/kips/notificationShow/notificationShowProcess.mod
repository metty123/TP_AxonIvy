[Ivy]
[>Created: Sat Jun 10 17:32:23 CEST 2017]
15B61CF331068572 3.20 #module
>Proto >Proto Collection #zClass
fs0 notificationShowProcess Big #zClass
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
fs0 @PushWFArc f5 '' #zField
fs0 @GridStep f11 '' #zField
fs0 @RichDialogProcessEnd f14 '' #zField
fs0 @RichDialogProcessStart f8 '' #zField
fs0 @PushWFArc f20 '' #zField
fs0 @PushWFArc f19 '' #zField
>Proto fs0 fs0 notificationShowProcess #zField
fs0 f0 guid 15A98EA81F76E55E #txt
fs0 f0 type kips.notificationShow.notificationShowData #txt
fs0 f0 method start(kips.Document,String,kips.searchUser,kips.Comment) #txt
fs0 f0 disableUIEvents true #txt
fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Document document,java.lang.String message,kips.searchUser searchUser,kips.Comment comment> param = methodEvent.getInputArguments();
' #txt
fs0 f0 inParameterMapAction 'out.data.comment=param.comment;
out.data.document=param.document;
out.data.message=param.message;
out.data.searchUser.searchText=param.searchUser.searchText;
' #txt
fs0 f0 outParameterDecl '<kips.Document document,kips.Comment comment,java.lang.String message,kips.User student> result;
' #txt
fs0 f0 outParameterMapAction 'result.comment=in.data.comment;
result.student=in.data.user;
result.student.student=ivy.session.getSessionUser();
' #txt
fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Data)</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f0 83 51 26 26 -29 15 #rect
fs0 f0 @|RichDialogInitStartIcon #fIcon
fs0 f1 type kips.notificationShow.notificationShowData #txt
fs0 f1 211 51 26 26 0 12 #rect
fs0 f1 @|RichDialogProcessEndIcon #fIcon
fs0 f2 expr out #txt
fs0 f2 109 64 211 64 #arcP
fs0 f3 guid 15A98EA8219E5A4D #txt
fs0 f3 type kips.notificationShow.notificationShowData #txt
fs0 f3 actionDecl 'kips.notificationShow.notificationShowData out;
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
fs0 f4 type kips.notificationShow.notificationShowData #txt
fs0 f4 guid 15A98EA821A7A680 #txt
fs0 f4 211 147 26 26 0 12 #rect
fs0 f4 @|RichDialogEndIcon #fIcon
fs0 f5 expr out #txt
fs0 f5 109 160 211 160 #arcP
fs0 f11 actionDecl 'kips.notificationShow.notificationShowData out;
' #txt
fs0 f11 actionTable 'out=in;
' #txt
fs0 f11 actionCode 'import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

InputStream stream;

stream = new FileInputStream(in.data.document.filePath);
in.data.document.fileDownload = new DefaultStreamedContent(stream, "text/txt", in.data.document.fileName);



' #txt
fs0 f11 type kips.notificationShow.notificationShowData #txt
fs0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set file path for download</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f11 204 255 144 44 -68 -8 #rect
fs0 f11 @|StepIcon #fIcon
fs0 f14 type kips.notificationShow.notificationShowData #txt
fs0 f14 407 264 26 26 0 12 #rect
fs0 f14 @|RichDialogProcessEndIcon #fIcon
fs0 f8 guid 15A98EB235E7C8AB #txt
fs0 f8 type kips.notificationShow.notificationShowData #txt
fs0 f8 actionDecl 'kips.notificationShow.notificationShowData out;
' #txt
fs0 f8 actionTable 'out=in;
' #txt
fs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>fileDownload</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f8 87 264 26 26 -36 15 #rect
fs0 f8 @|RichDialogProcessStartIcon #fIcon
fs0 f20 expr out #txt
fs0 f20 348 277 407 277 #arcP
fs0 f19 expr out #txt
fs0 f19 113 277 204 277 #arcP
>Proto fs0 .type kips.notificationShow.notificationShowData #txt
>Proto fs0 .processKind HTML_DIALOG #txt
>Proto fs0 -8 -8 16 16 16 26 #rect
>Proto fs0 '' #fIcon
fs0 f0 mainOut f2 tail #connect
fs0 f2 head f1 mainIn #connect
fs0 f3 mainOut f5 tail #connect
fs0 f5 head f4 mainIn #connect
fs0 f8 mainOut f19 tail #connect
fs0 f19 head f11 mainIn #connect
fs0 f11 mainOut f20 tail #connect
fs0 f20 head f14 mainIn #connect
