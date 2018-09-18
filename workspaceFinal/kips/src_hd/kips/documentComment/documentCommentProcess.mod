[Ivy]
[>Created: Thu Apr 06 14:13:44 CEST 2017]
15B4D4D920BF180F 3.19 #module
>Proto >Proto Collection #zClass
fs0 documentCommentProcess Big #zClass
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
>Proto fs0 fs0 documentCommentProcess #zField
fs0 f0 guid 15AD72BEE58B55CB #txt
fs0 f0 type kips.documentComment.documentCommentData #txt
fs0 f0 method start(kips.Document,kips.Comment) #txt
fs0 f0 disableUIEvents true #txt
fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Document upload,kips.Comment kommentar> param = methodEvent.getInputArguments();
' #txt
fs0 f0 outParameterDecl '<kips.Document upload,kips.Comment kommentar> result;
' #txt
fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Upload)</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fs0 f0 83 51 26 26 -36 15 #rect
fs0 f0 @|RichDialogInitStartIcon #fIcon
fs0 f1 type kips.documentComment.documentCommentData #txt
fs0 f1 211 51 26 26 0 12 #rect
fs0 f1 @|RichDialogProcessEndIcon #fIcon
fs0 f2 expr out #txt
fs0 f2 109 64 211 64 #arcP
fs0 f3 guid 15AD72BEE7924258 #txt
fs0 f3 type kips.documentComment.documentCommentData #txt
fs0 f3 actionDecl 'kips.documentComment.documentCommentData out;
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
fs0 f4 type kips.documentComment.documentCommentData #txt
fs0 f4 guid 15AD72BEE7AE5D9C #txt
fs0 f4 211 147 26 26 0 12 #rect
fs0 f4 @|RichDialogEndIcon #fIcon
fs0 f5 expr out #txt
fs0 f5 109 160 211 160 #arcP
>Proto fs0 .type kips.documentComment.documentCommentData #txt
>Proto fs0 .processKind HTML_DIALOG #txt
>Proto fs0 -8 -8 16 16 16 26 #rect
>Proto fs0 '' #fIcon
fs0 f0 mainOut f2 tail #connect
fs0 f2 head f1 mainIn #connect
fs0 f3 mainOut f5 tail #connect
fs0 f5 head f4 mainIn #connect
