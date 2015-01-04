
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
 *         &lt;element name="DebtorGroup_GetAllResult" type="{http://e-conomic.com}ArrayOfDebtorGroupHandle" minOccurs="0"/>
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
    "debtorGroupGetAllResult"
})
@XmlRootElement(name = "DebtorGroup_GetAllResponse")
public class DebtorGroupGetAllResponse {

    @XmlElement(name = "DebtorGroup_GetAllResult")
    protected ArrayOfDebtorGroupHandle debtorGroupGetAllResult;

    /**
     * Gets the value of the debtorGroupGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorGroupHandle }
     *     
     */
    public ArrayOfDebtorGroupHandle getDebtorGroupGetAllResult() {
        return debtorGroupGetAllResult;
    }

    /**
     * Sets the value of the debtorGroupGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorGroupHandle }
     *     
     */
    public void setDebtorGroupGetAllResult(ArrayOfDebtorGroupHandle value) {
        this.debtorGroupGetAllResult = value;
    }

}
