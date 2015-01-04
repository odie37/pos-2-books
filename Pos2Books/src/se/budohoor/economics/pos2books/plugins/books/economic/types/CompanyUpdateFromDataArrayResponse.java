
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
 *         &lt;element name="Company_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfCompanyHandle" minOccurs="0"/>
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
    "companyUpdateFromDataArrayResult"
})
@XmlRootElement(name = "Company_UpdateFromDataArrayResponse")
public class CompanyUpdateFromDataArrayResponse {

    @XmlElement(name = "Company_UpdateFromDataArrayResult")
    protected ArrayOfCompanyHandle companyUpdateFromDataArrayResult;

    /**
     * Gets the value of the companyUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCompanyHandle }
     *     
     */
    public ArrayOfCompanyHandle getCompanyUpdateFromDataArrayResult() {
        return companyUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the companyUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCompanyHandle }
     *     
     */
    public void setCompanyUpdateFromDataArrayResult(ArrayOfCompanyHandle value) {
        this.companyUpdateFromDataArrayResult = value;
    }

}
