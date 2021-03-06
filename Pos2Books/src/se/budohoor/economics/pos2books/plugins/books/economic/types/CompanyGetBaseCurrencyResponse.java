
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
 *         &lt;element name="Company_GetBaseCurrencyResult" type="{http://e-conomic.com}CurrencyHandle" minOccurs="0"/>
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
    "companyGetBaseCurrencyResult"
})
@XmlRootElement(name = "Company_GetBaseCurrencyResponse")
public class CompanyGetBaseCurrencyResponse {

    @XmlElement(name = "Company_GetBaseCurrencyResult")
    protected CurrencyHandle companyGetBaseCurrencyResult;

    /**
     * Gets the value of the companyGetBaseCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyHandle }
     *     
     */
    public CurrencyHandle getCompanyGetBaseCurrencyResult() {
        return companyGetBaseCurrencyResult;
    }

    /**
     * Sets the value of the companyGetBaseCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyHandle }
     *     
     */
    public void setCompanyGetBaseCurrencyResult(CurrencyHandle value) {
        this.companyGetBaseCurrencyResult = value;
    }

}
