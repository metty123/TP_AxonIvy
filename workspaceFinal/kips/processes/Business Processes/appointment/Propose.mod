[Ivy]
[>Created: Mon Jun 19 15:35:30 CEST 2017]
15B4D789C5EBA55C 3.20 #module
>Proto >Proto Collection #zClass
tg0 Propose Big #zClass
tg0 B #cInfo
tg0 #process
tg0 @TextInP .resExport .resExport #zField
tg0 @TextInP .type .type #zField
tg0 @TextInP .processKind .processKind #zField
tg0 @AnnotationInP-0n ai ai #zField
tg0 @MessageFlowInP-0n messageIn messageIn #zField
tg0 @MessageFlowOutP-0n messageOut messageOut #zField
tg0 @TextInP .xml .xml #zField
tg0 @TextInP .responsibility .responsibility #zField
tg0 @StartRequest f0 '' #zField
tg0 @UserTask f4 '' #zField
tg0 @Alternative f10 '' #zField
tg0 @PushWFArc f11 '' #zField
tg0 @RichDialog f2 '' #zField
tg0 @EndTask f1 '' #zField
tg0 @TkArc f9 '' #zField
tg0 @DBStep f6 '' #zField
tg0 @PushWFArc f7 '' #zField
tg0 @GridStep f18 '' #zField
tg0 @TkArc f14 '' #zField
tg0 @TkArc f5 '' #zField
tg0 @UserTask f3 '' #zField
tg0 @PushWFArc f12 '' #zField
tg0 @PushWFArc f19 '' #zField
tg0 @GridStep f20 '' #zField
tg0 @PushWFArc f13 '' #zField
tg0 @EMail f15 '' #zField
tg0 @PushWFArc f8 '' #zField
tg0 @PushWFArc f16 '' #zField
>Proto tg0 tg0 Propose #zField
tg0 f0 outLink start.ivp #txt
tg0 f0 type kips.Data #txt
tg0 f0 inParamDecl '<> param;' #txt
tg0 f0 actionDecl 'kips.Data out;
' #txt
tg0 f0 guid 15A8F9D6537BEFE2 #txt
tg0 f0 requestEnabled true #txt
tg0 f0 triggerEnabled false #txt
tg0 f0 callSignature start() #txt
tg0 f0 persist false #txt
tg0 f0 startName 'Schedule an Appointment' #txt
tg0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
tg0 f0 caseData businessCase.attach=true #txt
tg0 f0 showInStartList 1 #txt
tg0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f0 @C|.responsibility Student #txt
tg0 f0 81 97 30 30 -21 17 #rect
tg0 f0 @|StartRequestIcon #fIcon
tg0 f4 richDialogId kips.appointmentOfferCheck #txt
tg0 f4 startMethod start(kips.Appointment,kips.User) #txt
tg0 f4 requestActionDecl '<kips.Appointment appointment, kips.User user> param;' #txt
tg0 f4 requestMappingAction 'param.appointment=in.appointment;
param.user=in.user;
' #txt
tg0 f4 responseActionDecl 'kips.Data out;
' #txt
tg0 f4 responseMappingAction 'out=in;
out.appointment.available=result.appointment.available;
' #txt
tg0 f4 outLinks "TaskA.ivp" #txt
tg0 f4 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=Termin pr\u00FCfen
TaskA.PRI=2
TaskA.ROL=in.user.mentorUsername
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
tg0 f4 type kips.Data #txt
tg0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Check offer</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f4 336 514 112 44 -31 -8 #rect
tg0 f4 @|UserTaskIcon #fIcon
tg0 f10 type kips.Data #txt
tg0 f10 488 520 32 32 0 16 #rect
tg0 f10 @|AlternativeIcon #fIcon
tg0 f11 expr data #txt
tg0 f11 outCond ivp=="TaskA.ivp" #txt
tg0 f11 448 536 488 536 #arcP
tg0 f2 targetWindow NEW #txt
tg0 f2 targetDisplay TOP #txt
tg0 f2 richDialogId kips.appointmentPropose #txt
tg0 f2 startMethod start(String) #txt
tg0 f2 type kips.Data #txt
tg0 f2 requestActionDecl '<String mentorFullName> param;' #txt
tg0 f2 requestMappingAction 'param.mentorFullName=in.user.MentoFullName;
' #txt
tg0 f2 responseActionDecl 'kips.Data out;
' #txt
tg0 f2 responseMappingAction 'out=in;
out.appointment=result.appointment;
out.appointment.Student=ivy.case.getBusinessCreatorUser();
' #txt
tg0 f2 isAsynch false #txt
tg0 f2 isInnerRd false #txt
tg0 f2 userContext '* ' #txt
tg0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Propose appointment</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f2 136 90 128 44 -59 -8 #rect
tg0 f2 @|RichDialogIcon #fIcon
tg0 f1 type kips.Data #txt
tg0 f1 937 313 30 30 0 15 #rect
tg0 f1 @|EndIcon #fIcon
tg0 f9 expr out #txt
tg0 f9 type kips.Data #txt
tg0 f9 var in2 #txt
tg0 f9 264 112 336 536 #arcP
tg0 f9 1 288 112 #addKink
tg0 f9 2 288 536 #addKink
tg0 f9 1 0.9233346260121525 0 0 #arcLabel
tg0 f6 actionDecl 'kips.Data out;
' #txt
tg0 f6 actionTable 'out=in;
' #txt
tg0 f6 actionCode '//in.user.id = ivy.case.getCreatorUser().getId();' #txt
tg0 f6 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE INSERT SYSTEM  ""sqlStatements.dtd"">
<INSERT><Table name=''appointment''/><Value column=''Date''><AnyExpression>in.appointment.date</AnyExpression></Value><Value column=''Start''><AnyExpression>in.appointment.start.format(""HH:mm"")</AnyExpression></Value><Value column=''End''><AnyExpression>in.appointment.end.format(""HH:mm"")</AnyExpression></Value><Value column=''Subject''><AnyExpression>in.appointment.subject</AnyExpression></Value><Value column=''Available''><String>0</String></Value><Value column=''Location''><AnyExpression>in.appointment.location</AnyExpression></Value><Value column=''Student''><AnyExpression>in.user.studentUsername</AnyExpression></Value><Value column=''Mentor''><AnyExpression>in.user.mentorUsername</AnyExpression></Value></INSERT>' #txt
tg0 f6 dbUrl kipsDB #txt
tg0 f6 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
tg0 f6 lotSize 2147483647 #txt
tg0 f6 startIdx 0 #txt
tg0 f6 type kips.Data #txt
tg0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create appointment</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f6 520 306 128 44 -54 -8 #rect
tg0 f6 @|DBStepIcon #fIcon
tg0 f7 expr in #txt
tg0 f7 520 536 584 350 #arcP
tg0 f7 1 584 536 #addKink
tg0 f7 1 0.29275806248579717 0 0 #arcLabel
tg0 f18 actionDecl 'kips.Data out;
' #txt
tg0 f18 actionTable 'out=in;
' #txt
tg0 f18 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;


ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write Student to DataClasses
in.user.student = securityContext.getCurrentSession().getSessionUser();
in.user.studentUsername=in.user.student.getName();
in.user.StudentFullName = in.user.student.getFullName();
in.user.studentMail=in.user.student.getEMailAddress();

