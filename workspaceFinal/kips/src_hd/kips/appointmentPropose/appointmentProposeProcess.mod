[Ivy]
[>Created: Mon Apr 24 14:24:59 CEST 2017]
15B4D821A2530ACF 3.19 #module
>Proto >Proto Collection #zClass
Ts0 appointmentProposeProcess Big #zClass
Ts0 RD #cInfo
Ts0 #process
Ts0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ts0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ts0 @TextInP .resExport .resExport #zField
Ts0 @TextInP .type .type #zField
Ts0 @TextInP .processKind .processKind #zField
Ts0 @AnnotationInP-0n ai ai #zField
Ts0 @MessageFlowInP-0n messageIn messageIn #zField
Ts0 @MessageFlowOutP-0n messageOut messageOut #zField
Ts0 @TextInP .xml .xml #zField
Ts0 @TextInP .responsibility .responsibility #zField
Ts0 @RichDialogInitStart f0 '' #zField
Ts0 @RichDialogProcessEnd f1 '' #zField
Ts0 @PushWFArc f2 '' #zField
Ts0 @RichDialogProcessStart f3 '' #zField
Ts0 @RichDialogEnd f4 '' #zField
Ts0 @PushWFArc f5 '' #zField
>Proto Ts0 Ts0 appointmentProposeProcess #zField
Ts0 f0 guid 15A8FC5F458CBB39 #txt
Ts0 f0 type kips.appointmentPropose.appointmentProposeData #txt
Ts0 f0 method start(String) #txt
Ts0 f0 disableUIEvents true #txt
Ts0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String mentorFullName> param = methodEvent.getInputArguments();
' #txt
Ts0 f0 inParameterMapAction 'out.data.user.MentoFullName=param.mentorFullName;
' #txt
Ts0 f0 outParameterDecl '<kips.Appointment appointment> result;
' #txt
Ts0 f0 outParameterMapAction 'result.appointment.date=in.data.appointment.date;
result.appointment.end=in.data.appointment.end;
result.appointment.location=in.data.appointment.location;
result.appointment.Mentor=in.data.appointment.Mentor;
result.appointment.start=in.data.appointment.start;
result.appointment.subject=in.data.appointment.subject;
' #txt
Ts0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f0 83 51 26 26 -16 15 #rect
Ts0 f0 @|RichDialogInitStartIcon #fIcon
Ts0 f1 type kips.appointmentPropose.appointmentProposeData #txt
Ts0 f1 211 51 26 26 0 12 #rect
Ts0 f1 @|RichDialogProcessEndIcon #fIcon
Ts0 f2 expr out #txt
Ts0 f2 109 64 211 64 #arcP
Ts0 f3 guid 15A8FC5F460DB4D1 #txt
Ts0 f3 type kips.appointmentPropose.appointmentProposeData #txt
Ts0 f3 actionDecl 'kips.appointmentPropose.appointmentProposeData out;
' #txt
Ts0 f3 actionTable 'out=in;
' #txt
Ts0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
Ts0 f3 83 147 26 26 -15 12 #rect
Ts0 f3 @|RichDialogProcessStartIcon #fIcon
Ts0 f4 type kips.appointmentPropose.appointmentProposeData #txt
Ts0 f4 guid 15A8FC5F460F5926 #txt
Ts0 f4 211 147 26 26 0 12 #rect
Ts0 f4 @|RichDialogEndIcon #fIcon
Ts0 f5 expr out #txt
Ts0 f5 109 160 211 160 #arcP
>Proto Ts0 .type kips.appointmentPropose.appointmentProposeData #txt
>Proto Ts0 .processKind HTML_DIALOG #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
>Proto Ts0 '' #fIcon
Ts0 f0 mainOut f2 tail #connect
Ts0 f2 head f1 mainIn #connect
Ts0 f3 mainOut f5 tail #connect
Ts0 f5 head f4 mainIn #connect
