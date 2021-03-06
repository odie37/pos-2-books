
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="debtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="value" type="{http://e-conomic.com}ExtendedVatZoneHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "debtorHandle",
    "value"
})
@XmlRootElement(name = "Debtor_SetExtendedVatZone")
public class DebtorSetExtendedVatZone {

    protected DebtorHandle debtorHandle;
    protected ExtendedVatZoneHandle value;

    /**
     * Gets the value of the debtorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorHandle() {
        return debtorHandle;
    }

    /**
     * Sets the value of the debtorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorHandle(DebtorHandle value) {
        this.debtorHandle = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public ExtendedVatZoneHandle getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedVatZoneHandle }
     *     
     */
    public void setValue(ExtendedVatZoneHandle value) {
        this.value = value;
    }

}
