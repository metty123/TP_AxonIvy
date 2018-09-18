[Ivy]
[>Created: Thu Jan 24 14:52:01 CET 2013]
11781E91A7C404D9 3.17 #module
>Proto >Proto Collection #zClass
Ds0 DayTimeFieldProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogMethodStart f6 '' #zField
Ds0 @RichDialogMethodStart f7 '' #zField
Ds0 @RichDialogProcessEnd f3 '' #zField
Ds0 @RichDialogProcessEnd f4 '' #zField
Ds0 @PushWFArc f5 '' #zField
Ds0 @PushWFArc f8 '' #zField
Ds0 @RichDialogInitStart f9 '' #zField
Ds0 @RichDialogProcessEnd f10 '' #zField
Ds0 @PushWFArc f11 '' #zField
>Proto Ds0 Ds0 DayTimeFieldProcess #zField
Ds0 f0 guid 11781ECF8EEFB57F #txt
Ds0 f0 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f0 method start() #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inActionCode 'import java.util.Calendar;

Calendar calendar = Calendar.getInstance();

out.hour= calendar.get(Calendar.HOUR_OF_DAY);
out.minute= calendar.get(Calendar.MINUTE);' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 embeddedRdInitializations '* ' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f0 46 46 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f1 43 123 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 56 66 56 123 #arcP
Ds0 f6 guid 11781EEB3712B0CF #txt
Ds0 f6 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f6 method getDayTime() #txt
Ds0 f6 disableUIEvents false #txt
Ds0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f6 outParameterDecl '<java.lang.Number dayTime> result;
' #txt
Ds0 f6 outParameterMapAction 'result.dayTime=in.minute*1000*60+in.hour*1000*60*60;
' #txt
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getDayTime()</name>
        <nameStyle>12,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f6 382 46 20 20 13 0 #rect
Ds0 f6 @|RichDialogMethodStartIcon #fIcon
Ds0 f7 guid 11781EEBEA8EB5D2 #txt
Ds0 f7 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f7 method setDayTime(Number) #txt
Ds0 f7 disableUIEvents false #txt
Ds0 f7 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Number dayTime> param = methodEvent.getInputArguments();
' #txt
Ds0 f7 inActionCode 'int minutes = (param.dayTime / 1000 / 60) % 60;
out.minute = minutes;
int hours = param.dayTime - minutes * 60 * 1000;
out.hour = hours / 1000 / 60 / 60;' #txt
Ds0 f7 outParameterDecl '<> result;
' #txt
Ds0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDayTime(Number)</name>
        <nameStyle>18,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f7 238 46 20 20 13 0 #rect
Ds0 f7 @|RichDialogMethodStartIcon #fIcon
Ds0 f3 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f3 235 123 26 26 14 0 #rect
Ds0 f3 @|RichDialogProcessEndIcon #fIcon
Ds0 f4 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f4 379 123 26 26 14 0 #rect
Ds0 f4 @|RichDialogProcessEndIcon #fIcon
Ds0 f5 expr out #txt
Ds0 f5 392 66 392 123 #arcP
Ds0 f8 expr out #txt
Ds0 f8 248 66 248 123 #arcP
Ds0 f9 guid 1187977C24BA5055 #txt
Ds0 f9 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f9 method start(Number) #txt
Ds0 f9 disableUIEvents false #txt
Ds0 f9 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Number value> param = methodEvent.getInputArguments();
' #txt
Ds0 f9 inActionCode 'int minutes = (param.value / 1000 / 60) % 60;
out.minute = minutes;
int hours = param.value- minutes * 60 * 1000;
out.hour = hours / 1000 / 60 / 60;' #txt
Ds0 f9 outParameterDecl '<> result;
' #txt
Ds0 f9 embeddedRdInitializations '* ' #txt
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Number)</name>
        <nameStyle>13,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f9 134 46 20 20 13 0 #rect
Ds0 f9 @|RichDialogInitStartIcon #fIcon
Ds0 f10 type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
Ds0 f10 131 123 26 26 14 0 #rect
Ds0 f10 @|RichDialogProcessEndIcon #fIcon
Ds0 f11 expr out #txt
Ds0 f11 144 66 144 123 #arcP
>Proto Ds0 .type ch.ivyteam.rd.common.DayTimeField.DayTimeFieldData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 .ui2RdDataAction 'out.minute=panel.minuteTextField.value as Number;
out.hour=panel.hourTextField.value as Number;
' #txt
>Proto Ds0 .rdData2UIAction 'panel.hourTextField.value=in.hour;
panel.minuteTextField.value=in.minute;
' #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f6 mainOut f5 tail #connect
Ds0 f5 head f4 mainIn #connect
Ds0 f7 mainOut f8 tail #connect
Ds0 f8 head f3 mainIn #connect
Ds0 f9 mainOut f11 tail #connect
Ds0 f11 head f10 mainIn #connect
