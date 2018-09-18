[Ivy]
[>Created: Tue Jul 16 10:55:48 ICT 2013]
116D963EF1699E38 3.17 #module
>Proto >Proto Collection #zClass
As0 ActivityProcess Big #zClass
As0 RD #cInfo
As0 #process
As0 @MessageFlowInP-0n messageIn messageIn #zField
As0 @MessageFlowOutP-0n messageOut messageOut #zField
As0 @TextInP .resExport .resExport #zField
As0 @TextInP .type .type #zField
As0 @TextInP .processKind .processKind #zField
As0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
As0 @TextInP .rdData2UIAction .rdData2UIAction #zField
As0 @AnnotationInP-0n ai ai #zField
As0 @TextInP .xml .xml #zField
As0 @TextInP .responsibility .responsibility #zField
As0 @RichDialogInitStart f0 '' #zField
As0 @RichDialogProcessStart f1 '' #zField
As0 @RichDialogProcessStart f3 '' #zField
As0 @RichDialogProcessStart f4 '' #zField
As0 @RichDialogProcessEnd f5 '' #zField
As0 @RichDialogProcessStep f7 '' #zField
As0 @RichDialogProcessStep f8 '' #zField
As0 @RichDialogProcessStep f9 '' #zField
As0 @RichDialogProcessEnd f10 '' #zField
As0 @PushWFArc f11 '' #zField
As0 @PushWFArc f12 '' #zField
As0 @PushWFArc f14 '' #zField
As0 @PushWFArc f16 '' #zField
As0 @RichDialogMethodStart f18 '' #zField
As0 @RichDialogFireEvent f2 '' #zField
As0 @PushWFArc f6 '' #zField
As0 @PushWFArc f13 '' #zField
As0 @PushWFArc f21 '' #zField
As0 @PushWFArc f15 '' #zField
As0 @RichDialogBroadcastStart f17 '' #zField
As0 @RichDialogProcessEnd f22 '' #zField
As0 @PushWFArc f23 '' #zField
As0 @PushWFArc f19 '' #zField
As0 @RichDialogInitStart f20 '' #zField
As0 @PushWFArc f24 '' #zField
>Proto As0 As0 ActivityProcess #zField
As0 f0 guid 116D96E5C70E8D91 #txt
As0 f0 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f0 method start(ch.ivyteam.ivy.application.IActivity) #txt
As0 f0 disableUIEvents false #txt
As0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IActivity activity> param = methodEvent.getInputArguments();
' #txt
As0 f0 inParameterMapAction 'out.activity=param.activity;
out.isForPmv=false;
' #txt
As0 f0 outParameterDecl '<> result;
' #txt
As0 f0 embeddedRdInitializations '* ' #txt
As0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IActivity)</name>
        <nameStyle>16,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f0 38 30 20 20 13 0 #rect
As0 f0 @|RichDialogInitStartIcon #fIcon
As0 f1 guid 116D96E63BE13550 #txt
As0 f1 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f1 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f1 actionTable 'out=in;
' #txt
As0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>activate</name>
        <nameStyle>8,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f1 38 230 20 20 13 0 #rect
As0 f1 @|RichDialogProcessStartIcon #fIcon
As0 f3 guid 116D96E7640DC407 #txt
As0 f3 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f3 actionTable 'out=in;
' #txt
As0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deactivate</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f3 206 230 20 20 13 0 #rect
As0 f3 @|RichDialogProcessStartIcon #fIcon
As0 f4 guid 116D96E7DBDD8168 #txt
As0 f4 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f4 actionTable 'out=in;
' #txt
As0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>lock</name>
        <nameStyle>4,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f4 374 230 20 20 13 0 #rect
As0 f4 @|RichDialogProcessStartIcon #fIcon
As0 f5 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f5 203 419 26 26 14 0 #rect
As0 f5 @|RichDialogProcessEndIcon #fIcon
As0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f7 actionTable 'out=in;
' #txt
As0 f7 actionCode 'import ch.ivyteam.ivy.application.IProcessModelVersion;

