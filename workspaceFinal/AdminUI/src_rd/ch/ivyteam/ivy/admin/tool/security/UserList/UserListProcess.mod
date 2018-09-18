[Ivy]
[>Created: Wed Aug 12 15:41:19 ICT 2015]
117AC2A37FABF205 3.17 #module
>Proto >Proto Collection #zClass
Us0 UserListProcess Big #zClass
Us0 RD #cInfo
Us0 #process
Us0 @TextInP .xml .xml #zField
Us0 @TextInP .responsibility .responsibility #zField
Us0 @AnnotationInP-0n ai ai #zField
Us0 @TextInP .ui2RdDataAction .ui2RdDataAction #zField
Us0 @TextInP .rdData2UIAction .rdData2UIAction #zField
Us0 @TextInP .resExport .resExport #zField
Us0 @TextInP .type .type #zField
Us0 @TextInP .processKind .processKind #zField
Us0 @MessageFlowInP-0n messageIn messageIn #zField
Us0 @MessageFlowOutP-0n messageOut messageOut #zField
Us0 @RichDialogInitStart f0 '' #zField
Us0 @RichDialogProcessEnd f1 '' #zField
Us0 @RichDialogMethodStart f3 '' #zField
Us0 @RichDialogProcessEnd f4 '' #zField
Us0 @RichDialogMethodStart f6 '' #zField
Us0 @RichDialogMethodStart f7 '' #zField
Us0 @RichDialogMethodStart f8 '' #zField
Us0 @RichDialogProcessEnd f9 '' #zField
Us0 @RichDialogProcessEnd f10 '' #zField
Us0 @RichDialogProcessEnd f11 '' #zField
Us0 @PushWFArc f12 '' #zField
Us0 @PushWFArc f13 '' #zField
Us0 @PushWFArc f14 '' #zField
Us0 @RichDialogProcessEnd f15 '' #zField
Us0 @CallSub f27 '' #zField
Us0 @PushWFArc f18 '' #zField
Us0 @RichDialogProcessStep f16 '' #zField
Us0 @PushWFArc f20 '' #zField
Us0 @RichDialogMethodStart f21 '' #zField
Us0 @PushWFArc f22 '' #zField
Us0 @RichDialogProcessStep f23 '' #zField
Us0 @PushWFArc f5 '' #zField
Us0 @RichDialogProcessStep f31 '' #zField
Us0 @PushWFArc f32 '' #zField
Us0 @PushWFArc f24 '' #zField
Us0 @RichDialogProcessStep f25 '' #zField
Us0 @PushWFArc f26 '' #zField
Us0 @PushWFArc f17 '' #zField
>Proto Us0 Us0 UserListProcess #zField
Us0 f0 guid 117AC2BCB05DE91A #txt
Us0 f0 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f0 method start(List<ch.ivyteam.ivy.security.IUser>) #txt
Us0 f0 disableUIEvents false #txt
Us0 f0 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.security.IUser> users> param = methodEvent.getInputArguments();
' #txt
Us0 f0 inParameterMapAction 'out.users=param.users;
' #txt
Us0 f0 outParameterDecl '<> result;
' #txt
Us0 f0 embeddedRdInitializations '* ' #txt
Us0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(IUser&gt;)</name>
        <nameStyle>13,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f0 46 38 20 20 13 0 #rect
Us0 f0 @|RichDialogInitStartIcon #fIcon
Us0 f1 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f1 43 147 26 26 14 0 #rect
Us0 f1 @|RichDialogProcessEndIcon #fIcon
Us0 f3 guid 117AC6631C815E40 #txt
Us0 f3 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f3 method setUsers(List<ch.ivyteam.ivy.security.IUser>) #txt
Us0 f3 disableUIEvents false #txt
Us0 f3 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<List<ch.ivyteam.ivy.security.IUser> users> param = methodEvent.getInputArguments();
' #txt
Us0 f3 inParameterMapAction 'out.users=param.users;
' #txt
Us0 f3 outParameterDecl '<> result;
' #txt
Us0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>setUsers(IUser&gt;)</name>
        <nameStyle>16,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f3 222 38 20 20 13 0 #rect
