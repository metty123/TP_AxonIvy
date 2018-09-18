[Ivy]
[>Created: Mon Feb 22 13:45:26 ICT 2016]
13C6FE0E38477C74 3.18 #module
>Proto >Proto Collection #zClass
Ts0 TargetSelectionDetailProcess Big #zClass
Ts0 RD #cInfo
Ts0 #process
Ts0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ts0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ts0 @TextInP .resExport .resExport #zField
Ts0 @TextInP .type .type #zField
Ts0 @TextInP .processKind .processKind #zField
Ts0 @AnnotationInP-0n ai ai #zField
Ts0 @TextInP .xml .xml #zField
Ts0 @TextInP .responsibility .responsibility #zField
Ts0 @RichDialogInitStart f0 '' #zField
Ts0 @RichDialogProcessEnd f1 '' #zField
Ts0 @RichDialogProcessStep f3 '' #zField
Ts0 @PushWFArc f4 '' #zField
Ts0 @PushWFArc f2 '' #zField
Ts0 @RichDialogEnd f6 '' #zField
Ts0 @RichDialogProcessStart f7 '' #zField
Ts0 @PushWFArc f5 '' #zField
Ts0 @RichDialogProcessStart f10 '' #zField
Ts0 @RichDialogProcessEnd f11 '' #zField
Ts0 @RichDialogProcessStep f13 '' #zField
Ts0 @PushWFArc f14 '' #zField
Ts0 @PushWFArc f12 '' #zField
Ts0 @RichDialogInitStart f19 '' #zField
Ts0 @PushWFArc f20 '' #zField
Ts0 @RichDialogProcessStart f8 '' #zField
Ts0 @RichDialogProcessStep f9 '' #zField
Ts0 @RichDialogMethodStart f23 '' #zField
Ts0 @RichDialogProcessEnd f24 '' #zField
Ts0 @PushWFArc f25 '' #zField
Ts0 @RichDialogFireEvent f34 '' #zField
Ts0 @PushWFArc f35 '' #zField
Ts0 @PushWFArc f22 '' #zField
Ts0 @PushWFArc f15 '' #zField
Ts0 @RichDialogProcessStart f16 '' #zField
Ts0 @RichDialogProcessEnd f17 '' #zField
Ts0 @RichDialogProcessStep f18 '' #zField
Ts0 @PushWFArc f21 '' #zField
Ts0 @PushWFArc f26 '' #zField
Ts0 @RichDialogMethodStart f27 '' #zField
Ts0 @RichDialogProcessEnd f28 '' #zField
Ts0 @RichDialog f29 '' #zField
Ts0 @PushWFArc f30 '' #zField
Ts0 @PushWFArc f31 '' #zField
>Proto Ts0 Ts0 TargetSelectionDetailProcess #zField
Ts0 f0 guid 13AB06863D2980BB #txt
Ts0 f0 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f0 method start() #txt
Ts0 f0 disableUIEvents true #txt
Ts0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ts0 f0 outParameterDecl '<> result;
' #txt
Ts0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ts0 f0 142 158 20 20 13 0 #rect
Ts0 f0 @|RichDialogInitStartIcon #fIcon
Ts0 f1 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f1 22 438 20 20 13 0 #rect
Ts0 f1 @|RichDialogProcessEndIcon #fIcon
Ts0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f3 actionTable 'out=in;
' #txt
Ts0 f3 actionCode 'import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.LibraryInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectDetailInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailPanel;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.RequireLibraryInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.GlobalVariable;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.LibraryUtil;
import java.util.Arrays;
import ch.ivyteam.ivy.application.ActivityState;
import ch.ivyteam.ivy.application.ReleaseState;
import ch.ivyteam.ivy.application.ILibrary;
import ch.ivyteam.ivy.application.ILibrarySpecification;
import java.util.Iterator;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.application.IProcessModel;
import java.util.ArrayList;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.application.IApplication;

in.tableData.clear();

