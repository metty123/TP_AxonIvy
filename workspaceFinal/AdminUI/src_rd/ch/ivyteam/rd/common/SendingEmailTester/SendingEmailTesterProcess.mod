[Ivy]
[>Created: Mon Jul 25 09:41:24 ICT 2016]
147CEA5431B6B623 3.18 #module
>Proto >Proto Collection #zClass
Ss0 SendingEmailTesterProcess Big #zClass
Ss0 RD #cInfo
Ss0 #process
Ss0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Ss0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Ss0 @TextInP .resExport .resExport #zField
Ss0 @TextInP .type .type #zField
Ss0 @TextInP .processKind .processKind #zField
Ss0 @AnnotationInP-0n ai ai #zField
Ss0 @MessageFlowInP-0n messageIn messageIn #zField
Ss0 @MessageFlowOutP-0n messageOut messageOut #zField
Ss0 @TextInP .xml .xml #zField
Ss0 @TextInP .responsibility .responsibility #zField
Ss0 @RichDialogInitStart f0 '' #zField
Ss0 @RichDialogProcessEnd f1 '' #zField
Ss0 @RichDialogProcessStart f6 '' #zField
Ss0 @RichDialogProcessEnd f3 '' #zField
Ss0 @RichDialogProcessStep f5 '' #zField
Ss0 @EMail f8 '' #zField
Ss0 @ProcessException f10 '' #zField
Ss0 @RichDialogProcessEnd f11 '' #zField
Ss0 @RichDialogProcessStep f13 '' #zField
Ss0 @PushWFArc f14 '' #zField
Ss0 @PushWFArc f17 '' #zField
Ss0 @PushWFArc f12 '' #zField
Ss0 @PushWFArc f4 '' #zField
Ss0 @RichDialogProcessStart f2 '' #zField
Ss0 @RichDialogEnd f15 '' #zField
Ss0 @PushWFArc f16 '' #zField
Ss0 @Alternative f18 '' #zField
Ss0 @PushWFArc f7 '' #zField
Ss0 @PushWFArc f9 '' #zField
Ss0 @PushWFArc f19 '' #zField
Ss0 @RichDialogProcessStep f21 '' #zField
Ss0 @PushWFArc f22 '' #zField
Ss0 @PushWFArc f20 '' #zField
>Proto Ss0 Ss0 SendingEmailTesterProcess #zField
Ss0 f0 guid 147CEA543849B259 #txt
Ss0 f0 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f0 method start() #txt
Ss0 f0 disableUIEvents true #txt
Ss0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Ss0 f0 outParameterDecl '<> result;
' #txt
Ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
    </language>
</elementInfo>
' #txt
Ss0 f0 53 85 22 22 14 0 #rect
Ss0 f0 @|RichDialogInitStartIcon #fIcon
Ss0 f1 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f1 53 213 22 22 14 0 #rect
Ss0 f1 @|RichDialogProcessEndIcon #fIcon
Ss0 f6 guid 147CEB2C6E2DDB26 #txt
Ss0 f6 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f6 actionDecl 'ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData out;
' #txt
Ss0 f6 actionTable 'out=in;
' #txt
Ss0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>sendTestEmail</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f6 245 85 22 22 14 0 #rect
Ss0 f6 @|RichDialogProcessStartIcon #fIcon
Ss0 f3 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f3 245 413 22 22 14 0 #rect
Ss0 f3 @|RichDialogProcessEndIcon #fIcon
Ss0 f5 actionDecl 'ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData out;
' #txt
Ss0 f5 actionTable 'out=in;
' #txt
Ss0 f5 actionCode 'in.receiverAddress = panel.receiverTextField.getText();
' #txt
Ss0 f5 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get Receiver Address</name>
        <nameStyle>20,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f5 238 220 36 24 20 -3 #rect
Ss0 f5 @|RichDialogProcessStepIcon #fIcon
Ss0 f8 beanConfig '"{/emailSubject ""<%=ivy.cms.co(\\""/ch/ivyteam/ivy/admin/tool/title/testSendEmail\\"")%>""/emailFrom ""<%=ch.ivyteam.ivy.server.ServerFactory.getServer().getApplicationConfigurationManager().getSystemProp(\\""EMail.Server.MailAddress\\"").getValue()%>""/emailReplyTo """"/emailTo ""<%=in.receiverAddress%>""/emailCC """"/emailBCC """"/exceptionMissingEmailAttachments ""false""/emailMessage ""It\\''s a test email.\\nPlease don\\''t reply this.\\nThanks.""/emailAttachments * }"' #txt
Ss0 f8 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f8 timeout 0 #txt
Ss0 f8 exceptionHandler 147CEA5431B6B623-f10-buffer #txt
Ss0 f8 238 284 36 24 20 -2 #rect
Ss0 f8 @|EMailIcon #fIcon
Ss0 f10 .resExport export #txt
Ss0 f10 actionDecl 'ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData out;
' #txt
Ss0 f10 actionTable 'out=in;
' #txt
Ss0 f10 actionCode 'import com.ulcjava.base.application.util.Color;

