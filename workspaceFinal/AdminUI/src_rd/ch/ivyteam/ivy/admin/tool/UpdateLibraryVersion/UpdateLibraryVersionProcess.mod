[Ivy]
[>Created: Wed Feb 24 17:35:31 ICT 2016]
13DCEF22A3965926 3.18 #module
>Proto >Proto Collection #zClass
Us0 UpdateLibraryVersionProcess Big #zClass
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
Us0 @PushWFArc f2 '' #zField
Us0 @RichDialogProcessEnd f9 '' #zField
Us0 @RichDialogProcessStep f12 '' #zField
Us0 @PushWFArc f10 '' #zField
Us0 @RichDialogProcessStart f14 '' #zField
Us0 @RichDialogProcessEnd f15 '' #zField
Us0 @RichDialogProcessEnd f21 '' #zField
Us0 @PushWFArc f28 '' #zField
Us0 @RichDialogMethodStart f16 '' #zField
Us0 @RichDialogMethodStart f17 '' #zField
Us0 @PushWFArc f20 '' #zField
Us0 @PushWFArc f18 '' #zField
Us0 @RichDialogProcessStart f19 '' #zField
Us0 @RichDialogEnd f22 '' #zField
Us0 @PushWFArc f23 '' #zField
Us0 @RichDialogProcessStart f24 '' #zField
Us0 @RichDialogProcessEnd f25 '' #zField
Us0 @RichDialogProcessStep f13 '' #zField
Us0 @RichDialogEnd f29 '' #zField
Us0 @Alternative f26 '' #zField
Us0 @RichDialog f33 '' #zField
Us0 @PushWFArc f34 '' #zField
Us0 @PushWFArc f35 '' #zField
Us0 @Alternative f36 '' #zField
Us0 @RichDialog f38 '' #zField
Us0 @PushWFArc f41 '' #zField
Us0 @RichDialogProcessStart f42 '' #zField
Us0 @RichDialogProcessEnd f43 '' #zField
Us0 @RichDialogProcessStep f48 '' #zField
Us0 @PushWFArc f32 '' #zField
Us0 @PushWFArc f50 '' #zField
Us0 @Alternative f27 '' #zField
Us0 @PushWFArc f44 '' #zField
Us0 @PushWFArc f37 '' #zField
Us0 @RichDialog f45 '' #zField
Us0 @PushWFArc f46 '' #zField
Us0 @PushWFArc f51 '' #zField
Us0 @PushWFArc f47 '' #zField
Us0 @PushWFArc f40 '' #zField
Us0 @PushWFArc f59 '' #zField
Us0 @RichDialogProcessStep f31 '' #zField
Us0 @PushWFArc f49 '' #zField
Us0 @RichDialogInitStart f5 '' #zField
Us0 @PushWFArc f30 '' #zField
Us0 @Alternative f52 '' #zField
Us0 @PushWFArc f53 '' #zField
Us0 @RichDialog f54 '' #zField
Us0 @PushWFArc f56 '' #zField
Us0 @RichDialog f60 '' #zField
Us0 @PushWFArc f62 '' #zField
Us0 @PushWFArc f39 '' #zField
Us0 @PushWFArc f58 '' #zField
Us0 @PushWFArc f55 '' #zField
>Proto Us0 Us0 UpdateLibraryVersionProcess #zField
Us0 f0 guid 13DCEF22A8C603A5 #txt
Us0 f0 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f0 method start() #txt
Us0 f0 disableUIEvents true #txt
Us0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f0 outParameterDecl '<> result;
' #txt
Us0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Us0 f0 30 54 20 20 13 0 #rect
Us0 f0 @|RichDialogInitStartIcon #fIcon
Us0 f1 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f1 30 150 20 20 13 0 #rect
Us0 f1 @|RichDialogProcessEndIcon #fIcon
Us0 f2 expr out #txt
Us0 f2 40 74 40 150 #arcP
Us0 f9 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f9 118 230 20 20 13 0 #rect
Us0 f9 @|RichDialogProcessEndIcon #fIcon
Us0 f12 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f12 actionTable 'out=in;
' #txt
Us0 f12 actionCode '
panel.txtRequiredProjectId.text = in.requiredLibrary.getId();

if(in.requiredLibrary.getMaximumVersion() != null)
{
	panel.specifyMaxCheckBox.setSelected(true);
	in.maxVersionSpecified = in.requiredLibrary.getMaximumVersion().getQualifiedVersion().toString();
	in.isMaxInclusive = in.requiredLibrary.getMaximumVersion().isInclusive();
}

