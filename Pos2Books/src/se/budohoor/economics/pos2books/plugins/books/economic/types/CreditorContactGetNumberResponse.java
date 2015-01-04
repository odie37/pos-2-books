
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
 *         &lt;element name="CreditorContact_GetNumberResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "creditorContactGetNumberResult"
})
@XmlRootElement(name = "CreditorContact_GetNumberResponse")
public class CreditorContactGetNumberResponse {

    @XmlElement(name = "CreditorContact_GetNumberResult")
    protected int creditorContactGetNumberResult;

    /**
     * Gets the value of the creditorContactGetNumberResult property.
     * 
     */
    public int getCreditorContactGetNumberResult() {
        return creditorContactGetNumberResult;
    }

    /**
     * Sets the value of the creditorContactGetNumberResult property.
     * 
     */
    public void setCreditorContactGetNumberResult(int value) {
        this.creditorContactGetNumberResult = value;
    }

}
