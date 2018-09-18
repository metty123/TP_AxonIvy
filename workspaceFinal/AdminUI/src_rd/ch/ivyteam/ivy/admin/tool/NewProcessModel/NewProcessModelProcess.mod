[Ivy]
[>Created: Mon Jul 28 12:11:31 CEST 2008]
116D93ADB6C7369B 3.10 #module
>Proto >Proto Collection #zClass
Ns0 NewProcessModelProcess Big #zClass
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
        <name>createProcessModel(IApplication)</name>
        <nameStyle>32,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f0 guid 116D93FEC6967812 #txt
Ns0 f0 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f0 method createProcessModel(ch.ivyteam.ivy.application.IApplication) #txt
Ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ns0 f0 inParameterMapAction 'out.application=param.application;
' #txt
Ns0 f0 outParameterDecl '<ch.ivyteam.ivy.application.IProcessModel createdProcessModel> result;
' #txt
Ns0 f0 outParameterMapAction 'result.createdProcessModel=in.#processModel;
' #txt
Ns0 f0 embeddedRdInitializations '* ' #txt
Ns0 f0 38 46 20 20 13 0 #rect
Ns0 f0 @|RichDialogInitStartIcon #fIcon
Ns0 @RichDialogProcessEnd f1 '' #zField
Ns0 f1 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f1 35 147 26 26 14 0 #rect
Ns0 f1 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f2 '' #zField
Ns0 f2 expr out #txt
Ns0 f2 48 66 48 147 #arcP
Ns0 @RichDialogProcessStart f3 '' #zField
Ns0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f3 guid 116D9415BC71D3ED #txt
Ns0 f3 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData out;
' #txt
Ns0 f3 actionTable 'out=in;
' #txt
Ns0 f3 278 46 20 20 13 0 #rect
Ns0 f3 @|RichDialogProcessStartIcon #fIcon
Ns0 @RichDialogProcessStart f4 '' #zField
Ns0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f4 guid 116D941636384AEE #txt
Ns0 f4 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData out;
' #txt
Ns0 f4 actionTable 'out=in;
' #txt
Ns0 f4 462 46 20 20 13 0 #rect
Ns0 f4 @|RichDialogProcessStartIcon #fIcon
Ns0 @RichDialogProcessStep f7 '' #zField
Ns0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create pm</name>
        <nameStyle>9,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData out;
' #txt
Ns0 f7 actionTable 'out=in;
' #txt
Ns0 f7 actionCode '
in.processModel = in.application.createProcessModel(in.name, in.description);' #txt
Ns0 f7 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f7 454 204 36 24 25 -9 #rect
Ns0 f7 @|RichDialogProcessStepIcon #fIcon
Ns0 @RichDialogEnd f11 '' #zField
Ns0 f11 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f11 guid 116D94BB01A5C954 #txt
Ns0 f11 275 139 26 26 14 0 #rect
Ns0 f11 @|RichDialogEndIcon #fIcon
Ns0 @RichDialogEnd f12 '' #zField
Ns0 f12 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f12 guid 116D94BB6DCE6D50 #txt
Ns0 f12 459 259 26 26 14 0 #rect
Ns0 f12 @|RichDialogEndIcon #fIcon
Ns0 @PushWFArc f5 '' #zField
Ns0 f5 expr out #txt
Ns0 f5 288 66 288 139 #arcP
Ns0 @PushWFArc f6 '' #zField
Ns0 f6 expr out #txt
Ns0 f6 472 228 472 259 #arcP
Ns0 @RichDialog f38 '' #zField
Ns0 f38 targetWindow NEW #txt
Ns0 f38 targetDisplay TOP #txt
Ns0 f38 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Ns0 f38 startMethod showMessage(String) #txt
Ns0 f38 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f38 requestActionDecl '<String message> param;' #txt
Ns0 f38 requestMappingAction 'param.message=in.validationError;
' #txt
Ns0 f38 responseActionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData out;
' #txt
Ns0 f38 responseMappingAction 'out=in;
' #txt
Ns0 f38 windowConfiguration '#Wed May 07 15:26:19 CEST 2008
height=0
maximized=false
centered=true
close_after_last_rd=true
resizable=false
width=0
title=Could not create process model
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
Ns0 f38 574 204 36 24 23 -8 #rect
Ns0 f38 @|RichDialogIcon #fIcon
Ns0 @RichDialogProcessStep f9 '' #zField
Ns0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Validation</name>
        <nameStyle>10,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData out;
