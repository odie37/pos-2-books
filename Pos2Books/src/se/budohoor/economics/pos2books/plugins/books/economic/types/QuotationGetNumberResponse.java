
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
 *         &lt;element name="Quotation_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "quotationGetNumberResult"
})
@XmlRootElement(name = "Quotation_GetNumberResponse")
public class QuotationGetNumberResponse {

    @XmlElement(name = "Quotation_GetNumberResult")
    protected int quotationGetNumberResult;

    /**
     * Gets the value of the quotationGetNumberResult property.
     * 
     */
    public int getQuotationGetNumberResult() {
        return quotationGetNumberResult;
    }

    /**
     * Sets the value of the quotationGetNumberResult property.
     * 
     */
    public void setQuotationGetNumberResult(int value) {
        this.quotationGetNumberResult = value;
    }

}
