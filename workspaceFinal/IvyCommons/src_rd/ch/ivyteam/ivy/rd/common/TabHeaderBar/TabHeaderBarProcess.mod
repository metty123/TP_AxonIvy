[Ivy]
[>Created: Tue Nov 20 09:31:35 CET 2012]
1189D8A62AFF240E 3.17 #module
>Proto >Proto Collection #zClass
Ts0 TabHeaderBarProcess Big #zClass
Ts0 RD #cInfo
Ts0 #process
Ts0 @AnnotationInP-0n ai ai #zField
Ts0 @MessageFlowInP-0n messageIn messageIn #zField
Ts0 @MessageFlowOutP-0n messageOut messageOut #zField
Ts0 @TextInP .resExport .resExport #zField
Ts0 @TextInP .type .type #zField
Ts0 @TextInP .processKind .processKind #zField
Ts0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ts0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ts0 @TextInP .xml .xml #zField
Ts0 @TextInP .responsibility .responsibility #zField
Ts0 @RichDialogInitStart f0 '' #zField
Ts0 @RichDialogInitStart f1 '' #zField
Ts0 @RichDialogInitStart f2 '' #zField
Ts0 @RichDialogProcessEnd f3 '' #zField
Ts0 @PushWFArc f4 '' #zField
Ts0 @PushWFArc f5 '' #zField
Ts0 @PushWFArc f6 '' #zField
Ts0 @RichDialogProcessStart f8 '' #zField
Ts0 @RichDialogProcessEnd f9 '' #zField
Ts0 @RichDialogMethodStart f13 '' #zField
Ts0 @RichDialogMethodStart f14 '' #zField
Ts0 @RichDialogProcessEnd f15 '' #zField
Ts0 @RichDialogProcessEnd f16 '' #zField
Ts0 @PushWFArc f17 '' #zField
Ts0 @PushWFArc f18 '' #zField
Ts0 @RichDialogFireEvent f19 '' #zField
Ts0 @PushWFArc f20 '' #zField
Ts0 @PushWFArc f10 '' #zField
>Proto Ts0 Ts0 TabHeaderBarProcess #zField
Ts0 f0 guid 1189D90A532E1454 #txt
Ts0 f0 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f0 method start() #txt
Ts0 f0 disableUIEvents false #txt
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
Ts0 f0 6 46 20 20 13 0 #rect
Ts0 f0 @|RichDialogInitStartIcon #fIcon
Ts0 f1 guid 1189D90A6D8AD3F5 #txt
Ts0 f1 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f1 method start(String,String) #txt
Ts0 f1 disableUIEvents false #txt
Ts0 f1 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String iconUri,java.lang.String title> param = methodEvent.getInputArguments();
' #txt
Ts0 f1 inParameterMapAction 'out.iconUri=param.iconUri;
out.showCloseButton=true;
out.showRefreshButton=true;
out.title=param.title;
' #txt
Ts0 f1 outParameterDecl '<> result;
' #txt
Ts0 f1 embeddedRdInitializations '* ' #txt
Ts0 f1 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String,String)</name>
        <nameStyle>20,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f1 70 46 20 20 13 0 #rect
Ts0 f1 @|RichDialogInitStartIcon #fIcon
Ts0 f2 guid 1189D90AACF517B6 #txt
Ts0 f2 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f2 method start(String,String,Boolean,Boolean) #txt
Ts0 f2 disableUIEvents false #txt
Ts0 f2 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String iconUri,java.lang.String title,java.lang.Boolean showCloseButton,java.lang.Boolean showRefreshButton> param = methodEvent.getInputArguments();
' #txt
Ts0 f2 inParameterMapAction 'out.iconUri=param.iconUri;
out.showCloseButton=param.showCloseButton;
out.showRefreshButton=param.showRefreshButton;
out.title=param.title;
' #txt
Ts0 f2 outParameterDecl '<> result;
' #txt
Ts0 f2 embeddedRdInitializations '* ' #txt
Ts0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(String,String,Boolean,Boolean)</name>
        <nameStyle>36,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f2 70 294 20 20 13 0 #rect
Ts0 f2 @|RichDialogInitStartIcon #fIcon
Ts0 f3 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f3 67 171 26 26 14 0 #rect
Ts0 f3 @|RichDialogProcessEndIcon #fIcon
Ts0 f4 expr out #txt
Ts0 f4 20 64 74 172 #arcP
Ts0 f5 expr out #txt
Ts0 f5 80 66 80 171 #arcP
Ts0 f6 expr out #txt
Ts0 f6 80 294 80 197 #arcP
Ts0 f8 guid 1189DA822E7AE6C4 #txt
Ts0 f8 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f8 actionDecl 'ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData out;
' #txt
Ts0 f8 actionTable 'out=in;
' #txt
Ts0 f8 actionCode '/*
import ch.ivyteam.ivy.richdialog.exec.panel.IRichDialogPanelImpl;
import com.ulcjava.base.application.ULCContainer;
import ch.ivyteam.ivy.rd.common.TabHeaderBar.MethodInvokeUtil;

