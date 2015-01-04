
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriberData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}SubscriberHandle" minOccurs="0"/>
 *         &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DebtorHandle" type="{http://e-conomic.com}DebtorHandle" minOccurs="0"/>
 *         &lt;element name="SubscriptionHandle" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
 *         &lt;element name="ProjectHandle" type="{http://e-conomic.com}ProjectHandle" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RegisteredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DiscountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExtraTextForInvoice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="QuantityFactor" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PriceIndex" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DiscountAsPercent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberData", propOrder = {
    "handle",
    "subscriberId",
    "debtorHandle",
    "subscriptionHandle",
    "projectHandle",
    "startDate",
    "registeredDate",
    "endDate",
    "expiryDate",
    "discountExpiryDate",
    "extraTextForInvoice",
    "comments",
    "specialPrice",
    "quantityFactor",
    "priceIndex",
    "discountAsPercent"
})
public class SubscriberData {

    @XmlElement(name = "Handle")
    protected SubscriberHandle handle;
    @XmlElement(name = "SubscriberId")
    protected int subscriberId;
    @XmlElement(name = "DebtorHandle")
    protected DebtorHandle debtorHandle;
    @XmlElement(name = "SubscriptionHandle")
    protected SubscriptionHandle subscriptionHandle;
    @XmlElement(name = "ProjectHandle")
    protected ProjectHandle projectHandle;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "RegisteredDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registeredDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "ExpiryDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "DiscountExpiryDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar discountExpiryDate;
    @XmlElement(name = "ExtraTextForInvoice")
    protected String extraTextForInvoice;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "SpecialPrice", required = true, nillable = true)
    protected BigDecimal specialPrice;
    @XmlElement(name = "QuantityFactor", required = true, nillable = true)
    protected BigDecimal quantityFactor;
    @XmlElement(name = "PriceIndex", required = true, nillable = true)
    protected BigDecimal priceIndex;
    @XmlElement(name = "DiscountAsPercent", required = true, nillable = true)
    protected BigDecimal discountAsPercent;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberHandle }
     *     
     */
    public SubscriberHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberHandle }
     *     
     */
    public void setHandle(SubscriberHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     */
    public int getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     */
    public void setSubscriberId(int value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the debtorHandle property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorHandle }
     *     
     */
    public DebtorHandle getDebtorHandle() {
        return debtorHandle;
    }

    /**
     * Sets the value of the debtorHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorHandle }
     *     
     */
    public void setDebtorHandle(DebtorHandle value) {
        this.debtorHandle = value;
    }

    /**
     * Gets the value of the subscriptionHandle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getSubscriptionHandle() {
        return subscriptionHandle;
    }

    /**
     * Sets the value of the subscriptionHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setSubscriptionHandle(SubscriptionHandle value) {
        this.subscriptionHandle = value;
    }

    /**
     * Gets the value of the projectHandle property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectHandle }
     *     
     */
    public ProjectHandle getProjectHandle() {
        return projectHandle;
    }

    /**
     * Sets the value of the projectHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectHandle }
     *     
     */
    public void setProjectHandle(ProjectHandle value) {
        this.projectHandle = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisteredDate(XMLGregorianCalendar value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the discountExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiscountExpiryDate() {
        return discountExpiryDate;
    }

    /**
     * Sets the value of the discountExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiscountExpiryDate(XMLGregorianCalendar value) {
        this.discountExpiryDate = value;
    }

    /**
     * Gets the value of the extraTextForInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraTextForInvoice() {
        return extraTextForInvoice;
    }

    /**
     * Sets the value of the extraTextForInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraTextForInvoice(String value) {
        this.extraTextForInvoice = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the specialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    /**
     * Sets the value of the specialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSpecialPrice(BigDecimal value) {
        this.specialPrice = value;
    }

    /**
     * Gets the value of the quantityFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantityFactor() {
        return quantityFactor;
    }

    /**
     * Sets the value of the quantityFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantityFactor(BigDecimal value) {
        this.quantityFactor = value;
    }

    /**
     * Gets the value of the priceIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceIndex() {
        return priceIndex;
    }

    /**
     * Sets the value of the priceIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceIndex(BigDecimal value) {
        this.priceIndex = value;
    }

    /**
     * Gets the value of the discountAsPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountAsPercent() {
        return discountAsPercent;
    }

    /**
     * Sets the value of the discountAsPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountAsPercent(BigDecimal value) {
        this.discountAsPercent = value;
    }

}
