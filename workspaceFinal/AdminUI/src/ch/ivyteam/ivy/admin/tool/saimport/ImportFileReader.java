package ch.ivyteam.ivy.admin.tool.saimport;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBException;

import ch.ivyteam.ivy.admin.tool.domain.Applications.Application.Environment;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.scripting.objects.Record;
import ch.ivyteam.ivy.scripting.objects.Recordset;

public final class ImportFileReader {

  private ImportFileReader() {}

  public static Recordset read(List<IEnvironment> environments, IEnvironment defaultEnvironment, File importFile)
      throws JAXBException {

    List<Environment> importedEnvironments =
        AbstractImporter.parse(importFile).getApplicationList().get(0).getEnvironmentList();

    Recordset recordset = new Recordset();
    for (Environment environment : importedEnvironments) {
      Record record = new Record();
      record.putField("sourceEnv", environment);

      IEnvironment env = findEnvironment(environments, environment.getName());
      if (env != null) {
        record.putField("state", true);
        record.putField("targetEnv", env);
      } else {
        record.putField("state", false);
        record.putField("targetEnv", defaultEnvironment);
      }
      recordset.add(record);
    }
    return recordset;
  }

  private static IEnvironment findEnvironment(List<IEnvironment> environments, String environmentName) {
    for (IEnvironment environment : environments) {
      if (environmentName.equalsIgnoreCase(environment.getName())) {
        return environment;
      }
    }
    return null;
  }
}
