
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
 *         &lt;element name="EmployeeGroup_CreateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfEmployeeGroupHandle" minOccurs="0"/>
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
    "employeeGroupCreateFromDataArrayResult"
})
@XmlRootElement(name = "EmployeeGroup_CreateFromDataArrayResponse")
public class EmployeeGroupCreateFromDataArrayResponse {

    @XmlElement(name = "EmployeeGroup_CreateFromDataArrayResult")
    protected ArrayOfEmployeeGroupHandle employeeGroupCreateFromDataArrayResult;

    /**
     * Gets the value of the employeeGroupCreateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeGroupHandle }
     *     
     */
    public ArrayOfEmployeeGroupHandle getEmployeeGroupCreateFromDataArrayResult() {
        return employeeGroupCreateFromDataArrayResult;
    }

    /**
     * Sets the value of the employeeGroupCreateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeGroupHandle }
     *     
     */
    public void setEmployeeGroupCreateFromDataArrayResult(ArrayOfEmployeeGroupHandle value) {
        this.employeeGroupCreateFromDataArrayResult = value;
    }

}
