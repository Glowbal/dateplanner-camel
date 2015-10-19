
package nl.han.dare2date;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PlaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="placeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vicinity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="openingHours" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="forecast" type="{http://www.han.nl/schemas/dateplanner}ForecastType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceType", namespace = "http://www.han.nl/schemas/dateplanner", propOrder = {
    "name",
    "placeId",
    "latitude",
    "longitude",
    "type",
    "vicinity",
    "openingHours",
    "date",
    "forecast"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
public class PlaceType {

    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected String name;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected String placeId;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected BigDecimal latitude;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected BigDecimal longitude;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected String type;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected String vicinity;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected String openingHours;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected ForecastType forecast;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the placeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public String getPlaceId() {
        return placeId;
    }

    /**
     * Sets the value of the placeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setPlaceId(String value) {
        this.placeId = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the vicinity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public String getVicinity() {
        return vicinity;
    }

    /**
     * Sets the value of the vicinity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setVicinity(String value) {
        this.vicinity = value;
    }

    /**
     * Gets the value of the openingHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Sets the value of the openingHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setOpeningHours(String value) {
        this.openingHours = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the forecast property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public ForecastType getForecast() {
        return forecast;
    }

    /**
     * Sets the value of the forecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastType }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setForecast(ForecastType value) {
        this.forecast = value;
    }

}
