[Ivy]
[>Created: Wed Aug 12 11:55:31 ICT 2015]
13F1CF7C8DB5B8A7 3.17 #module
>Proto >Proto Collection #zClass
Ss0 JndiSecuritySystemProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @RichDialogInitStart f0 '' #zField
Ss0 @RichDialogProcessEnd f1 '' #zField
Ss0 @RichDialogProcessStart f3 '' #zField
Ss0 @RichDialogProcessEnd f4 '' #zField
Ss0 @PushWFArc f5 '' #zField
Ss0 @RichDialogProcessStep f6 '' #zField
Ss0 @PushWFArc f7 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogMethodStart f8 '' #zField
Ss0 @RichDialogProcessStep f9 '' #zField
Ss0 @RichDialogProcessEnd f10 '' #zField
Ss0 @PushWFArc f12 '' #zField
Ss0 @RichDialogProcessStart f13 '' #zField
Ss0 @RichDialogProcessStep f14 '' #zField
Ss0 @Alternative f15 '' #zField
Ss0 @RichDialog f16 '' #zField
Ss0 @RichDialogProcessEnd f17 '' #zField
Ss0 @PushWFArc f41 '' #zField
Ss0 @PushWFArc f42 '' #zField
Ss0 @RichDialog f43 '' #zField
Ss0 @PushWFArc f44 '' #zField
Ss0 @PushWFArc f45 '' #zField
Ss0 @PushWFArc f46 '' #zField
Ss0 @RichDialogProcessStart f47 '' #zField
Ss0 @RichDialogProcessStep f48 '' #zField
Ss0 @Alternative f49 '' #zField
Ss0 @RichDialog f50 '' #zField
Ss0 @RichDialogProcessEnd f51 '' #zField
Ss0 @PushWFArc f52 '' #zField
Ss0 @PushWFArc f53 '' #zField
Ss0 @PushWFArc f54 '' #zField
Ss0 @PushWFArc f55 '' #zField
Ss0 @PushWFArc f56 '' #zField
Ss0 @RichDialogProcessEnd f57 '' #zField
Ss0 @PushWFArc f58 '' #zField
Ss0 @RichDialogProcessStart f18 '' #zField
Ss0 @RichDialogProcessStep f19 '' #zField
Ss0 @RichDialogProcessEnd f20 '' #zField
Ss0 @PushWFArc f21 '' #zField
Ss0 @PushWFArc f22 '' #zField
Ss0 @RichDialogProcessStart f23 '' #zField
Ss0 @RichDialogProcessStep f24 '' #zField
Ss0 @RichDialogProcessEnd f25 '' #zField
Ss0 @PushWFArc f26 '' #zField
Ss0 @PushWFArc f27 '' #zField
Ss0 @RichDialogProcessStep f30 '' #zField
Ss0 @RichDialogMethodStart f35 '' #zField
Ss0 @RichDialogProcessEnd f38 '' #zField
Ss0 @PushWFArc f29 '' #zField
Ss0 @PushWFArc f31 '' #zField
Ss0 @RichDialogMethodStart f11 '' #zField
Ss0 @RichDialogProcessEnd f28 '' #zField
Ss0 @PushWFArc f32 '' #zField
Ss0 @RichDialogProcessStep f33 '' #zField
Ss0 @PushWFArc f34 '' #zField
Ss0 @PushWFArc f36 '' #zField
Ss0 @RichDialogMethodStart f37 '' #zField
Ss0 @RichDialogProcessStep f39 '' #zField
Ss0 @RichDialogProcessEnd f40 '' #zField
Ss0 @PushWFArc f59 '' #zField
Ss0 @PushWFArc f60 '' #zField
>Proto Ss0 Ss0 JndiSecuritySystemProcess #zField
Ss0 f0 guid 13F1CF7C8FC9767F #txt
Ss0 f0 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f0 method start(ch.ivyteam.ivy.security.ISecurityContext) #txt
Ss0 f0 disableUIEvents true #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 inParameterMapAction 'out.authenticationKinds=["none", "simple"];
out.securityContext=param.securityContext;
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 embeddedRdInitializations '{/dayTimeComboboxPanel {/fieldName "dayTimeComboboxPanel"/startMethod "start()"/parameterMapping ""/initScript ""/userContext * }}' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext)</name>
        <nameStyle>23,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 86 54 20 20 13 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 f1 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f1 86 286 20 20 13 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f3 guid 13F1DDAFE66A9A41 #txt
