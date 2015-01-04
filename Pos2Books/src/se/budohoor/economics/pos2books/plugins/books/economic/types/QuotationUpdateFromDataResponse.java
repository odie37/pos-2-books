
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
 *         &lt;element name="Quotation_UpdateFromDataResult" type="{http://e-conomic.com}QuotationHandle" minOccurs="0"/>
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
    "quotationUpdateFromDataResult"
})
@XmlRootElement(name = "Quotation_UpdateFromDataResponse")
public class QuotationUpdateFromDataResponse {

    @XmlElement(name = "Quotation_UpdateFromDataResult")
    protected QuotationHandle quotationUpdateFromDataResult;

    /**
     * Gets the value of the quotationUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationHandle }
     *     
     */
    public QuotationHandle getQuotationUpdateFromDataResult() {
        return quotationUpdateFromDataResult;
    }

    /**
     * Sets the value of the quotationUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationHandle }
     *     
     */
    public void setQuotationUpdateFromDataResult(QuotationHandle value) {
        this.quotationUpdateFromDataResult = value;
    }

}