if(in.requiredLibrary.getMinimumVersion() != null) 
{
	panel.specifyMinCheckBox.setSelected(true);
	in.minVersionSpecified = in.requiredLibrary.getMinimumVersion().getQualifiedVersion().toString();
	in.isMinInclusive = in.requiredLibrary.getMinimumVersion().isInclusive();
}

if(panel.specifyMaxCheckBox.isSelected())
{
	panel.txtMax.setEditable(true);
	panel.maxInclusiveChkbox.setEnabled(true);
}

if(panel.specifyMinCheckBox.isSelected())
{
	panel.txtMin.setEditable(true);
	panel.minInclusiveChkBx.setEnabled(true);
}
if(!panel.specifyMaxCheckBox.isSelected() && !panel.specifyMinCheckBox.isSelected())
{
	panel.updateBttn.setEnabled(false);
}
' #txt
Us0 f12 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f12 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set Default value</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f12 110 124 36 24 9 -35 #rect
Us0 f12 @|RichDialogProcessStepIcon #fIcon
Us0 f10 expr out #txt
Us0 f10 128 148 128 230 #arcP
Us0 f14 guid 13DD2EF5C72556D2 #txt
Us0 f14 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f14 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f14 actionTable 'out=in;
' #txt
Us0 f14 actionCode 'import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
RCheckBox item = event.getSource() as RCheckBox;

if(item.getName().equalsIgnoreCase(panel.specifyMaxCheckBox.getName()))
{
	if(item.isSelected())
	{
		panel.enableToEditMaxOrMinVersion(true);
	}
	else
	{
		panel.disableEditMaxOrMinVersion(true);
	}
	
}
else if(item.getName().equalsIgnoreCase(panel.specifyMinCheckBox.getName()))
{
	if(item.isSelected())
	{
		panel.enableToEditMaxOrMinVersion(false);
	}
	else 
	{
		panel.disableEditMaxOrMinVersion(false);
	}
}
panel.updateBttn.setEnabled(true);' #txt
Us0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>enableToEdit</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f14 630 62 20 20 9 -24 #rect
Us0 f14 @|RichDialogProcessStartIcon #fIcon
Us0 f15 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f15 630 134 20 20 13 0 #rect
Us0 f15 @|RichDialogProcessEndIcon #fIcon
Us0 f21 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f21 1102 142 20 20 13 0 #rect
Us0 f21 @|RichDialogProcessEndIcon #fIcon
Us0 f28 expr out #txt
Us0 f28 640 82 640 134 #arcP
Us0 f16 guid 13DD2FF8DC110389 #txt
Us0 f16 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f16 method enableToEditMaxOrMinVersion(Boolean) #txt
Us0 f16 disableUIEvents false #txt
Us0 f16 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Boolean isMax> param = methodEvent.getInputArguments();
' #txt
Us0 f16 inActionCode 'Boolean isMax = param.isMax;

if(isMax) {
	if(!panel.specifyMinCheckBox.isSelected())
	{
		out.maxVersionSpecified = "1.0.0-SNAPSHOT";
	}
	panel.txtMax.setEditable(true);
	panel.maxInclusiveChkbox.setEnabled(true);
} else {
	out.minVersionSpecified = "1.0.0-SNAPSHOT";
	panel.txtMin.setEditable(true);
	panel.minInclusiveChkBx.setEnabled(true);
}

' #txt
Us0 f16 outParameterDecl '<> result;
' #txt
Us0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>enableToEditMaxOrMinVersion(Boolean)</name>
        <nameStyle>36,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f16 1030 70 20 20 -36 -36 #rect
Us0 f16 @|RichDialogMethodStartIcon #fIcon
Us0 f17 guid 13DD2FF94CB6D1E0 #txt
Us0 f17 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f17 method disableEditMaxOrMinVersion(Boolean) #txt
Us0 f17 disableUIEvents false #txt
Us0 f17 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Boolean isMax> param = methodEvent.getInputArguments();
' #txt
Us0 f17 inActionCode 'Boolean isMax = param.isMax;

