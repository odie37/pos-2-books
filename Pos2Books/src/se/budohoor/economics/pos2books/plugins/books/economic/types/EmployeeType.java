
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmployeeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Undefined"/>
 *     &lt;enumeration value="TimeLogger"/>
 *     &lt;enumeration value="ProjectManager"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmployeeType")
@XmlEnum
public enum EmployeeType {

    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("TimeLogger")
    TIME_LOGGER("TimeLogger"),
    @XmlEnumValue("ProjectManager")
    PROJECT_MANAGER("ProjectManager");
    private final String value;

    EmployeeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmployeeType fromValue(String v) {
        for (EmployeeType c: EmployeeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
