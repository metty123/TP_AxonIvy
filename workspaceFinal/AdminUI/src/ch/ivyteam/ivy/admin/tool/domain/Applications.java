package ch.ivyteam.ivy.admin.tool.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"schemaVersion", "hostname", "application"})
@XmlRootElement(name = "applications")
public class Applications {

  @XmlElement(name = "schema-version", required = true)
  private Integer schemaVersion;
  private String hostname;
  @XmlElement(required = true)
  private List<Application> application;

  /**
   * Gets the value of the schemaVersion property.
   * 
   * @return possible object is {@link java.math.BigInteger }
   * 
   */
  public Integer getSchemaVersion() {
    return schemaVersion;
  }

  /**
   * Sets the value of the schemaVersion property.
   * 
   * @param value allowed object is {@link Integer }
   * 
   */
  public void setSchemaVersion(Integer value) {
    this.schemaVersion = value;
  }

  /**
   * Gets the value of the hostname property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * Sets the value of the hostname property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setHostname(String value) {
    this.hostname = value;
  }

  /**
   * Gets the value of the application property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
   * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
   * the application property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
   * getApplication().add(newItem);
   * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link Application }
   * 
   * 
   */
  public List<Application> getApplicationList() {
    if (application == null) {
      application = new ArrayList<Application>();
    }
    return this.application;
  }

  /**
   * <p>
   * Java class for anonymous complex type.
   * 
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="environment" maxOccurs="unbounded" minOccurs="0">
   *           &lt;complexType>
   *             &lt;complexContent>
   *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                 &lt;sequence>
   *                   &lt;element name="webServices" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="webService" maxOccurs="unbounded" minOccurs="0">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="securitySetting" maxOccurs="unbounded" minOccurs="0">
   *                                         &lt;complexType>
   *                                           &lt;complexContent>
   *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                               &lt;attribute name="authType" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                               &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                               &lt;attribute name="sessionHandlingMode" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                               &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                             &lt;/restriction>
   *                                           &lt;/complexContent>
   *                                         &lt;/complexType>
   *                                       &lt;/element>
   *                                       &lt;element name="endPoints" maxOccurs="unbounded" minOccurs="0">
   *                                         &lt;complexType>
   *                                           &lt;complexContent>
   *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                               &lt;sequence>
   *                                                 &lt;element name="portType" maxOccurs="unbounded" minOccurs="0">
   *                                                   &lt;complexType>
   *                                                     &lt;complexContent>
   *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                                         &lt;sequence>
   *                                                           &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
   *                                                             &lt;complexType>
   *                                                               &lt;complexContent>
   *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                                                   &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                                                   &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                                                 &lt;/restriction>
   *                                                               &lt;/complexContent>
   *                                                             &lt;/complexType>
   *                                                           &lt;/element>
   *                                                         &lt;/sequence>
   *                                                         &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                                       &lt;/restriction>
   *                                                     &lt;/complexContent>
   *                                                   &lt;/complexType>
   *                                                 &lt;/element>
   *                                               &lt;/sequence>
   *                                             &lt;/restriction>
   *                                           &lt;/complexContent>
   *                                         &lt;/complexType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="databaseConfigs" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="databaseConfig" maxOccurs="unbounded" minOccurs="0">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="property" maxOccurs="unbounded" minOccurs="0">
   *                                         &lt;complexType>
   *                                           &lt;complexContent>
   *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                             &lt;/restriction>
   *                                           &lt;/complexContent>
   *                                         &lt;/complexType>
   *                                       &lt;/element>
   *                                     &lt;/sequence>
   *                                     &lt;attribute name="connectionUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="driverName" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="maxConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="globalVariables" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;sequence>
   *                             &lt;element name="globalVariable" maxOccurs="unbounded" minOccurs="0">
   *                               &lt;complexType>
   *                                 &lt;complexContent>
   *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                                     &lt;sequence>
   *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
   *                                     &lt;/sequence>
   *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                                   &lt;/restriction>
   *                                 &lt;/complexContent>
   *                               &lt;/complexType>
   *                             &lt;/element>
   *                           &lt;/sequence>
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                   &lt;element name="businessCalendar" maxOccurs="unbounded" minOccurs="0">
   *                     &lt;complexType>
   *                       &lt;complexContent>
   *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *                         &lt;/restriction>
   *                       &lt;/complexContent>
   *                     &lt;/complexType>
   *                   &lt;/element>
   *                 &lt;/sequence>
   *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *               &lt;/restriction>
   *             &lt;/complexContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *       &lt;/sequence>
   *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   * 
   * 
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"environment"})
  public static class Application {

    @XmlElement(required = true)
    private List<Environment> environment;
    @XmlAttribute
    private String name;

    /**
     * Gets the value of the environment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the environment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Environment }
     * 
     * 
     */
    public List<Environment> getEnvironmentList() {
      if (environment == null) {
        environment = new ArrayList<Environment>();
      }
      return this.environment;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
      return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
      this.name = value;
    }

