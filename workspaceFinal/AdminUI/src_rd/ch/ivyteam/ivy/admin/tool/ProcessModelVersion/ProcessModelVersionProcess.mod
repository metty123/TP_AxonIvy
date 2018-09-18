[Ivy]
[>Created: Wed Feb 17 13:39:38 ICT 2016]
116D422E7E6ECE47 3.18 #module
>Proto >Proto Collection #zClass
Ps0 ProcessModelVersionProcess Big #zClass
Ps0 RD #cInfo
Ps0 #process
Ps0 @TextInP .xml .xml #zField
Ps0 @TextInP .responsibility .responsibility #zField
Ps0 @TextInP .resExport .resExport #zField
Ps0 @TextInP .type .type #zField
Ps0 @TextInP .processKind .processKind #zField
Ps0 @AnnotationInP-0n ai ai #zField
Ps0 @MessageFlowInP-0n messageIn messageIn #zField
Ps0 @MessageFlowOutP-0n messageOut messageOut #zField
Ps0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ps0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ps0 @RichDialogInitStart f0 '' #zField
Ps0 @RichDialogProcessEnd f1 '' #zField
Ps0 @RichDialogProcessStart f3 '' #zField
Ps0 @RichDialogProcessStep f8 '' #zField
Ps0 @RichDialogProcessStep f10 '' #zField
Ps0 @PushWFArc f11 '' #zField
Ps0 @PushWFArc f2 '' #zField
Ps0 @RichDialogMethodStart f12 '' #zField
Ps0 @RichDialogMethodStart f13 '' #zField
Ps0 @RichDialogEnd f15 '' #zField
Ps0 @RichDialogProcessStep f17 '' #zField
Ps0 @PushWFArc f18 '' #zField
Ps0 @RichDialogProcessStart f31 '' #zField
Ps0 @PushWFArc f32 '' #zField
Ps0 @RichDialogProcessStart f33 '' #zField
Ps0 @PushWFArc f34 '' #zField
Ps0 @RichDialogBroadcastStart f45 '' #zField
Ps0 @RichDialogBroadcastStart f46 '' #zField
Ps0 @RichDialogProcessEnd f47 '' #zField
Ps0 @RichDialogProcessStep f48 '' #zField
Ps0 @Alternative f49 '' #zField
Ps0 @Alternative f50 '' #zField
Ps0 @PushWFArc f51 '' #zField
Ps0 @PushWFArc f53 '' #zField
Ps0 @PushWFArc f55 '' #zField
Ps0 @PushWFArc f52 '' #zField
Ps0 @PushWFArc f54 '' #zField
Ps0 @PushWFArc f56 '' #zField
Ps0 @RichDialogFireEvent f58 '' #zField
Ps0 @RichDialogBroadcastStart f65 '' #zField
Ps0 @PushWFArc f66 '' #zField
Ps0 @RichDialogBroadcastStart f67 '' #zField
Ps0 @PushWFArc f68 '' #zField
Ps0 @RichDialogProcessEnd f69 '' #zField
Ps0 @RichDialogMethodStart f70 '' #zField
Ps0 @PushWFArc f71 '' #zField
Ps0 @RichDialog f19 '' #zField
Ps0 @PushWFArc f5 '' #zField
Ps0 @PushWFArc f6 '' #zField
Ps0 @PushWFArc f20 '' #zField
Ps0 @RichDialogEnd f22 '' #zField
Ps0 @PushWFArc f23 '' #zField
Ps0 @RichDialogEnd f16 '' #zField
Ps0 @PushWFArc f24 '' #zField
Ps0 @RichDialogProcessStart f38 '' #zField
Ps0 @RichDialogProcessEnd f39 '' #zField
Ps0 @RichDialog f41 '' #zField
Ps0 @PushWFArc f42 '' #zField
Ps0 @PushWFArc f40 '' #zField
Ps0 @PushWFArc f9 '' #zField
Ps0 @PushWFArc f4 '' #zField
>Proto Ps0 Ps0 ProcessModelVersionProcess #zField
Ps0 f0 guid 116D42B4DA1692C0 #txt
Ps0 f0 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f0 method start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ps0 f0 disableUIEvents false #txt
Ps0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param = methodEvent.getInputArguments();
' #txt
Ps0 f0 inParameterMapAction 'out.application=param.processModelVersion.getApplication();
out.processModel=param.processModelVersion.getProcessModel();
out.processModelVersion=param.processModelVersion;
' #txt
Ps0 f0 inActionCode 'if (param.processModelVersion.getLibrary()!=null)
{
  out.libraryId = param.processModelVersion.getLibrary().getId();
}' #txt
Ps0 f0 outParameterDecl '<> result;
' #txt
Ps0 f0 embeddedRdInitializations '{/releaseStatePanel {/fieldName "releaseStatePanel"/startMethod "start(ch.ivyteam.ivy.application.IProcessModelVersion)"/parameterMapping "param.processModelVersion=callParam.processModelVersion;\n"/initScript ""}/headerPane {/fieldName "headerPane"/startMethod "start(String,String)"/parameterMapping "param.iconUri=\"/Icons/ProcessModelVersion/48\";\n"/initScript ""}/activityPanel {/fieldName "activityPanel"/startMethod "start(ch.ivyteam.ivy.application.IActivity,Boolean)"/parameterMapping "param.activity=callParam.processModelVersion;\nparam.isForPmv=true;\n"/initScript ""}}' #txt
Ps0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModelVersion)</name>
        <nameStyle>27,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f0 54 30 20 20 13 0 #rect
