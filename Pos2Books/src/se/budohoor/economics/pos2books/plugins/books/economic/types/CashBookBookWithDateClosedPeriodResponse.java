
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
 *         &lt;element name="CashBook_BookWithDateClosedPeriodResult" type="{http://e-conomic.com}CashBookHandle" minOccurs="0"/>
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
    "cashBookBookWithDateClosedPeriodResult"
})
@XmlRootElement(name = "CashBook_BookWithDateClosedPeriodResponse")
public class CashBookBookWithDateClosedPeriodResponse {

    @XmlElement(name = "CashBook_BookWithDateClosedPeriodResult")
    protected CashBookHandle cashBookBookWithDateClosedPeriodResult;

    /**
     * Gets the value of the cashBookBookWithDateClosedPeriodResult property.
     * 
     * @return
     *     possible object is
     *     {@link CashBookHandle }
     *     
     */
    public CashBookHandle getCashBookBookWithDateClosedPeriodResult() {
        return cashBookBookWithDateClosedPeriodResult;
    }

    /**
     * Sets the value of the cashBookBookWithDateClosedPeriodResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBookHandle }
     *     
     */
    public void setCashBookBookWithDateClosedPeriodResult(CashBookHandle value) {
        this.cashBookBookWithDateClosedPeriodResult = value;
    }

}
