[Ivy]
[>Created: Fri Aug 01 16:22:05 ICT 2014]
13AAFD80DD836F7A 3.17 #module
>Proto >Proto Collection #zClass
Is0 ImportInformerProcess Big #zClass
Is0 RD #cInfo
Is0 #process
Is0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Is0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Is0 @TextInP .resExport .resExport #zField
Is0 @TextInP .type .type #zField
Is0 @TextInP .processKind .processKind #zField
Is0 @AnnotationInP-0n ai ai #zField
Is0 @TextInP .xml .xml #zField
Is0 @TextInP .responsibility .responsibility #zField
Is0 @RichDialogInitStart f0 '' #zField
Is0 @RichDialogProcessEnd f1 '' #zField
Is0 @PushWFArc f2 '' #zField
Is0 @RichDialogProcessStart f5 '' #zField
Is0 @RichDialogProcessStart f7 '' #zField
Is0 @RichDialogProcessStep f9 '' #zField
Is0 @PushWFArc f4 '' #zField
Is0 @RichDialogInitStart f3 '' #zField
Is0 @PushWFArc f10 '' #zField
Is0 @RichDialogEnd f11 '' #zField
Is0 @Alternative f6 '' #zField
Is0 @RichDialogProcessStep f14 '' #zField
Is0 @PushWFArc f13 '' #zField
Is0 @RichDialog f16 '' #zField
Is0 @RichDialogProcessEnd f17 '' #zField
Is0 @PushWFArc f19 '' #zField
Is0 @PushWFArc f8 '' #zField
Is0 @RichDialogEnd f20 '' #zField
Is0 @PushWFArc f21 '' #zField
Is0 @RichDialogProcessStep f12 '' #zField
Is0 @PushWFArc f22 '' #zField
Is0 @PushWFArc f18 '' #zField
Is0 @PushWFArc f15 '' #zField
Is0 @RichDialogProcessStart f23 '' #zField
Is0 @RichDialogProcessEnd f24 '' #zField
Is0 @RichDialogProcessStep f26 '' #zField
Is0 @PushWFArc f27 '' #zField
Is0 @CallSub f28 '' #zField
Is0 @PushWFArc f29 '' #zField
Is0 @PushWFArc f25 '' #zField
>Proto Is0 Is0 ImportInformerProcess #zField
Is0 f0 guid 13AAFD80E72DF21D #txt
Is0 f0 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f0 method start() #txt
Is0 f0 disableUIEvents true #txt
Is0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Is0 f0 outParameterDecl '<> result;
' #txt
Is0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Is0 f0 94 54 20 20 13 0 #rect
Is0 f0 @|RichDialogInitStartIcon #fIcon
Is0 f1 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f1 94 238 20 20 13 0 #rect
Is0 f1 @|RichDialogProcessEndIcon #fIcon
Is0 f2 expr out #txt
Is0 f2 104 74 104 238 #arcP
Is0 f5 guid 13AB00234A4766FB #txt
Is0 f5 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f5 actionTable 'out=in;
out.selection=1;
' #txt
Is0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>btnOK_clicked</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f5 598 54 20 20 13 0 #rect
Is0 f5 @|RichDialogProcessStartIcon #fIcon
Is0 f7 guid 13AB003E6789079B #txt
Is0 f7 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f7 actionTable 'out=in;
out.selection=0;
' #txt
Is0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>btnCancel_clicked</name>
        <nameStyle>17,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f7 94 310 20 20 13 0 #rect
Is0 f7 @|RichDialogProcessStartIcon #fIcon
Is0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f9 actionTable 'out=in;
' #txt
Is0 f9 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.admin.tool.saimport.ImportFileReader;

in.exception = null;
try {
	Recordset recordset = ImportFileReader.read(in.environments, in.selectedApplication.findEnvironment(IEnvironment.DEFAULT_ENVIRONMENT_NAME), in.file);
	
	if (recordset.size() > 0)
	{
		in.importEnvironments = recordset;
		in.targetEnvironments = in.selectedApplication.getEnvironments();
	}
	else
	{
		panel.lblNoData.visible = true;
	}
} catch(PersistencyException e) {
	in.exception = e;
}' #txt
Is0 f9 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>display environments</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f9 206 140 36 24 20 -2 #rect
Is0 f9 @|RichDialogProcessStepIcon #fIcon
Is0 f4 expr out #txt
Is0 f4 224 164 114 248 #arcP
Is0 f4 1 224 248 #addKink
Is0 f4 1 0.12316139603624235 0 0 #arcLabel
Is0 f3 guid 13AB0C7346CCC6BF #txt
Is0 f3 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f3 method startInformer(List<ch.ivyteam.ivy.application.restricted.IEnvironment>,java.io.File,ch.ivyteam.ivy.application.IApplication) #txt
Is0 f3 disableUIEvents true #txt
Is0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.restricted.IEnvironment> environments,java.io.File importFile,ch.ivyteam.ivy.application.IApplication selectedApplication> param = methodEvent.getInputArguments();
' #txt
Is0 f3 inParameterMapAction 'out.environments=param.environments;
out.file=param.importFile;
out.selectedApplication=param.selectedApplication;
out.selection=0;
' #txt
Is0 f3 outParameterDecl '<java.lang.Integer selection,List<ch.ivyteam.ivy.admin.tool.process.ImportEnvironment> selectedEnvironments> result;
' #txt
Is0 f3 outParameterMapAction 'result.selection=in.selection;
result.selectedEnvironments=in.selectedEnvironments;
' #txt
Is0 f3 embeddedRdInitializations '* ' #txt
Is0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startInformer(List&lt;IEnvironment&gt;,File,IApplication)</name>
    </language>
