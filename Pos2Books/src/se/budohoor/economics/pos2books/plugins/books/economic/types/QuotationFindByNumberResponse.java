
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
 *         &lt;element name="Quotation_FindByNumberResult" type="{http://e-conomic.com}QuotationHandle" minOccurs="0"/>
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
    "quotationFindByNumberResult"
})
@XmlRootElement(name = "Quotation_FindByNumberResponse")
public class QuotationFindByNumberResponse {

    @XmlElement(name = "Quotation_FindByNumberResult")
    protected QuotationHandle quotationFindByNumberResult;

    /**
     * Gets the value of the quotationFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationHandle }
     *     
     */
    public QuotationHandle getQuotationFindByNumberResult() {
        return quotationFindByNumberResult;
    }

    /**
     * Sets the value of the quotationFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationHandle }
     *     
     */
    public void setQuotationFindByNumberResult(QuotationHandle value) {
        this.quotationFindByNumberResult = value;
    }

}
