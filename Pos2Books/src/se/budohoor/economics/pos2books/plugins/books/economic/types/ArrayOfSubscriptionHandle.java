
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubscriptionHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubscriptionHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionHandle" type="{http://e-conomic.com}SubscriptionHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubscriptionHandle", propOrder = {
    "subscriptionHandle"
})
public class ArrayOfSubscriptionHandle {

    @XmlElement(name = "SubscriptionHandle", nillable = true)
    protected List<SubscriptionHandle> subscriptionHandle;

    /**
     * Gets the value of the subscriptionHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionHandle }
     * 
     * 
     */
    public List<SubscriptionHandle> getSubscriptionHandle() {
        if (subscriptionHandle == null) {
            subscriptionHandle = new ArrayList<SubscriptionHandle>();
        }
        return this.subscriptionHandle;
    }

}
