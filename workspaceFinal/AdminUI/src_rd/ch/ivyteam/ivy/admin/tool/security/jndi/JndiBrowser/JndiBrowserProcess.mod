[Ivy]
[>Created: Fri Jan 23 10:53:41 CET 2015]
1178CE8F3CC22296 3.17 #module
>Proto >Proto Collection #zClass
Js0 JndiBrowserProcess Big #zClass
Js0 RD #cInfo
Js0 #process
Js0 @MessageFlowInP-0n messageIn messageIn #zField
Js0 @MessageFlowOutP-0n messageOut messageOut #zField
Js0 @TextInP .xml .xml #zField
Js0 @TextInP .responsibility .responsibility #zField
Js0 @AnnotationInP-0n ai ai #zField
Js0 @TextInP .resExport .resExport #zField
Js0 @TextInP .type .type #zField
Js0 @TextInP .processKind .processKind #zField
Js0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Js0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Js0 @RichDialogInitStart f0 '' #zField
Js0 @RichDialogProcessEnd f1 '' #zField
Js0 @RichDialogProcessStep f3 '' #zField
Js0 @PushWFArc f4 '' #zField
Js0 @RichDialogProcessStart f5 '' #zField
Js0 @RichDialogProcessStart f6 '' #zField
Js0 @RichDialogProcessEnd f7 '' #zField
Js0 @RichDialogProcessEnd f8 '' #zField
Js0 @RichDialogProcessStep f11 '' #zField
Js0 @PushWFArc f12 '' #zField
Js0 @PushWFArc f9 '' #zField
Js0 @RichDialogProcessStep f13 '' #zField
Js0 @PushWFArc f14 '' #zField
Js0 @PushWFArc f10 '' #zField
Js0 @RichDialogProcessStart f15 '' #zField
Js0 @RichDialogProcessStart f16 '' #zField
Js0 @RichDialogEnd f17 '' #zField
Js0 @PushWFArc f18 '' #zField
Js0 @RichDialogEnd f19 '' #zField
Js0 @RichDialogProcessStep f21 '' #zField
Js0 @PushWFArc f22 '' #zField
Js0 @PushWFArc f20 '' #zField
Js0 @RichDialogInitStart f23 '' #zField
Js0 @PushWFArc f24 '' #zField
Js0 @RichDialogProcessStep f25 '' #zField
Js0 @PushWFArc f26 '' #zField
Js0 @RichDialogProcessStep f27 '' #zField
Js0 @PushWFArc f28 '' #zField
Js0 @CallSub f34 '' #zField
Js0 @PushWFArc f35 '' #zField
Js0 @PushWFArc f2 '' #zField
>Proto Js0 Js0 JndiBrowserProcess #zField
Js0 f0 guid 1178CF14101F145A #txt
Js0 f0 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f0 method start(ch.ivyteam.naming.JndiConfig) #txt
Js0 f0 disableUIEvents false #txt
Js0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.naming.JndiConfig jndiConfig> param = methodEvent.getInputArguments();
' #txt
Js0 f0 inParameterMapAction 'out.jndiConfig=param.jndiConfig;
' #txt
Js0 f0 outParameterDecl '<java.lang.String choosenContext> result;
' #txt
Js0 f0 outParameterMapAction 'result.choosenContext=in.result;
' #txt
Js0 f0 embeddedRdInitializations '* ' #txt
Js0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(JndiConfig)</name>
        <nameStyle>17,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f0 46 46 20 20 13 0 #rect
Js0 f0 @|RichDialogInitStartIcon #fIcon
Js0 f1 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f1 43 403 26 26 14 0 #rect
Js0 f1 @|RichDialogProcessEndIcon #fIcon
Js0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f3 actionTable 'out=in;
' #txt
Js0 f3 actionCode 'import ch.ivyteam.naming.JndiUtil;
import javax.naming.directory.DirContext;
import javax.naming.NamingEnumeration;
import javax.naming.Name;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;

Attributes attributes;
Attribute attribute;
List<String> values;

