
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
 *         &lt;element name="Quotation_GetDataResult" type="{http://e-conomic.com}QuotationData" minOccurs="0"/>
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
    "quotationGetDataResult"
})
@XmlRootElement(name = "Quotation_GetDataResponse")
public class QuotationGetDataResponse {

    @XmlElement(name = "Quotation_GetDataResult")
    protected QuotationData quotationGetDataResult;

    /**
     * Gets the value of the quotationGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationData }
     *     
     */
    public QuotationData getQuotationGetDataResult() {
        return quotationGetDataResult;
    }

    /**
     * Sets the value of the quotationGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationData }
     *     
     */
    public void setQuotationGetDataResult(QuotationData value) {
        this.quotationGetDataResult = value;
    }

}
