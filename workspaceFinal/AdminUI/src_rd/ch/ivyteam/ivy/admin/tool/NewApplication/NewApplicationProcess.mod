[Ivy]
[>Created: Thu Dec 04 14:26:36 CET 2014]
116D8A61F0C90FCC 3.17 #module
>Proto >Proto Collection #zClass
Ns0 NewApplicationProcess Big #zClass
Ns0 RD #cInfo
Ns0 #process
Ns0 @MessageFlowInP-0n messageIn messageIn #zField
Ns0 @MessageFlowOutP-0n messageOut messageOut #zField
Ns0 @TextInP .resExport .resExport #zField
Ns0 @TextInP .type .type #zField
Ns0 @TextInP .processKind .processKind #zField
Ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ns0 @AnnotationInP-0n ai ai #zField
Ns0 @TextInP .xml .xml #zField
Ns0 @TextInP .responsibility .responsibility #zField
Ns0 @RichDialogInitStart f0 '' #zField
Ns0 @RichDialogProcessEnd f1 '' #zField
Ns0 @RichDialogProcessStart f3 '' #zField
Ns0 @RichDialogProcessStart f4 '' #zField
Ns0 @RichDialogProcessStep f5 '' #zField
Ns0 @RichDialogEnd f6 '' #zField
Ns0 @RichDialogEnd f7 '' #zField
Ns0 @PushWFArc f8 '' #zField
Ns0 @RichDialogProcessStep f11 '' #zField
Ns0 @PushWFArc f12 '' #zField
Ns0 @RichDialogProcessStart f14 '' #zField
Ns0 @RichDialogProcessStep f16 '' #zField
Ns0 @PushWFArc f17 '' #zField
Ns0 @RichDialogProcessEnd f18 '' #zField
Ns0 @PushWFArc f19 '' #zField
Ns0 @Alternative f10 '' #zField
Ns0 @CallSub f23 '' #zField
Ns0 @PushWFArc f24 '' #zField
Ns0 @Alternative f25 '' #zField
Ns0 @CallSub f26 '' #zField
Ns0 @PushWFArc f27 '' #zField
Ns0 @PushWFArc f29 '' #zField
Ns0 @Alternative f13 '' #zField
Ns0 @PushWFArc f9 '' #zField
Ns0 @RichDialogProcessEnd f37 '' #zField
Ns0 @RichDialog f38 '' #zField
Ns0 @PushWFArc f39 '' #zField
Ns0 @PushWFArc f40 '' #zField
Ns0 @RichDialogProcessStep f41 '' #zField
Ns0 @PushWFArc f42 '' #zField
Ns0 @PushWFArc f36 '' #zField
Ns0 @RichDialogProcessStart f43 '' #zField
Ns0 @RichDialogProcessEnd f44 '' #zField
Ns0 @RichDialog f45 '' #zField
Ns0 @PushWFArc f46 '' #zField
Ns0 @PushWFArc f47 '' #zField
Ns0 @PushWFArc f2 '' #zField
Ns0 @PushWFArc f15 '' #zField
Ns0 @Alternative f20 '' #zField
Ns0 @CallSub f30 '' #zField
Ns0 @PushWFArc f31 '' #zField
Ns0 @RichDialogProcessStep f33 '' #zField
Ns0 @PushWFArc f50 '' #zField
Ns0 @PushWFArc f51 '' #zField
Ns0 @PushWFArc f22 '' #zField
Ns0 @PushWFArc f48 '' #zField
Ns0 @Alternative f32 '' #zField
Ns0 @PushWFArc f34 '' #zField
Ns0 @PushWFArc f21 '' #zField
Ns0 @CallSub f35 '' #zField
Ns0 @PushWFArc f52 '' #zField
Ns0 @PushWFArc f49 '' #zField
Ns0 @PushWFArc f28 '' #zField
>Proto Ns0 Ns0 NewApplicationProcess #zField
Ns0 f0 guid 116D8B280274163E #txt
Ns0 f0 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f0 method createApplication() #txt
Ns0 f0 disableUIEvents false #txt
Ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ns0 f0 outParameterDecl '<ch.ivyteam.ivy.application.IApplication createdApplication> result;
' #txt
Ns0 f0 outParameterMapAction 'result.createdApplication=in.#application;
' #txt
Ns0 f0 outActionCode '
' #txt
Ns0 f0 embeddedRdInitializations '* ' #txt
Ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createApplication()</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f0 38 38 20 20 13 0 #rect
Ns0 f0 @|RichDialogInitStartIcon #fIcon
Ns0 f1 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f1 35 147 26 26 14 0 #rect
Ns0 f1 @|RichDialogProcessEndIcon #fIcon
Ns0 f3 guid 116D8B2BD7BBB037 #txt
Ns0 f3 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f3 actionTable 'out=in;
' #txt
Ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f3 310 38 20 20 13 0 #rect
Ns0 f3 @|RichDialogProcessStartIcon #fIcon
Ns0 f4 guid 116D8B2C90113D7D #txt
Ns0 f4 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f4 actionTable 'out=in;
' #txt
Ns0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f4 470 38 20 20 13 0 #rect
Ns0 f4 @|RichDialogProcessStartIcon #fIcon
Ns0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f5 actionTable 'out=in;
' #txt
Ns0 f5 actionCode 'in.application = ch.ivyteam.ivy.server.ServerFactory.getServer().getApplicationConfigurationManager().createApplication(in.name, in.description, in.fileDirectory, in.owner, "", "", in.securitySystem.getProviderName());' #txt
Ns0 f5 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create application</name>
        <nameStyle>18,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f5 462 236 36 24 26 -6 #rect
