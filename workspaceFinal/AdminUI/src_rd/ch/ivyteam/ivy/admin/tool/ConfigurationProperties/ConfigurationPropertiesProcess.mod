[Ivy]
[>Created: Wed Jul 27 14:36:08 ICT 2016]
11B2072F885FE0FB 3.18 #module
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
Ss0 @RichDialogProcessStep f3 '' #zField
Ss0 @PushWFArc f4 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogProcessStart f5 '' #zField
Ss0 @RichDialog f6 '' #zField
Ss0 @Alternative f7 '' #zField
Ss0 @PushWFArc f8 '' #zField
Ss0 @PushWFArc f9 '' #zField
Ss0 @RichDialogProcessEnd f10 '' #zField
Ss0 @PushWFArc f11 '' #zField
Ss0 @RichDialogMethodStart f12 '' #zField
Ss0 @RichDialogMethodStart f14 '' #zField
Ss0 @RichDialogEnd f16 '' #zField
Ss0 @PushWFArc f17 '' #zField
Ss0 @RichDialogProcessStep f13 '' #zField
Ss0 @PushWFArc f19 '' #zField
Ss0 @PushWFArc f18 '' #zField
Ss0 @RichDialogProcessStep f20 '' #zField
Ss0 @PushWFArc f21 '' #zField
Ss0 @PushWFArc f15 '' #zField
>Proto Ss0 Ss0 SystemPropertiesProcess #zField
Ss0 f0 guid 1187508B7CA970DA #txt
Ss0 f0 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f0 method start(ch.ivyteam.ivy.system.IConfigurationPropertyProvider) #txt
Ss0 f0 disableUIEvents false #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.system.IConfigurationPropertyProvider propertyProvider> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 inParameterMapAction 'out.propertyProvider=param.propertyProvider;
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 embeddedRdInitializations '* ' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IConfigurationPropertyProvider)</name>
    </language>
</elementInfo>
' #txt
Ss0 f0 54 38 20 20 13 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 f1 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f1 51 211 26 26 14 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData out;
' #txt
Ss0 f3 actionTable 'out=in;
' #txt
Ss0 f3 actionCode 'import ch.ivyteam.ivy.system.IProperty;
import ch.ivyteam.ivy.system.UserInterfaceFormat;
java.util.List allProps = in.propertyProvider.getConfigurationProperties();

out.properties = [];
for (IProperty prop : allProps)
{
	if (prop.getUserInterfaceFormat() != UserInterfaceFormat.INVISIBLE)
	{
		out.properties.add(prop);
	}
}

' #txt
Ss0 f3 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Init properties</name>
        <nameStyle>15,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 46 124 36 24 26 -9 #rect
Ss0 f3 @|RichDialogProcessStepIcon #fIcon
Ss0 f4 expr out #txt
Ss0 f4 64 58 64 124 #arcP
Ss0 f2 expr out #txt
Ss0 f2 64 148 64 211 #arcP
Ss0 f5 guid 118750C9F1424241 #txt
Ss0 f5 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData out;
' #txt
Ss0 f5 actionTable 'out=in;
' #txt
Ss0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>editProperty</name>
        <nameStyle>12,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f5 462 30 20 20 13 0 #rect
Ss0 f5 @|RichDialogProcessStartIcon #fIcon
Ss0 f6 targetWindow NEW:card: #txt
Ss0 f6 targetDisplay TOP #txt
Ss0 f6 richDialogId ch.ivyteam.ivy.admin.tool.SystemPropertyEditor #txt
Ss0 f6 startMethod start(ch.ivyteam.ivy.system.IProperty) #txt
Ss0 f6 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f6 requestActionDecl '<ch.ivyteam.ivy.system.IProperty property> param;' #txt
Ss0 f6 requestMappingAction 'param.property=panel.propertiesTable.selectedListEntry as ch.ivyteam.ivy.system.IProperty;
' #txt
Ss0 f6 responseActionDecl 'ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData out;
' #txt
Ss0 f6 responseMappingAction 'out=in;
' #txt
Ss0 f6 windowConfiguration '{/title "Application Property Editor"/width 0 /height 0 /centered true /resizable false /maximized false /close_after_last_rd true }' #txt
Ss0 f6 isAsynch false #txt
Ss0 f6 isInnerRd true #txt
Ss0 f6 isDialog true #txt
Ss0 f6 userContext '* ' #txt
Ss0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open property editor</name>
        <nameStyle>20,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f6 486 124 36 24 20 -2 #rect
