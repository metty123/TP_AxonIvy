[Ivy]
[>Created: Wed Jun 07 04:55:00 CEST 2017]
115D746C75FAF428 3.20 #module
>Proto >Proto Collection #zClass
mn0 main Big #zClass
mn0 B #cInfo
mn0 #process
mn0 @TextInP .xml .xml #zField
mn0 @TextInP .responsibility .responsibility #zField
mn0 @TextInP .resExport .resExport #zField
mn0 @TextInP .type .type #zField
mn0 @TextInP .processKind .processKind #zField
mn0 @MessageFlowInP-0n messageIn messageIn #zField
mn0 @MessageFlowOutP-0n messageOut messageOut #zField
mn0 @AnnotationInP-0n ai ai #zField
mn0 @StartRequest f0 '' #zField
mn0 @RichDialog f1 '' #zField
mn0 @EndTask f3 '' #zField
mn0 @PushWFArc f4 '' #zField
mn0 @GridStep f2 '' #zField
mn0 @PushWFArc f5 '' #zField
mn0 @PushWFArc f6 '' #zField
>Proto mn0 mn0 main #zField
mn0 f0 outLink start1.ivp #txt
mn0 f0 type ivyadmintool.Data #txt
mn0 f0 inParamDecl '<> param;' #txt
mn0 f0 actionDecl 'ivyadmintool.Data out;
' #txt
mn0 f0 requestEnabled true #txt
mn0 f0 triggerEnabled false #txt
mn0 f0 callSignature start1() #txt
mn0 f0 persist false #txt
mn0 f0 startName Admin #txt
mn0 f0 taskData '#
#Thu Jul 31 15:54:42 ICT 2014
TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
.DESC=
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody
.NAM=Admin
' #txt
mn0 f0 caseData '#
#Thu Jul 31 15:54:42 ICT 2014
businessCalendarName=
businessCreator.user=
businessMilestone.timestamp=
businessObject.code=
businessObject.docDb.code=
businessObject.folder.id=
businessObject.name=
businessPriority=
businessStart.timestamp=
case.description=
case.name=
correspondent.id=
mainContact.docDb.code=
mainContact.folder.id=
mainContact.id=
mainContact.name=
mainContact.type=
process.code=
process.name=
processCategory.code=
processCategory.name=
subType.code=
subType.name=
type.code=
type.name=
' #txt
mn0 f0 showInStartList 1 #txt
mn0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start1</name>
        <nameStyle>6,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
mn0 f0 @C|.responsibility Everybody #txt
mn0 f0 67 59 26 26 14 0 #rect
mn0 f0 @|StartRequestIcon #fIcon
mn0 f1 targetWindow NEW:card: #txt
mn0 f1 targetDisplay TOP #txt
mn0 f1 richDialogId ch.ivyteam.ivy.admin.tool.MainWindow #txt
mn0 f1 startMethod start() #txt
mn0 f1 type ivyadmintool.Data #txt
mn0 f1 panelName <%=ivy.cms.co("/Dialogs/general/applicationTitle")%> #txt
mn0 f1 requestActionDecl '<> param;' #txt
mn0 f1 responseActionDecl 'ivyadmintool.Data out;
' #txt
mn0 f1 responseMappingAction 'out=in;
' #txt
mn0 f1 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/applicationTitle\")%>"/width 1000 /height 750 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
mn0 f1 isAsynch false #txt
mn0 f1 isInnerRd false #txt
mn0 f1 isDialog false #txt
mn0 f1 userContext '* ' #txt
mn0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open main window</name>
        <nameStyle>16,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
mn0 f1 62 164 36 24 20 -2 #rect
mn0 f1 @|RichDialogIcon #fIcon
mn0 f3 type ivyadmintool.Data #txt
mn0 f3 67 267 26 26 14 0 #rect
mn0 f3 @|EndIcon #fIcon
mn0 f4 expr out #txt
mn0 f4 80 188 80 267 #arcP
mn0 f2 actionDecl 'ivyadmintool.Data out;
' #txt
mn0 f2 actionTable 'out=in;
' #txt
mn0 f2 actionCode ivy.session.setContentLocale(java.util.Locale.ENGLISH); #txt
mn0 f2 type ivyadmintool.Data #txt
mn0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set english
language</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
mn0 f2 62 108 36 24 20 -2 #rect
mn0 f2 @|StepIcon #fIcon
mn0 f5 expr out #txt
mn0 f5 80 85 80 108 #arcP
mn0 f6 expr out #txt
mn0 f6 80 132 80 164 #arcP
>Proto mn0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Administration</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>225</swimlaneSize>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
</elementInfo>
' #txt
>Proto mn0 .type ivyadmintool.Data #txt
>Proto mn0 .processKind NORMAL #txt
>Proto mn0 0 0 32 24 18 0 #rect
>Proto mn0 @|BIcon #fIcon
mn0 f1 mainOut f4 tail #connect
mn0 f4 head f3 mainIn #connect
mn0 f0 mainOut f5 tail #connect
mn0 f5 head f2 mainIn #connect
mn0 f2 mainOut f6 tail #connect
mn0 f6 head f1 mainIn #connect
