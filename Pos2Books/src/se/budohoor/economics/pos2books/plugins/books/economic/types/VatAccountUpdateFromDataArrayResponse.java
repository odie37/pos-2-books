
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
 *         &lt;element name="VatAccount_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfVatAccountHandle" minOccurs="0"/>
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
    "vatAccountUpdateFromDataArrayResult"
})
@XmlRootElement(name = "VatAccount_UpdateFromDataArrayResponse")
public class VatAccountUpdateFromDataArrayResponse {

    @XmlElement(name = "VatAccount_UpdateFromDataArrayResult")
    protected ArrayOfVatAccountHandle vatAccountUpdateFromDataArrayResult;

    /**
     * Gets the value of the vatAccountUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVatAccountHandle }
     *     
     */
    public ArrayOfVatAccountHandle getVatAccountUpdateFromDataArrayResult() {
        return vatAccountUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the vatAccountUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVatAccountHandle }
     *     
     */
    public void setVatAccountUpdateFromDataArrayResult(ArrayOfVatAccountHandle value) {
        this.vatAccountUpdateFromDataArrayResult = value;
    }

}
