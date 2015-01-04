
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
 *         &lt;element name="Company_UpdateFromDataResult" type="{http://e-conomic.com}CompanyHandle" minOccurs="0"/>
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
    "companyUpdateFromDataResult"
})
@XmlRootElement(name = "Company_UpdateFromDataResponse")
public class CompanyUpdateFromDataResponse {

    @XmlElement(name = "Company_UpdateFromDataResult")
    protected CompanyHandle companyUpdateFromDataResult;

    /**
     * Gets the value of the companyUpdateFromDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyHandle }
     *     
     */
    public CompanyHandle getCompanyUpdateFromDataResult() {
        return companyUpdateFromDataResult;
    }

    /**
     * Sets the value of the companyUpdateFromDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyHandle }
     *     
     */
    public void setCompanyUpdateFromDataResult(CompanyHandle value) {
        this.companyUpdateFromDataResult = value;
    }

}
