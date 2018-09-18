[Ivy]
[>Created: Tue May 24 09:47:53 CEST 2011]
11F280872D6A43E2 3.17 #module
>Proto >Proto Collection #zClass
Ds0 DeploymentChooseDirectoryProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @MessageFlowInP-0n messageIn messageIn #zField
Ds0 @MessageFlowOutP-0n messageOut messageOut #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogProcessStart f3 '' #zField
Ds0 @RichDialog f4 '' #zField
Ds0 @PushWFArc f5 '' #zField
Ds0 @RichDialogProcessEnd f6 '' #zField
Ds0 @PushWFArc f7 '' #zField
Ds0 @RichDialogMethodStart f8 '' #zField
Ds0 @RichDialogMethodStart f9 '' #zField
Ds0 @RichDialogProcessEnd f10 '' #zField
Ds0 @RichDialogProcessEnd f11 '' #zField
Ds0 @PushWFArc f12 '' #zField
Ds0 @PushWFArc f13 '' #zField
Ds0 @RichDialogProcessStart f14 '' #zField
Ds0 @RichDialog f15 '' #zField
Ds0 @RichDialogProcessEnd f16 '' #zField
Ds0 @PushWFArc f17 '' #zField
Ds0 @PushWFArc f18 '' #zField
>Proto Ds0 Ds0 DeploymentChooseDirectoryProcess #zField
Ds0 f0 guid 11F2808734384D10 #txt
Ds0 f0 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f0 method start() #txt
Ds0 f0 disableUIEvents false #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 inParameterMapAction 'out.file=new java.io.File("");
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 embeddedRdInitializations '* ' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f0 90 40 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f1 87 137 26 26 14 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f2 expr out #txt
Ds0 f2 100 60 100 137 #arcP
Ds0 f3 guid 11F2813B26B1D96B #txt
Ds0 f3 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData out;
' #txt
Ds0 f3 actionTable 'out=in;
' #txt
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>browseDirectory</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f3 174 38 20 20 13 0 #rect
Ds0 f3 @|RichDialogProcessStartIcon #fIcon
Ds0 f4 targetWindow NEW #txt
Ds0 f4 targetDisplay TOP #txt
Ds0 f4 richDialogId ch.ivyteam.ivy.rd.common.ServerFileBrowser #txt
Ds0 f4 startMethod start(Boolean,String,Boolean) #txt
Ds0 f4 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f4 requestActionDecl '<Boolean onlyDirectories, String rootPath, Boolean allowNewDirectories> param;' #txt
Ds0 f4 requestMappingAction 'param.onlyDirectories=true;
param.rootPath=in.file.getAbsolutePath();
param.allowNewDirectories=false;
' #txt
Ds0 f4 responseActionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData out;
' #txt
Ds0 f4 responseMappingAction 'out=in;
' #txt
Ds0 f4 responseActionCode 'if (result.#path!=null)
{
	in.file = new java.io.File(result.path);
}' #txt
Ds0 f4 windowConfiguration '#Tue Feb 03 16:05:09 CET 2009
height=400
maximized=false
centered=true
close_after_last_rd=true
resizable=true
width=400
title=Specify project directory
' #txt
Ds0 f4 isAsynch false #txt
Ds0 f4 isInnerRd true #txt
Ds0 f4 isDialog true #txt
Ds0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f4 166 92 36 24 20 -2 #rect
Ds0 f4 @|RichDialogIcon #fIcon
Ds0 f5 expr out #txt
Ds0 f5 184 58 184 92 #arcP
Ds0 f6 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f6 171 259 26 26 14 0 #rect
Ds0 f6 @|RichDialogProcessEndIcon #fIcon
Ds0 f7 expr out #txt
Ds0 f7 184 116 184 259 #arcP
Ds0 f8 guid 11F2841FC035AEDD #txt
Ds0 f8 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f8 method getFile() #txt
Ds0 f8 disableUIEvents false #txt
Ds0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f8 outParameterDecl '<java.io.File file> result;
' #txt
Ds0 f8 outParameterMapAction 'result.file=in.file;
' #txt
Ds0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getFile()</name>
        <nameStyle>9,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f8 102 310 20 20 13 0 #rect