in.jndiContext = JndiUtil.openLdapContext(in.jndiConfig);
Name name = in.jndiConfig.getDefaultContextName();
if (name.size()==0)
{
  in.jndiTree = new Tree(name);
  attributes = in.jndiContext.getAttributes(name); 
  attribute = attributes.get("namingContexts");
  if (attribute.size()>0)
  {
     for (int pos = 0; pos < attribute.size(); pos++)
     {
		   Name name = in.jndiContext.getNameParser(attribute.get(pos).toString()).parse(attribute.get(pos).toString());
       in.jndiTree.add(
				new Tree(name, panel.getIcon(in.jndiContext, name)));
     }
  }
  panel.jndiBrowserTree.setRootVisible(false);
  if (in.jndiTree.getChildCount() > 0)	
	{	
		in.workTree= in.jndiTree.getChildAt(0);
	}
	in.workTree = in.jndiTree;
}
else
{
  in.jndiTree = new   Tree(name, panel.getIcon(in.jndiContext, name));
  in.workTree = in.jndiTree;
}


' #txt
Js0 f3 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setup tree</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f3 38 132 36 24 20 -2 #rect
Js0 f3 @|RichDialogProcessStepIcon #fIcon
Js0 f4 expr out #txt
Js0 f4 56 66 56 132 #arcP
Js0 f5 guid 1178D071F626B04F #txt
Js0 f5 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f5 actionTable 'out=in;
' #txt
Js0 f5 actionCode 'import ch.ivyteam.ivy.richdialog.component.event.TreeLoadEvent;

in.workTree = (event as TreeLoadEvent).getTreeNode();' #txt
Js0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>loadChildren</name>
        <nameStyle>12,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f5 358 54 20 20 13 0 #rect
Js0 f5 @|RichDialogProcessStartIcon #fIcon
Js0 f6 guid 1178D072732644B4 #txt
Js0 f6 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f6 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f6 actionTable 'out=in;
out.workTree=panel.jndiBrowserTree.getSelectedTreeNode();
' #txt
Js0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>selectNode</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f6 534 54 20 20 13 0 #rect
Js0 f6 @|RichDialogProcessStartIcon #fIcon
Js0 f7 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f7 531 267 26 26 14 0 #rect
Js0 f7 @|RichDialogProcessEndIcon #fIcon
Js0 f8 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f8 355 267 26 26 14 0 #rect
Js0 f8 @|RichDialogProcessEndIcon #fIcon
Js0 f11 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f11 actionTable 'out=in;
' #txt
Js0 f11 actionCode 'import javax.naming.Name;

if (in.workTree.value instanceof Name)
{
	panel.loadChildren(in.jndiContext, in.workTree);
}' #txt
Js0 f11 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Js0 f11 350 140 36 24 20 -2 #rect
Js0 f11 @|RichDialogProcessStepIcon #fIcon
Js0 f12 expr out #txt
Js0 f12 368 74 368 140 #arcP
Js0 f9 expr out #txt
Js0 f9 368 164 368 267 #arcP
Js0 f13 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f13 actionTable 'out=in;
' #txt
Js0 f13 actionCode 'import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.Name;

NamingEnumeration enum;
Attribute attribute;
List<String> values;

if (in.workTree.value instanceof Name)
{
  in.jndiAttributes.clear();
	try
	{
	  enum = in.jndiContext.getAttributes(in.workTree.value as Name).getAll();
	  while (enum.hasMoreElements())
	  {
	    attribute = enum.nextElement() as Attribute;
	    for (int pos = 0; pos < attribute.size(); pos++)
	    {
	      values = [attribute.getID(), attribute.get(pos).toString()];
	      in.jndiAttributes.add(values);
	    }
	  }
	  enum.close();	
		in.exception = null;
	}
	catch(Exception e)
	{
		in.exception = e;
	}
}
' #txt
Js0 f13 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Js0 f13 526 140 36 24 20 -2 #rect
Js0 f13 @|RichDialogProcessStepIcon #fIcon
Js0 f14 expr out #txt
Js0 f14 544 74 544 140 #arcP
Js0 f10 expr out #txt
Js0 f10 544 164 544 267 #arcP
Js0 f15 guid 1178D6DEAA761B64 #txt
Js0 f15 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f15 actionTable 'out=in;
' #txt
Js0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ok</name>
        <nameStyle>2,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f15 358 374 20 20 13 0 #rect
