[Ivy]
[>Created: Wed Jun 24 09:41:31 CEST 2009]
11F271A5FB93C9D6 3.12 #module
>Proto >Proto Collection #zClass
Ds0 DeploymentProgressProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @RichDialogProcessStart f5 '' #zField
Ds0 @RichDialog f6 '' #zField
Ds0 @RichDialogProcessEnd f7 '' #zField
Ds0 @PushWFArc f8 '' #zField
Ds0 @PushWFArc f9 '' #zField
Ds0 @RichDialogMethodStart f10 '' #zField
Ds0 @RichDialogProcessEnd f11 '' #zField
Ds0 @RichDialogProcessStep f13 '' #zField
Ds0 @PushWFArc f14 '' #zField
Ds0 @PushWFArc f12 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogMethodStart f3 '' #zField
Ds0 @RichDialogProcessEnd f4 '' #zField
Ds0 @Alternative f16 '' #zField
Ds0 @RichDialogProcessStep f18 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @PushWFArc f15 '' #zField
Ds0 @RichDialogProcessStep f20 '' #zField
Ds0 @PushWFArc f17 '' #zField
Ds0 @PushWFArc f21 '' #zField
Ds0 @RichDialogFireEvent f23 '' #zField
Ds0 @PushWFArc f22 '' #zField
Ds0 @PushWFArc f24 '' #zField
Ds0 @RichDialogMethodStart f25 '' #zField
Ds0 @RichDialogProcessEnd f26 '' #zField
Ds0 @PushWFArc f27 '' #zField
Ds0 @RichDialogMethodStart f28 '' #zField
Ds0 @RichDialogProcessStep f29 '' #zField
Ds0 @RichDialogProcessEnd f30 '' #zField
Ds0 @PushWFArc f31 '' #zField
Ds0 @PushWFArc f32 '' #zField
>Proto Ds0 Ds0 DeploymentProgressProcess #zField
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModelVersion)</name>
    </language>
</elementInfo>
' #txt
Ds0 f0 guid 11F271A5FE898D98 #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f0 method start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.pmv=param.processModelVersion;
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 embeddedRdInitializations '* ' #txt
Ds0 f0 90 40 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f1 87 137 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f5 guid 11F27F25365B6B69 #txt
Ds0 f5 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData out;
' #txt
Ds0 f5 actionTable 'out=in;
' #txt
Ds0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showError</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f5 86 230 20 20 13 0 #rect
Ds0 f5 @|RichDialogProcessStartIcon #fIcon
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f6 targetWindow NEW #txt
Ds0 f6 targetDisplay TOP #txt
Ds0 f6 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDetailDialog #txt
Ds0 f6 startMethod showDetailError(java.lang.Throwable) #txt
Ds0 f6 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f6 requestActionDecl '<java.lang.Throwable error> param;' #txt
Ds0 f6 requestMappingAction 'param.error=in.deployer.getError();
' #txt
Ds0 f6 responseActionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData out;
' #txt
Ds0 f6 responseMappingAction 'out=in;
' #txt
Ds0 f6 windowConfiguration '#Thu Feb 05 15:29:13 CET 2009
height=400
maximized=false
centered=true
close_after_last_rd=true
resizable=true
width=300
title=Deployment Error
' #txt
Ds0 f6 isAsynch false #txt
Ds0 f6 isInnerRd true #txt
Ds0 f6 isDialog true #txt
Ds0 f6 78 284 36 24 20 -2 #rect
Ds0 f6 @|RichDialogIcon #fIcon
Ds0 f7 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f7 83 331 26 26 14 0 #rect
Ds0 f7 @|RichDialogProcessEndIcon #fIcon
Ds0 f8 expr out #txt
Ds0 f8 96 250 96 284 #arcP
Ds0 f9 expr out #txt
Ds0 f9 96 308 96 331 #arcP
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deploy</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f10 guid 11F41AAAAAF3CBE2 #txt
Ds0 f10 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f10 method deploy(java.io.File) #txt
Ds0 f10 disableUIEvents false #txt
Ds0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.io.File file> param = methodEvent.getInputArguments();
' #txt
Ds0 f10 inParameterMapAction 'out.file=param.file;
' #txt
Ds0 f10 outParameterDecl '<> result;
' #txt
Ds0 f10 270 246 20 20 13 0 #rect
Ds0 f10 @|RichDialogMethodStartIcon #fIcon
Ds0 f11 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f11 267 339 26 26 14 0 #rect
Ds0 f11 @|RichDialogProcessEndIcon #fIcon
Ds0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData out;
' #txt
Ds0 f13 actionTable 'out=in;
' #txt
Ds0 f13 actionCode 'import ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeployment;