if(isMax)
{
	out.maxVersionSpecified = "";
	out.isMaxInclusive = false;
	panel.txtMax.setText("");
	panel.txtMax.setEditable(false);
	panel.maxInclusiveChkbox.setEnabled(false);
}
else 
{
	out.minVersionSpecified = "";
	out.isMinInclusive = false;
	panel.txtMin.setText("");
	panel.txtMin.setEditable(false);
	panel.minInclusiveChkBx.setEnabled(false);
}' #txt
Us0 f17 outParameterDecl '<> result;
' #txt
Us0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>disableEditMaxOrMinVersion(Boolean)</name>
        <nameStyle>35,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f17 1182 70 20 20 15 -16 #rect
Us0 f17 @|RichDialogMethodStartIcon #fIcon
Us0 f20 expr out #txt
Us0 f20 1040 90 1102 152 #arcP
Us0 f20 1 1040 152 #addKink
Us0 f20 0 0.7970738027821823 0 0 #arcLabel
Us0 f18 expr out #txt
Us0 f18 1192 90 1122 152 #arcP
Us0 f18 1 1192 152 #addKink
Us0 f18 0 0.8367406667297116 0 0 #arcLabel
Us0 f19 guid 13DD3073C7721137 #txt
Us0 f19 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f19 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f19 actionTable 'out=in;
' #txt
Us0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
        <nameStyle>5,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f19 782 62 20 20 17 -16 #rect
Us0 f19 @|RichDialogProcessStartIcon #fIcon
Us0 f22 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f22 guid 13DD30743BD46653 #txt
Us0 f22 782 134 20 20 13 0 #rect
Us0 f22 @|RichDialogEndIcon #fIcon
Us0 f23 expr out #txt
Us0 f23 792 82 792 134 #arcP
Us0 f24 guid 13DD31E22435970B #txt
Us0 f24 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f24 actionTable 'out=in;
' #txt
Us0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f24 638 214 20 20 12 -27 #rect
Us0 f24 @|RichDialogProcessStartIcon #fIcon
Us0 f25 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f25 766 390 20 20 13 0 #rect
Us0 f25 @|RichDialogProcessEndIcon #fIcon
Us0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f13 actionTable 'out=in;
' #txt
Us0 f13 actionCode 'import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;

import ch.ivyteam.ivy.application.value.QualifiedVersion;
in.errorMessage = "";
//Remove current required project version.
if(in.requiredLibrary.getMaximumVersion() != null)
{
	in.requiredLibrary.deleteMaximumVersion();
}
if(in.requiredLibrary.getMinimumVersion() != null)
{
	in.requiredLibrary.deleteMinimumVersion();
}

//Update required project version
try
{
	if(panel.specifyMinCheckBox.isSelected())
	{
		in.requiredLibrary.createMinimumVersion(QualifiedVersions.valueOf(in.minVersionSpecified)).setInclusive(in.isMinInclusive);
	}
 	if(panel.specifyMaxCheckBox.isSelected())
	{
		in.requiredLibrary.createMaximumVersion(QualifiedVersions.valueOf(in.maxVersionSpecified)).setInclusive(in.isMaxInclusive);
	}
} 
catch (Exception e)
{
	if(e != null)
	{
		in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/wrongSpecifyLibrary");
	}
}

' #txt
Us0 f13 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update version</name>
        <nameStyle>14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f13 630 388 36 24 20 -2 #rect
Us0 f13 @|RichDialogProcessStepIcon #fIcon
Us0 f29 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f29 guid 13DD3571C21B62F1 #txt
Us0 f29 638 862 20 20 13 0 #rect
Us0 f29 @|RichDialogEndIcon #fIcon
Us0 f26 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isValid Selection</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f26 634 330 28 28 14 -31 #rect
Us0 f26 @|AlternativeIcon #fIcon
Us0 f33 targetWindow NEW:card: #txt
Us0 f33 targetDisplay TOP #txt
Us0 f33 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f33 startMethod start(String) #txt
Us0 f33 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f33 requestActionDecl '<String errorMessage> param;' #txt
Us0 f33 requestActionCode 'param.errorMessage = in.errorMessage;' #txt
Us0 f33 responseActionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f33 responseMappingAction 'out=in;
' #txt
Us0 f33 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f33 isAsynch false #txt
Us0 f33 isInnerRd true #txt
Us0 f33 userContext '* ' #txt
Us0 f33 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show Error</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f33 758 332 36 24 14 -41 #rect
Us0 f33 @|RichDialogIcon #fIcon
Us0 f34 expr in #txt
Us0 f34 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f34 662 344 758 344 #arcP
Us0 f34 0 0.49770797081724283 1 13 #arcLabel
Us0 f35 expr out #txt
Us0 f35 776 356 776 390 #arcP
Us0 f36 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f36 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is Resolved</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f36 634 522 28 28 11 -28 #rect
Us0 f36 @|AlternativeIcon #fIcon
Us0 f38 targetWindow NEW:card: #txt
Us0 f38 targetDisplay TOP #txt
Us0 f38 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f38 startMethod warning(String) #txt
Us0 f38 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f38 requestActionDecl '<String warning> param;' #txt
Us0 f38 requestActionCode 'param.warning = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/resolvedWarning");' #txt
Us0 f38 responseActionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f38 responseMappingAction 'out=in;
' #txt
Us0 f38 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/warning\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f38 isAsynch false #txt
Us0 f38 isInnerRd true #txt
Us0 f38 userContext '* ' #txt
Us0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Lib not solved</name>
        <nameStyle>14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f38 758 524 36 24 4 -28 #rect
