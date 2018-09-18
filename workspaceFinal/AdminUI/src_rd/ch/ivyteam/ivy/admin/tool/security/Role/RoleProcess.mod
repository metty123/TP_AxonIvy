[Ivy]
[>Created: Fri Aug 14 14:10:19 ICT 2015]
12E37B3C55EDC0EC 3.17 #module
>Proto >Proto Collection #zClass
Rs0 RoleProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessEnd f1 '' #zField
Rs0 @PushWFArc f2 '' #zField
Rs0 @RichDialogProcessStart f3 '' #zField
Rs0 @RichDialogProcessStart f6 '' #zField
Rs0 @RichDialogEnd f7 '' #zField
Rs0 @RichDialogProcessStart f8 '' #zField
Rs0 @RichDialogProcessStart f9 '' #zField
Rs0 @RichDialogProcessEnd f10 '' #zField
Rs0 @RichDialogInitStart f13 '' #zField
Rs0 @RichDialogProcessEnd f14 '' #zField
Rs0 @PushWFArc f15 '' #zField
Rs0 @RichDialogProcessStep f16 '' #zField
Rs0 @RichDialogEnd f18 '' #zField
Rs0 @PushWFArc f19 '' #zField
Rs0 @RichDialogProcessEnd f5 '' #zField
Rs0 @PushWFArc f20 '' #zField
Rs0 @RichDialogProcessStep f12 '' #zField
Rs0 @PushWFArc f21 '' #zField
Rs0 @Alternative f22 '' #zField
Rs0 @PushWFArc f23 '' #zField
Rs0 @RichDialog f24 '' #zField
Rs0 @PushWFArc f25 '' #zField
Rs0 @PushWFArc f11 '' #zField
Rs0 @RichDialog f26 '' #zField
Rs0 @RichDialogProcessEnd f27 '' #zField
Rs0 @PushWFArc f28 '' #zField
Rs0 @PushWFArc f29 '' #zField
Rs0 @RichDialogProcessEnd f30 '' #zField
Rs0 @RichDialog f31 '' #zField
Rs0 @Alternative f32 '' #zField
Rs0 @RichDialogProcessStep f34 '' #zField
Rs0 @PushWFArc f35 '' #zField
Rs0 @PushWFArc f33 '' #zField
Rs0 @PushWFArc f36 '' #zField
Rs0 @PushWFArc f37 '' #zField
Rs0 @RichDialog f38 '' #zField
Rs0 @PushWFArc f17 '' #zField
Rs0 @PushWFArc f4 '' #zField
Rs0 @Alternative f39 '' #zField
Rs0 @PushWFArc f41 '' #zField
Rs0 @PushWFArc f40 '' #zField
Rs0 @PushWFArc f43 '' #zField
>Proto Rs0 Rs0 RoleProcess #zField
Rs0 f0 guid 12E37B3C58A1B67D #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f0 method start() #txt
Rs0 f0 disableUIEvents true #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Rs0 f0 90 38 20 20 13 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f1 90 110 20 20 13 0 #rect
Rs0 f1 @|RichDialogProcessEndIcon #fIcon
Rs0 f2 expr out #txt
Rs0 f2 100 58 100 110 #arcP
Rs0 f3 guid 12E37BDDAC4B8FE4 #txt
Rs0 f3 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f3 actionTable 'out=in;
' #txt
Rs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Ok</name>
        <nameStyle>2,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f3 414 38 20 20 13 0 #rect
Rs0 f3 @|RichDialogProcessStartIcon #fIcon
Rs0 f6 guid 12E37BE18413F931 #txt
Rs0 f6 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f6 actionTable 'out=in;
' #txt
Rs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f6 606 38 20 20 13 0 #rect
Rs0 f6 @|RichDialogProcessStartIcon #fIcon
Rs0 f7 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f7 guid 12E37BE3BA671D11 #txt
Rs0 f7 414 462 20 20 13 0 #rect
Rs0 f7 @|RichDialogEndIcon #fIcon
Rs0 f8 guid 12E37BE7E963AB96 #txt
Rs0 f8 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f8 actionTable 'out=in;
' #txt
Rs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Browse
</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f8 86 198 20 20 13 0 #rect
Rs0 f8 @|RichDialogProcessStartIcon #fIcon
Rs0 f9 guid 12E37BE8B7111967 #txt
Rs0 f9 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f9 actionTable 'out=in;
out.externalSecurityName="";
' #txt
Rs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Clear</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f9 686 38 20 20 13 0 #rect
Rs0 f9 @|RichDialogProcessStartIcon #fIcon
Rs0 f10 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f10 86 422 20 20 13 0 #rect
Rs0 f10 @|RichDialogProcessEndIcon #fIcon
Rs0 f13 guid 12E37C1D36DDFF7E #txt
Rs0 f13 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f13 method start(ch.ivyteam.ivy.security.IRole) #txt
Rs0 f13 disableUIEvents true #txt
Rs0 f13 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.IRole role> param = methodEvent.getInputArguments();
' #txt
Rs0 f13 inParameterMapAction 'out.externalSecurityName=param.role.getExternalSecurityName();
out.role=param.role;
' #txt
Rs0 f13 outParameterDecl '<> result;
' #txt
Rs0 f13 embeddedRdInitializations '* ' #txt
Rs0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IRole)</name>
    </language>
