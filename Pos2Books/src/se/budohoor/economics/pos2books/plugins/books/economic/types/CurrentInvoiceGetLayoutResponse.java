
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
 *         &lt;element name="CurrentInvoice_GetLayoutResult" type="{http://e-conomic.com}TemplateCollectionHandle" minOccurs="0"/>
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
    "currentInvoiceGetLayoutResult"
})
@XmlRootElement(name = "CurrentInvoice_GetLayoutResponse")
public class CurrentInvoiceGetLayoutResponse {

    @XmlElement(name = "CurrentInvoice_GetLayoutResult")
    protected TemplateCollectionHandle currentInvoiceGetLayoutResult;

    /**
     * Gets the value of the currentInvoiceGetLayoutResult property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public TemplateCollectionHandle getCurrentInvoiceGetLayoutResult() {
        return currentInvoiceGetLayoutResult;
    }

    /**
     * Sets the value of the currentInvoiceGetLayoutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateCollectionHandle }
     *     
     */
    public void setCurrentInvoiceGetLayoutResult(TemplateCollectionHandle value) {
        this.currentInvoiceGetLayoutResult = value;
    }

}
