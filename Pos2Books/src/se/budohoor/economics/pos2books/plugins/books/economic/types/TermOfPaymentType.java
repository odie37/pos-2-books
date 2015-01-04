
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermOfPaymentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TermOfPaymentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Net"/>
 *     &lt;enumeration value="InvoiceMonth"/>
 *     &lt;enumeration value="PaidInCash"/>
 *     &lt;enumeration value="Prepaid"/>
 *     &lt;enumeration value="DueDate"/>
 *     &lt;enumeration value="Factoring"/>
 *     &lt;enumeration value="InvoiceWeekStartingSunday"/>
 *     &lt;enumeration value="InvoiceWeekStartingMonday"/>
 *     &lt;enumeration value="Creditcard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TermOfPaymentType")
@XmlEnum
public enum TermOfPaymentType {

    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("InvoiceMonth")
    INVOICE_MONTH("InvoiceMonth"),
    @XmlEnumValue("PaidInCash")
    PAID_IN_CASH("PaidInCash"),
    @XmlEnumValue("Prepaid")
    PREPAID("Prepaid"),
    @XmlEnumValue("DueDate")
    DUE_DATE("DueDate"),
    @XmlEnumValue("Factoring")
    FACTORING("Factoring"),
    @XmlEnumValue("InvoiceWeekStartingSunday")
    INVOICE_WEEK_STARTING_SUNDAY("InvoiceWeekStartingSunday"),
    @XmlEnumValue("InvoiceWeekStartingMonday")
    INVOICE_WEEK_STARTING_MONDAY("InvoiceWeekStartingMonday"),
    @XmlEnumValue("Creditcard")
    CREDITCARD("Creditcard");
    private final String value;

    TermOfPaymentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TermOfPaymentType fromValue(String v) {
        for (TermOfPaymentType c: TermOfPaymentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
