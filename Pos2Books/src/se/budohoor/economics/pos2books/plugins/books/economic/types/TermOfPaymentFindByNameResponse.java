
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
 *         &lt;element name="TermOfPayment_FindByNameResult" type="{http://e-conomic.com}ArrayOfTermOfPaymentHandle" minOccurs="0"/>
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
    "termOfPaymentFindByNameResult"
})
@XmlRootElement(name = "TermOfPayment_FindByNameResponse")
public class TermOfPaymentFindByNameResponse {

    @XmlElement(name = "TermOfPayment_FindByNameResult")
    protected ArrayOfTermOfPaymentHandle termOfPaymentFindByNameResult;

    /**
     * Gets the value of the termOfPaymentFindByNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTermOfPaymentHandle }
     *     
     */
    public ArrayOfTermOfPaymentHandle getTermOfPaymentFindByNameResult() {
        return termOfPaymentFindByNameResult;
    }

    /**
     * Sets the value of the termOfPaymentFindByNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTermOfPaymentHandle }
     *     
     */
    public void setTermOfPaymentFindByNameResult(ArrayOfTermOfPaymentHandle value) {
        this.termOfPaymentFindByNameResult = value;
    }

}
