
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVatAccountHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVatAccountHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VatAccountHandle" type="{http://e-conomic.com}VatAccountHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVatAccountHandle", propOrder = {
    "vatAccountHandle"
})
public class ArrayOfVatAccountHandle {

    @XmlElement(name = "VatAccountHandle", nillable = true)
    protected List<VatAccountHandle> vatAccountHandle;

    /**
     * Gets the value of the vatAccountHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatAccountHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVatAccountHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VatAccountHandle }
     * 
     * 
     */
    public List<VatAccountHandle> getVatAccountHandle() {
        if (vatAccountHandle == null) {
            vatAccountHandle = new ArrayList<VatAccountHandle>();
        }
        return this.vatAccountHandle;
    }

}
