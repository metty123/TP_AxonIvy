[Ivy]
[>Created: Sat Jun 10 17:57:36 CEST 2017]
15B4D48AD11DA15A 3.20 #module
>Proto >Proto Collection #zClass
fd0 Upload Big #zClass
fd0 B #cInfo
fd0 #process
fd0 @TextInP .resExport .resExport #zField
fd0 @TextInP .type .type #zField
fd0 @TextInP .processKind .processKind #zField
fd0 @AnnotationInP-0n ai ai #zField
fd0 @MessageFlowInP-0n messageIn messageIn #zField
fd0 @MessageFlowOutP-0n messageOut messageOut #zField
fd0 @TextInP .xml .xml #zField
fd0 @TextInP .responsibility .responsibility #zField
fd0 @UserTask f5 '' #zField
fd0 @UserTask f7 '' #zField
fd0 @TkArc f8 '' #zField
fd0 @Alternative f1 '' #zField
fd0 @PushWFArc f2 '' #zField
fd0 @EndTask f9 '' #zField
fd0 @PushWFArc f10 '' #zField
fd0 @UserTask f11 '' #zField
fd0 @TkArc f12 '' #zField
fd0 @TkArc f13 '' #zField
fd0 @RichDialog f3 '' #zField
fd0 @TkArc f6 '' #zField
fd0 @StartRequest f0 '' #zField
fd0 @PushWFArc f15 '' #zField
fd0 @PushWFArc f4 '' #zField
fd0 @GridStep f14 '' #zField
>Proto fd0 fd0 Upload #zField
fd0 f5 richDialogId kips.documentDownloadAndComment #txt
fd0 f5 startMethod start(kips.Document,String) #txt
fd0 f5 requestActionDecl '<kips.Document document, String message> param;' #txt
fd0 f5 requestMappingAction 'param.document=in.document;
param.message=in.message;
' #txt
fd0 f5 responseActionDecl 'kips.Data out;
' #txt
fd0 f5 responseMappingAction 'out=in;
out.comment=result.comment;
out.document=result.document;
' #txt
fd0 f5 outLinks "TaskA.ivp" #txt
fd0 f5 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=<%\=ivy.case.getCreatorUserName()%> sends you <%\=in.document.fileName%>
TaskA.PRI=2
TaskA.ROL=in.user.mentorUsername
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
fd0 f5 type kips.Data #txt
fd0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>File download and comment</name>
        <nameStyle>25,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f5 304 498 160 44 -77 -8 #rect
fd0 f5 @|UserTaskIcon #fIcon
fd0 f7 richDialogId kips.documentCommentRead #txt
fd0 f7 startMethod start(kips.Document,kips.Comment,kips.User) #txt
fd0 f7 requestActionDecl '<kips.Document document, kips.Comment comment, kips.User student> param;' #txt
fd0 f7 requestMappingAction 'param.document=in.document;
param.comment=in.comment;
' #txt
fd0 f7 responseActionDecl 'kips.Data out;
' #txt
fd0 f7 responseMappingAction 'out=in;
out.comment=result.comment;
out.document=result.document;
' #txt
fd0 f7 outLinks "TaskA.ivp" #txt
fd0 f7 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=Feedback for <%\=in.document.fileName%> received
TaskA.PRI=2
TaskA.ROL=in.user.studentUsername
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
fd0 f7 type kips.Data #txt
fd0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Read comment</name>
        <nameStyle>12,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f7 528 114 112 44 -42 -8 #rect
