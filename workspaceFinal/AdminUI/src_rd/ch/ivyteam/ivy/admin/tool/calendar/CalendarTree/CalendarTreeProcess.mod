[Ivy]
[>Created: Tue Feb 28 14:08:32 CET 2012]
133F8D7F435FFCCE 3.17 #module
>Proto >Proto Collection #zClass
Cs0 CalendarTreeProcess Big #zClass
Cs0 RD #cInfo
Cs0 #process
Cs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Cs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Cs0 @TextInP .resExport .resExport #zField
Cs0 @TextInP .type .type #zField
Cs0 @TextInP .processKind .processKind #zField
Cs0 @AnnotationInP-0n ai ai #zField
Cs0 @TextInP .xml .xml #zField
Cs0 @TextInP .responsibility .responsibility #zField
Cs0 @RichDialogInitStart f0 '' #zField
Cs0 @RichDialogProcessEnd f12 '' #zField
Cs0 @RichDialogProcessStart f15 '' #zField
Cs0 @RichDialogFireEvent f17 '' #zField
Cs0 @RichDialogProcessStart f3 '' #zField
Cs0 @RichDialogProcessEnd f6 '' #zField
Cs0 @RichDialog f8 '' #zField
Cs0 @PushWFArc f9 '' #zField
Cs0 @RichDialogProcessStart f10 '' #zField
Cs0 @Alternative f14 '' #zField
Cs0 @PushWFArc f20 '' #zField
Cs0 @PushWFArc f7 '' #zField
Cs0 @RichDialogProcessStep f21 '' #zField
Cs0 @PushWFArc f22 '' #zField
Cs0 @RichDialogProcessStart f24 '' #zField
Cs0 @RichDialogProcessStep f25 '' #zField
Cs0 @Alternative f27 '' #zField
Cs0 @PushWFArc f29 '' #zField
Cs0 @RichDialogProcessEnd f30 '' #zField
Cs0 @PushWFArc f31 '' #zField
Cs0 @RichDialogProcessStep f34 '' #zField
Cs0 @PushWFArc f16 '' #zField
Cs0 @PushWFArc f5 '' #zField
Cs0 @RichDialogProcessStep f18 '' #zField
Cs0 @PushWFArc f37 '' #zField
Cs0 @PushWFArc f11 '' #zField
Cs0 @PushWFArc f13 '' #zField
Cs0 @PushWFArc f23 '' #zField
Cs0 @RichDialogInitStart f1 '' #zField
Cs0 @RichDialogProcessEnd f2 '' #zField
Cs0 @PushWFArc f4 '' #zField
Cs0 @RichDialogProcessStep f38 '' #zField
Cs0 @PushWFArc f39 '' #zField
Cs0 @PushWFArc f33 '' #zField
Cs0 @RichDialog f19 '' #zField
Cs0 @Alternative f26 '' #zField
Cs0 @PushWFArc f35 '' #zField
Cs0 @PushWFArc f36 '' #zField
Cs0 @PushWFArc f40 '' #zField
Cs0 @Alternative f41 '' #zField
Cs0 @PushWFArc f42 '' #zField
Cs0 @PushWFArc f32 '' #zField
Cs0 @PushWFArc f28 '' #zField
Cs0 @PushWFArc f43 '' #zField
>Proto Cs0 Cs0 CalendarTreeProcess #zField
Cs0 f0 guid 133F8D7F452CB666 #txt
Cs0 f0 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f0 method start(ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings) #txt
Cs0 f0 disableUIEvents true #txt
Cs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.calendar.IBusinessCalendarSettings calendarSettings> param = methodEvent.getInputArguments();
' #txt
Cs0 f0 inParameterMapAction 'out.businessCalendarSettings=param.calendarSettings;
' #txt
Cs0 f0 outParameterDecl '<> result;
' #txt
Cs0 f0 embeddedRdInitializations '* ' #txt
Cs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IBusinessCalendarSettings)</name>
        <nameStyle>32,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f0 270 22 20 20 13 0 #rect