</elementInfo>
' #txt
Rs0 f13 174 38 20 20 13 0 #rect
Rs0 f13 @|RichDialogInitStartIcon #fIcon
Rs0 f14 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f14 174 110 20 20 13 0 #rect
Rs0 f14 @|RichDialogProcessEndIcon #fIcon
Rs0 f15 expr out #txt
Rs0 f15 184 58 184 110 #arcP
Rs0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f16 actionTable 'out=in;
' #txt
Rs0 f16 actionCode 'if (in.externalSecurityName.trim().isEmpty())
{
	in.role.setExternalSecurityName(null);
}
else
{
	in.role.setExternalSecurityName(in.externalSecurityName);
}' #txt
Rs0 f16 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update ex. security name</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f16 406 388 36 24 20 -2 #rect
Rs0 f16 @|RichDialogProcessStepIcon #fIcon
Rs0 f18 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f18 guid 12E37C542121781E #txt
Rs0 f18 606 110 20 20 13 0 #rect
Rs0 f18 @|RichDialogEndIcon #fIcon
Rs0 f19 expr out #txt
Rs0 f19 616 58 616 110 #arcP
Rs0 f5 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f5 686 110 20 20 13 0 #rect
Rs0 f5 @|RichDialogProcessEndIcon #fIcon
Rs0 f20 expr out #txt
Rs0 f20 696 58 696 110 #arcP
Rs0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f12 actionTable 'out=in;
' #txt
Rs0 f12 actionCode 'import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.naming.JndiConfig;
import ch.ivyteam.naming.JndiProvider;
import ch.ivyteam.naming.JndiUtil;
import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;

int port;
ISecurityContext securityContext = in.role.getSecurityContext();

port = securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_PORT_PROPERTY_NAME).getIntValue();
if (port == -1)
{
  port = 389;
}

in.jndiConfig = new JndiConfig(
  JndiProvider.ACTIVE_DIRECTORY, 
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_HOST_NAME_PROPERTY_NAME).getValue(),
  port,
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_AUTHENTICATION_KIND_PROPERTY_NAME).getValue(),
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_PROPERTY_NAME).getValue(),
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_PASSWORD_PROPERTY_NAME).getValue(),
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_SSL_PROPERTY_NAME).getBooleanValue(),
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_LDAP_CONNECTION_POOL_PROPERTY_NAME).getBooleanValue(),
  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_DEFAULT_CONTEXT_PROPERTY_NAME).getValue());

