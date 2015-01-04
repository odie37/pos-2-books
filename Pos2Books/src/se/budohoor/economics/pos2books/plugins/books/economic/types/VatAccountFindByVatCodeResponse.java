
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="VatAccount_FindByVatCodeResult" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
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
    "vatAccountFindByVatCodeResult"
})
@XmlRootElement(name = "VatAccount_FindByVatCodeResponse")
public class VatAccountFindByVatCodeResponse {

    @XmlElement(name = "VatAccount_FindByVatCodeResult")
    protected VatAccountHandle vatAccountFindByVatCodeResult;

    /**
     * Gets the value of the vatAccountFindByVatCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getVatAccountFindByVatCodeResult() {
        return vatAccountFindByVatCodeResult;
    }

    /**
     * Sets the value of the vatAccountFindByVatCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setVatAccountFindByVatCodeResult(VatAccountHandle value) {
        this.vatAccountFindByVatCodeResult = value;
    }

}