Cs0 f0 @|RichDialogInitStartIcon #fIcon
Cs0 f12 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f12 726 534 20 20 13 0 #rect
Cs0 f12 @|RichDialogProcessEndIcon #fIcon
Cs0 f15 guid 133F9C11E4E49835 #txt
Cs0 f15 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f15 actionTable 'out=in;
' #txt
Cs0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>CalendarSelected</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f15 1262 22 20 20 17 -6 #rect
Cs0 f15 @|RichDialogProcessStartIcon #fIcon
Cs0 f17 actionDecl 'ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration calendar;
' #txt
Cs0 f17 actionTable 'calendar=in.selectedCalendar.value as ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;
' #txt
Cs0 f17 actionCode panel.fireCalendarSelected(calendar); #txt
Cs0 f17 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f17 fireEvent CalendarSelected(ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration) #txt
Cs0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>send Calendar change Event</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f17 718 452 36 24 -188 -8 #rect
Cs0 f17 @|RichDialogFireEventIcon #fIcon
Cs0 f3 guid 133FA84BBB2AAD82 #txt
Cs0 f3 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f3 actionTable 'out=in;
' #txt
Cs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>newCalendar</name>
        <nameStyle>11,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f3 526 22 20 20 13 0 #rect
Cs0 f3 @|RichDialogProcessStartIcon #fIcon
Cs0 f6 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f6 526 230 20 20 13 0 #rect
Cs0 f6 @|RichDialogProcessEndIcon #fIcon
Cs0 f8 targetWindow NEW:card: #txt
Cs0 f8 targetDisplay TOP #txt
Cs0 f8 richDialogId ch.ivyteam.ivy.commondialogs.SingleLineInputDialog #txt
Cs0 f8 startMethod askInput(String,String,List<String>,String) #txt
Cs0 f8 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f8 requestActionDecl '<String question, String defaultValue, List<String> buttons, String defaultButton> param;' #txt
Cs0 f8 requestMappingAction 'param.question=ivy.cms.co("/Dialogs/application/calendar/calendarName");
param.buttons=[ivy.cms.co("/Dialogs/general/ok"), ivy.cms.co("/Dialogs/general/cancel")];
param.defaultButton=ivy.cms.co("/Dialogs/general/ok");
' #txt
Cs0 f8 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f8 responseMappingAction 'out=in;
out.newCalendarCancel=result.pressedButton !=ivy.cms.co("/Dialogs/general/ok");
out.newCalendarIdentifier=result.inputString;
' #txt
Cs0 f8 windowConfiguration '{/title "<%=ivy.cms.co(\"/Dialogs/application/calendar/addCalendar\")%>"/width 0 /height 0 /centered true /resizable false /maximized false /close_after_last_rd true }' #txt
Cs0 f8 isAsynch false #txt
Cs0 f8 isInnerRd true #txt
Cs0 f8 userContext '* ' #txt
Cs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>ask for calendar name</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f8 518 76 36 24 25 -7 #rect
Cs0 f8 @|RichDialogIcon #fIcon
Cs0 f9 expr out #txt
Cs0 f9 536 42 536 76 #arcP
Cs0 f10 guid 133FA894E8BBCBCF #txt
Cs0 f10 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f10 actionTable 'out=in;
' #txt
Cs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>deleteCalendar</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f10 878 22 20 20 13 0 #rect
Cs0 f10 @|RichDialogProcessStartIcon #fIcon
Cs0 f14 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f14 522 154 28 28 14 0 #rect
Cs0 f14 @|AlternativeIcon #fIcon
Cs0 f20 expr out #txt
Cs0 f20 536 100 536 154 #arcP
Cs0 f7 expr in #txt
Cs0 f7 outCond in.newCalendarCancel #txt
Cs0 f7 536 182 536 230 #arcP
Cs0 f21 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f21 actionTable 'out=in;
' #txt
Cs0 f21 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;

