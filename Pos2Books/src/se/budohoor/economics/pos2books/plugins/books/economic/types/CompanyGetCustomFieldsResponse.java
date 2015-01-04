
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
 *         &lt;element name="Company_GetCustomFieldsResult" type="{http://e-conomic.com}ArrayOfCustomField" minOccurs="0"/>
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
    "companyGetCustomFieldsResult"
})
@XmlRootElement(name = "Company_GetCustomFieldsResponse")
public class CompanyGetCustomFieldsResponse {

    @XmlElement(name = "Company_GetCustomFieldsResult")
    protected ArrayOfCustomField companyGetCustomFieldsResult;

    /**
     * Gets the value of the companyGetCustomFieldsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomField }
     *     
     */
    public ArrayOfCustomField getCompanyGetCustomFieldsResult() {
        return companyGetCustomFieldsResult;
    }

    /**
     * Sets the value of the companyGetCustomFieldsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomField }
     *     
     */
    public void setCompanyGetCustomFieldsResult(ArrayOfCustomField value) {
        this.companyGetCustomFieldsResult = value;
    }

}