Us0 f3 @|RichDialogMethodStartIcon #fIcon
Us0 f4 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f4 219 235 26 26 14 0 #rect
Us0 f4 @|RichDialogProcessEndIcon #fIcon
Us0 f6 guid 0117AC695D44F320 #txt
Us0 f6 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f6 method getSelectedUser() #txt
Us0 f6 disableUIEvents false #txt
Us0 f6 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f6 outParameterDecl '<ch.ivyteam.ivy.security.IUser user> result;
' #txt
Us0 f6 outParameterMapAction 'result.user=in.selectedUser;
' #txt
Us0 f6 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getSelectedUser()</name>
        <nameStyle>17,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f6 398 294 20 20 13 0 #rect
Us0 f6 @|RichDialogMethodStartIcon #fIcon
Us0 f7 guid 117AC696709CC20F #txt
Us0 f7 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f7 method getSelectedUsers() #txt
Us0 f7 disableUIEvents false #txt
Us0 f7 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f7 inActionCode 'import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.admin.tool.security.UserDTO;

List<UserDTO> listOfSelectedItem = panel.Table.getSelectedListEntries() as List<UserDTO>;
out.selectedUsers.clear();

if(out.users!=null && out.users.size()>0) {
	for(IUser user: out.users) {
		if(listOfSelectedItem!=null && listOfSelectedItem.size() > 0) {
			for(UserDTO dto: listOfSelectedItem) {
				if(user.getName().equalsIgnoreCase(dto.getUsername())) {
					out.selectedUsers.add(user);
				}
			}
		}
	}
}' #txt
Us0 f7 outParameterDecl '<List<ch.ivyteam.ivy.security.IUser> users> result;
' #txt
Us0 f7 outParameterMapAction 'result.users=in.selectedUsers;
' #txt
Us0 f7 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getSelectedUsers()</name>
        <nameStyle>18,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f7 222 294 20 20 13 0 #rect
Us0 f7 @|RichDialogMethodStartIcon #fIcon
Us0 f8 guid 117AC697013A7A66 #txt
Us0 f8 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f8 method getUsers() #txt
Us0 f8 disableUIEvents false #txt
Us0 f8 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f8 outParameterDecl '<List<ch.ivyteam.ivy.security.IUser> users> result;
' #txt
Us0 f8 outParameterMapAction 'result.users=in.users;
' #txt
Us0 f8 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>getUsers()</name>
        <nameStyle>10,5,6,9
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f8 398 38 20 20 13 0 #rect
Us0 f8 @|RichDialogMethodStartIcon #fIcon
Us0 f9 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f9 395 147 26 26 14 0 #rect
Us0 f9 @|RichDialogProcessEndIcon #fIcon
Us0 f10 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f10 219 371 26 26 14 0 #rect
Us0 f10 @|RichDialogProcessEndIcon #fIcon
Us0 f11 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f11 395 371 26 26 14 0 #rect
Us0 f11 @|RichDialogProcessEndIcon #fIcon
Us0 f12 expr out #txt
Us0 f12 408 314 408 371 #arcP
Us0 f13 expr out #txt
Us0 f13 232 314 232 371 #arcP
Us0 f14 expr out #txt
Us0 f14 408 58 408 147 #arcP
Us0 f15 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f15 550 238 20 20 13 0 #rect
Us0 f15 @|RichDialogProcessEndIcon #fIcon
Us0 f27 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f27 processCall 'Functional Processes/filter:filter(String,List)' #txt
Us0 f27 doCall true #txt
Us0 f27 requestActionDecl '<java.lang.String keyword,List<java.lang.Object> listToBeFiltered> param;
' #txt
Us0 f27 requestMappingAction 'param.keyword=in.keyword;
param.listToBeFiltered=in.originalUsers;
' #txt
Us0 f27 responseActionDecl 'ch.ivyteam.ivy.admin.tool.security.UserList.UserListData out;
' #txt
Us0 f27 responseMappingAction 'out=in;
out.userDTO=result.filteredList;
' #txt
Us0 f27 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter(String,List)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f27 542 148 36 24 20 -2 #rect
Us0 f27 @|CallSubIcon #fIcon
Us0 f18 expr out #txt
Us0 f18 560 172 560 238 #arcP
Us0 f16 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserList.UserListData out;
' #txt
Us0 f16 actionTable 'out=in;
' #txt
Us0 f16 actionCode 'out.keyword = panel.lookupUsers.text.trim();' #txt
Us0 f16 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f16 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>get keyword from UI</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f16 542 92 36 24 20 -2 #rect
Us0 f16 @|RichDialogProcessStepIcon #fIcon
Us0 f20 expr out #txt
Us0 f20 560 116 560 148 #arcP
Us0 f21 guid 1400AFB5343D5C08 #txt
Us0 f21 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f21 method filter() #txt
Us0 f21 disableUIEvents false #txt
Us0 f21 inParameterDecl 'ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent methodEvent = event as ch.ivyteam.ivy.richdialog.exec.RdMethodCallEvent;
<> param = methodEvent.getInputArguments();
' #txt
Us0 f21 outParameterDecl '<> result;
' #txt
Us0 f21 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter()</name>
    </language>
