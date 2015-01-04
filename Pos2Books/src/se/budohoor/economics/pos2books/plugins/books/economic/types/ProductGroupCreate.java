
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountForVatLiableDebtorInvoicesCurrentHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
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
    "number",
    "name",
    "accountForVatLiableDebtorInvoicesCurrentHandle"
})
@XmlRootElement(name = "ProductGroup_Create")
public class ProductGroupCreate {

    protected int number;
    protected String name;
    protected AccountHandle accountForVatLiableDebtorInvoicesCurrentHandle;

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the accountForVatLiableDebtorInvoicesCurrentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAccountForVatLiableDebtorInvoicesCurrentHandle() {
        return accountForVatLiableDebtorInvoicesCurrentHandle;
    }

    /**
     * Sets the value of the accountForVatLiableDebtorInvoicesCurrentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAccountForVatLiableDebtorInvoicesCurrentHandle(AccountHandle value) {
        this.accountForVatLiableDebtorInvoicesCurrentHandle = value;
    }

}
