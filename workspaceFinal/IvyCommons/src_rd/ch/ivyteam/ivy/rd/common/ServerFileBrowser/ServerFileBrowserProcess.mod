[Ivy]
[>Created: Thu Mar 21 11:53:04 ICT 2013]
11DF1DE1A08F19D9 3.17 #module
>Proto >Proto Collection #zClass
Fs0 ServerFileBrowserProcess Big #zClass
Fs0 RD #cInfo
Fs0 #process
Fs0 @TextInP .xml .xml #zField
Fs0 @TextInP .responsibility .responsibility #zField
Fs0 @MessageFlowInP-0n messageIn messageIn #zField
Fs0 @MessageFlowOutP-0n messageOut messageOut #zField
Fs0 @AnnotationInP-0n ai ai #zField
Fs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Fs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Fs0 @TextInP .resExport .resExport #zField
Fs0 @TextInP .type .type #zField
Fs0 @TextInP .processKind .processKind #zField
Fs0 @RichDialogInitStart f0 '' #zField
Fs0 @RichDialogProcessEnd f1 '' #zField
Fs0 @RichDialogProcessStep f3 '' #zField
Fs0 @PushWFArc f4 '' #zField
Fs0 @RichDialogProcessStart f5 '' #zField
Fs0 @RichDialogProcessEnd f6 '' #zField
Fs0 @InfoButton f10 '' #zField
Fs0 @AnnotationArc f11 '' #zField
Fs0 @PushWFArc f7 '' #zField
Fs0 @RichDialogProcessStart f8 '' #zField
Fs0 @RichDialogEnd f16 '' #zField
Fs0 @PushWFArc f17 '' #zField
Fs0 @RichDialogInitStart f18 '' #zField
Fs0 @PushWFArc f19 '' #zField
Fs0 @RichDialogProcessStart f20 '' #zField
Fs0 @PushWFArc f21 '' #zField
Fs0 @RichDialogProcessStart f22 '' #zField
Fs0 @RichDialogProcessEnd f25 '' #zField
Fs0 @RichDialog f23 '' #zField
Fs0 @RichDialogProcessStep f24 '' #zField
Fs0 @PushWFArc f27 '' #zField
Fs0 @Alternative f29 '' #zField
Fs0 @PushWFArc f30 '' #zField
Fs0 @PushWFArc f28 '' #zField
Fs0 @RichDialog f31 '' #zField
Fs0 @PushWFArc f32 '' #zField
Fs0 @PushWFArc f33 '' #zField
Fs0 @RichDialogProcessStep f9 '' #zField
Fs0 @PushWFArc f12 '' #zField
Fs0 @PushWFArc f2 '' #zField
Fs0 @Alternative f13 '' #zField
Fs0 @PushWFArc f14 '' #zField
Fs0 @PushWFArc f15 '' #zField
Fs0 @PushWFArc f26 '' #zField
Fs0 @RichDialogProcessStep f34 '' #zField
Fs0 @RichDialogProcessStart f35 '' #zField
Fs0 @RichDialogProcessEnd f36 '' #zField
Fs0 @PushWFArc f37 '' #zField
Fs0 @PushWFArc f38 '' #zField
>Proto Fs0 Fs0 ServerFileBrowserProcess #zField
Fs0 f0 guid 11A9628FA16BA901 #txt
Fs0 f0 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f0 method start() #txt
Fs0 f0 disableUIEvents false #txt
Fs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Fs0 f0 outParameterDecl '<> result;
' #txt
Fs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Fs0 f0 94 126 20 20 13 0 #rect
Fs0 f0 @|RichDialogInitStartIcon #fIcon
Fs0 f1 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f1 91 291 26 26 14 0 #rect
Fs0 f1 @|RichDialogProcessEndIcon #fIcon
Fs0 f3 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f3 actionTable 'out=in;
' #txt
Fs0 f3 actionCode 'panel.buttonCreateDir.visible = in.allowCreateDir;

// get data
List<java.io.File> roots = java.io.File.listRoots();
if (roots.size() > 1)
{
	out.rootDir = new Tree("MyComputer", "");
	
	for (java.io.File drive : roots)
	{
		Tree tree = new Tree(drive, "drive", true);
		out.rootDir.add(tree);
	}	
}
else
{
	out.rootDir = new Tree(roots.get(0), "drive");
}
panel.fileTree.treeData = out.rootDir;

