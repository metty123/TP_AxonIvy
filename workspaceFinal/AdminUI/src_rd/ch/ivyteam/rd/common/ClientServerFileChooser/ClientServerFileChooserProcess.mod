[Ivy]
[>Created: Mon Jul 09 11:35:59 CEST 2012]
13AAFE40A12D90AC 3.17 #module
>Proto >Proto Collection #zClass
Ls0 ClientServerFileChooserProcess Big #zClass
Ls0 RD #cInfo
Ls0 #process
Ls0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ls0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ls0 @TextInP .resExport .resExport #zField
Ls0 @TextInP .type .type #zField
Ls0 @TextInP .processKind .processKind #zField
Ls0 @AnnotationInP-0n ai ai #zField
Ls0 @TextInP .xml .xml #zField
Ls0 @TextInP .responsibility .responsibility #zField
Ls0 @RichDialogProcessEnd f1 '' #zField
Ls0 @RichDialogInitStart f3 '' #zField
Ls0 @RichDialogProcessStart f5 '' #zField
Ls0 @RichDialog f6 '' #zField
Ls0 @RichDialogProcessEnd f8 '' #zField
Ls0 @PushWFArc f9 '' #zField
Ls0 @RichDialogProcessStart f10 '' #zField
Ls0 @PushWFArc f7 '' #zField
Ls0 @RichDialog f94 '' #zField
Ls0 @RichDialogUiSync f53 '' #zField
Ls0 @Alternative f92 '' #zField
Ls0 @RichDialogProcessStep f52 '' #zField
Ls0 @PushWFArc f56 '' #zField
Ls0 @PushWFArc f93 '' #zField
Ls0 @PushWFArc f11 '' #zField
Ls0 @PushWFArc f13 '' #zField
Ls0 @RichDialogProcessEnd f12 '' #zField
Ls0 @PushWFArc f14 '' #zField
Ls0 @PushWFArc f15 '' #zField
Ls0 @RichDialogProcessStep f16 '' #zField
Ls0 @PushWFArc f17 '' #zField
Ls0 @PushWFArc f18 '' #zField
Ls0 @PushWFArc f19 '' #zField
Ls0 @RichDialogMethodStart f20 '' #zField
Ls0 @RichDialogProcessEnd f21 '' #zField
Ls0 @PushWFArc f22 '' #zField
Ls0 @PushWFArc f4 '' #zField
Ls0 @PushWFArc f2 '' #zField
Ls0 @RichDialogInitStart f0 '' #zField
>Proto Ls0 Ls0 ClientServerFileChooserProcess #zField
Ls0 f1 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f1 86 150 20 20 13 0 #rect
Ls0 f1 @|RichDialogProcessEndIcon #fIcon
Ls0 f3 guid 138478A98FF7E9E0 #txt
Ls0 f3 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f3 method start(String,String,Boolean) #txt
Ls0 f3 disableUIEvents true #txt
Ls0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String filePath,java.lang.String labelText,java.lang.Boolean onlyDirectories> param = methodEvent.getInputArguments();
' #txt
Ls0 f3 inParameterMapAction 'out.filepath=param.filePath;
out.onlyDirectories=param.onlyDirectories;
out.labelText=param.labelText;
' #txt
Ls0 f3 outParameterDecl '<ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile result> result;
' #txt
Ls0 f3 outParameterMapAction 'result.result.filepath=in.filepath;
result.result.isClient=in.isClient;
' #txt
Ls0 f3 embeddedRdInitializations '* ' #txt
Ls0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(filepath, title, onlyDirectories)</name>
        <nameStyle>39,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f3 174 54 20 20 13 0 #rect
Ls0 f3 @|RichDialogInitStartIcon #fIcon
Ls0 f5 guid 13847C70D52B4B88 #txt
Ls0 f5 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f5 actionDecl 'ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData out;
' #txt
Ls0 f5 actionTable 'out=in;
' #txt
Ls0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>local file</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f5 518 30 20 20 13 0 #rect
Ls0 f5 @|RichDialogProcessStartIcon #fIcon
Ls0 f6 targetWindow NEW:card: #txt
Ls0 f6 targetDisplay TOP #txt
Ls0 f6 richDialogId ch.ivyteam.ivy.rd.common.ServerFileBrowser #txt
Ls0 f6 startMethod start(Boolean,String,Boolean) #txt
Ls0 f6 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f6 requestActionDecl '<Boolean onlyDirectories, String rootPath, Boolean allowNewDirectories> param;' #txt
Ls0 f6 requestMappingAction 'param.onlyDirectories=in.onlyDirectories;
param.allowNewDirectories=false;
' #txt
Ls0 f6 requestActionCode 'import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.FileUtils;

