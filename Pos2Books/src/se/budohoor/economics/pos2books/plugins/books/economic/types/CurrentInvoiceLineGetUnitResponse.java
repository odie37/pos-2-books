
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
 *         &lt;element name="CurrentInvoiceLine_GetUnitResult" type="{http://e-conomic.com}UnitHandle" minOccurs="0"/>
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
    "currentInvoiceLineGetUnitResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetUnitResponse")
public class CurrentInvoiceLineGetUnitResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetUnitResult")
    protected UnitHandle currentInvoiceLineGetUnitResult;

    /**
     * Gets the value of the currentInvoiceLineGetUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link UnitHandle }
     *     
     */
    public UnitHandle getCurrentInvoiceLineGetUnitResult() {
        return currentInvoiceLineGetUnitResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitHandle }
     *     
     */
    public void setCurrentInvoiceLineGetUnitResult(UnitHandle value) {
        this.currentInvoiceLineGetUnitResult = value;
    }

}