//find and write Mentor to DataClasses
in.user.mentor = securityContext.findUser(in.user.student.getProperty("Mentor"));
in.user.mentorUsername=in.user.mentor.getName();
in.user.MentoFullName=in.user.mentor.getFullName();
in.user.mentorMail=in.user.mentor.getEMailAddress();' #txt
tg0 f18 security system #txt
tg0 f18 type kips.Data #txt
tg0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f18 144 306 112 44 -32 -8 #rect
tg0 f18 @|StepIcon #fIcon
tg0 f14 expr in #txt
tg0 f14 outCond in.appointment.available==false #txt
tg0 f14 type kips.Data #txt
tg0 f14 var in1 #txt
tg0 f14 504 520 472 112 #arcP
tg0 f14 1 504 112 #addKink
tg0 f14 1 0.14071677800517807 0 0 #arcLabel
tg0 f5 expr data #txt
tg0 f5 outCond ivp=="TaskA.ivp" #txt
tg0 f5 type kips.Data #txt
tg0 f5 var in1 #txt
tg0 f5 392 134 392 514 #arcP
tg0 f5 0 0.22274885532708733 0 0 #arcLabel
tg0 f3 richDialogId kips.appointmentNewPropose #txt
tg0 f3 startMethod start(kips.Appointment,kips.User) #txt
tg0 f3 requestActionDecl '<kips.Appointment appointment, kips.User user> param;' #txt
tg0 f3 requestMappingAction 'param.appointment=in.appointment;
param.user=in.user;
' #txt
tg0 f3 responseActionDecl 'kips.Data out;
' #txt
tg0 f3 responseMappingAction 'out=in;
out.appointment=result.appointment;
out.user=result.user;
' #txt
tg0 f3 outLinks "TaskA.ivp" #txt
tg0 f3 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=Neuen Terminvorschlag
TaskA.PRI=2
TaskA.ROL=ivy.case.getCreatorUserName()
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
tg0 f3 type kips.Data #txt
tg0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Propose new appointment</name>
        <nameStyle>23,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f3 312 90 160 44 -72 -8 #rect
