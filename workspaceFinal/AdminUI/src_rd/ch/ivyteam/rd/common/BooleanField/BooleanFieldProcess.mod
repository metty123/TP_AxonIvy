[Ivy]
[>Created: Thu Mar 27 14:24:03 CET 2008]
11878EA4298A387B 3.10 #module
>Proto >Proto Collection #zClass
Bs0 BooleanFieldProcess Big #zClass
Bs0 RD #cInfo
Bs0 #process
Bs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Bs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Bs0 @AnnotationInP-0n ai ai #zField
Bs0 @MessageFlowInP-0n messageIn messageIn #zField
Bs0 @MessageFlowOutP-0n messageOut messageOut #zField
Bs0 @TextInP .resExport .resExport #zField
Bs0 @TextInP .type .type #zField
Bs0 @TextInP .processKind .processKind #zField
Bs0 @TextInP .xml .xml #zField
Bs0 @TextInP .responsibility .responsibility #zField
Bs0 @RichDialogInitStart f0 '' #zField
Bs0 f0 guid 1187910525CD18F5 #txt
Bs0 f0 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f0 method start() #txt
Bs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Bs0 f0 outParameterDecl '<> result;
' #txt
Bs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Bs0 f0 14 22 20 20 13 0 #rect
Bs0 f0 @|RichDialogInitStartIcon #fIcon
Bs0 @RichDialogInitStart f1 '' #zField
Bs0 f1 guid 118791A4A05A3AA1 #txt
Bs0 f1 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f1 method start(Boolean) #txt
Bs0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Boolean value> param = methodEvent.getInputArguments();
' #txt
Bs0 f1 inParameterMapAction 'out.value=param.value;
' #txt
Bs0 f1 outParameterDecl '<> result;
' #txt
Bs0 f1 embeddedRdInitializations '* ' #txt
Bs0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Boolean)</name>
        <nameStyle>14,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Bs0 f1 222 22 20 20 13 0 #rect
Bs0 f1 @|RichDialogInitStartIcon #fIcon
Bs0 @RichDialogMethodStart f2 '' #zField
Bs0 f2 guid 118791A5EC029FD3 #txt
Bs0 f2 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f2 method getValue() #txt
Bs0 f2 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Bs0 f2 outParameterDecl '<java.lang.Boolean value> result;
' #txt
Bs0 f2 outParameterMapAction 'result.value=in.value;
' #txt
Bs0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getValue()</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Bs0 f2 438 22 20 20 13 0 #rect
Bs0 f2 @|RichDialogMethodStartIcon #fIcon
Bs0 @RichDialogMethodStart f3 '' #zField
Bs0 f3 guid 118791A6A171B956 #txt
Bs0 f3 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f3 method setValue(Boolean) #txt
Bs0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Boolean value> param = methodEvent.getInputArguments();
' #txt
Bs0 f3 inParameterMapAction 'out.value=param.value;
' #txt
Bs0 f3 outParameterDecl '<> result;
' #txt
Bs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setValue(Boolean)</name>
        <nameStyle>17,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Bs0 f3 326 22 20 20 13 0 #rect
Bs0 f3 @|RichDialogMethodStartIcon #fIcon
Bs0 @RichDialogProcessEnd f7 '' #zField
Bs0 f7 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f7 147 243 26 26 14 0 #rect
Bs0 f7 @|RichDialogProcessEndIcon #fIcon
Bs0 @PushWFArc f9 '' #zField
Bs0 f9 expr out #txt
Bs0 f9 440 38 170 248 #arcP
Bs0 @RichDialogInitStart f11 '' #zField
Bs0 f11 guid 118C63926F878666 #txt
Bs0 f11 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f11 method start(Boolean,Boolean) #txt
Bs0 f11 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Boolean value,java.lang.Boolean useYesNoTitles> param = methodEvent.getInputArguments();
' #txt
Bs0 f11 inParameterMapAction 'out.useYesNoTitles=param.useYesNoTitles;
out.value=param.value;
' #txt
Bs0 f11 outParameterDecl '<> result;
' #txt
Bs0 f11 embeddedRdInitializations '* ' #txt
Bs0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Boolean,Boolean)</name>
        <nameStyle>22,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Bs0 f11 102 22 20 20 13 0 #rect
Bs0 f11 @|RichDialogInitStartIcon #fIcon
Bs0 @RichDialogProcessStep f12 '' #zField
Bs0 f12 actionDecl 'ch.ivyteam.rd.common.BooleanField.BooleanFieldData out;
' #txt
Bs0 f12 actionTable 'out=in;
' #txt
Bs0 f12 actionCode 'in.data = new List<Boolean>();
in.data.add(false);
in.data.add(true);' #txt
Bs0 f12 type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
Bs0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Init list</name>
        <nameStyle>9,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Bs0 f12 142 108 36 24 20 -2 #rect
Bs0 f12 @|RichDialogProcessStepIcon #fIcon
Bs0 f12 -13016147|-1|-16777216 #nodeStyle
Bs0 @PushWFArc f14 '' #zField
Bs0 f14 expr out #txt
Bs0 f14 225 39 170 108 #arcP
Bs0 @PushWFArc f5 '' #zField
Bs0 f5 expr out #txt
Bs0 f5 116 40 153 108 #arcP
Bs0 @PushWFArc f13 '' #zField
Bs0 f13 expr out #txt
Bs0 f13 32 37 142 108 #arcP
Bs0 @PushWFArc f15 '' #zField
Bs0 f15 expr out #txt
Bs0 f15 329 39 168 245 #arcP
Bs0 @PushWFArc f6 '' #zField
Bs0 f6 expr out #txt
Bs0 f6 160 132 160 243 #arcP
Bs0 f2 mainOut f9 tail #connect
Bs0 f9 head f7 mainIn #connect
Bs0 f1 mainOut f14 tail #connect
Bs0 f14 head f12 mainIn #connect
Bs0 f11 mainOut f5 tail #connect
Bs0 f5 head f12 mainIn #connect
Bs0 f0 mainOut f13 tail #connect
Bs0 f13 head f12 mainIn #connect
Bs0 f3 mainOut f15 tail #connect
Bs0 f15 head f7 mainIn #connect
Bs0 f12 mainOut f6 tail #connect
Bs0 f6 head f7 mainIn #connect
>Proto Bs0 Bs0 BooleanFieldProcess #zField
>Proto Bs0 .ui2RdDataAction 'out.value=panel.booleanComboBox.selectedListEntry as Boolean;
' #txt
>Proto Bs0 .rdData2UIAction 'panel.booleanComboBox.listData=in.data;
panel.booleanComboBox.selectedListEntry=in.value;
' #txt
>Proto Bs0 .type ch.ivyteam.rd.common.BooleanField.BooleanFieldData #txt
>Proto Bs0 .processKind RICH_DIALOG #txt
>Proto Bs0 -8 -8 16 16 16 26 #rect
>Proto Bs0 '' #fIcon
