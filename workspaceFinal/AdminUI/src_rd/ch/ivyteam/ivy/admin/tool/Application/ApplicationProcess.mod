[Ivy]
[>Created: Wed Jul 22 11:02:19 ICT 2015]
115D7CF7F7B7BC82 3.17 #module
>Proto >Proto Collection #zClass
As0 ApplicationProcess Big #zClass
As0 RD #cInfo
As0 #process
As0 @TextInP .xml .xml #zField
As0 @TextInP .responsibility .responsibility #zField
As0 @MessageFlowInP-0n messageIn messageIn #zField
As0 @MessageFlowOutP-0n messageOut messageOut #zField
As0 @TextInP .resExport .resExport #zField
As0 @TextInP .type .type #zField
As0 @TextInP .processKind .processKind #zField
As0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
As0 @TextInP .rdData2UIAction .rdData2UIAction #zField
As0 @AnnotationInP-0n ai ai #zField
As0 @RichDialogInitStart f0 '' #zField
As0 @RichDialogProcessEnd f1 '' #zField
As0 @RichDialogProcessStep f3 '' #zField
As0 @PushWFArc f4 '' #zField
As0 @RichDialogProcessStart f5 '' #zField
As0 @RichDialog f24 '' #zField
As0 @RichDialogProcessEnd f7 '' #zField
As0 @PushWFArc f8 '' #zField
As0 @Alternative f9 '' #zField
As0 @PushWFArc f6 '' #zField
As0 @PushWFArc f11 '' #zField
As0 @RichDialogProcessStep f12 '' #zField
As0 @PushWFArc f13 '' #zField
As0 @PushWFArc f10 '' #zField
As0 @RichDialogMethodStart f14 '' #zField
As0 @RichDialogMethodStart f15 '' #zField
As0 @RichDialogEnd f16 '' #zField
As0 @RichDialogProcessStep f18 '' #zField
As0 @PushWFArc f20 '' #zField
As0 @PushWFArc f19 '' #zField
As0 @RichDialogProcessStart f21 '' #zField
As0 @PushWFArc f22 '' #zField
As0 @RichDialogProcessStart f23 '' #zField
As0 @RichDialogBroadcastStart f26 '' #zField
As0 @Alternative f27 '' #zField
As0 @PushWFArc f28 '' #zField
As0 @RichDialogProcessEnd f30 '' #zField
As0 @PushWFArc f31 '' #zField
As0 @RichDialogProcessStep f32 '' #zField
As0 @PushWFArc f33 '' #zField
As0 @PushWFArc f29 '' #zField
As0 @RichDialogMethodStart f34 '' #zField
As0 @RichDialogProcessEnd f35 '' #zField
As0 @PushWFArc f36 '' #zField
As0 @RichDialogProcessStep f37 '' #zField
As0 @PushWFArc f38 '' #zField
As0 @PushWFArc f2 '' #zField
As0 @RichDialogEnd f17 '' #zField
As0 @PushWFArc f39 '' #zField
As0 @RichDialogEnd f40 '' #zField
As0 @PushWFArc f41 '' #zField
As0 @RichDialogProcessStart f25 '' #zField
As0 @RichDialogProcessEnd f42 '' #zField
As0 @RichDialog f44 '' #zField
As0 @PushWFArc f45 '' #zField
As0 @PushWFArc f43 '' #zField
As0 @RichDialogProcessStart f46 '' #zField
As0 @RichDialog f47 '' #zField
As0 @RichDialogProcessEnd f48 '' #zField
As0 @PushWFArc f49 '' #zField
As0 @PushWFArc f50 '' #zField
As0 @RichDialogProcessStart f51 '' #zField
As0 @RichDialogProcessEnd f52 '' #zField
As0 @RichDialog f54 '' #zField
As0 @PushWFArc f55 '' #zField
As0 @PushWFArc f53 '' #zField
>Proto As0 As0 ApplicationProcess #zField
As0 f0 guid 115D7D3E5ED9AF55 #txt
As0 f0 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f0 method start(ch.ivyteam.ivy.application.IApplication) #txt
As0 f0 disableUIEvents false #txt
As0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
As0 f0 inParameterMapAction 'out.application=param.application;
' #txt
As0 f0 outParameterDecl '<> result;
' #txt
As0 f0 embeddedRdInitializations '{/activityPanel {/fieldName "activityPanel"/startMethod "start(ch.ivyteam.ivy.application.IActivity)"/parameterMapping "param.activity=callParam.application;\n"/initScript ""/userContext * }/securitySystemPanel {/fieldName "securitySystemPanel"/startMethod "start(ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.applcation=in.application;\n"/initScript ""/userContext * }/headerPane {/fieldName "headerPane"/startMethod "start(String,String)"/parameterMapping "param.iconUri=\"/Icons/Application/48\";\nparam.title=\"Application \''\" + callParam.application.getName() + \"\''\";\n"/initScript ""/userContext * }/configurationPropertiesPanel {/fieldName "configurationPropertiesPanel"/startMethod "start(ch.ivyteam.ivy.system.IConfigurationPropertyProvider)"/parameterMapping "param.propertyProvider=in.application;\n"/initScript ""/userContext * }/environmentListPanel {/fieldName "environmentListPanel"/startMethod "start(ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.application=in.application;\n"/initScript ""/userContext * }/databaseList {/fieldName "databaseList"/startMethod "start(ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.application=callParam.application;\n"/initScript ""/userContext * }}' #txt
As0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f0 46 46 20 20 13 0 #rect
As0 f0 @|RichDialogInitStartIcon #fIcon
As0 f1 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f1 43 251 26 26 14 0 #rect
As0 f1 @|RichDialogProcessEndIcon #fIcon
As0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f3 actionTable 'out=in;
' #txt
As0 f3 actionCode 'import ch.ivyteam.ivy.application.IProcessModel;

