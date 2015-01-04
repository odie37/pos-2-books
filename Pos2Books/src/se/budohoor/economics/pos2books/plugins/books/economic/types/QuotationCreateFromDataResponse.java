
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
 *         &lt;element name="Quotation_CreateFromDataResult" type="{http://e-conomic.com}QuotationHandle" minOccurs="0"/>
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
    "quotationCreateFromDataResult"
})
@XmlRootElement(name = "Quotation_CreateFromDataResponse")
public class QuotationCreateFromDataResponse {

    @XmlElement(name = "Quotation_CreateFromDataResult")
    protected QuotationHandle quotationCreateFromDataResult;

    /**
     * Gets the value of the quotationCreateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationHandle }
     *     
     */
    public QuotationHandle getQuotationCreateFromDataResult() {
        return quotationCreateFromDataResult;
    }

    /**
     * Sets the value of the quotationCreateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationHandle }
     *     
     */
    public void setQuotationCreateFromDataResult(QuotationHandle value) {
        this.quotationCreateFromDataResult = value;
    }

}
