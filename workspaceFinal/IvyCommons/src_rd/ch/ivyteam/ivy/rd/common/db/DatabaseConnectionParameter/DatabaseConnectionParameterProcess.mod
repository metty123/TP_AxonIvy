[Ivy]
[>Created: Fri Aug 01 11:43:08 ICT 2014]
118BD2FB64BEFF46 3.17 #module
>Proto >Proto Collection #zClass
Ds0 DatabaseConnectionConfigurationUIProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @RichDialogProcessStep f5 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @PushWFArc f3 '' #zField
Ds0 @RichDialogMethodStart f4 '' #zField
Ds0 @RichDialogProcessEnd f6 '' #zField
Ds0 @RichDialogProcessStep f8 '' #zField
Ds0 @PushWFArc f7 '' #zField
Ds0 @RichDialogMethodStart f10 '' #zField
Ds0 @RichDialogProcessEnd f11 '' #zField
Ds0 @PushWFArc f12 '' #zField
Ds0 @RichDialogProcessEnd f16 '' #zField
Ds0 @RichDialogProcessStep f21 '' #zField
Ds0 @PushWFArc f17 '' #zField
Ds0 @RichDialogProcessStart f23 '' #zField
Ds0 @RichDialogProcessStep f24 '' #zField
Ds0 @PushWFArc f25 '' #zField
Ds0 @RichDialogProcessEnd f26 '' #zField
Ds0 @RichDialogFireEvent f28 '' #zField
Ds0 @PushWFArc f29 '' #zField
Ds0 @PushWFArc f27 '' #zField
Ds0 @RichDialogMethodStart f13 '' #zField
Ds0 @PushWFArc f15 '' #zField
Ds0 @RichDialogMethodStart f18 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @RichDialogMethodStart f14 '' #zField
Ds0 @RichDialogProcessEnd f20 '' #zField
Ds0 @PushWFArc f22 '' #zField
Ds0 @RichDialogInitStart f30 '' #zField
Ds0 @PushWFArc f31 '' #zField
Ds0 @RichDialogMethodStart f32 '' #zField
Ds0 @RichDialogProcessEnd f33 '' #zField
Ds0 @RichDialogProcessStep f34 '' #zField
Ds0 @PushWFArc f35 '' #zField
Ds0 @PushWFArc f36 '' #zField
Ds0 @PushWFArc f39 '' #zField
>Proto Ds0 Ds0 DatabaseConnectionConfigurationUIProcess #zField
Ds0 f0 guid 1167C3611081445E #txt
Ds0 f0 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f0 method start() #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.connectionProperties=new java.util.HashMap();
out.jdbcDrivers=ch.ivyteam.db.jdbc.JdbcDriver.getInstalledJdbcDrivers();
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 embeddedRdInitializations '* ' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f0 30 46 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f1 27 155 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f5 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData out;
' #txt
Ds0 f5 actionTable 'out=in;
' #txt
Ds0 f5 actionCode panel.setJdbcDrivers(in.jdbcDrivers); #txt
Ds0 f5 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f5 22 100 36 24 20 -2 #rect
Ds0 f5 @|RichDialogProcessStepIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 40 66 40 100 #arcP
Ds0 f3 expr out #txt
Ds0 f3 40 124 40 155 #arcP
Ds0 f4 guid 1167C59F88B46628 #txt
Ds0 f4 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f4 method setDbDriver(ch.ivyteam.ivy.rd.common.DbDriver) #txt
Ds0 f4 disableUIEvents false #txt
Ds0 f4 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.rd.common.DbDriver dbDriver> param = methodEvent.getInputArguments();
' #txt
Ds0 f4 inParameterMapAction 'out.dbDriver=param.dbDriver;
' #txt
Ds0 f4 outParameterDecl '<> result;
' #txt
Ds0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDbDriver(DbDriver)</name>
        <nameStyle>21,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f4 254 46 20 20 13 0 #rect
Ds0 f4 @|RichDialogMethodStartIcon #fIcon
Ds0 f6 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f6 251 155 26 26 14 0 #rect
Ds0 f6 @|RichDialogProcessEndIcon #fIcon
Ds0 f8 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData out;
' #txt
Ds0 f8 actionTable 'out=in;
' #txt
Ds0 f8 actionCode 'import ch.ivyteam.db.jdbc.JdbcConnectionConfigurator;
import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import java.util.Map;
import java.util.HashMap;

