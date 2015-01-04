
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
 *         &lt;element name="debtorGroupHandle" type="{http://e-conomic.com}DebtorGroupHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "debtorGroupHandle",
    "valueHandle"
})
@XmlRootElement(name = "DebtorGroup_SetAccount")
public class DebtorGroupSetAccount {

    protected DebtorGroupHandle debtorGroupHandle;
    protected AccountHandle valueHandle;

    /**
     * Gets the value of the debtorGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public DebtorGroupHandle getDebtorGroupHandle() {
        return debtorGroupHandle;
    }

    /**
     * Sets the value of the debtorGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public void setDebtorGroupHandle(DebtorGroupHandle value) {
        this.debtorGroupHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setValueHandle(AccountHandle value) {
        this.valueHandle = value;
    }

}
