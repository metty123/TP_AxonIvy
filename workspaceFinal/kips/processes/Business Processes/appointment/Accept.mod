[Ivy]
[>Created: Sat Jun 10 17:58:15 CEST 2017]
15B4D77E791F052C 3.20 #module
>Proto >Proto Collection #zClass
Tn0 Accept Big #zClass
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
Tn0 @DBStep f2 '' #zField
Tn0 @EndTask f1 '' #zField
Tn0 @RichDialog f4 '' #zField
Tn0 @PushWFArc f5 '' #zField
Tn0 @PushWFArc f6 '' #zField
Tn0 @GridStep f7 '' #zField
Tn0 @PushWFArc f3 '' #zField
Tn0 @PushWFArc f8 '' #zField
>Proto Tn0 Tn0 Accept #zField
Tn0 f0 outLink start.ivp #txt
Tn0 f0 type kips.Data #txt
Tn0 f0 inParamDecl '<> param;' #txt
Tn0 f0 actionDecl 'kips.Data out;
' #txt
Tn0 f0 guid 15ADBD0173F6152C #txt
Tn0 f0 requestEnabled true #txt
Tn0 f0 triggerEnabled false #txt
Tn0 f0 callSignature start() #txt
Tn0 f0 persist false #txt
Tn0 f0 startName 'Show free Appointments' #txt
Tn0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.CATEGORY=Appointment
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.NAM=Accept
TaskTriggered.EXROL=Everybody' #txt
Tn0 f0 caseData businessCase.attach=true #txt
Tn0 f0 showInStartList 1 #txt
Tn0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f0 @C|.responsibility Student #txt
Tn0 f0 133 113 30 30 -21 17 #rect
Tn0 f0 @|StartRequestIcon #fIcon
Tn0 f2 actionDecl 'kips.Data out;
' #txt
Tn0 f2 actionTable 'out=in;
out.appointment.appointmentList=recordset;
' #txt
Tn0 f2 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE ANY_SQL SYSTEM  ""sqlStatements.dtd"">
<ANY_SQL><Verbatim quote=''true''>SELECT *
FROM kips.appointment
WHERE Mentor = in.user.mentorUsername
AND Available = 1
AND Date &#62;= CURDATE()</Verbatim></ANY_SQL>' #txt
Tn0 f2 dbUrl kipsDB #txt
Tn0 f2 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Tn0 f2 dbWizard 'SELECT *
FROM kips.appointment
WHERE Mentor = in.user.mentorUsername
AND Available = 1
AND Date >= CURDATE()' #txt
Tn0 f2 lotSize 2147483647 #txt
Tn0 f2 startIdx 0 #txt
Tn0 f2 type kips.Data #txt
Tn0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Appointments to list</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f2 232 293 112 44 -53 -8 #rect
Tn0 f2 @|DBStepIcon #fIcon
Tn0 f1 type kips.Data #txt
Tn0 f1 465 113 30 30 0 15 #rect
Tn0 f1 @|EndIcon #fIcon
Tn0 f4 targetWindow NEW #txt
Tn0 f4 targetDisplay TOP #txt
Tn0 f4 richDialogId kips.appointmentAccept #txt
Tn0 f4 startMethod start(kips.Data) #txt
Tn0 f4 type kips.Data #txt
Tn0 f4 requestActionDecl '<kips.Data data> param;' #txt
Tn0 f4 requestMappingAction 'param.data=in;
' #txt
Tn0 f4 responseActionDecl 'kips.Data out;
' #txt
Tn0 f4 responseMappingAction 'out=in;
' #txt
Tn0 f4 isAsynch false #txt
Tn0 f4 isInnerRd false #txt
Tn0 f4 userContext '* ' #txt
Tn0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Accept appointment</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f4 304 106 112 44 -53 -8 #rect
Tn0 f4 @|RichDialogIcon #fIcon
Tn0 f5 expr out #txt
Tn0 f5 344 315 360 150 #arcP
Tn0 f5 1 360 315 #addKink
Tn0 f5 0 0.9903404411521965 0 0 #arcLabel
Tn0 f6 expr out #txt
Tn0 f6 416 128 465 128 #arcP
Tn0 f7 actionDecl 'kips.Data out;
' #txt
Tn0 f7 actionTable 'out=in;
' #txt
Tn0 f7 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;


ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write Student to DataClasses
in.user.student = securityContext.getCurrentSession().getSessionUser();
in.user.studentUsername=in.user.student.getName();

//find and write Mentor to DataClasses
in.user.mentor = securityContext.findUser(in.user.student.getProperty("Mentor"));
in.user.mentorUsername=in.user.mentor.getName();
' #txt
Tn0 f7 security system #txt
Tn0 f7 type kips.Data #txt
Tn0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f7 92 293 112 44 -32 -8 #rect
Tn0 f7 @|StepIcon #fIcon
Tn0 f3 expr out #txt
Tn0 f3 148 143 148 293 #arcP
Tn0 f8 expr out #txt
Tn0 f8 204 315 232 315 #arcP
>Proto Tn0 .type kips.Data #txt
>Proto Tn0 .processKind NORMAL #txt
>Proto Tn0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Termin annehmen
</swimlaneLabel>
        <swimlaneLabel>Student
</swimlaneLabel>
        <swimlaneLabel>Engine
</swimlaneLabel>
    </language>
    <swimlaneOrientation>false</swimlaneOrientation>
    <swimlaneSize>384</swimlaneSize>
    <swimlaneSize>192</swimlaneSize>
    <swimlaneSize>192</swimlaneSize>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneColor gradient="false">-1</swimlaneColor>
    <swimlaneType>POOL</swimlaneType>
    <swimlaneType>LANE_IN_POOL</swimlaneType>
    <swimlaneType>LANE_IN_POOL</swimlaneType>
    <swimlaneSpaceBefore>32</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
</elementInfo>
' #txt
>Proto Tn0 0 0 32 24 18 0 #rect
>Proto Tn0 @|BIcon #fIcon
Tn0 f2 mainOut f5 tail #connect
Tn0 f5 head f4 mainIn #connect
Tn0 f4 mainOut f6 tail #connect
Tn0 f6 head f1 mainIn #connect
Tn0 f0 mainOut f3 tail #connect
Tn0 f3 head f7 mainIn #connect
Tn0 f7 mainOut f8 tail #connect
Tn0 f8 head f2 mainIn #connect
