[Ivy]
[>Created: Tue Aug 11 13:38:21 ICT 2015]
115D7307F8F74D9A 3.17 #module
>Proto >Proto Collection #zClass
As0 AboutProcess Big #zClass
As0 RD #cInfo
As0 #process
As0 @TextInP .xml .xml #zField
As0 @TextInP .responsibility .responsibility #zField
As0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
As0 @TextInP .rdData2UIAction .rdData2UIAction #zField
As0 @TextInP .resExport .resExport #zField
As0 @TextInP .type .type #zField
As0 @TextInP .processKind .processKind #zField
As0 @MessageFlowInP-0n messageIn messageIn #zField
As0 @MessageFlowOutP-0n messageOut messageOut #zField
As0 @AnnotationInP-0n ai ai #zField
As0 @RichDialogInitStart f0 '' #zField
As0 @RichDialogProcessEnd f1 '' #zField
As0 @RichDialogProcessStep f2 '' #zField
As0 @RichDialogMethodStart f5 '' #zField
As0 @RichDialogMethodStart f6 '' #zField
As0 @RichDialogEnd f8 '' #zField
As0 @PushWFArc f9 '' #zField
As0 @RichDialogProcessStart f10 '' #zField
As0 @RichDialogProcessStart f12 '' #zField
As0 @PushWFArc f13 '' #zField
As0 @RichDialogMethodStart f14 '' #zField
As0 @RichDialogProcessEnd f15 '' #zField
As0 @PushWFArc f16 '' #zField
As0 @RichDialogProcessEnd f34 '' #zField
As0 @RichDialogProcessStart f17 '' #zField
As0 @CallSub f20 '' #zField
As0 @PushWFArc f23 '' #zField
As0 @PushWFArc f11 '' #zField
As0 @PushWFArc f27 '' #zField
As0 @PushWFArc f7 '' #zField
As0 @PushWFArc f25 '' #zField
As0 @PushWFArc f3 '' #zField
>Proto As0 As0 AboutProcess #zField
As0 f0 guid 115D739C0FEC7301 #txt
As0 f0 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f0 method start() #txt
As0 f0 disableUIEvents false #txt
As0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
As0 f0 outParameterDecl '<> result;
' #txt
As0 f0 embeddedRdInitializations '{/headerPane {/fieldName "headerPane"/startMethod "start(String,String)"/parameterMapping "param.iconUri=\"/Icons/Ivy/48\";\nparam.title=ivy.cms.co(\"/Dialogs/general/about\");\n"/initScript ""/userContext * }}' #txt
As0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f0 54 38 20 20 13 0 #rect
As0 f0 @|RichDialogInitStartIcon #fIcon
As0 f1 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f1 51 139 26 26 14 0 #rect
As0 f1 @|RichDialogProcessEndIcon #fIcon
As0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.About.AboutData out;
' #txt
As0 f2 actionTable 'out=in;
out.build="?";
out.javaProduct=java.lang.System.getProperty("java.vm.name");
out.javaVendor=java.lang.System.getProperty("java.vendor");
out.javaVersion=java.lang.System.getProperty("java.version");
out.product="Axon.ivy Engine";
out.version="4.0";
' #txt
As0 f2 actionCode 'import ch.ivyteam.ivy.admin.tool.ApplicationService;
import ch.ivyteam.licence.SignedLicence;
import java.util.Properties;
import java.util.Map;
import ch.ivyteam.ivy.Advisor;
import ch.ivyteam.util.Version;
import java.util.Enumeration;

