[Ivy]
[>Created: Tue Jun 23 12:46:10 CEST 2009]
115D77ABC4A2AA94 3.12 #module
>Proto >Proto Collection #zClass
Rs0 RuntimeProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @MessageFlowInP-0n messageIn messageIn #zField
Rs0 @MessageFlowOutP-0n messageOut messageOut #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessStep f1 '' #zField
Rs0 @RichDialogProcessEnd f2 '' #zField
Rs0 @PushWFArc f3 '' #zField
Rs0 @PushWFArc f4 '' #zField
Rs0 @RichDialogProcessStart f5 '' #zField
Rs0 @RichDialogProcessEnd f6 '' #zField
Rs0 @RichDialogProcessStep f7 '' #zField
Rs0 @PushWFArc f8 '' #zField
Rs0 @PushWFArc f9 '' #zField
Rs0 @RichDialogMethodStart f19 '' #zField
Rs0 @RichDialogMethodStart f21 '' #zField
Rs0 @PushWFArc f22 '' #zField
Rs0 @RichDialogEnd f23 '' #zField
Rs0 @PushWFArc f24 '' #zField
Rs0 @RichDialogProcessStart f25 '' #zField
Rs0 @PushWFArc f26 '' #zField
Rs0 @RichDialogProcessStart f27 '' #zField
Rs0 @PushWFArc f28 '' #zField
Rs0 @RichDialogMethodStart f10 '' #zField
Rs0 @RichDialogProcessEnd f11 '' #zField
Rs0 @PushWFArc f12 '' #zField
>Proto Rs0 Rs0 RuntimeProcess #zField
Rs0 f0 guid 115D784FB42ED4E0 #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f0 method start() #txt
Rs0 f0 disableUIEvents false #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 embeddedRdInitializations '{/headerPane {/fieldName "headerPane"/startMethod "start(String,String)"/parameterMapping "param.iconUri=\"/Icons/ServerInfo/48\";\nparam.title=\"Runtime Information\";\n"/initScript ""}}' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f0 62 22 20 20 13 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 actionDecl 'ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData out;
' #txt
Rs0 f1 actionTable 'out=in;
out.javaCurrentHeap=java.lang.Runtime.getRuntime().totalMemory();
out.javaMaxHeap=java.lang.Runtime.getRuntime().maxMemory();
' #txt
Rs0 f1 actionCode 'java.util.Map stackTraces;

stackTraces = java.lang.Thread.getAllStackTraces();

in.threads = new List<java.lang.Thread>();
in.threads.addAll(stackTraces.keySet());
' #txt
Rs0 f1 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Read data</name>
        <nameStyle>9,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f1 54 60 36 24 20 -2 #rect
Rs0 f1 @|RichDialogProcessStepIcon #fIcon
Rs0 f2 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f2 59 107 26 26 14 0 #rect
Rs0 f2 @|RichDialogProcessEndIcon #fIcon
Rs0 f3 expr out #txt
Rs0 f3 72 42 72 60 #arcP
Rs0 f4 expr out #txt
Rs0 f4 72 84 72 107 #arcP
Rs0 f5 guid 115D78ABD5ADE0BF #txt
Rs0 f5 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData out;
' #txt
Rs0 f5 actionTable 'out=in;
' #txt
Rs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ThreadSelected</name>
        <nameStyle>14,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f5 62 190 20 20 13 0 #rect
