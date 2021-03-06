
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
 *         &lt;element name="Debtor_FindByEanResult" type="{http://e-conomic.com}ArrayOfDebtorHandle" minOccurs="0"/>
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
    "debtorFindByEanResult"
})
@XmlRootElement(name = "Debtor_FindByEanResponse")
public class DebtorFindByEanResponse {

    @XmlElement(name = "Debtor_FindByEanResult")
    protected ArrayOfDebtorHandle debtorFindByEanResult;

    /**
     * Gets the value of the debtorFindByEanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorHandle }
     *     
     */
    public ArrayOfDebtorHandle getDebtorFindByEanResult() {
        return debtorFindByEanResult;
    }

    /**
     * Sets the value of the debtorFindByEanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorHandle }
     *     
     */
    public void setDebtorFindByEanResult(ArrayOfDebtorHandle value) {
        this.debtorFindByEanResult = value;
    }

}
