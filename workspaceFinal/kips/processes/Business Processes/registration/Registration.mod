[Ivy]
[>Created: Fri Apr 21 14:33:12 CEST 2017]
15B610D3FF212E4A 3.19 #module
>Proto >Proto Collection #zClass
Rn0 Registration Big #zClass
Rn0 B #cInfo
Rn0 #process
Rn0 @TextInP .resExport .resExport #zField
Rn0 @TextInP .type .type #zField
Rn0 @TextInP .processKind .processKind #zField
Rn0 @AnnotationInP-0n ai ai #zField
Rn0 @MessageFlowInP-0n messageIn messageIn #zField
Rn0 @MessageFlowOutP-0n messageOut messageOut #zField
Rn0 @TextInP .xml .xml #zField
Rn0 @TextInP .responsibility .responsibility #zField
Rn0 @StartRequest f0 '' #zField
Rn0 @EndTask f1 '' #zField
Rn0 @GridStep f5 '' #zField
Rn0 @RichDialog f2 '' #zField
Rn0 @PushWFArc f3 '' #zField
Rn0 @PushWFArc f6 '' #zField
Rn0 @DBStep f7 '' #zField
Rn0 @PushWFArc f4 '' #zField
Rn0 @PushWFArc f8 '' #zField
>Proto Rn0 Rn0 Registration #zField
Rn0 f0 outLink start.ivp #txt
Rn0 f0 type kips.Data #txt
Rn0 f0 inParamDecl '<> param;' #txt
Rn0 f0 actionDecl 'kips.Data out;
' #txt
Rn0 f0 guid 15A74E5F174881A1 #txt
Rn0 f0 requestEnabled true #txt
Rn0 f0 triggerEnabled false #txt
Rn0 f0 callSignature start() #txt
Rn0 f0 persist false #txt
Rn0 f0 startName Registration #txt
Rn0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
Rn0 f0 caseData businessCase.attach=true #txt
Rn0 f0 showInStartList 0 #txt
Rn0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rn0 f0 @C|.responsibility Everybody #txt
Rn0 f0 81 113 30 30 -21 17 #rect
Rn0 f0 @|StartRequestIcon #fIcon
Rn0 f1 type kips.Data #txt
Rn0 f1 497 305 30 30 0 15 #rect
Rn0 f1 @|EndIcon #fIcon
Rn0 f5 actionDecl 'kips.Data out;
' #txt
Rn0 f5 actionTable 'out=in;
' #txt
Rn0 f5 actionCode 'import java.util.Locale;
import ch.ivyteam.ivy.security.ISecurityContext;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.security.IRole;

/*String fullName = in.user.firstname + " " + in.user.lastname;
ivy.wf.getSecurityContext().createUser(in.user.username, fullName, in.user.password.toString(), Locale.GERMAN, in.user.email, "");

ISecurityContext securityContext = ivy.wf.getApplication().getSecurityContext();
IUser user = securityContext.findUser(in.user.username);

IRole role = securityContext.findRole("Student");
user.addRole(role);



in.user.id=user.getId();*/' #txt
Rn0 f5 type kips.Data #txt
Rn0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createUser</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rn0 f5 168 298 112 44 -30 -8 #rect
Rn0 f5 @|StepIcon #fIcon
Rn0 f2 targetWindow NEW #txt
Rn0 f2 targetDisplay TOP #txt
Rn0 f2 richDialogId kips.registrationInputData #txt
Rn0 f2 startMethod start() #txt
Rn0 f2 type kips.Data #txt
Rn0 f2 requestActionDecl '<> param;' #txt
Rn0 f2 responseActionDecl 'kips.Data out;
' #txt
Rn0 f2 responseMappingAction 'out=in;
out.searchUser=result.searchUser;
out.user=result.user;
' #txt
Rn0 f2 isAsynch false #txt
Rn0 f2 isInnerRd false #txt
Rn0 f2 userContext '* ' #txt
Rn0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Input Data</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rn0 f2 168 106 112 44 -28 -8 #rect
Rn0 f2 @|RichDialogIcon #fIcon
Rn0 f3 expr out #txt
Rn0 f3 111 128 168 128 #arcP
Rn0 f6 expr out #txt
Rn0 f6 224 150 224 298 #arcP
Rn0 f7 actionDecl 'kips.Data out;
' #txt
Rn0 f7 actionTable 'out=in;
' #txt
Rn0 f7 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE INSERT SYSTEM  ""sqlStatements.dtd"">
<INSERT><Table name=''student''/><Value column=''SID''><AnyExpression>in.user.id</AnyExpression></Value><Value column=''LastName''><AnyExpression>in.user.lastname</AnyExpression></Value><Value column=''FirstName''><AnyExpression>in.user.firstname</AnyExpression></Value><Value column=''MatriculationNumber''><AnyExpression>in.user.matriculationNumber</AnyExpression></Value><Value column=''Email''><AnyExpression>in.user.email</AnyExpression></Value><Value column=''ThesisName''><AnyExpression>in.user.thesisName</AnyExpression></Value><Value column=''Password''><AnyExpression>in.user.password</AnyExpression></Value><Value column=''CourseOfStudies''><AnyExpression>in.user.courseOfStudies</AnyExpression></Value><Value column=''Mentor''><AnyExpression>in.user.mentor.getId()</AnyExpression></Value><Value column=''Username''><AnyExpression>in.user.username</AnyExpression></Value></INSERT>' #txt
Rn0 f7 dbUrl kipsDB #txt
Rn0 f7 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Rn0 f7 lotSize 2147483647 #txt
Rn0 f7 startIdx 0 #txt
Rn0 f7 type kips.Data #txt
Rn0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Store User</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rn0 f7 328 298 112 44 -29 -8 #rect
Rn0 f7 @|DBStepIcon #fIcon
Rn0 f4 expr out #txt
Rn0 f4 280 320 328 320 #arcP
Rn0 f8 expr out #txt
Rn0 f8 440 320 497 320 #arcP
>Proto Rn0 .type kips.Data #txt
>Proto Rn0 .processKind NORMAL #txt
>Proto Rn0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Registration</swimlaneLabel>
        <swimlaneLabel>Unknown User</swimlaneLabel>
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
>Proto Rn0 0 0 32 24 18 0 #rect
>Proto Rn0 @|BIcon #fIcon
Rn0 f0 mainOut f3 tail #connect
Rn0 f3 head f2 mainIn #connect
Rn0 f2 mainOut f6 tail #connect
Rn0 f6 head f5 mainIn #connect
Rn0 f5 mainOut f4 tail #connect
Rn0 f4 head f7 mainIn #connect
Rn0 f7 mainOut f8 tail #connect
Rn0 f8 head f1 mainIn #connect
