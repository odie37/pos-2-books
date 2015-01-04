
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
 *         &lt;element name="Company_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCompanyData" minOccurs="0"/>
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
    "companyGetDataArrayResult"
})
@XmlRootElement(name = "Company_GetDataArrayResponse")
public class CompanyGetDataArrayResponse {

    @XmlElement(name = "Company_GetDataArrayResult")
    protected ArrayOfCompanyData companyGetDataArrayResult;

    /**
     * Gets the value of the companyGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyData }
     *     
     */
    public ArrayOfCompanyData getCompanyGetDataArrayResult() {
        return companyGetDataArrayResult;
    }

    /**
     * Sets the value of the companyGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyData }
     *     
     */
    public void setCompanyGetDataArrayResult(ArrayOfCompanyData value) {
        this.companyGetDataArrayResult = value;
    }

}
