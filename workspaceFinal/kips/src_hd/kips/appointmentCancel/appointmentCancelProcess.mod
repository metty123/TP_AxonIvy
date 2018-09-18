[Ivy]
[>Created: Sat Apr 29 12:05:05 CEST 2017]
15B4D8150B0D2182 3.19 #module
>Proto >Proto Collection #zClass
Ts0 appointmentCancelProcess Big #zClass
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
Ts0 @RichDialogProcessStart f3 '' #zField
Ts0 @RichDialogEnd f7 '' #zField
Ts0 @RichDialogMethodStart f6 '' #zField
Ts0 @PushWFArc f2 '' #zField
Ts0 @GridStep f13 '' #zField
Ts0 @ErrorEnd f12 '' #zField
Ts0 @PushWFArc f4 '' #zField
Ts0 @EMail f17 '' #zField
Ts0 @PushWFArc f5 '' #zField
Ts0 @PushWFArc f10 '' #zField
Ts0 @PushWFArc f8 '' #zField
Ts0 @PushWFArc f14 '' #zField
Ts0 @DBStep f9 '' #zField
>Proto Ts0 Ts0 appointmentCancelProcess #zField
Ts0 f0 guid 15B48B8E7123B4E0 #txt
Ts0 f0 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f0 method start(kips.Data) #txt
Ts0 f0 disableUIEvents true #txt
Ts0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<kips.Data data> param = methodEvent.getInputArguments();
' #txt
Ts0 f0 inParameterMapAction 'out.data=param.data;
' #txt
Ts0 f0 outParameterDecl '<> result;
' #txt
Ts0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Recordset)</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f0 83 51 26 26 -44 15 #rect
Ts0 f0 @|RichDialogInitStartIcon #fIcon
Ts0 f1 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f1 211 51 26 26 0 12 #rect
Ts0 f1 @|RichDialogProcessEndIcon #fIcon
Ts0 f3 guid 015B48B8E71DBA53 #txt
Ts0 f3 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f3 actionDecl 'kips.appointmentCancel.appointmentCancelData out;
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
Ts0 f7 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f7 guid 15B153E242987221 #txt
Ts0 f7 627 244 26 26 0 12 #rect
Ts0 f7 @|RichDialogEndIcon #fIcon
Ts0 f6 guid 15B48BDAD92D7641 #txt
Ts0 f6 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f6 method cancel(Record) #txt
Ts0 f6 disableUIEvents false #txt
Ts0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record appointment> param = methodEvent.getInputArguments();
' #txt
Ts0 f6 inParameterMapAction 'out.data.appointment.appointment=param.appointment;
out.data.appointment.date=param.appointment.getField("Date").toIvyDate();
out.data.appointment.id=param.appointment.getField("AID").toNumber();
' #txt
Ts0 f6 outParameterDecl '<> result;
' #txt
Ts0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel(appointment)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f6 84 245 24 24 -56 14 #rect
Ts0 f6 @|RichDialogMethodStartIcon #fIcon
Ts0 f2 expr out #txt
Ts0 f2 109 64 211 64 #arcP
Ts0 f13 actionDecl 'kips.appointmentCancel.appointmentCancelData out;
' #txt
Ts0 f13 actionTable 'out.data=in.data;
' #txt
Ts0 f13 actionCode 'import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

File a = new File("\\mime-attachment.ics");

String PRODID ="http://www.http://kips.htwg-konstanz.de//";
String ATTENDEEMentor =in.data.user.mentor.eMailAddress;
String ATTENDEEStudent =in.data.user.student.eMailAddress;
String dtstart ="";
String dtend ="";
String summary = in.data.appointment.appointment.getField("Subject").toString();

if(summary.equals("null")){
	summary="appointment";
	}
	
String location = in.data.appointment.appointment.getField("Location").toString();

String Format = in.data.appointment.appointment.getField("date").toIvyDate().format("yyyyMMdd");

//DatenAnpassung VON
dtstart=Format+"T"+in.data.appointment.appointment.getField("start").toString().replaceAll(":", "");

//DatenAnpassung BIS
dtend=Format+"T"+in.data.appointment.appointment.getField("end").toString().replace(":","");



