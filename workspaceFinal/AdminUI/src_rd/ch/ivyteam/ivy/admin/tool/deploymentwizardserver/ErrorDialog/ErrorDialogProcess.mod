[Ivy]
[>Created: Thu Mar 14 08:36:59 ICT 2013]
13C7008F022D393F 3.17 #module
>Proto >Proto Collection #zClass
Es0 ErrorDialogProcess Big #zClass
Es0 RD #cInfo
Es0 #process
Es0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Es0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Es0 @TextInP .resExport .resExport #zField
Es0 @TextInP .type .type #zField
Es0 @TextInP .processKind .processKind #zField
Es0 @AnnotationInP-0n ai ai #zField
Es0 @TextInP .xml .xml #zField
Es0 @TextInP .responsibility .responsibility #zField
Es0 @RichDialogInitStart f0 '' #zField
Es0 @RichDialogProcessEnd f1 '' #zField
Es0 @PushWFArc f2 '' #zField
Es0 @RichDialogInitStart f3 '' #zField
Es0 @RichDialogProcessStep f5 '' #zField
Es0 @PushWFArc f6 '' #zField
Es0 @PushWFArc f4 '' #zField
Es0 @RichDialogProcessStart f7 '' #zField
Es0 @RichDialogEnd f8 '' #zField
Es0 @PushWFArc f9 '' #zField
Es0 @RichDialogInitStart f10 '' #zField
Es0 @RichDialogProcessEnd f12 '' #zField
Es0 @RichDialogProcessStep f11 '' #zField
Es0 @PushWFArc f14 '' #zField
Es0 @PushWFArc f13 '' #zField
Es0 @RichDialogInitStart f15 '' #zField
Es0 @RichDialogProcessEnd f16 '' #zField
Es0 @RichDialogProcessStep f18 '' #zField
Es0 @PushWFArc f19 '' #zField
Es0 @PushWFArc f17 '' #zField
>Proto Es0 Es0 ErrorDialogProcess #zField
Es0 f0 guid 139AE2F9D4F1388B #txt
Es0 f0 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f0 method start() #txt
Es0 f0 disableUIEvents true #txt
Es0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Es0 f0 outParameterDecl '<> result;
' #txt
Es0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Es0 f0 54 142 20 20 13 0 #rect
Es0 f0 @|RichDialogInitStartIcon #fIcon
Es0 f1 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f1 54 238 20 20 13 0 #rect
Es0 f1 @|RichDialogProcessEndIcon #fIcon
Es0 f2 expr out #txt
Es0 f2 64 162 64 238 #arcP
Es0 f3 guid 139AE599E80726F3 #txt
Es0 f3 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f3 method start(String) #txt
Es0 f3 disableUIEvents true #txt
Es0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String errorMessage> param = methodEvent.getInputArguments();
' #txt
Es0 f3 inParameterMapAction 'out.errorMessage=param.errorMessage;
' #txt
Es0 f3 outParameterDecl '<> result;
' #txt
Es0 f3 embeddedRdInitializations '* ' #txt
Es0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String)</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f3 142 78 20 20 13 0 #rect
Es0 f3 @|RichDialogInitStartIcon #fIcon
Es0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData out;
' #txt
Es0 f5 actionTable 'out=in;
' #txt
Es0 f5 actionCode panel.txtErrorMessage.setText(in.errorMessage); #txt
Es0 f5 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set error message</name>
        <nameStyle>17
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f5 134 188 36 24 20 -2 #rect
Es0 f5 @|RichDialogProcessStepIcon #fIcon
Es0 f6 expr out #txt
Es0 f6 152 98 152 188 #arcP
Es0 f6 0 0.5116756780549084 0 0 #arcLabel
Es0 f4 expr out #txt
Es0 f4 152 212 74 248 #arcP
Es0 f4 1 152 248 #addKink
Es0 f4 1 0.11964862172840575 0 0 #arcLabel
Es0 f7 guid 139AE78323D80FD7 #txt
Es0 f7 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData out;
' #txt
Es0 f7 actionTable 'out=in;
' #txt
Es0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>click OK</name>
        <nameStyle>8,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f7 734 54 20 20 13 0 #rect
