[Ivy]
[>Created: Tue Mar 04 11:59:08 CET 2008]
118796D018A7953B 3.10 #module
>Proto >Proto Collection #zClass
Ns0 NumberFieldProcess Big #zClass
Ns0 RD #cInfo
Ns0 #process
Ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ns0 @AnnotationInP-0n ai ai #zField
Ns0 @MessageFlowInP-0n messageIn messageIn #zField
Ns0 @MessageFlowOutP-0n messageOut messageOut #zField
Ns0 @TextInP .resExport .resExport #zField
Ns0 @TextInP .type .type #zField
Ns0 @TextInP .processKind .processKind #zField
Ns0 @TextInP .xml .xml #zField
Ns0 @TextInP .responsibility .responsibility #zField
Ns0 @RichDialogInitStart f0 '' #zField
Ns0 f0 guid 118796EE03AE12E5 #txt
Ns0 f0 type ch.ivyteam.rd.common.NumberField.NumberFieldData #txt
Ns0 f0 method start() #txt
Ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ns0 f0 outParameterDecl '<> result;
' #txt
Ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ns0 f0 46 46 20 20 13 0 #rect
Ns0 f0 @|RichDialogInitStartIcon #fIcon
Ns0 @RichDialogInitStart f1 '' #zField
Ns0 f1 guid 118796EE39674CDE #txt
Ns0 f1 type ch.ivyteam.rd.common.NumberField.NumberFieldData #txt
Ns0 f1 method start(Number) #txt
Ns0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Number value> param = methodEvent.getInputArguments();
' #txt
Ns0 f1 inParameterMapAction 'out.value=param.value;
' #txt
Ns0 f1 outParameterDecl '<> result;
' #txt
Ns0 f1 embeddedRdInitializations '* ' #txt
Ns0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Number)</name>
        <nameStyle>13,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f1 142 46 20 20 13 0 #rect
Ns0 f1 @|RichDialogInitStartIcon #fIcon
Ns0 @RichDialogMethodStart f2 '' #zField
Ns0 f2 guid 118796EFC4E8A48F #txt
Ns0 f2 type ch.ivyteam.rd.common.NumberField.NumberFieldData #txt
Ns0 f2 method getValue() #txt
Ns0 f2 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ns0 f2 outParameterDecl '<java.lang.Number value> result;
' #txt
Ns0 f2 outParameterMapAction 'result.value=in.value;
' #txt
Ns0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getValue()</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f2 286 46 20 20 13 0 #rect
Ns0 f2 @|RichDialogMethodStartIcon #fIcon
Ns0 @RichDialogMethodStart f3 '' #zField
Ns0 f3 guid 118796EFF9A31B60 #txt
Ns0 f3 type ch.ivyteam.rd.common.NumberField.NumberFieldData #txt
Ns0 f3 method setValue(Number) #txt
Ns0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Number value> param = methodEvent.getInputArguments();
' #txt
Ns0 f3 inParameterMapAction 'out.value=param.value;
' #txt
Ns0 f3 outParameterDecl '<> result;
' #txt
Ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setValue(Number)</name>
        <nameStyle>16,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f3 406 46 20 20 13 0 #rect
Ns0 f3 @|RichDialogMethodStartIcon #fIcon
Ns0 @RichDialogProcessEnd f4 '' #zField
Ns0 f4 type ch.ivyteam.rd.common.NumberField.NumberFieldData #txt
Ns0 f4 259 147 26 26 14 0 #rect
Ns0 f4 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f5 '' #zField
Ns0 f5 expr out #txt
Ns0 f5 407 61 282 152 #arcP
Ns0 @PushWFArc f6 '' #zField
Ns0 f6 expr out #txt
Ns0 f6 293 65 274 147 #arcP
Ns0 @PushWFArc f7 '' #zField
Ns0 f7 expr out #txt
Ns0 f7 159 62 262 151 #arcP
Ns0 @PushWFArc f8 '' #zField
Ns0 f8 expr out #txt
Ns0 f8 65 60 260 154 #arcP
Ns0 f3 mainOut f5 tail #connect
Ns0 f5 head f4 mainIn #connect
Ns0 f2 mainOut f6 tail #connect
Ns0 f6 head f4 mainIn #connect
Ns0 f1 mainOut f7 tail #connect
Ns0 f7 head f4 mainIn #connect
Ns0 f0 mainOut f8 tail #connect
Ns0 f8 head f4 mainIn #connect
>Proto Ns0 Ns0 NumberFieldProcess #zField
>Proto Ns0 .ui2RdDataAction 'out.value=panel.numberTextField.valueAsNumber;
' #txt
>Proto Ns0 .rdData2UIAction 'panel.numberTextField.valueAsNumber=in.value;
' #txt
>Proto Ns0 .type ch.ivyteam.rd.common.NumberField.NumberFieldData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
