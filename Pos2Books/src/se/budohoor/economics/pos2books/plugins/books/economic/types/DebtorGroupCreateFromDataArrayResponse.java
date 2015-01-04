
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
 *         &lt;element name="DebtorGroup_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorGroupHandle" minOccurs="0"/>
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
    "debtorGroupCreateFromDataArrayResult"
})
@XmlRootElement(name = "DebtorGroup_CreateFromDataArrayResponse")
public class DebtorGroupCreateFromDataArrayResponse {

    @XmlElement(name = "DebtorGroup_CreateFromDataArrayResult")
    protected ArrayOfDebtorGroupHandle debtorGroupCreateFromDataArrayResult;

    /**
     * Gets the value of the debtorGroupCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorGroupHandle }
     *     
     */
    public ArrayOfDebtorGroupHandle getDebtorGroupCreateFromDataArrayResult() {
        return debtorGroupCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the debtorGroupCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorGroupHandle }
     *     
     */
    public void setDebtorGroupCreateFromDataArrayResult(ArrayOfDebtorGroupHandle value) {
        this.debtorGroupCreateFromDataArrayResult = value;
    }

}
