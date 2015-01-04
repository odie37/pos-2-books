
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
 *         &lt;element name="Quotation_FindByOtherReferenceResult" type="{http://e-conomic.com}ArrayOfQuotationHandle" minOccurs="0"/>
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
    "quotationFindByOtherReferenceResult"
})
@XmlRootElement(name = "Quotation_FindByOtherReferenceResponse")
public class QuotationFindByOtherReferenceResponse {

    @XmlElement(name = "Quotation_FindByOtherReferenceResult")
    protected ArrayOfQuotationHandle quotationFindByOtherReferenceResult;

    /**
     * Gets the value of the quotationFindByOtherReferenceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public ArrayOfQuotationHandle getQuotationFindByOtherReferenceResult() {
        return quotationFindByOtherReferenceResult;
    }

    /**
     * Sets the value of the quotationFindByOtherReferenceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public void setQuotationFindByOtherReferenceResult(ArrayOfQuotationHandle value) {
        this.quotationFindByOtherReferenceResult = value;
    }

}