' #txt
Ns0 f9 actionTable 'out=in;
' #txt
Ns0 f9 actionCode 'import ch.ivyteam.ivy.checking.CommonFormats;

in.validationError = null;
in.name = in.name.trim();

// check name
if (!CommonFormats.APPLICATION_PROCESS_MODEL_NAME.test(in.name))
{
	in.validationError ="Name is not valid. Please use only alphanumerical characters and the underline character (_)";
}
else if (in.application.findProcessModel(in.name) != null)
{
	in.validationError = "There is already a process model with the name ''" + in.name + "''!";
}' #txt
Ns0 f9 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f9 454 92 36 24 22 -9 #rect
Ns0 f9 @|RichDialogProcessStepIcon #fIcon
Ns0 @PushWFArc f10 '' #zField
Ns0 f10 expr out #txt
Ns0 f10 472 66 472 92 #arcP
Ns0 @Alternative f13 '' #zField
Ns0 f13 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Valid?</name>
        <nameStyle>6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f13 458 138 28 28 21 -7 #rect
Ns0 f13 @|AlternativeIcon #fIcon
Ns0 @PushWFArc f14 '' #zField
Ns0 f14 expr out #txt
Ns0 f14 472 116 472 138 #arcP
Ns0 @PushWFArc f8 '' #zField
Ns0 f8 expr in #txt
Ns0 f8 outCond 'in.validationError.trim().length() == 0' #txt
Ns0 f8 472 166 472 204 #arcP
Ns0 @RichDialogProcessEnd f15 '' #zField
Ns0 f15 type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
Ns0 f15 579 251 26 26 14 0 #rect
Ns0 f15 @|RichDialogProcessEndIcon #fIcon
Ns0 @PushWFArc f16 '' #zField
Ns0 f16 expr in #txt
Ns0 f16 479 159 592 204 #arcP
Ns0 f16 1 488 168 #addKink
Ns0 f16 2 592 168 #addKink
Ns0 f16 1 0.6448669192057392 0 0 #arcLabel
Ns0 @PushWFArc f17 '' #zField
Ns0 f17 expr out #txt
Ns0 f17 592 228 592 251 #arcP
Ns0 f0 mainOut f2 tail #connect
Ns0 f2 head f1 mainIn #connect
Ns0 f3 mainOut f5 tail #connect
Ns0 f5 head f11 mainIn #connect
Ns0 f7 mainOut f6 tail #connect
Ns0 f6 head f12 mainIn #connect
Ns0 f4 mainOut f10 tail #connect
Ns0 f10 head f9 mainIn #connect
Ns0 f9 mainOut f14 tail #connect
Ns0 f14 head f13 in #connect
Ns0 f13 out f8 tail #connect
Ns0 f8 head f7 mainIn #connect
Ns0 f13 out f16 tail #connect
Ns0 f16 head f38 mainIn #connect
Ns0 f38 mainOut f17 tail #connect
Ns0 f17 head f15 mainIn #connect
>Proto Ns0 Ns0 NewProcessModelProcess #zField
>Proto Ns0 .ui2RdDataAction 'out.name=panel.nameTextField.text;
out.description=panel.descriptionTextArea.text;
' #txt
>Proto Ns0 .rdData2UIAction 'panel.nameTextField.text=in.name;
panel.descriptionTextArea.text=in.description;
' #txt
>Proto Ns0 .type ch.ivyteam.ivy.admin.tool.NewProcessModel.NewProcessModelData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