Map connectionProperties;

panel.updateToConnectionProperties(in.connectionProperties);

if (!panel.getSelectedDbDriver().name.equals(in.dbDriver.name))
{
	panel.setSelectedDbDriver(in.dbDriver);
  connectionProperties = new HashMap(in.connectionProperties);
  panel.updateFromConnectionProperties(connectionProperties, false);
  panel.updateToConnectionProperties(in.connectionProperties);

	if (ivy.cms.co("/labels/others").equals(in.dbDriver.name) && in.#dbConnection != null) {
		in.connectionProperties.put(JdbcConnectionConfigurator.DRIVER_NAME, in.dbConnection.getDriverName());
		in.connectionProperties.put(JdbcConnectionConfigurator.CONNECTION_URL, in.dbConnection.getConnectionUrl());
		panel.updateFromConnectionProperties(in.connectionProperties, true);
	}

  in.dbConnection = in.dbDriver.getConnectionConfigurator().getDatabaseConnectionConfiguration(in.connectionProperties);
}' #txt
Ds0 f8 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f8 246 100 36 24 20 -2 #rect
Ds0 f8 @|RichDialogProcessStepIcon #fIcon
Ds0 f7 expr out #txt
Ds0 f7 264 124 264 155 #arcP
Ds0 f10 guid 1167C5B04975D271 #txt
Ds0 f10 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f10 method getDbDriver() #txt
Ds0 f10 disableUIEvents false #txt
Ds0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f10 outParameterDecl '<ch.ivyteam.ivy.rd.common.DbDriver dbDriver> result;
' #txt
Ds0 f10 outParameterMapAction 'result.dbDriver=in.dbDriver;
' #txt
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getDbDriver()</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f10 494 46 20 20 13 0 #rect
Ds0 f10 @|RichDialogMethodStartIcon #fIcon
Ds0 f11 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f11 491 155 26 26 14 0 #rect
Ds0 f11 @|RichDialogProcessEndIcon #fIcon
Ds0 f12 expr out #txt
Ds0 f12 504 66 504 155 #arcP
Ds0 f16 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f16 331 395 26 26 14 0 #rect
Ds0 f16 @|RichDialogProcessEndIcon #fIcon
Ds0 f21 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData out;
' #txt
Ds0 f21 actionTable 'out=in;
' #txt
Ds0 f21 actionCode 'import ch.ivyteam.ivy.rd.common.db.RdDatabaseUtil;
import ch.ivyteam.db.jdbc.JdbcConnectionConfigurator;
import ch.ivyteam.ivy.rd.common.DbDriver;
import ch.ivyteam.db.jdbc.JdbcDriver;
import java.util.Map;
import java.util.HashMap;
import ch.ivyteam.db.jdbc.ConnectionProperty;

Map newConnectionProperties;
Map connectionProperties;

panel.updateToConnectionProperties(in.connectionProperties);

