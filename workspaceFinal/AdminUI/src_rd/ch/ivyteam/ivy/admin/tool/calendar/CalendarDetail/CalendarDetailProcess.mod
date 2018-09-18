[Ivy]
[>Created: Tue Dec 13 14:32:29 CET 2011]
133F8D8328FB9C04 3.17 #module
>Proto >Proto Collection #zClass
Cs0 CalendarDetailProcess Big #zClass
Cs0 RD #cInfo
Cs0 #process
Cs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Cs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Cs0 @TextInP .resExport .resExport #zField
Cs0 @TextInP .type .type #zField
Cs0 @TextInP .processKind .processKind #zField
Cs0 @AnnotationInP-0n ai ai #zField
Cs0 @TextInP .xml .xml #zField
Cs0 @TextInP .responsibility .responsibility #zField
Cs0 @RichDialogInitStart f0 '' #zField
Cs0 @RichDialogProcessEnd f1 '' #zField
Cs0 @PushWFArc f2 '' #zField
Cs0 @RichDialogBroadcastStart f3 '' #zField
Cs0 @RichDialogProcessStart f5 '' #zField
Cs0 @RichDialogProcessStart f9 '' #zField
Cs0 @RichDialogProcessStart f15 '' #zField
Cs0 @RichDialogProcessStep f16 '' #zField
Cs0 @PushWFArc f17 '' #zField
Cs0 @RichDialogProcessEnd f19 '' #zField
Cs0 @RichDialogProcessEnd f23 '' #zField
Cs0 @RichDialog f6 '' #zField
Cs0 @PushWFArc f7 '' #zField
Cs0 @RichDialogProcessStart f22 '' #zField
Cs0 @RichDialogProcessEnd f25 '' #zField
Cs0 @PushWFArc f26 '' #zField
Cs0 @RichDialogProcessStart f27 '' #zField
Cs0 @RichDialog f29 '' #zField
Cs0 @PushWFArc f30 '' #zField
Cs0 @RichDialogProcessStart f32 '' #zField
Cs0 @RichDialogProcessStart f40 '' #zField
Cs0 @RichDialogProcessStart f41 '' #zField
Cs0 @RichDialogProcessStart f42 '' #zField
Cs0 @RichDialogProcessStart f43 '' #zField
Cs0 @RichDialogProcessStart f44 '' #zField
Cs0 @RichDialogProcessStart f45 '' #zField
Cs0 @RichDialogProcessStep f53 '' #zField
Cs0 @PushWFArc f54 '' #zField
Cs0 @RichDialogProcessStep f55 '' #zField
Cs0 @PushWFArc f56 '' #zField
Cs0 @RichDialogProcessStep f57 '' #zField
Cs0 @PushWFArc f58 '' #zField
Cs0 @RichDialogProcessStep f59 '' #zField
Cs0 @PushWFArc f60 '' #zField
Cs0 @RichDialog f61 '' #zField
Cs0 @PushWFArc f62 '' #zField
Cs0 @RichDialog f63 '' #zField
Cs0 @PushWFArc f64 '' #zField
Cs0 @RichDialog f65 '' #zField
Cs0 @PushWFArc f66 '' #zField
Cs0 @RichDialogProcessStep f11 '' #zField
Cs0 @PushWFArc f12 '' #zField
Cs0 @PushWFArc f20 '' #zField
Cs0 @PushWFArc f28 '' #zField
Cs0 @PushWFArc f31 '' #zField
Cs0 @PushWFArc f33 '' #zField
Cs0 @PushWFArc f36 '' #zField
Cs0 @PushWFArc f38 '' #zField
Cs0 @PushWFArc f4 '' #zField
Cs0 @PushWFArc f10 '' #zField
Cs0 @PushWFArc f18 '' #zField
Cs0 @PushWFArc f21 '' #zField
Cs0 @RichDialogInitStart f8 '' #zField
Cs0 @RichDialogProcessEnd f13 '' #zField
Cs0 @PushWFArc f24 '' #zField
Cs0 @PushWFArc f37 '' #zField
Cs0 @PushWFArc f14 '' #zField
>Proto Cs0 Cs0 CalendarDetailProcess #zField
Cs0 f0 guid 133F8D832AD52D86 #txt
Cs0 f0 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f0 method start(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings) #txt
Cs0 f0 disableUIEvents true #txt
Cs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings businessCalendarSettings> param = methodEvent.getInputArguments();
' #txt
Cs0 f0 inParameterMapAction 'out.settings=param.businessCalendarSettings;
' #txt
Cs0 f0 outParameterDecl '<> result;
' #txt
Cs0 f0 embeddedRdInitializations '* ' #txt
Cs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IBusinessCalendarSettings)</name>
    </language>
