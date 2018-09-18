[Ivy]
[>Created: Wed Aug 12 15:59:24 ICT 2015]
1215CF277C71EE44 3.17 #module
>Proto >Proto Collection #zClass
Gs0 GlobalVariableListProcess Big #zClass
Gs0 RD #cInfo
Gs0 #process
Gs0 @MessageFlowInP-0n messageIn messageIn #zField
Gs0 @MessageFlowOutP-0n messageOut messageOut #zField
Gs0 @TextInP .resExport .resExport #zField
Gs0 @TextInP .type .type #zField
Gs0 @TextInP .processKind .processKind #zField
Gs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Gs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Gs0 @TextInP .xml .xml #zField
Gs0 @TextInP .responsibility .responsibility #zField
Gs0 @AnnotationInP-0n ai ai #zField
Gs0 @RichDialogInitStart f0 '' #zField
Gs0 @RichDialogProcessEnd f1 '' #zField
Gs0 @RichDialogInitStart f3 '' #zField
Gs0 @RichDialogProcessStart f5 '' #zField
Gs0 @RichDialog f6 '' #zField
Gs0 @RichDialogProcessEnd f8 '' #zField
Gs0 @RichDialogMethodStart f10 '' #zField
Gs0 @RichDialogProcessEnd f11 '' #zField
Gs0 @PushWFArc f12 '' #zField
Gs0 @PushWFArc f7 '' #zField
Gs0 @RichDialogProcessStart f13 '' #zField
Gs0 @RichDialogProcessStep f14 '' #zField
Gs0 @RichDialogProcessEnd f15 '' #zField
Gs0 @RichDialog f74 '' #zField
Gs0 @PushWFArc f16 '' #zField
Gs0 @Alternative f17 '' #zField
Gs0 @PushWFArc f18 '' #zField
Gs0 @PushWFArc f19 '' #zField
Gs0 @PushWFArc f20 '' #zField
Gs0 @RichDialog f22 '' #zField
Gs0 @PushWFArc f23 '' #zField
Gs0 @PushWFArc f21 '' #zField
Gs0 @RichDialogMethodStart f24 '' #zField
Gs0 @RichDialogProcessEnd f25 '' #zField
Gs0 @RichDialogProcessStart f27 '' #zField
Gs0 @RichDialogProcessEnd f28 '' #zField
Gs0 @PushWFArc f29 '' #zField
Gs0 @RichDialogFireEvent f30 '' #zField
Gs0 @PushWFArc f31 '' #zField
Gs0 @PushWFArc f9 '' #zField
Gs0 @PushWFArc f2 '' #zField
Gs0 @PushWFArc f4 '' #zField
Gs0 @RichDialogProcessEnd f40 '' #zField
Gs0 @RichDialogProcessStep f42 '' #zField
Gs0 @PushWFArc f41 '' #zField
Gs0 @RichDialogProcessStep f43 '' #zField
Gs0 @PushWFArc f36 '' #zField
Gs0 @PushWFArc f34 '' #zField
Gs0 @RichDialogProcessStep f33 '' #zField
Gs0 @RichDialogProcessEnd f35 '' #zField
Gs0 @RichDialogProcessStart f32 '' #zField
Gs0 @RichDialogProcessStep f46 '' #zField
Gs0 @PushWFArc f47 '' #zField
Gs0 @PushWFArc f38 '' #zField
Gs0 @RichDialogMethodStart f39 '' #zField
Gs0 @PushWFArc f44 '' #zField
Gs0 @RichDialogProcessStep f48 '' #zField
Gs0 @PushWFArc f49 '' #zField
Gs0 @PushWFArc f26 '' #zField
>Proto Gs0 Gs0 GlobalVariableListProcess #zField
Gs0 f0 guid 1215CF27C1CC34A9 #txt
Gs0 f0 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
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
Gs0 f0 30 38 20 20 13 0 #rect
Gs0 f0 @|RichDialogInitStartIcon #fIcon
Gs0 f1 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f1 27 163 26 26 14 0 #rect
Gs0 f1 @|RichDialogProcessEndIcon #fIcon
Gs0 f3 guid 1215CF4C3301BAA9 #txt
Gs0 f3 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f3 method showGlobalVariables(List<ch.ivyteam.ivy.application.restricted.IGlobalVariable>,ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Gs0 f3 disableUIEvents false #txt
Gs0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> globalVariables,ch.ivyteam.ivy.application.restricted.IEnvironment environment> param = methodEvent.getInputArguments();
' #txt
Gs0 f3 inParameterMapAction 'out.environment=param.environment;
out.filteredGlobalVariables=param.globalVariables;
out.globalVariables=param.globalVariables;
' #txt
Gs0 f3 outParameterDecl '<> result;
' #txt
Gs0 f3 embeddedRdInitializations '* ' #txt
Gs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showGlobalVariables
(List&lt;IGlobalVariable&gt;)</name>
        <nameStyle>43,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f3 110 38 20 20 13 0 #rect
Gs0 f3 @|RichDialogInitStartIcon #fIcon
Gs0 f5 guid 12167AF551C58A7F #txt
Gs0 f5 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f5 actionTable 'out=in;
' #txt
Gs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>changeGlobalVariable</name>
        <nameStyle>20,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f5 326 30 20 20 13 0 #rect
Gs0 f5 @|RichDialogProcessStartIcon #fIcon
Gs0 f6 targetWindow NEW:card: #txt
Gs0 f6 targetDisplay TOP #txt
Gs0 f6 richDialogId ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableDetails #txt
Gs0 f6 startMethod showDetails(ch.ivyteam.ivy.application.restricted.IGlobalVariable,ch.ivyteam.ivy.application.restricted.IEnvironment) #txt
Gs0 f6 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f6 requestActionDecl '<ch.ivyteam.ivy.application.restricted.IGlobalVariable globalVariable, ch.ivyteam.ivy.application.restricted.IEnvironment environment> param;' #txt
Gs0 f6 requestMappingAction 'param.globalVariable=in.globalVariable;
param.environment=in.environment;
' #txt
Gs0 f6 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f6 responseMappingAction 'out=in;
out.globalVariable=result.#globalVariable;
' #txt
Gs0 f6 windowConfiguration '{/title "<%=in.globalVariable.name%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Gs0 f6 isAsynch false #txt
Gs0 f6 isInnerRd true #txt
Gs0 f6 isDialog true #txt
Gs0 f6 userContext '* ' #txt
Gs0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Change
Value</name>
        <nameStyle>12,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f6 318 76 36 24 20 -2 #rect
Gs0 f6 @|RichDialogIcon #fIcon
Gs0 f8 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f8 323 155 26 26 14 0 #rect
Gs0 f8 @|RichDialogProcessEndIcon #fIcon
Gs0 f10 guid 12177C36CE0EB889 #txt
Gs0 f10 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f10 method getGlobalVariables() #txt
Gs0 f10 disableUIEvents false #txt
Gs0 f10 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Gs0 f10 outParameterDecl '<List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> variables> result;
' #txt
Gs0 f10 outParameterMapAction 'result.variables=in.globalVariables;
' #txt
Gs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getGlobalVariables()</name>
        <nameStyle>20,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f10 854 54 20 20 13 0 #rect
Gs0 f10 @|RichDialogMethodStartIcon #fIcon
Gs0 f11 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f11 851 91 26 26 14 0 #rect
Gs0 f11 @|RichDialogProcessEndIcon #fIcon
Gs0 f12 expr out #txt
Gs0 f12 864 74 864 91 #arcP
Gs0 f7 expr out #txt
Gs0 f7 336 50 336 76 #arcP
Gs0 f13 guid 122782E0183CCF8F #txt
Gs0 f13 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f13 actionTable 'out=in;
' #txt
Gs0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>resetToDefault</name>
        <nameStyle>14,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f13 326 190 20 20 13 0 #rect
Gs0 f13 @|RichDialogProcessStartIcon #fIcon
Gs0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f14 actionTable 'out=in;
' #txt
Gs0 f14 actionCode 'import ch.ivyteam.ivy.application.restricted.IDefaultGlobalVariable;
if(in.globalVariable.getDefaultGlobalVariable() != null){
	IDefaultGlobalVariable defaultVar = in.globalVariable.getDefaultGlobalVariable() as IDefaultGlobalVariable;
  defaultVar.deleteEnvirommentConfiguration(in.environment.getName())	;
  int row = in.globalVariables.indexOf(in.globalVariable);
  in.globalVariables.set(row,defaultVar);
}' #txt
Gs0 f14 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Reset environment 
value to default</name>
        <nameStyle>35,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f14 398 324 36 24 20 -2 #rect
Gs0 f14 @|RichDialogProcessStepIcon #fIcon
Gs0 f15 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f15 326 438 20 20 13 0 #rect
Gs0 f15 @|RichDialogProcessEndIcon #fIcon
Gs0 f74 targetWindow NEW #txt
Gs0 f74 targetDisplay TOP #txt
Gs0 f74 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Gs0 f74 startMethod askQuestion(String,String,List<String>,String) #txt
Gs0 f74 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f74 requestActionDecl '<String icon, String question, List<String> buttons, String defaultButton> param;' #txt
Gs0 f74 requestMappingAction 'param.question="Would you like to restore the default value";
param.buttons=["yes","no"];
param.defaultButton="no";
' #txt
Gs0 f74 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
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
Gs0 f74 318 244 36 24 20 -2 #rect
Gs0 f74 @|RichDialogIcon #fIcon
Gs0 f16 expr out #txt
Gs0 f16 336 210 336 244 #arcP
Gs0 f17 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Gs0 f17 322 322 28 28 14 0 #rect
Gs0 f17 @|AlternativeIcon #fIcon
Gs0 f18 expr out #txt
Gs0 f18 336 268 336 322 #arcP
Gs0 f19 expr in #txt
Gs0 f19 outCond 'in.pressedButton == "yes"' #txt
Gs0 f19 350 336 398 336 #arcP
Gs0 f20 expr in #txt
Gs0 f20 336 350 336 438 #arcP
Gs0 f22 targetDisplay TOP #txt
Gs0 f22 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Gs0 f22 startMethod showMessage(String) #txt
Gs0 f22 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f22 requestActionDecl '<String message> param;' #txt
Gs0 f22 requestMappingAction 'param.message="The environment configuration for the global variable was successfully restored to the default value";
' #txt
Gs0 f22 responseActionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f22 responseMappingAction 'out=in;
' #txt
Gs0 f22 windowConfiguration '{/title "Restore Default Value"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Gs0 f22 isAsynch false #txt
Gs0 f22 isInnerRd true #txt
Gs0 f22 isDialog true #txt
Gs0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Information</name>
        <nameStyle>11,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f22 398 380 36 24 20 -2 #rect
Gs0 f22 @|RichDialogIcon #fIcon
Gs0 f23 expr out #txt
Gs0 f23 416 348 416 380 #arcP
Gs0 f23 0 0.50139689166605 0 0 #arcLabel
Gs0 f21 expr out #txt
Gs0 f21 416 404 346 448 #arcP
Gs0 f21 1 416 448 #addKink
Gs0 f21 1 0.17356271248217928 0 0 #arcLabel
Gs0 f24 guid 122786609FC3E2F7 #txt
Gs0 f24 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f24 method setGlobalVariables(List<ch.ivyteam.ivy.application.restricted.IGlobalVariable>) #txt
Gs0 f24 disableUIEvents false #txt
Gs0 f24 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.restricted.IGlobalVariable> globalVariables> param = methodEvent.getInputArguments();
' #txt
Gs0 f24 inParameterMapAction 'out.globalVariables=param.globalVariables;
' #txt
Gs0 f24 outParameterDecl '<> result;
' #txt
Gs0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setGlobalVariables(List&lt;IGlobalVariable&gt;)</name>
        <nameStyle>41,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f24 854 142 20 20 13 0 #rect
Gs0 f24 @|RichDialogMethodStartIcon #fIcon
Gs0 f25 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f25 854 278 20 20 13 0 #rect
Gs0 f25 @|RichDialogProcessEndIcon #fIcon
Gs0 f27 guid 122786B9ED7932D7 #txt
Gs0 f27 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f27 actionTable 'out=in;
' #txt
Gs0 f27 actionCode 'try {
	if(in.#globalVariable != null && in.globalVariable.getDefaultGlobalVariable() == null){
		panel.mnuResetValue.setEnabled(false);
	} else{
		panel.mnuResetValue.setEnabled(true);
	}
} catch(Exception e) {
	// when deleting a variable in.globalVariable has still the reference to a deleted entity and therefore will trigger an exception.
	// we just catch it here.
}
' #txt
Gs0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>selectVariable</name>
        <nameStyle>14,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f27 318 494 20 20 13 0 #rect
