
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
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
 *         &lt;element name="quotationLineHandle" type="{http://e-conomic.com}QuotationLineHandle" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "quotationLineHandle",
    "value"
})
@XmlRootElement(name = "QuotationLine_SetDiscountAsPercent")
public class QuotationLineSetDiscountAsPercent {

    protected QuotationLineHandle quotationLineHandle;
    @XmlElement(required = true)
    protected BigDecimal value;

    /**
     * Gets the value of the quotationLineHandle property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationLineHandle }
     *     
     */
    public QuotationLineHandle getQuotationLineHandle() {
        return quotationLineHandle;
    }

    /**
     * Sets the value of the quotationLineHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationLineHandle }
     *     
     */
    public void setQuotationLineHandle(QuotationLineHandle value) {
        this.quotationLineHandle = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
