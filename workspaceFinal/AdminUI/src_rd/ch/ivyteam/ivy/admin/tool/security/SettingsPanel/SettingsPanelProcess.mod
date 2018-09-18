[Ivy]
[>Created: Wed Feb 16 14:28:51 CET 2011]
12984616DBA3DF51 3.16 #module
>Proto >Proto Collection #zClass
Ss0 SettingsPanelProcess Big #zClass
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
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogProcessStart f3 '' #zField
Ss0 @RichDialogProcessStart f4 '' #zField
Ss0 @RichDialogEnd f5 '' #zField
Ss0 @PushWFArc f6 '' #zField
Ss0 @PushWFArc f7 '' #zField
Ss0 @RichDialogInitStart f8 '' #zField
Ss0 @PushWFArc f9 '' #zField
>Proto Ss0 Ss0 SettingsPanelProcess #zField
Ss0 f0 guid 12984616DE5E9ADC #txt
Ss0 f0 type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
Ss0 f0 method start() #txt
Ss0 f0 disableUIEvents true #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 inParameterMapAction 'out.application=ivy.request.getApplication();
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 embeddedRdInitializations '{/emailNotificationSettingsPanel {/fieldName "emailNotificationSettingsPanel"/startMethod "start(ch.ivyteam.ivy.security.IEMailNotificationSettings,java.util.Locale)"/parameterMapping ""/initScript "param.settings = in.application.getDefaultEMailNotifcationSettings();\nparam.emailLanguage = in.application.getDefaultEMailLanguage();"}}' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 54 38 20 20 13 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 f1 type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
Ss0 f1 54 142 20 20 13 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f2 expr out #txt
Ss0 f2 64 58 64 142 #arcP
Ss0 f3 guid 12987BDFCF961BCE #txt
Ss0 f3 type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
Ss0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData out;
' #txt
Ss0 f3 actionTable 'out=in;
' #txt
Ss0 f3 actionCode 'in.application.setDefaultEMailNotifcationSettings(panel.emailNotificationSettingsPanel.getSettings());
in.application.setDefaultEMailLanguage(panel.emailNotificationSettingsPanel.getLanguage());
panel.mailContentProcessSettingPanel.save();
panel.processExecutionSettingsPanel.save();' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Ok</name>
        <nameStyle>2,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 214 38 20 20 13 0 #rect
Ss0 f3 @|RichDialogProcessStartIcon #fIcon
Ss0 f4 guid 12987BE257FC4900 #txt
Ss0 f4 type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
Ss0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData out;
' #txt
Ss0 f4 actionTable 'out=in;
' #txt
Ss0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f4 302 38 20 20 13 0 #rect
Ss0 f4 @|RichDialogProcessStartIcon #fIcon
Ss0 f5 type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
Ss0 f5 guid 12987BE58EDB2FA0 #txt
Ss0 f5 262 102 20 20 13 0 #rect
Ss0 f5 @|RichDialogEndIcon #fIcon
Ss0 f6 expr out #txt
Ss0 f6 230 56 266 103 #arcP
Ss0 f7 expr out #txt
Ss0 f7 306 56 277 103 #arcP
Ss0 f8 guid 129A7F808A2A0653 #txt
Ss0 f8 type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
Ss0 f8 method start(ch.ivyteam.ivy.application.IApplication) #txt
Ss0 f8 disableUIEvents true #txt
Ss0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ss0 f8 inParameterMapAction 'out.application=param.application;
' #txt
Ss0 f8 outParameterDecl '<> result;
' #txt
Ss0 f8 embeddedRdInitializations '{/mailContentProcessSettingPanel {/fieldName "mailContentProcessSettingPanel"/startMethod "start(ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.application=callParam.application;\n"/initScript ""/userContext * }/processExecutionSettingsPanel {/fieldName "processExecutionSettingsPanel"/startMethod "start(ch.ivyteam.ivy.application.IApplication)"/parameterMapping "param.application=callParam.application;\n"/initScript ""/userContext * }/emailNotificationSettingsPanel {/fieldName "emailNotificationSettingsPanel"/startMethod "start(ch.ivyteam.ivy.security.IEMailNotificationSettings,java.util.Locale)"/parameterMapping ""/initScript "param.settings = in.application.getDefaultEMailNotifcationSettings();\nparam.emailLanguage = in.application.getDefaultEMailLanguage();"/userContext * }}' #txt
Ss0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f8 86 78 20 20 13 0 #rect
Ss0 f8 @|RichDialogInitStartIcon #fIcon
Ss0 f9 expr out #txt
Ss0 f9 91 96 68 143 #arcP
>Proto Ss0 .type ch.ivyteam.ivy.admin.tool.security.SettingsPanel.SettingsPanelData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f0 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f3 mainOut f6 tail #connect
Ss0 f6 head f5 mainIn #connect
Ss0 f4 mainOut f7 tail #connect
Ss0 f7 head f5 mainIn #connect
Ss0 f8 mainOut f9 tail #connect
Ss0 f9 head f1 mainIn #connect