Gs0 f27 @|RichDialogProcessStartIcon #fIcon
Gs0 f28 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f28 318 542 20 20 13 0 #rect
Gs0 f28 @|RichDialogProcessEndIcon #fIcon
Gs0 f29 expr out #txt
Gs0 f29 328 514 328 542 #arcP
Gs0 f30 actionCode panel.fireGlobalVariableChanged(); #txt
Gs0 f30 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f30 fireEvent globalVariableChanged() #txt
Gs0 f30 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>globalVariableChanged</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f30 318 116 36 24 20 -2 #rect
Gs0 f30 @|RichDialogFireEventIcon #fIcon
Gs0 f31 expr out #txt
Gs0 f31 336 100 336 116 #arcP
Gs0 f9 expr out #txt
Gs0 f9 336 140 336 155 #arcP
Gs0 f2 expr out #txt
Gs0 f2 40 58 40 163 #arcP
Gs0 f4 expr out #txt
Gs0 f4 120 58 53 176 #arcP
Gs0 f4 1 120 176 #addKink
Gs0 f4 0 0.8119713594573071 0 0 #arcLabel
Gs0 f40 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f40 605 445 22 22 14 0 #rect
Gs0 f40 @|RichDialogProcessEndIcon #fIcon
Gs0 f42 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f42 actionTable 'out=in;
' #txt
Gs0 f42 actionCode 'import ch.ivyteam.ivy.application.restricted.IGlobalVariable;

