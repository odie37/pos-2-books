
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionCollection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionCollection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Proportional"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionCollection")
@XmlEnum
public enum SubscriptionCollection {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Proportional")
    PROPORTIONAL("Proportional");
    private final String value;

    SubscriptionCollection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionCollection fromValue(String v) {
        for (SubscriptionCollection c: SubscriptionCollection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
