[Ivy]
[>Created: Wed Jun 17 09:44:45 CEST 2009]
115DB268168B0010 3.12 #module
>Proto >Proto Collection #zClass
Ds0 DatabaseListProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessStep f1 '' #zField
Ds0 @RichDialogProcessEnd f2 '' #zField
Ds0 @RichDialogProcessStart f5 '' #zField
Ds0 @RichDialogProcessEnd f6 '' #zField
Ds0 @RichDialogProcessStart f10 '' #zField
Ds0 @RichDialogProcessStart f11 '' #zField
Ds0 @RichDialogProcessStart f12 '' #zField
Ds0 @PushWFArc f13 '' #zField
Ds0 @RichDialog f14 '' #zField
Ds0 @RichDialogProcessEnd f16 '' #zField
Ds0 @RichDialogProcessEnd f20 '' #zField
Ds0 @RichDialogInitStart f21 '' #zField
Ds0 @PushWFArc f23 '' #zField
Ds0 @RichDialogMethodStart f3 '' #zField
Ds0 @PushWFArc f25 '' #zField
Ds0 @RichDialog f28 '' #zField
Ds0 @PushWFArc f29 '' #zField
Ds0 @PushWFArc f17 '' #zField
Ds0 @PushWFArc f19 '' #zField
Ds0 @PushWFArc f27 '' #zField
Ds0 @Alternative f4 '' #zField
Ds0 @PushWFArc f18 '' #zField
Ds0 @PushWFArc f15 '' #zField
Ds0 @PushWFArc f24 '' #zField
Ds0 @Alternative f26 '' #zField
Ds0 @PushWFArc f30 '' #zField
Ds0 @PushWFArc f31 '' #zField
Ds0 @RichDialogBroadcastStart f32 '' #zField
Ds0 @PushWFArc f33 '' #zField
Ds0 @RichDialogBroadcastStart f34 '' #zField
Ds0 @PushWFArc f35 '' #zField
Ds0 @Alternative f36 '' #zField
Ds0 @PushWFArc f37 '' #zField
Ds0 @RichDialogProcessStep f38 '' #zField
Ds0 @PushWFArc f39 '' #zField
Ds0 @PushWFArc f40 '' #zField
Ds0 @RichDialogFireEvent f41 '' #zField
Ds0 @PushWFArc f42 '' #zField
Ds0 @RichDialogProcessStep f43 '' #zField
Ds0 @PushWFArc f44 '' #zField
Ds0 @PushWFArc f22 '' #zField
Ds0 @RichDialogBroadcastStart f45 '' #zField
Ds0 @PushWFArc f46 '' #zField
Ds0 @RichDialogProcessStep f115 '' #zField
Ds0 @RichDialogFireEvent f47 '' #zField
Ds0 @PushWFArc f48 '' #zField
Ds0 @PushWFArc f7 '' #zField
Ds0 @PushWFArc f8 '' #zField
>Proto Ds0 Ds0 DatabaseListProcess #zField
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ds0 f0 guid 115DB2D0D5051334 #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f0 method start() #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 38 46 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load databases </name>
        <nameStyle>15,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f1 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f1 actionTable 'out=in;
' #txt
Ds0 f1 actionCode 'import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.server.IServer;
import ch.ivyteam.ivy.db.IExternalDatabaseApplicationContext;

IServer server;
ch.ivyteam.ivy.db.IExternalDatabaseApplicationContext extDbManager; 

server = ch.ivyteam.ivy.server.ServerFactory.getServer();
in.databases = new List<ch.ivyteam.ivy.db.IExternalDatabase>();