in.filepath = in.filepath.trim();
if (!in.filepath.isEmpty())
{
	param.rootPath = FilenameUtils.getFullPath(in.filepath);
}' #txt
Ls0 f6 responseActionDecl 'ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData out;
' #txt
Ls0 f6 responseMappingAction 'out=in;
' #txt
Ls0 f6 responseActionCode 'if (!result.wasCancelled)
{
	out.filepath = result.path;
	out.isClient = false;
}' #txt
Ls0 f6 windowConfiguration '{/title "Choose <%=in.onlyDirectories ? \"Directory\" : \"File\" %>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ls0 f6 isAsynch false #txt
Ls0 f6 isInnerRd true #txt
Ls0 f6 userContext '* ' #txt
Ls0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>server file browser</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f6 662 100 36 24 20 -2 #rect
Ls0 f6 @|RichDialogIcon #fIcon
Ls0 f8 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f8 670 166 20 20 13 0 #rect
Ls0 f8 @|RichDialogProcessEndIcon #fIcon
Ls0 f9 expr out #txt
Ls0 f9 680 124 680 166 #arcP
Ls0 f10 guid 13847C80107EA6A5 #txt
Ls0 f10 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f10 actionDecl 'ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData out;
' #txt
Ls0 f10 actionTable 'out=in;
' #txt
Ls0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>remote file</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f10 670 30 20 20 13 0 #rect
Ls0 f10 @|RichDialogProcessStartIcon #fIcon
Ls0 f7 expr out #txt
Ls0 f7 680 50 680 100 #arcP
Ls0 f94 targetWindow NEW:card: #txt
Ls0 f94 targetDisplay TOP #txt
Ls0 f94 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDialog #txt
Ls0 f94 startMethod showError(java.lang.Throwable,Boolean,Boolean) #txt
Ls0 f94 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f94 requestActionDecl '<java.lang.Throwable error, Boolean showCopyButton, Boolean showDetailButton> param;' #txt
Ls0 f94 requestMappingAction 'param.error=new RuntimeException(in.fileTransferResult.getFailureMessage());
param.showCopyButton=true;
param.showDetailButton=false;
' #txt
Ls0 f94 responseActionDecl 'ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData out;
' #txt
Ls0 f94 responseMappingAction 'out=in;
' #txt
Ls0 f94 windowConfiguration '{/title "Import Environments"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ls0 f94 isAsynch false #txt
Ls0 f94 isInnerRd true #txt
Ls0 f94 userContext '* ' #txt
Ls0 f94 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error
message</name>
        <nameStyle>11,7
7,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f94 422 196 36 24 -27 -47 #rect
Ls0 f94 @|RichDialogIcon #fIcon
Ls0 f53 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f53 guid 13847DC0BEC34B5B #txt
Ls0 f53 515 131 26 26 13 0 #rect
Ls0 f53 @|RichDialogUiSyncIcon #fIcon
Ls0 f92 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f92 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>file transferred?</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f92 514 194 28 28 14 0 #rect
Ls0 f92 @|AlternativeIcon #fIcon
Ls0 f52 actionDecl 'ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData out;
' #txt
Ls0 f52 actionTable 'out=in;
' #txt
Ls0 f52 actionCode 'import ch.ivyteam.ivy.common.util.IvyFileUtils;
import ch.ivyteam.ivy.common.util.FileTransferResult;

out.fileTransferResult = IvyFileUtils.getLocalFile(panel, in.labelText, in.filepath);
out.isClient = true;
' #txt
Ls0 f52 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f52 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>open local dialog</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f52 510 84 36 24 20 -2 #rect
Ls0 f52 @|RichDialogProcessStepIcon #fIcon
Ls0 f56 expr out #txt
Ls0 f56 528 108 528 131 #arcP
Ls0 f93 expr out #txt
Ls0 f93 528 157 528 194 #arcP
Ls0 f11 expr out #txt
Ls0 f11 528 50 528 84 #arcP
Ls0 f13 expr out #txt
Ls0 f13 440 220 518 344 #arcP
Ls0 f13 1 440 344 #addKink
Ls0 f13 0 0.9758064516129032 0 0 #arcLabel
Ls0 f12 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f12 518 334 20 20 13 0 #rect
Ls0 f12 @|RichDialogProcessEndIcon #fIcon
Ls0 f14 expr in #txt
Ls0 f14 outCond in.fileTransferResult.wasCancelled() #txt
Ls0 f14 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel</name>
        <nameStyle>6,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f14 514 208 518 344 #arcP
Ls0 f14 1 488 208 #addKink
Ls0 f14 2 488 344 #addKink
Ls0 f14 1 0.7132352941176471 -5 0 #arcLabel
Ls0 f15 expr in #txt
Ls0 f15 outCond in.fileTransferResult.hasFailure() #txt
Ls0 f15 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>error</name>
        <nameStyle>5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f15 514 208 458 208 #arcP
