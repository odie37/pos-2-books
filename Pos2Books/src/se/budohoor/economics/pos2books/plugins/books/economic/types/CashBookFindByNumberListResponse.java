
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
 *         &lt;element name="CashBook_FindByNumberListResult" type="{http://e-conomic.com}ArrayOfCashBookHandle" minOccurs="0"/>
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
    "cashBookFindByNumberListResult"
})
@XmlRootElement(name = "CashBook_FindByNumberListResponse")
public class CashBookFindByNumberListResponse {

    @XmlElement(name = "CashBook_FindByNumberListResult")
    protected ArrayOfCashBookHandle cashBookFindByNumberListResult;

    /**
     * Gets the value of the cashBookFindByNumberListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public ArrayOfCashBookHandle getCashBookFindByNumberListResult() {
        return cashBookFindByNumberListResult;
    }

    /**
     * Sets the value of the cashBookFindByNumberListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCashBookHandle }
     *     
     */
    public void setCashBookFindByNumberListResult(ArrayOfCashBookHandle value) {
        this.cashBookFindByNumberListResult = value;
    }

}
