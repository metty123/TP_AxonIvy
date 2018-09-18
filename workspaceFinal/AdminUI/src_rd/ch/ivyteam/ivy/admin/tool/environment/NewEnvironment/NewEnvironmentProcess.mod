[Ivy]
[>Created: Fri Aug 01 16:16:01 ICT 2014]
13AE65C234CDBB0A 3.17 #module
>Proto >Proto Collection #zClass
Ns0 NewEnvironmentProcess Big #zClass
Ns0 RD #cInfo
Ns0 #process
Ns0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ns0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ns0 @TextInP .resExport .resExport #zField
Ns0 @TextInP .type .type #zField
Ns0 @TextInP .processKind .processKind #zField
Ns0 @AnnotationInP-0n ai ai #zField
Ns0 @TextInP .xml .xml #zField
Ns0 @TextInP .responsibility .responsibility #zField
Ns0 @RichDialogInitStart f0 '' #zField
Ns0 @RichDialogProcessEnd f1 '' #zField
Ns0 @PushWFArc f2 '' #zField
Ns0 @RichDialog f43 '' #zField
Ns0 @RichDialogProcessEnd f46 '' #zField
Ns0 @RichDialogProcessStart f7 '' #zField
Ns0 @RichDialogEnd f8 '' #zField
Ns0 @RichDialogProcessStep f14 '' #zField
Ns0 @Alternative f41 '' #zField
Ns0 @RichDialogProcessStart f10 '' #zField
Ns0 @PushWFArc f11 '' #zField
Ns0 @PushWFArc f44 '' #zField
Ns0 @PushWFArc f47 '' #zField
Ns0 @PushWFArc f3 '' #zField
Ns0 @RichDialogProcessStep f4 '' #zField
Ns0 @PushWFArc f5 '' #zField
Ns0 @CallSub f12 '' #zField
Ns0 @CallSub f15 '' #zField
Ns0 @PushWFArc f16 '' #zField
Ns0 @PushWFArc f9 '' #zField
Ns0 @Alternative f17 '' #zField
Ns0 @PushWFArc f18 '' #zField
Ns0 @PushWFArc f13 '' #zField
Ns0 @PushWFArc f19 '' #zField
Ns0 @PushWFArc f6 '' #zField
>Proto Ns0 Ns0 NewEnvironmentProcess #zField
Ns0 f0 guid 13AE65C2427C64C2 #txt
Ns0 f0 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f0 method start(ch.ivyteam.ivy.application.IApplication) #txt
Ns0 f0 disableUIEvents true #txt
Ns0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Ns0 f0 inParameterMapAction 'out.application=param.application;
' #txt
Ns0 f0 outParameterDecl '<ch.ivyteam.ivy.application.restricted.IEnvironment environment> result;
' #txt
Ns0 f0 outParameterMapAction 'result.environment=in.environment;
' #txt
Ns0 f0 embeddedRdInitializations '* ' #txt
Ns0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IApplication)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f0 86 38 20 20 13 0 #rect
Ns0 f0 @|RichDialogInitStartIcon #fIcon
Ns0 f1 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f1 86 150 20 20 13 0 #rect
Ns0 f1 @|RichDialogProcessEndIcon #fIcon
Ns0 f2 expr out #txt
Ns0 f2 96 58 96 150 #arcP
Ns0 f43 targetWindow NEW #txt
Ns0 f43 targetDisplay TOP #txt
Ns0 f43 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Ns0 f43 startMethod showMessage(String) #txt
Ns0 f43 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f43 requestActionDecl '<String message> param;' #txt
Ns0 f43 requestMappingAction 'param.message="The environment " + in.name + " already exists for the application";
' #txt
Ns0 f43 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.EnvironmentDetails.EnvironmentDetailsData out;
' #txt
Ns0 f43 responseMappingAction 'out=in;
' #txt
Ns0 f43 windowConfiguration '{/title "Error"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ns0 f43 isAsynch false #txt
Ns0 f43 isInnerRd true #txt
Ns0 f43 isDialog true #txt
Ns0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Error</name>
        <nameStyle>5,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f43 310 292 36 24 20 -2 #rect
Ns0 f43 @|RichDialogIcon #fIcon
Ns0 f46 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f46 398 294 20 20 13 0 #rect
Ns0 f46 @|RichDialogProcessEndIcon #fIcon
Ns0 f7 guid 13AE66CE1D39BD19 #txt
Ns0 f7 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData out;
' #txt
Ns0 f7 actionTable 'out=in;
' #txt
Ns0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create</name>
        <nameStyle>6,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f7 246 38 20 20 13 0 #rect
Ns0 f7 @|RichDialogProcessStartIcon #fIcon
Ns0 f8 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f8 guid 1208AFED0345F917 #txt
Ns0 f8 243 483 26 26 14 0 #rect
Ns0 f8 @|RichDialogEndIcon #fIcon
Ns0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData out;
' #txt
Ns0 f14 actionTable 'out=in;
' #txt
Ns0 f14 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;

in.exception = null;
try {
	in.environment = in.application.createEnvironment(in.name,in.description, null);
} catch(PersistencyException e) {
	in.exception = e;
}' #txt
Ns0 f14 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>save
environment</name>
        <nameStyle>16,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f14 238 357 36 22 20 -2 #rect
Ns0 f14 @|RichDialogProcessStepIcon #fIcon
Ns0 f41 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>exist?</name>
        <nameStyle>6,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f41 242 290 28 28 -48 4 #rect
