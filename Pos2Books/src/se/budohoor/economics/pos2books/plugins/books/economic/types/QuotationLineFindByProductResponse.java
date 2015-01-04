
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
 *         &lt;element name="QuotationLine_FindByProductResult" type="{http://e-conomic.com}ArrayOfQuotationLineHandle" minOccurs="0"/>
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
    "quotationLineFindByProductResult"
})
@XmlRootElement(name = "QuotationLine_FindByProductResponse")
public class QuotationLineFindByProductResponse {

    @XmlElement(name = "QuotationLine_FindByProductResult")
    protected ArrayOfQuotationLineHandle quotationLineFindByProductResult;

    /**
     * Gets the value of the quotationLineFindByProductResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationLineHandle }
     *     
     */
    public ArrayOfQuotationLineHandle getQuotationLineFindByProductResult() {
        return quotationLineFindByProductResult;
    }

    /**
     * Sets the value of the quotationLineFindByProductResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationLineHandle }
     *     
     */
    public void setQuotationLineFindByProductResult(ArrayOfQuotationLineHandle value) {
        this.quotationLineFindByProductResult = value;
    }

}
