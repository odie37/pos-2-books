
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
 *         &lt;element name="Department_GetDataArrayResult" type="{http://e-conomic.com}ArrayOfDepartmentData" minOccurs="0"/>
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
    "departmentGetDataArrayResult"
})
@XmlRootElement(name = "Department_GetDataArrayResponse")
public class DepartmentGetDataArrayResponse {

    @XmlElement(name = "Department_GetDataArrayResult")
    protected ArrayOfDepartmentData departmentGetDataArrayResult;

    /**
     * Gets the value of the departmentGetDataArrayResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartmentData }
     *     
     */
    public ArrayOfDepartmentData getDepartmentGetDataArrayResult() {
        return departmentGetDataArrayResult;
    }

    /**
     * Sets the value of the departmentGetDataArrayResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartmentData }
     *     
     */
    public void setDepartmentGetDataArrayResult(ArrayOfDepartmentData value) {
        this.departmentGetDataArrayResult = value;
    }

}
