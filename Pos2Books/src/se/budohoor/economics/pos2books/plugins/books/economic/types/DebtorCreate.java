
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
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtorGroupHandle" type="{http://e-conomic.com}DebtorGroupHandle" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatZone" type="{http://e-conomic.com}VatZone"/>
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
    "number",
    "debtorGroupHandle",
    "name",
    "vatZone"
})
@XmlRootElement(name = "Debtor_Create")
public class DebtorCreate {

    protected String number;
    protected DebtorGroupHandle debtorGroupHandle;
    protected String name;
    @XmlElement(required = true)
    protected VatZone vatZone;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the debtorGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public DebtorGroupHandle getDebtorGroupHandle() {
        return debtorGroupHandle;
    }

    /**
     * Sets the value of the debtorGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorGroupHandle }
     *     
     */
    public void setDebtorGroupHandle(DebtorGroupHandle value) {
        this.debtorGroupHandle = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vatZone property.
     * 
     * @return
     *     possible object is
     *     {@link VatZone }
     *     
     */
    public VatZone getVatZone() {
        return vatZone;
    }

    /**
     * Sets the value of the vatZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatZone }
     *     
     */
    public void setVatZone(VatZone value) {
        this.vatZone = value;
    }

}