panel.tblGlobalVariables.clearSelection();
panel.tblGlobalVariables.selectedListEntries = in.selectedGlobalVariables;' #txt
Gs0 f42 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f42 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>restore selected entries</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f42 598 380 36 24 20 -2 #rect
Gs0 f42 @|RichDialogProcessStepIcon #fIcon
Gs0 f41 expr out #txt
Gs0 f41 616 404 616 445 #arcP
Gs0 f43 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f43 actionTable 'out=in;
' #txt
Gs0 f43 actionCode 'import ch.ivyteam.ivy.application.restricted.IGlobalVariable;

in.selectedGlobalVariables = panel.tblGlobalVariables.selectedListEntries.deepClone() as List<IGlobalVariable>;' #txt
Gs0 f43 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f43 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>hold current selection entries</name>
        <nameStyle>30,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f43 598 252 36 24 20 -2 #rect
Gs0 f43 @|RichDialogProcessStepIcon #fIcon
Gs0 f36 expr out #txt
Gs0 f36 616 100 616 133 #arcP
Gs0 f34 expr out #txt
Gs0 f34 616 51 616 76 #arcP
Gs0 f33 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f33 actionTable 'out=in;
' #txt
Gs0 f33 actionCode '//Set default filter by Name
if (panel.cboFilterBy.getItemCount() > 0) {
	panel.cboFilterBy.setSelectedIndex(0);
}' #txt
Gs0 f33 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f33 598 76 36 24 20 -2 #rect
Gs0 f33 @|RichDialogProcessStepIcon #fIcon
Gs0 f35 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f35 605 133 22 22 14 0 #rect
Gs0 f35 @|RichDialogProcessEndIcon #fIcon
Gs0 f32 guid 147AFA07FD1C03EB #txt
Gs0 f32 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f32 actionTable 'out=in;
' #txt
Gs0 f32 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onload</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f32 605 29 22 22 14 0 #rect
Gs0 f32 @|RichDialogProcessStartIcon #fIcon
Gs0 f46 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f46 actionTable 'out=in;
' #txt
Gs0 f46 actionCode 'import ch.ivyteam.ivy.admin.tool.ListFilterUtils;

