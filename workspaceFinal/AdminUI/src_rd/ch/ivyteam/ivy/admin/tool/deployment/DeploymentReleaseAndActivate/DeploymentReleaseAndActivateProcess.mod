[Ivy]
[>Created: Tue Jun 23 14:00:00 CEST 2009]
11F3CC216BF6FB67 3.12 #module
>Proto >Proto Collection #zClass
Ds0 DeploymentReleaseAndActivateProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogProcessStart f3 '' #zField
Ds0 @RichDialogProcessStart f5 '' #zField
Ds0 @RichDialogProcessStart f4 '' #zField
Ds0 @RichDialogProcessStart f6 '' #zField
Ds0 @RichDialogProcessStep f7 '' #zField
Ds0 @RichDialogProcessStep f8 '' #zField
Ds0 @RichDialogProcessStep f9 '' #zField
Ds0 @RichDialogProcessStep f10 '' #zField
Ds0 @PushWFArc f11 '' #zField
Ds0 @PushWFArc f12 '' #zField
Ds0 @PushWFArc f13 '' #zField
Ds0 @PushWFArc f14 '' #zField
Ds0 @RichDialogProcessEnd f15 '' #zField
Ds0 @RichDialogProcessEnd f16 '' #zField
Ds0 @RichDialogProcessEnd f17 '' #zField
Ds0 @RichDialogProcessEnd f18 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @PushWFArc f20 '' #zField
Ds0 @PushWFArc f21 '' #zField
Ds0 @PushWFArc f22 '' #zField
Ds0 @RichDialogMethodStart f23 '' #zField
Ds0 @RichDialogProcessEnd f24 '' #zField
Ds0 @PushWFArc f25 '' #zField
Ds0 @RichDialogMethodStart f26 '' #zField
Ds0 @RichDialogProcessEnd f27 '' #zField
Ds0 @RichDialogProcessStep f29 '' #zField
Ds0 @PushWFArc f30 '' #zField
Ds0 @PushWFArc f28 '' #zField
>Proto Ds0 Ds0 DeploymentReleaseAndActivateProcess #zField
Ds0 f0 guid 11F3CC216CEE3DD6 #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f0 method start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModelVersion pmv> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.pmv=param.pmv;
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 embeddedRdInitializations '* ' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModelVersion)</name>
    </language>
</elementInfo>
' #txt
Ds0 f0 90 40 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f1 87 137 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 100 60 100 137 #arcP
Ds0 f3 guid 11F4721408730F47 #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f3 actionTable 'out=in;
' #txt
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>activateApp</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f3 190 38 20 20 13 0 #rect
Ds0 f3 @|RichDialogProcessStartIcon #fIcon
Ds0 f5 guid 11F472153D888539 #txt
Ds0 f5 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f5 actionTable 'out=in;
' #txt
Ds0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>activatePM</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f5 358 38 20 20 13 0 #rect
Ds0 f5 @|RichDialogProcessStartIcon #fIcon
Ds0 f4 guid 11F472171E2F2CB3 #txt
Ds0 f4 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f4 actionTable 'out=in;
' #txt
Ds0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>activatePMV</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f4 182 214 20 20 13 0 #rect
Ds0 f4 @|RichDialogProcessStartIcon #fIcon
Ds0 f6 guid 11F472179BF5D723 #txt
Ds0 f6 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f6 actionTable 'out=in;
' #txt
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>releasePMV</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f6 382 222 20 20 13 0 #rect
Ds0 f6 @|RichDialogProcessStartIcon #fIcon
Ds0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f7 actionTable 'out=in;
' #txt
Ds0 f7 actionCode in.pmv.getApplication().activate(); #txt
Ds0 f7 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f7 182 92 36 24 20 -2 #rect
Ds0 f7 @|RichDialogProcessStepIcon #fIcon
Ds0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f8 actionTable 'out=in;
' #txt
Ds0 f8 actionCode in.pmv.getProcessModel().activate(); #txt
Ds0 f8 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f8 350 92 36 24 20 -2 #rect
Ds0 f8 @|RichDialogProcessStepIcon #fIcon
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f9 actionTable 'out=in;
' #txt
Ds0 f9 actionCode in.pmv.activate(); #txt
Ds0 f9 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f9 174 276 36 24 20 -2 #rect
Ds0 f9 @|RichDialogProcessStepIcon #fIcon
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f10 actionTable 'out=in;
' #txt
Ds0 f10 actionCode in.pmv.release(); #txt
Ds0 f10 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f10 374 276 36 24 20 -2 #rect
Ds0 f10 @|RichDialogProcessStepIcon #fIcon
Ds0 f11 expr out #txt
Ds0 f11 200 58 200 92 #arcP
Ds0 f12 expr out #txt
Ds0 f12 368 58 368 92 #arcP
Ds0 f13 expr out #txt
Ds0 f13 192 234 192 276 #arcP
Ds0 f14 expr out #txt
Ds0 f14 392 242 392 276 #arcP
Ds0 f15 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f15 187 147 26 26 14 0 #rect
Ds0 f15 @|RichDialogProcessEndIcon #fIcon
Ds0 f16 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f16 355 147 26 26 14 0 #rect
Ds0 f16 @|RichDialogProcessEndIcon #fIcon
Ds0 f17 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f17 179 323 26 26 14 0 #rect
Ds0 f17 @|RichDialogProcessEndIcon #fIcon
Ds0 f18 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f18 379 323 26 26 14 0 #rect
Ds0 f18 @|RichDialogProcessEndIcon #fIcon
Ds0 f19 expr out #txt
Ds0 f19 192 300 192 323 #arcP
Ds0 f20 expr out #txt
Ds0 f20 392 300 392 323 #arcP
Ds0 f21 expr out #txt
Ds0 f21 200 116 200 147 #arcP
Ds0 f22 expr out #txt
Ds0 f22 368 116 368 147 #arcP
Ds0 f23 guid 11F4B2505C983C71 #txt
Ds0 f23 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f23 method timer() #txt
Ds0 f23 disableUIEvents false #txt
Ds0 f23 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f23 outParameterDecl '<> result;
' #txt
Ds0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>timer()</name>
    </language>
