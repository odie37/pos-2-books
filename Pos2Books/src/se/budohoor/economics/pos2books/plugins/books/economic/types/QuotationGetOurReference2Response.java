
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
 *         &lt;element name="Quotation_GetOurReference2Result" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
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
    "quotationGetOurReference2Result"
})
@XmlRootElement(name = "Quotation_GetOurReference2Response")
public class QuotationGetOurReference2Response {

    @XmlElement(name = "Quotation_GetOurReference2Result")
    protected EmployeeHandle quotationGetOurReference2Result;

    /**
     * Gets the value of the quotationGetOurReference2Result property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getQuotationGetOurReference2Result() {
        return quotationGetOurReference2Result;
    }

    /**
     * Sets the value of the quotationGetOurReference2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setQuotationGetOurReference2Result(EmployeeHandle value) {
        this.quotationGetOurReference2Result = value;
    }

}
