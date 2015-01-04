
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
 *         &lt;element name="employeeGroupHandle" type="{http://e-conomic.com}EmployeeGroupHandle" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "employeeGroupHandle",
    "value"
})
@XmlRootElement(name = "EmployeeGroup_SetName")
public class EmployeeGroupSetName {

    protected EmployeeGroupHandle employeeGroupHandle;
    protected String value;

    /**
     * Gets the value of the employeeGroupHandle property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public EmployeeGroupHandle getEmployeeGroupHandle() {
        return employeeGroupHandle;
    }

    /**
     * Sets the value of the employeeGroupHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupHandle(EmployeeGroupHandle value) {
        this.employeeGroupHandle = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
