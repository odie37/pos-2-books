
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ProfitAndLoss"/>
 *     &lt;enumeration value="Status"/>
 *     &lt;enumeration value="TotalFrom"/>
 *     &lt;enumeration value="Heading"/>
 *     &lt;enumeration value="HeadingStart"/>
 *     &lt;enumeration value="SumInterval"/>
 *     &lt;enumeration value="SumAlpha"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountType")
@XmlEnum
public enum AccountType {

    @XmlEnumValue("ProfitAndLoss")
    PROFIT_AND_LOSS("ProfitAndLoss"),
    @XmlEnumValue("Status")
    STATUS("Status"),
    @XmlEnumValue("TotalFrom")
    TOTAL_FROM("TotalFrom"),
    @XmlEnumValue("Heading")
    HEADING("Heading"),
    @XmlEnumValue("HeadingStart")
    HEADING_START("HeadingStart"),
    @XmlEnumValue("SumInterval")
    SUM_INTERVAL("SumInterval"),
    @XmlEnumValue("SumAlpha")
    SUM_ALPHA("SumAlpha");
    private final String value;

    AccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountType fromValue(String v) {
        for (AccountType c: AccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