Ns0 f5 @|RichDialogProcessStepIcon #fIcon
Ns0 f6 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f6 guid 116D8B2DD82B66F5 #txt
Ns0 f6 467 667 26 26 14 0 #rect
Ns0 f6 @|RichDialogEndIcon #fIcon
Ns0 f7 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f7 guid 116D8B2E3644838A #txt
Ns0 f7 307 147 26 26 14 0 #rect
Ns0 f7 @|RichDialogEndIcon #fIcon
Ns0 f8 expr out #txt
Ns0 f8 320 58 320 147 #arcP
Ns0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f11 actionTable 'out=in;
' #txt
Ns0 f11 actionCode 'in.securitySystems.addAll(ch.ivyteam.ivy.server.ServerFactory.getServer().getSecurityManager().getExternalSecuritySystemProviders());
in.securitySystem = ch.ivyteam.ivy.server.ServerFactory.getServer().getSecurityManager().findExternalSecuritySystemProvider(ch.ivyteam.ivy.security.ISecurityConstants.IVY_SECURITY_SYSTEM_PROVIDER_NAME);
' #txt
Ns0 f11 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>initialize Security Systems</name>
        <nameStyle>27,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f11 30 92 36 24 20 -2 #rect
Ns0 f11 @|RichDialogProcessStepIcon #fIcon
Ns0 f12 expr out #txt
Ns0 f12 48 58 48 92 #arcP
Ns0 f14 guid 119858C54F3FC04E #txt
Ns0 f14 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f14 actionTable 'out=in;
' #txt
Ns0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>checkboxSelectionChanged</name>
        <nameStyle>24,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f14 38 302 20 20 13 0 #rect
Ns0 f14 @|RichDialogProcessStartIcon #fIcon
Ns0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f16 actionTable 'out=in;
' #txt
Ns0 f16 actionCode 'if (in.createWfUiProject)
{
	in.createAddonsProject = true;
}' #txt
Ns0 f16 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>If WF UI checked 
-&gt; ensure CommonRd is also checked</name>
        <nameStyle>52,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f16 30 356 36 24 24 -16 #rect
Ns0 f16 @|RichDialogProcessStepIcon #fIcon
Ns0 f17 expr out #txt
Ns0 f17 48 322 48 356 #arcP
Ns0 f18 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f18 35 411 26 26 14 0 #rect
Ns0 f18 @|RichDialogProcessEndIcon #fIcon
Ns0 f19 expr out #txt
Ns0 f19 48 380 48 411 #arcP
Ns0 f10 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create IvyAddons project?</name>
        <nameStyle>25,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f10 466 290 28 28 18 -10 #rect