    /**
     * <p>
     * Java class for anonymous complex type.
     * 
     * <p>
     * The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="webServices" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="webService" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="securitySetting" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="authType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="endPoints" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="portType" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                                         &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="framework" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="databaseConfigs" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="databaseConfig" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="property" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="connectionUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="driverName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="maxConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="globalVariables" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="globalVariable" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"webServices", "databaseConfigs", "globalVariables", "businessCalendar"})
    public static class Environment {

      private Applications.Application.Environment.WebServices webServices;
      private Applications.Application.Environment.DatabaseConfigs databaseConfigs;
      private Applications.Application.Environment.GlobalVariables globalVariables;
      private Applications.Application.Environment.BusinessCalendar businessCalendar;
      @XmlAttribute
      private Integer id;
      @XmlAttribute
      private String name;

      public Applications.Application.Environment.WebServices getWebServices() {
        if (webServices == null) {
          webServices = new Applications.Application.Environment.WebServices();
        }
        return this.webServices;
      }

      public Applications.Application.Environment.DatabaseConfigs getDatabaseConfigs() {
        if (databaseConfigs == null) {
          databaseConfigs = new Applications.Application.Environment.DatabaseConfigs();
        }
        return this.databaseConfigs;
      }

      public Applications.Application.Environment.GlobalVariables getGlobalVariables() {
        if (globalVariables == null) {
          globalVariables = new Applications.Application.Environment.GlobalVariables();
        }
        return this.globalVariables;
      }

      public void setWebServices(Applications.Application.Environment.WebServices pWebServices) {
        this.webServices = pWebServices;
      }

      public void setDatabaseConfigs(Applications.Application.Environment.DatabaseConfigs pDatabaseConfigs) {
        this.databaseConfigs = pDatabaseConfigs;
      }

      public void setGlobalVariables(Applications.Application.Environment.GlobalVariables pGlobalVariables) {
        this.globalVariables = pGlobalVariables;
      }

      /**
       * Gets the value of the id property.
       * 
       * @return possible object is {@link Integer }
       * 
       */
      public Integer getId() {
        return id;
      }

      /**
       * Sets the value of the id property.
       * 
       * @param value allowed object is {@link Integer }
       * 
       */
      public void setId(Integer value) {
        this.id = value;
      }

      /**
       * Gets the value of the name property.
       * 
       * @return possible object is {@link String }
       * 
       */
      public String getName() {
        return name;
      }

      /**
       * Sets the value of the name property.
       * 
       * @param value allowed object is {@link String }
       * 
       */
      public void setName(String value) {
        this.name = value;
      }

      /**
       * Gets the value of the businessCalendar property.
       * 
       * <p>
       * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make
       * to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method
       * for the businessCalendar property.
       * 
       * <p>
       * For example, to add a new item, do as follows:
       * 
       * <pre>
       * getBusinessCalendarList().add(newItem);
       * </pre>
       * 
       * 
       * <p>
       * Objects of the following type(s) are allowed in the list
       * {@link Applications.Environment.BusinessCalendars.BusinessCalendar }
       * 
       * 
       */
      public Applications.Application.Environment.BusinessCalendar getBusinessCalendar() {
        if (businessCalendar == null) {
          businessCalendar = new Applications.Application.Environment.BusinessCalendar();
        }
        return this.businessCalendar;
      }