ULCContainer parent = panel.getParent();
while (!(parent instanceof IRichDialogPanelImpl))
{
	parent = parent.getParent();	
}

IRichDialogPanelImpl parentRd = parent as IRichDialogPanelImpl;
MethodInvokeUtil.invoke(parentRd, "refresh");
*/' #txt
Ts0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh</name>
        <nameStyle>7,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f8 270 222 20 20 13 0 #rect
Ts0 f8 @|RichDialogProcessStartIcon #fIcon
Ts0 f9 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f9 267 323 26 26 14 0 #rect
Ts0 f9 @|RichDialogProcessEndIcon #fIcon
Ts0 f13 guid 1189E0BC0D69DB0B #txt
Ts0 f13 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f13 method getTitle() #txt
Ts0 f13 disableUIEvents false #txt
Ts0 f13 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ts0 f13 outParameterDecl '<java.lang.String title> result;
' #txt
Ts0 f13 outParameterMapAction 'result.title=in.title;
' #txt
Ts0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getTitle()</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f13 454 54 20 20 13 0 #rect
Ts0 f13 @|RichDialogMethodStartIcon #fIcon
Ts0 f14 guid 1189E0BCF9BCA1F1 #txt
Ts0 f14 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f14 method setTitle(String) #txt
Ts0 f14 disableUIEvents false #txt
Ts0 f14 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<java.lang.String title> param = methodEvent.getInputArguments();
' #txt
Ts0 f14 inParameterMapAction 'out.title=param.title;
' #txt
Ts0 f14 outParameterDecl '<> result;
' #txt
Ts0 f14 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setTitle(String)</name>
        <nameStyle>16,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f14 454 230 20 20 13 0 #rect
Ts0 f14 @|RichDialogMethodStartIcon #fIcon
Ts0 f15 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f15 451 155 26 26 14 0 #rect
Ts0 f15 @|RichDialogProcessEndIcon #fIcon
Ts0 f16 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f16 451 331 26 26 14 0 #rect
Ts0 f16 @|RichDialogProcessEndIcon #fIcon
Ts0 f17 expr out #txt
Ts0 f17 464 250 464 331 #arcP
Ts0 f18 expr out #txt
Ts0 f18 464 74 464 155 #arcP
Ts0 f19 actionCode panel.fireRefresh(); #txt
Ts0 f19 type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
Ts0 f19 fireEvent refresh() #txt
Ts0 f19 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Fire: refresh</name>
        <nameStyle>13,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Ts0 f19 262 276 36 24 20 -2 #rect
Ts0 f19 @|RichDialogFireEventIcon #fIcon
Ts0 f20 expr out #txt
Ts0 f20 280 242 280 276 #arcP
Ts0 f10 expr out #txt
Ts0 f10 280 300 280 323 #arcP
>Proto Ts0 .type ch.ivyteam.ivy.rd.common.TabHeaderBar.TabHeaderBarData #txt
>Proto Ts0 .processKind RICH_DIALOG #txt
>Proto Ts0 .rdData2UIAction 'panel.refreshButton.visible=in.showRefreshButton;
panel.titleLabel.iconUri=in.iconUri;
panel.titleLabel.text=in.title;
' #txt
>Proto Ts0 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <swimlaneLabel>Start methods</swimlaneLabel>
        <swimlaneLabel>Events</swimlaneLabel>
        <swimlaneLabel>Methods</swimlaneLabel>
        <swimlaneLabel></swimlaneLabel>
    </language>
    <swimlaneSize>243</swimlaneSize>
    <swimlaneSize>150</swimlaneSize>
    <swimlaneSize>150</swimlaneSize>
    <swimlaneColor>-1</swimlaneColor>
    <swimlaneColor>-3355393</swimlaneColor>
    <swimlaneColor>-13108</swimlaneColor>
</elementInfo>
' #txt
>Proto Ts0 -8 -8 16 16 16 26 #rect
>Proto Ts0 '' #fIcon
Ts0 f0 mainOut f4 tail #connect
Ts0 f4 head f3 mainIn #connect
Ts0 f1 mainOut f5 tail #connect
Ts0 f5 head f3 mainIn #connect
Ts0 f2 mainOut f6 tail #connect
Ts0 f6 head f3 mainIn #connect
Ts0 f14 mainOut f17 tail #connect
Ts0 f17 head f16 mainIn #connect
Ts0 f13 mainOut f18 tail #connect
Ts0 f18 head f15 mainIn #connect
Ts0 f8 mainOut f20 tail #connect
Ts0 f20 head f19 mainIn #connect
Ts0 f19 mainOut f10 tail #connect
Ts0 f10 head f9 mainIn #connect
