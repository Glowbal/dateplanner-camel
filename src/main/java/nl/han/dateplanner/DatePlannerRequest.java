
package nl.han.dateplanner;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://www.han.nl/schemas/dateplanner}DateOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input"
})
@XmlRootElement(name = "DatePlannerRequest", namespace = "http://www.han.nl/schemas/dateplanner")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
public class DatePlannerRequest {

    @XmlElement(namespace = "http://www.han.nl/schemas/dateplanner", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    protected DateOptions input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link DateOptions }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public DateOptions getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOptions }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
    public void setInput(DateOptions value) {
        this.input = value;
    }

}