out.processModels = new List<IProcessModel>();
out.processModels.addAll(in.application.getProcessModels());
' #txt
As0 f3 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load process models</name>
        <nameStyle>19,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f3 38 148 36 24 23 -7 #rect
As0 f3 @|RichDialogProcessStepIcon #fIcon
As0 f4 expr out #txt
As0 f4 56 66 56 148 #arcP
As0 f5 guid 11889DEC64293D92 #txt
As0 f5 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f5 actionTable 'out=in;
' #txt
As0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>openProcessModel</name>
        <nameStyle>16,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f5 438 46 20 20 13 0 #rect
As0 f5 @|RichDialogProcessStartIcon #fIcon
As0 f24 targetWindow THIS #txt
As0 f24 targetDisplay content #txt
As0 f24 richDialogId ch.ivyteam.ivy.admin.tool.ProcessModel #txt
As0 f24 startMethod start(ch.ivyteam.ivy.application.IProcessModel) #txt
As0 f24 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f24 panelName ' <%=in.selectedProcessModel.getApplication().getName() %>/<%=in.selectedProcessModel.getName() %>' #txt
As0 f24 requestActionDecl '<ch.ivyteam.ivy.application.IProcessModel processModel> param;' #txt
As0 f24 requestMappingAction 'param.processModel=in.selectedProcessModel;
' #txt
As0 f24 responseActionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f24 responseMappingAction 'out=in;
' #txt
As0 f24 windowConfiguration '#Fri Apr 25 09:03:46 CEST 2008
use_default=true
' #txt
As0 f24 isAsynch true #txt
As0 f24 isInnerRd true #txt
As0 f24 isDialog false #txt
As0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open process model tab</name>
        <nameStyle>22,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f24 430 212 36 24 23 -9 #rect
As0 f24 @|RichDialogIcon #fIcon
As0 f7 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f7 435 267 26 26 14 0 #rect
As0 f7 @|RichDialogProcessEndIcon #fIcon
As0 f8 expr out #txt
As0 f8 448 236 448 267 #arcP
As0 f9 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Has selection?</name>
        <nameStyle>14,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f9 434 146 28 28 22 -7 #rect
