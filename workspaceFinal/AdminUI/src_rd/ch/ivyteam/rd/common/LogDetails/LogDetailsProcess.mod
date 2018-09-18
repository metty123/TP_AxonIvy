[Ivy]
[>Created: Mon Aug 11 17:31:03 ICT 2014]
147A3C26631CF29D 3.17 #module
>Proto >Proto Collection #zClass
Ls0 LogDetailsProcess Big #zClass
Ls0 RD #cInfo
Ls0 #process
Ls0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ls0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ls0 @TextInP .resExport .resExport #zField
Ls0 @TextInP .type .type #zField
Ls0 @TextInP .processKind .processKind #zField
Ls0 @AnnotationInP-0n ai ai #zField
Ls0 @MessageFlowInP-0n messageIn messageIn #zField
Ls0 @MessageFlowOutP-0n messageOut messageOut #zField
Ls0 @TextInP .xml .xml #zField
Ls0 @TextInP .responsibility .responsibility #zField
Ls0 @RichDialogInitStart f0 '' #zField
Ls0 @RichDialogProcessEnd f1 '' #zField
Ls0 @RichDialogProcessStep f3 '' #zField
Ls0 @PushWFArc f4 '' #zField
Ls0 @PushWFArc f2 '' #zField
Ls0 @RichDialogProcessStart f5 '' #zField
Ls0 @RichDialogEnd f6 '' #zField
Ls0 @PushWFArc f7 '' #zField
Ls0 @RichDialogBroadcastStart f18 '' #zField
Ls0 @RichDialogEnd f21 '' #zField
Ls0 @PushWFArc f22 '' #zField
Ls0 @RichDialogInitStart f16 '' #zField
Ls0 @PushWFArc f27 '' #zField
Ls0 @RichDialogBroadcastStart f8 '' #zField
Ls0 @RichDialogProcessStep f125 '' #zField
Ls0 @PushWFArc f9 '' #zField
Ls0 @RichDialogProcessEnd f10 '' #zField
Ls0 @PushWFArc f17 '' #zField
Ls0 @RichDialogBroadcastStart f26 '' #zField
Ls0 @RichDialogProcessStep f31 '' #zField
Ls0 @RichDialogProcessEnd f36 '' #zField
Ls0 @PushWFArc f42 '' #zField
Ls0 @PushWFArc f43 '' #zField
>Proto Ls0 Ls0 LogDetailsProcess #zField
Ls0 f0 guid 147A3C2665621FF8 #txt
Ls0 f0 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f0 method start() #txt
Ls0 f0 disableUIEvents true #txt
Ls0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ls0 f0 outParameterDecl '<> result;
' #txt
Ls0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ls0 f0 53 85 22 22 14 0 #rect
Ls0 f0 @|RichDialogInitStartIcon #fIcon
Ls0 f1 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f1 53 213 22 22 14 0 #rect
Ls0 f1 @|RichDialogProcessEndIcon #fIcon
Ls0 f3 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f3 actionTable 'out=in;
' #txt
Ls0 f3 actionCode 'panel.getRootPane().setDefaultButton(panel.closeButton);

panel.detailTextArea.setText("");' #txt
Ls0 f3 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default button
append message</name>
        <nameStyle>33,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f3 46 148 36 24 20 -2 #rect
Ls0 f3 @|RichDialogProcessStepIcon #fIcon
Ls0 f4 expr out #txt
Ls0 f4 64 107 64 148 #arcP
Ls0 f2 expr out #txt
Ls0 f2 64 172 64 213 #arcP
Ls0 f5 guid 147A3CBC88F3814E #txt
Ls0 f5 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f5 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f5 actionTable 'out=in;
' #txt
Ls0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f5 413 61 22 22 14 0 #rect
Ls0 f5 @|RichDialogProcessStartIcon #fIcon
Ls0 f6 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f6 guid 147A3CC007EC27D3 #txt
Ls0 f6 413 141 22 22 14 0 #rect
Ls0 f6 @|RichDialogEndIcon #fIcon
Ls0 f7 expr out #txt
Ls0 f7 424 83 424 141 #arcP
Ls0 f18 guid 147AFD0DDC4C2E52 #txt
Ls0 f18 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f18 broadcast tellLogDetailsDialogToCloseItself #txt
Ls0 f18 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f18 actionTable 'out=in;
' #txt
Ls0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>tellLogDetailsDialogToCloseItself</name>
    </language>
</elementInfo>
' #txt
Ls0 f18 613 69 22 22 15 -1 #rect
Ls0 f18 @|RichDialogBroadcastStartIcon #fIcon
Ls0 f21 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f21 guid 147AFD1D1C62CE2E #txt
Ls0 f21 613 197 22 22 14 0 #rect
Ls0 f21 @|RichDialogEndIcon #fIcon
Ls0 f22 expr out #txt
Ls0 f22 624 91 624 197 #arcP
Ls0 f16 guid 147AFF9EF795D86D #txt
Ls0 f16 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f16 method start(ch.ivyteam.ivy.security.ISecurityContext) #txt
Ls0 f16 disableUIEvents true #txt
Ls0 f16 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext> param = methodEvent.getInputArguments();
' #txt
Ls0 f16 inParameterMapAction 'out.securityContext=param.securityContext;
' #txt
Ls0 f16 outParameterDecl '<> result;
' #txt
Ls0 f16 embeddedRdInitializations '* ' #txt
Ls0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext)</name>
        <nameStyle>23,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f16 149 85 22 22 14 0 #rect
