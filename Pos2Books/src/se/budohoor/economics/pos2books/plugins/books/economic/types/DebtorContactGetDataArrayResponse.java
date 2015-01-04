
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
 *         &lt;element name="DebtorContact_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorContactData" minOccurs="0"/>
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
    "debtorContactGetDataArrayResult"
})
@XmlRootElement(name = "DebtorContact_GetDataArrayResponse")
public class DebtorContactGetDataArrayResponse {

    @XmlElement(name = "DebtorContact_GetDataArrayResult")
    protected ArrayOfDebtorContactData debtorContactGetDataArrayResult;

    /**
     * Gets the value of the debtorContactGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorContactData }
     *     
     */
    public ArrayOfDebtorContactData getDebtorContactGetDataArrayResult() {
        return debtorContactGetDataArrayResult;
    }

    /**
     * Sets the value of the debtorContactGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorContactData }
     *     
     */
    public void setDebtorContactGetDataArrayResult(ArrayOfDebtorContactData value) {
        this.debtorContactGetDataArrayResult = value;
    }

}
