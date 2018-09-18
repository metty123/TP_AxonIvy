[Ivy]
[>Created: Wed Aug 12 11:28:58 ICT 2015]
1187E7D940DE29E9 3.17 #module
>Proto >Proto Collection #zClass
Ds0 DatabaseConfigurationProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogProcessStart f3 '' #zField
Ds0 @RichDialogProcessStart f4 '' #zField
Ds0 @RichDialogEnd f5 '' #zField
Ds0 @RichDialogEnd f6 '' #zField
Ds0 @PushWFArc f7 '' #zField
Ds0 @RichDialogMethodStart f9 '' #zField
Ds0 @RichDialogProcessEnd f10 '' #zField
Ds0 @PushWFArc f11 '' #zField
Ds0 @RichDialogProcessStep f12 '' #zField
Ds0 @Alternative f31 '' #zField
Ds0 @PushWFArc f32 '' #zField
Ds0 @PushWFArc f8 '' #zField
Ds0 @RichDialog f33 '' #zField
Ds0 @PushWFArc f34 '' #zField
Ds0 @RichDialogProcessEnd f35 '' #zField
Ds0 @PushWFArc f36 '' #zField
Ds0 @PushWFArc f14 '' #zField
>Proto Ds0 Ds0 DatabaseConfigurationProcess #zField
Ds0 f0 guid 1187E837EA528828 #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f0 method start(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration) #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration database> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.database=param.database;
out.dbConfiguration=param.database.getDatabaseConnectionConfiguration();
' #txt
Ds0 f0 outParameterDecl '<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration database> result;
' #txt
Ds0 f0 outParameterMapAction 'result.database=in.database;
' #txt
Ds0 f0 embeddedRdInitializations '{/configPane {/fieldName "configPane"/startMethod "start(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration)"/parameterMapping "param.configuration=callParam.database.getDatabaseConnectionConfiguration();\n"/initScript ""}}' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IExternalDatabase)</name>
        <nameStyle>24,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f0 70 54 20 20 21 -9 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f1 67 107 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 80 74 80 107 #arcP
Ds0 f2 0 0.018245768648110252 0 0 #arcLabel
Ds0 f3 guid 1187F984014B45AF #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData out;
' #txt
Ds0 f3 actionTable 'out=in;
' #txt
Ds0 f3 actionCode 'import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
DatabaseConnectionConfiguration config = panel.configPane.getConnectionConfiguration();
in.dbConfiguration = config;


' #txt
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f3 326 54 20 20 13 0 #rect
Ds0 f3 @|RichDialogProcessStartIcon #fIcon
Ds0 f4 guid 1187F9845CD9CB15 #txt
Ds0 f4 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData out;
' #txt
Ds0 f4 actionTable 'out=in;
' #txt
Ds0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f4 492 55 24 19 14 8 #rect
Ds0 f4 @|RichDialogProcessStartIcon #fIcon
Ds0 f5 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f5 guid 1187F998F6BE53C4 #txt
Ds0 f5 326 262 20 20 14 0 #rect
Ds0 f5 @|RichDialogEndIcon #fIcon
Ds0 f6 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f6 guid 1187F999820BE0A8 #txt
Ds0 f6 491 107 26 26 14 0 #rect
Ds0 f6 @|RichDialogEndIcon #fIcon
Ds0 f7 expr out #txt
Ds0 f7 504 73 504 107 #arcP
Ds0 f9 guid 12176DE7E4F580ED #txt
Ds0 f9 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f9 method setDatabase(ch.ivyteam.ivy.application.IExternalDatabaseConfiguration) #txt
Ds0 f9 disableUIEvents false #txt
Ds0 f9 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration database> param = methodEvent.getInputArguments();
' #txt
Ds0 f9 inParameterMapAction 'out.database=param.database;
out.dbConfiguration=param.database.getDatabaseConnectionConfiguration();
' #txt
Ds0 f9 outParameterDecl '<> result;
' #txt
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDatabase
(IExternalDatabase)</name>
        <nameStyle>31,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f9 806 54 20 20 13 0 #rect
Ds0 f9 @|RichDialogMethodStartIcon #fIcon
Ds0 f10 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f10 803 107 26 26 14 0 #rect
Ds0 f10 @|RichDialogProcessEndIcon #fIcon
Ds0 f11 expr out #txt
Ds0 f11 816 74 816 107 #arcP
Ds0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData out;
' #txt
Ds0 f12 actionTable 'out=in;
' #txt
Ds0 f12 actionCode 'import ch.ivyteam.ivy.admin.tool.util.DatabaseValidationProperties;
import java.text.MessageFormat;

