[Ivy]
[>Created: Wed Jul 30 18:38:26 ICT 2014]
14781B80BD0D72B9 3.17 #module
>Proto >Proto Collection #zClass
sr0 showError Big #zClass
sr0 B #cInfo
sr0 #process
sr0 @TextInP .resExport .resExport #zField
sr0 @TextInP .type .type #zField
sr0 @TextInP .processKind .processKind #zField
sr0 @AnnotationInP-0n ai ai #zField
sr0 @MessageFlowInP-0n messageIn messageIn #zField
sr0 @MessageFlowOutP-0n messageOut messageOut #zField
sr0 @TextInP .xml .xml #zField
sr0 @TextInP .responsibility .responsibility #zField
sr0 @StartSub f0 '' #zField
sr0 @EndSub f1 '' #zField
sr0 @RichDialog f3 '' #zField
sr0 @PushWFArc f2 '' #zField
sr0 @Alternative f5 '' #zField
sr0 @PushWFArc f6 '' #zField
sr0 @PushWFArc f4 '' #zField
sr0 @PushWFArc f7 '' #zField
>Proto sr0 sr0 showError #zField
sr0 f0 inParamDecl '<java.lang.Exception exception> param;' #txt
sr0 f0 inParamTable 'out.exception=param.exception;
' #txt
sr0 f0 outParamDecl '<> result;
' #txt
sr0 f0 actionDecl 'ch.ivyteam.ivy.admin.tool.process.ShowError out;
' #txt
sr0 f0 callSignature showError(java.lang.Exception) #txt
sr0 f0 type ch.ivyteam.ivy.admin.tool.process.ShowError #txt
sr0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showError(Exception)</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
sr0 f0 147 83 26 26 14 0 #rect
sr0 f0 @|StartSubIcon #fIcon
sr0 f1 type ch.ivyteam.ivy.admin.tool.process.ShowError #txt
sr0 f1 147 339 26 26 14 0 #rect
sr0 f1 @|EndSubIcon #fIcon
sr0 f3 targetWindow NEW:card: #txt
sr0 f3 targetDisplay TOP #txt
sr0 f3 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDialog #txt
sr0 f3 startMethod showError(java.lang.Throwable,Boolean,Boolean) #txt
sr0 f3 type ch.ivyteam.ivy.admin.tool.process.ShowError #txt
sr0 f3 requestActionDecl '<java.lang.Throwable error, Boolean showCopyButton, Boolean showDetailButton> param;' #txt
sr0 f3 requestMappingAction 'param.error=in.exception;
param.showCopyButton=true;
param.showDetailButton=true;
' #txt
sr0 f3 responseActionDecl 'ch.ivyteam.ivy.admin.tool.process.ShowError out;
' #txt
sr0 f3 responseMappingAction 'out=in;
' #txt
sr0 f3 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/dialogTitle/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
sr0 f3 isAsynch false #txt
sr0 f3 isInnerRd false #txt
sr0 f3 userContext '* ' #txt
sr0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>call error dialog</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
sr0 f3 142 244 36 24 20 -2 #rect
sr0 f3 @|RichDialogIcon #fIcon
sr0 f2 expr out #txt
sr0 f2 160 268 160 339 #arcP
sr0 f5 type ch.ivyteam.ivy.admin.tool.process.ShowError #txt
sr0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has any exception?</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
sr0 f5 146 146 28 28 14 0 #rect
sr0 f5 @|AlternativeIcon #fIcon
sr0 f6 expr out #txt
sr0 f6 160 109 160 146 #arcP
sr0 f4 expr in #txt
sr0 f4 outCond 'in.#exception is initialized && !in.#exception.getMessage().isEmpty()' #txt
sr0 f4 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>YES</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
sr0 f4 160 174 160 244 #arcP
sr0 f7 expr in #txt
sr0 f7 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>NO</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
sr0 f7 146 160 147 352 #arcP
sr0 f7 1 80 160 #addKink
sr0 f7 2 80 352 #addKink
sr0 f7 1 0.5026041666666666 0 0 #arcLabel
>Proto sr0 .type ch.ivyteam.ivy.admin.tool.process.ShowError #txt
>Proto sr0 .processKind CALLABLE_SUB #txt
>Proto sr0 0 0 32 24 18 0 #rect
>Proto sr0 @|BIcon #fIcon
sr0 f3 mainOut f2 tail #connect
sr0 f2 head f1 mainIn #connect
sr0 f0 mainOut f6 tail #connect
sr0 f6 head f5 in #connect
sr0 f5 out f4 tail #connect
sr0 f4 head f3 mainIn #connect
sr0 f5 out f7 tail #connect
sr0 f7 head f1 mainIn #connect
