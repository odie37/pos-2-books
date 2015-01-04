
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtendedVatZoneData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtendedVatZoneData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtendedVatZoneData" type="{http://e-conomic.com}ExtendedVatZoneData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedVatZoneData", propOrder = {
    "extendedVatZoneData"
})
public class ArrayOfExtendedVatZoneData {

    @XmlElement(name = "ExtendedVatZoneData", nillable = true)
    protected List<ExtendedVatZoneData> extendedVatZoneData;

    /**
     * Gets the value of the extendedVatZoneData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedVatZoneData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedVatZoneData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedVatZoneData }
     * 
     * 
     */
    public List<ExtendedVatZoneData> getExtendedVatZoneData() {
        if (extendedVatZoneData == null) {
            extendedVatZoneData = new ArrayList<ExtendedVatZoneData>();
        }
        return this.extendedVatZoneData;
    }

}