Es0 f7 @|RichDialogProcessStartIcon #fIcon
Es0 f8 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f8 guid 139AE7847BDA05F6 #txt
Es0 f8 734 182 20 20 13 0 #rect
Es0 f8 @|RichDialogEndIcon #fIcon
Es0 f9 expr out #txt
Es0 f9 744 74 744 182 #arcP
Es0 f10 guid 13C46ADF3AFF2C8F #txt
Es0 f10 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f10 method warning(String) #txt
Es0 f10 disableUIEvents true #txt
Es0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String warning> param = methodEvent.getInputArguments();
' #txt
Es0 f10 inParameterMapAction 'out.errorMessage=param.warning;
' #txt
Es0 f10 outParameterDecl '<> result;
' #txt
Es0 f10 embeddedRdInitializations '* ' #txt
Es0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>warning(String)</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f10 310 86 20 20 13 0 #rect
Es0 f10 @|RichDialogInitStartIcon #fIcon
Es0 f12 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f12 310 190 20 20 13 0 #rect
Es0 f12 @|RichDialogProcessEndIcon #fIcon
Es0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData out;
' #txt
Es0 f11 actionTable 'out=in;
' #txt
Es0 f11 actionCode 'panel.lblIcon.setIconUri(ivy.cms.cr("/ch/ivyteam/ivy/server/deploymentWizard/icon/deployWarning"));
panel.txtErrorMessage.setText(in.errorMessage);' #txt
Es0 f11 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set icon &amp; message</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f11 302 132 36 24 20 -2 #rect
Es0 f11 @|RichDialogProcessStepIcon #fIcon
Es0 f14 expr out #txt
Es0 f14 320 106 320 132 #arcP
Es0 f14 0 0.9380236293711387 0 0 #arcLabel
Es0 f13 expr out #txt
Es0 f13 320 156 320 190 #arcP
Es0 f15 guid 13D635ED8E8E9290 #txt
Es0 f15 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f15 method information(String) #txt
Es0 f15 disableUIEvents true #txt
Es0 f15 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String message> param = methodEvent.getInputArguments();
' #txt
Es0 f15 inParameterMapAction 'out.errorMessage=param.message;
' #txt
Es0 f15 outParameterDecl '<> result;
' #txt
Es0 f15 embeddedRdInitializations '* ' #txt
Es0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>information(String message)</name>
        <nameStyle>27,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Es0 f15 502 86 20 20 13 3 #rect
Es0 f15 @|RichDialogInitStartIcon #fIcon
Es0 f16 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f16 502 190 20 20 13 0 #rect
Es0 f16 @|RichDialogProcessEndIcon #fIcon
Es0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData out;
' #txt
Es0 f18 actionTable 'out=in;
' #txt
Es0 f18 actionCode 'panel.lblIcon.setIconUri(ivy.cms.cr("/ch/ivyteam/ivy/server/deploymentWizard/icon/information"));
panel.txtErrorMessage.setText(in.errorMessage);' #txt
Es0 f18 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
Es0 f18 494 132 36 24 20 -2 #rect
Es0 f18 @|RichDialogProcessStepIcon #fIcon
Es0 f19 expr out #txt
Es0 f19 512 106 512 132 #arcP
Es0 f17 expr out #txt
Es0 f17 512 156 512 190 #arcP
>Proto Es0 .type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog.ErrorDialogData #txt
>Proto Es0 .processKind RICH_DIALOG #txt
>Proto Es0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>start</swimlaneLabel>
        <swimlaneLabel>Event</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>688</swimlaneSize>
    <swimlaneSize>400</swimlaneSize>
    <swimlaneColor>-39220</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
</elementInfo>
' #txt
>Proto Es0 -8 -8 16 16 16 26 #rect
>Proto Es0 '' #fIcon
Es0 f0 mainOut f2 tail #connect
Es0 f2 head f1 mainIn #connect
Es0 f3 mainOut f6 tail #connect
Es0 f6 head f5 mainIn #connect
Es0 f5 mainOut f4 tail #connect
Es0 f4 head f1 mainIn #connect
Es0 f7 mainOut f9 tail #connect
Es0 f9 head f8 mainIn #connect
Es0 f10 mainOut f14 tail #connect
Es0 f14 head f11 mainIn #connect
Es0 f11 mainOut f13 tail #connect
Es0 f13 head f12 mainIn #connect
Es0 f15 mainOut f19 tail #connect
Es0 f19 head f18 mainIn #connect
Es0 f18 mainOut f17 tail #connect
Es0 f17 head f16 mainIn #connect
