[Ivy]
[>Created: Tue Jun 17 09:22:04 ICT 2014]
11781B5EECB478C0 3.17 #module
>Proto >Proto Collection #zClass
Ns0 NewJndiSecuritySystemProcess Big #zClass
Ns0 RD #cInfo
Ns0 #process
Ns0 @MessageFlowInP-0n messageIn messageIn #zField
Ns0 @MessageFlowOutP-0n messageOut messageOut #zField
Ns0 @AnnotationInP-0n ai ai #zField
Ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ns0 @TextInP .xml .xml #zField
Ns0 @TextInP .responsibility .responsibility #zField
Ns0 @TextInP .resExport .resExport #zField
Ns0 @TextInP .type .type #zField
Ns0 @TextInP .processKind .processKind #zField
Ns0 @RichDialogInitStart f0 '' #zField
Ns0 @RichDialogProcessStart f5 '' #zField
Ns0 @RichDialogProcessStart f6 '' #zField
Ns0 @RichDialogProcessStep f9 '' #zField
Ns0 @RichDialogEnd f10 '' #zField
Ns0 @RichDialogEnd f11 '' #zField
Ns0 @PushWFArc f12 '' #zField
Ns0 @RichDialogProcessStep f16 '' #zField
Ns0 @PushWFArc f17 '' #zField
Ns0 @PushWFArc f7 '' #zField
Ns0 @RichDialogProcessEnd f52 '' #zField
Ns0 @PushWFArc f53 '' #zField
Ns0 @RichDialogProcessStep f1 '' #zField
Ns0 @PushWFArc f2 '' #zField
Ns0 @Alternative f4 '' #zField
Ns0 @PushWFArc f8 '' #zField
Ns0 @RichDialog f13 '' #zField
Ns0 @RichDialogProcessEnd f18 '' #zField
Ns0 @PushWFArc f15 '' #zField
Ns0 @Alternative f19 '' #zField
Ns0 @RichDialog f23 '' #zField
Ns0 @Alternative f26 '' #zField
Ns0 @PushWFArc f27 '' #zField
Ns0 @PushWFArc f3 '' #zField
Ns0 @RichDialogProcessEnd f28 '' #zField
Ns0 @PushWFArc f29 '' #zField
Ns0 @RichDialogProcessStep f30 '' #zField
Ns0 @Alternative f25 '' #zField
Ns0 @PushWFArc f33 '' #zField
Ns0 @PushWFArc f34 '' #zField
Ns0 @RichDialog f35 '' #zField
Ns0 @PushWFArc f36 '' #zField
Ns0 @PushWFArc f37 '' #zField
Ns0 @RichDialogInitStart f14 '' #zField
Ns0 @PushWFArc f21 '' #zField
Ns0 @Alternative f41 '' #zField
Ns0 @PushWFArc f42 '' #zField
Ns0 @PushWFArc f39 '' #zField
Ns0 @PushWFArc f24 '' #zField
Ns0 @PushWFArc f22 '' #zField
Ns0 @PushWFArc f31 '' #zField
Ns0 @PushWFArc f20 '' #zField
>Proto Ns0 Ns0 NewJndiSecuritySystemProcess #zField
Ns0 f0 guid 11781F78253A5B01 #txt
Ns0 f0 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f0 method start(ch.ivyteam.ivy.security.ISecurityContext) #txt
Ns0 f0 disableUIEvents false #txt
Ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext> param = methodEvent.getInputArguments();
' #txt
Ns0 f0 outParameterDecl '<java.lang.Boolean canceled> result;
' #txt
Ns0 f0 outParameterMapAction 'result.canceled=in.canceled;
' #txt
Ns0 f0 embeddedRdInitializations '{/jndiSecuritySystemPanel {/fieldName "jndiSecuritySystemPanel"/startMethod "start(ch.ivyteam.ivy.security.ISecurityContext)"/parameterMapping "param.securityContext=callParam.securityContext;\n"/initScript ""/userContext * }/ldapMappingPropertiesPanel {/fieldName "ldapMappingPropertiesPanel"/startMethod "start(ch.ivyteam.ivy.security.ISecurityContext)"/parameterMapping "param.securityContext=callParam.securityContext;\n"/initScript ""/userContext * }}' #txt
Ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext)</name>
        <nameStyle>23,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f0 46 38 20 20 13 0 #rect
