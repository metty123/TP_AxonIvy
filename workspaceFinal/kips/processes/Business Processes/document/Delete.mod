[Ivy]
[>Created: Mon Jun 12 17:09:52 CEST 2017]
015BB8E280DD9303 3.20 #module
>Proto >Proto Collection #zClass
De0 Delete Big #zClass
De0 B #cInfo
De0 #process
De0 @TextInP .resExport .resExport #zField
De0 @TextInP .type .type #zField
De0 @TextInP .processKind .processKind #zField
De0 @AnnotationInP-0n ai ai #zField
De0 @MessageFlowInP-0n messageIn messageIn #zField
De0 @MessageFlowOutP-0n messageOut messageOut #zField
De0 @TextInP .xml .xml #zField
De0 @TextInP .responsibility .responsibility #zField
De0 @DBStep f9 '' #zField
De0 @GridStep f10 '' #zField
De0 @GridStep f4 '' #zField
De0 @StartRequest f3 '' #zField
De0 @RichDialog f13 '' #zField
De0 @StartRequest f5 '' #zField
De0 @DBStep f7 '' #zField
De0 @EndTask f6 '' #zField
De0 @PushWFArc f15 '' #zField
De0 @PushWFArc f16 '' #zField
De0 @PushWFArc f24 '' #zField
De0 @PushWFArc f12 '' #zField
De0 @PushWFArc f19 '' #zField
De0 @PushWFArc f22 '' #zField
De0 @ErrorBoundaryEvent f23 '' #zField
De0 @DBStep f0 '' #zField
De0 @PushWFArc f1 '' #zField
De0 @PushWFArc f8 '' #zField
De0 @RichDialog f2 '' #zField
De0 @EndTask f14 '' #zField
De0 @PushWFArc f17 '' #zField
De0 @PushWFArc f18 '' #zField
De0 @ErrorBoundaryEvent f11 '' #zField
De0 @DBStep f20 '' #zField
De0 @PushWFArc f21 '' #zField
De0 @PushWFArc f25 '' #zField
>Proto De0 De0 Delete #zField
De0 f9 actionDecl 'kips.Data out;
' #txt
De0 f9 actionTable 'out=in;
out.document.studentFiles=recordset;
' #txt
De0 f9 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE SELECT SYSTEM  ""sqlStatements.dtd"">
<SELECT><Table name=''document''/><Condition><AND><Relation kind=''=''><Column name=''Student''/><AnyExpression>in.user.studentUsername</AnyExpression></Relation><Relation kind=''IS NOT''><Column name=''Path''/><NULL/></Relation></AND></Condition></SELECT>' #txt
De0 f9 dbUrl kipsDB #txt
De0 f9 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
De0 f9 dbWizard 'Student=in.user.studentUsername
AND Path IS NOT NULL' #txt
De0 f9 lotSize 2147483647 #txt
De0 f9 startIdx 0 #txt
De0 f9 type kips.Data #txt
De0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Studentfiles to list</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f9 254 243 112 44 -48 -8 #rect
De0 f9 @|DBStepIcon #fIcon
De0 f10 actionDecl 'kips.Data out;
' #txt
De0 f10 actionTable 'out=in;
' #txt
De0 f10 actionCode '//find and write Student to DataClasses
in.user.student = ivy.case.getCreatorUser();
in.user.studentUsername=in.user.student.getName();
in.user.StudentFullName=in.user.student.getFullName();


' #txt
De0 f10 security system #txt
De0 f10 type kips.Data #txt
De0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Student</name>
        <nameStyle>12,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f10 110 243 112 44 -34 -8 #rect
