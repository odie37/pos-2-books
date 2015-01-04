
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
 *         &lt;element name="DebtorGroup_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDebtorGroupData" minOccurs="0"/>
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
    "debtorGroupGetDataArrayResult"
})
@XmlRootElement(name = "DebtorGroup_GetDataArrayResponse")
public class DebtorGroupGetDataArrayResponse {

    @XmlElement(name = "DebtorGroup_GetDataArrayResult")
    protected ArrayOfDebtorGroupData debtorGroupGetDataArrayResult;

    /**
     * Gets the value of the debtorGroupGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDebtorGroupData }
     *     
     */
    public ArrayOfDebtorGroupData getDebtorGroupGetDataArrayResult() {
        return debtorGroupGetDataArrayResult;
    }

    /**
     * Sets the value of the debtorGroupGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDebtorGroupData }
     *     
     */
    public void setDebtorGroupGetDataArrayResult(ArrayOfDebtorGroupData value) {
        this.debtorGroupGetDataArrayResult = value;
    }

}
