
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
 *         &lt;element name="CurrentInvoice_GetOurReference2Result" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "currentInvoiceGetOurReference2Result"
})
@XmlRootElement(name = "CurrentInvoice_GetOurReference2Response")
public class CurrentInvoiceGetOurReference2Response {

    @XmlElement(name = "CurrentInvoice_GetOurReference2Result")
    protected EmployeeHandle currentInvoiceGetOurReference2Result;

    /**
     * Gets the value of the currentInvoiceGetOurReference2Result property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getCurrentInvoiceGetOurReference2Result() {
        return currentInvoiceGetOurReference2Result;
    }

    /**
     * Sets the value of the currentInvoiceGetOurReference2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setCurrentInvoiceGetOurReference2Result(EmployeeHandle value) {
        this.currentInvoiceGetOurReference2Result = value;
    }

}