Us0 f38 @|RichDialogIcon #fIcon
Us0 f41 expr in #txt
Us0 f41 662 536 758 536 #arcP
Us0 f42 guid 13DD42C5D6ADC4BE #txt
Us0 f42 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f42 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f42 actionTable 'out=in;
' #txt
Us0 f42 actionCode 'import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.LibraryUtil;
import ch.ivyteam.ivy.application.value.QualifiedVersion;
import ch.ivyteam.ivy.richdialog.widgets.components.RCheckBox;
Object item = event.getSource();

if(item instanceof RCheckBox)
{
	RCheckBox specifyBttn = item as RCheckBox;
	if(specifyBttn.getName().equalsIgnoreCase(panel.specifyMaxCheckBox.getName()))
	{
		if(panel.specifyMaxCheckBox.isSelected() && panel.specifyMinCheckBox.isSelected())
		{
			if(!in.minVersionSpecified.isEmpty())
			{
				out.maxVersionSpecified = in.minVersionSpecified;
			}
			else
			{
				out.maxVersionSpecified = LibraryUtil.DEFAULT_LIBRARY_VERSION;
				out.minVersionSpecified = LibraryUtil.DEFAULT_LIBRARY_VERSION;
			}
		}
	}
	if(specifyBttn.getName().equalsIgnoreCase(panel.specifyMinCheckBox.getName()))
	{
		if(panel.specifyMaxCheckBox.isSelected() && panel.specifyMinCheckBox.isSelected())
		{
			if(!in.maxVersionSpecified.isEmpty())
			{
				out.minVersionSpecified = LibraryUtil.DEFAULT_LIBRARY_VERSION;
			}
			else 
			{
				out.maxVersionSpecified = LibraryUtil.DEFAULT_LIBRARY_VERSION;
				out.minVersionSpecified = LibraryUtil.DEFAULT_LIBRARY_VERSION;
			}
		}
	}
}

QualifiedVersion minVersion = QualifiedVersions.valueOf(in.minVersionSpecified);
QualifiedVersion maxVersion = QualifiedVersions.valueOf(in.maxVersionSpecified);

if(!in.maxVersionSpecified.isEmpty() && !in.minVersionSpecified.isEmpty() && maxVersion.equals(minVersion))
{
		in.isMaxInclusive = true;
		in.isMinInclusive = true;
}' #txt
Us0 f42 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>check Inclusive</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f42 438 214 20 20 4 -27 #rect
Us0 f42 @|RichDialogProcessStartIcon #fIcon
Us0 f43 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f43 438 294 20 20 13 0 #rect
Us0 f43 @|RichDialogProcessEndIcon #fIcon
Us0 f48 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f48 actionTable 'out=in;
' #txt
Us0 f48 actionCode 'import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.versionrange.QualifiedVersions;
import ch.ivyteam.ivy.application.value.QualifiedVersion;
in.isInvalidLibrarySetup = false;

if(panel.specifyMaxCheckBox.isSelected() && "".equalsIgnoreCase(in.maxVersionSpecified))
{
	in.isInvalidLibrarySetup = true;
	in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/versionMustBeSpecified");	

}

if(panel.specifyMinCheckBox.isSelected() && "".equalsIgnoreCase(in.minVersionSpecified))
{
	in.isInvalidLibrarySetup = true;
	in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/versionMustBeSpecified");	
}

