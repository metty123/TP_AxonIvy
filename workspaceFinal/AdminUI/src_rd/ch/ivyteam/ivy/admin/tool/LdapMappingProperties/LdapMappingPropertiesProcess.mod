[Ivy]
[>Created: Wed Aug 12 10:57:43 ICT 2015]
13F1CE3EB7D98804 3.17 #module
>Proto >Proto Collection #zClass
Ls0 LdapMappingPropertiesProcess Big #zClass
Ls0 RD #cInfo
Ls0 #process
Ls0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ls0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ls0 @TextInP .resExport .resExport #zField
Ls0 @TextInP .type .type #zField
Ls0 @TextInP .processKind .processKind #zField
Ls0 @AnnotationInP-0n ai ai #zField
Ls0 @TextInP .xml .xml #zField
Ls0 @TextInP .responsibility .responsibility #zField
Ls0 @RichDialogInitStart f0 '' #zField
Ls0 @RichDialogProcessEnd f1 '' #zField
Ls0 @RichDialogProcessStart f3 '' #zField
Ls0 @RichDialogProcessEnd f4 '' #zField
Ls0 @RichDialogProcessStart f6 '' #zField
Ls0 @Alternative f7 '' #zField
Ls0 @RichDialog f8 '' #zField
Ls0 @RichDialogProcessEnd f9 '' #zField
Ls0 @PushWFArc f10 '' #zField
Ls0 @PushWFArc f11 '' #zField
Ls0 @PushWFArc f12 '' #zField
Ls0 @PushWFArc f13 '' #zField
Ls0 @RichDialogProcessStart f14 '' #zField
Ls0 @RichDialogProcessStep f15 '' #zField
Ls0 @RichDialogProcessEnd f16 '' #zField
Ls0 @PushWFArc f17 '' #zField
Ls0 @PushWFArc f18 '' #zField
Ls0 @RichDialogProcessStart f19 '' #zField
Ls0 @RichDialogProcessEnd f21 '' #zField
Ls0 @RichDialog f20 '' #zField
Ls0 @PushWFArc f22 '' #zField
Ls0 @PushWFArc f23 '' #zField
Ls0 @RichDialogProcessStep f24 '' #zField
Ls0 @PushWFArc f25 '' #zField
Ls0 @PushWFArc f2 '' #zField
Ls0 @RichDialogMethodStart f26 '' #zField
Ls0 @RichDialogProcessStep f27 '' #zField
Ls0 @RichDialogProcessEnd f28 '' #zField
Ls0 @PushWFArc f30 '' #zField
Ls0 @RichDialogMethodStart f38 '' #zField
Ls0 @PushWFArc f29 '' #zField
Ls0 @PushWFArc f31 '' #zField
Ls0 @RichDialogMethodStart f32 '' #zField
Ls0 @RichDialogProcessStep f33 '' #zField
Ls0 @RichDialogProcessEnd f34 '' #zField
Ls0 @PushWFArc f35 '' #zField
Ls0 @PushWFArc f36 '' #zField
Ls0 @PushWFArc f40 '' #zField
>Proto Ls0 Ls0 LdapMappingPropertiesProcess #zField
Ls0 f0 guid 13F1CE3EBD33AE72 #txt
Ls0 f0 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f0 method start(ch.ivyteam.ivy.security.ISecurityContext) #txt
Ls0 f0 disableUIEvents true #txt
Ls0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext> param = methodEvent.getInputArguments();
' #txt
Ls0 f0 inParameterMapAction 'out.securityContext=param.securityContext;
' #txt
Ls0 f0 outParameterDecl '<> result;
' #txt
Ls0 f0 embeddedRdInitializations '* ' #txt
Ls0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext)</name>
        <nameStyle>23,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f0 86 54 20 20 13 0 #rect