De0 f10 @|StepIcon #fIcon
De0 f4 actionDecl 'kips.Data out;
' #txt
De0 f4 actionTable 'out=in;
' #txt
De0 f4 actionCode '//find and write Mentor to DataClasses
in.user.mentor = ivy.case.getCreatorUser();
in.user.mentorUsername=in.user.mentor.getName();
' #txt
De0 f4 security system #txt
De0 f4 type kips.Data #txt
De0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f4 110 339 112 44 -32 -8 #rect
De0 f4 @|StepIcon #fIcon
De0 f3 outLink start_Professor.ivp #txt
De0 f3 type kips.Data #txt
De0 f3 inParamDecl '<> param;' #txt
De0 f3 actionDecl 'kips.Data out;
' #txt
De0 f3 guid 15BB8E2C07863E1A #txt
De0 f3 requestEnabled true #txt
De0 f3 triggerEnabled false #txt
De0 f3 callSignature start_Professor() #txt
De0 f3 persist false #txt
De0 f3 startName 'Show documents' #txt
De0 f3 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
De0 f3 caseData businessCase.attach=true #txt
De0 f3 showInStartList 1 #txt
De0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start_Professor.ivp</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f3 @C|.responsibility Mentor #txt
De0 f3 151 490 30 30 -51 17 #rect
De0 f3 @|StartRequestIcon #fIcon
De0 f13 targetWindow NEW #txt
De0 f13 targetDisplay TOP #txt
De0 f13 richDialogId kips.DeleteDocument #txt
De0 f13 startMethod start(kips.Data) #txt
De0 f13 type kips.Data #txt
De0 f13 requestActionDecl '<kips.Data Data> param;' #txt
De0 f13 requestMappingAction 'param.Data=in;
' #txt
De0 f13 responseActionDecl 'kips.Data out;
' #txt
De0 f13 responseMappingAction 'out=in;
out.document.mentorFiles=in.document.mentorFiles;
out.document.studentFiles=in.document.studentFiles;
' #txt
De0 f13 isAsynch false #txt
De0 f13 isInnerRd false #txt
De0 f13 userContext '* ' #txt
De0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Show Documents student</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f13 558 83 160 44 -71 -8 #rect
De0 f13 @|RichDialogIcon #fIcon
De0 f5 outLink start_Student.ivp #txt
De0 f5 type kips.Data #txt
De0 f5 inParamDecl '<> param;' #txt
De0 f5 actionDecl 'kips.Data out;
' #txt
De0 f5 guid 15BB8E2C079D280F #txt
De0 f5 requestEnabled true #txt
De0 f5 triggerEnabled false #txt
De0 f5 callSignature start_Student() #txt
De0 f5 persist false #txt
De0 f5 startName 'Show documents' #txt
De0 f5 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
De0 f5 caseData businessCase.attach=true #txt
De0 f5 showInStartList 1 #txt
De0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start_Student.ivp</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f5 @C|.responsibility Student #txt
De0 f5 151 90 30 30 -45 17 #rect
De0 f5 @|StartRequestIcon #fIcon
De0 f7 actionDecl 'kips.Data out;
' #txt
De0 f7 actionTable 'out=in;
out.document.mentorFiles=recordset;
' #txt
De0 f7 actionCode 'import ch.ivyteam.ivy.security.IUser;
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
De0 f7 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE SELECT SYSTEM  ""sqlStatements.dtd"">
<SELECT><Table name=''notification''/><Condition><AND><Relation kind=''=''><Column name=''Mentor''/><AnyExpression>in.user.mentorUsername</AnyExpression></Relation><Relation kind=''IS NOT''><Column name=''Path''/><NULL/></Relation></AND></Condition></SELECT>' #txt
De0 f7 dbUrl kipsDB #txt
De0 f7 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
De0 f7 dbWizard 'Mentor=in.user.mentorUsername
AND Path IS NOT NULL' #txt
De0 f7 lotSize 2147483647 #txt
De0 f7 startIdx 0 #txt
De0 f7 type kips.Data #txt
De0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Mentorfiles to list</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f7 254 339 112 44 -46 -8 #rect
De0 f7 @|DBStepIcon #fIcon
De0 f6 type kips.Data #txt
De0 f6 1151 90 30 30 0 15 #rect
De0 f6 @|EndIcon #fIcon
De0 f15 expr out #txt
De0 f15 166 490 166 383 #arcP
De0 f15 0 0.6550262642285563 0 0 #arcLabel
De0 f16 expr out #txt
De0 f16 222 361 254 361 #arcP
De0 f24 expr out #txt
De0 f24 709 137 1166 120 #arcP
De0 f24 1 1166 137 #addKink
De0 f24 0 0.5958030032490819 0 0 #arcLabel
De0 f12 expr out #txt
De0 f12 222 265 254 265 #arcP
De0 f19 expr out #txt
De0 f19 718 105 1151 105 #arcP
De0 f19 0 0.22860586857693896 0 0 #arcLabel
De0 f22 expr out #txt
De0 f22 166 120 166 243 #arcP
De0 f22 0 0.6212965354709816 0 0 #arcLabel
De0 f23 actionDecl 'kips.Data out;
' #txt
De0 f23 actionTable 'out=in;
' #txt
De0 f23 type kips.Data #txt
De0 f23 attachedToRef 015BB8E280DD9303-f13 #txt
De0 f23 679 122 30 30 0 15 #rect
De0 f23 @|ErrorBoundaryEventIcon #fIcon
De0 f0 actionDecl 'kips.Data out;
' #txt
De0 f0 actionTable 'out=in;
out.document.mentorFiles=recordset;
' #txt
De0 f0 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE SELECT SYSTEM  ""sqlStatements.dtd"">
<SELECT><Table name=''notification''/><Condition><Relation kind=''IS NOT''><Column name=''Path''/><NULL/></Relation></Condition></SELECT>' #txt
De0 f0 dbUrl kipsDB #txt
De0 f0 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
De0 f0 dbWizard 'Path IS NOT NULL' #txt
De0 f0 lotSize 2147483647 #txt
De0 f0 startIdx 0 #txt
De0 f0 type kips.Data #txt
De0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Mentorfiles to list</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f0 393 243 112 44 -46 -8 #rect
De0 f0 @|DBStepIcon #fIcon
De0 f1 expr out #txt
De0 f1 366 265 393 265 #arcP
De0 f8 expr out #txt
De0 f8 449 243 558 105 #arcP
De0 f8 1 449 105 #addKink
De0 f8 1 0.15632246743962747 0 0 #arcLabel
De0 f2 targetWindow NEW #txt
De0 f2 targetDisplay TOP #txt
De0 f2 richDialogId kips.DeleteDocumentMentor #txt
De0 f2 startMethod start(kips.Data) #txt
De0 f2 type kips.Data #txt
De0 f2 requestActionDecl '<kips.Data data> param;' #txt
De0 f2 requestMappingAction 'param.data=in;
' #txt
De0 f2 responseActionDecl 'kips.Data out;
' #txt
De0 f2 responseMappingAction 'out=in;
out.document.mentorFiles=in.document.mentorFiles;
out.document.studentFiles=in.document.studentFiles;
' #txt
De0 f2 isAsynch false #txt
De0 f2 isInnerRd false #txt
De0 f2 userContext '* ' #txt
De0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Schow Documents Mentor</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f2 553 488 160 44 -72 -8 #rect
De0 f2 @|RichDialogIcon #fIcon
De0 f14 type kips.Data #txt
De0 f14 1146 495 30 30 0 15 #rect
De0 f14 @|EndIcon #fIcon
De0 f17 expr out #txt
De0 f17 704 542 1161 525 #arcP
De0 f17 1 1161 542 #addKink
De0 f17 0 0.5958030032490819 0 0 #arcLabel
De0 f18 expr out #txt
De0 f18 713 510 1146 510 #arcP
De0 f18 0 0.22860586857693896 0 0 #arcLabel
De0 f11 actionDecl 'kips.Data out;
' #txt
De0 f11 actionTable 'out=in;
' #txt
De0 f11 type kips.Data #txt
De0 f11 attachedToRef 015BB8E280DD9303-f2 #txt
De0 f11 674 527 30 30 0 15 #rect
De0 f11 @|ErrorBoundaryEventIcon #fIcon
De0 f20 actionDecl 'kips.Data out;
' #txt
De0 f20 actionTable 'out=in;
out.document.studentFiles=recordset;
' #txt
De0 f20 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE SELECT SYSTEM  ""sqlStatements.dtd"">
<SELECT><Table name=''document''/><Condition><AND><Relation kind=''=''><Column name=''Mentor''/><AnyExpression>in.user.mentorUsername</AnyExpression></Relation><Relation kind=''IS NOT''><Column name=''Path''/><NULL/></Relation></AND></Condition></SELECT>' #txt
De0 f20 dbUrl kipsDB #txt
De0 f20 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
De0 f20 dbWizard 'Mentor=in.user.mentorUsername
 AND Path IS NOT NULL' #txt
