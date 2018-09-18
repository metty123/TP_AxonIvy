[Ivy]
[>Created: Wed Apr 02 14:53:28 CEST 2008]
1190EB2EDAC9F37B 3.10 #module
>Proto >Proto Collection #zClass
Ns0 NewExternalDatabaseConfigurationProcess Big #zClass
Ns0 RD #cInfo
Ns0 #process
Ns0 @TextInP .xml .xml #zField
Ns0 @TextInP .responsibility .responsibility #zField
Ns0 @AnnotationInP-0n ai ai #zField
Ns0 @MessageFlowInP-0n messageIn messageIn #zField
Ns0 @MessageFlowOutP-0n messageOut messageOut #zField
Ns0 @TextInP .resExport .resExport #zField
Ns0 @TextInP .type .type #zField
Ns0 @TextInP .processKind .processKind #zField
Ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ns0 @RichDialogInitStart f1 '' #zField
Ns0 f1 guid 1190EB76C498E4C7 #txt
Ns0 f1 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f1 method start(ch.ivyteam.ivy.application.IApplication) #txt
Ns0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ns0 f1 inParameterMapAction 'out.application=param.#application;
' #txt
Ns0 f1 outParameterDecl '<ch.ivyteam.ivy.application.IExternalDatabaseConfiguration externalDatabase> result;
' #txt
Ns0 f1 outParameterMapAction 'result.externalDatabase=in.#config;
' #txt
Ns0 f1 embeddedRdInitializations '* ' #txt
Ns0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f1 38 38 20 20 13 0 #rect
Ns0 f1 @|RichDialogInitStartIcon #fIcon
Ns0 @RichDialogProcessStep f2 '' #zField
Ns0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData out;
' #txt
Ns0 f2 actionTable 'out=in;
' #txt
Ns0 f2 actionCode 'import ch.ivyteam.ivy.application.IApplication;

out.applications = new List<IApplication>();
out.applications.addAll(ch.ivyteam.ivy.server.ServerFactory.getServer().getApplicationConfigurationManager().getApplications());
' #txt
Ns0 f2 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Init</name>
        <nameStyle>4,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f2 30 116 36 24 20 -2 #rect
Ns0 f2 @|RichDialogProcessStepIcon #fIcon
Ns0 @PushWFArc f3 '' #zField
Ns0 f3 expr out #txt
Ns0 f3 48 58 48 116 #arcP
Ns0 @RichDialogProcessEnd f4 '' #zField
Ns0 f4 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f4 35 195 26 26 14 0 #rect
Ns0 f4 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f5 '' #zField
Ns0 f5 expr out #txt
Ns0 f5 48 140 48 195 #arcP
Ns0 @RichDialogProcessStart f6 '' #zField
Ns0 f6 guid 1190EB7BE2DF9B26 #txt
Ns0 f6 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData out;
' #txt
Ns0 f6 actionTable 'out=in;
' #txt
Ns0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f6 38 270 20 20 13 0 #rect
Ns0 f6 @|RichDialogProcessStartIcon #fIcon
Ns0 @RichDialogProcessStart f7 '' #zField
Ns0 f7 guid 1190EB874ADD75AB #txt
Ns0 f7 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData out;
' #txt
Ns0 f7 actionTable 'out=in;
' #txt
Ns0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f7 414 270 20 20 13 0 #rect
Ns0 f7 @|RichDialogProcessStartIcon #fIcon
Ns0 @RichDialogEnd f10 '' #zField
Ns0 f10 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f10 guid 1190EBE1598C959D #txt
Ns0 f10 35 427 26 26 14 0 #rect
Ns0 f10 @|RichDialogEndIcon #fIcon
Ns0 @RichDialogEnd f11 '' #zField
Ns0 f11 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f11 guid 1190EBE1AE64746D #txt
Ns0 f11 411 427 26 26 14 0 #rect
Ns0 f11 @|RichDialogEndIcon #fIcon
Ns0 @RichDialogProcessStep f9 '' #zField
Ns0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData out;
' #txt
Ns0 f9 actionTable 'out=in;
' #txt
Ns0 f9 actionCode 'out.config = null;' #txt
Ns0 f9 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>config = null</name>
        <nameStyle>13,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f9 406 340 36 24 20 -2 #rect