Ss0 f3 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f3 actionTable 'out=in;
' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check boxes selection changed</name>
        <nameStyle>29,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 854 22 20 20 13 0 #rect
Ss0 f3 @|RichDialogProcessStartIcon #fIcon
Ss0 f4 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f4 854 286 20 20 13 0 #rect
Ss0 f4 @|RichDialogProcessEndIcon #fIcon
Ss0 f5 expr out #txt
Ss0 f5 864 42 864 286 #arcP
Ss0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f6 actionTable 'out=in;
' #txt
Ss0 f6 actionCode 'import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;

in.authenticationKind= in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_AUTHENTICATION_KIND_PROPERTY_NAME).getValue();
in.host = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_HOST_NAME_PROPERTY_NAME).getValue();
in.password = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_PASSWORD_PROPERTY_NAME).getValue();
in.user = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_PROPERTY_NAME).getValue();
in.port = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_PORT_PROPERTY_NAME).getIntValue();
in.useSsl= in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_SSL_PROPERTY_NAME).getBooleanValue();
in.useLdapConnectionPool = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_LDAP_CONNECTION_POOL_PROPERTY_NAME).getBooleanValue();
in.useDefaultPort = in.port==-1||in.port==389||in.port==636;
if (in.useDefaultPort)
{
	if(in.port==-1)
	{
		in.port = 389;
	}
}


in.importContext= in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_DEFAULT_CONTEXT_PROPERTY_NAME).getValue();
in.importUserGroup = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_EVERYBODY_USER_GROUP_NAME_PROPERTY_NAME).getValue();
in.doNotUseUserGroupImport= (in.importUserGroup==null)||(in.importUserGroup.trim().length()==0);
in.importUserFilter= in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FILTER_PROPERTY_NAME).getValue();
in.synchronizationTime = in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_UPDATE_TIME_PROPERTY_NAME).getIntValue();

panel.dayTimeComboboxPanel.setDayTime(in.synchronizationTime);
' #txt
Ss0 f6 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f6 78 156 36 24 20 -2 #rect
Ss0 f6 @|RichDialogProcessStepIcon #fIcon
Ss0 f7 expr out #txt
Ss0 f7 96 74 96 156 #arcP
Ss0 f2 expr out #txt
Ss0 f2 96 180 96 286 #arcP
Ss0 f8 guid 13F2CED34926FB5B #txt
Ss0 f8 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f8 method save() #txt
Ss0 f8 disableUIEvents false #txt
Ss0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f8 outParameterDecl '<> result;
' #txt
Ss0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save()</name>
    </language>
</elementInfo>
' #txt
Ss0 f8 1102 22 20 20 13 0 #rect
Ss0 f8 @|RichDialogMethodStartIcon #fIcon
Ss0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f9 actionTable 'out=in;
' #txt
Ss0 f9 actionCode 'import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.system.IProperty;
import ch.ivyteam.ivy.rd.common.Property;

if (in.doNotUseUserGroupImport)
{
 in.importUserGroup="";
}

if (in.useDefaultPort && in.useSsl)
{
 in.port=636; //LDAP over SSL
} 
else if(in.useDefaultPort)
{
	in.port=-1;
}

