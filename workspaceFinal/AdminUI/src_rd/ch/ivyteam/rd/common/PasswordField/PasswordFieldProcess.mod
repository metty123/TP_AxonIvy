[Ivy]
[>Created: Thu Jul 22 17:22:05 CEST 2010]
129FABBF02B25F2C 3.14 #module
>Proto >Proto Collection #zClass
Ps0 PasswordFieldProcess Big #zClass
Ps0 RD #cInfo
Ps0 #process
Ps0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ps0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ps0 @TextInP .resExport .resExport #zField
Ps0 @TextInP .type .type #zField
Ps0 @TextInP .processKind .processKind #zField
Ps0 @AnnotationInP-0n ai ai #zField
Ps0 @TextInP .xml .xml #zField
Ps0 @TextInP .responsibility .responsibility #zField
Ps0 @RichDialogInitStart f0 '' #zField
Ps0 @RichDialogProcessEnd f1 '' #zField
Ps0 @PushWFArc f2 '' #zField
Ps0 @RichDialogInitStart f3 '' #zField
Ps0 @RichDialogMethodStart f4 '' #zField
Ps0 @RichDialogMethodStart f5 '' #zField
Ps0 @RichDialogProcessEnd f6 '' #zField
Ps0 @RichDialogProcessEnd f7 '' #zField
Ps0 @PushWFArc f8 '' #zField
Ps0 @PushWFArc f9 '' #zField
Ps0 @PushWFArc f10 '' #zField
>Proto Ps0 Ps0 PasswordFieldProcess #zField
Ps0 f0 guid 129FABBF099C92F5 #txt
Ps0 f0 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f0 method start() #txt
Ps0 f0 disableUIEvents true #txt
Ps0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f0 outParameterDecl '<> result;
' #txt
Ps0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ps0 f0 90 40 20 20 13 0 #rect
Ps0 f0 @|RichDialogInitStartIcon #fIcon
Ps0 f1 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f1 90 140 20 20 13 0 #rect
Ps0 f1 @|RichDialogProcessEndIcon #fIcon
Ps0 f2 expr out #txt
Ps0 f2 100 60 100 140 #arcP
Ps0 f3 guid 129FABD655FB1AEE #txt
Ps0 f3 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f3 method start(String) #txt
Ps0 f3 disableUIEvents true #txt
Ps0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String value> param = methodEvent.getInputArguments();
' #txt
Ps0 f3 inParameterMapAction 'out.value=param.value;
' #txt
Ps0 f3 outParameterDecl '<> result;
' #txt
Ps0 f3 embeddedRdInitializations '* ' #txt
Ps0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String)</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f3 182 38 20 20 13 0 #rect
Ps0 f3 @|RichDialogInitStartIcon #fIcon
Ps0 f4 guid 129FABD80615D5DD #txt
Ps0 f4 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f4 method setValue(String) #txt
Ps0 f4 disableUIEvents false #txt
Ps0 f4 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String value> param = methodEvent.getInputArguments();
' #txt
Ps0 f4 inParameterMapAction 'out.value=param.value;
' #txt
Ps0 f4 outParameterDecl '<> result;
' #txt
Ps0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setValue(String)</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f4 358 46 20 20 13 0 #rect
Ps0 f4 @|RichDialogMethodStartIcon #fIcon
Ps0 f5 guid 129FABD87676414E #txt
Ps0 f5 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f5 method getValue() #txt
Ps0 f5 disableUIEvents false #txt
Ps0 f5 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f5 outParameterDecl '<java.lang.String value> result;
' #txt
Ps0 f5 outParameterMapAction 'result.value=in.value;
' #txt
Ps0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getValue()</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f5 502 46 20 20 13 0 #rect
Ps0 f5 @|RichDialogMethodStartIcon #fIcon
Ps0 f6 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f6 358 142 20 20 13 0 #rect
Ps0 f6 @|RichDialogProcessEndIcon #fIcon
Ps0 f7 type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
Ps0 f7 502 142 20 20 13 0 #rect
Ps0 f7 @|RichDialogProcessEndIcon #fIcon
Ps0 f8 expr out #txt
Ps0 f8 512 66 512 142 #arcP
Ps0 f9 expr out #txt
Ps0 f9 368 66 368 142 #arcP
Ps0 f10 expr out #txt
Ps0 f10 185 55 106 142 #arcP
>Proto Ps0 .ui2RdDataAction 'out.value=panel.passwordField.text;
' #txt
>Proto Ps0 .rdData2UIAction 'panel.passwordField.text=in.value;
' #txt
>Proto Ps0 .type ch.ivyteam.rd.common.PasswordField.PasswordFieldData #txt
>Proto Ps0 .processKind RICH_DIALOG #txt
>Proto Ps0 -8 -8 16 16 16 26 #rect
>Proto Ps0 '' #fIcon
Ps0 f0 mainOut f2 tail #connect
Ps0 f2 head f1 mainIn #connect
Ps0 f5 mainOut f8 tail #connect
Ps0 f8 head f7 mainIn #connect
Ps0 f4 mainOut f9 tail #connect
Ps0 f9 head f6 mainIn #connect
Ps0 f3 mainOut f10 tail #connect
Ps0 f10 head f1 mainIn #connect