for (IApplication app: in.selectedApps)
{
	ProjectDetailInfo appItem = new ProjectDetailInfo();
	appItem.setProjectName(app.getName());
	appItem.setActivity("");
	appItem.setRelease("");
	in.tableData.add(appItem);	
	
	// search all lib inside thi app	
	
	List<LibraryInfo> availableLibs = LibraryUtil.getAvailableLib(app, in.deployProjects);
	
	for (ProjectInfo item : in.deployProjects)
	{			
		if (item.getApplication().equals(app.getName()))
		{
			ProjectDetailInfo projectItem = new ProjectDetailInfo();				
			
			projectItem.setApplication(item.getApplication());

			projectItem.setProjectName(item.getProjectName());
			projectItem.setProjectPath(item.getProjectPath());
			projectItem.setQualifiedProjectVersion(item.getQualifiedProjectVersion());
			projectItem.setProcessModelNumber(item.processModelVersion);
			projectItem.setLibId(item.getLibraryId());
			
			String defaultPM = TargetSelectionDetailPanel.DEFAULT_ITEM;
			String defaultPMV = TargetSelectionDetailPanel.DEFAULT_ITEM;
			
			boolean defaultActivity = true;
			boolean defaultRelease = true;
			
			IProcessModelVersion matchingPmv = LibraryUtil.findLibrary(app, projectItem.getLibId(), projectItem.getQualifiedProjectVersion());
			IProcessModelVersion matchingLibIdPmv = null;
			// check if this project is already deployed to app 
			if (matchingPmv == null)
			{				
				// search for PM has match libId only when no matching PMV and no PM transfer 
				if (item.getProcessModel().isEmpty())
				{
					// check if there is pmv has same lib Id
					matchingLibIdPmv = LibraryUtil.findLibraryWithMatchId(app, projectItem.getLibId());				
					
					if (matchingLibIdPmv != null)
					{
						defaultPM = matchingLibIdPmv.getProcessModel().getName();
						projectItem.setProcessModel(defaultPM);
					}
				}
			}
			else
			{				
				defaultPM = matchingPmv.getProcessModel().getName();
				defaultPMV = ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmvTooltip", 
																Arrays.asList(String.valueOf(matchingPmv.getVersionNumber()), 
																							String.valueOf(matchingPmv.getLibrary().getId()), 
																							String.valueOf(matchingPmv.getLibrary().getQualifiedVersion()))
																);
				projectItem.setProcessModel(defaultPM);
				projectItem.setProcessModelVersion(defaultPMV);
				
				// XIVYADMUI-115: set pm and pmv for projectInfo to get original release state
				item.setProcessModelVersion(matchingPmv.getVersionNumber());
			}
			
			// no data transfer for PM
			if (item.getProcessModel().isEmpty())
			{
				// If there is exists PM has same name as Project Name, set it as default								
				if (matchingPmv == null && matchingLibIdPmv == null && app.findProcessModel(projectItem.getProjectName()) != null)
				{
					defaultPM = projectItem.getProjectName();
				}															
				projectItem.setProcessModel(defaultPM);				
			} 
			else 
			{
				// set data if no matching PMV
				if (matchingPmv == null)
				{
					projectItem.setProcessModel(item.getProcessModel());
				}
			}			
			
			// PMV not set from transfer data and not found matching PMV
			if (item.getProcessModelVersion() == 0 && matchingPmv == null)
			{
				// No existing PM found, PM is <NEW> so PMV is <NEW>					
				if (projectItem.getProcessModel().equals(TargetSelectionDetailPanel.DEFAULT_ITEM) == false)
				{		
					IProcessModelVersion searchPmv = app.findProcessModelVersion(projectItem.getProcessModel() + GlobalVariable.PMV_NAME_DELIMITER + projectItem.processModelNumber);				
					if (searchPmv != null && searchPmv.getReleaseState().name().equals(ReleaseState.DELETED.name()) == false)
					{
						// only accept pmv with same libId
						if (searchPmv.getLibrary() == null)
						{
							defaultPMV = ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmv") + GlobalVariable.PMV_NAME_DELIMITER + searchPmv.getVersionNumber();
						}
						else if (searchPmv.getLibrary() != null && searchPmv.getLibrary().getId().equals(projectItem.getLibId()))
						{
							defaultPMV = ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmvTooltip", 
																				Arrays.asList(String.valueOf(searchPmv.getVersionNumber()), 
																											String.valueOf(searchPmv.getLibrary().getId()), 
																											String.valueOf(searchPmv.getLibrary().getQualifiedVersion()))
																			 );
						}
					}
				}

				projectItem.setProcessModelVersion(defaultPMV);				
			} 
			// PMV has data transfer 
			else 
			{
				if (matchingPmv == null)
				{
					if (projectItem.getProcessModel().equals(TargetSelectionDetailPanel.DEFAULT_ITEM))
					{
						projectItem.setProcessModelVersion(TargetSelectionDetailPanel.DEFAULT_ITEM);
					} 
					else 
					{					
						// search for pmv that have version number equal to item.getProcessModelVersion()
						IProcessModelVersion searchPmv = app.findProcessModelVersion(projectItem.getProcessModel() + GlobalVariable.PMV_NAME_DELIMITER + item.getProcessModelVersion());					
						if (searchPmv == null)							 
						{
							projectItem.setProcessModelVersion(TargetSelectionDetailPanel.DEFAULT_ITEM);
						}
						else
						{						
							if (searchPmv.getReleaseState().name().equals(ReleaseState.DELETED.name()))
							{
								projectItem.setProcessModelVersion(TargetSelectionDetailPanel.DEFAULT_ITEM);
							}
							else 
							{
								if (searchPmv.getLibrary() == null)
								{
									defaultPMV = ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmv") + GlobalVariable.PMV_NAME_DELIMITER + searchPmv.getVersionNumber();
								}
								else
								{
									defaultPMV = ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmvTooltip", 
																				Arrays.asList(String.valueOf(searchPmv.getVersionNumber()), 
																											String.valueOf(searchPmv.getLibrary().getId()), 
																											String.valueOf(searchPmv.getLibrary().getQualifiedVersion()))
																				);
								}
								projectItem.setProcessModelVersion(defaultPMV);
								
							}
						}
					}				
				}								
			}
			
			if (projectItem.getProcessModelVersion().equals(TargetSelectionDetailPanel.DEFAULT_ITEM))
			{
				projectItem.setProcessModelVersionTooltip(ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/pmv") + GlobalVariable.PMV_NAME_DELIMITER + projectItem.getProcessModelNumber()); 
			} 
			else 
			{
				projectItem.setProcessModelVersionTooltip(projectItem.getProcessModelVersion());
			}
			
			// XIVYADMUI-115: get original release state
			IProcessModelVersion pmv = app.findProcessModelVersion(item.getProcessModel() + GlobalVariable.PMV_NAME_DELIMITER + item.getProcessModelVersion());
			if (pmv != null)
			{
				item.setOriginalActivityState(pmv.getActivityState().name());
				item.setOriginalReleaseState(pmv.getReleaseState().name());
				
				projectItem.setOriginalRelease(pmv.getReleaseState().name());
			}
			
			// Set value for ACTIVE and RELEASE checkbox
			// Active all is not checked
			// XIVYADMUI-6: Activate/Release ALL buttons
			// If user select/deselect the "Activate All" checkbox, update pmv''s status accordingly
			if (in.isUserChangeActivateAll) {
				defaultActivity = in.isActiveAll;
			} else {
				if (in.isActiveAll == false) 
				{
					// has value transfer
					if (item.getActivity().isEmpty() == false)
					{
						if (item.getActivity().equals(ActivityState.ACTIVE.name()) == false)
						{
							defaultActivity = false;
						}
					} 
					else 
					{
						// get state from server
						ActivityState activityState = LibraryUtil.getDefaultActivityState(app, projectItem.getProcessModel());
						if (activityState.equals(ActivityState.ACTIVE) == false)
						{
							defaultActivity = false;
						}
					}														
				}
			}
			projectItem.setActivity(defaultActivity);				
			
			// FOR RELEASE
			// Release all is not checked
			// XIVYADMUI-6: Activate/Release ALL buttons
			// If user select/deselect the "Release All" checkbox, update pmv''s status accordingly
			// XIVYADMUI-115: If original state = Released, checkbox is checked
			if (item.getOriginalReleaseState().equals(ReleaseState.RELEASED.name())) {
				defaultRelease = true;
			} else if (in.isUserChangeReleaseAll) {
				defaultRelease = in.isReleaseAll;
			} else {
				if (in.isReleaseAll == false) 
				{
					// has value transfer
					if (item.getRelease().isEmpty() == false)
					{
						if (item.getRelease().equals(ReleaseState.RELEASED.name()) == false)
						{
							defaultRelease = false;
						}
					} 
					else 
					{
						// get state from server
						ReleaseState releaseState = LibraryUtil.getDefaultReleaseState(app, projectItem.getProcessModel());
						if (releaseState.equals(ReleaseState.RELEASED) == false)
						{
							defaultRelease = false;
						}
					}														
				}
			}
			projectItem.setRelease(defaultRelease);		
			
			if (item.getRequireProjects().isEmpty() == false)
			{
				// if not find match version
				if (item.getRequireProjects().contains(GlobalVariable.ARROW) == false)
				{
					List<RequireLibraryInfo> projectRequiredLibs = item.getRequireProjects();
					
					LibraryUtil.createRequireLibTextAndToolTip(availableLibs, projectRequiredLibs, item);
				}
			}
			
			projectItem.setRequireProjects(item.getRequireProjects());
			projectItem.setRequireProjectsText(item.getRequireProjectsText());
			projectItem.setRequireProjectsTooltip(item.getRequireProjectsTooltip());
			
			in.tableData.add(projectItem);
		}
	}
}' #txt
Ts0 f3 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>init data </name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f3 14 324 36 24 20 -2 #rect
Ts0 f3 @|RichDialogProcessStepIcon #fIcon
Ts0 f4 expr out #txt
Ts0 f4 152 178 50 336 #arcP
Ts0 f4 1 152 336 #addKink
Ts0 f4 0 0.8486510795691815 0 0 #arcLabel
Ts0 f2 expr out #txt
Ts0 f2 32 348 32 438 #arcP
Ts0 f6 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f6 guid 13AB11E1235A7749 #txt
Ts0 f6 334 518 20 20 13 0 #rect
Ts0 f6 @|RichDialogEndIcon #fIcon
Ts0 f7 guid 13AB11E2353BE54B #txt
Ts0 f7 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f7 actionTable 'out=in;
out.isOkClicked=false;
' #txt
Ts0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>click cancel</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f7 334 270 20 20 13 0 #rect
Ts0 f7 @|RichDialogProcessStartIcon #fIcon
Ts0 f5 expr out #txt
Ts0 f5 344 290 344 518 #arcP
Ts0 f10 guid 13ABB763460B8D0C #txt
Ts0 f10 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f10 actionTable 'out=in;
' #txt
Ts0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>onload</name>
        <nameStyle>6,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f10 478 70 20 20 13 0 #rect
