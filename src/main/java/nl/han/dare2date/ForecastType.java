
package nl.han.dare2date;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="minTemperature" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="maxTemperature" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="rain" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="snow" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="clouds" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastType", namespace = "http://www.han.nl/schemas/dateplanner", propOrder = {
    "temperature",
    "minTemperature",
    "maxTemperature",
    "rain",
    "snow",
    "clouds"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
public class ForecastType {

    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected float temperature;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected float minTemperature;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected float maxTemperature;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected float rain;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected float snow;
    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected float clouds;

    /**
     * Gets the value of the temperature property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public float getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setTemperature(float value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the minTemperature property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public float getMinTemperature() {
        return minTemperature;
    }

    /**
     * Sets the value of the minTemperature property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setMinTemperature(float value) {
        this.minTemperature = value;
    }

    /**
     * Gets the value of the maxTemperature property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public float getMaxTemperature() {
        return maxTemperature;
    }

    /**
     * Sets the value of the maxTemperature property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setMaxTemperature(float value) {
        this.maxTemperature = value;
    }

    /**
     * Gets the value of the rain property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public float getRain() {
        return rain;
    }

    /**
     * Sets the value of the rain property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setRain(float value) {
        this.rain = value;
    }

    /**
     * Gets the value of the snow property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public float getSnow() {
        return snow;
    }

    /**
     * Sets the value of the snow property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setSnow(float value) {
        this.snow = value;
    }

    /**
     * Gets the value of the clouds property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public float getClouds() {
        return clouds;
    }

    /**
     * Sets the value of the clouds property.
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setClouds(float value) {
        this.clouds = value;
    }

}
