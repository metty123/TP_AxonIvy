[Ivy]
[>Created: Mon Jun 06 18:38:32 ICT 2016]
15505D621D712043 3.18 #module
>Proto >Proto Collection #zClass
Rs0 RestClientsProcess Big #zClass
Rs0 RD #cInfo
Rs0 #process
Rs0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Rs0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Rs0 @TextInP .resExport .resExport #zField
Rs0 @TextInP .type .type #zField
Rs0 @TextInP .processKind .processKind #zField
Rs0 @AnnotationInP-0n ai ai #zField
Rs0 @MessageFlowInP-0n messageIn messageIn #zField
Rs0 @MessageFlowOutP-0n messageOut messageOut #zField
Rs0 @TextInP .xml .xml #zField
Rs0 @TextInP .responsibility .responsibility #zField
Rs0 @RichDialogInitStart f0 '' #zField
Rs0 @RichDialogProcessEnd f1 '' #zField
Rs0 @RichDialogProcessStep f3 '' #zField
Rs0 @PushWFArc f4 '' #zField
Rs0 @RichDialogProcessStart f5 '' #zField
Rs0 @RichDialogProcessEnd f6 '' #zField
Rs0 @RichDialogProcessStep f8 '' #zField
Rs0 @PushWFArc f12 '' #zField
Rs0 @RichDialogProcessStart f9 '' #zField
Rs0 @PushWFArc f13 '' #zField
Rs0 @RichDialogProcessEnd f2 '' #zField
Rs0 @RichDialogProcessStep f15 '' #zField
Rs0 @Alternative f17 '' #zField
Rs0 @RichDialogProcessEnd f19 '' #zField
Rs0 @PushWFArc f20 '' #zField
Rs0 @PushWFArc f16 '' #zField
Rs0 @PushWFArc f21 '' #zField
Rs0 @RichDialogProcessStart f7 '' #zField
Rs0 @PushWFArc f14 '' #zField
Rs0 @RichDialogProcessEnd f22 '' #zField
Rs0 @RichDialogProcessStep f23 '' #zField
Rs0 @RichDialogMethodStart f26 '' #zField
Rs0 @PushWFArc f27 '' #zField
Rs0 @RichDialogProcessStep f28 '' #zField
Rs0 @PushWFArc f34 '' #zField
Rs0 @RichDialogProcessStep f10 '' #zField
Rs0 @PushWFArc f18 '' #zField
Rs0 @PushWFArc f24 '' #zField
Rs0 @RichDialogMethodStart f25 '' #zField
Rs0 @RichDialogProcessEnd f31 '' #zField
Rs0 @PushWFArc f33 '' #zField
Rs0 @PushWFArc f35 '' #zField
Rs0 @InfoButton f29 '' #zField
Rs0 @AnnotationArc f30 '' #zField
Rs0 @RichDialogProcessStep f32 '' #zField
Rs0 @PushWFArc f36 '' #zField
Rs0 @PushWFArc f11 '' #zField
Rs0 @RichDialogInitStart f37 '' #zField
Rs0 @PushWFArc f39 '' #zField
>Proto Rs0 Rs0 RestClientsProcess #zField
Rs0 f0 guid 15505D62209D7F3B #txt
Rs0 f0 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f0 method start(ch.ivyteam.ivy.application.restricted.IEnvironment,ch.ivyteam.ivy.application.IApplication) #txt
Rs0 f0 disableUIEvents true #txt
Rs0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<ch.ivyteam.ivy.application.restricted.IEnvironment environment,ch.ivyteam.ivy.application.IApplication application> param = methodEvent.getInputArguments();
' #txt
Rs0 f0 inParameterMapAction 'out.application=param.application;
out.environment=param.environment;
' #txt
Rs0 f0 outParameterDecl '<> result;
' #txt
Rs0 f0 embeddedRdInitializations '{/restClientDetailsPanel {/fieldName "restClientDetailsPanel"/startMethod "start(ch.ivyteam.ivy.application.IApplication,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping "param.application=callParam.application;\nparam.environment=callParam.environment;\n"/initScript ""/userContext * }}' #txt
Rs0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IEnvironment,IApplication)</name>
        <nameStyle>32,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f0 77 85 22 22 14 0 #rect
