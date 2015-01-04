
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
 *         &lt;element name="DebtorContact_FindByExternalIdResult" type="{http://e-conomic.com}ArrayOfDebtorContactHandle" minOccurs="0"/>
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
    "debtorContactFindByExternalIdResult"
})
@XmlRootElement(name = "DebtorContact_FindByExternalIdResponse")
public class DebtorContactFindByExternalIdResponse {

    @XmlElement(name = "DebtorContact_FindByExternalIdResult")
    protected ArrayOfDebtorContactHandle debtorContactFindByExternalIdResult;

    /**
     * Gets the value of the debtorContactFindByExternalIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public ArrayOfDebtorContactHandle getDebtorContactFindByExternalIdResult() {
        return debtorContactFindByExternalIdResult;
    }

    /**
     * Sets the value of the debtorContactFindByExternalIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorContactHandle }
     *     
     */
    public void setDebtorContactFindByExternalIdResult(ArrayOfDebtorContactHandle value) {
        this.debtorContactFindByExternalIdResult = value;
    }

}
