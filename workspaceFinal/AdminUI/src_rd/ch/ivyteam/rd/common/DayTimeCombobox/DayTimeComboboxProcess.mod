[Ivy]
[>Created: Tue Jun 18 16:09:02 ICT 2013]
13F37E5B80569DC4 3.17 #module
>Proto >Proto Collection #zClass
Ds0 DayTimeComboboxProcess Big #zClass
Ds0 RD #cInfo
Ds0 #process
Ds0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ds0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ds0 @TextInP .resExport .resExport #zField
Ds0 @TextInP .type .type #zField
Ds0 @TextInP .processKind .processKind #zField
Ds0 @AnnotationInP-0n ai ai #zField
Ds0 @TextInP .xml .xml #zField
Ds0 @TextInP .responsibility .responsibility #zField
Ds0 @RichDialogInitStart f0 '' #zField
Ds0 @RichDialogProcessEnd f1 '' #zField
Ds0 @RichDialogMethodStart f3 '' #zField
Ds0 @RichDialogProcessEnd f4 '' #zField
Ds0 @PushWFArc f5 '' #zField
Ds0 @RichDialogMethodStart f6 '' #zField
Ds0 @RichDialogProcessStep f9 '' #zField
Ds0 @PushWFArc f10 '' #zField
Ds0 @RichDialogProcessStep f11 '' #zField
Ds0 @PushWFArc f12 '' #zField
Ds0 @PushWFArc f2 '' #zField
Ds0 @RichDialogMethodStart f13 '' #zField
Ds0 @RichDialogMethodStart f15 '' #zField
Ds0 @PushWFArc f23 '' #zField
Ds0 @PushWFArc f25 '' #zField
Ds0 @PushWFArc f27 '' #zField
>Proto Ds0 Ds0 DayTimeComboboxProcess #zField
Ds0 f0 guid 13F37E5B83CADA5F #txt
Ds0 f0 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f0 method start() #txt
Ds0 f0 disableUIEvents true #txt
Ds0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f0 outParameterDecl '<> result;
' #txt
Ds0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ds0 f0 86 54 20 20 13 0 #rect
Ds0 f0 @|RichDialogInitStartIcon #fIcon
Ds0 f1 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f1 86 206 20 20 13 0 #rect
Ds0 f1 @|RichDialogProcessEndIcon #fIcon
Ds0 f3 guid 13F37EFDCB4E5B23 #txt
Ds0 f3 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f3 method getDayTime() #txt
Ds0 f3 disableUIEvents false #txt
Ds0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f3 outParameterDecl '<java.lang.Number dayTime> result;
' #txt
Ds0 f3 outParameterMapAction 'result.dayTime=in.minute*1000*60+in.hour*1000*60*60;
' #txt
Ds0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getDayTime()</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f3 406 78 20 20 2 -27 #rect
Ds0 f3 @|RichDialogMethodStartIcon #fIcon
Ds0 f4 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f4 534 230 20 20 13 0 #rect
Ds0 f4 @|RichDialogProcessEndIcon #fIcon
Ds0 f5 expr out #txt
Ds0 f5 416 98 534 240 #arcP
Ds0 f5 1 416 240 #addKink
Ds0 f5 0 0.9177947945882905 0 0 #arcLabel
Ds0 f6 guid 13F380BA69537B44 #txt
Ds0 f6 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f6 method setDayTime(Number) #txt
Ds0 f6 disableUIEvents false #txt
Ds0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.Number dayTime> param = methodEvent.getInputArguments();
' #txt
Ds0 f6 inActionCode 'int minutes = (param.dayTime / 1000 / 60) % 60;
out.minute = minutes;
int hours = param.dayTime - minutes * 60 * 1000;
out.hour = hours / 1000 / 60 / 60;

panel.hourComboBox.setSelectedListEntry(out.hour);
panel.minComboBox.setSelectedListEntry(out.minute);' #txt
Ds0 f6 outParameterDecl '<> result;
' #txt
Ds0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setDayTime()</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f6 310 78 20 20 -22 -30 #rect
Ds0 f6 @|RichDialogMethodStartIcon #fIcon
Ds0 f9 actionDecl 'ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData out;
' #txt
Ds0 f9 actionTable 'out=in;
' #txt
Ds0 f9 actionCode 'in.listOfHour.clear();
in.listOfMin.clear();

for(int i=0;i<=23;i++) {
	in.listOfHour.add(i);
}

for(int i=0;i<=59;i++) {
	in.listOfMin.add(i);
}

panel.hourComboBox.setListData(in.listOfHour);
panel.hourComboBox.setSelectedIndex(0);

