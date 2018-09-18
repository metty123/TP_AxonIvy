[Ivy]
[>Created: Mon Jun 19 15:20:42 CEST 2017]
15B4D571FF4C6582 3.20 #module
>Proto >Proto Collection #zClass
Tn0 Cancel Big #zClass
Tn0 B #cInfo
Tn0 #process
Tn0 @TextInP .resExport .resExport #zField
Tn0 @TextInP .type .type #zField
Tn0 @TextInP .processKind .processKind #zField
Tn0 @AnnotationInP-0n ai ai #zField
Tn0 @MessageFlowInP-0n messageIn messageIn #zField
Tn0 @MessageFlowOutP-0n messageOut messageOut #zField
Tn0 @TextInP .xml .xml #zField
Tn0 @TextInP .responsibility .responsibility #zField
Tn0 @StartRequest f0 '' #zField
Tn0 @StartRequest f3 '' #zField
Tn0 @EndTask f1 '' #zField
Tn0 @DBStep f9 '' #zField
Tn0 @DBStep f7 '' #zField
Tn0 @RichDialog f14 '' #zField
Tn0 @RichDialog f13 '' #zField
Tn0 @GridStep f10 '' #zField
Tn0 @GridStep f4 '' #zField
Tn0 @PushWFArc f11 '' #zField
Tn0 @PushWFArc f12 '' #zField
Tn0 @PushWFArc f15 '' #zField
Tn0 @PushWFArc f16 '' #zField
Tn0 @PushWFArc f20 '' #zField
Tn0 @ErrorBoundaryEvent f23 '' #zField
Tn0 @PushWFArc f24 '' #zField
Tn0 @PushWFArc f5 '' #zField
Tn0 @PushWFArc f8 '' #zField
Tn0 @ErrorBoundaryEvent f17 '' #zField
Tn0 @PushWFArc f18 '' #zField
Tn0 @PushWFArc f6 '' #zField
>Proto Tn0 Tn0 Cancel #zField
Tn0 f0 outLink start_Student.ivp #txt
Tn0 f0 type kips.Data #txt
Tn0 f0 inParamDecl '<> param;' #txt
Tn0 f0 actionDecl 'kips.Data out;
' #txt
Tn0 f0 guid 15ADBCFEC30F06E3 #txt
Tn0 f0 requestEnabled true #txt
Tn0 f0 triggerEnabled false #txt
Tn0 f0 callSignature start_Student() #txt
Tn0 f0 persist false #txt
Tn0 f0 startName 'Cancel an Appointment' #txt
Tn0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
Tn0 f0 caseData businessCase.attach=true #txt
Tn0 f0 showInStartList 1 #txt
Tn0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start_Student.ivp</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f0 @C|.responsibility Student #txt
Tn0 f0 105 97 30 30 -45 17 #rect
Tn0 f0 @|StartRequestIcon #fIcon
Tn0 f3 outLink start_Professor.ivp #txt
Tn0 f3 type kips.Data #txt
Tn0 f3 inParamDecl '<> param;' #txt
Tn0 f3 actionDecl 'kips.Data out;
' #txt
Tn0 f3 guid 15AEBC705C2EA067 #txt
Tn0 f3 requestEnabled true #txt
Tn0 f3 triggerEnabled false #txt
Tn0 f3 callSignature start_Professor() #txt
Tn0 f3 persist false #txt
Tn0 f3 startName 'Cancel an Appointment' #txt
Tn0 f3 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
Tn0 f3 caseData businessCase.attach=true #txt
Tn0 f3 showInStartList 1 #txt
Tn0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start_Professor.ivp</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f3 @C|.responsibility Mentor #txt
Tn0 f3 105 497 30 30 -51 17 #rect
Tn0 f3 @|StartRequestIcon #fIcon
Tn0 f1 type kips.Data #txt
Tn0 f1 753 305 30 30 0 15 #rect
Tn0 f1 @|EndIcon #fIcon
Tn0 f9 actionDecl 'kips.Data out;
' #txt
Tn0 f9 actionTable 'out=in;
out.appointment.appointmentList=recordset;
' #txt
Tn0 f9 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE ANY_SQL SYSTEM  ""sqlStatements.dtd"">
<ANY_SQL><Verbatim quote=''true''>SELECT *
FROM appointment
WHERE (Student = in.user.studentUsername AND Available = 0)
AND date&#62;=CURDATE()</Verbatim></ANY_SQL>' #txt
Tn0 f9 dbUrl kipsDB #txt
Tn0 f9 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Tn0 f9 dbWizard 'SELECT *
FROM appointment
WHERE (Student = in.user.studentUsername AND Available = 0)
AND date>=CURDATE()' #txt
Tn0 f9 lotSize 2147483647 #txt
Tn0 f9 startIdx 0 #txt
Tn0 f9 type kips.Data #txt
Tn0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Appointments to list</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f9 208 250 112 44 -53 -8 #rect
Tn0 f9 @|DBStepIcon #fIcon
Tn0 f7 actionDecl 'kips.Data out;
' #txt
Tn0 f7 actionTable 'out=in;
out.appointment.appointmentList=recordset;
' #txt
Tn0 f7 actionCode 'import ch.ivyteam.ivy.security.IUser;
import java.util.*;

