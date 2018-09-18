[Ivy]
[>Created: Mon Jul 13 13:33:03 ICT 2015]
117B19534CEE9EE7 3.17 #module
>Proto >Proto Collection #zClass
Us0 UserProcess Big #zClass
Us0 RD #cInfo
Us0 #process
Us0 @AnnotationInP-0n ai ai #zField
Us0 @TextInP .xml .xml #zField
Us0 @TextInP .responsibility .responsibility #zField
Us0 @MessageFlowInP-0n messageIn messageIn #zField
Us0 @MessageFlowOutP-0n messageOut messageOut #zField
Us0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Us0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Us0 @TextInP .resExport .resExport #zField
Us0 @TextInP .type .type #zField
Us0 @TextInP .processKind .processKind #zField
Us0 @RichDialogInitStart f0 '' #zField
Us0 @RichDialogInitStart f1 '' #zField
Us0 @RichDialogProcessEnd f2 '' #zField
Us0 @RichDialogProcessStart f5 '' #zField
Us0 @RichDialogProcessStart f6 '' #zField
Us0 @RichDialogEnd f7 '' #zField
Us0 @RichDialogEnd f8 '' #zField
Us0 @PushWFArc f10 '' #zField
Us0 @RichDialogProcessStep f11 '' #zField
Us0 @RichDialogProcessStep f12 '' #zField
Us0 @Alternative f13 '' #zField
Us0 @PushWFArc f9 '' #zField
Us0 @PushWFArc f16 '' #zField
Us0 @Alternative f18 '' #zField
Us0 @PushWFArc f14 '' #zField
Us0 @RichDialogProcessEnd f20 '' #zField
Us0 @RichDialogProcessStep f24 '' #zField
Us0 @PushWFArc f25 '' #zField
Us0 @RichDialog f38 '' #zField
Us0 @PushWFArc f21 '' #zField
Us0 @PushWFArc f22 '' #zField
Us0 @RichDialogProcessStart f23 '' #zField
Us0 @RichDialogProcessStep f26 '' #zField
Us0 @PushWFArc f27 '' #zField
Us0 @PushWFArc f28 '' #zField
Us0 @RichDialogProcessEnd f4 '' #zField
Us0 @PushWFArc f29 '' #zField
Us0 @RichDialogProcessStart f30 '' #zField
Us0 @RichDialogProcessEnd f31 '' #zField
Us0 @PushWFArc f32 '' #zField
Us0 @CallSub f17 '' #zField
Us0 @PushWFArc f33 '' #zField
Us0 @PushWFArc f34 '' #zField
Us0 @PushWFArc f15 '' #zField
Us0 @CallSub f35 '' #zField
Us0 @Alternative f37 '' #zField
Us0 @PushWFArc f39 '' #zField
Us0 @PushWFArc f40 '' #zField
Us0 @PushWFArc f41 '' #zField
Us0 @PushWFArc f19 '' #zField
Us0 @RichDialogProcessStep f36 '' #zField
Us0 @PushWFArc f42 '' #zField
Us0 @PushWFArc f3 '' #zField
>Proto Us0 Us0 UserProcess #zField
Us0 f0 guid 117B19FF0CB8B414 #txt
Us0 f0 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f0 method start(ch.ivyteam.ivy.security.ISecurityContext) #txt
Us0 f0 disableUIEvents false #txt
Us0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext> param = methodEvent.getInputArguments();
' #txt
Us0 f0 inParameterMapAction 'out.securityContext=param.securityContext;
' #txt
Us0 f0 outParameterDecl '<ch.ivyteam.ivy.security.IUser createdUser> result;
' #txt
Us0 f0 outParameterMapAction 'result.createdUser=in.user;
' #txt
Us0 f0 outActionCode '

' #txt
Us0 f0 embeddedRdInitializations '{/emailNotificationSettingsPanel {/fieldName "emailNotificationSettingsPanel"/startMethod "start(ch.ivyteam.ivy.security.IUserEMailNotificationSettings,java.util.Locale,ch.ivyteam.ivy.security.IEMailNotificationSettings,java.util.Locale)"/parameterMapping ""/initScript "import ch.ivyteam.ivy.application.IApplication;\nimport ch.ivyteam.ivy.application.ApplicationConfigurationManagerNavigationUtil;\nimport ch.ivyteam.ivy.security.restricted.EMailNotificationSettingsFactory;\n\nIApplication application = ApplicationConfigurationManagerNavigationUtil.getApplication(callParam.securityContext);\n\nparam.userSettings = EMailNotificationSettingsFactory.createUserDefaultSettings();\nparam.applicationDefaultSettings = application.getDefaultEMailNotifcationSettings();\nparam.applicationDefaultLanguage = application.getDefaultEMailLanguage();"}}' #txt
Us0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext)</name>
        <nameStyle>23,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f0 30 46 20 20 13 0 #rect