As0 f9 @|AlternativeIcon #fIcon
As0 f6 expr in #txt
As0 f6 outCond 'in.#selectedProcessModel != null' #txt
As0 f6 448 174 448 212 #arcP
As0 f11 expr in #txt
As0 f11 434 160 435 280 #arcP
As0 f11 1 412 160 #addKink
As0 f11 2 412 280 #addKink
As0 f11 1 0.41004869075038397 0 0 #arcLabel
As0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f12 actionTable 'out=in;
out.selectedProcessModel=panel.processModelsTable.getSelectedListEntry() as ch.ivyteam.ivy.application.IProcessModel;
' #txt
As0 f12 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get selected process model</name>
        <nameStyle>26,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f12 430 100 36 24 22 -7 #rect
As0 f12 @|RichDialogProcessStepIcon #fIcon
As0 f13 expr out #txt
As0 f13 448 66 448 100 #arcP
As0 f10 expr out #txt
As0 f10 448 124 448 146 #arcP
As0 f14 guid 1189DEFF59580074 #txt
As0 f14 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f14 method close() #txt
As0 f14 disableUIEvents false #txt
As0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close()</name>
    </language>
</elementInfo>
' #txt
As0 f14 1030 46 20 20 13 0 #rect
As0 f14 @|RichDialogMethodStartIcon #fIcon
As0 f15 guid 1189DEFF8E06B797 #txt
As0 f15 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f15 method refresh() #txt
As0 f15 disableUIEvents false #txt
As0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
As0 f15 230 46 20 20 13 0 #rect
As0 f15 @|RichDialogMethodStartIcon #fIcon
As0 f16 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f16 guid 1189DF0037E3FBE2 #txt
As0 f16 675 179 26 26 14 0 #rect
As0 f16 @|RichDialogEndIcon #fIcon
As0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f18 actionTable 'out=in;
' #txt
As0 f18 actionCode 'panel.activityPanel.refresh();
panel.securitySystemPanel.refresh();
panel.databaseList.refresh();
panel.configurationPropertiesPanel.refresh();
panel.environmentListPanel.refresh();' #txt
As0 f18 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Refresh inner panels</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f18 222 148 36 24 25 -9 #rect
As0 f18 @|RichDialogProcessStepIcon #fIcon
As0 f20 expr out #txt
As0 f20 240 66 240 148 #arcP
As0 f19 expr out #txt
As0 f19 222 160 74 160 #arcP
As0 f19 0 0.38983050847457623 0 0 #arcLabel
As0 f21 guid 1197534595230677 #txt
As0 f21 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f21 actionTable 'out=in;
' #txt
As0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f21 342 46 20 20 13 0 #rect
As0 f21 @|RichDialogProcessStartIcon #fIcon
As0 f22 expr out #txt
As0 f22 352 66 240 148 #arcP
As0 f22 1 352 112 #addKink
As0 f22 2 240 112 #addKink
As0 f22 1 0.8789712258158192 0 0 #arcLabel
As0 f23 guid 119754FE323ABE50 #txt
As0 f23 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f23 actionTable 'out=in;
' #txt
As0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f23 606 342 20 20 13 0 #rect
As0 f23 @|RichDialogProcessStartIcon #fIcon
As0 f26 guid 11B3628BFC9481D7 #txt
As0 f26 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f26 broadcast applicationDeleted #txt
As0 f26 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f26 actionTable 'out=in;
out.deletedApplicationId=param.applicationId;
' #txt
As0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>applicationDeleted</name>
        <nameStyle>18,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f26 739 43 26 26 17 0 #rect
