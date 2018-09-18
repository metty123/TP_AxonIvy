[Ivy]
[>Created: Tue Jan 29 15:53:09 ICT 2013]
13C6FE129D95D2B4 3.17 #module
>Proto >Proto Collection #zClass
Vs0 ValidationIssueDetailProcess Big #zClass
Vs0 RD #cInfo
Vs0 #process
Vs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Vs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Vs0 @TextInP .resExport .resExport #zField
Vs0 @TextInP .type .type #zField
Vs0 @TextInP .processKind .processKind #zField
Vs0 @AnnotationInP-0n ai ai #zField
Vs0 @TextInP .xml .xml #zField
Vs0 @TextInP .responsibility .responsibility #zField
Vs0 @RichDialogInitStart f0 '' #zField
Vs0 @RichDialogProcessEnd f1 '' #zField
Vs0 @PushWFArc f2 '' #zField
Vs0 @RichDialogInitStart f3 '' #zField
Vs0 @RichDialogProcessStep f5 '' #zField
Vs0 @PushWFArc f6 '' #zField
Vs0 @PushWFArc f4 '' #zField
Vs0 @RichDialogProcessStart f7 '' #zField
Vs0 @RichDialogEnd f8 '' #zField
Vs0 @PushWFArc f9 '' #zField
>Proto Vs0 Vs0 ValidationIssueDetailProcess #zField
Vs0 f0 guid 13B26723567241AB #txt
Vs0 f0 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
Vs0 f0 method start() #txt
Vs0 f0 disableUIEvents true #txt
Vs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Vs0 f0 outParameterDecl '<> result;
' #txt
Vs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Vs0 f0 86 54 20 20 13 0 #rect
Vs0 f0 @|RichDialogInitStartIcon #fIcon
Vs0 f1 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
Vs0 f1 86 294 20 20 13 0 #rect
Vs0 f1 @|RichDialogProcessEndIcon #fIcon
Vs0 f2 expr out #txt
Vs0 f2 96 74 96 294 #arcP
Vs0 f3 guid 13B26EDF85821FEA #txt
Vs0 f3 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
Vs0 f3 method start(ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssue) #txt
Vs0 f3 disableUIEvents true #txt
Vs0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssue displayData> param = methodEvent.getInputArguments();
' #txt
Vs0 f3 inParameterMapAction 'out.displayData=param.displayData;
' #txt
Vs0 f3 outParameterDecl '<> result;
' #txt
Vs0 f3 embeddedRdInitializations '* ' #txt
Vs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ValidationIssue)</name>
        <nameStyle>22,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Vs0 f3 158 118 20 20 13 0 #rect
Vs0 f3 @|RichDialogInitStartIcon #fIcon
Vs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData out;
' #txt
Vs0 f5 actionTable 'out=in;
' #txt
Vs0 f5 actionCode 'String iconUri = "";
if (in.displayData.severity.equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.INFO.name())){
	iconUri = "/images/klein/issueInfo";
} else if (in.displayData.severity.equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.WARNING.name())){
	iconUri = "/images/klein/issueWarning";
} else if (in.displayData.severity.equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.ERROR.name())){
	iconUri = "/images/klein/issueError";
} else if (in.displayData.severity.equals(ch.ivyteam.ivy.deployment.restricted.ProjectDeploymentValidationIssueSeverity.EXCEPTION.name())){
	iconUri = "/images/klein/fatal";
}

panel.lblSeverityWithIcon.setIconUri(ivy.cms.cr(iconUri));' #txt
Vs0 f5 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
Vs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set icon URI</name>
        <nameStyle>12
</nameStyle>
    </language>
</elementInfo>
' #txt
Vs0 f5 150 196 36 24 20 -2 #rect
Vs0 f5 @|RichDialogProcessStepIcon #fIcon
Vs0 f6 expr out #txt
Vs0 f6 168 138 168 196 #arcP
Vs0 f6 0 0.6617178248693963 0 0 #arcLabel
Vs0 f4 expr out #txt
Vs0 f4 168 220 106 304 #arcP
Vs0 f4 1 168 304 #addKink
Vs0 f4 0 0.8934805689048021 0 0 #arcLabel
Vs0 f7 guid 13B26FA89B45C6CA #txt
Vs0 f7 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
Vs0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData out;
' #txt
Vs0 f7 actionTable 'out=in;
' #txt
Vs0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Vs0 f7 422 62 20 20 13 0 #rect
Vs0 f7 @|RichDialogProcessStartIcon #fIcon
Vs0 f8 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
Vs0 f8 guid 13B26FA9E9E93B5C #txt
Vs0 f8 422 198 20 20 13 0 #rect
Vs0 f8 @|RichDialogEndIcon #fIcon
Vs0 f9 expr out #txt
Vs0 f9 432 82 432 198 #arcP
>Proto Vs0 .rdData2UIAction 'panel.lblSeverityWithIcon.text=in.displayData.severity;
panel.txtDescription.text=in.displayData.description;
panel.txtHowToFix.text=in.displayData.howToFixDescription;
panel.txtMessage.text=in.displayData.message;
' #txt
>Proto Vs0 .type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ValidationIssueDetail.ValidationIssueDetailData #txt
>Proto Vs0 .processKind RICH_DIALOG #txt
>Proto Vs0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Event</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>300</swimlaneSize>
    <swimlaneSize>400</swimlaneSize>
    <swimlaneColor>-10040320</swimlaneColor>
    <swimlaneColor>-13108</swimlaneColor>
</elementInfo>
' #txt
>Proto Vs0 -8 -8 16 16 16 26 #rect
>Proto Vs0 '' #fIcon
Vs0 f0 mainOut f2 tail #connect
Vs0 f2 head f1 mainIn #connect
Vs0 f3 mainOut f6 tail #connect
Vs0 f6 head f5 mainIn #connect
Vs0 f5 mainOut f4 tail #connect
Vs0 f4 head f1 mainIn #connect
Vs0 f7 mainOut f9 tail #connect
Vs0 f9 head f8 mainIn #connect
