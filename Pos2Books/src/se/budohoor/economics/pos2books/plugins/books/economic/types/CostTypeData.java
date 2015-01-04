
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostTypeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CostTypeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}CostTypeHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostTypeGroupHandle" type="{http://e-conomic.com}CostTypeGroupHandle" minOccurs="0"/>
 *         &lt;element name="VatAccountHandle" type="{http://e-conomic.com}VatAccountHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostTypeData", propOrder = {
    "handle",
    "number",
    "name",
    "costTypeGroupHandle",
    "vatAccountHandle"
})
public class CostTypeData {

    @XmlElement(name = "Handle")
    protected CostTypeHandle handle;
    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "CostTypeGroupHandle")
    protected CostTypeGroupHandle costTypeGroupHandle;
    @XmlElement(name = "VatAccountHandle")
    protected VatAccountHandle vatAccountHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeHandle }
     *     
     */
    public CostTypeHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeHandle }
     *     
     */
    public void setHandle(CostTypeHandle value) {
        this.handle = value;
    }

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
     * Gets the value of the costTypeGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link CostTypeGroupHandle }
     *     
     */
    public CostTypeGroupHandle getCostTypeGroupHandle() {
        return costTypeGroupHandle;
    }

    /**
     * Sets the value of the costTypeGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostTypeGroupHandle }
     *     
     */
    public void setCostTypeGroupHandle(CostTypeGroupHandle value) {
        this.costTypeGroupHandle = value;
    }

    /**
     * Gets the value of the vatAccountHandle property.
     * 
     * @return
     *     possible object is
     *     {@link VatAccountHandle }
     *     
     */
    public VatAccountHandle getVatAccountHandle() {
        return vatAccountHandle;
    }

    /**
     * Sets the value of the vatAccountHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatAccountHandle }
     *     
     */
    public void setVatAccountHandle(VatAccountHandle value) {
        this.vatAccountHandle = value;
    }

}
