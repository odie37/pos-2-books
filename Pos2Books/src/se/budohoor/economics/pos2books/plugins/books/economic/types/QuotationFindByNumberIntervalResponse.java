
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
 *         &lt;element name="Quotation_FindByNumberIntervalResult" type="{http://e-conomic.com}ArrayOfQuotationHandle" minOccurs="0"/>
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
    "quotationFindByNumberIntervalResult"
})
@XmlRootElement(name = "Quotation_FindByNumberIntervalResponse")
public class QuotationFindByNumberIntervalResponse {

    @XmlElement(name = "Quotation_FindByNumberIntervalResult")
    protected ArrayOfQuotationHandle quotationFindByNumberIntervalResult;

    /**
     * Gets the value of the quotationFindByNumberIntervalResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public ArrayOfQuotationHandle getQuotationFindByNumberIntervalResult() {
        return quotationFindByNumberIntervalResult;
    }

    /**
     * Sets the value of the quotationFindByNumberIntervalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public void setQuotationFindByNumberIntervalResult(ArrayOfQuotationHandle value) {
        this.quotationFindByNumberIntervalResult = value;
    }

}