in.exception = null;
try {
	in.build = Advisor.getAdvisor().getBuildDate().toString();
	in.copyright = Advisor.getAdvisor().getCopyright();
	in.product = Advisor.getAdvisor().getApplicationName();
	
	in.version= Advisor.getAdvisor().getVersion().getVersionString(Version.DETAIL_REVISION,Version.FORM_SHORT_ALL);
	
	Enumeration enum;
	String name;
	List<String> names;
	List<String> values;
	enum = java.lang.System.getProperties().propertyNames();
	while (enum.hasMoreElements())
	{
	  name = enum.nextElement() as String;
	  names.add(name);
	  values.add(java.lang.System.getProperty(name));
	}
	in.javaSystemProperties.addColumn(ivy.cms.co("/Dialogs/about/javaPropertiesName"), names);
	in.javaSystemProperties.addColumn(ivy.cms.co("/Dialogs/about/javaPropertiesValue"), values);
	in.javaSystemProperties.sort(ivy.cms.co("/Dialogs/about/javaPropertiesName"));
	
	ApplicationService applicationService = new ApplicationService();
	Map dbSystemInfo = applicationService.getSystemDatabaseInfo();
	
	in.dbSystemURL = dbSystemInfo.get("connectionUrl").toString();
	in.dbProduct = dbSystemInfo.get("dbProduct").toString();
	in.dbVersion = dbSystemInfo.get("dbVersion").toString();
	
	// Read license information
	Properties licenseProps = SignedLicence.getLicenceParameters();
	panel.licenseTypeTextField.setText(licenseProps.getProperty("licence.type"));
	panel.licenseUsersLimitTextField.setText(licenseProps.getProperty("server.users.limit"));
	panel.licenseSessionTextField.setText(licenseProps.getProperty("server.sessions.limit"));
	panel.licenseProcessElementsLimitTextField.setText(licenseProps.getProperty("server.elements.limit"));
	int totalUser = applicationService.getUsersOverAllApplication();
	panel.licenseCurrentUsedUsersTextField.setText(totalUser.toString());
} catch (Exception e) {
	in.exception = e;
}' #txt
As0 f2 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>get java system property / license information</name>
        <nameStyle>46,7
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f2 247 108 34 24 19 5 #rect
As0 f2 @|RichDialogProcessStepIcon #fIcon
As0 f5 guid 1189E1D22056A684 #txt
As0 f5 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f5 method close() #txt
As0 f5 disableUIEvents false #txt
As0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close()</name>
    </language>
</elementInfo>
' #txt
As0 f5 566 38 20 20 13 0 #rect
As0 f5 @|RichDialogMethodStartIcon #fIcon
As0 f6 guid 1189E1D2F19144FC #txt
As0 f6 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f6 method refresh() #txt
As0 f6 disableUIEvents false #txt
As0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
As0 f6 outParameterDecl '<> result;
' #txt
As0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
As0 f6 166 38 20 20 13 0 #rect
As0 f6 @|RichDialogMethodStartIcon #fIcon
As0 f8 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f8 guid 1189E1D56CB3ABAA #txt
As0 f8 563 139 26 26 14 0 #rect
As0 f8 @|RichDialogEndIcon #fIcon
As0 f9 expr out #txt
As0 f9 576 58 576 139 #arcP
As0 f10 guid 11975391BF5D1B2B #txt
As0 f10 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.About.AboutData out;
' #txt
As0 f10 actionTable 'out=in;
' #txt
As0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f10 254 38 20 20 13 0 #rect
As0 f10 @|RichDialogProcessStartIcon #fIcon
As0 f12 guid 119754EB0CB6E521 #txt
As0 f12 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.About.AboutData out;
' #txt
As0 f12 actionTable 'out=in;
' #txt
As0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f12 630 38 20 20 13 0 #rect
As0 f12 @|RichDialogProcessStartIcon #fIcon
As0 f13 expr out #txt
As0 f13 634 56 582 140 #arcP
As0 f14 guid 11F425D4123668DD #txt
As0 f14 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f14 method matchIdentifier(String,java.lang.Object) #txt
As0 f14 disableUIEvents false #txt
As0 f14 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String type,java.lang.Object identifier> param = methodEvent.getInputArguments();
' #txt
As0 f14 inParameterMapAction 'out.tempType=param.type;
' #txt
As0 f14 outParameterDecl '<java.lang.String name> result;
' #txt
As0 f14 outActionCode 'if (in.tempType=="about")
{
	result.name = panel.getName();
}' #txt
As0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>matchIdentifier(String,Object)</name>
        <nameStyle>30,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f14 710 38 20 20 13 0 #rect
