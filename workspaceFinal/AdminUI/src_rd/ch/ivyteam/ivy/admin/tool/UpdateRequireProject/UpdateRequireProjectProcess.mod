[Ivy]
[>Created: Fri Feb 19 11:35:00 ICT 2016]
13CF1D5A3B870418 3.18 #module
>Proto >Proto Collection #zClass
Us0 UpdateRequireProjectProcess Big #zClass
Us0 RD #cInfo
Us0 #process
Us0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Us0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Us0 @TextInP .resExport .resExport #zField
Us0 @TextInP .type .type #zField
Us0 @TextInP .processKind .processKind #zField
Us0 @AnnotationInP-0n ai ai #zField
Us0 @TextInP .xml .xml #zField
Us0 @TextInP .responsibility .responsibility #zField
Us0 @RichDialogInitStart f0 '' #zField
Us0 @RichDialogProcessEnd f1 '' #zField
Us0 @RichDialogProcessStart f3 '' #zField
Us0 @RichDialogProcessStart f6 '' #zField
Us0 @RichDialogProcessStep f9 '' #zField
Us0 @RichDialogProcessStep f11 '' #zField
Us0 @RichDialogProcessEnd f14 '' #zField
Us0 @PushWFArc f16 '' #zField
Us0 @PushWFArc f10 '' #zField
Us0 @RichDialogInitStart f2 '' #zField
Us0 @PushWFArc f13 '' #zField
Us0 @Alternative f15 '' #zField
Us0 @PushWFArc f17 '' #zField
Us0 @RichDialog f18 '' #zField
Us0 @PushWFArc f19 '' #zField
Us0 @PushWFArc f12 '' #zField
Us0 @RichDialogProcessEnd f4 '' #zField
Us0 @PushWFArc f5 '' #zField
Us0 @RichDialogEnd f7 '' #zField
Us0 @PushWFArc f8 '' #zField
Us0 @RichDialogEnd f21 '' #zField
Us0 @PushWFArc f22 '' #zField
>Proto Us0 Us0 UpdateRequireProjectProcess #zField
Us0 f0 guid 13CF1D5A3D12C189 #txt
Us0 f0 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f0 method start() #txt
Us0 f0 disableUIEvents true #txt
Us0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f0 outParameterDecl '<> result;
' #txt
Us0 f0 embeddedRdInitializations '* ' #txt
Us0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f0 30 54 20 20 18 -13 #rect
Us0 f0 @|RichDialogInitStartIcon #fIcon
Us0 f1 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f1 30 134 20 20 13 0 #rect
Us0 f1 @|RichDialogProcessEndIcon #fIcon
Us0 f3 guid 13CF1F8768481F1F #txt
Us0 f3 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData out;
' #txt
Us0 f3 actionTable 'out=in;
' #txt
Us0 f3 actionCode 'import ch.ivyteam.ivy.application.ILibrary;

in.selectedLib = panel.resolvedProjectCbox.getSelectedListEntry() as ILibrary;
ivy.log.info("New project version " + in.selectedLib + " is selected.");' #txt
Us0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Update clicked</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f3 374 54 20 20 11 -24 #rect
Us0 f3 @|RichDialogProcessStartIcon #fIcon
Us0 f6 guid 13CF1F8C0C284058 #txt
Us0 f6 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData out;
' #txt
Us0 f6 actionTable 'out=in;
' #txt
Us0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Cancel clicked</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f6 630 54 20 20 11 -26 #rect
Us0 f6 @|RichDialogProcessStartIcon #fIcon
Us0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData out;
' #txt
Us0 f9 actionTable 'out=in;
' #txt
Us0 f9 actionCode 'import ch.ivyteam.ivy.application.ILibrary;
import ch.ivyteam.ivy.application.ILibrarySpecification;

// set data list for combobox.
if(in.resolvedLibSpec != null)
{
	in.matchLib.clear();
	in.matchLib.addAll(in.resolvedLibSpec.findMatchingLibraries());
	panel.resolvedProjectCbox.setListData(in.matchLib);
}

//Set default value for combobox
if(in.matchLib.size() > 0)
{
	panel.updateBttn.setEnabled(true);
	panel.resolvedProjectCbox.setSelectedIndex(in.matchLib.indexOf(in.resolvedLibSpec.getResolvedLibrary()));
}
else
{
	panel.updateBttn.setEnabled(false);
}









' #txt
Us0 f9 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>initialize resolved lib</name>
        <nameStyle>23,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f9 150 132 36 24 3 -34 #rect
Us0 f9 @|RichDialogProcessStepIcon #fIcon
Us0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData out;
' #txt
Us0 f11 actionTable 'out=in;
' #txt
Us0 f11 actionCode 'import ch.ivyteam.ivy.application.ReleaseState;
import ch.ivyteam.ivy.application.ActivityState;

in.isSuccess = false;

//Update resolved library for the specification pm.
if(in.selectedLib != null)
{
	if(in.resolvedLibSpec.getResolvedLibrary() == null || (in.selectedLib.getId().equals(in.resolvedLibSpec.getId()) && !in.selectedLib.getQualifiedVersion().equals(in.resolvedLibSpec.getResolvedLibrary().getQualifiedVersion()))) 
	{
		in.resolvedLibSpec.setResolvedLibrary(in.selectedLib);
		in.isSuccess = true;
	}
}