' #txt
Fs0 f3 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set root</name>
        <nameStyle>8,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f3 86 188 36 24 24 -16 #rect
Fs0 f3 @|RichDialogProcessStepIcon #fIcon
Fs0 f4 expr out #txt
Fs0 f4 104 146 104 188 #arcP
Fs0 f5 guid 11A9637F23A304CC #txt
Fs0 f5 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f5 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f5 actionTable 'out=in;
' #txt
Fs0 f5 actionCode 'import ch.ivyteam.ivy.richdialog.component.event.TreeLoadEvent;

if (in.isInitialized)
{
	TreeLoadEvent ev = event as TreeLoadEvent;
	Tree nodeToExpand = ev.getTreeNode();
	java.io.File parent;
	// if root is expanded and windows, then next level is already there
	if ((nodeToExpand.getRoot() != nodeToExpand) || java.io.File.listRoots().size() <= 1)
	{
		parent = nodeToExpand.value as java.io.File;
		List<java.io.File> childFiles = parent.listFiles();
	
		if (parent.isDirectory())
		{
			if(childFiles != null && childFiles.size() > 0)
			{
				for (java.io.File child : parent.listFiles())
				{
					if (! child.isHidden())
					{
						if (!in.onlyDirectories || child.isDirectory())
						{
							Tree node = nodeToExpand.createChild(child, (child.isDirectory() ? "dir" : "file"));
							node.setMayHaveChildren(child.isDirectory());
						}
					}
				}
			}
			
		}
	}
	// else do nothing
}' #txt
Fs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>tree_load</name>
        <nameStyle>9,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f5 214 126 20 20 13 0 #rect
Fs0 f5 @|RichDialogProcessStartIcon #fIcon
Fs0 f6 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f6 211 259 26 26 14 0 #rect
Fs0 f6 @|RichDialogProcessEndIcon #fIcon
Fs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>load children (if directory)
or nothing (if file)</name>
        <nameStyle>49,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f10 143 19 147 42 -68 -16 #rect
Fs0 f10 @|IBIcon #fIcon
Fs0 f10 -985168|-1|-16777216 #nodeStyle
Fs0 f11 215 61 217 128 #arcP
Fs0 f7 expr out #txt
Fs0 f7 224 146 224 259 #arcP
Fs0 f8 guid 11DF22598241EBA0 #txt
Fs0 f8 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f8 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f8 actionTable 'out=in;
out.wasCancelled=true;
' #txt
Fs0 f8 actionCode 'out.selectedPath = in.rootPath;' #txt
Fs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>CancelClicked</name>
        <nameStyle>13,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f8 326 126 20 20 13 0 #rect
Fs0 f8 @|RichDialogProcessStartIcon #fIcon
Fs0 f16 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f16 guid 11DF225A13C7A4E9 #txt
Fs0 f16 323 235 26 26 14 0 #rect
Fs0 f16 @|RichDialogEndIcon #fIcon
Fs0 f17 expr out #txt
Fs0 f17 336 146 336 235 #arcP
Fs0 f18 guid 11DF2395C63C516D #txt
Fs0 f18 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f18 method start(Boolean,String,Boolean) #txt
Fs0 f18 disableUIEvents false #txt
Fs0 f18 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Boolean onlyDirectories,java.lang.String rootPath,java.lang.Boolean allowNewDirectories> param = methodEvent.getInputArguments();
' #txt
Fs0 f18 inParameterMapAction 'out.allowCreateDir=param.allowNewDirectories;
out.isInitialized=false;
out.onlyDirectories=param.onlyDirectories;
out.rootPath=param.rootPath;
out.wasCancelled=false;
' #txt
Fs0 f18 outParameterDecl '<java.lang.String path,java.lang.Boolean wasCancelled> result;
' #txt
Fs0 f18 outParameterMapAction 'result.path=in.selectedPath;
result.wasCancelled=in.wasCancelled;
' #txt
Fs0 f18 embeddedRdInitializations '* ' #txt
Fs0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Boolean,String, Boolean)</name>
        <nameStyle>30,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f18 46 94 20 20 13 0 #rect