Us0 f0 @|RichDialogInitStartIcon #fIcon
Us0 f1 guid 117B19FF89B1EB8F #txt
Us0 f1 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f1 method start(ch.ivyteam.ivy.security.IUser) #txt
Us0 f1 disableUIEvents false #txt
Us0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.IUser user> param = methodEvent.getInputArguments();
' #txt
Us0 f1 inParameterMapAction 'out.confirmPassword="**********";
out.eMailAddress=param.user.getEMailAddress();
out.fullName=param.user.getFullName();
out.name=param.user.getName();
out.password="**********";
out.securityContext=param.user.getSecurityContext();
out.user=param.user;
' #txt
Us0 f1 outParameterDecl '<> result;
' #txt
Us0 f1 embeddedRdInitializations '{/emailNotificationSettingsPanel {/fieldName "emailNotificationSettingsPanel"/startMethod "start(ch.ivyteam.ivy.security.IUserEMailNotificationSettings,java.util.Locale,ch.ivyteam.ivy.security.IEMailNotificationSettings,java.util.Locale)"/parameterMapping ""/initScript "import ch.ivyteam.ivy.application.IApplication;\nimport ch.ivyteam.ivy.application.ApplicationConfigurationManagerNavigationUtil;\nimport ch.ivyteam.ivy.security.restricted.EMailNotificationSettingsFactory;\n\nIApplication application = ApplicationConfigurationManagerNavigationUtil.getApplication(callParam.user.getSecurityContext());\n\nparam.userSettings = callParam.user.getEMailNotificationSettings();\nparam.userLanguage = callParam.user.getEMailLanguage();\nparam.applicationDefaultSettings = application.getDefaultEMailNotifcationSettings();\nparam.applicationDefaultLanguage = application.getDefaultEMailLanguage();"/userContext * }}' #txt
Us0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IUser)</name>
        <nameStyle>12,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f1 174 46 20 20 13 0 #rect
Us0 f1 @|RichDialogInitStartIcon #fIcon
Us0 f2 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f2 67 227 26 26 14 0 #rect
Us0 f2 @|RichDialogProcessEndIcon #fIcon
Us0 f5 guid 117B1A162B21DD54 #txt
Us0 f5 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f5 actionTable 'out=in;
' #txt
Us0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f5 86 342 20 20 13 0 #rect
Us0 f5 @|RichDialogProcessStartIcon #fIcon
Us0 f6 guid 117B1A16B3F2A536 #txt
Us0 f6 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f6 actionTable 'out=in;
' #txt
Us0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f6 654 190 20 20 13 0 #rect
Us0 f6 @|RichDialogProcessStartIcon #fIcon
Us0 f7 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f7 guid 117B1A1737D6EF78 #txt
Us0 f7 651 323 26 26 14 0 #rect
Us0 f7 @|RichDialogEndIcon #fIcon
Us0 f8 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f8 guid 117B1A17AD17E981 #txt
Us0 f8 83 859 26 26 14 0 #rect
Us0 f8 @|RichDialogEndIcon #fIcon
Us0 f10 expr out #txt
Us0 f10 664 210 664 323 #arcP
Us0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f11 actionTable 'out=in;
' #txt
Us0 f11 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;
import java.util.Locale;
import ch.ivyteam.ivy.security.IUserEMailNotificationSettings;

in.user.setEMailNotificationSettings(panel.emailNotificationSettingsPanel.getSettings() as IUserEMailNotificationSettings);
in.user.setEMailLanguage(panel.emailNotificationSettingsPanel.getLanguage());

import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.admin.tool.usersettings.UserSettingsSecurityService;


UserSettingsSecurityService userSettingsSecurityService = new UserSettingsSecurityService(in.securityContext);
boolean isFullNamePropertyEnabled = userSettingsSecurityService.isPropertyEnabled(IJndiSecuritySystemConstants.JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME);
boolean isEMailPropertyEnabled = userSettingsSecurityService.isPropertyEnabled(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME);
in.exception = null;
try
{
	if(isFullNamePropertyEnabled){
		in.user.setFullName(in.fullName);
	}
	if(isEMailPropertyEnabled){
		in.user.setEMailAddress(in.eMailAddress);
	}
	if(in.securityContext.getExternalSecuritySystemProvider().isAdministrationSupported())
	{
		if (in.password.length()>0 && in.hasPasswordChanged)
		{
			in.user.setPassword(in.password);
		}
	}
}
catch (PersistencyException e)
{
	in.exception = e;
}		' #txt
Us0 f11 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>edit</name>
        <nameStyle>4,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f11 38 708 36 24 20 -2 #rect
