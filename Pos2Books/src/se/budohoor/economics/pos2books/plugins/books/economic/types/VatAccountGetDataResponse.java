
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
 *         &lt;element name="VatAccount_GetDataResult" type="{http://e-conomic.com}VatAccountData" minOccurs="0"/>
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
    "vatAccountGetDataResult"
})
@XmlRootElement(name = "VatAccount_GetDataResponse")
public class VatAccountGetDataResponse {

    @XmlElement(name = "VatAccount_GetDataResult")
    protected VatAccountData vatAccountGetDataResult;

    /**
     * Gets the value of the vatAccountGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountData }
     *     
     */
    public VatAccountData getVatAccountGetDataResult() {
        return vatAccountGetDataResult;
    }

    /**
     * Sets the value of the vatAccountGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountData }
     *     
     */
    public void setVatAccountGetDataResult(VatAccountData value) {
        this.vatAccountGetDataResult = value;
    }

}