List<Record> appointments = recordset.getRecords();
IUser student;
for(Record appointment: appointments) {
	if(!(appointment.getField("Student").toString().isEmpty())){
		student = ivy.wf.getSecurityContext().findUser(appointment.getField("Student").toString());
  	recordset.remove(appointment);
		appointment.putField("Student",student.getFullName().toString());
		recordset.add(appointment);
	}else{
  	recordset.remove(appointment);
		appointment.putField("Student","<Not booked yet>");
		recordset.add(appointment);
	}
  
}



' #txt
Tn0 f7 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE ANY_SQL SYSTEM  ""sqlStatements.dtd"">
<ANY_SQL><Verbatim quote=''true''>SELECT *
FROM appointment
WHERE Mentor = in.user.mentorUsername
AND date&#62;=CURDATE()</Verbatim></ANY_SQL>' #txt
Tn0 f7 dbUrl kipsDB #txt
Tn0 f7 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Tn0 f7 dbWizard 'SELECT *
FROM appointment
WHERE Mentor = in.user.mentorUsername
AND date>=CURDATE()' #txt
Tn0 f7 lotSize 2147483647 #txt
Tn0 f7 startIdx 0 #txt
Tn0 f7 type kips.Data #txt
Tn0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Appointments to list</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f7 208 346 112 44 -53 -8 #rect
Tn0 f7 @|DBStepIcon #fIcon
Tn0 f14 targetWindow NEW #txt
Tn0 f14 targetDisplay TOP #txt
Tn0 f14 richDialogId kips.appointmentCancelMentor #txt
Tn0 f14 startMethod start(kips.Data) #txt
Tn0 f14 type kips.Data #txt
Tn0 f14 requestActionDecl '<kips.Data data> param;' #txt
Tn0 f14 requestMappingAction 'param.data=in;
' #txt
Tn0 f14 responseActionDecl 'kips.Data out;
' #txt
Tn0 f14 responseMappingAction 'out=in;
' #txt
Tn0 f14 isAsynch false #txt
Tn0 f14 isInnerRd false #txt
Tn0 f14 userContext '* ' #txt
Tn0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel appointments</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f14 448 490 128 44 -59 -8 #rect
Tn0 f14 @|RichDialogIcon #fIcon
Tn0 f13 targetWindow NEW #txt
Tn0 f13 targetDisplay TOP #txt
Tn0 f13 richDialogId kips.appointmentCancel #txt
Tn0 f13 startMethod start(kips.Data) #txt
Tn0 f13 type kips.Data #txt
Tn0 f13 requestActionDecl '<kips.Data data> param;' #txt
Tn0 f13 requestMappingAction 'param.data=in;
' #txt
Tn0 f13 responseActionDecl 'kips.Data out;
' #txt
Tn0 f13 responseMappingAction 'out=in;
out.appointment.appointment=result.data.appointment.appointment;
' #txt
Tn0 f13 isAsynch false #txt
Tn0 f13 isInnerRd false #txt
Tn0 f13 userContext '* ' #txt
Tn0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel appointments</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f13 400 90 128 44 -59 -8 #rect
Tn0 f13 @|RichDialogIcon #fIcon
Tn0 f10 actionDecl 'kips.Data out;
' #txt
Tn0 f10 actionTable 'out=in;
' #txt
Tn0 f10 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;


ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write Student to DataClasses
in.user.student = securityContext.getCurrentSession().getSessionUser();
in.user.studentUsername=in.user.student.getName();
in.user.StudentFullName=in.user.student.getFullName();

//find and write Mentor to DataClasses
in.user.mentor = securityContext.findUser(in.user.student.getProperty("Mentor"));
in.user.mentorUsername=in.user.mentor.getName();
in.user.MentoFullName=in.user.mentor.getFullName();
' #txt
Tn0 f10 security system #txt
Tn0 f10 type kips.Data #txt
Tn0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f10 64 250 112 44 -32 -8 #rect
Tn0 f10 @|StepIcon #fIcon
Tn0 f4 actionDecl 'kips.Data out;
' #txt
Tn0 f4 actionTable 'out=in;
' #txt
Tn0 f4 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;


ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write mentor to DataClasses
in.user.mentor = securityContext.getCurrentSession().getSessionUser();
in.user.mentorUsername=in.user.mentor.getName();
in.user.MentoFullName=in.user.mentor.getFullName();