Ls0 f16 @|RichDialogInitStartIcon #fIcon
Ls0 f27 expr out #txt
Ls0 f27 150 102 82 148 #arcP
Ls0 f8 guid 147C41EAD7E9341A #txt
Ls0 f8 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f8 broadcast informUserSynchronizationIsCompleted #txt
Ls0 f8 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f8 actionTable 'out=in;
' #txt
Ls0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>informUserSynchronizationIsCompleted</name>
        <nameStyle>36,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f8 917 69 22 22 14 0 #rect
Ls0 f8 @|RichDialogBroadcastStartIcon #fIcon
Ls0 f125 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f125 actionTable 'out=in;
' #txt
Ls0 f125 actionCode 'panel.progressLog.value = panel.progressLog.maximum;
panel.progressLog.indeterminate = false;
panel.progressLog.string = ivy.cms.co("/Dialogs/security/synchIsCompleted");' #txt
Ls0 f125 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f125 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update progress bar state</name>
        <nameStyle>25,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f125 910 132 36 24 27 -2 #rect
Ls0 f125 @|RichDialogProcessStepIcon #fIcon
Ls0 f9 expr out #txt
Ls0 f9 928 91 928 132 #arcP
Ls0 f10 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f10 917 205 22 22 14 0 #rect
Ls0 f10 @|RichDialogProcessEndIcon #fIcon
Ls0 f17 expr out #txt
Ls0 f17 928 156 928 205 #arcP
Ls0 f26 guid 147C424D58F23A46 #txt
Ls0 f26 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f26 broadcast informUserSynchronizationHasNewMessage #txt
Ls0 f26 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f26 actionTable 'out=in;
out.logMessage=param.newMessage;
' #txt
Ls0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>informUserSynchronizationHasNewMessage</name>
        <nameStyle>38,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f26 613 245 22 22 14 0 #rect
Ls0 f26 @|RichDialogBroadcastStartIcon #fIcon
Ls0 f31 actionDecl 'ch.ivyteam.rd.common.LogDetails.LogDetailsData out;
' #txt
Ls0 f31 actionTable 'out=in;
' #txt
Ls0 f31 actionCode panel.detailTextArea.append(in.logMessage); #txt
Ls0 f31 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update text message</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f31 606 316 36 24 20 -2 #rect
Ls0 f31 @|RichDialogProcessStepIcon #fIcon
Ls0 f36 type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
Ls0 f36 613 405 22 22 14 0 #rect
Ls0 f36 @|RichDialogProcessEndIcon #fIcon
Ls0 f42 expr out #txt
Ls0 f42 624 267 624 316 #arcP
Ls0 f43 expr out #txt
Ls0 f43 624 340 624 405 #arcP
>Proto Ls0 .type ch.ivyteam.rd.common.LogDetails.LogDetailsData #txt
>Proto Ls0 .processKind RICH_DIALOG #txt
>Proto Ls0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>start</swimlaneLabel>
        <swimlaneLabel>Close Diaglog</swimlaneLabel>
        <swimlaneLabel>Broadcast User Synchronization </swimlaneLabel>
    </language>
    <swimlaneOrientation>true</swimlaneOrientation>
    <swimlaneSize>304</swimlaneSize>
    <swimlaneSize>240</swimlaneSize>
    <swimlaneSize>624</swimlaneSize>
    <swimlaneColor gradient="false">-6697729</swimlaneColor>
    <swimlaneColor gradient="false">-6710785</swimlaneColor>
    <swimlaneColor gradient="false">-10027162</swimlaneColor>
    <swimlaneType>LANE</swimlaneType>
    <swimlaneType>LANE</swimlaneType>
    <swimlaneType>LANE</swimlaneType>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
    <swimlaneSpaceBefore>0</swimlaneSpaceBefore>
</elementInfo>
' #txt
>Proto Ls0 -8 -8 16 16 16 26 #rect
>Proto Ls0 '' #fIcon
Ls0 f0 mainOut f4 tail #connect
Ls0 f4 head f3 mainIn #connect
Ls0 f3 mainOut f2 tail #connect
Ls0 f2 head f1 mainIn #connect
Ls0 f5 mainOut f7 tail #connect
Ls0 f7 head f6 mainIn #connect
Ls0 f18 mainOut f22 tail #connect
Ls0 f22 head f21 mainIn #connect
Ls0 f16 mainOut f27 tail #connect
Ls0 f27 head f3 mainIn #connect
Ls0 f8 mainOut f9 tail #connect
Ls0 f9 head f125 mainIn #connect
Ls0 f125 mainOut f17 tail #connect
Ls0 f17 head f10 mainIn #connect
Ls0 f26 mainOut f42 tail #connect
Ls0 f42 head f31 mainIn #connect
Ls0 f31 mainOut f43 tail #connect
Ls0 f43 head f36 mainIn #connect
