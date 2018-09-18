[Ivy]
[>Created: Wed Jun 25 17:40:23 ICT 2014]
126C1B5AFA7F71D3 3.17 #module
>Proto >Proto Collection #zClass
Us0 UserPropertiesProcess Big #zClass
Us0 RD #cInfo
Us0 #process
Us0 @AnnotationInP-0n ai ai #zField
Us0 @MessageFlowInP-0n messageIn messageIn #zField
Us0 @MessageFlowOutP-0n messageOut messageOut #zField
Us0 @TextInP .xml .xml #zField
Us0 @TextInP .responsibility .responsibility #zField
Us0 @TextInP .resExport .resExport #zField
Us0 @TextInP .type .type #zField
Us0 @TextInP .processKind .processKind #zField
Us0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Us0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Us0 @RichDialogInitStart f0 '' #zField
Us0 @RichDialogProcessEnd f1 '' #zField
Us0 @PushWFArc f2 '' #zField
Us0 @RichDialogInitStart f3 '' #zField
Us0 @RichDialogProcessStep f5 '' #zField
Us0 @PushWFArc f6 '' #zField
Us0 @PushWFArc f4 '' #zField
Us0 @RichDialogProcessStart f7 '' #zField
Us0 @RichDialogEnd f8 '' #zField
Us0 @PushWFArc f9 '' #zField
Us0 @RichDialogProcessStart f10 '' #zField
Us0 @RichDialogProcessStart f12 '' #zField
Us0 @RichDialogProcessStart f14 '' #zField
Us0 @RichDialogProcessEnd f17 '' #zField
Us0 @PushWFArc f19 '' #zField
Us0 @PushWFArc f13 '' #zField
Us0 @RichDialogProcessStart f15 '' #zField
Us0 @RichDialogProcessEnd f16 '' #zField
Us0 @PushWFArc f18 '' #zField
Us0 @RichDialogProcessStart f20 '' #zField
Us0 @RichDialogProcessEnd f21 '' #zField
Us0 @RichDialogProcessStep f23 '' #zField
Us0 @PushWFArc f24 '' #zField
Us0 @RichDialogProcessStep f25 '' #zField
Us0 @PushWFArc f26 '' #zField
Us0 @RichDialog f27 '' #zField
Us0 @PushWFArc f28 '' #zField
Us0 @PushWFArc f22 '' #zField
Us0 @Alternative f29 '' #zField
Us0 @PushWFArc f30 '' #zField
Us0 @RichDialog f11 '' #zField
Us0 @PushWFArc f31 '' #zField
Us0 @PushWFArc f32 '' #zField
Us0 @PushWFArc f33 '' #zField
Us0 @RichDialog f34 '' #zField
Us0 @RichDialogProcessStart f35 '' #zField
Us0 @RichDialogProcessEnd f36 '' #zField
Us0 @PushWFArc f37 '' #zField
Us0 @PushWFArc f38 '' #zField
>Proto Us0 Us0 UserPropertiesProcess #zField
Us0 f0 guid 126C1B5AFF59936D #txt
Us0 f0 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f0 method start() #txt
Us0 f0 disableUIEvents true #txt
Us0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f0 outParameterDecl '<> result;
' #txt
Us0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Us0 f0 90 40 20 20 13 0 #rect
Us0 f0 @|RichDialogInitStartIcon #fIcon
Us0 f1 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f1 90 140 20 20 13 0 #rect
Us0 f1 @|RichDialogProcessEndIcon #fIcon
Us0 f2 expr out #txt
Us0 f2 100 60 100 140 #arcP
Us0 f3 guid 126C1D89FE84CD3C #txt
Us0 f3 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f3 method start(ch.ivyteam.ivy.security.IUser) #txt
Us0 f3 disableUIEvents true #txt
Us0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.IUser user> param = methodEvent.getInputArguments();
' #txt
Us0 f3 inParameterMapAction 'out.user=param.user;
' #txt
Us0 f3 outParameterDecl '<> result;
' #txt
Us0 f3 embeddedRdInitializations '* ' #txt
Us0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IUser)</name>
        <nameStyle>12,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f3 182 38 20 20 13 0 #rect
Us0 f3 @|RichDialogInitStartIcon #fIcon
Us0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f5 actionTable 'out=in;
' #txt
Us0 f5 actionCode 'import ch.ivyteam.ivy.rd.common.Property;

