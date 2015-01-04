
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
 *         &lt;element name="MileageEntry_GetIdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "mileageEntryGetIdResult"
})
@XmlRootElement(name = "MileageEntry_GetIdResponse")
public class MileageEntryGetIdResponse {

    @XmlElement(name = "MileageEntry_GetIdResult")
    protected int mileageEntryGetIdResult;

    /**
     * Gets the value of the mileageEntryGetIdResult property.
     * 
     */
    public int getMileageEntryGetIdResult() {
        return mileageEntryGetIdResult;
    }

    /**
     * Sets the value of the mileageEntryGetIdResult property.
     * 
     */
    public void setMileageEntryGetIdResult(int value) {
        this.mileageEntryGetIdResult = value;
    }

}