Js0 f15 @|RichDialogProcessStartIcon #fIcon
Js0 f16 guid 1178D6DFAE023C12 #txt
Js0 f16 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f16 actionTable 'out=in;
' #txt
Js0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>cancel</name>
        <nameStyle>6,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f16 534 374 20 20 13 0 #rect
Js0 f16 @|RichDialogProcessStartIcon #fIcon
Js0 f17 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f17 guid 1178D6E54C793CD4 #txt
Js0 f17 531 459 26 26 14 0 #rect
Js0 f17 @|RichDialogEndIcon #fIcon
Js0 f18 expr out #txt
Js0 f18 544 394 544 459 #arcP
Js0 f19 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f19 guid 01178D6E604445F7 #txt
Js0 f19 355 539 26 26 14 0 #rect
Js0 f19 @|RichDialogEndIcon #fIcon
Js0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f21 actionTable 'out=in;
' #txt
Js0 f21 actionCode 'import javax.naming.Name;

if ((panel.jndiBrowserTree.getSelectedTreeNode() != null)&&(panel.jndiBrowserTree.getSelectedTreeNode().value instanceof Name))
{
  in.result= String.valueOf(panel.jndiBrowserTree.getSelectedTreeNode().value as Name);
}' #txt
Js0 f21 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language/>
</elementInfo>
' #txt
Js0 f21 350 452 36 24 20 -2 #rect
Js0 f21 @|RichDialogProcessStepIcon #fIcon
Js0 f22 expr out #txt
Js0 f22 368 394 368 452 #arcP
Js0 f20 expr out #txt
Js0 f20 368 476 368 539 #arcP
Js0 f23 guid 12E37F2E5CC2EDC9 #txt
Js0 f23 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f23 method start(ch.ivyteam.naming.JndiConfig,String) #txt
Js0 f23 disableUIEvents true #txt
Js0 f23 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.naming.JndiConfig jndiConfig,java.lang.String contextToSelect> param = methodEvent.getInputArguments();
' #txt
Js0 f23 inParameterMapAction 'out.jndiConfig=param.jndiConfig;
out.nameToSelect=param.contextToSelect;
' #txt
Js0 f23 outParameterDecl '<java.lang.String choosenContext> result;
' #txt
Js0 f23 outParameterMapAction 'result.choosenContext=in.result;
' #txt
Js0 f23 embeddedRdInitializations '* ' #txt
Js0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(JndiConfig,String)</name>
        <nameStyle>24,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f23 166 46 20 20 13 0 #rect
Js0 f23 @|RichDialogInitStartIcon #fIcon
Js0 f24 expr out #txt
Js0 f24 167 61 72 132 #arcP
Js0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f25 actionTable 'out=in;
' #txt
Js0 f25 actionCode 'import javax.naming.Name;

// tries to select the tree node that represents 
// the name that has to be selected
in.workTree = in.jndiTree;