Ls0 f0 @|RichDialogInitStartIcon #fIcon
Ls0 f1 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f1 86 150 20 20 13 0 #rect
Ls0 f1 @|RichDialogProcessEndIcon #fIcon
Ls0 f3 guid 13F2C5738AED1A72 #txt
Ls0 f3 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f3 actionTable 'out=in;
' #txt
Ls0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check boxes selection changed</name>
        <nameStyle>29,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f3 1142 70 20 20 13 0 #rect
Ls0 f3 @|RichDialogProcessStartIcon #fIcon
Ls0 f4 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f4 1142 254 20 20 13 0 #rect
Ls0 f4 @|RichDialogProcessEndIcon #fIcon
Ls0 f6 guid 13F2C68AF76E7377 #txt
Ls0 f6 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f6 actionTable 'out=in;
' #txt
Ls0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>editProperty</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f6 302 62 20 20 13 0 #rect
Ls0 f6 @|RichDialogProcessStartIcon #fIcon
Ls0 f7 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Any attribute selected?</name>
        <nameStyle>23,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f7 298 106 28 28 14 0 #rect
Ls0 f7 @|AlternativeIcon #fIcon
Ls0 f8 targetWindow NEW:card: #txt
Ls0 f8 targetDisplay TOP #txt
Ls0 f8 richDialogId ch.ivyteam.ivy.rd.common.PropertyEditor #txt
Ls0 f8 startMethod startLDAP(ch.ivyteam.ivy.rd.common.Property) #txt
Ls0 f8 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f8 requestActionDecl '<ch.ivyteam.ivy.rd.common.Property property> param;' #txt
Ls0 f8 requestMappingAction 'param.property=panel.userPropertyAttributesTable.getSelectedListEntry() as ch.ivyteam.ivy.rd.common.Property;
' #txt
Ls0 f8 responseActionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f8 responseMappingAction 'out=in;
' #txt
Ls0 f8 responseActionCode 'import ch.ivyteam.ivy.rd.common.Property;
if (result.property is initialized)
{
	Property p = panel.userPropertyAttributesTable.getSelectedListEntry() as Property;
	p.name = result.property.name;
	p.value = result.property.value;
	in.userPropertyAttributes.elementChanged(p);
}
' #txt
Ls0 f8 windowConfiguration '{/title "Edit LDAP Attribute"/width 360 /height 150 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ls0 f8 isAsynch false #txt
Ls0 f8 isInnerRd true #txt
Ls0 f8 userContext '* ' #txt
Ls0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Show property dialog</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f8 294 164 36 24 20 -2 #rect
Ls0 f8 @|RichDialogIcon #fIcon
Ls0 f9 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f9 302 230 20 20 13 0 #rect
Ls0 f9 @|RichDialogProcessEndIcon #fIcon
Ls0 f10 expr out #txt
Ls0 f10 312 82 312 106 #arcP
Ls0 f11 expr in #txt
Ls0 f11 outCond 'panel.userPropertyAttributesTable.getSelectedListEntry() != null' #txt
Ls0 f11 312 134 312 164 #arcP
Ls0 f12 expr out #txt
Ls0 f12 312 188 312 230 #arcP
Ls0 f13 expr in #txt
Ls0 f13 298 120 302 240 #arcP
Ls0 f13 1 264 120 #addKink
Ls0 f13 2 264 240 #addKink
Ls0 f13 1 0.5307126596580324 0 0 #arcLabel
Ls0 f14 guid 13F2C6E68F48AFBD #txt
Ls0 f14 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f14 actionTable 'out=in;
' #txt
Ls0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>removeProperty</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f14 574 62 20 20 13 0 #rect
Ls0 f14 @|RichDialogProcessStartIcon #fIcon
Ls0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f15 actionTable 'out=in;
' #txt
Ls0 f15 actionCode 'import ch.ivyteam.ivy.rd.common.Property;
if (panel.userPropertyAttributesTable.getSelectedListEntry() != null)
{
	Property p = panel.userPropertyAttributesTable.getSelectedListEntry() as Property;
	out.userPropertyAttributes.remove(p);
}' #txt
Ls0 f15 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Remove selected property</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f15 566 108 36 24 20 -2 #rect
Ls0 f15 @|RichDialogProcessStepIcon #fIcon
Ls0 f16 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f16 574 190 20 20 13 0 #rect
Ls0 f16 @|RichDialogProcessEndIcon #fIcon
Ls0 f17 expr out #txt
Ls0 f17 584 82 584 108 #arcP
Ls0 f18 expr out #txt
Ls0 f18 584 132 584 190 #arcP
Ls0 f19 guid 13F2C6FF683C9813 #txt
Ls0 f19 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f19 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f19 actionTable 'out=in;
' #txt
Ls0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addProperty</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f19 830 62 20 20 13 0 #rect
Ls0 f19 @|RichDialogProcessStartIcon #fIcon
Ls0 f21 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f21 830 182 20 20 13 0 #rect
Ls0 f21 @|RichDialogProcessEndIcon #fIcon
Ls0 f20 targetWindow NEW:card: #txt
Ls0 f20 targetDisplay TOP #txt
Ls0 f20 richDialogId ch.ivyteam.ivy.rd.common.PropertyEditor #txt
Ls0 f20 startMethod startLDAP(String,String) #txt
Ls0 f20 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f20 requestActionDecl '<String name, String value> param;' #txt
Ls0 f20 responseActionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f20 responseMappingAction 'out=in;
' #txt
Ls0 f20 responseActionCode 'import ch.ivyteam.ivy.rd.common.Property;
if (result.successful)
{
	Property p = new Property();
	p.name = result.name;
	p.value = result.value;
	out.userPropertyAttributes.add(p);
}' #txt
Ls0 f20 windowConfiguration '{/title "Add LDAP Attribute"/width 360 /height 150 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ls0 f20 isAsynch false #txt
Ls0 f20 isInnerRd true #txt
Ls0 f20 userContext '* ' #txt
Ls0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Show property dialog</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f20 822 108 36 24 20 -2 #rect
Ls0 f20 @|RichDialogIcon #fIcon
Ls0 f22 expr out #txt
Ls0 f22 840 82 840 108 #arcP
Ls0 f23 expr out #txt
Ls0 f23 840 132 840 182 #arcP
Ls0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f24 actionTable 'out=in;
' #txt
Ls0 f24 actionCode 'import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.system.IProperty;
import ch.ivyteam.ivy.rd.common.Property;

