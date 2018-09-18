[Ivy]
[>Created: Thu Jul 24 15:08:27 CEST 2008]
116D951403ABB772 3.10 #module
>Proto >Proto Collection #zClass
Ns0 NewProcessModelVersionProcess Big #zClass
Ns0 RD #cInfo
Ns0 #process
Ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ns0 @AnnotationInP-0n ai ai #zField
Ns0 @TextInP .xml .xml #zField
Ns0 @TextInP .responsibility .responsibility #zField
Ns0 @TextInP .resExport .resExport #zField
Ns0 @TextInP .type .type #zField
Ns0 @TextInP .processKind .processKind #zField
Ns0 @MessageFlowInP-0n messageIn messageIn #zField
Ns0 @MessageFlowOutP-0n messageOut messageOut #zField
Ns0 @RichDialogInitStart f0 '' #zField
Ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createProcessModelVersion(IProcessModel)</name>
        <nameStyle>40,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f0 guid 116D9564436DC432 #txt
Ns0 f0 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f0 method createProcessModelVersion(ch.ivyteam.ivy.application.IProcessModel) #txt
Ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModel processModel> param = methodEvent.getInputArguments();
' #txt
Ns0 f0 inParameterMapAction 'out.processModel=param.processModel;
' #txt
Ns0 f0 outParameterDecl '<ch.ivyteam.ivy.application.IProcessModelVersion createdProcessModelVersion> result;
' #txt
Ns0 f0 outParameterMapAction 'result.createdProcessModelVersion=in.#processModelVersion;
' #txt
Ns0 f0 embeddedRdInitializations '* ' #txt
Ns0 f0 54 54 20 20 13 0 #rect
Ns0 f0 @|RichDialogInitStartIcon #fIcon
Ns0 @RichDialogProcessEnd f1 '' #zField
Ns0 f1 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f1 51 163 26 26 14 0 #rect
Ns0 f1 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f2 '' #zField
Ns0 f2 expr out #txt
Ns0 f2 64 74 64 163 #arcP
Ns0 @RichDialogProcessStart f3 '' #zField
Ns0 f3 guid 116D956B3BECDCC8 #txt
Ns0 f3 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData out;
' #txt
Ns0 f3 actionTable 'out=in;
' #txt
Ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f3 350 54 20 20 13 0 #rect
Ns0 f3 @|RichDialogProcessStartIcon #fIcon
Ns0 @RichDialogProcessStart f4 '' #zField
Ns0 f4 guid 116D956BBC139555 #txt
Ns0 f4 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData out;
' #txt
Ns0 f4 actionTable 'out=in;
' #txt
Ns0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f4 54 246 20 20 13 0 #rect
Ns0 f4 @|RichDialogProcessStartIcon #fIcon
Ns0 @RichDialogEnd f5 '' #zField
Ns0 f5 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f5 guid 116D956C7896556A #txt
Ns0 f5 347 171 26 26 14 0 #rect
Ns0 f5 @|RichDialogEndIcon #fIcon
Ns0 @RichDialogEnd f6 '' #zField
Ns0 f6 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f6 guid 116D956CDE99B993 #txt
Ns0 f6 51 459 26 26 14 0 #rect
Ns0 f6 @|RichDialogEndIcon #fIcon
Ns0 @RichDialogProcessStep f7 '' #zField
Ns0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create pmv</name>
        <nameStyle>10,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData out;
' #txt
Ns0 f7 actionTable 'out=in;
' #txt
Ns0 f7 actionCode 'import ch.ivyteam.ivy.application.IProcessModelVersion;

int nextVersionNumber;