</elementInfo>
' #txt
Is0 f3 214 54 21 20 14 -3 #rect
Is0 f3 @|RichDialogInitStartIcon #fIcon
Is0 f10 expr out #txt
Is0 f10 223 73 224 140 #arcP
Is0 f11 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f11 guid 13AB51C96FCFFCB7 #txt
Is0 f11 598 310 20 20 13 0 #rect
Is0 f11 @|RichDialogEndIcon #fIcon
Is0 f6 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>valid?</name>
        <nameStyle>6,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f6 594 178 28 28 14 0 #rect
Is0 f6 @|AlternativeIcon #fIcon
Is0 f6 -13016147|-1|-16777216 #nodeStyle
Is0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f14 actionTable 'out=in;
' #txt
Is0 f14 actionCode 'List<Record> importEnvironments = in.importEnvironments.getRecords();

in.isValid = true;

Boolean hasSelection = false;

for (int i = 0; i < importEnvironments.size(); i++) {
	if (importEnvironments.get(i).getField("state").toBoolean()) {
		hasSelection = true;
		
		for (int j = i + 1; j < importEnvironments.size(); j++) {
			if (importEnvironments.get(j).getField("state").toBoolean() && importEnvironments.get(i).getField("targetEnv").equals(importEnvironments.get(j).getField("targetEnv"))) {
				in.isValid = false;
				in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/duplicateTargetEnvironment");
				break;
			}
		}
	}
}

if (!hasSelection) {
	in.isValid = false;
	in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/noEnvironmentSelection");
}' #txt
Is0 f14 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check valid</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f14 590 116 36 24 20 -2 #rect
Is0 f14 @|RichDialogProcessStepIcon #fIcon
Is0 f14 -13016147|-1|-16777216 #nodeStyle
Is0 f13 expr out #txt
Is0 f13 608 140 608 178 #arcP
Is0 f16 targetWindow NEW:card: #txt
Is0 f16 targetDisplay TOP #txt
Is0 f16 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Is0 f16 startMethod askQuestion(String,String,List<String>) #txt
Is0 f16 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f16 requestActionDecl '<String icon, String question, List<String> buttons> param;' #txt
Is0 f16 requestMappingAction 'param.icon="error";
param.question=in.errorMessage;
param.buttons=[ivy.cms.co("/Dialogs/general/ok")];
' #txt
Is0 f16 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f16 responseMappingAction 'out=in;
out.selection=0;
' #txt
Is0 f16 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Is0 f16 isAsynch false #txt
Is0 f16 isInnerRd true #txt
Is0 f16 userContext '* ' #txt
Is0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>display error dialog</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f16 462 180 36 24 -53 -30 #rect
Is0 f16 @|RichDialogIcon #fIcon
Is0 f16 -13016147|-1|-16777216 #nodeStyle
Is0 f17 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f17 469 245 22 22 14 0 #rect
Is0 f17 @|RichDialogProcessEndIcon #fIcon
Is0 f17 -13016147|-1|-16777216 #nodeStyle
Is0 f19 expr out #txt
Is0 f19 480 204 480 245 #arcP
Is0 f8 expr in #txt
Is0 f8 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f8 594 192 498 192 #arcP
Is0 f20 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f20 guid 14724CE717F95178 #txt
Is0 f20 93 373 22 22 14 0 #rect
Is0 f20 @|RichDialogEndIcon #fIcon
Is0 f20 -13016147|-1|-16777216 #nodeStyle
Is0 f21 expr out #txt
Is0 f21 104 330 104 373 #arcP
Is0 f21 0 0.7609120441760486 0 0 #arcLabel
Is0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f12 actionTable 'out=in;
' #txt
Is0 f12 actionCode 'import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.admin.tool.process.ImportEnvironment;

List<Record> importEnvironments = in.importEnvironments.getRecords();

