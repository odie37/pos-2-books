
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
 *         &lt;element name="MileageEntry_GetApprovedResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "mileageEntryGetApprovedResult"
})
@XmlRootElement(name = "MileageEntry_GetApprovedResponse")
public class MileageEntryGetApprovedResponse {

    @XmlElement(name = "MileageEntry_GetApprovedResult")
    protected boolean mileageEntryGetApprovedResult;

    /**
     * Gets the value of the mileageEntryGetApprovedResult property.
     * 
     */
    public boolean isMileageEntryGetApprovedResult() {
        return mileageEntryGetApprovedResult;
    }

    /**
     * Sets the value of the mileageEntryGetApprovedResult property.
     * 
     */
    public void setMileageEntryGetApprovedResult(boolean value) {
        this.mileageEntryGetApprovedResult = value;
    }

}