Ds0 f8 @|RichDialogMethodStartIcon #fIcon
Ds0 f9 guid 11F284205536A11C #txt
Ds0 f9 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f9 method setFile(java.io.File) #txt
Ds0 f9 disableUIEvents false #txt
Ds0 f9 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.io.File file> param = methodEvent.getInputArguments();
' #txt
Ds0 f9 inParameterMapAction 'out.file=param.file;
' #txt
Ds0 f9 outParameterDecl '<> result;
' #txt
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setFile(File)</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f9 206 310 20 20 13 0 #rect
Ds0 f9 @|RichDialogMethodStartIcon #fIcon
Ds0 f10 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f10 99 355 26 26 14 0 #rect
Ds0 f10 @|RichDialogProcessEndIcon #fIcon
Ds0 f11 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f11 203 355 26 26 14 0 #rect
Ds0 f11 @|RichDialogProcessEndIcon #fIcon
Ds0 f12 expr out #txt
Ds0 f12 112 330 112 355 #arcP
Ds0 f13 expr out #txt
Ds0 f13 216 330 216 355 #arcP
Ds0 f14 guid 11F4B3DCCACBD9A5 #txt
Ds0 f14 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData out;
' #txt
Ds0 f14 actionTable 'out=in;
' #txt
Ds0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>browseFile</name>
        <nameStyle>10,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f14 310 38 20 20 13 0 #rect
Ds0 f14 @|RichDialogProcessStartIcon #fIcon
Ds0 f15 targetWindow NEW:card: #txt
Ds0 f15 targetDisplay TOP #txt
Ds0 f15 richDialogId ch.ivyteam.ivy.rd.common.ServerFileBrowser #txt
Ds0 f15 startMethod start(Boolean,String,Boolean) #txt
Ds0 f15 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f15 requestActionDecl '<Boolean onlyDirectories, String rootPath, Boolean allowNewDirectories> param;' #txt
Ds0 f15 requestMappingAction 'param.onlyDirectories=false;
param.rootPath=in.file.getAbsolutePath();
param.allowNewDirectories=false;
' #txt
Ds0 f15 responseActionDecl 'ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData out;
' #txt
Ds0 f15 responseMappingAction 'out=in;
' #txt
Ds0 f15 responseActionCode 'if (result.#path!=null)
{
	in.file = new java.io.File(result.path);
}' #txt
Ds0 f15 windowConfiguration '{/title "Choose project *.iar or *.zip file"/width 400 /height 400 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ds0 f15 isAsynch false #txt
Ds0 f15 isInnerRd true #txt
Ds0 f15 isDialog true #txt
Ds0 f15 userContext '* ' #txt
Ds0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ds0 f15 302 92 36 24 20 -2 #rect
Ds0 f15 @|RichDialogIcon #fIcon
Ds0 f16 type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
Ds0 f16 307 259 26 26 14 0 #rect
Ds0 f16 @|RichDialogProcessEndIcon #fIcon
Ds0 f17 expr out #txt
Ds0 f17 320 58 320 92 #arcP
Ds0 f18 expr out #txt
Ds0 f18 320 116 320 259 #arcP
>Proto Ds0 .ui2RdDataAction 'out.file=new java.io.File(panel.directoryTextField.text);
' #txt
>Proto Ds0 .rdData2UIAction 'panel.directoryTextField.text=in.file.getAbsolutePath();
' #txt
>Proto Ds0 .type ch.ivyteam.ivy.admin.tool.deployment.DeploymentChooseDirectory.DeploymentChooseDirectoryData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f0 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f3 mainOut f5 tail #connect
Ds0 f5 head f4 mainIn #connect
Ds0 f4 mainOut f7 tail #connect
Ds0 f7 head f6 mainIn #connect
Ds0 f8 mainOut f12 tail #connect
Ds0 f12 head f10 mainIn #connect
Ds0 f9 mainOut f13 tail #connect
Ds0 f13 head f11 mainIn #connect
Ds0 f14 mainOut f17 tail #connect
Ds0 f17 head f15 mainIn #connect
Ds0 f15 mainOut f18 tail #connect
Ds0 f18 head f16 mainIn #connect
