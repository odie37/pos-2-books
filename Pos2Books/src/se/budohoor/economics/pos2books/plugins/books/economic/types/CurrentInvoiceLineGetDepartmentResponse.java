
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
 *         &lt;element name="CurrentInvoiceLine_GetDepartmentResult" type="{http://e-conomic.com}DepartmentHandle" minOccurs="0"/>
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
    "currentInvoiceLineGetDepartmentResult"
})
@XmlRootElement(name = "CurrentInvoiceLine_GetDepartmentResponse")
public class CurrentInvoiceLineGetDepartmentResponse {

    @XmlElement(name = "CurrentInvoiceLine_GetDepartmentResult")
    protected DepartmentHandle currentInvoiceLineGetDepartmentResult;

    /**
     * Gets the value of the currentInvoiceLineGetDepartmentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentHandle }
     *     
     */
    public DepartmentHandle getCurrentInvoiceLineGetDepartmentResult() {
        return currentInvoiceLineGetDepartmentResult;
    }

    /**
     * Sets the value of the currentInvoiceLineGetDepartmentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentHandle }
     *     
     */
    public void setCurrentInvoiceLineGetDepartmentResult(DepartmentHandle value) {
        this.currentInvoiceLineGetDepartmentResult = value;
    }

}
