package ch.ivyteam.ivy.admin.tool.report;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import org.apache.commons.io.FileUtils;

import ch.ivyteam.ivy.admin.tool.exception.SaieRuntimeException;

/**
 * Handle writing report to text file. This observes the changes in <code>ReportManager</code>
 */
public class ReportTextWriter implements Observer {
  private static final String NEW_LINE = "\n";
  private static final String ENVIRONMENT = "Environment";
  private static final String TMP_REPORT = "tmp-report.txt";
  private static final String INDENT = "   ";
  private static final String COLON = ": ";
  private static final String SEPARATOR = " - ";
  private File file;
  private static final int CHAR_SIZE = 5;

  public ReportTextWriter(File pFile) {
    super();
    if (pFile == null) {
      throw new IllegalArgumentException("File must not be null");
    }
    this.file = pFile;
    emptyFile(file);
  }

  @Override
  public void update(Observable observable, Object object) {
    if (object != null) {
      if (object instanceof ReportEntry) {
        writeReport((ReportEntry) object);
      } else if (object instanceof SummaryEntry) {
        writeSummary((SummaryEntry) object);
      }

    }
  }

  /**
   * Write each report entry to report file
   * 
   * @param entry
   */
  private void writeReport(ReportEntry entry) {
    PrintWriter out = null;
    try {
      out = new PrintWriter(new BufferedWriter(new FileWriter(file, true))); // NOSONAR
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(entry.getReportStatus());
      stringBuilder.append(SEPARATOR).append(entry.getActionType());
      stringBuilder.append(SEPARATOR).append(ENVIRONMENT).append(COLON).append(entry.getEnvironmentName());
      stringBuilder.append(SEPARATOR).append(entry.getConfigType()).append(COLON).append(entry.getConfigName());
      String message = getMessageOfEntry(entry);
      stringBuilder.append(message);
      out.println(stringBuilder);
    } catch (IOException e) {
      throw new SaieRuntimeException(e);
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }

  /**
   * 1 line if entry has 1 message<br>
   * multiple lines if entry has multiple messages
   * 
   * @param entry
   * @return
   */
  private String getMessageOfEntry(ReportEntry entry) {
    StringBuilder stringBuilder = new StringBuilder();
    if (entry.getMessages() != null && !entry.getMessages().isEmpty() && !"".equals(entry.getMessages().get(0))) {
      List<String> messages = entry.getMessages();

      stringBuilder.append(SEPARATOR);
      if (messages.size() > 1) {
        stringBuilder.append(NEW_LINE).append(INDENT);
      }
      Iterator<String> it = messages.iterator();
      while (it.hasNext()) {
        stringBuilder.append(it.next());
        if (it.hasNext()) {
          stringBuilder.append(NEW_LINE).append(INDENT);
        }
      }
    }
    return stringBuilder.toString();
  }

  /**
   * Write the summary to the top of file
   * 
   * @param entry
   */
  private void writeSummary(SummaryEntry entry) {
    PrintWriter out = null;
    try {
      if (file.exists()) {
        File tmpFile = backupReportFile();
        out = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));// NOSONAR
        writeSummarySection(entry, out);
        copyContentFromBackupFile(tmpFile, out);
        FileUtils.deleteQuietly(tmpFile);
      } else {
        out = new PrintWriter(new BufferedWriter(new FileWriter(file, false)));
        writeSummarySection(entry, out);
      }
    } catch (IOException e) {
      throw new SaieRuntimeException(e);
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }

  /**
   * Create the back up file for report
   * 
   * @return
   * @throws IOException
   */
  private File backupReportFile() throws IOException {
    File tmpFile = new File(TMP_REPORT);
    FileUtils.copyFile(file, tmpFile);
    return tmpFile;
  }

  /**
   * Write summary entry to report
   * 
   * @param entry
   * @param out
   */
  private void writeSummarySection(SummaryEntry entry, PrintWriter out) {
    out.println(getStringHeaderSummary());
    out.println(getStringGeneralSummary(entry));
    List<ISummaryEntry> envEntries = entry.getChildren();
    sortISummaryEntry(envEntries);
    for (ISummaryEntry envEntry : envEntries) {
      out.println(getStringEnvironmentSummary(envEntry));
      List<ISummaryEntry> confEntries = envEntry.getChildren();
      sortISummaryEntry(confEntries);
      for (ISummaryEntry confEntry : confEntries) {
        out.println(getStringConfigSummary(confEntry));
      }
    }
    out.println(getStringFooterSummary());
  }

  /**
   * Copy content from the back up file (after using <b>backupReportFile()</b> )
   * 
   * @param tmpFile
   * @param out
   * @throws IOException
   */
  private void copyContentFromBackupFile(File tmpFile, PrintWriter out) throws IOException {
    char[] buffer = new char[CHAR_SIZE];
    BufferedReader reader = new BufferedReader(new FileReader(tmpFile));// NOSONAR
    int numOfReadedBytes = reader.read(buffer);
    while (numOfReadedBytes != -1) {
      out.write(buffer, 0, numOfReadedBytes);
      numOfReadedBytes = reader.read(buffer);
    }
    reader.close();
  }

  /**
   * Add footer for summary
   */
  private String getStringFooterSummary() {
    return "*******************************************************************\n";
  }

  /**
   * Add header for summary
   */
  private String getStringHeaderSummary() {
    return "******************************SUMMARY******************************";
  }

  private String getStringGeneralSummary(SummaryEntry entry) {
    return getStatisticReportStatus(entry);
  }

  /**
   * @param entry
   * @return short summary of status
   */
  private String getStatisticReportStatus(ISummaryEntry entry) {
    StringBuilder builder = new StringBuilder();
    builder.append(ReportStatus.SUCCESS).append(COLON).append(entry.getNumOfSuccess());
    builder.append(SEPARATOR).append(ReportStatus.WARNING).append(COLON).append(entry.getNumOfWarning());
    builder.append(SEPARATOR).append(ReportStatus.ERROR).append(COLON).append(entry.getNumOfError());
    return builder.toString();
  }

  /**
   * @param envEntry
   * @return summary for each environment
   */
  private String getStringEnvironmentSummary(ISummaryEntry envEntry) {
    StringBuilder builder;
    builder = new StringBuilder();
    builder.append(NEW_LINE).append(INDENT).append(ENVIRONMENT).append(COLON).append(envEntry.getName());
    builder.append(SEPARATOR).append(getStatisticReportStatus(envEntry));
    return builder.toString();
  }

  /**
   * @param entry
   * @return summary for each configuration
   */
  private String getStringConfigSummary(ISummaryEntry entry) {
    StringBuilder builder = new StringBuilder();
    builder.append(INDENT).append(INDENT).append(entry.getName());
    builder.append(SEPARATOR).append(getStatisticReportStatus(entry));
    return builder.toString();
  }

  /**
   * Clear all the content of the file
   */
  private void emptyFile(File pFile) {
    PrintWriter out = null;
    try {
      out = new PrintWriter(new BufferedWriter(new FileWriter(pFile, false)));// NOSONAR
    } catch (IOException e) {
      throw new SaieRuntimeException(e);
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }

  private void sortISummaryEntry(List<ISummaryEntry> entries) {
    Collections.sort(entries, new Comparator<ISummaryEntry>() {
      @Override
      public int compare(ISummaryEntry o1, ISummaryEntry o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });
  }
}