' #txt
Us0 f11 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update 
Resolved Lib</name>
        <nameStyle>17,7
3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f11 366 124 36 24 24 -32 #rect
Us0 f11 @|RichDialogProcessStepIcon #fIcon
Us0 f14 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f14 158 230 20 20 13 0 #rect
Us0 f14 @|RichDialogProcessEndIcon #fIcon
Us0 f16 expr out #txt
Us0 f16 40 74 40 134 #arcP
Us0 f10 expr out #txt
Us0 f10 168 156 168 230 #arcP
Us0 f2 guid 13CFFF298D236DB4 #txt
Us0 f2 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f2 method startWithRequiredLib(ch.ivyteam.ivy.application.ILibrarySpecification) #txt
Us0 f2 disableUIEvents true #txt
Us0 f2 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.ILibrarySpecification requirePMV> param = methodEvent.getInputArguments();
' #txt
Us0 f2 inParameterMapAction 'out.resolvedLibSpec=param.requirePMV;
' #txt
Us0 f2 outParameterDecl '<> result;
' #txt
Us0 f2 embeddedRdInitializations '* ' #txt
Us0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startWithRequiredLib</name>
        <nameStyle>20,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f2 158 62 20 20 13 0 #rect
Us0 f2 @|RichDialogInitStartIcon #fIcon
Us0 f13 expr out #txt
Us0 f13 168 82 168 132 #arcP
Us0 f15 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is Success</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f15 370 178 28 28 8 -29 #rect
Us0 f15 @|AlternativeIcon #fIcon
Us0 f17 expr out #txt
Us0 f17 384 148 384 178 #arcP
Us0 f18 targetWindow NEW:card: #txt
Us0 f18 targetDisplay TOP #txt
Us0 f18 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f18 startMethod warning(String) #txt
Us0 f18 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f18 requestActionDecl '<String warning> param;' #txt
Us0 f18 requestActionCode 'param.warning= ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/message/warningLibraryUpdate");' #txt
Us0 f18 responseActionDecl 'ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData out;
' #txt
Us0 f18 responseMappingAction 'out=in;
' #txt
Us0 f18 windowConfiguration '{/title "Warning"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f18 isAsynch false #txt
Us0 f18 isInnerRd true #txt
Us0 f18 userContext '* ' #txt
Us0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show 
Error Message</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f18 462 180 36 24 26 -18 #rect
Us0 f18 @|RichDialogIcon #fIcon
Us0 f19 expr in #txt
Us0 f19 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f19 398 192 462 192 #arcP
Us0 f19 0 0.46875 0 12 #arcLabel
Us0 f12 expr out #txt
Us0 f12 384 74 384 124 #arcP
Us0 f4 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f4 470 262 20 20 13 0 #rect
Us0 f4 @|RichDialogProcessEndIcon #fIcon
Us0 f5 expr out #txt
Us0 f5 480 204 480 262 #arcP
Us0 f7 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f7 guid 13D6680A1AD3AD0A #txt
Us0 f7 630 126 20 20 13 0 #rect
Us0 f7 @|RichDialogEndIcon #fIcon
Us0 f8 expr out #txt
Us0 f8 640 74 640 126 #arcP
Us0 f21 type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
Us0 f21 guid 13D66D48BFA1B32D #txt
Us0 f21 374 262 20 20 13 0 #rect
Us0 f21 @|RichDialogEndIcon #fIcon
Us0 f22 expr in #txt
Us0 f22 outCond 'in.isSuccess == true' #txt
Us0 f22 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f22 384 206 384 262 #arcP
Us0 f22 0 0.2857142857142857 -16 0 #arcLabel
>Proto Us0 .rdData2UIAction 'panel.resolvedProjectCbox.listData=in.matchLib;
' #txt
>Proto Us0 .type ch.ivyteam.ivy.admin.tool.UpdateRequireProject.UpdateRequireProjectData #txt
>Proto Us0 .processKind RICH_DIALOG #txt
>Proto Us0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>START</swimlaneLabel>
        <swimlaneLabel>EVENT</swimlaneLabel>
        <swimlaneLabel>METHOD</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>328</swimlaneSize>
    <swimlaneSize>416</swimlaneSize>
    <swimlaneSize>464</swimlaneSize>
    <swimlaneColor>-13369345</swimlaneColor>
    <swimlaneColor>-10066177</swimlaneColor>
    <swimlaneColor>-3355648</swimlaneColor>
</elementInfo>
' #txt
>Proto Us0 -8 -8 16 16 16 26 #rect
>Proto Us0 '' #fIcon
Us0 f0 mainOut f16 tail #connect
Us0 f16 head f1 mainIn #connect
Us0 f9 mainOut f10 tail #connect
Us0 f10 head f14 mainIn #connect
Us0 f2 mainOut f13 tail #connect
Us0 f13 head f9 mainIn #connect
Us0 f11 mainOut f17 tail #connect
Us0 f17 head f15 in #connect
Us0 f19 head f18 mainIn #connect
Us0 f3 mainOut f12 tail #connect
Us0 f12 head f11 mainIn #connect
Us0 f18 mainOut f5 tail #connect
Us0 f5 head f4 mainIn #connect
Us0 f6 mainOut f8 tail #connect
Us0 f8 head f7 mainIn #connect
Us0 f15 out f22 tail #connect
Us0 f22 head f21 mainIn #connect
Us0 f15 out f19 tail #connect
