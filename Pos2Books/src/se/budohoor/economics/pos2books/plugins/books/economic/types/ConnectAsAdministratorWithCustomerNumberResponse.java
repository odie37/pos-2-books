
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
 *         &lt;element name="ConnectAsAdministratorWithCustomerNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "connectAsAdministratorWithCustomerNumberResult"
})
@XmlRootElement(name = "ConnectAsAdministratorWithCustomerNumberResponse")
public class ConnectAsAdministratorWithCustomerNumberResponse {

    @XmlElement(name = "ConnectAsAdministratorWithCustomerNumberResult")
    protected String connectAsAdministratorWithCustomerNumberResult;

    /**
     * Gets the value of the connectAsAdministratorWithCustomerNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectAsAdministratorWithCustomerNumberResult() {
        return connectAsAdministratorWithCustomerNumberResult;
    }

    /**
     * Sets the value of the connectAsAdministratorWithCustomerNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectAsAdministratorWithCustomerNumberResult(String value) {
        this.connectAsAdministratorWithCustomerNumberResult = value;
    }

}