in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_HOST_NAME_PROPERTY_NAME).setValue(in.host.toString().trim());
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_DEFAULT_CONTEXT_PROPERTY_NAME).setValue(in.importContext);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FILTER_PROPERTY_NAME).setValue(in.importUserFilter);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_EVERYBODY_USER_GROUP_NAME_PROPERTY_NAME).setValue(in.importUserGroup);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_AUTHENTICATION_KIND_PROPERTY_NAME).setValue(in.authenticationKind);

in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_PASSWORD_PROPERTY_NAME).setValue(in.password);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_PORT_PROPERTY_NAME).setValue(in.port);
in.synchronizationTime = panel.dayTimeComboboxPanel.getDayTime();
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_UPDATE_TIME_PROPERTY_NAME).setValue(in.synchronizationTime);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_LDAP_CONNECTION_POOL_PROPERTY_NAME).setValue(in.useLdapConnectionPool);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_SSL_PROPERTY_NAME).setValue(in.useSsl);
in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_PROPERTY_NAME).setValue(in.user);






' #txt
Ss0 f9 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save data changed</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f9 1094 124 36 24 20 -2 #rect
Ss0 f9 @|RichDialogProcessStepIcon #fIcon
Ss0 f10 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f10 1102 286 20 20 13 0 #rect
Ss0 f10 @|RichDialogProcessEndIcon #fIcon
Ss0 f12 expr out #txt
Ss0 f12 1112 148 1112 286 #arcP
Ss0 f13 guid 013F2D12A53FCB59 #txt
Ss0 f13 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f13 actionTable 'out=in;
' #txt
Ss0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>browseImportContext</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f13 390 22 20 20 13 0 #rect
Ss0 f13 @|RichDialogProcessStartIcon #fIcon
Ss0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f14 actionTable 'out=in;
' #txt
Ss0 f14 actionCode 'import ch.ivyteam.naming.JndiConfig;
import ch.ivyteam.naming.JndiProvider;
import ch.ivyteam.naming.JndiUtil;

in.jndiConfig = new JndiConfig(JndiProvider.ACTIVE_DIRECTORY, in.host.trim(), in.port, in.authenticationKind,  in.user, in.password,in.useSsl, in.useLdapConnectionPool,  "");

in.error = JndiUtil.tryOpenDirContext(in.jndiConfig);' #txt
Ss0 f14 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Try opening context</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f14 382 76 36 24 20 -2 #rect
Ss0 f14 @|RichDialogProcessStepIcon #fIcon
Ss0 f15 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>error?</name>
        <nameStyle>6,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f15 386 138 28 28 14 0 #rect