Ns0 f10 @|AlternativeIcon #fIcon
Ns0 f23 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f23 processCall CreateDefaultProcessModel:createProcessModel(ch.ivyteam.ivy.application.IApplication,String,String,String) #txt
Ns0 f23 doCall true #txt
Ns0 f23 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application,java.lang.String name,java.lang.String description,java.lang.String sourceProjectDirectory> param;
' #txt
Ns0 f23 requestMappingAction 'param.application=in.application;
param.name="IvyAddons";
param.description=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/label/ivyAddons");
param.sourceProjectDirectory="projects/Addons.iar";
' #txt
Ns0 f23 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f23 responseMappingAction 'out=in;
' #txt
Ns0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create IvyAddon project</name>
        <nameStyle>23,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f23 518 324 36 24 22 -6 #rect
Ns0 f23 @|CallSubIcon #fIcon
Ns0 f24 expr in #txt
Ns0 f24 outCond in.createAddonsProject #txt
Ns0 f24 489 309 518 326 #arcP
Ns0 f24 0 0.4519263122045715 0 0 #arcLabel
Ns0 f25 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create Workflow RIA UI project?</name>
        <nameStyle>31,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f25 466 370 28 28 20 -9 #rect
Ns0 f25 @|AlternativeIcon #fIcon
Ns0 f26 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f26 processCall CreateDefaultProcessModel:createProcessModel(ch.ivyteam.ivy.application.IApplication,String,String,String) #txt
Ns0 f26 doCall true #txt
Ns0 f26 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application,java.lang.String name,java.lang.String description,java.lang.String sourceProjectDirectory> param;
' #txt
Ns0 f26 requestMappingAction 'param.application=in.application;
param.name="WorkflowUI";
param.description=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/label/workflowRIA");
param.sourceProjectDirectory="projects/RiaWorkflowUi.iar";
' #txt
Ns0 f26 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f26 responseMappingAction 'out=in;
' #txt
Ns0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create WorkflowUI (RIA version)</name>
        <nameStyle>31,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f26 518 404 36 24 22 -6 #rect
Ns0 f26 @|CallSubIcon #fIcon
Ns0 f27 expr in #txt
Ns0 f27 outCond in.createWfUiProject #txt
Ns0 f27 489 389 518 406 #arcP
Ns0 f29 expr in #txt
Ns0 f29 480 318 480 370 #arcP
Ns0 f13 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Has validation errors?</name>
        <nameStyle>22,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f13 466 130 28 28 22 -11 #rect
Ns0 f13 @|AlternativeIcon #fIcon
Ns0 f9 expr in #txt
Ns0 f9 outCond 'in.validationErrors.size() == 0' #txt
Ns0 f9 480 158 480 236 #arcP
Ns0 f37 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f37 539 203 26 26 14 0 #rect
Ns0 f37 @|RichDialogProcessEndIcon #fIcon
Ns0 f38 targetWindow NEW #txt
Ns0 f38 targetDisplay TOP #txt
Ns0 f38 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Ns0 f38 startMethod showMessage(String) #txt
Ns0 f38 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f38 requestActionDecl '<String message> param;' #txt
Ns0 f38 requestActionCode 'String message = "";
for (String error : in.validationErrors)
{
	message += error + "\n";
}
param.message = message;' #txt
Ns0 f38 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f38 responseMappingAction 'out=in;
' #txt
Ns0 f38 windowConfiguration '#Wed May 07 15:19:47 CEST 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=0
title=Could not create application
' #txt
Ns0 f38 isAsynch false #txt
Ns0 f38 isInnerRd true #txt
Ns0 f38 isDialog true #txt
Ns0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Show error dialog</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f38 534 164 36 24 20 -2 #rect
Ns0 f38 @|RichDialogIcon #fIcon
Ns0 f39 expr in #txt
Ns0 f39 490 148 534 168 #arcP
Ns0 f40 expr out #txt
Ns0 f40 552 188 552 203 #arcP
Ns0 f41 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f41 actionTable 'out=in;
' #txt
Ns0 f41 actionCode '
import ch.ivyteam.ivy.application.IApplicationConfigurationManager;
import ch.ivyteam.ivy.checking.CommonFormats;

