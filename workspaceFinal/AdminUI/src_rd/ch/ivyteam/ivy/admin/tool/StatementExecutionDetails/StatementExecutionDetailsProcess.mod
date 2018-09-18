[Ivy]
[>Created: Fri May 23 11:34:56 ICT 2014]
11884B322A69AE28 3.17 #module
>Proto >Proto Collection #zClass
Ss0 StatementExecutionDetailsProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @RichDialogProcessStart f0 '' #zField
Ss0 @RichDialogEnd f1 '' #zField
Ss0 @PushWFArc f2 '' #zField
Ss0 @RichDialogInitStart f3 '' #zField
Ss0 @RichDialogProcessEnd f4 '' #zField
Ss0 @PushWFArc f5 '' #zField
>Proto Ss0 Ss0 StatementExecutionDetailsProcess #zField
Ss0 f0 guid 11884C015284BF6C #txt
Ss0 f0 type ch.ivyteam.ivy.admin.tool.StatementExecutionDetails.StatementExecutionDetailsData #txt
Ss0 f0 actionDecl 'ch.ivyteam.ivy.admin.tool.StatementExecutionDetails.StatementExecutionDetailsData out;
' #txt
Ss0 f0 actionTable 'out=in;
' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f0 262 46 20 20 13 0 #rect
Ss0 f0 @|RichDialogProcessStartIcon #fIcon
Ss0 f1 type ch.ivyteam.ivy.admin.tool.StatementExecutionDetails.StatementExecutionDetailsData #txt
Ss0 f1 guid 11884C02E45468E3 #txt
Ss0 f1 259 179 26 26 14 0 #rect
Ss0 f1 @|RichDialogEndIcon #fIcon
Ss0 f2 expr out #txt
Ss0 f2 272 66 272 179 #arcP
Ss0 f3 guid 11884C09E32D37E1 #txt
Ss0 f3 type ch.ivyteam.ivy.admin.tool.StatementExecutionDetails.StatementExecutionDetailsData #txt
Ss0 f3 method start(ch.ivyteam.ivy.db.IStatementExecution) #txt
Ss0 f3 disableUIEvents false #txt
Ss0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.db.IStatementExecution statementExecution> param = methodEvent.getInputArguments();
' #txt
Ss0 f3 inParameterMapAction 'out.statementExecution=param.statementExecution;
' #txt
Ss0 f3 outParameterDecl '<> result;
' #txt
Ss0 f3 embeddedRdInitializations '* ' #txt
Ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IStatementExecution)</name>
        <nameStyle>26,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f3 38 46 20 20 13 0 #rect
Ss0 f3 @|RichDialogInitStartIcon #fIcon
Ss0 f4 type ch.ivyteam.ivy.admin.tool.StatementExecutionDetails.StatementExecutionDetailsData #txt
Ss0 f4 35 179 26 26 14 0 #rect
Ss0 f4 @|RichDialogProcessEndIcon #fIcon
Ss0 f5 expr out #txt
Ss0 f5 48 66 48 179 #arcP
>Proto Ss0 .type ch.ivyteam.ivy.admin.tool.StatementExecutionDetails.StatementExecutionDetailsData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 .rdData2UIAction 'panel.elementValueLabel.text=in.statementExecution.getDatabaseElement().getProcessElementId();
panel.executionTimeValueLabel.text=(in.statementExecution.getExecutionTimeInMicroSeconds() * 1000).format("NanoAsMillis");
panel.resultReadingTimeValueLabel.text=(in.statementExecution.getReadingResultTimeInMicroSeconds() * 1000).format("NanoAsMillis");
panel.resultValueLabel.text=IF(in.statementExecution.getError() != null,
    in.statementExecution.getError().toString(),  
    in.statementExecution.getRowsAffected().toString() + " rows affected"
);
panel.sqlTextArea.text=in.statementExecution.getSql();
panel.timeValueLabel.text=(in.statementExecution.getExecutionTimestamp() as DateTime).format("full");
' #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f0 mainOut f2 tail #connect
Ss0 f2 head f1 mainIn #connect
Ss0 f3 mainOut f5 tail #connect
Ss0 f5 head f4 mainIn #connect