in.userNameAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue();
in.fullUserNameAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue();
in.doNotImportFullUserName =  (in.#fullUserNameAttribute == null)||(in.fullUserNameAttribute.trim().length()==0);
if (in.doNotImportFullUserName)
{
  in.fullUserNameAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getDefaultValue();
}

in.eMailAddressAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue();
in.doNotImportEMailAddress = (in.#eMailAddressAttribute == null)||(in.eMailAddressAttribute.trim().length()==0);
if (in.doNotImportEMailAddress)
{
  in.eMailAddressAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME).getDefaultValue();
}

in.eMailLanguageAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_LANGUAGE_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue();
in.doNotImportEMailLanguage = (in.#eMailLanguageAttribute == null)||(in.eMailLanguageAttribute.trim().length()==0);
if (in.doNotImportEMailLanguage)
{
  in.eMailLanguageAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_LANGUAGE_JNDI_ATTRIBUTE_PROPERTY_NAME).getDefaultValue();
}

in.groupsOfGroupAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_GROUP_MEMBER_OF_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue();

in.doNotUseGroupOfAUser = !in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_USER_MEMBER_OF_FOR_USER_ROLE_MEMBERSHIP).getBooleanValue();
if (in.doNotUseGroupOfAUser)
{
  in.groupsOfUserAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_MEMBER_OF_GROUP_ATTRIBUTE_PROPERTY).getDefaultValue();
} else {
	in.groupsOfUserAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_MEMBER_OF_GROUP_ATTRIBUTE_PROPERTY).getValue();
}