Us0 f11 @|RichDialogProcessStepIcon #fIcon
Us0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f12 actionTable 'out=in;
' #txt
Us0 f12 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;
import java.util.Locale;
import ch.ivyteam.ivy.security.IUserEMailNotificationSettings;

IUserEMailNotificationSettings emailSettings = panel.emailNotificationSettingsPanel.getSettings() as IUserEMailNotificationSettings;

in.exception = null;
try
{
	in.user = in.securityContext.createUser(in.name, in.fullName, in.password, panel.emailNotificationSettingsPanel.getLanguage(), in.eMailAddress, emailSettings, null);
}
catch (PersistencyException e)
{
	in.exception = e;
}' #txt
Us0 f12 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create</name>
        <nameStyle>6,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f12 126 708 36 24 20 -2 #rect
Us0 f12 @|RichDialogProcessStepIcon #fIcon
Us0 f13 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create or update?</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f13 82 650 28 28 18 -5 #rect
Us0 f13 @|AlternativeIcon #fIcon
Us0 f9 expr in #txt
Us0 f9 outCond 'in.#user != null' #txt
Us0 f9 90 672 56 708 #arcP
Us0 f16 expr in #txt
Us0 f16 102 672 144 708 #arcP
Us0 f18 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Valid?</name>
        <nameStyle>6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f18 82 594 28 28 23 -8 #rect
Us0 f18 @|AlternativeIcon #fIcon
Us0 f14 expr in #txt
Us0 f14 outCond 'in.validationError.trim().length() == 0' #txt
Us0 f14 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f14 96 622 96 650 #arcP
Us0 f20 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f20 243 699 26 26 14 0 #rect
Us0 f20 @|RichDialogProcessEndIcon #fIcon
Us0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f24 actionTable 'out=in;
' #txt
Us0 f24 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.ulc.server.validation.ValidationConstants;
import com.ulcjava.base.application.util.Color;

Color errorColor = ValidationConstants.ERROR_BACKGROUND;
List<String> errors = new List<String>();