Fs0 f18 @|RichDialogInitStartIcon #fIcon
Fs0 f19 expr out #txt
Fs0 f19 60 112 98 188 #arcP
Fs0 f20 guid 11DF23C2074D620B #txt
Fs0 f20 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f20 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f20 actionTable 'out=in;
' #txt
Fs0 f20 actionCode 'if (panel.fileTree.getSelectedTreeNode() != null)
{
	java.io.File file = panel.fileTree.getSelectedTreeNode().getValue() as java.io.File;
	out.selectedPath = file.getPath();
}
else
{
	out.selectedPath = "";
}' #txt
Fs0 f20 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>OkClicked</name>
        <nameStyle>9,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f20 462 126 20 20 13 0 #rect
Fs0 f20 @|RichDialogProcessStartIcon #fIcon
Fs0 f21 expr out #txt
Fs0 f21 464 142 346 239 #arcP
Fs0 f22 guid 11DF33FE222378B8 #txt
Fs0 f22 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f22 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f22 actionTable 'out=in;
' #txt
Fs0 f22 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create new directory</name>
        <nameStyle>20,5,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f22 94 334 20 20 13 0 #rect
Fs0 f22 @|RichDialogProcessStartIcon #fIcon
Fs0 f25 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f25 91 603 26 26 14 0 #rect
Fs0 f25 @|RichDialogProcessEndIcon #fIcon
Fs0 f23 targetDisplay TOP #txt
Fs0 f23 richDialogId ch.ivyteam.ivy.commondialogs.SingleLineInputDialog #txt
Fs0 f23 startMethod askInput(String,String,List<String>,String) #txt
Fs0 f23 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f23 requestActionDecl '<String question, String defaultValue, List<String> buttons, String defaultButton> param;' #txt
Fs0 f23 requestMappingAction 'param.question="Please enter the name of the new directory";
param.defaultValue="NewFolder";
param.buttons=["ok", "cancel"];
param.defaultButton="ok";
' #txt
Fs0 f23 responseActionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f23 responseMappingAction 'out=in;
out.newDirName=result.inputString;
' #txt
Fs0 f23 responseActionCode 'if (result.pressedButton.equalsIgnoreCase("cancel"))
{
	out.newDirName = "";
}' #txt
Fs0 f23 windowConfiguration '{/title "Create new Directory"/width 0 /height 0 /centered true /resizable false /maximized false /close_after_last_rd true }' #txt
Fs0 f23 isAsynch false #txt
Fs0 f23 isInnerRd true #txt
Fs0 f23 isDialog true #txt
Fs0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>get name</name>
        <nameStyle>8,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f23 86 428 36 24 20 -2 #rect
Fs0 f23 @|RichDialogIcon #fIcon
Fs0 f24 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f24 actionTable 'out=in;
' #txt
Fs0 f24 actionCode 'out.hasErrors = false;

if (in.newDirName.trim().length() > 0)
{
	java.io.File dir = panel.fileTree.getSelectedTreeNode().value as java.io.File;
	if (dir != null && dir.exists() && dir.isDirectory())
	{
		java.io.File newDir = new java.io.File(dir.getAbsolutePath() + java.io.File.separator + in.newDirName);
		try
		{
			out.hasErrors = !newDir.mkdirs();
			if (!out.hasErrors)
			{								
				Tree newChild = panel.fileTree.getSelectedTreeNode().createChild(newDir, "dir");
			
				panel.fileTree.expandPath(panel.fileTree.getTreePath(newChild));
				panel.fileTree.setSelectedTreeNode(newChild);
				panel.fileTree.makeVisible(panel.fileTree.getTreePath(newChild));
				panel.fileTree.scrollToVisible();
			}
		}
		catch (Exception ex)
		{
			out.hasErrors = true;
		}
	}
}' #txt
Fs0 f24 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create Directory</name>
        <nameStyle>16,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f24 86 484 36 24 20 -2 #rect
Fs0 f24 @|RichDialogProcessStepIcon #fIcon
Fs0 f27 expr out #txt
Fs0 f27 104 452 104 484 #arcP
Fs0 f29 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>has Errors</name>
        <nameStyle>10,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f29 90 530 28 28 14 0 #rect