Ss0 f15 @|AlternativeIcon #fIcon
Ss0 f16 targetWindow NEW:card: #txt
Ss0 f16 targetDisplay TOP #txt
Ss0 f16 richDialogId ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser #txt
Ss0 f16 startMethod start(ch.ivyteam.naming.JndiConfig,String) #txt
Ss0 f16 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f16 requestActionDecl '<ch.ivyteam.naming.JndiConfig jndiConfig, String contextToSelect> param;' #txt
Ss0 f16 requestMappingAction 'param.jndiConfig=in.jndiConfig;
param.contextToSelect=in.importContext;
' #txt
Ss0 f16 responseActionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f16 responseMappingAction 'out=in;
out.importContext=result.choosenContext.length()>0?result.choosenContext:in.importContext;
' #txt
Ss0 f16 windowConfiguration '{/title "Browse <%=in.host%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ss0 f16 isAsynch false #txt
Ss0 f16 isInnerRd true #txt
Ss0 f16 userContext '* ' #txt
Ss0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open browse</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f16 382 212 36 24 20 -2 #rect
Ss0 f16 @|RichDialogIcon #fIcon
Ss0 f17 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f17 390 286 20 20 13 0 #rect
Ss0 f17 @|RichDialogProcessEndIcon #fIcon
Ss0 f41 expr out #txt
Ss0 f41 400 42 400 76 #arcP
Ss0 f42 expr out #txt
Ss0 f42 400 100 400 138 #arcP
Ss0 f43 targetWindow NEW:card: #txt
Ss0 f43 targetDisplay TOP #txt
Ss0 f43 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDialog #txt
Ss0 f43 startMethod showError(java.lang.Throwable,Boolean,Boolean) #txt
Ss0 f43 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f43 requestActionDecl '<java.lang.Throwable error, Boolean showCopyButton, Boolean showDetailButton> param;' #txt
Ss0 f43 requestMappingAction 'param.error=in.error;
param.showCopyButton=true;
param.showDetailButton=true;
' #txt
Ss0 f43 responseActionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f43 responseMappingAction 'out=in;
' #txt
Ss0 f43 windowConfiguration '{/title "Can not open context"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ss0 f43 isAsynch false #txt
Ss0 f43 isInnerRd true #txt
Ss0 f43 userContext '* ' #txt
Ss0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f43 526 140 36 24 20 -2 #rect
Ss0 f43 @|RichDialogIcon #fIcon
Ss0 f44 expr in #txt
Ss0 f44 outCond 'in.#error != null' #txt
Ss0 f44 3 #arcStyle
Ss0 f44 414 152 526 152 #arcP
Ss0 f45 expr in #txt
Ss0 f45 400 166 400 212 #arcP
Ss0 f46 expr out #txt
Ss0 f46 400 236 400 286 #arcP
Ss0 f47 guid 13F2D138D67E13EE #txt
Ss0 f47 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f47 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f47 actionTable 'out=in;
' #txt
Ss0 f47 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>browseImportUserGroup</name>
        <nameStyle>21,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f47 670 22 20 20 13 0 #rect
Ss0 f47 @|RichDialogProcessStartIcon #fIcon
Ss0 f48 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f48 actionTable 'out=in;
' #txt
Ss0 f48 actionCode 'import ch.ivyteam.naming.JndiConfig;
import ch.ivyteam.naming.JndiProvider;
import ch.ivyteam.naming.JndiUtil;

in.jndiConfig = new JndiConfig(JndiProvider.ACTIVE_DIRECTORY, in.host.trim(), in.port, in.authenticationKind,  in.user, in.password,in.useSsl, in.useLdapConnectionPool,  in.importContext);

