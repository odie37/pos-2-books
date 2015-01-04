
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
 *         &lt;element name="CashBook_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCashBookData" minOccurs="0"/>
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
    "cashBookGetDataArrayResult"
})
@XmlRootElement(name = "CashBook_GetDataArrayResponse")
public class CashBookGetDataArrayResponse {

    @XmlElement(name = "CashBook_GetDataArrayResult")
    protected ArrayOfCashBookData cashBookGetDataArrayResult;

    /**
     * Gets the value of the cashBookGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookData }
     *     
     */
    public ArrayOfCashBookData getCashBookGetDataArrayResult() {
        return cashBookGetDataArrayResult;
    }

    /**
     * Sets the value of the cashBookGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookData }
     *     
     */
    public void setCashBookGetDataArrayResult(ArrayOfCashBookData value) {
        this.cashBookGetDataArrayResult = value;
    }

}