Ns0 f0 @|RichDialogInitStartIcon #fIcon
Ns0 f5 guid 117884DDCA819574 #txt
Ns0 f5 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f5 actionTable 'out=in;
' #txt
Ns0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f5 54 326 20 20 13 0 #rect
Ns0 f5 @|RichDialogProcessStartIcon #fIcon
Ns0 f6 guid 117884DE49C15883 #txt
Ns0 f6 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f6 actionTable 'out=in;
' #txt
Ns0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f6 326 326 20 20 13 0 #rect
Ns0 f6 @|RichDialogProcessStartIcon #fIcon
Ns0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f9 actionTable 'out=in;
' #txt
Ns0 f9 actionCode '// save data in other tabs.
panel.jndiSecuritySystemPanel.save();
panel.ldapMappingPropertiesPanel.save();' #txt
Ns0 f9 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Save data to 
security context configuration</name>
        <nameStyle>44,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f9 318 956 36 24 20 -2 #rect
Ns0 f9 @|RichDialogProcessStepIcon #fIcon
Ns0 f10 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f10 guid 117884E152CDBC89 #txt
Ns0 f10 51 491 26 26 14 0 #rect
Ns0 f10 @|RichDialogEndIcon #fIcon
Ns0 f11 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f11 guid 117884E1C545484A #txt
Ns0 f11 323 1027 26 26 14 0 #rect
Ns0 f11 @|RichDialogEndIcon #fIcon
Ns0 f12 expr out #txt
Ns0 f12 336 980 336 1027 #arcP
Ns0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f16 actionTable 'out=in;
out.canceled=true;
' #txt
Ns0 f16 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Set canceled flag
</name>
        <nameStyle>18,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f16 46 404 36 24 20 -2 #rect
Ns0 f16 @|RichDialogProcessStepIcon #fIcon
Ns0 f17 expr out #txt
Ns0 f17 64 346 64 404 #arcP
Ns0 f7 expr out #txt
Ns0 f7 64 428 64 491 #arcP
Ns0 f52 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f52 43 187 26 26 14 0 #rect
Ns0 f52 @|RichDialogProcessEndIcon #fIcon
Ns0 f53 expr out #txt
Ns0 f53 56 58 56 187 #arcP
Ns0 f1 actionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f1 actionTable 'out=in;
' #txt
Ns0 f1 actionCode 'in.erorrMsg = "";

StringBuffer buf = new StringBuffer();
buf.append(panel.jndiSecuritySystemPanel.validate());
buf.append(panel.ldapMappingPropertiesPanel.validate());

in.erorrMsg = buf.toString();' #txt
Ns0 f1 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate input fields</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f1 318 380 36 24 9 -33 #rect
Ns0 f1 @|RichDialogProcessStepIcon #fIcon
Ns0 f2 expr out #txt
Ns0 f2 336 346 336 380 #arcP
Ns0 f4 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check data is valid or not</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f4 322 434 28 28 10 -24 #rect
Ns0 f4 @|AlternativeIcon #fIcon
Ns0 f8 expr out #txt
Ns0 f8 336 404 336 434 #arcP
Ns0 f13 targetWindow NEW:card: #txt
Ns0 f13 targetDisplay TOP #txt
Ns0 f13 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Ns0 f13 startMethod start(String) #txt
Ns0 f13 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f13 requestActionDecl '<String errorMessage> param;' #txt
Ns0 f13 requestMappingAction 'param.errorMessage=in.erorrMsg;
' #txt
Ns0 f13 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f13 responseMappingAction 'out=in;
' #txt
Ns0 f13 windowConfiguration '{/title "Error"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ns0 f13 isAsynch false #txt
Ns0 f13 isInnerRd true #txt
Ns0 f13 userContext '* ' #txt
Ns0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>error msg</name>
        <nameStyle>9,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f13 526 436 36 24 20 -2 #rect
Ns0 f13 @|RichDialogIcon #fIcon
Ns0 f18 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f18 534 486 20 20 13 0 #rect
Ns0 f18 @|RichDialogProcessEndIcon #fIcon
Ns0 f15 expr out #txt
Ns0 f15 544 460 544 486 #arcP
Ns0 f19 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isUserFilterCorrect</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f19 322 586 28 28 5 -38 #rect
Ns0 f19 @|AlternativeIcon #fIcon
Ns0 f23 targetWindow NEW:card: #txt
Ns0 f23 targetDisplay TOP #txt
Ns0 f23 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Ns0 f23 startMethod askQuestion(String,String,List<String>,String) #txt
Ns0 f23 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f23 requestActionDecl '<String icon, String question, List<String> buttons, String defaultButton> param;' #txt
Ns0 f23 requestMappingAction 'param.icon="warning";
param.question=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/NewJNDI/confirmBeforeSaving");
param.buttons=[ivy.cms.co("/Dialogs/general/yes"), ivy.cms.co("/Dialogs/general/no")];
param.defaultButton=ivy.cms.co("/Dialogs/general/yes");
' #txt
Ns0 f23 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f23 responseMappingAction 'out=in;
out.pressedButton=result.pressedButton;
' #txt
Ns0 f23 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/warning\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ns0 f23 isAsynch false #txt
Ns0 f23 isInnerRd true #txt
Ns0 f23 userContext '* ' #txt
Ns0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>confirm &quot;Are you sure you
want to continue?&quot;</name>
        <nameStyle>44,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f23 318 788 36 24 20 -2 #rect