As0 f14 @|RichDialogMethodStartIcon #fIcon
As0 f15 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f15 707 99 26 26 14 0 #rect
As0 f15 @|RichDialogProcessEndIcon #fIcon
As0 f16 expr out #txt
As0 f16 720 58 720 99 #arcP
As0 f34 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f34 253 253 22 22 14 0 #rect
As0 f34 @|RichDialogProcessEndIcon #fIcon
As0 f17 guid 147AE937D93EF4FC #txt
As0 f17 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f17 actionDecl 'ch.ivyteam.ivy.admin.tool.About.AboutData out;
' #txt
As0 f17 actionTable 'out=in;
' #txt
As0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onload</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f17 349 37 22 22 14 0 #rect
As0 f17 @|RichDialogProcessStartIcon #fIcon
As0 f20 type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
As0 f20 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
As0 f20 doCall true #txt
As0 f20 requestActionDecl '<java.lang.Exception exception> param;
' #txt
As0 f20 requestMappingAction 'param.exception=in.exception;
' #txt
As0 f20 responseActionDecl 'ch.ivyteam.ivy.admin.tool.About.AboutData out;
' #txt
As0 f20 responseMappingAction 'out=in;
' #txt
As0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showError if any</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
As0 f20 246 180 36 24 20 -2 #rect
As0 f20 @|CallSubIcon #fIcon
As0 f23 expr out #txt
As0 f23 264 204 264 253 #arcP
As0 f11 expr out #txt
As0 f11 176 58 247 120 #arcP
As0 f11 1 176 120 #addKink
As0 f11 1 0.050934445910689054 0 0 #arcLabel
As0 f27 expr out #txt
As0 f27 264 58 264 108 #arcP
As0 f27 0 0.4824905198636722 0 0 #arcLabel
As0 f7 expr out #txt
As0 f7 360 59 281 120 #arcP
As0 f7 1 360 120 #addKink
As0 f7 1 0.08865124736973536 0 0 #arcLabel
As0 f25 expr out #txt
As0 f25 64 58 64 139 #arcP
As0 f3 expr out #txt
As0 f3 264 132 264 180 #arcP
>Proto As0 .rdData2UIAction 'panel.buildTextField.text=in.build;
panel.copyrightTextField.text=in.copyright;
panel.dbProductTextField.text=in.dbProduct;
panel.dbSystemTextField.text=in.dbSystemURL;
panel.dbVersionTextField.text=in.dbVersion;
panel.javaProductTextField.text=in.javaProduct;
panel.javaSystemPropertiesTable.recordsetData=in.javaSystemProperties;
panel.javaVendorTextField.text=in.javaVendor;
panel.javaVersionTextField.text=in.javaVersion;
panel.productTextField.text=in.product;
panel.versionTextField.text=in.version;
' #txt
>Proto As0 .type ch.ivyteam.ivy.admin.tool.About.AboutData #txt
>Proto As0 .processKind RICH_DIALOG #txt
>Proto As0 -8 -8 16 16 16 26 #rect
>Proto As0 '' #fIcon
As0 f5 mainOut f9 tail #connect
As0 f9 head f8 mainIn #connect
As0 f12 mainOut f13 tail #connect
As0 f13 head f8 mainIn #connect
As0 f14 mainOut f16 tail #connect
As0 f16 head f15 mainIn #connect
As0 f20 mainOut f23 tail #connect
As0 f23 head f34 mainIn #connect
As0 f6 mainOut f11 tail #connect
As0 f11 head f2 mainIn #connect
As0 f10 mainOut f27 tail #connect
As0 f27 head f2 mainIn #connect
As0 f17 mainOut f7 tail #connect
As0 f7 head f2 mainIn #connect
As0 f0 mainOut f25 tail #connect
As0 f25 head f1 mainIn #connect
As0 f2 mainOut f3 tail #connect
As0 f3 head f20 mainIn #connect