</elementInfo>
' #txt
Cs0 f0 90 40 20 20 13 0 #rect
Cs0 f0 @|RichDialogInitStartIcon #fIcon
Cs0 f1 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f1 90 140 20 20 13 0 #rect
Cs0 f1 @|RichDialogProcessEndIcon #fIcon
Cs0 f2 expr out #txt
Cs0 f2 100 60 100 140 #arcP
Cs0 f3 guid 133FDCFE0CCAB9F5 #txt
Cs0 f3 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f3 broadcast CalendarSelected #txt
Cs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f3 actionTable 'out=in;
out.calendar=param.calendar;
out.firstDayOfWeek=param.calendar.firstDayOfWeek;
out.freeDates=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertFreeDate(param.calendar);
out.freeDaysOfWeek=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertFreeDaysOfWeek(param.calendar);
out.freeDaysOfYear=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertFreeDaysOfYear(param.calendar);
out.freeEasterRelativeDays=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertEasterDays(param.calendar);
out.selectedFreeDate=null;
out.selectedFreeDayOfWeek=null;
out.selectedFreeDayOfYear=null;
out.selectedFreeEeasterRelativeDay=null;
out.selectedWorkingTime=null;
out.workingTimes=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertWorkingTime(param.calendar);
' #txt
Cs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>CalendarSelected</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f3 598 40 20 20 13 0 #rect
Cs0 f3 @|RichDialogBroadcastStartIcon #fIcon
Cs0 f5 guid 133FF24163371EBE #txt
Cs0 f5 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f5 actionTable 'out=in;
' #txt
Cs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addWorkingTime</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f5 438 206 20 20 19 -5 #rect
Cs0 f5 @|RichDialogProcessStartIcon #fIcon
Cs0 f9 guid 133FF438A702EC95 #txt
Cs0 f9 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f9 actionTable 'out=in;
' #txt
Cs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save</name>
        <nameStyle>4,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f9 790 206 20 20 13 0 #rect
Cs0 f9 @|RichDialogProcessStartIcon #fIcon
Cs0 f15 guid 133FF7DE05569BA5 #txt
Cs0 f15 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f15 actionTable 'out=in;
' #txt
Cs0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deleteSelectedWorkingTime</name>
        <nameStyle>25,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f15 590 206 20 20 13 0 #rect