Ts0 f10 @|RichDialogProcessStartIcon #fIcon
Ts0 f11 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f11 478 198 20 20 13 0 #rect
Ts0 f11 @|RichDialogProcessEndIcon #fIcon
Ts0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f13 actionTable 'out=in;
' #txt
Ts0 f13 actionCode panel.renderGUI(); #txt
Ts0 f13 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>render GUI</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f13 470 132 36 24 20 -2 #rect
Ts0 f13 @|RichDialogProcessStepIcon #fIcon
Ts0 f14 expr out #txt
Ts0 f14 488 90 488 132 #arcP
Ts0 f12 expr out #txt
Ts0 f12 488 156 488 198 #arcP
Ts0 f19 guid 13AC05F3AD6E311A #txt
Ts0 f19 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f19 method start(List<ch.ivyteam.ivy.application.IApplication>,List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo>,Boolean,Boolean,Boolean,Boolean) #txt
Ts0 f19 disableUIEvents true #txt
Ts0 f19 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.application.IApplication> appList,List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectList,java.lang.Boolean isReleaseAll,java.lang.Boolean isActiveAll,java.lang.Boolean isUserChangeActivateAll,java.lang.Boolean isUserChangeReleaseAll> param = methodEvent.getInputArguments();
' #txt
Ts0 f19 inActionCode 'out.selectedApps.clear();
out.selectedApps.addAll(param.appList);
out.deployProjects.clear();
out.deployProjects.addAll(param.projectList);
out.isActiveAll = param.isActiveAll;
out.isReleaseAll = param.isReleaseAll;
out.isUserChangeActivateAll = param.isUserChangeActivateAll;
out.isUserChangeReleaseAll = param.isUserChangeReleaseAll;' #txt
Ts0 f19 outParameterDecl '<java.lang.Boolean isOkClicked> result;
' #txt
Ts0 f19 outParameterMapAction 'result.isOkClicked=in.isOkClicked;
' #txt
Ts0 f19 embeddedRdInitializations '* ' #txt
Ts0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(List&lt;IApplication&gt;,List&lt;ProjectInfo&gt;,Boolean,Boolean,Boolean,Boolean)</name>
        <nameStyle>75,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f19 22 54 20 20 13 0 #rect
