[Ivy]
[>Created: Tue Jun 19 16:59:34 ICT 2012]
13AB01309B46B6A1 3.17 #module
>Proto >Proto Collection #zClass
Ms0 LogViewerProcess Big #zClass
Ms0 RD #cInfo
Ms0 #process
Ms0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ms0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ms0 @TextInP .resExport .resExport #zField
Ms0 @TextInP .type .type #zField
Ms0 @TextInP .processKind .processKind #zField
Ms0 @AnnotationInP-0n ai ai #zField
Ms0 @TextInP .xml .xml #zField
Ms0 @TextInP .responsibility .responsibility #zField
Ms0 @RichDialogInitStart f0 '' #zField
Ms0 @RichDialogProcessEnd f1 '' #zField
Ms0 @RichDialogMethodStart f5 '' #zField
Ms0 @RichDialogProcessStart f2 '' #zField
Ms0 @RichDialogEnd f3 '' #zField
Ms0 @RichDialogFireEvent f8 '' #zField
Ms0 @PushWFArc f9 '' #zField
Ms0 @PushWFArc f4 '' #zField
Ms0 @RichDialogInitStart f10 '' #zField
Ms0 @RichDialogProcessStep f12 '' #zField
Ms0 @PushWFArc f13 '' #zField
Ms0 @PushWFArc f11 '' #zField
Ms0 @PushWFArc f14 '' #zField
Ms0 @PushWFArc f16 '' #zField
Ms0 @InfoButton f6 '' #zField
Ms0 @AnnotationArc f7 '' #zField
Ms0 @RichDialogInitStart f15 '' #zField
Ms0 @PushWFArc f17 '' #zField
Ms0 @RichDialogProcessStart f18 '' #zField
Ms0 @PushWFArc f19 '' #zField
>Proto Ms0 Ms0 LogViewerProcess #zField
Ms0 f0 guid 137977CD389F46A2 #txt
Ms0 f0 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f0 method start(ch.ivyteam.ivy.admin.tool.report.IReport) #txt
Ms0 f0 disableUIEvents true #txt
Ms0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.admin.tool.report.IReport report> param = methodEvent.getInputArguments();
' #txt
Ms0 f0 inParameterMapAction 'out.dataList=param.report.pollAll();
out.reports=param.report;
' #txt
Ms0 f0 outParameterDecl '<> result;
' #txt
Ms0 f0 embeddedRdInitializations '* ' #txt
Ms0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IReport)</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f0 142 86 20 20 -84 -9 #rect
Ms0 f0 @|RichDialogInitStartIcon #fIcon
Ms0 f1 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f1 86 206 20 20 13 0 #rect
Ms0 f1 @|RichDialogProcessEndIcon #fIcon
Ms0 f5 guid 137A10A02053BF0E #txt
Ms0 f5 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f5 method setLogs(List<ch.ivyteam.ivy.admin.tool.report.ReportEntry>) #txt
Ms0 f5 disableUIEvents false #txt
Ms0 f5 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.admin.tool.report.ReportEntry> logs> param = methodEvent.getInputArguments();
' #txt
Ms0 f5 inParameterMapAction 'out.dataList=param.logs;
' #txt
Ms0 f5 outParameterDecl '<> result;
' #txt
Ms0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setLogs(List&lt;ReportEntry&gt;)</name>
        <nameStyle>26,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f5 318 206 20 20 13 -9 #rect
Ms0 f5 @|RichDialogMethodStartIcon #fIcon
Ms0 f2 guid 137A65D60B2AD52D #txt
Ms0 f2 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData out;
' #txt
Ms0 f2 actionTable 'out=in;
' #txt
Ms0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f2 318 302 20 20 14 -9 #rect
Ms0 f2 @|RichDialogProcessStartIcon #fIcon
Ms0 f3 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f3 guid 137A65D9ADC91202 #txt
Ms0 f3 86 302 20 20 13 0 #rect
Ms0 f3 @|RichDialogEndIcon #fIcon
Ms0 f8 actionCode panel.fireClose(); #txt
Ms0 f8 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f8 fireEvent close() #txt
Ms0 f8 198 300 36 24 20 -2 #rect
Ms0 f8 @|RichDialogFireEventIcon #fIcon
Ms0 f9 expr out #txt
Ms0 f9 318 312 234 312 #arcP
Ms0 f4 expr out #txt
Ms0 f4 198 312 106 312 #arcP
Ms0 f10 guid 137A6ECA0FEF4C92 #txt
Ms0 f10 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f10 method start(List<ch.ivyteam.ivy.admin.tool.report.ReportEntry>) #txt
Ms0 f10 disableUIEvents true #txt
Ms0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.admin.tool.report.ReportEntry> entries> param = methodEvent.getInputArguments();
' #txt
Ms0 f10 inParameterMapAction 'out.dataList=param.entries;
' #txt
Ms0 f10 outParameterDecl '<> result;
' #txt
Ms0 f10 embeddedRdInitializations '* ' #txt
Ms0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(List&lt;ReportEntry&gt;)</name>
        <nameStyle>24,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f10 270 86 20 20 13 -7 #rect
