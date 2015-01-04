
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
 *         &lt;element name="CashBook_BookWithDateResult" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
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
    "cashBookBookWithDateResult"
})
@XmlRootElement(name = "CashBook_BookWithDateResponse")
public class CashBookBookWithDateResponse {

    @XmlElement(name = "CashBook_BookWithDateResult")
    protected CashBookHandle cashBookBookWithDateResult;

    /**
     * Gets the value of the cashBookBookWithDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getCashBookBookWithDateResult() {
        return cashBookBookWithDateResult;
    }

    /**
     * Sets the value of the cashBookBookWithDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setCashBookBookWithDateResult(CashBookHandle value) {
        this.cashBookBookWithDateResult = value;
    }

}