fd0 f7 @|UserTaskIcon #fIcon
fd0 f8 expr data #txt
fd0 f8 outCond ivp=="TaskA.ivp" #txt
fd0 f8 type kips.Data #txt
fd0 f8 var in1 #txt
fd0 f8 464 520 584 158 #arcP
fd0 f8 1 584 520 #addKink
fd0 f8 1 0.2142583780015184 0 0 #arcLabel
fd0 f1 type kips.Data #txt
fd0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is question needed?</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f1 752 120 32 32 -33 -33 #rect
fd0 f1 @|AlternativeIcon #fIcon
fd0 f2 expr data #txt
fd0 f2 outCond ivp=="TaskA.ivp" #txt
fd0 f2 640 136 752 136 #arcP
fd0 f9 type kips.Data #txt
fd0 f9 881 121 30 30 0 15 #rect
fd0 f9 @|EndIcon #fIcon
fd0 f10 expr in #txt
fd0 f10 outCond 'in.comment.isQuestionNeeded == false' #txt
fd0 f10 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f10 784 136 881 136 #arcP
fd0 f11 richDialogId kips.documentCommentAnswer #txt
fd0 f11 startMethod start(kips.Document,kips.Comment,kips.User) #txt
fd0 f11 requestActionDecl '<kips.Document document, kips.Comment comment, kips.User student> param;' #txt
fd0 f11 requestMappingAction 'param.document=in.document;
param.comment.question=in.comment.question;
' #txt
fd0 f11 responseActionDecl 'kips.Data out;
' #txt
fd0 f11 responseMappingAction 'out=in;
out.comment.comment=result.comment.comment;
' #txt
fd0 f11 outLinks "TaskA.ivp" #txt
fd0 f11 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=<%\=ivy.case.getCreatorUserName()%> has some questions regarding your comment for <%\=in.document.fileName%>
TaskA.PRI=2
TaskA.ROL=in.user.mentorUsername
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
fd0 f11 type kips.Data #txt
fd0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Answer questions</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f11 712 482 112 44 -49 -8 #rect
fd0 f11 @|UserTaskIcon #fIcon
fd0 f12 expr in #txt
fd0 f12 outCond 'in.comment.isQuestionNeeded ==true' #txt
fd0 f12 type kips.Data #txt
fd0 f12 var in1 #txt
fd0 f12 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f12 768 152 768 482 #arcP
fd0 f13 expr data #txt
fd0 f13 outCond ivp=="TaskA.ivp" #txt
fd0 f13 type kips.Data #txt
fd0 f13 var in2 #txt
fd0 f13 768 482 584 158 #arcP
fd0 f3 targetWindow NEW #txt
fd0 f3 targetDisplay TOP #txt
fd0 f3 richDialogId kips.documentUpload #txt
fd0 f3 startMethod start() #txt
fd0 f3 type kips.Data #txt
fd0 f3 requestActionDecl '<> param;' #txt
fd0 f3 responseActionDecl 'kips.Data out;
' #txt
fd0 f3 responseMappingAction 'out=in;
out.document.file=result.file;
out.document.fileContent=result.fileContent;
out.document.fileDownload=result.fileDownload;
out.document.fileName=result.fileName;
out.document.filePath=result.filePath;
out.message=result.message;
' #txt
fd0 f3 isAsynch false #txt
fd0 f3 isInnerRd false #txt
fd0 f3 userContext '* ' #txt
fd0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Upload file</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f3 328 106 112 44 -29 -8 #rect
fd0 f3 @|RichDialogIcon #fIcon
fd0 f6 expr out #txt
fd0 f6 type kips.Data #txt
fd0 f6 var in1 #txt
fd0 f6 384 150 384 498 #arcP
fd0 f0 outLink start.ivp #txt
fd0 f0 type kips.Data #txt
fd0 f0 inParamDecl '<> param;' #txt
fd0 f0 actionDecl 'kips.Data out;
' #txt
fd0 f0 guid 15B4344B6CA2C2F4 #txt
fd0 f0 requestEnabled true #txt
fd0 f0 triggerEnabled false #txt
fd0 f0 callSignature start() #txt
fd0 f0 persist false #txt
fd0 f0 startName 'Send Document to Mentor' #txt
fd0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
fd0 f0 caseData businessCase.attach=true #txt
fd0 f0 showInStartList 1 #txt
fd0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f0 @C|.responsibility Student #txt
fd0 f0 145 113 30 30 -21 17 #rect
fd0 f0 @|StartRequestIcon #fIcon
fd0 f15 expr out #txt
fd0 f15 216 337 328 128 #arcP
fd0 f15 1 256 337 #addKink
fd0 f15 2 256 128 #addKink
fd0 f15 1 0.9836543096041468 0 0 #arcLabel
fd0 f4 expr out #txt
fd0 f4 160 143 160 315 #arcP
fd0 f14 actionDecl 'kips.Data out;
' #txt
fd0 f14 actionTable 'out=in;
' #txt
fd0 f14 actionCode 'import java.util.Locale;
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
fd0 f14 security system #txt
fd0 f14 type kips.Data #txt
fd0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Find Mentor</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fd0 f14 104 315 112 44 -32 -8 #rect
fd0 f14 @|StepIcon #fIcon
>Proto fd0 .type kips.Data #txt
>Proto fd0 .processKind NORMAL #txt
>Proto fd0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Dokumentbewertung</swimlaneLabel>
        <swimlaneLabel>Student</swimlaneLabel>
        <swimlaneLabel>Engine
</swimlaneLabel>
        <swimlaneLabel>Betreuer</swimlaneLabel>
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
>Proto fd0 0 0 32 24 18 0 #rect
>Proto fd0 @|BIcon #fIcon
fd0 f5 out f8 tail #connect
fd0 f8 head f7 in #connect
fd0 f7 out f2 tail #connect
fd0 f2 head f1 in #connect
fd0 f1 out f10 tail #connect
fd0 f10 head f9 mainIn #connect
fd0 f1 out f12 tail #connect
fd0 f12 head f11 in #connect
fd0 f11 out f13 tail #connect
fd0 f13 head f7 in #connect
fd0 f3 mainOut f6 tail #connect
fd0 f6 head f5 in #connect
fd0 f0 mainOut f4 tail #connect
fd0 f4 head f14 mainIn #connect
fd0 f14 mainOut f15 tail #connect
fd0 f15 head f3 mainIn #connect