As0 f26 @|RichDialogBroadcastStartIcon #fIcon
As0 f27 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
As0 f27 738 114 28 28 14 0 #rect
As0 f27 @|AlternativeIcon #fIcon
As0 f28 expr out #txt
As0 f28 752 69 752 114 #arcP
As0 f30 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f30 739 179 26 26 14 0 #rect
As0 f30 @|RichDialogProcessEndIcon #fIcon
As0 f31 expr in #txt
As0 f31 752 142 752 179 #arcP
As0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f32 actionTable 'out=in;
out.application=null;
' #txt
As0 f32 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
As0 f32 670 116 36 24 20 -2 #rect
As0 f32 @|RichDialogProcessStepIcon #fIcon
As0 f33 expr in #txt
As0 f33 outCond 'in.application.getId() == in.deletedApplicationId' #txt
As0 f33 738 128 706 128 #arcP
As0 f33 0 0.5000000000000002 0 0 #arcLabel
As0 f29 expr out #txt
As0 f29 688 140 688 179 #arcP
As0 f34 guid 11F3CB4574292DDB #txt
As0 f34 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f34 method matchIdentifier(String,java.lang.Object) #txt
As0 f34 disableUIEvents false #txt
As0 f34 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
As0 f34 inParameterMapAction 'out.tempIdentifier=param.identifier as Number;
out.tempType=param.type;
' #txt
As0 f34 outParameterDecl '<java.lang.String name> result;
' #txt
As0 f34 outActionCode 'import ch.ivyteam.ivy.admin.tool.ApplicationTreeHelper;
if (in.tempType == ApplicationTreeHelper.TREE_ITEM_APPLICATION)
{
	if (in.tempIdentifier==in.application.getId())
	{
		result.name = panel.getName();
	}
}' #txt
As0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier(String)</name>
        <nameStyle>23,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f34 870 46 20 20 13 0 #rect
As0 f34 @|RichDialogMethodStartIcon #fIcon
As0 f35 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f35 867 91 26 26 14 0 #rect
As0 f35 @|RichDialogProcessEndIcon #fIcon
As0 f36 expr out #txt
As0 f36 880 66 880 91 #arcP
As0 f37 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f37 actionTable 'out=in;
' #txt
As0 f37 actionCode 'import java.util.Set;
import java.util.TreeSet;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

//Get environment list to display on combobox "Active Environment"
//Use TreeSet to store env. names for automatical sorting
Set<String> activeEnvSet = new TreeSet<String>();
for(IEnvironment env : in.application.getEnvironments()){
	activeEnvSet.add(env.getName());
}

in.environments.clear();
for(String activeEnv : activeEnvSet){
	in.environments.add(activeEnv);
}

if(in.application.getActiveEnvironment() == null || in.application.getActiveEnvironment() == ""){
	in.activeEnvironment = "Default";		
}else{
	in.activeEnvironment = in.application.getActiveEnvironment();
}' #txt
As0 f37 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load environments</name>
        <nameStyle>17,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f37 38 204 36 24 23 -11 #rect
As0 f37 @|RichDialogProcessStepIcon #fIcon
As0 f38 expr out #txt
As0 f38 56 172 56 204 #arcP
As0 f2 expr out #txt
As0 f2 56 228 56 251 #arcP
As0 f17 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f17 guid 121A52949AFACBCC #txt
As0 f17 1027 83 26 26 14 0 #rect
As0 f17 @|RichDialogEndIcon #fIcon
As0 f39 expr out #txt
As0 f39 1040 66 1040 83 #arcP
As0 f40 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f40 guid 121A52AC0136B315 #txt
As0 f40 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
As0 f40 603 411 26 26 14 0 #rect
As0 f40 @|RichDialogEndIcon #fIcon
As0 f41 expr out #txt
As0 f41 616 362 616 411 #arcP
As0 f25 guid 121A52B62ACA45C7 #txt
As0 f25 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f25 actionTable 'out=in;
' #txt
As0 f25 actionCode 'in.activeEnvironment = in.selectedEnvironment;
in.application.setActiveEnvironment(in.activeEnvironment);' #txt
As0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>changeEnvironment</name>
        <nameStyle>17,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f25 470 342 20 20 13 0 #rect