Rs0 f0 @|RichDialogInitStartIcon #fIcon
Rs0 f1 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f1 77 277 22 22 14 0 #rect
Rs0 f1 @|RichDialogProcessEndIcon #fIcon
Rs0 f3 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f3 actionTable 'out=in;
' #txt
Rs0 f3 actionCode 'import ch.ivyteam.ivy.admin.tool.restclient.RestClientItemService;
import ch.ivyteam.ivy.application.restricted.rest.IRestClient;
import ch.ivyteam.ivy.application.restricted.rest.RestClientDao;

List<IRestClient> defaultRestClients = RestClientDao.forApp(in.application).getAllDefaults() as List;
List<IRestClient> environmentRestClients = RestClientDao.forApp(in.application).getAll(in.environment) as List;

RestClientItemService itemService = new RestClientItemService();
in.defaultRestClientItems = itemService.toDefaultRestClientItems(defaultRestClients);
in.environmentRestClientItems = itemService.toEnvironmentRestClientItems(environmentRestClients);

in.restClientItems = itemService.combineDefaultAndEnvironmentRestItem(in.defaultRestClientItems, in.environmentRestClientItems);
in.filteredRestClientItems = in.restClientItems;
panel.restClientDetailsPanel.enabled = false;


' #txt
Rs0 f3 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Get RestClient 
of Environment</name>
        <nameStyle>30,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f3 70 172 36 24 20 -2 #rect
Rs0 f3 @|RichDialogProcessStepIcon #fIcon
Rs0 f4 expr out #txt
Rs0 f4 88 107 88 172 #arcP
Rs0 f5 guid 1550A187FA121A9A #txt
Rs0 f5 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f5 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f5 actionTable 'out=in;
' #txt
Rs0 f5 actionCode 'panel.restClientDetailsPanel.enabled = true;
' #txt
Rs0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>changeSelection</name>
        <nameStyle>15,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f5 245 85 22 22 14 0 #rect
Rs0 f5 @|RichDialogProcessStartIcon #fIcon
Rs0 f6 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f6 245 349 22 22 14 0 #rect
Rs0 f6 @|RichDialogProcessEndIcon #fIcon
Rs0 f8 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f8 actionTable 'out=in;
' #txt
Rs0 f8 actionCode 'import ch.ivyteam.ivy.admin.tool.restclient.RestClientItem;
import ch.ivyteam.ivy.application.restricted.rest.RestClientDao;
import ch.ivyteam.ivy.application.restricted.rest.IRestClient;

in.selectedRestClientItem = panel.restClientList.selectedListEntry as RestClientItem;

