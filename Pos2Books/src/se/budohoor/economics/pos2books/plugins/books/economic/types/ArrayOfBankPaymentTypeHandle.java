
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBankPaymentTypeHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBankPaymentTypeHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankPaymentTypeHandle" type="{http://e-conomic.com}BankPaymentTypeHandle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBankPaymentTypeHandle", propOrder = {
    "bankPaymentTypeHandle"
})
public class ArrayOfBankPaymentTypeHandle {

    @XmlElement(name = "BankPaymentTypeHandle", nillable = true)
    protected List<BankPaymentTypeHandle> bankPaymentTypeHandle;

    /**
     * Gets the value of the bankPaymentTypeHandle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankPaymentTypeHandle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankPaymentTypeHandle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankPaymentTypeHandle }
     * 
     * 
     */
    public List<BankPaymentTypeHandle> getBankPaymentTypeHandle() {
        if (bankPaymentTypeHandle == null) {
            bankPaymentTypeHandle = new ArrayList<BankPaymentTypeHandle>();
        }
        return this.bankPaymentTypeHandle;
    }

}
