
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
 *         &lt;element name="CreditorContact_GetDataResult" type="{http://e-conomic.com}CreditorContactData" minOccurs="0"/>
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
    "creditorContactGetDataResult"
})
@XmlRootElement(name = "CreditorContact_GetDataResponse")
public class CreditorContactGetDataResponse {

    @XmlElement(name = "CreditorContact_GetDataResult")
    protected CreditorContactData creditorContactGetDataResult;

    /**
     * Gets the value of the creditorContactGetDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorContactData }
     *     
     */
    public CreditorContactData getCreditorContactGetDataResult() {
        return creditorContactGetDataResult;
    }

    /**
     * Sets the value of the creditorContactGetDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorContactData }
     *     
     */
    public void setCreditorContactGetDataResult(CreditorContactData value) {
        this.creditorContactGetDataResult = value;
    }

}
