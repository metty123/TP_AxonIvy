[Ivy]
[>Created: Mon Jun 12 17:02:52 CEST 2017]
15B6156FCD4106C9 3.20 #module
>Proto >Proto Collection #zClass
Nn0 Notification Big #zClass
Nn0 B #cInfo
Nn0 #process
Nn0 @TextInP .resExport .resExport #zField
Nn0 @TextInP .type .type #zField
Nn0 @TextInP .processKind .processKind #zField
Nn0 @AnnotationInP-0n ai ai #zField
Nn0 @MessageFlowInP-0n messageIn messageIn #zField
Nn0 @MessageFlowOutP-0n messageOut messageOut #zField
Nn0 @TextInP .xml .xml #zField
Nn0 @TextInP .responsibility .responsibility #zField
Nn0 @StartRequest f0 '' #zField
Nn0 @RichDialog f3 '' #zField
Nn0 @PushWFArc f4 '' #zField
Nn0 @Alternative f1 '' #zField
Nn0 @UserTask f9 '' #zField
Nn0 @Alternative f12 '' #zField
Nn0 @UserTask f15 '' #zField
Nn0 @TkArc f18 '' #zField
Nn0 @PushWFArc f13 '' #zField
Nn0 @TkArc f8 '' #zField
Nn0 @TkArc f10 '' #zField
Nn0 @PushWFArc f11 '' #zField
Nn0 @TaskSwitch f7 '' #zField
Nn0 @UserTask f6 '' #zField
Nn0 @TkArc f17 '' #zField
Nn0 @PushWFArc f19 '' #zField
Nn0 @DBStep f20 '' #zField
Nn0 @PushWFArc f21 '' #zField
Nn0 @EndTask f2 '' #zField
Nn0 @PushWFArc f5 '' #zField
Nn0 @EndTask f14 '' #zField
Nn0 @PushWFArc f16 '' #zField
Nn0 @GridStep f23 '' #zField
Nn0 @PushWFArc f24 '' #zField
Nn0 @PushWFArc f22 '' #zField
>Proto Nn0 Nn0 Notification #zField
Nn0 f0 outLink start.ivp #txt
Nn0 f0 type kips.Data #txt
Nn0 f0 inParamDecl '<> param;' #txt
Nn0 f0 actionDecl 'kips.Data out;
' #txt
Nn0 f0 guid 15B6156FCE16B4DC #txt
Nn0 f0 requestEnabled true #txt
Nn0 f0 triggerEnabled false #txt
Nn0 f0 callSignature start() #txt
Nn0 f0 persist false #txt
Nn0 f0 startName 'Send Notification to all users' #txt
Nn0 f0 taskData 'TaskTriggered.ROL=Everybody
TaskTriggered.EXTYPE=0
TaskTriggered.EXPRI=2
TaskTriggered.TYPE=0
TaskTriggered.PRI=2
TaskTriggered.EXROL=Everybody' #txt
Nn0 f0 caseData businessCase.attach=true #txt
Nn0 f0 showInStartList 1 #txt
Nn0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f0 @C|.responsibility Mentor #txt
Nn0 f0 81 113 30 30 -21 17 #rect
Nn0 f0 @|StartRequestIcon #fIcon
Nn0 f3 targetWindow NEW #txt
Nn0 f3 targetDisplay TOP #txt
Nn0 f3 richDialogId kips.notificationDataInput #txt
Nn0 f3 startMethod start() #txt
Nn0 f3 type kips.Data #txt
Nn0 f3 requestActionDecl '<> param;' #txt
Nn0 f3 responseActionDecl 'kips.Data out;
' #txt
Nn0 f3 responseMappingAction 'out=in;
out.document.file=result.file;
out.document.fileContent=result.fileContent;
out.document.fileDownload=result.fileDownload;
out.document.fileName=result.fileName;
out.document.filePath=result.filePath;
out.message=result.message;
out.searchUser.allUserNames=result.searchUser.allUserNames;
out.user.mentorUsername=result.mentor;
' #txt
Nn0 f3 isAsynch false #txt
Nn0 f3 isInnerRd false #txt
Nn0 f3 userContext '* ' #txt
Nn0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Send Notification</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f3 168 106 112 44 -46 -8 #rect
Nn0 f3 @|RichDialogIcon #fIcon
Nn0 f4 expr out #txt
Nn0 f4 111 128 168 128 #arcP
Nn0 f1 type kips.Data #txt
Nn0 f1 208 368 32 32 0 16 #rect
Nn0 f1 @|AlternativeIcon #fIcon
Nn0 f9 richDialogId kips.notificationShow #txt
Nn0 f9 startMethod start(kips.Document,String,kips.searchUser,kips.Comment) #txt
Nn0 f9 requestActionDecl '<kips.Document document, String message, kips.searchUser searchUser, kips.Comment comment> param;' #txt
Nn0 f9 requestMappingAction 'param.document=in.document;
param.message=in.message;
param.searchUser.searchText=in.searchUser.searchText;
' #txt
Nn0 f9 responseActionDecl 'kips.Data out;
' #txt
Nn0 f9 responseMappingAction 'out=in;
out.comment=result.comment;
out.user.student=ivy.session.getSessionUser();
' #txt
Nn0 f9 outLinks "TaskA.ivp" #txt
Nn0 f9 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=Notification from <%\=ivy.case.getCreatorUserName()%> 
TaskA.PRI=2
TaskA.ROL=in.searchUser.searchText
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
Nn0 f9 type kips.Data #txt
Nn0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Read notification</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f9 168 586 112 44 -46 -8 #rect
Nn0 f9 @|UserTaskIcon #fIcon
Nn0 f12 type kips.Data #txt
Nn0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is question needed?</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f12 424 592 32 32 -122 -24 #rect
Nn0 f12 @|AlternativeIcon #fIcon
Nn0 f15 richDialogId kips.documentCommentAnswer #txt
Nn0 f15 startMethod start(kips.Document,kips.Comment,kips.User) #txt
Nn0 f15 requestActionDecl '<kips.Document document, kips.Comment comment, kips.User student> param;' #txt
Nn0 f15 requestMappingAction 'param.document=in.document;
param.comment=in.comment;
param.comment.question=in.comment.question;
param.student=in.user;
param.student.student=in.user.student;
' #txt
Nn0 f15 responseActionDecl 'kips.Data out;
' #txt
Nn0 f15 responseMappingAction 'out=in;
out.comment.comment=result.comment.comment;
' #txt
Nn0 f15 outLinks "TaskA.ivp" #txt
Nn0 f15 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=<%\=ivy.task.getActivatorName()%> has some questions regarding your notification
TaskA.PRI=2
TaskA.ROL=Mentor
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=0' #txt
Nn0 f15 type kips.Data #txt
Nn0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Answer questions</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f15 380 106 112 44 -49 -8 #rect
Nn0 f15 @|UserTaskIcon #fIcon
Nn0 f18 expr in #txt
Nn0 f18 outCond 'in.comment.isQuestionNeeded ==true' #txt
Nn0 f18 type kips.Data #txt
Nn0 f18 var in1 #txt
Nn0 f18 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f18 440 592 436 150 #arcP
Nn0 f18 0 0.04941860465116279 14 0 #arcLabel
Nn0 f13 expr data #txt
Nn0 f13 outCond ivp=="TaskA.ivp" #txt
Nn0 f13 280 608 424 608 #arcP
Nn0 f13 0 0.5077804919086757 0 0 #arcLabel
Nn0 f8 expr in #txt
Nn0 f8 outCond 'in.searchUser.allUserNames.isEmpty() == false' #txt
Nn0 f8 type kips.Data #txt
Nn0 f8 var in1 #txt
Nn0 f8 224 400 224 424 #arcP
Nn0 f10 expr data #txt
Nn0 f10 outCond ivp=="TaskA.ivp" #txt
Nn0 f10 type kips.Data #txt
Nn0 f10 var in1 #txt
Nn0 f10 224 456 224 586 #arcP
Nn0 f11 expr data #txt
Nn0 f11 outCond ivp=="TaskB.ivp" #txt
Nn0 f11 208 440 208 384 #arcP
Nn0 f11 1 176 440 #addKink
Nn0 f11 2 176 384 #addKink
Nn0 f11 2 0.9575239344370038 0 0 #arcLabel
Nn0 f7 actionDecl 'kips.Data out;
' #txt
Nn0 f7 actionTable 'out=in1;
out.searchUser.searchText=in1.searchUser.allUserNames.removeGet(0);
' #txt
Nn0 f7 outTypes "kips.Data","kips.Data" #txt
Nn0 f7 outLinks "TaskA.ivp","TaskB.ivp" #txt
Nn0 f7 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.PRI=2
TaskA.ROL=SYSTEM
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=0
TaskB.EXPRI=2
TaskB.EXROL=Everybody
TaskB.EXTYPE=0
TaskB.PRI=2
TaskB.ROL=SYSTEM
TaskB.SKIP_TASK_LIST=false
TaskB.TYPE=0' #txt
Nn0 f7 type kips.Data #txt
Nn0 f7 template "" #txt
Nn0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Send Notification</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f7 208 424 32 32 -45 13 #rect
Nn0 f7 @|TaskSwitchIcon #fIcon
Nn0 f6 richDialogId kips.documentCommentRead #txt
Nn0 f6 startMethod start(kips.Document,kips.Comment,kips.User) #txt
Nn0 f6 requestActionDecl '<kips.Document document, kips.Comment comment, kips.User student> param;' #txt
Nn0 f6 requestMappingAction 'param.document=in.document;
param.comment=in.comment;
param.student=in.user;
' #txt
Nn0 f6 responseActionDecl 'kips.Data out;
' #txt
Nn0 f6 responseMappingAction 'out=in;
out.comment.isQuestionNeeded=result.comment.isQuestionNeeded;
out.comment.question=result.comment.question;
' #txt
Nn0 f6 outLinks "TaskA.ivp" #txt
Nn0 f6 taskData 'TaskA.EXPRI=2
TaskA.EXROL=Everybody
TaskA.EXTYPE=0
TaskA.NAM=Answer from <%\=ivy.case.getCreatorUser().getFullName()%>
TaskA.PRI=2
TaskA.ROL=in.searchUser.searchText
TaskA.SKIP_TASK_LIST=false
TaskA.TYPE=3' #txt
Nn0 f6 type kips.Data #txt
Nn0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Read answer</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f6 576 586 112 44 -37 -8 #rect
Nn0 f6 @|UserTaskIcon #fIcon
Nn0 f17 expr data #txt
Nn0 f17 outCond ivp=="TaskA.ivp" #txt
Nn0 f17 type kips.Data #txt
Nn0 f17 var in1 #txt
Nn0 f17 492 128 632 586 #arcP
Nn0 f17 1 632 128 #addKink
Nn0 f17 1 0.06161061803624862 0 0 #arcLabel
Nn0 f19 expr data #txt
Nn0 f19 outCond ivp=="TaskA.ivp" #txt
Nn0 f19 576 608 456 608 #arcP
Nn0 f19 0 0.8884420523396231 0 0 #arcLabel
Nn0 f20 actionDecl 'kips.Data out;
' #txt
Nn0 f20 actionTable 'out=in;
' #txt
Nn0 f20 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE INSERT SYSTEM  ""sqlStatements.dtd"">
<INSERT><Table name=''notification''/><Value column=''filename''><AnyExpression>in.document.fileName</AnyExpression></Value><Value column=''message''><AnyExpression>in.message</AnyExpression></Value><Value column=''Mentor''><AnyExpression>in.user.mentorUsername</AnyExpression></Value><Value column=''Path''><AnyExpression>in.document.filePath</AnyExpression></Value></INSERT>' #txt
Nn0 f20 dbUrl kipsDB #txt
Nn0 f20 cache '{/cache false /invalidation false /scope 0 /groupname ""/lifetime_group "0"/invalidation_time_group ""/identifier ""/lifetime_entry "0"/invalidation_time_entry ""}' #txt
Nn0 f20 lotSize 2147483647 #txt
Nn0 f20 startIdx 0 #txt
Nn0 f20 type kips.Data #txt
Nn0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>store notification (with file)</name>
        <nameStyle>30,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f20 144 298 160 44 -71 -8 #rect