for (String propertyName : in.user.getAllPropertyNames())
{
	Property property = new Property();
	property.setName(propertyName);
	property.setValue(in.user.getProperty(propertyName));
	in.properties.add(property);
}
' #txt
Us0 f5 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load list</name>
        <nameStyle>9,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f5 126 85 36 22 20 -2 #rect
Us0 f5 @|RichDialogProcessStepIcon #fIcon
Us0 f6 expr out #txt
Us0 f6 184 55 155 85 #arcP
Us0 f4 expr out #txt
Us0 f4 135 107 106 142 #arcP
Us0 f7 guid 126C1F793132155C #txt
Us0 f7 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f7 actionTable 'out=in;
' #txt
Us0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel</name>
        <nameStyle>6,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f7 302 30 20 20 13 0 #rect
Us0 f7 @|RichDialogProcessStartIcon #fIcon
Us0 f8 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f8 guid 126C1F7F3C2A9AA7 #txt
Us0 f8 302 126 20 20 13 0 #rect
Us0 f8 @|RichDialogEndIcon #fIcon
Us0 f9 expr out #txt
Us0 f9 312 50 312 126 #arcP
Us0 f10 guid 126C1F819F73E925 #txt
Us0 f10 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f10 actionTable 'out=in;
' #txt
Us0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Ok</name>
        <nameStyle>2,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f10 510 22 20 20 13 0 #rect
Us0 f10 @|RichDialogProcessStartIcon #fIcon
Us0 f12 guid 126C23D41FBB1001 #txt
Us0 f12 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f12 actionTable 'out=in;
' #txt
Us0 f12 actionCode panel.getRootPane().setDefaultButton(panel.okButton); #txt
Us0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load</name>
        <nameStyle>4,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f12 174 142 20 20 13 0 #rect
Us0 f12 @|RichDialogProcessStartIcon #fIcon
Us0 f14 guid 126C23DE8DA2619F #txt
Us0 f14 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f14 actionTable 'out=in;
' #txt
Us0 f14 actionCode in.properties.remove(panel.propertyTable.getSelectedListEntry()); #txt
Us0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete</name>
        <nameStyle>6,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f14 94 222 20 20 13 0 #rect
Us0 f14 @|RichDialogProcessStartIcon #fIcon
Us0 f17 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f17 94 302 20 20 13 0 #rect
Us0 f17 @|RichDialogProcessEndIcon #fIcon
Us0 f19 expr out #txt
Us0 f19 174 151 109 150 #arcP
Us0 f13 expr out #txt
Us0 f13 104 242 104 302 #arcP
Us0 f15 guid 126C254CAF22D230 #txt
Us0 f15 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f15 actionTable 'out=in;
out.selectedProperty=panel.propertyTable.#selectedListEntry as ch.ivyteam.ivy.rd.common.Property;
' #txt
Us0 f15 actionCode 'import ch.ivyteam.ivy.rd.common.Property;

boolean selected = in.#selectedProperty != null;
Property property = in.#selectedProperty;

panel.editButton.setEnabled(selected);
if (selected)
{
	panel.deleteButton.setEnabled(!in.user.isPropertyBacked(in.selectedProperty.name));
}
else
{
	panel.deleteButton.setEnabled(false);
}' #txt
Us0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>selection</name>
        <nameStyle>9,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f15 198 222 20 20 13 0 #rect
Us0 f15 @|RichDialogProcessStartIcon #fIcon
Us0 f16 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f16 198 302 20 20 13 0 #rect
Us0 f16 @|RichDialogProcessEndIcon #fIcon
Us0 f18 expr out #txt
Us0 f18 208 242 208 302 #arcP
Us0 f20 guid 126C256994CC86DB #txt
Us0 f20 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f20 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f20 actionTable 'out=in;
' #txt
Us0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>add</name>
        <nameStyle>3,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f20 294 230 20 20 13 0 #rect
Us0 f20 @|RichDialogProcessStartIcon #fIcon
Us0 f21 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f21 294 350 20 20 13 0 #rect
Us0 f21 @|RichDialogProcessEndIcon #fIcon
Us0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f23 actionTable 'out=in;
' #txt
Us0 f23 actionCode 'import ch.ivyteam.ivy.rd.common.Property;

