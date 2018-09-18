[Ivy]
[>Created: Mon Jun 19 14:26:31 CEST 2017]
15B4D75BE9EBED7F 3.20 #module
>Proto >Proto Collection #zClass
Tn0 Offer Big #zClass
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
Tn0 @RichDialog f2 '' #zField
Tn0 @PushWFArc f3 '' #zField
Tn0 @DBStep f4 '' #zField
Tn0 @GridStep f10 '' #zField
Tn0 @PushWFArc f5 '' #zField
Tn0 @PushWFArc f8 '' #zField
Tn0 @EndTask f1 '' #zField
Tn0 @PushWFArc f6 '' #zField
>Proto Tn0 Tn0 Offer #zField
Tn0 f0 outLink start.ivp #txt
Tn0 f0 type kips.Data #txt
Tn0 f0 inParamDecl '<> param;' #txt
Tn0 f0 actionDecl 'kips.Data out;
' #txt
Tn0 f0 guid 15AD74CBF68DAB25 #txt
Tn0 f0 requestEnabled true #txt
Tn0 f0 triggerEnabled false #txt
Tn0 f0 callSignature start() #txt
Tn0 f0 persist false #txt
Tn0 f0 startName 'Offer an Appointment' #txt
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
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f0 @C|.responsibility Mentor #txt
Tn0 f0 81 113 30 30 -21 17 #rect
Tn0 f0 @|StartRequestIcon #fIcon
Tn0 f2 targetWindow NEW #txt
Tn0 f2 targetDisplay TOP #txt
Tn0 f2 richDialogId kips.appointmentOffer #txt
Tn0 f2 startMethod start() #txt
Tn0 f2 type kips.Data #txt
Tn0 f2 requestActionDecl '<> param;' #txt
Tn0 f2 responseActionDecl 'kips.Data out;
' #txt
Tn0 f2 responseMappingAction 'out=in;
out.appointment.available=true;
out.appointment.date=result.appointment.date;
out.appointment.end=result.appointment.end;
out.appointment.location=result.appointment.location;
out.appointment.start=result.appointment.start;
out.appointment.subject=result.appointment.subject;
' #txt
Tn0 f2 isAsynch false #txt
Tn0 f2 isInnerRd false #txt
Tn0 f2 userContext '* ' #txt
Tn0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Offer appointment</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f2 176 106 112 44 -49 -8 #rect
Tn0 f2 @|RichDialogIcon #fIcon
Tn0 f3 expr out #txt
Tn0 f3 111 128 176 128 #arcP
Tn0 f4 actionDecl 'kips.Data out;
' #txt
Tn0 f4 actionTable 'out=in;
' #txt
Tn0 f4 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE INSERT SYSTEM  ""sqlStatements.dtd"">
<INSERT><Table name=''appointment''/><Value column=''Date''><AnyExpression>in.appointment.date</AnyExpression></Value><Value column=''Start''><AnyExpression>in.appointment.start.format(""HH:mm"")</AnyExpression></Value><Value column=''End''><AnyExpression>in.appointment.end.format(""HH:mm"")</AnyExpression></Value><Value column=''Available''><String>1</String></Value><Value column=''Location''><AnyExpression>in.appointment.location</AnyExpression></Value><Value column=''Mentor''><AnyExpression>in.user.mentorUsername</AnyExpression></Value></INSERT>' #txt
Tn0 f4 dbUrl kipsDB #txt
Tn0 f4 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Tn0 f4 lotSize 2147483647 #txt
Tn0 f4 startIdx 0 #txt
Tn0 f4 type kips.Data #txt
Tn0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create appointment</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Tn0 f4 352 306 128 44 -54 -8 #rect
Tn0 f4 @|DBStepIcon #fIcon
Tn0 f10 actionDecl 'kips.Data out;
' #txt
Tn0 f10 actionTable 'out=in;
' #txt
Tn0 f10 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;


ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();

//find and write mentor to DataClasses
in.user.mentor = securityContext.getCurrentSession().getSessionUser();
in.user.mentorUsername=in.user.mentor.getName();

//find and write Mentor to DataClasses
//in.user.mentor = securityContext.findUser(in.user.student.getProperty("Mentor"));
//in.user.mentorUsername=in.user.mentor.getName();
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
Tn0 f10 176 306 112 44 -32 -8 #rect
Tn0 f10 @|StepIcon #fIcon
Tn0 f5 expr out #txt
Tn0 f5 232 150 232 306 #arcP
Tn0 f8 expr out #txt
Tn0 f8 288 328 352 328 #arcP
Tn0 f1 type kips.Data #txt
Tn0 f1 641 313 30 30 0 15 #rect
Tn0 f1 @|EndIcon #fIcon
Tn0 f6 expr out #txt
Tn0 f6 480 328 641 328 #arcP
>Proto Tn0 .type kips.Data #txt
>Proto Tn0 .processKind NORMAL #txt
>Proto Tn0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Offer an appointment
</swimlaneLabel>
        <swimlaneLabel>Mentor</swimlaneLabel>
        <swimlaneLabel>Engine</swimlaneLabel>
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
Tn0 f4 mainOut f6 tail #connect
Tn0 f6 head f1 mainIn #connect
Tn0 f0 mainOut f3 tail #connect
Tn0 f3 head f2 mainIn #connect
Tn0 f2 mainOut f5 tail #connect
Tn0 f5 head f10 mainIn #connect
Tn0 f10 mainOut f8 tail #connect
Tn0 f8 head f4 mainIn #connect