in.error = JndiUtil.tryOpenDirContext(in.jndiConfig);' #txt
Ss0 f48 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f48 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Try opening context</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f48 662 76 36 24 20 -2 #rect
Ss0 f48 @|RichDialogProcessStepIcon #fIcon
Ss0 f49 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f49 666 138 28 28 14 0 #rect
Ss0 f49 @|AlternativeIcon #fIcon
Ss0 f50 targetWindow NEW:card: #txt
Ss0 f50 targetDisplay TOP #txt
Ss0 f50 richDialogId ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser #txt
Ss0 f50 startMethod start(ch.ivyteam.naming.JndiConfig,String) #txt
Ss0 f50 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f50 requestActionDecl '<ch.ivyteam.naming.JndiConfig jndiConfig, String contextToSelect> param;' #txt
Ss0 f50 requestMappingAction 'param.jndiConfig=in.jndiConfig;
param.contextToSelect=in.importUserGroup;
' #txt
Ss0 f50 responseActionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f50 responseMappingAction 'out=in;
out.importUserGroup=result.choosenContext.length()>0?result.choosenContext:in.importUserGroup;
' #txt
Ss0 f50 windowConfiguration '{/title "Browse <%=in.host%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ss0 f50 isAsynch false #txt
Ss0 f50 isInnerRd true #txt
Ss0 f50 userContext '* ' #txt
Ss0 f50 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open browse</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f50 662 212 36 24 20 -2 #rect
Ss0 f50 @|RichDialogIcon #fIcon
Ss0 f51 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f51 670 286 20 20 13 0 #rect
Ss0 f51 @|RichDialogProcessEndIcon #fIcon
Ss0 f52 expr out #txt
Ss0 f52 680 42 680 76 #arcP
Ss0 f53 expr out #txt
Ss0 f53 680 100 680 138 #arcP
Ss0 f54 expr in #txt
Ss0 f54 outCond 'in.#error != null' #txt
Ss0 f54 3 #arcStyle
Ss0 f54 666 152 562 152 #arcP
Ss0 f55 expr in #txt
Ss0 f55 680 166 680 212 #arcP
Ss0 f56 expr out #txt
Ss0 f56 680 236 680 286 #arcP
Ss0 f57 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f57 534 198 20 20 13 0 #rect
Ss0 f57 @|RichDialogProcessEndIcon #fIcon
Ss0 f58 expr out #txt
Ss0 f58 544 164 544 198 #arcP
Ss0 f18 guid 13F3192FC5476E54 #txt
Ss0 f18 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f18 actionTable 'out=in;
' #txt
Ss0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>use SSL</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f18 390 382 20 20 13 0 #rect
Ss0 f18 @|RichDialogProcessStartIcon #fIcon
Ss0 f19 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f19 actionTable 'out=in;
' #txt
Ss0 f19 actionCode 'if(in.useDefaultPort && in.useSsl) {
	in.port = 636;
} else if(in.useDefaultPort) {
	in.port = 389;
}' #txt
Ss0 f19 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f19 382 436 36 24 20 -2 #rect
Ss0 f19 @|RichDialogProcessStepIcon #fIcon
Ss0 f20 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f20 390 486 20 20 13 0 #rect
Ss0 f20 @|RichDialogProcessEndIcon #fIcon
Ss0 f21 expr out #txt
Ss0 f21 400 402 400 436 #arcP
Ss0 f22 expr out #txt
Ss0 f22 400 460 400 486 #arcP
Ss0 f23 guid 13F31A039F971FF3 #txt
Ss0 f23 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f23 actionTable 'out=in;
' #txt
Ss0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>disabled buttons</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f23 574 382 20 20 13 0 #rect
Ss0 f23 @|RichDialogProcessStartIcon #fIcon
Ss0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f24 actionTable 'out=in;
' #txt
Ss0 f24 actionCode 'if(in.host.trim().isEmpty())
{
	panel.browseImportContextButton.enabled = false;
	panel.importUserGroupBrowseButton.enabled = false;
}
else
{
	panel.browseImportContextButton.enabled = true;
	panel.importUserGroupBrowseButton.enabled = true;
}' #txt
Ss0 f24 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f24 566 436 36 24 20 -2 #rect
Ss0 f24 @|RichDialogProcessStepIcon #fIcon
Ss0 f25 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f25 574 486 20 20 13 0 #rect
Ss0 f25 @|RichDialogProcessEndIcon #fIcon
Ss0 f26 expr out #txt
Ss0 f26 584 402 584 436 #arcP
Ss0 f27 expr out #txt
Ss0 f27 584 460 584 486 #arcP
Ss0 f30 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f30 actionTable 'out=in;
' #txt
Ss0 f30 actionCode 'import ch.ivyteam.ivy.admin.tool.util.DatabaseValidationProperties;
import org.apache.http.ParseException;
import java.util.Arrays;

in.errorMsg = "";
int maxLength = 0;

// HOST
if (panel.hostTextField.getValidator().hasErrors())
{
	in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/host"))) + "\n";
}

// PORT
if (panel.portTextField.getValidator().hasErrors())
{
	in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/port"))) + "\n";
}

// USER NAME
if(!in.user.isEmpty())
{
	maxLength = DatabaseValidationProperties.getLdapUserNameMaxLength();
	if(in.user.trim().length() > maxLength) 
	{
		in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/fieldLengthTooLong", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/userName"), maxLength)) + "\n";
	}
}

