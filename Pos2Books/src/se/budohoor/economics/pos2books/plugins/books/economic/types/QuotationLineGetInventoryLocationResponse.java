
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
 *         &lt;element name="QuotationLine_GetInventoryLocationResult" type="{http://e-conomic.com}InventoryLocationHandle" minOccurs="0"/>
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
    "quotationLineGetInventoryLocationResult"
})
@XmlRootElement(name = "QuotationLine_GetInventoryLocationResponse")
public class QuotationLineGetInventoryLocationResponse {

    @XmlElement(name = "QuotationLine_GetInventoryLocationResult")
    protected InventoryLocationHandle quotationLineGetInventoryLocationResult;

    /**
     * Gets the value of the quotationLineGetInventoryLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public InventoryLocationHandle getQuotationLineGetInventoryLocationResult() {
        return quotationLineGetInventoryLocationResult;
    }

    /**
     * Sets the value of the quotationLineGetInventoryLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryLocationHandle }
     *     
     */
    public void setQuotationLineGetInventoryLocationResult(InventoryLocationHandle value) {
        this.quotationLineGetInventoryLocationResult = value;
    }

}
