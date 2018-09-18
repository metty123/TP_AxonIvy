[Ivy]
[>Created: Tue Dec 13 11:52:22 CET 2011]
1340EE75DD1C6792 3.17 #module
>Proto >Proto Collection #zClass
ws0 workingTimeDetailsProcess Big #zClass
ws0 RD #cInfo
ws0 #process
ws0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
ws0 @TextInP .rdData2UIAction .rdData2UIAction #zField
ws0 @TextInP .resExport .resExport #zField
ws0 @TextInP .type .type #zField
ws0 @TextInP .processKind .processKind #zField
ws0 @AnnotationInP-0n ai ai #zField
ws0 @TextInP .xml .xml #zField
ws0 @TextInP .responsibility .responsibility #zField
ws0 @RichDialogInitStart f0 '' #zField
ws0 @RichDialogProcessEnd f1 '' #zField
ws0 @RichDialogInitStart f8 '' #zField
ws0 @RichDialogProcessStart f3 '' #zField
ws0 @RichDialogEnd f4 '' #zField
ws0 @PushWFArc f5 '' #zField
ws0 @RichDialogProcessStep f2 '' #zField
ws0 @PushWFArc f6 '' #zField
ws0 @PushWFArc f7 '' #zField
ws0 @PushWFArc f11 '' #zField
>Proto ws0 ws0 workingTimeDetailsProcess #zField
ws0 f0 guid 1340EE75DE8705AB #txt
ws0 f0 type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
ws0 f0 method start() #txt
ws0 f0 disableUIEvents true #txt
ws0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
ws0 f0 outParameterDecl '<> result;
' #txt
ws0 f0 embeddedRdInitializations '* ' #txt
ws0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ws0 f0 90 40 20 20 13 0 #rect
ws0 f0 @|RichDialogInitStartIcon #fIcon
ws0 f1 type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
ws0 f1 90 206 20 20 13 0 #rect
ws0 f1 @|RichDialogProcessEndIcon #fIcon
ws0 f8 guid 13412669009D1FBF #txt
ws0 f8 type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
ws0 f8 method createWorkingTime(List<ch.ivyteam.ivy.application.calendar.WorkingTime>) #txt
ws0 f8 disableUIEvents true #txt
ws0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.calendar.WorkingTime> configuredWorkingTimes> param = methodEvent.getInputArguments();
' #txt
ws0 f8 inParameterMapAction 'out.configuredWorkingTimes=param.configuredWorkingTimes;
out.workingTime=new ch.ivyteam.ivy.application.calendar.WorkingTime(new Time(08,00,00),new Time(17,00,00));
' #txt
ws0 f8 outParameterDecl '<> result;
' #txt
ws0 f8 embeddedRdInitializations '* ' #txt
ws0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createWorkingTime()</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ws0 f8 342 38 20 20 13 0 #rect
ws0 f8 @|RichDialogInitStartIcon #fIcon
ws0 f3 guid 1341268BB3D58989 #txt
ws0 f3 type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
ws0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData out;
' #txt
ws0 f3 actionTable 'out=in;
' #txt
ws0 f3 actionCode out.configuredWorkingTimes.add(out.workingTime); #txt
ws0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>closeDialog</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ws0 f3 94 326 20 20 13 0 #rect
ws0 f3 @|RichDialogProcessStartIcon #fIcon
ws0 f4 type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
ws0 f4 guid 134126904195FA3B #txt
ws0 f4 94 438 20 20 13 0 #rect
ws0 f4 @|RichDialogEndIcon #fIcon
ws0 f5 expr out #txt
ws0 f5 104 346 104 438 #arcP
ws0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData out;
' #txt
ws0 f2 actionTable 'out=in;
' #txt
ws0 f2 actionCode panel.getRootPane().setDefaultButton(panel.okButton); #txt
ws0 f2 type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
ws0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default button to ok</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
ws0 f2 82 116 36 24 20 -2 #rect
ws0 f2 @|RichDialogProcessStepIcon #fIcon
ws0 f6 expr out #txt
ws0 f6 100 60 100 116 #arcP
ws0 f7 expr out #txt
ws0 f7 100 140 100 206 #arcP
ws0 f11 expr out #txt
ws0 f11 342 51 118 122 #arcP
>Proto ws0 .ui2RdDataAction 'out.workingTime.description=panel.descriptionTextField.text;
out.workingTime.end=panel.endTextField.valueAsTime;
out.workingTime.start=panel.startTextField.valueAsTime;
' #txt
>Proto ws0 .rdData2UIAction 'panel.descriptionTextField.text=in.workingTime.description;
panel.endTextField.valueAsTime=in.workingTime.end;
panel.startTextField.valueAsTime=in.workingTime.start;
' #txt
>Proto ws0 .type ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails.workingTimeDetailsData #txt
>Proto ws0 .processKind RICH_DIALOG #txt
>Proto ws0 -8 -8 16 16 16 26 #rect
>Proto ws0 '' #fIcon
ws0 f3 mainOut f5 tail #connect
ws0 f5 head f4 mainIn #connect
ws0 f0 mainOut f6 tail #connect
ws0 f6 head f2 mainIn #connect
ws0 f2 mainOut f7 tail #connect
ws0 f7 head f1 mainIn #connect
ws0 f8 mainOut f11 tail #connect
ws0 f11 head f2 mainIn #connect