if (in.activity instanceof IProcessModelVersion) {
  (in.activity as IProcessModelVersion).activateRequiredProcessModelVersions();
} else {
	in.activity.activate();
}' #txt
As0 f7 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Activate</name>
        <nameStyle>8,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f7 30 292 36 24 22 -9 #rect
As0 f7 @|RichDialogProcessStepIcon #fIcon
As0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f8 actionTable 'out=in;
' #txt
As0 f8 actionCode 'import ch.ivyteam.ivy.application.IProcessModelVersion;

if (in.activity instanceof IProcessModelVersion) {
  (in.activity as IProcessModelVersion).deactivateDependentProcessModelVersions();
} else {
	in.activity.deactivate();
}' #txt
As0 f8 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Deactivate</name>
        <nameStyle>10,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f8 198 292 36 24 22 -8 #rect
As0 f8 @|RichDialogProcessStepIcon #fIcon
As0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f9 actionTable 'out=in;
' #txt
As0 f9 actionCode in.activity.lock(); #txt
As0 f9 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Lock</name>
        <nameStyle>4,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f9 366 292 36 24 23 -7 #rect
As0 f9 @|RichDialogProcessStepIcon #fIcon
As0 f10 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f10 35 155 26 26 14 0 #rect
As0 f10 @|RichDialogProcessEndIcon #fIcon
As0 f11 expr out #txt
As0 f11 48 50 48 155 #arcP
As0 f12 expr out #txt
As0 f12 48 250 48 292 #arcP
As0 f14 expr out #txt
As0 f14 216 250 216 292 #arcP
As0 f16 expr out #txt
As0 f16 384 250 384 292 #arcP
As0 f18 guid 11938A245E5E9724 #txt
As0 f18 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f18 method refresh() #txt
As0 f18 disableUIEvents false #txt
As0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
As0 f18 238 62 20 20 13 0 #rect
As0 f18 @|RichDialogMethodStartIcon #fIcon
As0 f2 actionCode panel.fireRefresh(); #txt
As0 f2 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f2 fireEvent refresh() #txt
As0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Fire event: refresh</name>
        <nameStyle>19,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f2 198 356 36 24 27 -9 #rect
As0 f2 @|RichDialogFireEventIcon #fIcon
As0 f6 expr out #txt
As0 f6 384 316 220 356 #arcP
As0 f6 1 384 344 #addKink
As0 f6 2 224 344 #addKink
As0 f6 1 0.4528129097434954 0 0 #arcLabel
As0 f13 expr out #txt
As0 f13 216 316 216 356 #arcP
As0 f21 expr out #txt
As0 f21 48 316 212 356 #arcP
As0 f21 1 48 344 #addKink
As0 f21 2 208 344 #addKink
As0 f21 1 0.47823481101608434 0 0 #arcLabel
As0 f15 expr out #txt
As0 f15 216 380 216 419 #arcP
As0 f17 guid 11F185CBB764AC4C #txt
As0 f17 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f17 broadcast refresh #txt
As0 f17 actionDecl 'ch.ivyteam.ivy.admin.tool.Activity.ActivityData out;
' #txt
As0 f17 actionTable 'out=in;
' #txt
As0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
    </language>
