[Ivy]
[>Created: Thu Jul 31 16:10:58 ICT 2014]
118BD2FB64B418CA 3.17 #module
>Proto >Proto Collection #zClass
Ss0 ServerConfigurationUIProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @RichDialogProcessEnd f1 '' #zField
Ss0 @RichDialogProcessStep f3 '' #zField
Ss0 @RichDialogProcessStart f11 '' #zField
Ss0 @RichDialogProcessStart f12 '' #zField
Ss0 @RichDialogProcessEnd f13 '' #zField
Ss0 @RichDialogProcessEnd f14 '' #zField
Ss0 @RichDialogProcessStep f16 '' #zField
Ss0 @PushWFArc f19 '' #zField
Ss0 @PushWFArc f20 '' #zField
Ss0 @RichDialogProcessStart f24 '' #zField
Ss0 @RichDialogProcessStart f25 '' #zField
Ss0 @RichDialogProcessEnd f27 '' #zField
Ss0 @RichDialogProcessStep f30 '' #zField
Ss0 @RichDialogProcessStep f32 '' #zField
Ss0 @RichDialogProcessStart f21 '' #zField
Ss0 @RichDialogProcessStep f22 '' #zField
Ss0 @RichDialogProcessEnd f23 '' #zField
Ss0 @PushWFArc f34 '' #zField
Ss0 @PushWFArc f35 '' #zField
Ss0 @RichDialogProcessStep f45 '' #zField
Ss0 @PushWFArc f46 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogProcessEnd f9 '' #zField
Ss0 @RichDialogMethodStart f36 '' #zField
Ss0 @PushWFArc f37 '' #zField
Ss0 @RichDialogInitStart f0 '' #zField
Ss0 @PushWFArc f4 '' #zField
Ss0 @RichDialogProcessStart f5 '' #zField
Ss0 @RichDialog f6 '' #zField
Ss0 @RichDialogProcessEnd f8 '' #zField
Ss0 @PushWFArc f10 '' #zField
Ss0 @Alternative f61 '' #zField
Ss0 @PushWFArc f62 '' #zField
Ss0 @PushWFArc f63 '' #zField
Ss0 @PushWFArc f7 '' #zField
Ss0 @RichDialog f15 '' #zField
Ss0 @PushWFArc f17 '' #zField
Ss0 @PushWFArc f18 '' #zField
Ss0 @RichDialogMethodStart f64 '' #zField
Ss0 @RichDialogProcessEnd f65 '' #zField
Ss0 @RichDialogProcessStep f67 '' #zField
Ss0 @PushWFArc f68 '' #zField
Ss0 @PushWFArc f66 '' #zField
Ss0 @RichDialogProcessStart f47 '' #zField
Ss0 @RichDialogProcessEnd f49 '' #zField
Ss0 @RichDialogProcessStep f53 '' #zField
Ss0 @PushWFArc f54 '' #zField
Ss0 @PushWFArc f51 '' #zField
Ss0 @RichDialogFireEvent f57 '' #zField
Ss0 @PushWFArc f58 '' #zField
Ss0 @RichDialogMethodStart f79 '' #zField
Ss0 @PushWFArc f80 '' #zField
Ss0 @PushWFArc f29 '' #zField
Ss0 @RichDialogProcessStep f26 '' #zField
Ss0 @PushWFArc f38 '' #zField
Ss0 @PushWFArc f28 '' #zField
Ss0 @RichDialogBroadcastStart f39 '' #zField
Ss0 @PushWFArc f40 '' #zField
Ss0 @RichDialogProcessStart f41 '' #zField
Ss0 @RichDialogProcessEnd f42 '' #zField
Ss0 @RichDialogProcessStep f43 '' #zField
Ss0 @PushWFArc f44 '' #zField
Ss0 @PushWFArc f48 '' #zField
Ss0 @Alternative f50 '' #zField
Ss0 @PushWFArc f52 '' #zField
Ss0 @PushWFArc f33 '' #zField
Ss0 @PushWFArc f55 '' #zField
Ss0 @Alternative f56 '' #zField
Ss0 @PushWFArc f59 '' #zField
Ss0 @PushWFArc f31 '' #zField
Ss0 @PushWFArc f60 '' #zField
Ss0 @RichDialogMethodStart f69 '' #zField
Ss0 @RichDialogProcessEnd f70 '' #zField
Ss0 @PushWFArc f71 '' #zField
>Proto Ss0 Ss0 ServerConfigurationUIProcess #zField
Ss0 f1 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f1 75 203 26 26 14 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f3 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f3 actionTable 'out=in;
' #txt
Ss0 f3 actionCode 'import ch.ivyteam.ivy.rd.common.db.RdDatabaseUtil;
import java.util.ArrayList;
import ch.ivyteam.ivy.common.util.SortHelper;
import ch.ivyteam.db.jdbc.JdbcConnectionConfigurator;
import ch.ivyteam.ivy.rd.common.DbDriver;
import ch.ivyteam.ivy.rd.common.DbProduct;
import ch.ivyteam.db.jdbc.DatabaseProduct;
import ch.ivyteam.db.jdbc.JdbcDriver;

