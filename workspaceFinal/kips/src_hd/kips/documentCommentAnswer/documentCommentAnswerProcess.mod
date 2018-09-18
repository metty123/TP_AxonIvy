[Ivy]
[>Created: Sat Jun 10 17:39:07 CEST 2017]
15B4D5278B064FE5 3.20 #module
>Proto >Proto Collection #zClass
rs0 documentCommentAnswerProcess Big #zClass
rs0 RD #cInfo
rs0 #process
rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
rs0 @TextInP .resExport .resExport #zField
rs0 @TextInP .type .type #zField
rs0 @TextInP .processKind .processKind #zField
rs0 @AnnotationInP-0n ai ai #zField
rs0 @MessageFlowInP-0n messageIn messageIn #zField
rs0 @MessageFlowOutP-0n messageOut messageOut #zField
rs0 @TextInP .xml .xml #zField
rs0 @TextInP .responsibility .responsibility #zField
rs0 @RichDialogInitStart f0 '' #zField
rs0 @RichDialogProcessEnd f1 '' #zField
rs0 @PushWFArc f2 '' #zField
rs0 @RichDialogProcessStart f3 '' #zField
rs0 @RichDialogEnd f4 '' #zField
rs0 @PushWFArc f5 '' #zField
>Proto rs0 rs0 documentCommentAnswerProcess #zField
rs0 f0 guid 15ADCAC99DF11277 #txt
rs0 f0 type kips.documentCommentAnswer.documentCommentAnswerData #txt
rs0 f0 method start(kips.Document,kips.Comment,kips.User) #txt
rs0 f0 disableUIEvents true #txt
rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Document document,kips.Comment comment,kips.User student> param = methodEvent.getInputArguments();
' #txt
rs0 f0 inParameterMapAction 'out.data.comment.question=param.comment.question;
out.data.document=param.document;
' #txt
rs0 f0 outParameterDecl '<kips.Document document,kips.Comment comment,kips.User student> result;
' #txt
rs0 f0 outParameterMapAction 'result.document=in.data.document;
result.comment.comment=in.data.comment.comment;
' #txt
rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String)</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
rs0 f0 83 51 26 26 -32 15 #rect
rs0 f0 @|RichDialogInitStartIcon #fIcon
rs0 f1 type kips.documentCommentAnswer.documentCommentAnswerData #txt
rs0 f1 211 51 26 26 0 12 #rect
rs0 f1 @|RichDialogProcessEndIcon #fIcon
rs0 f2 expr out #txt
rs0 f2 109 64 211 64 #arcP
rs0 f3 guid 15ADCAC99FE72B09 #txt
rs0 f3 type kips.documentCommentAnswer.documentCommentAnswerData #txt
rs0 f3 actionDecl 'kips.documentCommentAnswer.documentCommentAnswerData out;
' #txt
rs0 f3 actionTable 'out=in;
' #txt
rs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
rs0 f3 83 147 26 26 -15 12 #rect
rs0 f3 @|RichDialogProcessStartIcon #fIcon
rs0 f4 type kips.documentCommentAnswer.documentCommentAnswerData #txt
rs0 f4 guid 15ADCAC99FE8A317 #txt
rs0 f4 211 147 26 26 0 12 #rect
rs0 f4 @|RichDialogEndIcon #fIcon
rs0 f5 expr out #txt
rs0 f5 109 160 211 160 #arcP
>Proto rs0 .type kips.documentCommentAnswer.documentCommentAnswerData #txt
>Proto rs0 .processKind HTML_DIALOG #txt
>Proto rs0 -8 -8 16 16 16 26 #rect
>Proto rs0 '' #fIcon
rs0 f0 mainOut f2 tail #connect
rs0 f2 head f1 mainIn #connect
rs0 f3 mainOut f5 tail #connect
rs0 f5 head f4 mainIn #connect