Ss0 f6 @|RichDialogIcon #fIcon
Ss0 f7 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Is property selected?</name>
        <nameStyle>21,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f7 458 82 28 28 20 -16 #rect
Ss0 f7 @|AlternativeIcon #fIcon
Ss0 f8 expr out #txt
Ss0 f8 472 50 472 82 #arcP
Ss0 f9 expr in #txt
Ss0 f9 outCond 'panel.propertiesTable.getSelectedRowCount() > 0' #txt
Ss0 f9 481 101 504 124 #arcP
Ss0 f9 1 504 112 #addKink
Ss0 f9 1 0.053578167166760594 0 0 #arcLabel
Ss0 f10 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f10 459 227 26 26 14 0 #rect
Ss0 f10 @|RichDialogProcessEndIcon #fIcon
Ss0 f11 expr in #txt
Ss0 f11 472 110 472 227 #arcP
Ss0 f11 0 0.43892936508689356 0 0 #arcLabel
Ss0 f12 guid 1189E25B0B1A335F #txt
Ss0 f12 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
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
Ss0 f14 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f14 method refresh() #txt
Ss0 f14 disableUIEvents false #txt
Ss0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Ss0 f14 294 38 20 20 13 0 #rect
Ss0 f14 @|RichDialogMethodStartIcon #fIcon
Ss0 f16 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f16 guid 1189E25C9D7DC474 #txt
Ss0 f16 51 379 26 26 14 0 #rect
Ss0 f16 @|RichDialogEndIcon #fIcon
Ss0 f17 expr out #txt
Ss0 f17 64 306 64 379 #arcP
Ss0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData out;
' #txt
Ss0 f13 actionTable 'out=in;
' #txt
Ss0 f13 actionCode in.properties.elementChanged(in.selectedProperty); #txt
Ss0 f13 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Refresh</name>
        <nameStyle>7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f13 486 172 36 24 20 -2 #rect
Ss0 f13 @|RichDialogProcessStepIcon #fIcon
Ss0 f19 expr out #txt
Ss0 f19 504 148 504 172 #arcP
Ss0 f19 0 0.4517609597949989 0 0 #arcLabel
Ss0 f18 expr out #txt
Ss0 f18 497 196 478 228 #arcP
Ss0 f20 actionDecl 'ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData out;
' #txt
Ss0 f20 actionTable 'out=in;
' #txt
Ss0 f20 actionCode 'in.selectedProperty = panel.propertiesTable.#selectedListEntry as ch.ivyteam.ivy.system.IProperty;
' #txt
Ss0 f20 type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
Ss0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Preserve selection</name>
        <nameStyle>18,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f20 286 84 36 24 20 -2 #rect
Ss0 f20 @|RichDialogProcessStepIcon #fIcon
Ss0 f21 expr out #txt
Ss0 f21 304 58 304 84 #arcP
Ss0 f15 expr out #txt
Ss0 f15 286 96 66 124 #arcP
Ss0 f15 1 72 96 #addKink
Ss0 f15 0 0.5895415191907598 0 0 #arcLabel
>Proto Ss0 .type ch.ivyteam.ivy.admin.tool.ConfigurationProperties.ConfigurationPropertiesData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 .ui2RdDataAction 'out.selectedProperty=panel.propertiesTable.#selectedListEntry as ch.ivyteam.ivy.system.IProperty;
' #txt
>Proto Ss0 .rdData2UIAction 'panel.propertiesTable.listData=in.properties;
panel.propertiesTable.selectedListEntry=in.#selectedProperty;
' #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f0 mainOut f4 tail #connect
Ss0 f4 head f3 mainIn #connect
Ss0 f3 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f5 mainOut f8 tail #connect
Ss0 f8 head f7 in #connect
Ss0 f7 out f9 tail #connect
Ss0 f9 head f6 mainIn #connect
Ss0 f7 out f11 tail #connect
Ss0 f11 head f10 mainIn #connect
Ss0 f12 mainOut f17 tail #connect
Ss0 f17 head f16 mainIn #connect
Ss0 f6 mainOut f19 tail #connect
Ss0 f19 head f13 mainIn #connect
Ss0 f13 mainOut f18 tail #connect
Ss0 f18 head f10 mainIn #connect
Ss0 f14 mainOut f21 tail #connect
Ss0 f21 head f20 mainIn #connect
Ss0 f20 mainOut f15 tail #connect
Ss0 f15 head f3 mainIn #connect
