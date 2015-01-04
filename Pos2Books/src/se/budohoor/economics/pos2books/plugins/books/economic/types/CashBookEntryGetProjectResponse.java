
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
 *         &lt;element name="CashBookEntry_GetProjectResult" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
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
    "cashBookEntryGetProjectResult"
})
@XmlRootElement(name = "CashBookEntry_GetProjectResponse")
public class CashBookEntryGetProjectResponse {

    @XmlElement(name = "CashBookEntry_GetProjectResult")
    protected ProjectHandle cashBookEntryGetProjectResult;

    /**
     * Gets the value of the cashBookEntryGetProjectResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getCashBookEntryGetProjectResult() {
        return cashBookEntryGetProjectResult;
    }

    /**
     * Sets the value of the cashBookEntryGetProjectResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setCashBookEntryGetProjectResult(ProjectHandle value) {
        this.cashBookEntryGetProjectResult = value;
    }

}
