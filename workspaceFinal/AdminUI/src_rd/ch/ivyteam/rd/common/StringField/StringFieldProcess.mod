[Ivy]
[>Created: Tue Mar 04 12:37:22 CET 2008]
11874EF133DFE73D 3.10 #module
>Proto >Proto Collection #zClass
Ss0 StringFieldProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @RichDialogInitStart f0 '' #zField
Ss0 f0 guid 11874F16634CF8C8 #txt
Ss0 f0 type ch.ivyteam.rd.common.StringField.StringFieldData #txt
Ss0 f0 method start() #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ss0 f0 46 46 20 20 13 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 @RichDialogInitStart f1 '' #zField
Ss0 f1 guid 11874F169DD8A046 #txt
Ss0 f1 type ch.ivyteam.rd.common.StringField.StringFieldData #txt
Ss0 f1 method start(String) #txt
Ss0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String value> param = methodEvent.getInputArguments();
' #txt
Ss0 f1 inParameterMapAction 'out.value=param.value;
' #txt
Ss0 f1 outParameterDecl '<> result;
' #txt
Ss0 f1 embeddedRdInitializations '* ' #txt
Ss0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String)</name>
        <nameStyle>13,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f1 166 46 20 20 13 0 #rect
Ss0 f1 @|RichDialogInitStartIcon #fIcon
Ss0 @RichDialogMethodStart f2 '' #zField
Ss0 f2 guid 11874F1822BB52CA #txt
Ss0 f2 type ch.ivyteam.rd.common.StringField.StringFieldData #txt
Ss0 f2 method getValue() #txt
Ss0 f2 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f2 outParameterDecl '<java.lang.String value> result;
' #txt
Ss0 f2 outParameterMapAction 'result.value=in.value;
' #txt
Ss0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getValue()</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f2 334 46 20 20 13 0 #rect
Ss0 f2 @|RichDialogMethodStartIcon #fIcon
Ss0 @RichDialogMethodStart f3 '' #zField
Ss0 f3 guid 11874F1843E6F288 #txt
Ss0 f3 type ch.ivyteam.rd.common.StringField.StringFieldData #txt
Ss0 f3 method setValue(String) #txt
Ss0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String value> param = methodEvent.getInputArguments();
' #txt
Ss0 f3 inParameterMapAction 'out.value=param.value;
' #txt
Ss0 f3 outParameterDecl '<> result;
' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setValue(String)</name>
        <nameStyle>16,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 438 46 20 20 13 0 #rect
Ss0 f3 @|RichDialogMethodStartIcon #fIcon
Ss0 @RichDialogProcessEnd f4 '' #zField
Ss0 f4 type ch.ivyteam.rd.common.StringField.StringFieldData #txt
Ss0 f4 283 251 26 26 14 0 #rect
Ss0 f4 @|RichDialogProcessEndIcon #fIcon
Ss0 @PushWFArc f5 '' #zField
Ss0 f5 expr out #txt
Ss0 f5 63 62 286 255 #arcP
Ss0 @PushWFArc f6 '' #zField
Ss0 f6 expr out #txt
Ss0 f6 180 64 289 252 #arcP
Ss0 @PushWFArc f7 '' #zField
Ss0 f7 expr out #txt
Ss0 f7 341 65 298 251 #arcP
Ss0 @PushWFArc f8 '' #zField
Ss0 f8 expr out #txt
Ss0 f8 442 64 303 253 #arcP
Ss0 f0 mainOut f5 tail #connect
Ss0 f5 head f4 mainIn #connect
Ss0 f1 mainOut f6 tail #connect
Ss0 f6 head f4 mainIn #connect
Ss0 f2 mainOut f7 tail #connect
Ss0 f7 head f4 mainIn #connect
Ss0 f3 mainOut f8 tail #connect
Ss0 f8 head f4 mainIn #connect
>Proto Ss0 Ss0 StringFieldProcess #zField
>Proto Ss0 .type ch.ivyteam.rd.common.StringField.StringFieldData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 .ui2RdDataAction 'out.value=panel.stringTextField.text;
' #txt
>Proto Ss0 .rdData2UIAction 'panel.stringTextField.text=in.value;
' #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