Cs0 f15 @|RichDialogProcessStartIcon #fIcon
Cs0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f16 actionTable 'out=in;
' #txt
Cs0 f16 actionCode 'in.calendar.getWorkingTimes().remove(in.selectedWorkingTime.value);
in.selectedWorkingTime = null;' #txt
Cs0 f16 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f16 582 276 36 24 20 -2 #rect
Cs0 f16 @|RichDialogProcessStepIcon #fIcon
Cs0 f17 expr out #txt
Cs0 f17 600 226 600 276 #arcP
Cs0 f19 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f19 790 438 20 20 13 0 #rect
Cs0 f19 @|RichDialogProcessEndIcon #fIcon
Cs0 f23 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f23 598 150 20 20 13 0 #rect
Cs0 f23 @|RichDialogProcessEndIcon #fIcon
Cs0 f6 targetWindow NEW:card: #txt
Cs0 f6 targetDisplay TOP #txt
Cs0 f6 richDialogId ch.ivyteam.ivy.admin.tool.calendar.workingTimeDetails #txt
Cs0 f6 startMethod createWorkingTime(List<ch.ivyteam.ivy.application.calendar.WorkingTime>) #txt
Cs0 f6 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f6 requestActionDecl '<List<ch.ivyteam.ivy.application.calendar.WorkingTime> configuredWorkingTimes> param;' #txt
Cs0 f6 requestMappingAction 'param.configuredWorkingTimes=in.calendar.getWorkingTimes();
' #txt
Cs0 f6 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f6 responseMappingAction 'out=in;
' #txt
Cs0 f6 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/addWorkingTime\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Cs0 f6 isAsynch false #txt
Cs0 f6 isInnerRd true #txt
Cs0 f6 userContext '* ' #txt
Cs0 f6 430 276 36 24 20 -2 #rect
Cs0 f6 @|RichDialogIcon #fIcon
Cs0 f7 expr out #txt
Cs0 f7 448 226 448 276 #arcP
Cs0 f7 0 0.5493780344340206 0 0 #arcLabel
Cs0 f22 guid 1341261B7A7BDD2C #txt
Cs0 f22 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f22 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f22 actionTable 'out=in;
' #txt
Cs0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>executeBindings</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f22 830 40 20 20 13 0 #rect
Cs0 f22 @|RichDialogProcessStartIcon #fIcon
Cs0 f25 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f25 830 134 20 20 13 0 #rect
Cs0 f25 @|RichDialogProcessEndIcon #fIcon
Cs0 f26 expr out #txt
Cs0 f26 840 60 840 134 #arcP
Cs0 f27 guid 134129CEB3F56868 #txt
Cs0 f27 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f27 actionTable 'out=in;
' #txt
Cs0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addFreeDayOfWeek</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f27 62 206 20 20 13 0 #rect
Cs0 f27 @|RichDialogProcessStartIcon #fIcon
Cs0 f29 targetWindow NEW:card: #txt
Cs0 f29 targetDisplay TOP #txt
Cs0 f29 richDialogId ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfWeekDetail #txt
Cs0 f29 startMethod create(List<ch.ivyteam.ivy.application.calendar.FreeDayOfWeek>) #txt
Cs0 f29 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f29 requestActionDecl '<List<ch.ivyteam.ivy.application.calendar.FreeDayOfWeek> configuredFreeDaysOfWeek> param;' #txt
Cs0 f29 requestMappingAction 'param.configuredFreeDaysOfWeek=in.calendar.getFreeDaysOfWeek();
' #txt
Cs0 f29 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f29 responseMappingAction 'out=in;
' #txt
Cs0 f29 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/addFreeDayOfWeek\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Cs0 f29 isAsynch false #txt
Cs0 f29 isInnerRd true #txt
Cs0 f29 userContext '* ' #txt
Cs0 f29 54 276 36 24 20 -2 #rect
Cs0 f29 @|RichDialogIcon #fIcon
Cs0 f30 expr out #txt
Cs0 f30 72 226 72 276 #arcP
Cs0 f32 guid 134129E264B162EE #txt
Cs0 f32 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f32 actionTable 'out=in;
' #txt
Cs0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deleteSelectedFreeDayOfWeek</name>
        <nameStyle>27,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f32 214 206 20 20 13 0 #rect
Cs0 f32 @|RichDialogProcessStartIcon #fIcon
Cs0 f40 guid 134129F108734CAC #txt
Cs0 f40 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f40 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f40 actionTable 'out=in;
' #txt
Cs0 f40 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addFreeDate</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f40 1270 206 20 20 13 0 #rect
Cs0 f40 @|RichDialogProcessStartIcon #fIcon
Cs0 f41 guid 134129F189D22732 #txt
Cs0 f41 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f41 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f41 actionTable 'out=in;
' #txt
Cs0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deleteSelectedFreeDate</name>
        <nameStyle>22,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f41 1382 206 20 20 13 0 #rect
