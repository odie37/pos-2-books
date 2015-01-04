
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VatAccountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VatAccountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OutputSales"/>
 *     &lt;enumeration value="InputPurchase"/>
 *     &lt;enumeration value="PurchasedProductsAbroad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VatAccountType")
@XmlEnum
public enum VatAccountType {

    @XmlEnumValue("OutputSales")
    OUTPUT_SALES("OutputSales"),
    @XmlEnumValue("InputPurchase")
    INPUT_PURCHASE("InputPurchase"),
    @XmlEnumValue("PurchasedProductsAbroad")
    PURCHASED_PRODUCTS_ABROAD("PurchasedProductsAbroad");
    private final String value;

    VatAccountType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VatAccountType fromValue(String v) {
        for (VatAccountType c: VatAccountType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