Ts0 f19 @|RichDialogInitStartIcon #fIcon
Ts0 f20 expr out #txt
Ts0 f20 32 74 32 324 #arcP
Ts0 f8 guid 13AC0D55E66A9297 #txt
Ts0 f8 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f8 actionTable 'out=in;
out.isOkClicked=true;
' #txt
Ts0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>click OK</name>
        <nameStyle>8,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f8 518 270 20 20 13 0 #rect
Ts0 f8 @|RichDialogProcessStartIcon #fIcon
Ts0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f9 actionTable 'out=in;
' #txt
Ts0 f9 actionCode 'import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.LibraryUtil;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailPanel;
import ch.ivyteam.ivy.server.ServerFactory;
import ch.ivyteam.ivy.application.IProcessModelVersion;
import ch.ivyteam.ivy.application.IProcessModel;
import ch.ivyteam.ivy.application.IApplication;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.common.GlobalVariable;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectDetailInfo;
import ch.ivyteam.ivy.application.ActivityState;
import ch.ivyteam.ivy.application.ReleaseState;

for (ProjectDetailInfo item: in.tableData)
{
	
	for (ProjectInfo projectInfo:in.deployProjects)
	{
		IApplication app = ServerFactory.getServer().getApplicationConfigurationManager().findApplication(item.getApplication());
		
		if (item.getApplication().equals(projectInfo.getApplication()) && 
				item.getProjectName().equals(projectInfo.getProjectName()) && 
				item.getProjectPath().equals(projectInfo.getProjectPath()))
		{					
			if (item.getProcessModel().equals(TargetSelectionDetailPanel.DEFAULT_ITEM))
			{				
				projectInfo.setProcessModel(TargetSelectionDetailPanel.DEFAULT_ITEM);													
			} 
			else 
			{
				projectInfo.setProcessModel(item.getProcessModel());				
			}
			
			if (item.getProcessModelVersion().equals(TargetSelectionDetailPanel.DEFAULT_ITEM) == false && item.getProcessModelVersion().isEmpty() == false)
			{
				projectInfo.setProcessModelVersion(panel.getPmvNumberFromPmv(item));			
			} 
			else 
			{		    									
				if (app != null && app.getName().equals(item.getApplication()))
				{					
					int pmvNumber = LibraryUtil.findNewPmvNumber(app, item.getProcessModel());
					projectInfo.setProcessModelVersion(pmvNumber);
				}
				
			}
			
			if (item.getActivity().toBoolean())
			{
				projectInfo.setActivity(ActivityState.ACTIVE.name());
			} 
			else 
			{
				projectInfo.setActivity(ActivityState.INACTIVE.name());
			}
			
			if (item.getRelease().toBoolean())
			{
				projectInfo.setRelease(ReleaseState.RELEASED.name());
			} 
			else 
			{
				projectInfo.setRelease(ReleaseState.PREPARED.name());
			}
			
		}
	}
}
' #txt
Ts0 f9 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update data</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f9 510 364 36 24 20 -2 #rect
Ts0 f9 @|RichDialogProcessStepIcon #fIcon
Ts0 f23 guid 13AC73C6D6580720 #txt
Ts0 f23 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f23 method getDeployProjectList() #txt
Ts0 f23 disableUIEvents false #txt
Ts0 f23 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ts0 f23 outParameterDecl '<List<ch.ivyteam.ivy.server.deploymentwizard.model.ProjectInfo> projectList> result;
' #txt
Ts0 f23 outParameterMapAction 'result.projectList=in.deployProjects;
' #txt
Ts0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getDeployProjectList()</name>
        <nameStyle>22,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f23 982 54 20 20 13 0 #rect