QualifiedVersion minVersion = QualifiedVersions.valueOf(in.minVersionSpecified);
QualifiedVersion maxVersion = QualifiedVersions.valueOf(in.maxVersionSpecified);
if(panel.specifyMinCheckBox.isSelected() && panel.specifyMaxCheckBox.isSelected()){
	if(minVersion.compareTo(maxVersion) > 0){
		in.isInvalidLibrarySetup = true;
		in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/maxMinVersionWarning");
	}
	if(minVersion.equals(maxVersion))
	{
		if(!in.isMaxInclusive || !in.isMinInclusive)
		{
			in.isInvalidLibrarySetup = true;
			in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/selectInclusiveWarning");
		}	
	}		
}' #txt
Us0 f48 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f48 630 268 36 24 20 -2 #rect
Us0 f48 @|RichDialogProcessStepIcon #fIcon
Us0 f32 expr out #txt
Us0 f32 648 292 648 330 #arcP
Us0 f50 expr in #txt
Us0 f50 outCond !in.isInvalidLibrarySetup #txt
Us0 f50 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f50 648 358 648 388 #arcP
Us0 f50 0 0.3684210526315789 -17 0 #arcLabel
Us0 f27 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is Exception</name>
        <nameStyle>12,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f27 634 450 28 28 13 -21 #rect
Us0 f27 @|AlternativeIcon #fIcon
Us0 f44 expr out #txt
Us0 f44 648 412 648 450 #arcP
Us0 f37 expr in #txt
Us0 f37 outCond in.errorMessage.isEmpty() #txt
Us0 f37 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f37 648 478 648 522 #arcP
Us0 f37 0 0.38636363636363635 -9 0 #arcLabel
Us0 f45 targetWindow NEW:card: #txt
Us0 f45 targetDisplay TOP #txt
Us0 f45 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f45 startMethod start(String) #txt
Us0 f45 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f45 requestActionDecl '<String errorMessage> param;' #txt
Us0 f45 requestActionCode 'param.errorMessage = in.errorMessage;' #txt
Us0 f45 responseActionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f45 responseMappingAction 'out=in;
' #txt
Us0 f45 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f45 isAsynch false #txt
Us0 f45 isInnerRd true #txt
Us0 f45 userContext '* ' #txt
Us0 f45 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error
Lib range</name>
        <nameStyle>11,7
9,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f45 758 452 36 24 20 -2 #rect
Us0 f45 @|RichDialogIcon #fIcon
Us0 f46 expr in #txt
Us0 f46 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f46 662 464 758 464 #arcP
Us0 f46 0 0.4791666666666667 0 9 #arcLabel
Us0 f51 expr out #txt
Us0 f51 776 452 776 410 #arcP
Us0 f47 expr out #txt
Us0 f47 448 234 448 294 #arcP
Us0 f40 expr out #txt
Us0 f40 776 548 658 872 #arcP
Us0 f40 1 776 872 #addKink
Us0 f40 1 0.10097008289839203 0 0 #arcLabel
Us0 f59 expr out #txt
Us0 f59 648 234 648 268 #arcP
Us0 f31 actionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f31 actionTable 'out=in;
' #txt
Us0 f31 actionCode 'import ch.ivyteam.ivy.application.ILibrary;

ILibrary newResolvedLib = in.requiredLibrary.getResolvedLibrary();
in.errorMessage = "";
in.isUpdated = false;

