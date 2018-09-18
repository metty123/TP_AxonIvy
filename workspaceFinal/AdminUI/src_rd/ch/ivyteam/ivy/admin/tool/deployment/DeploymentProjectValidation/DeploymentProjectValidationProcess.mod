[Ivy]
[>Created: Wed Jun 24 09:53:39 CEST 2009]
11F3CB997063C4E7 3.12 #module
>Proto >Proto Collection #zClass
Ds0 DeploymentProjectValidationProcess Big #zClass
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
Ds0 @RichDialogMethodStart f3 '' #zField
Ds0 @RichDialogProcessEnd f4 '' #zField
Ds0 @RichDialogProcessStep f6 '' #zField
Ds0 @PushWFArc f7 '' #zField
Ds0 @PushWFArc f5 '' #zField
Ds0 @RichDialogMethodStart f8 '' #zField
Ds0 @RichDialogProcessEnd f9 '' #zField
Ds0 @RichDialogProcessStep f11 '' #zField
Ds0 @PushWFArc f10 '' #zField
Ds0 @Alternative f13 '' #zField
Ds0 @RichDialogProcessStep f15 '' #zField
Ds0 @PushWFArc f16 '' #zField
Ds0 @PushWFArc f12 '' #zField
Ds0 @PushWFArc f14 '' #zField
Ds0 @RichDialogProcessStart f17 '' #zField
Ds0 @RichDialogProcessEnd f19 '' #zField
Ds0 @PushWFArc f20 '' #zField
Ds0 @RichDialogProcessStart f21 '' #zField
Ds0 @RichDialog f22 '' #zField
Ds0 @RichDialogProcessEnd f23 '' #zField
Ds0 @PushWFArc f25 '' #zField
Ds0 @Alternative f26 '' #zField
Ds0 @PushWFArc f27 '' #zField
Ds0 @PushWFArc f24 '' #zField
Ds0 @PushWFArc f28 '' #zField
Ds0 @RichDialogMethodStart f29 '' #zField
Ds0 @RichDialogProcessEnd f30 '' #zField
Ds0 @PushWFArc f31 '' #zField
Ds0 @RichDialogFireEvent f32 '' #zField
Ds0 @PushWFArc f18 '' #zField
Ds0 @RichDialogProcessStep f34 '' #zField
Ds0 @PushWFArc f35 '' #zField
Ds0 @PushWFArc f33 '' #zField
Ds0 @RichDialogMethodStart f36 '' #zField
Ds0 @RichDialogProcessEnd f37 '' #zField
Ds0 @PushWFArc f38 '' #zField
Ds0 @RichDialogMethodStart f39 '' #zField
Ds0 @RichDialogProcessEnd f40 '' #zField
Ds0 @RichDialogProcessStep f41 '' #zField
Ds0 @PushWFArc f42 '' #zField
Ds0 @PushWFArc f43 '' #zField
>Proto Ds0 Ds0 DeploymentProjectValidationProcess #zField
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModelVersion)</name>
    </language>
</elementInfo>
' #txt
Ds0 f0 guid 11F3CB99754D3F05 #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
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
Ds0 f0 90 40 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f1 87 137 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 100 60 100 137 #arcP
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate</name>
        <nameStyle>8,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f3 guid 11F41AC2EF483A32 #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f3 method validate(java.io.File) #txt
Ds0 f3 disableUIEvents false #txt
Ds0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.io.File projectDirectory> param = methodEvent.getInputArguments();
' #txt
Ds0 f3 inParameterMapAction 'out.projectDirectory=param.projectDirectory;
' #txt
Ds0 f3 outParameterDecl '<> result;
' #txt
Ds0 f3 94 214 20 20 13 0 #rect
Ds0 f3 @|RichDialogMethodStartIcon #fIcon
Ds0 f4 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f4 91 299 26 26 14 0 #rect
Ds0 f4 @|RichDialogProcessEndIcon #fIcon
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start validation and polling timer</name>
        <nameStyle>34,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f6 actionTable 'out=in;
' #txt
Ds0 f6 actionCode 'import ch.ivyteam.ivy.deployment.restricted.helper.RichDialogBasedDeploymentValidator;

in.validator = new RichDialogBasedDeploymentValidator(in.projectDirectory, in.pmv);
in.validator.start();

