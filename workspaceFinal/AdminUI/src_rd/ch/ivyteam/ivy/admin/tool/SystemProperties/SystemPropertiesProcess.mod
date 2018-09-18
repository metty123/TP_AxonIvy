[Ivy]
[>Created: Wed Jul 27 14:31:45 ICT 2016]
118747883A39E84A 3.18 #module
>Proto >Proto Collection #zClass
Ss0 SystemPropertiesProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @RichDialogInitStart f0 '' #zField
Ss0 @RichDialogProcessEnd f1 '' #zField
Ss0 @RichDialogMethodStart f12 '' #zField
Ss0 @RichDialogMethodStart f14 '' #zField
Ss0 @RichDialogEnd f16 '' #zField
Ss0 @PushWFArc f17 '' #zField
Ss0 @RichDialogProcessStep f20 '' #zField
Ss0 @PushWFArc f21 '' #zField
Ss0 @RichDialogProcessStart f22 '' #zField
Ss0 @PushWFArc f23 '' #zField
Ss0 @RichDialogProcessStart f24 '' #zField
Ss0 @PushWFArc f25 '' #zField
Ss0 @RichDialogProcessEnd f5 '' #zField
Ss0 @PushWFArc f6 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogMethodStart f3 '' #zField
Ss0 @RichDialogProcessEnd f4 '' #zField
Ss0 @PushWFArc f7 '' #zField
>Proto Ss0 Ss0 SystemPropertiesProcess #zField
Ss0 f0 guid 1187508B7CA970DA #txt
Ss0 f0 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f0 method start() #txt
Ss0 f0 disableUIEvents false #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 embeddedRdInitializations '{/systemPropertyListPanel {/fieldName "systemPropertyListPanel"/startMethod "start(ch.ivyteam.ivy.application.ISystemPropertyProvider)"/parameterMapping "param.propertyProvider=ch.ivyteam.ivy.server.ServerFactory.getServer().getApplicationConfigurationManager();\n"/initScript ""/userContext * }/headerpane {/fieldName "headerpane"/startMethod "start(String,String)"/parameterMapping "param.iconUri=\"/Icons/SystemProperties/48\";\nparam.title=\"System Properties\";\n"/initScript ""/userContext * }}' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 54 38 20 20 13 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 f1 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f1 51 211 26 26 14 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f12 guid 1189E25B0B1A335F #txt
Ss0 f12 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f12 method close() #txt
Ss0 f12 disableUIEvents false #txt
Ss0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close()</name>
    </language>
</elementInfo>
' #txt
Ss0 f12 54 286 20 20 13 0 #rect
Ss0 f12 @|RichDialogMethodStartIcon #fIcon
Ss0 f14 guid 1189E25B581BA7F3 #txt
Ss0 f14 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f14 method refresh() #txt
Ss0 f14 disableUIEvents false #txt
Ss0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Ss0 f14 278 54 20 20 13 0 #rect
Ss0 f14 @|RichDialogMethodStartIcon #fIcon
Ss0 f16 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f16 guid 1189E25C9D7DC474 #txt
Ss0 f16 51 379 26 26 14 0 #rect
Ss0 f16 @|RichDialogEndIcon #fIcon
Ss0 f17 expr out #txt
Ss0 f17 64 306 64 379 #arcP
Ss0 f20 actionDecl 'ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData out;
' #txt
Ss0 f20 actionTable 'out=in;
' #txt
Ss0 f20 actionCode panel.systemPropertyListPanel.refresh(); #txt
Ss0 f20 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Preserve selection</name>
        <nameStyle>18,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f20 270 116 36 24 20 -2 #rect
Ss0 f20 @|RichDialogProcessStepIcon #fIcon
Ss0 f21 expr out #txt
Ss0 f21 288 74 288 116 #arcP
Ss0 f22 guid 119753DC72C74565 #txt
Ss0 f22 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f22 actionDecl 'ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData out;
' #txt
Ss0 f22 actionTable 'out=in;
' #txt
Ss0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f22 342 54 20 20 13 0 #rect
Ss0 f22 @|RichDialogProcessStartIcon #fIcon
Ss0 f23 expr out #txt
Ss0 f23 344 71 300 116 #arcP
Ss0 f24 guid 1197551C2F09CE0D #txt
Ss0 f24 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData out;
' #txt
Ss0 f24 actionTable 'out=in;
' #txt
Ss0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f24 118 286 20 20 13 0 #rect
Ss0 f24 @|RichDialogProcessStartIcon #fIcon
Ss0 f25 expr out #txt
Ss0 f25 122 304 71 381 #arcP
Ss0 f5 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f5 275 203 26 26 14 0 #rect
Ss0 f5 @|RichDialogProcessEndIcon #fIcon
Ss0 f6 expr out #txt
Ss0 f6 288 140 288 203 #arcP
Ss0 f2 expr out #txt
Ss0 f2 64 58 64 211 #arcP
Ss0 f3 guid 11F426730858E937 #txt
Ss0 f3 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f3 method matchIdentifier(String,java.lang.Object) #txt
Ss0 f3 disableUIEvents false #txt
Ss0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
Ss0 f3 inParameterMapAction 'out.tempType=param.type;
' #txt
Ss0 f3 outParameterDecl '<java.lang.String name> result;
' #txt
Ss0 f3 outActionCode 'if (in.tempType == "properties")
{
	result.name = panel.getName();
}' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier(String,Object)</name>
        <nameStyle>30,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 230 270 20 20 13 0 #rect
Ss0 f3 @|RichDialogMethodStartIcon #fIcon
Ss0 f4 type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
Ss0 f4 227 331 26 26 14 0 #rect
Ss0 f4 @|RichDialogProcessEndIcon #fIcon
Ss0 f7 expr out #txt
Ss0 f7 240 290 240 331 #arcP
>Proto Ss0 .type ch.ivyteam.ivy.admin.tool.SystemProperties.SystemPropertiesData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f12 mainOut f17 tail #connect
Ss0 f17 head f16 mainIn #connect
Ss0 f14 mainOut f21 tail #connect
Ss0 f21 head f20 mainIn #connect
Ss0 f22 mainOut f23 tail #connect
Ss0 f23 head f20 mainIn #connect
Ss0 f24 mainOut f25 tail #connect
Ss0 f25 head f16 mainIn #connect
Ss0 f20 mainOut f6 tail #connect
Ss0 f6 head f5 mainIn #connect
Ss0 f0 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f3 mainOut f7 tail #connect
Ss0 f7 head f4 mainIn #connect
