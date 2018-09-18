[Ivy]
[>Created: Wed Nov 16 12:34:22 CET 2011]
12E2A336B5F9DD4C 3.17 #module
>Proto >Proto Collection #zClass
Ps0 ProcessExecutionSettingsProcess Big #zClass
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
Ps0 @RichDialogProcessStep f3 '' #zField
Ps0 @RichDialogProcessEnd f6 '' #zField
Ps0 @PushWFArc f7 '' #zField
Ps0 @RichDialogMethodStart f8 '' #zField
Ps0 @RichDialogInitStart f9 '' #zField
Ps0 @PushWFArc f10 '' #zField
Ps0 @RichDialogProcessStep f4 '' #zField
Ps0 @PushWFArc f5 '' #zField
Ps0 @RichDialogProcessEnd f11 '' #zField
Ps0 @PushWFArc f12 '' #zField
>Proto Ps0 Ps0 ProcessExecutionSettingsProcess #zField
Ps0 f0 guid 12E2A336B7A9BA7F #txt
Ps0 f0 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
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
Ps0 f0 78 38 20 20 13 0 #rect
Ps0 f0 @|RichDialogInitStartIcon #fIcon
Ps0 f1 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f1 78 142 20 20 13 0 #rect
Ps0 f1 @|RichDialogProcessEndIcon #fIcon
Ps0 f2 expr out #txt
Ps0 f2 88 58 88 142 #arcP
Ps0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData out;
' #txt
Ps0 f3 actionTable 'out=in;
' #txt
Ps0 f3 actionCode 'import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import ch.ivyteam.ivy.workflow.StandardProcessType;
import ch.ivyteam.ivy.workflow.IWorkflowContext;
import ch.ivyteam.ivy.workflow.WorkflowNavigationUtil;

IWorkflowContext wf = WorkflowNavigationUtil.getWorkflowContext(in.application);

Set libraries = new LinkedHashSet();
libraries.add("");
for (StandardProcessType processType : StandardProcessType.DEFAULT_PAGES_PROCESS_TYPES)
{
	libraries.addAll(wf.getAvailableStandardProcessImplementations(processType));
}
in.executionLibraries.addAll(libraries);
in.selectedExecutionLibrary = wf.getStandardProcessImplementationLibrary(StandardProcessType.DEFAULT_PAGES_PROCESS_TYPES);
' #txt
Ps0 f3 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Read available implementation libraries
and the one that is configured</name>
        <nameStyle>70,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f3 190 84 36 24 24 -13 #rect
Ps0 f3 @|RichDialogProcessStepIcon #fIcon
Ps0 f6 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f6 198 142 20 20 13 0 #rect
Ps0 f6 @|RichDialogProcessEndIcon #fIcon
Ps0 f7 expr out #txt
Ps0 f7 208 108 208 142 #arcP
Ps0 f8 guid 12E2EA6F6C822A10 #txt
Ps0 f8 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f8 method save() #txt
Ps0 f8 disableUIEvents false #txt
Ps0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save()</name>
    </language>
</elementInfo>
' #txt
Ps0 f8 78 206 20 20 13 0 #rect
Ps0 f8 @|RichDialogMethodStartIcon #fIcon
Ps0 f9 guid 12E2EA6FEC37F1BD #txt
Ps0 f9 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f9 method start(ch.ivyteam.ivy.application.IApplication) #txt
Ps0 f9 disableUIEvents true #txt
Ps0 f9 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ps0 f9 inParameterMapAction 'out.application=param.application;
' #txt
Ps0 f9 outParameterDecl '<> result;
' #txt
Ps0 f9 embeddedRdInitializations '* ' #txt
Ps0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f9 198 38 20 20 13 0 #rect
Ps0 f9 @|RichDialogInitStartIcon #fIcon
Ps0 f10 expr out #txt
Ps0 f10 208 58 208 84 #arcP
Ps0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData out;
' #txt
Ps0 f4 actionTable 'out=in;
' #txt
Ps0 f4 actionCode 'import ch.ivyteam.ivy.workflow.StandardProcessType;
import ch.ivyteam.ivy.workflow.IWorkflowContext;
import ch.ivyteam.ivy.workflow.WorkflowNavigationUtil;

IWorkflowContext wf = WorkflowNavigationUtil.getWorkflowContext(in.application);

wf.setStandardProcessImplementationLibrary(StandardProcessType.DEFAULT_PAGES_PROCESS_TYPES, in.selectedExecutionLibrary);
' #txt
Ps0 f4 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f4 70 252 36 24 20 -2 #rect
Ps0 f4 @|RichDialogProcessStepIcon #fIcon
Ps0 f5 expr out #txt
Ps0 f5 88 226 88 252 #arcP
Ps0 f11 type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
Ps0 f11 78 310 20 20 13 0 #rect
Ps0 f11 @|RichDialogProcessEndIcon #fIcon
Ps0 f12 expr out #txt
Ps0 f12 88 276 88 310 #arcP
>Proto Ps0 .ui2RdDataAction 'out.selectedExecutionLibrary=panel.defaultExecutionComboBox.selectedListEntry as String;
' #txt
>Proto Ps0 .rdData2UIAction 'panel.defaultExecutionComboBox.listData=in.executionLibraries;
panel.defaultExecutionComboBox.selectedListEntry=in.selectedExecutionLibrary;
' #txt
>Proto Ps0 .type ch.ivyteam.ivy.admin.tool.security.ProcessExecutionSettings.ProcessExecutionSettingsData #txt
>Proto Ps0 .processKind RICH_DIALOG #txt
>Proto Ps0 -8 -8 16 16 16 26 #rect
>Proto Ps0 '' #fIcon
Ps0 f0 mainOut f2 tail #connect
Ps0 f2 head f1 mainIn #connect
Ps0 f3 mainOut f7 tail #connect
Ps0 f7 head f6 mainIn #connect
Ps0 f9 mainOut f10 tail #connect
Ps0 f10 head f3 mainIn #connect
Ps0 f8 mainOut f5 tail #connect
Ps0 f5 head f4 mainIn #connect
Ps0 f4 mainOut f12 tail #connect
Ps0 f12 head f11 mainIn #connect
