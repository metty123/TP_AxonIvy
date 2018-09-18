[Ivy]
[>Created: Wed Apr 19 14:23:17 CEST 2017]
15B7C36A3F388873 3.19 #module
>Proto >Proto Collection #zClass
Pl0 Portal Big #zClass
Pl0 B #cInfo
Pl0 #process
Pl0 @TextInP .resExport .resExport #zField
Pl0 @TextInP .type .type #zField
Pl0 @TextInP .processKind .processKind #zField
Pl0 @AnnotationInP-0n ai ai #zField
Pl0 @MessageFlowInP-0n messageIn messageIn #zField
Pl0 @MessageFlowOutP-0n messageOut messageOut #zField
Pl0 @TextInP .xml .xml #zField
Pl0 @TextInP .responsibility .responsibility #zField
Pl0 @StartRequest f0 '' #zField
Pl0 @RichDialog f1 '' #zField
Pl0 @PushWFArc f2 '' #zField
>Proto Pl0 Pl0 Portal #zField
Pl0 f0 outLink start.ivp #txt
Pl0 f0 type kips.Data #txt
Pl0 f0 inParamDecl '<> param;' #txt
Pl0 f0 actionDecl 'kips.Data out;
' #txt
Pl0 f0 guid 15B7C36A40649D31 #txt
Pl0 f0 requestEnabled true #txt
Pl0 f0 triggerEnabled false #txt
Pl0 f0 callSignature start() #txt
Pl0 f0 persist false #txt
Pl0 f0 startName 'Start Portal' #txt
Pl0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
Pl0 f0 caseData businessCase.attach=true #txt
Pl0 f0 showInStartList 1 #txt
Pl0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Pl0 f0 @C|.responsibility Everybody #txt
Pl0 f0 81 49 30 30 -21 17 #rect
Pl0 f0 @|StartRequestIcon #fIcon
Pl0 f1 targetWindow NEW #txt
Pl0 f1 targetDisplay TOP #txt
Pl0 f1 richDialogId ch.ivy.addon.portal.generic.PortalHome #txt
Pl0 f1 startMethod start() #txt
Pl0 f1 type kips.Data #txt
Pl0 f1 requestActionDecl '<> param;' #txt
Pl0 f1 responseActionDecl 'kips.Data out;
' #txt
Pl0 f1 responseMappingAction 'out=in;
' #txt
Pl0 f1 isAsynch false #txt
Pl0 f1 isInnerRd false #txt
Pl0 f1 userContext '* ' #txt
Pl0 f1 232 42 112 44 0 -8 #rect
Pl0 f1 @|RichDialogIcon #fIcon
Pl0 f2 expr out #txt
Pl0 f2 111 64 232 64 #arcP
>Proto Pl0 .type kips.Data #txt
>Proto Pl0 .processKind NORMAL #txt
>Proto Pl0 0 0 32 24 18 0 #rect
>Proto Pl0 @|BIcon #fIcon
Pl0 f0 mainOut f2 tail #connect
Pl0 f2 head f1 mainIn #connect