</elementInfo>
' #txt
Ds0 f23 542 46 20 20 13 0 #rect
Ds0 f23 @|RichDialogMethodStartIcon #fIcon
Ds0 f24 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f24 539 147 26 26 14 0 #rect
Ds0 f24 @|RichDialogProcessEndIcon #fIcon
Ds0 f25 expr out #txt
Ds0 f25 552 66 552 147 #arcP
Ds0 f26 guid 11F6FE7F24A37B74 #txt
Ds0 f26 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f26 method stop() #txt
Ds0 f26 disableUIEvents false #txt
Ds0 f26 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f26 outParameterDecl '<> result;
' #txt
Ds0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>stop()</name>
    </language>
</elementInfo>
' #txt
Ds0 f26 526 222 20 20 13 0 #rect
Ds0 f26 @|RichDialogMethodStartIcon #fIcon
Ds0 f27 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f27 523 315 26 26 14 0 #rect
Ds0 f27 @|RichDialogProcessEndIcon #fIcon
Ds0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f29 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData out;
' #txt
Ds0 f29 actionTable 'out=in;
' #txt
Ds0 f29 actionCode panel.stopPollingTimer(); #txt
Ds0 f29 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
Ds0 f29 518 260 36 24 20 -2 #rect
Ds0 f29 @|RichDialogProcessStepIcon #fIcon
Ds0 f30 expr out #txt
Ds0 f30 536 242 536 260 #arcP
Ds0 f28 expr out #txt
Ds0 f28 536 284 536 315 #arcP
>Proto Ds0 .rdData2UIAction 'panel.applicationActivateButton.enabled=in.pmv.getApplication().getActivityState()!=ch.ivyteam.ivy.application.ActivityState.ACTIVE;
panel.applicationStateLabel.iconUri="/images/24/activity/"+in.pmv.getApplication().getActivityState().intValue();
panel.applicationStateLabel.text=in.pmv.getApplication().getActivityStateText();
panel.pmActivateButton.enabled=in.pmv.getProcessModel().getActivityState()!=ch.ivyteam.ivy.application.ActivityState.ACTIVE;
panel.pmStateLabel.iconUri="/images/24/activity/"+in.pmv.getProcessModel().getActivityState().intValue();
panel.pmStateLabel.text=in.pmv.getProcessModel().getActivityStateText();
panel.pmvActivateButton.enabled=in.pmv.getActivityState()!=ch.ivyteam.ivy.application.ActivityState.ACTIVE;
panel.pmvOperationStateLabel.iconUri="/images/24/activityOperation/"+in.pmv.getActivityOperationState().toString().toLowerCase();
panel.pmvOperationStateLabel.text=in.pmv.getActivityOperationStateText();
panel.pmvStateLabel.iconUri="/images/24/activity/"+in.pmv.getActivityState().intValue();
panel.pmvStateLabel.text=in.pmv.getActivityStateText();
panel.releaseButton.enabled=in.pmv.getReleaseState()!=ch.ivyteam.ivy.application.ReleaseState.DELETED&&in.pmv.getReleaseState()!=ch.ivyteam.ivy.application.ReleaseState.RELEASED;
panel.releaseStateLabel.iconUri="/images/mittel/releaseState/"+in.pmv.getReleaseState().ordinal();
panel.releaseStateLabel.text=in.pmv.getReleaseState().toString();
' #txt
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.deployment.DeploymentReleaseAndActivate.DeploymentReleaseAndActivateData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f3 mainOut f11 tail #connect
Ds0 f11 head f7 mainIn #connect
Ds0 f5 mainOut f12 tail #connect
Ds0 f12 head f8 mainIn #connect
Ds0 f4 mainOut f13 tail #connect
Ds0 f13 head f9 mainIn #connect
Ds0 f6 mainOut f14 tail #connect
Ds0 f14 head f10 mainIn #connect
Ds0 f9 mainOut f19 tail #connect
Ds0 f19 head f17 mainIn #connect
Ds0 f10 mainOut f20 tail #connect
Ds0 f20 head f18 mainIn #connect
Ds0 f7 mainOut f21 tail #connect
Ds0 f21 head f15 mainIn #connect
Ds0 f8 mainOut f22 tail #connect
Ds0 f22 head f16 mainIn #connect
Ds0 f23 mainOut f25 tail #connect
Ds0 f25 head f24 mainIn #connect
Ds0 f26 mainOut f30 tail #connect
Ds0 f30 head f29 mainIn #connect
Ds0 f29 mainOut f28 tail #connect
Ds0 f28 head f27 mainIn #connect
