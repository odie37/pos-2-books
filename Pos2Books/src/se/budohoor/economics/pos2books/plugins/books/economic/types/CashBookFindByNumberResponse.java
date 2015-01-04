
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
 *         &lt;element name="CashBook_FindByNumberResult" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
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
    "cashBookFindByNumberResult"
})
@XmlRootElement(name = "CashBook_FindByNumberResponse")
public class CashBookFindByNumberResponse {

    @XmlElement(name = "CashBook_FindByNumberResult")
    protected CashBookHandle cashBookFindByNumberResult;

    /**
     * Gets the value of the cashBookFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getCashBookFindByNumberResult() {
        return cashBookFindByNumberResult;
    }

    /**
     * Sets the value of the cashBookFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setCashBookFindByNumberResult(CashBookHandle value) {
        this.cashBookFindByNumberResult = value;
    }

}