panel.startPollingTimer();
in.checksAndIssuesTree = new Tree();
panel.validatingMessageLabel.setForeground(null);' #txt
Ds0 f6 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f6 86 252 36 24 20 -2 #rect
Ds0 f6 @|RichDialogProcessStepIcon #fIcon
Ds0 f7 expr out #txt
Ds0 f7 104 234 104 252 #arcP
Ds0 f5 expr out #txt
Ds0 f5 104 276 104 299 #arcP
Ds0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>timer</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f8 guid 11F4589B569EAB09 #txt
Ds0 f8 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f8 method timer() #txt
Ds0 f8 disableUIEvents false #txt
Ds0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f8 outParameterDecl '<> result;
' #txt
Ds0 f8 414 206 20 20 13 0 #rect
Ds0 f8 @|RichDialogMethodStartIcon #fIcon
Ds0 f9 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f9 411 499 26 26 14 0 #rect
Ds0 f9 @|RichDialogProcessEndIcon #fIcon
Ds0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>restart timer</name>
        <nameStyle>13,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f11 actionTable 'out=in;
' #txt
Ds0 f11 actionCode panel.restartPollingTimer(); #txt
Ds0 f11 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f11 406 428 36 24 20 -2 #rect
Ds0 f11 @|RichDialogProcessStepIcon #fIcon
Ds0 f10 expr out #txt
Ds0 f10 424 452 424 499 #arcP
Ds0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isRunning?</name>
        <nameStyle>10
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f13 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f13 410 354 28 28 24 -14 #rect
Ds0 f13 @|AlternativeIcon #fIcon
Ds0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>updateChecksAndIssueTree</name>
        <nameStyle>24
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f15 actionTable 'out=in;
' #txt
Ds0 f15 actionCode 'import ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationCheck;
import ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue;

List<IProjectDeploymentValidationCheck> checks;
List<IProjectDeploymentValidationIssue> issues;
Tree checkNode;

checks = in.validator.getValidationChecks();
for (int i = 0; i < checks.size(); i++)
{
	if (i < in.checksAndIssuesTree.getChildCount())
	{
		checkNode = in.checksAndIssuesTree.getChildAt(i);
  }	
  else
  {
		checkNode = new Tree(checks.get(i), "check");
		in.checksAndIssuesTree.add(checkNode);
	}
	issues = (checkNode.value as IProjectDeploymentValidationCheck).getValidationIssues();
	for (int j = checkNode.getChildCount(); j < issues.size(); j++)
	{
		checkNode.treeValueChanged();
		checkNode.add(new Tree(issues.get(j), "issue"));
	}				
}
	' #txt