IApplicationConfigurationManager appManager = ch.ivyteam.ivy.server.ServerFactory.getServer().getApplicationConfigurationManager();

// clear errors
in.validationErrors = new List<String>();
in.name = in.name.trim();

// check name
if (!CommonFormats.APPLICATION_PROCESS_MODEL_NAME.test(in.name))
{
	in.validationErrors.add("Name is not valid. Please use only alphanumerical characters and the underline character (_)");
}
else if (appManager.findApplication(in.name) != null)
{
	in.validationErrors.add("There is already an application with the name ''" + in.name + "''!");
}

// Check file directory
java.io.File dir = new java.io.File(in.fileDirectory);
if (in.fileDirectory.trim().length() == 0)
{
	in.validationErrors.add("The file directory must not be empty!");
}
else if (dir.exists() && (dir.isFile() || dir.list().size() > 0))
{
	in.validationErrors.add("The specified file directory already exists!");
}
else if (dir.exists()&&(!dir.canWrite()))         
{
	in.validationErrors.add("Cannot write to the specified file directory");
}
else if ((!dir.exists())&&(dir.mkdirs()==false))
{
  in.validationErrors.add("Cannot create the specified file directory");
}' #txt
Ns0 f41 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Validation</name>
        <nameStyle>10,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f41 462 84 36 24 26 -10 #rect
Ns0 f41 @|RichDialogProcessStepIcon #fIcon
Ns0 f42 expr out #txt
Ns0 f42 480 58 480 84 #arcP
Ns0 f36 expr out #txt
Ns0 f36 480 108 480 130 #arcP
Ns0 f43 guid 11DF2102984F7CDF #txt
Ns0 f43 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f43 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f43 actionTable 'out=in;
' #txt
Ns0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getDirectoryClicked</name>
        <nameStyle>19,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f43 302 302 20 20 13 0 #rect
Ns0 f43 @|RichDialogProcessStartIcon #fIcon
Ns0 f44 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f44 299 443 26 26 14 0 #rect
Ns0 f44 @|RichDialogProcessEndIcon #fIcon
Ns0 f45 targetWindow NEW #txt
Ns0 f45 targetDisplay TOP #txt
Ns0 f45 richDialogId ch.ivyteam.ivy.rd.common.ServerFileBrowser #txt
Ns0 f45 startMethod start(Boolean,String,Boolean) #txt
Ns0 f45 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f45 requestActionDecl '<Boolean onlyDirectories, String rootPath, Boolean allowNewDirectories> param;' #txt
Ns0 f45 requestMappingAction 'param.onlyDirectories=true;
param.allowNewDirectories=true;
' #txt
Ns0 f45 requestActionCode 'if (in.fileDirectory.trim().length() > 0)
{
	param.rootPath = in.fileDirectory;
}
else
{
	param.rootPath = (new java.io.File("")).getAbsolutePath();
}' #txt
Ns0 f45 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f45 responseMappingAction 'out=in;
out.fileDirectory=result.path;
' #txt
Ns0 f45 windowConfiguration '#Mon Dec 01 17:22:10 CET 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=true
width=0
title=Select Directory
' #txt
Ns0 f45 isAsynch false #txt
Ns0 f45 isInnerRd true #txt
Ns0 f45 isDialog true #txt
Ns0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start FileBrowser RD</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f45 294 372 36 24 20 -2 #rect
Ns0 f45 @|RichDialogIcon #fIcon
Ns0 f46 expr out #txt
Ns0 f46 312 322 312 372 #arcP
Ns0 f47 expr out #txt
Ns0 f47 312 396 312 443 #arcP
Ns0 f2 expr out #txt
Ns0 f2 480 260 480 290 #arcP
Ns0 f15 expr out #txt
Ns0 f15 48 116 48 147 #arcP
Ns0 f20 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create Workflow HTML UI project?</name>
        <nameStyle>32,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f20 466 530 28 28 19 -8 #rect
