[Ivy]
[>Created: Thu May 29 14:36:14 ICT 2014]
1213F93B879259FA 3.17 #module
>Proto >Proto Collection #zClass
Es0 EnvironmentDatabaseProcess Big #zClass
Es0 RD #cInfo
Es0 #process
Es0 @TextInP .xml .xml #zField
Es0 @TextInP .responsibility .responsibility #zField
Es0 @TextInP .resExport .resExport #zField
Es0 @TextInP .type .type #zField
Es0 @TextInP .processKind .processKind #zField
Es0 @MessageFlowInP-0n messageIn messageIn #zField
Es0 @MessageFlowOutP-0n messageOut messageOut #zField
Es0 @AnnotationInP-0n ai ai #zField
Es0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Es0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Es0 @RichDialogInitStart f0 '' #zField
Es0 @RichDialogProcessEnd f1 '' #zField
Es0 @PushWFArc f2 '' #zField
Es0 @RichDialogInitStart f3 '' #zField
Es0 @PushWFArc f4 '' #zField
Es0 @RichDialogProcessStart f5 '' #zField
Es0 @RichDialogProcessEnd f8 '' #zField
Es0 @RichDialogProcessStep f6 '' #zField
Es0 @PushWFArc f7 '' #zField
Es0 @PushWFArc f9 '' #zField
Es0 @RichDialog f74 '' #zField
Es0 @RichDialogProcessStep f14 '' #zField
Es0 @Alternative f17 '' #zField
Es0 @PushWFArc f18 '' #zField
Es0 @PushWFArc f19 '' #zField
Es0 @RichDialogProcessStart f10 '' #zField
Es0 @PushWFArc f11 '' #zField
Es0 @RichDialog f12 '' #zField
Es0 @PushWFArc f13 '' #zField
Es0 @RichDialogProcessEnd f15 '' #zField
Es0 @PushWFArc f16 '' #zField
Es0 @PushWFArc f20 '' #zField
Es0 @RichDialogMethodStart f21 '' #zField
Es0 @RichDialogProcessEnd f22 '' #zField
Es0 @RichDialogProcessStart f24 '' #zField
Es0 @RichDialogProcessEnd f25 '' #zField
Es0 @RichDialogFireEvent f27 '' #zField
Es0 @PushWFArc f28 '' #zField
Es0 @PushWFArc f26 '' #zField
Es0 @RichDialogProcessStep f29 '' #zField
Es0 @PushWFArc f30 '' #zField
Es0 @PushWFArc f23 '' #zField
>Proto Es0 Es0 EnvironmentDatabaseProcess #zField
Es0 f0 guid 1213F93B8B828011 #txt
Es0 f0 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f0 method start() #txt
Es0 f0 disableUIEvents false #txt
Es0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Es0 f0 outParameterDecl '<> result;
' #txt
Es0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Es0 f0 54 38 20 20 13 0 #rect
Es0 f0 @|RichDialogInitStartIcon #fIcon
Es0 f1 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f1 51 139 26 26 14 0 #rect
Es0 f1 @|RichDialogProcessEndIcon #fIcon
Es0 f2 expr out #txt
Es0 f2 64 58 64 139 #arcP
Es0 f3 guid 1213FA2154B79C6B #txt
Es0 f3 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f3 method showDatabases(List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration>,ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Es0 f3 disableUIEvents false #txt
Es0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration> databases,ch.ivyteam.ivy.application.restricted.IEnvironment environment> param = methodEvent.getInputArguments();
' #txt
Es0 f3 inParameterMapAction 'out.databases=param.databases;
out.environment=param.environment;
' #txt
Es0 f3 outParameterDecl '<> result;
' #txt
Es0 f3 embeddedRdInitializations '{/databaseDetailsPanel {/fieldName "databaseDetailsPanel"/startMethod "showDetails(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.databaseConfig=in.selectedDatabase;\nparam.environment=in.environment;\n"/initScript ""/userContext * }}' #txt
Es0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showDatabases
(List&lt;IExternalDatabase&gt;)</name>
        <nameStyle>39,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f3 142 38 20 20 13 0 #rect
Es0 f3 @|RichDialogInitStartIcon #fIcon
Es0 f4 expr out #txt
Es0 f4 152 58 64 139 #arcP
Es0 f4 1 152 100 #addKink
Es0 f4 2 64 100 #addKink
Es0 f4 1 0.48295454545454547 0 0 #arcLabel
Es0 f5 guid 12154A7292D6CB86 #txt
Es0 f5 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f5 actionTable 'out=in;
' #txt
Es0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showDetails</name>
        <nameStyle>11,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f5 366 46 20 20 13 0 #rect
Es0 f5 @|RichDialogProcessStartIcon #fIcon
Es0 f8 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f8 363 139 26 26 14 0 #rect
Es0 f8 @|RichDialogProcessEndIcon #fIcon
Es0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f6 actionTable 'out=in;
' #txt
Es0 f6 actionCode 'if(in.#selectedDatabase != null && in.databases.contains(in.selectedDatabase)) {
	panel.databaseDetailsPanel.setDatabase(in.selectedDatabase);

	if(in.selectedDatabase.getDefaultConfiguration() == null) {
		panel.mnuResetToDefault.setEnabled(false);
	} else {
		panel.mnuResetToDefault.setEnabled(true);
	}
}
' #txt
Es0 f6 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Set
Database Details</name>
        <nameStyle>20,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f6 358 84 36 24 20 -2 #rect
