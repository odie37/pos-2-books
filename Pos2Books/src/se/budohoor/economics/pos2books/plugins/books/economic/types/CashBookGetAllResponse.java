
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
 *         &lt;element name="CashBook_GetAllResult" type="{http://e-conomic.com}ArrayOfCashBookHandle" minOccurs="0"/>
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
    "cashBookGetAllResult"
})
@XmlRootElement(name = "CashBook_GetAllResponse")
public class CashBookGetAllResponse {

    @XmlElement(name = "CashBook_GetAllResult")
    protected ArrayOfCashBookHandle cashBookGetAllResult;

    /**
     * Gets the value of the cashBookGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public ArrayOfCashBookHandle getCashBookGetAllResult() {
        return cashBookGetAllResult;
    }

    /**
     * Sets the value of the cashBookGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public void setCashBookGetAllResult(ArrayOfCashBookHandle value) {
        this.cashBookGetAllResult = value;
    }

}
