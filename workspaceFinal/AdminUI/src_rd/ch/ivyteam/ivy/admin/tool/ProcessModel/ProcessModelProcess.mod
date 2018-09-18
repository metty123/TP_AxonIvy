[Ivy]
[>Created: Wed Jan 23 11:25:13 ICT 2013]
116D4119FE09980B 3.17 #module
>Proto >Proto Collection #zClass
Ps0 ProcessModelProcess Big #zClass
Ps0 RD #cInfo
Ps0 #process
Ps0 @TextInP .xml .xml #zField
Ps0 @TextInP .responsibility .responsibility #zField
Ps0 @TextInP .resExport .resExport #zField
Ps0 @TextInP .type .type #zField
Ps0 @TextInP .processKind .processKind #zField
Ps0 @AnnotationInP-0n ai ai #zField
Ps0 @MessageFlowInP-0n messageIn messageIn #zField
Ps0 @MessageFlowOutP-0n messageOut messageOut #zField
Ps0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ps0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ps0 @RichDialogInitStart f0 '' #zField
Ps0 @RichDialogProcessEnd f2 '' #zField
Ps0 @RichDialogProcessStep f3 '' #zField
Ps0 @PushWFArc f4 '' #zField
Ps0 @PushWFArc f1 '' #zField
Ps0 @RichDialogProcessStart f5 '' #zField
Ps0 @RichDialogProcessEnd f6 '' #zField
Ps0 @Alternative f8 '' #zField
Ps0 @RichDialog f10 '' #zField
Ps0 @PushWFArc f11 '' #zField
Ps0 @PushWFArc f7 '' #zField
Ps0 @PushWFArc f12 '' #zField
Ps0 @RichDialogProcessStep f13 '' #zField
Ps0 @PushWFArc f14 '' #zField
Ps0 @PushWFArc f9 '' #zField
Ps0 @RichDialogMethodStart f15 '' #zField
Ps0 @RichDialogMethodStart f16 '' #zField
Ps0 @RichDialogEnd f18 '' #zField
Ps0 @PushWFArc f19 '' #zField
Ps0 @RichDialogProcessStep f20 '' #zField
Ps0 @PushWFArc f21 '' #zField
Ps0 @PushWFArc f17 '' #zField
Ps0 @RichDialogProcessStart f22 '' #zField
Ps0 @PushWFArc f23 '' #zField
Ps0 @RichDialogProcessStart f24 '' #zField
Ps0 @PushWFArc f25 '' #zField
Ps0 @RichDialogBroadcastStart f26 '' #zField
Ps0 @RichDialogBroadcastStart f27 '' #zField
Ps0 @RichDialogProcessEnd f28 '' #zField
Ps0 @Alternative f29 '' #zField
Ps0 @PushWFArc f30 '' #zField
Ps0 @PushWFArc f32 '' #zField
Ps0 @Alternative f33 '' #zField
Ps0 @PushWFArc f34 '' #zField
Ps0 @PushWFArc f35 '' #zField
Ps0 @RichDialogProcessStep f37 '' #zField
Ps0 @PushWFArc f38 '' #zField
Ps0 @PushWFArc f36 '' #zField
Ps0 @PushWFArc f31 '' #zField
Ps0 @RichDialogMethodStart f39 '' #zField
Ps0 @RichDialogProcessEnd f40 '' #zField
Ps0 @PushWFArc f41 '' #zField
>Proto Ps0 Ps0 ProcessModelProcess #zField
Ps0 f0 guid 116D41A0696459E0 #txt
Ps0 f0 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f0 method start(ch.ivyteam.ivy.application.IProcessModel) #txt
Ps0 f0 disableUIEvents false #txt
Ps0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.IProcessModel processModel> param = methodEvent.getInputArguments();
' #txt
Ps0 f0 inParameterMapAction 'out.application=param.processModel.getApplication();
out.processModel=param.processModel;
' #txt
Ps0 f0 outParameterDecl '<> result;
' #txt
Ps0 f0 embeddedRdInitializations '{/activityPanel {/fieldName "activityPanel"/startMethod "start(ch.ivyteam.ivy.application.IActivity)"/parameterMapping "param.activity=callParam.processModel;\n"/initScript ""}/titlePane {/fieldName "titlePane"/startMethod "start(String,String)"/parameterMapping "param.iconUri=\"/Icons/ProcessModel/48\";\n"/initScript ""}}' #txt
Ps0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IProcessModel)</name>
        <nameStyle>20,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f0 46 46 20 20 13 0 #rect
