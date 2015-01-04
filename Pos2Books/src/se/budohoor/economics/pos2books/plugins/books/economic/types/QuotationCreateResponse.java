
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
 *         &lt;element name="Quotation_CreateResult" type="{http://e-conomic.com}QuotationHandle" minOccurs="0"/>
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
    "quotationCreateResult"
})
@XmlRootElement(name = "Quotation_CreateResponse")
public class QuotationCreateResponse {

    @XmlElement(name = "Quotation_CreateResult")
    protected QuotationHandle quotationCreateResult;

    /**
     * Gets the value of the quotationCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationHandle }
     *     
     */
    public QuotationHandle getQuotationCreateResult() {
        return quotationCreateResult;
    }

    /**
     * Sets the value of the quotationCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationHandle }
     *     
     */
    public void setQuotationCreateResult(QuotationHandle value) {
        this.quotationCreateResult = value;
    }

}