Fs0 f29 @|AlternativeIcon #fIcon
Fs0 f30 expr out #txt
Fs0 f30 104 508 104 530 #arcP
Fs0 f28 expr in #txt
Fs0 f28 outCond !in.hasErrors #txt
Fs0 f28 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>No</name>
        <nameStyle>2,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f28 104 558 104 603 #arcP
Fs0 f31 targetDisplay TOP #txt
Fs0 f31 richDialogId ch.ivyteam.ivy.commondialogs.MessageDialog #txt
Fs0 f31 startMethod showMessageWithTitle(String,String) #txt
Fs0 f31 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f31 requestActionDecl '<String aMessageTitle, String aMessageText> param;' #txt
Fs0 f31 requestMappingAction 'param.aMessageTitle="Error creating directory";
param.aMessageText="The directory could not be created. Please try again";
' #txt
Fs0 f31 requestActionCode " #txt
Fs0 f31 responseActionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f31 responseMappingAction 'out=in;
' #txt
Fs0 f31 windowConfiguration '* ' #txt
Fs0 f31 isAsynch false #txt
Fs0 f31 isInnerRd true #txt
Fs0 f31 isDialog true #txt
Fs0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>show error </name>
        <nameStyle>11,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f31 206 532 36 24 20 -2 #rect
Fs0 f31 @|RichDialogIcon #fIcon
Fs0 f32 expr in #txt
Fs0 f32 118 544 206 544 #arcP
Fs0 f33 expr out #txt
Fs0 f33 206 555 115 609 #arcP
Fs0 f9 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f9 actionTable 'out=in;
' #txt
Fs0 f9 actionCode 'import ch.ivyteam.ivy.common.util.IvyFileUtils;

java.io.File selectedFile = new java.io.File(in.rootPath);
String selectedFilePath = selectedFile.getAbsolutePath();
String tmpString = in.rootPath;

// Change the rootPath to parent node if selected node is a file
if (selectedFile.isFile()) 
{
	in.rootPath = selectedFile.getParent();
}

Tree node = IvyFileUtils.setDefaultPath(in.rootPath, in.rootDir, in.onlyDirectories);
panel.fileTree.expandPath(panel.fileTree.getTreePath(node));
panel.fileTree.setSelectedTreeNode(node);
panel.fileTree.scrollPathToVisible(panel.fileTree.getTreePath(node));

// 20121130: LamHo added
// The purpose of this if-else block is to find the node which will be selected on the display tree
// That node corresponds to user selection
if (selectedFile.isFile())
{
	in.rootPath = tmpString;
	List<Tree> childNodes = node.getChildren();
	Tree selectedChild = null;
	
	for (Tree childNode : childNodes) 
	{
		if (childNode.info.equals("file")) 
		{
			java.io.File file = childNode.value as java.io.File;
			if (file.getAbsolutePath().equals(selectedFilePath)) 
			{
				selectedChild = childNode;
				break;
			}
		}		
	}
	if (selectedChild != null) 
	{
		panel.fileTree.setSelectedTreeNode(selectedChild);
		panel.fileTree.scrollPathToVisible(panel.fileTree.getTreePath(selectedChild));
	}
} 
else 
{
	panel.fileTree.setSelectedTreeNode(node);
	panel.fileTree.scrollPathToVisible(panel.fileTree.getTreePath(node));
}

out.isInitialized = true;' #txt
Fs0 f9 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set default path</name>
        <nameStyle>16,7,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f9 87 236 35 24 20 -2 #rect
Fs0 f9 @|RichDialogProcessStepIcon #fIcon
Fs0 f12 expr out #txt
Fs0 f12 104 212 103 236 #arcP
Fs0 f2 expr out #txt
Fs0 f2 103 260 103 291 #arcP
Fs0 f13 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is non virtual node selected</name>
        <nameStyle>28,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f13 90 370 28 28 14 0 #rect
