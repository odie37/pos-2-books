
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
 *         &lt;element name="DebtorGroup_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorGroupHandle" minOccurs="0"/>
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
    "debtorGroupUpdateFromDataArrayResult"
})
@XmlRootElement(name = "DebtorGroup_UpdateFromDataArrayResponse")
public class DebtorGroupUpdateFromDataArrayResponse {

    @XmlElement(name = "DebtorGroup_UpdateFromDataArrayResult")
    protected ArrayOfDebtorGroupHandle debtorGroupUpdateFromDataArrayResult;

    /**
     * Gets the value of the debtorGroupUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorGroupHandle }
     *     
     */
    public ArrayOfDebtorGroupHandle getDebtorGroupUpdateFromDataArrayResult() {
        return debtorGroupUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the debtorGroupUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorGroupHandle }
     *     
     */
    public void setDebtorGroupUpdateFromDataArrayResult(ArrayOfDebtorGroupHandle value) {
        this.debtorGroupUpdateFromDataArrayResult = value;
    }

}