DatabaseProduct selectedDatabase;
JdbcDriver selectedDriver;

in.supportedDrivers = JdbcDriver.getInstalledJdbcDrivers();
if (in.#dbConnection != null)
{
	selectedDriver = JdbcDriver.getJdbcDriverForConnectionConfiguration(in.supportedDrivers, in.dbConnection);
}

panel.connectionPanel.setDbConfiguration(in.dbConnection);

for (DatabaseProduct product : JdbcDriver.getDatabaseProductsOf(in.supportedDrivers))
{
	in.databaseProducts.add(RdDatabaseUtil.getDbProduct(product));
}

// Sort driver by name
SortHelper.sortDbProductAscendingByName(in.databaseProducts);

in.databaseProducts.add(RdDatabaseUtil.initializeOtherDbProduct());

if (#selectedDriver != null)
{
	selectedDatabase = selectedDriver.getDatabaseProduct();
	in.selectedDatabaseProduct = RdDatabaseUtil.getDbProduct(selectedDatabase);
}
else
{
	in.selectedDatabaseProduct = in.databaseProducts.get(in.databaseProducts.size() - 1);
}

List<DbDriver> sortedDbDrivers = [];

if (ivy.cms.co("/labels/others").equals(in.selectedDatabaseProduct.name)) {
	sortedDbDrivers.add(RdDatabaseUtil.initializeOtherDbDriver());
} else {
	for (JdbcDriver driver : JdbcDriver.getInstalledJdbcDrivers(selectedDatabase, in.supportedDrivers))
	{
		sortedDbDrivers.add(RdDatabaseUtil.getDbDriver(driver));
	}
}

if (sortedDbDrivers.size()>0)
{
	SortHelper.sortDbDriverAscendingByName(sortedDbDrivers);
	
	in.dbDrivers = new ArrayList<DbDriver>(sortedDbDrivers);
	
	if (#selectedDriver == null)
	{
		in.selectedDbDriver = in.dbDrivers.get(0);
	} else {
		in.selectedDbDriver = RdDatabaseUtil.getDbDriver(selectedDriver);
	}
}' #txt
Ss0 f3 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Init database and driver list</name>
        <nameStyle>29,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 70 108 36 24 27 -8 #rect
Ss0 f3 @|RichDialogProcessStepIcon #fIcon
Ss0 f11 guid 1167B94B924A76C7 #txt
Ss0 f11 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f11 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f11 actionTable 'out=in;
' #txt
Ss0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addConnectionProperty</name>
        <nameStyle>21,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f11 382 430 20 20 13 0 #rect
Ss0 f11 @|RichDialogProcessStartIcon #fIcon
Ss0 f12 guid 01167B94C0F49091 #txt
Ss0 f12 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f12 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f12 actionTable 'out=in;
' #txt
Ss0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>removeConnectionProperty</name>
        <nameStyle>24,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f12 534 430 20 20 13 0 #rect
Ss0 f12 @|RichDialogProcessStartIcon #fIcon
Ss0 f13 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f13 379 579 26 26 14 0 #rect
Ss0 f13 @|RichDialogProcessEndIcon #fIcon
Ss0 f14 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f14 531 579 26 26 14 0 #rect
Ss0 f14 @|RichDialogProcessEndIcon #fIcon
Ss0 f16 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f16 actionTable 'out=in;
' #txt
Ss0 f16 actionCode 'if (panel.additionalPropertiesTable.getSelectedRecord()!=null)
{
  in.properties.remove(panel.additionalPropertiesTable.getSelectedRecord());
}' #txt
Ss0 f16 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ss0 f16 526 484 36 24 20 -2 #rect
Ss0 f16 @|RichDialogProcessStepIcon #fIcon
Ss0 f19 expr out #txt
Ss0 f19 544 450 544 484 #arcP
Ss0 f20 expr out #txt
Ss0 f20 544 508 544 579 #arcP
Ss0 f24 guid 1167BD00C2BB146A #txt
Ss0 f24 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f24 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f24 actionTable 'out=in;
' #txt
Ss0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>databaseSelected</name>
        <nameStyle>16,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f24 406 30 20 20 13 0 #rect
Ss0 f24 @|RichDialogProcessStartIcon #fIcon
Ss0 f25 guid 1167BD0595D87A5E #txt
Ss0 f25 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f25 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f25 actionTable 'out=in;
' #txt
Ss0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>driverSelected</name>
        <nameStyle>14,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f25 614 30 20 20 15 -2 #rect
Ss0 f25 @|RichDialogProcessStartIcon #fIcon
Ss0 f27 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f27 515 307 26 26 14 0 #rect
Ss0 f27 @|RichDialogProcessEndIcon #fIcon
Ss0 f30 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f30 actionTable 'out=in;
' #txt
Ss0 f30 actionCode 'if (in.#selectedDbDriver != null)
{
	panel.connectionPanel.setDbDriver(in.selectedDbDriver);
}' #txt
Ss0 f30 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Set driver to param panel</name>
        <nameStyle>25,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f30 606 140 36 24 20 -2 #rect
Ss0 f30 @|RichDialogProcessStepIcon #fIcon
Ss0 f32 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f32 actionTable 'out=in;
' #txt
Ss0 f32 actionCode 'import ch.ivyteam.ivy.rd.common.db.RdDatabaseUtil;
import java.util.ArrayList;
import ch.ivyteam.ivy.common.util.SortHelper;
import ch.ivyteam.db.jdbc.JdbcConnectionConfigurator;
import ch.ivyteam.ivy.rd.common.DbDriver;
import ch.ivyteam.db.jdbc.DatabaseProduct;
import ch.ivyteam.db.jdbc.JdbcDriver;

if (in.#selectedDatabaseProduct != null)
{	
	in.dbDrivers.clear();
	
	List<DbDriver> sortedDbDrivers = [];
	
	if (ivy.cms.co("/labels/others").equals(in.selectedDatabaseProduct.name)) {
		sortedDbDrivers.add(RdDatabaseUtil.initializeOtherDbDriver());
	} else {
		for (DatabaseProduct database : DatabaseProduct.getAvailableProducts()) {
			if (database.getName().equalsIgnoreCase(in.selectedDatabaseProduct.name)) {
				for (JdbcDriver driver : JdbcDriver.getInstalledJdbcDrivers(database, in.supportedDrivers))
				{
					sortedDbDrivers.add(RdDatabaseUtil.getDbDriver(driver));
				}
	
				break;
			}
		}
	}
	
	if (sortedDbDrivers.size() > 0) {
		SortHelper.sortDbDriverAscendingByName(sortedDbDrivers);
		in.dbDrivers = new ArrayList<DbDriver>(sortedDbDrivers);
		in.selectedDbDriver = in.dbDrivers.get(0);
	}
}' #txt
Ss0 f32 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get drivers for db product</name>
        <nameStyle>26,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f32 398 140 36 24 20 -2 #rect
Ss0 f32 @|RichDialogProcessStepIcon #fIcon
Ss0 f21 guid 116B550ED02A74AB #txt
Ss0 f21 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f21 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f21 actionTable 'out=in;
' #txt
Ss0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>databaseConnectionConfigurationChanged</name>
        <nameStyle>38,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f21 534 630 20 20 17 -8 #rect
Ss0 f21 @|RichDialogProcessStartIcon #fIcon
Ss0 f22 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f22 actionTable 'out=in;
' #txt
Ss0 f22 actionCode panel.testDbButton.setIconUri("<%=ivy.cms.cr(\"/Icons/connectionstates/unknown\")%>"); #txt
Ss0 f22 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ss0 f22 526 676 36 24 20 -2 #rect
Ss0 f22 @|RichDialogProcessStepIcon #fIcon
Ss0 f23 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f23 531 739 26 26 14 0 #rect
Ss0 f23 @|RichDialogProcessEndIcon #fIcon
Ss0 f34 expr out #txt
Ss0 f34 544 650 544 676 #arcP
Ss0 f35 expr out #txt
Ss0 f35 544 700 544 739 #arcP
Ss0 f45 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f45 actionTable 'out=in;
' #txt
Ss0 f45 actionCode 'import java.util.Properties;
import java.util.Map$$Entry;

// read properties
out.properties = new Recordset(["name", "value"]);
Object o = in.dbConnection.getProperties();

if (#o != null)
{
	Properties props = o as Properties; 
	for (Map$$Entry prop : props.entrySet())
	{
		out.properties.add([prop.getKey(), prop.getValue()]);
	}	
}


' #txt
Ss0 f45 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Read connection properties</name>
        <nameStyle>26,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f45 70 156 36 24 26 -7 #rect
Ss0 f45 @|RichDialogProcessStepIcon #fIcon
Ss0 f45 -13016147|-1|-16777216 #nodeStyle
Ss0 f46 expr out #txt
Ss0 f46 88 132 88 156 #arcP
Ss0 f2 expr out #txt
Ss0 f2 88 180 88 203 #arcP
Ss0 f9 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f9 907 307 26 26 14 0 #rect
Ss0 f9 @|RichDialogProcessEndIcon #fIcon
Ss0 f36 guid 117B554F9375DC11 #txt
Ss0 f36 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f36 method save() #txt
Ss0 f36 disableUIEvents false #txt
Ss0 f36 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f36 outParameterDecl '<> result;
' #txt
Ss0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save()</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f36 910 230 20 20 13 0 #rect
Ss0 f36 @|RichDialogMethodStartIcon #fIcon
Ss0 f37 expr out #txt
Ss0 f37 920 250 920 307 #arcP
Ss0 f0 guid 1187E3CC88CC6C17 #txt
Ss0 f0 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f0 method start(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration) #txt
Ss0 f0 disableUIEvents false #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration configuration> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 inParameterMapAction 'out.dbConnection=param.configuration;
out.supportedDrivers=ch.ivyteam.db.jdbc.JdbcDriver.getInstalledJdbcDrivers();
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 embeddedRdInitializations '{/connectionTesterPanel {/fieldName "connectionTesterPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }/connectionPanel {/fieldName "connectionPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }}' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(DatabaseConnectionConfiguration)</name>
        <nameStyle>38,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 78 54 20 20 13 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 f4 expr out #txt
Ss0 f4 88 74 88 108 #arcP
Ss0 f5 guid 1187F6CB32FD2BA0 #txt
Ss0 f5 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f5 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f5 actionTable 'out=in;
' #txt
Ss0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>editConnectionProperty</name>
        <nameStyle>22,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f5 702 430 20 20 13 0 #rect
Ss0 f5 @|RichDialogProcessStartIcon #fIcon
Ss0 f6 targetWindow NEW #txt
Ss0 f6 targetDisplay TOP #txt
Ss0 f6 richDialogId ch.ivyteam.ivy.rd.common.PropertyEditor #txt
Ss0 f6 startMethod start(Record) #txt
Ss0 f6 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f6 requestActionDecl '<Record record> param;' #txt
Ss0 f6 requestMappingAction 'param.record=panel.additionalPropertiesTable.selectedRecord;
' #txt
Ss0 f6 responseActionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f6 responseMappingAction 'out=in;
' #txt
Ss0 f6 responseActionCode 'if (result.record.size() > 0)
{
	int index = in.properties.indexOf(panel.additionalPropertiesTable.selectedRecord);
	out.properties.putField(index, "name", result.record.getField("name"));
	out.properties.putField(index, "value", result.record.getField("value"));
}' #txt
Ss0 f6 windowConfiguration '#Thu Mar 13 09:38:09 CET 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=0
title=Edit property
' #txt
Ss0 f6 isAsynch false #txt
Ss0 f6 isInnerRd true #txt
Ss0 f6 isDialog true #txt
Ss0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open property editor</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f6 694 516 36 24 24 -10 #rect
Ss0 f6 @|RichDialogIcon #fIcon
Ss0 f8 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f8 699 579 26 26 14 0 #rect
Ss0 f8 @|RichDialogProcessEndIcon #fIcon
Ss0 f10 expr out #txt
Ss0 f10 712 540 712 579 #arcP
Ss0 f61 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f61 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Any property selected?</name>
        <nameStyle>22,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f61 698 466 28 28 14 0 #rect
Ss0 f61 @|AlternativeIcon #fIcon
Ss0 f62 expr out #txt
Ss0 f62 712 450 712 466 #arcP
Ss0 f63 expr in #txt
Ss0 f63 outCond panel.additionalPropertiesTable.getSelectedRecord()!=null #txt
Ss0 f63 712 494 712 516 #arcP
Ss0 f63 0 0.3017241379310345 0 0 #arcLabel
Ss0 f7 expr in #txt
Ss0 f7 698 480 707 579 #arcP
Ss0 f7 1 680 480 #addKink
Ss0 f7 2 680 568 #addKink
Ss0 f7 3 704 568 #addKink
Ss0 f7 1 0.44568947183163826 0 0 #arcLabel
Ss0 f15 targetWindow NEW #txt
Ss0 f15 targetDisplay TOP #txt
Ss0 f15 richDialogId ch.ivyteam.ivy.rd.common.PropertyEditor #txt
Ss0 f15 startMethod start(String,String) #txt
Ss0 f15 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f15 requestActionDecl '<String name, String value> param;' #txt
Ss0 f15 responseActionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f15 responseMappingAction 'out=in;
out.properties=IF(result.successful, 
  in.properties.add([result.name, result.value]),
  in.properties
);
' #txt
Ss0 f15 windowConfiguration '#Thu Mar 13 09:38:20 CET 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=0
title=Add property
' #txt
Ss0 f15 isAsynch false #txt
Ss0 f15 isInnerRd true #txt
Ss0 f15 isDialog true #txt
Ss0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open property editor</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f15 374 484 36 24 24 -10 #rect
Ss0 f15 @|RichDialogIcon #fIcon
Ss0 f17 expr out #txt
Ss0 f17 392 450 392 484 #arcP
Ss0 f18 expr out #txt
Ss0 f18 392 508 392 579 #arcP
Ss0 f64 guid 1187F8E17D9E6716 #txt
Ss0 f64 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f64 method getConnectionConfiguration() #txt
Ss0 f64 disableUIEvents false #txt
Ss0 f64 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f64 outParameterDecl '<ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration config> result;
' #txt
Ss0 f64 outParameterMapAction 'result.config=in.dbConnection;
' #txt
Ss0 f64 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getConnectionConfiguration()</name>
        <nameStyle>28,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f64 910 38 20 20 13 0 #rect
Ss0 f64 @|RichDialogMethodStartIcon #fIcon
Ss0 f65 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f65 907 187 26 26 14 0 #rect
Ss0 f65 @|RichDialogProcessEndIcon #fIcon
Ss0 f67 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f67 actionTable 'out=in;
' #txt
Ss0 f67 actionCode 'import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;

out.dbConnection = panel.connectionPanel.getDbConfiguration();
for (int i = 0; i < in.properties.size(); i++)
{
	out.dbConnection.setProperty(in.properties.getField(i, "name").toString(), in.properties.getField(i, "value").toString());	
}
' #txt
Ss0 f67 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f67 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get config from param-panel 
and add additional properties</name>
        <nameStyle>58,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f67 902 108 36 24 25 -14 #rect
Ss0 f67 @|RichDialogProcessStepIcon #fIcon
Ss0 f68 expr out #txt
Ss0 f68 920 58 920 108 #arcP
Ss0 f66 expr out #txt
Ss0 f66 920 132 920 187 #arcP
Ss0 f47 guid 118A2B55AADB64FA #txt
Ss0 f47 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f47 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f47 actionTable 'out=in;
' #txt
Ss0 f47 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>testConnection</name>
        <nameStyle>14,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f47 382 630 20 20 13 0 #rect
Ss0 f47 @|RichDialogProcessStartIcon #fIcon
Ss0 f49 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f49 379 772 26 24 14 0 #rect
Ss0 f49 @|RichDialogProcessEndIcon #fIcon
Ss0 f53 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f53 actionTable 'out=in;
' #txt
Ss0 f53 actionCode 'import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;

DatabaseConnectionConfiguration config = panel.connectionPanel.getDbConfiguration();

// merge additional properties: 
for(Record record : in.properties.getRecords())
{
	List values = record.getValues();
	String key = values.get(0) as String;
	String value = values.get(1) as String;
	config.setProperty(key, value);
}

if(panel.connectionTesterPanel.showConnectionState(config))
{
	panel.testDbButton.setIconUri("<%=ivy.cms.cr(\"/Icons/ConnectionStates/Ok/32\")%>");
}
else
{
	panel.testDbButton.setIconUri("<%=ivy.cms.cr(\"/Icons/ConnectionStates/Failed/32\")%>");
}
' #txt
Ss0 f53 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f53 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Test (connection
 tester panel)</name>
        <nameStyle>31,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f53 374 684 36 24 24 -10 #rect
Ss0 f53 @|RichDialogProcessStepIcon #fIcon
Ss0 f54 expr out #txt
Ss0 f54 392 650 392 684 #arcP
Ss0 f51 expr out #txt
Ss0 f51 392 708 392 772 #arcP
Ss0 f57 actionCode panel.fireDatabaseConnectionConfigurationChanged(); #txt
Ss0 f57 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f57 fireEvent databaseConnectionConfigurationChanged() #txt
Ss0 f57 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Fire config changed</name>
        <nameStyle>19,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f57 510 212 36 24 20 -2 #rect
Ss0 f57 @|RichDialogFireEventIcon #fIcon
Ss0 f58 expr out #txt
Ss0 f58 608 164 544 212 #arcP
Ss0 f79 guid 118A88003F36DDA0 #txt
Ss0 f79 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f79 method setConnectionConfiguration(ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration) #txt
Ss0 f79 disableUIEvents false #txt
Ss0 f79 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration dbConfig> param = methodEvent.getInputArguments();
' #txt
Ss0 f79 inParameterMapAction 'out.dbConnection=param.dbConfig;
' #txt
Ss0 f79 outParameterDecl '<> result;
' #txt
Ss0 f79 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setConnectionConfiguration(DatabaseConnectionConfiguration)</name>
        <nameStyle>59,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f79 38 22 20 20 13 0 #rect
Ss0 f79 @|RichDialogMethodStartIcon #fIcon
Ss0 f80 expr out #txt
Ss0 f80 52 41 83 108 #arcP
Ss0 f29 expr out #txt
Ss0 f29 434 164 510 212 #arcP
Ss0 f26 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f26 actionTable 'out=in;
' #txt
Ss0 f26 actionCode panel.testDbButton.setIconUri("<%=ivy.cms.cr(\"/Icons/ConnectionStates/Unknown/32\")%>"); #txt
Ss0 f26 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>change Icon</name>
        <nameStyle>11,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f26 510 260 36 24 20 -2 #rect
Ss0 f26 @|RichDialogProcessStepIcon #fIcon
Ss0 f38 expr out #txt
Ss0 f38 528 236 528 260 #arcP
Ss0 f28 expr out #txt
Ss0 f28 528 284 528 307 #arcP
Ss0 f39 guid 11DE3DD6CE6DC0BE #txt
Ss0 f39 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f39 broadcast databaseConnectionConfigurationChanged #txt
Ss0 f39 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f39 actionTable 'out=in;
' #txt
Ss0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>databaseConnection
ConfigurationChanged</name>
        <nameStyle>39,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f39 646 262 20 20 13 0 #rect
Ss0 f39 @|RichDialogBroadcastStartIcon #fIcon
Ss0 f40 expr out #txt
Ss0 f40 646 272 546 272 #arcP
Ss0 f41 guid 13F853784147F999 #txt
Ss0 f41 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f41 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f41 actionTable 'out=in;
' #txt
Ss0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onLoad</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f41 654 710 20 20 13 0 #rect
Ss0 f41 @|RichDialogProcessStartIcon #fIcon
Ss0 f42 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f42 654 830 20 20 13 0 #rect
Ss0 f42 @|RichDialogProcessEndIcon #fIcon
Ss0 f43 actionDecl 'ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData out;
' #txt
Ss0 f43 actionTable 'out=in;
' #txt
Ss0 f43 actionCode '// Make sure Combobox Change event is not called in Start Method
in.isCallCboEvent = true;' #txt
Ss0 f43 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Enable Cbo Change
event called</name>
        <nameStyle>30,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f43 646 772 36 24 20 -2 #rect
Ss0 f43 @|RichDialogProcessStepIcon #fIcon
Ss0 f44 expr out #txt
Ss0 f44 664 730 664 772 #arcP
Ss0 f48 expr out #txt
Ss0 f48 664 796 664 830 #arcP
Ss0 f50 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f50 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Call Cbo Change Event?</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f50 400 74 32 28 17 -11 #rect
Ss0 f50 @|AlternativeIcon #fIcon
Ss0 f52 expr out #txt
Ss0 f52 416 50 416 74 #arcP
Ss0 f33 expr in #txt
Ss0 f33 outCond in.isCallCboEvent #txt
Ss0 f33 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f33 416 102 416 140 #arcP
Ss0 f33 0 0.3157894736842105 17 0 #arcLabel
Ss0 f55 expr in #txt
Ss0 f55 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f55 400 88 515 320 #arcP
Ss0 f55 1 360 88 #addKink
Ss0 f55 2 360 320 #addKink
Ss0 f55 0 0.6666666666666666 0 -11 #arcLabel
Ss0 f56 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f56 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Call Cbo Change Event?</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f56 610 74 28 28 14 -15 #rect
Ss0 f56 @|AlternativeIcon #fIcon
Ss0 f59 expr out #txt
Ss0 f59 624 50 624 74 #arcP
Ss0 f31 expr in #txt
Ss0 f31 outCond in.isCallCboEvent #txt
Ss0 f31 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f31 624 102 624 140 #arcP
Ss0 f31 0 0.2894736842105263 11 0 #arcLabel
Ss0 f60 expr in #txt
Ss0 f60 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f60 638 88 541 320 #arcP
Ss0 f60 1 800 88 #addKink
Ss0 f60 2 800 320 #addKink
Ss0 f60 0 0.6604938271604939 0 12 #arcLabel
Ss0 f69 guid 1478BAEDE7D2BE16 #txt
Ss0 f69 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f69 method getConnectionValidation() #txt
Ss0 f69 disableUIEvents false #txt
Ss0 f69 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f69 outParameterDecl '<java.lang.String errorMessage> result;
' #txt
Ss0 f69 outParameterMapAction 'result.errorMessage=panel.connectionPanel.getValidation();
' #txt
Ss0 f69 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getConnectionValidation()</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f69 917 373 22 22 14 0 #rect
Ss0 f69 @|RichDialogMethodStartIcon #fIcon
Ss0 f70 type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
Ss0 f70 917 437 22 22 14 0 #rect
Ss0 f70 @|RichDialogProcessEndIcon #fIcon
Ss0 f71 expr out #txt
Ss0 f71 928 395 928 437 #arcP
>Proto Ss0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>342</swimlaneSize>
    <swimlaneSize>545</swimlaneSize>
    <swimlaneSize>237</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneColor>-26215</swimlaneColor>
</elementInfo>
' #txt
>Proto Ss0 .type ch.ivyteam.ivy.rd.common.db.DatabaseConfiguration.DatabaseConfigurationData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 .ui2RdDataAction 'out.selectedDatabaseProduct=panel.databaseComboBox.#selectedListEntry as ch.ivyteam.ivy.rd.common.DbProduct;
out.selectedDbDriver=panel.driverComboBox.#selectedListEntry as ch.ivyteam.ivy.rd.common.DbDriver;
' #txt
>Proto Ss0 .rdData2UIAction 'panel.additionalPropertiesTable.recordsetData=in.properties;
panel.databaseComboBox.listData=in.databaseProducts;
panel.driverComboBox.listData=in.dbDrivers;
panel.databaseComboBox.selectedListEntry=in.#selectedDatabaseProduct;
panel.driverComboBox.selectedListEntry=in.#selectedDbDriver;
' #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f12 mainOut f19 tail #connect
Ss0 f19 head f16 mainIn #connect
Ss0 f16 mainOut f20 tail #connect
Ss0 f20 head f14 mainIn #connect
Ss0 f21 mainOut f34 tail #connect
Ss0 f34 head f22 mainIn #connect
Ss0 f22 mainOut f35 tail #connect
Ss0 f35 head f23 mainIn #connect
Ss0 f3 mainOut f46 tail #connect
Ss0 f46 head f45 mainIn #connect
Ss0 f45 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f36 mainOut f37 tail #connect
Ss0 f37 head f9 mainIn #connect
Ss0 f0 mainOut f4 tail #connect
Ss0 f4 head f3 mainIn #connect
Ss0 f6 mainOut f10 tail #connect
Ss0 f10 head f8 mainIn #connect
Ss0 f5 mainOut f62 tail #connect
Ss0 f62 head f61 in #connect
Ss0 f61 out f63 tail #connect
Ss0 f63 head f6 mainIn #connect
Ss0 f61 out f7 tail #connect
Ss0 f7 head f8 mainIn #connect
Ss0 f11 mainOut f17 tail #connect
Ss0 f17 head f15 mainIn #connect
Ss0 f15 mainOut f18 tail #connect
Ss0 f18 head f13 mainIn #connect
Ss0 f64 mainOut f68 tail #connect
Ss0 f68 head f67 mainIn #connect
Ss0 f67 mainOut f66 tail #connect
Ss0 f66 head f65 mainIn #connect
Ss0 f47 mainOut f54 tail #connect
Ss0 f54 head f53 mainIn #connect
Ss0 f53 mainOut f51 tail #connect
Ss0 f51 head f49 mainIn #connect
Ss0 f30 mainOut f58 tail #connect
Ss0 f58 head f57 mainIn #connect
Ss0 f79 mainOut f80 tail #connect
Ss0 f80 head f3 mainIn #connect
Ss0 f32 mainOut f29 tail #connect
Ss0 f29 head f57 mainIn #connect
Ss0 f57 mainOut f38 tail #connect
Ss0 f38 head f26 mainIn #connect
Ss0 f26 mainOut f28 tail #connect
Ss0 f28 head f27 mainIn #connect
Ss0 f39 mainOut f40 tail #connect
Ss0 f40 head f26 mainIn #connect
Ss0 f41 mainOut f44 tail #connect
Ss0 f44 head f43 mainIn #connect
Ss0 f43 mainOut f48 tail #connect
Ss0 f48 head f42 mainIn #connect
Ss0 f24 mainOut f52 tail #connect
Ss0 f52 head f50 in #connect
Ss0 f50 out f33 tail #connect
Ss0 f33 head f32 mainIn #connect
Ss0 f50 out f55 tail #connect
Ss0 f55 head f27 mainIn #connect
Ss0 f25 mainOut f59 tail #connect
Ss0 f59 head f56 in #connect
Ss0 f56 out f31 tail #connect
Ss0 f31 head f30 mainIn #connect
Ss0 f56 out f60 tail #connect
Ss0 f60 head f27 mainIn #connect
Ss0 f69 mainOut f71 tail #connect
Ss0 f71 head f70 mainIn #connect