IBusinessCalendarConfiguration newCalendar = in.businessCalendarSettings.createBusinessCalendarConfiguration(in.newCalendarIdentifier);
if (in.selectedCalendar.value is initialized){
	newCalendar.setParent(in.selectedCalendar.value as IBusinessCalendarConfiguration);
}
in.businessCalendarSettings.saveBusinessCalendarConfiguration(newCalendar);
in.calendars = in.businessCalendarSettings.getAllBusinessCalendarConfigurations();

for (Tree tree : in.calendars.getAllDeepChildren()){
	if (tree.value.equals(newCalendar)){
		in.selectedCalendar = tree;
		break;
	}
}

' #txt
Cs0 f21 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>create Calendar</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f21 582 220 36 24 23 -8 #rect
Cs0 f21 @|RichDialogProcessStepIcon #fIcon
Cs0 f22 expr in #txt
Cs0 f22 543 175 588 220 #arcP
Cs0 f24 guid 133FAAE7FB180541 #txt
Cs0 f24 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f24 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f24 actionTable 'out=in;
' #txt
Cs0 f24 actionCode 'import com.ulcjava.base.application.event.KeyEvent;
KeyEvent ev = event as KeyEvent;
in.treeKeyPressed = ev.getKeyChar();' #txt
Cs0 f24 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>keyPressedOnTree</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f24 1062 22 20 20 13 0 #rect
Cs0 f24 @|RichDialogProcessStartIcon #fIcon
Cs0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f25 actionTable 'out=in;
' #txt
Cs0 f25 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;

IBusinessCalendarConfiguration calendarToDelete = in.selectedCalendar.value as IBusinessCalendarConfiguration;
in.businessCalendarSettings.deleteBusinessCalendarConfiguration(calendarToDelete);
in.calendars = in.businessCalendarSettings.getAllBusinessCalendarConfigurations();

if (calendarToDelete.parent.equals(in.calendars.value))
{
	in.selectedCalendar = in.calendars;
}
else
{
	for (Tree tree : in.calendars.getAllDeepChildren())
	{
		if (tree.value.equals(calendarToDelete.parent))
		{
			in.selectedCalendar = tree;
			break;
		}
	}
}' #txt
Cs0 f25 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>delete Calendar</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f25 870 380 36 24 25 -4 #rect
Cs0 f25 @|RichDialogProcessStepIcon #fIcon
Cs0 f27 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f27 1058 114 28 28 14 0 #rect
Cs0 f27 @|AlternativeIcon #fIcon
Cs0 f29 expr out #txt
Cs0 f29 1072 42 1072 114 #arcP
Cs0 f30 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f30 1062 198 20 20 13 0 #rect
Cs0 f30 @|RichDialogProcessEndIcon #fIcon
Cs0 f31 expr in #txt
Cs0 f31 1072 142 1072 198 #arcP
Cs0 f34 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f34 actionTable 'out=in;
' #txt
Cs0 f34 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;
panel.Tree.setTreeData(in.calendars);
panel.Tree.expandAll();' #txt
Cs0 f34 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f34 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>expand Tree</name>
        <nameStyle>11,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f34 718 380 36 24 24 -6 #rect
Cs0 f34 @|RichDialogProcessStepIcon #fIcon
Cs0 f16 expr out #txt
Cs0 f16 736 404 736 452 #arcP
Cs0 f5 expr out #txt
Cs0 f5 736 476 736 534 #arcP
Cs0 f18 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f18 actionTable 'out=in;
' #txt
Cs0 f18 actionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;