//find and write Mentor to DataClasses
//in.user.mentor = securityContext.findUser(in.user.student.getProperty("Mentor"));
//in.user.mentorUsername=in.user.mentor.getName();
' #txt
Tn0 f4 security system #txt
Tn0 f4 type kips.Data #txt
Tn0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f4 64 346 112 44 -32 -8 #rect
Tn0 f4 @|StepIcon #fIcon
Tn0 f11 expr out #txt
Tn0 f11 120 127 120 250 #arcP
Tn0 f11 0 0.6212965354709816 0 0 #arcLabel
Tn0 f12 expr out #txt
Tn0 f12 176 272 208 272 #arcP
Tn0 f15 expr out #txt
Tn0 f15 120 497 120 390 #arcP
Tn0 f15 0 0.6550262642285563 0 0 #arcLabel
Tn0 f16 expr out #txt
Tn0 f16 176 368 208 368 #arcP
Tn0 f20 expr out #txt
Tn0 f20 264 250 400 112 #arcP
Tn0 f20 1 264 112 #addKink
Tn0 f20 1 0.1757933356789714 0 0 #arcLabel
Tn0 f23 actionDecl 'kips.Data out;
' #txt
Tn0 f23 actionTable 'out=in;
' #txt
Tn0 f23 type kips.Data #txt
Tn0 f23 attachedToRef 15B4D571FF4C6582-f13 #txt
Tn0 f23 489 129 30 30 0 15 #rect
Tn0 f23 @|ErrorBoundaryEventIcon #fIcon
Tn0 f24 519 144 768 305 #arcP
Tn0 f24 1 768 144 #addKink
Tn0 f24 0 0.8072289156626506 0 0 #arcLabel
Tn0 f5 expr out #txt
Tn0 f5 528 112 753 320 #arcP
Tn0 f5 1 640 112 #addKink
Tn0 f5 2 640 320 #addKink
Tn0 f5 1 0.5025 0 0 #arcLabel
Tn0 f8 expr out #txt
Tn0 f8 576 512 768 335 #arcP
Tn0 f8 1 768 512 #addKink
Tn0 f8 0 0.872409765750274 0 0 #arcLabel
Tn0 f17 actionDecl 'kips.Data out;
' #txt
Tn0 f17 actionTable 'out=in;
' #txt
Tn0 f17 type kips.Data #txt
Tn0 f17 attachedToRef 15B4D571FF4C6582-f14 #txt
Tn0 f17 537 529 30 30 0 15 #rect
Tn0 f17 @|ErrorBoundaryEventIcon #fIcon
Tn0 f18 567 544 753 320 #arcP
Tn0 f18 1 640 544 #addKink
Tn0 f18 2 640 320 #addKink
Tn0 f18 1 0.5172413793103449 0 0 #arcLabel
Tn0 f6 expr out #txt
Tn0 f6 302 390 512 490 #arcP
>Proto Tn0 .type kips.Data #txt
>Proto Tn0 .processKind NORMAL #txt
>Proto Tn0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Appointment Cancel
</swimlaneLabel>
        <swimlaneLabel>Student</swimlaneLabel>
        <swimlaneLabel>Engine
</swimlaneLabel>
        <swimlaneLabel>Mentor
</swimlaneLabel>
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
>Proto Tn0 0 0 32 24 18 0 #rect
>Proto Tn0 @|BIcon #fIcon
Tn0 f0 mainOut f11 tail #connect
Tn0 f11 head f10 mainIn #connect
Tn0 f10 mainOut f12 tail #connect
Tn0 f12 head f9 mainIn #connect
Tn0 f3 mainOut f15 tail #connect
Tn0 f15 head f4 mainIn #connect
Tn0 f4 mainOut f16 tail #connect
Tn0 f16 head f7 mainIn #connect
Tn0 f9 mainOut f20 tail #connect
Tn0 f20 head f13 mainIn #connect
Tn0 f23 mainOut f24 tail #connect
Tn0 f24 head f1 mainIn #connect
Tn0 f13 mainOut f5 tail #connect
Tn0 f5 head f1 mainIn #connect
Tn0 f14 mainOut f8 tail #connect
Tn0 f8 head f1 mainIn #connect
Tn0 f17 mainOut f18 tail #connect
Tn0 f18 head f1 mainIn #connect
Tn0 f7 mainOut f6 tail #connect
Tn0 f6 head f14 mainIn #connect
