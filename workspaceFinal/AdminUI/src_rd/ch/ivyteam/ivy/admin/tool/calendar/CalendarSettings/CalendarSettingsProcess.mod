[Ivy]
[>Created: Mon Dec 12 12:03:17 CET 2011]
133FA273665BE45A 3.17 #module
>Proto >Proto Collection #zClass
Cs0 CalendarSettingsProcess Big #zClass
Cs0 RD #cInfo
Cs0 #process
Cs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Cs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Cs0 @TextInP .resExport .resExport #zField
Cs0 @TextInP .type .type #zField
Cs0 @TextInP .processKind .processKind #zField
Cs0 @AnnotationInP-0n ai ai #zField
Cs0 @TextInP .xml .xml #zField
Cs0 @TextInP .responsibility .responsibility #zField
Cs0 @RichDialogInitStart f0 '' #zField
Cs0 @RichDialogProcessEnd f1 '' #zField
Cs0 @RichDialogProcessEnd f2 '' #zField
Cs0 @PushWFArc f12 '' #zField
Cs0 @RichDialogInitStart f6 '' #zField
Cs0 @RichDialogProcessStart f3 '' #zField
Cs0 @RichDialogEnd f5 '' #zField
Cs0 @PushWFArc f8 '' #zField
Cs0 @PushWFArc f4 '' #zField
>Proto Cs0 Cs0 CalendarSettingsProcess #zField
Cs0 f0 guid 133FA27368E1922E #txt
Cs0 f0 type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
Cs0 f0 method start() #txt
Cs0 f0 disableUIEvents true #txt
Cs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Cs0 f0 outParameterDecl '<> result;
' #txt
Cs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Cs0 f0 90 40 20 20 13 0 #rect
Cs0 f0 @|RichDialogInitStartIcon #fIcon
Cs0 f1 type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
Cs0 f1 90 230 20 20 13 0 #rect
Cs0 f1 @|RichDialogProcessEndIcon #fIcon
Cs0 f2 type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
Cs0 f2 222 230 20 20 13 0 #rect
Cs0 f2 @|RichDialogProcessEndIcon #fIcon
Cs0 f12 expr out #txt
Cs0 f12 100 60 100 230 #arcP
Cs0 f6 guid 13417DA34813CB73 #txt
Cs0 f6 type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
Cs0 f6 method start(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings) #txt
Cs0 f6 disableUIEvents true #txt
Cs0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings settings> param = methodEvent.getInputArguments();
' #txt
Cs0 f6 inParameterMapAction 'out.settings=param.settings;
' #txt
Cs0 f6 outParameterDecl '<> result;
' #txt
Cs0 f6 embeddedRdInitializations '{/calendarTreePanel {/fieldName "calendarTreePanel"/startMethod "start(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings)"/parameterMapping "param.calendarSettings=callParam.settings;\n"/initScript ""/userContext * }/calendarDetailPanel {/fieldName "calendarDetailPanel"/startMethod "start(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings)"/parameterMapping "param.businessCalendarSettings=callParam.settings;\n"/initScript ""/userContext * }}' #txt
Cs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IBusinessCalendarSettings)</name>
        <nameStyle>32,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f6 222 40 20 20 13 0 #rect
Cs0 f6 @|RichDialogInitStartIcon #fIcon
Cs0 f3 guid 13419294441B501F #txt
Cs0 f3 type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
Cs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData out;
' #txt
Cs0 f3 actionTable 'out=in;
' #txt
Cs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f3 478 38 20 20 13 0 #rect
Cs0 f3 @|RichDialogProcessStartIcon #fIcon
Cs0 f5 type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
Cs0 f5 guid 134192958463F01C #txt
Cs0 f5 478 238 20 20 13 0 #rect
Cs0 f5 @|RichDialogEndIcon #fIcon
Cs0 f8 expr out #txt
Cs0 f8 488 58 488 238 #arcP
Cs0 f4 expr out #txt
Cs0 f4 232 60 232 230 #arcP
>Proto Cs0 .type ch.ivyteam.ivy.admin.tool.calendar.CalendarSettings.CalendarSettingsData #txt
>Proto Cs0 .processKind RICH_DIALOG #txt
>Proto Cs0 -8 -8 16 16 16 26 #rect
>Proto Cs0 '' #fIcon
Cs0 f0 mainOut f12 tail #connect
Cs0 f12 head f1 mainIn #connect
Cs0 f3 mainOut f8 tail #connect
Cs0 f8 head f5 mainIn #connect
Cs0 f6 mainOut f4 tail #connect
Cs0 f4 head f2 mainIn #connect
