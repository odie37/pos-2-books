
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
 *         &lt;element name="QuotationLine_GetUnitResult" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
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
    "quotationLineGetUnitResult"
})
@XmlRootElement(name = "QuotationLine_GetUnitResponse")
public class QuotationLineGetUnitResponse {

    @XmlElement(name = "QuotationLine_GetUnitResult")
    protected UnitHandle quotationLineGetUnitResult;

    /**
     * Gets the value of the quotationLineGetUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getQuotationLineGetUnitResult() {
        return quotationLineGetUnitResult;
    }

    /**
     * Sets the value of the quotationLineGetUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setQuotationLineGetUnitResult(UnitHandle value) {
        this.quotationLineGetUnitResult = value;
    }

}
