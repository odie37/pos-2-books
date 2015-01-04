
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashBookEntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CashBookEntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DebtorPayment"/>
 *     &lt;enumeration value="CreditorInvoice"/>
 *     &lt;enumeration value="CreditorPayment"/>
 *     &lt;enumeration value="FinanceVoucher"/>
 *     &lt;enumeration value="ManualDebtorInvoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CashBookEntryType")
@XmlEnum
public enum CashBookEntryType {

    @XmlEnumValue("DebtorPayment")
    DEBTOR_PAYMENT("DebtorPayment"),
    @XmlEnumValue("CreditorInvoice")
    CREDITOR_INVOICE("CreditorInvoice"),
    @XmlEnumValue("CreditorPayment")
    CREDITOR_PAYMENT("CreditorPayment"),
    @XmlEnumValue("FinanceVoucher")
    FINANCE_VOUCHER("FinanceVoucher"),
    @XmlEnumValue("ManualDebtorInvoice")
    MANUAL_DEBTOR_INVOICE("ManualDebtorInvoice");
    private final String value;

    CashBookEntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CashBookEntryType fromValue(String v) {
        for (CashBookEntryType c: CashBookEntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
