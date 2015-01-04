
package se.budohoor.economics.pos2books.plugins.books.economic.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="EmployeeGroup_FindByNumberResult" type="{http://e-conomic.com}EmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGroupFindByNumberResult"
})
@XmlRootElement(name = "EmployeeGroup_FindByNumberResponse")
public class EmployeeGroupFindByNumberResponse {

    @XmlElement(name = "EmployeeGroup_FindByNumberResult")
    protected EmployeeGroupHandle employeeGroupFindByNumberResult;

    /**
     * Gets the value of the employeeGroupFindByNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public EmployeeGroupHandle getEmployeeGroupFindByNumberResult() {
        return employeeGroupFindByNumberResult;
    }

    /**
     * Sets the value of the employeeGroupFindByNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupFindByNumberResult(EmployeeGroupHandle value) {
        this.employeeGroupFindByNumberResult = value;
    }

}
