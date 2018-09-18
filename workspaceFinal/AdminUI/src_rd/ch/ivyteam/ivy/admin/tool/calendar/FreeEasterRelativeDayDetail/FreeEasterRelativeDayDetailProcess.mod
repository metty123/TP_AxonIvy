[Ivy]
[>Created: Thu May 16 09:40:32 ICT 2013]
13413199E5FA8063 3.17 #module
>Proto >Proto Collection #zClass
Fs0 FreeEasterRelativeDayDetailProcess Big #zClass
Fs0 RD #cInfo
Fs0 #process
Fs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Fs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Fs0 @TextInP .resExport .resExport #zField
Fs0 @TextInP .type .type #zField
Fs0 @TextInP .processKind .processKind #zField
Fs0 @AnnotationInP-0n ai ai #zField
Fs0 @TextInP .xml .xml #zField
Fs0 @TextInP .responsibility .responsibility #zField
Fs0 @RichDialogInitStart f0 '' #zField
Fs0 @RichDialogProcessEnd f1 '' #zField
Fs0 @RichDialogInitStart f3 '' #zField
Fs0 @RichDialogProcessStart f8 '' #zField
Fs0 @RichDialogEnd f9 '' #zField
Fs0 @PushWFArc f10 '' #zField
Fs0 @RichDialogProcessStep f4 '' #zField
Fs0 @PushWFArc f5 '' #zField
Fs0 @PushWFArc f2 '' #zField
Fs0 @PushWFArc f6 '' #zField
>Proto Fs0 Fs0 FreeEasterRelativeDayDetailProcess #zField
Fs0 f0 guid 13413199E8C30C4A #txt
Fs0 f0 type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
Fs0 f0 method create(List<ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay>) #txt
Fs0 f0 disableUIEvents true #txt
Fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay> configuredFreeEasterRelativeDays> param = methodEvent.getInputArguments();
' #txt
Fs0 f0 inParameterMapAction 'out.configuredFreeEasterRelativeDay=param.configuredFreeEasterRelativeDays;
out.data=new ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay(0);
' #txt
Fs0 f0 outParameterDecl '<> result;
' #txt
Fs0 f0 embeddedRdInitializations '* ' #txt
Fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create(List&lt;FreeEasterRelativeDay&gt;)</name>
        <nameStyle>35,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f0 54 38 20 20 13 0 #rect
Fs0 f0 @|RichDialogInitStartIcon #fIcon
Fs0 f1 type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
Fs0 f1 54 140 20 20 13 0 #rect
Fs0 f1 @|RichDialogProcessEndIcon #fIcon
Fs0 f3 guid 13413634E64C73B7 #txt
Fs0 f3 type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
Fs0 f3 method start() #txt
Fs0 f3 disableUIEvents true #txt
Fs0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Fs0 f3 inParameterMapAction 'out.data=new ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay(0);
' #txt
Fs0 f3 outParameterDecl '<> result;
' #txt
Fs0 f3 embeddedRdInitializations '* ' #txt
Fs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create()</name>
        <nameStyle>8,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f3 334 38 20 20 13 0 #rect
Fs0 f3 @|RichDialogInitStartIcon #fIcon
Fs0 f8 guid 1341373F7034141C #txt
Fs0 f8 type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
Fs0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData out;
' #txt
Fs0 f8 actionTable 'out=in;
' #txt
Fs0 f8 actionCode out.configuredFreeEasterRelativeDay.add(out.data); #txt
Fs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f8 414 38 20 20 13 0 #rect
Fs0 f8 @|RichDialogProcessStartIcon #fIcon
Fs0 f9 type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
Fs0 f9 guid 13413741C3049770 #txt
Fs0 f9 414 140 20 20 13 0 #rect
Fs0 f9 @|RichDialogEndIcon #fIcon
Fs0 f10 expr out #txt
Fs0 f10 424 58 424 140 #arcP
Fs0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData out;
' #txt
Fs0 f4 actionTable 'out=in;
' #txt
Fs0 f4 actionCode panel.getRootPane().setDefaultButton(panel.okButton); #txt
Fs0 f4 type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
Fs0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default button to ok</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f4 46 84 36 24 20 -2 #rect
Fs0 f4 @|RichDialogProcessStepIcon #fIcon
Fs0 f5 expr out #txt
Fs0 f5 64 58 64 84 #arcP
Fs0 f2 expr out #txt
Fs0 f2 64 108 64 140 #arcP
Fs0 f6 expr out #txt
Fs0 f6 334 49 82 93 #arcP
>Proto Fs0 .ui2RdDataAction 'out.data.daysSinceEaster=panel.dataDaysSinceEasterRTextField.valueAsNumber;
out.data.description=panel.dataDescriptionRTextField.text;
' #txt
>Proto Fs0 .rdData2UIAction 'panel.dataDaysSinceEasterRTextField.valueAsNumber=in.data.daysSinceEaster;
panel.dataDescriptionRTextField.text=in.data.description;
' #txt
>Proto Fs0 .type ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail.FreeEasterRelativeDayDetailData #txt
>Proto Fs0 .processKind RICH_DIALOG #txt
>Proto Fs0 -8 -8 16 16 16 26 #rect
>Proto Fs0 '' #fIcon
Fs0 f8 mainOut f10 tail #connect
Fs0 f10 head f9 mainIn #connect
Fs0 f0 mainOut f5 tail #connect
Fs0 f5 head f4 mainIn #connect
Fs0 f4 mainOut f2 tail #connect
Fs0 f2 head f1 mainIn #connect
Fs0 f3 mainOut f6 tail #connect
Fs0 f6 head f4 mainIn #connect
