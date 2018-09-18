[Ivy]
[>Created: Thu Feb 05 12:44:17 CET 2009]
11F461E97C559E12 3.11 #module
>Proto >Proto Collection #zClass
Is0 IssueDetailsProcess Big #zClass
Is0 RD #cInfo
Is0 #process
Is0 @MessageFlowInP-0n messageIn messageIn #zField
Is0 @MessageFlowOutP-0n messageOut messageOut #zField
Is0 @AnnotationInP-0n ai ai #zField
Is0 @TextInP .xml .xml #zField
Is0 @TextInP .responsibility .responsibility #zField
Is0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Is0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Is0 @TextInP .resExport .resExport #zField
Is0 @TextInP .type .type #zField
Is0 @TextInP .processKind .processKind #zField
Is0 @RichDialogInitStart f0 '' #zField
Is0 @RichDialogProcessEnd f1 '' #zField
Is0 @PushWFArc f2 '' #zField
Is0 @RichDialogProcessStart f3 '' #zField
Is0 @RichDialogEnd f6 '' #zField
Is0 @PushWFArc f7 '' #zField
>Proto Is0 Is0 IssueDetailsProcess #zField
Is0 f0 guid 11F461E985144A24 #txt
Is0 f0 type ch.ivyteam.ivy.admin.tool.deployment.IssueDetails.IssueDetailsData #txt
Is0 f0 method start(ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue) #txt
Is0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.deployment.restricted.IProjectDeploymentValidationIssue issue> param = methodEvent.getInputArguments();
' #txt
Is0 f0 inParameterMapAction 'out.issue=param.issue;
' #txt
Is0 f0 outParameterDecl '<> result;
' #txt
Is0 f0 embeddedRdInitializations '* ' #txt
Is0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProjectDeploymentValidationIssue)</name>
    </language>
</elementInfo>
' #txt
Is0 f0 90 40 20 20 13 0 #rect
Is0 f0 @|RichDialogInitStartIcon #fIcon
Is0 f1 type ch.ivyteam.ivy.admin.tool.deployment.IssueDetails.IssueDetailsData #txt
Is0 f1 87 137 26 26 14 0 #rect
Is0 f1 @|RichDialogProcessEndIcon #fIcon
Is0 f2 expr out #txt
Is0 f2 100 60 100 137 #arcP
Is0 f3 guid 11F4633FEC19482E #txt
Is0 f3 type ch.ivyteam.ivy.admin.tool.deployment.IssueDetails.IssueDetailsData #txt
Is0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.IssueDetails.IssueDetailsData out;
' #txt
Is0 f3 actionTable 'out=in;
' #txt
Is0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f3 86 214 20 20 13 0 #rect
Is0 f3 @|RichDialogProcessStartIcon #fIcon
Is0 f6 type ch.ivyteam.ivy.admin.tool.deployment.IssueDetails.IssueDetailsData #txt
Is0 f6 guid 11F464067DE88886 #txt
Is0 f6 83 275 26 26 14 0 #rect
Is0 f6 @|RichDialogEndIcon #fIcon
Is0 f7 expr out #txt
Is0 f7 96 234 96 275 #arcP
>Proto Is0 .rdData2UIAction 'panel.descriptionTextArea.text=in.issue.getDescription();
panel.howToFixTextArea.text=in.issue.getHowToFixDescription();
panel.messageTextField.text=in.issue.getMessage();
panel.severityValueLabel.iconUri=ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.INFO==in.issue.getSeverity()
?
ivy.cms.cr("/images/klein/issueInfo")
:
in.issue.getSeverity()==ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.WARNING
?
ivy.cms.cr("/images/klein/issueWarning")
:
in.issue.getSeverity()==ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.ERROR
?
ivy.cms.cr("/images/klein/issueError")
:
ivy.cms.cr("/images/klein/fatal");
panel.severityValueLabel.text=in.issue.getSeverity().toString();
' #txt
>Proto Is0 .type ch.ivyteam.ivy.admin.tool.deployment.IssueDetails.IssueDetailsData #txt
>Proto Is0 .processKind RICH_DIALOG #txt
>Proto Is0 -8 -8 16 16 16 26 #rect
>Proto Is0 '' #fIcon
Is0 f0 mainOut f2 tail #connect
Is0 f2 head f1 mainIn #connect
Is0 f3 mainOut f7 tail #connect
Is0 f7 head f6 mainIn #connect
