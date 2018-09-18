[Ivy]
[>Created: Wed Jun 24 09:54:06 CEST 2009]
11F26F9E977A84A5 3.12 #module
>Proto >Proto Collection #zClass
Ds0 DeploymentWizardProcess Big #zClass
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
Ds0 @RichDialogEnd f7 '' #zField
Ds0 @RichDialogProcessStart f10 '' #zField
Ds0 @RichDialogProcessEnd f11 '' #zField
Ds0 @RichDialogProcessStart f12 '' #zField
Ds0 @RichDialogProcessEnd f13 '' #zField
Ds0 @RichDialogProcessStep f14 '' #zField
Ds0 @PushWFArc f16 '' #zField
Ds0 @RichDialogProcessStep f17 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @RichDialogProcessStep f3 '' #zField
Ds0 @PushWFArc f4 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @Alternative f6 '' #zField
Ds0 @PushWFArc f9 '' #zField
Ds0 @PushWFArc f18 '' #zField
Ds0 @RichDialogProcessStep f21 '' #zField
Ds0 @RichDialogProcessStep f22 '' #zField
Ds0 @PushWFArc f23 '' #zField
Ds0 @PushWFArc f24 '' #zField
Ds0 @PushWFArc f25 '' #zField
Ds0 @PushWFArc f26 '' #zField
Ds0 @PushWFArc f20 '' #zField
Ds0 @RichDialogProcessStart f27 '' #zField
Ds0 @RichDialogProcessEnd f28 '' #zField
Ds0 @RichDialogProcessStep f29 '' #zField
Ds0 @PushWFArc f31 '' #zField
Ds0 @Alternative f32 '' #zField
Ds0 @PushWFArc f33 '' #zField
Ds0 @PushWFArc f15 '' #zField
Ds0 @PushWFArc f34 '' #zField
Ds0 @Alternative f35 '' #zField
Ds0 @PushWFArc f36 '' #zField
Ds0 @PushWFArc f30 '' #zField
Ds0 @RichDialogProcessStep f37 '' #zField
Ds0 @PushWFArc f38 '' #zField
Ds0 @PushWFArc f39 '' #zField
Ds0 @PushWFArc f40 '' #zField
Ds0 @RichDialogProcessStep f41 '' #zField
Ds0 @PushWFArc f42 '' #zField
Ds0 @PushWFArc f8 '' #zField
>Proto Ds0 Ds0 DeploymentWizardProcess #zField
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModelVersion)</name>
        <nameStyle>27,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f0 guid 11F26F9EA51EC49D #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f0 method start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.file=new java.io.File("");
out.finishButtonLabel="Cancel";
out.isCancelEnabled=true;
out.isNextEnabled=true;
out.isPreviousEnabled=false;
out.pmv=param.processModelVersion;
out.state="ChoosePath";
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 embeddedRdInitializations '{/deploymentProgressPanel {/fieldName "deploymentProgressPanel"/startMethod "start(ch.ivyteam.ivy.application.IProcessModelVersion)"/parameterMapping "param.processModelVersion=in.pmv;\n"/initScript ""}/deploymentReleaseAndActivatePanel {/fieldName "deploymentReleaseAndActivatePanel"/startMethod "start(ch.ivyteam.ivy.application.IProcessModelVersion)"/parameterMapping "param.pmv=in.pmv;\n"/initScript ""}/deploymentChooseDirectoryPanel {/fieldName "deploymentChooseDirectoryPanel"/startMethod "start()"/parameterMapping ""/initScript ""}/deploymentProjectValidationPanel {/fieldName "deploymentProjectValidationPanel"/startMethod "start(ch.ivyteam.ivy.application.IProcessModelVersion)"/parameterMapping "param.pmv=in.pmv;\n"/initScript ""}}' #txt
Ds0 f0 94 30 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f1 91 283 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f5 guid 11F27BDB39C18B47 #txt
Ds0 f5 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f5 actionTable 'out=in;
' #txt
Ds0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f5 326 38 20 20 13 0 #rect
Ds0 f5 @|RichDialogProcessStartIcon #fIcon
Ds0 f7 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f7 guid 11F27BDFA2B5E62B #txt
Ds0 f7 323 267 26 26 14 0 #rect
Ds0 f7 @|RichDialogEndIcon #fIcon
Ds0 f10 guid 11F281EFF9230E45 #txt
Ds0 f10 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f10 actionTable 'out=in;
' #txt
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>next</name>
        <nameStyle>4,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f10 70 382 20 20 13 0 #rect
Ds0 f10 @|RichDialogProcessStartIcon #fIcon
Ds0 f11 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f11 67 587 26 26 14 0 #rect
Ds0 f11 @|RichDialogProcessEndIcon #fIcon
Ds0 f12 guid 11F281F4299A5398 #txt
Ds0 f12 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f12 actionTable 'out=in;
' #txt
Ds0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>previous</name>
        <nameStyle>8,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f12 502 38 20 20 13 0 #rect
