[Ivy]
[>Created: Fri Jun 09 15:22:25 CEST 2017]
15B4D7C2188AF4EB 3.20 #module
>Proto >Proto Collection #zClass
ns0 appointmentNewProposeProcess Big #zClass
ns0 RD #cInfo
ns0 #process
ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ns0 @TextInP .resExport .resExport #zField
ns0 @TextInP .type .type #zField
ns0 @TextInP .processKind .processKind #zField
ns0 @AnnotationInP-0n ai ai #zField
ns0 @MessageFlowInP-0n messageIn messageIn #zField
ns0 @MessageFlowOutP-0n messageOut messageOut #zField
ns0 @TextInP .xml .xml #zField
ns0 @TextInP .responsibility .responsibility #zField
ns0 @RichDialogInitStart f0 '' #zField
ns0 @RichDialogProcessEnd f1 '' #zField
ns0 @PushWFArc f2 '' #zField
ns0 @RichDialogProcessStart f3 '' #zField
ns0 @RichDialogEnd f4 '' #zField
ns0 @PushWFArc f5 '' #zField
>Proto ns0 ns0 appointmentNewProposeProcess #zField
ns0 f0 guid 15A8FC545AF14043 #txt
ns0 f0 type kips.appointmentNewPropose.appointmentNewProposeData #txt
ns0 f0 method start(kips.Appointment,kips.User) #txt
ns0 f0 disableUIEvents true #txt
ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Appointment appointment,kips.User user> param = methodEvent.getInputArguments();
' #txt
ns0 f0 inParameterMapAction 'out.data.appointment=param.appointment;
out.data.user=param.user;
' #txt
ns0 f0 outParameterDecl '<kips.Appointment appointment,kips.User user> result;
' #txt
ns0 f0 outParameterMapAction 'result.appointment=in.data.appointment;
result.user=in.data.user;
' #txt
ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(appointment)</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f0 132 52 24 24 -50 15 #rect
ns0 f0 @|RichDialogInitStartIcon #fIcon
ns0 f1 type kips.appointmentNewPropose.appointmentNewProposeData #txt
ns0 f1 259 51 26 26 0 12 #rect
ns0 f1 @|RichDialogProcessEndIcon #fIcon
ns0 f2 expr out #txt
ns0 f2 156 64 259 64 #arcP
ns0 f3 guid 15A8FC545B6F4C06 #txt
ns0 f3 type kips.appointmentNewPropose.appointmentNewProposeData #txt
ns0 f3 actionDecl 'kips.appointmentNewPropose.appointmentNewProposeData out;
' #txt
ns0 f3 actionTable 'out=in;
' #txt
ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ns0 f3 131 139 26 26 -15 15 #rect
ns0 f3 @|RichDialogProcessStartIcon #fIcon
ns0 f4 type kips.appointmentNewPropose.appointmentNewProposeData #txt
ns0 f4 guid 15A8FC545B79160D #txt
ns0 f4 259 139 26 26 0 12 #rect
ns0 f4 @|RichDialogEndIcon #fIcon
ns0 f5 expr out #txt
ns0 f5 157 152 259 152 #arcP
>Proto ns0 .type kips.appointmentNewPropose.appointmentNewProposeData #txt
>Proto ns0 .processKind HTML_DIALOG #txt
>Proto ns0 -8 -8 16 16 16 26 #rect
>Proto ns0 '' #fIcon
ns0 f0 mainOut f2 tail #connect
ns0 f2 head f1 mainIn #connect
ns0 f3 mainOut f5 tail #connect
ns0 f5 head f4 mainIn #connect