if (!in.nameToSelect.trim().isEmpty()) 
{
	in.exception = null;
	try
	{
		Name name = in.jndiContext.getNameParser(in.nameToSelect).parse(in.nameToSelect);
		
		Boolean found = true;
		Name treeName;
		if (in.jndiTree.value instanceof Name)
		{
			treeName = in.jndiTree.value as Name;
			found = name.startsWith(treeName);
		}
		Tree tree = in.jndiTree;
	
		while (found)
		{
			found = false;
			if (#treeName != null)
			{
				panel.loadChildren(in.jndiContext, tree);
			}
			for (Tree child : tree.getChildren())
			{
					treeName = child.value as Name;
					if (name.equals(treeName))
					{
						tree = child;
						found = false;
						break;
				  }
					else if (name.startsWith(treeName))
					{
						tree = child;
						found = true;
						break;
					}	
			}			
		}	
		panel.jndiBrowserTree.treeData = in.jndiTree;
		panel.jndiBrowserTree.selectedTreeNode = tree;
		panel.jndiBrowserTree.scrollPathToVisible(panel.jndiBrowserTree.getSelectionPath());
		in.workTree= tree;
	}	
	catch(Exception e)
	{
		in.exception = e;
	}
}	' #txt
Js0 f25 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>select node to select</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f25 38 196 36 24 20 -2 #rect
Js0 f25 @|RichDialogProcessStepIcon #fIcon
Js0 f26 expr out #txt
Js0 f26 56 156 56 196 #arcP
Js0 f27 actionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f27 actionTable 'out=in;
' #txt
Js0 f27 actionCode 'import javax.naming.NamingException;
import javax.naming.NamingEnumeration;
import javax.naming.Name;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;

Name name = in.workTree.value as Name;

in.exception = null;
try{
	NamingEnumeration enum = in.jndiContext.getAttributes(name).getAll();
	while (enum.hasMoreElements())
	{
	  Attribute attribute = enum.nextElement() as Attribute;
	  for (int pos = 0; pos < attribute.size(); pos++)
	  {
	    List<String> values = [attribute.getID(), attribute.get(pos).toString()];
	    in.jndiAttributes.add(values);
	  }
	}
	enum.close();
}
catch(NamingException e)
{
	in.exception = e;
}' #txt
Js0 f27 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>read attributes</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Js0 f27 38 268 36 24 20 -2 #rect
Js0 f27 @|RichDialogProcessStepIcon #fIcon
Js0 f28 expr out #txt
Js0 f28 56 220 56 268 #arcP
Js0 f34 type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
Js0 f34 processCall 'Functional Processes/showError:showError(java.lang.Exception)' #txt
Js0 f34 doCall true #txt
Js0 f34 requestActionDecl '<java.lang.Exception exception> param;
' #txt
Js0 f34 requestMappingAction 'param.exception=in.exception;
' #txt
Js0 f34 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData out;
' #txt
Js0 f34 responseMappingAction 'out=in;
' #txt
Js0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
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
Js0 f34 38 340 36 24 20 -2 #rect
Js0 f34 @|CallSubIcon #fIcon
Js0 f35 expr out #txt
Js0 f35 56 292 56 340 #arcP
Js0 f2 expr out #txt
Js0 f2 56 364 56 403 #arcP
>Proto Js0 .type ch.ivyteam.ivy.admin.tool.security.jndi.JndiBrowser.JndiBrowserData #txt
>Proto Js0 .processKind RICH_DIALOG #txt
>Proto Js0 .rdData2UIAction 'panel.jndiAttributeTable.listData=in.jndiAttributes;
panel.jndiBrowserTree.treeData=in.jndiTree;
panel.jndiBrowserTree.treeData=in.jndiTree;
' #txt
>Proto Js0 -8 -8 16 16 16 26 #rect
>Proto Js0 '' #fIcon
Js0 f0 mainOut f4 tail #connect
Js0 f4 head f3 mainIn #connect
Js0 f5 mainOut f12 tail #connect
Js0 f12 head f11 mainIn #connect
Js0 f11 mainOut f9 tail #connect
Js0 f9 head f8 mainIn #connect
Js0 f6 mainOut f14 tail #connect
Js0 f14 head f13 mainIn #connect
Js0 f13 mainOut f10 tail #connect
Js0 f10 head f7 mainIn #connect
Js0 f16 mainOut f18 tail #connect
Js0 f18 head f17 mainIn #connect
Js0 f15 mainOut f22 tail #connect
Js0 f22 head f21 mainIn #connect
Js0 f21 mainOut f20 tail #connect
Js0 f20 head f19 mainIn #connect
Js0 f23 mainOut f24 tail #connect
Js0 f24 head f3 mainIn #connect
Js0 f3 mainOut f26 tail #connect
Js0 f26 head f25 mainIn #connect
Js0 f25 mainOut f28 tail #connect
Js0 f28 head f27 mainIn #connect
Js0 f27 mainOut f35 tail #connect
Js0 f35 head f34 mainIn #connect
Js0 f34 mainOut f2 tail #connect
Js0 f2 head f1 mainIn #connect