// loop through all props now in table
for (Property property : in.properties)
{
	String value = in.user.getProperty(property.name);
	
	// property does not yet exist --> add it or
	// property value changed --> change value
	if ( !(value is initialized) || !value.equals(property.value) )
	{
		try
		{
			in.user.setProperty(property.name, property.value);
		}
		catch (Exception ex)
		{
			out.editingFailed.add(property.name);
		}
	}
}' #txt
Us0 f23 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>add/edit new/changed
properties</name>
        <nameStyle>31,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f23 502 68 36 24 20 -2 #rect
Us0 f23 @|RichDialogProcessStepIcon #fIcon
Us0 f24 expr out #txt
Us0 f24 520 42 520 68 #arcP
Us0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f25 actionTable 'out=in;
' #txt
Us0 f25 actionCode 'import ch.ivyteam.ivy.rd.common.Property;

// remove deleted existing properties
for (String propertyName : in.user.getAllPropertyNames())
{
	boolean delete = true;
	for (Property property : in.properties)
	{
		// mark properties that still exist
		if (property.name.equals(propertyName))
		{
			delete = false;
			break;
		}
	}
	if (delete)
	{
		try
		{
			in.user.removeProperty(propertyName);
		}
		catch (Exception ex)
		{
			out.deletionFailed.add(propertyName);
		}
	}
}' #txt
Us0 f25 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete 
properties</name>
        <nameStyle>18,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f25 502 124 36 24 20 -2 #rect
Us0 f25 @|RichDialogProcessStepIcon #fIcon
Us0 f26 expr out #txt
Us0 f26 520 92 520 124 #arcP
Us0 f27 targetWindow NEW:card: #txt
Us0 f27 targetDisplay TOP #txt
Us0 f27 richDialogId ch.ivyteam.ivy.rd.common.PropertyEditor #txt
Us0 f27 startMethod start(String,String) #txt
Us0 f27 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f27 requestActionDecl '<String name, String value> param;' #txt
Us0 f27 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f27 responseMappingAction 'out=in;
' #txt
Us0 f27 responseActionCode 'if (result.successful)
{
	ch.ivyteam.ivy.rd.common.Property newProperty = new ch.ivyteam.ivy.rd.common.Property();
	newProperty.name = result.name;
	newProperty.value = result.value;
	out.properties.add(newProperty);
	in.selectedProperty = newProperty;
}
' #txt
Us0 f27 windowConfiguration '{/title "Property Editor"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f27 isAsynch false #txt
Us0 f27 isInnerRd true #txt
Us0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>open property
editor</name>
        <nameStyle>20,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f27 286 284 36 24 20 -2 #rect
Us0 f27 @|RichDialogIcon #fIcon
Us0 f28 expr out #txt
Us0 f28 304 250 304 284 #arcP
Us0 f22 expr out #txt
Us0 f22 304 308 304 350 #arcP
Us0 f29 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has errors?</name>
        <nameStyle>11
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f29 418 122 28 28 14 0 #rect
Us0 f29 @|AlternativeIcon #fIcon
Us0 f30 expr out #txt
Us0 f30 502 136 446 136 #arcP
Us0 f11 targetWindow NEW:card: #txt
Us0 f11 targetDisplay TOP #txt
Us0 f11 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Us0 f11 startMethod showMessageWithTitle(String,String) #txt
Us0 f11 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f11 requestActionDecl '<String aMessageTitle, String aMessageText> param;' #txt
Us0 f11 requestMappingAction 'param.aMessageTitle="The following manipulations failed:";
' #txt
Us0 f11 requestActionCode 'String message = "";
for (String property : in.deletionFailed)
{
	message += property + " (deletion) \n";
}
for (String property : in.editingFailed)
{
	message += property + " (editing) \n";
}
message = message + "The properties that failed to manipulate are stored in an external ";
message = message + "\ndirectory such as Microsoft Active Directory an you have no rights to change them.";
param.aMessageText = message;' #txt
Us0 f11 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f11 responseMappingAction 'out=in;
' #txt
Us0 f11 windowConfiguration '{/title "Property Editor Errors"/width 500 /height 150 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f11 isAsynch false #txt
Us0 f11 isInnerRd true #txt
Us0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show warning</name>
        <nameStyle>12,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f11 342 180 36 24 20 -2 #rect
