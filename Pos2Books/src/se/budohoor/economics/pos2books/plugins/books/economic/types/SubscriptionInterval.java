
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionInterval.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionInterval">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="TwoWeeks"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Quarter"/>
 *     &lt;enumeration value="HalfYear"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="TwoMonths"/>
 *     &lt;enumeration value="TwoYears"/>
 *     &lt;enumeration value="ThreeYears"/>
 *     &lt;enumeration value="FourYears"/>
 *     &lt;enumeration value="FiveYears"/>
 *     &lt;enumeration value="FourWeeks"/>
 *     &lt;enumeration value="EightWeeks"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionInterval")
@XmlEnum
public enum SubscriptionInterval {

    @XmlEnumValue("Week")
    WEEK("Week"),
    @XmlEnumValue("TwoWeeks")
    TWO_WEEKS("TwoWeeks"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Quarter")
    QUARTER("Quarter"),
    @XmlEnumValue("HalfYear")
    HALF_YEAR("HalfYear"),
    @XmlEnumValue("Year")
    YEAR("Year"),
    @XmlEnumValue("TwoMonths")
    TWO_MONTHS("TwoMonths"),
    @XmlEnumValue("TwoYears")
    TWO_YEARS("TwoYears"),
    @XmlEnumValue("ThreeYears")
    THREE_YEARS("ThreeYears"),
    @XmlEnumValue("FourYears")
    FOUR_YEARS("FourYears"),
    @XmlEnumValue("FiveYears")
    FIVE_YEARS("FiveYears"),
    @XmlEnumValue("FourWeeks")
    FOUR_WEEKS("FourWeeks"),
    @XmlEnumValue("EightWeeks")
    EIGHT_WEEKS("EightWeeks");
    private final String value;

    SubscriptionInterval(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionInterval fromValue(String v) {
        for (SubscriptionInterval c: SubscriptionInterval.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