Rs0 f5 @|RichDialogProcessStartIcon #fIcon
Rs0 f6 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f6 59 291 26 26 14 0 #rect
Rs0 f6 @|RichDialogProcessEndIcon #fIcon
Rs0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData out;
' #txt
Rs0 f7 actionTable 'out=in;
' #txt
Rs0 f7 actionCode 'in.stacktrace.clear();
if (in.#selectedThread != null)
{
  in.stacktrace = new Recordset();
  List<String> classes;
  List<String> methods;
  List<String> lines;
  List<String> files;
  List<StackTraceElement> elements;

  elements.addAll(in.selectedThread.getStackTrace().toList());
  for (java.lang.StackTraceElement element : elements) 
  {
    classes.add(element.getClassName());
    methods.add(element.getMethodName());
    lines.add(element.getLineNumber().toString());
    files.add(element.getFileName());
  }
  in.stacktrace.addColumn("Class", classes);
  in.stacktrace.addColumn("Method", methods);
  in.stacktrace.addColumn("Line", lines);
  in.stacktrace.addColumn("File", files);
}
' #txt
Rs0 f7 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Load stack trace</name>
        <nameStyle>16,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f7 54 236 36 24 20 -2 #rect
Rs0 f7 @|RichDialogProcessStepIcon #fIcon
Rs0 f8 expr out #txt
Rs0 f8 72 210 72 236 #arcP
Rs0 f9 expr out #txt
Rs0 f9 72 260 72 291 #arcP
Rs0 f19 guid 1189E24364C9EA31 #txt
Rs0 f19 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f19 method close() #txt
Rs0 f19 disableUIEvents false #txt
Rs0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close()</name>
    </language>
</elementInfo>
' #txt
Rs0 f19 414 22 20 20 13 0 #rect
Rs0 f19 @|RichDialogMethodStartIcon #fIcon
Rs0 f21 guid 1189E243C434F746 #txt
Rs0 f21 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f21 method refresh() #txt
Rs0 f21 disableUIEvents false #txt
Rs0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Rs0 f21 254 22 20 20 13 0 #rect
Rs0 f21 @|RichDialogMethodStartIcon #fIcon
Rs0 f22 expr out #txt
Rs0 f22 254 34 90 68 #arcP
Rs0 f23 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f23 guid 1189E24501DCECFD #txt
Rs0 f23 411 123 26 26 14 0 #rect
Rs0 f23 @|RichDialogEndIcon #fIcon
Rs0 f24 expr out #txt
Rs0 f24 424 42 424 123 #arcP
Rs0 f25 guid 119753CC4A674B0E #txt
Rs0 f25 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData out;
' #txt
Rs0 f25 actionTable 'out=in;
' #txt
Rs0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f25 182 22 20 20 13 0 #rect
Rs0 f25 @|RichDialogProcessStartIcon #fIcon
Rs0 f26 expr out #txt
Rs0 f26 182 35 90 66 #arcP
Rs0 f27 guid 11975518911CEEBA #txt
Rs0 f27 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData out;
' #txt
Rs0 f27 actionTable 'out=in;
' #txt
Rs0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f27 478 22 20 20 13 0 #rect
Rs0 f27 @|RichDialogProcessStartIcon #fIcon
Rs0 f28 expr out #txt
Rs0 f28 482 40 430 124 #arcP
Rs0 f10 guid 11F4263300D51008 #txt
Rs0 f10 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f10 method matchIdentifier(String,java.lang.Object) #txt
Rs0 f10 disableUIEvents false #txt
Rs0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
Rs0 f10 inParameterMapAction 'out.tempType=param.type;
' #txt
Rs0 f10 outParameterDecl '<java.lang.String name> result;
' #txt
Rs0 f10 outActionCode 'if (in.tempType == "info")
{
	result.name = panel.getName();
}' #txt
Rs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier(String,Object)</name>
        <nameStyle>30,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f10 246 182 20 20 13 0 #rect
Rs0 f10 @|RichDialogMethodStartIcon #fIcon
Rs0 f11 type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
Rs0 f11 243 235 26 26 14 0 #rect
Rs0 f11 @|RichDialogProcessEndIcon #fIcon
Rs0 f12 expr out #txt
Rs0 f12 256 202 256 235 #arcP
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.Runtime.RuntimeData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 .ui2RdDataAction 'out.selectedThread=panel.threadList.#selectedListEntry as java.lang.Thread;
' #txt
>Proto Rs0 .rdData2UIAction 'panel.javaCurrentHeapTextField.text=in.javaCurrentHeap.format("BytesAsMB");
panel.javaMaxHeapTextField.text=in.javaMaxHeap.format("BytesAsMB");
panel.stackTraceTable.recordsetData=in.stacktrace;
panel.threadList.listData=in.threads;
' #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f0 mainOut f3 tail #connect
Rs0 f3 head f1 mainIn #connect
Rs0 f1 mainOut f4 tail #connect
Rs0 f4 head f2 mainIn #connect
Rs0 f5 mainOut f8 tail #connect
Rs0 f8 head f7 mainIn #connect
Rs0 f7 mainOut f9 tail #connect
Rs0 f9 head f6 mainIn #connect
Rs0 f21 mainOut f22 tail #connect
Rs0 f22 head f1 mainIn #connect
Rs0 f19 mainOut f24 tail #connect
Rs0 f24 head f23 mainIn #connect
Rs0 f25 mainOut f26 tail #connect
Rs0 f26 head f1 mainIn #connect
Rs0 f27 mainOut f28 tail #connect
Rs0 f28 head f23 mainIn #connect
Rs0 f10 mainOut f12 tail #connect
Rs0 f12 head f11 mainIn #connect