tg0 f3 @|UserTaskIcon #fIcon
tg0 f12 expr out #txt
tg0 f12 96 127 144 328 #arcP
tg0 f12 1 96 328 #addKink
tg0 f12 0 0.9653559313440347 0 0 #arcLabel
tg0 f19 expr out #txt
tg0 f19 200 306 200 134 #arcP
tg0 f20 actionDecl 'kips.Data out;
' #txt
tg0 f20 actionTable 'out=in;
' #txt
tg0 f20 actionCode 'import java.text.SimpleDateFormat;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

File a = new File("\\mime-attachment.ics");

String PRODID ="http://www.http://kips.htwg-konstanz.de//";
String ATTENDEEMentor =in.user.mentorMail;
String ATTENDEEStudent =in.user.studentMail;
String dtstart ="";
String dtend ="";
String summary = in.appointment.subject;

if(summary.equals("null")){
	summary="appointment";
	}
	
String location = in.appointment.location;

String Format = in.appointment.date.toIvyDate().format("yyyyMMdd");

//DatenAnpassung VON
dtstart=Format+"T"+in.appointment.start.toString().replaceAll(":", "");

//DatenAnpassung BIS
dtend=Format+"T"+in.appointment.end.toString().replace(":","");



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
+"STATUS:TENTATIVE\r\n"
+"ATTENDEE:"+ATTENDEEMentor+"\r\n"
+"ATTENDEE:"+ATTENDEEStudent+"\r\n"
+"BEGIN:VALARM\r\n"
+"ACTION:DISPLAY\r\n"
+"END:VALARM\r\n"
+"END:VEVENT\r\n"
+"END:VCALENDAR\r\n";

a.write(data);

in.document.file = a;
in.document.filePath = a.getAbsolutePath();
in.document.fileName = a.getName();' #txt
tg0 f20 security system #txt
tg0 f20 type kips.Data #txt
tg0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create ics file</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f20 661 306 112 44 -37 -8 #rect
tg0 f20 @|StepIcon #fIcon
tg0 f13 expr out #txt
tg0 f13 648 328 661 328 #arcP
tg0 f15 beanConfig '"{/emailSubject ""Appointment accepted by <%=in.user.MentoFullName%>""/emailFrom """"/emailReplyTo """"/emailTo ""<%=in.user.mentorMail%>,<%=in.user.studentMail%>""/emailCC """"/emailBCC """"/exceptionMissingEmailAttachments ""true""/emailMessage ""Hallo,\\n\\nihr Termin am <%=in.appointment.date%> ist gebucht.\\n\\nGruß <%=in.user.MentoFullName%>""/emailAttachments {""<%=in.document.file%>""}}"' #txt
tg0 f15 type kips.Data #txt
tg0 f15 timeout 0 #txt
tg0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Bestaetigung senden</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
tg0 f15 792 306 128 44 -59 -8 #rect
tg0 f15 @|EMailIcon #fIcon
tg0 f8 expr out #txt
tg0 f8 773 328 792 328 #arcP
tg0 f16 expr out #txt
tg0 f16 920 328 937 328 #arcP
>Proto tg0 .type kips.Data #txt
>Proto tg0 .processKind NORMAL #txt
>Proto tg0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Terminvereinbarung</swimlaneLabel>
        <swimlaneLabel>Student</swimlaneLabel>
        <swimlaneLabel>Engine</swimlaneLabel>
        <swimlaneLabel>Professor</swimlaneLabel>
    </language>
    <swimlaneOrientation>false</swimlaneOrientation>
    <swimlaneSize>576</swimlaneSize>
    <swimlaneSize>192</swimlaneSize>
    <swimlaneSize>192</swimlaneSize>
    <swimlaneSize>192</swimlaneSize>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneType>POOL</swimlaneType>
    <swimlaneType>LANE_IN_POOL</swimlaneType>
    <swimlaneType>LANE_IN_POOL</swimlaneType>
    <swimlaneType>LANE_IN_POOL</swimlaneType>
    <swimlaneSpaceBefore>32</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
</elementInfo>
' #txt
>Proto tg0 0 0 32 24 18 0 #rect
>Proto tg0 @|BIcon #fIcon
tg0 f3 out f5 tail #connect
tg0 f5 head f4 in #connect
tg0 f4 out f11 tail #connect
tg0 f11 head f10 in #connect
tg0 f10 out f14 tail #connect
tg0 f14 head f3 in #connect
tg0 f2 mainOut f9 tail #connect
tg0 f9 head f4 in #connect
tg0 f10 out f7 tail #connect
tg0 f7 head f6 mainIn #connect
tg0 f0 mainOut f12 tail #connect
tg0 f12 head f18 mainIn #connect
tg0 f18 mainOut f19 tail #connect
tg0 f19 head f2 mainIn #connect
tg0 f6 mainOut f13 tail #connect
tg0 f13 head f20 mainIn #connect
tg0 f20 mainOut f8 tail #connect
tg0 f8 head f15 mainIn #connect
tg0 f15 mainOut f16 tail #connect
tg0 f16 head f1 mainIn #connect
