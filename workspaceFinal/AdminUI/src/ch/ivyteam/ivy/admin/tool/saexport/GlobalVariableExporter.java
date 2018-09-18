package ch.ivyteam.ivy.admin.tool.saexport;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.GlobalVariables;
import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment.GlobalVariables.GlobalVariable;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.report.ConfigType;
import ch.ivyteam.ivy.admin.tool.report.ReportEntry;
import ch.ivyteam.ivy.admin.tool.report.ReportObservable;
import ch.ivyteam.ivy.admin.tool.report.ReportStatus;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.application.restricted.IGlobalVariable;

/**
 * Global variables exporter using JAXB
 */
public class GlobalVariableExporter extends AbstractExporter {

  @Override
  protected void createEnvironment(IEnvironment iEnvironment, Environment environment, ReportObservable report,
      boolean isIncludeUsernameAndPassword) {
    String environmentName = iEnvironment.getName();
    GlobalVariables globalVariables = new GlobalVariables();
    List<IGlobalVariable> iGlobalVariables = iEnvironment.getGlobalVariables();
    for (int i = 0; i < iGlobalVariables.size(); i++) {
      report.startLog(iEnvironment.getName(), ConfigType.GLOBAL_VARIABLE);
      IGlobalVariable iGlobalVariable = iGlobalVariables.get(i);
      String configName = iGlobalVariable.getName();
      if (iGlobalVariable.getDefaultGlobalVariable() != null
          || iEnvironment.getName().equals(IEnvironment.DEFAULT_ENVIRONMENT_NAME)) {
        GlobalVariable globalVariable = new GlobalVariable();
        globalVariable.setName(iGlobalVariable.getName());
        globalVariable.setDescription(iGlobalVariable.getDescription());
        globalVariable.setValue(iGlobalVariable.getValue());
        globalVariables.getGlobalVariableList().add(globalVariable);
        report.log(new ReportEntry(ReportStatus.SUCCESS, ActionType.EXPORT, environmentName,
            ConfigType.GLOBAL_VARIABLE, configName, StringUtils.EMPTY));
      }
    }
    environment.setGlobalVariables(globalVariables);
  }
}