in.error=JndiUtil.tryOpenDirContext(in.jndiConfig);' #txt
Rs0 f12 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f12 78 252 36 24 20 -2 #rect
Rs0 f12 @|RichDialogProcessStepIcon #fIcon
Rs0 f21 expr out #txt
Rs0 f21 96 218 96 252 #arcP
Rs0 f22 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f22 82 306 28 28 14 0 #rect
Rs0 f22 @|AlternativeIcon #fIcon
Rs0 f23 expr out #txt
Rs0 f23 96 276 96 306 #arcP
Rs0 f24 targetWindow NEW:card: #txt
Rs0 f24 targetDisplay TOP #txt
Rs0 f24 richDialogId ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser #txt
Rs0 f24 startMethod start(ch.ivyteam.naming.JndiConfig,String) #txt
Rs0 f24 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f24 requestActionDecl '<ch.ivyteam.naming.JndiConfig jndiConfig, String contextToSelect> param;' #txt
Rs0 f24 requestMappingAction 'param.jndiConfig=in.jndiConfig;
param.contextToSelect=in.externalSecurityName;
' #txt
Rs0 f24 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f24 responseMappingAction 'out=in;
' #txt
Rs0 f24 responseActionCode 'if ((result.#choosenContext != null)&&(result.choosenContext.length()>0))
{
  in.externalSecurityName = result.choosenContext;
}' #txt
Rs0 f24 windowConfiguration '{/title "External security name of role <%=in.role.getName()%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f24 isAsynch false #txt
Rs0 f24 isInnerRd true #txt
Rs0 f24 userContext '* ' #txt
Rs0 f24 78 356 36 24 20 -2 #rect
Rs0 f24 @|RichDialogIcon #fIcon
Rs0 f25 expr in #txt
Rs0 f25 outCond 'in.#error == null' #txt
Rs0 f25 96 334 96 356 #arcP
Rs0 f11 expr out #txt
Rs0 f11 96 380 96 422 #arcP
Rs0 f26 targetWindow NEW:card: #txt
Rs0 f26 targetDisplay TOP #txt
Rs0 f26 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDialog #txt
Rs0 f26 startMethod showError(java.lang.Throwable,Boolean,Boolean) #txt
Rs0 f26 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f26 requestActionDecl '<java.lang.Throwable error, Boolean showCopyButton, Boolean showDetailButton> param;' #txt
Rs0 f26 requestMappingAction 'param.error=in.error;
param.showCopyButton=true;
param.showDetailButton=true;
' #txt
Rs0 f26 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f26 responseMappingAction 'out=in;
' #txt
Rs0 f26 windowConfiguration '{/title "Error opening LDAP browser"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f26 isAsynch false #txt
Rs0 f26 isInnerRd true #txt
Rs0 f26 userContext '* ' #txt
Rs0 f26 150 356 36 24 20 -2 #rect
Rs0 f26 @|RichDialogIcon #fIcon
Rs0 f27 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f27 158 422 20 20 13 0 #rect
Rs0 f27 @|RichDialogProcessEndIcon #fIcon
Rs0 f28 expr out #txt
Rs0 f28 168 380 168 422 #arcP
Rs0 f29 expr in #txt
Rs0 f29 104 326 150 356 #arcP
Rs0 f30 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f30 278 342 20 20 13 0 #rect
Rs0 f30 @|RichDialogProcessEndIcon #fIcon
Rs0 f31 targetWindow NEW:card: #txt
Rs0 f31 targetDisplay TOP #txt
Rs0 f31 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Rs0 f31 startMethod showMessage(String) #txt
Rs0 f31 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f31 requestActionDecl '<String message> param;' #txt
Rs0 f31 requestMappingAction 'param.message="Either the referenced object does not exist or it is not a valid external security name.";
' #txt
Rs0 f31 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f31 responseMappingAction 'out=in;
' #txt
Rs0 f31 windowConfiguration '{/title "Invalid External Security Name"/width 500 /height 150 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f31 isAsynch false #txt
Rs0 f31 isInnerRd true #txt
Rs0 f31 userContext '* ' #txt
Rs0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f31 270 252 36 24 20 -2 #rect
Rs0 f31 @|RichDialogIcon #fIcon
Rs0 f32 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has error?</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f32 410 178 28 28 14 0 #rect
Rs0 f32 @|AlternativeIcon #fIcon
Rs0 f34 actionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f34 actionTable 'out=in;
' #txt
Rs0 f34 actionCode 'import javax.naming.Name;
import javax.naming.ldap.LdapName;
import javax.naming.directory.DirContext;
import javax.naming.directory.Attributes;
import javax.naming.directory.Attribute;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.naming.JndiConfig;
import ch.ivyteam.naming.JndiProvider;
import ch.ivyteam.naming.JndiUtil;
import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;

if (in.externalSecurityName.trim().isEmpty())
{
	in.error = null;
}
else
{
	int port;
	ISecurityContext securityContext = in.role.getSecurityContext();
	
	port = securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_PORT_PROPERTY_NAME).getIntValue();
	if (port == -1)
	{
	  port = 389;
	}
	
	in.jndiConfig = new JndiConfig(
	  JndiProvider.ACTIVE_DIRECTORY, 
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_HOST_NAME_PROPERTY_NAME).getValue(),
	  port,
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_AUTHENTICATION_KIND_PROPERTY_NAME).getValue(),
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_PROPERTY_NAME).getValue(),
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_PASSWORD_PROPERTY_NAME).getValue(),
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_SSL_PROPERTY_NAME).getBooleanValue(),
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_LDAP_CONNECTION_POOL_PROPERTY_NAME).getBooleanValue(),
	  securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_DEFAULT_CONTEXT_PROPERTY_NAME).getValue());
	
	try
	{
	  DirContext dirContext =	JndiUtil.openDirContext(in.jndiConfig);
	  Name name = new LdapName(in.externalSecurityName);
	  Attributes attributes = dirContext.getAttributes(name, ["objectClass"]);
	  Attribute attribute = attributes.get("objectClass");
    if (#attribute == null)
		{
			in.error = new Exception("A user could not be mapped as external security name.");
		}
		else
		{
			in.error = null;
		}
	}
	catch(Exception ex)
	{
		in.error=ex;
	}
}' #txt
Rs0 f34 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f34 406 108 36 24 20 -2 #rect
Rs0 f34 @|RichDialogProcessStepIcon #fIcon
Rs0 f35 expr out #txt
Rs0 f35 424 58 424 108 #arcP
Rs0 f33 expr out #txt
Rs0 f33 424 132 424 178 #arcP
Rs0 f36 expr in #txt
Rs0 f36 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>YES</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f36 410 192 288 252 #arcP
Rs0 f36 1 288 192 #addKink
Rs0 f36 0 0.8364251803203158 0 0 #arcLabel
Rs0 f37 expr out #txt
Rs0 f37 288 276 288 342 #arcP
Rs0 f38 targetWindow NEW:card: #txt
Rs0 f38 targetDisplay TOP #txt
Rs0 f38 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Rs0 f38 startMethod showMessage(String) #txt
Rs0 f38 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f38 requestActionDecl '<String message> param;' #txt
Rs0 f38 requestMappingAction 'param.message=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/message/changeExternalSecurityMapping");
' #txt
Rs0 f38 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.Role.RoleData out;
' #txt
Rs0 f38 responseMappingAction 'out=in;
' #txt
Rs0 f38 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/warning\")%>"/width 0 /height 0 /centered true /resizable false /maximized false /close_after_last_rd true }' #txt
Rs0 f38 isAsynch false #txt
Rs0 f38 isInnerRd true #txt
Rs0 f38 userContext '* ' #txt
Rs0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show warning</name>
        <nameStyle>12,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f38 406 316 36 24 20 -2 #rect