Cs0 f41 @|RichDialogProcessStartIcon #fIcon
Cs0 f42 guid 134129F1F2C1D891 #txt
Cs0 f42 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f42 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f42 actionTable 'out=in;
' #txt
Cs0 f42 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addFreeDayOfYear</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f42 910 206 20 20 13 0 #rect
Cs0 f42 @|RichDialogProcessStartIcon #fIcon
Cs0 f43 guid 0134129F273D150F #txt
Cs0 f43 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f43 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f43 actionTable 'out=in;
' #txt
Cs0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deleteSelectedFreeDayOfYear</name>
        <nameStyle>27,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f43 1063 206 18 20 13 0 #rect
Cs0 f43 @|RichDialogProcessStartIcon #fIcon
Cs0 f44 guid 134129F2F6CBC6D4 #txt
Cs0 f44 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f44 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f44 actionTable 'out=in;
' #txt
Cs0 f44 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>addFreeEasterRelativeDay</name>
        <nameStyle>24,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f44 1550 206 20 20 13 0 #rect
Cs0 f44 @|RichDialogProcessStartIcon #fIcon
Cs0 f45 guid 134129F3B10FD0AB #txt
Cs0 f45 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f45 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f45 actionTable 'out=in;
' #txt
Cs0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deleteSelectedFreeEasterRelativeDay</name>
        <nameStyle>35,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f45 1734 206 20 20 13 0 #rect