in.isError = false;
in.errorMessage = panel.configPane.getConnectionValidation();
try 
{
in.database.setDatabaseConnectionConfiguration(in.dbConfiguration);
} 
catch(Exception ex) 
{
	in.isError = true;
	String exMessage = ex.getMessage();
	if (exMessage.contains("IWA_ExternalDatabaseProperty.PropertyName"))
	{
		int propertyNameMaxLength = DatabaseValidationProperties.getPropertyNameMaxLength();
		if(propertyNameMaxLength > 0)
		{
		in.errorMessage += MessageFormat.format(ivy.cms.co("/Dialogs/general/shortThan"), "Name of property", propertyNameMaxLength) + "\n";
		}
		else
		{
			in.errorMessage += "Name of property is too long. Please re-define it.\n";
		}
	}
	else if (exMessage.contains("IWA_ExternalDatabase.UserName"))
	{
		int userNameMaxLength = DatabaseValidationProperties.getUserNameMaxLength();
		if(userNameMaxLength > 0)
		{
			in.errorMessage += MessageFormat.format(ivy.cms.co("/Dialogs/general/shortThan"), "User Name", userNameMaxLength) + "\n";
		}
		else
		{
			in.errorMessage += "User Name is too long. Please re-define it.\n";
		}
		
	}
	else if(exMessage.contains("IWA_ExternalDatabase.ConnectionUrl"))
	{
		int connectionUrlLength = DatabaseValidationProperties.getConnectionUrlMaxLength();
		ivy.log.info("Connection Url " + connectionUrlLength);
		if(connectionUrlLength > 0)
		{
			in.errorMessage += MessageFormat.format(ivy.cms.co("/Dialogs/general/shortThan"), "Connection Url", connectionUrlLength) + "\n";
			in.errorMessage += "Please re-define Host and Database Name.";
		}
		else
		{
			in.errorMessage += "Connection Url is too long. Please re-define Host and Database Name.\n";
		}
	}
	else
	{
		in.errorMessage += exMessage;
	}
}' #txt
Ds0 f12 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update Config</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f12 318 124 36 24 8 -26 #rect
Ds0 f12 @|RichDialogProcessStepIcon #fIcon
Ds0 f31 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save Success?</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f31 322 186 28 28 7 -35 #rect
Ds0 f31 @|AlternativeIcon #fIcon
Ds0 f32 expr out #txt
Ds0 f32 336 148 336 186 #arcP
Ds0 f8 expr in #txt
Ds0 f8 outCond 'in.isError == false && in.errorMessage.isEmpty()' #txt
Ds0 f8 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f8 336 214 336 262 #arcP
Ds0 f8 0 0.25 -18 0 #arcLabel
Ds0 f33 targetWindow NEW:card: #txt
Ds0 f33 targetDisplay TOP #txt
Ds0 f33 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDialog #txt
Ds0 f33 startMethod showError(ch.ivyteam.ivy.commons.data.technical.IvyResultStatus,Boolean,Boolean) #txt
Ds0 f33 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f33 requestActionDecl '<ch.ivyteam.ivy.commons.data.technical.IvyResultStatus ivyResultStatus, Boolean showCopyButton, Boolean showDetailButton> param;' #txt
Ds0 f33 requestActionCode 'param.ivyResultStatus.message = in.errorMessage;' #txt
Ds0 f33 responseActionDecl 'ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData out;
' #txt
Ds0 f33 responseMappingAction 'out=in;
' #txt
Ds0 f33 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ds0 f33 isAsynch false #txt
Ds0 f33 isInnerRd true #txt
Ds0 f33 userContext '* ' #txt
Ds0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show Error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f33 414 188 36 24 19 -24 #rect
Ds0 f33 @|RichDialogIcon #fIcon
Ds0 f34 expr in #txt
Ds0 f34 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f34 350 200 414 200 #arcP
Ds0 f34 0 0.484375 0 10 #arcLabel
Ds0 f35 type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
Ds0 f35 422 262 20 20 13 0 #rect
Ds0 f35 @|RichDialogProcessEndIcon #fIcon
Ds0 f36 expr out #txt
Ds0 f36 432 212 432 262 #arcP
Ds0 f14 expr out #txt
Ds0 f14 336 74 336 124 #arcP
>Proto Ds0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Broadcasts</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>201</swimlaneSize>
    <swimlaneSize>360</swimlaneSize>
    <swimlaneSize>224</swimlaneSize>
    <swimlaneSize>216</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneColor>-3368449</swimlaneColor>
    <swimlaneColor>-26215</swimlaneColor>
</elementInfo>
' #txt
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.database.ExternalDatabaseConfiguration.ExternalDatabaseConfigurationData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f4 mainOut f7 tail #connect
Ds0 f7 head f6 mainIn #connect
Ds0 f9 mainOut f11 tail #connect
Ds0 f11 head f10 mainIn #connect
Ds0 f12 mainOut f32 tail #connect
Ds0 f32 head f31 in #connect
Ds0 f31 out f8 tail #connect
Ds0 f8 head f5 mainIn #connect
Ds0 f31 out f34 tail #connect
Ds0 f34 head f33 mainIn #connect
Ds0 f33 mainOut f36 tail #connect
Ds0 f36 head f35 mainIn #connect
Ds0 f3 mainOut f14 tail #connect
Ds0 f14 head f12 mainIn #connect
