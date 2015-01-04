
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
 *         &lt;element name="EmployeeGroup_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfEmployeeGroupData" minOccurs="0"/>
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
    "employeeGroupGetDataArrayResult"
})
@XmlRootElement(name = "EmployeeGroup_GetDataArrayResponse")
public class EmployeeGroupGetDataArrayResponse {

    @XmlElement(name = "EmployeeGroup_GetDataArrayResult")
    protected ArrayOfEmployeeGroupData employeeGroupGetDataArrayResult;

    /**
     * Gets the value of the employeeGroupGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeGroupData }
     *     
     */
    public ArrayOfEmployeeGroupData getEmployeeGroupGetDataArrayResult() {
        return employeeGroupGetDataArrayResult;
    }

    /**
     * Sets the value of the employeeGroupGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeGroupData }
     *     
     */
    public void setEmployeeGroupGetDataArrayResult(ArrayOfEmployeeGroupData value) {
        this.employeeGroupGetDataArrayResult = value;
    }

}