Ps0 f0 @|RichDialogInitStartIcon #fIcon
Ps0 f1 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f1 51 235 26 26 14 0 #rect
Ps0 f1 @|RichDialogProcessEndIcon #fIcon
Ps0 f3 guid 116D451AD84D8906 #txt
Ps0 f3 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f3 actionTable 'out=in;
' #txt
Ps0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deploy</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f3 606 126 20 20 13 0 #rect
Ps0 f3 @|RichDialogProcessStartIcon #fIcon
Ps0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f8 actionTable 'out=in;
' #txt
Ps0 f8 actionCode 'import ch.ivyteam.ivy.application.ILibrary;
import ch.ivyteam.ivy.application.ILibrarySpecification;
import ch.ivyteam.ivy.application.IProcessModelVersion;

// Library ID
if (in.processModelVersion.getLibrary() != null)
{
  out.libraryId = in.processModelVersion.getLibrary().getId() + " (Version: "+in.processModelVersion.getLibrary().getQualifiedVersion()+")";
}

' #txt
Ps0 f8 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get library id</name>
        <nameStyle>14,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f8 46 124 36 24 26 1 #rect
Ps0 f8 @|RichDialogProcessStepIcon #fIcon
Ps0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f10 actionTable 'out=in;
' #txt
Ps0 f10 actionCode 'import ch.ivyteam.ivy.workflow.WorkflowNavigationUtil;
import ch.ivyteam.ivy.workflow.IWorkflowProcessModelVersion;
IWorkflowProcessModelVersion wpmv = WorkflowNavigationUtil.getWorkflowProcessModelVersion(in.processModelVersion);
out.runningCasesCount = wpmv.getWorkflowContext().getRunningCasesCount(in.processModelVersion);
' #txt
Ps0 f10 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get number of running cases</name>
        <nameStyle>27,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f10 46 172 36 24 21 8 #rect
Ps0 f10 @|RichDialogProcessStepIcon #fIcon
Ps0 f11 expr out #txt
Ps0 f11 64 148 64 172 #arcP
Ps0 f2 expr out #txt
Ps0 f2 64 196 64 235 #arcP
Ps0 f12 guid 1189E134EBBC97FD #txt
Ps0 f12 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f12 method close() #txt
Ps0 f12 disableUIEvents false #txt
Ps0 f12 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f12 outParameterDecl '<> result;
' #txt
Ps0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close()</name>
    </language>