De0 f20 lotSize 2147483647 #txt
De0 f20 startIdx 0 #txt
De0 f20 type kips.Data #txt
De0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Studentfiles to list</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
De0 f20 393 338 112 44 -48 -8 #rect
De0 f20 @|DBStepIcon #fIcon
De0 f21 expr out #txt
De0 f21 366 361 393 360 #arcP
De0 f25 expr out #txt
De0 f25 449 382 553 510 #arcP
De0 f25 1 449 510 #addKink
De0 f25 1 0.1515581238686658 0 0 #arcLabel
>Proto De0 .type kips.Data #txt
>Proto De0 .processKind NORMAL #txt
>Proto De0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Show Notifications
</swimlaneLabel>
        <swimlaneLabel>Student
</swimlaneLabel>
        <swimlaneLabel>Engine</swimlaneLabel>
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
>Proto De0 0 0 32 24 18 0 #rect
>Proto De0 @|BIcon #fIcon
De0 f5 mainOut f22 tail #connect
De0 f22 head f10 mainIn #connect
De0 f10 mainOut f12 tail #connect
De0 f12 head f9 mainIn #connect
De0 f3 mainOut f15 tail #connect
De0 f15 head f4 mainIn #connect
De0 f4 mainOut f16 tail #connect
De0 f16 head f7 mainIn #connect
De0 f23 mainOut f24 tail #connect
De0 f24 head f6 mainIn #connect
De0 f13 mainOut f19 tail #connect
De0 f19 head f6 mainIn #connect
De0 f9 mainOut f1 tail #connect
De0 f1 head f0 mainIn #connect
De0 f0 mainOut f8 tail #connect
De0 f8 head f13 mainIn #connect
De0 f11 mainOut f17 tail #connect
De0 f17 head f14 mainIn #connect
De0 f2 mainOut f18 tail #connect
De0 f18 head f14 mainIn #connect
De0 f7 mainOut f21 tail #connect
De0 f21 head f20 mainIn #connect
De0 f20 mainOut f25 tail #connect
De0 f25 head f2 mainIn #connect
