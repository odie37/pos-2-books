
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
 *         &lt;element name="adminAgreementNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="adminUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adminUserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "adminAgreementNo",
    "adminUserId",
    "adminUserPassword",
    "customerNumber"
})
@XmlRootElement(name = "ConnectAsAdministratorWithCustomerNumber")
public class ConnectAsAdministratorWithCustomerNumber {

    protected int adminAgreementNo;
    protected String adminUserId;
    protected String adminUserPassword;
    protected String customerNumber;

    /**
     * Gets the value of the adminAgreementNo property.
     * 
     */
    public int getAdminAgreementNo() {
        return adminAgreementNo;
    }

    /**
     * Sets the value of the adminAgreementNo property.
     * 
     */
    public void setAdminAgreementNo(int value) {
        this.adminAgreementNo = value;
    }

    /**
     * Gets the value of the adminUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUserId() {
        return adminUserId;
    }

    /**
     * Sets the value of the adminUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUserId(String value) {
        this.adminUserId = value;
    }

    /**
     * Gets the value of the adminUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminUserPassword() {
        return adminUserPassword;
    }

    /**
     * Sets the value of the adminUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminUserPassword(String value) {
        this.adminUserPassword = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

}
