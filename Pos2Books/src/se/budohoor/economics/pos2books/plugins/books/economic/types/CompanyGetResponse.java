
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
 *         &lt;element name="Company_GetResult" type="{http://e-conomic.com}CompanyHandle" minOccurs="0"/>
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
    "companyGetResult"
})
@XmlRootElement(name = "Company_GetResponse")
public class CompanyGetResponse {

    @XmlElement(name = "Company_GetResult")
    protected CompanyHandle companyGetResult;

    /**
     * Gets the value of the companyGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyHandle }
     *     
     */
    public CompanyHandle getCompanyGetResult() {
        return companyGetResult;
    }

    /**
     * Sets the value of the companyGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyHandle }
     *     
     */
    public void setCompanyGetResult(CompanyHandle value) {
        this.companyGetResult = value;
    }

}
