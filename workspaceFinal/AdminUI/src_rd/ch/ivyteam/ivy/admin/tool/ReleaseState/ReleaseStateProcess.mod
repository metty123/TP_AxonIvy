[Ivy]
[>Created: Tue Jul 08 09:39:56 ICT 2014]
116E79B46307DA2F 3.17 #module
>Proto >Proto Collection #zClass
Rs0 ReleaseStateProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @MessageFlowInP-0n messageIn messageIn #zField
Rs0 @MessageFlowOutP-0n messageOut messageOut #zField
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessStart f1 '' #zField
Rs0 @RichDialogProcessStart f2 '' #zField
Rs0 @RichDialogProcessEnd f3 '' #zField
Rs0 @RichDialogProcessEnd f4 '' #zField
Rs0 @RichDialogProcessEnd f5 '' #zField
Rs0 @RichDialogProcessStep f6 '' #zField
Rs0 @RichDialogProcessStep f7 '' #zField
Rs0 @PushWFArc f10 '' #zField
Rs0 @RichDialogMethodStart f13 '' #zField
Rs0 @RichDialogFireEvent f15 '' #zField
Rs0 @PushWFArc f16 '' #zField
Rs0 @RichDialogFireEvent f17 '' #zField
Rs0 @PushWFArc f18 '' #zField
Rs0 @PushWFArc f11 '' #zField
Rs0 @Alternative f19 '' #zField
Rs0 @RichDialogProcessStep f26 '' #zField
Rs0 @PushWFArc f20 '' #zField
Rs0 @PushWFArc f8 '' #zField
Rs0 @RichDialogProcessStep f24 '' #zField
Rs0 @PushWFArc f25 '' #zField
Rs0 @PushWFArc f14 '' #zField
Rs0 @PushWFArc f12 '' #zField
Rs0 @RichDialogMethodStart f28 '' #zField
Rs0 @RichDialogProcessStep f29 '' #zField
Rs0 @PushWFArc f30 '' #zField
Rs0 @RichDialogProcessEnd f31 '' #zField
Rs0 @PushWFArc f32 '' #zField
Rs0 @PushWFArc f21 '' #zField
Rs0 @RichDialog f22 '' #zField
Rs0 @PushWFArc f23 '' #zField
Rs0 @Alternative f33 '' #zField
Rs0 @PushWFArc f34 '' #zField
Rs0 @PushWFArc f27 '' #zField
Rs0 @RichDialogProcessEnd f35 '' #zField
Rs0 @PushWFArc f36 '' #zField
Rs0 @PushWFArc f9 '' #zField
>Proto Rs0 Rs0 ReleaseStateProcess #zField
Rs0 f0 guid 116E7AF055118023 #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f0 method start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Rs0 f0 disableUIEvents false #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 inParameterMapAction 'out.processModelVersion=param.processModelVersion;
' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 embeddedRdInitializations '* ' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModelVersion)</name>
    </language>
</elementInfo>
' #txt
Rs0 f0 46 46 20 20 13 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 guid 116E7AF1119D4429 #txt
Rs0 f1 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f1 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f1 actionTable 'out=in;
' #txt
Rs0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>release</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f1 470 38 20 20 13 0 #rect
Rs0 f1 @|RichDialogProcessStartIcon #fIcon
Rs0 f2 guid 116E7AF1AA128712 #txt
Rs0 f2 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f2 actionTable 'out=in;
' #txt
Rs0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f2 718 46 20 20 13 0 #rect
Rs0 f2 @|RichDialogProcessStartIcon #fIcon
Rs0 f3 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f3 43 203 26 26 14 0 #rect
Rs0 f3 @|RichDialogProcessEndIcon #fIcon
Rs0 f4 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f4 467 187 26 26 14 0 #rect
Rs0 f4 @|RichDialogProcessEndIcon #fIcon
Rs0 f5 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f5 716 515 24 26 14 0 #rect
Rs0 f5 @|RichDialogProcessEndIcon #fIcon
Rs0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f6 actionTable 'out=in;
' #txt
Rs0 f6 actionCode in.processModelVersion.release(); #txt
Rs0 f6 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>release
</name>
        <nameStyle>8,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f6 462 92 36 24 20 -2 #rect
Rs0 f6 @|RichDialogProcessStepIcon #fIcon
Rs0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f7 actionTable 'out=in;
' #txt
Rs0 f7 actionCode in.processModelVersion.delete(); #txt
Rs0 f7 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete</name>
        <nameStyle>6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f7 710 412 36 24 20 -2 #rect