Cs0 f45 @|RichDialogProcessStartIcon #fIcon
Cs0 f53 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f53 actionTable 'out=in;
' #txt
Cs0 f53 actionCode 'in.calendar.getFreeDaysOfYear().remove(in.selectedFreeDayOfYear.#value);
in.selectedFreeDayOfYear = null;' #txt
Cs0 f53 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f53 1054 276 36 24 20 -2 #rect
Cs0 f53 @|RichDialogProcessStepIcon #fIcon
Cs0 f54 expr out #txt
Cs0 f54 1072 226 1072 276 #arcP
Cs0 f55 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f55 actionTable 'out=in;
' #txt
Cs0 f55 actionCode 'in.calendar.getFreeDaysOfWeek().remove(in.selectedFreeDayOfWeek.value);
in.selectedFreeDayOfWeek = null;' #txt
Cs0 f55 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f55 206 276 36 24 20 -2 #rect
Cs0 f55 @|RichDialogProcessStepIcon #fIcon
Cs0 f56 expr out #txt
Cs0 f56 224 226 224 276 #arcP
Cs0 f57 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f57 actionTable 'out=in;
' #txt
Cs0 f57 actionCode 'in.calendar.getFreeDates().remove(in.selectedFreeDate.value);
in.selectedFreeDate = null;' #txt
Cs0 f57 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f57 1374 276 36 24 20 -2 #rect
Cs0 f57 @|RichDialogProcessStepIcon #fIcon
Cs0 f58 expr out #txt
Cs0 f58 1392 226 1392 276 #arcP
Cs0 f59 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f59 actionTable 'out=in;
' #txt
Cs0 f59 actionCode 'in.calendar.getFreeEasterRelativeDays().remove(in.selectedFreeEeasterRelativeDay.#value);
in.selectedFreeEeasterRelativeDay = null;' #txt
Cs0 f59 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f59 1726 276 36 24 20 -2 #rect
Cs0 f59 @|RichDialogProcessStepIcon #fIcon
Cs0 f60 expr out #txt
Cs0 f60 1744 226 1744 276 #arcP
Cs0 f61 targetWindow NEW:card: #txt
Cs0 f61 targetDisplay TOP #txt
Cs0 f61 richDialogId ch.ivyteam.ivy.admin.tool.calendar.FreeEasterRelativeDayDetail #txt
Cs0 f61 startMethod create(List<ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay>) #txt
Cs0 f61 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f61 requestActionDecl '<List<ch.ivyteam.ivy.application.calendar.FreeEasterRelativeDay> configuredFreeEasterRelativeDays> param;' #txt
Cs0 f61 requestMappingAction 'param.configuredFreeEasterRelativeDays=in.calendar.getFreeEasterRelativeDays();
' #txt
Cs0 f61 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f61 responseMappingAction 'out=in;
' #txt
Cs0 f61 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/addEasterRelativeDay\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Cs0 f61 isAsynch false #txt
Cs0 f61 isInnerRd true #txt
Cs0 f61 userContext '* ' #txt
Cs0 f61 1542 276 36 24 20 -2 #rect
Cs0 f61 @|RichDialogIcon #fIcon
Cs0 f62 expr out #txt
Cs0 f62 1560 226 1560 276 #arcP
Cs0 f63 targetWindow NEW:card: #txt
Cs0 f63 targetDisplay TOP #txt
Cs0 f63 richDialogId ch.ivyteam.ivy.admin.tool.calendar.FreeDateDetail #txt
Cs0 f63 startMethod create(List<ch.ivyteam.ivy.application.calendar.FreeDate>) #txt
Cs0 f63 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f63 requestActionDecl '<List<ch.ivyteam.ivy.application.calendar.FreeDate> configuredFreeDates> param;' #txt
Cs0 f63 requestMappingAction 'param.configuredFreeDates=in.calendar.getFreeDates();
' #txt
Cs0 f63 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f63 responseMappingAction 'out=in;
' #txt
Cs0 f63 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/addFreeDate\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Cs0 f63 isAsynch false #txt
Cs0 f63 isInnerRd true #txt
Cs0 f63 userContext '* ' #txt
Cs0 f63 1262 276 36 24 20 -2 #rect
Cs0 f63 @|RichDialogIcon #fIcon
Cs0 f64 expr out #txt
Cs0 f64 1280 226 1280 276 #arcP
Cs0 f65 targetWindow NEW:card: #txt
Cs0 f65 targetDisplay TOP #txt
Cs0 f65 richDialogId ch.ivyteam.ivy.admin.tool.calendar.FreeDayOfYearDetail #txt
Cs0 f65 startMethod create(List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear>) #txt
Cs0 f65 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f65 requestActionDecl '<List<ch.ivyteam.ivy.application.calendar.FreeDayOfYear> configuredFreeDaysOfYear> param;' #txt
Cs0 f65 requestMappingAction 'param.configuredFreeDaysOfYear=in.calendar.getFreeDaysOfYear();
' #txt
Cs0 f65 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f65 responseMappingAction 'out=in;
' #txt
Cs0 f65 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/addFreeDayOfYear\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Cs0 f65 isAsynch false #txt
Cs0 f65 isInnerRd true #txt
Cs0 f65 userContext '* ' #txt
Cs0 f65 902 276 36 24 20 -2 #rect
Cs0 f65 @|RichDialogIcon #fIcon
Cs0 f66 expr out #txt
Cs0 f66 920 226 920 276 #arcP
Cs0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData out;
' #txt
Cs0 f11 actionTable 'out=in;
out.freeDates=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertFreeDate(in.calendar);
out.freeDaysOfWeek=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertFreeDaysOfWeek(in.calendar);
out.freeDaysOfYear=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertFreeDaysOfYear(in.calendar);
out.freeEasterRelativeDays=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertEasterDays(in.calendar);
out.workingTimes=ch.ivyteam.ivy.admin.tool.calendar.CalendarObjectHelper.convertWorkingTime(in.calendar);
' #txt
Cs0 f11 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;

in.calendar.firstDayOfWeek = in.#firstDayOfWeek;
in.settings.saveBusinessCalendarConfiguration(in.calendar);' #txt
Cs0 f11 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save</name>
        <nameStyle>4,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f11 782 380 36 24 20 -2 #rect
