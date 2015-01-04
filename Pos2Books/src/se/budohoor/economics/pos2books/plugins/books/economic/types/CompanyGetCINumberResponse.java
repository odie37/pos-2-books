
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
 *         &lt;element name="Company_GetCINumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "companyGetCINumberResult"
})
@XmlRootElement(name = "Company_GetCINumberResponse")
public class CompanyGetCINumberResponse {

    @XmlElement(name = "Company_GetCINumberResult")
    protected String companyGetCINumberResult;

    /**
     * Gets the value of the companyGetCINumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyGetCINumberResult() {
        return companyGetCINumberResult;
    }

    /**
     * Sets the value of the companyGetCINumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyGetCINumberResult(String value) {
        this.companyGetCINumberResult = value;
    }

}