in.membersOfGroupAttribute = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_GROUP_MEMBERS_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue();


// user table information.
in.userPropertyAttributes = new List<Property>();
for (IProperty property : in.securityContext.getConfigurationProperties())
{
  if (property.getName().startsWith(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME))
  {
		Property p  = new Property();
		p.name = property.getName().substring(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME.length());
		p.value = property.getValue();
		in.userPropertyAttributes.add(p);
  }
}
' #txt
Ls0 f24 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f24 78 100 36 24 20 -2 #rect
Ls0 f24 @|RichDialogProcessStepIcon #fIcon
Ls0 f25 expr out #txt
Ls0 f25 96 74 96 100 #arcP
Ls0 f2 expr out #txt
Ls0 f2 96 124 96 150 #arcP
Ls0 f26 guid 13F2CEEC787B9B13 #txt
Ls0 f26 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f26 method save() #txt
Ls0 f26 disableUIEvents false #txt
Ls0 f26 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ls0 f26 outParameterDecl '<> result;
' #txt
Ls0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save()</name>
    </language>
</elementInfo>
' #txt
Ls0 f26 286 334 20 20 13 0 #rect
Ls0 f26 @|RichDialogMethodStartIcon #fIcon
Ls0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f27 actionTable 'out=in;
' #txt
Ls0 f27 actionCode 'import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.system.IProperty;
import ch.ivyteam.ivy.rd.common.Property;

if (in.doNotImportEMailAddress)
{ 
 in.eMailAddressAttribute = "";
}
if (in.doNotImportEMailLanguage)
{ 
 in.eMailLanguageAttribute = "";
}
if (in.doNotImportFullUserName)
{
 in.fullUserNameAttribute = "";
}

in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME).setValue(in.eMailAddressAttribute);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_LANGUAGE_JNDI_ATTRIBUTE_PROPERTY_NAME).setValue(in.eMailLanguageAttribute);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).setValue(in.fullUserNameAttribute);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_GROUP_MEMBER_OF_JNDI_ATTRIBUTE_PROPERTY_NAME).setValue(in.groupsOfGroupAttribute);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_GROUP_MEMBERS_JNDI_ATTRIBUTE_PROPERTY_NAME).setValue(in.membersOfGroupAttribute);

in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).setValue(in.userNameAttribute);

boolean doNotUseGroupOfAUser = in.doNotUseGroupOfAUser;
if (!in.doNotUseGroupOfAUser && in.groupsOfUserAttribute.isEmpty()) {
	doNotUseGroupOfAUser = true;
}
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_USER_MEMBER_OF_FOR_USER_ROLE_MEMBERSHIP).setValue(!doNotUseGroupOfAUser);
if(!in.doNotUseGroupOfAUser){
	in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_MEMBER_OF_GROUP_ATTRIBUTE_PROPERTY).setValue(in.groupsOfUserAttribute);	
}

// set values of user properties
List<String> newNames = new List<String>();
for (Property p : in.userPropertyAttributes)
{
	newNames.add(p.name);
  in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME + p.name).setValue(p.value);
}

// search for user properties that were deleted
for (IProperty property : in.securityContext.getConfigurationProperties())
{
  if (property.getName().startsWith(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME))
  {
    if (newNames.indexOf(property.getName().substring(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME.length())) < 0)
    { 
       // set to null to delete it
       property.setValue(null);
    }
  }
}' #txt
Ls0 f27 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save data changed</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f27 278 412 36 24 20 -2 #rect
Ls0 f27 @|RichDialogProcessStepIcon #fIcon
Ls0 f28 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f28 286 486 20 20 13 0 #rect
Ls0 f28 @|RichDialogProcessEndIcon #fIcon
Ls0 f30 expr out #txt
Ls0 f30 296 436 296 486 #arcP
Ls0 f38 guid 13F3B986B36D6B36 #txt
Ls0 f38 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f38 method validate() #txt
Ls0 f38 disableUIEvents false #txt
Ls0 f38 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ls0 f38 outParameterDecl '<java.lang.StringBuffer errorMessage> result;
' #txt
Ls0 f38 outActionCode 'import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.regex.Matcher;