for (IProcessModelVersion pmv : in.processModel.getProcessModelVersions())
{
  if (nextVersionNumber < pmv.getVersionNumber())
  {
    nextVersionNumber = pmv.getVersionNumber();
  }
}
nextVersionNumber++;
in.processModelVersion = in.processModel.createProcessModelVersion(in.name, in.description, in.processModel.getApplication().getId().toString()+"_"+in.processModel.getId().toString()+"_"+nextVersionNumber, 0, "Administrator", "localhost");' #txt
Ns0 f7 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f7 46 396 36 24 20 -2 #rect
Ns0 f7 @|RichDialogProcessStepIcon #fIcon
Ns0 @PushWFArc f8 '' #zField
Ns0 f8 expr out #txt
Ns0 f8 360 74 360 171 #arcP
Ns0 @PushWFArc f10 '' #zField
Ns0 f10 expr out #txt
Ns0 f10 64 420 64 459 #arcP
Ns0 @RichDialog f38 '' #zField
Ns0 f38 targetWindow NEW #txt
Ns0 f38 targetDisplay TOP #txt
Ns0 f38 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Ns0 f38 startMethod showMessage(String) #txt
Ns0 f38 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f38 requestActionDecl '<String message> param;' #txt
Ns0 f38 requestMappingAction 'param.message=in.validationError;
' #txt
Ns0 f38 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData out;
' #txt
Ns0 f38 responseMappingAction 'out=in;
' #txt
Ns0 f38 windowConfiguration '#Wed May 07 15:28:28 CEST 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=0
title=Could not create process model version
' #txt
Ns0 f38 isAsynch false #txt
Ns0 f38 isInnerRd true #txt
Ns0 f38 isDialog true #txt
Ns0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Show error dialog</name>
        <nameStyle>17,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f38 166 404 36 24 23 -8 #rect
Ns0 f38 @|RichDialogIcon #fIcon
Ns0 @RichDialogProcessStep f11 '' #zField
Ns0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Validation</name>
        <nameStyle>10,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData out;
' #txt
Ns0 f11 actionTable 'out=in;
' #txt
Ns0 f11 actionCode 'in.validationError = null;

if (in.name.trim().length() == 0)
{
	in.validationError = "The name must not be empty!";	
}

' #txt
Ns0 f11 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f11 46 292 36 24 22 -9 #rect
Ns0 f11 @|RichDialogProcessStepIcon #fIcon
Ns0 @Alternative f13 '' #zField
Ns0 f13 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Valid?</name>
        <nameStyle>6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f13 50 338 28 28 21 -7 #rect
Ns0 f13 @|AlternativeIcon #fIcon
Ns0 @PushWFArc f14 '' #zField
Ns0 f14 expr out #txt
Ns0 f14 64 316 64 338 #arcP
Ns0 @PushWFArc f12 '' #zField
Ns0 f12 expr out #txt
Ns0 f12 64 266 64 292 #arcP
Ns0 @PushWFArc f9 '' #zField
Ns0 f9 expr in #txt
Ns0 f9 outCond 'in.validationError.length() == 0' #txt
Ns0 f9 64 366 64 396 #arcP
Ns0 @RichDialogProcessEnd f15 '' #zField
Ns0 f15 type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
Ns0 f15 171 459 26 26 14 0 #rect
Ns0 f15 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f17 '' #zField
Ns0 f17 expr out #txt
Ns0 f17 184 428 184 459 #arcP
Ns0 @PushWFArc f16 '' #zField
Ns0 f16 expr in #txt
Ns0 f16 71 359 184 404 #arcP
Ns0 f16 1 80 368 #addKink
Ns0 f16 2 184 368 #addKink
Ns0 f16 1 0.5653622119377982 0 0 #arcLabel
Ns0 f0 mainOut f2 tail #connect
Ns0 f2 head f1 mainIn #connect
Ns0 f3 mainOut f8 tail #connect
Ns0 f8 head f5 mainIn #connect
Ns0 f7 mainOut f10 tail #connect
Ns0 f10 head f6 mainIn #connect
Ns0 f11 mainOut f14 tail #connect
Ns0 f14 head f13 in #connect
Ns0 f4 mainOut f12 tail #connect
Ns0 f12 head f11 mainIn #connect
Ns0 f13 out f9 tail #connect
Ns0 f9 head f7 mainIn #connect
Ns0 f38 mainOut f17 tail #connect
Ns0 f17 head f15 mainIn #connect
Ns0 f13 out f16 tail #connect
Ns0 f16 head f38 mainIn #connect
>Proto Ns0 Ns0 NewProcessModelVersionProcess #zField
>Proto Ns0 .ui2RdDataAction 'out.name=panel.nameTextField.text;
out.description=panel.descriptionTextArea.text;
' #txt
>Proto Ns0 .rdData2UIAction 'panel.nameTextField.text=in.name;
panel.descriptionTextArea.text=in.description;
' #txt
>Proto Ns0 .type ch.ivyteam.ivy.admin.tool.NewProcessModelVersion.NewProcessModelVersionData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