String filterType = panel.cboFilterBy.getSelectedItem().toString();
String keyword = panel.lookupVariables.getText();
in.filteredGlobalVariables = ListFilterUtils.filterGlobalVariables(filterType, keyword, in.globalVariables);' #txt
Gs0 f46 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f46 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter variables</name>
        <nameStyle>16,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f46 598 316 36 24 20 -2 #rect
Gs0 f46 @|RichDialogProcessStepIcon #fIcon
Gs0 f47 expr out #txt
Gs0 f47 616 276 616 316 #arcP
Gs0 f38 expr out #txt
Gs0 f38 616 340 616 380 #arcP
Gs0 f39 guid 148D00F96C021269 #txt
Gs0 f39 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f39 method filter() #txt
Gs0 f39 disableUIEvents false #txt
Gs0 f39 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Gs0 f39 outParameterDecl '<> result;
' #txt
Gs0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter()</name>
    </language>
</elementInfo>
' #txt
Gs0 f39 605 189 22 22 14 0 #rect
Gs0 f39 @|RichDialogMethodStartIcon #fIcon
Gs0 f44 expr out #txt
Gs0 f44 616 211 616 252 #arcP
Gs0 f48 actionDecl 'ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData out;
' #txt
Gs0 f48 actionTable 'out=in;
' #txt
Gs0 f48 actionCode panel.filter(); #txt
Gs0 f48 type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
Gs0 f48 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>call filter for global variables</name>
        <nameStyle>32