Ls0 f15 0 0.4642857142857143 0 -10 #arcLabel
Ls0 f16 actionDecl 'ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData out;
' #txt
Ls0 f16 actionTable 'out=in;
' #txt
Ls0 f16 actionCode 'in.filepath = in.fileTransferResult.getLocalFile();' #txt
Ls0 f16 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set local 
file path</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f16 510 252 36 24 20 -2 #rect
Ls0 f16 @|RichDialogProcessStepIcon #fIcon
Ls0 f17 expr in #txt
Ls0 f17 outCond in.fileTransferResult.isSuccess() #txt
Ls0 f17 528 222 528 252 #arcP
Ls0 f18 expr out #txt
Ls0 f18 528 276 528 334 #arcP
Ls0 f18 0 0.4507702450113627 0 0 #arcLabel
Ls0 f19 expr in #txt
Ls0 f19 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>not yet</name>
        <nameStyle>7,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f19 542 208 541 144 #arcP
Ls0 f19 1 592 208 #addKink
Ls0 f19 2 592 144 #addKink
Ls0 f19 1 0.5104166666666666 0 0 #arcLabel
Ls0 f20 guid 13848215B583AD94 #txt
Ls0 f20 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f20 method getPath() #txt
Ls0 f20 disableUIEvents false #txt
Ls0 f20 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ls0 f20 outParameterDecl '<ch.ivyteam.ivy.admin.tool.ClientServerRemoteFile path> result;
' #txt
Ls0 f20 outParameterMapAction 'result.path.filepath=in.filepath;
result.path.isClient=in.isClient;
' #txt
Ls0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getPath()</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ls0 f20 862 38 20 20 13 0 #rect
Ls0 f20 @|RichDialogMethodStartIcon #fIcon
Ls0 f21 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f21 862 126 20 20 13 0 #rect
Ls0 f21 @|RichDialogProcessEndIcon #fIcon
Ls0 f22 expr out #txt
Ls0 f22 872 58 872 126 #arcP
Ls0 f4 expr out #txt
Ls0 f4 177 71 102 152 #arcP
Ls0 f2 expr out #txt
Ls0 f2 96 74 96 150 #arcP
Ls0 f0 guid 1384780A2ED87B03 #txt
Ls0 f0 type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
Ls0 f0 method start() #txt
Ls0 f0 disableUIEvents true #txt
Ls0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ls0 f0 outParameterDecl '<> result;
' #txt
Ls0 f0 embeddedRdInitializations '* ' #txt
Ls0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ls0 f0 86 54 20 20 13 0 #rect
Ls0 f0 @|RichDialogInitStartIcon #fIcon
>Proto Ls0 .ui2RdDataAction 'out.filepath=panel.txtFile.text;
' #txt
>Proto Ls0 .rdData2UIAction 'panel.Label.text=in.labelText;
panel.txtFile.text=in.filepath;
' #txt
>Proto Ls0 .type ch.ivyteam.rd.common.ClientServerFileChooser.ClientServerFileChooserData #txt
>Proto Ls0 .processKind RICH_DIALOG #txt
>Proto Ls0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>start methods</swimlaneLabel>
        <swimlaneLabel>events</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>392</swimlaneSize>
    <swimlaneSize>424</swimlaneSize>
    <swimlaneColor>-1</swimlaneColor>
    <swimlaneColor>-3342388</swimlaneColor>
</elementInfo>
' #txt
>Proto Ls0 -8 -8 16 16 16 26 #rect
>Proto Ls0 '' #fIcon
Ls0 f0 mainOut f2 tail #connect
Ls0 f2 head f1 mainIn #connect
Ls0 f6 mainOut f9 tail #connect
Ls0 f9 head f8 mainIn #connect
Ls0 f10 mainOut f7 tail #connect
Ls0 f7 head f6 mainIn #connect
Ls0 f52 mainOut f56 tail #connect
Ls0 f56 head f53 mainIn #connect
Ls0 f53 mainOut f93 tail #connect
Ls0 f93 head f92 in #connect
Ls0 f5 mainOut f11 tail #connect
Ls0 f11 head f52 mainIn #connect
Ls0 f94 mainOut f13 tail #connect
Ls0 f13 head f12 mainIn #connect
Ls0 f92 out f14 tail #connect
Ls0 f14 head f12 mainIn #connect
Ls0 f92 out f15 tail #connect
Ls0 f15 head f94 mainIn #connect
Ls0 f92 out f17 tail #connect
Ls0 f17 head f16 mainIn #connect
Ls0 f16 mainOut f18 tail #connect
Ls0 f18 head f12 mainIn #connect
Ls0 f92 out f19 tail #connect
Ls0 f19 head f53 mainIn #connect
Ls0 f20 mainOut f22 tail #connect
Ls0 f22 head f21 mainIn #connect
Ls0 f3 mainOut f4 tail #connect
Ls0 f4 head f1 mainIn #connect