</elementInfo>
' #txt
As0 f17 366 62 20 20 13 0 #rect
As0 f17 @|RichDialogBroadcastStartIcon #fIcon
As0 f22 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f22 235 187 26 26 14 0 #rect
As0 f22 @|RichDialogProcessEndIcon #fIcon
As0 f23 expr out #txt
As0 f23 248 82 248 187 #arcP
As0 f23 0 0.6568723772633573 0 0 #arcLabel
As0 f19 expr out #txt
As0 f19 376 82 248 187 #arcP
As0 f19 1 376 152 #addKink
As0 f19 2 248 152 #addKink
As0 f19 1 0.49506578947368424 0 0 #arcLabel
As0 f20 guid 11F37A64F5A344CB #txt
As0 f20 type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
As0 f20 method start(ch.ivyteam.ivy.application.IActivity,Boolean) #txt
As0 f20 disableUIEvents false #txt
As0 f20 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IActivity activity,java.lang.Boolean isForPmv> param = methodEvent.getInputArguments();
' #txt
As0 f20 inParameterMapAction 'out.activity=param.activity;
out.isForPmv=param.isForPmv;
out.processModelVersion=param.activity as ch.ivyteam.ivy.application.IProcessModelVersion;
' #txt
As0 f20 outParameterDecl '<> result;
' #txt
As0 f20 embeddedRdInitializations '* ' #txt
As0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IActivity,IProcessModelVersion)</name>
        <nameStyle>37,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f20 150 30 20 20 13 0 #rect
As0 f20 @|RichDialogInitStartIcon #fIcon
As0 f24 expr out #txt
As0 f24 160 50 48 155 #arcP
As0 f24 1 160 104 #addKink
As0 f24 2 48 104 #addKink
As0 f24 1 0.48660714285714285 0 0 #arcLabel
>Proto As0 .type ch.ivyteam.ivy.admin.tool.Activity.ActivityData #txt
>Proto As0 .processKind RICH_DIALOG #txt
>Proto As0 .rdData2UIAction 'panel.activateButton.enabled=( 	(!in.isForPmv) || (in.isForPmv && 
	(in.processModelVersion.getReleaseState()==ch.ivyteam.ivy.application.ReleaseState.RELEASED ||
	in.processModelVersion.getReleaseState()==ch.ivyteam.ivy.application.ReleaseState.ARCHIVED ||
	in.processModelVersion.getReleaseState()==ch.ivyteam.ivy.application.ReleaseState.DEPRECATED)))
&&
	(in.activity.getActivityState() == ch.ivyteam.ivy.application.ActivityState.INACTIVE ||	
	in.activity.getActivityState() == ch.ivyteam.ivy.application.ActivityState.LOCKED);
panel.deactivateButton.enabled=(in.activity.getActivityState() == ch.ivyteam.ivy.application.ActivityState.ACTIVE||
in.activity.getActivityState() == ch.ivyteam.ivy.application.ActivityState.LOCKED);
panel.lockButton.enabled=in.activity.getActivityState() == ch.ivyteam.ivy.application.ActivityState.ACTIVE;
panel.operationStateValueLabel.iconUri="/images/24/activityOperation/" + in.activity.getActivityOperationState().toString().toLowerCase();
panel.operationStateValueLabel.text=in.activity.getActivityOperationState().toString();
panel.stateValueLabel.iconUri="/images/24/activity/" + in.activity.getActivityState().intValue();
panel.stateValueLabel.text=in.activity.getActivityStateText();
' #txt
>Proto As0 -8 -8 16 16 16 26 #rect
>Proto As0 '' #fIcon
As0 f0 mainOut f11 tail #connect
As0 f11 head f10 mainIn #connect
As0 f1 mainOut f12 tail #connect
As0 f12 head f7 mainIn #connect
As0 f3 mainOut f14 tail #connect
As0 f14 head f8 mainIn #connect
As0 f4 mainOut f16 tail #connect
As0 f16 head f9 mainIn #connect
As0 f9 mainOut f6 tail #connect
As0 f6 head f2 mainIn #connect
As0 f8 mainOut f13 tail #connect
As0 f13 head f2 mainIn #connect
As0 f7 mainOut f21 tail #connect
As0 f21 head f2 mainIn #connect
As0 f2 mainOut f15 tail #connect
As0 f15 head f5 mainIn #connect
As0 f18 mainOut f23 tail #connect
As0 f23 head f22 mainIn #connect
As0 f17 mainOut f19 tail #connect
As0 f19 head f22 mainIn #connect
As0 f20 mainOut f24 tail #connect
As0 f24 head f10 mainIn #connect
