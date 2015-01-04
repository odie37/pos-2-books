
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}SubscriptionHandle" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SubscriptionInterval" type="{http://e-conomic.com}SubscriptionInterval"/>
 *         &lt;element name="CalendarYearBasis" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Collection" type="{http://e-conomic.com}SubscriptionCollection"/>
 *         &lt;element name="AddPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowMoreThanOneForEachDebtor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionData", propOrder = {
    "handle",
    "id",
    "number",
    "name",
    "description",
    "includeName",
    "subscriptionInterval",
    "calendarYearBasis",
    "collection",
    "addPeriod",
    "allowMoreThanOneForEachDebtor"
})
public class SubscriptionData {

    @XmlElement(name = "Handle")
    protected SubscriptionHandle handle;
    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IncludeName")
    protected boolean includeName;
    @XmlElement(name = "SubscriptionInterval", required = true)
    protected SubscriptionInterval subscriptionInterval;
    @XmlElement(name = "CalendarYearBasis")
    protected boolean calendarYearBasis;
    @XmlElement(name = "Collection", required = true)
    protected SubscriptionCollection collection;
    @XmlElement(name = "AddPeriod")
    protected boolean addPeriod;
    @XmlElement(name = "AllowMoreThanOneForEachDebtor")
    protected boolean allowMoreThanOneForEachDebtor;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionHandle }
     *     
     */
    public SubscriptionHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionHandle }
     *     
     */
    public void setHandle(SubscriptionHandle value) {
        this.handle = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the includeName property.
     * 
     */
    public boolean isIncludeName() {
        return includeName;
    }

    /**
     * Sets the value of the includeName property.
     * 
     */
    public void setIncludeName(boolean value) {
        this.includeName = value;
    }

    /**
     * Gets the value of the subscriptionInterval property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionInterval }
     *     
     */
    public SubscriptionInterval getSubscriptionInterval() {
        return subscriptionInterval;
    }

    /**
     * Sets the value of the subscriptionInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionInterval }
     *     
     */
    public void setSubscriptionInterval(SubscriptionInterval value) {
        this.subscriptionInterval = value;
    }

    /**
     * Gets the value of the calendarYearBasis property.
     * 
     */
    public boolean isCalendarYearBasis() {
        return calendarYearBasis;
    }

    /**
     * Sets the value of the calendarYearBasis property.
     * 
     */
    public void setCalendarYearBasis(boolean value) {
        this.calendarYearBasis = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionCollection }
     *     
     */
    public SubscriptionCollection getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionCollection }
     *     
     */
    public void setCollection(SubscriptionCollection value) {
        this.collection = value;
    }

    /**
     * Gets the value of the addPeriod property.
     * 
     */
    public boolean isAddPeriod() {
        return addPeriod;
    }

    /**
     * Sets the value of the addPeriod property.
     * 
     */
    public void setAddPeriod(boolean value) {
        this.addPeriod = value;
    }

    /**
     * Gets the value of the allowMoreThanOneForEachDebtor property.
     * 
     */
    public boolean isAllowMoreThanOneForEachDebtor() {
        return allowMoreThanOneForEachDebtor;
    }

    /**
     * Sets the value of the allowMoreThanOneForEachDebtor property.
     * 
     */
    public void setAllowMoreThanOneForEachDebtor(boolean value) {
        this.allowMoreThanOneForEachDebtor = value;
    }

}