// PASSWORD
if(!in.password.isEmpty())
{
	maxLength = DatabaseValidationProperties.getLdapPasswdMaxLength();
	if(in.password.trim().length() > maxLength) 
	{
		in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/fieldLengthTooLong", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/password"), maxLength)) + "\n";
	}
}

// DEFAULT CONTEXT
if(!in.importContext.isEmpty())
{
	maxLength = DatabaseValidationProperties.getLdapDefaultContextMaxLength();
	if(in.importContext.trim().length() > maxLength) 
	{
		in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/fieldLengthTooLong", Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/importContext"), maxLength)) + "\n";
	}
}

// HOUR
if (!panel.dayTimeComboboxPanel.validateHour())
{
	in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList("Hour")) + "\n";
}

// MINUTE
if (!panel.dayTimeComboboxPanel.validateMinute())
{
	in.errorMsg += ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/message/validationMessage", Arrays.asList("Minute")) + "\n";
}


' #txt
Ss0 f30 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate input fields</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f30 1334 100 36 24 20 -2 #rect
Ss0 f30 @|RichDialogProcessStepIcon #fIcon
Ss0 f35 guid 13F3B9455F420AD2 #txt
Ss0 f35 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f35 method validate() #txt
Ss0 f35 disableUIEvents false #txt
Ss0 f35 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f35 outParameterDecl '<java.lang.StringBuffer errorMsg> result;
' #txt
Ss0 f35 outActionCode 'StringBuffer buf = new StringBuffer(in.errorMsg);
result.errorMsg = buf;' #txt
Ss0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate()</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f35 1342 22 20 20 13 0 #rect
Ss0 f35 @|RichDialogMethodStartIcon #fIcon
Ss0 f38 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f38 1342 286 20 20 13 0 #rect
Ss0 f38 @|RichDialogProcessEndIcon #fIcon
Ss0 f29 expr out #txt
Ss0 f29 1112 42 1112 124 #arcP
Ss0 f31 expr out #txt
Ss0 f31 1352 42 1352 100 #arcP
Ss0 f11 guid 14621D89FC257F72 #txt
Ss0 f11 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f11 method isUserFilterCorrect() #txt
Ss0 f11 disableUIEvents false #txt
Ss0 f11 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f11 outParameterDecl '<java.lang.Boolean isUserFilterCorrect> result;
' #txt
Ss0 f11 outParameterMapAction 'result.isUserFilterCorrect=in.isUserFilterCorrect;
' #txt
Ss0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isUserFilterCorrect()</name>
        <nameStyle>21,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f11 1566 30 20 20 13 0 #rect
Ss0 f11 @|RichDialogMethodStartIcon #fIcon
Ss0 f28 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f28 1566 118 20 20 13 0 #rect
Ss0 f28 @|RichDialogProcessEndIcon #fIcon
Ss0 f32 expr out #txt
Ss0 f32 1576 50 1576 118 #arcP
Ss0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f33 actionTable 'out=in;
' #txt
Ss0 f33 actionCode 'import ch.ivyteam.ivy.admin.tool.checker.LdapFilterSyntaxChecker;


in.isUserFilterCorrect = true;
// USER FILTER
if (!in.importUserFilter.isEmpty())
{
	if (!LdapFilterSyntaxChecker.checkLdapFilterSyntax(in.importUserFilter))
	{
		in.isUserFilterCorrect = false;
	}
}' #txt
Ss0 f33 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check UserFilter</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f33 1334 180 36 24 28 -18 #rect
Ss0 f33 @|RichDialogProcessStepIcon #fIcon
Ss0 f34 expr out #txt
Ss0 f34 1352 124 1352 180 #arcP
Ss0 f36 expr out #txt
Ss0 f36 1352 204 1352 286 #arcP
Ss0 f37 guid 146949BDEEAE285D #txt
Ss0 f37 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f37 method checkDataChanged() #txt
Ss0 f37 disableUIEvents false #txt
Ss0 f37 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f37 outParameterDecl '<java.lang.Boolean hasDataChanged> result;
' #txt
Ss0 f37 outParameterMapAction 'result.hasDataChanged=in.hasDataChanged;
' #txt
Ss0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>checkDataChanged()</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f37 1749 21 22 22 14 0 #rect
Ss0 f37 @|RichDialogMethodStartIcon #fIcon
Ss0 f37 -13016147|-1|-16777216 #nodeStyle
Ss0 f39 actionDecl 'ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData out;
' #txt
Ss0 f39 actionTable 'out=in;
' #txt
Ss0 f39 actionCode 'import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.system.IProperty;
import ch.ivyteam.ivy.rd.common.Property;

