
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatZone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VatZone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HomeCountry"/>
 *     &lt;enumeration value="EU"/>
 *     &lt;enumeration value="Abroad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VatZone")
@XmlEnum
public enum VatZone {

    @XmlEnumValue("HomeCountry")
    HOME_COUNTRY("HomeCountry"),
    EU("EU"),
    @XmlEnumValue("Abroad")
    ABROAD("Abroad");
    private final String value;

    VatZone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VatZone fromValue(String v) {
        for (VatZone c: VatZone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