in.calendars = in.businessCalendarSettings.getAllBusinessCalendarConfigurations();
in.selectedCalendar = in.calendars;' #txt
Cs0 f18 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f18 262 148 36 24 20 -2 #rect
Cs0 f18 @|RichDialogProcessStepIcon #fIcon
Cs0 f37 expr out #txt
Cs0 f37 280 172 718 392 #arcP
Cs0 f37 1 280 392 #addKink
Cs0 f37 1 0.26806083650190116 0 0 #arcLabel
Cs0 f11 expr out #txt
Cs0 f11 610 244 726 380 #arcP
Cs0 f11 0 0.07615647463618114 0 0 #arcLabel
Cs0 f13 expr out #txt
Cs0 f13 870 392 754 392 #arcP
Cs0 f23 expr out #txt
Cs0 f23 280 42 280 148 #arcP
Cs0 f1 guid 1343144DA3CA53DE #txt
Cs0 f1 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f1 method start() #txt
Cs0 f1 disableUIEvents true #txt
Cs0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Cs0 f1 outParameterDecl '<> result;
' #txt
Cs0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Cs0 f1 62 22 20 20 13 0 #rect
Cs0 f1 @|RichDialogInitStartIcon #fIcon
Cs0 f2 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f2 62 142 20 20 13 0 #rect
Cs0 f2 @|RichDialogProcessEndIcon #fIcon
Cs0 f4 expr out #txt
Cs0 f4 72 42 72 142 #arcP
Cs0 f38 actionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f38 actionTable 'out=in;
' #txt
Cs0 f38 actionCode 'if (in.selectedCalendar.#value == null)
{
	in.selectedCalendar = in.calendars; //default calendar
}' #txt
Cs0 f38 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f38 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDefault if empty selection</name>
        <nameStyle>29,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f38 1254 452 36 24 20 -2 #rect
Cs0 f38 @|RichDialogProcessStepIcon #fIcon
Cs0 f39 expr out #txt
Cs0 f39 1272 42 1272 452 #arcP
Cs0 f39 0 0.8325581395348838 0 0 #arcLabel
Cs0 f33 expr out #txt
Cs0 f33 1254 464 754 464 #arcP
Cs0 f19 targetWindow NEW:card: #txt
Cs0 f19 targetDisplay TOP #txt
Cs0 f19 richDialogId ch.ivyteam.ivy.commondialogs.QuestionDialog #txt
Cs0 f19 startMethod askQuestion(String,String,List<String>) #txt
Cs0 f19 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f19 requestActionDecl '<String icon, String question, List<String> buttons> param;' #txt
Cs0 f19 requestMappingAction 'param.buttons=["yes", "no"];
' #txt
Cs0 f19 requestActionCode 'import ch.ivyteam.ivy.application.calendar.IBusinessCalendarConfiguration;

IBusinessCalendarConfiguration calendarToDelete = in.selectedCalendar.value as IBusinessCalendarConfiguration;
String calendarName = calendarToDelete.getName();

param.question = "Do you want to delete the calendar ''"+calendarName+"''?";' #txt
Cs0 f19 responseActionDecl 'ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData out;
' #txt
Cs0 f19 responseMappingAction 'out=in;
out.buttonPressed=result.pressedButton;
' #txt
Cs0 f19 windowConfiguration '{/title "Delete calendar?"/width 0 /height 0 /centered true /resizable true /maximized false /close_after_last_rd true }' #txt
Cs0 f19 isAsynch false #txt
Cs0 f19 isInnerRd true #txt
Cs0 f19 userContext '* ' #txt
Cs0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>confirm delete</name>
        <nameStyle>14,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f19 870 220 36 24 -99 -10 #rect
Cs0 f19 @|RichDialogIcon #fIcon
Cs0 f26 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>confirmed?</name>
        <nameStyle>10,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f26 874 290 28 28 -69 -25 #rect
Cs0 f26 @|AlternativeIcon #fIcon
Cs0 f35 expr out #txt
Cs0 f35 888 244 888 290 #arcP
Cs0 f36 expr in #txt
Cs0 f36 outCond in.buttonPressed=="yes" #txt
Cs0 f36 888 318 888 380 #arcP
Cs0 f40 expr in #txt
Cs0 f40 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>abort delete</name>
        <nameStyle>12,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f40 902 304 1072 218 #arcP
Cs0 f40 1 1072 304 #addKink
Cs0 f40 0 0.5 0 -11 #arcLabel
Cs0 f41 type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
Cs0 f41 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>isDefault
OrCalender
WithChilds?</name>
        <nameStyle>32,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f41 874 114 28 28 -73 -55 #rect
