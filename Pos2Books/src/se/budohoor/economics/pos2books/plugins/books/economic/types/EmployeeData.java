
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmployeeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}EmployeeHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GroupHandle" type="{http://e-conomic.com}EmployeeGroupHandle" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostPriceBefore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPriceBefore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CostPriceAfter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesPriceAfter" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CutoffDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EmployeeType" type="{http://e-conomic.com}EmployeeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeData", propOrder = {
    "handle",
    "number",
    "groupHandle",
    "name",
    "costPrice",
    "salesPrice",
    "costPriceBefore",
    "salesPriceBefore",
    "costPriceAfter",
    "salesPriceAfter",
    "cutoffDate",
    "employeeType"
})
public class EmployeeData {

    @XmlElement(name = "Handle")
    protected EmployeeHandle handle;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "GroupHandle")
    protected EmployeeGroupHandle groupHandle;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElementRef(name = "CostPrice", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> costPrice;
    @XmlElementRef(name = "SalesPrice", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> salesPrice;
    @XmlElementRef(name = "CostPriceBefore", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> costPriceBefore;
    @XmlElementRef(name = "SalesPriceBefore", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> salesPriceBefore;
    @XmlElementRef(name = "CostPriceAfter", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> costPriceAfter;
    @XmlElementRef(name = "SalesPriceAfter", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> salesPriceAfter;
    @XmlElementRef(name = "CutoffDate", namespace = "http://e-conomic.com", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> cutoffDate;
    @XmlElement(name = "EmployeeType")
    protected EmployeeType employeeType;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeHandle }
     *     
     */
    public EmployeeHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeHandle }
     *     
     */
    public void setHandle(EmployeeHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the groupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public EmployeeGroupHandle getGroupHandle() {
        return groupHandle;
    }

    /**
     * Sets the value of the groupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public void setGroupHandle(EmployeeGroupHandle value) {
        this.groupHandle = value;
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
     * Gets the value of the costPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostPrice() {
        return costPrice;
    }

    /**
     * Sets the value of the costPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostPrice(JAXBElement<BigDecimal> value) {
        this.costPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the salesPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesPrice() {
        return salesPrice;
    }

    /**
     * Sets the value of the salesPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesPrice(JAXBElement<BigDecimal> value) {
        this.salesPrice = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the costPriceBefore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostPriceBefore() {
        return costPriceBefore;
    }

    /**
     * Sets the value of the costPriceBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostPriceBefore(JAXBElement<BigDecimal> value) {
        this.costPriceBefore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the salesPriceBefore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesPriceBefore() {
        return salesPriceBefore;
    }

    /**
     * Sets the value of the salesPriceBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesPriceBefore(JAXBElement<BigDecimal> value) {
        this.salesPriceBefore = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the costPriceAfter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCostPriceAfter() {
        return costPriceAfter;
    }

    /**
     * Sets the value of the costPriceAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCostPriceAfter(JAXBElement<BigDecimal> value) {
        this.costPriceAfter = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the salesPriceAfter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSalesPriceAfter() {
        return salesPriceAfter;
    }

    /**
     * Sets the value of the salesPriceAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSalesPriceAfter(JAXBElement<BigDecimal> value) {
        this.salesPriceAfter = ((JAXBElement<BigDecimal> ) value);
    }

    /**
     * Gets the value of the cutoffDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCutoffDate() {
        return cutoffDate;
    }

    /**
     * Sets the value of the cutoffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCutoffDate(JAXBElement<XMLGregorianCalendar> value) {
        this.cutoffDate = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the employeeType property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeType }
     *     
     */
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets the value of the employeeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeType }
     *     
     */
    public void setEmployeeType(EmployeeType value) {
        this.employeeType = value;
    }

}
