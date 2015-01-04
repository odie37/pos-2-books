
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
 *         &lt;element name="Quotation_GetIsArchivedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "quotationGetIsArchivedResult"
})
@XmlRootElement(name = "Quotation_GetIsArchivedResponse")
public class QuotationGetIsArchivedResponse {

    @XmlElement(name = "Quotation_GetIsArchivedResult")
    protected boolean quotationGetIsArchivedResult;

    /**
     * Gets the value of the quotationGetIsArchivedResult property.
     * 
     */
    public boolean isQuotationGetIsArchivedResult() {
        return quotationGetIsArchivedResult;
    }

    /**
     * Sets the value of the quotationGetIsArchivedResult property.
     * 
     */
    public void setQuotationGetIsArchivedResult(boolean value) {
        this.quotationGetIsArchivedResult = value;
    }

}
