
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
 *         &lt;element name="currentInvoiceLineHandle" type="{http://e-conomic.com}CurrentInvoiceLineHandle" minOccurs="0"/>
 *         &lt;element name="valueHandle" type="{http://e-conomic.com}ProductHandle" minOccurs="0"/>
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
    "currentInvoiceLineHandle",
    "valueHandle"
})
@XmlRootElement(name = "CurrentInvoiceLine_SetProduct")
public class CurrentInvoiceLineSetProduct {

    protected CurrentInvoiceLineHandle currentInvoiceLineHandle;
    protected ProductHandle valueHandle;

    /**
     * Gets the value of the currentInvoiceLineHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentInvoiceLineHandle }
     *     
     */
    public CurrentInvoiceLineHandle getCurrentInvoiceLineHandle() {
        return currentInvoiceLineHandle;
    }

    /**
     * Sets the value of the currentInvoiceLineHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentInvoiceLineHandle }
     *     
     */
    public void setCurrentInvoiceLineHandle(CurrentInvoiceLineHandle value) {
        this.currentInvoiceLineHandle = value;
    }

    /**
     * Gets the value of the valueHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductHandle }
     *     
     */
    public ProductHandle getValueHandle() {
        return valueHandle;
    }

    /**
     * Sets the value of the valueHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductHandle }
     *     
     */
    public void setValueHandle(ProductHandle value) {
        this.valueHandle = value;
    }

}