Cs0 f41 @|AlternativeIcon #fIcon
Cs0 f42 expr in #txt
Cs0 f42 outCond 'in.treeKeyPressed.hashCode() == com.ulcjava.base.application.event.KeyEvent.VK_DELETE' #txt
Cs0 f42 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is delete key pressed</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f42 1058 128 902 128 #arcP
Cs0 f42 0 0.41407752251796376 0 -14 #arcLabel
Cs0 f32 expr out #txt
Cs0 f32 888 42 888 114 #arcP
Cs0 f28 expr in #txt
Cs0 f28 outCond '(in.selectedCalendar.getChildCount() == 0 && in.selectedCalendar.getParent() != null)' #txt
Cs0 f28 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>   leaf 
calendar</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f28 888 142 888 220 #arcP
Cs0 f28 0 0.44871794871794873 -21 0 #arcLabel
Cs0 f43 expr in #txt
Cs0 f43 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>default or with childs</name>
        <nameStyle>22,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Cs0 f43 893 137 1062 208 #arcP
Cs0 f43 1 928 208 #addKink
Cs0 f43 1 0.5266666666666666 1 -10 #arcLabel
>Proto Cs0 .ui2RdDataAction 'out.selectedCalendar=panel.Tree.selectedTreeNode;
' #txt
>Proto Cs0 .rdData2UIAction 'panel.deleteButton.enabled=in.selectedCalendar.getChildCount() == 0 && in.selectedCalendar.getParent() != null;
panel.deleteCalendarItem.enabled=in.selectedCalendar.getChildCount() == 0 && in.selectedCalendar.getParent() != null;
panel.Tree.treeData=in.calendars;
panel.Tree.selectedTreeNode=in.selectedCalendar;
' #txt
>Proto Cs0 .type ch.ivyteam.ivy.admin.tool.calendar.CalendarTree.CalendarTreeData #txt
>Proto Cs0 .processKind RICH_DIALOG #txt
>Proto Cs0 -8 -8 16 16 16 26 #rect
>Proto Cs0 '' #fIcon
Cs0 f3 mainOut f9 tail #connect
Cs0 f9 head f8 mainIn #connect
Cs0 f8 mainOut f20 tail #connect
Cs0 f20 head f14 in #connect
Cs0 f14 out f7 tail #connect
Cs0 f7 head f6 mainIn #connect
Cs0 f14 out f22 tail #connect
Cs0 f22 head f21 mainIn #connect
Cs0 f24 mainOut f29 tail #connect
Cs0 f29 head f27 in #connect
Cs0 f31 head f30 mainIn #connect
Cs0 f34 mainOut f16 tail #connect
Cs0 f16 head f17 mainIn #connect
Cs0 f17 mainOut f5 tail #connect
Cs0 f5 head f12 mainIn #connect
Cs0 f18 mainOut f37 tail #connect
Cs0 f37 head f34 mainIn #connect
Cs0 f21 mainOut f11 tail #connect
Cs0 f11 head f34 mainIn #connect
Cs0 f25 mainOut f13 tail #connect
Cs0 f13 head f34 mainIn #connect
Cs0 f0 mainOut f23 tail #connect
Cs0 f23 head f18 mainIn #connect
Cs0 f1 mainOut f4 tail #connect
Cs0 f4 head f2 mainIn #connect
Cs0 f15 mainOut f39 tail #connect
Cs0 f39 head f38 mainIn #connect
Cs0 f38 mainOut f33 tail #connect
Cs0 f33 head f17 mainIn #connect
Cs0 f19 mainOut f35 tail #connect
Cs0 f35 head f26 in #connect
Cs0 f26 out f36 tail #connect
Cs0 f36 head f25 mainIn #connect
Cs0 f26 out f40 tail #connect
Cs0 f40 head f30 mainIn #connect
Cs0 f27 out f42 tail #connect
Cs0 f42 head f41 in #connect
Cs0 f27 out f31 tail #connect
Cs0 f10 mainOut f32 tail #connect
Cs0 f32 head f41 in #connect
Cs0 f41 out f28 tail #connect
Cs0 f28 head f19 mainIn #connect
Cs0 f41 out f43 tail #connect
Cs0 f43 head f30 mainIn #connect