Ns0 f23 @|RichDialogIcon #fIcon
Ns0 f23 -13016147|-1|-16777216 #nodeStyle
Ns0 f26 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>user confirm</name>
        <nameStyle>12,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f26 322 866 28 28 14 -22 #rect
Ns0 f26 @|AlternativeIcon #fIcon
Ns0 f26 -13016147|-1|-16777216 #nodeStyle
Ns0 f27 expr out #txt
Ns0 f27 336 812 336 866 #arcP
Ns0 f3 expr in #txt
Ns0 f3 outCond ivy.cms.co("/Dialogs/general/yes").equalsIgnoreCase(in.pressedButton) #txt
Ns0 f3 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>YES</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f3 336 894 336 956 #arcP
Ns0 f28 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f28 213 949 22 22 14 0 #rect
Ns0 f28 @|RichDialogProcessEndIcon #fIcon
Ns0 f28 -13016147|-1|-16777216 #nodeStyle
Ns0 f29 expr in #txt
Ns0 f29 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>NO</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f29 322 880 224 949 #arcP
Ns0 f29 1 224 880 #addKink
Ns0 f29 0 0.8630342759341703 0 0 #arcLabel
Ns0 f30 actionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f30 actionTable 'out=in;
' #txt
Ns0 f30 actionCode 'in.hasDataChanged = panel.jndiSecuritySystemPanel.checkDataChanged() || panel.ldapMappingPropertiesPanel.checkDataChanged();' #txt
Ns0 f30 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check dirty data</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f30 318 516 36 24 20 -2 #rect
Ns0 f30 @|RichDialogProcessStepIcon #fIcon
Ns0 f30 -13016147|-1|-16777216 #nodeStyle
Ns0 f25 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has dirty data?</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f25 322 722 28 28 14 0 #rect
Ns0 f25 @|AlternativeIcon #fIcon
Ns0 f25 -13016147|-1|-16777216 #nodeStyle
Ns0 f33 expr in #txt
Ns0 f33 outCond in.hasDataChanged #txt
Ns0 f33 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f33 336 750 336 788 #arcP
Ns0 f33 0 0.5 11 0 #arcLabel
Ns0 f34 expr in #txt
Ns0 f34 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f34 322 736 323 1040 #arcP
Ns0 f34 1 160 736 #addKink
Ns0 f34 2 160 1040 #addKink
Ns0 f34 1 0.4967105263157895 11 0 #arcLabel
Ns0 f35 targetWindow NEW:card: #txt
Ns0 f35 targetDisplay TOP #txt
Ns0 f35 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Ns0 f35 startMethod askQuestion(String,String,List<String>) #txt
Ns0 f35 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f35 requestActionDecl '<String icon, String question, List<String> buttons> param;' #txt
Ns0 f35 requestMappingAction 'param.icon="warning";
param.question=ivy.cms.co("/ch/ivyteam/ivy/admin/tool/message/wrongUserFilter");
param.buttons=[ivy.cms.co("/Dialogs/general/ok")];
' #txt
Ns0 f35 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData out;
' #txt
Ns0 f35 responseMappingAction 'out=in;
' #txt
Ns0 f35 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/warning\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ns0 f35 isAsynch false #txt
Ns0 f35 isInnerRd true #txt
Ns0 f35 userContext '* ' #txt
Ns0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Warning</name>
        <nameStyle>7,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f35 454 588 36 24 20 -2 #rect
Ns0 f35 @|RichDialogIcon #fIcon
Ns0 f35 -13016147|-1|-16777216 #nodeStyle
Ns0 f36 expr in #txt
Ns0 f36 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Warning</name>
        <nameStyle>7,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f36 1 #arcStyle
Ns0 f36 350 600 454 600 #arcP
Ns0 f36 0 0.4791666666666667 0 10 #arcLabel
Ns0 f37 expr in #txt
Ns0 f37 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f37 3 #arcStyle
Ns0 f37 350 448 526 448 #arcP
Ns0 f37 0 0.5 0 8 #arcLabel
Ns0 f14 guid 146A3FD1E8571859 #txt
Ns0 f14 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f14 method start(ch.ivyteam.ivy.security.ISecurityContext,Boolean) #txt
Ns0 f14 disableUIEvents true #txt
Ns0 f14 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.security.ISecurityContext securityContext,java.lang.Boolean isEditMask> param = methodEvent.getInputArguments();
' #txt
Ns0 f14 inParameterMapAction 'out.isEditMask=param.isEditMask;
' #txt
Ns0 f14 outParameterDecl '<> result;
' #txt
Ns0 f14 embeddedRdInitializations '{/jndiSecuritySystemPanel {/fieldName "jndiSecuritySystemPanel"/startMethod "start(ch.ivyteam.ivy.security.ISecurityContext)"/parameterMapping "param.securityContext=callParam.securityContext;\n"/initScript ""/userContext * }/ldapMappingPropertiesPanel {/fieldName "ldapMappingPropertiesPanel"/startMethod "start(ch.ivyteam.ivy.security.ISecurityContext)"/parameterMapping "param.securityContext=callParam.securityContext;\n"/initScript ""/userContext * }}' #txt
Ns0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(ISecurityContext,Boolean)</name>
        <nameStyle>31,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f14 181 45 22 22 14 0 #rect