Rs0 f38 @|RichDialogIcon #fIcon
Rs0 f17 expr out #txt
Rs0 f17 424 340 424 388 #arcP
Rs0 f17 0 0.4227271715174658 0 0 #arcLabel
Rs0 f4 expr out #txt
Rs0 f4 424 412 424 462 #arcP
Rs0 f39 type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
Rs0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ex. security name has been changed?</name>
        <nameStyle>35,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f39 410 250 28 28 14 0 #rect
Rs0 f39 @|AlternativeIcon #fIcon
Rs0 f41 expr in #txt
Rs0 f41 outCond '!in.#error is initialized' #txt
Rs0 f41 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>NO</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f41 424 206 424 250 #arcP
Rs0 f40 expr in #txt
Rs0 f40 outCond !in.externalSecurityName.equals(in.role.externalSecurityName) #txt
Rs0 f40 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>YES</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f40 424 278 424 316 #arcP
Rs0 f43 expr in #txt
Rs0 f43 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>NO</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f43 410 264 414 472 #arcP
Rs0 f43 1 376 264 #addKink
Rs0 f43 2 376 472 #addKink
Rs0 f43 1 0.4852941176470588 0 0 #arcLabel
>Proto Rs0 .ui2RdDataAction 'out.externalSecurityName=panel.extSecurityNameTextField.text;
' #txt
>Proto Rs0 .rdData2UIAction 'panel.extSecurityNameTextField.text=in.externalSecurityName;
' #txt
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.security.Role.RoleData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f0 mainOut f2 tail #connect
Rs0 f2 head f1 mainIn #connect
Rs0 f13 mainOut f15 tail #connect
Rs0 f15 head f14 mainIn #connect
Rs0 f6 mainOut f19 tail #connect
Rs0 f19 head f18 mainIn #connect
Rs0 f9 mainOut f20 tail #connect
Rs0 f20 head f5 mainIn #connect
Rs0 f8 mainOut f21 tail #connect
Rs0 f21 head f12 mainIn #connect
Rs0 f12 mainOut f23 tail #connect
Rs0 f23 head f22 in #connect
Rs0 f22 out f25 tail #connect
Rs0 f25 head f24 mainIn #connect
Rs0 f24 mainOut f11 tail #connect
Rs0 f11 head f10 mainIn #connect
Rs0 f26 mainOut f28 tail #connect
Rs0 f28 head f27 mainIn #connect
Rs0 f22 out f29 tail #connect
Rs0 f29 head f26 mainIn #connect
Rs0 f3 mainOut f35 tail #connect
Rs0 f35 head f34 mainIn #connect
Rs0 f34 mainOut f33 tail #connect
Rs0 f33 head f32 in #connect
Rs0 f36 head f31 mainIn #connect
Rs0 f31 mainOut f37 tail #connect
Rs0 f37 head f30 mainIn #connect
Rs0 f38 mainOut f17 tail #connect
Rs0 f17 head f16 mainIn #connect
Rs0 f16 mainOut f4 tail #connect
Rs0 f4 head f7 mainIn #connect
Rs0 f32 out f41 tail #connect
Rs0 f41 head f39 in #connect
Rs0 f32 out f36 tail #connect
Rs0 f39 out f40 tail #connect
Rs0 f40 head f38 mainIn #connect
Rs0 f39 out f43 tail #connect
Rs0 f43 head f7 mainIn #connect