for (IApplication application : server.getApplicationConfigurationManager().getApplications())
{
	if (in.#applicationFilter == null || (in.#applicationFilter as Object).equals(application))
	{
	  extDbManager = ch.ivyteam.ivy.admin.tool.NavigationHelper.getExternalDatabaseManager(application); 
	  in.databases.addAll(extDbManager.getExternalDatabases().toList());		
	}
}' #txt
Ds0 f1 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f1 158 108 36 24 23 4 #rect
Ds0 f1 @|RichDialogProcessStepIcon #fIcon
Ds0 f2 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f2 35 219 26 26 14 0 #rect
Ds0 f2 @|RichDialogProcessEndIcon #fIcon
Ds0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showDatabase</name>
        <nameStyle>12,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f5 guid 115DB44F60931612 #txt
Ds0 f5 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f5 actionTable 'out=in;
' #txt
Ds0 f5 38 294 20 20 13 0 #rect
Ds0 f5 @|RichDialogProcessStartIcon #fIcon
Ds0 f6 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f6 35 507 26 26 14 0 #rect
Ds0 f6 @|RichDialogProcessEndIcon #fIcon
Ds0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addDatabase</name>
        <nameStyle>11,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f10 guid 118832F5B0CDB98B #txt
Ds0 f10 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f10 actionTable 'out=in;
' #txt
Ds0 f10 238 294 20 20 13 0 #rect
Ds0 f10 @|RichDialogProcessStartIcon #fIcon
Ds0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>removeDatabase</name>
        <nameStyle>14,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f11 guid 118832F6106FE198 #txt
Ds0 f11 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f11 actionTable 'out=in;
' #txt
Ds0 f11 438 206 20 20 13 0 #rect
Ds0 f11 @|RichDialogProcessStartIcon #fIcon
Ds0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f12 guid 118832F6A4BDC000 #txt
Ds0 f12 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f12 actionTable 'out=in;
' #txt
Ds0 f12 302 46 20 20 13 0 #rect
Ds0 f12 @|RichDialogProcessStartIcon #fIcon
Ds0 f13 expr out #txt
Ds0 f13 302 60 194 112 #arcP
Ds0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>confirm dialog</name>
        <nameStyle>14,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f14 targetWindow NEW #txt
Ds0 f14 targetDisplay TOP #txt
Ds0 f14 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Ds0 f14 startMethod askQuestion(String,String,List<String>) #txt
Ds0 f14 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f14 requestActionDecl '<String icon, String question, List<String> buttons> param;' #txt
Ds0 f14 requestMappingAction 'param.icon="question";
param.question="Do you really want to delete the database ''" + in.selectedDatabase.getConfiguration().getUserFriendlyName() + "''?";
param.buttons=["yes","no"];
' #txt
Ds0 f14 responseActionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f14 responseMappingAction 'out=in;
' #txt
Ds0 f14 responseActionCode 'if (result.pressedButton == "yes")
{
	out.hasCancelled = false;
}
else
{
	out.hasCancelled = true;
}' #txt
Ds0 f14 windowConfiguration '#Wed Dec 03 17:20:47 CET 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=true
width=0
title=Delete Database Configuration
' #txt
Ds0 f14 isAsynch false #txt
Ds0 f14 isInnerRd true #txt
Ds0 f14 isDialog true #txt
Ds0 f14 430 324 36 24 24 -15 #rect
Ds0 f14 @|RichDialogIcon #fIcon
Ds0 f16 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f16 435 587 26 26 14 0 #rect
Ds0 f16 @|RichDialogProcessEndIcon #fIcon
Ds0 f20 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f20 235 451 26 26 14 0 #rect
Ds0 f20 @|RichDialogProcessEndIcon #fIcon
Ds0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f21 guid 1189D6CA886906CC #txt
Ds0 f21 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f21 method start(ch.ivyteam.ivy.application.IApplication) #txt
Ds0 f21 disableUIEvents false #txt
Ds0 f21 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ds0 f21 inParameterMapAction 'out.applicationFilter=param.application;
' #txt
Ds0 f21 outParameterDecl '<> result;
' #txt
Ds0 f21 embeddedRdInitializations '* ' #txt
Ds0 f21 166 46 20 20 13 0 #rect
Ds0 f21 @|RichDialogInitStartIcon #fIcon
Ds0 f23 expr out #txt
Ds0 f23 176 66 176 108 #arcP
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Ds0 f3 guid 118E5CF2051B32BD #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f3 method refresh() #txt
Ds0 f3 disableUIEvents false #txt
Ds0 f3 414 46 20 20 13 0 #rect
Ds0 f3 @|RichDialogMethodStartIcon #fIcon
Ds0 f25 expr out #txt
Ds0 f25 414 58 194 115 #arcP
Ds0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>New db config dialog</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f28 targetWindow NEW #txt
Ds0 f28 targetDisplay TOP #txt
Ds0 f28 richDialogId ch.ivyteam.ivy.admin.tool.NewExternalDatabaseConfiguration #txt
Ds0 f28 startMethod start(ch.ivyteam.ivy.application.IApplication) #txt
Ds0 f28 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f28 requestActionDecl '<ch.ivyteam.ivy.application.IApplication application> param;' #txt
Ds0 f28 requestMappingAction 'param.application=in.#applicationFilter;
' #txt
Ds0 f28 responseActionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f28 responseMappingAction 'out=in;
' #txt
Ds0 f28 responseActionCode 'if (result.#externalDatabase is initialized)
{
	panel.refreshButton.doClick();
}' #txt
Ds0 f28 windowConfiguration '#Wed Apr 02 14:48:04 CEST 2008
height=130
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=250
title=New external database configuration
' #txt
Ds0 f28 isAsynch false #txt
Ds0 f28 isInnerRd true #txt
Ds0 f28 isDialog true #txt
Ds0 f28 230 364 36 24 2 2 #rect
Ds0 f28 @|RichDialogIcon #fIcon
Ds0 f29 expr out #txt
Ds0 f29 248 314 248 364 #arcP
Ds0 f17 expr out #txt
Ds0 f17 248 388 248 451 #arcP
Ds0 f19 expr out #txt
Ds0 f19 162 132 57 223 #arcP
Ds0 f27 expr out #txt
Ds0 f27 48 66 48 219 #arcP
Ds0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Has selection?</name>
        <nameStyle>14,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f4 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f4 434 250 28 28 20 -7 #rect
Ds0 f4 @|AlternativeIcon #fIcon
Ds0 f18 expr out #txt
Ds0 f18 448 226 448 250 #arcP
Ds0 f15 expr in #txt
Ds0 f15 outCond 'in.#selectedDatabase is initialized' #txt
Ds0 f15 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f15 448 278 448 324 #arcP
Ds0 f24 expr in #txt
Ds0 f24 434 264 435 600 #arcP
Ds0 f24 1 400 264 #addKink
Ds0 f24 2 400 600 #addKink
Ds0 f24 1 0.4236937051841499 0 0 #arcLabel
Ds0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Has selection?</name>
        <nameStyle>14,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f26 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f26 34 338 28 28 20 -7 #rect
Ds0 f26 @|AlternativeIcon #fIcon
Ds0 f30 expr out #txt
Ds0 f30 48 314 48 338 #arcP
Ds0 f31 expr in #txt
Ds0 f31 outCond '!(in.#selectedDatabase is initialized)' #txt
Ds0 f31 34 352 35 520 #arcP
Ds0 f31 1 16 352 #addKink
Ds0 f31 2 16 520 #addKink
Ds0 f31 1 0.4236937051841499 0 0 #arcLabel
Ds0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>applicationDeleted</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f32 guid 11C8AC7CBCA95A94 #txt
Ds0 f32 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f32 broadcast applicationDeleted #txt
Ds0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f32 actionTable 'out=in;
' #txt
Ds0 f32 406 102 20 20 13 0 #rect
Ds0 f32 @|RichDialogBroadcastStartIcon #fIcon
Ds0 f33 expr out #txt
Ds0 f33 406 112 194 119 #arcP
Ds0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>externalDatabaseDeleted</name>
    </language>
</elementInfo>
' #txt
Ds0 f34 guid 11C8E39BA89A8B66 #txt
Ds0 f34 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f34 broadcast externalDatabaseDeleted #txt
Ds0 f34 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f34 actionTable 'out=in;
' #txt
Ds0 f34 414 142 20 20 13 0 #rect
Ds0 f34 @|RichDialogBroadcastStartIcon #fIcon
Ds0 f35 expr out #txt
Ds0 f35 414 150 194 122 #arcP
Ds0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is dialog ok?</name>
        <nameStyle>13,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f36 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f36 434 370 28 28 14 0 #rect
Ds0 f36 @|AlternativeIcon #fIcon
Ds0 f37 expr out #txt
Ds0 f37 448 348 448 370 #arcP
Ds0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete</name>
        <nameStyle>6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f38 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f38 actionTable 'out=in;
' #txt
Ds0 f38 actionCode 'out.dbId = in.selectedDatabase.getConfiguration().getId();
in.selectedDatabase.getConfiguration().getApplication().deleteExternalDatabaseConfiguration(in.selectedDatabase.getConfiguration().getUserFriendlyName());
' #txt
Ds0 f38 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f38 430 444 36 24 20 -2 #rect
Ds0 f38 @|RichDialogProcessStepIcon #fIcon
Ds0 f39 expr in #txt
Ds0 f39 outCond !in.hasCancelled #txt
Ds0 f39 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f39 448 398 448 444 #arcP
Ds0 f40 expr in #txt
Ds0 f40 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f40 462 384 461 600 #arcP
Ds0 f40 1 568 384 #addKink
Ds0 f40 2 568 600 #addKink
Ds0 f40 1 0.5041666666666667 0 0 #arcLabel
Ds0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>fire event</name>
        <nameStyle>10,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f41 actionDecl 'Number externalDatabaseId;
' #txt
Ds0 f41 actionTable 'externalDatabaseId=in.dbId;
' #txt
Ds0 f41 actionCode panel.fireExternalDatabaseDeleted(externalDatabaseId); #txt
Ds0 f41 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f41 fireEvent externalDatabaseDeleted(Number) #txt
Ds0 f41 430 492 36 24 20 -2 #rect
Ds0 f41 @|RichDialogFireEventIcon #fIcon
Ds0 f42 expr out #txt
Ds0 f42 448 468 448 492 #arcP
Ds0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f43 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f43 actionTable 'out=in;
' #txt
Ds0 f43 actionCode 'panel.refreshButton.doClick();	
' #txt
Ds0 f43 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f43 430 540 36 24 20 -2 #rect
Ds0 f43 @|RichDialogProcessStepIcon #fIcon
Ds0 f44 expr out #txt
Ds0 f44 448 516 448 540 #arcP
Ds0 f22 expr out #txt
Ds0 f22 448 564 448 587 #arcP
Ds0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>processModelVersionDeployed</name>
    </language>
</elementInfo>
' #txt
Ds0 f45 guid 11E01B72D89E611A #txt
Ds0 f45 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f45 broadcast processModelVersionDeployed #txt
Ds0 f45 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f45 actionTable 'out=in;
' #txt
Ds0 f45 302 166 20 20 13 0 #rect
Ds0 f45 @|RichDialogBroadcastStartIcon #fIcon
Ds0 f46 expr out #txt
Ds0 f46 302 172 194 127 #arcP
Ds0 f115 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>prepare parameters</name>
        <nameStyle>18,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f115 actionDecl 'ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData out;
' #txt
Ds0 f115 actionTable 'out=in;
' #txt
Ds0 f115 actionCode 'out.parameterList = ["database", in.selectedDatabase.getConfiguration().getId(), in.selectedDatabase];
' #txt
Ds0 f115 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f115 30 396 36 24 20 -2 #rect
Ds0 f115 @|RichDialogProcessStepIcon #fIcon
Ds0 f47 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>open detail panel</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f47 actionDecl 'List parameters;
' #txt
Ds0 f47 actionTable 'parameters=in.parameterList;
' #txt
Ds0 f47 actionCode panel.fireSubPanelRequested(parameters); #txt
Ds0 f47 type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
Ds0 f47 fireEvent subPanelRequested(List) #txt
Ds0 f47 30 452 36 24 20 -2 #rect
Ds0 f47 @|RichDialogFireEventIcon #fIcon
Ds0 f48 expr out #txt
Ds0 f48 48 420 48 452 #arcP
Ds0 f7 expr in #txt
Ds0 f7 outCond 'in.#selectedDatabase is initialized' #txt
Ds0 f7 48 366 48 396 #arcP
Ds0 f8 expr out #txt
Ds0 f8 48 476 48 507 #arcP
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.database.DatabaseList.DatabaseListData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 .ui2RdDataAction 'out.selectedDatabase=panel.databaseList.#selectedListEntry as ch.ivyteam.ivy.db.IExternalDatabase;
' #txt
>Proto Ds0 .rdData2UIAction 'panel.databaseList.listData=in.databases;
' #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f12 mainOut f13 tail #connect
Ds0 f13 head f1 mainIn #connect
Ds0 f21 mainOut f23 tail #connect
Ds0 f23 head f1 mainIn #connect
Ds0 f3 mainOut f25 tail #connect
Ds0 f25 head f1 mainIn #connect
Ds0 f10 mainOut f29 tail #connect
Ds0 f29 head f28 mainIn #connect
Ds0 f28 mainOut f17 tail #connect
Ds0 f17 head f20 mainIn #connect
Ds0 f1 mainOut f19 tail #connect
Ds0 f19 head f2 mainIn #connect
Ds0 f0 mainOut f27 tail #connect
Ds0 f27 head f2 mainIn #connect
Ds0 f11 mainOut f18 tail #connect
Ds0 f18 head f4 in #connect
Ds0 f4 out f15 tail #connect
Ds0 f15 head f14 mainIn #connect
Ds0 f4 out f24 tail #connect
Ds0 f24 head f16 mainIn #connect
Ds0 f5 mainOut f30 tail #connect
Ds0 f30 head f26 in #connect
Ds0 f26 out f31 tail #connect
Ds0 f31 head f6 mainIn #connect
Ds0 f32 mainOut f33 tail #connect
Ds0 f33 head f1 mainIn #connect
Ds0 f34 mainOut f35 tail #connect
Ds0 f35 head f1 mainIn #connect
Ds0 f14 mainOut f37 tail #connect
Ds0 f37 head f36 in #connect
Ds0 f36 out f39 tail #connect
Ds0 f39 head f38 mainIn #connect
Ds0 f36 out f40 tail #connect
Ds0 f40 head f16 mainIn #connect
Ds0 f38 mainOut f42 tail #connect
Ds0 f42 head f41 mainIn #connect
Ds0 f41 mainOut f44 tail #connect
Ds0 f44 head f43 mainIn #connect
Ds0 f43 mainOut f22 tail #connect
Ds0 f22 head f16 mainIn #connect
Ds0 f45 mainOut f46 tail #connect
Ds0 f46 head f1 mainIn #connect
Ds0 f115 mainOut f48 tail #connect
Ds0 f48 head f47 mainIn #connect
Ds0 f26 out f7 tail #connect
Ds0 f7 head f115 mainIn #connect
Ds0 f47 mainOut f8 tail #connect
Ds0 f8 head f6 mainIn #connect