Ns0 f41 @|AlternativeIcon #fIcon
Ns0 f10 guid 13AE66CE1D323A80 #txt
Ns0 f10 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData out;
' #txt
Ns0 f10 actionTable 'out=in;
' #txt
Ns0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f10 398 486 20 20 13 0 #rect
Ns0 f10 @|RichDialogProcessStartIcon #fIcon
Ns0 f11 expr out #txt
Ns0 f11 398 496 269 496 #arcP
Ns0 f11 0 0.5676816388377104 0 0 #arcLabel
Ns0 f44 expr in #txt
Ns0 f44 outCond in.isEnvExist #txt
Ns0 f44 270 304 310 304 #arcP
Ns0 f47 expr out #txt
Ns0 f47 346 304 398 304 #arcP
Ns0 f47 0 0.3568325479015436 0 0 #arcLabel
Ns0 f3 expr in #txt
Ns0 f3 256 318 256 357 #arcP
Ns0 f4 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData out;
' #txt
Ns0 f4 actionTable 'out=in;
' #txt
Ns0 f4 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;

in.exception = null;
try {
	in.isEnvExist = in.application.findEnvironment(in.name) != null || in.name == "Default";
} catch(PersistencyException e) {
	in.exception = e;
}' #txt
Ns0 f4 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f4 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check if env is already exist</name>
        <nameStyle>29,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f4 238 100 36 24 20 -2 #rect
Ns0 f4 @|RichDialogProcessStepIcon #fIcon
Ns0 f5 expr out #txt
Ns0 f5 256 58 256 100 #arcP
Ns0 f12 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f12 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Ns0 f12 doCall true #txt
Ns0 f12 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Ns0 f12 requestMappingAction 'param.exception=in.exception;
' #txt
Ns0 f12 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData out;
' #txt
Ns0 f12 responseMappingAction 'out=in;
' #txt
Ns0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show exception to user</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f12 390 180 36 24 20 -2 #rect
Ns0 f12 @|CallSubIcon #fIcon
Ns0 f15 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f15 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Ns0 f15 doCall true #txt
Ns0 f15 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Ns0 f15 requestMappingAction 'param.exception=in.exception;
' #txt
Ns0 f15 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData out;
' #txt
Ns0 f15 responseMappingAction 'out=in;
' #txt
Ns0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show exception to user
(if any)</name>
        <nameStyle>23,7
8,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f15 238 420 36 24 20 -2 #rect
Ns0 f15 @|CallSubIcon #fIcon
Ns0 f16 expr out #txt
Ns0 f16 256 379 256 420 #arcP
Ns0 f16 0 0.4792774773484142 0 0 #arcLabel
Ns0 f9 expr out #txt
Ns0 f9 256 444 256 483 #arcP
Ns0 f9 0 0.4792774773484142 0 0 #arcLabel
Ns0 f17 type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
Ns0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has error?</name>
        <nameStyle>10
</nameStyle>
    </language>
</elementInfo>
' #txt
Ns0 f17 242 178 28 28 14 0 #rect
Ns0 f17 @|AlternativeIcon #fIcon
Ns0 f18 expr out #txt
Ns0 f18 256 124 256 178 #arcP
Ns0 f13 expr in #txt
Ns0 f13 outCond 'in.#exception is initialized' #txt
Ns0 f13 270 192 390 192 #arcP
Ns0 f19 expr in #txt
Ns0 f19 256 206 256 290 #arcP
Ns0 f6 expr out #txt
Ns0 f6 408 204 408 294 #arcP
>Proto Ns0 .ui2RdDataAction 'out.description=panel.descTextArea.text;
out.name=panel.nameTextField.text;
' #txt
>Proto Ns0 .rdData2UIAction 'panel.descTextArea.text=in.description;
panel.nameTextField.text=in.name;
' #txt
>Proto Ns0 .type ch.ivyteam.ivy.admin.tool.environment.NewEnvironment.NewEnvironmentData #txt
>Proto Ns0 .processKind RICH_DIALOG #txt
>Proto Ns0 -8 -8 16 16 16 26 #rect
>Proto Ns0 '' #fIcon
Ns0 f0 mainOut f2 tail #connect
Ns0 f2 head f1 mainIn #connect
Ns0 f10 mainOut f11 tail #connect
Ns0 f11 head f8 mainIn #connect
Ns0 f41 out f44 tail #connect
Ns0 f44 head f43 mainIn #connect
Ns0 f43 mainOut f47 tail #connect
Ns0 f47 head f46 mainIn #connect
Ns0 f41 out f3 tail #connect
Ns0 f3 head f14 mainIn #connect
Ns0 f7 mainOut f5 tail #connect
Ns0 f5 head f4 mainIn #connect
Ns0 f14 mainOut f16 tail #connect
Ns0 f16 head f15 mainIn #connect
Ns0 f15 mainOut f9 tail #connect
Ns0 f9 head f8 mainIn #connect
Ns0 f4 mainOut f18 tail #connect
Ns0 f18 head f17 in #connect
Ns0 f17 out f13 tail #connect
Ns0 f13 head f12 mainIn #connect
Ns0 f17 out f19 tail #connect
Ns0 f19 head f41 in #connect
Ns0 f12 mainOut f6 tail #connect
Ns0 f6 head f46 mainIn #connect
