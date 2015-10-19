
package nl.han.dateplanner;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="dayPart" type="{http://www.han.nl/schemas/dateplanner}DayParts"/>
 *         &lt;element name="types" type="{http://www.han.nl/schemas/dateplanner}PlaceTypes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOptions", namespace = "http://www.han.nl/schemas/dateplanner", propOrder = {
    "location",
    "radius",
    "dayPart",
    "types"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
public class DateOptions {

    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected String location;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected BigDecimal radius;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected DayParts dayPart;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected PlaceTypes types;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public BigDecimal getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setRadius(BigDecimal value) {
        this.radius = value;
    }

    /**
     * Gets the value of the dayPart property.
     * 
     * @return
     *     possible object is
     *     {@link DayParts }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public DayParts getDayPart() {
        return dayPart;
    }

    /**
     * Sets the value of the dayPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayParts }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setDayPart(DayParts value) {
        this.dayPart = value;
    }

    /**
     * Gets the value of the types property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceTypes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public PlaceTypes getTypes() {
        return types;
    }

    /**
     * Sets the value of the types property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceTypes }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setTypes(PlaceTypes value) {
        this.types = value;
    }

}