Es0 f6 @|RichDialogProcessStepIcon #fIcon
Es0 f7 expr out #txt
Es0 f7 376 66 376 84 #arcP
Es0 f9 expr out #txt
Es0 f9 376 108 376 139 #arcP
Es0 f74 targetDisplay TOP #txt
Es0 f74 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Es0 f74 startMethod askQuestion(String,String,List<String>,String) #txt
Es0 f74 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f74 requestActionDecl '<String icon, String question, List<String> buttons, String defaultButton> param;' #txt
Es0 f74 requestMappingAction 'param.question="Would you like to reset to the default configuration";
param.buttons=["yes","no"];
param.defaultButton="no";
' #txt
Es0 f74 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f74 responseMappingAction 'out=in;
out.pressedButton=result.pressedButton;
' #txt
Es0 f74 windowConfiguration '{/title "Reset to Default Configuration"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Es0 f74 isAsynch false #txt
Es0 f74 isInnerRd true #txt
Es0 f74 isDialog true #txt
Es0 f74 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Asks to
restore</name>
        <nameStyle>14,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f74 358 252 36 24 20 -2 #rect
Es0 f74 @|RichDialogIcon #fIcon
Es0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f14 actionTable 'out=in;
' #txt
Es0 f14 actionCode 'import ch.ivyteam.ivy.application.IExternalDatabaseDefaultConfiguration;


if(in.selectedDatabase.getDefaultConfiguration() != null){
	IExternalDatabaseDefaultConfiguration defaultConfig = in.selectedDatabase.getDefaultConfiguration();
  defaultConfig.deleteEnvironmentConfiguration(in.selectedDatabase);
  in.selectedDatabase = defaultConfig;
}
panel.databaseDetailsPanel.setDatabase(in.selectedDatabase);
panel.setDatabases(in.environment.getExternalDatabaseConfigurations());' #txt
Es0 f14 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Reset to default
configuration</name>
        <nameStyle>30,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f14 438 332 36 24 20 -2 #rect
Es0 f14 @|RichDialogProcessStepIcon #fIcon
Es0 f17 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Es0 f17 362 330 28 28 14 0 #rect
Es0 f17 @|AlternativeIcon #fIcon
Es0 f18 expr out #txt
Es0 f18 376 276 376 330 #arcP
Es0 f19 expr in #txt
Es0 f19 outCond 'in.pressedButton == "yes"' #txt
Es0 f19 390 344 438 344 #arcP
Es0 f10 guid 122788BEAC3651A0 #txt
Es0 f10 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f10 actionTable 'out=in;
' #txt
Es0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>resetToDefault</name>
        <nameStyle>14,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f10 366 198 20 20 13 0 #rect
Es0 f10 @|RichDialogProcessStartIcon #fIcon
Es0 f11 expr out #txt
Es0 f11 376 218 376 252 #arcP
Es0 f12 targetDisplay TOP #txt
Es0 f12 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Es0 f12 startMethod showMessage(String) #txt
Es0 f12 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f12 requestActionDecl '<String message> param;' #txt
Es0 f12 requestMappingAction 'param.message="The environment configuration for the database was successfully reset to the Default configuration";
' #txt
Es0 f12 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f12 responseMappingAction 'out=in;
' #txt
Es0 f12 windowConfiguration '{/title "Information"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Es0 f12 isAsynch false #txt
Es0 f12 isInnerRd true #txt
Es0 f12 isDialog true #txt
Es0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Information</name>
        <nameStyle>11,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f12 438 396 36 24 20 -2 #rect
