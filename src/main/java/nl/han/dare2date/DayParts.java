
package nl.han.dare2date;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DayParts.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DayParts">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NCName">
 *     &lt;enumeration value="morning"/>
 *     &lt;enumeration value="day"/>
 *     &lt;enumeration value="evening"/>
 *     &lt;enumeration value="night"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DayParts", namespace = "http://www.han.nl/schemas/dateplanner")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-19T11:43:52+02:00", comments = "JAXB RI v2.2.4-2")
public enum DayParts {

    @XmlEnumValue("morning")
    MORNING("morning"),
    @XmlEnumValue("day")
    DAY("day"),
    @XmlEnumValue("evening")
    EVENING("evening"),
    @XmlEnumValue("night")
    NIGHT("night");
    private final String value;

    DayParts(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayParts fromValue(String v) {
        for (DayParts c: DayParts.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
