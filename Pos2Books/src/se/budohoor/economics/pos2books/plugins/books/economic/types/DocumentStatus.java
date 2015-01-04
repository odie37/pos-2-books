
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unprocessed"/>
 *     &lt;enumeration value="Archived"/>
 *     &lt;enumeration value="Linked"/>
 *     &lt;enumeration value="InUse"/>
 *     &lt;enumeration value="LinkedToInvoiceNotBooked"/>
 *     &lt;enumeration value="LinkedToUnsavedJournalEntry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentStatus")
@XmlEnum
public enum DocumentStatus {

    @XmlEnumValue("Unprocessed")
    UNPROCESSED("Unprocessed"),
    @XmlEnumValue("Archived")
    ARCHIVED("Archived"),
    @XmlEnumValue("Linked")
    LINKED("Linked"),
    @XmlEnumValue("InUse")
    IN_USE("InUse"),
    @XmlEnumValue("LinkedToInvoiceNotBooked")
    LINKED_TO_INVOICE_NOT_BOOKED("LinkedToInvoiceNotBooked"),
    @XmlEnumValue("LinkedToUnsavedJournalEntry")
    LINKED_TO_UNSAVED_JOURNAL_ENTRY("LinkedToUnsavedJournalEntry");
    private final String value;

    DocumentStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentStatus fromValue(String v) {
        for (DocumentStatus c: DocumentStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