Us0 f11 @|RichDialogIcon #fIcon
Us0 f31 expr out #txt
Us0 f31 342 192 312 146 #arcP
Us0 f31 1 312 192 #addKink
Us0 f31 1 0.17391304347826086 0 0 #arcLabel
Us0 f32 expr in #txt
Us0 f32 outCond 'in.deletionFailed.size() + in.editingFailed.size() > 0' #txt
Us0 f32 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f32 432 150 378 192 #arcP
Us0 f32 1 432 192 #addKink
Us0 f32 1 0.1111111111111111 0 0 #arcLabel
Us0 f33 expr in #txt
Us0 f33 418 136 322 136 #arcP
Us0 f34 targetWindow NEW:card: #txt
Us0 f34 targetDisplay TOP #txt
Us0 f34 richDialogId ch.ivyteam.ivy.rd.common.PropertyEditor #txt
Us0 f34 startMethod start(String,String,Boolean) #txt
Us0 f34 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f34 requestActionDecl '<String name, String value, Boolean editName> param;' #txt
Us0 f34 requestMappingAction 'param.name=in.selectedProperty.name;
param.value=in.selectedProperty.value;
param.editName=false;
' #txt
Us0 f34 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f34 responseMappingAction 'out=in;
' #txt
Us0 f34 responseActionCode 'if (result.successful)
{
	int index = in.properties.indexOf(in.selectedProperty);
	in.properties.get(index).value = result.newValue;
	panel.propertyTable.refresh();
}
' #txt
Us0 f34 windowConfiguration '{/title "Property Editor"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f34 isAsynch false #txt
Us0 f34 isInnerRd true #txt
Us0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>open property
editor</name>
        <nameStyle>20,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f34 438 284 36 24 20 -2 #rect
Us0 f34 @|RichDialogIcon #fIcon
Us0 f35 guid 12945ED377424B5D #txt
Us0 f35 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f35 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData out;
' #txt
Us0 f35 actionTable 'out=in;
' #txt
Us0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>edit</name>
        <nameStyle>4,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f35 446 230 20 20 13 0 #rect
Us0 f35 @|RichDialogProcessStartIcon #fIcon
Us0 f36 type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
Us0 f36 446 350 20 20 13 0 #rect
Us0 f36 @|RichDialogProcessEndIcon #fIcon
Us0 f37 expr out #txt
Us0 f37 456 250 456 284 #arcP
Us0 f38 expr out #txt
Us0 f38 456 308 456 350 #arcP
>Proto Us0 .type ch.ivyteam.ivy.admin.tool.security.UserProperties.UserPropertiesData #txt
>Proto Us0 .processKind RICH_DIALOG #txt
>Proto Us0 .rdData2UIAction 'panel.propertyTable.listData=in.properties;
' #txt
>Proto Us0 -8 -8 16 16 16 26 #rect
>Proto Us0 '' #fIcon
Us0 f0 mainOut f2 tail #connect
Us0 f2 head f1 mainIn #connect
Us0 f3 mainOut f6 tail #connect
Us0 f6 head f5 mainIn #connect
Us0 f5 mainOut f4 tail #connect
Us0 f4 head f1 mainIn #connect
Us0 f7 mainOut f9 tail #connect
Us0 f9 head f8 mainIn #connect
Us0 f12 mainOut f19 tail #connect
Us0 f19 head f1 mainIn #connect
Us0 f14 mainOut f13 tail #connect
Us0 f13 head f17 mainIn #connect
Us0 f15 mainOut f18 tail #connect
Us0 f18 head f16 mainIn #connect
Us0 f10 mainOut f24 tail #connect
Us0 f24 head f23 mainIn #connect
Us0 f23 mainOut f26 tail #connect
Us0 f26 head f25 mainIn #connect
Us0 f20 mainOut f28 tail #connect
Us0 f28 head f27 mainIn #connect
Us0 f27 mainOut f22 tail #connect
Us0 f22 head f21 mainIn #connect
Us0 f25 mainOut f30 tail #connect
Us0 f30 head f29 in #connect
Us0 f11 mainOut f31 tail #connect
Us0 f31 head f8 mainIn #connect
Us0 f29 out f32 tail #connect
Us0 f32 head f11 mainIn #connect
Us0 f29 out f33 tail #connect
Us0 f33 head f8 mainIn #connect
Us0 f35 mainOut f37 tail #connect
Us0 f37 head f34 mainIn #connect
Us0 f34 mainOut f38 tail #connect
Us0 f38 head f36 mainIn #connect