String userName = panel.userNameAttributeTextField.text.trim();
String fullName = panel.fullUserNameAttributeTextField.text.trim();
String groupOfUser = panel.groupsOfUserAttributeTextField.text.trim();
String groupOfGroup = panel.groupsOfGroupAttributeTextField.text.trim();
String memberOfGroup = panel.membersOfGroupAttributeTextField.text.trim();
String email = panel.eMailAddressAttributeTextField.text.trim();
String emailLanguage = panel.eMailLanguageAttributeTextField.text.trim();

StringBuffer errorMessage = new StringBuffer();
Pattern pattern = Pattern.compile("^[A-Za-z0-9]+([_A-Za-z0-9-]+)*");
Matcher matcher = null;

if (!userName.isEmpty())
{
	matcher = pattern.matcher(userName);
	if (!matcher.matches())
	{
		errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/userName"))) + "\n");
	}
}

if (!fullName.isEmpty())
{
	matcher = pattern.matcher(fullName);
	if (!matcher.matches())
	{
		errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/fullUsername"))) + "\n");
	}
}

if (!email.isEmpty())
{
	matcher = pattern.matcher(email);
  if (!matcher.matches())
	{
    errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/emailAddress"))) + "\n");
  }
}

if (!emailLanguage.isEmpty())
{
	matcher = pattern.matcher(emailLanguage);
  if (!matcher.matches())
	{
    errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/emailLanguage"))) + "\n");
  }
}

if (!groupOfUser.isEmpty())
{
	matcher = pattern.matcher(groupOfUser);
  if (!matcher.matches())
	{
    errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/groupsOfUser"))) + "\n");
  }
}

if (!groupOfGroup.isEmpty())
{
	matcher = pattern.matcher(groupOfGroup);
  if (!matcher.matches())
	{
    errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/groupsOfAGroup"))) + "\n");
  }
}

