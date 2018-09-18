[Ivy]
[>Created: Sat Apr 22 21:39:30 CEST 2017]
15B972D280AE8FD7 3.19 #module
>Proto >Proto Collection #zClass
ss0 showAppointmentProcess Big #zClass
ss0 RD #cInfo
ss0 #process
ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ss0 @TextInP .resExport .resExport #zField
ss0 @TextInP .type .type #zField
ss0 @TextInP .processKind .processKind #zField
ss0 @AnnotationInP-0n ai ai #zField
ss0 @MessageFlowInP-0n messageIn messageIn #zField
ss0 @MessageFlowOutP-0n messageOut messageOut #zField
ss0 @TextInP .xml .xml #zField
ss0 @TextInP .responsibility .responsibility #zField
ss0 @RichDialogInitStart f0 '' #zField
ss0 @RichDialogProcessEnd f1 '' #zField
ss0 @PushWFArc f2 '' #zField
ss0 @RichDialogProcessStart f3 '' #zField
ss0 @RichDialogEnd f4 '' #zField
ss0 @PushWFArc f5 '' #zField
>Proto ss0 ss0 showAppointmentProcess #zField
ss0 f0 guid 15B972D2831B0E34 #txt
ss0 f0 type kips.showAppointment.showAppointmentData #txt
ss0 f0 method start(kips.Data) #txt
ss0 f0 disableUIEvents true #txt
ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Data data> param = methodEvent.getInputArguments();
' #txt
ss0 f0 inParameterMapAction 'out.data=param.data;
' #txt
ss0 f0 outParameterDecl '<> result;
' #txt
ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Data)</name>
    </language>
</elementInfo>
' #txt
ss0 f0 83 51 26 26 -29 15 #rect
ss0 f0 @|RichDialogInitStartIcon #fIcon
ss0 f1 type kips.showAppointment.showAppointmentData #txt
ss0 f1 211 51 26 26 0 12 #rect
ss0 f1 @|RichDialogProcessEndIcon #fIcon
ss0 f2 expr out #txt
ss0 f2 109 64 211 64 #arcP
ss0 f3 guid 15B972D28408D2C5 #txt
ss0 f3 type kips.showAppointment.showAppointmentData #txt
ss0 f3 actionDecl 'kips.showAppointment.showAppointmentData out;
' #txt
ss0 f3 actionTable 'out=in;
' #txt
ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
ss0 f3 83 147 26 26 -15 12 #rect
ss0 f3 @|RichDialogProcessStartIcon #fIcon
ss0 f4 type kips.showAppointment.showAppointmentData #txt
ss0 f4 guid 15B972D2840F5442 #txt
ss0 f4 211 147 26 26 0 12 #rect
ss0 f4 @|RichDialogEndIcon #fIcon
ss0 f5 expr out #txt
ss0 f5 109 160 211 160 #arcP
>Proto ss0 .type kips.showAppointment.showAppointmentData #txt
>Proto ss0 .processKind HTML_DIALOG #txt
>Proto ss0 -8 -8 16 16 16 26 #rect
>Proto ss0 '' #fIcon
ss0 f0 mainOut f2 tail #connect
ss0 f2 head f1 mainIn #connect
ss0 f3 mainOut f5 tail #connect
ss0 f5 head f4 mainIn #connect