Fs0 f13 @|AlternativeIcon #fIcon
Fs0 f14 expr out #txt
Fs0 f14 104 354 104 370 #arcP
Fs0 f15 expr in #txt
Fs0 f15 outCond '(panel.fileTree.getSelectedTreeNode() != null) && ( (java.io.File.listRoots().size() == 1) || (panel.fileTree.getSelectionRows().get(0) > 0 ) )' #txt
Fs0 f15 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f15 104 398 104 428 #arcP
Fs0 f26 expr in #txt
Fs0 f26 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f26 90 384 91 616 #arcP
Fs0 f26 1 48 384 #addKink
Fs0 f26 2 48 616 #addKink
Fs0 f26 1 0.5021551724137931 0 0 #arcLabel
Fs0 f34 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f34 actionTable 'out=in;
' #txt
Fs0 f34 actionCode 'Tree selectedTreeNode = panel.fileTree.getSelectedTreeNode();

if (selectedTreeNode.getParent() == null) { // select root node (My Computer)
	panel.buttonCreateDir.setEnabled(false);
	panel.buttonOk.setEnabled(false);
} else { // otherwise, enable again
	panel.buttonCreateDir.setEnabled(true);
	panel.buttonOk.setEnabled(true);
}

// the specified path does not exist
if(selectedTreeNode.value != null){
	String specifiedPath = selectedTreeNode.value.toString();
	if(!new java.io.File(specifiedPath).exists()){
		panel.buttonCreateDir.setEnabled(false);
		panel.buttonOk.setEnabled(false);
	}
}' #txt
Fs0 f34 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>change enable/disable property of 2 button</name>
        <nameStyle>42,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f34 358 412 36 24 20 -2 #rect
Fs0 f34 @|RichDialogProcessStepIcon #fIcon
Fs0 f35 guid 13D1464F26B80AF8 #txt
Fs0 f35 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f35 actionDecl 'ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData out;
' #txt
Fs0 f35 actionTable 'out=in;
' #txt
Fs0 f35 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>user select My Computer node</name>
        <nameStyle>28,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Fs0 f35 366 350 20 20 13 0 #rect
Fs0 f35 @|RichDialogProcessStartIcon #fIcon
Fs0 f36 type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
Fs0 f36 366 478 20 20 13 0 #rect
Fs0 f36 @|RichDialogProcessEndIcon #fIcon
Fs0 f37 expr out #txt
Fs0 f37 376 370 376 412 #arcP
Fs0 f38 expr out #txt
Fs0 f38 376 436 376 478 #arcP
>Proto Fs0 .type ch.ivyteam.ivy.rd.common.ServerFileBrowser.ServerFileBrowserData #txt
>Proto Fs0 .processKind RICH_DIALOG #txt
>Proto Fs0 -8 -8 16 16 16 26 #rect
>Proto Fs0 '' #fIcon
Fs0 f0 mainOut f4 tail #connect
Fs0 f4 head f3 mainIn #connect
Fs0 f10 ao f11 tail #connect
Fs0 f11 head f5 @CG|ai #connect
Fs0 f5 mainOut f7 tail #connect
Fs0 f7 head f6 mainIn #connect
Fs0 f8 mainOut f17 tail #connect
Fs0 f17 head f16 mainIn #connect
Fs0 f18 mainOut f19 tail #connect
Fs0 f19 head f3 mainIn #connect
Fs0 f20 mainOut f21 tail #connect
Fs0 f21 head f16 mainIn #connect
Fs0 f23 mainOut f27 tail #connect
Fs0 f27 head f24 mainIn #connect
Fs0 f24 mainOut f30 tail #connect
Fs0 f30 head f29 in #connect
Fs0 f29 out f28 tail #connect
Fs0 f28 head f25 mainIn #connect
Fs0 f29 out f32 tail #connect
Fs0 f32 head f31 mainIn #connect
Fs0 f31 mainOut f33 tail #connect
Fs0 f33 head f25 mainIn #connect
Fs0 f3 mainOut f12 tail #connect
Fs0 f12 head f9 mainIn #connect
Fs0 f9 mainOut f2 tail #connect
Fs0 f2 head f1 mainIn #connect
Fs0 f22 mainOut f14 tail #connect
Fs0 f14 head f13 in #connect
Fs0 f13 out f15 tail #connect
Fs0 f15 head f23 mainIn #connect
Fs0 f13 out f26 tail #connect
Fs0 f26 head f25 mainIn #connect
Fs0 f35 mainOut f37 tail #connect
Fs0 f37 head f34 mainIn #connect
Fs0 f34 mainOut f38 tail #connect
Fs0 f38 head f36 mainIn #connect