Es0 f12 @|RichDialogIcon #fIcon
Es0 f13 expr out #txt
Es0 f13 456 356 456 396 #arcP
Es0 f15 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f15 366 462 20 20 13 0 #rect
Es0 f15 @|RichDialogProcessEndIcon #fIcon
Es0 f16 expr in #txt
Es0 f16 376 358 376 462 #arcP
Es0 f20 expr out #txt
Es0 f20 456 420 376 462 #arcP
Es0 f20 1 456 440 #addKink
Es0 f20 2 376 440 #addKink
Es0 f20 1 0.4803399651009103 0 0 #arcLabel
Es0 f21 guid 122789DF7BD499C3 #txt
Es0 f21 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f21 method setDatabases(List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration>) #txt
Es0 f21 disableUIEvents false #txt
Es0 f21 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration> databases> param = methodEvent.getInputArguments();
' #txt
Es0 f21 inParameterMapAction 'out.databases=param.databases;
' #txt
Es0 f21 inActionCode 'if(out.#selectedDatabase != null && !out.databases.contains(out.selectedDatabase))
{
	out.selectedDatabase = null;
}' #txt
Es0 f21 outParameterDecl '<> result;
' #txt
Es0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDatabases(List&lt;IExternalDatabaseConfiguration&gt;)</name>
        <nameStyle>50,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f21 814 38 20 20 13 0 #rect
Es0 f21 @|RichDialogMethodStartIcon #fIcon
Es0 f22 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f22 814 198 20 20 13 0 #rect
Es0 f22 @|RichDialogProcessEndIcon #fIcon
Es0 f24 guid 13E16F2E73A3AAF6 #txt
Es0 f24 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f24 actionTable 'out=in;
' #txt
Es0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refreshDbList</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f24 638 206 20 20 17 -16 #rect
Es0 f24 @|RichDialogProcessStartIcon #fIcon
Es0 f25 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f25 638 350 20 20 13 0 #rect
Es0 f25 @|RichDialogProcessEndIcon #fIcon
Es0 f27 actionCode panel.fireRefreshDbList(); #txt
Es0 f27 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f27 fireEvent refreshDbList() #txt
Es0 f27 630 268 36 24 20 -2 #rect
Es0 f27 @|RichDialogFireEventIcon #fIcon
Es0 f28 expr out #txt
Es0 f28 648 226 648 268 #arcP
Es0 f26 expr out #txt
Es0 f26 648 292 648 350 #arcP
Es0 f29 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData out;
' #txt
Es0 f29 actionTable 'out=in;
' #txt
Es0 f29 actionCode 'if (in.selectedDatabase != null)
{
	panel.databaseDetailsPanel.refresh();
}' #txt
Es0 f29 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
Es0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh DB </name>
        <nameStyle>11
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f29 806 116 36 24 20 -2 #rect
Es0 f29 @|RichDialogProcessStepIcon #fIcon
Es0 f29 -13016147|-1|-16777216 #nodeStyle
Es0 f30 expr out #txt
Es0 f30 824 58 824 116 #arcP
Es0 f23 expr out #txt
Es0 f23 824 140 824 198 #arcP
>Proto Es0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>303</swimlaneSize>
    <swimlaneSize>480</swimlaneSize>
    <swimlaneSize>356</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneColor>-26215</swimlaneColor>
</elementInfo>
' #txt
>Proto Es0 .type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDatabase.EnvironmentDatabaseData #txt
>Proto Es0 .processKind RICH_DIALOG #txt
>Proto Es0 .ui2RdDataAction 'out.selectedDatabase=panel.lstDatabases.#selectedListEntry as ch.ivyteam.ivy.application.IExternalDatabaseConfiguration;
' #txt
>Proto Es0 .rdData2UIAction 'panel.databaseDetailsPanel.enabled=in.selectedDatabase != null;
panel.lstDatabases.listData=in.databases;
' #txt
>Proto Es0 -8 -8 16 16 16 26 #rect
>Proto Es0 '' #fIcon
Es0 f0 mainOut f2 tail #connect
Es0 f2 head f1 mainIn #connect
Es0 f3 mainOut f4 tail #connect
Es0 f4 head f1 mainIn #connect
Es0 f5 mainOut f7 tail #connect
Es0 f7 head f6 mainIn #connect
Es0 f6 mainOut f9 tail #connect
Es0 f9 head f8 mainIn #connect
Es0 f74 mainOut f18 tail #connect
Es0 f18 head f17 in #connect
Es0 f17 out f19 tail #connect
Es0 f19 head f14 mainIn #connect
Es0 f10 mainOut f11 tail #connect
Es0 f11 head f74 mainIn #connect
Es0 f14 mainOut f13 tail #connect
Es0 f13 head f12 mainIn #connect
Es0 f17 out f16 tail #connect
Es0 f16 head f15 mainIn #connect
Es0 f12 mainOut f20 tail #connect
Es0 f20 head f15 mainIn #connect
Es0 f24 mainOut f28 tail #connect
Es0 f28 head f27 mainIn #connect
Es0 f27 mainOut f26 tail #connect
Es0 f26 head f25 mainIn #connect
Es0 f21 mainOut f30 tail #connect
Es0 f30 head f29 mainIn #connect
Es0 f29 mainOut f23 tail #connect
Es0 f23 head f22 mainIn #connect
