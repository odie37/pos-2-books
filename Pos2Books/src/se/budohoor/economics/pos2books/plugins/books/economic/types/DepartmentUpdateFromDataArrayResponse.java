
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
 *         &lt;element name="Department_UpdateFromDataArrayResult" type="{http://e-conomic.com}ArrayOfDepartmentHandle" minOccurs="0"/>
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
    "departmentUpdateFromDataArrayResult"
})
@XmlRootElement(name = "Department_UpdateFromDataArrayResponse")
public class DepartmentUpdateFromDataArrayResponse {

    @XmlElement(name = "Department_UpdateFromDataArrayResult")
    protected ArrayOfDepartmentHandle departmentUpdateFromDataArrayResult;

    /**
     * Gets the value of the departmentUpdateFromDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public ArrayOfDepartmentHandle getDepartmentUpdateFromDataArrayResult() {
        return departmentUpdateFromDataArrayResult;
    }

    /**
     * Sets the value of the departmentUpdateFromDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartmentHandle }
     *     
     */
    public void setDepartmentUpdateFromDataArrayResult(ArrayOfDepartmentHandle value) {
        this.departmentUpdateFromDataArrayResult = value;
    }

}