</elementInfo>
' #txt
Ps0 f12 318 278 20 20 12 -20 #rect
Ps0 f12 @|RichDialogMethodStartIcon #fIcon
Ps0 f13 guid 1189E13563D70087 #txt
Ps0 f13 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f13 method refresh() #txt
Ps0 f13 disableUIEvents false #txt
Ps0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Ps0 f13 478 38 20 20 13 0 #rect
Ps0 f13 @|RichDialogMethodStartIcon #fIcon
Ps0 f15 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f15 guid 1189E1379C1254E7 #txt
Ps0 f15 843 243 26 26 14 0 #rect
Ps0 f15 @|RichDialogEndIcon #fIcon
Ps0 f17 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f17 actionTable 'out=in;
' #txt
Ps0 f17 actionCode 'panel.activityPanel.refresh();
panel.releaseStatePanel.refresh();
' #txt
Ps0 f17 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Refresh inner panels</name>
        <nameStyle>20,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f17 470 84 36 24 14 -32 #rect
Ps0 f17 @|RichDialogProcessStepIcon #fIcon
Ps0 f18 expr out #txt
Ps0 f18 488 58 488 84 #arcP
Ps0 f31 guid 1197535B38DE580E #txt
Ps0 f31 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f31 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f31 actionTable 'out=in;
' #txt
Ps0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f31 846 86 20 20 13 0 #rect
Ps0 f31 @|RichDialogProcessStartIcon #fIcon
Ps0 f32 expr out #txt
Ps0 f32 846 96 506 96 #arcP
Ps0 f33 guid 1197551262FA0C3E #txt
Ps0 f33 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f33 actionTable 'out=in;
' #txt
Ps0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f33 846 150 20 20 13 0 #rect
Ps0 f33 @|RichDialogProcessStartIcon #fIcon
Ps0 f34 expr out #txt
Ps0 f34 856 170 856 243 #arcP
Ps0 f45 guid 11B363604332DB1B #txt
Ps0 f45 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f45 broadcast applicationDeleted #txt
Ps0 f45 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f45 actionTable 'out=in;
out.deletedApplicationId=param.applicationId;
' #txt
Ps0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>applicationDeleted</name>
        <nameStyle>18,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f45 958 86 20 20 13 -18 #rect
Ps0 f45 @|RichDialogBroadcastStartIcon #fIcon
Ps0 f46 guid 11B36360EC0A75FB #txt
Ps0 f46 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f46 broadcast processModelDeleted #txt
Ps0 f46 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f46 actionTable 'out=in;
out.deletedProcessModelId=param.processModelId;
' #txt
Ps0 f46 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>processModelDeleted</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f46 1174 86 20 20 3 -27 #rect
Ps0 f46 @|RichDialogBroadcastStartIcon #fIcon
Ps0 f47 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f47 1059 147 26 26 14 0 #rect
Ps0 f47 @|RichDialogProcessEndIcon #fIcon
Ps0 f48 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f48 actionTable 'out=in;
out.processModelVersion=null;
' #txt
Ps0 f48 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f48 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ps0 f48 1054 260 36 24 20 -2 #rect
Ps0 f48 @|RichDialogProcessStepIcon #fIcon
Ps0 f49 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f49 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ps0 f49 954 146 28 28 14 0 #rect
Ps0 f49 @|AlternativeIcon #fIcon
Ps0 f50 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f50 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ps0 f50 1170 146 28 28 14 0 #rect
Ps0 f50 @|AlternativeIcon #fIcon
Ps0 f51 expr out #txt
Ps0 f51 968 106 968 146 #arcP
Ps0 f53 expr out #txt
Ps0 f53 1184 106 1184 146 #arcP
Ps0 f55 expr in #txt
Ps0 f55 outCond 'in.application.getId() == in.deletedApplicationId' #txt
Ps0 f55 968 174 1054 272 #arcP
Ps0 f55 1 968 272 #addKink
Ps0 f55 0 0.945539569957652 0 0 #arcLabel
Ps0 f52 expr in #txt
Ps0 f52 outCond in.processModel.getId()==in.deletedProcessModelId #txt
Ps0 f52 1184 174 1090 272 #arcP
Ps0 f52 1 1184 272 #addKink
Ps0 f52 0 0.9785445395015995 0 0 #arcLabel
Ps0 f54 expr in #txt
Ps0 f54 982 160 1059 160 #arcP
Ps0 f56 expr in #txt
Ps0 f56 1170 160 1085 160 #arcP
Ps0 f58 actionDecl 'Number index;
' #txt
Ps0 f58 actionTable 'index=in.processModelVersion.getId();
' #txt
Ps0 f58 actionCode panel.fireProcessModelVersionDeployed(index); #txt
Ps0 f58 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f58 fireEvent processModelVersionDeployed(Number) #txt
Ps0 f58 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>inform other panels	</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f58 598 220 36 25 20 -2 #rect
Ps0 f58 @|RichDialogFireEventIcon #fIcon
Ps0 f65 guid 11F188CD8922CB67 #txt
Ps0 f65 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f65 broadcast processModelVersionDeleted #txt
Ps0 f65 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f65 actionTable 'out=in;
out.deletedProcessModelVersionID=param.id;
' #txt
Ps0 f65 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>processModelVersionDeleted</name>
        <nameStyle>26,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f65 446 222 20 21 -137 -32 #rect