Ts0 f23 @|RichDialogMethodStartIcon #fIcon
Ts0 f24 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f24 982 214 20 20 13 0 #rect
Ts0 f24 @|RichDialogProcessEndIcon #fIcon
Ts0 f25 expr out #txt
Ts0 f25 992 74 992 214 #arcP
Ts0 f34 actionDecl 'List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo> projectInfoList;
' #txt
Ts0 f34 actionTable 'projectInfoList=in.deployProjects;
' #txt
Ts0 f34 actionCode panel.fireUpdateDetailInfo(projectInfoList); #txt
Ts0 f34 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f34 fireEvent updateDetailInfo(List<ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectInfo>) #txt
Ts0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>update project info </name>
        <nameStyle>20
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f34 510 468 36 24 20 -2 #rect
Ts0 f34 @|RichDialogFireEventIcon #fIcon
Ts0 f35 expr out #txt
Ts0 f35 528 388 528 468 #arcP
Ts0 f35 0 0.5327723860288806 0 0 #arcLabel
Ts0 f22 expr out #txt
Ts0 f22 528 492 354 528 #arcP
Ts0 f22 1 528 528 #addKink
Ts0 f22 1 0.3668325714979791 0 0 #arcLabel
Ts0 f15 expr out #txt
Ts0 f15 528 290 528 364 #arcP
Ts0 f16 guid 14748FA52DFF6DBA #txt
Ts0 f16 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f16 actionTable 'out=in;
' #txt
Ts0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>table value changed</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f16 725 53 22 22 14 0 #rect
Ts0 f16 @|RichDialogProcessStartIcon #fIcon
Ts0 f17 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f17 725 181 22 22 14 0 #rect
Ts0 f17 @|RichDialogProcessEndIcon #fIcon
Ts0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f18 actionTable 'out=in;
' #txt
Ts0 f18 actionCode 'import ch.ivyteam.ivy.application.ReleaseState;
import ch.ivyteam.ivy.admin.tool.deploymentwizardserver.ProjectDetailInfo;