Ns0 f20 @|AlternativeIcon #fIcon
Ns0 f30 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f30 processCall CreateDefaultProcessModel:createProcessModel(ch.ivyteam.ivy.application.IApplication,String,String,String) #txt
Ns0 f30 doCall true #txt
Ns0 f30 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application,java.lang.String name,java.lang.String description,java.lang.String sourceProjectDirectory> param;
' #txt
Ns0 f30 requestMappingAction 'param.application=in.application;
param.name="HtmlWfUi";
param.description=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/label/workflowHTML");
param.sourceProjectDirectory="projects/HtmlWorkflowUi.iar";
' #txt
Ns0 f30 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f30 responseMappingAction 'out=in;
' #txt
Ns0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create WorkflowUI (HTML version)</name>
        <nameStyle>32,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f30 518 564 36 24 22 -6 #rect
Ns0 f30 @|CallSubIcon #fIcon
Ns0 f31 expr in #txt
Ns0 f31 outCond in.createWfUiHtmlProject #txt
Ns0 f31 489 549 518 566 #arcP
Ns0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f33 actionTable 'out=in;
' #txt
Ns0 f33 actionCode 'import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.workflow.StandardProcessType;
import ch.ivyteam.ivy.workflow.IWorkflowContext;
import ch.ivyteam.ivy.workflow.WorkflowNavigationUtil;

IProcessModelVersion pmv = in.application.findProcessModelVersion("HtmlWfUi$$1");