if (in.#dbConnection.getDriverName().length() > 0)
{
	
  JdbcDriver selectedDriver = JdbcDriver.getJdbcDriverForConnectionConfiguration(in.jdbcDrivers, in.dbConnection);

	if (#selectedDriver == null)
	{
		in.dbDriver = RdDatabaseUtil.initializeOtherDbDriver();
	} else {
		in.dbDriver = RdDatabaseUtil.getDbDriver(selectedDriver);
	}
	
  panel.setSelectedDbDriver(in.dbDriver);

  newConnectionProperties = in.dbDriver.getConnectionConfigurator().getDatabaseConnectionProperties(in.dbConnection);

  connectionProperties = new HashMap(in.connectionProperties);
  for (ConnectionProperty property : newConnectionProperties.keySet())
  {
     connectionProperties.put(property, newConnectionProperties.get(property));
  }
  panel.updateFromConnectionProperties(connectionProperties, true);

  // this is necessary because some events are fired during update and overwrites the properties with wrong values
  panel.updateToConnectionProperties(in.connectionProperties);
  in.dbConnection = in.dbDriver.getConnectionConfigurator().getDatabaseConnectionConfiguration(in.connectionProperties);
}' #txt
Ds0 f21 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f21 326 316 36 24 20 -2 #rect
Ds0 f21 @|RichDialogProcessStepIcon #fIcon
Ds0 f17 expr out #txt
Ds0 f17 344 340 344 395 #arcP
Ds0 f23 guid 116B4DAD95942FCB #txt
Ds0 f23 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f23 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData out;
' #txt
Ds0 f23 actionTable 'out=in;
' #txt
Ds0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>keyPressed</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f23 30 254 20 20 13 0 #rect
Ds0 f23 @|RichDialogProcessStartIcon #fIcon
Ds0 f24 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData out;
' #txt
Ds0 f24 actionTable 'out=in;
' #txt
Ds0 f24 actionCode 'panel.updateToConnectionProperties(in.connectionProperties);
in.dbConnection = in.dbDriver.getConnectionConfigurator().getDatabaseConnectionConfiguration(in.connectionProperties);
' #txt
Ds0 f24 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f24 22 300 36 24 20 -2 #rect
Ds0 f24 @|RichDialogProcessStepIcon #fIcon
Ds0 f25 expr out #txt
Ds0 f25 40 274 40 300 #arcP
Ds0 f26 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f26 27 395 26 26 14 0 #rect
Ds0 f26 @|RichDialogProcessEndIcon #fIcon
Ds0 f28 actionCode panel.fireDatabaseConnectionConfigurationChanged(); #txt
Ds0 f28 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f28 fireEvent databaseConnectionConfigurationChanged() #txt
Ds0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f28 22 348 36 24 20 -2 #rect
Ds0 f28 @|RichDialogFireEventIcon #fIcon
Ds0 f29 expr out #txt
Ds0 f29 40 324 40 348 #arcP
Ds0 f27 expr out #txt
Ds0 f27 40 372 40 395 #arcP
Ds0 f13 guid 116C8B03CCCE9605 #txt
Ds0 f13 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f13 method configurationChanged() #txt
Ds0 f13 disableUIEvents false #txt
Ds0 f13 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f13 outParameterDecl '<> result;
' #txt
Ds0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>configurationChanged()</name>
    </language>
</elementInfo>
' #txt
Ds0 f13 254 262 20 20 18 -8 #rect
Ds0 f13 @|RichDialogMethodStartIcon #fIcon
Ds0 f15 expr out #txt
Ds0 f15 272 277 327 316 #arcP
Ds0 f18 guid 1187E2D2B32236C7 #txt
Ds0 f18 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f18 method setDbConfiguration(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration) #txt
Ds0 f18 disableUIEvents false #txt
Ds0 f18 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConfig> param = methodEvent.getInputArguments();
' #txt
Ds0 f18 inParameterMapAction 'out.dbConnection=param.dbConfig;
' #txt
Ds0 f18 outParameterDecl '<> result;
' #txt
Ds0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDbConfiguration(DatabaseConnectionConfiguration)</name>
        <nameStyle>51,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f18 414 262 20 20 17 -9 #rect
Ds0 f18 @|RichDialogMethodStartIcon #fIcon
Ds0 f19 expr out #txt
Ds0 f19 415 277 361 316 #arcP
Ds0 f14 guid 1187F9124BA61D86 #txt
Ds0 f14 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f14 method getDbConfiguration() #txt
Ds0 f14 disableUIEvents false #txt
Ds0 f14 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f14 outParameterDecl '<ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration config> result;
' #txt
Ds0 f14 outParameterMapAction 'result.config=in.dbConnection;
' #txt
Ds0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getDbConfiguration()</name>
        <nameStyle>20,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f14 30 462 20 20 13 0 #rect
Ds0 f14 @|RichDialogMethodStartIcon #fIcon
Ds0 f20 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f20 27 523 26 26 14 0 #rect
Ds0 f20 @|RichDialogProcessEndIcon #fIcon
Ds0 f22 expr out #txt
Ds0 f22 40 482 40 523 #arcP
Ds0 f30 guid 11AC98405946706E #txt
Ds0 f30 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f30 method start(List<ch.ivyteam.db.jdbc.JdbcDriver>) #txt
Ds0 f30 disableUIEvents false #txt
Ds0 f30 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.db.jdbc.JdbcDriver> supportedDrivers> param = methodEvent.getInputArguments();
' #txt
Ds0 f30 inParameterMapAction 'out.jdbcDrivers=param.supportedDrivers;
' #txt
Ds0 f30 outParameterDecl '<> result;
' #txt
Ds0 f30 embeddedRdInitializations '* ' #txt
Ds0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(List&lt;JdbcDriver&gt;)</name>
        <nameStyle>23,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f30 102 46 20 20 13 0 #rect
Ds0 f30 @|RichDialogInitStartIcon #fIcon
Ds0 f31 expr out #txt
Ds0 f31 104 62 55 100 #arcP
Ds0 f32 guid 1478B9098BB2CA1B #txt
Ds0 f32 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f32 method getValidation() #txt
Ds0 f32 disableUIEvents false #txt
Ds0 f32 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f32 outParameterDecl '<java.lang.String errorMessage> result;
' #txt
Ds0 f32 outParameterMapAction 'result.errorMessage=in.errorMessage;
' #txt
Ds0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getValidation()</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f32 725 45 22 22 14 0 #rect
Ds0 f32 @|RichDialogMethodStartIcon #fIcon
Ds0 f33 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f33 725 157 22 22 14 0 #rect
Ds0 f33 @|RichDialogProcessEndIcon #fIcon
Ds0 f34 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData out;
' #txt
Ds0 f34 actionTable 'out=in;
' #txt
Ds0 f34 actionCode 'import ch.ivyteam.ivy.richdialog.widgets.components.RLabel;
import ch.ivyteam.ivy.richdialog.widgets.components.RTextField;
import com.ulcjava.base.application.ULCGridBagLayoutPane;
import com.ulcjava.base.application.ULCComponent;

StringBuilder sb = new StringBuilder();
ULCGridBagLayoutPane container = panel.contentCardPane.getSelectedComponent() as ULCGridBagLayoutPane;

for (int i = 0; i < container.getComponents().size(); i++) {
	ULCComponent component = container.getComponents().get(i);
	
	if (component instanceof RTextField) {
		RTextField textField = component as RTextField;
		
		if (textField.isMandatory() && textField.getText().isEmpty()) {
			for (int j = i - 1; j >= 0; j--) {
				if (container.getComponents().get(j) instanceof RLabel) {
					RLabel label = container.getComponents().get(j) as RLabel;
					sb.append(label.getText() + " is required\n");
					break;
				}
			}
		}
	}
}

in.errorMessage = sb.toString();' #txt
Ds0 f34 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
Ds0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate</name>
        <nameStyle>8,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f34 718 100 36 24 20 -2 #rect
Ds0 f34 @|RichDialogProcessStepIcon #fIcon
Ds0 f35 expr out #txt
Ds0 f35 736 67 736 100 #arcP
Ds0 f36 expr out #txt
Ds0 f36 736 124 736 157 #arcP
Ds0 f39 expr out #txt
Ds0 f39 264 66 264 100 #arcP
>Proto Ds0 .type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionParameter.DatabaseConnectionParameterData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f5 mainIn #connect
Ds0 f5 mainOut f3 tail #connect
Ds0 f3 head f1 mainIn #connect
Ds0 f8 mainOut f7 tail #connect
Ds0 f7 head f6 mainIn #connect
Ds0 f10 mainOut f12 tail #connect
Ds0 f12 head f11 mainIn #connect
Ds0 f21 mainOut f17 tail #connect
Ds0 f17 head f16 mainIn #connect
Ds0 f23 mainOut f25 tail #connect
Ds0 f25 head f24 mainIn #connect
Ds0 f24 mainOut f29 tail #connect
Ds0 f29 head f28 mainIn #connect
Ds0 f28 mainOut f27 tail #connect
Ds0 f27 head f26 mainIn #connect
Ds0 f13 mainOut f15 tail #connect
Ds0 f15 head f21 mainIn #connect
Ds0 f18 mainOut f19 tail #connect
Ds0 f19 head f21 mainIn #connect
Ds0 f14 mainOut f22 tail #connect
Ds0 f22 head f20 mainIn #connect
Ds0 f30 mainOut f31 tail #connect
Ds0 f31 head f5 mainIn #connect
Ds0 f32 mainOut f35 tail #connect
Ds0 f35 head f34 mainIn #connect
Ds0 f34 mainOut f36 tail #connect
Ds0 f36 head f33 mainIn #connect
Ds0 f4 mainOut f39 tail #connect
Ds0 f39 head f8 mainIn #connect
