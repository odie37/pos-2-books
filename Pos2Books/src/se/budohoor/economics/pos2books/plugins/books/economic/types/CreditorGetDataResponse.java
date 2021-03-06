
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
 *         &lt;element name="Creditor_GetDataResult" type="{http://e-conomic.com}CreditorData" minOccurs="0"/>
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
    "creditorGetDataResult"
})
@XmlRootElement(name = "Creditor_GetDataResponse")
public class CreditorGetDataResponse {

    @XmlElement(name = "Creditor_GetDataResult")
    protected CreditorData creditorGetDataResult;

    /**
     * Gets the value of the creditorGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorData }
     *     
     */
    public CreditorData getCreditorGetDataResult() {
        return creditorGetDataResult;
    }

    /**
     * Sets the value of the creditorGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorData }
     *     
     */
    public void setCreditorGetDataResult(CreditorData value) {
        this.creditorGetDataResult = value;
    }

}