ProjectDetailInfo selectedProject = panel.tblDetail.getSelectedListEntry() as ProjectDetailInfo;
String releaseColumn = ivy.cms.co("/ch/ivyteam/ivy/server/deploymentWizard/component/tableHeaderName/release");

if (panel.tblDetail.getColumnName(panel.tblDetail.getSelectedColumn()).equals(releaseColumn) && selectedProject.originalRelease.equals(ReleaseState.RELEASED.name())) {
	int selectedRow = panel.tblDetail.getSelectedRow();
	int selectedColumn = panel.tblDetail.getSelectedColumn();
	selectedProject.release = true;
		
	String title = ivy.cms.co("/Dialogs/general/warning");
	String icon = "warning";
	String message = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/unableToChangeReleaseState");
	List<String> buttons = [ivy.cms.co("/Dialogs/general/ok")];
	panel.showDialog(title, icon, message, buttons);
}' #txt
Ts0 f18 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show dialog if 
uncheck release chkbox</name>
        <nameStyle>38,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f18 718 116 36 24 20 -2 #rect
Ts0 f18 @|RichDialogProcessStepIcon #fIcon
Ts0 f21 expr out #txt
Ts0 f21 736 75 736 116 #arcP
Ts0 f26 expr out #txt
Ts0 f26 736 140 736 181 #arcP
Ts0 f27 guid 1475817479DE7F66 #txt
Ts0 f27 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f27 method showDialog(String,String,String,List<String>) #txt
Ts0 f27 disableUIEvents false #txt
Ts0 f27 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String title,java.lang.String icon,java.lang.String message,List<java.lang.String> buttons> param = methodEvent.getInputArguments();
' #txt
Ts0 f27 inParameterMapAction 'out.dialogButtons=param.buttons;
out.dialogIcon=param.icon;
out.dialogMessage=param.message;
out.dialogTitle=param.title;
' #txt
Ts0 f27 outParameterDecl '<> result;
' #txt
Ts0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>showDialog(String,String,String,List&lt;String&gt;)</name>
    </language>
