
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
 *         &lt;element name="QuotationLine_GetDataResult" type="{http://e-conomic.com}QuotationLineData" minOccurs="0"/>
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
    "quotationLineGetDataResult"
})
@XmlRootElement(name = "QuotationLine_GetDataResponse")
public class QuotationLineGetDataResponse {

    @XmlElement(name = "QuotationLine_GetDataResult")
    protected QuotationLineData quotationLineGetDataResult;

    /**
     * Gets the value of the quotationLineGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationLineData }
     *     
     */
    public QuotationLineData getQuotationLineGetDataResult() {
        return quotationLineGetDataResult;
    }

    /**
     * Sets the value of the quotationLineGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationLineData }
     *     
     */
    public void setQuotationLineGetDataResult(QuotationLineData value) {
        this.quotationLineGetDataResult = value;
    }

}
