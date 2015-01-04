
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
 *         &lt;element name="QuotationLine_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfQuotationLineHandle" minOccurs="0"/>
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
    "quotationLineCreateFromDataArrayResult"
})
@XmlRootElement(name = "QuotationLine_CreateFromDataArrayResponse")
public class QuotationLineCreateFromDataArrayResponse {

    @XmlElement(name = "QuotationLine_CreateFromDataArrayResult")
    protected ArrayOfQuotationLineHandle quotationLineCreateFromDataArrayResult;

    /**
     * Gets the value of the quotationLineCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationLineHandle }
     *     
     */
    public ArrayOfQuotationLineHandle getQuotationLineCreateFromDataArrayResult() {
        return quotationLineCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the quotationLineCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationLineHandle }
     *     
     */
    public void setQuotationLineCreateFromDataArrayResult(ArrayOfQuotationLineHandle value) {
        this.quotationLineCreateFromDataArrayResult = value;
    }

}