try 
{
	if(in.currentResolvedLib != null)
	{
		if(!newResolvedLib.getQualifiedVersion().equals(in.currentResolvedLib.getQualifiedVersion()))
		{
			in.requiredLibrary.setResolvedLibrary(newResolvedLib);
			List<String> params = new List<String>();
			params.add("''" + in.currentResolvedLib.getId() + "''");
			params.add("''" + in.currentResolvedLib.getProcessModelVersion().getVersionName()+ "''");
			params.add(in.currentResolvedLib.getQualifiedVersion().toString());
			params.add(newResolvedLib.getQualifiedVersion().toString());
			in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/projectPMVVersionWasChangedInOrderToResolvedConfiguration", params);
			in.isUpdated = true;
		}
	}
	else
	{
		in.requiredLibrary.setResolvedLibrary(newResolvedLib);
		List<String> params = new List<String>();
		params.add("''" + newResolvedLib.getId() + "''");
		params.add("''" + newResolvedLib.getProcessModelVersion().getVersionName() + "''");
		params.add(newResolvedLib.getQualifiedVersion().toString());
		in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/projectPMVWasChangedInOrderToResolvedConfiguration", params);
		in.isUpdated = true;
	}
}
catch (Exception ex)
{
	in.isFailed = true;
	in.errorMessage = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/LibraryDetail/couldNotUpdateRequiredProjectFor", new List().add(in.pmvName));
}' #txt
Us0 f31 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update RequiredLib</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f31 630 580 36 24 5 -31 #rect
Us0 f31 @|RichDialogProcessStepIcon #fIcon
Us0 f49 expr in #txt
Us0 f49 outCond in.requiredLibrary.isResolved() #txt
Us0 f49 648 550 648 580 #arcP
Us0 f49 0 0.2401751106899793 0 0 #arcLabel
Us0 f5 guid 13E8E2CBB243E86D #txt
Us0 f5 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f5 method startWithRequiredLibrary(ch.ivyteam.ivy.application.ILibrarySpecification,String) #txt
Us0 f5 disableUIEvents true #txt
Us0 f5 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.ILibrarySpecification requiredLib,java.lang.String pmvName> param = methodEvent.getInputArguments();
' #txt
Us0 f5 inParameterMapAction 'out.pmvName=param.pmvName;
out.requiredLibrary=param.requiredLib;
' #txt
Us0 f5 inActionCode 'if(param.requiredLib != null && param.requiredLib.getResolvedLibrary() != null)
{
	out.currentResolvedLib = param.requiredLib.getResolvedLibrary();
}
' #txt
Us0 f5 outParameterDecl '<> result;
' #txt
Us0 f5 embeddedRdInitializations '* ' #txt
Us0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>startWithRequiredLibrary(ILibrarySpecification,String)</name>
        <nameStyle>54,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f5 118 54 20 20 13 0 #rect
Us0 f5 @|RichDialogInitStartIcon #fIcon
Us0 f30 expr out #txt
Us0 f30 128 74 128 124 #arcP
Us0 f52 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f52 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is 
Update success</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f52 634 634 28 28 15 -31 #rect
Us0 f52 @|AlternativeIcon #fIcon
Us0 f53 expr out #txt
Us0 f53 648 604 648 634 #arcP
Us0 f54 targetWindow NEW:card: #txt
Us0 f54 targetDisplay TOP #txt
Us0 f54 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f54 startMethod information(String) #txt
Us0 f54 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f54 requestActionDecl '<String message> param;' #txt
Us0 f54 requestActionCode 'param.message = in.errorMessage;' #txt
Us0 f54 responseActionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f54 responseMappingAction 'out=in;
' #txt
Us0 f54 windowConfiguration '{/title "<%=ivy.cms.co(\"/ch/ivyteam/ivy/server/deploymentWizard/dialogTitle/infoDialog\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f54 isAsynch false #txt
Us0 f54 isInnerRd true #txt
Us0 f54 userContext '* ' #txt
Us0 f54 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>display Info Message</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f54 510 636 36 24 -56 -40 #rect
Us0 f54 @|RichDialogIcon #fIcon
Us0 f56 expr out #txt
Us0 f56 528 660 638 872 #arcP
Us0 f56 1 528 872 #addKink
Us0 f56 1 0.11493013242376302 0 0 #arcLabel
Us0 f60 targetWindow NEW:card: #txt
Us0 f60 targetDisplay TOP #txt
Us0 f60 richDialogId ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ErrorDialog #txt
Us0 f60 startMethod start(String) #txt
Us0 f60 type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
Us0 f60 requestActionDecl '<String errorMessage> param;' #txt
Us0 f60 requestActionCode 'param.errorMessage = in.errorMessage;' #txt
Us0 f60 responseActionDecl 'ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData out;
' #txt
Us0 f60 responseMappingAction 'out=in;
' #txt
Us0 f60 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/general/error\")%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Us0 f60 isAsynch false #txt
Us0 f60 isInnerRd true #txt
Us0 f60 userContext '* ' #txt
Us0 f60 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>display Message</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f60 566 740 36 24 -49 -33 #rect
Us0 f60 @|RichDialogIcon #fIcon
Us0 f62 expr out #txt
Us0 f62 584 764 640 865 #arcP
Us0 f62 1 584 816 #addKink
Us0 f62 0 0.7521577552580593 0 0 #arcLabel
Us0 f39 expr in #txt
Us0 f39 648 662 648 862 #arcP
Us0 f58 expr in #txt
Us0 f58 outCond in.isFailed #txt
Us0 f58 639 653 584 740 #arcP
Us0 f58 1 584 680 #addKink
Us0 f58 0 0.9769630652220723 0 0 #arcLabel
Us0 f55 expr in #txt
Us0 f55 outCond in.isUpdated #txt
Us0 f55 634 648 546 648 #arcP
Us0 f55 0 0.8298210362883874 0 0 #arcLabel
>Proto Us0 .ui2RdDataAction 'out.maxVersionSpecified=panel.txtMax.valueAsString;
out.minVersionSpecified=panel.txtMin.valueAsString;
out.isMaxInclusive=panel.maxInclusiveChkbox.selected;
out.isMinInclusive=panel.minInclusiveChkBx.selected;
' #txt
>Proto Us0 .rdData2UIAction 'panel.txtMax.valueAsString=in.maxVersionSpecified;
panel.txtMin.valueAsString=in.minVersionSpecified;
panel.maxInclusiveChkbox.selected=in.isMaxInclusive;
panel.minInclusiveChkBx.selected=in.isMinInclusive;
' #txt
>Proto Us0 .type ch.ivyteam.ivy.admin.tool.UpdateLibraryVersion.UpdateLibraryVersionData #txt
>Proto Us0 .processKind RICH_DIALOG #txt
>Proto Us0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>START</swimlaneLabel>
        <swimlaneLabel>EVENT</swimlaneLabel>
        <swimlaneLabel>METHOD</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>392</swimlaneSize>
    <swimlaneSize>608</swimlaneSize>
    <swimlaneSize>784</swimlaneSize>
    <swimlaneColor>-10027009</swimlaneColor>
    <swimlaneColor>-10027162</swimlaneColor>
    <swimlaneColor>-3355393</swimlaneColor>
