[Ivy]
[>Created: Fri Aug 08 13:59:45 ICT 2014]
1400A564677D48F9 3.17 #module
>Proto >Proto Collection #zClass
fr0 filter Big #zClass
fr0 B #cInfo
fr0 #process
fr0 @TextInP .resExport .resExport #zField
fr0 @TextInP .type .type #zField
fr0 @TextInP .processKind .processKind #zField
fr0 @AnnotationInP-0n ai ai #zField
fr0 @TextInP .xml .xml #zField
fr0 @TextInP .responsibility .responsibility #zField
fr0 @StartSub f0 '' #zField
fr0 @EndSub f1 '' #zField
fr0 @GridStep f2 '' #zField
fr0 @PushWFArc f4 '' #zField
fr0 @Alternative f5 '' #zField
fr0 @PushWFArc f6 '' #zField
fr0 @PushWFArc f8 '' #zField
fr0 @PushWFArc f3 '' #zField
>Proto fr0 fr0 filter #zField
fr0 f0 inParamDecl '<java.lang.String keyword,List<java.lang.Object> listToBeFiltered> param;' #txt
fr0 f0 inParamTable 'out.keyword=param.keyword;
out.listToBeFiltered=param.listToBeFiltered.deepClone();
' #txt
fr0 f0 outParamDecl '<List<java.lang.Object> filteredList> result;
' #txt
fr0 f0 outParamTable 'result.filteredList=in.listToBeFiltered;
' #txt
fr0 f0 actionDecl 'ch.ivyteam.ivy.admin.tool.process.Filter out;
' #txt
fr0 f0 callSignature filter(String,List) #txt
fr0 f0 type ch.ivyteam.ivy.admin.tool.process.Filter #txt
fr0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter(String,List)</name>
        <nameStyle>19,5,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fr0 f0 83 51 26 26 14 0 #rect
fr0 f0 @|StartSubIcon #fIcon
fr0 f1 type ch.ivyteam.ivy.admin.tool.process.Filter #txt
fr0 f1 83 235 26 26 14 0 #rect
fr0 f1 @|EndSubIcon #fIcon
fr0 f2 actionDecl 'ch.ivyteam.ivy.admin.tool.process.Filter out;
' #txt
fr0 f2 actionTable 'out=in;
' #txt
fr0 f2 actionCode 'import java.util.regex.PatternSyntaxException;
import ch.ivyteam.ivy.security.IUser;
import ch.ivyteam.ivy.admin.tool.security.UserDTO;
import java.util.regex.Pattern;

try {
	String regex = "(.*)" + in.keyword + "(.*)";
	Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	List<Object> filteredList = new List<Object>();
	for(Object obj : in.listToBeFiltered){
		if(obj instanceof UserDTO){
			UserDTO user = obj as UserDTO;
			if(p.matcher(user.username).matches() || p.matcher(user.fullname).matches()){
				filteredList.add(user);
			}
		} else if(obj instanceof IUser){
			IUser user = obj as IUser;
			if(p.matcher(user.getName()).matches() || p.matcher(user.getFullName()).matches()){
				filteredList.add(user);
			}
		}
	}
	in.listToBeFiltered.clear();
	in.listToBeFiltered.addAll(filteredList);
} catch(PatternSyntaxException e){
	in.listToBeFiltered.clear();
}

' #txt
fr0 f2 type ch.ivyteam.ivy.admin.tool.process.Filter #txt
fr0 f2 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>filter</name>
        <nameStyle>6,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fr0 f2 78 172 36 24 20 -2 #rect
fr0 f2 @|StepIcon #fIcon
fr0 f4 expr out #txt
fr0 f4 96 196 96 235 #arcP
fr0 f5 type ch.ivyteam.ivy.admin.tool.process.Filter #txt
fr0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>is keyword empty?</name>
        <nameStyle>17,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fr0 f5 82 106 28 28 14 -19 #rect
fr0 f5 @|AlternativeIcon #fIcon
fr0 f6 expr out #txt
fr0 f6 96 77 96 106 #arcP
fr0 f8 expr in #txt
fr0 f8 outCond in.keyword.isEmpty() #txt
fr0 f8 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>YES</name>
        <nameStyle>3,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fr0 f8 6 #arcStyle
fr0 f8 110 120 109 248 #arcP
fr0 f8 1 200 120 #addKink
fr0 f8 2 200 248 #addKink
fr0 f8 1 0.2835978470397434 0 0 #arcLabel
fr0 f3 expr in #txt
fr0 f3 .xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>NO</name>
        <nameStyle>2,7
</nameStyle>
    </language>
</elementInfo>
' #txt
fr0 f3 3 #arcStyle
fr0 f3 96 134 96 172 #arcP
fr0 f3 0 0.631578947368421 0 0 #arcLabel
>Proto fr0 .type ch.ivyteam.ivy.admin.tool.process.Filter #txt
>Proto fr0 .processKind CALLABLE_SUB #txt
>Proto fr0 0 0 32 24 18 0 #rect
>Proto fr0 @|BIcon #fIcon
fr0 f2 mainOut f4 tail #connect
fr0 f4 head f1 mainIn #connect
fr0 f0 mainOut f6 tail #connect
fr0 f6 head f5 in #connect
fr0 f5 out f8 tail #connect
fr0 f8 head f1 mainIn #connect
fr0 f5 out f3 tail #connect
fr0 f3 head f2 mainIn #connect
