
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
 *         &lt;element name="QuotationLine_CreateFromDataResult" type="{http://e-conomic.com}QuotationLineHandle" minOccurs="0"/>
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
    "quotationLineCreateFromDataResult"
})
@XmlRootElement(name = "QuotationLine_CreateFromDataResponse")
public class QuotationLineCreateFromDataResponse {

    @XmlElement(name = "QuotationLine_CreateFromDataResult")
    protected QuotationLineHandle quotationLineCreateFromDataResult;

    /**
     * Gets the value of the quotationLineCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationLineHandle }
     *     
     */
    public QuotationLineHandle getQuotationLineCreateFromDataResult() {
        return quotationLineCreateFromDataResult;
    }

    /**
     * Sets the value of the quotationLineCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationLineHandle }
     *     
     */
    public void setQuotationLineCreateFromDataResult(QuotationLineHandle value) {
        this.quotationLineCreateFromDataResult = value;
    }

}