if (!memberOfGroup.isEmpty())
{
	matcher = pattern.matcher(memberOfGroup);
  if (!matcher.matches())
	{
    errorMessage.append(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/membersOfAGroup"))) + "\n");
  }
}

result.errorMessage = errorMessage;

' #txt
Ls0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate()</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f38 486 334 20 20 13 0 #rect
Ls0 f38 @|RichDialogMethodStartIcon #fIcon
Ls0 f29 expr out #txt
Ls0 f29 296 354 296 412 #arcP
Ls0 f31 expr out #txt
Ls0 f31 496 354 306 496 #arcP
Ls0 f31 1 496 496 #addKink
Ls0 f31 1 0.12144317327498838 0 0 #arcLabel
Ls0 f32 guid 14694B737D44097E #txt
Ls0 f32 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f32 method checkDataChanged() #txt
Ls0 f32 disableUIEvents false #txt
Ls0 f32 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ls0 f32 outParameterDecl '<java.lang.Boolean hasDataChanged> result;
' #txt
Ls0 f32 outParameterMapAction 'result.hasDataChanged=in.hasDataChanged;
' #txt
Ls0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>checkDataChanged()</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f32 661 333 22 22 14 0 #rect
Ls0 f32 @|RichDialogMethodStartIcon #fIcon
Ls0 f32 -13016147|-1|-16777216 #nodeStyle
Ls0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData out;
' #txt
Ls0 f33 actionTable 'out=in;
' #txt
Ls0 f33 actionCode 'import ch.ivyteam.ivy.admin.tool.util.CollectionSorts;

import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.system.IProperty;
import ch.ivyteam.ivy.rd.common.Property;


in.hasDataChanged = false;

// Check if email address is changed or not
String eMailAddressAttribute = in.eMailAddressAttribute;
if (in.doNotImportEMailAddress)
{ 
	eMailAddressAttribute = "";
}

if (!eMailAddressAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if email language is changed or not
String eMailLanguageAttribute = in.eMailLanguageAttribute;
if (in.doNotImportEMailLanguage)
{ 
	eMailLanguageAttribute = "";
}

if (!eMailLanguageAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_LANGUAGE_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if full username is changed or not
String fullUserNameAttribute = in.fullUserNameAttribute;
if (in.doNotImportFullUserName)
{
	fullUserNameAttribute = "";
}

if (!fullUserNameAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if groups of user is changed or not
if (!in.doNotUseGroupOfAUser && in.groupsOfUserAttribute.isEmpty()) {
	in.doNotUseGroupOfAUser = true;
}

boolean doNotUseGroupOfAUser = in.doNotUseGroupOfAUser;
if (!in.doNotUseGroupOfAUser && in.groupsOfUserAttribute.isEmpty()) {
	doNotUseGroupOfAUser = true;
}

if (!doNotUseGroupOfAUser && !in.groupsOfUserAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_MEMBER_OF_GROUP_ATTRIBUTE_PROPERTY).getValue())) {
	in.hasDataChanged = true;
}

// Check if members of group is changed or not
if (!in.membersOfGroupAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_GROUP_MEMBERS_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if username is changed or not
if (!in.userNameAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if groups of a group is changed or not
if (!in.groupsOfGroupAttribute.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_GROUP_MEMBER_OF_JNDI_ATTRIBUTE_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if use groups of user is changed or not
if (in.doNotUseGroupOfAUser == in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_USER_MEMBER_OF_FOR_USER_ROLE_MEMBERSHIP).getBooleanValue()) {
	in.hasDataChanged = true;
}

// get new properties
List<Property> newProperties = new List<Property>();
for (Property p : in.userPropertyAttributes)
{
	newProperties.add(p);
}

//Get old properties
List<Property> properties = new List<Property>();
for (IProperty property : in.securityContext.getConfigurationProperties())
{
  if (property.getName().startsWith(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME))
  {
    Property p = new Property();
		p.name = property.getName().substring(IJndiSecuritySystemConstants.JNDI_USER_ATTRIBUTE_MAP_PROPERTY_NAME.length());
		p.value = property.getValue();
		properties.add(p);
  }
}

// Sort by ascending
CollectionSorts.sortProperty(newProperties);
CollectionSorts.sortProperty(properties);

// Check if user properties is changed or not
if (!newProperties.equals(properties)) {
	in.hasDataChanged = true;
}' #txt
Ls0 f33 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check data changed</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f33 654 404 36 24 20 -2 #rect
Ls0 f33 @|RichDialogProcessStepIcon #fIcon
Ls0 f33 -13016147|-1|-16777216 #nodeStyle
Ls0 f34 type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
Ls0 f34 661 485 22 22 14 0 #rect
Ls0 f34 @|RichDialogProcessEndIcon #fIcon
Ls0 f34 -13016147|-1|-16777216 #nodeStyle
Ls0 f35 expr out #txt
Ls0 f35 672 355 672 404 #arcP
Ls0 f36 expr out #txt
Ls0 f36 672 428 672 485 #arcP
Ls0 f40 expr out #txt
Ls0 f40 1152 90 1152 254 #arcP
>Proto Ls0 .ui2RdDataAction 'out.doNotImportEMailAddress=panel.eMailAddressAttributeCheckBox.selected;
out.eMailAddressAttribute=panel.eMailAddressAttributeTextField.text;
out.doNotImportEMailLanguage=panel.eMailLanguageAttributeCheckBox.selected;
out.eMailLanguageAttribute=panel.eMailLanguageAttributeTextField.text;
out.doNotImportFullUserName=panel.fullUserNameAttributeCheckBox.selected;
out.fullUserNameAttribute=panel.fullUserNameAttributeTextField.text;
out.doNotUseGroupOfAUser=panel.groupsOfAUserAttributeCheckBox.selected;
out.groupsOfGroupAttribute=panel.groupsOfGroupAttributeTextField.text;
out.groupsOfUserAttribute=panel.groupsOfUserAttributeTextField.text;
out.membersOfGroupAttribute=panel.membersOfGroupAttributeTextField.text;
out.userNameAttribute=panel.userNameAttributeTextField.text;
' #txt
>Proto Ls0 .rdData2UIAction 'panel.userPropertyAttributesTable.listData=in.userPropertyAttributes;
panel.eMailAddressAttributeCheckBox.selected=in.doNotImportEMailAddress;
panel.eMailAddressAttributeTextField.enabled=!in.doNotImportEMailAddress;
panel.eMailAddressAttributeTextField.text=in.eMailAddressAttribute;
panel.eMailLanguageAttributeCheckBox.selected=in.doNotImportEMailLanguage;
panel.eMailLanguageAttributeTextField.enabled=!in.doNotImportEMailLanguage;
panel.eMailLanguageAttributeTextField.text=in.eMailLanguageAttribute;
panel.fullUserNameAttributeCheckBox.selected=in.doNotImportFullUserName;
panel.fullUserNameAttributeTextField.enabled=!in.doNotImportFullUserName;
panel.fullUserNameAttributeTextField.text=in.fullUserNameAttribute;
panel.groupsOfAUserAttributeCheckBox.selected=in.doNotUseGroupOfAUser;
panel.groupsOfGroupAttributeTextField.text=in.groupsOfGroupAttribute;
panel.groupsOfUserAttributeTextField.enabled=!in.doNotUseGroupOfAUser;
panel.groupsOfUserAttributeTextField.text=in.groupsOfUserAttribute;
panel.membersOfGroupAttributeTextField.text=in.membersOfGroupAttribute;
panel.userNameAttributeTextField.text=in.userNameAttribute;
' #txt
>Proto Ls0 .type ch.ivyteam.ivy.admin.tool.LdapMappingProperties.LdapMappingPropertiesData #txt
>Proto Ls0 .processKind RICH_DIALOG #txt
>Proto Ls0 -8 -8 16 16 16 26 #rect
>Proto Ls0 '' #fIcon
Ls0 f6 mainOut f10 tail #connect
Ls0 f10 head f7 in #connect
Ls0 f7 out f11 tail #connect
Ls0 f11 head f8 mainIn #connect
Ls0 f8 mainOut f12 tail #connect
Ls0 f12 head f9 mainIn #connect
Ls0 f7 out f13 tail #connect
Ls0 f13 head f9 mainIn #connect
Ls0 f14 mainOut f17 tail #connect
Ls0 f17 head f15 mainIn #connect
Ls0 f15 mainOut f18 tail #connect
Ls0 f18 head f16 mainIn #connect
Ls0 f19 mainOut f22 tail #connect
Ls0 f22 head f20 mainIn #connect
Ls0 f20 mainOut f23 tail #connect
Ls0 f23 head f21 mainIn #connect
Ls0 f0 mainOut f25 tail #connect
Ls0 f25 head f24 mainIn #connect
Ls0 f24 mainOut f2 tail #connect
Ls0 f2 head f1 mainIn #connect
Ls0 f27 mainOut f30 tail #connect
Ls0 f30 head f28 mainIn #connect
Ls0 f26 mainOut f29 tail #connect
Ls0 f29 head f27 mainIn #connect
Ls0 f38 mainOut f31 tail #connect
Ls0 f31 head f28 mainIn #connect
Ls0 f32 mainOut f35 tail #connect
Ls0 f35 head f33 mainIn #connect
Ls0 f33 mainOut f36 tail #connect
Ls0 f36 head f34 mainIn #connect
Ls0 f3 mainOut f40 tail #connect
Ls0 f40 head f4 mainIn #connect