      public void setBusinessCalendar(Applications.Application.Environment.BusinessCalendar pBusinessCalendar) {
        this.businessCalendar = pBusinessCalendar;
      }

      /**
       * <p>
       * Java class for anonymous complex type.
       * 
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       * 
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="databaseConfig" maxOccurs="unbounded" minOccurs="0">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="property" maxOccurs="unbounded" minOccurs="0">
       *                     &lt;complexType>
       *                       &lt;complexContent>
       *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                         &lt;/restriction>
       *                       &lt;/complexContent>
       *                     &lt;/complexType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *                 &lt;attribute name="connectionUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="driverName" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="maxConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="userName" type="{http://www.w3.org/2001/XMLSchema}string" />
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       * 
       * 
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"databaseConfig"})
      public static class DatabaseConfigs {

        private List<Applications.Application.Environment.DatabaseConfigs.DatabaseConfig> databaseConfig;

        /**
         * Gets the value of the databaseConfig property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
         * make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE>
         * method for the databaseConfig property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getDatabaseConfigList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Applications.Environment.DatabaseConfigs.DatabaseConfig }
         * 
         * 
         */
        public List<Applications.Application.Environment.DatabaseConfigs.DatabaseConfig> getDatabaseConfigList() {
          if (databaseConfig == null) {
            databaseConfig = new ArrayList<Applications.Application.Environment.DatabaseConfigs.DatabaseConfig>();
          }
          return this.databaseConfig;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="property" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="connectionUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="driverName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="maxConnection" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"property"})
        public static class DatabaseConfig {

          private List<Applications.Application.Environment.DatabaseConfigs.DatabaseConfig.Property> property;
          @XmlAttribute
          private String id;
          @XmlAttribute
          private String connectionUrl;
          @XmlAttribute
          private String driverName;
          @XmlAttribute
          private Integer maxConnection;
          @XmlAttribute
          private String password;
          @XmlAttribute
          private String username;

          /**
           * Gets the value of the property property.
           * 
           * <p>
           * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
           * make to the returned list will be present inside the JAXB object. This is why there is not a
           * <CODE>set</CODE> method for the property property.
           * 
           * <p>
           * For example, to add a new item, do as follows:
           * 
           * <pre>
           * getProperty().add(newItem);
           * </pre>
           * 
           * 
           * <p>
           * Objects of the following type(s) are allowed in the list
           * {@link Applications.Environment.DatabaseConfigs.DatabaseConfig.Property }
           * 
           * 
           */
          public List<Applications.Application.Environment.DatabaseConfigs.DatabaseConfig.Property> getPropertyList() {
            if (property == null) {
              property = new ArrayList<Applications.Application.Environment.DatabaseConfigs.DatabaseConfig.Property>();
            }
            return this.property;
          }

          public String getId() {
            return this.id;
          }

          public void setId(String value) {
            this.id = value;
          }

          /**
           * Gets the value of the connectionUrl property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getConnectionUrl() {
            return connectionUrl;
          }

          /**
           * Sets the value of the connectionUrl property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setConnectionUrl(String value) {
            this.connectionUrl = value;
          }

          /**
           * Gets the value of the driverName property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getDriverName() {
            return driverName;
          }

          /**
           * Sets the value of the driverName property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setDriverName(String value) {
            this.driverName = value;
          }

          /**
           * Gets the value of the maxConnection property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public Integer getMaxConnection() {
            return maxConnection;
          }

          /**
           * Sets the value of the maxConnection property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setMaxConnection(Integer value) {
            this.maxConnection = value;
          }

          /**
           * Gets the value of the password property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getPassword() {
            return password;
          }

          /**
           * Sets the value of the password property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setPassword(String value) {
            this.password = value;
          }

          /**
           * Gets the value of the userName property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getUsername() {
            return username;
          }

          /**
           * Sets the value of the userName property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setUsername(String value) {
            this.username = value;
          }

          /**
           * <p>
           * Java class for anonymous complex type.
           * 
           * <p>
           * The following schema fragment specifies the expected content contained within this class.
           * 
           * <pre>
           * &lt;complexType>
           *   &lt;complexContent>
           *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
           *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
           *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
           *     &lt;/restriction>
           *   &lt;/complexContent>
           * &lt;/complexType>
           * </pre>
           * 
           * 
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(name = "")
          public static class Property {

            @XmlAttribute
            private String name;
            @XmlAttribute
            private String value;

            /**
             * Gets the value of the name property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getName() {
              return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param pName allowed object is {@link String }
             * 
             */
            public void setName(String pName) {
              this.name = pName;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getValue() {
              return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param pValue allowed object is {@link String }
             * 
             */
            public void setValue(String pValue) {
              this.value = pValue;
            }
          }
        }
      }

      /**
       * <p>
       * Java class for anonymous complex type.
       * 
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       * 
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="globalVariable" maxOccurs="unbounded" minOccurs="0">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
       *                 &lt;/sequence>
       *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
       *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       * 
       * 
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"globalVariable"})
      public static class GlobalVariables {

        private List<Applications.Application.Environment.GlobalVariables.GlobalVariable> globalVariable;

        /**
         * Gets the value of the globalVariable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
         * make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE>
         * method for the globalVariable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getGlobalVariableList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Applications.Environment.GlobalVariables.GlobalVariable }
         * 
         * 
         */
        public List<Applications.Application.Environment.GlobalVariables.GlobalVariable> getGlobalVariableList() {
          if (globalVariable == null) {
            globalVariable = new ArrayList<Applications.Application.Environment.GlobalVariables.GlobalVariable>();
          }
          return this.globalVariable;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"value", "name", "description"})
        public static class GlobalVariable {

          private String description;
          @XmlAttribute
          private String name;
          @XmlAttribute
          private String value;

          /**
           * Gets the value of the description property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getDescription() {
            return description;
          }

          /**
           * Sets the value of the description property.
           * 
           * @param pDescription allowed object is {@link String }
           * 
           */
          public void setDescription(String pDescription) {
            this.description = pDescription;
          }

          /**
           * Gets the value of the name property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getName() {
            return name;
          }

          /**
           * Sets the value of the name property.
           * 
           * @param pName allowed object is {@link String }
           * 
           */
          public void setName(String pName) {
            this.name = pName;
          }

          /**
           * Gets the value of the value property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getValue() {
            return value;
          }

          /**
           * Sets the value of the value property.
           * 
           * @param pValue allowed object is {@link String }
           * 
           */
          public void setValue(String pValue) {
            this.value = pValue;
          }
        }
      }

      /**
       * <p>
       * Java class for anonymous complex type.
       * 
       * <p>
       * The following schema fragment specifies the expected content contained within this class.
       * 
       * <pre>
       * &lt;complexType>
       *   &lt;complexContent>
       *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *       &lt;sequence>
       *         &lt;element name="webService" maxOccurs="unbounded" minOccurs="0">
       *           &lt;complexType>
       *             &lt;complexContent>
       *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                 &lt;sequence>
       *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
       *                   &lt;element name="securitySetting" maxOccurs="unbounded" minOccurs="0">
       *                     &lt;complexType>
       *                       &lt;complexContent>
       *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                           &lt;attribute name="authType" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                           &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                         &lt;/restriction>
       *                       &lt;/complexContent>
       *                     &lt;/complexType>
       *                   &lt;/element>
       *                   &lt;element name="endPoints" maxOccurs="unbounded" minOccurs="0">
       *                     &lt;complexType>
       *                       &lt;complexContent>
       *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                           &lt;sequence>
       *                             &lt;element name="portType" maxOccurs="unbounded" minOccurs="0">
       *                               &lt;complexType>
       *                                 &lt;complexContent>
       *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                                     &lt;sequence>
       *                                       &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
       *                                         &lt;complexType>
       *                                           &lt;complexContent>
       *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
       *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
       *                                               &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                                               &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
       *                                             &lt;/restriction>
       *                                           &lt;/complexContent>
       *                                         &lt;/complexType>
       *                                       &lt;/element>
       *                                     &lt;/sequence>
       *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
       *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                                   &lt;/restriction>
       *                                 &lt;/complexContent>
       *                               &lt;/complexType>
       *                             &lt;/element>
       *                           &lt;/sequence>
       *                         &lt;/restriction>
       *                       &lt;/complexContent>
       *                     &lt;/complexType>
       *                   &lt;/element>
       *                 &lt;/sequence>
       *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
       *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
       *                 &lt;attribute name="framework" type="{http://www.w3.org/2001/XMLSchema}string" />
       *               &lt;/restriction>
       *             &lt;/complexContent>
       *           &lt;/complexType>
       *         &lt;/element>
       *       &lt;/sequence>
       *     &lt;/restriction>
       *   &lt;/complexContent>
       * &lt;/complexType>
       * </pre>
       * 
       * 
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"webService"})
      public static class WebServices {

        private List<Applications.Application.Environment.WebServices.WebService> webService;

        /**
         * Gets the value of the webService property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
         * make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE>
         * method for the webService property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getWebServiceList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Applications.Environment.WebServices.WebService }
         * 
         * 
         */
        public List<Applications.Application.Environment.WebServices.WebService> getWebServiceList() {
          if (webService == null) {
            webService = new ArrayList<Applications.Application.Environment.WebServices.WebService>();
          }
          return this.webService;
        }

        /**
         * <p>
         * Java class for anonymous complex type.
         * 
         * <p>
         * The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="securitySetting" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="authType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="endPoints" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="portType" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="framework" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {"framework", "name", "id", "description", "securitySetting", "endPoints"})
        public static class WebService {

          private String description;
          private Applications.Application.Environment.WebServices.WebService.SecuritySetting securitySetting;
          private Applications.Application.Environment.WebServices.WebService.EndPoints endPoints;
          @XmlAttribute
          private String id;
          @XmlAttribute
          private String name;
          @XmlAttribute
          private String framework;
          @XmlAttribute
          private String wsdlUrl;

          /**
           * Gets the value of the description property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getDescription() {
            return description;
          }

          /**
           * Sets the value of the description property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setDescription(String value) {
            this.description = value;
          }

          /**
           * Gets the value of the securitySetting property.
           * 
           * <p>
           * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
           * make to the returned list will be present inside the JAXB object. This is why there is not a
           * <CODE>set</CODE> method for the securitySetting property.
           * 
           * <p>
           * For example, to add a new item, do as follows:
           * 
           * <pre>
           * getSecuritySetting().add(newItem);
           * </pre>
           * 
           * 
           * <p>
           * Objects of the following type(s) are allowed in the list
           * {@link Applications.Environment.WebServices.WebService.SecuritySetting }
           * 
           * 
           */
          public Applications.Application.Environment.WebServices.WebService.SecuritySetting getSecuritySetting() {
            if (securitySetting == null) {
              securitySetting = new Applications.Application.Environment.WebServices.WebService.SecuritySetting();
            }
            return this.securitySetting;
          }

          public void setSecuritySetting(
              Applications.Application.Environment.WebServices.WebService.SecuritySetting pSecuritySetting) {
            this.securitySetting = pSecuritySetting;
          }

          /**
           * Gets the value of the endPoints property.
           * 
           * <p>
           * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
           * make to the returned list will be present inside the JAXB object. This is why there is not a
           * <CODE>set</CODE> method for the endPoints property.
           * 
           * <p>
           * For example, to add a new item, do as follows:
           * 
           * <pre>
           * getEndPoints().add(newItem);
           * </pre>
           * 
           * 
           * <p>
           * Objects of the following type(s) are allowed in the list
           * {@link Applications.Environment.WebServices.WebService.EndPoints }
           * 
           * 
           */
          public Applications.Application.Environment.WebServices.WebService.EndPoints getEndPoints() {
            if (endPoints == null) {
              endPoints = new Applications.Application.Environment.WebServices.WebService.EndPoints();
            }
            return this.endPoints;
          }

          public void setEndPoints(Applications.Application.Environment.WebServices.WebService.EndPoints pEndPoints) {
            this.endPoints = pEndPoints;
          }

          /**
           * Gets the value of the id property.
           * 
           * @return possible object is {@link Integer }
           * 
           */
          public String getId() {
            return id;
          }

          /**
           * Sets the value of the id property.
           * 
           * @param value allowed object is {@link Integer }
           * 
           */
          public void setId(String value) {
            this.id = value;
          }

          /**
           * Gets the value of the name property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getName() {
            return name;
          }

          /**
           * Sets the value of the name property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setName(String value) {
            this.name = value;
          }

          /**
           * Gets the value of the framework property.
           * 
           * @return possible object is {@link String }
           * 
           */
          public String getFramework() {
            return framework;
          }

          /**
           * Sets the value of the framework property.
           * 
           * @param value allowed object is {@link String }
           * 
           */
          public void setFramework(String value) {
            this.framework = value;
          }

          public String getWsdlUrl() {
            return this.wsdlUrl;
          }

          public void setWsdlUrl(String value) {
            this.wsdlUrl = value;
          }

          /**
           * <p>
           * Java class for anonymous complex type.
           * 
           * <p>
           * The following schema fragment specifies the expected content contained within this class.
           * 
           * <pre>
           * &lt;complexType>
           *   &lt;complexContent>
           *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
           *       &lt;sequence>
           *         &lt;element name="portType" maxOccurs="unbounded" minOccurs="0">
           *           &lt;complexType>
           *             &lt;complexContent>
           *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
           *                 &lt;sequence>
           *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
           *                     &lt;complexType>
           *                       &lt;complexContent>
           *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
           *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
           *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
           *                           &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
           *                         &lt;/restriction>
           *                       &lt;/complexContent>
           *                     &lt;/complexType>
           *                   &lt;/element>
           *                 &lt;/sequence>
           *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
           *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
           *               &lt;/restriction>
           *             &lt;/complexContent>
           *           &lt;/complexType>
           *         &lt;/element>
           *       &lt;/sequence>
           *     &lt;/restriction>
           *   &lt;/complexContent>
           * &lt;/complexType>
           * </pre>
           * 
           * 
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(name = "", propOrder = {"portType"})
          public static class EndPoints {

            private List<Applications.Application.Environment.WebServices.WebService.EndPoints.PortType> portType;

            /**
             * Gets the value of the portType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
             * make to the returned list will be present inside the JAXB object. This is why there is not a
             * <CODE>set</CODE> method for the portType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * 
             * <pre>
             * getPortType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Applications.Environment.WebServices.WebService.EndPoints.PortType }
             * 
             * 
             */
            public List<Applications.Application.Environment.WebServices.WebService.EndPoints.PortType> getPortTypeList() {
              if (portType == null) {
                portType =
                    new ArrayList<Applications.Application.Environment.WebServices.WebService.EndPoints.PortType>();
              }
              return this.portType;
            }

            /**
             * <p>
             * Java class for anonymous complex type.
             * 
             * <p>
             * The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {"address"})
            public static class PortType {

              private List<Applications.Application.Environment.WebServices.WebService.EndPoints.PortType.Address> address;
              @XmlAttribute
              private Integer id;
              @XmlAttribute
              private String name;

              /**
               * Gets the value of the address property.
               * 
               * <p>
               * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification
               * you make to the returned list will be present inside the JAXB object. This is why there is not a
               * <CODE>set</CODE> method for the address property.
               * 
               * <p>
               * For example, to add a new item, do as follows:
               * 
               * <pre>
               * getAddress().add(newItem);
               * </pre>
               * 
               * 
               * <p>
               * Objects of the following type(s) are allowed in the list
               * {@link Applications.Environment.WebServices.WebService.EndPoints.PortType.Address }
               * 
               * 
               */
              public List<Applications.Application.Environment.WebServices.WebService.EndPoints.PortType.Address> getAddressList() {
                if (address == null) {
                  address =
                      new ArrayList<Applications.Application.Environment.WebServices.WebService.EndPoints.PortType.Address>();
                }
                return this.address;
              }

              /**
               * Gets the value of the id property.
               * 
               * @return possible object is {@link Integer }
               * 
               */
              public Integer getId() {
                return id;
              }

              /**
               * Sets the value of the id property.
               * 
               * @param value allowed object is {@link Integer }
               * 
               */
              public void setId(Integer value) {
                this.id = value;
              }

              /**
               * Gets the value of the name property.
               * 
               * @return possible object is {@link String }
               * 
               */
              public String getName() {
                return name;
              }

              /**
               * Sets the value of the name property.
               * 
               * @param value allowed object is {@link String }
               * 
               */
              public void setName(String value) {
                this.name = value;
              }

              /**
               * <p>
               * Java class for anonymous complex type.
               * 
               * <p>
               * The following schema fragment specifies the expected content contained within this class.
               * 
               * <pre>
               * &lt;complexType>
               *   &lt;complexContent>
               *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
               *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
               *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
               *       &lt;attribute name="orderPosition" type="{http://www.w3.org/2001/XMLSchema}int" />
               *     &lt;/restriction>
               *   &lt;/complexContent>
               * &lt;/complexType>
               * </pre>
               * 
               * 
               */
              @XmlAccessorType(XmlAccessType.FIELD)
              @XmlType(name = "")
              public static class Address {

                @XmlAttribute
                private Integer id;
                @XmlAttribute
                private String url;
                @XmlAttribute
                private Integer orderPosition;

                /**
                 * Gets the value of the id property.
                 * 
                 * @return possible object is {@link Integer }
                 * 
                 */
                public Integer getId() {
                  return id;
                }

                /**
                 * Sets the value of the id property.
                 * 
                 * @param value allowed object is {@link Integer }
                 * 
                 */
                public void setId(Integer value) {
                  this.id = value;
                }

                /**
                 * Gets the value of the url property.
                 * 
                 * @return possible object is {@link String }
                 * 
                 */
                public String getUrl() {
                  return url;
                }

                /**
                 * Sets the value of the url property.
                 * 
                 * @param value allowed object is {@link String }
                 * 
                 */
                public void setUrl(String value) {
                  this.url = value;
                }

                /**
                 * Gets the value of the orderPosition property.
                 * 
                 * @return possible object is {@link Integer }
                 * 
                 */
                public Integer getOrderPosition() {
                  return orderPosition;
                }

                /**
                 * Sets the value of the orderPosition property.
                 * 
                 * @param value allowed object is {@link Integer }
                 * 
                 */
                public void setOrderPosition(Integer value) {
                  this.orderPosition = value;
                }
              }
            }
          }

          /**
           * <p>
           * Java class for anonymous complex type.
           * 
           * <p>
           * The following schema fragment specifies the expected content contained within this class.
           * 
           * <pre>
           * &lt;complexType>
           *   &lt;complexContent>
           *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
           *       &lt;attribute name="authType" type="{http://www.w3.org/2001/XMLSchema}string" />
           *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
           *       &lt;attribute name="password" type="{http://www.w3.org/2001/XMLSchema}string" />
           *     &lt;/restriction>
           *   &lt;/complexContent>
           * &lt;/complexType>
           * </pre>
           * 
           * 
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(name = "")
          public static class SecuritySetting {

            @XmlAttribute
            private String authType;
            @XmlAttribute
            private String username;
            @XmlAttribute
            private String password;
            @XmlAttribute
            private Integer sessionHandlingMode;

            /**
             * Gets the value of the authType property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getAuthType() {
              return authType;
            }

            /**
             * Sets the value of the authType property.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setAuthType(String value) {
              this.authType = value;
            }

            /**
             * Gets the value of the username property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getUsername() {
              return username;
            }

            /**
             * Sets the value of the username property.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setUsername(String value) {
              this.username = value;
            }

            /**
             * Gets the value of the password property.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getPassword() {
              return password;
            }

            /**
             * Sets the value of the password property.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setPassword(String value) {
              this.password = value;
            }

            public void setSessionHandlingMode(Integer sessionHandlingMode) {
              this.sessionHandlingMode = sessionHandlingMode;
            }

            public Integer getSessionHandlingMode() {
              return sessionHandlingMode;
            }
          }
        }
      }

      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(name = "", propOrder = {"name", "id"})
      public static class BusinessCalendar {

        @XmlAttribute
        private String id;
        @XmlAttribute
        private String name;

        /**
         * 
         * @return
         */
        public String getId() {
          return id;
        }

        /**
         * 
         * @param pId
         */
        public void setId(String pId) {
          this.id = pId;
        }

        /**
         * 
         * @return
         */
        public String getName() {
          return name;
        }

        /**
         * 
         * @param pName
         */
        public void setName(String pName) {
          this.name = pName;
        }

      }
    }

  }

}
