
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
 *         &lt;element name="DebtorContact_GetIsToReceiveEmailCopyOfOrderResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "debtorContactGetIsToReceiveEmailCopyOfOrderResult"
})
@XmlRootElement(name = "DebtorContact_GetIsToReceiveEmailCopyOfOrderResponse")
public class DebtorContactGetIsToReceiveEmailCopyOfOrderResponse {

    @XmlElement(name = "DebtorContact_GetIsToReceiveEmailCopyOfOrderResult")
    protected boolean debtorContactGetIsToReceiveEmailCopyOfOrderResult;

    /**
     * Gets the value of the debtorContactGetIsToReceiveEmailCopyOfOrderResult property.
     * 
     */
    public boolean isDebtorContactGetIsToReceiveEmailCopyOfOrderResult() {
        return debtorContactGetIsToReceiveEmailCopyOfOrderResult;
    }

    /**
     * Sets the value of the debtorContactGetIsToReceiveEmailCopyOfOrderResult property.
     * 
     */
    public void setDebtorContactGetIsToReceiveEmailCopyOfOrderResult(boolean value) {
        this.debtorContactGetIsToReceiveEmailCopyOfOrderResult = value;
    }

}
