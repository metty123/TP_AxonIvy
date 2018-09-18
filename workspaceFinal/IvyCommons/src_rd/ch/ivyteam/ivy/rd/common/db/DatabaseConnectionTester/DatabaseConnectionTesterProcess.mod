[Ivy]
[>Created: Thu Nov 27 16:56:49 CET 2008]
118BD2FB64B621DF 3.10 #module
>Proto >Proto Collection #zClass
Ss0 SystemDatabaseConnectionTesterUIProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @RichDialogInitStart f20 '' #zField
Ss0 @RichDialogProcessEnd f21 '' #zField
Ss0 @PushWFArc f22 '' #zField
Ss0 @RichDialogMethodStart f0 '' #zField
Ss0 @RichDialogProcessEnd f1 '' #zField
Ss0 @RichDialogProcessStep f3 '' #zField
Ss0 @PushWFArc f4 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogBroadcastStart f5 '' #zField
Ss0 @RichDialogProcessEnd f6 '' #zField
Ss0 @RichDialogProcessStep f8 '' #zField
Ss0 @PushWFArc f9 '' #zField
Ss0 @PushWFArc f7 '' #zField
>Proto Ss0 Ss0 SystemDatabaseConnectionTesterUIProcess #zField
Ss0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f20 guid 116F82877B63C35E #txt
Ss0 f20 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f20 method start() #txt
Ss0 f20 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f20 outParameterDecl '<> result;
' #txt
Ss0 f20 embeddedRdInitializations '* ' #txt
Ss0 f20 62 54 20 20 13 0 #rect
Ss0 f20 @|RichDialogInitStartIcon #fIcon
Ss0 f21 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f21 59 187 26 26 14 0 #rect
Ss0 f21 @|RichDialogProcessEndIcon #fIcon
Ss0 f22 expr out #txt
Ss0 f22 72 74 72 187 #arcP
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showConnectionState(DatabaseConnectionConfiguration)</name>
        <nameStyle>52,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 guid 118A29F635B5CAAE #txt
Ss0 f0 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f0 method showConnectionState(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration) #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConfig> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 inParameterMapAction 'out.dbConfiguration=param.dbConfig;
' #txt
Ss0 f0 outParameterDecl '<java.lang.Boolean isConnected> result;
' #txt
Ss0 f0 outParameterMapAction 'result.isConnected=in.isConnected;
' #txt
Ss0 f0 246 54 20 20 13 0 #rect
Ss0 f0 @|RichDialogMethodStartIcon #fIcon
Ss0 f1 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f1 243 187 26 26 14 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Test connection</name>
        <nameStyle>15,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData out;
' #txt
Ss0 f3 actionTable 'out=in;
' #txt
Ss0 f3 actionCode 'import ch.ivyteam.db.jdbc.*;
import ch.ivyteam.ivy.rd.common.db.RdDatabaseUtil;
import java.sql.Connection;

String error = RdDatabaseUtil.getConnectionError(in.dbConfiguration);

if (#error == null || error.length() == 0)
{
	panel.stateTextArea.text = "Connection established successfully";
	out.isConnected = true;
}
else
{
	panel.stateTextArea.text = "Could not establish connection: \n" + error;
	out.isConnected = false;
}' #txt
Ss0 f3 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f3 238 116 36 24 20 -2 #rect
Ss0 f3 @|RichDialogProcessStepIcon #fIcon
Ss0 f4 expr out #txt
Ss0 f4 256 74 256 116 #arcP
Ss0 f2 expr out #txt
Ss0 f2 256 140 256 187 #arcP
Ss0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Accepted broadcast: databaseConnectionConfigurationChanged</name>
    </language>
</elementInfo>
' #txt
Ss0 f5 guid 118A2BB3AC5CDA1F #txt
Ss0 f5 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f5 broadcast databaseConnectionConfigurationChanged #txt
Ss0 f5 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData out;
' #txt
Ss0 f5 actionTable 'out=in;
' #txt
Ss0 f5 62 270 20 20 13 0 #rect
Ss0 f5 @|RichDialogBroadcastStartIcon #fIcon
Ss0 f6 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f6 59 403 26 26 14 0 #rect
Ss0 f6 @|RichDialogProcessEndIcon #fIcon
Ss0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Set state to unknown</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f8 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData out;
' #txt
Ss0 f8 actionTable 'out=in;
' #txt
Ss0 f8 actionCode 'panel.stateTextArea.text = "Unknown connection state. Use the test connection button to test the connection.";' #txt
Ss0 f8 type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
Ss0 f8 54 332 36 24 20 -2 #rect
Ss0 f8 @|RichDialogProcessStepIcon #fIcon
Ss0 f9 expr out #txt
Ss0 f9 72 290 72 332 #arcP
Ss0 f7 expr out #txt
Ss0 f7 72 356 72 403 #arcP
>Proto Ss0 .type ch.ivyteam.ivy.rd.common.db.DatabaseConnectionTester.DatabaseConnectionTesterData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f20 mainOut f22 tail #connect
Ss0 f22 head f21 mainIn #connect
Ss0 f0 mainOut f4 tail #connect
Ss0 f4 head f3 mainIn #connect
Ss0 f3 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f5 mainOut f9 tail #connect
Ss0 f9 head f8 mainIn #connect
Ss0 f8 mainOut f7 tail #connect
Ss0 f7 head f6 mainIn #connect
