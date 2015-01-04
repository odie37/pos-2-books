
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
 *         &lt;element name="EmployeeGroup_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfEmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGroupUpdateFromDataArrayResult"
})
@XmlRootElement(name = "EmployeeGroup_UpdateFromDataArrayResponse")
public class EmployeeGroupUpdateFromDataArrayResponse {

    @XmlElement(name = "EmployeeGroup_UpdateFromDataArrayResult")
    protected ArrayOfEmployeeGroupHandle employeeGroupUpdateFromDataArrayResult;

    /**
     * Gets the value of the employeeGroupUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeGroupHandle }
     *     
     */
    public ArrayOfEmployeeGroupHandle getEmployeeGroupUpdateFromDataArrayResult() {
        return employeeGroupUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the employeeGroupUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupUpdateFromDataArrayResult(ArrayOfEmployeeGroupHandle value) {
        this.employeeGroupUpdateFromDataArrayResult = value;
    }

}
