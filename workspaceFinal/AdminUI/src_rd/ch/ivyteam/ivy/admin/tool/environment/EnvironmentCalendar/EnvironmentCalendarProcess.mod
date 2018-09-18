[Ivy]
[>Created: Tue May 14 18:25:21 ICT 2013]
1353DB17FE38F444 3.17 #module
>Proto >Proto Collection #zClass
Es0 EnvironmentCalendarProcess Big #zClass
Es0 RD #cInfo
Es0 #process
Es0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Es0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Es0 @TextInP .resExport .resExport #zField
Es0 @TextInP .type .type #zField
Es0 @TextInP .processKind .processKind #zField
Es0 @AnnotationInP-0n ai ai #zField
Es0 @TextInP .xml .xml #zField
Es0 @TextInP .responsibility .responsibility #zField
Es0 @RichDialogInitStart f0 '' #zField
Es0 @RichDialogInitStart f3 '' #zField
Es0 @RichDialogProcessStart f5 '' #zField
Es0 @RichDialogProcessStart f6 '' #zField
Es0 @RichDialogProcessEnd f7 '' #zField
Es0 @RichDialogProcessEnd f9 '' #zField
Es0 @RichDialogProcessStep f12 '' #zField
Es0 @PushWFArc f16 '' #zField
Es0 @PushWFArc f17 '' #zField
Es0 @RichDialogProcessStep f10 '' #zField
Es0 @PushWFArc f11 '' #zField
Es0 @PushWFArc f4 '' #zField
Es0 @PushWFArc f8 '' #zField
Es0 @RichDialogProcessEnd f13 '' #zField
Es0 @PushWFArc f1 '' #zField
Es0 @RichDialogMethodStart f2 '' #zField
Es0 @PushWFArc f14 '' #zField
>Proto Es0 Es0 EnvironmentCalendarProcess #zField
Es0 f0 guid 1353DB17FFEF12A2 #txt
Es0 f0 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f0 method start() #txt
Es0 f0 disableUIEvents true #txt
Es0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Es0 f0 inParameterMapAction 'out.environment=ivy.wf.getApplication().getActualEnvironment();
' #txt
Es0 f0 outParameterDecl '<> result;
' #txt
Es0 f0 embeddedRdInitializations '* ' #txt
Es0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f0 86 54 20 20 13 0 #rect
Es0 f0 @|RichDialogInitStartIcon #fIcon
Es0 f3 guid 1353DB57BCA5DDD2 #txt
Es0 f3 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f3 method showCalendar(ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Es0 f3 disableUIEvents true #txt
Es0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.restricted.IEnvironment environment> param = methodEvent.getInputArguments();
' #txt
Es0 f3 inParameterMapAction 'out.environment=param.environment;
' #txt
Es0 f3 outParameterDecl '<> result;
' #txt
Es0 f3 embeddedRdInitializations '* ' #txt
Es0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showCalendar(IEnvironment)</name>
        <nameStyle>26,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f3 190 54 20 20 13 0 #rect
Es0 f3 @|RichDialogInitStartIcon #fIcon
Es0 f5 guid 1353DB5FB1AD68E2 #txt
Es0 f5 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData out;
' #txt
Es0 f5 actionTable 'out=in;
' #txt
Es0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save</name>
        <nameStyle>4,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f5 454 54 20 20 13 0 #rect
Es0 f5 @|RichDialogProcessStartIcon #fIcon
Es0 f6 guid 1353DB61F4098C12 #txt
Es0 f6 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData out;
' #txt
Es0 f6 actionTable 'out=in;
' #txt
Es0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f6 390 54 20 20 13 0 #rect
Es0 f6 @|RichDialogProcessStartIcon #fIcon
Es0 f7 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f7 454 230 20 20 13 0 #rect
Es0 f7 @|RichDialogProcessEndIcon #fIcon
Es0 f9 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f9 190 230 20 20 13 0 #rect
Es0 f9 @|RichDialogProcessEndIcon #fIcon
Es0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData out;
' #txt
Es0 f12 actionTable 'out=in;
' #txt
Es0 f12 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendar;

IBusinessCalendarSettings settings = in.environment.getApplication().getBusinessCalendarSettings();
String calendarName = (in.selectedCalendar as IBusinessCalendarConfiguration).getName();
IBusinessCalendar calendar = in.environment.getBusinessCalendar().get(calendarName);
in.environment.setBusinessCalendar(calendar);
' #txt
Es0 f12 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set selected Calendar
on Environment</name>
        <nameStyle>22,7
14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f12 446 132 36 24 21 -15 #rect
Es0 f12 @|RichDialogProcessStepIcon #fIcon
Es0 f16 expr out #txt
Es0 f16 464 74 464 132 #arcP
Es0 f17 expr out #txt
Es0 f17 464 156 464 230 #arcP
Es0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData out;
' #txt
Es0 f10 actionTable 'out=in;
' #txt
Es0 f10 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings;
import ch.ivyteam.ivy.application.calendar.IBusinessCalendar;

IBusinessCalendar calendar = in.environment.getBusinessCalendar();
IBusinessCalendarSettings settings = in.environment.getApplication().getBusinessCalendarSettings();
in.selectedCalendar = settings.findBusinessCalendarConfiguration(calendar.getName());
' #txt
Es0 f10 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set Environment Calendar 
as selected</name>
        <nameStyle>37,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f10 182 132 36 24 30 -11 #rect
Es0 f10 @|RichDialogProcessStepIcon #fIcon
Es0 f11 expr out #txt
Es0 f11 200 74 200 132 #arcP
Es0 f4 expr out #txt
Es0 f4 200 156 200 230 #arcP
Es0 f8 expr out #txt
Es0 f8 390 67 218 137 #arcP
Es0 f13 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f13 86 230 20 20 13 0 #rect
Es0 f13 @|RichDialogProcessEndIcon #fIcon
Es0 f1 expr out #txt
Es0 f1 96 74 96 230 #arcP
Es0 f2 guid 13EA2C94224EC108 #txt
Es0 f2 type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
Es0 f2 method setBusinessCalendar(ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Es0 f2 disableUIEvents false #txt
Es0 f2 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.restricted.IEnvironment environment> param = methodEvent.getInputArguments();
' #txt
Es0 f2 inParameterMapAction 'out.environment=param.environment;
' #txt
Es0 f2 outParameterDecl '<> result;
' #txt
Es0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setBusinessCalendar(IEnvironment)</name>
        <nameStyle>33,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f2 278 302 20 20 13 0 #rect
Es0 f2 @|RichDialogMethodStartIcon #fIcon
Es0 f14 expr out #txt
Es0 f14 283 303 206 156 #arcP
>Proto Es0 .ui2RdDataAction 'out.selectedCalendar=panel.calendarComboBox.selectedListEntry;
' #txt
>Proto Es0 .rdData2UIAction 'panel.calendarComboBox.listData=in.environment.getApplication().getBusinessCalendarSettings().getAllBusinessCalendarConfigurationsAsList();
panel.calendarComboBox.selectedListEntry=in.selectedCalendar;
' #txt
>Proto Es0 .type ch.ivyteam.ivy.admin.tool.environment.EnvironmentCalendar.EnvironmentCalendarData #txt
>Proto Es0 .processKind RICH_DIALOG #txt
>Proto Es0 -8 -8 16 16 16 26 #rect
>Proto Es0 '' #fIcon
Es0 f5 mainOut f16 tail #connect
Es0 f16 head f12 mainIn #connect
Es0 f12 mainOut f17 tail #connect
Es0 f17 head f7 mainIn #connect
Es0 f3 mainOut f11 tail #connect
Es0 f11 head f10 mainIn #connect
Es0 f10 mainOut f4 tail #connect
Es0 f4 head f9 mainIn #connect
Es0 f6 mainOut f8 tail #connect
Es0 f8 head f10 mainIn #connect
Es0 f0 mainOut f1 tail #connect
Es0 f1 head f13 mainIn #connect
Es0 f2 mainOut f14 tail #connect
Es0 f14 head f10 mainIn #connect
