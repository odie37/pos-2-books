
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
 *         &lt;element name="Quotation_GetIsVatIncludedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "quotationGetIsVatIncludedResult"
})
@XmlRootElement(name = "Quotation_GetIsVatIncludedResponse")
public class QuotationGetIsVatIncludedResponse {

    @XmlElement(name = "Quotation_GetIsVatIncludedResult")
    protected boolean quotationGetIsVatIncludedResult;

    /**
     * Gets the value of the quotationGetIsVatIncludedResult property.
     * 
     */
    public boolean isQuotationGetIsVatIncludedResult() {
        return quotationGetIsVatIncludedResult;
    }

    /**
     * Sets the value of the quotationGetIsVatIncludedResult property.
     * 
     */
    public void setQuotationGetIsVatIncludedResult(boolean value) {
        this.quotationGetIsVatIncludedResult = value;
    }

}