Ds0 f12 @|RichDialogProcessStartIcon #fIcon
Ds0 f13 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f13 499 187 26 26 14 0 #rect
Ds0 f13 @|RichDialogProcessEndIcon #fIcon
Ds0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f14 actionTable 'out=in;
' #txt
Ds0 f14 actionCode 'if (in.state=="Validate")
{
	panel.contentCardPane.selectedComponent = panel.deploymentChooseDirectoryPanel;
	in.state="ChoosePath";
	in.isPreviousEnabled = false;
	in.isNextEnabled = true;
}' #txt
Ds0 f14 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f14 494 132 36 24 20 -2 #rect
Ds0 f14 @|RichDialogProcessStepIcon #fIcon
Ds0 f16 expr out #txt
Ds0 f16 512 156 512 187 #arcP
Ds0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show validation panel</name>
        <nameStyle>21
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f17 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f17 actionTable 'out=in;
' #txt
Ds0 f17 actionCode 'if (in.state=="ChoosePath")
{
	panel.contentCardPane.selectedComponent = panel.deploymentProjectValidationPanel;
	panel.deploymentProjectValidationPanel.validate(in.file);
	in.state="Validate";
	in.isPreviousEnabled = true;
	in.isNextEnabled = false;
}' #txt
Ds0 f17 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f17 62 492 36 24 20 -2 #rect
Ds0 f17 @|RichDialogProcessStepIcon #fIcon
Ds0 f19 expr out #txt
Ds0 f19 80 516 80 587 #arcP
Ds0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f3 actionTable 'out=in;
' #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f3 86 148 36 24 20 -2 #rect
Ds0 f3 @|RichDialogProcessStepIcon #fIcon
Ds0 f4 expr out #txt
Ds0 f4 104 50 104 148 #arcP
Ds0 f2 expr out #txt
Ds0 f2 104 172 104 283 #arcP
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f6 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f6 66 418 28 28 14 0 #rect
Ds0 f6 @|AlternativeIcon #fIcon
Ds0 f9 expr out #txt
Ds0 f9 80 402 80 418 #arcP
Ds0 f18 expr in #txt
Ds0 f18 outCond in.state=="ChoosePath" #txt
Ds0 f18 80 446 80 492 #arcP
Ds0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show deployment panel</name>
        <nameStyle>21
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f21 actionTable 'out=in;
' #txt
Ds0 f21 actionCode 'if (in.state=="Validate")
{
	panel.contentCardPane.selectedComponent = panel.deploymentProgressPanel;
	in.file = panel.deploymentProjectValidationPanel.getTemporaryProjectDirectory();
	panel.deploymentProgressPanel.deploy(in.file);
	in.state="Deploy";
	in.isPreviousEnabled = false;
	in.isNextEnabled = false;
}' #txt
Ds0 f21 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f21 230 492 36 24 20 -2 #rect
Ds0 f21 @|RichDialogProcessStepIcon #fIcon
Ds0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show release and activate panel</name>
        <nameStyle>31
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f22 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f22 actionTable 'out=in;
' #txt
Ds0 f22 actionCode 'if (in.state=="Deploy")
{
	panel.contentCardPane.selectedComponent = panel.deploymentReleaseAndActivatePanel;
	in.state="ReleaseAndActivate";
	in.isPreviousEnabled = false;
	in.isNextEnabled = false;
}' #txt
Ds0 f22 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f22 430 492 36 24 20 -2 #rect
Ds0 f22 @|RichDialogProcessStepIcon #fIcon
Ds0 f23 expr in #txt
Ds0 f23 outCond in.state=="Validate" #txt
Ds0 f23 90 436 230 496 #arcP
Ds0 f24 expr out #txt
Ds0 f24 230 514 91 593 #arcP
Ds0 f25 expr in #txt
Ds0 f25 outCond in.state=="Deploy" #txt
Ds0 f25 92 434 430 500 #arcP
Ds0 f26 expr out #txt
Ds0 f26 430 509 92 596 #arcP
Ds0 f20 expr in #txt
Ds0 f20 66 432 67 600 #arcP
Ds0 f20 1 32 432 #addKink
Ds0 f20 2 32 600 #addKink
Ds0 f20 1 0.42465171018745074 0 0 #arcLabel
Ds0 f27 guid 11F469EC6723B8F3 #txt
Ds0 f27 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f27 actionTable 'out=in;
' #txt
Ds0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>enableButtons</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f27 494 238 20 20 13 0 #rect
Ds0 f27 @|RichDialogProcessStartIcon #fIcon
Ds0 f28 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f28 491 403 26 26 14 0 #rect
Ds0 f28 @|RichDialogProcessEndIcon #fIcon
Ds0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f29 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f29 actionTable 'out=in;
' #txt
Ds0 f29 actionCode 'if (in.state == "Validate")
{
	in.isNextEnabled = panel.deploymentProjectValidationPanel.isNextEnabled();
}' #txt
Ds0 f29 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f29 486 340 36 24 20 -2 #rect
Ds0 f29 @|RichDialogProcessStepIcon #fIcon
Ds0 f31 expr out #txt
Ds0 f31 504 364 504 403 #arcP
Ds0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f32 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f32 498 82 28 28 14 0 #rect
Ds0 f32 @|AlternativeIcon #fIcon
Ds0 f33 expr out #txt
Ds0 f33 512 58 512 82 #arcP
Ds0 f15 expr in #txt
Ds0 f15 outCond in.state=="Validate" #txt
Ds0 f15 512 110 512 132 #arcP
Ds0 f34 expr in #txt
Ds0 f34 504 102 503 190 #arcP
Ds0 f34 1 456 136 #addKink
Ds0 f34 1 0.09242829576749541 0 0 #arcLabel
Ds0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f35 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f35 490 290 28 28 14 0 #rect
Ds0 f35 @|AlternativeIcon #fIcon
Ds0 f36 expr out #txt
Ds0 f36 504 258 504 290 #arcP
Ds0 f30 expr in #txt
Ds0 f30 outCond in.state=="Validate" #txt
Ds0 f30 504 318 504 340 #arcP
Ds0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f37 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f37 actionTable 'out=in;
' #txt
Ds0 f37 actionCode 'if (in.state == "Deploy")
{
	in.isNextEnabled = panel.deploymentProgressPanel.isNextEnabled();
	if (in.isNextEnabled)
	{
		in.finishButtonLabel="Finish";
  }
}' #txt
Ds0 f37 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f37 558 340 36 24 20 -2 #rect
Ds0 f37 @|RichDialogProcessStepIcon #fIcon
Ds0 f38 expr in #txt
Ds0 f38 outCond in.state=="Deploy" #txt
Ds0 f38 512 310 558 340 #arcP
Ds0 f39 expr out #txt
Ds0 f39 563 364 513 407 #arcP
Ds0 f40 expr in #txt
Ds0 f40 490 304 491 416 #arcP
Ds0 f40 1 432 304 #addKink
Ds0 f40 2 432 416 #addKink
Ds0 f40 1 0.31660326193616045 0 0 #arcLabel
Ds0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f41 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData out;
' #txt
Ds0 f41 actionTable 'out=in;
' #txt
Ds0 f41 actionCode 'panel.deploymentReleaseAndActivatePanel.stop();
panel.deploymentProgressPanel.stop();
panel.deploymentProjectValidationPanel.stop();' #txt
Ds0 f41 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
Ds0 f41 318 132 36 24 20 -2 #rect
Ds0 f41 @|RichDialogProcessStepIcon #fIcon
Ds0 f42 expr out #txt
Ds0 f42 336 58 336 132 #arcP
Ds0 f8 expr out #txt
Ds0 f8 336 156 336 267 #arcP
>Proto Ds0 .ui2RdDataAction 'out.file=panel.deploymentChooseDirectoryPanel.file;
' #txt
>Proto Ds0 .rdData2UIAction 'panel.cancelButton.enabled=in.isCancelEnabled;
panel.cancelButton.text=in.finishButtonLabel;
panel.deploymentChooseDirectoryPanel.file=in.file;
panel.nextButton.enabled=in.isNextEnabled;
panel.previousButton.enabled=in.isPreviousEnabled;
' #txt
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard.DeploymentWizardData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f14 mainOut f16 tail #connect
Ds0 f16 head f13 mainIn #connect
Ds0 f17 mainOut f19 tail #connect
Ds0 f19 head f11 mainIn #connect
Ds0 f0 mainOut f4 tail #connect
Ds0 f4 head f3 mainIn #connect
Ds0 f3 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f10 mainOut f9 tail #connect
Ds0 f9 head f6 in #connect
Ds0 f6 out f18 tail #connect
Ds0 f18 head f17 mainIn #connect
Ds0 f6 out f23 tail #connect
Ds0 f23 head f21 mainIn #connect
Ds0 f21 mainOut f24 tail #connect
Ds0 f24 head f11 mainIn #connect
Ds0 f6 out f25 tail #connect
Ds0 f25 head f22 mainIn #connect
Ds0 f22 mainOut f26 tail #connect
Ds0 f26 head f11 mainIn #connect
Ds0 f6 out f20 tail #connect
Ds0 f20 head f11 mainIn #connect
Ds0 f29 mainOut f31 tail #connect
Ds0 f31 head f28 mainIn #connect
Ds0 f12 mainOut f33 tail #connect
Ds0 f33 head f32 in #connect
Ds0 f32 out f15 tail #connect
Ds0 f15 head f14 mainIn #connect
Ds0 f32 out f34 tail #connect
Ds0 f34 head f13 mainIn #connect
Ds0 f27 mainOut f36 tail #connect
Ds0 f36 head f35 in #connect
Ds0 f35 out f30 tail #connect
Ds0 f30 head f29 mainIn #connect
Ds0 f35 out f38 tail #connect
Ds0 f38 head f37 mainIn #connect
Ds0 f37 mainOut f39 tail #connect
Ds0 f39 head f28 mainIn #connect
Ds0 f35 out f40 tail #connect
Ds0 f40 head f28 mainIn #connect
Ds0 f5 mainOut f42 tail #connect
Ds0 f42 head f41 mainIn #connect
Ds0 f41 mainOut f8 tail #connect
Ds0 f8 head f7 mainIn #connect