Nn0 f20 @|DBStepIcon #fIcon
Nn0 f21 expr out #txt
Nn0 f21 224 342 224 368 #arcP
Nn0 f2 type kips.Data #txt
Nn0 f2 425 649 30 30 0 15 #rect
Nn0 f2 @|EndIcon #fIcon
Nn0 f5 expr in #txt
Nn0 f5 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No
</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Nn0 f5 440 624 440 649 #arcP
Nn0 f5 0 0.749112426035503 11 1 #arcLabel
Nn0 f14 type kips.Data #txt
Nn0 f14 305 369 30 30 0 15 #rect
Nn0 f14 @|EndIcon #fIcon
Nn0 f16 expr in #txt
Nn0 f16 240 384 305 384 #arcP
Nn0 f23 actionDecl 'kips.Data out;
' #txt
Nn0 f23 actionTable 'out=in;
' #txt
Nn0 f23 actionCode 'Date d = new Date();
Time t = new Time();
String path = "\\kips\\Files\\"+in.user.mentorUsername+"\\"+d.toString()+"-"+t.getHours()+"-"+t.getMinutes()+"-"+t.getSeconds()+"\\"+in.document.file.getName();
File file = new File(path);
file.writeBinary(in.document.file.readBinary());

in.document.file.makePersistent(true);
in.document.filePath = file.getAbsolutePath();' #txt
Nn0 f23 type kips.Data #txt
Nn0 f23 168 242 112 44 0 -8 #rect
Nn0 f23 @|StepIcon #fIcon
Nn0 f24 expr out #txt
Nn0 f24 224 150 224 242 #arcP
Nn0 f22 expr out #txt
Nn0 f22 224 286 224 298 #arcP
>Proto Nn0 .type kips.Data #txt
>Proto Nn0 .processKind NORMAL #txt
>Proto Nn0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <desc>No
</desc>
        <swimlaneLabel>Notification</swimlaneLabel>
        <swimlaneLabel>Mentor</swimlaneLabel>
        <swimlaneLabel>Engine</swimlaneLabel>
        <swimlaneLabel>Student</swimlaneLabel>
    </language>
    <swimlaneOrientation>false</swimlaneOrientation>
    <swimlaneSize>576</swimlaneSize>
    <swimlaneSize>192</swimlaneSize>
    <swimlaneSize>240</swimlaneSize>
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
>Proto Nn0 0 0 32 24 18 0 #rect
>Proto Nn0 @|BIcon #fIcon
Nn0 f0 mainOut f4 tail #connect
Nn0 f4 head f3 mainIn #connect
Nn0 f1 out f8 tail #connect
Nn0 f8 head f7 in #connect
Nn0 f7 out f10 tail #connect
Nn0 f10 head f9 in #connect
Nn0 f7 out f11 tail #connect
Nn0 f11 head f1 in #connect
Nn0 f12 out f18 tail #connect
Nn0 f18 head f15 in #connect
Nn0 f9 out f13 tail #connect
Nn0 f13 head f12 in #connect
Nn0 f15 out f17 tail #connect
Nn0 f17 head f6 in #connect
Nn0 f6 out f19 tail #connect
Nn0 f19 head f12 in #connect
Nn0 f20 mainOut f21 tail #connect
Nn0 f21 head f1 in #connect
Nn0 f12 out f5 tail #connect
Nn0 f5 head f2 mainIn #connect
Nn0 f1 out f16 tail #connect
Nn0 f16 head f14 mainIn #connect
Nn0 f3 mainOut f24 tail #connect
Nn0 f24 head f23 mainIn #connect
Nn0 f23 mainOut f22 tail #connect
Nn0 f22 head f20 mainIn #connect