</elementInfo>
' #txt
>Proto Us0 -8 -8 16 16 16 26 #rect
>Proto Us0 '' #fIcon
Us0 f0 mainOut f2 tail #connect
Us0 f2 head f1 mainIn #connect
Us0 f12 mainOut f10 tail #connect
Us0 f10 head f9 mainIn #connect
Us0 f14 mainOut f28 tail #connect
Us0 f28 head f15 mainIn #connect
Us0 f16 mainOut f20 tail #connect
Us0 f20 head f21 mainIn #connect
Us0 f17 mainOut f18 tail #connect
Us0 f18 head f21 mainIn #connect
Us0 f19 mainOut f23 tail #connect
Us0 f23 head f22 mainIn #connect
Us0 f34 head f33 mainIn #connect
Us0 f33 mainOut f35 tail #connect
Us0 f35 head f25 mainIn #connect
Us0 f41 head f38 mainIn #connect
Us0 f48 mainOut f32 tail #connect
Us0 f32 head f26 in #connect
Us0 f26 out f50 tail #connect
Us0 f50 head f13 mainIn #connect
Us0 f26 out f34 tail #connect
Us0 f13 mainOut f44 tail #connect
Us0 f44 head f27 in #connect
Us0 f27 out f37 tail #connect
Us0 f37 head f36 in #connect
Us0 f27 out f46 tail #connect
Us0 f46 head f45 mainIn #connect
Us0 f45 mainOut f51 tail #connect
Us0 f51 head f25 mainIn #connect
Us0 f42 mainOut f47 tail #connect
Us0 f47 head f43 mainIn #connect
Us0 f38 mainOut f40 tail #connect
Us0 f40 head f29 mainIn #connect
Us0 f24 mainOut f59 tail #connect
Us0 f59 head f48 mainIn #connect
Us0 f36 out f49 tail #connect
Us0 f49 head f31 mainIn #connect
Us0 f36 out f41 tail #connect
Us0 f5 mainOut f30 tail #connect
Us0 f30 head f12 mainIn #connect
Us0 f31 mainOut f53 tail #connect
Us0 f53 head f52 in #connect
Us0 f54 mainOut f56 tail #connect
Us0 f56 head f29 mainIn #connect
Us0 f60 mainOut f62 tail #connect
Us0 f62 head f29 mainIn #connect
Us0 f39 head f29 mainIn #connect
Us0 f58 head f60 mainIn #connect
Us0 f52 out f55 tail #connect
Us0 f55 head f54 mainIn #connect
Us0 f52 out f58 tail #connect
Us0 f52 out f39 tail #connect