Ds0 f15 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f15 406 268 36 24 20 -2 #rect
Ds0 f15 @|RichDialogProcessStepIcon #fIcon
Ds0 f16 expr in #txt
Ds0 f16 outCond in.validator.isRunning() #txt
Ds0 f16 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f16 424 382 424 428 #arcP
Ds0 f16 0 0.3632513351069563 0 0 #arcLabel
Ds0 f12 expr out #txt
Ds0 f12 424 226 424 268 #arcP
Ds0 f14 expr out #txt
Ds0 f14 424 292 424 354 #arcP
Ds0 f17 guid 11F4618CDA922D07 #txt
Ds0 f17 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f17 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f17 actionTable 'out=in;
' #txt
Ds0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>selectionChanged</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f17 334 46 20 20 13 0 #rect
Ds0 f17 @|RichDialogProcessStartIcon #fIcon
Ds0 f19 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f19 331 107 26 26 14 0 #rect
Ds0 f19 @|RichDialogProcessEndIcon #fIcon
Ds0 f20 expr out #txt
Ds0 f20 344 66 344 107 #arcP
Ds0 f21 guid 11F461CAF53B7DF9 #txt
Ds0 f21 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f21 actionTable 'out=in;
' #txt
Ds0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>details</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f21 582 38 20 20 13 0 #rect
Ds0 f21 @|RichDialogProcessStartIcon #fIcon
Ds0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f22 targetWindow NEW #txt
Ds0 f22 targetDisplay TOP #txt
Ds0 f22 richDialogId ch.ivyteam.ivy.admin.tool.deployment.IssueDetails #txt
Ds0 f22 startMethod start(ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue) #txt
Ds0 f22 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f22 requestActionDecl '<ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue issue> param;' #txt
Ds0 f22 requestMappingAction 'param.issue=in.selectedTreeNode.value as ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue;
' #txt
Ds0 f22 responseActionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f22 responseMappingAction 'out=in;
' #txt
Ds0 f22 windowConfiguration '#Thu Feb 05 12:35:22 CET 2009
height=300
maximized=false
centered=true
close_after_last_rd=true
resizable=true
width=500
title=Deployment Validation Issue
' #txt
Ds0 f22 isAsynch false #txt
Ds0 f22 isInnerRd true #txt
Ds0 f22 isDialog true #txt
Ds0 f22 574 132 36 24 20 -2 #rect
Ds0 f22 @|RichDialogIcon #fIcon
Ds0 f23 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f23 579 187 26 26 14 0 #rect
Ds0 f23 @|RichDialogProcessEndIcon #fIcon
Ds0 f25 expr out #txt
Ds0 f25 592 156 592 187 #arcP
Ds0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f26 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f26 578 82 28 28 14 0 #rect
Ds0 f26 @|AlternativeIcon #fIcon
Ds0 f27 expr out #txt
Ds0 f27 592 58 592 82 #arcP
Ds0 f24 expr in #txt
Ds0 f24 outCond 'in.#selectedTreeNode is initialized && in.selectedTreeNode.info == "issue"' #txt
Ds0 f24 592 110 592 132 #arcP
Ds0 f28 expr in #txt
Ds0 f28 606 96 605 200 #arcP
Ds0 f28 1 640 96 #addKink
Ds0 f28 2 640 200 #addKink
Ds0 f28 1 0.367329145136621 0 0 #arcLabel
Ds0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isNextEnabled()</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f29 guid 11F46A46B5A63B16 #txt
Ds0 f29 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f29 method isNextEnabled() #txt
Ds0 f29 disableUIEvents false #txt
Ds0 f29 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f29 outParameterDecl '<java.lang.Boolean nextEnabled> result;
' #txt
Ds0 f29 outParameterMapAction 'result.nextEnabled=in.#validator is initialized && !in.validator.isRunning() && !in.validator.hasErrors();
' #txt
Ds0 f29 86 382 20 20 13 0 #rect
Ds0 f29 @|RichDialogMethodStartIcon #fIcon
Ds0 f30 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f30 83 459 26 26 14 0 #rect
Ds0 f30 @|RichDialogProcessEndIcon #fIcon
Ds0 f31 expr out #txt
Ds0 f31 96 402 96 459 #arcP
Ds0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>fire state changed</name>
        <nameStyle>18
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f32 actionCode panel.fireStateChanged(); #txt
Ds0 f32 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f32 fireEvent stateChanged() #txt
Ds0 f32 238 428 36 24 20 -2 #rect
Ds0 f32 @|RichDialogFireEventIcon #fIcon
Ds0 f18 expr out #txt
Ds0 f18 256 452 411 512 #arcP
Ds0 f18 1 256 512 #addKink
Ds0 f18 1 0.06984748631306932 0 0 #arcLabel
Ds0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f34 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f34 actionTable 'out=in;
' #txt
Ds0 f34 actionCode 'import com.ulcjava.base.application.util.Color;

panel.stopPollingTimer();
if (in.validator.hasErrors())
{
	panel.validatingMessageLabel.setForeground(Color.red);
}
else if (in.validator.hasWarnings())
{
	panel.validatingMessageLabel.setForeground(Color.orange.darker());
}
else
{
	panel.validatingMessageLabel.setForeground(Color.green.darker());
}
in.projectDirectory = in.validator.getTemporaryProjectDirectory();' #txt
Ds0 f34 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f34 238 388 36 24 20 -2 #rect
Ds0 f34 @|RichDialogProcessStepIcon #fIcon
Ds0 f35 expr in #txt
Ds0 f35 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f35 410 368 256 388 #arcP
Ds0 f35 1 256 368 #addKink
Ds0 f35 1 0.26479725070630106 0 0 #arcLabel
Ds0 f33 expr out #txt
Ds0 f33 256 412 256 428 #arcP
Ds0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getTemporaryProjectDirectory()</name>
        <nameStyle>30,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f36 guid 11F5FD339F54B455 #txt
