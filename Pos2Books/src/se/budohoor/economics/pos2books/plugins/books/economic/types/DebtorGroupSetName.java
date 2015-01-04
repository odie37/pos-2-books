
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
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "value"
})
@XmlRootElement(name = "DebtorGroup_SetName")
public class DebtorGroupSetName {

    protected DebtorGroupHandle debtorGroupHandle;
    protected String value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
