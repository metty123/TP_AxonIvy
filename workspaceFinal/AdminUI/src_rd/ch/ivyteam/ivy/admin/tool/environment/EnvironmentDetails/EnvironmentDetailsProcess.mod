[Ivy]
[>Created: Mon Jun 06 18:03:48 ICT 2016]
1208AE23BDB5CBFD 3.18 #module
>Proto >Proto Collection #zClass
Es0 EnvironmentDetailsProcess Big #zClass
Es0 RD #cInfo
Es0 #process
Es0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Es0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Es0 @TextInP .resExport .resExport #zField
Es0 @TextInP .type .type #zField
Es0 @TextInP .processKind .processKind #zField
Es0 @AnnotationInP-0n ai ai #zField
Es0 @MessageFlowInP-0n messageIn messageIn #zField
Es0 @MessageFlowOutP-0n messageOut messageOut #zField
Es0 @TextInP .xml .xml #zField
Es0 @TextInP .responsibility .responsibility #zField
Es0 @RichDialogProcessEnd f1 '' #zField
Es0 @RichDialogInitStart f3 '' #zField
Es0 @RichDialogInitStart f5 '' #zField
Es0 @RichDialogProcessStart f7 '' #zField
Es0 @RichDialogEnd f8 '' #zField
Es0 @RichDialogProcessStart f10 '' #zField
Es0 @PushWFArc f11 '' #zField
Es0 @Alternative f12 '' #zField
Es0 @RichDialogProcessStep f14 '' #zField
Es0 @PushWFArc f15 '' #zField
Es0 @PushWFArc f9 '' #zField
Es0 @PushWFArc f16 '' #zField
Es0 @RichDialogInitStart f17 '' #zField
Es0 @RichDialogProcessStep f19 '' #zField
Es0 @PushWFArc f20 '' #zField
Es0 @PushWFArc f18 '' #zField
Es0 @PushWFArc f6 '' #zField
Es0 @RichDialogMethodStart f21 '' #zField
Es0 @RichDialogProcessEnd f22 '' #zField
Es0 @PushWFArc f23 '' #zField
Es0 @RichDialogBroadcastStart f24 '' #zField
Es0 @RichDialogBroadcastStart f25 '' #zField
Es0 @Alternative f26 '' #zField
Es0 @PushWFArc f27 '' #zField
Es0 @RichDialogEnd f29 '' #zField
Es0 @PushWFArc f30 '' #zField
Es0 @RichDialogProcessEnd f31 '' #zField
Es0 @PushWFArc f32 '' #zField
Es0 @Alternative f28 '' #zField
Es0 @PushWFArc f33 '' #zField
Es0 @PushWFArc f34 '' #zField
Es0 @PushWFArc f35 '' #zField
Es0 @RichDialogProcessStart f36 '' #zField
Es0 @RichDialogProcessEnd f37 '' #zField
Es0 @RichDialogProcessStep f39 '' #zField
Es0 @PushWFArc f40 '' #zField
Es0 @PushWFArc f38 '' #zField
Es0 @Alternative f41 '' #zField
Es0 @PushWFArc f42 '' #zField
Es0 @RichDialog f43 '' #zField
Es0 @PushWFArc f44 '' #zField
Es0 @PushWFArc f13 '' #zField
Es0 @RichDialogProcessEnd f46 '' #zField
Es0 @PushWFArc f47 '' #zField
Es0 @PushWFArc f4 '' #zField
Es0 @RichDialogProcessStep f48 '' #zField
Es0 @PushWFArc f50 '' #zField
Es0 @RichDialogProcessStart f45 '' #zField
Es0 @PushWFArc f49 '' #zField
Es0 @RichDialogProcessStart f0 '' #zField
Es0 @RichDialogProcessStep f51 '' #zField
Es0 @PushWFArc f52 '' #zField
Es0 @PushWFArc f2 '' #zField
>Proto Es0 Es0 EnvironmentDetailsProcess #zField
Es0 f1 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f1 27 139 26 26 14 0 #rect
Es0 f1 @|RichDialogProcessEndIcon #fIcon
Es0 f3 guid 1208AF604AD3AA73 #txt
Es0 f3 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f3 method showDetails(ch.ivyteam.ivy.application.restricted.IEnvironment,ch.ivyteam.ivy.application.IApplication) #txt
Es0 f3 disableUIEvents false #txt
Es0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.restricted.IEnvironment environment,ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Es0 f3 inParameterMapAction 'out.application=param.application;
out.createNew=false;
out.description=param.environment.getDescription();
out.environment=param.environment;
out.isDefault=param.environment.isDefault();
out.name=param.environment.getName();
' #txt
Es0 f3 outParameterDecl '<> result;
' #txt
Es0 f3 embeddedRdInitializations '{/webServiceListPanel {/fieldName "webServiceListPanel"/startMethod "showWebServices(List<ch.ivyteam.ivy.application.restricted.IWebService>,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.webservices=callParam.environment.getWebServices();\nparam.environment=callParam.environment;\n"/initScript ""/userContext * }/environmentDatabasePanel {/fieldName "environmentDatabasePanel"/startMethod "showDatabases(List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration>,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.databases=callParam.environment.getExternalDatabaseConfigurations();\nparam.environment=callParam.environment;\n"/initScript ""/userContext * }/restClientsPanel {/fieldName "restClientsPanel"/startMethod "start(ch.ivyteam.ivy.application.restricted.IEnvironment,ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.environment=callParam.environment;\nparam.application=callParam.application;\n"/initScript ""/userContext * }/globalVariableListPanel {/fieldName "globalVariableListPanel"/startMethod "showGlobalVariables(List<ch.ivyteam.ivy.application.restricted.IGlobalVariable>,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.globalVariables=callParam.environment.getGlobalVariables();\nparam.environment=callParam.environment;\n"/initScript ""/userContext * }/tabHeaderBarPanel {/fieldName "tabHeaderBarPanel"/startMethod "start(String,String,Boolean,Boolean)"/parameterMapping "param.iconUri=\"/Icons/Environment/48\";\nparam.title=\"Environment \" + in.environment.getName();\nparam.showCloseButton=true;\nparam.showRefreshButton=true;\n"/initScript ""/userContext * }/environmentCalendarPanel {/fieldName "environmentCalendarPanel"/startMethod "showCalendar(ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.environment=callParam.environment;\n"/initScript ""/userContext * }}' #txt
Es0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showDetails(IEnvironment, IApplication)</name>
        <nameStyle>39,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f3 30 46 20 20 13 0 #rect