for (Record record : importEnvironments) {
	if (record.getField("state").toBoolean()) {
		ImportEnvironment importEnvironment = new ImportEnvironment();
		importEnvironment.sourceEnvironment = record.getField("sourceEnv") as Environment;
		importEnvironment.targetEnvironment = record.getField("targetEnv") as IEnvironment;
		
		in.selectedEnvironments.add(importEnvironment);
	}
}
' #txt
Is0 f12 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>get imported env-s</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f12 590 244 36 24 20 -2 #rect
Is0 f12 @|RichDialogProcessStepIcon #fIcon
Is0 f12 -13016147|-1|-16777216 #nodeStyle
Is0 f22 expr in #txt
Is0 f22 outCond in.isValid #txt
Is0 f22 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f22 608 206 608 244 #arcP
Is0 f18 expr out #txt
Is0 f18 608 268 608 310 #arcP
Is0 f15 expr out #txt
Is0 f15 608 74 608 116 #arcP
Is0 f23 guid 1473485C04A16A44 #txt
Is0 f23 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f23 actionTable 'out=in;
' #txt
Is0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onload</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f23 333 269 22 22 14 0 #rect
Is0 f23 @|RichDialogProcessStartIcon #fIcon
Is0 f23 -13016147|-1|-16777216 #nodeStyle
Is0 f24 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f24 333 477 22 22 14 0 #rect
Is0 f24 @|RichDialogProcessEndIcon #fIcon
Is0 f24 -13016147|-1|-16777216 #nodeStyle
Is0 f26 actionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f26 actionTable 'out=in;
' #txt
Is0 f26 actionCode 'if (panel.tblEnvironments.getColumnModel() != null && panel.tblEnvironments.getColumnModel().getColumnCount() > 0)
{
	panel.tblEnvironments.getColumnModel().getColumn(0).maxWidth = 50;
}
' #txt
Is0 f26 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default size for 1st column</name>
        <nameStyle>31,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Is0 f26 326 348 36 24 20 -2 #rect
Is0 f26 @|RichDialogProcessStepIcon #fIcon
Is0 f26 -13016147|-1|-16777216 #nodeStyle
Is0 f27 expr out #txt
Is0 f27 344 291 344 348 #arcP
Is0 f28 type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
Is0 f28 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Is0 f28 doCall true #txt
Is0 f28 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Is0 f28 requestMappingAction 'param.exception=in.exception;
' #txt
Is0 f28 responseActionDecl 'ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData out;
' #txt
Is0 f28 responseMappingAction 'out=in;
' #txt
Is0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
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
Is0 f28 326 412 36 24 20 -2 #rect
Is0 f28 @|CallSubIcon #fIcon
Is0 f29 expr out #txt
Is0 f29 344 372 344 412 #arcP
Is0 f25 expr out #txt
Is0 f25 344 436 344 477 #arcP
>Proto Is0 .ui2RdDataAction 'out.importEnvironments=panel.tblEnvironments.recordsetData;
' #txt
>Proto Is0 .rdData2UIAction 'panel.cmbTargetEnv.listData=in.targetEnvironments;
panel.tblEnvironments.recordsetData=in.importEnvironments;
' #txt
>Proto Is0 .type ch.ivyteam.ivy.admin.tool.environment.ImportInformer.ImportInformerData #txt
>Proto Is0 .processKind RICH_DIALOG #txt
>Proto Is0 -8 -8 16 16 16 26 #rect
>Proto Is0 '' #fIcon
Is0 f0 mainOut f2 tail #connect
Is0 f2 head f1 mainIn #connect
Is0 f9 mainOut f4 tail #connect
Is0 f4 head f1 mainIn #connect
Is0 f3 mainOut f10 tail #connect
Is0 f10 head f9 mainIn #connect
Is0 f14 mainOut f13 tail #connect
Is0 f13 head f6 in #connect
Is0 f16 mainOut f19 tail #connect
Is0 f19 head f17 mainIn #connect
Is0 f8 head f16 mainIn #connect
Is0 f7 mainOut f21 tail #connect
Is0 f21 head f20 mainIn #connect
Is0 f6 out f22 tail #connect
Is0 f22 head f12 mainIn #connect
Is0 f6 out f8 tail #connect
Is0 f12 mainOut f18 tail #connect
Is0 f18 head f11 mainIn #connect
Is0 f5 mainOut f15 tail #connect
Is0 f15 head f14 mainIn #connect
Is0 f23 mainOut f27 tail #connect
Is0 f27 head f26 mainIn #connect
Is0 f26 mainOut f29 tail #connect
Is0 f29 head f28 mainIn #connect
Is0 f28 mainOut f25 tail #connect
Is0 f25 head f24 mainIn #connect
