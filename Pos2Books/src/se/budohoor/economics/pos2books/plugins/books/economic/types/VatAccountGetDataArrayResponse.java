
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
 *         &lt;element name="VatAccount_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfVatAccountData" minOccurs="0"/>
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
    "vatAccountGetDataArrayResult"
})
@XmlRootElement(name = "VatAccount_GetDataArrayResponse")
public class VatAccountGetDataArrayResponse {

    @XmlElement(name = "VatAccount_GetDataArrayResult")
    protected ArrayOfVatAccountData vatAccountGetDataArrayResult;

    /**
     * Gets the value of the vatAccountGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVatAccountData }
     *     
     */
    public ArrayOfVatAccountData getVatAccountGetDataArrayResult() {
        return vatAccountGetDataArrayResult;
    }

    /**
     * Sets the value of the vatAccountGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVatAccountData }
     *     
     */
    public void setVatAccountGetDataArrayResult(ArrayOfVatAccountData value) {
        this.vatAccountGetDataArrayResult = value;
    }

}
