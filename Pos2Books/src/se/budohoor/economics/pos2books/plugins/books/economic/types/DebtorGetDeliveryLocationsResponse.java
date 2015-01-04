
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
 *         &lt;element name="Debtor_GetDeliveryLocationsResult" type="{http://e-conomic.com}ArrayOfDeliveryLocationHandle" minOccurs="0"/>
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
    "debtorGetDeliveryLocationsResult"
})
@XmlRootElement(name = "Debtor_GetDeliveryLocationsResponse")
public class DebtorGetDeliveryLocationsResponse {

    @XmlElement(name = "Debtor_GetDeliveryLocationsResult")
    protected ArrayOfDeliveryLocationHandle debtorGetDeliveryLocationsResult;

    /**
     * Gets the value of the debtorGetDeliveryLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDeliveryLocationHandle }
     *     
     */
    public ArrayOfDeliveryLocationHandle getDebtorGetDeliveryLocationsResult() {
        return debtorGetDeliveryLocationsResult;
    }

    /**
     * Sets the value of the debtorGetDeliveryLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDeliveryLocationHandle }
     *     
     */
    public void setDebtorGetDeliveryLocationsResult(ArrayOfDeliveryLocationHandle value) {
        this.debtorGetDeliveryLocationsResult = value;
    }

}