Rs0 f7 @|RichDialogProcessStepIcon #fIcon
Rs0 f10 expr out #txt
Rs0 f10 480 58 480 92 #arcP
Rs0 f13 guid 11938A4834695BA0 #txt
Rs0 f13 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f13 method refresh() #txt
Rs0 f13 disableUIEvents false #txt
Rs0 f13 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f13 outParameterDecl '<> result;
' #txt
Rs0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Rs0 f13 118 86 20 20 13 0 #rect
Rs0 f13 @|RichDialogMethodStartIcon #fIcon
Rs0 f15 actionDecl 'Number id;
' #txt
Rs0 f15 actionTable 'id=in.processModelVersion.getId();
' #txt
Rs0 f15 actionCode panel.fireProcessModelVersionDeleted(id); #txt
Rs0 f15 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f15 fireEvent processModelVersionDeleted(Number) #txt
Rs0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>fire deleted event</name>
        <nameStyle>18,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f15 710 468 36 24 20 -2 #rect
Rs0 f15 @|RichDialogFireEventIcon #fIcon
Rs0 f16 expr out #txt
Rs0 f16 728 436 728 468 #arcP
Rs0 f17 actionDecl 'Number processModelVersionID;
' #txt
Rs0 f17 actionTable 'processModelVersionID=in.processModelVersion.getId();
' #txt
Rs0 f17 actionCode panel.fireProcessModelVersionReleased(processModelVersionID); #txt
Rs0 f17 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f17 fireEvent processModelVersionReleased(Number) #txt
Rs0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>fire released event</name>
        <nameStyle>19,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f17 462 140 36 24 20 -2 #rect
Rs0 f17 @|RichDialogFireEventIcon #fIcon
Rs0 f18 expr out #txt
Rs0 f18 480 116 480 140 #arcP
Rs0 f11 expr out #txt
Rs0 f11 480 164 480 187 #arcP
Rs0 f19 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f19 714 346 28 28 14 0 #rect
Rs0 f19 @|AlternativeIcon #fIcon
Rs0 f26 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f26 actionTable 'out=in;
' #txt
Rs0 f26 actionCode panel.checkIfDeletable(); #txt
Rs0 f26 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check if deletable</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f26 710 292 36 24 29 -5 #rect
Rs0 f26 @|RichDialogProcessStepIcon #fIcon
Rs0 f20 expr out #txt
Rs0 f20 728 316 728 346 #arcP
Rs0 f8 expr in #txt
Rs0 f8 728 374 728 412 #arcP
Rs0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f24 actionTable 'out=in;
' #txt
Rs0 f24 actionCode panel.checkIfDeletable(); #txt
Rs0 f24 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check if deletable</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f24 38 156 36 24 24 -2 #rect
Rs0 f24 @|RichDialogProcessStepIcon #fIcon
Rs0 f25 expr out #txt
Rs0 f25 128 106 74 160 #arcP
Rs0 f25 1 128 136 #addKink
Rs0 f25 1 0.23155540608907768 0 0 #arcLabel
Rs0 f14 expr out #txt
Rs0 f14 56 66 56 156 #arcP
Rs0 f12 expr out #txt
Rs0 f12 56 180 56 203 #arcP
Rs0 f28 guid 139058C598957710 #txt
Rs0 f28 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f28 method checkIfDeletable() #txt
Rs0 f28 disableUIEvents false #txt
Rs0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>checkIfDeletable()</name>
    </language>
</elementInfo>
' #txt
Rs0 f28 270 38 20 20 13 0 #rect
Rs0 f28 @|RichDialogMethodStartIcon #fIcon
Rs0 f29 actionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f29 actionTable 'out=in;
' #txt
Rs0 f29 actionCode 'import ch.ivyteam.ivy.application.ReleaseState;

ReleaseState pmvState = in.processModelVersion.getReleaseState();
out.pmvHasWrongState = (pmvState != ReleaseState.PREPARED && pmvState != ReleaseState.ARCHIVED);

out.pmvNotDeletableReason = "";
out.pmvIsRequired = in.processModelVersion.isRequired();
if (out.pmvIsRequired && !out.pmvHasWrongState) {
	// do not show a message, when in wrong state - it should be self-explaining
	out.pmvNotDeletableReason = "This process model version can not be deleted because it is required by another PMV.";
}