Ms0 f10 @|RichDialogInitStartIcon #fIcon
Ms0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData out;
' #txt
Ms0 f12 actionTable 'out=in;
' #txt
Ms0 f12 actionCode panel.countNumOfStatusToLog(in.dataList); #txt
Ms0 f12 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f12 198 204 36 24 20 -2 #rect
Ms0 f12 @|RichDialogProcessStepIcon #fIcon
Ms0 f13 expr out #txt
Ms0 f13 275 104 222 204 #arcP
Ms0 f11 expr out #txt
Ms0 f11 198 216 106 216 #arcP
Ms0 f14 expr out #txt
Ms0 f14 318 216 234 216 #arcP
Ms0 f16 expr out #txt
Ms0 f16 156 104 210 204 #arcP
Ms0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>In case who wants to use this Log Viewer as embbeded RD</name>
        <nameStyle>55,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f6 368 387 337 26 -163 -8 #rect
Ms0 f6 @|IBIcon #fIcon
Ms0 f6 -1|-1|-16777216 #nodeStyle
Ms0 f7 367 400 332 321 #arcP
Ms0 f7 0 0.49806564165671097 0 0 #arcLabel
Ms0 f15 guid 137BA76F0E9A31BA #txt
Ms0 f15 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f15 method start() #txt
Ms0 f15 disableUIEvents true #txt
Ms0 f15 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ms0 f15 inParameterMapAction 'out.dataList=new java.util.ArrayList();
' #txt
Ms0 f15 outParameterDecl '<> result;
' #txt
Ms0 f15 embeddedRdInitializations '* ' #txt
Ms0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f15 206 86 20 20 -14 -30 #rect
Ms0 f15 @|RichDialogInitStartIcon #fIcon
Ms0 f17 expr out #txt
Ms0 f17 216 106 216 204 #arcP
Ms0 f18 guid 137C0AB34D045E86 #txt
Ms0 f18 type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
Ms0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData out;
' #txt
Ms0 f18 actionTable 'out=in;
' #txt
Ms0 f18 actionCode panel.showPopup(); #txt
Ms0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>pop_up</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ms0 f18 318 254 20 20 15 -10 #rect
Ms0 f18 @|RichDialogProcessStartIcon #fIcon
Ms0 f19 expr out #txt
Ms0 f19 318 264 96 226 #arcP
Ms0 f19 1 96 264 #addKink
Ms0 f19 0 0.5617165467299152 0 0 #arcLabel
>Proto Ms0 .rdData2UIAction 'panel.logTable.listData=in.dataList;
' #txt
>Proto Ms0 .type ch.ivyteam.ivy.admin.tool.report.LogViewer.LogViewerData #txt
>Proto Ms0 .processKind RICH_DIALOG #txt
>Proto Ms0 -8 -8 16 16 16 26 #rect
>Proto Ms0 '' #fIcon
Ms0 f2 mainOut f9 tail #connect
Ms0 f9 head f8 mainIn #connect
Ms0 f8 mainOut f4 tail #connect
Ms0 f4 head f3 mainIn #connect
Ms0 f10 mainOut f13 tail #connect
Ms0 f13 head f12 mainIn #connect
Ms0 f12 mainOut f11 tail #connect
Ms0 f11 head f1 mainIn #connect
Ms0 f5 mainOut f14 tail #connect
Ms0 f14 head f12 mainIn #connect
Ms0 f0 mainOut f16 tail #connect
Ms0 f16 head f12 mainIn #connect
Ms0 f6 ao f7 tail #connect
Ms0 f7 head f2 @CG|ai #connect
Ms0 f15 mainOut f17 tail #connect
Ms0 f17 head f12 mainIn #connect
Ms0 f18 mainOut f19 tail #connect
Ms0 f19 head f1 mainIn #connect
