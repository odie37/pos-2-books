
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCostTypeGroupHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCostTypeGroupHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CostTypeGroupHandle" type="{http://e-conomic.com}CostTypeGroupHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCostTypeGroupHandle", propOrder = {
    "costTypeGroupHandle"
})
public class ArrayOfCostTypeGroupHandle {

    @XmlElement(name = "CostTypeGroupHandle", nillable = true)
    protected List<CostTypeGroupHandle> costTypeGroupHandle;

    /**
     * Gets the value of the costTypeGroupHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costTypeGroupHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostTypeGroupHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostTypeGroupHandle }
     * 
     * 
     */
    public List<CostTypeGroupHandle> getCostTypeGroupHandle() {
        if (costTypeGroupHandle == null) {
            costTypeGroupHandle = new ArrayList<CostTypeGroupHandle>();
        }
        return this.costTypeGroupHandle;
    }

}