String data = "BEGIN:VCALENDAR\r\n"
+"PRODID:"+PRODID+"\r\n"
+"VERSION:2.0\r\n"
+"CALSCALE:GREGORIAN\r\n"
+"BEGIN:VEVENT\r\n"
+"DTSTART:"+dtstart+"\r\n"
+"DTEND:"+dtend+"\r\n"
+"SUMMARY:"+summary+"\r\n"
+"LOCATION:"+location+"\r\n"
+"PRIORITY:1\r\n"
+"UID:"+dtstart+"@htwg-konstanz.de\r\n"
+"STATUS:CANCELLED\r\n"
+"ATTENDEE:"+ATTENDEEMentor+"\r\n"
+"ATTENDEE:"+ATTENDEEStudent+"\r\n"
+"BEGIN:VALARM\r\n"
+"ACTION:DISPLAY\r\n"
+"END:VALARM\r\n"
+"END:VEVENT\r\n"
+"END:VCALENDAR\r\n";

a.write(data);

in.data.document.file = a;
in.data.document.filePath = a.getAbsolutePath();
in.data.document.fileName = a.getName();' #txt
Ts0 f13 security system #txt
Ts0 f13 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create ics file</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f13 328 235 112 44 -37 -8 #rect
Ts0 f13 @|StepIcon #fIcon
Ts0 f12 errorCode ivy:portalkit:webservice:intergrator:application #txt
Ts0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ivy:portalkit:webservice:intergrator:application</name>
    </language>
</elementInfo>
' #txt
Ts0 f12 217 145 30 30 -123 17 #rect
Ts0 f12 @|ErrorEndIcon #fIcon
Ts0 f4 expr out #txt
Ts0 f4 109 160 217 160 #arcP
Ts0 f17 beanConfig '"{/emailSubject ""appointment canceled""/emailFrom ""<%=in.data.user.Student.eMailAddress%>""/emailReplyTo """"/emailTo ""<%=in.data.user.mentor.eMailAddress%>""/emailCC """"/emailBCC """"/exceptionMissingEmailAttachments ""false""/emailMessage ""Hallo,\\n\\nihr Termin am <%=in.data.appointment.date%> wurde von <%=in.data.user.student.fullName%> abgesagt.\\n\\n\\n\\n""/emailAttachments {""<%=in.data.document.file%>""}}"' #txt
Ts0 f17 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f17 timeout 0 #txt
Ts0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Bestaetigung senden</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f17 465 235 128 44 -59 -8 #rect
Ts0 f17 @|EMailIcon #fIcon
Ts0 f5 expr out #txt
Ts0 f5 440 257 465 257 #arcP
Ts0 f10 expr out #txt
Ts0 f10 593 257 627 257 #arcP
Ts0 f8 expr out #txt
Ts0 f8 108 257 162 257 #arcP
Ts0 f14 expr out #txt
Ts0 f14 306 257 328 257 #arcP
Ts0 f9 actionDecl 'kips.appointmentCancel.appointmentCancelData out;
' #txt
Ts0 f9 actionTable 'out=in;
' #txt
Ts0 f9 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE ANY_SQL SYSTEM  ""sqlStatements.dtd"">
<ANY_SQL><Verbatim quote=''true''>UPDATE appointment
SET Available = &#39;1&#39;, Student = NULL
WHERE AID = in.data.appointment.id</Verbatim></ANY_SQL>' #txt
Ts0 f9 dbUrl kipsDB #txt
Ts0 f9 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Ts0 f9 dbWizard 'UPDATE appointment
SET Available = ''1'', Student = NULL
WHERE AID = in.data.appointment.id' #txt
Ts0 f9 lotSize 2147483647 #txt
Ts0 f9 startIdx 0 #txt
Ts0 f9 type kips.appointmentCancel.appointmentCancelData #txt
Ts0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Appointment cancelation</name>
        <nameStyle>23,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f9 162 235 144 44 -67 -8 #rect
Ts0 f9 @|DBStepIcon #fIcon
>Proto Ts0 .type kips.appointmentCancel.appointmentCancelData #txt
>Proto Ts0 .processKind HTML_DIALOG #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
>Proto Ts0 '' #fIcon
Ts0 f9 mainOut f14 tail #connect
Ts0 f14 head f13 mainIn #connect
Ts0 f0 mainOut f2 tail #connect
Ts0 f2 head f1 mainIn #connect
Ts0 f3 mainOut f4 tail #connect
Ts0 f4 head f12 mainIn #connect
Ts0 f13 mainOut f5 tail #connect
Ts0 f5 head f17 mainIn #connect
Ts0 f17 mainOut f10 tail #connect
Ts0 f10 head f7 mainIn #connect
Ts0 f6 mainOut f8 tail #connect
Ts0 f8 head f9 mainIn #connect
