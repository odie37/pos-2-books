
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="creditorHandle" type="{http://e-conomic.com}CreditorHandle" minOccurs="0"/>
 *         &lt;element name="defaultPaymentTypeHandle" type="{http://e-conomic.com}BankPaymentTypeHandle" minOccurs="0"/>
 *         &lt;element name="defaultPaymentCreditorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "creditorHandle",
    "defaultPaymentTypeHandle",
    "defaultPaymentCreditorId"
})
@XmlRootElement(name = "Creditor_SetRemittanceInformation")
public class CreditorSetRemittanceInformation {

    protected CreditorHandle creditorHandle;
    protected BankPaymentTypeHandle defaultPaymentTypeHandle;
    protected String defaultPaymentCreditorId;

    /**
     * Gets the value of the creditorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorHandle }
     *     
     */
    public CreditorHandle getCreditorHandle() {
        return creditorHandle;
    }

    /**
     * Sets the value of the creditorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorHandle }
     *     
     */
    public void setCreditorHandle(CreditorHandle value) {
        this.creditorHandle = value;
    }

    /**
     * Gets the value of the defaultPaymentTypeHandle property.
     * 
     * @return
     *     possible object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public BankPaymentTypeHandle getDefaultPaymentTypeHandle() {
        return defaultPaymentTypeHandle;
    }

    /**
     * Sets the value of the defaultPaymentTypeHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankPaymentTypeHandle }
     *     
     */
    public void setDefaultPaymentTypeHandle(BankPaymentTypeHandle value) {
        this.defaultPaymentTypeHandle = value;
    }

    /**
     * Gets the value of the defaultPaymentCreditorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPaymentCreditorId() {
        return defaultPaymentCreditorId;
    }

    /**
     * Sets the value of the defaultPaymentCreditorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPaymentCreditorId(String value) {
        this.defaultPaymentCreditorId = value;
    }

}
