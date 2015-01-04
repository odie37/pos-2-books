
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
 *         &lt;element name="CreditorGroup_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfCreditorGroupData" minOccurs="0"/>
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
    "creditorGroupGetDataArrayResult"
})
@XmlRootElement(name = "CreditorGroup_GetDataArrayResponse")
public class CreditorGroupGetDataArrayResponse {

    @XmlElement(name = "CreditorGroup_GetDataArrayResult")
    protected ArrayOfCreditorGroupData creditorGroupGetDataArrayResult;

    /**
     * Gets the value of the creditorGroupGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCreditorGroupData }
     *     
     */
    public ArrayOfCreditorGroupData getCreditorGroupGetDataArrayResult() {
        return creditorGroupGetDataArrayResult;
    }

    /**
     * Sets the value of the creditorGroupGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCreditorGroupData }
     *     
     */
    public void setCreditorGroupGetDataArrayResult(ArrayOfCreditorGroupData value) {
        this.creditorGroupGetDataArrayResult = value;
    }

}
