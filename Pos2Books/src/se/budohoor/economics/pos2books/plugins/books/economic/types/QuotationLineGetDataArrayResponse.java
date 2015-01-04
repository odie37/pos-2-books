
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
 *         &lt;element name="QuotationLine_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfQuotationLineData" minOccurs="0"/>
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
    "quotationLineGetDataArrayResult"
})
@XmlRootElement(name = "QuotationLine_GetDataArrayResponse")
public class QuotationLineGetDataArrayResponse {

    @XmlElement(name = "QuotationLine_GetDataArrayResult")
    protected ArrayOfQuotationLineData quotationLineGetDataArrayResult;

    /**
     * Gets the value of the quotationLineGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQuotationLineData }
     *     
     */
    public ArrayOfQuotationLineData getQuotationLineGetDataArrayResult() {
        return quotationLineGetDataArrayResult;
    }

    /**
     * Sets the value of the quotationLineGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQuotationLineData }
     *     
     */
    public void setQuotationLineGetDataArrayResult(ArrayOfQuotationLineData value) {
        this.quotationLineGetDataArrayResult = value;
    }

}
