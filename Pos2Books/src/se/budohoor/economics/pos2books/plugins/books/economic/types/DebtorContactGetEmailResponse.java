
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
 *         &lt;element name="DebtorContact_GetEmailResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "debtorContactGetEmailResult"
})
@XmlRootElement(name = "DebtorContact_GetEmailResponse")
public class DebtorContactGetEmailResponse {

    @XmlElement(name = "DebtorContact_GetEmailResult")
    protected String debtorContactGetEmailResult;

    /**
     * Gets the value of the debtorContactGetEmailResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorContactGetEmailResult() {
        return debtorContactGetEmailResult;
    }

    /**
     * Sets the value of the debtorContactGetEmailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorContactGetEmailResult(String value) {
        this.debtorContactGetEmailResult = value;
    }

}
