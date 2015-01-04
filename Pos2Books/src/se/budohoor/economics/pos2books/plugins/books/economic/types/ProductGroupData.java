
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductGroupData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductGroupData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://e-conomic.com}ProductGroupHandle" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountForVatLiableDebtorInvoicesCurrentHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="AccountForVatExemptDebtorInvoicesCurrentHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *         &lt;element name="AccrualHandle" type="{http://e-conomic.com}AccountHandle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductGroupData", propOrder = {
    "handle",
    "number",
    "name",
    "accountForVatLiableDebtorInvoicesCurrentHandle",
    "accountForVatExemptDebtorInvoicesCurrentHandle",
    "accrualHandle"
})
public class ProductGroupData {

    @XmlElement(name = "Handle")
    protected ProductGroupHandle handle;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AccountForVatLiableDebtorInvoicesCurrentHandle")
    protected AccountHandle accountForVatLiableDebtorInvoicesCurrentHandle;
    @XmlElement(name = "AccountForVatExemptDebtorInvoicesCurrentHandle")
    protected AccountHandle accountForVatExemptDebtorInvoicesCurrentHandle;
    @XmlElement(name = "AccrualHandle")
    protected AccountHandle accrualHandle;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductGroupHandle }
     *     
     */
    public ProductGroupHandle getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductGroupHandle }
     *     
     */
    public void setHandle(ProductGroupHandle value) {
        this.handle = value;
    }

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

    /**
     * Gets the value of the accountForVatExemptDebtorInvoicesCurrentHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAccountForVatExemptDebtorInvoicesCurrentHandle() {
        return accountForVatExemptDebtorInvoicesCurrentHandle;
    }

    /**
     * Sets the value of the accountForVatExemptDebtorInvoicesCurrentHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAccountForVatExemptDebtorInvoicesCurrentHandle(AccountHandle value) {
        this.accountForVatExemptDebtorInvoicesCurrentHandle = value;
    }

    /**
     * Gets the value of the accrualHandle property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHandle }
     *     
     */
    public AccountHandle getAccrualHandle() {
        return accrualHandle;
    }

    /**
     * Sets the value of the accrualHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHandle }
     *     
     */
    public void setAccrualHandle(AccountHandle value) {
        this.accrualHandle = value;
    }

}
