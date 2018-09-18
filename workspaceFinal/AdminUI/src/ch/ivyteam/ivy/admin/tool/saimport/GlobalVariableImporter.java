package ch.ivyteam.ivy.admin.tool.saimport;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.GlobalVariables.GlobalVariable;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.application.restricted.IGlobalVariable;

public class GlobalVariableImporter extends AbstractImporter {

  @Override
  protected void importConfig(IEnvironment iEnvironment, Environment environment, ReportObservable report) {
    report.startLog(iEnvironment.getName(), ConfigType.GLOBAL_VARIABLE);
    List<GlobalVariable> globalVarList = environment.getGlobalVariables().getGlobalVariableList();
    for (GlobalVariable globalVar : globalVarList) {
      try {
        IGlobalVariable iGlobalVariable = iEnvironment.findGlobalVariable(globalVar.getName());
        if (iGlobalVariable != null) {
          String name = globalVar.getName() == null ? StringUtils.EMPTY : globalVar.getName();
          String description = globalVar.getDescription() == null ? StringUtils.EMPTY : globalVar.getDescription();
          String value = globalVar.getValue() == null ? StringUtils.EMPTY : globalVar.getValue();
          if (iGlobalVariable.getDefaultGlobalVariable() == null
              && !iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
            iEnvironment.createGlobalVariable(name, description, value);
            ReportEntry entry =
                createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), globalVar.getName(),
                    "Created overridden configuration");
            report.log(entry);
          } else {
            iGlobalVariable.setDescription(description);
            iGlobalVariable.setValue(value);
            ReportEntry entry =
                createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), globalVar.getName(),
                    "Updated overridden configuration");
            report.log(entry);
          }
        } else {
          LOGGER
              .warn("The global variable "
                  + globalVar.getName()
                  + " in the import file was not imported because the global variable does not exist in the target application");
          ReportEntry entry =
              createReportEntry(ReportStatus.WARNING, iEnvironment.getName(), globalVar.getName(),
                  "Default configuration does not exist");
          report.log(entry);
        }
      } catch (Exception e) {
        LOGGER.error(e);
      }
    }
    deleteGlobalVariables(iEnvironment, globalVarList, report);
  }

  /**
   * Remove overridden global variables of an environment
   * 
   * @param iEnvironment
   */
  private void deleteGlobalVariables(IEnvironment iEnvironment, List<GlobalVariable> globalVariables,
      ReportObservable report) {
    for (IGlobalVariable iGlobalVariable : iEnvironment.getGlobalVariables()) {
      if (iGlobalVariable.getDefaultGlobalVariable() != null && !isOveridden(iGlobalVariable, globalVariables)) {
        String globalVarName = iGlobalVariable.getName();
        iEnvironment.deleteGlobalVariable(globalVarName);
        ReportEntry entry =
            createReportEntry(ReportStatus.SUCCESS, iEnvironment.getName(), globalVarName,
                "Deleted overridden configuration");
        report.log(entry);
      }
    }
  }

  /**
   * Check if a global variable in system exist in imported file
   * 
   * @param iGlobalVariable
   * @param globalVariables
   * @return
   */
  private boolean isOveridden(IGlobalVariable iGlobalVariable, List<GlobalVariable> globalVariables) {
    boolean flag = false;
    for (GlobalVariable globalVariable : globalVariables) {
      if (iGlobalVariable.getName().equals(globalVariable.getName())) {
        flag = true;
      }
    }
    return flag;
  }

  /**
   * Write report entry for global variable import with single message
   * 
   * @param entryType
   * @param environmentName
   * @param configName
   * @param message
   * @return
   */
  private ReportEntry createReportEntry(ReportStatus entryType, String environmentName, String configName,
      String message) {
    ReportEntry entry = new ReportEntry();
    entry.setActionType(ActionType.IMPORT);
    entry.setConfigType(ConfigType.GLOBAL_VARIABLE);
    entry.setReportStatus(entryType);
    entry.setEnvironmentName(environmentName);
    entry.setConfigName(configName);
    entry.setMessage(message);

    return entry;
  }
}
