package kips;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class Appointment", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class Appointment extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7645262192324413392L;

  private java.lang.Number id;

  /**
   * Gets the field id.
   * @return the value of the field id; may be null.
   */
  public java.lang.Number getId()
  {
    return id;
  }

  /**
   * Sets the field id.
   * @param _id the new value of the field id.
   */
  public void setId(java.lang.Number _id)
  {
    id = _id;
  }

  private java.util.Date date;

  /**
   * Gets the field date.
   * @return the value of the field date; may be null.
   */
  public java.util.Date getDate()
  {
    return date;
  }

  /**
   * Sets the field date.
   * @param _date the new value of the field date.
   */
  public void setDate(java.util.Date _date)
  {
    date = _date;
  }

  private ch.ivyteam.ivy.scripting.objects.Time start;

  /**
   * Gets the field start.
   * @return the value of the field start; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Time getStart()
  {
    return start;
  }

  /**
   * Sets the field start.
   * @param _start the new value of the field start.
   */
  public void setStart(ch.ivyteam.ivy.scripting.objects.Time _start)
  {
    start = _start;
  }

  private ch.ivyteam.ivy.scripting.objects.Time end;

  /**
   * Gets the field end.
   * @return the value of the field end; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Time getEnd()
  {
    return end;
  }

  /**
   * Sets the field end.
   * @param _end the new value of the field end.
   */
  public void setEnd(ch.ivyteam.ivy.scripting.objects.Time _end)
  {
    end = _end;
  }

  private java.lang.String subject;

  /**
   * Gets the field subject.
   * @return the value of the field subject; may be null.
   */
  public java.lang.String getSubject()
  {
    return subject;
  }

  /**
   * Sets the field subject.
   * @param _subject the new value of the field subject.
   */
  public void setSubject(java.lang.String _subject)
  {
    subject = _subject;
  }

  private java.lang.Boolean available;

  /**
   * Gets the field available.
   * @return the value of the field available; may be null.
   */
  public java.lang.Boolean getAvailable()
  {
    return available;
  }

  /**
   * Sets the field available.
   * @param _available the new value of the field available.
   */
  public void setAvailable(java.lang.Boolean _available)
  {
    available = _available;
  }

  private java.lang.String Student;

  /**
   * Gets the field Student.
   * @return the value of the field Student; may be null.
   */
  public java.lang.String getStudent()
  {
    return Student;
  }

  /**
   * Sets the field Student.
   * @param _Student the new value of the field Student.
   */
  public void setStudent(java.lang.String _Student)
  {
    Student = _Student;
  }

  private java.lang.String Mentor;

  /**
   * Gets the field Mentor.
   * @return the value of the field Mentor; may be null.
   */
  public java.lang.String getMentor()
  {
    return Mentor;
  }

  /**
   * Sets the field Mentor.
   * @param _Mentor the new value of the field Mentor.
   */
  public void setMentor(java.lang.String _Mentor)
  {
    Mentor = _Mentor;
  }

  private java.lang.String location;

  /**
   * Gets the field location.
   * @return the value of the field location; may be null.
   */
  public java.lang.String getLocation()
  {
    return location;
  }

  /**
   * Sets the field location.
   * @param _location the new value of the field location.
   */
  public void setLocation(java.lang.String _location)
  {
    location = _location;
  }

  private ch.ivyteam.ivy.scripting.objects.Recordset appointmentList;

  /**
   * Gets the field appointmentList.
   * @return the value of the field appointmentList; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Recordset getAppointmentList()
  {
    return appointmentList;
  }

  /**
   * Sets the field appointmentList.
   * @param _appointmentList the new value of the field appointmentList.
   */
  public void setAppointmentList(ch.ivyteam.ivy.scripting.objects.Recordset _appointmentList)
  {
    appointmentList = _appointmentList;
  }

  private ch.ivyteam.ivy.scripting.objects.Record appointment;

  /**
   * Gets the field appointment.
   * @return the value of the field appointment; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.Record getAppointment()
  {
    return appointment;
  }

  /**
   * Sets the field appointment.
   * @param _appointment the new value of the field appointment.
   */
  public void setAppointment(ch.ivyteam.ivy.scripting.objects.Record _appointment)
  {
    appointment = _appointment;
  }

}