</elementInfo>
' #txt
Us0 f21 550 38 20 20 13 0 #rect
Us0 f21 @|RichDialogMethodStartIcon #fIcon
Us0 f22 expr out #txt
Us0 f22 560 58 560 92 #arcP
Us0 f23 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserList.UserListData out;
' #txt
Us0 f23 actionTable 'out=in;
' #txt
Us0 f23 actionCode panel.filter(); #txt
Us0 f23 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f23 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter</name>
        <nameStyle>6,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f23 214 148 36 24 20 -2 #rect
Us0 f23 @|RichDialogProcessStepIcon #fIcon
Us0 f5 expr out #txt
Us0 f5 232 172 232 235 #arcP
Us0 f31 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserList.UserListData out;
' #txt
Us0 f31 actionTable 'out=in;
' #txt
Us0 f31 actionCode 'import ch.ivyteam.ivy.admin.tool.util.CollectionSorts;
import ch.ivyteam.ivy.admin.tool.security.UserDTO;
import ch.ivyteam.ivy.security.IUser;

java.util.List<UserDTO> userDTOs = new java.util.ArrayList<UserDTO>();
for(IUser i: in.users) {
	UserDTO dto = new UserDTO();
	dto.setFullname(i.getFullName());
	dto.setUsername(i.getName());
	userDTOs.add(dto);
}
CollectionSorts.sortUserDTOByUserName(userDTOs);
out.originalUsers = userDTOs;
out.userDTO = userDTOs;' #txt
Us0 f31 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f31 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>set user table data</name>
        <nameStyle>19,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f31 214 92 36 24 20 -2 #rect
Us0 f31 @|RichDialogProcessStepIcon #fIcon
Us0 f32 expr out #txt
Us0 f32 232 58 232 92 #arcP
Us0 f24 expr out #txt
Us0 f24 232 116 232 148 #arcP
Us0 f25 actionDecl 'ch.ivyteam.ivy.admin.tool.security.UserList.UserListData out;
' #txt
Us0 f25 actionTable 'out=in;
' #txt
Us0 f25 actionCode panel.setUsers(in.users); #txt
Us0 f25 type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
Us0 f25 38 92 36 24 20 -2 #rect
Us0 f25 @|RichDialogProcessStepIcon #fIcon
Us0 f26 expr out #txt
Us0 f26 56 58 56 92 #arcP
Us0 f17 expr out #txt
Us0 f17 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>init table data</name>
        <nameStyle>15,7
</nameStyle>
    </language>
</elementInfo>
' #txt
Us0 f17 56 116 56 147 #arcP
Us0 f17 0 0.20512820512820512 47 0 #arcLabel
>Proto Us0 .rdData2UIAction 'panel.Table.listData=in.userDTO;
' #txt
>Proto Us0 .type ch.ivyteam.ivy.admin.tool.security.UserList.UserListData #txt
>Proto Us0 .processKind RICH_DIALOG #txt
>Proto Us0 -8 -8 16 16 16 26 #rect
>Proto Us0 '' #fIcon
Us0 f6 mainOut f12 tail #connect
Us0 f12 head f11 mainIn #connect
Us0 f7 mainOut f13 tail #connect
Us0 f13 head f10 mainIn #connect
Us0 f8 mainOut f14 tail #connect
Us0 f14 head f9 mainIn #connect
Us0 f27 mainOut f18 tail #connect
Us0 f18 head f15 mainIn #connect
Us0 f16 mainOut f20 tail #connect
Us0 f20 head f27 mainIn #connect
Us0 f21 mainOut f22 tail #connect
Us0 f22 head f16 mainIn #connect
Us0 f23 mainOut f5 tail #connect
Us0 f5 head f4 mainIn #connect
Us0 f3 mainOut f32 tail #connect
Us0 f32 head f31 mainIn #connect
Us0 f31 mainOut f24 tail #connect
Us0 f24 head f23 mainIn #connect
Us0 f0 mainOut f26 tail #connect
Us0 f26 head f25 mainIn #connect
Us0 f25 mainOut f17 tail #connect
Us0 f17 head f1 mainIn #connect