in.deployer = new RichDialogBasedDeployment(in.file, in.pmv);
in.deployer.start();
panel.startPollingTimer();' #txt
Ds0 f13 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f13 262 292 36 24 20 -2 #rect
Ds0 f13 @|RichDialogProcessStepIcon #fIcon
Ds0 f14 expr out #txt
Ds0 f14 280 266 280 292 #arcP
Ds0 f12 expr out #txt
Ds0 f12 280 316 280 339 #arcP
Ds0 f2 expr out #txt
Ds0 f2 100 60 100 137 #arcP
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>timer()</name>
    </language>
</elementInfo>
' #txt
Ds0 f3 guid 11F46C393A777CDC #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f3 method timer() #txt
Ds0 f3 disableUIEvents false #txt
Ds0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f3 outParameterDecl '<> result;
' #txt
Ds0 f3 422 254 20 20 13 0 #rect
Ds0 f3 @|RichDialogMethodStartIcon #fIcon
Ds0 f4 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f4 419 491 26 26 14 0 #rect
Ds0 f4 @|RichDialogProcessEndIcon #fIcon
Ds0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isRunning?</name>
        <nameStyle>10
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f16 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f16 418 330 28 28 14 0 #rect
Ds0 f16 @|AlternativeIcon #fIcon
Ds0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData out;
' #txt
Ds0 f18 actionTable 'out=in;
' #txt
Ds0 f18 actionCode 'panel.progressMessageLabel.text = in.deployer.getCurrentTaskName();
panel.progressBar.maximum = in.deployer.getTotalWork();
panel.progressBar.value = in.deployer.getWorked();
panel.restartPollingTimer();' #txt
Ds0 f18 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f18 414 380 36 24 20 -2 #rect
Ds0 f18 @|RichDialogProcessStepIcon #fIcon
Ds0 f19 expr in #txt
Ds0 f19 outCond in.deployer.isRunning() #txt
Ds0 f19 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f19 432 358 432 380 #arcP
Ds0 f19 0 0.36363636363636365 16 0 #arcLabel
Ds0 f15 expr out #txt
Ds0 f15 432 404 432 491 #arcP
Ds0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f20 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData out;
' #txt
Ds0 f20 actionTable 'out=in;
' #txt
Ds0 f20 actionCode 'import com.ulcjava.base.application.util.Color;