As0 f25 @|RichDialogProcessStartIcon #fIcon
As0 f42 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f42 467 451 26 26 14 0 #rect
As0 f42 @|RichDialogProcessEndIcon #fIcon
As0 f44 targetWindow NEW:card: #txt
As0 f44 targetDisplay TOP #txt
As0 f44 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
As0 f44 startMethod showMessage(String) #txt
As0 f44 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f44 requestActionDecl '<String message> param;' #txt
As0 f44 requestMappingAction 'param.message="The active environment of the application was changed to " + in.activeEnvironment;
' #txt
As0 f44 responseActionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f44 responseMappingAction 'out=in;
' #txt
As0 f44 windowConfiguration '{/title "Set Active Environment"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
As0 f44 isAsynch false #txt
As0 f44 isInnerRd true #txt
As0 f44 isDialog true #txt
As0 f44 userContext '* ' #txt
As0 f44 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Info</name>
        <nameStyle>4,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f44 462 396 36 24 20 -2 #rect
As0 f44 @|RichDialogIcon #fIcon
As0 f45 expr out #txt
As0 f45 480 362 480 396 #arcP
As0 f43 expr out #txt
As0 f43 480 420 480 451 #arcP
As0 f46 guid 12E395DA92CD3EA6 #txt
As0 f46 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f46 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f46 actionTable 'out=in;
' #txt
As0 f46 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>openDefaultSettings</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f46 326 342 20 20 13 0 #rect
As0 f46 @|RichDialogProcessStartIcon #fIcon
As0 f47 targetWindow NEW:card: #txt
As0 f47 targetDisplay TOP #txt
As0 f47 richDialogId ch.ivyteam.ivy.admin.tool.security.SettingsPanel #txt
As0 f47 startMethod start(ch.ivyteam.ivy.application.IApplication) #txt
As0 f47 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f47 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application> param;' #txt
As0 f47 requestMappingAction 'param.application=in.application;
' #txt
As0 f47 responseActionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f47 responseMappingAction 'out=in;
' #txt
As0 f47 windowConfiguration '{/title "Application Default Settings"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
As0 f47 isAsynch true #txt
As0 f47 isInnerRd true #txt
As0 f47 userContext '* ' #txt
As0 f47 318 396 36 24 20 -2 #rect
As0 f47 @|RichDialogIcon #fIcon
As0 f48 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f48 326 454 20 20 13 0 #rect
As0 f48 @|RichDialogProcessEndIcon #fIcon
As0 f49 expr out #txt
As0 f49 336 362 336 396 #arcP
As0 f50 expr out #txt
As0 f50 336 420 336 454 #arcP
As0 f51 guid 13419216A31E4DD5 #txt
As0 f51 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f51 actionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f51 actionTable 'out=in;
' #txt
As0 f51 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>openCalendarSettings</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f51 326 542 20 20 13 0 #rect
As0 f51 @|RichDialogProcessStartIcon #fIcon
As0 f52 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f52 326 710 20 20 13 0 #rect
As0 f52 @|RichDialogProcessEndIcon #fIcon
As0 f54 targetWindow NEW:card: #txt
As0 f54 targetDisplay TOP #txt
As0 f54 richDialogId ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings #txt
As0 f54 startMethod start(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings) #txt
As0 f54 type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
As0 f54 requestActionDecl '<ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings settings> param;' #txt
As0 f54 requestMappingAction 'param.settings=in.application.getBusinessCalendarSettings();
' #txt
As0 f54 responseActionDecl 'ch.ivyteam.ivy.admin.tool.Application.ApplicationData out;
' #txt
As0 f54 responseMappingAction 'out=in;
' #txt
As0 f54 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/businessCalendarSettings\")%>"/width 1000 /height 700 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
As0 f54 isAsynch false #txt
As0 f54 isInnerRd true #txt
As0 f54 userContext '* ' #txt
As0 f54 318 612 36 24 20 -2 #rect
As0 f54 @|RichDialogIcon #fIcon
As0 f55 expr out #txt
As0 f55 336 562 336 612 #arcP
As0 f53 expr out #txt
As0 f53 336 636 336 710 #arcP
>Proto As0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Broadcasts</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>288</swimlaneSize>
    <swimlaneSize>365</swimlaneSize>
    <swimlaneSize>206</swimlaneSize>
    <swimlaneSize>240</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneColor>-13159</swimlaneColor>
    <swimlaneColor>-26215</swimlaneColor>
