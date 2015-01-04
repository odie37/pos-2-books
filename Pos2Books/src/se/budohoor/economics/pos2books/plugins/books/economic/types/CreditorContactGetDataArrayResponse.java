
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
 *         &lt;element name="CreditorContact_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCreditorContactData" minOccurs="0"/>
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
    "creditorContactGetDataArrayResult"
})
@XmlRootElement(name = "CreditorContact_GetDataArrayResponse")
public class CreditorContactGetDataArrayResponse {

    @XmlElement(name = "CreditorContact_GetDataArrayResult")
    protected ArrayOfCreditorContactData creditorContactGetDataArrayResult;

    /**
     * Gets the value of the creditorContactGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorContactData }
     *     
     */
    public ArrayOfCreditorContactData getCreditorContactGetDataArrayResult() {
        return creditorContactGetDataArrayResult;
    }

    /**
     * Sets the value of the creditorContactGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorContactData }
     *     
     */
    public void setCreditorContactGetDataArrayResult(ArrayOfCreditorContactData value) {
        this.creditorContactGetDataArrayResult = value;
    }

}
