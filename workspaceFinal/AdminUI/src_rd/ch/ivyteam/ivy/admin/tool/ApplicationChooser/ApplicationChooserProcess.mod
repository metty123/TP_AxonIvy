[Ivy]
[>Created: Wed Jul 15 16:10:35 CEST 2009]
1217758C5F54B25D 3.12 #module
>Proto >Proto Collection #zClass
As0 ApplicationChooserProcess Big #zClass
As0 RD #cInfo
As0 #process
As0 @AnnotationInP-0n ai ai #zField
As0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
As0 @TextInP .rdData2UIAction .rdData2UIAction #zField
As0 @TextInP .resExport .resExport #zField
As0 @TextInP .type .type #zField
As0 @TextInP .processKind .processKind #zField
As0 @TextInP .xml .xml #zField
As0 @TextInP .responsibility .responsibility #zField
As0 @MessageFlowInP-0n messageIn messageIn #zField
As0 @MessageFlowOutP-0n messageOut messageOut #zField
As0 @RichDialogInitStart f0 '' #zField
As0 @RichDialogProcessEnd f1 '' #zField
As0 @RichDialogInitStart f3 '' #zField
As0 @RichDialogProcessStep f5 '' #zField
As0 @PushWFArc f6 '' #zField
As0 @RichDialogProcessStart f4 '' #zField
As0 @RichDialogProcessStart f7 '' #zField
As0 @RichDialogEnd f8 '' #zField
As0 @PushWFArc f9 '' #zField
As0 @PushWFArc f10 '' #zField
As0 @PushWFArc f11 '' #zField
As0 @PushWFArc f2 '' #zField
>Proto As0 As0 ApplicationChooserProcess #zField
As0 f0 guid 1217758C605285B8 #txt
As0 f0 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f0 method start() #txt
As0 f0 disableUIEvents false #txt
As0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
As0 f0 outParameterDecl '<> result;
' #txt
As0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
As0 f0 54 38 20 20 13 0 #rect
As0 f0 @|RichDialogInitStartIcon #fIcon
As0 f1 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f1 51 211 26 26 14 0 #rect
As0 f1 @|RichDialogProcessEndIcon #fIcon
As0 f3 guid 121775E910D69964 #txt
As0 f3 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f3 method chooseApplication(ch.ivyteam.ivy.application.IApplication) #txt
As0 f3 disableUIEvents false #txt
As0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
As0 f3 inParameterMapAction 'out.application=param.application;
' #txt
As0 f3 outParameterDecl '<ch.ivyteam.ivy.application.IApplication application> result;
' #txt
As0 f3 outParameterMapAction 'result.application=in.application;
' #txt
As0 f3 embeddedRdInitializations '* ' #txt
As0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>chooseApplication()</name>
        <nameStyle>19,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f3 142 38 20 20 13 0 #rect
As0 f3 @|RichDialogInitStartIcon #fIcon
As0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData out;
' #txt
As0 f5 actionTable 'out=in;
' #txt
As0 f5 actionCode 'import ch.ivyteam.ivy.application.IApplication;

in.applications = new List<IApplication>();
in.applications.addAll(ch.ivyteam.ivy.server.ServerFactory.getServer().getApplicationConfigurationManager().getApplications());
if(in.application != null){
  panel.cboApplication.setSelectedListEntry(in.application.getName());	
}

' #txt
As0 f5 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load applications</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f5 46 124 36 24 20 -2 #rect
As0 f5 @|RichDialogProcessStepIcon #fIcon
As0 f6 expr out #txt
As0 f6 152 58 64 124 #arcP
As0 f6 1 152 108 #addKink
As0 f6 2 64 108 #addKink
As0 f6 1 0.48295454545454547 0 0 #arcLabel
As0 f4 guid 1217765BA0F5A67F #txt
As0 f4 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData out;
' #txt
As0 f4 actionTable 'out=in;
' #txt
As0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Ok</name>
        <nameStyle>2,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f4 334 46 20 20 13 0 #rect
As0 f4 @|RichDialogProcessStartIcon #fIcon
As0 f7 guid 1217765DBC0D615F #txt
As0 f7 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData out;
' #txt
As0 f7 actionTable 'out=in;
out.application=null;
' #txt
As0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f7 422 46 20 20 13 0 #rect
As0 f7 @|RichDialogProcessStartIcon #fIcon
As0 f8 type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
As0 f8 guid 121776600EC9AAFC #txt
As0 f8 331 107 26 26 14 0 #rect
As0 f8 @|RichDialogEndIcon #fIcon
As0 f9 expr out #txt
As0 f9 344 66 344 107 #arcP
As0 f10 expr out #txt
As0 f10 432 66 344 107 #arcP
As0 f10 1 432 80 #addKink
As0 f10 2 344 80 #addKink
As0 f10 1 0.48295454545454536 0 0 #arcLabel
As0 f11 expr out #txt
As0 f11 64 58 64 124 #arcP
As0 f2 expr out #txt
As0 f2 64 148 64 211 #arcP
>Proto As0 .ui2RdDataAction 'out.application=panel.cboApplication.#selectedListEntry as ch.ivyteam.ivy.application.IApplication;
' #txt
>Proto As0 .rdData2UIAction 'panel.cboApplication.listData=in.applications;
' #txt
>Proto As0 .type ch.ivyteam.ivy.admin.tool.ApplicationChooser.ApplicationChooserData #txt
>Proto As0 .processKind RICH_DIALOG #txt
>Proto As0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>281</swimlaneSize>
    <swimlaneSize>297</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
</elementInfo>
' #txt
>Proto As0 -8 -8 16 16 16 26 #rect
>Proto As0 '' #fIcon
As0 f3 mainOut f6 tail #connect
As0 f6 head f5 mainIn #connect
As0 f4 mainOut f9 tail #connect
As0 f9 head f8 mainIn #connect
As0 f7 mainOut f10 tail #connect
As0 f10 head f8 mainIn #connect
As0 f0 mainOut f11 tail #connect
As0 f11 head f5 mainIn #connect
As0 f5 mainOut f2 tail #connect
As0 f2 head f1 mainIn #connect
