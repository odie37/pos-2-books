
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
 *         &lt;element name="Invoice_GetOurReference2Result" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "invoiceGetOurReference2Result"
})
@XmlRootElement(name = "Invoice_GetOurReference2Response")
public class InvoiceGetOurReference2Response {

    @XmlElement(name = "Invoice_GetOurReference2Result")
    protected EmployeeHandle invoiceGetOurReference2Result;

    /**
     * Gets the value of the invoiceGetOurReference2Result property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getInvoiceGetOurReference2Result() {
        return invoiceGetOurReference2Result;
    }

    /**
     * Sets the value of the invoiceGetOurReference2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setInvoiceGetOurReference2Result(EmployeeHandle value) {
        this.invoiceGetOurReference2Result = value;
    }

}