Ns0 f14 @|RichDialogInitStartIcon #fIcon
Ns0 f14 -13016147|-1|-16777216 #nodeStyle
Ns0 f21 expr out #txt
Ns0 f21 184 63 64 190 #arcP
Ns0 f41 type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
Ns0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is edit mask?</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f41 322 658 28 28 14 0 #rect
Ns0 f41 @|AlternativeIcon #fIcon
Ns0 f41 -13016147|-1|-16777216 #nodeStyle
Ns0 f42 expr in #txt
Ns0 f42 outCond 'panel.jndiSecuritySystemPanel.isUserFilterCorrect() || !in.hasDataChanged' #txt
Ns0 f42 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f42 336 614 336 658 #arcP
Ns0 f42 0 0.36046511627906974 -16 1 #arcLabel
Ns0 f39 expr out #txt
Ns0 f39 472 612 347 669 #arcP
Ns0 f39 1 472 640 #addKink
Ns0 f39 1 0.33129452154260536 0 0 #arcLabel
Ns0 f24 expr in #txt
Ns0 f24 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f24 350 672 354 968 #arcP
Ns0 f24 1 512 672 #addKink
Ns0 f24 2 512 968 #addKink
Ns0 f24 1 0.49444444444444446 0 0 #arcLabel
Ns0 f22 expr in #txt
Ns0 f22 outCond in.erorrMsg.trim().isEmpty() #txt
Ns0 f22 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f22 336 462 336 516 #arcP
Ns0 f22 0 0.36363636363636365 -12 0 #arcLabel
Ns0 f31 expr in #txt
Ns0 f31 outCond in.isEditMask #txt
Ns0 f31 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f31 336 686 336 722 #arcP
Ns0 f20 expr out #txt
Ns0 f20 336 540 336 586 #arcP
>Proto Ns0 .type ch.ivyteam.ivy.admin.tool.NewJndiSecuritySystem.NewJndiSecuritySystemData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
Ns0 f9 mainOut f12 tail #connect
Ns0 f12 head f11 mainIn #connect
Ns0 f5 mainOut f17 tail #connect
Ns0 f17 head f16 mainIn #connect
Ns0 f16 mainOut f7 tail #connect
Ns0 f7 head f10 mainIn #connect
Ns0 f0 mainOut f53 tail #connect
Ns0 f53 head f52 mainIn #connect
Ns0 f6 mainOut f2 tail #connect
Ns0 f2 head f1 mainIn #connect
Ns0 f1 mainOut f8 tail #connect
Ns0 f8 head f4 in #connect
Ns0 f13 mainOut f15 tail #connect
Ns0 f15 head f18 mainIn #connect
Ns0 f23 mainOut f27 tail #connect
Ns0 f27 head f26 in #connect
Ns0 f26 out f3 tail #connect
Ns0 f3 head f9 mainIn #connect
Ns0 f26 out f29 tail #connect
Ns0 f29 head f28 mainIn #connect
Ns0 f25 out f33 tail #connect
Ns0 f33 head f23 mainIn #connect
Ns0 f25 out f34 tail #connect
Ns0 f34 head f11 mainIn #connect
Ns0 f36 head f35 mainIn #connect
Ns0 f37 head f13 mainIn #connect
Ns0 f14 mainOut f21 tail #connect
Ns0 f21 head f52 mainIn #connect
Ns0 f19 out f42 tail #connect
Ns0 f42 head f41 in #connect
Ns0 f19 out f36 tail #connect
Ns0 f35 mainOut f39 tail #connect
Ns0 f39 head f41 in #connect
Ns0 f24 head f9 mainIn #connect
Ns0 f41 out f31 tail #connect
Ns0 f31 head f25 in #connect
Ns0 f41 out f24 tail #connect
Ns0 f4 out f22 tail #connect
Ns0 f22 head f30 mainIn #connect
Ns0 f4 out f37 tail #connect
Ns0 f30 mainOut f20 tail #connect
Ns0 f20 head f19 in #connect
