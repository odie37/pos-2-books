
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
 *         &lt;element name="VatAccount_GetAllResult" type="{http://e-conomic.com}ArrayOfVatAccountHandle" minOccurs="0"/>
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
    "vatAccountGetAllResult"
})
@XmlRootElement(name = "VatAccount_GetAllResponse")
public class VatAccountGetAllResponse {

    @XmlElement(name = "VatAccount_GetAllResult")
    protected ArrayOfVatAccountHandle vatAccountGetAllResult;

    /**
     * Gets the value of the vatAccountGetAllResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVatAccountHandle }
     *     
     */
    public ArrayOfVatAccountHandle getVatAccountGetAllResult() {
        return vatAccountGetAllResult;
    }

    /**
     * Sets the value of the vatAccountGetAllResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVatAccountHandle }
     *     
     */
    public void setVatAccountGetAllResult(ArrayOfVatAccountHandle value) {
        this.vatAccountGetAllResult = value;
    }

}
