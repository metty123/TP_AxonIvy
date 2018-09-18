[Ivy]
[>Created: Thu Oct 02 15:49:43 ICT 2014]
12177524C1FECA77 3.17 #module
>Proto >Proto Collection #zClass
Gs0 GlobalVariableDetailsProcess Big #zClass
Gs0 RD #cInfo
Gs0 #process
Gs0 @AnnotationInP-0n ai ai #zField
Gs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Gs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Gs0 @TextInP .resExport .resExport #zField
Gs0 @TextInP .type .type #zField
Gs0 @TextInP .processKind .processKind #zField
Gs0 @TextInP .xml .xml #zField
Gs0 @TextInP .responsibility .responsibility #zField
Gs0 @MessageFlowInP-0n messageIn messageIn #zField
Gs0 @MessageFlowOutP-0n messageOut messageOut #zField
Gs0 @RichDialogInitStart f0 '' #zField
Gs0 @RichDialogProcessEnd f1 '' #zField
Gs0 @PushWFArc f2 '' #zField
Gs0 @RichDialogInitStart f3 '' #zField
Gs0 @RichDialogProcessStart f5 '' #zField
Gs0 @RichDialogProcessStep f6 '' #zField
Gs0 @RichDialogEnd f8 '' #zField
Gs0 @PushWFArc f9 '' #zField
Gs0 @RichDialogProcessStart f10 '' #zField
Gs0 @Alternative f12 '' #zField
Gs0 @RichDialogEnd f14 '' #zField
Gs0 @PushWFArc f15 '' #zField
Gs0 @RichDialog f11 '' #zField
Gs0 @Alternative f17 '' #zField
Gs0 @PushWFArc f18 '' #zField
Gs0 @RichDialogProcessStep f19 '' #zField
Gs0 @PushWFArc f22 '' #zField
Gs0 @PushWFArc f20 '' #zField
Gs0 @RichDialogProcessStart f23 '' #zField
Gs0 @RichDialog f24 '' #zField
Gs0 @Alternative f26 '' #zField
Gs0 @RichDialog f74 '' #zField
Gs0 @RichDialogProcessStep f27 '' #zField
Gs0 @PushWFArc f28 '' #zField
Gs0 @PushWFArc f29 '' #zField
Gs0 @PushWFArc f30 '' #zField
Gs0 @RichDialogEnd f34 '' #zField
Gs0 @PushWFArc f35 '' #zField
Gs0 @PushWFArc f33 '' #zField
Gs0 @PushWFArc f36 '' #zField
Gs0 @RichDialogProcessStep f25 '' #zField
Gs0 @PushWFArc f31 '' #zField
Gs0 @PushWFArc f4 '' #zField
Gs0 @PushWFArc f39 '' #zField
Gs0 @PushWFArc f37 '' #zField
Gs0 @PushWFArc f7 '' #zField
Gs0 @RichDialogProcessStep f16 '' #zField
Gs0 @PushWFArc f21 '' #zField
Gs0 @Alternative f32 '' #zField
Gs0 @PushWFArc f38 '' #zField
Gs0 @PushWFArc f13 '' #zField
Gs0 @RichDialogProcessEnd f41 '' #zField
Gs0 @RichDialog f40 '' #zField
Gs0 @PushWFArc f43 '' #zField
Gs0 @PushWFArc f42 '' #zField
>Proto Gs0 Gs0 GlobalVariableDetailsProcess #zField
Gs0 f0 guid 12177524C6D6AA49 #txt
Gs0 f0 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f0 method start() #txt
Gs0 f0 disableUIEvents false #txt
Gs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Gs0 f0 outParameterDecl '<> result;
' #txt
Gs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Gs0 f0 38 38 20 20 13 0 #rect
Gs0 f0 @|RichDialogInitStartIcon #fIcon
Gs0 f1 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f1 35 163 26 26 14 0 #rect
Gs0 f1 @|RichDialogProcessEndIcon #fIcon
Gs0 f2 expr out #txt
Gs0 f2 48 58 48 163 #arcP
Gs0 f3 guid 12177561126E5069 #txt
Gs0 f3 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f3 method showDetails(ch.ivyteam.ivy.application.restricted.IGlobalVariable,ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Gs0 f3 disableUIEvents false #txt
Gs0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.restricted.IGlobalVariable globalVariable,ch.ivyteam.ivy.application.restricted.IEnvironment environment> param = methodEvent.getInputArguments();
' #txt
Gs0 f3 inParameterMapAction 'out.description=param.globalVariable.description;
out.editMode=true;
out.environment=param.environment;
out.globalVariable=param.globalVariable;
out.isDefault=param.environment.isDefault();
out.name=param.globalVariable.name;
out.value=param.globalVariable.value;
' #txt
Gs0 f3 outParameterDecl '<ch.ivyteam.ivy.application.restricted.IGlobalVariable globalVariable> result;
' #txt
Gs0 f3 outParameterMapAction 'result.globalVariable=in.globalVariable;
' #txt
Gs0 f3 embeddedRdInitializations '* ' #txt
Gs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showDetails(IGlobalVariable)</name>
        <nameStyle>28,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f3 134 38 20 20 13 0 #rect
Gs0 f3 @|RichDialogInitStartIcon #fIcon
Gs0 f5 guid 1217756D1B74F018 #txt
Gs0 f5 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f5 actionTable 'out=in;
' #txt
Gs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save</name>
        <nameStyle>4,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f5 558 46 20 20 13 0 #rect
Gs0 f5 @|RichDialogProcessStartIcon #fIcon
Gs0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f6 actionTable 'out=in;
' #txt
Gs0 f6 actionCode 'in.globalVariable.setName(in.name);
in.globalVariable.setDescription(in.description);
in.globalVariable.setValue(in.value);

' #txt
Gs0 f6 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set values</name>
        <nameStyle>10,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f6 550 468 36 24 20 -2 #rect
Gs0 f6 @|RichDialogProcessStepIcon #fIcon
Gs0 f8 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f8 guid 1217757018156BE7 #txt
Gs0 f8 555 539 26 26 14 0 #rect
Gs0 f8 @|RichDialogEndIcon #fIcon
Gs0 f9 expr out #txt
Gs0 f9 568 492 568 539 #arcP
Gs0 f9 0 0.4599442048841786 0 0 #arcLabel
Gs0 f10 guid 1217757ADFDFD06D #txt
Gs0 f10 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f10 actionTable 'out=in;
' #txt
Gs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f10 830 46 20 20 11 1 #rect
Gs0 f10 @|RichDialogProcessStartIcon #fIcon
Gs0 f12 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is default environment / 
or overridden global variable?</name>
        <nameStyle>56,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f12 554 306 28 28 -37 -66 #rect
Gs0 f12 @|AlternativeIcon #fIcon
Gs0 f14 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f14 guid 121877CC5019A568 #txt
Gs0 f14 827 99 26 26 14 0 #rect
Gs0 f14 @|RichDialogEndIcon #fIcon
Gs0 f15 expr out #txt
Gs0 f15 840 66 840 99 #arcP
Gs0 f15 0 0.728956228956229 0 0 #arcLabel
Gs0 f11 targetDisplay TOP #txt
Gs0 f11 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Gs0 f11 startMethod askQuestion(String,String,List<String>,String) #txt
Gs0 f11 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f11 requestActionDecl '<String icon, String question, List<String> buttons, String defaultButton> param;' #txt
Gs0 f11 requestMappingAction 'param.question="This is the default global variable. Would you like to override the default variable for the environment";
param.buttons=["yes","no"];
param.defaultButton="no";
' #txt
Gs0 f11 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f11 responseMappingAction 'out=in;
out.pressedButton=result.pressedButton;
' #txt
Gs0 f11 windowConfiguration '{/title "Question"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Gs0 f11 isAsynch false #txt
Gs0 f11 isInnerRd true #txt
Gs0 f11 isDialog true #txt
Gs0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Aks to
override</name>
        <nameStyle>15,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f11 654 308 36 24 20 -2 #rect
Gs0 f11 @|RichDialogIcon #fIcon
Gs0 f17 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>pressed</name>
        <nameStyle>7,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f17 658 370 28 28 14 0 #rect
Gs0 f17 @|AlternativeIcon #fIcon
Gs0 f18 expr out #txt
Gs0 f18 672 332 672 370 #arcP
Gs0 f19 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f19 actionTable 'out=in;
' #txt
Gs0 f19 actionCode 'in.globalVariable = in.environment.createGlobalVariable(in.name,in.description,in.value);

' #txt
Gs0 f19 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create
variable for
environment</name>
        <nameStyle>31,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f19 654 468 36 24 20 -2 #rect
Gs0 f19 @|RichDialogProcessStepIcon #fIcon
Gs0 f22 expr out #txt
Gs0 f22 672 492 581 552 #arcP
Gs0 f22 1 672 552 #addKink
Gs0 f22 1 0.20313302072718067 0 0 #arcLabel
Gs0 f20 expr in #txt
Gs0 f20 686 384 581 552 #arcP
Gs0 f20 1 792 384 #addKink
Gs0 f20 2 792 552 #addKink
Gs0 f20 2 0.08668117542028242 0 0 #arcLabel
Gs0 f23 guid 122784F8248DED2B #txt
Gs0 f23 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f23 actionTable 'out=in;
' #txt
Gs0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>resetToDefault</name>
        <nameStyle>14,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f23 350 598 20 20 13 0 #rect
Gs0 f23 @|RichDialogProcessStartIcon #fIcon
Gs0 f24 targetDisplay TOP #txt
Gs0 f24 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Gs0 f24 startMethod showMessage(String) #txt
Gs0 f24 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f24 requestActionDecl '<String message> param;' #txt
Gs0 f24 requestMappingAction 'param.message="The environment configuration for the global variable was successfully restored to the default value";
' #txt
Gs0 f24 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f24 responseMappingAction 'out=in;
' #txt
Gs0 f24 windowConfiguration '{/title "Restore Default Value"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Gs0 f24 isAsynch false #txt
Gs0 f24 isInnerRd true #txt
Gs0 f24 isDialog true #txt
Gs0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Information</name>
        <nameStyle>11,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f24 422 780 36 24 20 -2 #rect
Gs0 f24 @|RichDialogIcon #fIcon
Gs0 f26 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Gs0 f26 346 730 28 28 14 0 #rect
Gs0 f26 @|AlternativeIcon #fIcon
Gs0 f74 targetDisplay TOP #txt
Gs0 f74 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Gs0 f74 startMethod askQuestion(String,String,List<String>,String) #txt
Gs0 f74 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f74 requestActionDecl '<String icon, String question, List<String> buttons, String defaultButton> param;' #txt
Gs0 f74 requestMappingAction 'param.question="Would you like to restore the default value";
param.buttons=["yes","no"];
param.defaultButton="no";
' #txt
Gs0 f74 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f74 responseMappingAction 'out=in;
out.pressedButton=result.pressedButton;
' #txt
Gs0 f74 windowConfiguration '{/title "Restore Default Value"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Gs0 f74 isAsynch false #txt
Gs0 f74 isInnerRd true #txt
Gs0 f74 isDialog true #txt
Gs0 f74 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Aks to
restore</name>
        <nameStyle>14,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f74 342 652 36 24 20 -2 #rect
Gs0 f74 @|RichDialogIcon #fIcon
Gs0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f27 actionTable 'out=in;
' #txt
Gs0 f27 actionCode 'import ch.ivyteam.ivy.application.restricted.IDefaultGlobalVariable;
if(in.globalVariable.getDefaultGlobalVariable() != null){
	IDefaultGlobalVariable defaultVar = in.globalVariable.getDefaultGlobalVariable() as IDefaultGlobalVariable;
  defaultVar.deleteEnvirommentConfiguration(in.environment.getName())	;
  in.isDefault = true;
	in.globalVariable = null;
}' #txt
Gs0 f27 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Reset environment 
value to default</name>
        <nameStyle>35,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f27 422 732 36 24 20 -2 #rect
Gs0 f27 @|RichDialogProcessStepIcon #fIcon
Gs0 f28 expr out #txt
Gs0 f28 360 618 360 652 #arcP
Gs0 f29 expr out #txt
Gs0 f29 360 676 360 730 #arcP
Gs0 f30 expr in #txt
Gs0 f30 outCond 'in.pressedButton == "yes"' #txt
Gs0 f30 374 744 422 744 #arcP
Gs0 f34 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f34 guid 122785F746712D69 #txt
Gs0 f34 350 838 20 20 13 0 #rect
Gs0 f34 @|RichDialogEndIcon #fIcon
Gs0 f35 expr out #txt
Gs0 f35 440 804 370 848 #arcP
Gs0 f35 1 440 848 #addKink
Gs0 f35 1 0.17356271248217928 0 0 #arcLabel
Gs0 f33 expr in #txt
Gs0 f33 360 758 360 838 #arcP
Gs0 f36 expr out #txt
Gs0 f36 440 756 440 780 #arcP
Gs0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f25 actionTable 'out=in;
' #txt
Gs0 f25 actionCode 'String valueOfGlobalVar = (in.#globalVariable == null ? "" : in.globalVariable.getValue());

if (in.isDefault)
{
	panel.txfDefaultValue.text = valueOfGlobalVar;
}
else
{
	if (in.globalVariable.getDefaultGlobalVariable() != null)
	{
		panel.txfDefaultValue.text = in.globalVariable.getDefaultGlobalVariable().getValue();
	}
	else
	{
		panel.txfDefaultValue.text = valueOfGlobalVar;
	}
}' #txt
Gs0 f25 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Set text for txfDefaultValue</name>
        <nameStyle>28,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f25 126 100 36 24 20 -2 #rect
Gs0 f25 @|RichDialogProcessStepIcon #fIcon
Gs0 f31 expr out #txt
Gs0 f31 144 58 144 100 #arcP
Gs0 f31 0 0.484375 0 0 #arcLabel
Gs0 f4 expr out #txt
Gs0 f4 144 124 61 176 #arcP
Gs0 f4 1 144 176 #addKink
Gs0 f4 1 0.28184375323705557 0 0 #arcLabel
Gs0 f39 expr in #txt
Gs0 f39 outCond 'in.isDefault || in.globalVariable.getDefaultGlobalVariable() != null' #txt
Gs0 f39 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f39 568 334 568 468 #arcP
Gs0 f37 expr in #txt
Gs0 f37 outCond "yes".equalsIgnoreCase(in.pressedButton) #txt
Gs0 f37 672 398 672 468 #arcP
Gs0 f37 0 0.43827230840099407 0 0 #arcLabel
Gs0 f7 expr in #txt
Gs0 f7 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f7 582 320 654 320 #arcP
Gs0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f16 actionTable 'out=in;
' #txt
Gs0 f16 actionCode 'import java.text.MessageFormat;

if (in.value.length() > 2000)
{
	in.errorMessage = MessageFormat.format(ivy.cms.co("/Dialogs/general/shortThan"), "Value", 2000);
}
else 
{
	in.errorMessage = "";
}' #txt
Gs0 f16 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate</name>
        <nameStyle>8
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f16 550 108 36 24 20 -2 #rect
Gs0 f16 @|RichDialogProcessStepIcon #fIcon
Gs0 f21 expr out #txt
Gs0 f21 568 66 568 108 #arcP
Gs0 f32 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is valid?</name>
        <nameStyle>9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f32 554 178 28 28 14 0 #rect
Gs0 f32 @|AlternativeIcon #fIcon
Gs0 f38 expr out #txt
Gs0 f38 568 132 568 178 #arcP
Gs0 f13 expr in #txt
Gs0 f13 outCond in.errorMessage.isEmpty() #txt
Gs0 f13 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f13 568 206 568 306 #arcP
Gs0 f13 0 0.23 11 0 #arcLabel
Gs0 f41 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f41 438 542 20 20 13 0 #rect
Gs0 f41 @|RichDialogProcessEndIcon #fIcon
Gs0 f40 targetWindow NEW:card: #txt
Gs0 f40 targetDisplay TOP #txt
Gs0 f40 richDialogId ch.ivyteam.ivy.commondialogs.ErrorDialog #txt
Gs0 f40 startMethod showError(ch.ivyteam.ivy.commons.data.technical.IvyResultStatus,Boolean,Boolean) #txt
Gs0 f40 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
Gs0 f40 requestActionDecl '<ch.ivyteam.ivy.commons.data.technical.IvyResultStatus ivyResultStatus, Boolean showCopyButton, Boolean showDetailButton> param;' #txt
Gs0 f40 requestActionCode 'param.ivyResultStatus.message = in.errorMessage;' #txt
Gs0 f40 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData out;
' #txt
Gs0 f40 responseMappingAction 'out=in;
' #txt
Gs0 f40 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Gs0 f40 isAsynch false #txt
Gs0 f40 isInnerRd true #txt
Gs0 f40 userContext '* ' #txt
Gs0 f40 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show errror</name>
        <nameStyle>11
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f40 430 308 36 24 20 -2 #rect
Gs0 f40 @|RichDialogIcon #fIcon
Gs0 f43 expr in #txt
Gs0 f43 554 192 448 308 #arcP
Gs0 f43 1 448 192 #addKink
Gs0 f43 1 0.440929031883468 0 0 #arcLabel
Gs0 f42 expr out #txt
Gs0 f42 448 332 448 542 #arcP
>Proto Gs0 .ui2RdDataAction 'out.description=panel.txaDescription.text;
out.name=panel.txfName.text;
out.value=panel.txfValue.valueAsString;
' #txt
>Proto Gs0 .rdData2UIAction 'panel.btnResetToDefault.visible=!in.isDefault;
panel.lblDefaultValue.visible=!in.isDefault;
panel.txaDescription.text=in.description;
panel.txfDefaultValue.visible=!in.isDefault;
panel.txfName.enabled=!in.editMode;
panel.txfName.text=in.name;
panel.txfValue.valueAsString=in.value;
' #txt
>Proto Gs0 .type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails.GlobalVariableDetailsData #txt
>Proto Gs0 .processKind RICH_DIALOG #txt
>Proto Gs0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>328</swimlaneSize>
    <swimlaneSize>576</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
</elementInfo>
' #txt
>Proto Gs0 -8 -8 16 16 16 26 #rect
>Proto Gs0 '' #fIcon
Gs0 f0 mainOut f2 tail #connect
Gs0 f2 head f1 mainIn #connect
Gs0 f6 mainOut f9 tail #connect
Gs0 f9 head f8 mainIn #connect
Gs0 f10 mainOut f15 tail #connect
Gs0 f15 head f14 mainIn #connect
Gs0 f11 mainOut f18 tail #connect
Gs0 f18 head f17 in #connect
Gs0 f19 mainOut f22 tail #connect
Gs0 f22 head f8 mainIn #connect
Gs0 f20 head f8 mainIn #connect
Gs0 f23 mainOut f28 tail #connect
Gs0 f28 head f74 mainIn #connect
Gs0 f74 mainOut f29 tail #connect
Gs0 f29 head f26 in #connect
Gs0 f26 out f30 tail #connect
Gs0 f30 head f27 mainIn #connect
Gs0 f24 mainOut f35 tail #connect
Gs0 f35 head f34 mainIn #connect
Gs0 f26 out f33 tail #connect
Gs0 f33 head f34 mainIn #connect
Gs0 f27 mainOut f36 tail #connect
Gs0 f36 head f24 mainIn #connect
Gs0 f3 mainOut f31 tail #connect
Gs0 f31 head f25 mainIn #connect
Gs0 f25 mainOut f4 tail #connect
Gs0 f4 head f1 mainIn #connect
Gs0 f12 out f39 tail #connect
Gs0 f39 head f6 mainIn #connect
Gs0 f17 out f37 tail #connect
Gs0 f37 head f19 mainIn #connect
Gs0 f17 out f20 tail #connect
Gs0 f12 out f7 tail #connect
Gs0 f7 head f11 mainIn #connect
Gs0 f5 mainOut f21 tail #connect
Gs0 f21 head f16 mainIn #connect
Gs0 f16 mainOut f38 tail #connect
Gs0 f38 head f32 in #connect
Gs0 f32 out f13 tail #connect
Gs0 f13 head f12 in #connect
Gs0 f32 out f43 tail #connect
Gs0 f43 head f40 mainIn #connect
Gs0 f40 mainOut f42 tail #connect
Gs0 f42 head f41 mainIn #connect