if (#pmv != null)
{
	String libraryId = pmv.getLibrary().getId();
	
	IWorkflowContext wf = WorkflowNavigationUtil.getWorkflowContext(in.application);
	wf.setStandardProcessImplementationLibrary(StandardProcessType.DEFAULT_PAGES_PROCESS_TYPES, libraryId);
}' #txt
Ns0 f33 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default processes to HTML WF UI</name>
        <nameStyle>35,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f33 518 612 36 24 20 -2 #rect
Ns0 f33 @|RichDialogProcessStepIcon #fIcon
Ns0 f50 expr out #txt
Ns0 f50 524 636 489 670 #arcP
Ns0 f51 expr in #txt
Ns0 f51 480 558 480 667 #arcP
Ns0 f22 expr out #txt
Ns0 f22 536 588 536 612 #arcP
Ns0 f48 expr out #txt
Ns0 f48 522 348 488 378 #arcP
Ns0 f48 0 0.5051449703176015 0 0 #arcLabel
Ns0 f32 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create Workflow JSF UI project?</name>
        <nameStyle>31,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f32 466 450 28 28 21 -8 #rect
Ns0 f32 @|AlternativeIcon #fIcon
Ns0 f34 expr in #txt
Ns0 f34 480 398 480 450 #arcP
Ns0 f21 expr out #txt
Ns0 f21 522 428 488 458 #arcP
Ns0 f21 0 0.8664384847230938 0 0 #arcLabel
Ns0 f35 type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
Ns0 f35 processCall CreateDefaultProcessModel:createProcessModel(ch.ivyteam.ivy.application.IApplication,String,String,String) #txt
Ns0 f35 doCall true #txt
Ns0 f35 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application,java.lang.String name,java.lang.String description,java.lang.String sourceProjectDirectory> param;
' #txt
Ns0 f35 requestMappingAction 'param.application=in.application;
param.name="JsfWorkflowUi";
param.description=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/label/workflowJsf");
param.sourceProjectDirectory="projects/JsfWorkflowUi.iar";
' #txt
Ns0 f35 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData out;
' #txt
Ns0 f35 responseMappingAction 'out=in;
' #txt
Ns0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create WorkflowUI (JSF version)</name>
        <nameStyle>31,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f35 518 484 36 24 20 -2 #rect
Ns0 f35 @|CallSubIcon #fIcon
Ns0 f52 expr out #txt
Ns0 f52 522 508 488 538 #arcP
Ns0 f49 expr in #txt
Ns0 f49 outCond in.createWfUiJsfProject #txt
Ns0 f49 489 469 518 486 #arcP
Ns0 f28 expr in #txt
Ns0 f28 480 478 480 530 #arcP
>Proto Ns0 .type ch.ivyteam.ivy.admin.tool.NewApplication.NewApplicationData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 .ui2RdDataAction 'out.description=panel.descriptonTextArea.text;
out.fileDirectory=panel.fileDirectoryTextField.text;
out.name=panel.nameTextField.text;
out.owner=panel.ownerTextField.text;
out.createAddonsProject=panel.createIvyAddonsCheckBox.selected;
out.createWfUiProject=panel.createWfUiCheckBox.selected;
out.createWfUiHtmlProject=panel.createWfUiHtmlCheckBox.selected;
out.createWfUiJsfProject=panel.createWfUiJsfCheckBox.selected;
out.securitySystem=panel.securityComboBox.#selectedListEntry as ch.ivyteam.ivy.security.IExternalSecuritySystemProvider;
' #txt
>Proto Ns0 .rdData2UIAction 'panel.descriptonTextArea.text=in.description;
panel.fileDirectoryTextField.text=in.fileDirectory;
panel.nameTextField.text=in.name;
panel.ownerTextField.text=in.owner;
panel.securityComboBox.listData=in.securitySystems;
panel.createIvyAddonsCheckBox.selected=in.createAddonsProject;
panel.createWfUiCheckBox.selected=in.createWfUiProject;
panel.createWfUiHtmlCheckBox.selected=in.createWfUiHtmlProject;
panel.createWfUiJsfCheckBox.selected=in.createWfUiJsfProject;
panel.securityComboBox.selectedListEntry=in.securitySystem;
' #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
Ns0 f3 mainOut f8 tail #connect
Ns0 f8 head f7 mainIn #connect
Ns0 f0 mainOut f12 tail #connect
Ns0 f12 head f11 mainIn #connect
Ns0 f14 mainOut f17 tail #connect
Ns0 f17 head f16 mainIn #connect
Ns0 f16 mainOut f19 tail #connect
Ns0 f19 head f18 mainIn #connect
Ns0 f10 out f24 tail #connect
Ns0 f24 head f23 mainIn #connect
Ns0 f25 out f27 tail #connect
Ns0 f27 head f26 mainIn #connect
Ns0 f10 out f29 tail #connect
Ns0 f29 head f25 in #connect
Ns0 f13 out f9 tail #connect
Ns0 f9 head f5 mainIn #connect
Ns0 f13 out f39 tail #connect
Ns0 f39 head f38 mainIn #connect
Ns0 f38 mainOut f40 tail #connect
Ns0 f40 head f37 mainIn #connect
Ns0 f4 mainOut f42 tail #connect
Ns0 f42 head f41 mainIn #connect
Ns0 f41 mainOut f36 tail #connect
Ns0 f36 head f13 in #connect
Ns0 f43 mainOut f46 tail #connect
Ns0 f46 head f45 mainIn #connect
Ns0 f45 mainOut f47 tail #connect
Ns0 f47 head f44 mainIn #connect
Ns0 f5 mainOut f2 tail #connect
Ns0 f2 head f10 in #connect
Ns0 f11 mainOut f15 tail #connect
Ns0 f15 head f1 mainIn #connect
Ns0 f20 out f31 tail #connect
Ns0 f31 head f30 mainIn #connect
Ns0 f33 mainOut f50 tail #connect
Ns0 f50 head f6 mainIn #connect
Ns0 f20 out f51 tail #connect
Ns0 f51 head f6 mainIn #connect
Ns0 f30 mainOut f22 tail #connect
Ns0 f22 head f33 mainIn #connect
Ns0 f23 mainOut f48 tail #connect
Ns0 f48 head f25 in #connect
Ns0 f25 out f34 tail #connect
Ns0 f34 head f32 in #connect
Ns0 f26 mainOut f21 tail #connect
Ns0 f21 head f32 in #connect
Ns0 f35 mainOut f52 tail #connect
Ns0 f52 head f20 in #connect
Ns0 f32 out f49 tail #connect
Ns0 f49 head f35 mainIn #connect
Ns0 f32 out f28 tail #connect
Ns0 f28 head f20 in #connect