</nameStyle>
    </language>
</elementInfo>
' #txt
Gs0 f48 846 204 36 24 20 -2 #rect
Gs0 f48 @|RichDialogProcessStepIcon #fIcon
Gs0 f49 expr out #txt
Gs0 f49 864 162 864 204 #arcP
Gs0 f26 expr out #txt
Gs0 f26 864 228 864 278 #arcP
>Proto Gs0 .type ch.ivyteam.ivy.admin.tool.globalvars.GlobalVariableList.GlobalVariableListData #txt
>Proto Gs0 .processKind RICH_DIALOG #txt
>Proto Gs0 .ui2RdDataAction 'out.globalVariable=panel.tblGlobalVariables.#selectedListEntry as ch.ivyteam.ivy.application.restricted.IGlobalVariable;
' #txt
>Proto Gs0 .rdData2UIAction 'panel.cboFilterBy.listData=java.util.Arrays.asList(ivy.cms.co("/ch/ivyteam/ivy/admin/tool/comboBox/globalVariableName"), ivy.cms.co("/ch/ivyteam/ivy/admin/tool/comboBox/globalVariableAll"));
panel.tblGlobalVariables.listData=in.filteredGlobalVariables;
' #txt
>Proto Gs0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>270</swimlaneSize>
    <swimlaneSize>536</swimlaneSize>
    <swimlaneSize>576</swimlaneSize>
    <swimlaneColor>-6684775</swimlaneColor>
    <swimlaneColor>-6710785</swimlaneColor>
    <swimlaneColor>-26215</swimlaneColor>
</elementInfo>
' #txt
>Proto Gs0 -8 -8 16 16 16 26 #rect
>Proto Gs0 '' #fIcon
Gs0 f10 mainOut f12 tail #connect
Gs0 f12 head f11 mainIn #connect
Gs0 f5 mainOut f7 tail #connect
Gs0 f7 head f6 mainIn #connect
Gs0 f13 mainOut f16 tail #connect
Gs0 f16 head f74 mainIn #connect
Gs0 f74 mainOut f18 tail #connect
Gs0 f18 head f17 in #connect
Gs0 f17 out f19 tail #connect
Gs0 f19 head f14 mainIn #connect
Gs0 f17 out f20 tail #connect
Gs0 f20 head f15 mainIn #connect
Gs0 f14 mainOut f23 tail #connect
Gs0 f23 head f22 mainIn #connect
Gs0 f22 mainOut f21 tail #connect
Gs0 f21 head f15 mainIn #connect
Gs0 f27 mainOut f29 tail #connect
Gs0 f29 head f28 mainIn #connect
Gs0 f6 mainOut f31 tail #connect
Gs0 f31 head f30 mainIn #connect
Gs0 f30 mainOut f9 tail #connect
Gs0 f9 head f8 mainIn #connect
Gs0 f32 mainOut f34 tail #connect
Gs0 f34 head f33 mainIn #connect
Gs0 f33 mainOut f36 tail #connect
Gs0 f36 head f35 mainIn #connect
Gs0 f0 mainOut f2 tail #connect
Gs0 f2 head f1 mainIn #connect
Gs0 f3 mainOut f4 tail #connect
Gs0 f4 head f1 mainIn #connect
Gs0 f42 mainOut f41 tail #connect
Gs0 f41 head f40 mainIn #connect
Gs0 f43 mainOut f47 tail #connect
Gs0 f47 head f46 mainIn #connect
Gs0 f46 mainOut f38 tail #connect
Gs0 f38 head f42 mainIn #connect
Gs0 f39 mainOut f44 tail #connect
Gs0 f44 head f43 mainIn #connect
Gs0 f24 mainOut f49 tail #connect
Gs0 f49 head f48 mainIn #connect
Gs0 f48 mainOut f26 tail #connect
Gs0 f26 head f25 mainIn #connect