panel.minComboBox.setListData(in.listOfMin);
panel.minComboBox.setSelectedIndex(0);' #txt
Ds0 f9 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>init data for comboboxes</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f9 78 100 36 24 20 -2 #rect
Ds0 f9 @|RichDialogProcessStepIcon #fIcon
Ds0 f10 expr out #txt
Ds0 f10 96 74 96 100 #arcP
Ds0 f11 actionDecl 'ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData out;
' #txt
Ds0 f11 actionTable 'out=in;
' #txt
Ds0 f11 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f11 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set selected index</name>
        <nameStyle>18,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f11 78 156 36 24 20 -2 #rect
Ds0 f11 @|RichDialogProcessStepIcon #fIcon
Ds0 f12 expr out #txt
Ds0 f12 96 124 96 156 #arcP
Ds0 f2 expr out #txt
Ds0 f2 96 180 96 206 #arcP
Ds0 f13 guid 13F5599117A2363A #txt
Ds0 f13 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f13 method validateHour() #txt
Ds0 f13 disableUIEvents false #txt
Ds0 f13 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f13 outParameterDecl '<java.lang.Boolean isValid> result;
' #txt
Ds0 f13 outActionCode 'import java.lang.NumberFormatException;

boolean isValid = true;
String hour = panel.hourComboBox.getSelectedItem().toString();

if (!hour.trim().isEmpty())
{
	try
	{
		int hourValue = Integer.parseInt(hour);
		if (hourValue < 0 || hourValue > 23)
		{
			isValid = false;
		}
		else
		{
			in.hour = hourValue;
		}
	}
	catch (NumberFormatException ex)
	{
		isValid = false;
	}
}	

result.isValid = isValid;' #txt
Ds0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validateHour()</name>
        <nameStyle>14,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f13 534 78 20 20 13 0 #rect
Ds0 f13 @|RichDialogMethodStartIcon #fIcon
Ds0 f15 guid 13F559920CC81612 #txt
Ds0 f15 type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
Ds0 f15 method validateMinute() #txt
Ds0 f15 disableUIEvents false #txt
Ds0 f15 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ds0 f15 outParameterDecl '<java.lang.Boolean isValid> result;
' #txt
Ds0 f15 outActionCode 'import java.lang.NumberFormatException;

boolean isValid = true;

String minute = panel.minComboBox.getSelectedItem().toString();
if (!minute.trim().isEmpty())
{
	try
	{
		int minuteValue = Integer.parseInt(minute);
		if (minuteValue < 0 || minuteValue > 59)
		{
			isValid = false;
		}
		else
		{
			in.minute = minuteValue;
		}
	}
	catch (NumberFormatException ex)
	{
		isValid = false;
	}
}

result.isValid = isValid;
	' #txt
Ds0 f15 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validateMinute()</name>
        <nameStyle>16,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ds0 f15 686 78 20 20 13 0 #rect
Ds0 f15 @|RichDialogMethodStartIcon #fIcon
Ds0 f23 expr out #txt
Ds0 f23 544 98 544 230 #arcP
Ds0 f25 expr out #txt
Ds0 f25 696 98 554 240 #arcP
Ds0 f25 1 696 240 #addKink
Ds0 f25 0 1.0 0 0 #arcLabel
Ds0 f27 expr out #txt
Ds0 f27 320 98 534 240 #arcP
Ds0 f27 1 320 240 #addKink
Ds0 f27 1 0.15776689968304963 0 0 #arcLabel
>Proto Ds0 .rdData2UIAction 'panel.hourComboBox.listData=in.listOfHour;
panel.minComboBox.listData=in.listOfMin;
' #txt
>Proto Ds0 .type ch.ivyteam.rd.common.DayTimeCombobox.DayTimeComboboxData #txt
>Proto Ds0 .processKind RICH_DIALOG #txt
>Proto Ds0 -8 -8 16 16 16 26 #rect
>Proto Ds0 '' #fIcon
Ds0 f3 mainOut f5 tail #connect
Ds0 f5 head f4 mainIn #connect
Ds0 f0 mainOut f10 tail #connect
Ds0 f10 head f9 mainIn #connect
Ds0 f9 mainOut f12 tail #connect
Ds0 f12 head f11 mainIn #connect
Ds0 f11 mainOut f2 tail #connect
Ds0 f2 head f1 mainIn #connect
Ds0 f13 mainOut f23 tail #connect
Ds0 f23 head f4 mainIn #connect
Ds0 f15 mainOut f25 tail #connect
Ds0 f25 head f4 mainIn #connect
Ds0 f6 mainOut f27 tail #connect
Ds0 f27 head f4 mainIn #connect