</elementInfo>
' #txt
>Proto As0 .type ch.ivyteam.ivy.admin.tool.Application.ApplicationData #txt
>Proto As0 .processKind RICH_DIALOG #txt
>Proto As0 .ui2RdDataAction 'out.selectedEnvironment=panel.cboEnvironments.#selectedListEntry as String;
' #txt
>Proto As0 .rdData2UIAction 'panel.cboEnvironments.listData=in.environments;
panel.cboEnvironments.selectedListEntry=in.activeEnvironment;
panel.descriptionTextArea.text=in.#application != null ? in.application.getDescription() : "";
panel.fileDirectoryTextField.text=in.#application != null ? in.application.getFileDirectory() : "";
panel.nameTextField.text=in.#application != null ? in.application.getName() : "";
panel.ownerTextField.text=in.#application != null ? in.application.getOwnerName() : "";
panel.processModelsTable.listData=in.processModels;
panel.environmentsPane.visible=false;
panel.databasePane.visible=false;
' #txt
>Proto As0 -8 -8 16 16 16 26 #rect
>Proto As0 '' #fIcon
As0 f0 mainOut f4 tail #connect
As0 f4 head f3 mainIn #connect
As0 f24 mainOut f8 tail #connect
As0 f8 head f7 mainIn #connect
As0 f9 out f6 tail #connect
As0 f6 head f24 mainIn #connect
As0 f9 out f11 tail #connect
As0 f11 head f7 mainIn #connect
As0 f5 mainOut f13 tail #connect
As0 f13 head f12 mainIn #connect
As0 f12 mainOut f10 tail #connect
As0 f10 head f9 in #connect
As0 f15 mainOut f20 tail #connect
As0 f20 head f18 mainIn #connect
As0 f18 mainOut f19 tail #connect
As0 f19 head f3 mainIn #connect
As0 f21 mainOut f22 tail #connect
As0 f22 head f18 mainIn #connect
As0 f26 mainOut f28 tail #connect
As0 f28 head f27 in #connect
As0 f31 head f30 mainIn #connect
As0 f27 out f33 tail #connect
As0 f33 head f32 mainIn #connect
As0 f27 out f31 tail #connect
As0 f32 mainOut f29 tail #connect
As0 f29 head f16 mainIn #connect
As0 f34 mainOut f36 tail #connect
As0 f36 head f35 mainIn #connect
As0 f3 mainOut f38 tail #connect
As0 f38 head f37 mainIn #connect
As0 f37 mainOut f2 tail #connect
As0 f2 head f1 mainIn #connect
As0 f14 mainOut f39 tail #connect
As0 f39 head f17 mainIn #connect
As0 f23 mainOut f41 tail #connect
As0 f41 head f40 mainIn #connect
As0 f25 mainOut f45 tail #connect
As0 f45 head f44 mainIn #connect
As0 f44 mainOut f43 tail #connect
As0 f43 head f42 mainIn #connect
As0 f46 mainOut f49 tail #connect
As0 f49 head f47 mainIn #connect
As0 f47 mainOut f50 tail #connect
As0 f50 head f48 mainIn #connect
As0 f51 mainOut f55 tail #connect
As0 f55 head f54 mainIn #connect
As0 f54 mainOut f53 tail #connect
As0 f53 head f52 mainIn #connect