Ps0 f0 @|RichDialogInitStartIcon #fIcon
Ps0 f2 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f2 43 219 26 26 14 0 #rect
Ps0 f2 @|RichDialogProcessEndIcon #fIcon
Ps0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f3 actionTable 'out=in;
' #txt
Ps0 f3 actionCode 'import ch.ivyteam.ivy.application.IProcessModelVersion;

out.processModelVersions = new List<IProcessModelVersion>();
out.processModelVersions.addAll(in.processModel.getProcessModelVersions());' #txt
Ps0 f3 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get PMV''s</name>
        <nameStyle>9,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f3 38 140 36 24 20 -2 #rect
Ps0 f3 @|RichDialogProcessStepIcon #fIcon
Ps0 f4 expr out #txt
Ps0 f4 56 66 56 140 #arcP
Ps0 f1 expr out #txt
Ps0 f1 56 164 56 219 #arcP
Ps0 f5 guid 11898F0239AE5DD2 #txt
Ps0 f5 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f5 actionTable 'out=in;
' #txt
Ps0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>openPmv</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f5 502 278 20 20 13 0 #rect
Ps0 f5 @|RichDialogProcessStartIcon #fIcon
Ps0 f6 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f6 499 483 26 26 13 0 #rect
Ps0 f6 @|RichDialogProcessEndIcon #fIcon
Ps0 f8 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Is any PMV selected?</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f8 498 378 28 28 14 0 #rect
Ps0 f8 @|AlternativeIcon #fIcon
Ps0 f10 targetWindow THIS #txt
Ps0 f10 targetDisplay content #txt
Ps0 f10 richDialogId ch.ivyteam.ivy.admin.tool.ProcessModelVersion #txt
Ps0 f10 startMethod start(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
Ps0 f10 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f10 panelName <%=in.selectedPMV.getApplication().getName()%>/<%=in.selectedPMV.getVersionName()%> #txt
Ps0 f10 requestActionDecl '<ch.ivyteam.ivy.application.IProcessModelVersion processModelVersion> param;' #txt
Ps0 f10 requestMappingAction 'param.processModelVersion=in.selectedPMV;
' #txt
Ps0 f10 responseActionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f10 responseMappingAction 'out=in;
' #txt
Ps0 f10 windowConfiguration '#Fri Apr 25 09:04:35 CEST 2008
use_default=true
' #txt
Ps0 f10 isAsynch true #txt
Ps0 f10 isInnerRd true #txt
Ps0 f10 isDialog false #txt
Ps0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Open PMV tab</name>
        <nameStyle>12,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f10 494 428 36 24 20 -2 #rect
Ps0 f10 @|RichDialogIcon #fIcon
Ps0 f11 expr in #txt
Ps0 f11 outCond 'in.#selectedPMV != null' #txt
Ps0 f11 512 406 512 428 #arcP
Ps0 f7 expr out #txt
Ps0 f7 512 452 512 483 #arcP
Ps0 f12 expr in #txt
Ps0 f12 498 392 499 496 #arcP
Ps0 f12 1 464 392 #addKink
Ps0 f12 2 464 496 #addKink
Ps0 f12 1 0.36495092214191016 0 0 #arcLabel
Ps0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f13 actionTable 'out=in;
' #txt
Ps0 f13 actionCode 'out.selectedPMV = panel.pmvTable.getSelectedListEntry() as ch.ivyteam.ivy.application.IProcessModelVersion;' #txt
Ps0 f13 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get selection</name>
        <nameStyle>13,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f13 494 332 36 24 20 -2 #rect
Ps0 f13 @|RichDialogProcessStepIcon #fIcon
Ps0 f14 expr out #txt
Ps0 f14 512 298 512 332 #arcP
Ps0 f9 expr out #txt
Ps0 f9 512 356 512 378 #arcP
Ps0 f15 guid 1189E0FC32A51151 #txt
Ps0 f15 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f15 method close() #txt
Ps0 f15 disableUIEvents false #txt
Ps0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close()</name>
    </language>
</elementInfo>
' #txt
Ps0 f15 46 286 20 20 13 0 #rect
Ps0 f15 @|RichDialogMethodStartIcon #fIcon
Ps0 f16 guid 1189E0FCCCEB295B #txt
Ps0 f16 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f16 method refresh() #txt
Ps0 f16 disableUIEvents false #txt
Ps0 f16 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ps0 f16 outParameterDecl '<> result;
' #txt
Ps0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
        <nameStyle>9,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f16 190 46 20 20 13 0 #rect
Ps0 f16 @|RichDialogMethodStartIcon #fIcon
Ps0 f18 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f18 guid 1189E10155DB10A2 #txt
Ps0 f18 43 363 26 26 14 0 #rect
Ps0 f18 @|RichDialogEndIcon #fIcon
Ps0 f19 expr out #txt
Ps0 f19 56 306 56 363 #arcP
Ps0 f20 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f20 actionTable 'out=in;
' #txt
Ps0 f20 actionCode 'panel.activityPanel.refresh();
' #txt
Ps0 f20 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Refresh inner panels</name>
        <nameStyle>20,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f20 182 100 36 24 20 -2 #rect
Ps0 f20 @|RichDialogProcessStepIcon #fIcon
Ps0 f21 expr out #txt
Ps0 f21 200 66 200 100 #arcP
Ps0 f17 expr out #txt
Ps0 f17 182 117 74 147 #arcP
Ps0 f22 guid 11975356EFA3FB94 #txt
Ps0 f22 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f22 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f22 actionTable 'out=in;
' #txt
Ps0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f22 262 46 20 20 13 0 #rect
Ps0 f22 @|RichDialogProcessStartIcon #fIcon
Ps0 f23 expr out #txt
Ps0 f23 264 62 215 100 #arcP
Ps0 f24 guid 1197550C4C02C9A8 #txt
Ps0 f24 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f24 actionTable 'out=in;
' #txt
Ps0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f24 110 286 20 20 13 0 #rect
Ps0 f24 @|RichDialogProcessStartIcon #fIcon
Ps0 f25 expr out #txt
Ps0 f25 113 303 64 365 #arcP
Ps0 f26 guid 11B362CDE599E3BF #txt
Ps0 f26 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f26 broadcast applicationDeleted #txt
Ps0 f26 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f26 actionTable 'out=in;
out.deletedApplicationId=param.applicationId;
' #txt
Ps0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>applicationDeleted</name>
        <nameStyle>18,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f26 222 286 20 20 13 0 #rect
Ps0 f26 @|RichDialogBroadcastStartIcon #fIcon
Ps0 f27 guid 11B362CECFB750FA #txt
Ps0 f27 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f27 broadcast processModelDeleted #txt
Ps0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f27 actionTable 'out=in;
out.deletedProcessModelId=param.processModelId;
' #txt
Ps0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>processModelDeleted</name>
        <nameStyle>19,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f27 350 286 20 20 13 0 #rect
Ps0 f27 @|RichDialogBroadcastStartIcon #fIcon
Ps0 f28 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f28 275 403 26 26 14 0 #rect
Ps0 f28 @|RichDialogProcessEndIcon #fIcon
Ps0 f29 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ps0 f29 218 338 28 28 14 0 #rect
Ps0 f29 @|AlternativeIcon #fIcon
Ps0 f30 expr out #txt
Ps0 f30 232 306 232 338 #arcP
Ps0 f32 expr in #txt
Ps0 f32 239 359 279 406 #arcP
Ps0 f33 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ps0 f33 346 338 28 28 14 0 #rect
Ps0 f33 @|AlternativeIcon #fIcon
Ps0 f34 expr out #txt
Ps0 f34 360 306 360 338 #arcP
Ps0 f35 expr in #txt
Ps0 f35 353 359 297 407 #arcP
Ps0 f37 actionDecl 'ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData out;
' #txt
Ps0 f37 actionTable 'out=in;
out.processModel=null;
' #txt
Ps0 f37 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Ps0 f37 110 364 36 24 20 -2 #rect
Ps0 f37 @|RichDialogProcessStepIcon #fIcon
Ps0 f38 expr in #txt
Ps0 f38 outCond in.processModel.getId()==in.deletedProcessModelId #txt
Ps0 f38 350 356 146 376 #arcP
Ps0 f38 1 296 376 #addKink
Ps0 f38 1 0.3773152399123066 0 0 #arcLabel
Ps0 f36 expr in #txt
Ps0 f36 outCond in.application.getId()==in.deletedApplicationId #txt
Ps0 f36 224 358 146 376 #arcP
Ps0 f36 1 200 376 #addKink
Ps0 f36 1 0.20109115066695443 0 0 #arcLabel
Ps0 f31 expr out #txt
Ps0 f31 110 376 69 376 #arcP
Ps0 f31 0 0.5987129996964062 0 0 #arcLabel
Ps0 f39 guid 11F42304624B0892 #txt
Ps0 f39 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f39 method matchIdentifier(String,Object) #txt
Ps0 f39 disableUIEvents false #txt
Ps0 f39 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
Ps0 f39 inParameterMapAction 'out.tempIdentifier=param.identifier as Number;
out.tempType=param.type;
' #txt
Ps0 f39 outParameterDecl '<java.lang.String name> result;
' #txt
Ps0 f39 outActionCode 'if (in.tempType.equalsIgnoreCase(ApplicationTreeHelper.TREE_ITEM_PM))
{
	if (in.tempIdentifier==in.processModel.getId())
	{
		result.name = panel.getName();
	}
}' #txt
Ps0 f39 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier(String)</name>
        <nameStyle>23,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ps0 f39 390 214 20 20 13 0 #rect
Ps0 f39 @|RichDialogMethodStartIcon #fIcon
Ps0 f40 type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
Ps0 f40 387 259 26 26 14 0 #rect
Ps0 f40 @|RichDialogProcessEndIcon #fIcon
Ps0 f41 expr out #txt
Ps0 f41 400 234 400 259 #arcP
>Proto Ps0 .type ch.ivyteam.ivy.admin.tool.ProcessModel.ProcessModelData #txt
>Proto Ps0 .processKind RICH_DIALOG #txt
>Proto Ps0 .rdData2UIAction 'panel.descriptionTextArea.text=in.#processModel != null?in.processModel.getDescription():"";
panel.nameTextField.text=in.#processModel!=null?in.processModel.getName():"";
panel.pmvTable.listData=in.processModelVersions;
panel.titlePane.title=in.#processModel != null?"Process Model ''" + in.processModel.getName() + "''":"";
' #txt
>Proto Ps0 -8 -8 16 16 16 26 #rect
>Proto Ps0 '' #fIcon
Ps0 f0 mainOut f4 tail #connect
Ps0 f4 head f3 mainIn #connect
Ps0 f3 mainOut f1 tail #connect
Ps0 f1 head f2 mainIn #connect
Ps0 f8 out f11 tail #connect
Ps0 f11 head f10 mainIn #connect
Ps0 f10 mainOut f7 tail #connect
Ps0 f7 head f6 mainIn #connect
Ps0 f8 out f12 tail #connect
Ps0 f12 head f6 mainIn #connect
Ps0 f5 mainOut f14 tail #connect
Ps0 f14 head f13 mainIn #connect
Ps0 f13 mainOut f9 tail #connect
Ps0 f9 head f8 in #connect
Ps0 f15 mainOut f19 tail #connect
Ps0 f19 head f18 mainIn #connect
Ps0 f16 mainOut f21 tail #connect
Ps0 f21 head f20 mainIn #connect
Ps0 f20 mainOut f17 tail #connect
Ps0 f17 head f3 mainIn #connect
Ps0 f22 mainOut f23 tail #connect
Ps0 f23 head f20 mainIn #connect
Ps0 f24 mainOut f25 tail #connect
Ps0 f25 head f18 mainIn #connect
Ps0 f26 mainOut f30 tail #connect
Ps0 f30 head f29 in #connect
Ps0 f32 head f28 mainIn #connect
Ps0 f27 mainOut f34 tail #connect
Ps0 f34 head f33 in #connect
Ps0 f35 head f28 mainIn #connect
Ps0 f33 out f38 tail #connect
Ps0 f38 head f37 mainIn #connect
Ps0 f33 out f35 tail #connect
Ps0 f29 out f36 tail #connect
Ps0 f36 head f37 mainIn #connect
Ps0 f29 out f32 tail #connect
Ps0 f37 mainOut f31 tail #connect
Ps0 f31 head f18 mainIn #connect
Ps0 f39 mainOut f41 tail #connect
Ps0 f41 head f40 mainIn #connect
