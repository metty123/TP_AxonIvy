[Ivy]
[>Created: Wed Nov 16 12:32:27 CET 2011]
129CA8E6AC5B4719 3.17 #module
>Proto >Proto Collection #zClass
Ms0 MailContentProcessSettingProcess Big #zClass
Ms0 RD #cInfo
Ms0 #process
Ms0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ms0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ms0 @TextInP .resExport .resExport #zField
Ms0 @TextInP .type .type #zField
Ms0 @TextInP .processKind .processKind #zField
Ms0 @AnnotationInP-0n ai ai #zField
Ms0 @TextInP .xml .xml #zField
Ms0 @TextInP .responsibility .responsibility #zField
Ms0 @RichDialogInitStart f0 '' #zField
Ms0 @RichDialogProcessEnd f1 '' #zField
Ms0 @PushWFArc f2 '' #zField
Ms0 @RichDialogInitStart f3 '' #zField
Ms0 @RichDialogProcessEnd f4 '' #zField
Ms0 @RichDialogProcessStep f6 '' #zField
Ms0 @PushWFArc f7 '' #zField
Ms0 @PushWFArc f5 '' #zField
Ms0 @RichDialogMethodStart f8 '' #zField
Ms0 @RichDialogProcessEnd f9 '' #zField
Ms0 @RichDialogProcessStep f11 '' #zField
Ms0 @PushWFArc f12 '' #zField
Ms0 @PushWFArc f10 '' #zField
>Proto Ms0 Ms0 MailContentProcessSettingProcess #zField
Ms0 f0 guid 129CA8E6AF848C57 #txt
Ms0 f0 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f0 method start() #txt
Ms0 f0 disableUIEvents true #txt
Ms0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ms0 f0 outParameterDecl '<> result;
' #txt
Ms0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ms0 f0 90 40 20 20 13 0 #rect
Ms0 f0 @|RichDialogInitStartIcon #fIcon
Ms0 f1 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f1 90 94 20 20 13 0 #rect
Ms0 f1 @|RichDialogProcessEndIcon #fIcon
Ms0 f2 expr out #txt
Ms0 f2 100 60 100 94 #arcP
Ms0 f3 guid 129CA9CCAF02F36D #txt
Ms0 f3 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f3 method start(ch.ivyteam.ivy.application.IApplication) #txt
Ms0 f3 disableUIEvents true #txt
Ms0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ms0 f3 inParameterMapAction 'out.application=param.application;
' #txt
Ms0 f3 outParameterDecl '<> result;
' #txt
Ms0 f3 embeddedRdInitializations '* ' #txt
Ms0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f3 174 38 20 20 13 0 #rect
Ms0 f3 @|RichDialogInitStartIcon #fIcon
Ms0 f4 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f4 174 118 20 20 13 0 #rect
Ms0 f4 @|RichDialogProcessEndIcon #fIcon
Ms0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData out;
' #txt
Ms0 f6 actionTable 'out=in;
' #txt
Ms0 f6 actionCode 'import java.util.LinkedHashSet;
import java.util.Set;
import java.util.ArrayList;
import ch.ivyteam.ivy.workflow.StandardProcessType;
import ch.ivyteam.ivy.workflow.IWorkflowContext;
import ch.ivyteam.ivy.workflow.WorkflowNavigationUtil;

IWorkflowContext wf = WorkflowNavigationUtil.getWorkflowContext(in.application);

Set libraries = new LinkedHashSet();
libraries.add("");
for (StandardProcessType processType : StandardProcessType.MAIL_NOTIFICATION_PROCESS_TYPES)
{
	libraries.addAll(wf.getAvailableStandardProcessImplementations(processType));
}
in.selectedLibrary = wf.getStandardProcessImplementationLibrary(StandardProcessType.MAIL_NOTIFICATION_PROCESS_TYPES);
in.libraries.addAll(libraries);' #txt
Ms0 f6 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>read data from workflow context</name>
        <nameStyle>31,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f6 166 76 36 24 24 -8 #rect
Ms0 f6 @|RichDialogProcessStepIcon #fIcon
Ms0 f7 expr out #txt
Ms0 f7 184 58 184 76 #arcP
Ms0 f5 expr out #txt
Ms0 f5 184 100 184 118 #arcP
Ms0 f8 guid 129CAA1FC5D6CF3B #txt
Ms0 f8 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f8 method save() #txt
Ms0 f8 disableUIEvents false #txt
Ms0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save()</name>
    </language>
</elementInfo>
' #txt
Ms0 f8 94 214 20 20 13 0 #rect
Ms0 f8 @|RichDialogMethodStartIcon #fIcon
Ms0 f9 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f9 94 302 20 20 13 0 #rect
Ms0 f9 @|RichDialogProcessEndIcon #fIcon
Ms0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData out;
' #txt
Ms0 f11 actionTable 'out=in;
' #txt
Ms0 f11 actionCode 'import ch.ivyteam.ivy.workflow.StandardProcessType;
import ch.ivyteam.ivy.workflow.IWorkflowContext;
import ch.ivyteam.ivy.workflow.WorkflowNavigationUtil;

IWorkflowContext wf = WorkflowNavigationUtil.getWorkflowContext(in.application);
wf.setStandardProcessImplementationLibrary(StandardProcessType.MAIL_NOTIFICATION_PROCESS_TYPES, in.selectedLibrary);
' #txt
Ms0 f11 type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
Ms0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save data to workflow context</name>
        <nameStyle>29,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f11 86 252 36 24 20 -2 #rect
Ms0 f11 @|RichDialogProcessStepIcon #fIcon
Ms0 f12 expr out #txt
Ms0 f12 104 234 104 252 #arcP
Ms0 f10 expr out #txt
Ms0 f10 104 276 104 302 #arcP
>Proto Ms0 .ui2RdDataAction 'out.selectedLibrary=panel.creatorComboBox.selectedListEntry as String;
' #txt
>Proto Ms0 .rdData2UIAction 'panel.creatorComboBox.listData=in.libraries;
panel.creatorComboBox.selectedListEntry=in.selectedLibrary;
' #txt
>Proto Ms0 .type ch.ivyteam.ivy.admin.tool.security.MailContentProcessSetting.MailContentProcessSettingData #txt
>Proto Ms0 .processKind RICH_DIALOG #txt
>Proto Ms0 -8 -8 16 16 16 26 #rect
>Proto Ms0 '' #fIcon
Ms0 f0 mainOut f2 tail #connect
Ms0 f2 head f1 mainIn #connect
Ms0 f3 mainOut f7 tail #connect
Ms0 f7 head f6 mainIn #connect
Ms0 f6 mainOut f5 tail #connect
Ms0 f5 head f4 mainIn #connect
Ms0 f8 mainOut f12 tail #connect
Ms0 f12 head f11 mainIn #connect
Ms0 f11 mainOut f10 tail #connect
Ms0 f10 head f9 mainIn #connect
