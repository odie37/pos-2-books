
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
 *         &lt;element name="QuotationLine_GetProductResult" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "quotationLineGetProductResult"
})
@XmlRootElement(name = "QuotationLine_GetProductResponse")
public class QuotationLineGetProductResponse {

    @XmlElement(name = "QuotationLine_GetProductResult")
    protected ProductHandle quotationLineGetProductResult;

    /**
     * Gets the value of the quotationLineGetProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getQuotationLineGetProductResult() {
        return quotationLineGetProductResult;
    }

    /**
     * Sets the value of the quotationLineGetProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setQuotationLineGetProductResult(ProductHandle value) {
        this.quotationLineGetProductResult = value;
    }

}