IRestClient defaultRestClient = RestClientDao.forApp(in.application).findDefaultById(in.selectedRestClientItem.UUID);
IRestClient environmentRestClient = RestClientDao.forApp(in.application).findById(in.selectedRestClientItem.UUID, in.environment);
if(!(#environmentRestClient is initialized)){
	environmentRestClient = defaultRestClient;
}
panel.restClientDetailsPanel.setRestClient(environmentRestClient, defaultRestClient, in.selectedRestClientItem.environment);' #txt
Rs0 f8 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Set RestClient to details mask</name>
        <nameStyle>30,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f8 238 284 36 24 20 -2 #rect
Rs0 f8 @|RichDialogProcessStepIcon #fIcon
Rs0 f12 expr out #txt
Rs0 f12 256 308 256 349 #arcP
Rs0 f9 guid 15515D590C18895A #txt
Rs0 f9 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f9 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f9 actionTable 'out=in;
' #txt
Rs0 f9 actionCode 'import ch.ivyteam.ivy.richdialog.exec.RdEvent;
import ch.ivyteam.ivy.admin.tool.restclient.RestClientItem;
import java.util.UUID;

UUID openedUUID = (event as RdEvent).getParameter() as UUID;
for(RestClientItem r : in.restClientItems) {
	if(openedUUID.equals(r.getUuid())) {
		r.environment = false;
	}
}
' #txt
Rs0 f9 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setRestClientToDefault</name>
        <nameStyle>22,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f9 245 381 22 22 14 0 #rect
Rs0 f9 @|RichDialogProcessStartIcon #fIcon
Rs0 f13 expr out #txt
Rs0 f13 88 196 88 277 #arcP
Rs0 f2 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f2 245 549 22 22 14 0 #rect
Rs0 f2 @|RichDialogProcessEndIcon #fIcon
Rs0 f15 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f15 actionTable 'out=in;
' #txt
Rs0 f15 actionCode '
panel.restClientList.preloadAllCells();

' #txt
Rs0 f15 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f15 238 468 36 24 20 -2 #rect
Rs0 f15 @|RichDialogProcessStepIcon #fIcon
Rs0 f17 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f17 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is Filtering?</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f17 242 154 28 28 14 0 #rect
Rs0 f17 @|AlternativeIcon #fIcon
Rs0 f19 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f19 469 253 22 22 14 0 #rect
Rs0 f19 @|RichDialogProcessEndIcon #fIcon
Rs0 f20 expr in #txt
Rs0 f20 outCond in.isFilterting #txt
Rs0 f20 270 168 480 253 #arcP
Rs0 f20 1 480 168 #addKink
Rs0 f20 0 0.7141271402722458 0 0 #arcLabel
Rs0 f16 expr out #txt
Rs0 f16 256 403 256 468 #arcP
Rs0 f21 expr out #txt
Rs0 f21 256 492 256 549 #arcP
Rs0 f7 guid 1551633B89449D63 #txt
Rs0 f7 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f7 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f7 actionTable 'out=in;
' #txt
Rs0 f7 actionCode 'import ch.ivyteam.ivy.richdialog.exec.RdEvent;
import ch.ivyteam.ivy.admin.tool.restclient.RestClientItem;
import java.util.UUID;

UUID openedUUID = (event as RdEvent).getParameter() as UUID;
for(RestClientItem r : in.restClientItems) {
	if(openedUUID.equals(r.getUuid())) {
		r.environment = true;
	}
}' #txt
Rs0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setRestClientToEnvironment</name>
        <nameStyle>26,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f7 445 381 22 22 14 0 #rect
Rs0 f7 @|RichDialogProcessStartIcon #fIcon
Rs0 f14 expr out #txt
Rs0 f14 445 396 274 480 #arcP
Rs0 f22 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f22 629 341 22 22 14 0 #rect
Rs0 f22 @|RichDialogProcessEndIcon #fIcon
Rs0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f23 actionTable 'out=in;
' #txt
Rs0 f23 actionCode 'import ch.ivyteam.ivy.admin.tool.restclient.RestClientItemService;
in.isFilterting = true;

in.filteredRestClientItems = new RestClientItemService().filter(panel.restClientLookup.text, in.restClientItems);
panel.refresh();' #txt
Rs0 f23 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Start filtering</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f23 622 148 36 24 20 -2 #rect
Rs0 f23 @|RichDialogProcessStepIcon #fIcon
Rs0 f26 guid 15523C8A5DBCC8E5 #txt
Rs0 f26 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f26 method filterRestClients() #txt
Rs0 f26 disableUIEvents false #txt
Rs0 f26 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f26 outParameterDecl '<> result;
' #txt
Rs0 f26 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filterRestClients()</name>
    </language>
</elementInfo>
' #txt
Rs0 f26 629 85 22 22 14 0 #rect
Rs0 f26 @|RichDialogMethodStartIcon #fIcon
Rs0 f27 expr out #txt
Rs0 f27 640 107 640 148 #arcP
Rs0 f28 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f28 actionTable 'out=in;
' #txt
Rs0 f28 actionCode 'panel.restClientList.selectedIndex = in.filteredRestClientItems.indexOf(in.selectedRestClientItem);
' #txt
Rs0 f28 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f28 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Update selected index</name>
        <nameStyle>21,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f28 622 212 36 24 20 -2 #rect
Rs0 f28 @|RichDialogProcessStepIcon #fIcon
Rs0 f34 expr out #txt
Rs0 f34 256 107 256 154 #arcP
Rs0 f10 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f10 actionTable 'out=in;
' #txt
Rs0 f10 actionCode 'in.isFilterting = false;' #txt
Rs0 f10 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f10 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>End filtering</name>
        <nameStyle>13,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f10 622 276 36 24 20 -2 #rect
Rs0 f10 @|RichDialogProcessStepIcon #fIcon
Rs0 f18 expr out #txt
Rs0 f18 640 236 640 276 #arcP
Rs0 f24 expr out #txt
Rs0 f24 640 300 640 341 #arcP
Rs0 f25 guid 15523F91D044139E #txt
Rs0 f25 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f25 method refresh() #txt
Rs0 f25 disableUIEvents false #txt
Rs0 f25 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f25 outParameterDecl '<> result;
' #txt
Rs0 f25 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>refresh()</name>
    </language>
</elementInfo>
' #txt
Rs0 f25 805 181 22 22 14 0 #rect
Rs0 f25 @|RichDialogMethodStartIcon #fIcon
Rs0 f31 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f31 805 261 22 22 14 0 #rect
Rs0 f31 @|RichDialogProcessEndIcon #fIcon
Rs0 f33 expr out #txt
Rs0 f33 816 203 816 261 #arcP
Rs0 f35 expr out #txt
Rs0 f35 640 172 640 212 #arcP
Rs0 f29 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Method does nothing 
by intention in order to 
in the end of process, 
data would be synced 
between service-client</name>
        <nameStyle>115,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f29 960 146 128 92 -61 -40 #rect
Rs0 f29 @|IBIcon #fIcon
Rs0 f30 960 192 827 192 #arcP
Rs0 f32 actionDecl 'ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData out;
' #txt
Rs0 f32 actionTable 'out=in;
' #txt
Rs0 f32 actionCode panel.restClientDetailsPanel.saveWithoutPrompt(); #txt
Rs0 f32 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f32 238 220 36 24 20 -2 #rect
Rs0 f32 @|RichDialogProcessStepIcon #fIcon
Rs0 f36 expr in #txt
Rs0 f36 256 182 256 220 #arcP
Rs0 f11 expr out #txt
Rs0 f11 256 244 256 284 #arcP
Rs0 f37 guid 1552560E39B59449 #txt
Rs0 f37 type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
Rs0 f37 method start() #txt
Rs0 f37 disableUIEvents true #txt
Rs0 f37 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Rs0 f37 outParameterDecl '<> result;
' #txt
Rs0 f37 embeddedRdInitializations '{/restClientDetailsPanel {/fieldName "restClientDetailsPanel"/startMethod "start(ch.ivyteam.ivy.application.IApplication,ch.ivyteam.ivy.application.restricted.IEnvironment)"/parameterMapping ""/initScript ""/userContext * }}' #txt
Rs0 f37 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start()</name>
        <nameStyle>7,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Rs0 f37 5 85 22 22 14 0 #rect
Rs0 f37 @|RichDialogInitStartIcon #fIcon
Rs0 f39 expr out #txt
Rs0 f39 19 106 84 277 #arcP
>Proto Rs0 .rdData2UIAction 'panel.restClientList.listData=in.filteredRestClientItems;
' #txt
>Proto Rs0 .type ch.ivyteam.ivy.admin.tool.restclient.RestClients.RestClientsData #txt
>Proto Rs0 .processKind RICH_DIALOG #txt
>Proto Rs0 -8 -8 16 16 16 26 #rect
>Proto Rs0 '' #fIcon
Rs0 f0 mainOut f4 tail #connect
Rs0 f4 head f3 mainIn #connect
Rs0 f8 mainOut f12 tail #connect
Rs0 f12 head f6 mainIn #connect
Rs0 f3 mainOut f13 tail #connect
Rs0 f13 head f1 mainIn #connect
Rs0 f17 out f20 tail #connect
Rs0 f20 head f19 mainIn #connect
Rs0 f9 mainOut f16 tail #connect
Rs0 f16 head f15 mainIn #connect
Rs0 f15 mainOut f21 tail #connect
Rs0 f21 head f2 mainIn #connect
Rs0 f7 mainOut f14 tail #connect
Rs0 f14 head f15 mainIn #connect
Rs0 f26 mainOut f27 tail #connect
Rs0 f27 head f23 mainIn #connect
Rs0 f5 mainOut f34 tail #connect
Rs0 f34 head f17 in #connect
Rs0 f28 mainOut f18 tail #connect
Rs0 f18 head f10 mainIn #connect
Rs0 f10 mainOut f24 tail #connect
Rs0 f24 head f22 mainIn #connect
Rs0 f25 mainOut f33 tail #connect
Rs0 f33 head f31 mainIn #connect
Rs0 f23 mainOut f35 tail #connect
Rs0 f35 head f28 mainIn #connect
Rs0 f29 ao f30 tail #connect
Rs0 f30 head f25 @CG|ai #connect
Rs0 f17 out f36 tail #connect
Rs0 f36 head f32 mainIn #connect
Rs0 f32 mainOut f11 tail #connect
Rs0 f11 head f8 mainIn #connect
Rs0 f37 mainOut f39 tail #connect
Rs0 f39 head f1 mainIn #connect