panel.stopPollingTimer();
panel.progressBar.value = in.deployer.getWorked();
if (in.deployer.getError()!=null)
{		    			 			           
  panel.progressMessageLabel.text = "Error: "+in.deployer.getError().getMessage();
  panel.progressMessageLabel.foreground = Color.red;
	panel.showErrorButton.enabled = true;
}
else
{
  panel.progressMessageLabel.text="Successful";
  panel.progressMessageLabel.foreground = Color.green.darker();
}
' #txt
Ds0 f20 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f20 334 380 36 24 20 -2 #rect
Ds0 f20 @|RichDialogProcessStepIcon #fIcon
Ds0 f17 expr out #txt
Ds0 f17 432 274 432 330 #arcP
Ds0 f21 expr in #txt
Ds0 f21 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f21 418 344 352 380 #arcP
Ds0 f21 1 352 344 #addKink
Ds0 f21 0 0.8636363636363636 0 -5 #arcLabel
Ds0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f23 actionCode panel.fireStateChanged(); #txt
Ds0 f23 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f23 fireEvent stateChanged() #txt
Ds0 f23 334 444 36 24 20 -2 #rect
Ds0 f23 @|RichDialogFireEventIcon #fIcon
Ds0 f22 expr out #txt
Ds0 f22 352 404 352 444 #arcP
Ds0 f24 expr out #txt
Ds0 f24 370 467 420 497 #arcP
Ds0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isNextEnabled()</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f25 guid 11F46CD603BB5853 #txt
Ds0 f25 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f25 method isNextEnabled() #txt
Ds0 f25 disableUIEvents false #txt
Ds0 f25 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f25 outParameterDecl '<java.lang.Boolean nextEnabled> result;
' #txt
Ds0 f25 outParameterMapAction 'result.nextEnabled=in.#deployer is initialized && !in.deployer.isRunning() && in.deployer.getError() == null;
' #txt
Ds0 f25 54 470 20 20 13 0 #rect
Ds0 f25 @|RichDialogMethodStartIcon #fIcon
Ds0 f26 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f26 51 539 26 26 14 0 #rect
Ds0 f26 @|RichDialogProcessEndIcon #fIcon
Ds0 f27 expr out #txt
Ds0 f27 64 490 64 539 #arcP
Ds0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>stop</name>
        <nameStyle>4,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f28 guid 122113500F3332EC #txt
Ds0 f28 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f28 method stop() #txt
Ds0 f28 disableUIEvents false #txt
Ds0 f28 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f28 outParameterDecl '<> result;
' #txt
Ds0 f28 222 470 20 20 13 0 #rect
Ds0 f28 @|RichDialogMethodStartIcon #fIcon
Ds0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f29 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData out;
' #txt
Ds0 f29 actionTable 'out=in;
' #txt
Ds0 f29 actionCode panel.stopPollingTimer(); #txt
Ds0 f29 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f29 214 516 36 24 20 -2 #rect
Ds0 f29 @|RichDialogProcessStepIcon #fIcon
Ds0 f30 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
Ds0 f30 219 563 26 26 14 0 #rect
Ds0 f30 @|RichDialogProcessEndIcon #fIcon
Ds0 f31 expr out #txt
Ds0 f31 232 490 232 516 #arcP
Ds0 f32 expr out #txt
Ds0 f32 232 540 232 563 #arcP
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProgress.DeploymentProgressData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f5 mainOut f8 tail #connect
Ds0 f8 head f6 mainIn #connect
Ds0 f6 mainOut f9 tail #connect
Ds0 f9 head f7 mainIn #connect
Ds0 f10 mainOut f14 tail #connect
Ds0 f14 head f13 mainIn #connect
Ds0 f13 mainOut f12 tail #connect
Ds0 f12 head f11 mainIn #connect
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f16 out f19 tail #connect
Ds0 f19 head f18 mainIn #connect
Ds0 f18 mainOut f15 tail #connect
Ds0 f15 head f4 mainIn #connect
Ds0 f3 mainOut f17 tail #connect
Ds0 f17 head f16 in #connect
Ds0 f16 out f21 tail #connect
Ds0 f21 head f20 mainIn #connect
Ds0 f20 mainOut f22 tail #connect
Ds0 f22 head f23 mainIn #connect
Ds0 f23 mainOut f24 tail #connect
Ds0 f24 head f4 mainIn #connect
Ds0 f25 mainOut f27 tail #connect
Ds0 f27 head f26 mainIn #connect
Ds0 f28 mainOut f31 tail #connect
Ds0 f31 head f29 mainIn #connect
Ds0 f29 mainOut f32 tail #connect
Ds0 f32 head f30 mainIn #connect
