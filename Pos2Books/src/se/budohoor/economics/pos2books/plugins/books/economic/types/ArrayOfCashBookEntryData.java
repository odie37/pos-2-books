
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCashBookEntryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCashBookEntryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CashBookEntryData" type="{http://e-conomic.com}CashBookEntryData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCashBookEntryData", propOrder = {
    "cashBookEntryData"
})
public class ArrayOfCashBookEntryData {

    @XmlElement(name = "CashBookEntryData", nillable = true)
    protected List<CashBookEntryData> cashBookEntryData;

    /**
     * Gets the value of the cashBookEntryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashBookEntryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashBookEntryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBookEntryData }
     * 
     * 
     */
    public List<CashBookEntryData> getCashBookEntryData() {
        if (cashBookEntryData == null) {
            cashBookEntryData = new ArrayList<CashBookEntryData>();
        }
        return this.cashBookEntryData;
    }

}
