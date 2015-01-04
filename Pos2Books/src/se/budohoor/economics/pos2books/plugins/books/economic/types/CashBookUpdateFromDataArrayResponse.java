
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
 *         &lt;element name="CashBook_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCashBookHandle" minOccurs="0"/>
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
    "cashBookUpdateFromDataArrayResult"
})
@XmlRootElement(name = "CashBook_UpdateFromDataArrayResponse")
public class CashBookUpdateFromDataArrayResponse {

    @XmlElement(name = "CashBook_UpdateFromDataArrayResult")
    protected ArrayOfCashBookHandle cashBookUpdateFromDataArrayResult;

    /**
     * Gets the value of the cashBookUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public ArrayOfCashBookHandle getCashBookUpdateFromDataArrayResult() {
        return cashBookUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the cashBookUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public void setCashBookUpdateFromDataArrayResult(ArrayOfCashBookHandle value) {
        this.cashBookUpdateFromDataArrayResult = value;
    }

}
