
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="quotationHandle" type="{http://e-conomic.com}QuotationHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}TemplateCollectionHandle" minOccurs="0"/>
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
    "quotationHandle",
    "valueHandle"
})
@XmlRootElement(name = "Quotation_SetLayout")
public class QuotationSetLayout {

    protected QuotationHandle quotationHandle;
    protected TemplateCollectionHandle valueHandle;

    /**
     * Gets the value of the quotationHandle property.
     * 
     * @return
     *     possible object is
     *     {@link QuotationHandle }
     *     
     */
    public QuotationHandle getQuotationHandle() {
        return quotationHandle;
    }

    /**
     * Sets the value of the quotationHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationHandle }
     *     
     */
    public void setQuotationHandle(QuotationHandle value) {
        this.quotationHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public TemplateCollectionHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public void setValueHandle(TemplateCollectionHandle value) {
        this.valueHandle = value;
    }

}