Es0 f3 @|RichDialogInitStartIcon #fIcon
Es0 f5 guid 1208AFC442AA902C #txt
Es0 f5 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f5 method createEnvironment(ch.ivyteam.ivy.application.IApplication,ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Es0 f5 disableUIEvents false #txt
Es0 f5 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application,ch.ivyteam.ivy.application.restricted.IEnvironment environment> param = methodEvent.getInputArguments();
' #txt
Es0 f5 inParameterMapAction 'out.application=param.application;
out.createNew=true;
out.environment=param.environment;
' #txt
Es0 f5 outParameterDecl '<ch.ivyteam.ivy.application.restricted.IEnvironment environment> result;
' #txt
Es0 f5 outParameterMapAction 'result.environment=in.environment;
' #txt
Es0 f5 embeddedRdInitializations '{/webServiceListPanel {/fieldName "webServiceListPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/environmentDatabasePanel {/fieldName "environmentDatabasePanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/restClientsPanel {/fieldName "restClientsPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/globalVariableListPanel {/fieldName "globalVariableListPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/tabHeaderBarPanel {/fieldName "tabHeaderBarPanel"/startMethod "start(String,String,Boolean,Boolean)"/parameterMapping "param.iconUri=\"/Icons/Environment/48\";\nparam.title=\"New Environment\";\nparam.showCloseButton=false;\nparam.showRefreshButton=false;\n"/initScript ""/userContext * }/environmentCalendarPanel {/fieldName "environmentCalendarPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }}' #txt
Es0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createEnvironment
(IApplication)</name>
        <nameStyle>32,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f5 119 142 18 20 13 0 #rect
Es0 f5 @|RichDialogInitStartIcon #fIcon
Es0 f7 guid 1208AFE8E7754037 #txt
Es0 f7 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f7 actionTable 'out=in;
' #txt
Es0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f7 326 30 20 20 13 0 #rect
Es0 f7 @|RichDialogProcessStartIcon #fIcon
Es0 f8 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f8 guid 1208AFED0345F917 #txt
Es0 f8 323 203 26 26 14 0 #rect
Es0 f8 @|RichDialogEndIcon #fIcon
Es0 f10 guid 1208AFEDF08C5FAA #txt
Es0 f10 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f10 actionTable 'out=in;
' #txt
Es0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f10 502 38 20 20 13 0 #rect
Es0 f10 @|RichDialogProcessStartIcon #fIcon
Es0 f11 expr out #txt
Es0 f11 512 58 349 216 #arcP
Es0 f11 1 512 216 #addKink
Es0 f11 1 0.14862457709757687 0 0 #arcLabel
Es0 f12 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create
new?</name>
        <nameStyle>11,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f12 323 114 26 28 14 0 #rect
Es0 f12 @|AlternativeIcon #fIcon
Es0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f14 actionTable 'out=in;
' #txt
Es0 f14 actionCode 'import ch.ivyteam.ivy.application.restricted.IGlobalVariable;
import ch.ivyteam.ivy.application.restricted.IEnvironment;

IEnvironment env = in.application.createEnvironment(in.name,in.description, null);
in.environment = env;' #txt
Es0 f14 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save
environment</name>
        <nameStyle>16,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f14 390 116 36 24 20 -2 #rect
Es0 f14 @|RichDialogProcessStepIcon #fIcon
Es0 f15 expr in #txt
Es0 f15 outCond in.createNew #txt
Es0 f15 349 128 390 128 #arcP
Es0 f9 expr out #txt
Es0 f9 408 140 336 203 #arcP
Es0 f9 1 408 160 #addKink
Es0 f9 2 336 160 #addKink
Es0 f9 1 0.5930897144727212 0 0 #arcLabel
Es0 f16 expr in #txt
Es0 f16 336 142 336 203 #arcP
Es0 f16 0 0.5319829957017898 0 0 #arcLabel
Es0 f17 guid 121778CCE3626693 #txt
Es0 f17 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f17 method createEnvironment(ch.ivyteam.ivy.application.IApplication,List<ch.ivyteam.ivy.application.restricted.IGlobalVariable>,List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration>) #txt
Es0 f17 disableUIEvents false #txt
Es0 f17 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application,List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> variables,List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration> databases> param = methodEvent.getInputArguments();
' #txt
Es0 f17 inParameterMapAction 'out.application=param.application;
out.createNew=true;
out.globalVariables=param.application.getDefaultGlobalVariables();
' #txt
Es0 f17 outParameterDecl '<ch.ivyteam.ivy.application.restricted.IEnvironment environment> result;
' #txt
Es0 f17 outParameterMapAction 'result.environment=in.environment;
' #txt
Es0 f17 embeddedRdInitializations '{/webServiceListPanel {/fieldName "webServiceListPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/environmentDatabasePanel {/fieldName "environmentDatabasePanel"/startMethod "showDatabases(List<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration>,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.databases=callParam.databases;\nparam.environment=in.environment;\n"/initScript ""/userContext * }/restClientsPanel {/fieldName "restClientsPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/globalVariableListPanel {/fieldName "globalVariableListPanel"/startMethod "showGlobalVariables(List<ch.ivyteam.ivy.application.restricted.IGlobalVariable>,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.globalVariables=callParam.variables;\nparam.environment=in.environment;\n"/initScript ""/userContext * }/tabHeaderBarPanel {/fieldName "tabHeaderBarPanel"/startMethod "start(String,String,Boolean,Boolean)"/parameterMapping "param.iconUri=\"/Icons/Environment/48\";\nparam.title=\"New Environment\";\nparam.showCloseButton=true;\nparam.showRefreshButton=false;\n"/initScript ""/userContext * }/environmentCalendarPanel {/fieldName "environmentCalendarPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }}' #txt
Es0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createEnvironment(IApplication,
List&lt;IGlobalVariable&gt;,
IExternalDatabaseConfiguration)</name>
        <nameStyle>86,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f17 30 246 20 20 13 0 #rect
Es0 f17 @|RichDialogInitStartIcon #fIcon
Es0 f19 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f19 actionTable 'out=in;
' #txt
Es0 f19 actionCode panel.hideTabHeaderPanel(); #txt
Es0 f19 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Hide
Header Panel</name>
        <nameStyle>17,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f19 22 196 36 24 20 -2 #rect
Es0 f19 @|RichDialogProcessStepIcon #fIcon
Es0 f20 expr out #txt
Es0 f20 40 246 40 220 #arcP
Es0 f18 expr out #txt
Es0 f18 128 162 58 208 #arcP
Es0 f18 1 128 208 #addKink
Es0 f18 1 0.1739137865793043 0 0 #arcLabel
Es0 f6 expr out #txt
Es0 f6 40 196 40 165 #arcP
Es0 f21 guid 121C496C70544BC3 #txt
Es0 f21 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f21 method matchIdentifier(String,java.lang.Object) #txt
Es0 f21 disableUIEvents false #txt
Es0 f21 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
Es0 f21 inParameterMapAction 'out.tempIdentifier=param.identifier as Number;
out.tempType=param.type;
' #txt
Es0 f21 outParameterDecl '<java.lang.String name> result;
' #txt
Es0 f21 outActionCode 'if (in.tempType.equalsIgnoreCase(ApplicationTreeHelper.TREE_ITEM_ENVIRONMENT) && in.#environment != null)
{
	if (in.tempIdentifier == in.environment.getId())
	{
		result.name = panel.getName();
	}
}' #txt
Es0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier
(String,Object)</name>
        <nameStyle>31,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f21 630 46 20 20 13 0 #rect
Es0 f21 @|RichDialogMethodStartIcon #fIcon
Es0 f22 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f22 627 99 26 26 14 0 #rect
Es0 f22 @|RichDialogProcessEndIcon #fIcon
Es0 f23 expr out #txt
Es0 f23 640 66 640 99 #arcP
Es0 f24 guid 122369B9B56E71F2 #txt
Es0 f24 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f24 broadcast applicationDeleted #txt
Es0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f24 actionTable 'out=in;
out.tempIdentifier=param.applicationIdentifer;
' #txt
Es0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>applicationDeleted</name>
        <nameStyle>18,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f24 942 30 20 20 13 0 #rect
Es0 f24 @|RichDialogBroadcastStartIcon #fIcon
Es0 f25 guid 122369BAF4C5DF28 #txt
Es0 f25 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f25 broadcast environmentDeleted #txt
Es0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f25 actionTable 'out=in;
out.tempIdentifier=param.environmentIdentifier;
' #txt
Es0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>environmentDeleted</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f25 950 150 20 20 13 0 #rect
Es0 f25 @|RichDialogBroadcastStartIcon #fIcon
Es0 f26 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check application
identifier</name>
        <nameStyle>28,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f26 794 26 28 28 14 0 #rect
Es0 f26 @|AlternativeIcon #fIcon
Es0 f27 expr out #txt
Es0 f27 942 40 822 40 #arcP
Es0 f29 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f29 guid 122369DF48F51AAE #txt
Es0 f29 795 235 26 26 14 0 #rect
Es0 f29 @|RichDialogEndIcon #fIcon
Es0 f30 expr in #txt
Es0 f30 outCond '	in.application.getId() == in.tempIdentifier' #txt
Es0 f30 808 54 808 235 #arcP
Es0 f31 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f31 827 91 26 26 14 0 #rect
Es0 f31 @|RichDialogProcessEndIcon #fIcon
Es0 f32 expr in #txt
Es0 f32 813 49 834 92 #arcP
Es0 f28 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check environment
identifier</name>
        <nameStyle>28,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f28 826 146 28 28 -19 15 #rect
Es0 f28 @|AlternativeIcon #fIcon
Es0 f33 expr out #txt
Es0 f33 950 160 854 160 #arcP
Es0 f34 expr in #txt
Es0 f34 outCond 'in.environment.getId() == in.tempIdentifier' #txt
Es0 f34 826 160 808 235 #arcP
Es0 f34 1 808 160 #addKink
Es0 f34 1 0.5409157178324037 0 0 #arcLabel
Es0 f35 expr in #txt
Es0 f35 840 146 840 117 #arcP
Es0 f36 guid 1227863EAE495FD2 #txt
Es0 f36 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f36 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f36 actionTable 'out=in;
' #txt
Es0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f36 326 278 20 20 13 0 #rect
Es0 f36 @|RichDialogProcessStartIcon #fIcon
Es0 f37 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f37 326 374 20 20 13 0 #rect
Es0 f37 @|RichDialogProcessEndIcon #fIcon
Es0 f39 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f39 actionTable 'out=in;
' #txt
Es0 f39 actionCode 'panel.globalVariableListPanel.setGlobalVariables(in.environment.getGlobalVariables());
panel.environmentDatabasePanel.setDatabases(in.environment.getExternalDatabaseConfigurations());
panel.webServiceListPanel.setWebServices(in.environment.getWebServices());
panel.environmentCalendarPanel.setBusinessCalendar(in.environment);' #txt
Es0 f39 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh
inner panels</name>
        <nameStyle>20,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f39 318 324 36 24 20 -2 #rect
Es0 f39 @|RichDialogProcessStepIcon #fIcon
Es0 f40 expr out #txt
Es0 f40 336 298 336 324 #arcP
Es0 f38 expr out #txt
Es0 f38 336 348 336 374 #arcP
Es0 f41 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>exist?</name>
        <nameStyle>6,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f41 322 66 28 28 14 0 #rect
Es0 f41 @|AlternativeIcon #fIcon
Es0 f42 expr out #txt
Es0 f42 336 50 336 66 #arcP
Es0 f43 targetWindow NEW #txt
Es0 f43 targetDisplay TOP #txt
Es0 f43 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Es0 f43 startMethod showMessage(String) #txt
Es0 f43 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f43 requestActionDecl '<String message> param;' #txt
Es0 f43 requestMappingAction 'param.message="The environment " + in.name + " already exists for the application";
' #txt
Es0 f43 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f43 responseMappingAction 'out=in;
' #txt
Es0 f43 windowConfiguration '{/title "Error"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Es0 f43 isAsynch false #txt
Es0 f43 isInnerRd true #txt
Es0 f43 isDialog true #txt
Es0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Error</name>
        <nameStyle>5,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f43 390 68 36 24 20 -2 #rect
Es0 f43 @|RichDialogIcon #fIcon
Es0 f44 expr in #txt
Es0 f44 outCond 'in.application.findEnvironment(in.name) != null || in.environment.isDefault()' #txt
Es0 f44 350 80 390 80 #arcP
Es0 f13 expr in #txt
Es0 f13 336 94 336 114 #arcP
Es0 f46 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f46 478 70 20 20 13 0 #rect
Es0 f46 @|RichDialogProcessEndIcon #fIcon
Es0 f47 expr out #txt
Es0 f47 426 80 478 80 #arcP
Es0 f47 0 0.3568325479015436 0 0 #arcLabel
Es0 f4 expr out #txt
Es0 f4 40 66 40 139 #arcP
Es0 f48 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f48 actionTable 'out=in;
' #txt
Es0 f48 actionCode panel.globalVariableListPanel.setGlobalVariables(in.environment.getGlobalVariables()); #txt
Es0 f48 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f48 430 324 36 24 20 -2 #rect
Es0 f48 @|RichDialogProcessStepIcon #fIcon
Es0 f50 expr out #txt
Es0 f50 448 348 346 384 #arcP
Es0 f50 1 448 384 #addKink
Es0 f50 1 0.3627450980392157 0 0 #arcLabel
Es0 f45 guid 136E8762088D145A #txt
Es0 f45 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f45 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f45 actionTable 'out=in;
' #txt
Es0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>globalVariableChanged</name>
        <nameStyle>21,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f45 438 278 20 20 13 0 #rect
Es0 f45 @|RichDialogProcessStartIcon #fIcon
Es0 f49 expr out #txt
Es0 f49 448 298 448 324 #arcP
Es0 f0 guid 13E16F3E2E9ABFA5 #txt
Es0 f0 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f0 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f0 actionTable 'out=in;
' #txt
Es0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refreshDbList</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f0 438 454 20 20 13 0 #rect
Es0 f0 @|RichDialogProcessStartIcon #fIcon
Es0 f51 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Es0 f51 actionTable 'out=in;
' #txt
Es0 f51 actionCode panel.environmentDatabasePanel.setDatabases(in.environment.getExternalDatabaseConfigurations()); #txt
Es0 f51 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
Es0 f51 350 420 36 24 20 -2 #rect
Es0 f51 @|RichDialogProcessStepIcon #fIcon
Es0 f52 expr out #txt
Es0 f52 438 460 386 439 #arcP
Es0 f2 expr out #txt
Es0 f2 360 420 341 392 #arcP
>Proto Es0 .ui2RdDataAction 'out.description=panel.txaDescription.text;
out.name=panel.txfName.text;
' #txt
>Proto Es0 .rdData2UIAction 'panel.pnlButtonBar.visible=in.createNew;
panel.tabEnvironmentSettings.visible=!in.createNew;
panel.txaDescription.enabled=in.createNew;
panel.txaDescription.text=in.description;
panel.txfApplication.enabled=false;
panel.txfApplication.text=in.application.getName();
panel.txfName.enabled=in.createNew;
panel.txfName.text=in.name;
' #txt
>Proto Es0 .type ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData #txt
>Proto Es0 .processKind RICH_DIALOG #txt
>Proto Es0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel>Broadcasts</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>297</swimlaneSize>
    <swimlaneSize>296</swimlaneSize>
    <swimlaneSize>180</swimlaneSize>
    <swimlaneSize>317</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneColor>-26215</swimlaneColor>
    <swimlaneColor>-52</swimlaneColor>
</elementInfo>
' #txt
>Proto Es0 -8 -8 16 16 16 26 #rect
>Proto Es0 '' #fIcon
Es0 f10 mainOut f11 tail #connect
Es0 f11 head f8 mainIn #connect
Es0 f12 out f15 tail #connect
Es0 f15 head f14 mainIn #connect
Es0 f14 mainOut f9 tail #connect
Es0 f9 head f8 mainIn #connect
Es0 f12 out f16 tail #connect
Es0 f16 head f8 mainIn #connect
Es0 f17 mainOut f20 tail #connect
Es0 f20 head f19 mainIn #connect
Es0 f5 mainOut f18 tail #connect
Es0 f18 head f19 mainIn #connect
Es0 f19 mainOut f6 tail #connect
Es0 f6 head f1 mainIn #connect
Es0 f21 mainOut f23 tail #connect
Es0 f23 head f22 mainIn #connect
Es0 f24 mainOut f27 tail #connect
Es0 f27 head f26 in #connect
Es0 f26 out f30 tail #connect
Es0 f30 head f29 mainIn #connect
Es0 f26 out f32 tail #connect
Es0 f32 head f31 mainIn #connect
Es0 f25 mainOut f33 tail #connect
Es0 f33 head f28 in #connect
Es0 f28 out f34 tail #connect
Es0 f34 head f29 mainIn #connect
Es0 f28 out f35 tail #connect
Es0 f35 head f31 mainIn #connect
Es0 f36 mainOut f40 tail #connect
Es0 f40 head f39 mainIn #connect
Es0 f39 mainOut f38 tail #connect
Es0 f38 head f37 mainIn #connect
Es0 f7 mainOut f42 tail #connect
Es0 f42 head f41 in #connect
Es0 f41 out f44 tail #connect
Es0 f44 head f43 mainIn #connect
Es0 f41 out f13 tail #connect
Es0 f13 head f12 in #connect
Es0 f43 mainOut f47 tail #connect
Es0 f47 head f46 mainIn #connect
Es0 f3 mainOut f4 tail #connect
Es0 f4 head f1 mainIn #connect
Es0 f48 mainOut f50 tail #connect
Es0 f50 head f37 mainIn #connect
Es0 f45 mainOut f49 tail #connect
Es0 f49 head f48 mainIn #connect
Es0 f0 mainOut f52 tail #connect
Es0 f52 head f51 mainIn #connect
Es0 f51 mainOut f2 tail #connect
Es0 f2 head f37 mainIn #connect
