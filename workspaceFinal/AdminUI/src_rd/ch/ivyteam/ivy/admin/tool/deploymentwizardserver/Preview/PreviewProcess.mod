[Ivy]
[>Created: Thu Mar 19 09:24:43 ICT 2015]
13C6FE00FB0110F7 3.17 #module
>Proto >Proto Collection #zClass
Ps0 PreviewProcess Big #zClass
Ps0 RD #cInfo
Ps0 #process
Ps0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ps0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ps0 @TextInP .resExport .resExport #zField
Ps0 @TextInP .type .type #zField
Ps0 @TextInP .processKind .processKind #zField
Ps0 @AnnotationInP-0n ai ai #zField
Ps0 @TextInP .xml .xml #zField
Ps0 @TextInP .responsibility .responsibility #zField
Ps0 @RichDialogInitStart f0 '' #zField
Ps0 @RichDialogProcessEnd f1 '' #zField
Ps0 @PushWFArc f2 '' #zField
Ps0 @RichDialogMethodStart f3 '' #zField
Ps0 @RichDialogProcessEnd f4 '' #zField
Ps0 @PushWFArc f5 '' #zField
Ps0 @RichDialogMethodStart f6 '' #zField
Ps0 @RichDialogFireEvent f7 '' #zField
Ps0 @PushWFArc f8 '' #zField
Ps0 @PushWFArc f9 '' #zField
Ps0 @RichDialogMethodStart f10 '' #zField
Ps0 @PushWFArc f11 '' #zField
Ps0 @RichDialogMethodStart f12 '' #zField
Ps0 @RichDialogProcessEnd f13 '' #zField
Ps0 @RichDialogProcessStep f14 '' #zField
Ps0 @PushWFArc f15 '' #zField
Ps0 @PushWFArc f16 '' #zField
>Proto Ps0 Ps0 PreviewProcess #zField
Ps0 f0 guid 139D819851CDC1A5 #txt
Ps0 f0 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f0 method start() #txt
Ps0 f0 disableUIEvents true #txt
Ps0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f0 outParameterDecl '<> result;
' #txt
Ps0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ps0 f0 86 54 20 20 13 0 #rect
Ps0 f0 @|RichDialogInitStartIcon #fIcon
Ps0 f1 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f1 86 254 20 20 13 0 #rect
Ps0 f1 @|RichDialogProcessEndIcon #fIcon
Ps0 f2 expr out #txt
Ps0 f2 96 74 96 254 #arcP
Ps0 f3 guid 139E15A925F8DBDC #txt
Ps0 f3 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f3 method setProjectsToDeploy(List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo>) #txt
Ps0 f3 disableUIEvents false #txt
Ps0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectsToDeploy> param = methodEvent.getInputArguments();
' #txt
Ps0 f3 inActionCode 'out.projectToDeploy.clear();
out.projectToDeploy.addAll(param.projectsToDeploy);' #txt
Ps0 f3 outParameterDecl '<> result;
' #txt
Ps0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setProjectsToDeploy(List&lt;ProjectInfo&gt;)</name>
        <nameStyle>38,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f3 478 54 20 20 13 0 #rect
Ps0 f3 @|RichDialogMethodStartIcon #fIcon
Ps0 f4 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f4 478 254 20 20 13 0 #rect
Ps0 f4 @|RichDialogProcessEndIcon #fIcon
Ps0 f5 expr out #txt
Ps0 f5 488 74 488 254 #arcP
Ps0 f6 guid 13A24D16BFE59BB8 #txt
Ps0 f6 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f6 method previousBtnClicked() #txt
Ps0 f6 disableUIEvents false #txt
Ps0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f6 outParameterDecl '<> result;
' #txt
Ps0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>previousBtnClicked()</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f6 614 102 20 20 13 0 #rect
Ps0 f6 @|RichDialogMethodStartIcon #fIcon
Ps0 f7 actionCode panel.fireIsPreviewFinished(); #txt
Ps0 f7 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f7 fireEvent isPreviewFinished() #txt
Ps0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>fire event is preview finished</name>
        <nameStyle>30
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f7 606 164 36 24 20 -2 #rect
Ps0 f7 @|RichDialogFireEventIcon #fIcon
Ps0 f8 expr out #txt
Ps0 f8 624 122 624 164 #arcP
Ps0 f9 expr out #txt
Ps0 f9 624 188 498 264 #arcP
Ps0 f9 1 624 264 #addKink
Ps0 f9 1 0.16558994443666053 0 0 #arcLabel
Ps0 f10 guid 13CB8FF9865AE9C7 #txt
Ps0 f10 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f10 method getProjectToDeploy() #txt
Ps0 f10 disableUIEvents false #txt
Ps0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f10 outParameterDecl '<List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectToDeploy> result;
' #txt
Ps0 f10 outActionCode result.projectToDeploy.addAll(in.projectToDeploy); #txt
Ps0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getProjectToDeploy()</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f10 806 54 20 20 13 0 #rect
Ps0 f10 @|RichDialogMethodStartIcon #fIcon
Ps0 f11 expr out #txt
Ps0 f11 816 74 498 264 #arcP
Ps0 f11 1 816 264 #addKink
Ps0 f11 1 0.17007071543634839 0 0 #arcLabel
Ps0 f12 guid 14C2CC683E1CA206 #txt
Ps0 f12 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f12 method reset() #txt
Ps0 f12 disableUIEvents false #txt
Ps0 f12 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f12 outParameterDecl '<> result;
' #txt
Ps0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>reset()</name>
    </language>
</elementInfo>
' #txt
Ps0 f12 341 53 22 22 14 0 #rect
Ps0 f12 @|RichDialogMethodStartIcon #fIcon
Ps0 f13 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f13 341 253 22 22 14 0 #rect
Ps0 f13 @|RichDialogProcessEndIcon #fIcon
Ps0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData out;
' #txt
Ps0 f14 actionTable 'out=in = null;
' #txt
Ps0 f14 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
Ps0 f14 334 164 36 24 20 -2 #rect
Ps0 f14 @|RichDialogProcessStepIcon #fIcon
Ps0 f15 expr out #txt
Ps0 f15 352 75 352 164 #arcP
Ps0 f16 expr out #txt
Ps0 f16 352 188 352 253 #arcP
>Proto Ps0 .rdData2UIAction 'panel.tblContentDetail.listData=in.projectToDeploy;
' #txt
>Proto Ps0 .type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.Preview.PreviewData #txt
>Proto Ps0 .processKind RICH_DIALOG #txt
>Proto Ps0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>start</swimlaneLabel>
        <swimlaneLabel>method</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>256</swimlaneSize>
    <swimlaneSize>712</swimlaneSize>
    <swimlaneColor>-3342337</swimlaneColor>
    <swimlaneColor>-39271</swimlaneColor>
</elementInfo>
' #txt
>Proto Ps0 -8 -8 16 16 16 26 #rect
>Proto Ps0 '' #fIcon
Ps0 f0 mainOut f2 tail #connect
Ps0 f2 head f1 mainIn #connect
Ps0 f3 mainOut f5 tail #connect
Ps0 f5 head f4 mainIn #connect
Ps0 f6 mainOut f8 tail #connect
Ps0 f8 head f7 mainIn #connect
Ps0 f7 mainOut f9 tail #connect
Ps0 f9 head f4 mainIn #connect
Ps0 f10 mainOut f11 tail #connect
Ps0 f11 head f4 mainIn #connect
Ps0 f12 mainOut f15 tail #connect
Ps0 f15 head f14 mainIn #connect
Ps0 f14 mainOut f16 tail #connect
Ps0 f16 head f13 mainIn #connect