Ps0 f65 @|RichDialogBroadcastStartIcon #fIcon
Ps0 f66 expr out #txt
Ps0 f66 466 231 488 108 #arcP
Ps0 f66 1 488 231 #addKink
Ps0 f66 1 0.3189191948131514 0 0 #arcLabel
Ps0 f67 guid 11F36459ADB1A4B4 #txt
Ps0 f67 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f67 broadcast processModelVersionReleased #txt
Ps0 f67 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f67 actionTable 'out=in;
' #txt
Ps0 f67 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>processModelVersionReleased</name>
        <nameStyle>27,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f67 446 166 20 20 -144 -28 #rect
Ps0 f67 @|RichDialogBroadcastStartIcon #fIcon
Ps0 f68 expr out #txt
Ps0 f68 466 176 488 108 #arcP
Ps0 f68 1 488 176 #addKink
Ps0 f68 0 0.8773303152854074 0 0 #arcLabel
Ps0 f69 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f69 407 359 19 19 14 0 #rect
Ps0 f69 @|RichDialogProcessEndIcon #fIcon
Ps0 f70 guid 11F423218133636D #txt
Ps0 f70 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f70 method matchIdentifier(String,java.lang.Object) #txt
Ps0 f70 disableUIEvents false #txt
Ps0 f70 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
Ps0 f70 inParameterMapAction 'out.tempIdentifier=param.identifier as  Number;
out.tempType=param.type;
' #txt
Ps0 f70 outParameterDecl '<java.lang.String name> result;
' #txt
Ps0 f70 outActionCode 'if (in.tempType.equalsIgnoreCase(ApplicationTreeHelper.TREE_ITEM_PMV))
{
	if (in.tempIdentifier==in.processModelVersion.getId())
	{
		result.name = panel.getName();
	}
}' #txt
Ps0 f70 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier(String, IObject)</name>
        <nameStyle>32,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f70 406 278 20 20 14 -19 #rect
