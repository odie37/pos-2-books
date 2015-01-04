
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
 *         &lt;element name="Debtor_GetOrdersResult" type="{http://e-conomic.com}ArrayOfOrderHandle" minOccurs="0"/>
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
    "debtorGetOrdersResult"
})
@XmlRootElement(name = "Debtor_GetOrdersResponse")
public class DebtorGetOrdersResponse {

    @XmlElement(name = "Debtor_GetOrdersResult")
    protected ArrayOfOrderHandle debtorGetOrdersResult;

    /**
     * Gets the value of the debtorGetOrdersResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public ArrayOfOrderHandle getDebtorGetOrdersResult() {
        return debtorGetOrdersResult;
    }

    /**
     * Sets the value of the debtorGetOrdersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrderHandle }
     *     
     */
    public void setDebtorGetOrdersResult(ArrayOfOrderHandle value) {
        this.debtorGetOrdersResult = value;
    }

}