Cs0 f11 @|RichDialogProcessStepIcon #fIcon
Cs0 f12 expr out #txt
Cs0 f12 800 226 800 380 #arcP
Cs0 f20 expr out #txt
Cs0 f20 800 404 800 438 #arcP
Cs0 f28 expr out #txt
Cs0 f28 90 291 782 389 #arcP
Cs0 f31 expr out #txt
Cs0 f31 242 291 782 389 #arcP
Cs0 f33 expr out #txt
Cs0 f33 1262 292 818 388 #arcP
Cs0 f36 expr out #txt
Cs0 f36 1374 291 818 389 #arcP
Cs0 f38 expr out #txt
Cs0 f38 1726 290 818 390 #arcP
Cs0 f4 expr out #txt
Cs0 f4 466 293 782 387 #arcP
Cs0 f10 expr out #txt
Cs0 f10 618 297 782 383 #arcP
Cs0 f18 expr out #txt
Cs0 f18 906 300 814 380 #arcP
Cs0 f21 expr out #txt
Cs0 f21 1054 295 818 385 #arcP
Cs0 f8 guid 13431454B9C1C65F #txt
Cs0 f8 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f8 method start() #txt
Cs0 f8 disableUIEvents true #txt
Cs0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Cs0 f8 outParameterDecl '<> result;
' #txt
Cs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Cs0 f8 390 40 20 20 13 0 #rect
Cs0 f8 @|RichDialogInitStartIcon #fIcon
Cs0 f13 type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
Cs0 f13 390 142 20 20 13 0 #rect
Cs0 f13 @|RichDialogProcessEndIcon #fIcon
Cs0 f24 expr out #txt
Cs0 f24 400 60 400 142 #arcP
Cs0 f37 expr out #txt
Cs0 f37 1542 290 818 390 #arcP
Cs0 f37 0 0.5050383379142652 0 0 #arcLabel
Cs0 f14 expr out #txt
Cs0 f14 608 60 608 150 #arcP
>Proto Cs0 .ui2RdDataAction 'out.selectedFreeDate=panel.FreeDateTable.#selectedListEntry as ivyadmintool.CalendarObject;
out.selectedFreeDayOfWeek=panel.freeDayOfWeekTable.#selectedListEntry as ivyadmintool.CalendarObject;
out.selectedFreeDayOfYear=panel.freeDayOfYearTable.#selectedListEntry as ivyadmintool.CalendarObject;
out.selectedFreeEeasterRelativeDay=panel.FreeEasterRelativeDayTable.#selectedListEntry as ivyadmintool.CalendarObject;
out.firstDayOfWeek=panel.startOfWeekComboBox.#selectedEnumValue as ch.ivyteam.util.date.Weekday;
out.selectedWorkingTime=panel.WorkingTimeTable.#selectedListEntry as ivyadmintool.CalendarObject;
' #txt
>Proto Cs0 .rdData2UIAction 'panel.deleteEasterRelativeDayButton.enabled=in.#selectedFreeEeasterRelativeDay != null && !in.selectedFreeEeasterRelativeDay.inherited;
panel.deleteFreeDateButton.enabled=in.#selectedFreeDate != null && !in.selectedFreeDate.inherited;
panel.deleteFreeDayOfWeekButton.enabled=in.#selectedFreeDayOfWeek != null && !in.selectedFreeDayOfWeek.inherited;
panel.deleteFreeDayOfYearButton.enabled=in.#selectedFreeDayOfYear != null && !in.selectedFreeDayOfYear.inherited;
panel.deleteWorkingTimeButton.enabled=in.#selectedWorkingTime != null && !in.selectedWorkingTime.inherited;
panel.freeDatesTableDeleteMenuItem.enabled=in.#selectedFreeDate != null && !in.selectedFreeDate.inherited;
panel.FreeDateTable.listData=in.freeDates;
panel.freeDayOfWeekTable.listData=in.freeDaysOfWeek;
panel.freeDayOfWeekTableDeleteMenuItem.enabled=in.#selectedFreeDayOfWeek != null && !in.selectedFreeDayOfWeek.inherited;
panel.freeDayOfYearTable.listData=in.freeDaysOfYear;
panel.freeDayOfYearTableDeleteMenuItem.enabled=in.#selectedFreeDayOfYear != null && !in.selectedFreeDayOfYear.inherited;
panel.FreeEasterRelativeDayTable.listData=in.freeEasterRelativeDays;
panel.freeEasterRelativeDayTableDeleteMenuItem.enabled=in.#selectedFreeEeasterRelativeDay != null && !in.selectedFreeEeasterRelativeDay.inherited;
panel.WorkingTimeTable.listData=in.workingTimes;
panel.startOfWeekComboBox.enumClassName="ch.ivyteam.util.date.Weekday";
panel.startOfWeekComboBox.selectedEnumValue=in.#firstDayOfWeek;
panel.workinTimeTableDeleteMenuItem.enabled=in.#selectedWorkingTime != null && !in.selectedWorkingTime.inherited;
' #txt
>Proto Cs0 .type ch.ivyteam.ivy.admin.tool.calendar.CalendarDetail.CalendarDetailData #txt
>Proto Cs0 .processKind RICH_DIALOG #txt
>Proto Cs0 -8 -8 16 16 16 26 #rect
>Proto Cs0 '' #fIcon
Cs0 f0 mainOut f2 tail #connect
Cs0 f2 head f1 mainIn #connect
Cs0 f15 mainOut f17 tail #connect
Cs0 f17 head f16 mainIn #connect
Cs0 f5 mainOut f7 tail #connect
Cs0 f7 head f6 mainIn #connect
Cs0 f22 mainOut f26 tail #connect
Cs0 f26 head f25 mainIn #connect
Cs0 f27 mainOut f30 tail #connect
Cs0 f30 head f29 mainIn #connect
Cs0 f43 mainOut f54 tail #connect
Cs0 f54 head f53 mainIn #connect
Cs0 f32 mainOut f56 tail #connect
Cs0 f56 head f55 mainIn #connect
Cs0 f41 mainOut f58 tail #connect
Cs0 f58 head f57 mainIn #connect
Cs0 f45 mainOut f60 tail #connect
Cs0 f60 head f59 mainIn #connect
Cs0 f44 mainOut f62 tail #connect
Cs0 f62 head f61 mainIn #connect
Cs0 f40 mainOut f64 tail #connect
Cs0 f64 head f63 mainIn #connect
Cs0 f42 mainOut f66 tail #connect
Cs0 f66 head f65 mainIn #connect
Cs0 f12 head f11 mainIn #connect
Cs0 f20 head f19 mainIn #connect
Cs0 f9 mainOut f12 tail #connect
Cs0 f11 mainOut f20 tail #connect
Cs0 f29 mainOut f28 tail #connect
Cs0 f28 head f11 mainIn #connect
Cs0 f55 mainOut f31 tail #connect
Cs0 f31 head f11 mainIn #connect
Cs0 f63 mainOut f33 tail #connect
Cs0 f33 head f11 mainIn #connect
Cs0 f57 mainOut f36 tail #connect
Cs0 f36 head f11 mainIn #connect
Cs0 f59 mainOut f38 tail #connect
Cs0 f38 head f11 mainIn #connect
Cs0 f6 mainOut f4 tail #connect
Cs0 f4 head f11 mainIn #connect
Cs0 f16 mainOut f10 tail #connect
Cs0 f10 head f11 mainIn #connect
Cs0 f65 mainOut f18 tail #connect
Cs0 f18 head f11 mainIn #connect
Cs0 f53 mainOut f21 tail #connect
Cs0 f21 head f11 mainIn #connect
Cs0 f8 mainOut f24 tail #connect
Cs0 f24 head f13 mainIn #connect
Cs0 f61 mainOut f37 tail #connect
Cs0 f37 head f11 mainIn #connect
Cs0 f3 mainOut f14 tail #connect
Cs0 f14 head f23 mainIn #connect
