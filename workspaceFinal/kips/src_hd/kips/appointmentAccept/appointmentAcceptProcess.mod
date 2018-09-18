[Ivy]
[>Created: Fri Apr 28 16:05:56 CEST 2017]
15B4D7FEE56BCB92 3.19 #module
>Proto >Proto Collection #zClass
Ts0 appointmentAcceptProcess Big #zClass
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
Ts0 @RichDialogMethodStart f6 '' #zField
Ts0 @RichDialogEnd f7 '' #zField
Ts0 @DBStep f9 '' #zField
Ts0 @PushWFArc f5 '' #zField
Ts0 @PushWFArc f12 '' #zField
Ts0 @EMail f11 '' #zField
Ts0 @GridStep f13 '' #zField
Ts0 @PushWFArc f10 '' #zField
Ts0 @PushWFArc f14 '' #zField
Ts0 @GridStep f15 '' #zField
Ts0 @PushWFArc f8 '' #zField
Ts0 @PushWFArc f16 '' #zField
>Proto Ts0 Ts0 appointmentAcceptProcess #zField
Ts0 f0 guid 15AFB0A7DC7FC44F #txt
Ts0 f0 type kips.appointmentAccept.appointmentAcceptData #txt
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
Ts0 f1 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f1 211 51 26 26 0 12 #rect
Ts0 f1 @|RichDialogProcessEndIcon #fIcon
Ts0 f2 expr out #txt
Ts0 f2 109 64 211 64 #arcP
Ts0 f3 guid 15AFB0A7DCE1601A #txt
Ts0 f3 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f3 actionDecl 'kips.appointmentAccept.appointmentAcceptData out;
' #txt
Ts0 f3 actionTable 'out=in;
' #txt
Ts0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f3 83 147 26 26 -15 15 #rect
Ts0 f3 @|RichDialogProcessStartIcon #fIcon
Ts0 f4 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f4 guid 15AFB0A7DCEEE0BB #txt
Ts0 f4 211 147 26 26 0 12 #rect
Ts0 f4 @|RichDialogEndIcon #fIcon
Ts0 f6 guid 15B151F3CBCA0122 #txt
Ts0 f6 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f6 method booking(Record) #txt
Ts0 f6 disableUIEvents false #txt
Ts0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.scripting.objects.Record appointment> param = methodEvent.getInputArguments();
' #txt
Ts0 f6 inParameterMapAction 'out.data.appointment.appointment=param.appointment;
out.data.appointment.id=param.appointment.getField("AID").toNumber();
' #txt
Ts0 f6 outParameterDecl '<> result;
' #txt
Ts0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>booking(appointment)</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f6 84 244 24 24 -60 14 #rect
Ts0 f6 @|RichDialogMethodStartIcon #fIcon
Ts0 f7 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f7 guid 15B153E242987221 #txt
Ts0 f7 851 243 26 26 0 12 #rect
Ts0 f7 @|RichDialogEndIcon #fIcon
Ts0 f9 actionDecl 'kips.appointmentAccept.appointmentAcceptData out;
' #txt
Ts0 f9 actionTable 'out=in;
out.data.appointment.appointment=in.data.appointment.appointment;
out.data.user=in.data.user;
' #txt
Ts0 f9 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE UPDATE SYSTEM  ""sqlStatements.dtd"">
<UPDATE><Table name=''appointment''/><Value column=''Available''><String>0</String></Value><Value column=''Student''><AnyExpression>in.data.user.studentUsername</AnyExpression></Value><Condition><Relation kind=''=''><Column name=''AID''/><AnyExpression>in.data.appointment.id</AnyExpression></Relation></Condition></UPDATE>' #txt
Ts0 f9 dbUrl kipsDB #txt
Ts0 f9 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Ts0 f9 dbWizard AID=in.data.appointment.id #txt
Ts0 f9 lotSize 2147483647 #txt
Ts0 f9 startIdx 0 #txt
Ts0 f9 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update appointment</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f9 360 234 128 44 -55 -8 #rect
Ts0 f9 @|DBStepIcon #fIcon
Ts0 f5 expr out #txt
Ts0 f5 109 160 211 160 #arcP
Ts0 f12 expr out #txt
Ts0 f12 800 256 851 256 #arcP
Ts0 f11 beanConfig '"{/emailSubject ""appointment booked""/emailFrom ""<%=in.data.user.student.eMailAddress%>""/emailReplyTo """"/emailTo ""<%=in.data.user.mentor.eMailAddress%>""/emailCC """"/emailBCC """"/exceptionMissingEmailAttachments ""false""/emailMessage ""Confirmation appointment with <%=in.data.user.mentor.fullName%> and <%=in.data.user.student.fullName%>\\n\\nIn the appendix you can find the ics file to synchronize with your local calendar.\\n""/emailAttachments {""<%=in.data.document.file%>""}}"' #txt
Ts0 f11 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f11 timeout 0 #txt
Ts0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>confirmation to Student</name>
        <nameStyle>23,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f11 656 234 144 44 -63 -8 #rect
Ts0 f11 @|EMailIcon #fIcon
Ts0 f13 actionDecl 'kips.appointmentAccept.appointmentAcceptData out;
' #txt
Ts0 f13 actionTable 'out=in;
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
+"STATUS:CONFIRMED\r\n"
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
Ts0 f13 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create ics file</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f13 520 234 112 44 -37 -8 #rect
Ts0 f13 @|StepIcon #fIcon
Ts0 f10 expr out #txt
Ts0 f10 488 256 520 256 #arcP
Ts0 f14 expr out #txt
Ts0 f14 632 256 656 256 #arcP
Ts0 f15 actionDecl 'kips.appointmentAccept.appointmentAcceptData out;
' #txt
Ts0 f15 actionTable 'out=in;
' #txt
Ts0 f15 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;


ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write Student to DataClasses
in.data.user.student = securityContext.getCurrentSession().getSessionUser();
in.data.user.studentUsername=in.data.user.student.getName();

//find and write Mentor to DataClasses
in.data.user.mentor = securityContext.findUser(in.data.user.student.getProperty("Mentor"));
in.data.user.mentorUsername=in.data.user.mentor.getName();
' #txt
Ts0 f15 security system #txt
Ts0 f15 type kips.appointmentAccept.appointmentAcceptData #txt
Ts0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f15 197 234 112 44 -32 -8 #rect
Ts0 f15 @|StepIcon #fIcon
Ts0 f8 expr out #txt
Ts0 f8 108 256 197 256 #arcP
Ts0 f16 expr out #txt
Ts0 f16 309 256 360 256 #arcP
>Proto Ts0 .type kips.appointmentAccept.appointmentAcceptData #txt
>Proto Ts0 .processKind HTML_DIALOG #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
>Proto Ts0 '' #fIcon
Ts0 f0 mainOut f2 tail #connect
Ts0 f2 head f1 mainIn #connect
Ts0 f3 mainOut f5 tail #connect
Ts0 f5 head f4 mainIn #connect
Ts0 f11 mainOut f12 tail #connect
Ts0 f12 head f7 mainIn #connect
Ts0 f9 mainOut f10 tail #connect
Ts0 f10 head f13 mainIn #connect
Ts0 f13 mainOut f14 tail #connect
Ts0 f14 head f11 mainIn #connect
Ts0 f6 mainOut f8 tail #connect
Ts0 f8 head f15 mainIn #connect
Ts0 f15 mainOut f16 tail #connect
Ts0 f16 head f9 mainIn #connect
