package kips;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class User", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class User extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 1359000504686178234L;

  private ch.ivyteam.ivy.security.IUser student;

  /**
   * Gets the field student.
   * @return the value of the field student; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getStudent()
  {
    return student;
  }

  /**
   * Sets the field student.
   * @param _student the new value of the field student.
   */
  public void setStudent(ch.ivyteam.ivy.security.IUser _student)
  {
    student = _student;
  }

  private ch.ivyteam.ivy.security.IUser mentor;

  /**
   * Gets the field mentor.
   * @return the value of the field mentor; may be null.
   */
  public ch.ivyteam.ivy.security.IUser getMentor()
  {
    return mentor;
  }

  /**
   * Sets the field mentor.
   * @param _mentor the new value of the field mentor.
   */
  public void setMentor(ch.ivyteam.ivy.security.IUser _mentor)
  {
    mentor = _mentor;
  }

  private java.lang.String studentUsername;

  /**
   * Gets the field studentUsername.
   * @return the value of the field studentUsername; may be null.
   */
  public java.lang.String getStudentUsername()
  {
    return studentUsername;
  }

  /**
   * Sets the field studentUsername.
   * @param _studentUsername the new value of the field studentUsername.
   */
  public void setStudentUsername(java.lang.String _studentUsername)
  {
    studentUsername = _studentUsername;
  }

  private java.lang.String mentorUsername;

  /**
   * Gets the field mentorUsername.
   * @return the value of the field mentorUsername; may be null.
   */
  public java.lang.String getMentorUsername()
  {
    return mentorUsername;
  }

  /**
   * Sets the field mentorUsername.
   * @param _mentorUsername the new value of the field mentorUsername.
   */
  public void setMentorUsername(java.lang.String _mentorUsername)
  {
    mentorUsername = _mentorUsername;
  }

  private java.lang.String MentoFullName;

  /**
   * Gets the field MentoFullName.
   * @return the value of the field MentoFullName; may be null.
   */
  public java.lang.String getMentoFullName()
  {
    return MentoFullName;
  }

  /**
   * Sets the field MentoFullName.
   * @param _MentoFullName the new value of the field MentoFullName.
   */
  public void setMentoFullName(java.lang.String _MentoFullName)
  {
    MentoFullName = _MentoFullName;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> allStudents;

  /**
   * Gets the field allStudents.
   * @return the value of the field allStudents; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getAllStudents()
  {
    return allStudents;
  }

  /**
   * Sets the field allStudents.
   * @param _allStudents the new value of the field allStudents.
   */
  public void setAllStudents(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _allStudents)
  {
    allStudents = _allStudents;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> allMentors;

  /**
   * Gets the field allMentors.
   * @return the value of the field allMentors; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> getAllMentors()
  {
    return allMentors;
  }

  /**
   * Sets the field allMentors.
   * @param _allMentors the new value of the field allMentors.
   */
  public void setAllMentors(ch.ivyteam.ivy.scripting.objects.List<ch.ivyteam.ivy.security.IUser> _allMentors)
  {
    allMentors = _allMentors;
  }

  private java.lang.Long mentorId;

  /**
   * Gets the field mentorId.
   * @return the value of the field mentorId; may be null.
   */
  public java.lang.Long getMentorId()
  {
    return mentorId;
  }

  /**
   * Sets the field mentorId.
   * @param _mentorId the new value of the field mentorId.
   */
  public void setMentorId(java.lang.Long _mentorId)
  {
    mentorId = _mentorId;
  }

  private java.lang.Long StudentId;

  /**
   * Gets the field StudentId.
   * @return the value of the field StudentId; may be null.
   */
  public java.lang.Long getStudentId()
  {
    return StudentId;
  }

  /**
   * Sets the field StudentId.
   * @param _StudentId the new value of the field StudentId.
   */
  public void setStudentId(java.lang.Long _StudentId)
  {
    StudentId = _StudentId;
  }

  private java.lang.String StudentFullName;

  /**
   * Gets the field StudentFullName.
   * @return the value of the field StudentFullName; may be null.
   */
  public java.lang.String getStudentFullName()
  {
    return StudentFullName;
  }

  /**
   * Sets the field StudentFullName.
   * @param _StudentFullName the new value of the field StudentFullName.
   */
  public void setStudentFullName(java.lang.String _StudentFullName)
  {
    StudentFullName = _StudentFullName;
  }

  private java.lang.String mentorMail;

  /**
   * Gets the field mentorMail.
   * @return the value of the field mentorMail; may be null.
   */
  public java.lang.String getMentorMail()
  {
    return mentorMail;
  }

  /**
   * Sets the field mentorMail.
   * @param _mentorMail the new value of the field mentorMail.
   */
  public void setMentorMail(java.lang.String _mentorMail)
  {
    mentorMail = _mentorMail;
  }

  private java.lang.String studentMail;

  /**
   * Gets the field studentMail.
   * @return the value of the field studentMail; may be null.
   */
  public java.lang.String getStudentMail()
  {
    return studentMail;
  }

  /**
   * Sets the field studentMail.
   * @param _studentMail the new value of the field studentMail.
   */
  public void setStudentMail(java.lang.String _studentMail)
  {
    studentMail = _studentMail;
  }

}
