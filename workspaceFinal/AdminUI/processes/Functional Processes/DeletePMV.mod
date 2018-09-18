[Ivy]
[>Created: Mon Jul 07 16:28:09 ICT 2014]
1470EF09CCBB36A1 3.17 #module
>Proto >Proto Collection #zClass
DV0 DeletePMV Big #zClass
DV0 B #cInfo
DV0 #process
DV0 @TextInP .resExport .resExport #zField
DV0 @TextInP .type .type #zField
DV0 @TextInP .processKind .processKind #zField
DV0 @AnnotationInP-0n ai ai #zField
DV0 @MessageFlowInP-0n messageIn messageIn #zField
DV0 @MessageFlowOutP-0n messageOut messageOut #zField
DV0 @TextInP .xml .xml #zField
DV0 @TextInP .responsibility .responsibility #zField
DV0 @StartSub f0 '' #zField
DV0 @EndSub f1 '' #zField
DV0 @GridStep f3 '' #zField
DV0 @PushWFArc f4 '' #zField
DV0 @PushWFArc f2 '' #zField
>Proto DV0 DV0 DeletePMV #zField
DV0 f0 inParamDecl '<ch.ivyteam.ivy.application.IProcessModelVersion deletedPMV> param;' #txt
DV0 f0 inParamTable 'out.deletedPMV=param.deletedPMV;
' #txt
DV0 f0 outParamDecl '<java.lang.Boolean isDeleted,java.lang.Exception exception> result;
' #txt
DV0 f0 outParamTable 'result.isDeleted=in.isDeleted;
result.exception=in.exception;
' #txt
DV0 f0 actionDecl 'ch.ivyteam.ivy.admin.tool.process.DeletePMV out;
' #txt
DV0 f0 callSignature deletePMV(ch.ivyteam.ivy.application.IProcessModelVersion) #txt
DV0 f0 type ch.ivyteam.ivy.admin.tool.process.DeletePMV #txt
DV0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deletePMV(IProcessModelVersion)</name>
        <nameStyle>31,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
DV0 f0 51 51 26 26 14 0 #rect
DV0 f0 @|StartSubIcon #fIcon
DV0 f0 -13016147|-1|-16777216 #nodeStyle
DV0 f1 type ch.ivyteam.ivy.admin.tool.process.DeletePMV #txt
DV0 f1 51 243 26 26 14 0 #rect
DV0 f1 @|EndSubIcon #fIcon
DV0 f1 -13016147|-1|-16777216 #nodeStyle
DV0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.process.DeletePMV out;
' #txt
DV0 f3 actionTable 'out=in;
' #txt
DV0 f3 actionCode 'import ch.ivyteam.ivy.persistence.PersistencyException;

in.isDeleted = false;
try {
	in.deletedPMV.delete();
	in.isDeleted = true;
} catch (PersistencyException e) {
	in.exception = e;
} catch (IllegalStateException e) {
	in.exception = e;
}
' #txt
DV0 f3 type ch.ivyteam.ivy.admin.tool.process.DeletePMV #txt
DV0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete PMV</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
DV0 f3 46 148 36 24 20 -2 #rect
DV0 f3 @|StepIcon #fIcon
DV0 f3 -13016147|-1|-16777216 #nodeStyle
DV0 f4 expr out #txt
DV0 f4 64 77 64 148 #arcP
DV0 f2 expr out #txt
DV0 f2 64 172 64 243 #arcP
>Proto DV0 .type ch.ivyteam.ivy.admin.tool.process.DeletePMV #txt
>Proto DV0 .processKind CALLABLE_SUB #txt
>Proto DV0 0 0 32 24 18 0 #rect
>Proto DV0 @|BIcon #fIcon
DV0 f0 mainOut f4 tail #connect
DV0 f4 head f3 mainIn #connect
DV0 f3 mainOut f2 tail #connect
DV0 f2 head f1 mainIn #connect
