[Ivy]
[>Created: Thu May 16 09:28:28 ICT 2013]
13413ABD93526256 3.17 #module
>Proto >Proto Collection #zClass
Fs0 FreeDayOfYearDetailProcess Big #zClass
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
Fs0 @RichDialogProcessStart f6 '' #zField
Fs0 @RichDialogEnd f7 '' #zField
Fs0 @PushWFArc f8 '' #zField
Fs0 @RichDialogProcessStep f9 '' #zField
Fs0 @PushWFArc f10 '' #zField
Fs0 @PushWFArc f2 '' #zField
Fs0 @PushWFArc f11 '' #zField
>Proto Fs0 Fs0 FreeDayOfYearDetailProcess #zField
Fs0 f0 guid 13413ABD95D7628C #txt
Fs0 f0 type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
Fs0 f0 method start() #txt
Fs0 f0 disableUIEvents true #txt
Fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Fs0 f0 outParameterDecl '<> result;
' #txt
Fs0 f0 embeddedRdInitializations '* ' #txt
Fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f0 90 40 20 20 13 0 #rect
Fs0 f0 @|RichDialogInitStartIcon #fIcon
Fs0 f1 type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
Fs0 f1 90 140 20 20 13 0 #rect
Fs0 f1 @|RichDialogProcessEndIcon #fIcon
Fs0 f3 guid 13413B0D0E15BB7F #txt
Fs0 f3 type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
Fs0 f3 method create(List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear>) #txt
Fs0 f3 disableUIEvents true #txt
Fs0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear> configuredFreeDaysOfYear> param = methodEvent.getInputArguments();
' #txt
Fs0 f3 inParameterMapAction 'out.configuredFreeDaysOfYear=param.configuredFreeDaysOfYear;
out.data=new ch.ivyteam.ivy.application.calendar.FreeDayOfYear(1,1);
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
Fs0 f3 214 40 20 20 13 0 #rect
Fs0 f3 @|RichDialogInitStartIcon #fIcon
Fs0 f6 guid 13413B2D1702A00E #txt
Fs0 f6 type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
Fs0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData out;
' #txt
Fs0 f6 actionTable 'out=in;
' #txt
Fs0 f6 actionCode out.configuredFreeDaysOfYear.add(out.data); #txt
Fs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f6 358 40 20 20 13 0 #rect
Fs0 f6 @|RichDialogProcessStartIcon #fIcon
Fs0 f7 type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
Fs0 f7 guid 13413B2F5ED23657 #txt
Fs0 f7 358 140 20 20 13 0 #rect
Fs0 f7 @|RichDialogEndIcon #fIcon
Fs0 f8 expr out #txt
Fs0 f8 368 60 368 140 #arcP
Fs0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData out;
' #txt
Fs0 f9 actionTable 'out=in;
' #txt
Fs0 f9 actionCode panel.getRootPane().setDefaultButton(panel.okButton); #txt
Fs0 f9 type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
Fs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default button to ok</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f9 82 84 36 24 20 -2 #rect
Fs0 f9 @|RichDialogProcessStepIcon #fIcon
Fs0 f10 expr out #txt
Fs0 f10 100 60 100 84 #arcP
Fs0 f2 expr out #txt
Fs0 f2 100 108 100 140 #arcP
Fs0 f11 expr out #txt
Fs0 f11 214 53 118 89 #arcP
>Proto Fs0 .ui2RdDataAction 'out.data.day=panel.dataDayRTextField.valueAsNumber;
out.data.description=panel.dataDescriptionRTextField.text;
out.data.month=panel.dataMonthRTextField.valueAsNumber;
' #txt
>Proto Fs0 .rdData2UIAction 'panel.dataDayRTextField.valueAsNumber=in.data.day;
panel.dataDescriptionRTextField.text=in.data.description;
panel.dataMonthRTextField.valueAsNumber=in.data.month;
' #txt
>Proto Fs0 .type ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail.FreeDayOfYearDetailData #txt
>Proto Fs0 .processKind RICH_DIALOG #txt
>Proto Fs0 -8 -8 16 16 16 26 #rect
>Proto Fs0 '' #fIcon
Fs0 f6 mainOut f8 tail #connect
Fs0 f8 head f7 mainIn #connect
Fs0 f0 mainOut f10 tail #connect
Fs0 f10 head f9 mainIn #connect
Fs0 f9 mainOut f2 tail #connect
Fs0 f2 head f1 mainIn #connect
Fs0 f3 mainOut f11 tail #connect
Fs0 f11 head f9 mainIn #connect