in.exception = null;
try {
	// Check for empty name
	if (in.name.trim().length() == 0)
	{
		errors.add("A name must be specified");
	}
	
	// Check if user already exists (only when creating a new user)
	else if (in.#user == null && in.securityContext.findUser(in.name) != null)
	{
		errors.add("There is already a user with the same name!");
		panel.nameTextField.setBackground(errorColor);
	}
	else
	{
		panel.nameTextField.setBackground(Color.white);
	}
	
	// Check for password equality
	if (!in.password.equals(in.confirmPassword))
	{
		errors.add("The passwords do not match, please enter them again");
		in.password = "";
		in.confirmPassword = "";
		panel.passwordPasswordField.setBackground(errorColor);
		panel.confirmPasswordField.setBackground(errorColor);
	}
	else
	{
		panel.passwordPasswordField.setBackground(Color.white);
		panel.confirmPasswordField.setBackground(Color.white);
	}
	
	// Check for email
	if (in.eMailAddress.length() > 0 && !ch.ivyteam.ivy.checking.CommonFormats.EMAIL.test(in.eMailAddress))
	{
		errors.add("Email address wrong");
		panel.eMailAddressTextField.setBackground(errorColor);
	}
	else
	{
			panel.eMailAddressTextField.setBackground(Color.white);
	}
	
	in.validationError = null;
	for (String error : errors)
	{
		in.validationError += error + "\n";
	}
}
catch (PersistencyException e)
{
	in.exception = e;
}' #txt
Us0 f24 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Validation</name>
        <nameStyle>10,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f24 79 396 34 24 20 -2 #rect
Us0 f24 @|RichDialogProcessStepIcon #fIcon
Us0 f25 expr out #txt
Us0 f25 96 362 96 396 #arcP
Us0 f38 targetWindow NEW #txt
Us0 f38 targetDisplay TOP #txt
Us0 f38 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Us0 f38 startMethod showMessage(String) #txt
Us0 f38 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f38 requestActionDecl '<String message> param;' #txt
Us0 f38 requestMappingAction 'param.message=in.validationError;
' #txt
Us0 f38 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f38 responseMappingAction 'out=in;
' #txt
Us0 f38 windowConfiguration '#Wed May 21 16:00:26 CEST 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=0
title=Could not save user
' #txt
Us0 f38 isAsynch false #txt
Us0 f38 isInnerRd true #txt
Us0 f38 isDialog true #txt
Us0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Show error dialog</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f38 238 644 36 24 20 -2 #rect
Us0 f38 @|RichDialogIcon #fIcon
Us0 f21 expr in #txt
Us0 f21 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f21 110 608 256 644 #arcP
Us0 f21 1 256 608 #addKink
Us0 f21 0 0.6303510771717712 0 0 #arcLabel
Us0 f22 expr out #txt
Us0 f22 256 668 256 699 #arcP
Us0 f23 guid 11E02D3F81280EE4 #txt
Us0 f23 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f23 actionTable 'out=in;
out.hasPasswordChanged=in.password != "**********" ? true : false;
' #txt
Us0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>password changed</name>
        <nameStyle>16,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f23 286 46 20 20 13 0 #rect
Us0 f23 @|RichDialogProcessStartIcon #fIcon
Us0 f26 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f26 actionTable 'out=in;
out.hasPasswordChanged=false;
' #txt
Us0 f26 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>init</name>
        <nameStyle>4,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f26 62 100 36 24 20 -2 #rect
Us0 f26 @|RichDialogProcessStepIcon #fIcon
Us0 f27 expr out #txt
Us0 f27 45 64 71 100 #arcP
Us0 f28 expr out #txt
Us0 f28 175 60 98 102 #arcP
Us0 f4 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f4 283 147 26 26 14 0 #rect
Us0 f4 @|RichDialogProcessEndIcon #fIcon
Us0 f29 expr out #txt
Us0 f29 296 66 296 147 #arcP
Us0 f30 guid 126C1C2541E627DB #txt
Us0 f30 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f30 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f30 actionTable 'out=in;
' #txt
Us0 f30 actionCode panel.getRootPane().setDefaultButton(panel.okButton); #txt
Us0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load</name>
        <nameStyle>4,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f30 462 46 20 20 13 0 #rect
Us0 f30 @|RichDialogProcessStartIcon #fIcon
Us0 f31 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f31 462 150 20 20 13 0 #rect
Us0 f31 @|RichDialogProcessEndIcon #fIcon
Us0 f32 expr out #txt
Us0 f32 472 66 472 150 #arcP
Us0 f17 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f17 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Us0 f17 doCall true #txt
Us0 f17 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Us0 f17 requestMappingAction 'param.exception=in.exception;
' #txt
Us0 f17 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f17 responseMappingAction 'out=in;
' #txt
Us0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show exception to user
(if any)</name>
        <nameStyle>23,7
8,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f17 78 796 36 24 20 -2 #rect
Us0 f17 @|CallSubIcon #fIcon
Us0 f33 expr out #txt
Us0 f33 56 732 96 796 #arcP
Us0 f33 0 0.49999999999999994 0 0 #arcLabel
Us0 f34 expr out #txt
Us0 f34 144 732 96 796 #arcP
Us0 f15 expr out #txt
Us0 f15 96 820 96 859 #arcP
Us0 f35 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f35 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Us0 f35 doCall true #txt
Us0 f35 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Us0 f35 requestMappingAction 'param.exception=in.exception;
' #txt
Us0 f35 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f35 responseMappingAction 'out=in;
' #txt
Us0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show exception to user
(if any)</name>
        <nameStyle>23,7
8,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f35 406 476 36 24 20 -2 #rect
Us0 f35 @|CallSubIcon #fIcon
Us0 f37 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has error?</name>
        <nameStyle>10
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f37 82 474 28 28 14 0 #rect
Us0 f37 @|AlternativeIcon #fIcon
Us0 f39 expr out #txt
Us0 f39 96 420 96 474 #arcP
Us0 f40 expr in #txt
Us0 f40 outCond 'in.#exception is initialized' #txt
Us0 f40 110 488 406 488 #arcP
Us0 f41 expr out #txt
Us0 f41 424 500 269 712 #arcP
Us0 f41 1 424 712 #addKink
Us0 f41 0 0.7351995774329433 0 0 #arcLabel
Us0 f19 expr in #txt
Us0 f19 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f19 96 502 96 594 #arcP
Us0 f36 actionDecl 'ch.ivyteam.ivy.admin.tool.security.User.UserData out;
' #txt
Us0 f36 actionTable 'out=in;
' #txt
Us0 f36 actionCode 'import ch.ivyteam.ivy.security.jndi.IJndiSecuritySystemConstants;
import ch.ivyteam.ivy.admin.tool.usersettings.UserSettingsSecurityService;


UserSettingsSecurityService userSettingSecurityService = new UserSettingsSecurityService(in.securityContext);
panel.fullNameTextField.enabled = userSettingSecurityService.isPropertyEnabled(IJndiSecuritySystemConstants.JNDI_USER_FULL_NAME_JNDI_ATTRIBUTE_PROPERTY_NAME);
panel.eMailAddressTextField.enabled = userSettingSecurityService.isPropertyEnabled(IJndiSecuritySystemConstants.JNDI_USER_EMAIL_JNDI_ATTRIBUTE_PROPERTY_NAME);' #txt
Us0 f36 type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
Us0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>init enability for FullName 
and Email text fields</name>
        <nameStyle>50,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f36 62 164 36 24 20 -2 #rect
Us0 f36 @|RichDialogProcessStepIcon #fIcon
Us0 f42 expr out #txt
Us0 f42 80 124 80 164 #arcP
Us0 f3 expr out #txt
Us0 f3 80 188 80 227 #arcP
>Proto Us0 .ui2RdDataAction 'out.confirmPassword=panel.confirmPasswordField.text;
out.eMailAddress=panel.eMailAddressTextField.text;
out.fullName=panel.fullNameTextField.text;
out.name=panel.nameTextField.text;
out.password=panel.passwordPasswordField.text;
' #txt
>Proto Us0 .rdData2UIAction 'panel.confirmPasswordField.text=in.confirmPassword;
panel.confirmPasswordField.visible=in.securityContext.getExternalSecuritySystemProvider().isAdministrationSupported();
panel.confirmPwdLabel.visible=in.securityContext.getExternalSecuritySystemProvider().isAdministrationSupported();
panel.eMailAddressTextField.text=in.eMailAddress;
panel.fullNameTextField.text=in.fullName;
panel.nameTextField.enabled=in.#user == null;
panel.nameTextField.text=in.name;
panel.passwordLabel.visible=in.securityContext.getExternalSecuritySystemProvider().isAdministrationSupported();
panel.passwordPasswordField.text=in.password;
panel.passwordPasswordField.visible=in.securityContext.getExternalSecuritySystemProvider().isAdministrationSupported();
' #txt
>Proto Us0 .type ch.ivyteam.ivy.admin.tool.security.User.UserData #txt
>Proto Us0 .processKind RICH_DIALOG #txt
>Proto Us0 -8 -8 16 16 16 26 #rect
>Proto Us0 '' #fIcon
Us0 f6 mainOut f10 tail #connect
Us0 f10 head f7 mainIn #connect
Us0 f13 out f9 tail #connect
Us0 f9 head f11 mainIn #connect
Us0 f13 out f16 tail #connect
Us0 f16 head f12 mainIn #connect
Us0 f18 out f14 tail #connect
Us0 f14 head f13 in #connect
Us0 f5 mainOut f25 tail #connect
Us0 f25 head f24 mainIn #connect
Us0 f18 out f21 tail #connect
Us0 f21 head f38 mainIn #connect
Us0 f38 mainOut f22 tail #connect
Us0 f22 head f20 mainIn #connect
Us0 f0 mainOut f27 tail #connect
Us0 f27 head f26 mainIn #connect
Us0 f1 mainOut f28 tail #connect
Us0 f28 head f26 mainIn #connect
Us0 f23 mainOut f29 tail #connect
Us0 f29 head f4 mainIn #connect
Us0 f30 mainOut f32 tail #connect
Us0 f32 head f31 mainIn #connect
Us0 f11 mainOut f33 tail #connect
Us0 f33 head f17 mainIn #connect
Us0 f12 mainOut f34 tail #connect
Us0 f34 head f17 mainIn #connect
Us0 f17 mainOut f15 tail #connect
Us0 f15 head f8 mainIn #connect
Us0 f24 mainOut f39 tail #connect
Us0 f39 head f37 in #connect
Us0 f37 out f40 tail #connect
Us0 f40 head f35 mainIn #connect
Us0 f35 mainOut f41 tail #connect
Us0 f41 head f20 mainIn #connect
Us0 f37 out f19 tail #connect
Us0 f19 head f18 in #connect
Us0 f26 mainOut f42 tail #connect
Us0 f42 head f36 mainIn #connect
Us0 f36 mainOut f3 tail #connect
Us0 f3 head f2 mainIn #connect
