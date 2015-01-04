
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
 *         &lt;element name="subscriptionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscriptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subscriptionInterval" type="{http://e-conomic.com}SubscriptionInterval"/>
 *         &lt;element name="calendarYearBasis" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="collection" type="{http://e-conomic.com}SubscriptionCollection"/>
 *         &lt;element name="addPeriod" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="allowMoreThanOneForEachDebtor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "subscriptionNumber",
    "subscriptionName",
    "description",
    "includeName",
    "subscriptionInterval",
    "calendarYearBasis",
    "collection",
    "addPeriod",
    "allowMoreThanOneForEachDebtor"
})
@XmlRootElement(name = "Subscription_Create")
public class SubscriptionCreate {

    protected int subscriptionNumber;
    protected String subscriptionName;
    protected String description;
    protected boolean includeName;
    @XmlElement(required = true)
    protected SubscriptionInterval subscriptionInterval;
    protected boolean calendarYearBasis;
    @XmlElement(required = true)
    protected SubscriptionCollection collection;
    protected boolean addPeriod;
    protected boolean allowMoreThanOneForEachDebtor;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     */
    public int getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     */
    public void setSubscriptionNumber(int value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the subscriptionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * Sets the value of the subscriptionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionName(String value) {
        this.subscriptionName = value;
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
