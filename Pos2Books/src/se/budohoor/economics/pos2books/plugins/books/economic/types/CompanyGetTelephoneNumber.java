
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
 *         &lt;element name="companyHandle" type="{http://e-conomic.com}CompanyHandle" minOccurs="0"/>
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
    "companyHandle"
})
@XmlRootElement(name = "Company_GetTelephoneNumber")
public class CompanyGetTelephoneNumber {

    protected CompanyHandle companyHandle;

    /**
     * Gets the value of the companyHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyHandle }
     *     
     */
    public CompanyHandle getCompanyHandle() {
        return companyHandle;
    }

    /**
     * Sets the value of the companyHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyHandle }
     *     
     */
    public void setCompanyHandle(CompanyHandle value) {
        this.companyHandle = value;
    }

}
