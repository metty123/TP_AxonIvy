[Ivy]
[>Created: Fri Jun 09 15:23:26 CEST 2017]
15B4D7B0656FBE8C 3.20 #module
>Proto >Proto Collection #zClass
cs0 appointmentOfferCheckProcess Big #zClass
cs0 RD #cInfo
cs0 #process
cs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
cs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
cs0 @TextInP .resExport .resExport #zField
cs0 @TextInP .type .type #zField
cs0 @TextInP .processKind .processKind #zField
cs0 @AnnotationInP-0n ai ai #zField
cs0 @MessageFlowInP-0n messageIn messageIn #zField
cs0 @MessageFlowOutP-0n messageOut messageOut #zField
cs0 @TextInP .xml .xml #zField
cs0 @TextInP .responsibility .responsibility #zField
cs0 @RichDialogInitStart f0 '' #zField
cs0 @RichDialogProcessEnd f1 '' #zField
cs0 @PushWFArc f2 '' #zField
cs0 @RichDialogProcessStart f3 '' #zField
cs0 @RichDialogEnd f4 '' #zField
cs0 @RichDialogProcessStart f6 '' #zField
cs0 @RichDialogEnd f7 '' #zField
cs0 @PushWFArc f5 '' #zField
cs0 @PushWFArc f8 '' #zField
>Proto cs0 cs0 appointmentOfferCheckProcess #zField
cs0 f0 guid 15A8FB2B2EA9586E #txt
cs0 f0 type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
cs0 f0 method start(kips.Appointment,kips.User) #txt
cs0 f0 disableUIEvents true #txt
cs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Appointment appointment,kips.User user> param = methodEvent.getInputArguments();
' #txt
cs0 f0 inParameterMapAction 'out.data.appointment=param.appointment;
out.data.user=param.user;
' #txt
cs0 f0 outParameterDecl '<kips.Appointment appointment,kips.User user> result;
' #txt
cs0 f0 outParameterMapAction 'result.appointment.available=in.data.appointment.available;
result.user=in.data.user;
' #txt
cs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(appointment)</name>
        <nameStyle>18,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
cs0 f0 195 59 26 26 -50 15 #rect
cs0 f0 @|RichDialogInitStartIcon #fIcon
cs0 f1 type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
cs0 f1 323 59 26 26 0 12 #rect
cs0 f1 @|RichDialogProcessEndIcon #fIcon
cs0 f2 expr out #txt
cs0 f2 221 72 323 72 #arcP
cs0 f3 guid 15A8FB2B2F115656 #txt
cs0 f3 type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
cs0 f3 actionDecl 'kips.appointmentOfferCheck.appointmentOfferCheckData out;
' #txt
cs0 f3 actionTable 'out=in;
out.data.appointment.available=in.data.appointment.available=false;
' #txt
cs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>closeFalse</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
cs0 f3 195 155 26 26 -30 15 #rect
cs0 f3 @|RichDialogProcessStartIcon #fIcon
cs0 f4 type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
cs0 f4 guid 15A8FB2B2F183149 #txt
cs0 f4 323 155 26 26 0 12 #rect
cs0 f4 @|RichDialogEndIcon #fIcon
cs0 f6 guid 15A9903B00F6BBAB #txt
cs0 f6 type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
cs0 f6 actionDecl 'kips.appointmentOfferCheck.appointmentOfferCheckData out;
' #txt
cs0 f6 actionTable 'out.data.appointment.available=in.data.appointment.available=true;
' #txt
cs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>closeTrue</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
cs0 f6 190 223 26 26 -27 15 #rect
cs0 f6 @|RichDialogProcessStartIcon #fIcon
cs0 f7 type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
cs0 f7 guid 15A8FB2B2F183149 #txt
cs0 f7 318 223 26 26 0 12 #rect
cs0 f7 @|RichDialogEndIcon #fIcon
cs0 f5 expr out #txt
cs0 f5 221 168 323 168 #arcP
cs0 f8 expr out #txt
cs0 f8 216 236 318 236 #arcP
cs0 f8 0 0.5000000000000001 0 0 #arcLabel
>Proto cs0 .type kips.appointmentOfferCheck.appointmentOfferCheckData #txt
>Proto cs0 .processKind HTML_DIALOG #txt
>Proto cs0 -8 -8 16 16 16 26 #rect
>Proto cs0 '' #fIcon
cs0 f0 mainOut f2 tail #connect
cs0 f2 head f1 mainIn #connect
cs0 f3 mainOut f5 tail #connect
cs0 f5 head f4 mainIn #connect
cs0 f6 mainOut f8 tail #connect
cs0 f8 head f7 mainIn #connect
