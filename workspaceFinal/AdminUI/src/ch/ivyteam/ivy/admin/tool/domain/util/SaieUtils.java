package ch.ivyteam.ivy.admin.tool.domain.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import ch.ivyteam.ivy.admin.tool.exception.SaieRuntimeException;
import ch.ivyteam.ivy.admin.tool.report.ActionType;
import ch.ivyteam.ivy.admin.tool.saimport.AbstractImporter;
import ch.ivyteam.ivy.application.restricted.IEnvironment;
import ch.ivyteam.ivy.security.PermissionDeniedException;
import ch.ivyteam.ivy.server.ServerFactory;

/**
 * Helper for common function of SAIE
 */
public final class SaieUtils {
  private static final String REPORT_FOLDER = "logs/import-export-reports";
  private static final String EXTERNAL_HOSTNAME_PROP = "WebServer.ExternalHostName";

  private SaieUtils() {}

  /**
   * Get schema to validate the xml data when unmarshalling
   * 
   * @return
   */
  public static Schema getSchema() {
    SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
    // Do not know (or cannot) how to create a java.io.File for the xsd file inside a jar file
    // Use InputStream instead because the xsd file will be packaged in a jar file
    InputStream inputStream = AbstractImporter.class.getResourceAsStream(SaieConstant.ENVIRONMENTS_XSD);
    Source soureSchema = new SAXSource(new InputSource(inputStream));
    try {
      return schemaFactory.newSchema(soureSchema);
    } catch (SAXException e) {
      throw new SaieRuntimeException(e);
    } finally {
      try {
        inputStream.close();
      } catch (IOException e) {
        throw new SaieRuntimeException(e);
      }
    }
  }

  /**
   * Return report file correlative with action type import/export
   * 
   * @param actionType
   * @return
   */
  public static File getReportFile(ActionType actionType) {
    File reportFolder = new File(REPORT_FOLDER);
    if (!reportFolder.exists()) {
      // SONAR-OFF
      reportFolder.mkdirs();
      // SONAR-ON
    }
    StringBuilder builder = new StringBuilder();
    builder.append(REPORT_FOLDER).append("/").append(actionType.toString()).append("-").append(new Date().getTime())
        .append(".log");
    return new File(builder.toString());
  }

  /**
   * Get host name of server
   * 
   * @return host name of server
   */
  public static String getHostName() {
    try {
      String hostname =
          ServerFactory.getServer().getApplicationConfigurationManager()
              .getConfigurationProperty(EXTERNAL_HOSTNAME_PROP).getValue();
      return hostname;
    } catch (PermissionDeniedException e) {
      throw new SaieRuntimeException(e);
    }
  }

  /**
   * Check if a string contains valid Ivy Scripts
   * 
   * @param arg
   * @return
   */
  public static boolean isValidScripts(String arg) {
    StringBuilder temp = new StringBuilder(arg);
    int scriptStartIndex = temp.indexOf("<%", -1);
    int scriptEndIndex = 0;
    int syntaxValid = 0;
    while (scriptStartIndex > -1) {
      syntaxValid++;
      temp.replace(scriptStartIndex, scriptStartIndex + 2, "");
      scriptEndIndex = temp.indexOf("%>", scriptStartIndex);
      if (scriptEndIndex > -1) {
        temp.replace(scriptEndIndex, scriptEndIndex + 2, "");
        syntaxValid--;
      }
      scriptStartIndex = temp.indexOf("<%", scriptStartIndex);
    }
    scriptEndIndex = temp.indexOf("%>", 0);
    if (scriptEndIndex > -1) {
      return false;
    }
    return (syntaxValid == 0);
  }

  public static void sortIEnvironment(List<IEnvironment> iEnvironments) {
    Collections.sort(iEnvironments, new Comparator<IEnvironment>() {
      @Override
      public int compare(IEnvironment o1, IEnvironment o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
  }

  public static void sortNonExistedEnvironment(List<NonExistedEnvironment> nonExistedEnvs) {
    Collections.sort(nonExistedEnvs, new Comparator<NonExistedEnvironment>() {
      @Override
      public int compare(NonExistedEnvironment o1, NonExistedEnvironment o2) {
        return o1.getEnvironmentName().compareTo(o2.getEnvironmentName());
      }
    });
  }
}