Ds0 f36 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f36 method getTemporaryProjectDirectory() #txt
Ds0 f36 disableUIEvents false #txt
Ds0 f36 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f36 outParameterDecl '<java.io.File temporaryProjectDirectory> result;
' #txt
Ds0 f36 outParameterMapAction 'result.temporaryProjectDirectory=in.projectDirectory;
' #txt
Ds0 f36 86 534 20 20 13 0 #rect
Ds0 f36 @|RichDialogMethodStartIcon #fIcon
Ds0 f37 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f37 83 603 26 26 14 0 #rect
Ds0 f37 @|RichDialogProcessEndIcon #fIcon
Ds0 f38 expr out #txt
Ds0 f38 96 554 96 603 #arcP
Ds0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>stop()</name>
    </language>
</elementInfo>
' #txt
Ds0 f39 guid 1221141275B77B4C #txt
Ds0 f39 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f39 method stop() #txt
Ds0 f39 disableUIEvents false #txt
Ds0 f39 382 622 20 20 13 0 #rect
Ds0 f39 @|RichDialogMethodStartIcon #fIcon
Ds0 f40 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f40 379 723 26 26 14 0 #rect
Ds0 f40 @|RichDialogProcessEndIcon #fIcon
Ds0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f41 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData out;
' #txt
Ds0 f41 actionTable 'out=in;
' #txt
Ds0 f41 actionCode panel.stopPollingTimer(); #txt
Ds0 f41 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
Ds0 f41 374 668 36 24 20 -2 #rect
Ds0 f41 @|RichDialogProcessStepIcon #fIcon
Ds0 f42 expr out #txt
Ds0 f42 392 642 392 668 #arcP
Ds0 f43 expr out #txt
Ds0 f43 392 692 392 723 #arcP
>Proto Ds0 .ui2RdDataAction 'out.selectedTreeNode=panel.checksTree.#selectedTreeNode;
' #txt
>Proto Ds0 .rdData2UIAction 'panel.checksTree.treeData=in.checksAndIssuesTree;
panel.showDetailButton.enabled=in.#selectedTreeNode is initialized && in.selectedTreeNode.info == "issue";
panel.validatingMessageLabel.text=in.#validator is initialized 
?
in.validator.isRunning()
?
in.validator.getCurrentTaskName() 
:
in.validator.hasErrors()
?
"Validation was not successful"
:
in.validator.hasWarnings()
?
"Validation was successful with warnings"
:
"Validation was sucessful"
: 
" ";
panel.validatingProgressBar.maximum=in.#validator is initialized ? in.validator.getTotalWork() : 0;
panel.validatingProgressBar.value=in.#validator is initialized ? in.validator.getWorked() : 0;
' #txt
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.deployment.DeploymentProjectValidation.DeploymentProjectValidationData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f3 mainOut f7 tail #connect
Ds0 f7 head f6 mainIn #connect
Ds0 f6 mainOut f5 tail #connect
Ds0 f5 head f4 mainIn #connect
Ds0 f11 mainOut f10 tail #connect
Ds0 f10 head f9 mainIn #connect
Ds0 f13 out f16 tail #connect
Ds0 f16 head f11 mainIn #connect
Ds0 f8 mainOut f12 tail #connect
Ds0 f12 head f15 mainIn #connect
Ds0 f15 mainOut f14 tail #connect
Ds0 f14 head f13 in #connect
Ds0 f17 mainOut f20 tail #connect
Ds0 f20 head f19 mainIn #connect
Ds0 f22 mainOut f25 tail #connect
Ds0 f25 head f23 mainIn #connect
Ds0 f21 mainOut f27 tail #connect
Ds0 f27 head f26 in #connect
Ds0 f26 out f24 tail #connect
Ds0 f24 head f22 mainIn #connect
Ds0 f26 out f28 tail #connect
Ds0 f28 head f23 mainIn #connect
Ds0 f29 mainOut f31 tail #connect
Ds0 f31 head f30 mainIn #connect
Ds0 f32 mainOut f18 tail #connect
Ds0 f18 head f9 mainIn #connect
Ds0 f13 out f35 tail #connect
Ds0 f35 head f34 mainIn #connect
Ds0 f34 mainOut f33 tail #connect
Ds0 f33 head f32 mainIn #connect
Ds0 f36 mainOut f38 tail #connect
Ds0 f38 head f37 mainIn #connect
Ds0 f39 mainOut f42 tail #connect
Ds0 f42 head f41 mainIn #connect
Ds0 f41 mainOut f43 tail #connect
Ds0 f43 head f40 mainIn #connect
