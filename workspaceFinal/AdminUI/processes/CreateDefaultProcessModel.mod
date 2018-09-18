[Ivy]
[>Created: Thu Nov 13 05:30:59 CET 2014]
1198583A44184A71 3.17 #module
>Proto >Proto Collection #zClass
Cl0 CreateDefaultProcessModel Big #zClass
Cl0 B #cInfo
Cl0 #process
Cl0 @AnnotationInP-0n ai ai #zField
Cl0 @TextInP .resExport .resExport #zField
Cl0 @TextInP .type .type #zField
Cl0 @TextInP .processKind .processKind #zField
Cl0 @TextInP .xml .xml #zField
Cl0 @TextInP .responsibility .responsibility #zField
Cl0 @MessageFlowInP-0n messageIn messageIn #zField
Cl0 @MessageFlowOutP-0n messageOut messageOut #zField
Cl0 @StartSub c0 '' #zField
Cl0 @EndSub f0 '' #zField
Cl0 @GridStep f1 '' #zField
Cl0 @PushWFArc f2 '' #zField
Cl0 @PushWFArc f3 '' #zField
>Proto Cl0 Cl0 CreateDefaultProcessModel #zField
Cl0 c0 inParamDecl '<ch.ivyteam.ivy.application.IApplication application,java.lang.String name,java.lang.String description,java.lang.String sourceProjectDirectory> param;
' #txt
Cl0 c0 inParamTable 'out.application=param.application;
out.description=param.description;
out.name=param.name;
out.sourceProjectDirectory=param.sourceProjectDirectory;
' #txt
Cl0 c0 outParamDecl '<> result;
' #txt
Cl0 c0 actionDecl 'ivyadmintool.DefaultProcessModelCreator out;
' #txt
Cl0 c0 callSignature createProcessModel(ch.ivyteam.ivy.application.IApplication,String,String,String) #txt
Cl0 c0 type ivyadmintool.DefaultProcessModelCreator #txt
Cl0 c0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>createProcessModel</name>
        <nameStyle>18,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Cl0 c0 187 87 26 26 14 0 #rect
Cl0 c0 @|StartSubIcon #fIcon
Cl0 f0 type ivyadmintool.DefaultProcessModelCreator #txt
Cl0 f0 187 487 26 26 14 0 #rect
Cl0 f0 @|EndSubIcon #fIcon
Cl0 f1 actionDecl 'ivyadmintool.DefaultProcessModelCreator out;
' #txt
Cl0 f1 actionTable 'out=in;
' #txt
Cl0 f1 actionCode 'import ch.ivyteam.ivy.application.IProcessModel;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.io.FileUtil;
import ch.ivyteam.ivy.deployment.restricted.DeploymentManagerFactory;
import ch.ivyteam.ivy.deployment.restricted.IServerToServerDeploymentManager;
import ch.ivyteam.ivy.deployment.restricted.IProjectDeployer;
import ch.ivyteam.ivy.project.IvyProjectNavigationUtil;
import ch.ivyteam.ivy.request.IHttpRequest;

String username = ivy.session.getSessionUserName();
String hostname = (ivy.request as IHttpRequest).getHttpServletRequest().getRemoteHost();
// Create PM and PMV
IProcessModel pm = in.application.createProcessModel(in.name, in.description);	
IProcessModelVersion pmv = pm.createProcessModelVersion(in.name + "1","Version 1 of " + in.name, 
		 in.application.getId().toString()+"_"+pm.getId().toString()+"_1", 0, username, hostname);

// Copy project
java.io.File srcZip = new java.io.File(in.sourceProjectDirectory);
java.io.File destDir = new java.io.File(pmv.getProjectDirectory());
ch.ivyteam.io.ZipUtil.extractFromZipFile(srcZip, destDir, true, null);

// Deploy, activate and release
IServerToServerDeploymentManager manager = DeploymentManagerFactory.createServerToServerDeploymentManager();
IProjectDeployer deployer = manager.createProjectDeployer(pmv);
deployer.deploy(username, hostname, null);
pm.activate();
pmv.activate();
pmv.release();
' #txt
Cl0 f1 type ivyadmintool.DefaultProcessModelCreator #txt
Cl0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Create</name>
        <nameStyle>6,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Cl0 f1 182 244 36 24 20 -2 #rect
Cl0 f1 @|StepIcon #fIcon
Cl0 f2 expr out #txt
Cl0 f2 200 113 200 244 #arcP
Cl0 f3 expr out #txt
Cl0 f3 200 268 200 487 #arcP
>Proto Cl0 .type ivyadmintool.DefaultProcessModelCreator #txt
>Proto Cl0 .processKind CALLABLE_SUB #txt
>Proto Cl0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
>Proto Cl0 0 0 32 24 18 0 #rect
>Proto Cl0 @|BIcon #fIcon
Cl0 c0 mainOut f2 tail #connect
Cl0 f2 head f1 mainIn #connect
Cl0 f1 mainOut f3 tail #connect
Cl0 f3 head f0 mainIn #connect
