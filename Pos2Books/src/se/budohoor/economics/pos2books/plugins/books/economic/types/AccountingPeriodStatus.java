
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingPeriodStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingPeriodStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Open"/>
 *     &lt;enumeration value="Barred"/>
 *     &lt;enumeration value="Closed"/>
 *     &lt;enumeration value="BarredAndClosed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountingPeriodStatus")
@XmlEnum
public enum AccountingPeriodStatus {

    @XmlEnumValue("Open")
    OPEN("Open"),
    @XmlEnumValue("Barred")
    BARRED("Barred"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("BarredAndClosed")
    BARRED_AND_CLOSED("BarredAndClosed");
    private final String value;

    AccountingPeriodStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountingPeriodStatus fromValue(String v) {
        for (AccountingPeriodStatus c: AccountingPeriodStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
