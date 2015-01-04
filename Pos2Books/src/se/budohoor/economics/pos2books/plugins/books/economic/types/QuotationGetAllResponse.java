
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
 *         &lt;element name="Quotation_GetAllResult" type="{http://e-conomic.com}ArrayOfQuotationHandle" minOccurs="0"/>
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
    "quotationGetAllResult"
})
@XmlRootElement(name = "Quotation_GetAllResponse")
public class QuotationGetAllResponse {

    @XmlElement(name = "Quotation_GetAllResult")
    protected ArrayOfQuotationHandle quotationGetAllResult;

    /**
     * Gets the value of the quotationGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public ArrayOfQuotationHandle getQuotationGetAllResult() {
        return quotationGetAllResult;
    }

    /**
     * Sets the value of the quotationGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationHandle }
     *     
     */
    public void setQuotationGetAllResult(ArrayOfQuotationHandle value) {
        this.quotationGetAllResult = value;
    }

}