panel.notDeletableReasonHtmlPane.setText(out.pmvNotDeletableReason);' #txt
Rs0 f29 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set deletable info</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f29 262 116 36 24 28 -14 #rect
Rs0 f29 @|RichDialogProcessStepIcon #fIcon
Rs0 f30 expr out #txt
Rs0 f30 280 58 280 116 #arcP
Rs0 f31 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f31 267 203 26 26 14 0 #rect
Rs0 f31 @|RichDialogProcessEndIcon #fIcon
Rs0 f32 expr out #txt
Rs0 f32 280 140 280 203 #arcP
Rs0 f21 expr in #txt
Rs0 f21 outCond 'in.pmvIsRequired || in.pmvHasWrongState' #txt
Rs0 f21 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>not deletable</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f21 714 360 716 523 #arcP
Rs0 f21 1 648 360 #addKink
Rs0 f21 2 648 496 #addKink
Rs0 f21 0 0.6666666666666666 0 -15 #arcLabel
Rs0 f22 targetWindow NEW:card: #txt
Rs0 f22 targetDisplay TOP #txt
Rs0 f22 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Rs0 f22 startMethod askQuestion(String,String,List<String>) #txt
Rs0 f22 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f22 requestActionDecl '<String icon, String question, List<String> buttons> param;' #txt
Rs0 f22 requestMappingAction 'param.icon="question";
param.question=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/message/confirmDeletePMV", [in.processModelVersion.getName()]);
param.buttons=["yes","no"];
' #txt
Rs0 f22 responseActionDecl 'ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData out;
' #txt
Rs0 f22 responseMappingAction 'out=in;
out.delete=result.pressedButton == "yes";
' #txt
Rs0 f22 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/ivy/admin/tool/message/deleteObject\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Rs0 f22 isAsynch false #txt
Rs0 f22 isInnerRd true #txt
Rs0 f22 userContext '* ' #txt
Rs0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>confirm delete</name>
        <nameStyle>14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f22 710 124 36 24 20 -2 #rect
Rs0 f22 @|RichDialogIcon #fIcon
Rs0 f22 -13016147|-1|-16777216 #nodeStyle
Rs0 f23 expr out #txt
Rs0 f23 728 66 728 124 #arcP
Rs0 f33 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Delete?</name>
        <nameStyle>7,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f33 714 202 28 28 14 0 #rect
Rs0 f33 @|AlternativeIcon #fIcon
Rs0 f33 -13016147|-1|-16777216 #nodeStyle
Rs0 f34 expr out #txt
Rs0 f34 728 148 728 202 #arcP
Rs0 f27 expr in #txt
Rs0 f27 outCond in.delete #txt
Rs0 f27 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f27 728 230 728 292 #arcP
Rs0 f35 type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
Rs0 f35 829 205 22 22 14 0 #rect
Rs0 f35 @|RichDialogProcessEndIcon #fIcon
Rs0 f35 -13016147|-1|-16777216 #nodeStyle
Rs0 f36 expr in #txt
Rs0 f36 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f36 742 216 829 216 #arcP
Rs0 f9 expr out #txt
Rs0 f9 728 492 728 515 #arcP
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.ReleaseState.ReleaseStateData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 .rdData2UIAction 'panel.deleteButton.enabled=!in.pmvIsRequired && !in.pmvHasWrongState;
panel.releaseButton.enabled=in.processModelVersion.getReleaseState() != ch.ivyteam.ivy.application.ReleaseState.RELEASED
&& in.processModelVersion.getReleaseState() != ch.ivyteam.ivy.application.ReleaseState.DELETED;
panel.releaseStateLabel.iconUri="/images/mittel/releaseState/"+in.processModelVersion.getReleaseState().ordinal();
panel.releaseStateLabel.text=in.processModelVersion.getReleaseState().name();
' #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f1 mainOut f10 tail #connect
Rs0 f10 head f6 mainIn #connect
Rs0 f7 mainOut f16 tail #connect
Rs0 f16 head f15 mainIn #connect
Rs0 f15 mainOut f9 tail #connect
Rs0 f9 head f5 mainIn #connect
Rs0 f6 mainOut f18 tail #connect
Rs0 f18 head f17 mainIn #connect
Rs0 f17 mainOut f11 tail #connect
Rs0 f11 head f4 mainIn #connect
Rs0 f26 mainOut f20 tail #connect
Rs0 f20 head f19 in #connect
Rs0 f8 head f7 mainIn #connect
Rs0 f13 mainOut f25 tail #connect
Rs0 f25 head f24 mainIn #connect
Rs0 f0 mainOut f14 tail #connect
Rs0 f14 head f24 mainIn #connect
Rs0 f24 mainOut f12 tail #connect
Rs0 f12 head f3 mainIn #connect
Rs0 f28 mainOut f30 tail #connect
Rs0 f30 head f29 mainIn #connect
Rs0 f29 mainOut f32 tail #connect
Rs0 f32 head f31 mainIn #connect
Rs0 f19 out f21 tail #connect
Rs0 f21 head f5 mainIn #connect
Rs0 f19 out f8 tail #connect
Rs0 f2 mainOut f23 tail #connect
Rs0 f23 head f22 mainIn #connect
Rs0 f22 mainOut f34 tail #connect
Rs0 f34 head f33 in #connect
Rs0 f33 out f27 tail #connect
Rs0 f27 head f26 mainIn #connect
Rs0 f33 out f36 tail #connect
Rs0 f36 head f35 mainIn #connect
