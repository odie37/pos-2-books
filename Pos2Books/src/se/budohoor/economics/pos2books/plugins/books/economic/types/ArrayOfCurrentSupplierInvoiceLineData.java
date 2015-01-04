
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCurrentSupplierInvoiceLineData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCurrentSupplierInvoiceLineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentSupplierInvoiceLineData" type="{http://e-conomic.com}CurrentSupplierInvoiceLineData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCurrentSupplierInvoiceLineData", propOrder = {
    "currentSupplierInvoiceLineData"
})
public class ArrayOfCurrentSupplierInvoiceLineData {

    @XmlElement(name = "CurrentSupplierInvoiceLineData", nillable = true)
    protected List<CurrentSupplierInvoiceLineData> currentSupplierInvoiceLineData;

    /**
     * Gets the value of the currentSupplierInvoiceLineData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentSupplierInvoiceLineData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentSupplierInvoiceLineData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentSupplierInvoiceLineData }
     * 
     * 
     */
    public List<CurrentSupplierInvoiceLineData> getCurrentSupplierInvoiceLineData() {
        if (currentSupplierInvoiceLineData == null) {
            currentSupplierInvoiceLineData = new ArrayList<CurrentSupplierInvoiceLineData>();
        }
        return this.currentSupplierInvoiceLineData;
    }

}