Ns0 f9 @|RichDialogProcessStepIcon #fIcon
Ns0 @PushWFArc f12 '' #zField
Ns0 f12 expr out #txt
Ns0 f12 424 290 424 340 #arcP
Ns0 @PushWFArc f8 '' #zField
Ns0 f8 expr out #txt
Ns0 f8 424 364 424 427 #arcP
Ns0 @RichDialogProcessStep f13 '' #zField
Ns0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData out;
' #txt
Ns0 f13 actionTable 'out=in;
' #txt
Ns0 f13 actionCode 'import ch.ivyteam.db.jdbc.DatabaseConnectionConfiguration;
import java.util.EnumSet;
if (in.dbName.trim().length() > 0 && in.#application != null)
{	
	String name = in.dbName;
	DatabaseConnectionConfiguration dbConfig = new DatabaseConnectionConfiguration();
	EnumSet accessFlags = EnumSet.noneOf(ch.ivyteam.ivy.application.ExternalDatabaseConfigurationAccessFlag.DOWNLOAD_META.getClass());
	out.config = in.application.createExternalDatabaseConfiguration(name, dbConfig, accessFlags, 5);	
}' #txt
Ns0 f13 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create configuration</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f13 30 364 36 24 21 -8 #rect
Ns0 f13 @|RichDialogProcessStepIcon #fIcon
Ns0 @PushWFArc f15 '' #zField
Ns0 f15 expr out #txt
Ns0 f15 48 388 48 427 #arcP
Ns0 @Alternative f16 '' #zField
Ns0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Application or name empty?</name>
        <nameStyle>26,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f16 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f16 34 314 28 28 16 -16 #rect
Ns0 f16 @|AlternativeIcon #fIcon
Ns0 @PushWFArc f17 '' #zField
Ns0 f17 expr out #txt
Ns0 f17 48 290 48 314 #arcP
Ns0 @PushWFArc f18 '' #zField
Ns0 f18 expr in #txt
Ns0 f18 outCond 'in.dbName.trim().length() > 0 && in.#application != null' #txt
Ns0 f18 48 342 48 364 #arcP
Ns0 f18 0 0.3017241379310345 0 0 #arcLabel
Ns0 @RichDialogProcessEnd f14 '' #zField
Ns0 f14 type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
Ns0 f14 211 427 26 26 14 0 #rect
Ns0 f14 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f19 '' #zField
Ns0 f19 expr in #txt
Ns0 f19 62 328 224 427 #arcP
Ns0 f19 1 224 328 #addKink
Ns0 f19 0 0.8159500923310845 0 0 #arcLabel
Ns0 f1 mainOut f3 tail #connect
Ns0 f3 head f2 mainIn #connect
Ns0 f2 mainOut f5 tail #connect
Ns0 f5 head f4 mainIn #connect
Ns0 f7 mainOut f12 tail #connect
Ns0 f12 head f9 mainIn #connect
Ns0 f9 mainOut f8 tail #connect
Ns0 f8 head f11 mainIn #connect
Ns0 f13 mainOut f15 tail #connect
Ns0 f15 head f10 mainIn #connect
Ns0 f6 mainOut f17 tail #connect
Ns0 f17 head f16 in #connect
Ns0 f16 out f18 tail #connect
Ns0 f18 head f13 mainIn #connect
Ns0 f16 out f19 tail #connect
Ns0 f19 head f14 mainIn #connect
>Proto Ns0 Ns0 NewExternalDatabaseConfigurationProcess #zField
>Proto Ns0 .type ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration.NewExternalDatabaseConfigurationData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 .ui2RdDataAction 'out.dbName=panel.nameTextField.text;
out.application=panel.applicationComboBox.getSelectedListEntry() as ch.ivyteam.ivy.application.IApplication;
' #txt
>Proto Ns0 .rdData2UIAction 'panel.nameTextField.text=in.dbName;
panel.applicationComboBox.listData=in.applications;
panel.applicationComboBox.selectedListEntry=in.#application;
' #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