Ps0 f70 @|RichDialogMethodStartIcon #fIcon
Ps0 f71 expr out #txt
Ps0 f71 415 297 415 358 #arcP
Ps0 f19 targetDisplay TOP #txt
Ps0 f19 richDialogId ch.ivyteam.ivy.admin.tool.deployment.DeploymentWizard #txt
Ps0 f19 startMethod start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ps0 f19 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f19 requestActionDecl '<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param;' #txt
Ps0 f19 requestMappingAction 'param.processModelVersion=in.processModelVersion;
' #txt
Ps0 f19 responseActionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f19 responseMappingAction 'out=in;
' #txt
Ps0 f19 windowConfiguration '{/title "Deployment Wizard: <%=in.application.getName()%>:<%=in.processModelVersion.getVersionName()%>"/width 600 /height 400 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ps0 f19 isAsynch false #txt
Ps0 f19 isInnerRd true #txt
Ps0 f19 isDialog true #txt
Ps0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Deployment Wizard</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f19 598 164 36 24 20 -2 #rect
Ps0 f19 @|RichDialogIcon #fIcon
Ps0 f5 expr out #txt
Ps0 f5 616 146 616 164 #arcP
Ps0 f6 expr out #txt
Ps0 f6 616 188 616 219 #arcP
Ps0 f20 expr out #txt
Ps0 f20 598 231 488 108 #arcP
Ps0 f20 1 488 231 #addKink
Ps0 f20 1 0.02234595559358132 0 0 #arcLabel
Ps0 f22 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f22 guid 13CF1973569EF89D #txt
Ps0 f22 318 358 20 20 13 0 #rect
Ps0 f22 @|RichDialogEndIcon #fIcon
Ps0 f23 expr out #txt
Ps0 f23 328 298 328 358 #arcP
Ps0 f16 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f16 guid 13CF1987360AB2ED #txt
Ps0 f16 1062 326 20 20 13 0 #rect
Ps0 f16 @|RichDialogEndIcon #fIcon
Ps0 f24 expr out #txt
Ps0 f24 1072 284 1072 326 #arcP
Ps0 f38 guid 13D62AE935B549EB #txt
Ps0 f38 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f38 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f38 actionTable 'out=in;
' #txt
Ps0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>open Library Details</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f38 1334 70 20 20 17 -13 #rect
Ps0 f38 @|RichDialogProcessStartIcon #fIcon
Ps0 f39 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f39 1334 270 20 20 13 0 #rect
Ps0 f39 @|RichDialogProcessEndIcon #fIcon
Ps0 f41 targetWindow NEW:card: #txt
Ps0 f41 targetDisplay TOP #txt
Ps0 f41 richDialogId ch.ivyteam.ivy.admin.tool.LibraryDetails #txt
Ps0 f41 startMethod startWithPMV(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ps0 f41 type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
Ps0 f41 requestActionDecl '<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param;' #txt
Ps0 f41 requestMappingAction 'param.processModelVersion=in.processModelVersion;
' #txt
Ps0 f41 responseActionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData out;
' #txt
Ps0 f41 responseMappingAction 'out=in;
' #txt
Ps0 f41 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/dialogTitle/libraryDetail\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ps0 f41 isAsynch false #txt
Ps0 f41 isInnerRd true #txt
Ps0 f41 userContext '* ' #txt
Ps0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show Library Details</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f41 1326 148 36 24 19 -32 #rect
Ps0 f41 @|RichDialogIcon #fIcon
Ps0 f42 expr out #txt
Ps0 f42 1344 90 1344 148 #arcP
Ps0 f40 expr out #txt
Ps0 f40 1344 172 1344 270 #arcP
Ps0 f9 expr out #txt
Ps0 f9 470 96 82 129 #arcP
Ps0 f9 1 168 96 #addKink
Ps0 f9 0 0.6325539615196928 0 0 #arcLabel
Ps0 f4 expr out #txt
Ps0 f4 64 50 64 124 #arcP
>Proto Ps0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>START</swimlaneLabel>
        <swimlaneLabel>METHOD</swimlaneLabel>
        <swimlaneLabel>EVENT</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>296</swimlaneSize>
    <swimlaneSize>512</swimlaneSize>
    <swimlaneSize>696</swimlaneSize>
    <swimlaneColor>-3342337</swimlaneColor>
    <swimlaneColor>-10066177</swimlaneColor>
    <swimlaneColor>-16737895</swimlaneColor>
</elementInfo>
' #txt
>Proto Ps0 .type ch.ivyteam.ivy.admin.tool.ProcessModelVersion.ProcessModelVersionData #txt
>Proto Ps0 .processKind RICH_DIALOG #txt
>Proto Ps0 .rdData2UIAction 'panel.deployButton.enabled=in.#processModelVersion != null ? (in.processModelVersion.getActivityOperationState() == ch.ivyteam.ivy.application.ActivityOperationState.INACTIVE
&& in.processModelVersion.getReleaseState() != ch.ivyteam.ivy.application.ReleaseState.DELETED) : false;
panel.deploymentDirectoryTextField.text=in.#processModelVersion != null ? in.processModelVersion.getProjectDirectory() : "";
panel.descriptionTextArea.text=in.#processModelVersion != null ? in.processModelVersion.getDescription() : "";
panel.headerPane.title=in.#processModelVersion != null ? "Process Model Version ''" + in.processModelVersion.getName() + "''" : "";
panel.lastModifiedTextField.text=in.#processModelVersion != null ? (in.processModelVersion.getLastChangeDate() as DateTime).format("full") : "";
panel.libraryTextField.text=in.libraryId;
panel.nameTextField.text=in.#processModelVersion != null ? in.processModelVersion.getName() : "";
panel.runningCasesTextField.text=in.runningCasesCount.toString();
panel.versionTextField.text=in.#processModelVersion != null ? in.processModelVersion.getVersionNumber().toString() : "";
' #txt
>Proto Ps0 -8 -8 16 16 16 26 #rect
>Proto Ps0 '' #fIcon
Ps0 f8 mainOut f11 tail #connect
Ps0 f11 head f10 mainIn #connect
Ps0 f10 mainOut f2 tail #connect
Ps0 f2 head f1 mainIn #connect
Ps0 f13 mainOut f18 tail #connect
Ps0 f18 head f17 mainIn #connect
Ps0 f31 mainOut f32 tail #connect
Ps0 f32 head f17 mainIn #connect
Ps0 f33 mainOut f34 tail #connect
Ps0 f34 head f15 mainIn #connect
Ps0 f45 mainOut f51 tail #connect
Ps0 f51 head f49 in #connect
Ps0 f46 mainOut f53 tail #connect
Ps0 f53 head f50 in #connect
Ps0 f49 out f55 tail #connect
Ps0 f55 head f48 mainIn #connect
Ps0 f50 out f52 tail #connect
Ps0 f52 head f48 mainIn #connect
Ps0 f49 out f54 tail #connect
Ps0 f54 head f47 mainIn #connect
Ps0 f50 out f56 tail #connect
Ps0 f56 head f47 mainIn #connect
Ps0 f65 mainOut f66 tail #connect
Ps0 f66 head f17 mainIn #connect
Ps0 f67 mainOut f68 tail #connect
Ps0 f68 head f17 mainIn #connect
Ps0 f70 mainOut f71 tail #connect
Ps0 f71 head f69 mainIn #connect
Ps0 f3 mainOut f5 tail #connect
Ps0 f5 head f19 mainIn #connect
Ps0 f19 mainOut f6 tail #connect
Ps0 f6 head f58 mainIn #connect
Ps0 f58 mainOut f20 tail #connect
Ps0 f20 head f17 mainIn #connect
Ps0 f12 mainOut f23 tail #connect
Ps0 f23 head f22 mainIn #connect
Ps0 f48 mainOut f24 tail #connect
Ps0 f24 head f16 mainIn #connect
Ps0 f38 mainOut f42 tail #connect
Ps0 f42 head f41 mainIn #connect
Ps0 f41 mainOut f40 tail #connect
Ps0 f40 head f39 mainIn #connect
Ps0 f17 mainOut f9 tail #connect
Ps0 f9 head f8 mainIn #connect
Ps0 f0 mainOut f4 tail #connect
Ps0 f4 head f8 mainIn #connect
