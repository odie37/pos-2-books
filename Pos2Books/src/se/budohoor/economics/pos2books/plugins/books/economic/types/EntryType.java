
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DebtorInvoice"/>
 *     &lt;enumeration value="DebtorPayment"/>
 *     &lt;enumeration value="CreditorInvoice"/>
 *     &lt;enumeration value="CreditorPayment"/>
 *     &lt;enumeration value="JournalEntry"/>
 *     &lt;enumeration value="Reminder"/>
 *     &lt;enumeration value="OpeningEntry"/>
 *     &lt;enumeration value="TransferredOpeningEntry"/>
 *     &lt;enumeration value="SystemEntry"/>
 *     &lt;enumeration value="ManualDebtorInvoice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntryType")
@XmlEnum
public enum EntryType {

    @XmlEnumValue("DebtorInvoice")
    DEBTOR_INVOICE("DebtorInvoice"),
    @XmlEnumValue("DebtorPayment")
    DEBTOR_PAYMENT("DebtorPayment"),
    @XmlEnumValue("CreditorInvoice")
    CREDITOR_INVOICE("CreditorInvoice"),
    @XmlEnumValue("CreditorPayment")
    CREDITOR_PAYMENT("CreditorPayment"),
    @XmlEnumValue("JournalEntry")
    JOURNAL_ENTRY("JournalEntry"),
    @XmlEnumValue("Reminder")
    REMINDER("Reminder"),
    @XmlEnumValue("OpeningEntry")
    OPENING_ENTRY("OpeningEntry"),
    @XmlEnumValue("TransferredOpeningEntry")
    TRANSFERRED_OPENING_ENTRY("TransferredOpeningEntry"),
    @XmlEnumValue("SystemEntry")
    SYSTEM_ENTRY("SystemEntry"),
    @XmlEnumValue("ManualDebtorInvoice")
    MANUAL_DEBTOR_INVOICE("ManualDebtorInvoice");
    private final String value;

    EntryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntryType fromValue(String v) {
        for (EntryType c: EntryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