in.hasDataChanged = false;

// Check if host is changed or not
if (!in.host.trim().equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_HOST_NAME_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if port is changed or not
Number port = in.port;
if (in.useDefaultPort && in.useSsl)
{
	port=636; //LDAP over SSL
} 
else if(in.useDefaultPort)
{
	port=-1;
}

if (port != in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_SERVER_PORT_PROPERTY_NAME).getIntValue()) {
	in.hasDataChanged = true;
}

// Check if authentication kind is changed or not
if (!in.authenticationKind.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_AUTHENTICATION_KIND_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if username is changed or not
if (!in.user.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_NAME_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if password is changed or not
if (!in.password.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_PASSWORD_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if ssl is changed or not
if (!in.useSsl == in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_SSL_PROPERTY_NAME).getBooleanValue()) {
	in.hasDataChanged = true;
}

// Check if use ldap connection is changed or not
if (!in.useLdapConnectionPool == in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USE_LDAP_CONNECTION_POOL_PROPERTY_NAME).getBooleanValue()) {
	in.hasDataChanged = true;
}

// Check if user group is changed or not
String importUserGroup = in.importUserGroup;
if (in.doNotUseUserGroupImport)
{
	importUserGroup = "";
}

if (!importUserGroup.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_EVERYBODY_USER_GROUP_NAME_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if context is changed or not
if (!in.importContext.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_DEFAULT_CONTEXT_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if user filter is changed or not
if (!in.importUserFilter.equals(in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_USER_FILTER_PROPERTY_NAME).getValue())) {
	in.hasDataChanged = true;
}

// Check if synchronize time is changed or not
if (panel.dayTimeComboboxPanel.getDayTime() != in.securityContext.getConfigurationProperty(IJndiSecuritySystemConstants.JNDI_UPDATE_TIME_PROPERTY_NAME).getIntValue()) {
	in.hasDataChanged = true;
}' #txt
Ss0 f39 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check data changed</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f39 1742 84 36 24 20 -2 #rect
Ss0 f39 @|RichDialogProcessStepIcon #fIcon
Ss0 f39 -13016147|-1|-16777216 #nodeStyle
Ss0 f40 type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
Ss0 f40 1749 149 22 22 14 0 #rect
Ss0 f40 @|RichDialogProcessEndIcon #fIcon
Ss0 f40 -13016147|-1|-16777216 #nodeStyle
Ss0 f59 expr out #txt
Ss0 f59 1760 43 1760 84 #arcP
Ss0 f60 expr out #txt
Ss0 f60 1760 108 1760 149 #arcP
>Proto Ss0 .ui2RdDataAction 'out.authenticationKind=panel.authenticationKindComboBox.#selectedListEntry as String;
out.importContext=panel.defaultContextTextField.text;
out.useDefaultPort=panel.defaultPortCheckBox.selected;
out.host=panel.hostTextField.text;
out.password=panel.passwordField.text;
out.port=panel.portTextField.valueAsNumber;
out.useLdapConnectionPool=panel.useLdapConnectionPoolCheckBox.selected;
out.importUserFilter=panel.userFilterTextField.text;
out.doNotUseUserGroupImport=panel.userGroupCheckBox.selected;
out.importUserGroup=panel.userGroupTextField.text;
out.user=panel.userNameTextField.text;
out.useSsl=panel.useSslCheckBox.selected;
' #txt
>Proto Ss0 .rdData2UIAction 'panel.authenticationKindComboBox.listData=in.authenticationKinds;
panel.authenticationKindComboBox.selectedListEntry=in.authenticationKind;
panel.defaultContextTextField.text=in.importContext;
panel.defaultPortCheckBox.selected=in.useDefaultPort;
panel.hostTextField.text=in.host;
panel.passwordField.text=in.password;
panel.portTextField.enabled=!in.useDefaultPort;
panel.portTextField.valueAsNumber=in.port;
panel.useLdapConnectionPoolCheckBox.selected=in.useLdapConnectionPool;
panel.userFilterTextField.text=in.importUserFilter;
panel.userGroupCheckBox.selected=in.doNotUseUserGroupImport;
panel.userGroupTextField.enabled=!in.doNotUseUserGroupImport;
panel.userGroupTextField.text=in.importUserGroup;
panel.userNameTextField.text=in.user;
panel.useSslCheckBox.selected=in.useSsl;
' #txt
>Proto Ss0 .type ch.ivyteam.ivy.admin.tool.JndiSecuritySystem.JndiSecuritySystemData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f3 mainOut f5 tail #connect
Ss0 f5 head f4 mainIn #connect
Ss0 f0 mainOut f7 tail #connect
Ss0 f7 head f6 mainIn #connect
Ss0 f6 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f9 mainOut f12 tail #connect
Ss0 f12 head f10 mainIn #connect
Ss0 f13 mainOut f41 tail #connect
Ss0 f41 head f14 mainIn #connect
Ss0 f14 mainOut f42 tail #connect
Ss0 f42 head f15 in #connect
Ss0 f15 out f44 tail #connect
Ss0 f44 head f43 mainIn #connect
Ss0 f15 out f45 tail #connect
Ss0 f45 head f16 mainIn #connect
Ss0 f16 mainOut f46 tail #connect
Ss0 f46 head f17 mainIn #connect
Ss0 f47 mainOut f52 tail #connect
Ss0 f52 head f48 mainIn #connect
Ss0 f48 mainOut f53 tail #connect
Ss0 f53 head f49 in #connect
Ss0 f49 out f54 tail #connect
Ss0 f54 head f43 mainIn #connect
Ss0 f49 out f55 tail #connect
Ss0 f55 head f50 mainIn #connect
Ss0 f50 mainOut f56 tail #connect
Ss0 f56 head f51 mainIn #connect
Ss0 f43 mainOut f58 tail #connect
Ss0 f58 head f57 mainIn #connect
Ss0 f18 mainOut f21 tail #connect
Ss0 f21 head f19 mainIn #connect
Ss0 f19 mainOut f22 tail #connect
Ss0 f22 head f20 mainIn #connect
Ss0 f23 mainOut f26 tail #connect
Ss0 f26 head f24 mainIn #connect
Ss0 f24 mainOut f27 tail #connect
Ss0 f27 head f25 mainIn #connect
Ss0 f8 mainOut f29 tail #connect
Ss0 f29 head f9 mainIn #connect
Ss0 f35 mainOut f31 tail #connect
Ss0 f31 head f30 mainIn #connect
Ss0 f11 mainOut f32 tail #connect
Ss0 f32 head f28 mainIn #connect
Ss0 f30 mainOut f34 tail #connect
Ss0 f34 head f33 mainIn #connect
Ss0 f33 mainOut f36 tail #connect
Ss0 f36 head f38 mainIn #connect
Ss0 f37 mainOut f59 tail #connect
Ss0 f59 head f39 mainIn #connect
Ss0 f39 mainOut f60 tail #connect
Ss0 f60 head f40 mainIn #connect