</elementInfo>
' #txt
Ts0 f27 981 277 22 22 14 0 #rect
Ts0 f27 @|RichDialogMethodStartIcon #fIcon
Ts0 f28 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f28 981 405 22 22 14 0 #rect
Ts0 f28 @|RichDialogProcessEndIcon #fIcon
Ts0 f29 targetWindow NEW:card: #txt
Ts0 f29 targetDisplay TOP #txt
Ts0 f29 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Ts0 f29 startMethod askQuestion(String,String,List<String>) #txt
Ts0 f29 type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
Ts0 f29 requestActionDecl '<String icon, String question, List<String> buttons> param;' #txt
Ts0 f29 requestMappingAction 'param.icon=in.dialogIcon;
param.question=in.dialogMessage;
param.buttons=in.dialogButtons;
' #txt
Ts0 f29 responseActionDecl 'ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData out;
' #txt
Ts0 f29 responseMappingAction 'out=in;
' #txt
Ts0 f29 responseActionCode 'in.dialogTitle = "";
in.dialogIcon = "";
in.dialogMessage = "";
in.dialogButtons.clear();' #txt
Ts0 f29 windowConfiguration '{/title "<%=in.dialogTitle%>"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Ts0 f29 isAsynch false #txt
Ts0 f29 isInnerRd true #txt
Ts0 f29 userContext '* ' #txt
Ts0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show dialog</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f29 974 340 36 24 20 -2 #rect
Ts0 f29 @|RichDialogIcon #fIcon
Ts0 f30 expr out #txt
Ts0 f30 992 299 992 340 #arcP
Ts0 f31 expr out #txt
Ts0 f31 992 364 992 405 #arcP
>Proto Ts0 .ui2RdDataAction 'out.tableData=panel.tblDetail.listData;
' #txt
>Proto Ts0 .rdData2UIAction 'panel.tblDetail.listData=in.tableData;
' #txt
>Proto Ts0 .type ch.ivyteam.ivy.admin.tool.deploymentwizardserver.TargetSelectionDetail.TargetSelectionDetailData #txt
>Proto Ts0 .processKind RICH_DIALOG #txt
>Proto Ts0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>start</swimlaneLabel>
        <swimlaneLabel>event</swimlaneLabel>
        <swimlaneLabel>Method</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>304</swimlaneSize>
    <swimlaneSize>600</swimlaneSize>
    <swimlaneSize>344</swimlaneSize>
    <swimlaneColor>-26266</swimlaneColor>
    <swimlaneColor>-16737895</swimlaneColor>
    <swimlaneColor>-6711040</swimlaneColor>
</elementInfo>
' #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
>Proto Ts0 '' #fIcon
Ts0 f0 mainOut f4 tail #connect
Ts0 f4 head f3 mainIn #connect
Ts0 f3 mainOut f2 tail #connect
Ts0 f2 head f1 mainIn #connect
Ts0 f7 mainOut f5 tail #connect
Ts0 f5 head f6 mainIn #connect
Ts0 f10 mainOut f14 tail #connect
Ts0 f14 head f13 mainIn #connect
Ts0 f13 mainOut f12 tail #connect
Ts0 f12 head f11 mainIn #connect
Ts0 f19 mainOut f20 tail #connect
Ts0 f20 head f3 mainIn #connect
Ts0 f23 mainOut f25 tail #connect
Ts0 f25 head f24 mainIn #connect
Ts0 f9 mainOut f35 tail #connect
Ts0 f35 head f34 mainIn #connect
Ts0 f34 mainOut f22 tail #connect
Ts0 f22 head f6 mainIn #connect
Ts0 f8 mainOut f15 tail #connect
Ts0 f15 head f9 mainIn #connect
Ts0 f16 mainOut f21 tail #connect
Ts0 f21 head f18 mainIn #connect
Ts0 f18 mainOut f26 tail #connect
Ts0 f26 head f17 mainIn #connect
Ts0 f27 mainOut f30 tail #connect
Ts0 f30 head f29 mainIn #connect
Ts0 f29 mainOut f31 tail #connect
Ts0 f31 head f28 mainIn #connect