panel.messageTextArea.text = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/couldNotSendEmail") + "\n" + error.getTechnicalCause();
panel.messageTextArea.foreground = new Color(255,0,0);' #txt
Ss0 f10 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f10 errorCode unspecified #txt
Ss0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>send email exception handle</name>
        <nameStyle>27,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f10 475 91 26 26 14 0 #rect
Ss0 f10 @|ExceptionIcon #fIcon
Ss0 f11 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f11 477 189 22 22 14 0 #rect
Ss0 f11 @|RichDialogProcessEndIcon #fIcon
Ss0 f13 actionDecl 'ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData out;
' #txt
Ss0 f13 actionTable 'out=in;
' #txt
Ss0 f13 actionCode 'import com.ulcjava.base.application.util.Color;
panel.messageTextArea.text = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/message/testEmailSuccessful");
panel.messageTextArea.foreground = new Color(0,204,0);' #txt
Ss0 f13 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f13 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Update Text Area Message</name>
        <nameStyle>24,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f13 238 348 36 24 20 -2 #rect
Ss0 f13 @|RichDialogProcessStepIcon #fIcon
Ss0 f14 expr out #txt
Ss0 f14 256 308 256 348 #arcP
Ss0 f17 expr out #txt
Ss0 f17 64 107 64 213 #arcP
Ss0 f12 expr out #txt
Ss0 f12 488 117 488 189 #arcP
Ss0 f4 expr out #txt
Ss0 f4 256 372 256 413 #arcP
Ss0 f2 guid 147D39FD0A356A90 #txt
Ss0 f2 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f2 actionDecl 'ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData out;
' #txt
Ss0 f2 actionTable 'out=in;
' #txt
Ss0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close dialog</name>
        <nameStyle>12,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f2 53 293 22 22 14 0 #rect
Ss0 f2 @|RichDialogProcessStartIcon #fIcon
Ss0 f15 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f15 guid 147D3A008D181009 #txt
Ss0 f15 53 373 22 22 14 0 #rect
Ss0 f15 @|RichDialogEndIcon #fIcon
Ss0 f16 expr out #txt
Ss0 f16 64 315 64 373 #arcP
Ss0 f18 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f18 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>validate recipient address</name>
        <nameStyle>26,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f18 242 146 28 28 22 -8 #rect
Ss0 f18 @|AlternativeIcon #fIcon
Ss0 f7 expr out #txt
Ss0 f7 256 107 256 146 #arcP
Ss0 f9 expr in #txt
Ss0 f9 outCond !(ivy.rd.getValidator(panel.receiverTextField).hasErrors()) #txt
Ss0 f9 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>yes</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f9 256 174 256 220 #arcP
Ss0 f19 expr out #txt
Ss0 f19 256 244 256 284 #arcP
Ss0 f21 actionDecl 'ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData out;
' #txt
Ss0 f21 actionTable 'out=in;
' #txt
Ss0 f21 actionCode 'import com.ulcjava.base.application.util.Color;

panel.messageTextArea.text = ivy.cms.co("/ch/ivyteam/ivy/admin/tool/errorMsg/wrongInputRecipientAddress") ;
panel.messageTextArea.foreground = new Color(255,0,0);' #txt
Ss0 f21 type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
Ss0 f21 190 268 36 24 20 -2 #rect
Ss0 f21 @|RichDialogProcessStepIcon #fIcon
Ss0 f22 expr in #txt
Ss0 f22 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>no</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Ss0 f22 242 160 208 268 #arcP
Ss0 f22 1 208 160 #addKink
Ss0 f22 1 0.49080882352941174 0 0 #arcLabel
Ss0 f20 expr out #txt
Ss0 f20 208 292 245 424 #arcP
Ss0 f20 1 208 424 #addKink
Ss0 f20 1 0.49080882352941174 0 0 #arcLabel
>Proto Ss0 .type ch.ivyteam.rd.common.SendingEmailTester.SendingEmailTesterData #txt
>Proto Ss0 .processKind RICH_DIALOG #txt
>Proto Ss0 -8 -8 16 16 16 26 #rect
>Proto Ss0 '' #fIcon
Ss0 f10 mainOut f12 tail #connect
Ss0 f12 head f11 mainIn #connect
Ss0 f8 mainOut f14 tail #connect
Ss0 f14 head f13 mainIn #connect
Ss0 f13 mainOut f4 tail #connect
Ss0 f4 head f3 mainIn #connect
Ss0 f0 mainOut f17 tail #connect
Ss0 f17 head f1 mainIn #connect
Ss0 f2 mainOut f16 tail #connect
Ss0 f16 head f15 mainIn #connect
Ss0 f6 mainOut f7 tail #connect
Ss0 f7 head f18 in #connect
Ss0 f18 out f9 tail #connect
Ss0 f9 head f5 mainIn #connect
Ss0 f5 mainOut f19 tail #connect
Ss0 f19 head f8 mainIn #connect
Ss0 f18 out f22 tail #connect
Ss0 f22 head f21 mainIn #connect
Ss0 f21 mainOut f20 tail #connect
Ss0 f20 head f3 mainIn #connect
