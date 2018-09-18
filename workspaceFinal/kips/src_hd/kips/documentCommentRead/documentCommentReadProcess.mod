[Ivy]
[>Created: Sat Jun 10 17:40:49 CEST 2017]
15B5DD5659DFDAB0 3.20 #module
>Proto >Proto Collection #zClass
ds0 documentCommentReadProcess Big #zClass
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
ds0 @RichDialogInitStart f0 '' #zField
ds0 @RichDialogProcessEnd f1 '' #zField
ds0 @PushWFArc f2 '' #zField
ds0 @RichDialogProcessStart f3 '' #zField
ds0 @RichDialogEnd f4 '' #zField
ds0 @PushWFArc f5 '' #zField
>Proto ds0 ds0 documentCommentReadProcess #zField
ds0 f0 guid 15B5DD565B21EB3E #txt
ds0 f0 type kips.documentCommentRead.documentCommentReadData #txt
ds0 f0 method start(kips.Document,kips.Comment,kips.User) #txt
ds0 f0 disableUIEvents true #txt
ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Document document,kips.Comment comment,kips.User student> param = methodEvent.getInputArguments();
' #txt
ds0 f0 inParameterMapAction 'out.data.comment.comment=param.comment.comment;
out.data.document=param.document;
' #txt
ds0 f0 outParameterDecl '<kips.Document document,kips.Comment comment,kips.User student> result;
' #txt
ds0 f0 outParameterMapAction 'result.document=in.data.document;
result.comment.isQuestionNeeded=in.data.comment.isQuestionNeeded;
result.comment.question=in.data.comment.question;
' #txt
ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Data)</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ds0 f0 83 51 26 26 -29 15 #rect
ds0 f0 @|RichDialogInitStartIcon #fIcon
ds0 f1 type kips.documentCommentRead.documentCommentReadData #txt
ds0 f1 211 51 26 26 0 12 #rect
ds0 f1 @|RichDialogProcessEndIcon #fIcon
ds0 f2 expr out #txt
ds0 f2 109 64 211 64 #arcP
ds0 f3 guid 15B5DD565C0584D8 #txt
ds0 f3 type kips.documentCommentRead.documentCommentReadData #txt
ds0 f3 actionDecl 'kips.documentCommentRead.documentCommentReadData out;
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
ds0 f3 83 147 26 26 -15 12 #rect
ds0 f3 @|RichDialogProcessStartIcon #fIcon
ds0 f4 type kips.documentCommentRead.documentCommentReadData #txt
ds0 f4 guid 15B5DD565C033814 #txt
ds0 f4 211 147 26 26 0 12 #rect
ds0 f4 @|RichDialogEndIcon #fIcon
ds0 f5 expr out #txt
ds0 f5 109 160 211 160 #arcP
>Proto ds0 .type kips.documentCommentRead.documentCommentReadData #txt
>Proto ds0 .processKind HTML_DIALOG #txt
>Proto ds0 -8 -8 16 16 16 26 #rect
>Proto ds0 '' #fIcon
ds0 f0 mainOut f2 tail #connect
ds0 f2 head f1 mainIn #connect
ds0 f3 mainOut f5 tail #connect
ds0 f5 head f4 mainIn #connect
